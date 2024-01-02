package com.leal.cipm_testing;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Objects;

public class VideoPlayer extends Fragment {

    public ExoPlayer player;

    StyledPlayerView playerView;
     String selection,video,video1,video2;
    boolean explanation,videoShow;
    Cultura2023 cultura;
    View view;
    MediaItem mediaItem;
    String test = "this is a string to see if i have acces to it";
    private MediaSource mediaSource;
    FirebaseUser user;
    FirebaseAuth mAuth;
    public VideoPlayer() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if (args != null) {
            selection = args.getString("tema");
            video = args.getString("video");
            video1 = args.getString("videouno");
            video2 = args.getString("videodos");
            videoShow = args.getBoolean("videoShow");
            explanation = args.getBoolean("explicacion");
        }

    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_video_player, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        mAuth= FirebaseAuth.getInstance();

        user= mAuth.getCurrentUser();
        playerView = view.findViewById(R.id.video_player);
        player = new ExoPlayer.Builder(requireContext()).build();
        playerView.setPlayer(player);


    }




    public void SelectUrl() {
        String currenttxt = SaberDondeEstoy();
       // Toast.makeText(getContext(), selection, Toast.LENGTH_SHORT).show();
        if (currenttxt.contains("Cultura2023")) {
            // Cambiar el video
            switch (selection){
                case "Tutorial":
                    ShowVideo("https://adrianlealcaldera.com/culttut.mp4");
                    break;
                case "Moonlight":
                    if(explanation){
                        ShowVideo(video);
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/moonlightclip.mp4");
                    }
                    break;

                case "Rick and Morty":
                    if(explanation){
                        ShowVideo(video);
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/riackandmortyclip.mp4");
                    }
                    break;

                case "Do You Want Pepsi":
                    if(explanation){
                        ShowVideo(video);
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/doyouwantpepsiClip.mp4");
                    }
                    break;
                case "Sangre Por Sangre Foodline":
                    if(explanation){
                        ShowVideo(video);
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/sangrexsangrefoodlineClip.mp4");
                    }

                    break;
                case "Sangre Por Sangre Watch El Paisaje":
                    if(explanation){
                        ShowVideo(video);
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/sangrexsangrewatchaelpaisajeClip.mp4");
                    }
                    break;
                case "Training Day Rabbit Has The Gun":
                    if(explanation){
                        ShowVideo(video);
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/trainingdayrabbithasthegunClip.mp4");
                    }
                    break;

                case "Hancock Train":
                    if(explanation){
                        ShowVideo(video);
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/hancocktrainClip.mp4");
                    }
                    break;

                case "Malcom in the Middle Teacher":
                    if(explanation){
                        ShowVideo(video);
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/malconinthemiddleteacherClip.mp4");
                    }
                    break;

                case "Sangre Por Sangre Comedor":
                    if(explanation){
                        ShowVideo(video);
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/sangrexsangre(comedor)Clip.mp4");
                    }
                    break;

                case "Dave Chapelle Man Rape":
                    if(explanation){
                        ShowVideo(video);
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/davechapelle(man%20rape)Clip.mp4");
                    }
                    break;

                //luis R
                case "Análisis de cultura Gringa y Frases Coloquiales 2":
                    if(explanation){
                        ShowVideo(video);
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/analisisdeculturagringayfrasescoloquiales2Clip.mp4");
                    }
                    break;

                case "Boys in the Hood":
                    if(explanation){
                        ShowVideo(video);
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/BoyzntheHoodClip.mp4");
                    }
                    break;

                case "Cultura y Fonética":
                    if(explanation){
                        ShowVideo(video);
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/CulturayFone%CC%81ticaClip.mp4");
                    }
                    break;

                case "Kings of the Hills Drugs":
                    if(explanation){
                        ShowVideo(video);
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/kingofthehilldrugseditedClip.mp4");
                    }
                    break;
            }
        }

        if(currenttxt.contains("Estructura2023")){
            switch (selection) {
                case "Tutorial":
                    ShowVideo("https://adrianlealcaldera.com/structurastut.mp4");
                    break;

                    //PRESENT
                case "Present Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F4.%20Presente%20simple.mp4?alt=media&token=0e482b5a-9c5b-42bc-928f-0ace6cf5fb16");
                    break;
                case "Present Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F5.%20Presente%20continuo.mp4?alt=media&token=833c19a7-b7a6-490a-878b-3268c35bfaa1");
                    break;
                case "Present Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F6.%20Presente%20Perfecto.mp4?alt=media&token=b4165290-0432-4c5f-88ec-d67010502d0b");
                    break;
                case "Present Perfect Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F7.%20Presente%20Perfecto%20Continuo.mp4?alt=media&token=2c3142b8-4446-40b4-82c7-1e9a3cea7ad9");
                    break;

                //PAST
                case "Past Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F9.%20Pasado%20simple.mp4?alt=media&token=a1f5c158-5c9e-4733-9d72-08903454c41c");
                    break;
                case "Past Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F10.%20Pasado%20continuo.mp4?alt=media&token=7eb20736-5434-4184-bc4f-e94ac0427570");
                    break;
                case "Past Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F11.%20Pasado%20perfecto.mp4?alt=media&token=370783d1-b71b-40a2-91e4-e83b244cb358");
                    break;
                case "Past Perfect Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F12.%20Pasado%20perfecto%20continuo.mp4?alt=media&token=7be7b5b3-6c07-4631-9d05-fb678fa3e8f3");
                    break;

                //FUTURE
                case "Future Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F13.%20Modal%20simple.mp4?alt=media&token=a18ea82e-7f10-45a2-abdf-e97f98a07181");
                    break;
                case "Future Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F14.%20Modal%20continuo.mp4?alt=media&token=9a111eac-b885-4e11-8b93-32e6ead8d78b");
                    break;
                case "Future Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F15.%20Modal%20perfecto.mp4?alt=media&token=5d6c8a67-afe1-421b-8658-7b21ca8b7bce");
                    break;
                case "Future Perfect Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F16.%20Modal%20perfecto%20continuo.mp4?alt=media&token=131d9da0-14c4-419c-a21a-772022cc82e6");
                    break;

                //MODAL WOILD
                case "Would Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F13.%20Modal%20simple.mp4?alt=media&token=a18ea82e-7f10-45a2-abdf-e97f98a07181");
                    break;
                case "Would Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F14.%20Modal%20continuo.mp4?alt=media&token=9a111eac-b885-4e11-8b93-32e6ead8d78b");
                    break;
                case "Would Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F15.%20Modal%20perfecto.mp4?alt=media&token=5d6c8a67-afe1-421b-8658-7b21ca8b7bce");
                    break;
                case "Would Perfect Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F16.%20Modal%20perfecto%20continuo.mp4?alt=media&token=131d9da0-14c4-419c-a21a-772022cc82e6");
                    break;

                //MODAL COULD
                case "Could Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F13.%20Modal%20simple.mp4?alt=media&token=a18ea82e-7f10-45a2-abdf-e97f98a07181");
                    break;
                case "Could Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F14.%20Modal%20continuo.mp4?alt=media&token=9a111eac-b885-4e11-8b93-32e6ead8d78b");
                    break;
                case "Could Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F15.%20Modal%20perfecto.mp4?alt=media&token=5d6c8a67-afe1-421b-8658-7b21ca8b7bce");
                    break;
                case "Could Perfect Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F16.%20Modal%20perfecto%20continuo.mp4?alt=media&token=131d9da0-14c4-419c-a21a-772022cc82e6");
                    break;

                //MODAL MIGHT
                case "Might Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F13.%20Modal%20simple.mp4?alt=media&token=a18ea82e-7f10-45a2-abdf-e97f98a07181");
                    break;
                case "Might Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F14.%20Modal%20continuo.mp4?alt=media&token=9a111eac-b885-4e11-8b93-32e6ead8d78b");
                    break;
                case "Might Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F15.%20Modal%20perfecto.mp4?alt=media&token=5d6c8a67-afe1-421b-8658-7b21ca8b7bce");
                    break;
                case "Might Perfect Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F16.%20Modal%20perfecto%20continuo.mp4?alt=media&token=131d9da0-14c4-419c-a21a-772022cc82e6");
                    break;

                //MODAL SHOULD
                case "Should Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F13.%20Modal%20simple.mp4?alt=media&token=a18ea82e-7f10-45a2-abdf-e97f98a07181");
                    break;
                case "Should Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F14.%20Modal%20continuo.mp4?alt=media&token=9a111eac-b885-4e11-8b93-32e6ead8d78b");
                    break;
                case "Should Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F15.%20Modal%20perfecto.mp4?alt=media&token=5d6c8a67-afe1-421b-8658-7b21ca8b7bce");
                    break;
                case "Should Perfect Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F16.%20Modal%20perfecto%20continuo.mp4?alt=media&token=131d9da0-14c4-419c-a21a-772022cc82e6");
                    break;

                //MODAL CAN
                case "Can Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F13.%20Modal%20simple.mp4?alt=media&token=a18ea82e-7f10-45a2-abdf-e97f98a07181");
                    break;
                case "Can Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F14.%20Modal%20continuo.mp4?alt=media&token=9a111eac-b885-4e11-8b93-32e6ead8d78b");
                    break;

                //MODAL MUST
                case "Must Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F13.%20Modal%20simple.mp4?alt=media&token=a18ea82e-7f10-45a2-abdf-e97f98a07181");
                    break;
                case "Must Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F14.%20Modal%20continuo.mp4?alt=media&token=9a111eac-b885-4e11-8b93-32e6ead8d78b");
                    break;
                case "Must Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F15.%20Modal%20perfecto.mp4?alt=media&token=5d6c8a67-afe1-421b-8658-7b21ca8b7bce");
                    break;
                case "Must Perfect Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F16.%20Modal%20perfecto%20continuo.mp4?alt=media&token=131d9da0-14c4-419c-a21a-772022cc82e6");
                    break;

                //WANT TO
                case "Want To":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F29.%20Want%20you%20to.mp4?alt=media&token=2e655d45-22ac-4074-b4f2-9a9c26922f0d");
                    break;

                //FOR TO
                case "For To":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F31.%20For%20me%20to.mp4?alt=media&token=cac7511a-b8be-4f20-aad3-2d6fb16a57d9");
                    break;

                //WISH
                case "Wish Past Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F30.%20Wish.mp4?alt=media&token=6ad3331d-505f-424a-ad0c-bb6025f5b780");
                    break;
                case "Wish Past Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F30.%20Wish.mp4?alt=media&token=6ad3331d-505f-424a-ad0c-bb6025f5b780");
                    break;
                case "Wish Would":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F30.%20Wish.mp4?alt=media&token=6ad3331d-505f-424a-ad0c-bb6025f5b780");
                    break;

                //USED TO
                case "Used To":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F26.%20Used%20to.mp4?alt=media&token=a07713a0-1ed4-4904-bf85-9b48eb830b37");
                    break;
                case "Be Used To":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F26.%20Used%20to.mp4?alt=media&token=a07713a0-1ed4-4904-bf85-9b48eb830b37");
                    break;

                case "Incremento Paralelo":
                    ShowVideo("https://adrianlealcaldera.com/incrementoParalelo.mp4");
                    break;

                case "Verbal Adjectives":
                    ShowVideo("https://adrianlealcaldera.com/verlbaladjectives.mp4");
                    break;

                case "Reported Speech":
                    ShowVideo("https://adrianlealcaldera.com/reportedspeech.mp4");
                    break;

                //QUESTIONS WITH WHAT
                case "What Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "What Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "What Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "What Modals Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "What Modals Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "What Modals Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;

                //QUESTIONS WITH WHEN
                case "When Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "When Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "When Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "When Modals Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "When Modals Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "When Modals Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;

                //QUESTIONS WITH WHERE
                case "Where Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "Where Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "Where Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "Where Modals Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "Where Modals Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "Where Modals Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;

                //QUESTIONS WITH WHY
                case "Why Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "Why Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "Why Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "Why Modals Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "Why Modals Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "Why Modals Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;

                //QUESTIONS WITH WHO
                case "Who Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "Who Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "Who Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "Who Modals Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "Who Modals Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "Who Modals Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;

                //QUESTIONS WITH HOW
                case "How Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "How Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "How Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "How Modals Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "How Modals Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "How Modals Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;

                //QUESTIONS WITH HOW MUCH
                case "How Much Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "How Much Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "How Much Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "How Much Modals Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "How Much Modals Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "How Much Modals Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;

                //QUESTIONS WITH HOW MANY
                case "How Many Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "How Many Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "How Many Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "How Many Modals Simple":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "How Many Modals Continuous":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "How Many Modals Perfect":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;

                //QUESTIONS STRUCTURE RANDOM
                case "Question Structure":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;
                case "Question Structure Modals":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F34.%20Estructura%20de%20preguntas.mp4?alt=media&token=4fe8ca31-280c-4e69-bb47-901b7c54996d");
                    break;

                case "Feel Like Simple":
                    ShowVideo("https://adrianlealcaldera.com/Feel%20Like.mp4");
                    break;
                case "Phrasal Verbs":
                    ShowVideo("https://adrianlealcaldera.com/phrasalverbs.mp4");
                    break;
                case "Supposed To Present":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F28.%20Supposed%20to.mp4?alt=media&token=ad82d175-3583-4efa-9a09-316f40b56208");
                    break;
                case "Able To":
                    ShowVideo("https://adrianlealcaldera.com/ableto.mp4");
                    break;
            }
        }

        if(currenttxt.contains("SpaInt2023")){
            switch (selection) {
                case "Tutorial":
                    ShowVideo("https://adrianlealcaldera.com/intdeesptut.mp4");
                    break;

                case "Por Preposición":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F36.%20Interferencia%20por%20preposici%C3%B3n.mp4?alt=media&token=163ff6e6-b737-4fb8-8cde-c33e0bba07a8");
                    break;

                case "Por Sujeto":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F37.%20Interferencia%20por%20verbo.mp4?alt=media&token=372612cc-668c-410e-90e3-2ae06a44dd1f");
                    break;

                case "Por Objeto":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F38.%20Interferencia%20de%20objeto.mp4?alt=media&token=21bab41d-eb20-4c67-bffd-128484c4630c");
                    break;

                case "Interferencia Reflexiva":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F39.%20Interferencias%20reflexivas.mp4?alt=media&token=2d50912f-a232-4ca5-b89a-3aafc678e418");
                    break;

                case "Interferencia Pasiva":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F40.%20Interferencias%20pasivas.mp4?alt=media&token=890f35ff-c3e7-4a29-9d14-eedc500c999e");
                    break;

            }
        }

        if(currenttxt.contains("ConInt2023")){
            switch (selection) {

                case "Tutorial":
                    // video completo con los 5 diferentes temas
                    if(explanation){
                        ShowVideo("https://adrianlealcaldera.com/intconttut.mp4");
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/intconttut.mp4");
                    }
                    break;
                case "Steve Jobs 1":

                    // video completo con los 5 diferentes temas
                    if(explanation){
                        if(videoShow){
                            ShowVideo(video2);
                        }else{
                            ShowVideo(video1);
                        }
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/billburrstevejobsclip1.mp4");
                    }
                    break;

                //PD
                case "Kot Fishing 1":
                    // video completo con los 5 diferentes temas
                    if(explanation){
                        if(videoShow){
                            ShowVideo(video2);
                        }else{
                            ShowVideo(video1);
                        }
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/kotfishing1Clip.mp4");
                    }
                    break;

                case "Kot Fishing 2":
                    // video completo con los 5 diferentes temas
                    if(explanation){
                        if(videoShow){
                            ShowVideo(video2);
                        }else{
                            ShowVideo(video1);
                        }
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/kotfishing2Clip.mp4");
                    }
                    break;

                //LUIS
                case "Helicoptero 1":
                    // video completo con los 5 diferentes temas
                    if(explanation){
                        if(videoShow){
                            ShowVideo(video2);
                        }else{
                            ShowVideo(video1);
                        }
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/Helicoptero1Clip.mp4");
                    }
                    break;

                case "Helicoptero 2":
                    // video completo con los 5 diferentes temas
                    if(explanation){
                        if(videoShow){
                            ShowVideo(video2);
                        }else{
                            ShowVideo(video1);
                        }
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/Helicoptero2Clip.mp4");
                    }
                    break;

            }

        }

        if(currenttxt.contains("Vocabulary2023")){
            switch (selection) {
                case "Nivel Basico":
                    ShowVideo("https://adrianlealcaldera.com/basico.mp4");
                    break;

                case "Nivel No-Basicas":
                    ShowVideo("https://adrianlealcaldera.com/no-basico.mp4");
                    break;

                case "Nivel Interferencias":
                    ShowVideo("https://adrianlealcaldera.com/interferncia.mp4");
                    break;

                case "Test":
                    ShowVideo("https://adrianlealcaldera.com/examenexpl.mp4");
                    break;

                case "Tutorial":
                    ShowVideo("https://adrianlealcaldera.com/vocabtut.mp4");
                    break;

                case "0 to 50":
                    if(user.isAnonymous()){
                        ShowVideo("https://adrianlealcaldera.com/presentesimple.mp4");
                    }else {
                        ShowVideo("https://adrianlealcaldera.com/vocablowq.mp4");
                    }

                    break;
                case "50 to 100":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F42.%20Vocabulario%2051%20-%20100.mp4?alt=media&token=4ecf44db-09a1-4341-b3e6-7a26c4e3ff8c");
                    break;
                case "100 to 150":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F43.%20Vocabulario%20101%20-%20200.mp4?alt=media&token=532b6e14-6ef5-41d7-822f-d6765c9526f7");
                    break;
                case "150 to 200":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F43.%20Vocabulario%20101%20-%20200.mp4?alt=media&token=532b6e14-6ef5-41d7-822f-d6765c9526f7");
                    break;
                case "200 to 250":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F44.%20Vocabulario%20201%20-%20250.mp4?alt=media&token=1ffddef4-eb31-4b3b-8c99-68e72822e09b");
                    break;
                case "250 to 300":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F45.%20Vocabulario%20251%20-%20300.mp4?alt=media&token=a88a2564-86d7-4267-86dd-c53e3118ce48");
                    break;
                case "300 to 350":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F46.%20Vocabulario%20301%20-%20350.mp4?alt=media&token=6cc9bc56-9c83-4530-973d-cd5239012a05");
                    break;
                case "350 to 400":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F47.%20Vocabulario%20351%20-%20400.mp4?alt=media&token=e54e1d01-8b40-452a-bdef-2ea834430dd2");
                    break;
                case "400 to 500":
                    ShowVideo("https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F48.%20Vocabulario%20401%20-%20500.mp4?alt=media&token=94715e42-f0a4-411b-ab3e-b181dd0104f4");
                    break;


            }
        }

        if(currenttxt.contains("Availability2023")){
            switch (selection) {
                case "Tutorial":
                    ShowVideo("https://adrianlealcaldera.com/avtut.mp4");
                    break;


                case "Black Fathers":
                    ShowVideo("https://adrianlealcaldera.com/blackfathers.mp4");
                    break;

                case "Is America Racist?":
                    ShowVideo("https://adrianlealcaldera.com/isamericaracist.mp4");
                    break;

                case "Don't Compare Yourself to Others":
                    ShowVideo("https://adrianlealcaldera.com/DontCompareYourselftoOthersPrag.mp4");
                    break;

                case "Fix Yourself":
                    ShowVideo("https://adrianlealcaldera.com/FixYourself.mp4");
                    break;

                //Are Men and Women Different?
                case "Are Men and Women Different?":
                    ShowVideo("https://adrianlealcaldera.com/Are%20Men%20and%20Women%20Different.mp4");
                    break;

                case "Don't Waste Your Time":
                    ShowVideo("https://adrianlealcaldera.com/Dating%20Dont%20Waste%20Your%20Time.mp4");
                    break;

                case "How to Make Our Cities Safer":
                    ShowVideo("https://adrianlealcaldera.com/How%20to%20Make%20Our%20Cities%20Safer.mp4");
                    break;

                case "How to End Systemic Racism":
                    ShowVideo("https://adrianlealcaldera.com/How%20to%20End%20Systemic%20Racism.mp4");
                    break;

                case "Should Government Bail Out Big Banks?":
                    ShowVideo("https://adrianlealcaldera.com/Should%20Government%20Bail%20Out%20Big%20Banks.mp4");
                    break;
            }
        }

        if (currenttxt.contains("Transicion2023")) {
            switch (selection) {
                case "Tutorial":
                    ShowVideo("https://adrianlealcaldera.com/app%20transici%C3%B3n.mp4");
                    break;
                case "Transiciones":
                    ShowVideo("https://adrianlealcaldera.com/transiciones.mp4");
                    break;
                default:
                    ShowVideo("https://adrianlealcaldera.com/transiciones.mp4");
                    break;
            }
        }

        if (currenttxt.contains("Premium2023")) {

            switch (selection){
                case "Premium":
                    ShowVideo("https://adrianlealcaldera.com/premiumpromo.mp4");
                    break;
            }

        }

        if (currenttxt.contains("Prueba")) {
            switch (selection){
                case "Tutorial":
                    ShowVideo("https://adrianlealcaldera.com/premiumpromo.mp4");
                    break;
            }

        }

    }

    public void ShowVideo(String url){
        if (player != null) {
            mediaItem = MediaItem.fromUri(url);
            player.setMediaItem(mediaItem);
            player.prepare();
            player.setPlayWhenReady(true);
        } else {
            Toast.makeText(getContext(), "video error", Toast.LENGTH_SHORT).show();
        }
    }

    public String SaberDondeEstoy(){
        String txtActivity = "";
        String cadenaEliminar = "com.leal.cipm_testing.";
        String txtActivitySinEliminar = getContext().toString();
        txtActivity = txtActivitySinEliminar.replace(cadenaEliminar,"");

        return txtActivity;
    }
    @Override
    public void onStop() {

        super.onStop();
        if(player == null){
            return;
        }else {
            player.setPlayWhenReady(false);
            player.release();
            player = null;
        }

    }
    /*@Override
    public void onStart() {
        super.onStart();
        if (player == null) {
            player = new ExoPlayer.Builder(requireContext()).build();
            playerView.setPlayer(player);
            // If needed, reload the video or set the player to the previous state
        }
    }*/

    public void updateFragmentState(String newSelection, String newVideo, boolean newExplanation) {
        selection = newSelection;
        video = newVideo;
        explanation = newExplanation;
        SelectUrl();
        // You can also update any other UI elements or logic here if needed.
    }
    public void updateFragmentStateStructure(String newSelection){
        selection = newSelection;
        SelectUrl();
    }
    public void updateFramentConInt(String tema,boolean newexplicacion,String newvideo,String videouno,String videodos,boolean newvideoshow){
        selection = tema;
        explanation = newexplicacion;
        video = newvideo;
        video1=videouno;
        video2= videodos;
        videoShow = newvideoshow;
        SelectUrl();
    }

    public void goToPosition(int position){
        if (player != null && player.getPlaybackState() == ExoPlayer.STATE_READY) {
            // Seek to the desired position
            player.seekTo(position);
        }
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (player != null) {
            player.release();
        }
    }

    public void updateFragmentStateConint2(boolean newexplanation1) {
        explanation = newexplanation1;
    }


}





