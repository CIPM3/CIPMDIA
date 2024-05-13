package com.leal.cipm_testing;

import java.util.Random;

public class NewNounClass {

    // Phrasal Verbs in English
    String[] justEnglishPhrasalVerbs = {
            "break down", "bring up", "call off", "carry out", "come across",
            "come up with", "cut off", "do away with", "fall apart", "get along with",
            "get away with", "get over", "give in", "give up", "go after",
            "go ahead", "go off", "hold on", "keep on", "look after",
            "look for", "make up", "pick up", "put off", "put up with",
            "run into", "run out of", "set up", "take after", "take off",
            "take on", "take out", "take up", "turn down", "turn up",
            "turn on", "try on", "turn out", "wake up", "wear out",
            "work out", "work on", "bring about", "come out", "give back",
            "get around", "go through", "put on", "run away", "show off"
    };

    // Phrasal Verbs in Spanish
    String[] justSpanishPhrasalVerbs = {
            "descomponer(se)", "mencionar", "cancelar", "llevar a cabo", "encontrarse con",
            "idear", "cortar", "eliminar", "desmoronarse", "llevarse bien con",
            "salirse con la suya", "superar", "ceder", "renunciar", "perseguir",
            "seguir adelante", "sonar (alarma)", "esperar", "seguir adelante", "cuidar de",
            "buscar", "inventar", "recoger", "posponer", "soportar",
            "encontrarse con", "quedarse sin", "establecer", "parecerse a", "despegar",
            "asumir", "sacar", "empezar a hacer", "rechazar", "aparecer",
            "encender", "probarse", "resultar", "despertar", "desgastar",
            "resolver", "trabajar en", "provocar", "salir", "devolver",
            "moverse", "pasar por", "ponerse", "huir", "presumir"
    };

    String[] nouns = {
            "time ", "year ", "people ", "way ", "day ", "man ",
            "thing ", "woman ", "life ", "child ",
            "world ", "school ", "state ", "family ", "house ",
            "president ", "group ", "country ", "problem ", "student ",
            "hand ", "part ", "place ", "city ", "case ", "system ",
            "week ", "company ", "percent ", "question ",
            "program ", "work ", "number ", "government ", "night ",
            "point ", "war ", "home ", "room ", "fact ",
            "area ", "money ", "right ", "story ", "water ", "mother ",
            "month ", "lot ", "book ", "eye ",
            "study ", "job ", "kind ", "word ", "issue ", "side ",
            "business ", "head ", "service ", "friend ",
            "power ", "father ", "hour ", "line ", "end ", "game ",
            "member ", "law ", "car ", "name ",
            "center ", "university ", "information ", "community ",
            "idea ", "body ", "kid ", "minute ", "table ", "team ",
            "back ", "face ", "parent ", "office ", "level ", "person ",
            "door ", "street ", "history ", "party ",
            "reason ", "morning ", "change ", "news ", "health ",
            "court ", "force ", "air ", "art ", "result ",
            "moment ", "research ", "girl ", "boy ", "food ", "guy ",
            "process ", "policy ", "education ", "fee ",
            "sense ", "teacher ", "market ", "nation ", "death ",
            "plan ", "interest ", "experience ", "effect ", "use ",
            "control ", "class ", "photo ", "field ", "college ",
            "development ", "security ", "effort ", "role ", "rate ",
            "music ", "leader ", "light ", "voice ", "color ",
            "heart ", "care ", "police ", "wife ", "show ",
            "mind ", "report ", "drug ", "decision ", "view ",
            "son ", "arm ", "department ", "price "
    };
    String[] nounsSpanish = {
            "el tiempo ", "el año ", "la gente ", "el camino ",
            "el día ", "el hombre ", "la cosa ", "la mujer ",
            "la vida ", "el niño ",
            "el mundo ", "la escuela ", "el estado ", "la familia ",
            "la casa ", "el presidente ", "el grupo ", "el país ",
            "el problema ", "el estudiante ",
            "la mano ", "la parte ", "el lugar ", "la ciudad ",
            "el caso ", "el sistema ", "la semana ", "la empresa ",
            "el porcentaje ", "la pregunta ",
            "el programa ", "el trabajo ", "el número ", "el gobierno ",
            "la noche ", "el punto ", "la guerra ", "el hogar ",
            "la habitación ", "el hecho ",
            "la zona ", "el dinero ", "el derecho ", "la historia ",
            "el agua ", "la madre ", "el mes ", "el lote ", "el libro ",
            "el ojo ",
            "el estudio ", "el trabajo ", "el tipo ", "la palabra ",
            "el tema ", "el lado ", "el negocio ", "la cabeza ",
            "el servicio ", "el amigo ",
            "el poder ", "el padre ", "la hora ", "la línea ",
            "el fin ", "el juego ", "el miembro ", "la ley ", "el coche ",
            "el nombre ",
            "el centro ", "la universidad ", "la información ",
            "la comunidad ", "la idea ", "el cuerpo ", "el niño ",
            "el minuto ", "la mesa ", "el equipo ",
            "la espalda ", "la cara ", "el padre ", "la oficina ",
            "el nivel ", "la persona ", "la puerta ",
            "la calle ", "la historia ", "la fiesta ",
            "la razón ", "la mañana ", "el cambio ",
            "las noticias ", "la salud ", "el tribunal ",
            "la fuerza ", "el aire ", "el arte ", "el resultado ",
            "el momento ", "la investigación ", "la niña ",
            "el niño ", "la comida ", "el tipo ",
            "el proceso ", "la política ", "la educación ", "la tasa ",
            "el sentido ", "el profesor ",
            "el mercado ", "la nación ", "la muerte ",
            "el plan ", "el interés ", "la experiencia ",
            "el efecto ", "el uso ",
            "el control ", "la clase ", "la foto ",
            "el campo ", "la universidad ", "el desarrollo ",
            "la seguridad ", "el esfuerzo ", "el papel ", "la tarifa ",
            "la música ", "el líder ", "la luz ",
            "la voz ", "el color ", "el corazón ",
            "el cuidado ", "la policía ", "la esposa ",
            "el espectáculo ",
            "la mente ", "el informe ", "la droga ",

            "la decisión ", "la vista ", "el hijo ",
            "el brazo ", "el departamento ", "el precio "
    };

    String[] peopleNounsSpanish = {
            "la persona",
            "el individuo",
            "la madre",
            "el enfermero", // Nurse can be gender-neutral but is often masculine in form
            "el grupo",
            "la familia",
            "el amigo", // Friend can also be "el amigx" or "la amigx" in more gender-neutral contexts
            "el maestro", // Teacher, similarly could be "docente" for a neutral term
            "el estudiante", // Student is neutral in its use
            "el doctor", // Doctor, "el médico" is another neutral alternative
            "el ingeniero", // Engineer, with "la ingeniera" implied
            "el científico", // Scientist, where "científico" can be seen as neutral despite its masculine form
            "el vecino", // Neighbor, used here in a generic sense
            "el compañero", // Companion, partner, or colleague
            "el líder", // Leader is generally neutral in context
            "el empleado", // Employee, with "empleadx" as a neutral alternative in informal contexts
            "el jefe", // Boss, leader, with "la jefa" implied
            "el policía", // Police officer, where "policía" can refer to both male and female officers
            "el niño", // Child, with "niñx" as a neutral alternative in informal contexts
            "el adulto", // Adult, generically used here
            "el anciano", // Elderly person, senior
            "el equipo", // Team, inherently neutral
            "la multitud", // Crowd, inherently neutral
            "el público", // Audience, public, inherently neutral
            "el cliente", // Client, customer, with "clientx" as a neutral alternative in informal contexts
            "el usuario", // User, inherently neutral
            "el miembro" // Member, inherently neutral
    };
    String[] peopleNouns = {
            "the person",
            "the individual",
            "the parent",
            "the nurse",
            "the group",
            "the family",
            "the friend",
            "the teacher",
            "the student",
            "the doctor",
            "the engineer",
            "the scientist",
            "the neighbor",
            "the colleague",
            "the leader",
            "the employee",
            "the boss",
            "the police officer",
            "the child",
            "the adult",
            "the elder",
            "the team",
            "the crowd",
            "the audience",
            "the customer",
            "the user",
            "the member"
    };

    String[] adjectivesEng = {
            "other ", "new ", "good ", "high ", "old ",
            "great ", "big ", "american ", "small ", "large ",
            "national ", "different ", "young ", "long ",
            "black ", "little ", "important ", "political ",
            "bad ", "real ",
            "white ", "best ", "right ", "only ", "public ",
            "social ", "sure ", "early ", "low ", "able ",
            "human ", "local ", "late ", "major ", "possible ",
            "better ", "strong ", "whole ", "economic ", "free ",
            "true ", "military ", "federal "
    };

    String[] adjectivesSpanishMasculine = {
            "otro ", "nuevo ", "bueno ", "alto ", "viejo ",
            "grande ", "grande ", "americano ", "pequeño ", "grande ",
            "nacional ", "diferente ", "joven ", "largo ",
            "negro ", "pequeño ", "importante ", "político ",
            "malo ", "real ",
            "blanco ", "mejor ", "correcto ", "solo ", "público ",
            "social ", "seguro ", "temprano ", "bajo ", "capaz ",
            "humano ", "local ", "tarde ", "mayor ", "posible ",
            "mejor ", "fuerte ", "entero ", "económico ", "libre ",
            "verdadero ", "militar ", "federal "
    };
    String[] phrasesMost = {
            "expensive ",
            "beautiful ",
            "challenging ",
            "rewarding ",
            "popular ",
            "influential ",
            "powerful ",
            "innovative ",
            "successful ",
            "dangerous ",
            "mysterious ",
            "exciting ",
            "significant ",
            "memorable ",
            "breathtaking ",
            "advanced ",
            "efficient ",
            "impressive ",
            "important ",
            "beloved "
    };
    String[] phrasesMostSpanish = {
            "caro ",
            "hermoso ",
            "desafiante ",
            "gratificante ",
            "popular ",
            "influyente ",
            "poderoso ",
            "innovador ",
            "exitoso ",
            "peligroso ",
            "misterioso ",
            "emocionante ",
            "significativo ",
            "memorable ",
            "impresionante ",
            "avanzado ",
            "eficiente ",
            "impresionante ",
            "importante ",
            "amado "
    };



    public void adjAdv(String adverbEng, String adverbioEsp){
        int v =(int)(Math.random()*adjectivesEng.length);
        String adjective= adjectivesEng[v];
        String adjetivo = adjectivesSpanishMasculine[v];
        gens = adverbioEsp+adjetivo ;
        gene = adverbEng+adjective;
    }
    public void adjAdv2(String adverbEng, String adverbioEsp){
        int v =(int)(Math.random()*phrasesMost.length);
        String adjective= phrasesMost[v];
        String adjetivo = phrasesMostSpanish[v];
        gens = adverbioEsp+adjetivo ;
        gene = adverbEng+adjective;
    }

    String[] prepositionsEng = {
            "of ", "in ", "to ", "for ", "with ", "on ",
            "from ", "by ", "about ","as ",

             "into ", "like ", "through ", "after ", "over ",
            "between ", "out of ", "against ",

            "without ", "before ", "under ", "around ",
            "within ",
            "toward ", "off ", "including ", "behind ",
            "along ", "according to "

    };







    String[] preposicionesEsp = {
            "de ", "en ", "a ", "para ", "con ", "sobre ","de ",
            "por ", "acerca de ",
            "como ",

            "hacia adentro de ", "parecido a ", "a través de ", "después de ",
            "sobre ", "entre ", "fuera de ", "contra ",

           "sin ", "antes de ", "bajo de ", "alrededor de ",
            "dentro de ",
            "hacia ", "separado de ", "incluyendo a ", "detrás de ",
            "a lo largo de ",  "de acuerdo a "
    };

    String[] comparativeAdjectivesWithThan = {
            "bigger than",
            "more beautiful than",
            "smaller than",
            "faster than",
            "higher than",
            "more intelligent than",
            "shorter than",
            "slower than",
            "more expensive than",
            "closer than",
            "further than",
            "older than",
            "younger than",
            "brighter than",
            "darker than",
            "more complicated than",
            "simpler than",
            "warmer than",
            "colder than",
            "more interesting than"
    };
    String[] spanishComparativeAdjectives = {
            "más grande que",
            "más hermoso que",
            "más pequeño que",
            "más rápido que",
            "más alto que",
            "más inteligente que",
            "más corto que",
            "más lento que",
            "más caro que",
            "más cerca que",
            "más lejos que",
            "más viejo que",
            "más joven que",
            "más brillante que",
            "más oscuro que",
            "más complicado que",
            "más simple que",
            "más cálido que",
            "más frío que",
            "más interesante que"
    };

    String[] comparativosPersona = {
            "nicer than ",
            "bigger than ",
            "smarter than ",
            "faster than ",
            "stronger than ",
            "taller than ",
            "shorter than ",
            "younger than ",
            "older than ",
            "lighter than ",
            "heavier than ",
            "thinner than ",
            "wider than ",
            "better than ",
            "worse than ",
            "richer than ",
            "poorer than ",
            "louder than ",
            "quieter than ",
            "softer than ",
            "more beautiful than ",
            "more handsome than ",
            "more sophisticated than ",
            "more intelligent than ",
            "more creative than ",
            "more ambitious than ",
            "more energetic than ",
            "more enthusiastic than ",
            "more reliable than ",
            "more responsible than "
    };
    String[] comparativeAdjectivesSpanish = {
            "más simpático que ",
            "más grande que ",
            "más inteligente que ",
            "más rápido que ",
            "más fuerte que ",
            "más alto que ",
            "más bajo que ",
            "más joven que ",
            "más viejo que ",
            "más ligero que ",
            "más pesado que ",
            "más delgado que ",
            "más ancho que ",
            "mejor que ",
            "peor que ",
            "más rico que ",
            "más pobre que ",
            "más ruidoso que ",
            "más silencioso que ",
            "más suave que ",
            "más hermoso que ", // or "más hermoso que " depending on the context
            "más guapo que ",
            "más sofisticado que ",
            "más inteligente que ", // Same as 'smarter than', intelligence comparison doesn't change
            "más creativo que ",
            "más ambicioso que ",
            "más energético que ",
            "más entusiasta que ",
            "más confiable que ",
            "más responsable que "
    };

    String pronounsComparativos[] = {"I am ", "you are ", "he is "};
    String pronounsObjetoComp[]= {"her ", "them ","us "};
    String pronombresComparativos[]= {"yo soy ", "tú eres ", "él es "};
    String pronombresObjetoComparativos[]={"ella ", "ellos ", "nosotros "};

    String[] extendedNounAdjuncts = {
            "race horse",
            "book shelf",
            "coffee shop",
            "computer science",
            "customer service",
            "garden hose",
            "school teacher",
            "river bank",
            "mountain range",
            "parking lot",
            "street light",
            "water bottle",
            "kitchen table",
            "bathroom sink",
            "bedroom window",
            "office chair",
            "sunflower seed",
            "tree branch",
            "company logo",
            "door handle",
            "train station",
            "bike lane",
            "beach towel",
            "park bench",
            "hotel room",
            "pizza box",
            "music festival",
            "sports car",
            "ice cream",
            "school bus",
            "cell phone",
            "movie theater",

            "airport security",
            "gas station",
            "flower pot",
            "dog house",
            "fishing rod",
            "paint brush",
            "science fiction",
            "laundry detergent",
            // Added 10 more
            "winter coat",
            "camera lens",
            "gold medal",
            "safety glasses",
            "action figure",
            "credit card",
            "tool box",
            "wine glass",
            "night sky",
            "alarm clock"
    };
    String[] extendedNounAdjunctsSpanish = {
            "caballo de carreras",
            "estantería para libros",
            "cafetería",
            "ciencias de la computación",
            "servicio al cliente",
            "manguera",
            "profesor de escuela",
            "orilla del río",
            "cadena montañosa",
            "estacionamiento",
            "luz de calle",
            "botella de agua",
            "mesa de cocina",
            "lavabo del baño",
            "ventana del dormitorio",
            "silla de oficina",
            "semilla de girasol",
            "rama de árbol",
            "logo de la empresa",
            "manija de la puerta",
            "estación de tren",
            "carril de bici",
            "toalla de playa",
            "banco del parque",
            "habitación de hotel",
            "caja de pizza",
            "festival de música",
            "coche deportivo",
            "helado",
            "autobús escolar",
            "teléfono celular",
            "cine",

            "seguridad del aeropuerto",
            "estación de gasolina",
            "maceta",
            "casa para perros",
            "caña de pescar",
            "pincel",
            "ciencia ficción",
            "detergente para la ropa",
            // Added 10 more
            "abrigo de invierno",
            "lente de cámara",
            "medalla de oro",
            "gafas de seguridad",
            "figura de acción",
            "tarjeta de crédito",
            "caja de herramientas",
            "copa de vino",
            "cielo nocturno",
            "reloj despertador"
    };

    public void GenNounAdj(){
    int n= (int)    (Math.random()* extendedNounAdjuncts.length);
   gens =extendedNounAdjunctsSpanish[n];
   gene = extendedNounAdjuncts[n];
}
    public void GenComparativos(){
        int sub= (int)  (Math.random()*pronombresComparativos.length);
        int ob=(int)(Math.random()*pronombresObjetoComparativos.length);
        int comp=(int) (Math.random()*comparativosPersona.length);

        gens = pronombresComparativos[sub]+comparativeAdjectivesSpanish[comp]+pronombresObjetoComparativos[ob];
        gene= pronounsComparativos[sub]+comparativosPersona[comp]+pronounsObjetoComp[ob];
    }
    public void GenThan(){
        int ad = (int)(Math.random()*spanishComparativeAdjectives.length);

        gens = spanishComparativeAdjectives[ad];
        gene= comparativeAdjectivesWithThan[ad];
    }

    public void genPreps(String prep) {
        int n = (int)(Math.random()*nouns.length);
        int n2 = (int)(Math.random()*nouns.length);


        String noun = nouns[n];
        String sust = nounsSpanish[n];

        switch (prep) {
            case "of":
                gens = "de "+ sust;
                gene = "of the "+noun;
                break;
            case "in":
                gens = "en "+ sust;
                gene = "in the "+noun;
                break;
            case "to":
                gens = "a " + sust;  // Many Spanish prepositions use "a" instead of "to"
                gene = "to the " + noun;
                break;
            case "for":
                gens = "para " + sust;
                gene = "for the " + noun;
                break;
            case "with":
                gens = "con " + sust;
                gene = "with the " + noun;
                break;
            case "on":
                gens = "en " + sust;  // "en" can also be used for "on" in some cases
                gene = "on the " + noun;
                break;
            case "at":
                gens = "en " + sust;  // "a" can also be used for "at" in some cases
                gene = "at the " + noun;
                break;
            case "from":
                gens = "desde " + sust;  // Using "de" for generic "from"
                gene = "from the " + noun;
                break;
            case "by":
                gens = "por " + sust;
                gene = "by the " + noun;
                break;
            case "about":
                gens = "acerca de " + sust;
                gene = "about the " + noun;
                break;
            case "as":  // Preposition
                gens =  "como " +sust;
                gene = "as "+noun;
                break;
            case "into":
                gens = "hacia adentro de " + sust;
                gene = "into the " + noun;
                break;
            case "like":
                gens = "como " + sust;
                gene = "like the " + noun;
                break;
            case "through":
                gens = "a través de " + sust;
                gene = "through the " + noun;
                break;
            case "after":
                gens = "después de " + sust;
                gene = "after the " + noun;
                break;
            case "over":
                gens = "sobre " + sust;
                gene = "over the " + noun;
                break;
            case "between":
                gens = "entre " + sust + "y "+ nounsSpanish[n2];  // Uses "y" (and) for "between"
                gene = "between the " + noun + "and the "+nouns[n2];
                break;
            case "out":
                gens = "fuera de " + sust;
                gene = "out of the " + noun;
                break;
            case "against":
                gens = "contra " + sust;
                gene = "against the " + noun;
                break;
            case "during":
                gens = "durante " + sust;
                gene = "during the " + noun;
                break;
            case "without":
                gens = "sin " + sust;
                gene = "without the " + noun;
                break;
            case "before":
                gens = "antes de " + sust;
                gene = "before the " + noun;
                break;
            case "under":
                gens = "bajo " + sust;
                gene = "under the " + noun;
                break;
            case "around":
                gens = "alrededor de " + sust;
                gene = "around the " + noun;
                break;
            case "among":
                gens = "entre " + sust;  // Can also use "entre" for "among"
                gene = "among the " + noun;
                break;
            case "such":
                String modifiedItem = sust.replaceFirst("^(el |la )", "");
                gens = "tal " + modifiedItem;
                gene = "such a " + noun;
                break;
            case "within":
                gens = "dentro de " + sust;
                gene = "within the " + noun;
                break;
            case "across":
                gens = "a través de " + sust;
                gene = "across the " + noun;
                break;
            case "toward":
                gens = "hacia " + sust;
                gene = "toward the " + noun;
                break;
            case "off":
                gens = "separado de " + sust;  // Can also use "de" for "off" in some cases
                gene = "off the " + noun;
                break;
            case "including":
                gens = "incluyendo " + sust;
                gene = "including the " + noun;
                break;
            case "behind":
                gens = "detrás de " + sust;
                gene = "behind the " + noun;
                break;
            case "along":
                gens = "a lo largo de " + sust;
                gene = "along the " + noun;
                break;
            case "up":
                gens = "arriba de " + sust;  // Many uses for "arriba de"
                gene = "up the " + noun;
                break;
            case "according to":
                gens = "según " + sust;
                gene = "according to the " + noun;
                break;
            default:
                // Handle unrecognized preposition
                break;
        }
    }
    private static int currentIndex = 0;
    public void genPreps() {
        int n = (int)(Math.random()*nouns.length);
        int n2 = (int)(Math.random()*nouns.length);


        String noun = nouns[n];
        String sust = nounsSpanish[n];

        switch (currentIndex) {
            case 0:
                gens = "de "+ sust;
                gene = "of the "+noun;
                break;
            case 1:
                gens = "en "+ sust;
                gene = "in the "+noun;
                break;
            case 2:
                gens = "a " + sust;  // Many Spanish prepositions use "a" instead of "to"
                gene = "to the " + noun;
                break;
            case 3:
                gens = "para " + sust;
                gene = "for the " + noun;
                break;
            case 4:
                gens = "con " + sust;
                gene = "with the " + noun;
                break;
            case 5:
                gens = "en " + sust;  // "en" can also be used for "on" in some cases
                gene = "on the " + noun;
                break;
            case 6:
                gens = "en " + sust;  // "a" can also be used for "at" in some cases
                gene = "at the " + noun;
                break;
            case 7:
                gens = "proveniente de " + sust;  // Using "de" for generic "from"
                gene = "from the " + noun;
                break;
            case 8:
                gens = "por " + sust;
                gene = "by the " + noun;
                break;
            case 9:
                gens = "acerca de " + sust;
                gene = "about the " + noun;
                break;
            case 10:  // Preposition
                gens = "como "+sust;
                gene =  "as "+noun;
                break;
            case 11:
                gens = "hacia adentro de " + sust;
                gene = "into the " + noun;
                break;
            case 12:
                gens = "como " + sust;
                gene = "like the " + noun;
                break;
            case 13:
                gens = "a través de " + sust;
                gene = "through the " + noun;
                break;
            case 14:
                gens = "después de " + sust;
                gene = "after the " + noun;
                break;
            case 15:
                gens = "sobre " + sust;
                gene = "over the " + noun;
                break;
            case 16:
                gens = "entre " + sust + "y "+ nounsSpanish[n2];  // Uses "y" (and) for "between"
                gene = "between the " + noun + "and the "+nouns[n2];
                break;
            case 17:
                gens = "fuera de " + sust;
                gene = "out of the " + noun;
                break;
            case 18:
                gens = "contra " + sust;
                gene = "against the " + noun;
                break;
            case 19:
                gens = "durante " + sust;
                gene = "during the " + noun;
                break;
            case 20:
                gens = "sin " + sust;
                gene = "without the " + noun;
                break;
            case 21:
                gens = "antes de " + sust;
                gene = "before the " + noun;
                break;
            case 22:
                gens = "bajo " + sust;
                gene = "under the " + noun;
                break;
            case 23:
                gens = "alrededor de " + sust;
                gene = "around the " + noun;
                break;
            case 24:
                gens = "entre " + sust;  // Can also use "entre" for "among"
                gene = "among the " + noun;
                break;
            case 25:
                String modifiedItem = sust.replaceFirst("^(el |la )", "");
                gens = "tal " + modifiedItem;
                gene = "such a " + noun;
                break;
            case 26:
                gens = "dentro de " + sust;
                gene = "within the " + noun;
                break;
            case 27:
                gens = "a través de " + sust;
                gene = "across the " + noun;
                break;
            case 28:
                gens = "hacia " + sust;
                gene = "toward the " + noun;
                break;
            case 29:
                gens = "separado de " + sust;  // Can also use "de" for "off" in some cases
                gene = "off the " + noun;
                break;
            case 30:
                gens = "incluyendo " + sust;
                gene = "including the " + noun;
                break;
            case 31:
                gens = "detrás de " + sust;
                gene = "behind the " + noun;
                break;
            case 32:
                gens = "a lo largo de " + sust;
                gene = "along the " + noun;
                break;
            case 33:
                gens = "arriba de " + sust;  // Many uses for "arriba de"
                gene = "up the " + noun;
                break;
            case 34:
                gens = "según " + sust;
                gene = "according to the " + noun;
                break;
            default:
                // Handle unrecognized preposition
                break;
        }
        currentIndex++;
        if (currentIndex == 35 ) {  // Adjust this number to the last case index
            currentIndex = 0;
        }
    }
    public void genPronoun(String pronounParm) {
        int prep = (int) (Math.random() * prepositionsEng.length);
        String engPrep = prepositionsEng[prep];
        String spPrep = preposicionesEsp[prep];

        switch (pronounParm) {
            case "them ":
                gens = spPrep+"ellos ";
                gene = engPrep+ pronounParm;
                break;
            case "me ":
                gens = spPrep+"mi ";
                gene = engPrep+ pronounParm;
                break;
            case "him ":
                gens = spPrep+"él ";
                gene = engPrep+ pronounParm;
                break;
            case "one ":
                gens = spPrep+"uno ";
                gene = engPrep+ pronounParm;
                break;
            case "her ":
                gens = spPrep+"ella ";
                gene = engPrep+ pronounParm;
                break;
            case "us ":
                gens = spPrep+"nosotros ";
                gene = engPrep+ pronounParm;
                break;
            case "something ":
                gens = spPrep+"algo ";
                gene = engPrep+ pronounParm;

                break;
            case "nothing ":
                gens = spPrep+"nada ";
                gene = engPrep+ pronounParm;
                break;
            case "anything ":
                gens = spPrep+"cualquier cosa ";
                gene = engPrep+ pronounParm;
                break;
            case "himself ":
                gens = spPrep+"él mismo ";
                gene = engPrep+ pronounParm;
                break;
            case "everything ":
                gens = spPrep+"todo ";
                gene = engPrep+ pronounParm;
                break;
            case "someone ":
                gens = spPrep+"alguien ";
                gene = engPrep+ pronounParm;
                break;
            case "themselves ":
                gens = spPrep+"ellos mismos ";
                gene = engPrep+ pronounParm;
                break;
            default:
                gens= "error";
                gene = "error";
                break;
        }
    }


    NewVerbClass verbsObject= new NewVerbClass();
String gens,gene;
public void nounGen(String engNoun,String SpNoun){
verbsObject.genVerbAndObject(engNoun,SpNoun);

gene = verbsObject.gene;
gens = verbsObject.gens;

}
    public void adjectiveGen(String adjParamEng, String adjParamSpM, String adjParamSpF) {
        int n = (int) (Math.random() * nouns.length);


        // Splitting the Spanish noun into article and noun parts
        String[] parts = nounsSpanish[n].split(" ", 2); // Splits into 2 parts: [article, noun]
        String article = parts[0]; // "el" or "la"
        String noun = parts[1]; // The actual noun

        if (article.equals("la")) {
            // Insert feminine adjective after "la"
            gens = article + " " + adjParamSpF  + noun;
        } else {
            // Assuming masculine for any other case, including "el"
            gens = article + " " + adjParamSpM + noun;
        }

        gene = "The " + adjParamEng +  nouns[n];


    }
    public void adjectiveGen2(String adjParamEng, String adjParamSpM, String adjParamSpF) {
        int n = (int) (Math.random() * nouns.length);


        // Splitting the Spanish noun into article and noun parts
        String[] parts = nounsSpanish[n].split(" ", 2); // Splits into 2 parts: [article, noun]
        String article = parts[0]; // "el" or "la"
        String noun = parts[1]; // The actual noun

        if (article.equals("la")) {
            // Insert feminine adjective after "la"
            gens = article + " " + noun + adjParamSpF  ;
        } else {
            // Assuming masculine for any other case, including "el"
            gens = article + " " +noun+ adjParamSpM ;
        }

        gene = "The " + adjParamEng +  nouns[n];


    }


    Random random = new Random();

    String[] auxiliaryVerbs = {"do", "did", "will", "would", "could", "should", "can", "must", "have", "has", "had", "is", "are", "am","was", "1was","were", "does"};
    String[] thirdPersonPronouns = {"he", "she", "it"};
    String[] otherPronouns = { "you", "we", "they"};
    String[] otherOtherPronouns = {"I", "you", "we", "they"};
    String[] questionWordsTransitive = {"What", "When", "Where", "Why", "Who", "How", "How much", "How many"};
    String[] questionWordsIntransitive = {"When", "Where", "Why", "How"};
    String[] verbsTagged = {
            "Thave ", "Tdo ", "Tsay ", "Igo ", "Tget ",
            "Tmake ", "Tknow ", "Tthink ", "Tsee ", "Ttake ",
            "Icome ", "Twant ", "Tlook ", "Tuse ", "Tfind ",
            "Tgive ", "Ttell ", "Twork ", "Tcall ", "Ttry ",
            "Task ", "Tneed ", "Tfeel ", "Ibecome ", "Ileave ",
            "Tput ", "Tmean ", "Tlet ", "Tkeep ", "Ibegin ",
            "Iseem ", "Ttalk ", "Tturn ", "Thelp ", "Tstart ",
            "Tshow ", "Hhear ", "Irun ", "Tplay ", "Tmove ",
            "Tlike ", "Thold ", "Ilive ", "Tbring ", "Twrite ", "Tprovide ", "Isit ", "Istand ",
            "Tlose ", "Tmeet ", "Tpay ", "Tinclude ", "Icontinue ", "Tchange ", "Tset ", "Ilead ",
            "Tlearn ", "Tunderstand ", "Twatch ", "Tfollow ", "Istop ", "Tspeak ", "Tcreate ", "Tallow ",
            "Tread ", "Tspend ", "Tadd ", "Igrow ", "Iopen ", "Iwalk ", "Toffer ", "Tremember ", "Twin ",
            "Iappear ", "Tconsider ", "Tlove ", "Tbuy ", "Iwait ", "Idie ", "Tsend ", "Texpect ", "Tserve ",
            "Istay ", "Tbuild ", "Ifall ", "Tcut ", "Tkill ", "Treach ", "Iremain ", "Tsuggest ", "Traise ",
            "Tpass ", "Tsell ", "Trequire ", "Tdecide ", "Treport ", "Treturn ", "Tpull ", "Texplain ", "Tcarry ",
            "Tdevelop ", "Thope ", "Tdrive ", "Tbreak "
    };

    // Example verb forms for demonstration purposes

    public String generateQuestion(int verbPos, int verPos2) {
        String auxiliaryVerb = auxiliaryVerbs[random.nextInt(auxiliaryVerbs.length)];
        String subjectPronoun = choosePronoun(auxiliaryVerb);

        String verbForm = chooseVerbForm(auxiliaryVerb, verbPos);
        String questionWord = chooseQuestionWord(verbForm);

        String objectOfVerb = chooseVerbObject(verbPos,verPos2);

        if(auxiliaryVerb.equalsIgnoreCase("1was")){
            auxiliaryVerb="was";
        }
        // Assemble the sentence
        return String.format("%s %s %s %s %s", questionWord, auxiliaryVerb, subjectPronoun, verbForm.trim(),objectOfVerb);
    }

    private String chooseVerbObject(int verbPosition,int verPos2) {

        return verbsObject.verbObjects[verbPosition][verPos2];
    }
    private String choosePronoun(String auxiliary) {
        if ("does".equals(auxiliary)  ||"is".equals(auxiliary)|| "was".equals(auxiliary)|| "has".equals(auxiliary)) {
            return thirdPersonPronouns[random.nextInt(thirdPersonPronouns.length)];
        }
        else if("am".equals(auxiliary)||"1was".equals(auxiliary)){
            return "I";
        } else {
            if("are".equalsIgnoreCase(auxiliary)||"were".equalsIgnoreCase(auxiliary)){
                return otherPronouns[random.nextInt(otherPronouns.length)];
            }

            return otherOtherPronouns [random.nextInt(otherOtherPronouns.length)];
        }
    }

    private String chooseVerbForm(String auxiliary, int verbIndex) {
        switch (auxiliary) {
            case "do":
            case "does":
            case "should":
            case "could":
            case "can":
            case "must":
                return verbsObject.verbs[verbIndex]; // Base form for these auxiliaries
            case "have":
            case "has":
            case "had":
                return verbsObject.verbsParticiple[verbIndex]; // Past participle for present perfect
            case "is":
            case "are":
            case "was":
            case "were":
            case "1was":
            case "am":
                return verbsObject.verbsIng[verbIndex]; // -ing form for continuous aspect
            default:
                return verbsObject.verbs[verbIndex]; // Default to base form as a fallback
        }
    }

    private String chooseQuestionWord(String verbForm) {
        if (verbForm.startsWith("T")) {
            return questionWordsTransitive[random.nextInt(questionWordsTransitive.length)];
        } else {
            return questionWordsIntransitive[random.nextInt(questionWordsIntransitive.length)];
        }
    }
    //.....................................................................................

    public String genSpanishQuestion(String engQuestion,int verbpos,int v2){
        String []questionParts   =  engQuestion.split("\\s");
        String palabraDePregunta =  genSpanishQuestionWord(questionParts[0]);
        String questionSubject   =  genSpanishPronoun(questionParts[2]);
        String questionAux   =    questionParts[1];

       String completeQuestion= completeQuestion(palabraDePregunta,questionSubject,questionAux,chooseVerbObjectSpanish(verbpos,v2),verbpos);


        return completeQuestion;
    }

    public String genSpanishQuestionWord(String engQuestionWord) {
        switch (engQuestionWord) {
            case "What":
                return "Qué";
            case "When":
                return "Cuándo";
            case "Where":
                return "Dónde";
            case "Why":
                return "Por qué";
            case "Who":
                return "Quién";
            case "How":
                return "Cómo";
            case "How much":
                return "Cuánto"; // Used for uncountable nouns
            case "How many":
                return "Cuántos"; // Used for countable nouns
            default:
                return "Unknown";
        }
    }
    public String genSpanishPronoun(String engPronoun){

        switch (engPronoun){
            case "I":
                return "yo";
            case "you":
                return "tú";
            case "he":
                return    "él";
            case "she":
                return    "ella";
            case "it":
                return    "eso";
            case "we":
                return    "nosotros";
            case "they":
                return    "ellos";
            default:
             return    "unknown";

        }

    }
    public String completeQuestion(String questionWord,String spPronoun,String engAux,String objectOfVerb,int verbPos){
        String aux="not assigned";
        String verb="not assigned ";
        switch (spPronoun){
            case "yo":
                switch (engAux) {
                    case "do":
                        aux="";
                        verb  = verbsObject.verbsSpanishFirstPerson[verbPos];
                        break;
                    case "did":
                        aux="";
                        verb  = verbsObject.verbsSpanishFirstPersonPast[verbPos];
                        break;
                    case "will":
                        aux="";
                        verb  = verbsObject.verbsSpanishFirstPersonFuture[verbPos];
                        break;
                    case "would":
                        aux="";
                        verb  = verbsObject.verbsSpanishHypothetical[verbPos];
                        break;
                    case "could":
                        aux="podría";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "should":
                        aux="debería";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "can":
                        aux="puedo";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "must":
                        aux="debo";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "have":
                        aux="he ";
                        verb  = verbsObject.verbsParticipleSpanish[verbPos];
                        break;
                    case "has":
                        aux="none ";
                        verb  = verbsObject.verbsParticipleSpanish[verbPos];
                        break;
                    case "had":
                        aux="había";
                        verb  = verbsObject.verbsParticipleSpanish[verbPos];
                        break;
                    case "am":
                        aux="estoy";
                        verb  = verbsObject.verbosConGerundio[verbPos];
                        break;
                    case "are":
                        aux="none";
                        break;
                    case "was":
                        aux="estaba";
                        verb  = verbsObject.verbosConGerundio[verbPos];
                        break;
                    case "were":
                        aux="none";
                        break;
                    case "does":
                        aux="none";
                        break;
                    default:
                        aux="no aux";
                        verb="no verb";
                        break;
                }

                break ;

            case"tú":
                switch (engAux) {
                    case "do":
                        aux="";
                        verb  = verbsObject.verbsSpanishSecondPerson[verbPos];
                        break;
                    case "did":
                        aux="";
                        verb  = verbsObject.verbsSpanishSecondPersonSingularPast[verbPos];
                        break;
                    case "will":
                        aux="";
                        verb  = verbsObject.verbsSpanishSecondPersonFuture[verbPos];
                        break;
                    case "would":
                        aux="";
                        verb  = verbsObject.verbsSpanishHypotheticalSecondPerson[verbPos];
                        break;
                    case "could":
                        aux="podrías";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "should":
                        aux="deberías";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "can":
                        aux="puedes";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "must":
                        aux="debes";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "have":
                        aux="has";
                        verb  = verbsObject.verbsParticipleSpanish[verbPos];
                        break;
                    case "has":
                        aux="none ";
                        verb  = verbsObject.verbsParticipleSpanish[verbPos];
                        break;
                    case "had":
                        aux="habías";
                        verb  = verbsObject.verbsParticipleSpanish[verbPos];
                        break;
                    case "is":
                        aux="none ";
                        verb  = verbsObject.verbosConGerundio[verbPos];
                        break;
                    case "are":
                        aux="estas";
                        verb  = verbsObject.verbosConGerundio[verbPos];
                        break;
                    case "was":
                        aux="noaux";
                        break;
                    case "were":
                        aux="estabas";
                        verb  = verbsObject.verbosConGerundio[verbPos];
                        break;
                    case "does":
                        aux="none";
                        break;
                    default:
                        aux="no aux";
                        verb="no verb";
                        break;
                }

                break;

            case "él":

            case "ella":

            case "eso":
                switch (engAux) {
                    case "do":
                        aux="none ";

                        break;
                    case "did":
                        aux="";
                        verb  = verbsObject.verbsSpanishThirdPersonSingularPast[verbPos];
                        break;
                    case "will":
                        aux="";
                        verb  = verbsObject.verbsSpanishThirdPersonFuture[verbPos];
                        break;
                    case "would":
                        aux="";
                        verb  = verbsObject.verbsSpanishHypothetical[verbPos];
                        break;
                    case "could":
                        aux="podría";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "should":
                        aux="debería";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "can":
                        aux="puede";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "must":
                        aux="debe";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "have":
                        aux="none";

                        break;
                    case "has":
                        aux="ha";
                        verb  = verbsObject.verbsParticipleSpanish[verbPos];
                        break;
                    case "had":
                        aux="había";
                        verb  = verbsObject.verbsParticipleSpanish[verbPos];
                        break;
                    case "is":
                        aux="está ";
                        verb  = verbsObject.verbosConGerundio[verbPos];
                        break;
                    case "are":
                        aux="none";
                        break;
                    case "was":
                        aux="estaba";
                        verb  = verbsObject.verbosConGerundio[verbPos];
                        break;
                    case "were":
                        aux="none";
                        break;
                    case "does":
                        aux="";
                        verb  = verbsObject.verbsSpanishThirdPerson[verbPos];
                        break;
                    default:
                        aux="no aux";
                        verb="no verb";
                        break;
                }

                break;

            case "nosotros":
                switch (engAux) {
                    case "do":
                        aux="";
                        verb  = verbsObject.verbsSpanishFirstPersonPlural[verbPos];
                        break;
                    case "did":
                        aux="";
                        verb  = verbsObject.verbsSpanishFirstPersonPluralPast[verbPos];
                        break;
                    case "will":
                        aux="";
                        verb  = verbsObject.verbsSpanishFirstPersonPluralFuture[verbPos];
                        break;
                    case "would":
                        aux="";
                        verb  = verbsObject.verbsSpanishHypotheticalFirstPlural[verbPos];
                        break;
                    case "could":
                        aux="podríamos";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "should":
                        aux="deberíamos";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "can":
                        aux="podemos";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "must":
                        aux="debemos";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "have":
                        aux="hemos";
                        verb  = verbsObject.verbsParticipleSpanish[verbPos];
                        break;
                    case "has":
                        aux="none ";
                        verb  = verbsObject.verbsParticipleSpanish[verbPos];
                        break;
                    case "had":
                        aux="habíamos";
                        verb  = verbsObject.verbsParticipleSpanish[verbPos];
                        break;
                    case "is":

                        break;
                    case "are":
                        aux="estamos";
                        verb= verbsObject.verbosConGerundio[verbPos];
                        break;
                    case "was":

                        break;
                    case "were":
                        aux="estabamos";
                        verb  = verbsObject.verbosConGerundio[verbPos];
                        break;
                    case "does":

                        break;
                    default:

                        break;
                }

                break;

            case "ellos":
                switch (engAux) {
                    case "do":
                        aux="";
                        verb  = verbsObject.verbsSpanishThirdPersonPlural[verbPos];
                        break;
                    case "did":
                        aux="";
                        verb  = verbsObject.verbsSpanishThirdPersonPluralPast[verbPos];
                        break;
                    case "will":
                        aux="";
                        verb  = verbsObject.verbsSpanishThirdPersonPluralFuture[verbPos];
                        break;
                    case "would":
                        aux="";
                        verb  = verbsObject.verbsSpanishHypotheticalThirdPlural[verbPos];
                        break;
                    case "could":
                        aux="podrían";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "should":
                        aux="deberían";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "can":
                        aux="pueden";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "must":
                        aux="deben";
                        verb  = verbsObject.verbsSpanish[verbPos];
                        break;
                    case "have":
                        aux="han";
                        verb  = verbsObject.verbsParticipleSpanish[verbPos];
                        break;
                    case "has":

                        break;
                    case "had":
                        aux="habían";
                        verb  = verbsObject.verbsParticipleSpanish[verbPos];
                        break;
                    case "is":

                        break;
                    case "are":
                        aux="estan";
                        verb= verbsObject.verbosConGerundio[verbPos];
                        break;
                    case "was":

                        break;
                    case "were":
                        aux="estaban";
                        verb  = verbsObject.verbosConGerundio[verbPos];
                        break;
                    case "does":

                        break;
                    default:

                        break;
                }

                break;

        }



        return String.format("%s %s %s%s%s?", questionWord, aux, verb,objectOfVerb ,spPronoun);

    }
    private String chooseVerbObjectSpanish(int verbPosition,int verposition2) {

        return verbsObject.verbObjectsSpanish[verbPosition][verposition2];
    }

    public void GenRelativeClauses(){
        int sus= (int) (Math.random()* nounsSpanish.length);
        int v=(int)(Math.random()*verbsObject.verbosConGerundio.length);
        int v2=(int)(Math.random()*verbsObject.verbosConGerundio.length);
        int o=(int)(Math.random()*verbsObject.verbObjects[v].length);
        int o2=(int)(Math.random()*verbsObject.verbObjects[v2].length);
        String sust=nounsSpanish[sus]+"que está ";
        String noun="The "+nouns[sus]+"that is ";

        gens=sust +verbsObject.verbosConGerundio[v]+verbsObject.verbObjectsSpanish[v][o].trim()+", "  + verbsObject.verbsSpanishThirdPerson[v2]+verbsObject.verbObjectsSpanish[v2][o];
        gene= noun+verbsObject.verbsIng[v]+verbsObject.verbObjects[v][o]+ verbsObject.verbsThirdPerson[v2]+verbsObject.verbObjects[v2][o];

    }
String gene2;
    AuxModalNegator negator = new AuxModalNegator();
    public void GenWish(int wishType){

        switch (wishType){
            case 0:
                verbsObject.GenPastSimp();
                gens="ojalá "+ verbsObject.gens2;
                gene="I wish "+ verbsObject.gene;
                gene2="I wish "+negator.negatePastSimple(verbsObject.gene2);
                break;

            case 1:
                verbsObject.GenWould();
                gens="ojalá "+ verbsObject.gens2;
                gene="I wish "+ verbsObject.gene;
                gene2="I wish "+ negator.negateFirstAuxOrModalContracted(verbsObject.gene);
                break;

            case 2:
                verbsObject.GenPerfectTenses("had ","had ","hubíera ", "hubíeras ","hubíera ", "hubíeramos ", "hubíeran ");
                gens= "ojalá " + verbsObject.gens;
                gene= "I wish "+ verbsObject.gene;
                gene2= "I wish "+ negator.negateFirstAuxOrModalContracted(verbsObject.gene);

                break;

            default:
                gens= "no such number";
                break;
        }

    }
    public void GenJustPhrasalVerbs(){
        int pv= (int)(Math.random()* justEnglishPhrasalVerbs.length);
        gens=justSpanishPhrasalVerbs[pv];
        gene=justEnglishPhrasalVerbs[pv];
    }

}
