package com.leal.cipm_testing;

public class C350a400 {

    String alleng[]={
            "war ", "history ", "party ", "within ", "to grow ", "result ", "open ",
            "change ", "morning ", "to walk ", "reason ", "low ", "to win ", "to research ",
            "girl ", "guy ", "early ", "food ", "before ", "moment ", "himself ", "to air ",
            "teacher ", "to force ", "to offer ", "enough ", "both ", "education ", "across ",
            "although ", "to remember ", "foot ", "second ", "boy ", "maybe ", "toward ",
            "able ", "age ", "off  ", "policy ", "everything ", "love ", "to process ",
            "music ", "including ", "to consider ", "to appear ", "actually ", "to buy ",
            "probably "
    };

    String allsp[]={
            "guerra ", "historia ", "fiesta ", "dentro de ", "crecer ", "resultado ", "abierto o abrir ",
            "cambiar ", "mañana ", "caminar ", "razón ", "bajo ", "ganar ", "investigar ",
            "niña ", "tipo (forma de llamar a un chico) ", "temprano ", "comida ", "antes ", "momento ",
            "él mismo ", "ventilar ", "profesor ", "forzar ", "ofrecer ", "suficiente ",
            "ambos ", "educación ", "a través de ", "aunque ", "recordar ", "pie ", "segundo o segunda ",
            "niño ", "tal vez ", "hacia ", "capaz ", "edad ", "apagado ", "política ",
            "toda o todo ", "amor ", "procesar ", "música ", "incluyendo ", "considerar ",
            "aparecer ", "realmente ", "comprar ", "problablemente "
    };

    String sust[] = {"la historia ",
            "la fiesta ", "el resultado ", "la mañana ", "la razón ", "la investigación ",
            "la niña ", "el chavo ", "la comida ", "el momento ",
            "el aire ", "el maestro ", "la fueraza ", "la educación ", "el pie ",
            "el segundo ", "el niño ", "la edad ", "la politica ", "todo ", "el proceso ",
            "la música ", "el humano "
    };

    String noun[] = {"history ", "party ", "result ", "morning ",
            "reason ", "research ", "girl ", "guy ", "food ", "moment ",
            "air ", "teacher ", "force ", "education ", "foot ",
            "second ", "boy ", "age ", "policy ", "everything ",
            "process ", "music ", "human "
    };

    String prep[] = {"dentro de ", "cruzando ", "hacia ", "dentro de ", "hacia "};
    String prp[] = {"within ", "across ", "toward ", "within ", "toward "};

    String pronoun[] = {"I ", "you ", "he ", "she ", "it ", "we ", "they "};
    String pronombres[] = {"yo ", "tú ", "él ", "ella ", "eso ", "nosotros ", "ellos "};

    String verb[] = {"grow ", "open ", "walk ", "win ", "offer ", "remember ",
            "love ", "consider ", "appear ", "buy ", "include "
    };
    String verb3[] = {"grows ", "opens ", "walks ", "wins ", "offers ", "remembers ",
            "loves ", "considers ", "appears ", "buys ", "includes "
    };
    String v1[] = {"crezco ", "abro ", "camino ", "gano ", "ofrezco ",
            "recuerdo ", "amo ", "considero ", "aparezco ", "compro ", "incluyo "
    };

    String v2[] = {"creces ", "abres ", "caminas ", "ganas ", "ofreces ",
            "recuerdas ", "amas ", "consideras ", "apareces ", "compras ", "incluyes "
    };


    String v3[] = {"crece ", "abre ", "camina ", "gana ", "ofrece ",
            "recuerda ", "ama ", "considera ", "aparece ", "compra ", "incluye "
    };

    String v4[] = {"crecen ", "abren ", "caminan ", "ganan ", "ofrecen ",
            "recuerdan ", "aman ", "consideran ", "aparecen ", "compran ", "incluyen "
    };


    String v5[] = {"crecemos ", "abrimos ", "caminamos ", "ganamos ", "ofrecemos ",
            "recordamos ", "amamos ", "consideramos ", "aparecemos ", "compramos ", "incluimos "
    };


    String ad[] = {"probably ", "actually ", "maybe "};
    String adv[] = {"probablemente ", "realmente ", "quiza "};

    String obj[] = {"education ", "force ", "life "};
    String obje[] = {"la educación ", "la fuerza ", "la vida "};

    String adj[] = {"low ", "early ", "enough ", "able"};
    String adjs[] = {"baja ", "temprana ", "suficiente ", "capaz"};


    String gens;
    String gene;

    public String ob;
    public String eng;
    public static int j=0;
    public void vocab350a400(){
        if(j==alleng.length) {
            j=0;
        }
        ob=allsp[j];
        eng=alleng[j];
        j++;

    }

    public void prepn() {
        int p = (int) (Math.random() * prep.length);
        int n = (int) (Math.random() * noun.length);
        gens = prep[p] + sust[n];
        gene = prp[p] + "the " + noun[n];


    }

    public void verbsgen() {
        int p = (int) (Math.random() * pronombres.length);
        int v = (int) (Math.random() * verb.length);
        String temp = pronombres[p];
        switch (temp) {

            case "yo ":
                gens = pronombres[p] + v1[v];
                gene = pronoun[p] + verb[v];
                break;
            case "tú ":
                gens = pronombres[p] + v2[v];
                gene = pronoun[p] + verb[v];
                break;
            case "él ":
                gens = pronombres[p] + v3[v];
                gene = pronoun[p] + verb3[v];
                break;

            case "ella ":
                gens = pronombres[p] + v3[v];
                gene = pronoun[p] + verb3[v];
                break;
            case "eso ":
                gens = pronombres[p] + v3[v];
                gene = pronoun[p] + verb3[v];
                break;
            case "ellos ":
                gens = pronombres[p] + v4[v];
                gene = pronoun[p] + verb[v];
                break;
            case "nosotros ":
                gens = pronombres[p] + v5[v];
                gene = pronoun[p] + verb[v];
                break;


        }

    } // verbo y pronombre

    public void verbsgenprep() {
        int p = (int) (Math.random() * pronombres.length);
        int v = (int) (Math.random() * verb.length);
        int a = (int) (Math.random() * ad.length);
        String temp = pronombres[p];
        switch (temp) {

            case "yo ":
                gens = pronombres[p] + adv[a] + v1[v];
                gene = pronoun[p] + ad[a] + verb[v];
                break;
            case "tú ":
                gens = pronombres[p] + adv[a] + v2[v];
                gene = pronoun[p] + ad[a] + verb[v];
                break;
            case "él ":
                gens = pronombres[p] + adv[a] + v3[v];
                gene = pronoun[p] + ad[a] + verb3[v];
                break;

            case "ella ":
                gens = pronombres[p] + adv[a] + v3[v];
                gene = pronoun[p] + ad[a] + verb3[v];
                break;
            case "eso ":
                gens = pronombres[p] + adv[a] + v3[v];
                gene = pronoun[p] + ad[a] + verb3[v];
                break;
            case "ellos ":
                gens = pronombres[p] + adv[a] + v4[v];
                gene = pronoun[p] + ad[a] + verb[v];
                break;
            case "nosotros ":
                gens = pronombres[p] + adv[a] + v5[v];
                gene = pronoun[p] + ad[a] + verb[v];
                break;


        }

    } // verbo y pronombre

    public void verbsgenprepaltho() {
        int p = (int) (Math.random() * pronombres.length);
        int v = (int) (Math.random() * verb.length);
        int a = (int) (Math.random() * ad.length);
        String temp = pronombres[p];
        switch (temp) {

            case "yo ":
                gens = "aun que " + pronombres[p] + adv[a] + v1[v];
                gene = "although " + pronoun[p] + ad[a] + verb[v];
                break;
            case "tú ":
                gens = "aun que " + pronombres[p] + adv[a] + v2[v];
                gene = "although " + pronoun[p] + ad[a] + verb[v];
                break;
            case "él ":
                gens = "aun que " + pronombres[p] + adv[a] + v3[v];
                gene = "although " + pronoun[p] + ad[a] + verb3[v];
                break;

            case "ella ":
                gens = "aun que " + pronombres[p] + adv[a] + v3[v];
                gene = "although " + pronoun[p] + ad[a] + verb3[v];
                break;
            case "eso ":
                gens = "aun que " + pronombres[p] + adv[a] + v3[v];
                gene = "although " + pronoun[p] + ad[a] + verb3[v];
                break;
            case "ellos ":
                gens = "aun que " + pronombres[p] + adv[a] + v4[v];
                gene = "although " + pronoun[p] + ad[a] + verb[v];
                break;
            case "nosotros ":
                gens = "aun que " + pronombres[p] + adv[a] + v5[v];
                gene = "although " + pronoun[p] + ad[a] + verb[v];
                break;


        }

    } // verbo y pronombre

    public void ablemeth() {
        int o = (int) (Math.random() * obj.length);
        int a = (int) (Math.random() * adj.length);
        gens = obje[o] + "es " + adjs[a];
        gene = obj[o] + "is " + adj[a];


    }


}
