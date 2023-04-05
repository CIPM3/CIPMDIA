package com.leal.cipm_testing;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
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
        String []est = {
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

                "A little learning is a dangerous thing",
                "A snowball effect",
                "A snowball's chance in hell",
                "A stitch in time saves nine",
                "A storm in a teacup",
                "An apple a day keeps the doctor away",
                "An ounce of prevention is worth a pound of cure",
                "As right as rain",
                "Bolt from the blue",
                "Burn bridges",
                "Calm before the storm",
                "Come rain or shine",
                "Curiosity killed the cat",
                "Cut the mustard",
                "Don't beat a dead horse",
                "Every dog has his day",
                "Familiarity breeds contempt",
                "Fit as a fiddle",
                "Fortune favours the bold",
                "Get a second wind",
                "Get wind of something",
                "Go down in flames",
                "Haste makes waste",
                "Have your head in the clouds",
                "He who laughs last laughs loudest",
                "Hear something straight from the horse's mouth",
                "He's not playing with a full deck",
                "He's off his rocker",
                "He's sitting on the fence",
                "It is a poor workman who blames his tools",
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
                "Once bitten, twice shy",
                "Out of the frying pan and into the fire",
                "Run like the wind",
                "Shape up or ship out",
                "Snowed under",
                "That ship has sailed",
                "The pot calling the kettle black",
                "There are clouds on the horizon",
                "Those who live in glass houses shouldn't throw stones",
                "Through thick and thin",
                "Time is money",
                "Waste not, want not",
                "We see eye to eye",
                "Weather the storm",
                "Well begun is half done",
                "When it rains it pours",
                "You can catch more flies with honey than you can with vinegar",
                "You can lead a horse to water, but you can't make him drink",
                "You can't make an omelet without breaking some eggs",
        };


        String definicionArray[]= {
                "Un centavo por tus pensamientos",
                "Un centavo guardado es un centavo ganado",
                "Una tormenta perfecta",
                "Las acciones hablan más que las palabras",
                "Añadir sal a la herida",
                "Ladrando al árbol equivocado",
                "Dios los cría y ellos se juntan",
                "Muerde más de lo que puedes masticar",
                "Romper el hielo",
                "Por la piel de sus dientes",
                "Comparando manzanas con naranjas",
                "Cuesta un brazo y una pierna",
                "Haz algo en un abrir y cerrar de ojos",
                "Haz a los demás lo que te gustaría que te hicieran a ti",
                "No cuentes tus pollos antes de que nazcan",
                "No llores por la leche derramada",
                "No renuncies a tu trabajo diario",
                "No pongas todos tus huevos en una canasta",
                "No hay mal que por bien no venga",
                "Dale a alguien la frialdad",
                "Ir a una persecución de ganso salvaje",
                "Las cosas buenas vienen a aquellos que esperan",
                "Darle al clavo en la cabeza",
                "La ignorancia es grata",
                "Que toma uno para conocer uno",
                "Es un trozo de tarta",
                "Lueve a cántaros",
                "Dos pájaros de un tiro",
                "Dejar que el gato fuera de la bolsa",
                "Vive y aprende",
                "Mira antes de saltar",
                "En hielo delgado",
                "Una vez en una luna azul",
                "Juega al abogado del diablo",
                "Poner algo en hielo",
                "Ahorrando para un día lluvioso",
                "Lento y constante gana la carrera",
                "Descubrir el pastel",
                "Toma un cheque de lluvia",
                "Tómelo con un grano de sal",
                "La pelota está en tu tejado",
                "Lo mejor desde el pan en rebanadas",
                "El diablo está en los detalles",

                "Un poco de aprendizaje es una cosa peligrosa",
                "Un efecto bola de nieve",
                "La oportunidad de una bola de nieve en el infierno",
                "Una puntada a tiempo ahorra nueve",
                "Una tormenta en una taza de té",
                "Una manzana al día mantiene alejado al médico",
                "Una onza de prevención vale una libra de cura",
                "Tan derecha como la lluvia",
                "Rayo caído del cielo",
                "Quemar puentes",
                "Tranquila antes de la tormenta",
                "Llueva o haga sol",
                "La curiosidad mató al gato",
                "Cortar la mostaza",
                "No golpees a un caballo muerto",
                "A cada cerdo le llega su San Martín",
                "La familiaridad engendra desprecio",
                "En buen estado físico",
                "La fortuna favorece al audaz",
                "Obtener un segundo aire",
                "Obtener viento de algo",
                "Bajar en llamas",
                "La prisa hace desperdicio",
                "Ten tu cabeza en las nubes",
                "El que ríe último ríe más fuerte",
                "Escuche algo directamente de la boca del caballo.",
                "No está jugando con un mazo completo.",
                "Él está fuera de sí",
                "Él está sentado en la cerca",
                "Es un pobre obrero el que culpa a sus herramientas",
                "Siempre es más oscuro antes del amanecer",
                "Se necesitan dos para bailar un tango",
                "Seguir la corriente",
                "Saber en qué dirección sopla el viento",
                "No dejes piedra sin remover",
                "Deja que los perros durmientes mientan",
                "Como andar en bicicleta",
                "Como dos guisantes en una vaina",
                "Hacer heno mientras brilla el sol",
                "En la novena nube",
                "Una vez mordida, dos veces tímida",
                "Fuera de la sartén y en el fuego",
                "Corre como el viento",
                "Ponerse en forma o embarcarse",
                "Nevada bajo",
                "Ese barco ha zarpado",
                "La paja en el caldero negro",
                "Hay nubes en el horizonte",
                "Los que viven en casas de cristal no deberían tirar piedras",
                "Superando cualquier dificultad",
                "El tiempo es dinero",
                "No desperdicies, no quieras",
                "Nosotras vemos ojo a ojo",
                "Clima de tormenta",
                "Buen comienzo, la mitad está hecha",
                "Cuando llueve diluvia",
                "Puedes atrapar más moscas con miel que con vinagre",
                "Puedes llevar un caballo al agua, pero no puedes obligarlo a beber",
                "No se puede hacer una tortilla sin romper unos huevos",
        };


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

    public void main(View vista) {
        Intent intento = new Intent(this, MainActivity.class);
        startActivity(intento);
    }
    public void chat_maestro(View vista) {
        Intent intento = new Intent(this, chat_maestro.class);
        startActivity(intento);
    }
    public void profile(View vista) {
        Intent intento = new Intent(this, profile.class);
        startActivity(intento);
    }
}