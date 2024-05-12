package com.leal.cipm_testing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class lessonPlan_RecyclerView extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<LessonPlanItem> lessonPlanItems;
    private LessonPlanAdapter adapter;
    Prefs prefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_plan_recycler_view);

        lessonPlanItems= new ArrayList<>();
        recyclerView=findViewById(R.id.recyclerViewLessons);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        loadLesson();
        prefs = new Prefs(this);
        adapter= new LessonPlanAdapter(this,lessonPlanItems,prefs);
        recyclerView.setAdapter(adapter);
    }
    public void loadLesson(){
        lessonPlanItems.add(new LessonPlanItem("Aprende a usar las palabras mas básicas de una oración", "Function Words", "aprende a usar las palabras mas frequentes y funcionales del inglés,relacionan ideas dentro de la oración", "Lesson 1", "Nivel Muy Basico",0));
        lessonPlanItems.add(new LessonPlanItem("Responde a la pregunta: Que pasa?", "Present Simple", "Aprende a hablar de habitos y rutinas en inglés", "Lesson 2", "Nivel Basico",1));
        lessonPlanItems.add(new LessonPlanItem("Que está pasando?", "Present Continuous", "Aprende a hablar de cosas que estan sucediendo ahora mismo", "Lesson 3", "Nivel Basico",1));
        lessonPlanItems.add(new LessonPlanItem("Que ha pasado?", "Present Perfect", "Aprende a hablar de cosas que sucedieron en pasado pero que aún tienen relevancia en el presente", "Lesson 4", "Nivel Basico",1));
        lessonPlanItems.add(new LessonPlanItem("Que ha estado pasado?", "Present Perfect Continuous", "Aprende a hablar de lo que ha estado ocurriendo", "Lesson 5", "Nivel Basico",1));

        lessonPlanItems.add(new LessonPlanItem("Que pasó?", "Past Simple", "Aprende a hablar de acciones que sucedieron y terminaron en el pasado", "Lesson 6", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que estaba pasando?", "Past Continuous", "Aprende a hablar de acciones que estaban sucediendo en un momento específico del pasado", "Lesson 7", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que había pasado", "Past Perfect", "Aprende a hablar de acciones que se completaron antes de otro evento en el pasado", "Lesson 8", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que había estado pasando", "Past Perfect Continuous", "Aprende a hablar de acciones que habían estado ocurriendo durante un periodo antes de otro evento en el pasado", "Lesson 9", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que pasará", "Future Simple", "Aprende a hablar de acciones futuras que ocurrirán en un momento específico", "Lesson 10", "Not Complted", 1));
        lessonPlanItems.add(new LessonPlanItem("Que estará pasando", "Future Continuous", "Aprende a hablar de acciones que estarán ocurriendo en un momento futuro específico", "Lesson 11", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que habrá pasado", "Future Perfect", "Aprende a hablar de acciones que se habrán completado antes de un punto específico en el futuro", "Lesson 12", "Not Complted", 1));
        lessonPlanItems.add(new LessonPlanItem("Que habrá estado pasando", "Future Perfect Continuous", "Aprende a hablar de acciones que estarán ocurriendo durante un período antes de un evento futuro específico", "Lesson 14", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que pasaría", "Would Simple", "Aprende a hablar de acciones hipotéticas en el futuro usando 'would'", "Lesson 14", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que estaría pasando", "Would Continuous", "Aprende a hablar de acciones hipotéticas continuas en el futuro usando 'would be + verb-ing'", "Lesson 15", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que habría pasado", "Would Perfect", "Aprende a hablar de acciones hipotéticas completadas en el futuro usando 'would have + past participle'", "Lesson 16", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que habría estado pasando", "Would Perfect Continuous", "Aprende a hablar de acciones hipotéticas continuas que habrían estado ocurriendo en el futuro usando 'would have been + verb-ing'", "Lesson 17", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que podría pasar", "Could Simple", "Aprende a usar 'could' para hablar de habilidades pasadas o posibilidades", "Lesson 18", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que podría estar pasando", "Could Continuous", "Aprende a usar 'could be + verb-ing' para hablar de posibles acciones continuas en el pasado", "Lesson 19", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que pudo haber pasado", "Could Perfect", "Aprende a usar 'could have + past participle' para hablar de posibilidades pasadas que no se realizaron", "Lesson 20", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que pudo haber estado pasando", "Could Perfect Continuous", "Aprende a hablar de situaciones hipotéticas continuas en el pasado usando 'could have been + verb-ing'", "Lesson 21", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que quizá suceda", "Might Simple", "Aprende a usar 'might' para hablar de posibilidades", "Lesson 22", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que quizá esté sucediendo", "Might Continuous", "Aprende a usar 'might be + verb-ing' para hablar de acciones posibles que podrían estar ocurriendo", "Lesson 23", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que quiza haya sucedido", "Might Perfect", "Aprende a usar 'might have + past participle' para hablar de posibilidades pasadas que podrían haber ocurrido", "Lesson 24", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que quiza haya estado pasando", "Might Perfect Continuous", "Aprende a usar 'might have been + verb-ing' para hablar de acciones continuas que podrían haber estado ocurriendo en el pasado", "Lesson 25", "Nivel Basico", 1));


        lessonPlanItems.add(new LessonPlanItem("Que debería pasar", "Should Simple", "Aprende a usar 'should' para dar consejos o hablar de obligaciones leves", "Lesson 26", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que debería estar pasando", "Should Continuous", "Aprende a usar 'should be + verb-ing' para hablar de acciones recomendadas que deberían estar ocurriendo ahora", "Lesson 27", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que debió haber pasado", "Should Perfect", "Aprende a usar 'should have + past participle' para hablar de acciones pasadas que deberían haber ocurrido", "Lesson 28", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que debío haber estado pasando", "Should Perfect Continuous", "Aprende a usar 'should have been + verb-ing' para hablar de acciones continuas que deberían haber estado ocurriendo en el pasado", "Lesson 29", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que puede pasar", "Can Simple", "Aprende a usar 'can' para hablar de habilidades y posibilidades presentes", "Lesson 30", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que puede estar pansando", "Can Continuous", "Aprende a usar 'can be + verb-ing' para hablar de habilidades o posibilidades continuas en el presente", "Lesson 31", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que debe pasar", "Must Simple", "Aprende a usar 'must' para expresar obligación o necesidad fuerte", "Lesson 32", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que debe estar pasando", "Must Continuous", "Aprende a usar 'must be + verb-ing' para expresar una conclusión lógica sobre una acción continua en el presente", "Lesson 33", "Nivel Basico", 1));

        lessonPlanItems.add(new LessonPlanItem("Que es hecho", "Present Simple Passive", "Aprende a usar la voz pasiva en el tiempo presente simple para enfocar en la acción más que en el sujeto", "Lesson 34", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que esta siendo hecho", "Present Continuous Passive", "Aprende a usar la voz pasiva en el tiempo presente continuo para hablar de acciones que están ocurriendo ahora y enfocar en la acción más que en el sujeto", "Lesson 35", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que ha sido hecho", "Present Perfect Passive", "Aprende a usar la voz pasiva en el tiempo presente perfecto para hablar de acciones que han sido completadas recientemente, enfocando en la acción más que en el sujeto", "Lesson 36", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que fue hecho", "Past Simple Passive", "Aprende a usar la voz pasiva en el tiempo pasado simple para enfocar en la acción que ocurrió en el pasado más que en el sujeto", "Lesson 37", "Nivel Basico", 1));


        lessonPlanItems.add(new LessonPlanItem("Que estaba siendo hecho", "Past Continuous Passive", "Aprende a usar la voz pasiva en el tiempo pasado continuo para hablar de acciones que estaban ocurriendo en un momento específico en el pasado, enfocando en la acción más que en el sujeto", "Lesson 38", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que había sido hecho", "Past Perfect Passive", "Aprende a usar la voz pasiva en el tiempo pasado perfecto para hablar de acciones que habían sido completadas antes de otro evento en el pasado, enfocando en la acción más que en el sujeto", "Lesson 39", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que será hecho", "Future Simple Passive", "Aprende a usar la voz pasiva en el tiempo futuro simple para hablar de acciones que ocurrirán en el futuro, enfocando en la acción más que en el sujeto", "Lesson 40", "Nivel Basico", 1));
        lessonPlanItems.add(new LessonPlanItem("Que sería hecho", "Would Simple Passive", "Aprende a usar la voz pasiva con 'would' para hablar de acciones hipotéticas en el futuro, enfocando en la acción más que en el sujeto", "Lesson 41", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Para que alguien haga algo", "For Object To", "Explora la estructura 'for + objeto + to' para hablar de intenciones o necesidades en relación con otras personas o cosas", "Lesson 42", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Que estas acostumbrado a hacer", "Be Used To", "Aprende a expresar acostumbramiento a algo en el pasado o presente usando 'be used to'", "Lesson 43", "Nivel Intermedio", 1));

        lessonPlanItems.add(new LessonPlanItem("Que pasaba/solía pasar", "Used To", "Aprende a hablar de hábitos o estados pasados que ya no son actuales usando 'used to'", "Lesson 44", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Que hay", "There Be", "Aprende a usar la expresión 'there is/are' para indicar la existencia de algo", "Lesson 45", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Que se tiene que hacer", "Have To", "Aprende a expresar necesidad o obligación en el presente o futuro usando 'have to'", "Lesson 46", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Que se va a hacer", "Going To", "Aprende a usar 'going to' para hablar de intenciones o planes futuros inmediatos", "Lesson 47", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Que se iba a hacer", "Going To Past", "Aprende a usar 'going to' en contexto pasado para hablar de planes o intenciones que se tenían en el pasado", "Lesson 48", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Que tienes ganas de hacer", "Feel like", "Aprende a expresar deseos o inclinaciones en el momento presente usando 'feel like'", "Lesson 49", "Nivel Intermedio", 1));

        lessonPlanItems.add(new LessonPlanItem("Que se supone que pasará", "Supposed To", "Aprende a usar 'supposed to' para hablar de expectativas o normas sociales en el presente", "Lesson 50", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Que se supone que iba a pasar", "Supposed To Past", "Aprende a usar 'supposed to' para hablar de expectativas o normas sociales que existían en el pasado", "Lesson 51", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Hacerse-volverse-ponerse", "Get Structures", "Explora diferentes estructuras con el verbo 'get', como 'get used to', 'get through', etc.", "Lesson 52", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Alguien le hace algo a alguien", "P-V-PP", "Aprende sobre la estructura de los verbos frasales que utilizan un verbo principal seguido de una preposición y un participio pasado", "Lesson 53", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Alguien se hace algo a si mismo", "Reflexive Structure", "Aprende a usar estructuras reflexivas para indicar que el sujeto y el objeto de la acción son el mismo", "Lesson 54", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Alguien causa que alguien haga algo", "Causative Have", "Aprende a usar la estructura 'have something done' para hablar de acciones que alguien más realiza para el sujeto", "Lesson 55", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Verbo como objeto-sujeto", "Verbos Juntos", "Explora cómo usar dos verbos juntos en una frase, como en 'want to do', 'need to do', etc.", "Lesson 56", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Sustantivos como adjetivos", "Noun Adjectives", "Estudia cómo algunos sustantivos pueden funcionar como adjetivos para describir otros sustantivos", "Lesson 57", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Verbos como adjetivos", "Verbal Adjectives", "Aprende a usar adjetivos derivados de verbos para describir características relacionadas con la acción del verbo", "Lesson 58", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Ojalá pasara algo que no pasa", "Wish Past", "Aprende a usar 'wish' seguido de un verbo en pasado simple para expresar deseos de que la situación actual fuera diferente", "Lesson 59", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Ojalá pase algo en un futuro ", "Wish Would", "Aprende a usar 'wish' seguido de 'would' para expresar deseos sobre acciones o comportamientos de otras personas que te gustaría que cambiaran", "Lesson 60", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Ojalá algo hubiera pasado ", "Wish Past Perfect", "Aprende a usar 'wish' seguido de un verbo en pasado perfecto para expresar remordimientos o deseos sobre situaciones pasadas que ya no se pueden cambiar", "Lesson 61", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Que es mas o menos que algo", "Comparativos", "Aprende a formar y usar comparativos para hablar sobre diferencias entre personas, lugares o cosas", "Lesson 62", "Nivel Intermedio", 1));

        lessonPlanItems.add(new LessonPlanItem("Estructura de pregunta", "Question Structures", "Estudia las diferentes estructuras que se pueden usar para formar preguntas en inglés, abarcando desde preguntas básicas hasta más complejas", "Lesson 63", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Verbos frasales", "Phrasal Verbs", "Explora y aprende a usar verbos frasales, que son combinaciones de verbos con preposiciones o adverbios que cambian el significado del verbo original", "Lesson 64", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Lo que alguien dijo", "Reported Speech", "Aprende a usar el estilo indirecto para relatar lo que alguien dijo sin citarlo textualmente, ajustando los tiempos verbales y otros elementos del discurso", "Lesson 65", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Que eres capáz de hacer", "Be Able To", "Explora cómo y cuándo usar 'able to' en diferentes tiempos verbales para hablar de habilidades", "Lesson 66", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Entre mas algo, mas otra cosa", "Incremento Paralelo", "Aprende sobre estructuras que permiten expresar acciones que suceden simultáneamente aumentando en intensidad o cantidad", "Lesson 67", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Clausulas De Adjetivo", "Relative Clauses", "Estudia las cláusulas relativas, que son frases que añaden información sobre sustantivos, distinguiendo entre cláusulas definitorias y no definitorias", "Lesson 68", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Verbos Compuestos", "Just Phrasal Verbs", "Aprende a usar verbos frasales con 'just' para expresar acciones que se realizaron hace poco tiempo o que son simples en su ejecución", "Lesson 69", "Nivel Intermedio", 1));
        lessonPlanItems.add(new LessonPlanItem("Sujeto quiere que el objeto haga algo", "Want To", "Aprende a usar 'want to' para expresar deseos o intenciones", "Lesson 70", "Nivel Intermedio", 1));

        //interferencias
        lessonPlanItems.add(new LessonPlanItem("Interferencia de español", "Por Sujeto", "En español cuando omitimos el sujeto", "Lesson 71", "Nivel Avanzado", 2));
        lessonPlanItems.add(new LessonPlanItem("Interferencia de español", "Por Preposición", "Cuand empezamos la oración con preposición", "Lesson 72", "Nivel Avanzado", 2));
        lessonPlanItems.add(new LessonPlanItem("Interferencia de español", "Por Objeto", "Cuando el objeto y el sujeto no son claros", "Lesson 73", "Nivel Avanzado", 2));
        lessonPlanItems.add(new LessonPlanItem("Interferencia de español", "Interferencia Reflexiva", "Cuando No es claro que estructura del inglés usar con reflexivas", "Lesson 74", "Nivel Avanzado", 2));
        lessonPlanItems.add(new LessonPlanItem("Interferencia de español", "Interferencia Pasiva", "Oraciones en español sin sujeto", "Lesson 75", "Nivel Avanzado", 2));
        //conectores
        lessonPlanItems.add(new LessonPlanItem("Palabras de Que conectan oraciones", "Random", "Palabras que Contrastan,comparan,niegan,dan información adicional de ideas etc.", "Lesson 76", "Nivel Avanzado", 3));

        //pragers
        lessonPlanItems.add(new LessonPlanItem("Aumenta Disponibilidad Del Inglés en Consciencia", "Black Fathers", "Lee, da click en palabras que no conozcas, haz examen de comprensión", "Lesson 77", "Nivel Avanzado", 4));
        lessonPlanItems.add(new LessonPlanItem("Aprende Frases Culturales En sutaciones reales", "Moonlight", "Aprende la frase, asociala a significado y encuentrala en el video", "Lesson 78", "Nivel Avanzado", 5));
        lessonPlanItems.add(new LessonPlanItem("Trabaja tu listening y descubre fallas estructurales en tu inglés", "Steve Jobs 1", "Escucha el audio,escribe lo que entendiste, checa tu respuesta", "Lesson 79", "Nivel Avanzado", 6));

        lessonPlanItems.add(new LessonPlanItem("Aumenta Disponibilidad Del Inglés en Consciencia", "Is America Racist?", "Lee, da click en palabras que no conozcas, haz examen de comprensión", "Lesson 80", "Nivel Avanzado", 4));
        lessonPlanItems.add(new LessonPlanItem("Aprende Frases Culturales En sutaciones reales", "Rick and Morty", "Aprende la frase, asociala a significado y encuentrala en el video", "Lesson 81", "Nivel Avanzado", 5));
        lessonPlanItems.add(new LessonPlanItem("Trabaja tu listening y descubre fallas estructurales en tu inglés", "Kot Fishing 1", "Escucha el audio,escribe lo que entendiste, checa tu respuesta", "Lesson 82", "Nivel Avanzado", 6));


        lessonPlanItems.add(new LessonPlanItem("Aumenta Disponibilidad Del Inglés en Consciencia", "Don't Compare Yourself to Others", "Lee, da click en palabras que no conozcas, haz examen de comprensión", "Lesson 83", "Nivel Avanzado", 4));
        lessonPlanItems.add(new LessonPlanItem("Aprende Frases Culturales En sutaciones reales", "Do You Want Pepsi", "Aprende la frase, asociala a significado y encuentrala en el video", "Lesson 84", "Nivel Avanzado", 5));
        lessonPlanItems.add(new LessonPlanItem("Trabaja tu listening y descubre fallas estructurales en tu inglés", "Kot Fishing 2", "Escucha el audio,escribe lo que entendiste, checa tu respuesta", "Lesson 85", "Nivel Avanzado", 6));


        lessonPlanItems.add(new LessonPlanItem("Aumenta Disponibilidad Del Inglés en Consciencia", "Fix Yourself", "Lee, da click en palabras que no conozcas, haz examen de comprensión", "Lesson 86", "Nivel Avanzado", 4));
        lessonPlanItems.add(new LessonPlanItem("Aprende Frases Culturales En sutaciones reales", "Sangre Por Sangre Foodline", "Aprende la frase, asociala a significado y encuentrala en el video", "Lesson 87", "Nivel Avanzado", 5));
        lessonPlanItems.add(new LessonPlanItem("Trabaja tu listening y descubre fallas estructurales en tu inglés", "Helicoptero 1", "Escucha el audio,escribe lo que entendiste, checa tu respuesta", "Lesson 88", "Nivel Avanzado", 6));

        lessonPlanItems.add(new LessonPlanItem("Aumenta Disponibilidad Del Inglés en Consciencia", "Are Men and Women Different?", "Lee, da click en palabras que no conozcas, haz examen de comprensión", "Lesson 89", "Nivel Avanzado", 4));
        lessonPlanItems.add(new LessonPlanItem("Aprende Frases Culturales En sutaciones reales", "Sangre Por Sangre Watch El Paisaje", "Aprende la frase, asociala a significado y encuentrala en el video", "Lesson 90", "Nivel Avanzado", 5));
        lessonPlanItems.add(new LessonPlanItem("Trabaja tu listening y descubre fallas estructurales en tu inglés", "Helicoptero 2", "Escucha el audio,escribe lo que entendiste, checa tu respuesta", "Lesson 91", "Nivel Avanzado", 6));


        lessonPlanItems.add(new LessonPlanItem("Aumenta Disponibilidad Del Inglés en Consciencia", "Don't Waste Your Time", "Lee, da click en palabras que no conozcas, haz examen de comprensión", "Lesson 92", "Nivel Avanzado", 4));
        lessonPlanItems.add(new LessonPlanItem("Aprende Frases Culturales En sutaciones reales", "Training Day Rabbit Has The Gun", "Aprende la frase, asociala a significado y encuentrala en el video", "Lesson 93", "Nivel Avanzado", 5));

        lessonPlanItems.add(new LessonPlanItem("Aumenta Disponibilidad Del Inglés en Consciencia", "How to Make Our Cities Safer", "Lee, da click en palabras que no conozcas, haz examen de comprensión", "Lesson 94", "Nivel Avanzado", 4));
        lessonPlanItems.add(new LessonPlanItem("Aprende Frases Culturales En sutaciones reales", "Hancock Train", "Aprende la frase, asociala a significado y encuentrala en el video", "Lesson 95", "Nivel Avanzado", 5));

        lessonPlanItems.add(new LessonPlanItem("Aumenta Disponibilidad Del Inglés en Consciencia", "How to End Systemic Racism", "Lee, da click en palabras que no conozcas, haz examen de comprensión", "Lesson 96", "Nivel Avanzado", 4));
        lessonPlanItems.add(new LessonPlanItem("Aprende Frases Culturales En sutaciones reales", "Malcom in the Middle Teacher", "Aprende la frase, asociala a significado y encuentrala en el video", "Lesson 97", "Nivel Avanzado", 5));

        lessonPlanItems.add(new LessonPlanItem("Aumenta Disponibilidad Del Inglés en Consciencia", "Should Government Bail Out Big Banks?", "Lee, da click en palabras que no conozcas, haz examen de comprensión", "Lesson 98", "Nivel Avanzado", 4));
        lessonPlanItems.add(new LessonPlanItem("Aprende Frases Culturales En sutaciones reales", "Sangre Por Sangre Comedor", "Aprende la frase, asociala a significado y encuentrala en el video", "Lesson 99", "Nivel Avanzado", 5));
        lessonPlanItems.add(new LessonPlanItem("Aprende Frases Culturales En sutaciones reales", "Dave Chapelle Man Rape", "Aprende la frase, asociala a significado y encuentrala en el video", "Lesson 100", "Nivel Avanzado", 5));
        lessonPlanItems.add(new LessonPlanItem("Aprende Frases Culturales En sutaciones reales", "Análisis de cultura Gringa y Frases Coloquiales 2", "Aprende la frase, asociala a significado y encuentrala en el video", "Lesson 101", "Nivel Avanzado", 5));
        lessonPlanItems.add(new LessonPlanItem("Aprende Frases Culturales En sutaciones reales", "Boys in the Hood", "Aprende la frase, asociala a significado y encuentrala en el video", "Lesson 102", "Nivel Avanzado", 5));
        lessonPlanItems.add(new LessonPlanItem("Aprende Frases Culturales En sutaciones reales", "Cultura y Fonética", "Aprende la frase, asociala a significado y encuentrala en el video", "Lesson 103", "Nivel Avanzado", 5));
        lessonPlanItems.add(new LessonPlanItem("Aprende Frases Culturales En sutaciones reales", "Kings of the Hills Drugs", "Aprende la frase, asociala a significado y encuentrala en el video", "Lesson 104", "Nivel Avanzado", 5));





    }


}