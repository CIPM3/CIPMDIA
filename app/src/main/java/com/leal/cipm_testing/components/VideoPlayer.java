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
import com.leal.cipm_testing.interfaces.OnVideoPositionPass;

public class VideoPlayer extends Fragment {
    LinearLayout video_lay;
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
                        Toast.makeText(getContext(), "CLIP", Toast.LENGTH_SHORT).show();
                        ShowVideo("http://adrianlealcaldera.com/moonlightclip.mp4");
                    }
                    break;

                case "Rick and Morty":
                    if(explanation){
                        ShowVideo("http://adrianlealcaldera.com/rickandmortyexp.mp4");
                    }
                    break;

                case "Do You Want Pepsi":
                    if(explanation){
                        ShowVideo("http://adrianlealcaldera.com/doyouwantpepsiExp1.mp4");
                    }
                    break;
                case "Sangre Por Sangre Foodline":
                    if(explanation){
                        ShowVideo("http://adrianlealcaldera.com/sangrexsangrefoodlineExp.mp4");
                    }

                    break;
                case "Sangre Por Sangre Watch El Paisaje":
                    if(explanation){
                        ShowVideo("http://adrianlealcaldera.com/sangrexsangrewatchaelpaisajeExp.mp4");
                    }
                    break;
                case "Training Day Rabbit Has The Gun":
                    if(explanation){
                        ShowVideo("http://adrianlealcaldera.com/trainingdayrabbithasthegunExp.mp4");
                    }
                    break;

                case "Hancock Train":
                    if(explanation){
                        ShowVideo("http://adrianlealcaldera.com/hancocktrainExp.mp4");
                    }
                    break;

                case "Malcom in the Middle Teacher":
                    if(explanation){
                        ShowVideo("http://adrianlealcaldera.com/malconinthemiddleteacherExp.mp4");
                    }
                    break;

                case "Sangre Por Sangre Comedor":
                    if(explanation){
                        ShowVideo("http://adrianlealcaldera.com/sangrexsangre(comedor)Exp.mp4");
                    }
                    break;
                case "Dave Chapelle Man Rape":
                    if(explanation){
                        ShowVideo("http://adrianlealcaldera.com/davechapelle(man%20rape)Exp.mp4");
                    }
                    break;

                //luis R
                case "Análisis de cultura Gringa y Frases Coloquiales 2":
                    if(explanation){
                        ShowVideo("https://adrianlealcaldera.com/analisisdeculturagringayfrasescoloquiales2Exp.mp4");
                    }
                    break;

                case "Boys in the Hood":
                    if(explanation){
                        ShowVideo("https://adrianlealcaldera.com/BoyzntheHoodExp.mp4");
                    }
                    break;

                case "Cultura y Fonética":
                    if(explanation){
                        ShowVideo("https://adrianlealcaldera.com/CulturayFone%CC%81ticaExp.mp4");
                    }
                    break;

                case "Kings of the Hills Drugs":
                    if(explanation){
                        ShowVideo("https://adrianlealcaldera.com/kingofthehilldrugsExp.mp4");
                    }
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

        video_player.setOnPreparedListener(mediaPlayer -> {
            //VIDEO EMPIEZA
            video_player.start();
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