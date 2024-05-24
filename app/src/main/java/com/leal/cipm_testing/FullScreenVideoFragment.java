package com.leal.cipm_testing;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.StyledPlayerView;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

public class FullScreenVideoFragment extends Fragment {
    private SimpleExoPlayer player;
    private StyledPlayerView playerView;
    private LinearLayout btnExitFullScreen;

    String Url = "https://adrianlealcaldera.com/culttut.mp4";
    String selection, video, video1, video2;
    boolean explanation, videoShow;

    Prefs prefs;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefs = new Prefs(getContext());
        Bundle args = getArguments();
        if (args != null) {
            selection = prefs.getSelection();
            //selection = args.getString("tema");
            video = args.getString("video");
            video1 = args.getString("videouno");
            video2 = args.getString("videodos");
            videoShow = args.getBoolean("videoShow");
            explanation = args.getBoolean("explicacion");
        }


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_full_screen_video, container, false);
        playerView = view.findViewById(R.id.video_player_fullscreen);
        btnExitFullScreen = view.findViewById(R.id.btn_exit_full_screen);

        btnExitFullScreen.setOnClickListener(v -> exitFullScreen());
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Prefs prefs = new Prefs(getActivity());
        long playbackPosition = prefs.getLong("playbackPosition", 0);

        if (player == null) {
            initializePlayer();
            player.seekTo(playbackPosition);
            player.setPlayWhenReady(true);
        }

        SelectUrl();  // Primero selecciona la URL
        initializePlayer();  // Luego inicializa el player
    }


    private String SaberDondeEstoy() {
        if (getContext() == null) {
            Log.e("FullScreenVideoFragment", "Contexto no disponible en SaberDondeEstoy()");
            return "Contexto no disponible";
        }
        String txtActivitySinEliminar = getContext().toString();
        String cadenaEliminar = "com.leal.cipm_testing.";
        return txtActivitySinEliminar.replace(cadenaEliminar, "");
    }

    public void initializePlayer() {
        if (getContext() == null || playerView == null) {
            Log.e("FullScreenVideoFragment", "Contexto o playerView no disponible");
            return;
        }

        player = new SimpleExoPlayer.Builder(getContext()).build();
        playerView.setPlayer(player);
        MediaItem mediaItem = MediaItem.fromUri(Url);
        player.setMediaItem(mediaItem);
        player.prepare();

        // Inicia la reproducción a través del manager
        VideoPlayerManager.getInstance().playPlayer(player);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (player != null) {
            VideoPlayerManager.getInstance().releasePlayer(player);
        }
    }


    @Override
    public void onStart() {
        super.onStart();
        if (player != null) {
            VideoPlayerManager.getInstance().playPlayer(player);
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (player != null) {
            player.setPlayWhenReady(false);
        }
    }


    private void exitFullScreen() {
        if (getActivity() != null) {
            getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            getActivity().getSupportFragmentManager().popBackStack();
        }
    }

    public void SelectUrl() {
        String currenttxt = SaberDondeEstoy();

        if (selection == null) {
            Log.d("FullScreenVideoFragment", "La variable 'selection' es nula.");
            return; // Salir del método si 'selection' es nula
        }

        if (currenttxt.contains("Cultura2023")) {
            // Cambiar el video
            switch (selection){
                case "Tutorial":
                    Url = "https://adrianlealcaldera.com/culttut.mp4";
                    break;
                case "Moonlight":
                    if(explanation){
                        Url = video;
                    }else{
                        Url = "https://adrianlealcaldera.com/moonlightclip.mp4";
                    }
                    break;

                case "Rick and Morty":
                    if(explanation){
                        Url = video;
                    }else{
                        Url = "https://adrianlealcaldera.com/riackandmortyclip.mp4";
                    }
                    break;

                case "Do You Want Pepsi":
                    if(explanation){
                        Url = video;
                    }else{
                        Url = "https://adrianlealcaldera.com/doyouwantpepsiClip.mp4";
                    }
                    break;
                case "Sangre Por Sangre Foodline":
                    if(explanation){
                        Url = video;
                    }else{
                        Url = "https://adrianlealcaldera.com/sangrexsangrefoodlineClip.mp4";
                    }

                    break;
                case "Sangre Por Sangre Watch El Paisaje":
                    if(explanation){
                        Url = video;
                    }else{
                        Url = "https://adrianlealcaldera.com/sangrexsangrewatchaelpaisajeClip.mp4";
                    }
                    break;
                case "Training Day Rabbit Has The Gun":
                    if(explanation){
                        Url = video;
                    }else{
                        Url = "https://adrianlealcaldera.com/trainingdayrabbithasthegunClip.mp4";
                    }
                    break;

                case "Hancock Train":
                    if(explanation){
                        Url = video;
                    }else{
                        Url = "https://adrianlealcaldera.com/hancocktrainClip.mp4";
                    }
                    break;

                case "Malcom in the Middle Teacher":
                    if(explanation){
                        Url = video;
                    }else{
                        Url = "https://adrianlealcaldera.com/malconinthemiddleteacherClip.mp4";
                    }
                    break;

                case "Sangre Por Sangre Comedor":
                    if(explanation){
                        Url = video;
                    }else{
                        Url = "https://adrianlealcaldera.com/sangrexsangre(comedor)Clip.mp4";
                    }
                    break;

                case "Dave Chapelle Man Rape":
                    if(explanation){
                        Url = video;
                    }else{
                        Url = "https://adrianlealcaldera.com/davechapelle(man%20rape)Clip.mp4";
                    }
                    break;

                //luis R
                case "Análisis de cultura Gringa y Frases Coloquiales 2":
                    if(explanation){
                        Url = video;
                    }else{
                        Url = "https://adrianlealcaldera.com/analisisdeculturagringayfrasescoloquiales2Clip.mp4";
                    }
                    break;

                case "Boys in the Hood":
                    if(explanation){
                        Url = video;
                    }else{
                        Url = "https://adrianlealcaldera.com/BoyzntheHoodClip.mp4";
                    }
                    break;

                case "Cultura y Fonética":
                    if(explanation){
                        Url = video;
                    }else{
                        Url = "https://adrianlealcaldera.com/CulturayFone%CC%81ticaClip.mp4";
                    }
                    break;

                case "Kings of the Hills Drugs":
                    if(explanation){
                        Url = video;
                    }else{
                        Url = "https://adrianlealcaldera.com/kingofthehilldrugseditedClip.mp4";
                    }
                    break;
            }
        }

        if(currenttxt.contains("Estructura2023")){
            switch (selection) {
                case "Tutorial":
                    Url = "https://adrianlealcaldera.com/structurastut.mp4";
                    break;

                //PRESENT
                case "Present Simple":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F4.%20Presente%20simple.mp4?alt=media&token=0e482b5a-9c5b-42bc-928f-0ace6cf5fb16";
                    break;
                case "Present Continuous":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F5.%20Presente%20continuo.mp4?alt=media&token=833c19a7-b7a6-490a-878b-3268c35bfaa1";
                    break;
                case "Present Perfect":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F6.%20Presente%20Perfecto.mp4?alt=media&token=b4165290-0432-4c5f-88ec-d67010502d0b";
                    break;
                case "Present Perfect Continuous":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F7.%20Presente%20Perfecto%20Continuo.mp4?alt=media&token=2c3142b8-4446-40b4-82c7-1e9a3cea7ad9";
                    break;

                //PAST
                case "Past Simple":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F9.%20Pasado%20simple.mp4?alt=media&token=a1f5c158-5c9e-4733-9d72-08903454c41c";
                    break;
                case "Past Continuous":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F10.%20Pasado%20continuo.mp4?alt=media&token=7eb20736-5434-4184-bc4f-e94ac0427570";
                    break;
                case "Past Perfect":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F11.%20Pasado%20perfecto.mp4?alt=media&token=370783d1-b71b-40a2-91e4-e83b244cb358";
                    break;
                case "Past Perfect Continuous":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F12.%20Pasado%20perfecto%20continuo.mp4?alt=media&token=7be7b5b3-6c07-4631-9d05-fb678fa3e8f3";
                    break;

                //FUTURE
                case "Future Simple":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F13.%20Modal%20simple.mp4?alt=media&token=a18ea82e-7f10-45a2-abdf-e97f98a07181";
                    break;
                case "Future Continuous":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F14.%20Modal%20continuo.mp4?alt=media&token=9a111eac-b885-4e11-8b93-32e6ead8d78b";
                    break;
                case "Future Perfect":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F15.%20Modal%20perfecto.mp4?alt=media&token=5d6c8a67-afe1-421b-8658-7b21ca8b7bce";
                    break;
                case "Future Perfect Continuous":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F16.%20Modal%20perfecto%20continuo.mp4?alt=media&token=131d9da0-14c4-419c-a21a-772022cc82e6";
                    break;

                //MODAL WOILD
                case "Would Simple":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F13.%20Modal%20simple.mp4?alt=media&token=a18ea82e-7f10-45a2-abdf-e97f98a07181";
                    break;
                case "Would Continuous":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F14.%20Modal%20continuo.mp4?alt=media&token=9a111eac-b885-4e11-8b93-32e6ead8d78b";
                    break;
                case "Would Perfect":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F15.%20Modal%20perfecto.mp4?alt=media&token=5d6c8a67-afe1-421b-8658-7b21ca8b7bce";
                    break;
                case "Would Perfect Continuous":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F16.%20Modal%20perfecto%20continuo.mp4?alt=media&token=131d9da0-14c4-419c-a21a-772022cc82e6";
                    break;

                //MODAL COULD
                case "Could Simple":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F13.%20Modal%20simple.mp4?alt=media&token=a18ea82e-7f10-45a2-abdf-e97f98a07181";
                    break;
                case "Could Continuous":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F14.%20Modal%20continuo.mp4?alt=media&token=9a111eac-b885-4e11-8b93-32e6ead8d78b";
                    break;
                case "Could Perfect":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F15.%20Modal%20perfecto.mp4?alt=media&token=5d6c8a67-afe1-421b-8658-7b21ca8b7bce";
                    break;
                case "Could Perfect Continuous":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F16.%20Modal%20perfecto%20continuo.mp4?alt=media&token=131d9da0-14c4-419c-a21a-772022cc82e6";
                    break;

                //MODAL MIGHT
                case "Might Simple":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F13.%20Modal%20simple.mp4?alt=media&token=a18ea82e-7f10-45a2-abdf-e97f98a07181";
                    break;
                case "Might Continuous":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F14.%20Modal%20continuo.mp4?alt=media&token=9a111eac-b885-4e11-8b93-32e6ead8d78b";
                    break;
                case "Might Perfect":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F15.%20Modal%20perfecto.mp4?alt=media&token=5d6c8a67-afe1-421b-8658-7b21ca8b7bce";
                    break;
                case "Might Perfect Continuous":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F16.%20Modal%20perfecto%20continuo.mp4?alt=media&token=131d9da0-14c4-419c-a21a-772022cc82e6";
                    break;

                //MODAL SHOULD
                case "Should Simple":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F13.%20Modal%20simple.mp4?alt=media&token=a18ea82e-7f10-45a2-abdf-e97f98a07181";
                    break;
                case "Should Continuous":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F14.%20Modal%20continuo.mp4?alt=media&token=9a111eac-b885-4e11-8b93-32e6ead8d78b";
                    break;
                case "Should Perfect":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F15.%20Modal%20perfecto.mp4?alt=media&token=5d6c8a67-afe1-421b-8658-7b21ca8b7bce";
                    break;
                case "Should Perfect Continuous":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F16.%20Modal%20perfecto%20continuo.mp4?alt=media&token=131d9da0-14c4-419c-a21a-772022cc82e6";
                    break;

                //MODAL CAN
                case "Can Simple":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F13.%20Modal%20simple.mp4?alt=media&token=a18ea82e-7f10-45a2-abdf-e97f98a07181";
                    break;
                case "Can Continuous":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F14.%20Modal%20continuo.mp4?alt=media&token=9a111eac-b885-4e11-8b93-32e6ead8d78b";
                    break;

                //MODAL MUST
                case "Must Simple":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F13.%20Modal%20simple.mp4?alt=media&token=a18ea82e-7f10-45a2-abdf-e97f98a07181";
                    break;
                case "Must Continuous":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F14.%20Modal%20continuo.mp4?alt=media&token=9a111eac-b885-4e11-8b93-32e6ead8d78b";
                    break;

                //FOR TO
                case "For Object To":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F31.%20For%20me%20to.mp4?alt=media&token=cac7511a-b8be-4f20-aad3-2d6fb16a57d9";
                    break;

                case "Be Used To":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F26.%20Used%20to.mp4?alt=media&token=a07713a0-1ed4-4904-bf85-9b48eb830b37";
                    break;
                //USED TO
                case "Used To":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F26.%20Used%20to.mp4?alt=media&token=a07713a0-1ed4-4904-bf85-9b48eb830b37";
                    break;
                case "Feel like":
                    Url = "https://adrianlealcaldera.com/Feel%20Like.mp4";
                    break;
                //WANT TO
                case "Want To":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F29.%20Want%20you%20to.mp4?alt=media&token=2e655d45-22ac-4074-b4f2-9a9c26922f0d";
                    break;
                //WISH
                case "Wish Past":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F30.%20Wish.mp4?alt=media&token=6ad3331d-505f-424a-ad0c-bb6025f5b780";
                    break;
                case "Wish Past Perfect":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F30.%20Wish.mp4?alt=media&token=6ad3331d-505f-424a-ad0c-bb6025f5b780";
                    break;
                case "Wish Would":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F30.%20Wish.mp4?alt=media&token=6ad3331d-505f-424a-ad0c-bb6025f5b780";
                    break;
                case "Incremento Paralelo":
                    Url = "https://adrianlealcaldera.com/incrementoParalelo.mp4";
                    break;

                case "Verbal Adjectives":
                    Url = "https://adrianlealcaldera.com/verlbaladjectives.mp4";
                    break;

                case "Reported Speech":
                    Url = "https://adrianlealcaldera.com/reportedspeech.mp4";
                    break;

                //QUESTIONS STRUCTURE RANDOM
                case "Question Structures":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d";
                    break;


                case "Phrasal Verbs":
                    Url = "https://adrianlealcaldera.com/phrasalverbs.mp4";
                    break;
                case "Supposed To":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F28.%20Supposed%20to.mp4?alt=media&token=ad82d175-3583-4efa-9a09-316f40b56208";
                    break;
                case "Be Able To":
                    Url = "https://adrianlealcaldera.com/ableto.mp4";
                    break;

                case "There Be":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Ftherebehighdef.mp4?alt=media&token=05d3cc4f-b53b-4248-ab7e-5b5049ec56ef";
                    break;

                case "Verbos Juntos":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Fverbsjuntoshd.mp4?alt=media&token=81fb4d3b-cdb1-4cf6-b741-c36ebf61cbf3";
                    break;

                case "Present Simple Passive":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Fpasivahd.mp4?alt=media&token=2831d2a7-d259-44f3-be67-e66fc6df77b9";
                    break;

                case "Present Continuous Passive":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Fpasivahd.mp4?alt=media&token=2831d2a7-d259-44f3-be67-e66fc6df77b9";
                    break;

                case "Present Perfect Passive":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Fpasivahd.mp4?alt=media&token=2831d2a7-d259-44f3-be67-e66fc6df77b9";
                    break;

                case "Past Simple Passive":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Fpasivahd.mp4?alt=media&token=2831d2a7-d259-44f3-be67-e66fc6df77b9";
                    break;

                case "Past Continuous Passive":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Fpasivahd.mp4?alt=media&token=2831d2a7-d259-44f3-be67-e66fc6df77b9";
                    break;

                case "Past Perfect Passive":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Fpasivahd.mp4?alt=media&token=2831d2a7-d259-44f3-be67-e66fc6df77b9";
                    break;

                case "Future Simple Passive":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Fpasivahd.mp4?alt=media&token=2831d2a7-d259-44f3-be67-e66fc6df77b9";
                    break;

                case "Would Simple Passive":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Fpasivahd.mp4?alt=media&token=2831d2a7-d259-44f3-be67-e66fc6df77b9";
                    break;

                case "Going To":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Fgoingtohd.mp4?alt=media&token=9729df29-5204-4cec-b0ad-a6e6c3254445";
                    break;
                case "Going To Past":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Fwasgoingtosd.mp4?alt=media&token=7e704751-c63a-43fd-a029-5e5e50bbc152";
                    break;

                case "Reflexive Structure":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Freflexivehd.mp4?alt=media&token=265309fb-a467-4eb2-88b5-405678c4a714";
                    break;

                case "Have To":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Fhavetohd.mp4?alt=media&token=4e62f3b5-7ac4-4b98-82b7-ee259a7d7507";
                    break;

                case "Causative Have":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Fcausativashdd.mp4?alt=media&token=e407dc0d-06bb-485a-9a1b-f6470ff8db12";
                    break;

                case "Get Structures":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Fgetsd.mp4?alt=media&token=5044a231-23d2-4fff-b72c-85c66faf86ae";
                    break;

                case "Noun Adjectives":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Fnounsd.mp4?alt=media&token=13447d1d-4b36-4970-9cf1-c19870263e90";
                    break;

                case "P-V-PP":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Fpvppsd.mp4?alt=media&token=1282dd49-c8ea-4741-882d-f0e61bc8ff4e";
                    break;

                case "Comparativos":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Fcomphd.mp4?alt=media&token=9c23090f-fb0a-40ae-8271-072fbe750433";
                    break;

                case "Relative Clauses":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Fthathd.mp4?alt=media&token=6ecf06c6-af9d-4c6b-a98b-cdeadafa4f33";
                    break;

                case "Just Phrasal Verbs":
                    Url = "https://adrianlealcaldera.com/phrasalverbs.mp4";

                    break;

                case "Supposed To Past":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/reels%2Fwassupposedtohd.mp4?alt=media&token=01d31fa8-af5c-4559-930f-3385ccc98b2d";
                    break;


            }
        }

        if(currenttxt.contains("SpaInt2023")){
            switch (selection) {
                case "Tutorial":
                    Url = "https://adrianlealcaldera.com/intdeesptut.mp4";
                    break;

                case "Por Preposición":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F36.%20Interferencia%20por%20preposici%C3%B3n.mp4?alt=media&token=163ff6e6-b737-4fb8-8cde-c33e0bba07a8";
                    break;

                case "Por Sujeto":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F37.%20Interferencia%20por%20verbo.mp4?alt=media&token=372612cc-668c-410e-90e3-2ae06a44dd1f";
                    break;

                case "Por Objeto":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F38.%20Interferencia%20de%20objeto.mp4?alt=media&token=21bab41d-eb20-4c67-bffd-128484c4630c";
                    break;

                case "Interferencia Reflexiva":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F39.%20Interferencias%20reflexivas.mp4?alt=media&token=2d50912f-a232-4ca5-b89a-3aafc678e418";
                    break;

                case "Interferencia Pasiva":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F40.%20Interferencias%20pasivas.mp4?alt=media&token=890f35ff-c3e7-4a29-9d14-eedc500c999e";
                    break;

            }
        }

        if(currenttxt.contains("ConInt2023")){
            switch (selection) {

                case "Tutorial":
                    // video completo con los 5 diferentes temas
                    if(explanation){
                        Url = "https://adrianlealcaldera.com/intconttut.mp4";
                    }else{
                        Url = "https://adrianlealcaldera.com/intconttut.mp4";
                    }
                    break;
                case "Steve Jobs 1":

                    // video completo con los 5 diferentes temas
                    if(explanation){
                        if(videoShow){
                            Url = video2;
                        }else{
                            Url = video1;
                        }
                    }else{
                        Url = "https://adrianlealcaldera.com/billburrstevejobsclip1.mp4";
                    }
                    break;

                //PD
                case "Kot Fishing 1":
                    // video completo con los 5 diferentes temas
                    if(explanation){
                        if(videoShow){
                            Url = video2;
                        }else{
                            Url = video1;
                        }
                    }else{
                        Url = "https://adrianlealcaldera.com/kotfishing1Clip.mp4";
                    }
                    break;

                case "Kot Fishing 2":
                    // video completo con los 5 diferentes temas
                    if(explanation){
                        if(videoShow){
                            Url = video2;
                        }else{
                            Url = video1;
                        }
                    }else{
                        Url = "https://adrianlealcaldera.com/kotfishing2Clip.mp4";
                    }
                    break;

                //LUIS
                case "Helicoptero 1":
                    // video completo con los 5 diferentes temas
                    if(explanation){
                        if(videoShow){
                            Url = video2;
                        }else{
                            Url = video1;
                        }
                    }else{
                        Url = "https://adrianlealcaldera.com/Helicoptero1Clip.mp4";
                    }
                    break;

                case "Helicoptero 2":
                    // video completo con los 5 diferentes temas
                    if(explanation){
                        if(videoShow){
                            Url = video2;
                        }else{
                            Url = video1;
                        }
                    }else{
                        Url = "https://adrianlealcaldera.com/Helicoptero2Clip.mp4";
                    }
                    break;

            }

        }

        if(currenttxt.contains("Vocabulary2023")){
            switch (selection) {
                case "Function Words":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/clasebasica.mp4?alt=media&token=aa040ec8-7699-4d54-a614-0742ea8c4d32";
                    break;
                case "Present Simple":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F4.%20Presente%20simple.mp4?alt=media&token=0e482b5a-9c5b-42bc-928f-0ace6cf5fb16";
                    break;
                case "Nivel Basico":
                    Url = "https://adrianlealcaldera.com/basico.mp4";
                    break;

                case "Nivel No-Basicas":
                    Url = "https://adrianlealcaldera.com/no-basico.mp4";
                    break;

                case "Nivel Interferencias":
                    Url = "https://adrianlealcaldera.com/interferncia.mp4";
                    break;

                case "Test":
                    Url = "https://adrianlealcaldera.com/examenexpl.mp4";
                    break;

                case "Tutorial":
                    Url = "https://adrianlealcaldera.com/vocabtut.mp4";
                    break;

                case "0 to 50":
//                    if(user.isAnonymous()){
//                        Url = "https://adrianlealcaldera.com/presentesimple.mp4";
//                    }else {
//                        Url = "https://adrianlealcaldera.com/vocablowq.mp4";
//                    }

                    break;
                case "50 to 100":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F42.%20Vocabulario%2051%20-%20100.mp4?alt=media&token=4ecf44db-09a1-4341-b3e6-7a26c4e3ff8c";
                    break;
                case "100 to 150":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F43.%20Vocabulario%20101%20-%20200.mp4?alt=media&token=532b6e14-6ef5-41d7-822f-d6765c9526f7";
                    break;
                case "150 to 200":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F43.%20Vocabulario%20101%20-%20200.mp4?alt=media&token=532b6e14-6ef5-41d7-822f-d6765c9526f7";
                    break;
                case "200 to 250":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F44.%20Vocabulario%20201%20-%20250.mp4?alt=media&token=1ffddef4-eb31-4b3b-8c99-68e72822e09b";
                    break;
                case "250 to 300":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F45.%20Vocabulario%20251%20-%20300.mp4?alt=media&token=a88a2564-86d7-4267-86dd-c53e3118ce48";
                    break;
                case "300 to 350":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F46.%20Vocabulario%20301%20-%20350.mp4?alt=media&token=6cc9bc56-9c83-4530-973d-cd5239012a05";
                    break;
                case "350 to 400":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F47.%20Vocabulario%20351%20-%20400.mp4?alt=media&token=e54e1d01-8b40-452a-bdef-2ea834430dd2";
                    break;
                case "400 to 500":
                    Url = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F48.%20Vocabulario%20401%20-%20500.mp4?alt=media&token=94715e42-f0a4-411b-ab3e-b181dd0104f4";
                    break;


            }
        }

        if(currenttxt.contains("Availability2023")){
            switch (selection) {
                case "Tutorial":
                    Url = "https://adrianlealcaldera.com/avtut.mp4";
                    break;


                case "Black Fathers":
                    Url = "https://adrianlealcaldera.com/blackfathers.mp4";
                    break;

                case "Is America Racist?":
                    Url = "https://adrianlealcaldera.com/isamericaracist.mp4";
                    break;

                case "Don't Compare Yourself to Others":
                    Url = "https://adrianlealcaldera.com/DontCompareYourselftoOthersPrag.mp4";
                    break;

                case "Fix Yourself":
                    Url = "https://adrianlealcaldera.com/FixYourself.mp4";
                    break;

                //Are Men and Women Different?
                case "Are Men and Women Different?":
                    Url = "https://adrianlealcaldera.com/Are%20Men%20and%20Women%20Different.mp4";
                    break;

                case "Don't Waste Your Time":
                    Url = "https://adrianlealcaldera.com/Dating%20Dont%20Waste%20Your%20Time.mp4";
                    break;

                case "How to Make Our Cities Safer":
                    Url = "https://adrianlealcaldera.com/How%20to%20Make%20Our%20Cities%20Safer.mp4";
                    break;

                case "How to End Systemic Racism":
                    Url = "https://adrianlealcaldera.com/How%20to%20End%20Systemic%20Racism.mp4";
                    break;

                case "Should Government Bail Out Big Banks?":
                    Url = "https://adrianlealcaldera.com/Should%20Government%20Bail%20Out%20Big%20Banks.mp4";
                    break;
            }
        }

        if (currenttxt.contains("Transicion2023")) {
            switch (selection) {
                case "Tutorial":
                    Url = "https://adrianlealcaldera.com/app%20transici%C3%B3n.mp4";
                    break;
                case "Transiciones":
                    Url = "https://adrianlealcaldera.com/transiciones.mp4";
                    break;
                default:
                    Url = "https://adrianlealcaldera.com/transiciones.mp4";
                    break;
            }
        }

        if (currenttxt.contains("Premium2023")) {

            switch (selection){
                case "Premium":
                    Url = "https://adrianlealcaldera.com/premiumpromo.mp4";
                    break;
            }

        }

        if (currenttxt.contains("Prueba")) {
            switch (selection){
                case "Tutorial":
                    Url = "https://adrianlealcaldera.com/premiumpromo.mp4";
                    break;
            }

        }

    }
}

