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
                case "Present Simple":
                    ShowVideo("https://adrianlealcaldera.com/presentesimple.mp4");
                    break;

                case "Present Continuous":
                    ShowVideo("https://adrianlealcaldera.com/presentecontinuo.mp4");
                    break;

                case "Present Perfect":
                    ShowVideo("https://adrianlealcaldera.com/presenteperfecto.mp4");
                    break;

                case "Present Perfect Continuous":
                    ShowVideo("https://adrianlealcaldera.com/presenteperfectoconti.mp4");
                    break;

                case "Past Simple":
                    ShowVideo("https://adrianlealcaldera.com/pasadosimple.mp4");
                    break;

                case "Past Continuous":
                    ShowVideo("https://adrianlealcaldera.com/pasadocont.mp4");
                    break;

                case "Past Perfect":
                    ShowVideo("https://adrianlealcaldera.com/pasadoperf.mp4");
                    break;

                case "Past Perfect Continuous":
                    ShowVideo("https://adrianlealcaldera.com/pasadoperfcon.mp4");
                    break;

                case "Future Simple":
                    ShowVideo("https://adrianlealcaldera.com/futurosimp1.mp4");
                    break;

                case "Future Continuous":
                    ShowVideo("https://adrianlealcaldera.com/futuroconti.mp4");
                    break;

                case "Future Perfect":
                    ShowVideo("https://adrianlealcaldera.com/futuroperf.mp4");
                    break;

                case "Future Perfect Continuous":
                    ShowVideo("https://adrianlealcaldera.com/futuroperfcon.mp4");
                    break;

                case "Would Simple":
                    ShowVideo("https://adrianlealcaldera.com/wouldsimp.mp4");
                    break;

                case "Would Continuous":
                    ShowVideo("https://adrianlealcaldera.com/wouldconti.mp4");
                    break;

                case "Would Perfect":
                    ShowVideo("https://adrianlealcaldera.com/wouldperf.mp4");
                    break;

                case "Could Simple":
                    ShowVideo("https://adrianlealcaldera.com/couldsimp.mp4");
                    break;

                case "Could Continuous":
                    ShowVideo("https://adrianlealcaldera.com/couldconti.mp4");
                    Toast.makeText(getContext(), "El could continuous empieza en el minuto 5", Toast.LENGTH_SHORT).show();
                    break;

                case "Could Perfect":
                    ShowVideo("https://adrianlealcaldera.com/couldperf.mp4");
                    break;

                case "Could Perfect Continuous":
                    ShowVideo("https://adrianlealcaldera.com/couldperf.mp4");
                    Toast.makeText(getContext(), "El could perfect continuous empieza en el minuto 5:31", Toast.LENGTH_SHORT).show();
                    break;

                case "Might Simple":
                    ShowVideo("https://adrianlealcaldera.com/modalsimple.mp4");
                    break;

                case "Might Continuous":
                    ShowVideo("https://adrianlealcaldera.com/modalconti.mp4");
                    break;

                case "Might Perfect":
                    ShowVideo("https://adrianlealcaldera.com/modalperf.mp4");
                    break;

                case "Might Perfect Continuous":
                    ShowVideo("https://adrianlealcaldera.com/modalperfcont.mp4");
                    break;

                case "Should Simple":
                    ShowVideo("https://adrianlealcaldera.com/modalsimple.mp4");
                    break;

                case "Should Continuous":
                    ShowVideo("https://adrianlealcaldera.com/modalconti.mp4");
                    break;
                case "Should Perfect":
                    ShowVideo("https://adrianlealcaldera.com/modalperf.mp4");
                    break;

                case "Should Perfect Continuous":
                    ShowVideo("https://adrianlealcaldera.com/modalperfcont.mp4");
                    break;

                case "Can Simple":
                    ShowVideo("https://adrianlealcaldera.com/modalsimple.mp4");
                    break;

                case "Can Continuous":
                    ShowVideo("https://adrianlealcaldera.com/modalconti.mp4");
                    break;

                case "Must Simple":
                    ShowVideo("https://adrianlealcaldera.com/modalsimple.mp4");
                    break;

                case "Must Continuous":
                    ShowVideo("https://adrianlealcaldera.com/modalconti.mp4");
                    break;

                case "Must Perfect":
                    ShowVideo("https://adrianlealcaldera.com/modalperf.mp4");
                    break;

                case "Must Perfect Continuous":
                    ShowVideo("https://adrianlealcaldera.com/modalperfcont.mp4");
                    break;

                case "Want To":
                    ShowVideo("https://adrianlealcaldera.com/WantTo.mp4");
                    break;

                case "For To":
                    ShowVideo("https://adrianlealcaldera.com/ForTo.mp4");
                    break;

                case "Wish Past Simple":
                    ShowVideo("https://adrianlealcaldera.com/WishPast.mp4");
                    break;

                case "Wish Past Perfect":
                    ShowVideo("https://adrianlealcaldera.com/WishPast.mp4");
                    break;

                case "Wish Would":
                    ShowVideo("https://adrianlealcaldera.com/WishPast.mp4");
                    break;

                case "Used To":
                    ShowVideo("https://adrianlealcaldera.com/UsedTo.mp4");
                    break;

                case "Be Used To":
                    ShowVideo("https://adrianlealcaldera.com/UsedTo.mp4");
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

                case "What Simple":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "What Continuous":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "What Perfect":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "What Modals Simple":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "What Modals Continuous":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "What Modals Perfect":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "When Simple":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;
                case "When Continuous":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;
                case "When Perfect":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;
                case "When Modals Simple":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;
                case "When Modals Continuous":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;
                case "When Modals Perfect":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "Where Simple":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;
                case "Where Continuous":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;
                case "Where Perfect":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;
                case "Where Modals Simple":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;
                case "Where Modals Continuous":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;
                case "Where Modals Perfect":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "Why Simple":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "Why Continuous":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "Why Perfect":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "Why Modals Simple":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "Why Modals Continuous":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "Why Modals Perfect":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "Who Simple":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "Who Continuous":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "Who Perfect":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "Who Modals Simple":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "Who Modals Continuous":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "Who Modals Perfect":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "How Simple":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "How Continuous":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "How Perfect":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "How Modals Simple":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "How Modals Continuous":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "How Modals Perfect":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "How Much Simple":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "How Much Continuous":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "How Much Perfect":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "How Much Modals Simple":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "How Much Modals Continuous":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "How Much Modals Perfect":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "How Many Simple":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "How Many Continuous":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "How Many Perfect":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "How Many Modals Simple":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "How Many Modals Continuous":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "How Many Modals Perfect":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;
                case "Question Structure":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;
                case "Question Structure Modals":
                    ShowVideo("https://adrianlealcaldera.com/EstructuraPregunta.mp4");
                    break;

                case "Feel Like Simple":
                    ShowVideo("https://adrianlealcaldera.com/Feel%20Like.mp4");
                    break;
                case "Phrasal Verbs":
                    ShowVideo("https://adrianlealcaldera.com/phrasalverbs.mp4");
                    break;
                case "Supposed To Present":
                    ShowVideo("https://adrianlealcaldera.com/SupposedTo.mp4");
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
                    ShowVideo("https://adrianlealcaldera.com/intporprep.mp4");
                    break;

                case "Por Sujeto":
                    ShowVideo("https://adrianlealcaldera.com/porsujetoreducidotamano.mp4");
                    break;

                case "Por Objeto":
                    ShowVideo("https://adrianlealcaldera.com/porobjreducida.mp4");
                    break;

                case "Interferencia Reflexiva":
                    ShowVideo("https://adrianlealcaldera.com/reflx.mp4");
                    break;

                case "Interferencia Pasiva":
                    ShowVideo("https://adrianlealcaldera.com/pasiva.mp4");
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
                    ShowVideo("https://adrianlealcaldera.com/51a100.mp4");
                    break;

                case "100 to 150":
                    ShowVideo("https://adrianlealcaldera.com/100a150.mp4");
                    break;

                case "150 to 200":
                    ShowVideo("https://adrianlealcaldera.com/151-200.mp4");
                    break;

                case "200 to 250":
                    ShowVideo("https://adrianlealcaldera.com/200a250.mp4");
                    break;

                case "250 to 300":
                    ShowVideo("https://adrianlealcaldera.com/250a300.mp4");
                    break;

                case "300 to 350":
                    ShowVideo("https://adrianlealcaldera.com/300-350.mp4");
                    break;

                case "350 to 400":
                    ShowVideo("https://adrianlealcaldera.com/350a400bq.mp4");
                    break;

                case "400 to 500":
                    ShowVideo("https://adrianlealcaldera.com/400a500lq.mp4");
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

    }

    public void ShowVideo(String url){
        mediaItem = MediaItem.fromUri(url);
        player.setMediaItem(mediaItem);
        player.prepare();
        player.setPlayWhenReady(true);
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





