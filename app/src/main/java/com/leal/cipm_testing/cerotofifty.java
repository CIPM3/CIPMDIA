package com.leal.cipm_testing;

import android.widget.Toast;

public class cerotofifty {

    //1 hacer este array
    //2 copias j=0; y la funcion vocab
    // 3 debugging
    //mandarlo a db (no esta listo)
    String alleng[]= {"the",  "to be", "and", "of", "a", "in ", "to "
    ,"to have",  "it ", "I", "that ", "that ", "for ", "for " , "you ", "he ",
            "with ", "on ",
            "to do ", "to say", "this " , "they ", "at ", "but ", "we ", "his ",
            "from ","from ","since",   "by ", "she ",
            "or ", "as ", "as ", "what ", "what ", "to go ", "their ", "can ",
            "who ", "to get ", "if ",
            "would", "her ", "all ", "my ", "to make ", "about ", "about ",
            "to know ", "will ", "up "
    };
    String allsp[]= {"el, la, los o las", "ser o estar", "y ", "de ", "un o una", "en ", "a ",
    "tener o haber ", "eso ", "yo ", "eso ", "que, para conectar", "por ", "para ", "tu", "el ", "con ", "sobre ", "hacer ",
            "decir ", "esto ", "ellos ", "en " , "pero ", "nosotros" , "su de el ", "desde, para un lugar","de ","desde ", "por ", "ella ",
            "o ", "como ", "en lo que ", "que, para preguntar ", "lo que ", "ir " , "su de ellos", "poder ", "quien ", "obtener ", "si",
            "la terminacion ria en los verbos ", "su de ella", "todo ", "mi ", "hacer ", "acerca ", "acerca de ", "saber ", "el modal que hace futuro a un verbo ", "arriba"
    };


    String articles[] = {"the ", "the ", "the ", "the ", "a ", "a ", "some ", "some "};
    String articulos[] = {"el ", "la ", "los ", "las ", "un ", "una ", "unos ", "unas "};

    String pronoun[] = {"I ", "you ", "he ", "she ", "it ", "they ", "we "};
    String pronombres[] = {"yo ", "tú ", "él ", "ella ", "eso ", "ellos ", "nosotros "};

    String adj[] = {"this ", "his ", "her ", "their ", "that "};
    String adje[] = {"este ", "su ", "su ", "su ", "ese "};


    String prep[] = {"of ", "in ", "to ", "for ", "with ", "on ", "from ", "about "};
    String prepsp[] = {"de ", "en ", "a ", "para ", "con ", "sobre ", "desde ", "acerca de "};
    String prep2[] = {"of ", "in ", "to ", "for ", "with ", "on ", "from ", "about ","at ","by "};
    String prepsp2[] = {"de ", "en ", "a ", "para ", "con ", "sobre ", "desde ", "acerca de ","en ","por "};

    //verbos base
    String vib[] = {"have ", "say ", "go ", "get ", "make ", "know "};
    String vibdo[] = {"have ", "say ", "go ", "get ", "do ", "know "};
    String vib3[] = {"has ", "says ", "goes ", "gets ", "makes ", "knows "};
    String vib3do[] = {"has ", "says ", "goes ", "gets ", "does ", "knows "};
    String verbos[] = {"tener ", "decir ", "ir ", "obtener ", "hacer ", "saber "};

    //presente
    String vib1[] = {"tengo ", "digo ", "voy ", "obtengo ", "hago ", "sé "};
    String vib2[] = {"tienes ", "dices ", "vas ", "obtienes ", "haces ", "sabes "};
    String vib3esp[] = {"tiene ", "dice ", "va ", "obtiene ", "hace ", "sabe "};
    String vib3p[] = {"tienen ", "dicen ", "van ", "obtienen ", "hacen ", "saben "};
    String vibnos[] = {"tenemos ", "decimos ", "vamos ", "obtenemos ", "hacemos ", "sabemos "};

    // hipotetico
    String verbo1hip[] = {"tendría ", "diría ", "iría ", "obtendría ", "haría ", "sabría "};
    String verbo2hip[] = {"tendrías ", "dirías ", "irías ", "obtendrías ", "harías ", "sabrías "};
    String verbo3hip[] = {"tendría ", "diría ", "iría ", "obtendría ", "haría ", "sabría "};
    String verbos4hip[] = {"tendrían ", "dirían ", "irían ", "obtendrían ", "harían ", "sabrían "};
    String verbos5hip[] = {"tendríamos ", "diríamos ", "iríamos ", "obtendríamos ", "haríamos ", "sabríamos "};

    //futuro
    String verbo1f[] = {"tendré ", "diré ", "iré ", "obtendré ", "haré ", "sabré "};
    String verbo2f[] = {"tendrás ", "dirás ", "irás ", "obtendrás ", "harás ", "sabrás "};
    String verbo3f[] = {"tendrá ", "dirá ", "irá ", "obtendrá ", "hará ", "sabrá "};
    String verbos4f[] = {"tendrán ", "dirán ", "irán ", "obtendrán ", "harán ", "sabrán "};
    String verbos5f[] = {"tendrémos ", "dirémos ", "irémos ", "obtendrémos ", "harémos ", "sabrémos "};

    //modales
    String modal[] = {"would ", "will ", "can ", "can ", "can ", "can ", "can ", "can ", "can "};
    String modales[] = {" ", " ", "puedo ", "puedes ", "puede ", "puede ", "puede ", "pueden ", "podemos "};

    //adverbs
    String adv[] = {"what ", "as ", "or ", "but ","and "};
    String adver[] = {"lo que ", "como ", "o ", "pero ","y "};


    //placeholder nouns
    String sofe[] = {"people ", "history ", "way ", "information"};
    String sofs[] = {"gente ", "historia ", "manera ", "información "};
    String pofs[] = {"mujeres ", "casas ", "maneras ", "cosas "};
    String pofe[] = {"women ", "houses ", "ways ", "things"};

    String[] placesAt = {
            "the park",
            "the school",
            "the office",
            "the airport",
            "the station",
            "the mall",
            "the museum",
            "the library",
            "the gym",
            "the beach",
            "the restaurant",
            "the hotel",
            "the university",
            "the hospital",
            "the theater",
            "the cafe",
            "the zoo",
            "the pool",
            "the club",
            "the bar"
    };
    String[] lugaresEn = {
            "el parque",
            "la escuela",
            "la oficina",
            "el aeropuerto",
            "la estación",
            "el centro comercial",
            "el museo",
            "la biblioteca",
            "el gimnasio",
            "la playa",
            "el restaurante",
            "el hotel",
            "la universidad",
            "el hospital",
            "el teatro",
            "la cafetería",
            "el zoológico",
            "la piscina",
            "el club",
            "el bar"
    };

    String soms[] = {"tiempo ", "año ", "niño "};
    String some[] = {"time ", "year ", "boy "};
    String poms[] = {"hombres ", "perros ", "objetos ", "libros "};
    String pome[] = {"men ", "dogs ", "objects ", "books "};
    String noun[] = {"car ", "money ", "friend ", "object ", "phone ", "time "};
    String sust[] = {"carro ", "dinero ", "amigo ", "objeto ", "telefono ", "tiempo"};

    // los del be
    String be[] = {"am ", "are ", "is ", "is ", "is ", "are ", "are "};
    String ser[] = {"soy ", "eres ", "es ", "es ", "son ", "somos "};
    String est[] = {"estoy ", "estas ", "está ", "está ", "está ", "están ", "estamos "};

    String[] wordsAfterAs = {
            "as soon",
            "as much",
            "as well",
            "as long",
            "as though",
            "as if",
            "as many",
            "as part",
            "as possible",
            "as follows",

            "as a teacher",
            "as a child",
            "as a student",
            "as a parent",
            "as a doctor",
            "as a leader",
            "as a friend",
            "as a professional",
            "as a scientist",
            "as an artist",
            "as an engineer",

    };
    String[] wordsAfterAssp = {
            "tan pronto",
            "tanto",
            "tan bien",
            "tan largo",
            "como si ",
            "como si ",
            "tantos",
            "como parte",
            "como posible",
            "como sigue",

            "como maestro",
            "de niño",
            "como estudiante",
            "como padre",
            "como doctor",
            "como lider",
            "como amigo",
            "como profesional",
            "como cientifico",
            "como artista",
            "como ingeniero",

    };

    public void as(){
        int a= (int) (Math.random()* wordsAfterAs.length);
        gens= wordsAfterAssp[a];
        gene= wordsAfterAs[a];
    }

    String[] negatedAuxiliaries = {
            "isn't", // is not
            "aren't", // are not
            "wasn't", // was not
            "weren't", // were not
            "haven't", // have not
            "hasn't", // has not
            "hadn't", // had not
            "won't", // will not
            "wouldn't", // would not
            "don't", // do not
            "doesn't", // does not
            "didn't", // did not
            "can't", // cannot
            "couldn't", // could not
            "shouldn't", // should not
            "mightn't", // might not
            "mustn't", // must not
            "shan't", // shall not
            "oughtn't" // ought not
    };
    String[] auxiliariesWithNot = {
            "is not",
            "are not",
            "was not",
            "were not",
            "have not",
            "has not",
            "had not",
            "will not",
            "would not",
            "do not",
            "does not",
            "did not",
            "cannot", // Note: "can not" is also used, but "cannot" is more common
            "could not",
            "should not",
            "might not",
            "must not",
            "shall not",
            "ought not"
    };
    String[] nounsAfterAll = {
            "all the people",
            "all the time",
            "all the things",
            "all the children",
            "all the students",
            "all the days",
            "all the efforts",
            "all the work",
            "all the men",
            "all the women",
            "all the options",
            "all the resources",
            "all the questions",
            "all the answers",
            "all the possibilities",
            "all the countries",
            "all the cities",
            "all the friends",
            "all the relatives",
            "all the details"
    };
    String[] nounsAfterAllSpanish = {
            "todas las personas",
            "todo el tiempo",
            "todas las cosas",
            "todos los niños",
            "todos los estudiantes",
            "todos los días",
            "todos los esfuerzos",
            "todo el trabajo",
            "todos los hombres",
            "todas las mujeres",
            "todas las opciones",
            "todos los recursos",
            "todas las preguntas",
            "todas las respuestas",
            "todas las posibilidades",
            "todos los países",
            "todas las ciudades",
            "todos los amigos",
            "todos los familiares",
            "todos los detalles"
    };


    public void all(){
        int r = (int)(Math.random()*nounsAfterAll.length);
        gens = nounsAfterAllSpanish[r];
        gene = nounsAfterAll[r];
    }

    // este metodo genera prepossiciones, articulos y objetos
    public String ob;
    public String eng;
    public static int j=0;
    public void vocab0a50(){
        if(j==alleng.length) {
            j=0;
        }
            ob=allsp[j];
            eng=alleng[j];
        j++;
    }
    public void prepartob() {
        int i = (int) (Math.random() * articles.length);
        int ii = (int) (Math.random() * soms.length);
        int iii = (int) (Math.random() * sofs.length);
        int iv = (int) (Math.random() * poms.length);
        int v = (int) (Math.random() * pofs.length);
        int vi = (int) (Math.random() * prep.length);
        String temp = articulos[i];
        switch (temp) {
            case "el ":
                ob = prepsp[vi] + articulos[i] + soms[ii];
                eng = prep[vi] + articles[0] + some[ii];
                break;
            case "la ":
                ob = prepsp[vi] + articulos[i] + sofs[iii];
                eng = prep[vi] + articles[1] + sofe[iii];
                break;
            case "los ":
                ob = prepsp[vi] + articulos[i] + poms[iv];
                eng = prep[vi] + articles[2] + pome[iv];
                break;
            case "las ":
                ob = prepsp[vi] + articulos[i] + pofs[v];
                eng = prep[vi] + articles[3] + pofe[v];
                break;
            case "un ":
                ob = prepsp[vi] + articulos[i] + soms[ii];
                eng = prep[vi] + articles[4] + some[ii];
                break;
            case "una ":
                ob = prepsp[vi] + articulos[i] + sofs[iii];
                eng = prep[vi] + articles[5] + sofe[iii];
                break;
            case "unos ":
                ob = prepsp[vi] + articulos[i] + poms[iv];
                eng = prep[vi] + articles[6] + pome[iv];
                break;
            case "unas ":
                ob = prepsp[vi] + articulos[i] + pofs[v];
                eng = prep[vi] + articles[7] + pofe[v];
                break;


        }


    }

    public void prepartob(int pos) {
        int i = (int) (Math.random() * articles.length);
        int ii = (int) (Math.random() * soms.length);
        int iii = (int) (Math.random() * sofs.length);
        int iv = (int) (Math.random() * poms.length);
        int v = (int) (Math.random() * pofs.length);

        String temp = articulos[i];
        switch (temp) {
            case "el ":
                ob = prepsp2[pos] + articulos[i] + soms[ii];
                eng = prep2[pos] + articles[0] + some[ii];
                break;
            case "la ":
                ob = prepsp2[pos] + articulos[i] + sofs[iii];
                eng = prep2[pos] + articles[1] + sofe[iii];
                break;
            case "los ":
                ob = prepsp2[pos] + articulos[i] + poms[iv];
                eng = prep2[pos] + articles[2] + pome[iv];
                break;
            case "las ":
                ob = prepsp2[pos] + articulos[i] + pofs[v];
                eng = prep2[pos] + articles[3] + pofe[v];
                break;
            case "un ":
                ob = prepsp2[pos] + articulos[i] + soms[ii];
                eng = prep2[pos] + articles[4] + some[ii];
                break;
            case "una ":
                ob = prepsp2[pos] + articulos[i] + sofs[iii];
                eng = prep2[pos] + articles[5] + sofe[iii];
                break;
            case "unos ":
                ob = prepsp2[pos] + articulos[i] + poms[iv];
                eng = prep2[pos] + articles[6] + pome[iv];
                break;
            case "unas ":
                ob = prepsp2[pos] + articulos[i] + pofs[v];
                eng = prep2[pos] + articles[7] + pofe[v];
                break;


        }


    }
    public void artob() {
        int i = (int) (Math.random() * 8);
        int ii = (int) (Math.random() * soms.length);
        int iii = (int) (Math.random() * sofs.length);
        int iv = (int) (Math.random() * poms.length);
        int v = (int) (Math.random() * pofs.length);
        String temp = articulos[i];
        switch (temp) {
            case "el ":
                ob =  articulos[i] + soms[ii];
                eng =  articles[0] + some[ii];
                break;
            case "la ":
                ob =  articulos[i] + sofs[iii];
                eng =  articles[1] + sofe[iii];
                break;
            case "los ":
                ob =  articulos[i] + poms[iv];
                eng =  articles[2] + pome[iv];
                break;
            case "las ":
                ob =  articulos[i] + pofs[v];
                eng =  articles[3] + pofe[v];
                break;
             case "un ":
                ob =  articulos[i] + soms[ii];
                eng =  articles[4] + some[ii];
                break;
            case "una ":
                ob =  articulos[i] + sofs[iii];
                eng =  articles[5] + sofe[iii];
                break;
            case "unos ":
                ob =  articulos[i] + poms[iv];
                eng =  articles[6] + pome[iv];
                break;
            case "unas ":
                ob =  articulos[i] + pofs[v];
                eng =  articles[7] + pofe[v];
                break;


        }


    }
    public void atmeth(int pos) {

        int locationIndex = (int) (Math.random() * lugaresEn.length); // Use the length of the Spanish or English locations array

        // Construct the sentence in Spanish and English using the selected preposition and location
        ob = prepsp2[pos] + lugaresEn[locationIndex]; // Spanish sentence
        eng = prep2[pos] +  placesAt[locationIndex]; // English sentence
    }

    public void artob(int artpos) {
        int i = (int) (Math.random() * 4);
        int ii = (int) (Math.random() * soms.length);
        int iii = (int) (Math.random() * sofs.length);
        int iv = (int) (Math.random() * poms.length);
        int v = (int) (Math.random() * pofs.length);
        String temp = articulos[i];

        if(artpos==0){
            switch (temp) {
                case "el ":
                    ob =  articulos[i] + soms[ii];
                    eng =  articles[0] + some[ii];
                    break;
                case "la ":
                    ob =  articulos[i] + sofs[iii];
                    eng =  articles[1] + sofe[iii];
                    break;
                case "los ":
                    ob =  articulos[i] + poms[iv];
                    eng =  articles[2] + pome[iv];
                    break;
                case "las ":
                    ob =  articulos[i] + pofs[v];
                    eng =  articles[3] + pofe[v];
                    break;



            }

        }




    }
    public void artoba() {
        int i = new java.util.Random().nextBoolean() ? 5 : 4;
        int ii = (int) (Math.random() * soms.length);
        int iii = (int) (Math.random() * sofs.length);
        String temp = articulos[i];
        switch (temp) {
            case "un ":
                ob =  articulos[i] + soms[ii];
                eng =  articles[4] + some[ii];
                break;
            case "una ":
                ob =  articulos[i] + sofs[iii];
                eng =  articles[5] + sofe[iii];
                break;



        }





    }

    // pronouns and verbs
    String gens;
    String gene;

    public void pronverb() {
        int i = (int) (Math.random() * pronombres.length);
        int iv = (int) (Math.random() * vib.length);
        String temp1 = pronombres[i];
        int iii = (int) (Math.random() * 2);
        switch (temp1) {
            case "yo ":
                switch (iii) {
                    case 0:
                        gens = pronombres[0] + vib1[iv];
                        gene = pronoun[0] + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[0] + "no " + vib1[iv];
                        gene = pronoun[0] + "don't " + vib[iv];
                        break;
                }
                break;
            case "tú ":
                switch (iii) {
                    case 0:
                        gens = pronombres[1] + vib2[iv];
                        gene = pronoun[1] + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[1] + "no " + vib2[iv];
                        gene = pronoun[1] + "don't " + vib[iv];
                        break;
                }
                break;
            case "él ":
                switch (iii) {

                    case 0:
                        gens = pronombres[2] + vib3esp[iv];
                        gene = pronoun[2] + vib3[iv];
                        break;

                    case 1:
                        gens = pronombres[2] + "no " + vib3esp[iv];
                        gene = pronoun[2] + "doesn't " + vib[iv];
                        break;

                }
                break;
            case "ella ":
                switch (iii) {
                    case 0:
                        gens = pronombres[3] + vib3esp[iv];
                        gene = pronoun[3] + vib3[iv];
                        break;

                    case 1:
                        gens = pronombres[3] + "no " + vib3esp[iv];
                        gene = pronoun[3] + "doesn't " + vib[iv];
                        break;

                }
                break;
            case "eso ":
                switch (iii) {
                    case 0:
                        gens = pronombres[4] + vib3esp[iv];
                        gene = pronoun[4] + vib3[iv];
                        break;
                    case 1:
                        gens = pronombres[4] + "no " + vib3esp[iv];
                        gene = pronoun[4] + "doesn't " + vib[iv];
                        break;
                }
                break;
            case "ellos ":
                switch (iii) {
                    case 0:
                        gens = pronombres[5] + vib3p[iv];
                        gene = pronoun[5] + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[5] + "no " + vib3p[iv];
                        gene = pronoun[5] + "don't " + vib[iv];
                        break;

                }
                break;
            case "nosotros ":
                switch (iii) {
                    case 0:
                        gens = pronombres[6] + vibnos[iv];
                        gene = pronoun[6] + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[6] + "no " + vibnos[iv];
                        gene = pronoun[6] + "don't " + vib[iv];
                        break;
                }
                break;
        }
    }
    public void pronverbif() {
        int i = (int) (Math.random() * pronombres.length);
        int iv = (int) (Math.random() * vib.length);
        String temp1 = pronombres[i];
        int iii = (int) (Math.random() * 2);
        switch (temp1) {
            case "yo ":
                switch (iii) {
                    case 0:
                        gens = "si " + pronombres[0] + vib1[iv];
                        gene = "if " + pronoun[0] + vib[iv];
                        break;
                    case 1:
                        gens = "si " + pronombres[0] + "no " + vib1[iv];
                        gene = "if " + pronoun[0] + "don't " + vib[iv];
                        break;
                }
                break;
            case "tú ":
                switch (iii) {
                    case 0:
                        gens = "si " + pronombres[1] + vib2[iv];
                        gene = "if " + pronoun[1] + vib[iv];
                        break;
                    case 1:
                        gens = "si " + pronombres[1] + "no " + vib2[iv];
                        gene = "if " + pronoun[1] + "don't " + vib[iv];
                        break;
                }
                break;
            case "él ":
                switch (iii) {
                    case 0:
                        gens = "si " + pronombres[2] + vib3esp[iv];
                        gene = "if " + pronoun[2] + vib3[iv];
                        break;
                    case 1:
                        gens = "si " + pronombres[2] + "no " + vib3esp[iv];
                        gene = "if " + pronoun[2] + "doesn't " + vib[iv];
                        break;
                }
                break;
            case "ella ":
                switch (iii) {
                    case 0:
                        gens = "si " + pronombres[3] + vib3esp[iv];
                        gene = "if " + pronoun[3] + vib3[iv];
                        break;
                    case 1:
                        gens = "si " + pronombres[3] + "no " + vib3esp[iv];
                        gene = "if " + pronoun[3] + "doesn't " + vib[iv];
                        break;
                }
                break;
            case "eso ":
                switch (iii) {
                    case 0:
                        gens = "si " + pronombres[4] + vib3esp[iv];
                        gene = "if " + pronoun[4] + vib3[iv];
                        break;
                    case 1:
                        gens = "si " + pronombres[4] + "no " + vib3esp[iv];
                        gene = "if " + pronoun[4] + "doesn't " + vib[iv];
                        break;
                }
                break;
            case "ellos ":
                switch (iii) {
                    case 0:
                        gens = "si " + pronombres[5] + vib3p[iv];
                        gene = "if " + pronoun[5] + vib[iv];
                        break;
                    case 1:
                        gens = "si " + pronombres[5] + "no " + vib3p[iv];
                        gene = "if " + pronoun[5] + "don't " + vib[iv];
                        break;
                }
                break;
            case "nosotros ":
                switch (iii) {
                    case 0:
                        gens = "si " + pronombres[6] + vibnos[iv];
                        gene = "if " + pronoun[6] + vib[iv];
                        break;
                    case 1:
                        gens = "si " + pronombres[6] + "no " + vibnos[iv];
                        gene = "if " + pronoun[6] + "don't " + vib[iv];
                        break;
                }
                break;
        }
    }


    public void pronverb(String pronom) {

        int iv = (int) (Math.random() * vib.length);
        String temp1 = pronom;
        int iii = (int) (Math.random() * 2);
        switch (temp1) {
            case "yo ":
                switch (iii) {
                    case 0:
                        gens = pronombres[0] + vib1[iv];
                        gene = pronoun[0] + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[0] + "no " + vib1[iv];
                        gene = pronoun[0] + "don't " + vib[iv];
                        break;
                }
                break;
            case "tú ":
                switch (iii) {
                    case 0:
                        gens = pronombres[1] + vib2[iv];
                        gene = pronoun[1] + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[1] + "no " + vib2[iv];
                        gene = pronoun[1] + "don't " + vib[iv];
                        break;
                }
                break;
            case "él ":
                switch (iii) {

                    case 0:
                        gens = pronombres[2] + vib3esp[iv];
                        gene = pronoun[2] + vib3[iv];
                        break;

                    case 1:
                        gens = pronombres[2] + "no " + vib3esp[iv];
                        gene = pronoun[2] + "doesn't " + vib[iv];
                        break;

                }
                break;
            case "ella ":
                switch (iii) {
                    case 0:
                        gens = pronombres[3] + vib3esp[iv];
                        gene = pronoun[3] + vib3[iv];
                        break;

                    case 1:
                        gens = pronombres[3] + "no " + vib3esp[iv];
                        gene = pronoun[3] + "doesn't " + vib[iv];
                        break;

                }
                break;
            case "eso ":
                switch (iii) {
                    case 0:
                        gens = pronombres[4] + vib3esp[iv];
                        gene = pronoun[4] + vib3[iv];
                        break;
                    case 1:
                        gens = pronombres[4] + "no " + vib3esp[iv];
                        gene = pronoun[4] + "doesn't " + vib[iv];
                        break;
                }
                break;
            case "ellos ":
                switch (iii) {
                    case 0:
                        gens = pronombres[5] + vib3p[iv];
                        gene = pronoun[5] + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[5] + "no " + vib3p[iv];
                        gene = pronoun[5] + "don't " + vib[iv];
                        break;

                }
                break;
            case "nosotros ":
                switch (iii) {
                    case 0:
                        gens = pronombres[6] + vibnos[iv];
                        gene = pronoun[6] + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[6] + "no " + vibnos[iv];
                        gene = pronoun[6] + "don't " + vib[iv];
                        break;
                }
                break;
        }
    }
    public void pronverb(int verpos) {

        int i = (int) (Math.random() * pronombres.length);

        String temp1 = pronombres[i];
        int iii = (int) (Math.random() * 2);
        switch (temp1) {
            case "yo ":
                switch (iii) {
                    case 0:
                        gens = pronombres[0] + vib1[verpos];
                        gene = pronoun[0] + vibdo[verpos];
                        break;
                    case 1:
                        gens = pronombres[0] + "no " + vib1[verpos];
                        gene = pronoun[0] + "don't " + vibdo[verpos];
                        break;
                }
                break;
            case "tú ":
                switch (iii) {
                    case 0:
                        gens = pronombres[1] + vib2[verpos];
                        gene = pronoun[1] + vibdo[verpos];
                        break;
                    case 1:
                        gens = pronombres[1] + "no " + vib2[verpos];
                        gene = pronoun[1] + "don't " + vibdo[verpos];
                        break;
                }
                break;
            case "él ":
                switch (iii) {

                    case 0:
                        gens = pronombres[2] + vib3esp[verpos];
                        gene = pronoun[2] + vib3do[verpos];
                        break;

                    case 1:
                        gens = pronombres[2] + "no " + vib3esp[verpos];
                        gene = pronoun[2] + "doesn't " + vibdo[verpos];
                        break;

                }
                break;
            case "ella ":
                switch (iii) {
                    case 0:
                        gens = pronombres[3] + vib3esp[verpos];
                        gene = pronoun[3] + vib3do[verpos];
                        break;

                    case 1:
                        gens = pronombres[3] + "no " + vib3esp[verpos];
                        gene = pronoun[3] + "doesn't " + vibdo[verpos];
                        break;

                }
                break;
            case "eso ":
                switch (iii) {
                    case 0:
                        gens = pronombres[4] + vib3esp[verpos];
                        gene = pronoun[4] + vib3do[verpos];
                        break;
                    case 1:
                        gens = pronombres[4] + "no " + vib3esp[verpos];
                        gene = pronoun[4] + "doesn't " + vibdo[verpos];
                        break;
                }
                break;
            case "ellos ":
                switch (iii) {
                    case 0:
                        gens = pronombres[5] + vib3p[verpos];
                        gene = pronoun[5] + vibdo[verpos];
                        break;
                    case 1:
                        gens = pronombres[5] + "no " + vib3p[verpos];
                        gene = pronoun[5] + "don't " + vibdo[verpos];
                        break;

                }
                break;
            case "nosotros ":
                switch (iii) {
                    case 0:
                        gens = pronombres[6] + vibnos[verpos];
                        gene = pronoun[6] + vibdo[verpos];
                        break;
                    case 1:
                        gens = pronombres[6] + "no " + vibnos[verpos];
                        gene = pronoun[6] + "don't " + vibdo[verpos];
                        break;
                }
                break;
        }
    }

    //adjectives
    public void adjmethod() {
        int adjt = (int) (Math.random() * adj.length);
        int i = (int) (Math.random() * sust.length);
        String tempadj = adj[adjt];
        switch (tempadj)  {
            case "this ":
                gens = adje[adjt] + sust[i];
                gene = adj[adjt] + noun[i];
                break;
            case "his ":
                gens = adje[adjt] + sust[i] + "(de él)";
                gene = adj[adjt] + noun[i];
                break;

            case "her ":
                gens = adje[adjt] + sust[i] + "(de ella)";
                gene = adj[adjt] + noun[i];
                break;

            case "their ":
                gens = adje[adjt] + sust[i] + "(de ellos)";
                gene = adj[adjt] + noun[i];
                break;

            case "that ":
                gens = adje[adjt] + sust[i];
                gene = adj[adjt] + noun[i];
                break;
        }

    }
    public void adjmethod(String adjective) {


        int i = (int) (Math.random() * sust.length);
        String tempadj = adjective;
        switch (tempadj)  {
            case "this ":
                gens = adje[0] + sust[i];
                gene = adj[0] + noun[i];
                break;
            case "his ":
                gens = adje[1] + sust[i] + "(de él)";
                gene = adj[1] + noun[i];
                break;

            case "her ":
                gens = adje[2] + sust[i] + "(de ella)";
                gene = adj[2] + noun[i];
                break;

            case "their ":
                gens = adje[3] + sust[i] + "(de ellos)";
                gene = adj[3] + noun[i];
                break;

            case "that ":
                gens = adje[4] + sust[i];
                gene = adj[4] + noun[i];
                break;
            case "my ":
                gens = "mi " + sust[i];
                gene = "my " + noun[i];
                break;
        }

    }

    //added adv
    public void advpronverb() {
        int i = (int) (Math.random() * pronombres.length);
        int iv = (int) (Math.random() * vib.length);
        int ii = (int) (Math.random() * adv.length);
        String temp1 = pronombres[i];
        int iii = (int) (Math.random() * 2);
        switch (temp1) {
            case "yo ":
                switch (iii) {
                    case 0:
                        gens = adver[ii] + pronombres[0] + vib1[iv];
                        gene = adv[ii] + pronoun[0] + vib[iv];
                        break;
                    case 1:
                        gens = adver[ii] + pronombres[0] + "no " + vib1[iv];
                        gene = adv[ii] + pronoun[0] + "don't " + vib[iv];
                        break;
                }
                break;
            case "tú ":
                switch (iii) {
                    case 0:
                        gens = adver[ii] + pronombres[1] + vib2[iv];
                        gene = adv[ii] + pronoun[1] + vib[iv];
                        break;
                    case 1:
                        gens = adver[ii] + pronombres[1] + "no " + vib2[iv];
                        gene = adv[ii] + pronoun[1] + "don't " + vib[iv];
                        break;
                }
                break;
            case "él ":
                switch (iii) {

                    case 0:
                        gens = adver[ii] + pronombres[2] + vib3esp[iv];
                        gene = adv[ii] + pronoun[2] + vib3[iv];
                        break;

                    case 1:
                        gens = adver[ii] + pronombres[2] + "no " + vib3esp[iv];
                        gene = adv[ii] +  pronoun[2] + "doesn't " + vib[iv];
                        break;

                }
                break;
            case "ella ":
                switch (iii) {
                    case 0:
                        gens = adver[ii] + pronombres[3] + vib3esp[iv];
                        gene = adv[ii] +  pronoun[3] + vib3[iv];
                        break;

                    case 1:
                        gens = adver[ii] + pronombres[3] + "no " + vib3esp[iv];
                        gene = adv[ii] +  pronoun[3] + "doesn't " + vib[iv];
                        break;

                }
                break;
            case "eso ":
                switch (iii) {
                    case 0:
                        gens = adver[ii] + pronombres[4] + vib3esp[iv];
                        gene = adv[ii] + pronoun[4] + vib3[iv];
                        break;
                    case 1:
                        gens = adver[ii] + pronombres[4] + "no " + vib3esp[iv];
                        gene = adv[ii] + pronoun[4] + "doesn't " + vib[iv];
                        break;
                }
                break;
            case "ellos ":
                switch (iii) {
                    case 0:
                        gens = adver[ii] + pronombres[5] + vib3p[iv];
                        gene = adv[ii] + pronoun[5] + vib[iv];
                        break;
                    case 1:
                        gens = adver[ii] + pronombres[5] + "no " + vib3p[iv];
                        gene = adv[ii] + pronoun[5] + "don't " + vib[iv];
                        break;

                }
                break;
            case "nosotros ":
                switch (iii) {
                    case 0:
                        gens = adver[ii] + pronombres[6] + vibnos[iv];
                        gene = adv[ii] + pronoun[6] + vib[iv];
                        break;
                    case 1:
                        gens = adver[ii] + pronombres[6] + "no " + vibnos[iv];
                        gene = adv[ii] + pronoun[6] + "don't " + vib[iv];
                        break;
                }
                break;
        }
    }
    public void advpronverb(int advPos) {
        int i = (int) (Math.random() * pronombres.length);
        int iv = (int) (Math.random() * vib.length);
       // int ii = (int) (Math.random() * adv.length);
        String temp1 = pronombres[i];
        int iii = (int) (Math.random() * 2);
        switch (temp1) {
            case "yo ":
                switch (iii) {
                    case 0:
                        gens = adver[advPos] + pronombres[0] + vib1[iv];
                        gene = adv[advPos] + pronoun[0] + vib[iv];
                        break;
                    case 1:
                        gens = adver[advPos] + pronombres[0] + "no " + vib1[iv];
                        gene = adv[advPos] + pronoun[0] + "don't " + vib[iv];
                        break;
                }
                break;
            case "tú ":
                switch (iii) {
                    case 0:
                        gens = adver[advPos] + pronombres[1] + vib2[iv];
                        gene = adv[advPos] + pronoun[1] + vib[iv];
                        break;
                    case 1:
                        gens = adver[advPos] + pronombres[1] + "no " + vib2[iv];
                        gene = adv[advPos] + pronoun[1] + "don't " + vib[iv];
                        break;
                }
                break;
            case "él ":
                switch (iii) {

                    case 0:
                        gens = adver[advPos] + pronombres[2] + vib3esp[iv];
                        gene = adv[advPos] + pronoun[2] + vib3[iv];
                        break;

                    case 1:
                        gens = adver[advPos] + pronombres[2] + "no " + vib3esp[iv];
                        gene = adv[advPos] +  pronoun[2] + "doesn't " + vib[iv];
                        break;

                }
                break;
            case "ella ":
                switch (iii) {
                    case 0:
                        gens = adver[advPos] + pronombres[3] + vib3esp[iv];
                        gene = adv[advPos] +  pronoun[3] + vib3[iv];
                        break;

                    case 1:
                        gens = adver[advPos] + pronombres[3] + "no " + vib3esp[iv];
                        gene = adv[advPos] +  pronoun[3] + "doesn't " + vib[iv];
                        break;

                }
                break;
            case "eso ":
                switch (iii) {
                    case 0:
                        gens = adver[advPos] + pronombres[4] + vib3esp[iv];
                        gene = adv[advPos] + pronoun[4] + vib3[iv];
                        break;
                    case 1:
                        gens = adver[advPos] + pronombres[4] + "no " + vib3esp[iv];
                        gene = adv[advPos] + pronoun[4] + "doesn't " + vib[iv];
                        break;
                }
                break;
            case "ellos ":
                switch (iii) {
                    case 0:
                        gens = adver[advPos] + pronombres[5] + vib3p[iv];
                        gene = adv[advPos] + pronoun[5] + vib[iv];
                        break;
                    case 1:
                        gens = adver[advPos] + pronombres[5] + "no " + vib3p[iv];
                        gene = adv[advPos] + pronoun[5] + "don't " + vib[iv];
                        break;

                }
                break;
            case "nosotros ":
                switch (iii) {
                    case 0:
                        gens = adver[advPos] + pronombres[6] + vibnos[iv];
                        gene = adv[advPos] + pronoun[6] + vib[iv];
                        break;
                    case 1:
                        gens = adver[advPos] + pronombres[6] + "no " + vibnos[iv];
                        gene = adv[advPos] + pronoun[6] + "don't " + vib[iv];
                        break;
                }
                break;
        }
    }

    // los del will
    public void pronverbwill() {
        int i = (int) (Math.random() * pronombres.length);
        int iv = (int) (Math.random() * vib.length);
        String temp1 = pronombres[i];
        int iii = (int) (Math.random() * 2);
        switch (temp1) {
            case "yo ":
                switch (iii) {
                    case 0:
                        gens = pronombres[0] + verbo1f[iv];
                        gene = pronoun[0] + "will " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[0] + "no " + verbo1f[iv];
                        gene = pronoun[0] + "won't " + vib[iv];
                        break;
                }
                break;
            case "tú ":
                switch (iii) {
                    case 0:
                        gens = pronombres[1] + verbo2f[iv];
                        gene = pronoun[1] + "will " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[1] + "no " + verbo2f[iv];
                        gene = pronoun[1] + "won't " + vib[iv];
                        break;
                }
                break;
            case "él ":
                switch (iii) {

                    case 0:
                        gens = pronombres[2] + verbo3f[iv];
                        gene = pronoun[2] + "will " + vib[iv];
                        break;

                    case 1:
                        gens = pronombres[2] + "no " + verbo3f[iv];
                        gene = pronoun[2] + "won't " + vib[iv];
                        break;

                }
                break;
            case "ella ":
                switch (iii) {
                    case 0:
                        gens = pronombres[3] + verbo3f[iv];
                        gene = pronoun[3] + "will " + vib[iv];
                        break;

                    case 1:
                        gens = pronombres[3] + "no " + verbo3f[iv];
                        gene = pronoun[3] + "won't " + vib[iv];
                        break;

                }
                break;
            case "eso ":
                switch (iii) {
                    case 0:
                        gens = pronombres[4] + verbo3f[iv];
                        gene = pronoun[4] + "will " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[4] + "no " + verbo3f[iv];
                        gene = pronoun[4] + "won't " + vib[iv];
                        break;
                }
                break;
            case "ellos ":
                switch (iii) {
                    case 0:
                        gens = pronombres[5] + verbos4f[iv];
                        gene = pronoun[5] + "will " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[5] + "no " + verbos4f[iv];
                        gene = pronoun[5] + "won't " + vib[iv];
                        break;

                }
                break;
            case "nosotros ":
                switch (iii) {
                    case 0:
                        gens = pronombres[6] + verbos5f[iv];
                        gene = pronoun[6] + "will " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[6] + "no " + verbos5f[iv];
                        gene = pronoun[6] + "won't " + vib[iv];
                        break;
                }
                break;
        }
    }

    // los del would
    public void pronverbwould() {
        int i = (int) (Math.random() * pronombres.length);
        int iv = (int) (Math.random() * vib.length);
        String temp1 = pronombres[i];
        int iii = (int) (Math.random() * 2);
        switch (temp1) {
            case "yo ":
                switch (iii) {
                    case 0:
                        gens = pronombres[0] + verbo1hip[iv];
                        gene = pronoun[0] + "would " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[0] + "no " + verbo1hip[iv];
                        gene = pronoun[0] + "wouldn't " + vib[iv];
                        break;
                }
                break;
            case "tú ":
                switch (iii) {
                    case 0:
                        gens = pronombres[1] + verbo2hip[iv];
                        gene = pronoun[1] + "would " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[1] + "no " + verbo2hip[iv];
                        gene = pronoun[1] + "wouldn't " + vib[iv];
                        break;
                }
                break;
            case "él ":
                switch (iii) {

                    case 0:
                        gens = pronombres[2] + verbo3hip[iv];
                        gene = pronoun[2] + "would " + vib[iv];
                        break;

                    case 1:
                        gens = pronombres[2] + "no " + verbo3hip[iv];
                        gene = pronoun[2] + "wouldn't " + vib[iv];
                        break;

                }
                break;
            case "ella ":
                switch (iii) {
                    case 0:
                        gens = pronombres[3] + verbo3hip[iv];
                        gene = pronoun[3] + "would " + vib[iv];
                        break;

                    case 1:
                        gens = pronombres[3] + "no " + verbo3hip[iv];
                        gene = pronoun[3] + "wouldn't " + vib[iv];
                        break;

                }
                break;
            case "eso ":
                switch (iii) {
                    case 0:
                        gens = pronombres[4] + verbo3hip[iv];
                        gene = pronoun[4] + "would " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[4] + "no " + verbo3hip[iv];
                        gene = pronoun[4] + "wouldn't " + vib[iv];
                        break;
                }
                break;
            case "ellos ":
                switch (iii) {
                    case 0:
                        gens = pronombres[5] + verbos4hip[iv];
                        gene = pronoun[5] + "would " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[5] + "no " + verbos4hip[iv];
                        gene = pronoun[5] + "wouldn't " + vib[iv];
                        break;

                }
                break;
            case "nosotros ":
                switch (iii) {
                    case 0:
                        gens = pronombres[6] + verbos5hip[iv];
                        gene = pronoun[6] + "would " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[6] + "no " + verbos5hip[iv];
                        gene = pronoun[6] + "wouldn't " + vib[iv];
                        break;
                }
                break;
        }
    }

    // los del would
    public void pronverbcan() {
        int i = (int) (Math.random() * pronombres.length);
        int iv = (int) (Math.random() * vib.length);
        String temp1 = pronombres[i];
        int iii = (int) (Math.random() * 2);
        switch (temp1) {
            case "yo ":
                switch (iii) {
                    case 0:
                        gens = pronombres[0] + "puedo " + verbos[iv];
                        gene = pronoun[0] + "can " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[0] + "no puedo " + verbos[iv];
                        gene = pronoun[0] + "can't " + vib[iv];
                        break;
                }
                break;
            case "tú ":
                switch (iii) {
                    case 0:
                        gens = pronombres[1] + "puedes " + verbos[iv];
                        gene = pronoun[1] + "can " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[1] + "no puedes " + verbos[iv];
                        gene = pronoun[1] + "can't " + vib[iv];
                        break;
                }
                break;
            case "él ":
                switch (iii) {

                    case 0:
                        gens = pronombres[2] + "puede " + verbos[iv];
                        gene = pronoun[2] + "can " + vib[iv];
                        break;

                    case 1:
                        gens = pronombres[2] + "no puede " + verbos[iv];
                        gene = pronoun[2] + "can't " + vib[iv];
                        break;

                }
                break;
            case "ella ":
                switch (iii) {
                    case 0:
                        gens = pronombres[3] + "puede " + verbos[iv];
                        gene = pronoun[3] + "can " + vib[iv];
                        break;

                    case 1:
                        gens = pronombres[3] + "no puede " + verbos[iv];
                        gene = pronoun[3] + "can't " + vib[iv];
                        break;

                }
                break;
            case "eso ":
                switch (iii) {
                    case 0:
                        gens = pronombres[4] + "puede " + verbos[iv];
                        gene = pronoun[4] + "can " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[4] + "no puede " + verbos[iv];
                        gene = pronoun[4] + "can't " + vib[iv];
                        break;
                }
                break;
            case "ellos ":
                switch (iii) {
                    case 0:
                        gens = pronombres[5] + "pueden " + verbos[iv];
                        gene = pronoun[5] + "can " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[5] + "no pueden " + verbos[iv];
                        gene = pronoun[5] + "can't " + vib[iv];
                        break;

                }
                break;
            case "nosotros ":
                switch (iii) {
                    case 0:
                        gens = pronombres[6] + "podemos " + verbos[iv];
                        gene = pronoun[6] + "can " + vib[iv];
                        break;
                    case 1:
                        gens = pronombres[6] + "no podemos " + verbos[iv];
                        gene = pronoun[6] + "can't " + vib[iv];
                        break;
                }
                break;
        }
    }

    // to be
    public void tobe() {
        int t = (int) (Math.random() * pronombres.length);
        String tempt = pronombres[t];
        int s = (int) (Math.random() * ser.length);
        switch (tempt) {
            case "yo ":
                gens = "yo soy";
                gene = "I am";
                break;

            case "tú ":
                gens = "tú eres";
                gene = "you are";
                break;

            case "él ":
                gens = "él es";
                gene = "he is";
                break;

            case "ella ":
                gens = "ella es";
                gene = "she is";
                break;

            case "eso ":
                gens = "eso es";
                gene = "it is";
                break;

            case "nosotros ":
                gens = "nosotros somos";
                gene = "we are";
                break;

            case "ellos ":
                gens = "ellos son";
                gene = "they are";
                break;
        }

    }
    public void genWho() {
        int t = (int) (Math.random() * pronombres.length);
        String tempt = pronombres[t];
        switch (tempt) {
            case "yo ":
                gens = "quién soy yo";
                gene = "who am I";
                break;

            case "tú ":
                gens = "quién eres tú";
                gene = "who are you";
                break;

            case "él ":
                gens = "quién es él";
                gene = "who is he";
                break;

            case "ella ":
                gens = "quién es ella";
                gene = "who is she";
                break;

            case "eso ":
                gens = "quién es eso";
                gene = "who is it";
                break;

            case "nosotros ":
                gens = "quién somos nosotros";
                gene = "who are we";
                break;

            case "ellos ":
                gens = "quién son ellos";
                gene = "who are they";
                break;
        }
    }

   public void not(){
        int not = (int)(Math.random()*auxiliariesWithNot.length);
        eng = auxiliariesWithNot[not];
   }
    public void nt(){
        int not = (int)(Math.random()*negatedAuxiliaries.length);
        eng = negatedAuxiliaries[not];
    }
    public void or(){
        int lugares = (int)(Math.random()*lugaresEn.length);
        ob= "o " + lugaresEn[lugares];
        eng= "or " + placesAt[lugares];
    }
    String [] make = {"I make", "you make" , "he makes", "she makes", "we make","they make"};

    String[] hacer = {
            "yo hago",
            "tú haces",
            "él hace",
            "ella hace",
            "nosotros hacemos",
            "ellos hacen"
    };

    public void make(){
        int m = (int)(Math.random()* make.length);
        gens = hacer[m];
        gene = make[m];
    }
}

