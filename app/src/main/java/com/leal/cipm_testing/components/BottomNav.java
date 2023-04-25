package com.leal.cipm_testing.components;


import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.leal.cipm_testing.MainActivity;
import com.leal.cipm_testing.R;
import com.leal.cipm_testing.chat_maestro;
import com.leal.cipm_testing.profile;
import com.leal.cipm_testing.test_student;

public class BottomNav extends Fragment {

    LinearLayout bgMain,bgTest,bgChat,bgProfile;
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
        bgMain = view.findViewById(R.id.bgMain);
        bgTest = view.findViewById(R.id.bgTest);
        bgChat = view.findViewById(R.id.bgChat);
        bgProfile = view.findViewById(R.id.bgProfile);

        btn_main.setOnClickListener(v -> {
            Intent intento = new Intent(getContext(), MainActivity.class);
            startActivity(intento);
        });

        btn_test_bottom.setOnClickListener(v -> {
            Intent intento = new Intent(getContext(), test_student.class);
            startActivity(intento);
        });

        btn_chat_maestro.setOnClickListener(v -> {
            Intent intento = new Intent(getContext(), chat_maestro.class);
            startActivity(intento);
        });

        btn_profile.setOnClickListener(v -> {
            Intent intento = new Intent(getContext(), profile.class);
            startActivity(intento);
        });

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

        if(currenttxt.contains("MainActivity")){
            bgMain.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));
        }

        if(currenttxt.contains("test_student")){
            bgTest.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));
        }

        if(currenttxt.contains("chat_maestro")){
            bgChat.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));
        }

        if(currenttxt.contains("profile")){
            bgProfile.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));
        }

    };
}