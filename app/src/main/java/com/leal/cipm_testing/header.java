package com.leal.cipm_testing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.leal.cipm_testing.Cultura2023;
import com.leal.cipm_testing.MainActivity;
import com.leal.cipm_testing.R;

public class header extends Fragment {
    TextView editText;
    String Screen;
    FirebaseUser user;
    FirebaseAuth mAuth;

    public header() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_header, container, false);
        LinearLayout btn_main = view.findViewById(R.id.btn_main);
        mAuth=FirebaseAuth.getInstance();
        user=mAuth.getCurrentUser();
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

        if (currenttxt.contains("TestStudent")) {
            // Cambiar el texto del EditText
            editText.setText("Test");
            Screen = "Test";
        }

        if (currenttxt.contains("SpaInt")) {
            // Cambiar el texto del EditText
            editText.setText("Spanish Interference");
            Screen = "Spanish Interference";
        }

        if (currenttxt.contains("ConInt")) {
            // Cambiar el texto del EditText
            editText.setText("Conscious Interference");
            Screen = "Conscious Interference";
        }

        if (currenttxt.contains("Availability")) {
            // Cambiar el texto del EditText
            editText.setText("Availability");
            Screen = "Availability";
        }

        if (currenttxt.contains("Estructura")) {
            // Cambiar el texto del EditText
            editText.setText("Structures");
            Screen = "Structures";
        }

        if (currenttxt.contains("Vocabulary")) {
            // Cambiar el texto del EditText
            editText.setText("Vocabulary");
            Screen = "Vocabulary";
        }

        if (currenttxt.contains("Transicion")) {
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

        if (currenttxt.contains("Premium")) {
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
            if(user.isAnonymous()){
                dialogueContainer("Necesitas Registrarte Con Correo y contraseña","ir a registro","Quedarme",getContext());
            }else {
                Intent intento = new Intent(getContext(), MainActivity.class);
                startActivity(intento);
            }

        }
    }
    public void dialogueContainer(String text, String buttonyes, String buttonno, Context contexto){
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        LayoutInflater inflater = getLayoutInflater();

        View dialogView = inflater.inflate(R.layout.dialogebox, null); // Replace with your layout file name
        builder.setView(dialogView);

        TextView textView = dialogView.findViewById(R.id.textodialogo);
        textView.setText(text);
        AlertDialog dialog = builder.create();

// Set up the button click listener if needed
        Button button = dialogView.findViewById(R.id.buttondialogo1);
        button.setText(buttonyes);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(contexto,Registro2023.class);
                startActivity(intento);



            }
        });
        Button button2 = dialogView.findViewById(R.id.botondialogo2);
        button2.setText(buttonno);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();             }
        });

        dialog.show();

    }


}