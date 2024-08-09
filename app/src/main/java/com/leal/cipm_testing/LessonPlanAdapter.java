package com.leal.cipm_testing;

import static androidx.core.content.ContextCompat.startActivity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;
import androidx.webkit.internal.ApiFeature;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.firebase.auth.FirebaseAuth;

import org.checkerframework.checker.units.qual.C;

import java.util.Arrays;
import java.util.List;

public class LessonPlanAdapter extends RecyclerView.Adapter<LessonPlanAdapter.LessonPlanViewHolder> {

    private List<LessonPlanItem> lessonPlanItemList;
    Prefs prefs;

    private Context context;
    // Constructor
    public LessonPlanAdapter(Context context, List<LessonPlanItem> lessonPlanItemList, Prefs prefs) {
        this.lessonPlanItemList = lessonPlanItemList;
        this.context=context;
        this.prefs=prefs;
        if(prefs.getPremium()==0){
            loadRewardedAd();
        }

    }

    @NonNull
    @Override
    public LessonPlanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the custom layout
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.circularlessonvisual, parent, false);
        return new LessonPlanViewHolder(itemView);
    }
    private final int[] colors = {
            Color.parseColor("#FFFFE0"), // Light Yellow
            Color.parseColor("#FFFACD"), // Lemon Chiffon
            Color.parseColor("#FAFAD2"), // Light Goldenrod Yellow
            Color.parseColor("#EEE8AA"), // Pale Goldenrod
            Color.parseColor("#F0E68C"), // Khaki
            Color.parseColor("#FFD700")  // Gold
    };



    @Override
    public void onBindViewHolder(@NonNull LessonPlanViewHolder holder, int position) {
        // Get the data model based on position
        LessonPlanItem item = lessonPlanItemList.get(position);
        // Set item views based on your views and data model
        // Obtén la posición del ViewHolder

        // Cambia el color de fondo basado en la posición
        if (position % 2 == 0) {
            holder.containet_card.setBackgroundColor(Color.parseColor("#EEEEEE")); // Fondo gris claro para posiciones pares
        } else {
            holder.containet_card.setBackgroundColor(Color.WHITE); // Fondo blanco para posiciones impares
        }

        holder.titleTextView.setText(item.getTitle());
        holder.subTitleTextView.setText(item.getSubTitle());
        holder.descriptionTextView.setText(item.getDescription());
        holder.circularButton.setText(item.getCircularBtnTxt());
        holder.completedTextView.setText(item.getCompletedTxt());
        String currentSubtitle = item.getSubTitle();
        int typeOfItem = item.getType();
        switch (typeOfItem) {
            case 0:
                holder.circularButton.setBackgroundTintList(ColorStateList.valueOf(colors[0])); // White
                break;
            case 1:
                holder.circularButton.setBackgroundTintList(ColorStateList.valueOf(colors[1])); // Light Gray
                break;
            case 2:
                holder.circularButton.setBackgroundTintList(ColorStateList.valueOf(colors[2])); // Silver
                break;
            case 3:
                holder.circularButton.setBackgroundTintList(ColorStateList.valueOf(colors[3])); // Gray
                break;
            case 4:
                holder.circularButton.setBackgroundTintList(ColorStateList.valueOf(colors[4])); // Dark Gray
                break;
            case 5:
                holder.circularButton.setBackgroundTintList(ColorStateList.valueOf(colors[5])); // Black
                break;
            default:
                holder.circularButton.setBackgroundTintList(ColorStateList.valueOf(colors[0])); // Default to White
                break;
        }





        holder.circularButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (typeOfItem){
                    case 0:


                            if(prefs.getPremium()==1||prefs.getHasSeenAd()){
                                Intent intento = new Intent(context,Vocabulary2023.class);
                                intento.putExtra("type0FromLessonPlan",true);
                                intento.putExtra("class",new String[]{currentSubtitle});
                                context.startActivity(intento);
                            }else if(!prefs.getHasSeenAd()&&prefs.getPremium()==0){
                                  dialogueContainer("Ver anuncio para desbloquear","ver anuncio","CIPM premium",currentSubtitle,typeOfItem);

                            }
                        break;
                    case 1:

                        if(!prefs.getHasSeenAd()&&prefs.getPremium()==0){
                            dialogueContainer("Ver anuncio para desbloquear nivel","ver anuncio","CIPM premium",currentSubtitle,typeOfItem);

                        }else if(prefs.getPremium()==1||prefs.getHasSeenAd()){
                            Intent intent = new Intent(context,Estructura2023.class);
                            intent.putExtra("typeFromLessonPlan",true);
                            intent.putExtra("class",new String[]{currentSubtitle});
                            context.startActivity(intent);
                        }else {
                            Intent intent = new Intent(context,Estructura2023.class);
                            intent.putExtra("typeFromLessonPlan",true);
                            intent.putExtra("class",new String[]{currentSubtitle});
                            context.startActivity(intent);
                        }


                        break;

                    case 2:
                        if(!prefs.getHasSeenAd()&&prefs.getPremium()==0){
                            dialogueContainer("No pierdas tu tiempo en anuncios mi querido alumno versión premium 59.99mx al mex","ver anuncio","CIPM premium",currentSubtitle,typeOfItem);

                        }else if(prefs.getPremium()==1||prefs.getHasSeenAd()){
                            Intent intent = new Intent(context,SpaInt2023.class);
                            intent.putExtra("typeFromLessonPlan",true);
                            intent.putExtra("class",new String[]{currentSubtitle});

                            context.startActivity(intent);
                        }else {
                            Intent intent = new Intent(context,SpaInt2023.class);
                            intent.putExtra("typeFromLessonPlan",true);
                            intent.putExtra("class",new String[]{currentSubtitle});
                            context.startActivity(intent);
                        }


                        break;

                    case 3:
                        if(!prefs.getHasSeenAd()&&prefs.getPremium()==0){
                            dialogueContainer("59.99mx al mes y no tendrás que ver mas anuncios","ver anuncio","CIPM premium",currentSubtitle,typeOfItem);

                        }else {
                            Intent intento2 = new Intent(context,Transicion2023.class);
                            intento2.putExtra("typeFromLessonPlan",true);
                            intento2.putExtra("class",new String[]{currentSubtitle});
                            context.startActivity(intento2);
                        }


                        break;

                    case 4:
                        if(!prefs.getHasSeenAd()&&prefs.getPremium()==0){
                            dialogueContainer("Ve un corto anuncio para desbloquear clase? o hacerme premium por 59.99mx al mes","ver anuncio","CIPM premium",currentSubtitle,typeOfItem);

                        }else {
                            Intent intento2 = new Intent(context,Availability2023.class);
                            intento2.putExtra("typeFromLessonPlan",true);
                            intento2.putExtra("class",new String[]{currentSubtitle});
                            context.startActivity(intento2);
                        }

                        break;
                    case 5:
                        if(!prefs.getHasSeenAd()&&prefs.getPremium()==0){
                            dialogueContainer("Ve un corto anuncio para desbloquear clase","ver anuncio","CIPM premium",currentSubtitle,typeOfItem);

                        }else {
                            Intent intento2 = new Intent(context,Cultura2023.class);
                            intento2.putExtra("typeFromLessonPlan",true);
                            intento2.putExtra("class",new String[]{currentSubtitle});
                            context.startActivity(intento2);
                        }

                        break;
                    case 6:
                        if(!prefs.getHasSeenAd()&&prefs.getPremium()==0){
                            dialogueContainer("Ve un corto anuncio para desbloquear clase","ver anuncio","CIPM premium",currentSubtitle,typeOfItem);

                        }else {
                            Intent intento2 = new Intent(context,ConInt2023.class);
                            intento2.putExtra("typeFromLessonPlan",true);
                            intento2.putExtra("class",new String[]{currentSubtitle});
                            context.startActivity(intento2);
                        }

                        break;
                    default:


                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return lessonPlanItemList.size();
    }

    public static class LessonPlanViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTextView, subTitleTextView, descriptionTextView, completedTextView;
        public TextView circularButton;
        public LinearLayout containet_card;

        public LessonPlanViewHolder(View itemView) {
            super(itemView);

            containet_card = itemView.findViewById(R.id.containet_card);
            titleTextView = itemView.findViewById(R.id.titleTxt);
            subTitleTextView = itemView.findViewById(R.id.subTitleTxt);
            descriptionTextView = itemView.findViewById(R.id.descriptionTxt);
            circularButton = itemView.findViewById(R.id.buttonLesson1);
            completedTextView = itemView.findViewById(R.id.completedTxt);
        }
    }

    private RewardedAd mRewardedAd;
    //ca-app-pub-3940256099942544/5224354917 test ad
    //ca-app-pub-9126282069959189/2792718018 real ad
    private void loadRewardedAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load(context, "ca-app-pub-9126282069959189/2792718018", adRequest,
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

    // Call this method when the button is clicked.
    public void showRewardedAd(String currentSubtitle,int type) {
        if (mRewardedAd != null) {
            mRewardedAd.show((Activity) context, rewardItem -> {
                // Handle the reward.

                switch (type){
                    case 0:
                        Toast.makeText(context,"Thanks! :) ",Toast.LENGTH_SHORT).show();
                        Intent intent0 = new Intent(context, Vocabulary2023.class);
                        intent0.putExtra("type0FromLessonPlan",true);
                        intent0.putExtra("class",new String[]{currentSubtitle});
                        context.startActivity(intent0); // Corrected way to start an activity from non-Activity context

                        break;

                    case 1:
                        Toast.makeText(context,"Thanks! :) ",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, Estructura2023.class);
                        intent.putExtra("typeFromLessonPlan",true);
                        intent.putExtra("class",new String[]{currentSubtitle});
                        context.startActivity(intent); // Corrected way to start an activity from non-Activity context

                        break;

                    case 2:
                        Toast.makeText(context,"Thanks! :) ",Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(context, SpaInt2023.class);
                        intent2.putExtra("typeFromLessonPlan",true);
                        intent2.putExtra("class",new String[]{currentSubtitle});
                        context.startActivity(intent2); // Corrected way to start an activity from non-Activity context

                        break;

                    case 3:
                        Toast.makeText(context,"Thanks! :) ",Toast.LENGTH_SHORT).show();
                        Intent intent3 = new Intent(context, Transicion2023.class);
                        intent3.putExtra("typeFromLessonPlan",true);
                        intent3.putExtra("class",new String[]{currentSubtitle});
                        context.startActivity(intent3); // Corrected way to start an activity from non-Activity context

                        break;

                    case 4:
                        Toast.makeText(context,"Thanks! :) ",Toast.LENGTH_SHORT).show();
                        Intent intent4 = new Intent(context, Availability2023.class);
                        intent4.putExtra("typeFromLessonPlan",true);
                        intent4.putExtra("class",new String[]{currentSubtitle});
                        context.startActivity(intent4); // Corrected way to start an activity from non-Activity context

                        break;

                    case 5:
                        Toast.makeText(context,"Thanks! :) ",Toast.LENGTH_SHORT).show();
                        Intent intent5 = new Intent(context, Cultura2023.class);
                        intent5.putExtra("typeFromLessonPlan",true);
                        intent5.putExtra("class",new String[]{currentSubtitle});
                        context.startActivity(intent5); // Corrected way to start an activity from non-Activity context

                        break;

                    case 6:
                        Toast.makeText(context,"Thanks! :) ",Toast.LENGTH_SHORT).show();
                        Intent intent6 = new Intent(context, ConInt2023.class);
                        intent6.putExtra("typeFromLessonPlan",true);
                        intent6.putExtra("class",new String[]{currentSubtitle});
                        context.startActivity(intent6); // Corrected way to start an activity from non-Activity context

                        break;
                }

            });

        } else {
            Log.d("TAG", "The rewarded ad wasn't ready yet.");
            prefs.setHasSeenAd(true);

            Toast.makeText(context, "Quieres la versión sin interrupciones?", Toast.LENGTH_SHORT).show();
            Intent intento = new Intent(context, Premium2023.class);
            context.startActivity(intento);
        }
    }
    public void  dialogueContainer(String text, String buttonyes, String buttonno,String subtitle,int type){
        AlertDialog.Builder builder = new AlertDialog.Builder((Activity) context);
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();

        View dialogView = inflater.inflate(R.layout.dialogebox, null); // Replace with your layout file name
        builder.setView(dialogView);

        TextView textView = dialogView.findViewById(R.id.textodialogo);

        textView.setText(Html.fromHtml(text));
        textView.setTextSize(18); // Set the text size to 18sp
        textView.setTypeface(null, Typeface.BOLD);
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
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showRewardedAd(subtitle,type);


            }
        });

        Button button2 = dialogView.findViewById(R.id.botondialogo2);

        GradientDrawable drawable2 = new GradientDrawable();
        drawable2.setShape(GradientDrawable.RECTANGLE); // Set the shape to rectangle
        drawable2.setCornerRadii(new float[]{16, 16, 16, 16, 16, 16, 16, 16}); // Set corner radii (adjust the values as needed)
        drawable2.setColor(Color.YELLOW); // Set the background color
        button2.setText(buttonno);
        button2.setTextColor(Color.BLACK);
        button2.setBackground(drawable2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.setHasSeenAd(true);
                Intent intento = new Intent(context, Premium2023.class);
                context.startActivity(intento);


            }
        });
        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialogInterface) {
                // Code to execute when the dialog is cancelled (e.g., user clicks outside the dialog)
                prefs.setHasSeenAd(false);

            }
        });

        dialog.show();

    }

}
