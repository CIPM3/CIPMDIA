package com.leal.cipm_testing.components;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.leal.cipm_testing.R;

public class VideoPlayer extends Fragment {
    LinearLayout video_lay,loadingVideo;
    public VideoView video_player;

    //URL DE PRUEBA ESPERANDO QUE FUNCIONEN LOS VIDEOS DEL SERVIDOR
    String urlPrueba = "https://media.istockphoto.com/id/1350173565/es/v%C3%ADdeo/empresario-dando-un-paso-adelante.mp4?s=mp4-640x640-is&k=20&c=eIZb2xFLcb1k2yKzhOthbn3n09p70Faj_5UPkgKqdPA=";
    private String selection;
    boolean explanation;

    public VideoPlayer() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle args = getArguments();
        if (args != null) {
            selection = args.getString("tema");
            explanation = args.getBoolean("explicacion");
        }
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_video_player, container, false);

        video_lay = view.findViewById(R.id.video_lay);
        video_player = view.findViewById(R.id.video_player);
        loadingVideo = view.findViewById(R.id.loadingVideo);


        video_lay.setOnClickListener(v -> {
            SelectUrl();
                }
        );

        return view;
    }
    public void SelectUrl() {
        String currenttxt = SaberDondeEstoy();
        if (currenttxt.contains("Cultura")) {
            // Cambiar el video
            switch (selection){
                case "Tutorial":
                    ShowVideo("http://adrianlealcaldera.com/culttut.mp4");
                    break;
                case "Moonlight":
                    if(explanation){
                        ShowVideo("http://adrianlealcaldera.com/moonlightexp.mp4");
                    }else{
                        ShowVideo("http://adrianlealcaldera.com/moonlightclip.mp4");
                    }
                    break;

                case "Rick and Morty":
                    if(explanation){
                        ShowVideo("http://adrianlealcaldera.com/rickandmortyexp.mp4");
                    }else{
                        ShowVideo("http://adrianlealcaldera.com/riackandmortyclip.mp4");
                    }
                    break;

                case "Do You Want Pepsi":
                    if(explanation){
                        ShowVideo("http://adrianlealcaldera.com/doyouwantpepsiExp1.mp4");
                    }else{
                        ShowVideo("http://adrianlealcaldera.com/doyouwantpepsiClip.mp4");
                    }
                    break;
                case "Sangre Por Sangre Foodline":
                    if(explanation){
                        ShowVideo("http://adrianlealcaldera.com/sangrexsangrefoodlineExp.mp4");
                    }else{
                        ShowVideo("http://adrianlealcaldera.com/sangrexsangrefoodlineClip.mp4");
                    }

                    break;
                case "Sangre Por Sangre Watch El Paisaje":
                    if(explanation){
                        ShowVideo("http://adrianlealcaldera.com/sangrexsangrewatchaelpaisajeExp.mp4");
                    }else{
                        ShowVideo("http://adrianlealcaldera.com/sangrexsangrewatchaelpaisajeClip.mp4");
                    }
                    break;
                case "Training Day Rabbit Has The Gun":
                    if(explanation){
                        ShowVideo("http://adrianlealcaldera.com/trainingdayrabbithasthegunExp.mp4");
                    }else{
                        ShowVideo("http://adrianlealcaldera.com/trainingdayrabbithasthegunClip.mp4");
                    }
                    break;

                case "Hancock Train":
                    if(explanation){
                        ShowVideo("http://adrianlealcaldera.com/hancocktrainExp.mp4");
                    }else{
                        ShowVideo("http://adrianlealcaldera.com/hancocktrainClip.mp4");
                    }
                    break;

                case "Malcom in the Middle Teacher":
                    if(explanation){
                        ShowVideo("http://adrianlealcaldera.com/malconinthemiddleteacherExp.mp4");
                    }else{
                        ShowVideo("http://adrianlealcaldera.com/malconinthemiddleteacherClip.mp4");
                    }
                    break;

                case "Sangre Por Sangre Comedor":
                    if(explanation){
                        ShowVideo("http://adrianlealcaldera.com/sangrexsangre(comedor)Exp.mp4");
                    }else{
                        ShowVideo("http://adrianlealcaldera.com/sangrexsangre(comedor)Clip.mp4");
                    }
                    break;
                case "Dave Chapelle Man Rape":
                    if(explanation){
                        ShowVideo("http://adrianlealcaldera.com/davechapelle(man%20rape)Exp.mp4");
                    }else{
                        ShowVideo("http://adrianlealcaldera.com/davechapelle(man%20rape)Clip.mp4");
                    }
                    break;

                //luis R
                case "Análisis de cultura Gringa y Frases Coloquiales 2":
                    if(explanation){
                        ShowVideo("https://adrianlealcaldera.com/analisisdeculturagringayfrasescoloquiales2Exp.mp4");
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/analisisdeculturagringayfrasescoloquiales2Clip.mp4");
                    }
                    break;

                case "Boys in the Hood":
                    if(explanation){
                        ShowVideo("https://adrianlealcaldera.com/BoyzntheHoodExp.mp4");
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/BoyzntheHoodClip.mp4");
                    }
                    break;

                case "Cultura y Fonética":
                    if(explanation){
                        ShowVideo("https://adrianlealcaldera.com/CulturayFone%CC%81ticaExp.mp4");
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/CulturayFone%CC%81ticaClip.mp4");
                    }
                    break;

                case "Kings of the Hills Drugs":
                    if(explanation){
                        ShowVideo("https://adrianlealcaldera.com/kingofthehilldrugsExp.mp4");
                    }else{
                        ShowVideo("https://adrianlealcaldera.com/kingofthehilldrugseditedClip.mp4");
                    }
                    break;
            }
        }

        if(currenttxt.contains("estructura_nuevo")){
            switch (selection) {
                case "Tutorial":
                    ShowVideo("https://adrianlealcaldera.com/structurastut.mp4");
                    break;
                case "Present Simple":
                    ShowVideo("http://adrianlealcaldera.com/presentesimple.mp4");
                    break;

                case "Present Continuous":
                    ShowVideo("http://adrianlealcaldera.com/presentecontinuo.mp4");
                    break;

                case "Present Perfect":
                    ShowVideo("http://adrianlealcaldera.com/presenteperfecto.mp4");
                    break;

                case "Present Perfect Continuous":
                    ShowVideo("http://adrianlealcaldera.com/presenteperfectoconti.mp4");
                    break;

                case "Past Simple":
                    ShowVideo("http://adrianlealcaldera.com/pasadosimple.mp4");
                    break;

                case "Past Continuous":
                    ShowVideo("http://adrianlealcaldera.com/pasadocont.mp4");
                    break;

                case "Past Perfect":
                    ShowVideo("http://adrianlealcaldera.com/pasadoperf.mp4");
                    break;

                case "Past Perfect Continuous":
                    ShowVideo("http://adrianlealcaldera.com/pasadoperfcon.mp4");
                    break;

                case "Future Simple":
                    ShowVideo("http://adrianlealcaldera.com/futurosimp1.mp4");
                    break;

                case "Future Continuous":
                    ShowVideo("http://adrianlealcaldera.com/futuroconti.mp4");
                    break;

                case "Future Perfect":
                    ShowVideo("http://adrianlealcaldera.com/futuroperf.mp4");
                    break;

                case "Future Perfect Continuous":
                    ShowVideo("http://adrianlealcaldera.com/futuroperfcon.mp4");
                    break;

                case "Would Simple":
                    ShowVideo("http://adrianlealcaldera.com/wouldsimp.mp4");
                    break;

                case "Would Continuous":
                    ShowVideo("http://adrianlealcaldera.com/wouldconti.mp4");
                    break;

                case "Would Perfect":
                    ShowVideo("http://adrianlealcaldera.com/wouldperf.mp4");
                    break;

                case "Could Simple":
                    ShowVideo("http://adrianlealcaldera.com/couldsimp.mp4");
                    break;

                case "Could Continuous":
                    ShowVideo("http://adrianlealcaldera.com/couldconti.mp4");
                    Toast.makeText(getContext(), "El could continuous empieza en el minuto 5", Toast.LENGTH_SHORT).show();
                    break;

                case "Could Perfect":
                    ShowVideo("http://adrianlealcaldera.com/couldperf.mp4");
                    break;

                case "Could Perfect Continuous":
                    ShowVideo("http://adrianlealcaldera.com/couldperf.mp4");
                    Toast.makeText(getContext(), "El could perfect continuous empieza en el minuto 5:31", Toast.LENGTH_SHORT).show();
                    break;

                case "Might Simple":
                    ShowVideo("http://adrianlealcaldera.com/modalsimple.mp4");
                    break;

                case "Might Continuous":
                    ShowVideo("http://adrianlealcaldera.com/modalconti.mp4");
                    break;

                case "Might Perfect":
                    ShowVideo("http://adrianlealcaldera.com/modalperf.mp4");
                    break;

                case "Might Perfect Continuous":
                    ShowVideo("http://adrianlealcaldera.com/modalperfcont.mp4");
                    break;

                case "Should Simple":
                    ShowVideo("http://adrianlealcaldera.com/modalsimple.mp4");
                    break;

                case "Should Continuous":
                    ShowVideo("http://adrianlealcaldera.com/modalconti.mp4");
                    break;
                case "Should Perfect":
                    ShowVideo("http://adrianlealcaldera.com/modalperf.mp4");
                    break;

                case "Should Perfect Continuous":
                    ShowVideo("http://adrianlealcaldera.com/modalperfcont.mp4");
                    break;

                case "Can Simple":
                    ShowVideo("http://adrianlealcaldera.com/modalsimple.mp4");
                    break;

                case "Can Continuous":
                    ShowVideo("http://adrianlealcaldera.com/modalconti.mp4");
                    break;

                case "Must Simple":
                    ShowVideo("http://adrianlealcaldera.com/modalsimple.mp4");
                    break;

                case "Must Continuous":
                    ShowVideo("http://adrianlealcaldera.com/modalconti.mp4");
                    break;

                case "Must Perfect":
                    ShowVideo("http://adrianlealcaldera.com/modalperf.mp4");
                    break;

                case "Must Perfect Continuous":
                    ShowVideo("http://adrianlealcaldera.com/modalperfcont.mp4");
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

                case "Feel Like Simple":
                    ShowVideo("https://adrianlealcaldera.com/Feel%20Like.mp4");
                    break;
            }
        }

        if(currenttxt.contains("spa_int_nuevo")){
            switch (selection) {
                case "Tutorial":
                    ShowVideo("http://adrianlealcaldera.com/intdeesptut.mp4");
                    break;

                case "Por Preposición":
                    ShowVideo("http://adrianlealcaldera.com/intporprep.mp4");
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

    }
    public void ShowVideo(String url){

        video_lay.setVisibility(View.GONE);
        video_player.setVisibility(View.VISIBLE);

        Uri urit = Uri.parse(url);
        video_player.setVideoURI(urit);
        video_player.setMediaController(new MediaController(getContext()));
        video_player.requestFocus();

        //APLICAR AQUI UN LOADING
        loadingVideo.setVisibility(View.VISIBLE);

        video_player.setOnPreparedListener(mediaPlayer -> {
            //VIDEO EMPIEZA
            video_player.start();
            if (video_player.isPlaying()) {
                loadingVideo.setVisibility(View.GONE);
            } else {
                loadingVideo.setVisibility(View.VISIBLE);
            }
        });


        video_player.setOnCompletionListener(mediaPlayer -> {
            if(selection.contains("Tutorial")){
                Toast.makeText(getContext(), "Selecciona un contenido para empezar", Toast.LENGTH_SHORT).show();
                ResetVideo();
            }else{
                ResetVideo();
            }
        });
    }
    public void ResetVideo(){
        video_lay.setVisibility(View.VISIBLE);
        video_player.setVisibility(View.INVISIBLE);
    }

    public String SaberDondeEstoy(){
        String txtActivity = "";
        String cadenaEliminar = "com.leal.cipm_testing.";
        String txtActivitySinEliminar = getContext().toString();

        txtActivity = txtActivitySinEliminar.replace(cadenaEliminar,"");
        return txtActivity;
    }

}