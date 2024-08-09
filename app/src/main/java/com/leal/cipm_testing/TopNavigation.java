package com.leal.cipm_testing;


import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class TopNavigation extends Fragment {


    LinearLayout bgLessonIcon,bgStructureNewIcon,bgPrager,bgVocab,bgConectorNuevo,bgSpInt,bgCultura,bgRachel,bgPlan;
    LinearLayout bgOldStruct,bgOldVocab,bgToefl,bgOldCon;
    HorizontalScrollView horizontalScrollView;
    Prefs prefs;


    boolean isfromtest;
    FirebaseAuth mAuth;
    String userid;
    FirebaseUser user;
    Context context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_top_navigation, container, false);
        horizontalScrollView=view.findViewById(R.id.horizontal_viewFrag);

        LinearLayout lessonLinearLayout = view.findViewById(R.id.btn_lesson);
        bgLessonIcon = view.findViewById(R.id.bgLessonPlanicon);
        bgLessonIcon.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#000000")));

        LinearLayout structureNewLayout = view.findViewById(R.id.btn_structure_new);
        bgStructureNewIcon = view.findViewById(R.id.bgStructureNew);
        bgStructureNewIcon.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#000000")));

        LinearLayout readingLayout = view.findViewById(R.id.pragerLayout );
        bgPrager=view.findViewById(R.id.bgPrager);
        bgPrager.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#000000")));

        LinearLayout newVocabLayout = view.findViewById(R.id.vocabLayout);
        bgVocab= view.findViewById(R.id.bgVocabLayout);
        bgVocab.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#000000")));

        LinearLayout newConectores = view.findViewById(R.id.conectorNuevoLayout);
        bgConectorNuevo=view.findViewById(R.id.bgConectorNuevo);
        bgConectorNuevo.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#000000")));

        LinearLayout spIntlay = view.findViewById(R.id.spintlayout);
        bgSpInt= view.findViewById(R.id.bgspInt);
        bgSpInt.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#000000")));

        LinearLayout cultLay = view.findViewById(R.id.culturalayout);
        bgCultura= view.findViewById(R.id.bgCultura);
        bgCultura.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#000000")));

        LinearLayout rachLay= view.findViewById(R.id.rachelayout);
        bgRachel=view.findViewById(R.id.bgRachel);
        bgRachel.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#000000")));



        LinearLayout struViejoLay = view.findViewById(R.id.structureViejoLayout );
        bgOldStruct=view.findViewById(R.id.bgOldStructlay);
        bgOldStruct.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#000000")));

        LinearLayout vocViejoLay   = view.findViewById(R.id.vocabViejoLayout);
        bgOldVocab=view.findViewById(R.id.bgOldVocabLay);
        bgOldVocab.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#000000")));

        LinearLayout conviejolay = view.findViewById(R.id.conectorViejoLayout);
        bgOldCon = view.findViewById(R.id.bgOldconlay);
        bgOldCon.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#000000")));





        context= getContext();
        prefs= new Prefs(context);
        loadRewardedAd();

        mAuth= FirebaseAuth.getInstance();
        user = mAuth.getCurrentUser();

        lessonLinearLayout.setOnClickListener(v -> {
            Intent intento = new Intent(getContext(), lessonPlan_RecyclerView.class);
            startActivity(intento);
        });
        structureNewLayout.setOnClickListener(v -> {


            Intent intent = new Intent(getContext(), NewVocabRecyclerView.class);
            intent.putExtra("fromStructures",true);
            startActivity(intent);

        });
        readingLayout.setOnClickListener(v -> {

            if (user != null) {
                if (user.isAnonymous()) {
                    dialogueContainer1("Necesitas Registrate con Correo y contraseña para acesar estas funciones","ir a registro","Quedarme aqui");


                } else {
                    if(!prefs.getHasSeenAd()){
                        dialogueContainer2("Ver anuncio para desbloquear o Versión sin anuncios","Cipm Premium","Ver anuncio");
                    }else if(prefs.getHasSeenAd()){
                        Intent intent = new Intent(context, Availability2023.class);
                        startActivity(intent);
                    }




                }
            }
        });
        newVocabLayout.setOnClickListener(v -> {

            Intent intent = new Intent(getContext(), NewVocabRecyclerView.class);
            intent.putExtra("fromVocab",true);
            startActivity(intent);

        });
        newConectores.setOnClickListener(v -> {

            Intent intent = new Intent(getContext(), NewVocabRecyclerView.class);
            intent.putExtra("fromTrans",true);
            startActivity(intent);

        });
        spIntlay.setOnClickListener(v -> {
            if (user != null) {
                if (user.isAnonymous()) {

                    dialogueContainer1("Necesitas Registrate con Correo y contraseña para acesar estas funciones","ir a registro","Quedarme aqui");


                } else {

                    if(!prefs.getHasSeenAd()&&prefs.getPremium()==0){
                        dialogueContainer2("Ver anuncio para desbloquear o Versión sin anuncios","Cipm Premium","Ver anuncio");
                    }else if(prefs.getHasSeenAd()||prefs.getPremium()==1){
                        Intent intent = new Intent(context, SpaInt2023.class);
                        startActivity(intent);
                    }




                }
            }

        });
        cultLay.setOnClickListener(v -> {

            if (user != null) {
                if (user.isAnonymous()) {
                    dialogueContainer1("Necesitas Registrate con Correo y contraseña para acesar estas funciones","ir a registro","Quedarme aqui");


                } else {
                    if(!prefs.getHasSeenAd()&&prefs.getPremium()==0){
                        dialogueContainer2("Ver anuncio para desbloquear o Versión sin anuncios","Cipm Premium","Ver anuncio");
                    }else if(prefs.getHasSeenAd()||prefs.getPremium()==1){
                        Intent intent = new Intent(context, Cultura2023.class);
                        startActivity(intent);
                    }



                }
            }
        });
        rachLay.setOnClickListener(v -> {

            if (user != null) {
                if (user.isAnonymous()) {
                    dialogueContainer1("Necesitas Registrate con Correo y contraseña para acesar estas funciones","ir a registro","Quedarme aqui");


                } else {
                    if(!prefs.getHasSeenAd()&&prefs.getPremium()==0){
                        dialogueContainer2("Ver anuncio para desbloquear o Versión sin anuncios","Cipm Premium","Ver anuncio");
                    }else if(prefs.getHasSeenAd()||prefs.getPremium()==1){
                        Intent intent = new Intent(context, ConInt2023.class);
                        startActivity(intent);
                    }



                }
            }
        });
        struViejoLay.setOnClickListener(v -> {
            if (user != null) {
                if (user.isAnonymous()) {

                    dialogueContainer1("Necesitas Registrate con Correo y contraseña para acesar estas funciones","ir a registro","Quedarme aqui");


                } else {
                    if(!prefs.getHasSeenAd()&&prefs.getPremium()==0){
                        dialogueContainer2("Ver anuncio para desbloquear o Versión sin anuncios","Cipm Premium","Ver anuncio");
                    }else if(prefs.getHasSeenAd()||prefs.getPremium()==1){
                        Intent intent = new Intent(context, Estructura2023.class);
                        startActivity(intent);
                    }




                }
            }


        });
        vocViejoLay.setOnClickListener(v -> {
            if (user != null) {
                if (user.isAnonymous()) {
                    dialogueContainer1("Necesitas Registrate con Correo y contraseña para acesar estas funciones","ir a registro","Quedarme aqui");


                } else {
                    if(!prefs.getHasSeenAd()&&prefs.getPremium()==0){
                        dialogueContainer2("Ver anuncio para desbloquear o Versión sin anuncios","Cipm Premium","Ver anuncio");
                    }else if(prefs.getHasSeenAd()||prefs.getPremium()==1){
                        Intent intent = new Intent(context, Vocabulary2023.class);
                        startActivity(intent);
                    }




                }
            }

        });
        conviejolay.setOnClickListener(v -> {

            if (user != null) {
                if (user.isAnonymous()) {
                    dialogueContainer1("Necesitas Registrate con Correo y contraseña para acesar estas funciones","ir a registro","Quedarme aqui");


                } else {
                    if(!prefs.getHasSeenAd()&&prefs.getPremium()==0){
                        dialogueContainer2("Ver anuncio para desbloquear o Versión sin anuncios","Cipm Premium","Ver anuncio");
                    }else if(prefs.getHasSeenAd()||prefs.getPremium()==1){
                        Intent intent = new Intent(context, Transicion2023.class);
                        startActivity(intent);
                    }




                }
            }
        });
        ActualizarDondeEstoy();

        return view;    }

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
    public String SaberDondeEstoy(){
        String txtActivity = "";
        String cadenaEliminar = "com.leal.cipm_testing.";
        String txtActivitySinEliminar = getContext().toString();

        txtActivity = txtActivitySinEliminar.replace(cadenaEliminar,"");
        return txtActivity;
    }
    public void ActualizarDondeEstoy(){
        String currenttxt = SaberDondeEstoy();

        if(currenttxt.contains("lessonPlan_RecyclerView")){
            bgLessonIcon.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));

        }
        if(currenttxt.contains("NewVocabRecyclerView")){
            bgStructureNewIcon.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));
            bgVocab.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));
            bgConectorNuevo.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));
        }
        if(currenttxt.contains("SpaInt2023")){
            bgSpInt.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));

        }
        if(currenttxt.contains("Availability2023")){
            bgPrager.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));

        }
        if(currenttxt.contains("Cultura2023")){
            bgCultura.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));

        }
        if(currenttxt.contains("ConInt2023")){
            bgRachel.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));

        }
        if(currenttxt.contains("Estructura2023")){
            bgOldStruct.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));

        }
        if(currenttxt.contains("Vocabulary2023")){
            bgOldVocab.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));

        }
        if(currenttxt.contains("Transicion2023")){
            bgOldCon.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));

        }

        if(currenttxt.contains("PlanDeEstudiosChooser")){
            bgPlan.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#407BFB")));

        }




    }

    private RewardedAd mRewardedAd;
    private void loadRewardedAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load((Activity) context, "ca-app-pub-9126282069959189/4682430474", adRequest,
                new RewardedAdLoadCallback() {
                    @Override
                    public void onAdLoaded(RewardedAd rewardedAd) {
                        mRewardedAd = rewardedAd;
                        Log.d("TAG", "Ad was loaded.");

                        // Set FullScreenContentCallback
                        mRewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when ad is shown.
                                Log.d("TAG", "Ad was shown.");
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                // Called when ad fails to show.
                                Log.d("TAG", "Ad failed to show.");
                            }

                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when ad is dismissed.
                                Log.d("TAG", "Ad was dismissed.");

                                // Reload the ad
                                mRewardedAd = null;
                                loadRewardedAd();
                            }
                        });
                    }

                    @Override
                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        // Handle the error.
                        Log.d("TAG", loadAdError.getMessage());
                        mRewardedAd = null;
                    }
                });
    }
    public void showRewardedAd2() {
        if (mRewardedAd != null) {
            mRewardedAd.show((Activity) context, rewardItem -> {
                // Handle the reward.
                prefs.setHasSeenAd(true);
                Intent intent = new Intent((Activity) context, SpaInt2023.class);
                startActivity(intent);
            });

        } else {
            Log.d("TAG", "The rewarded ad wasn't ready yet.");
            prefs.setHasSeenAd(true);
            Toast.makeText(context, "Quieres la versión sin interrupciones?", Toast.LENGTH_SHORT).show();
            Intent intento = new Intent(context,Premium2023.class);
            startActivity(intento);
        }
    }
    public void dialogueContainer2(String text, String buttonYes, String buttonNo) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LayoutInflater inflater = getLayoutInflater();

        View dialogView = inflater.inflate(R.layout.dialogebox, null);
        builder.setView(dialogView);

        TextView textView = dialogView.findViewById(R.id.textodialogo);
        textView.setText(text);

        Button buttonYesView = dialogView.findViewById(R.id.buttondialogo1);
        buttonYesView.setText(buttonYes);
        buttonYesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Premium2023.class);
                prefs.setHasSeenAd(true);
                startActivity(intent);
            }
        });

        Button buttonNoView = dialogView.findViewById(R.id.botondialogo2);
        buttonNoView.setText(buttonNo);
        buttonNoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRewardedAd2();
            }
        });

        AlertDialog dialog = builder.create();

        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                // Handle the dialog cancel (when user clicks outside the dialog)
                prefs.setHasSeenAd(false);
            }
        });

        dialog.show();
    }

}