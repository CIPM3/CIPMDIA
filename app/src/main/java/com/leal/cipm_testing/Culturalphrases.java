package com.leal.cipm_testing;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Culturalphrases extends AppCompatActivity {
    ListView lv ;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culturalphrases);
        lv= findViewById(R.id.listviewculture);
        String []est = {   "Come rain or shine",
                "the calm before the storm",
                "burn bridges",
                "bolt from the blue",
                "as right as rain",
                "an ounce of prevention is worth a pound of cure",
                "an apple a day keeps the doctor away",
                "a storm in a teacup",
                "a stitch in time saves nine",
                "a snowball's chance in hell",
                "a snowball effect",
                "a little learning is a dangerous thing",//corregidos
                "Curiosity killed the cat",
                "Cut the mustard",
                "Don't beat a dead horse",
                "Every dog has his day",
                "Familiarity breeds contempt",
                "Fit as a fiddle",
                "Get a second wind",
                "Get wind of something",
                "Go down in flames",
                "Haste makes waste",
                "Have your head in the clouds",
                "Hear something straight from the horse's mouth",
                "He's off his rocker",
                "He's sitting on the fence",
                "It is always darkest before the dawn",
                "It takes two to tango",
                "Jump on the bandwagon",
                "Know which way the wind is blowing",
                "Leave no stone unturned",
                "Let sleeping dogs lie",
                "Like riding a bicycle",
                "Like two peas in a pod",
                "Make hay while the sun shines",
                "On cloud nine",
                "Once bitten twice shy",
                "Out of the frying pan and into the fire",
                "Run like the wind",
                "Shape up or ship out",
                "Snowed under",
                "That ship has sailed",
                "The pot calling the kettle black",
                "There are clouds on the horizon",
                "Through thick and thin",
                "Time is money",
                "Waste not want not",
                "We see eye to eye",
                "Weather the storm",
                "Well begun is half done",
                "When it rains it pours",
                "You can catch more flies with honey than you can with vinegar",
                "You can lead a horse to water but you can't make him drink",
                "You can't make an omelet without breaking some eggs",

                //LR
                "A penny for your thoughts",
                "A penny saved is a penny earned",
                "A perfect storm",
                "Actions speak louder than words",
                "Add insult to injury",
                "Barking up the wrong tree",
                "Birds of a feather flock together",
                "Bite off more than you can chew",
                "Break the ice",
                "By the skin of your teeth",
                "Comparing apples to oranges",
                "Costs an arm and a leg",
                "Do something at the drop of a hat",
                "Do unto others as you would have them do unto you",
                "Don't count your chickens before they hatch",
                "Don't cry over spilt milk",
                "Don't give up your day job",
                "Don't put all your eggs in one basket",
                "Every cloud has a silver lining",
                "Give someone the cold shoulder",
                "Go on a wild goose chase",
                "Good things come to those who wait",
                "Hit the nail on the head",
                "Ignorance is bliss",
                "It takes one to know one",
                "It's a piece of cake",
                "It's raining cats and dogs",
                "Kill two birds with one stone",
                "Let the cat out of the bag",
                "Live and learn",
                "Look before you leap",
                "On thin ice",
                "Once in a blue moon",
                "Play devil's advocate",
                "Put something on ice",
                "Saving for a rainy day",
                "Slow and steady wins the race",
                "Spill the beans",
                "Take a rain check",
                "Take it with a grain of salt",
                "The ball is in your court",
                "The best thing since sliced bread",
                "The devil is in the details",
        };


        String definicionArray[]= {"definición uno", "definición dos ", "etc"};


        adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1, est);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Culturalphrases.this, adapter.getItem(i), Toast.LENGTH_SHORT).show();
                AlertDialog alertDialog = new AlertDialog.Builder(Culturalphrases.this)
//set icon
                        .setIcon(android.R.drawable.ic_dialog_alert)
//set title
                        .setTitle("Definición: ")
//set message
                        .setMessage(definicionArray[i])
//set positive button
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                //set what would happen when positive button is clicked
                               // finish();
                            }
                        })
//set negative button
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                //set what should happen when negative button is clicked
                                Toast.makeText(getApplicationContext(),"Nothing Happened",Toast.LENGTH_LONG).show();
                            }
                        })
                        .show();


            }
        });

    }

}