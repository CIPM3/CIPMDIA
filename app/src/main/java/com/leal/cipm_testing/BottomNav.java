package com.leal.cipm_testing;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.leal.cipm_testing.MainActivity;
import com.leal.cipm_testing.R;
import com.leal.cipm_testing.ChatMaestro2023;
import com.leal.cipm_testing.Premium2023;
import com.leal.cipm_testing.Profile2023;


public class BottomNav extends Fragment {

    LinearLayout bgMain,bgTest,bgChat,bgProfile,bgPremium,bgToefl,bgPlan;
    boolean isfromtest;
    FirebaseAuth mAuth;
    String userid;
    FirebaseUser user;
    Prefs prefs;
    Context context ;
    public BottomNav(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom_nav, container, false);

        LinearLayout btn_main = view.findViewById(R.id.btn_main);
        LinearLayout btn_chat_maestro = view.findViewById(R.id.btn_chat_maestro);
        LinearLayout btn_profile = view.findViewById(R.id.btn_profile);
        LinearLayout btn_test_bottom = view.findViewById(R.id.btn_test_bottom);
        LinearLayout btn_premium_bottom = view.findViewById(R.id.btn_premium_bottom);
        context=getContext();
        assert context != null;
        prefs= new Prefs(context);
        bgMain = view.findViewById(R.id.bgMain);
        bgMain.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#000000")));

        bgTest = view.findViewById(R.id.bgTest);
        bgChat = view.findViewById(R.id.bgChat);
        bgProfile = view.findViewById(R.id.bgProfile);
        bgPremium = view.findViewById(R.id.bgPremium);

        bgPremium.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF0000")));
        mAuth= FirebaseAuth.getInstance();
        user = mAuth.getCurrentUser();

        LinearLayout toefllay= view.findViewById(R.id.toefllayout);
        bgToefl=view.findViewById(R.id.bgtoefllay);
        bgToefl.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#000000")));

        LinearLayout planLay = view.findViewById(R.id.planLayout);
        bgPlan = view.findViewById(R.id.bgMyPlan);
        bgPlan.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#000000")));

        toefllay.setOnClickListener(v -> {

            if (user != null) {
                if (user.isAnonymous()) {
                   /* AlertDialog alertDialog = new AlertDialog.Builder(getContext())
//set icon
                            .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                            .setTitle("Atención ! ")
//set message
                            .setMessage("Necesitas Registrate con Correo y contraseña para acesar estas funciones")
//set positive button
                            .setPositiveButton("ir a registro", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //no hemos decidido a donde mandarlo todavia despues del examen
                                    Intent intent = new Intent(getContext(),Registro2023.class);
                                    startActivity(intent);

                                }
                            })
//set negative button
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .show();*/
                    dialogueContainer1("Necesitas Registrate con Correo y contraseña para acesar estas funciones","ir a registro","Quedarme aqui");


                } else {
                    Intent intent = new Intent(getContext(), ToeflSpeaking.class);

                    startActivity(intent);



                }
            }
        });


        ActualizarDondeEstoy();
        btn_test_bottom.setOnClickListener(v -> {


            if (user != null) {
                if (user.isAnonymous()) {
                   /* AlertDialog alertDialog = new AlertDialog.Builder(getContext())
//set icon
                            .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                            .setTitle("Atención ! ")
//set message
                            .setMessage("Necesitas Registrate con Correo y contraseña para acesar estas funciones")
//set positive button
                            .setPositiveButton("ir a registro", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //no hemos decidido a donde mandarlo todavia despues del examen
                                    Intent intent = new Intent(getContext(),Registro2023.class);
                                    startActivity(intent);

                                }
                            })
//set negative button
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .show();*/
                    dialogueContainer1("Necesitas Registrate con Correo y contraseña para acesar estas funciones","ir a registro","Quedarme aqui");
                } else {
                    Intent intento = new Intent(getContext(), Vocabulary2023.class);
                    isfromtest =true;
                    intento.putExtra("test", isfromtest);
                    startActivity(intento);




                }
            }

        });

        btn_chat_maestro.setOnClickListener(v -> {

            if (user != null) {
                if (user.isAnonymous()) {
                   /* AlertDialog alertDialog = new AlertDialog.Builder(getContext())
//set icon
                            .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                            .setTitle("Atención ! ")
//set message
                            .setMessage("Necesitas Registrate con Correo y contraseña para acesar estas funciones")
//set positive button
                            .setPositiveButton("ir a registro", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //no hemos decidido a donde mandarlo todavia despues del examen
                                    Intent intent = new Intent(getContext(),Registro2023.class);
                                    startActivity(intent);

                                }
                            })
//set negative button
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .show();*/
                    dialogueContainer1("Necesitas Registrate con Correo y contraseña para acesar estas funciones","ir a registro","Quedarme aqui");

                } else {

                    Intent intento = new Intent(getContext(), ChatMaestro2023.class);
                    startActivity(intento);
                }
            }

        });
        btn_main.setOnClickListener(v -> {

            if (user != null) {
                if (user.isAnonymous()) {
                   /* AlertDialog alertDialog = new AlertDialog.Builder(getContext())
//set icon
                            .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                            .setTitle("Atención ! ")
//set message
                            .setMessage("Necesitas Registrate con Correo y contraseña para acesar estas funciones")
//set positive button
                            .setPositiveButton("ir a registro", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //no hemos decidido a donde mandarlo todavia despues del examen
                                    Intent intent = new Intent(getContext(),Registro2023.class);
                                    startActivity(intent);

                                }
                            })
//set negative button
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .show();*/
                    dialogueContainer1("Necesitas Registrate con Correo y contraseña para acesar estas funciones","ir a registro","Quedarme aqui");


                } else {

                    gotoURl("https://www.cursosdeinglespersonalizadosenmonterrey.com/");




                }
            }
        });

        btn_profile.setOnClickListener(v -> {

            if (user != null) {
                if (user.isAnonymous()) {
                   /* AlertDialog alertDialog = new AlertDialog.Builder(getContext())
//set icon
                            .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                            .setTitle("Atención ! ")
//set message
                            .setMessage("Necesitas Registrate con Correo y contraseña para acesar estas funciones")
//set positive button
                            .setPositiveButton("ir a registro", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //no hemos decidido a donde mandarlo todavia despues del examen
                                    Intent intent = new Intent(getContext(),Registro2023.class);
                                    startActivity(intent);

                                }
                            })
//set negative button
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .show();*/
                    dialogueContainer1("Necesitas Registrate con Correo y contraseña para acesar estas funciones","ir a registro","Quedarme aqui");

                } else {
                    Intent intento = new Intent(getContext(), Profile2023.class);
                    startActivity(intento);



                }
            }
        });

        bgPremium.setOnClickListener(v -> {

            if (user != null) {
                if (user.isAnonymous()) {
                   /* AlertDialog alertDialog = new AlertDialog.Builder(getContext())
//set icon
                            .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                            .setTitle("Atención ! ")
//set message
                            .setMessage("Necesitas Registrate con Correo y contraseña para acesar estas funciones")
//set positive button
                            .setPositiveButton("ir a registro", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //no hemos decidido a donde mandarlo todavia despues del examen
                                    Intent intent = new Intent(getContext(),Registro2023.class);
                                    startActivity(intent);

                                }
                            })
//set negative button
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .show();*/
                    dialogueContainer1("Necesitas Registrate con Correo y contraseña para acesar estas funciones","ir a registro","Quedarme aqui");


                } else {

                    Intent intento = new Intent(getContext(), Premium2023.class);
                    startActivity(intento);



                }
            }
        });
        planLay.setOnClickListener(v -> {

            if (user != null) {
                if (user.isAnonymous()) {
                   /* AlertDialog alertDialog = new AlertDialog.Builder(getContext())
//set icon
                            .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                            .setTitle("Atención ! ")
//set message
                            .setMessage("Necesitas Registrate con Correo y contraseña para acesar estas funciones")
//set positive button
                            .setPositiveButton("ir a registro", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //no hemos decidido a donde mandarlo todavia despues del examen
                                    Intent intent = new Intent(getContext(),Registro2023.class);
                                    startActivity(intent);

                                }
                            })
//set negative button
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .show();*/
                    dialogueContainer1("Necesitas Registrate con Correo y contraseña para acesar estas funciones","ir a registro","Quedarme aqui");


                } else {

                    if(prefs.getPremium()==0){
                        Toast.makeText(context,"Solo para usuarios Premium",Toast.LENGTH_SHORT).show();
                    }else {
                        Intent intent = new Intent(getContext(), PlanDeEstudiosChooser.class);
                        startActivity(intent);
                    }




                }
            }
        });


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

        if(currenttxt.contains("MainActivity")){
            bgMain.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));
        }

        if(currenttxt.contains("Vocabulary2023")){
            bgTest.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));
        }

        if(currenttxt.contains("ChatMaestro")){
            bgChat.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));
        }

        if(currenttxt.contains("Profile")){
            bgProfile.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));
        }

        if (currenttxt.contains("Premium")) {
            bgPremium.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#F8D22F")));
        }


    }

    public void dialogueContainer1(String text,String buttonyes,String buttonno){
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
        GradientDrawable drawable = new GradientDrawable();
        drawable.setShape(GradientDrawable.RECTANGLE); // Set the shape to rectangle
        drawable.setCornerRadii(new float[]{16, 16, 16, 16, 16, 16, 16, 16}); // Set corner radii (adjust the values as needed)
        drawable.setColor(Color.BLUE); // Set the background color
        button.setBackground(drawable);

        GradientDrawable drawable2 = new GradientDrawable();
        drawable2.setShape(GradientDrawable.RECTANGLE); // Set the shape to rectangle
        drawable2.setCornerRadii(new float[]{16, 16, 16, 16, 16, 16, 16, 16}); // Set corner radii (adjust the values as needed)
        drawable2.setColor(Color.RED); // Set the background color
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Registro2023.class);
                startActivity(intent);



            }
        });
        Button button2 = dialogView.findViewById(R.id.botondialogo2);
        button2.setText(buttonno);

        button2.setBackground(drawable2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();             }
        });

        dialog.show();

    }
    private void gotoURl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }



}