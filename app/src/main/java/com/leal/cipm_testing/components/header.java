package com.leal.cipm_testing.components;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.leal.cipm_testing.MainActivity;
import com.leal.cipm_testing.R;

public class header extends Fragment {
    EditText editText;

    public header() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_header, container, false);
        LinearLayout btn_main = view.findViewById(R.id.btn_main);
        btn_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(getContext(), MainActivity.class);
                startActivity(intento);
            }
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

        if (currenttxt.contains("Cultura")) {
            // Cambiar el texto del EditText
            editText.setText("Culture");
        }

        if (currenttxt.contains("test_student")) {
            // Cambiar el texto del EditText
            editText.setText("Test");
        }

        if (currenttxt.contains("spa_int_nuevo")) {
            // Cambiar el texto del EditText
            editText.setText("Spanish Interference");
        }

        if (currenttxt.contains("conscisousinterference")) {
            // Cambiar el texto del EditText
            editText.setText("Conscious Interference");
        }

        if (currenttxt.contains("availability_nuevo")) {
            // Cambiar el texto del EditText
            editText.setText("Availability");
        }

        if (currenttxt.contains("estructura_nuevo")) {
            // Cambiar el texto del EditText
            editText.setText("Structures");
        }

        if (currenttxt.contains("vocabulary_nuevo")) {
            // Cambiar el texto del EditText
            editText.setText("Vocabulary");
        }

        if (currenttxt.contains("Transicion_nuevo")) {
            // Cambiar el texto del EditText
            editText.setText("Transiciones");
        }

        if (currenttxt.contains("PlanDeEstudios")) {
            // Cambiar el texto del EditText
            editText.setText("Mi Plan");
        }
    };
}