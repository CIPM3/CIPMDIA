package com.leal.cipm_testing.components;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.leal.cipm_testing.screens.Cultura2023;
import com.leal.cipm_testing.MainActivity;
import com.leal.cipm_testing.R;

public class header extends Fragment {
    TextView editText;
    String Screen;

    public header() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_header, container, false);
        LinearLayout btn_main = view.findViewById(R.id.btn_main);
        btn_main.setOnClickListener(v -> {
            NavegacionMain();
        });
        // Obtener referencia al EditText
        editText = view.findViewById(R.id.txtHeader);
        ActualizarDondeEstoy();
        return view;
    }


    public String SaberDondeEstoy(){
        String txtActivity = "";
        String cadenaEliminar = "com.leal.cipm_testing.";
        String txtActivitySinEliminar = getContext().toString();

        txtActivity = txtActivitySinEliminar.replace(cadenaEliminar,"");
        return txtActivity;
    }

    public void ActualizarDondeEstoy(){
        String currenttxt = SaberDondeEstoy();

        if(currenttxt.contains("FormularioInfo")){
            editText.setText("Formulario");
            Screen = "Formulario";
        }

        if (currenttxt.contains("Cultura")) {
            // Cambiar el texto del EditText
            editText.setText("Culture");
            Screen = "Cultura";
        }

        if (currenttxt.contains("screens.TestStudent")) {
            // Cambiar el texto del EditText
            editText.setText("Test");
            Screen = "Test";
        }

        if (currenttxt.contains("screens.SpaInt")) {
            // Cambiar el texto del EditText
            editText.setText("Spanish Interference");
            Screen = "Spanish Interference";
        }

        if (currenttxt.contains("screens.ConInt")) {
            // Cambiar el texto del EditText
            editText.setText("Conscious Interference");
            Screen = "Conscious Interference";
        }

        if (currenttxt.contains("screens.Availability")) {
            // Cambiar el texto del EditText
            editText.setText("Availability");
            Screen = "Availability";
        }

        if (currenttxt.contains("screens.Estructura")) {
            // Cambiar el texto del EditText
            editText.setText("Structures");
            Screen = "Structures";
        }

        if (currenttxt.contains("screens.Vocabulary")) {
            // Cambiar el texto del EditText
            editText.setText("Vocabulary");
            Screen = "Vocabulary";
        }

        if (currenttxt.contains("screens.Transicion")) {
            // Cambiar el texto del EditText
            editText.setText("Transiciones");
            Screen = "Transiciones";
        }

        if (currenttxt.contains("PlanDeEstudios")) {
            // Cambiar el texto del EditText
            editText.setText("Mi Plan");
            Screen = "Mi Plan";
        }

        if (currenttxt.contains("Culturalphrases")) {
            // Cambiar el texto del EditText
            editText.setText("Frases Culturales");
            Screen = "Frases Culturales";
        }

        if (currenttxt.contains("screens.Premium")) {
            // Cambiar el texto del EditText
            editText.setText("Hazte Premium");
            Screen = "Hazte Premium";
        }
    };

    public void NavegacionMain(){

        if(Screen == "Frases Culturales"){
            Intent intento = new Intent(getContext(), Cultura2023.class);
            startActivity(intento);
        }else{
            Intent intento = new Intent(getContext(), MainActivity.class);
            startActivity(intento);
        }
    }


}