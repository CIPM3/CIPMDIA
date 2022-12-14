package com.leal.cipm_testing;

public class Nobles {


    //vnb verbos nobles top 100
    String vnb[] = {"have ", "get ", "see ", "need ", "know ", "find ", "take ", "want ", "include ",
            "thank ", "add ", "choose ", "develop ", "remember ", "bring ", "protect ",
            "avoid ", "describe ", "prefer ", "discover ", "expect ", "lose ", "hear ", "represent ",
            "forget ", "accept ", "compare ", "imagine ", "recognize ", "replace ", "borrow ", "examine ",
            "owe ", "incorporate ", "organize "
    };


    // verbos nobles base spanish
    String vnbs[] = {"tener ", "obtener ", "ver ", "necesitar ", "saber ", "encontrar ", "tomar ", "querer ", "incluir ",
            "agradecer ", "agregar ", "elegir ", "desarrollar ", "recordar ", "traer ", "protejer ",
            "evitar ", "describir ", "preferir ", "descubrir ", "esperar ", "perder ", "oir ", "representar ",
            "olvidar ", "aceptar ", "comparar ", "imaginar ", "reconocer ", "reemplazar ", "pedir prestado ", "examinar ",
            "deber ", "incorporar ", "organizar "
    };
    //vnb verbos nobles top 100  tercera persona inglés
    String vnb3[] = {"has ", "gets ", "sees ", "needs ", "knows ", "finds ", "takes ", "wants ", "includes ",
            "thanks ", "adds ", "chooses ", "develops ", "remembers ", "brings ", "protects ",
            "avoids ", "describes ", "prefers ", "discovers ", "expects ", "loses ", "hears ", "represents ",
            "forgets ", "accepts ", "compares ", "imagines ", "recognizes ", "replaces ", "borrows ", "examines ",
            "owes ", "incorporates ", "organizes "
    };

    //vnb verbos nobles top 100  primera persona esp
    String vn1[] = {"tengo ", "obtengo ", "veo ", "necesito ", "se ", "encuentro ", "tomo ", "quiero ", "incluyo ",
            "agradezco ", "agrego ", "eligo ", "desarrollo ", "recuerdo ", "traigo ", "protejo ",
            "evito ", "describo ", "prefiero ", "descubro ", "espero ", "pierdo ", "oigo ", "represento ",
            "olvido ", "acepto ", "comparo ", "imagino ", "reconozco ", "reemplazo ", "pido prestado ", "examino ",
            "debo ", "incorporo ", "organizo "
    };

    //vnb verbos nobles top 100  segunda persona esp
    String vn2[] = {"tienes ", "obtienes ", "ves ", "necesitas ", "sabes ", "encuentras ", "tomas ", "quieres ", "incluyes ",
            "agradeces ", "agregas ", "eliges ", "desarrollas ", "recuerdas ", "traes ", "proteges ",
            "evitas ", "describes ", "prefieres ", "descubres ", "esperas ", "pierdes ", "oyes ", "representas ",
            "olvidas ", "aceptas ", "comparas ", "imaginas ", "reconoces ", "reemplazas ", "pides prestado ", "examinas ",
            "debes ", "incorporas ", "organizas "
    };

    //vnb verbos nobles top 100  tercera persona esp
    String vn3[] = {"tiene ", "obtiene ", "ve ", "necesita ", "sabe ", "encuentra ", "toma ", "quiere ", "incluye ",
            "agradece ", "agrega ", "elige ", "desarrolla ", "recuerda ", "trae ", "protege ",
            "evita ", "describe ", "prefiere ", "descubre ", "espera ", "pierde ", "oye ", "representa ",
            "olvida ", "acepta ", "compara ", "imagina ", "reconoce ", "reemplaza ", "pide prestado ", "examina ",
            "debe ", "incorpora ", "organiza "
    };

    //vnb verbos nobles top 100  cuarta persona esp ellos
    String vn4[] = {"tienen ", "obtienen ", "ven ", "necesitan ", "saben ", "encuentran ", "toman ", "quieren ", "incluyen ",
            "agradecen ", "agregan ", "eligen ", "desarrollan ", "recuerdan ", "traen ", "protegen ",
            "evitan ", "describen ", "prefieren ", "descubren ", "esperan ", "pierden ", "oyen ", "representan ",
            "olvidan ", "aceptan ", "comparan ", "imaginan ", "reconocen ", "reemplazan ", "piden prestado ", "examinan ",
            "deben ", "incorporan ", "organizan "
    };


    //vnb verbos nobles top 100  quinta persona esp nosotros
    String vn5[] = {"tenemos ", "obtenemos ", "vemos ", "necesitamos ", "sabemos ", "encontramos ",
            "tomamos ", "queremos ", "incluimos ", "agradecemos ", "agregamos ", "elegimos ",
            "desarrollamos ", "recordamos ", "traemos ", "protegemos ", "evitamos ", "describimos ",
            "preferimos ", "descubrimos ", "esperamos ", "perdemos ", "oimos ", "representamos ",
            "olvidamos ", "aceptamos ", "compramos ", "imaginamos ", "reconocemos ", "reemplazamos ",
            "pedimos prestado ", "examinamos ", "debemos ", "incorporamos ", "organizamos "
    };

    //pasados (agregado wish SV 060422)
    String ps1wish[] = {"tuviera ", "obtuviera ", "viera ", "necesitara ", "supiera ", "encontrara ",
            "tomara ", "quisiera ", "incluyera ", "agradeciera ", "agregara ", "eligiera ",
            "desarrollara ", "recordara ", "trajera ", "protegiera ", "evitara ", "describiera ",
            "prefiriera ", "descubriera ", "esperara ", "perdiera ", "oyera ", "representara ",
            "olvidara ", "aceptara ", "comprara ", "imaginara ", "reconociera ", "reemplazara ",
            "pidiera prestado ", "examinara ", "debiera ", "incorporara ", "organizara "
    };
    String ps2wish[] = {"tuvieras ", "obtuvieras ", "vieras ", "necesitaras ", "supieras ", "encontraras ",
            "tomaras ", "quisieras ", "incluyeras ", "agradecieras ", "agregaras ", "eligieras ",
            "desarrollaras ", "recordaras ", "trajeras ", "protegieras ", "evitaras ", "describieras ",
            "prefirieras ", "descubrieras ", "esperaras ", "perdieras ", "oyeras ", "representaras ",
            "olvidaras ", "aceptaras ", "compraras ", "imaginaras ", "reconocieras ", "reemplazaras ",
            "pidieras prestado ", "examinaras ", "debieras ", "incorporaras ", "organizaras "
    };
    String ps3wish[] = {"tuviera ", "obtuviera ", "viera ", "necesitara ", "supiera ", "encontrara ",
            "tomara ", "quisiera ", "incluyera ", "agradeciera ", "agregara ", "eligiera ",
            "desarrollara ", "recordara ", "trajera ", "protegiera ", "evitara ", "describiera ",
            "prefiriera ", "descubriera ", "esperara ", "perdiera ", "oyera ", "representara ",
            "olvidara ", "aceptara ", "comprara ", "imaginara ", "reconociera ", "reemplazara ",
            "pidiera prestado ", "examinara ", "debiera ", "incorporara ", "organizara "
    };
    String ps4wish[] = {"tuvieran ", "obtuvieran ", "vieran ", "necesitaran ", "supieran ", "encontraran ",
            "tomaran ", "quisieran ", "incluyeran ", "agradecieran ", "agregaran ", "eligieran ",
            "desarrollaran ", "recordaran ", "trajeran ", "protegieran ", "evitaran ", "describieran ",
            "prefirieran ", "descubrieran ", "esperaran ", "perdieran ", "oyeran ", "representaran ",
            "olvidaran ", "aceptaran ", "compraran ", "imaginaran ", "reconocieran ", "reemplazaran ",
            "pidieran prestado ", "examinaran ", "debieran ", "incorporaran ", "organizaran "
    };
    String ps5wish[] = {"tuvieramos ", "obtuvieramos ", "vieramos ", "necesitaramos ", "supieramos ", "encontraramos ",
            "tomaramos ", "quisieramos ", "incluyeramos ", "agradecieramos ", "agregaramos ", "eligieramos ",
            "desarrollaramos ", "recordaramos ", "trajeramos ", "protegieramos ", "evitaramos ", "describieramos ",
            "prefirieramos ", "descubrieramos ", "esperaramos ", "perdieramos ", "oyeramos ", "representaramos ",
            "olvidaramos ", "aceptaramos ", "compraramos ", "imaginaramos ", "reconocieramos ", "reemplazaramos ",
            "pidieramos prestado ", "examinaramos ", "debieramos ", "incorporaramos ", "organizaramos "
    };

    // nouns nobles top 100
    String nnobles[] = {
            "the people ", "the history ", "the art ", "the money ", "the world ", "the worlds ", "the information ",
            "the map ", "the maps ", "the family ", "the government ", "the governments ", "the health ", "the system ",

            "the systems ", "the computer ", "the computers ", "the meat ", "the year ", " the years ", "the thanks ",
            "the music ", "the person ", "the reading ", "the method ", "the methods ",

            "the data ", "the food ", "the understanding ", "the theory ", "the law ", "the bird ", "the birds ",
            "the literature ", "the problem ", "the problems ", "the software ", "the control ", "the knowledge ",
            "the power ", "the ability ", "the love ",

            "the internet ", "the television ", "the televisions ", "the science ", "the library ","the nature ",
            "the fact ", "the facts ", "the product ", "the products ", "the idea ", "the ideas ", "the temperature ",
            "the investment ", "the area ", "the areas ", "the society ", "the activity ", "the story ", "the industry ",
            "the media ", "the thing ", "the things ", "the oven ", "the ovens ", "the community ", "the communities ",
            "the safety ", "the quality ", "the development ", "the language ",

            "the management ", "the player ", "the variety ", "the video ", "the videos ", "the week ", "the country ",
            "the exam ", "the movie ", "the organization ", "the equipment ", "the phisics ", "the analysis ",
            "the policy ", "the series ", "the thought ", "the basis ", "the boyfriend ", "the direction ", "the strategy ",
            "the technology ", "the army ", "the armies ", "the camera ", "the cameras ", "the freedom ",

            "the paper ",  "the environment ", "the child ", "the children ", "the instance ", "the month ", "the months ",
            "the truth ", "the marketing ", "the university ", "the writing ", "the article ", "the department ",
            "the difference ", "the goal ", "the news ", "the audience ","the growth ", "a block of cheese "
    };

    // nouns nobles espa;ol top 100
    String nnoblesesp[] = {
            "a la gente ", "la historia ", "el arte ", "el dinero ", "el mundo ", "los mundos ", "la información ",
            "el mapa ", "los mapas ", "la familia ", "el gobierno ", "los gobiernos ", "la salud ", "el sistema ",

            "los sistemas ", "la computadora ", "las computadoras ", "la carne ", "el año ", "los años ",
            "el agradecimiento ", "la música ", "la persona ", "la lectura ", "el método ", "los métodos ",

            "los datos ", "la comida ", "el entendimiento ", "la teoría ", "la ley ",  "el pájaro ", "a los pájaros ",
            "la literatura ", "el problema ", "los problemas ", "el software ", "el control ", "el conocimiento ",
            "el poder ", "la habilidad ", "el amor ",

            "el internet ", "la televisión ", "las televisiones ", "la ciencia ", "la biblioteca ",
            "la naturaleza ", "el hecho ", "los hechos ", "el producto ", "los productos ", "la idea ", "las ideas ",
            "la temperatura ", "la inversión ", "el área ", "las áreas ", "la sociedad ", "la actividad ", "el cuento ",
            "la industria ", "la media ", "la cosa ", "las cosas ", "el horno ", "los hornos ", "la comunidad ",
            "las comunidades ", "la seguridad ", "la calidad ", "el desarrollo ", "el idioma ",

            "la administración ", "el jugador ", "la variedad ", "el video ", "los videos ", "la semana ", "el país ",
            "el examen ", "la pelicula ", "la organización ", "el equipo ", "la física ", "el análisis ", "la política ",
            "la serie ", "el pensamiento ", "la base ", "el novio ", "la dirección ", "la estrategia ", "la tecnología ",
            "el ejército ", "los ejércitos ", "la cámara ", "las cámaras ", "la libertad ",

            "el papel ", "el medio ambiente ", "el niño ", "los niños ", "la instancia ", "el mes ", "los meses ",
            "la verdad ", "el marketing ", "la universidad ", "la escritura ", "el artículo ", "el departamento ",
            "la diferencia ", "la meta ", "las noticias ", "a la audiencia ", "el crecimiento ", "un bloque de queso "
    };

    //What Continuo
    String scontI[] = {"am I ", "was i ", "will i be "};
    String scontIesp[] = {"estoy ", "estaba ", "estaré "};

    String scontYou[] = {"are you ", "were you ", "will you be "};
    String scontYouesp[]={"estás ", "estabas ", "estabas "};

    String scontHe[]={"is he ", "was he ", "will he be "};
    String scontHeesp[]={"está ", "estaba ", "estará "};

    String scontShe[]={"is she ", "was she ", "will she be "};
    String scontSheesp[]={"está ", "estaba ", "estará "};

    String scontIt[]={"is it ", "was it ", "will it be "};
    String scontItesp[]={"está ", "estaba ", "estará "};

    String scontThey[]={"are they ", "were they ", "will they be "};
    String scontTheyesp[]={"están ", "estaban ", "estarán "};

    String scontWe[]={"are we ", "were we ", "will we be "};
    String scontWeesp[]={"estamos ", "estabamos ", "estarémos "};

    //What Continuous
    String scontIdont[] = {"am not i ", "wasn't i ", "won't i be "};
    String scontIespno[] = {"no estoy ", "no estaba ", "no estaré "};

    String scontYoudont[] = {"aren't you ", "weren't you ", "won't you be "};
    String scontYouespno[]={"no estás ", "no estabas ", "no estabas"};

    String scontHedont[]={"isn't he ", "wasn't he ", "won't he be "};
    String scontHeespno[]={"no está ", "no estaba ", "no estará "};

    String scontShedont[]={"isn't she ", "wasn't she ", "won't she be "};
    String scontSheespno[]={"no está ", "no estaba ", "no estará "};

    String scontItdont[]={"isn't it ", "wasn't it ", "won't it be "};
    String scontItespno[]={"no está ", "no estaba ", "no estará "};

    String scontTheydont[]={"aren't they ", "weren't they ", "won't they be "};
    String scontTheyespno[]={"no están ", "no estaban ", "no estarán "};

    String scontWedont[]={"aren't we ", "weren't we ", "won't we be "};
    String scontWeespno[]={"no estamos ", "no estabamos ", "no estarémos "};


    //What Perfect
    String sperfI[] = {"have I ", "had i ", "will i have "};
    String sperfIesp[] = {"he ", "había ", "habré "};

    String sperfYou[] = {"have you ", "had you ", "will you have "};
    String sperfYouesp[]={"has ", "habías ", "habrás "};

    String sperfHe[]={"has he ", "had he ", "will he have "};
    String sperfHeesp[]={"ha ", "había ", "habrá "};

    String sperfShe[]={"has she ", "had she ", "will she have "};
    String sperfSheesp[]={"ha ", "había ", "habrá "};

    String sperfIt[]={"has it ", "had it ", "will it have "};
    String sperfItesp[]={"ha ", "había ", "habrá "};

    String sperfThey[]={"have they ", "had they ", "will they have "};
    String sperfTheyesp[]={"han ", "habían ", "habrán "};

    String sperfWe[]={"have we ", "had we ", "will we have "};
    String sperfWeesp[]={"hemos ", "habíamos ", "habrémos "};

    //What Perfect negacion
    String sperfIdont[] = {"haven't I ", "hadn't i ", "won't i have "};
    String sperfIespno[] = {"no he ", "no había ", "no habré "};

    String sperfYoudont[] = {"haven't you ", "hadn't you ", "won't you have "};
    String sperfYouespno[]={"no has ", "no habías ", "no habrás "};

    String sperfHedont[]={"hasn't he ", "hadn't he ", "won't he have "};
    String sperfHeespno[]={"no ha ", "no había ", "no habrá "};

    String sperfShedont[]={"hasn't she ", "hadn't she ", "won't she have "};
    String sperfSheespno[]={"no ha ", "no había ", "no habrá "};

    String sperfItdont[]={"hasn't it ", "hadn't it ", "won't it have "};
    String sperfItespno[]={"no ha ", "no había ", "no habrá "};

    String sperfTheydont[]={"haven't they ", "hadn't they ", "won't they have "};
    String sperfTheyespno[]={"no han ", "no habían ", "no habrán "};

    String sperfWedont[]={"haven't we ", "hadn't we ", "won't we have "};
    String sperfWeespno[]={"no hemos ", "no habíamos ", "no habrémos "};

    //What Continuo Modals
    String scontmI[] = {"would i be ", "could i be ", "should i be "};
    String scontmIesp[] = {"estaría ", "podría estar ", "debería estar "};

    String scontmYou[] = {"would you be ", "could you be ", "should you be "};
    String scontmYouesp[]={"estarías ", "podrías estar ", "deberías estar "};

    String scontmHe[]={"would he be ", "could he be ", "should he be "};
    String scontmHeesp[]={"estaría ", "podría estar ", "debería estar "};

    String scontmShe[]={"would she be ", "could she be ", "should she be "};
    String scontmSheesp[]={"estaría ", "podría estar ", "debería estar "};

    String scontmIt[]={"would it be ", "could it be ", "should it be "};
    String scontmItesp[]={"estaría ", "podría estar ", "debería estar "};

    String scontmThey[]={"would they be ", "could they be ", "should they be "};
    String scontmTheyesp[]={"estarían ", "podrían estar ", "deberían estar "};

    String scontmWe[]={"would we be ", "could we be ", "should we be "};
    String scontmWeesp[]={"estaríamos ", "podríamos estar ", "deberíamos estar "};

    //What Continuous Modals
    String scontmIdont[] = {"wouldn't i be ", "couldn't i be ", "shouldn't i be "};
    String scontmIespno[] = {"no estaría ", "no podría estar ", "no debería estar "};

    String scontmYoudont[] = {"wouldn't you be ", "couldn't you be ", "shouldn't you be "};
    String scontmYouespno[]={"no estarías ", "no podrías estar ", "no deberías estar"};

    String scontmHedont[]={"wouldn't he be ", "couldn't he be ", "shouldn't he be "};
    String scontmHeespno[]={"no estaría ", "no podría estar ", "no debería estar "};

    String scontmShedont[]={"wouldn't she be ", "couldn't she be ", "shouldn't she be "};
    String scontmSheespno[]={"no estaría ", "no podría estar ", "no debería estar "};

    String scontmItdont[]={"wouldn't it be ", "couldn't it be ", "shouldn't it be "};
    String scontmItespno[]={"no estaría ", "no podría estar ", "no debería estar "};

    String scontmTheydont[]={"wouldn't they be ", "couldn't they be ", "shouldn't they be "};
    String scontmTheyespno[]={"no estarían ", "no podrían estar ", "no deberían estar "};

    String scontmWedont[]={"wouldn't we be ", "couldn't we be ", "shouldn't we be "};
    String scontmWeespno[]={"no estaríamos ", "no podríamos estar ", "no deberíamos estar "};

    //What Perfect Modals
    String sperfmI[] = {"would i have ", "could i have ", "should i have "};
    String sperfmIesp[] = {"hubiera ", "pude haber ", "debí haber "};

    String sperfmYou[] = {"would you have ", "could you have ", "should you have "};
    String sperfmYouesp[]= {"hubieras ", "pudiste haber ", "debíste haber "};

    String sperfmHe[] = {"would he have ", "could he have ", "should he have "};
    String sperfmHeesp[] = {"hubiera ", "pudo haber ", "debío haber "};

    String sperfmShe[] = {"would she have ", "could she have ", "should she have "};
    String sperfmSheesp[] = {"hubiera ", "pudo haber ", "debío haber "};

    String sperfmIt[]= {"would it have ", "could it have ", "should it have "};
    String sperfmItesp[] = {"hubiera ", "pudo haber ", "debío haber "};

    String sperfmThey[] = {"would they have ", "could they have ", "should they have "};
    String sperfmTheyesp[] = {"hubieran ", "pudieron haber ", "debíeron haber "};

    String sperfmWe[] = {"would we have ", "could we have ", "should we have "};
    String sperfmWeesp[] = {"hubieramos ", "pudimos haber ", "debímos haber "};

    //What Perfect Modals
    String sperfmIdont[] = {"wouldn't i have ", "couldn't i have ", "shouldn't i have "};
    String sperfmIespno[] = {"no hubiera ", "no pude haber ", "no debí haber "};

    String sperfmYoudont[] = {"wouldn't you have ", "couldn't you have ", "shouldn't you have "};
    String sperfmYouespno[] = {"no hubieras ", "no pudiste haber ", "no debíste haber "};

    String sperfmHedont[] = {"wouldn't he have ", "couldn't he have ", "shouldn't he have "};
    String sperfmHeespno[] = {"no hubiera ", "no pudo haber ", "no debío haber "};

    String sperfmShedont[] = {"wouldn't she have ", "couldn't she have ", "shouldn't she have "};
    String sperfmSheespno[] = {"no hubiera ", "no pudo haber ", "no debío haber "};

    String sperfmItdont[] = {"wouldn't it have ", "couldn't it have ", "shouldn't it have "};
    String sperfmItespno[] = {"no hubiera ", "no pudo haber ", "no debío haber "};

    String sperfmTheydont[] = {"wouldn't they have ", "couldn't they have ", "shouldn't they have "};
    String sperfmTheyespno[] = {"no hubieran ", "no pudieron haber ", "no debíeron haber "};

    String sperfmWedont[] = {"wouldn't we have ", "couldn't we have ", "shouldn't we have "};
    String sperfmWeespno[] =  {"no hubieramos ", "no pudimos haber ", "no debímos haber "};

    String ps1; // esta la uso para primera persona esp
    String ps1eng;
    String ps2;
    String ps2eng;
    String ps3;
    String ps3eng;
    String ps3ella;
    String ps3she;
    String ps3eso;
    String ps3it;
    String ps4;
    String ps4eng;
    String ps5;
    String ps5eng;
    String ps1eng2;
    String ps2eng2;
    String ps3eng2;
    String ps3she2;
    String ps3iteng2;
    String ps4eng2;
    String ps5eng2;

    int s = (int)(Math.random() * scontI.length );
    int v = (int) (Math.random() * vnb.length);
    int n = (int) (Math.random() * nnobles.length);
    int neg = (int) (Math.random() * 2);


    //ya en negativo



    //vnb verbos nobles top 100 in past
    String vnbp[] = {"had ", "got ", "saw ", "needed ", "knew ", "found ", "took ", "wanted ", "included ",
            "thanked ", "added ", "chose ", "developed ", "remembered ", "brought ", "protected ",
            "avoided ", "described ", "preferred ", "discovered ", "expected ", "lost ", "heard ", "represented ",
            "forgot ", "accepted ", "compared ", "imagined ", "recognized ", "replaced ", "borrowed ", "examined ",
            "owed ", "incorporated ", "organized "
    };

    //pasado simple primera persona uno (preterito)
    String ps1pre[] = {"tuve ", "obtuve ", "ví ", "necesité ", "supe ", "encontré ", "tomé ", "quice ", "incluí ",
            "agradecí ", "agregué ", "elegí ", "desarrollé ", "recordé ", "trajé ", "protegí ",
            "evité ", "describí ", "preferí ", "descubrí ", "esperé ", "perdí ", "oí ", "representé ",
            "olvidé ", "acepté ", "comparé ", "imaginé ", "reconocí ", "reemplacé ", "pedí prestado ", "examiné ",
            "debía ", "incorporé ", "organicé "
    };

    //pasado simple primera persona 2 (imperfecto)
    String ps1imp[] = {"tenía ", "obtenía ", "veía ", "necesitaba ", "sabia ", "encontraba ", "tomaba ", "quería ", "incluía ",
            "agradecía ", "agregaba ", "elegía ", "desarrollaba ", "recordaba ", "trajaba ", "protegía ",
            "evitaba ", "describía ", "prefería ", "descubría ", "esperaba ", "perdía ", "oía ", "representaba ",
            "olvidaba ", "aceptaba ", "comparaba ", "imaginaba ", "reconocía ", "reemplacaba ", "pedía prestado ", "examinaba ",
            "debía ", "incorporaba ", "organizaba "
    };

    //pasado simple segunda persona preterito
    String ps2pre[] = {"tuviste ", "obtuviste ", "viste ", "necesitaste ", "supiste ", "encontraste ", "tomaste ", "quiciste ", "incluiste ",
            "agradeciste ", "agregaste ", "elegiste ", "desarrollaste ", "recordaste ", "trajiste ", "protegiste ",
            "evitaste ", "describiste ", "preferiste ", "descubriste ", "esperaste ", "perdiste ", "oiste ", "representaste ",
            "olvidaste ", "aceptaste ", "comparaste ", "imaginaste ", "reconociste ", "reemplazaste ", "pediste prestado ", "examinaste ",
            "debiste ", "incorporaste ", "organizaste "
    };

    //pasado simple segunda persona imperfecto
    String ps2imp[] = {"tenías ", "obtenías ", "veías ", "necesitabas ", "sabías ", "encontrabas ", "tomabas ", "querías ", "incluías ",
            "agradecías ", "agregabas ", "elegías ", "desarrollabas ", "recordabas ", "traías ", "protegías ",
            "evitabas ", "describías ", "preferías ", "descubrías ", "esperabas ", "perdías ", "oías ", "representabas ",
            "olvidabas ", "aceptabas ", "comparabas ", "imaginabas ", "reconocías ", "reemplazabas ", "pedías prestado ", "examinabas ",
            "debías ", "incorporabas ", "organizabas "
    };

    //pasado simple tercera persona preterito
    String ps3p[] = {"tuvo ", "obtuvo ", "vio ", "necesitó ", "supo ", "encontró ", "tomó ", "quiso ", "incluyó ",
            "agradeció ", "agregó ", "eligió ", "desarrolló ", "recordó ", "trajo ", "protegió ",
            "evitó ", "describió ", "prefirió ", "descubrió ", "esperó ", "perdió ", "oyó ", "representó ",
            "olvidó ", "aceptó ", "comparó ", "imaginó ", "reconoció ", "reemplazó ", "pidió prestado ", "examinó ",
            "debió ", "incorporó ", "organizó "
    };

    //pasado simple tercera persona imperfecto
    String ps3imp[] = {"tenía ", "obtenía ", "veía ", "necesitaba ", "sabía ", "encontraba ", "tomaba ", "quería ", "incluía ",
            "agradecía ", "agregaba ", "elegía ", "desarrollaba ", "recordaba ", "traía ", "protegía ",
            "evitaba ", "describía ", "prefería ", "descubría ", "esperaba ", "perdía ", "oía ", "representaba ",
            "olvidaba ", "aceptaba ", "comparaba ", "imaginaba ", "reconocía ", "reemplazaba ", "pedía prestado ", "examinaba ",
            "debía ", "incorporaba ", "organziaba "
    };

    //verbos nobles cuarta persona (ellos) pasado preterito
    String vn4p[] = {"tuvieron ", "obtuvieron ", "vieron ", "necesitaron ", "supieron ", "encontraron ", "tomaron ", "quicieron ", "incluyeron ",
            "agradecieron ", "agregaron ", "eligieron ", "desarrollaron ", "recordaron ", "trajeron ", "protegieron ",
            "evitaron ", "describieron ", "prefirieron ", "descubrieron ", "esperaron ", "perdieron ", "oyeron ", "representaron ",
            "olvidaron ", "aceptaron ", "compararon ", "imaginaron ", "reconocieron ", "reemplazaron ", "pidieron prestado ", "examinaron ",
            "debían ", "incorporaron ", "organizaron "
    };


    //verbos nobles cuarta persona (ellos) pasado imperfecto
    String vn4imp[] = {"tenían ", "obtenían ", "veían ", "necesitaban ", "sabían ", "encontraban ", "tomaban ", "querían ", "incluían ",
            "agradecían ", "agregaban ", "elegían ", "desarrollaban ", "recordaban ", "traían ", "protegían ",
            "evitaban ", "describían ", "preferían ", "descubrían ", "esperaban ", "perdían ", "oían ", "representaban ",
            "olvidaban ", "aceptaban ", "comparaban ", "imaginaban ", "reconocían ", "reemplazaban ", "pedían prestado ", "examinaban ",
            "debían ", "incorporaban ", "organizaban "
    };

    // verbos nosotros pasado preterito
    String vn5p[] = {"tuvimos ", "obtuvimos ", "vimos ", "necesitamos ", "supimos ", "encontramos ", "tomamos ", "quicimos ", "incluimos ",
            "agradecimos ", "agregamos ", "eligimos ", "desarrollamos ", "recordamos ", "trajimos ", "protegimos ",
            "evitamos ", "describimos ", "preferimos ", "descubrimos ", "esperamos ", "perdimos ", "oimos ", "representamos ",
            "olvidamos ", "aceptamos ", "comparamos ", "imaginamos ", "reconocimos ", "reemplazamos ", "pedimos prestado ", "examinamos ",
            "debimos ", "incorporamos ", "organizamos "
    };

    // verbos nosotros pasado imperfecto
    String vn5imp[] = {"teníamos ", "obteníamos ", "veíamos ", "necesitabamos ", "sabíamos ", "encontrábamos ", "tomábamos ", "queríamos ", "incluíamos ",
            "agradecíamos ", "agregábamos ", "elegíamos ", "desarrollábamos ", "recordábamos ", "traíamos ", "protegíamos ",
            "evitábamos ", "describíamos ", "preferíamos ", "descubríamos ", "esperábamos ", "perdíamos ", "oímos ", "representábamos ",
            "olvidábamos ", "aceptábamos ", "comparábamos ", "imaginábamos ", "reconocíamos ", "reemplazábamos ", "pedíamos prestado ", "examiábamos ",
            "debíamos ", "incorporábamos ", "organiábamos "
    };

    // pasado simple preterito e imperfecto, aparentemente ya la hice negativo



    //vnb verbos nobles top 100 continuo
    String vnbc[] = {"having ", "getting ", "seeing ", "needing ", "knowing ", "finding ", "taking ", "wanting ", "including ",
            "thanking ", "adding ", "choosing ", "developing ", "remembering ", "bringing ", "protecting ",
            "avoiding ", "describing ", "prefering ", "discovering ", "expecting ", "losing ", "hearing ", "representing ",
            "forgetting ", "accepting ", "comparing ", "imagining ", "recognizing ", "replacing ", "borrowing ", "examining ",
            "owing ", "incorporating ", "organizing "};

    //vnb verbos nobles top 100 continuo spanish
    String vnbcs[] = {"teniendo ", "obteniendo ", "viendo ", "necesitando ", "sabiendo ", "encontrando ", "tomando ", "queriendo ", "incluyendo ",
            "agradeciendo ", "agregando ", "eligiendo ", "desarrollando ", "recordando ", "trayendo ", "protegiendo ",
            "evadiendo ", "describiendo ", "prefiriendo ", "descubriendo ", "esperando ", "perdiendo ", "escuchando ", "representando ",
            "olvidando ", "aceptando ", "comparando ", "imaginando ", "reconociendo ", "reemplazando ", "pidiendo prestado ", "examinando ",
            "debiendo ", "incorporando ", "organizando "};


    //ya estaá en pasado



    //verbos participios inglés
    String vpeng[] = {"had ", "gotten ", "seen ", "needed ", "known ", "found ", "taken ", "wanted ", "included ",
            "thanked ", "added ", "chosen ", "developed ", "remembered ", "brought ", "protected ",
            "avoided ", "described ", "preferred ", "discovered ", "expected ", "lost ", "heard ", "represented ",
            "forgotten ", "accepted ", "compared ", "imagined ", "recongnized ", "replaced ", "borrowed ", "examined ",
            "owed ", "incorporated ", "organized "};

    //verbos participios inglés Femenino
    String vpengF[] = {"had ", "gotten ", "seen ", "needed ", "found ", "taken ", "wanted ", "included ",
            "thanked ", "added ", "chosen ", "developed ", "remembered ", "brought ", "protected ",
            "avoided ", "described ", "preferred ", "discovered ", "expected ", "lost ", "heard ", "represented ",
            "forgotten ", "accepted ", "compared ", "imagined ", "recongnized ", "replaced ", "borrowed ", "examined ",
            "owed ", "incorporated ", "organized "};

    //vnb verbos participios  spanish Masculino
    String vpsp[] = {"tenido ", "obtenido ", "visto ", "necesitado ", "sabido ", "encontrado ", "tomado ", "querido ", "incluido ",
            "agradecido ", "agregado ", "elegido ", "desarrollado ", "recordado ", "traído ", "protegido ",
            "evadido ", "descrito ", "preferido ", "descubierto ", "esperado ", "perdido ", "escuchado ", "representado ",
            "olvidado ", "aceptado ", "comparado ", "imaginado ", "reconocido ", "reemplazdo ", "pedido prestado ", "examinado ",
            "debido ", "incorporado ", "organizado "};

    //vnb verbos participios  spanish Masculino
    String vpspM[] = {"tenido ", "obtenido ", "visto ", "necesitado ", "sabido ", "encontrado ", "tomado ", "querido ", "incluido ",
            "agradecido ", "agregado ", "elegido ", "desarrollado ", "recordado ", "traído ", "protegido ",
            "evadido ", "descrito ", "preferido ", "descubierto ", "esperado ", "perdido ", "escuchado ", "representado ",
            "olvidado ", "aceptado ", "comparado ", "imaginado ", "reconocido ", "reemplazdo ", "pedido prestado ", "examinado ",
            "debido ", "incorporado ", "organizado "};

    //vnb verbos participios  spanish Femenino
    String vpspF[]= {
            "tenida ","obtenida ","vista ","necesitada ","encontrada ","tomada ", "querida ", "incluida ",
            "agradecida ", "agregada ", "elegida ", "desarrollada ", "recordada ", "traída ", "protegida ",
            "evadida ", "descrita ", "preferida ", "descubierta ", "esperada ", "perdida ", "escuchada ", "representada ",
            "olvidada ", "aceptada ", "comparada ", "imaginada ", "reconocida ", "reemplazada ", "pedido prestada ", "examinada ",
    };



// hay que hacer aqui abajo los verbos en futuro en sus diferentes personas


    // verbos nobles primera persona futuro
    String vn1f[] = {"tendré ", "obtendré ", "veré ", "necesitaré ", "sabré ", "encontraré ", "tomaré ", "querré ", "incluiré ",
            "agradeceré ", "agregaré ", "elegiré ", "desarrollaré ", "recordaré ", "traeré ", "protegeré ",
            "evitaré ", "describiré ", "preferiré ", "descubriré ", "esperaré ", "perderé ", "oiré ", "representaré ",
            "olvidaré ", "aceptaré ", "compararé ", "imaginaré ", "reconoceré ", "reemplazaré ", "pediré prestado ", "examinaré ",
            "deberé ", "incorporaré ", "organizaré "
    };

    // verbos nobles segunda persona futuro
    String vn2f[] = {"tendrás ", "obtendrás ", "verás ", "necesitarás ", "sabrás ", "encontrarás ", "tomarás ", "querrás ", "incluirás ",
            "agradecerás ", "agregarás ", "elegirás ", "desarrollarás ", "recordarás ", "traerás ", "protegerás ",
            "evitarás ", "describirás ", "preferirás ", "descubrirás ", "esperarás ", "perderás ", "oirás ", "representarás ",
            "olvidarás ", "aceptarás ", "compararás ", "imaginarás ", "reconocerás ", "reemplazarás ", "pedirás prestado ", "examinarás ",
            "deberás ", "incorporarás ", "organizarás "
    };


    // verbos nobles tercera persona futuro
    String vn3f[] = {"tendrá ", "obtendrá ", "verá ", "necesitará ", "sabrá ", "encontrará ", "tomará ", "querrá ", "incluirá ",
            "agradecerá ", "agregará ", "elegirá ", "desarrollará ", "recordará ", "traerá ", "protegerá ",
            "evitará ", "describirá ", "preferirá ", "descubrirá ", "esperará ", "perderá ", "oirá ", "representará ",
            "olvidará ", "aceptará ", "comparará ", "imaginará ", "reconocerá ", "reemplazará ", "pedirá prestado ", "examinará ",
            "deberá ", "incorporará ", "organizará "
    };


    // verbos nobles cuarta persona futuro
    String vn4f[] = {"tendrán ", "obtendrán ", "verán ", "necesitarán ", "sabrán ", "encontrarán ", "tomarán ", "querrán ", "incluirán ",
            "agradecerán ", "agregarán ", "elegirán ", "desarrollarán ", "recordarán ", "traerán ", "protegerán ",
            "evitarán ", "describirán ", "preferirán ", "descubrirán ", "esperarán ", "perderán ", "oirán ", "representarán ",
            "olvidarán ", "aceptarán ", "compararán ", "imaginarán ", "reconocerán ", "reemplazarán ", "pedirán prestado ", "examinarán ",
            "deberán ", "incorporarán ", "organizarán "
    };


    // verbos nobles quinta persona futuro
    String vn5f[] = {"tendremos ", "obtendremos ", "veremos ", "necesitaremos ", "sabremos ", "encontraremos ", "tomaras ", "querremos ", "incluiremos ",
            "agradeceremos ", "agregaremos ", "elegiremos ", "desrrollaremos ", "recordaremos ", "traeremos ", "protegeremos ",
            "evitaremos ", "describiremos ", "preferiremos ", "descubriremos ", "esperaremos ", "perderemos ", "oiremos ", "representaremos ",
            "olvidaremos ", "aceptaremos ", "compararemos ", "imaginaremos ", "reconoceremos ", "reemplazaremos ", "pediremos prestado ", "examinaremos ",
            "deberemos ", "incorporaremos ", "organizaremos "
    };



    // aqui abajo van los modales
    // verbos nobles primera persona would
    String vn1w[] = {"tendría ", "obtendría ", "vería ", "necesitaría ", "sabría ", "encontraría ", "tomaría ", "querría ", "incluiría ",
            "agradecería ", "agregaría ", "elegiría ", "desarrollaría ", "recordaría ", "traería ", "protegería ",
            "evitaría ", "descubriría ", "preferiría ", "descubriría ", "esperaría ", "perdería ", "oiría ", "representaría ",
            "olvidaría ", "aceptaría ", "compararía ", "imaginaría ", "reconocería ", "reemplazaría ", "pediría prestado ", "examinaría ",
            "debería ", "incorporaría ", "organizaría "
    };
    // verbos nobles segunda persona would
    String vn2w[] = {"tendrías ", "obtendrías ", "verías ", "necesitarías ", "sabrías ", "encontrarías ", "tomarías ", "querrías ", "incluiría ",
            "agradecerías ", "agregarías ", "elegirías ", "desarrollarías ", "recordarías ", "traerías ", "protegerías ",
            "evitarías ", "descubrirías ", "preferirías ", "descubrirías ", "esperarías ", "perderías ", "oirías ", "representarías ",
            "olvidarías ", "aceptarías ", "compararías ", "imaginarías ", "reconocerías ", "reemplazarías ", "pedirías prestado ", "examinarías ",
            "deberías ", "incorporarías ", "organizarías "
    };
    // verbos nobles tercera persona would
    String vn3w[] = {"tendría ", "obtendría ", "vería ", "necesitaría ", "sabría ", "encontraría ", "tomaría ", "querría ", "incluiría ",
            "agradecería ", "agregaría ", "elegiría ", "desarrollaría ", "recordaría ", "traería ", "protegería ",
            "evitaría ", "descubriría ", "preferiría ", "descubriría ", "esperaría ", "perdería ", "oiría ", "representaría ",
            "olvidaría ", "aceptaría ", "compararía ", "imaginaría ", "reconocería ", "reemplazaría ", "pediría prestado ", "examinaría ",
            "debería ", "incorporaría ", "organizaría "
    };
    // verbos nobles cuarta persona would
    String vn4w[] = {"tendrían ", "obtendrían ", "verían ", "necesitarían ", "sabrían ", "encontrarían ", "tomarían ", "querrían ", "incluirían ",
            "agradecerían ", "agregarían ", "elegirían ", "desarrollarían ", "recordarían ", "traerían ", "protegerían ",
            "evitarían ", "descubrirían ", "preferirían ", "descubrirían ", "esperarían ", "perderían ", "oirían ", "representarían ",
            "olvidarían ", "aceptarían ", "compararían ", "imaginarían ", "reconocerían ", "reemplazarían ", "pedirían prestado ", "examinarían ",
            "deberían ", "incorporarían ", "organizarían "
    };
    // verbos nobles quinta persona would
    String vn5w[] = {"tendríamos ", "obtendríamos ", "veríamos ", "necesitaríamos ", "sabríamos ", "encontraríamos ", "tomaríamos ", "querrían ", "incluiríamos ",
            "agradeceríamos ", "agregaríamos ", "elegiríamos ", "desarrollaríamos ", "recordaríamos ", "traeríamos ", "protegeríamos ",
            "evitaríamos ", "descubriríamos ", "preferiríamos ", "descubriríamos ", "esperaríamos ", "perderíamos ", "oiríamos ", "representaríamos ",
            "olvidaríamos ", "aceptaríamos ", "compararíamos ", "imaginaríamos ", "reconoceríamos ", "reemplazaríamos ", "pediríamos prestado ", "examinaríamos ",
            "deberíamos ", "incorporaríamos ", "organizaríamos "
    };





// aqui van los del might

    //vnb verbos nobles top 100  primera persona  y tercera, esp subjuntivos
    String vn1y3subj[] = {"tenga ", "obtenga ", "vea ", "necesite ", "sepa ", "encuentre ", "tome ", "quiera ", "incluya ",
            "agradezca ", "agregue ", "elija ", "desarrolle ", "recuerde ", "traiga ", "proteja ",
            "evite ", "describa ", "prefiera ", "descubra ", "espere ", "pierda ", "oiga ", "represente ",
            "olvide ", "acepte ", "comparta ", "imagine ", "reconozca ", "reemplace ", "pida prestado ", "examine ",
            "deba ", "incorpore ", "organice "
    };
    // verbos nobles segunda persona subjuntivo
    String vn2subj[] = {"tengas ", "obtengas ", "veas ", "necesites ", "sepas ", "encuentres ", "tomes ", "quieras ", "incluyas ",
            "agradezcas ", "agregues ", "elijas ", "desarrolles ", "recuerdes ", "traigas ", "protejas ",
            "evites ", "describas ", "prefieras ", "descubras ", "esperes ", "pierdas ", "oigas ", "representes ",
            "olvides ", "aceptes ", "compartas ", "imagines ", "reconozcas ", "reemplaces ", "pidas prestado ", "examines ",
            "debas ", "incorpores ", "organices "
    };
    //vnb verbos nobles top 100  cuarta persona esp subjuntivos
    String vn4subj[] = {"tengan ", "obtengan ", "vean ", "necesiten ", "sepan ", "encuentren ", "tomen ", "quieran ", "incluyan ",
            "agradezcan ", "agreguen ", "elijan ", "desarrollen ", "recuerden ", "traigan ", "protejan ",
            "eviten ", "describan ", "prefieran ", "descubran ", "esperen ", "pierdan ", "oigan ", "representen ",
            "olviden ", "acepten ", "compartan ", "imaginen ", "reconozcan ", "reemplacen ", "pidan prestado ", "examinen ",
            "deban ", "incorporen ", "organicen "
    };
    //vnb verbos nobles nosotros subjuntivo
    String vn5subj[] = {"tengamos ", "obtengamos ", "veamos ", "necesitemos ", "sepamos ", "encontremos ", "tomemos ", "queramos ", "incluyamos ",
            "agradezcamos ", "agreguemos ", "elijamos ", "desarrollemos ", "recordemos ", "traigamos ", "protejamos ",
            "evitemos ", "describamos ", "prefiramos ", "descubramos ", "esperemos ", "perdamos ", "oigamos ", "representemos ",
            "olvidemos ", "aceptemos ", "compartamos ", "imaginemos ", "reconozcamos ", "reemplacemos ", "pidamos prestado ", "examinemos ",
            "debamos ", "incorporemos ", "organicemos "
    };




    // Supposed to DIF 1
    // se supone que tiene que pasar cases 2 y 3
    // se supone que va a pasar cases 4 y 5
    int vc= (int)(Math.random()*6);


    //--------------------------------------------------------
    //with,at,during,until,in,on, by,without,near,around
    //aqui abajo empieza el boton dificultad tres, estos prnombres
    //de arriba son mas o menos los que le quedan a todos los nobles
    //hay que hacer una lista de frases preposicionales que queden bien
    //con cada uno de los diferentes tipo de verbos, para no solo agregar
    //adverbios de frequencia o manera, también las frases
    //preposicionales , incluso tal vez para dif 4
//these should go right after the subject
    String advfrequ[] = {"siempre ", "constantemente ", "frecuentemente ",
            "generalmente ",
            "normalmente ", "ocacionalmente ", "seguido ", "raramente ",
            "regularmente ",
            "regularmente ", "usualmente ", "felizmente ", "temprano ", "tarde ", "diariamente ",
            "perfectamente ", "facilmente ", "cuidadosamente ", "abiertamente ",
            "finalmente ", "peligrosamente ", "desesperadamente ", "ocasionalmente ",
            "seguido ", "calmadamente "
    };
    String frequadv[] = {
            "always ", "constantly ", "frequently ", "generally ",
            "normally ", "occasionally ", "often ", "rarely ", "regularly ",
            "regularly ",
            "usually ", "happily ", "early ", "late ", "daily ",
            "perfectly ", "easily ", "carefully ",
            "openly ", "finally ", "dangerouslly ", "desperately ",
            "occasionally ", "often ", "calmly "
    };
// eliminated seldom , better, sometimes, infrequentemente

    // ya está en negativo
    int r = (int) (Math.random() * advfrequ.length);
    int negg = (int) (Math.random() * 2);

    // dif 2 comp
    public void GenPresSimp2() {

        switch (neg) {
            case 0:
                ps1 = "yo " + vn1[v] + nnoblesesp[n];
                ps1eng = "I " + vnb[v] + nnobles[n];

                ps2 = "tú " + vn2[v] + nnoblesesp[n];
                ps2eng = "you " + vnb[v] + nnobles[n];

                ps3 = "él " + vn3[v] + nnoblesesp[n];
                ps3eng = "he " + vnb3[v] + nnobles[n];

                ps3ella = "ella " + vn3[v] + nnoblesesp[n];
                ps3she = "she " + vnb3[v] + nnobles[n];

                ps3eso = "eso " + vn3[v] + nnoblesesp[n];
                ps3it = "it " + vnb3[v] + nnobles[n];

                ps4 = "ellos " + vn4[v] + nnoblesesp[n];
                ps4eng = "they " + vnb[v] + nnobles[n];

                ps5 = "nosotros " + vn5[v] + nnoblesesp[n];
                ps5eng = "we " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo " + "no " + vn1[v] + nnoblesesp[n];
                ps1eng = "I " + "don't " + vnb[v] + nnobles[n];

                ps2 = "tú " + "no " + vn2[v] + nnoblesesp[n];
                ps2eng = "you " + "don't " + vnb[v] + nnobles[n];

                ps3 = "él " + "no " + vn3[v] + nnoblesesp[n];
                ps3eng = "he " + "doesn't " + vnb[v] + nnobles[n];

                ps3ella = "ella " + "no " + vn3[v] + nnoblesesp[n];
                ps3she = "she " + "doesn't " + vnb[v] + nnobles[n];

                ps3eso = "eso " + "no " + vn3[v] + nnoblesesp[n];
                ps3it = "it " + "doesn't " + vnb[v] + nnobles[n];

                ps4 = "ellos " + "no " + vn4[v] + nnoblesesp[n];
                ps4eng = "they " + "don't " + vnb[v] + nnobles[n];

                ps5 = "nosotros " + "no " + vn5[v] + nnoblesesp[n];
                ps5eng = "we " + "don't " + vnb[v] + nnobles[n];
                break;

        }
    }
    public void GenPresCont2() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "estoy " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "am " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "estás " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "are " + vnbc[v] + nnobles[n];

                ps3 = "él " + "está " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "is " + vnbc[v] + nnobles[n];

                ps3ella = "ella " + "está " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "is " + vnbc[v] + nnobles[n];

                ps3eso = "eso " + "está " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "is " + vnbc[v] + nnobles[n];

                ps4 = "ellos " + "están " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "are " + vnbc[v] + nnobles[n];

                ps5 = "nosotros " + "estamos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "are " + vnbc[v] + nnobles[n];
                break;

            case 1:
                ps1 = "yo " + "no " + "estoy " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "am " + "not " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "no " + "estás " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "aren't " + vnbc[v] + nnobles[n];

                ps3 = "él " + "no " + "está " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "isn't " + vnbc[v] + nnobles[n];

                ps3ella = "ella " + "no " + "está " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "isn't " + vnbc[v] + nnobles[n];

                ps3eso = "eso " + "no " + "está " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "isn't " + vnbc[v] + nnobles[n];

                ps4 = "ellos no " + "están " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "aren't " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no " + "estamos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "aren't " + vnbc[v] + nnobles[n];
                break;
        }
    }
    public void GenPresPerf2() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "he " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "have " + vpeng[v] + nnobles[n];

                ps2 = "tú " + "has " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "have " + vpeng[v] + nnobles[n];

                ps3 = "él " + "ha " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "has " + vpeng[v] + nnobles[n];

                ps3ella = "ella " + "ha " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "has " + vpeng[v] + nnobles[n];

                ps3eso = "eso " + "ha " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "has " + vpeng[v] + nnobles[n];

                ps4 = "ellos " + "han " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros " + "hemos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "have " + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "he " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "haven't " + vpeng[v] + nnobles[n];

                ps2 = "tú no " + "has " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "haven't " + vpeng[v] + nnobles[n];

                ps3 = "él no " + "ha " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "hasn't " + vpeng[v] + nnobles[n];

                ps3ella = "ella no " + "ha " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "hasn't " + vpeng[v] + nnobles[n];

                ps3eso = "eso no " + "ha " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "hasn't " + vpeng[v] + nnobles[n];

                ps4 = "ellos no " + "han " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "haven't " + vpeng[v] + nnobles[n];

                ps5 = "nosotros no " + "hemos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "haven't " + vpeng[v] + nnobles[n];

                break;
        }


    }  // ya en negativo
    public void GenPresPerfCont2() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "he estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "have been " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "has estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "have been " + vnbc[v] + nnobles[n];

                ps3 = "él " + "ha estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "has been " + vnbc[v] + nnobles[n];

                ps3ella = "ella " + "ha estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "has been " + vnbc[v] + nnobles[n];

                ps3eso = "eso " + "ha estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "has been " + vnbc[v] + nnobles[n];

                ps4 = "ellos " + "han estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros " + "hemos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "have been " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "he estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "haven't been " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "has estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "haven't been " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "ha estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "hasn't been " + vnbc[v] + nnobles[n];

                ps3ella = "ella no " + "ha estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "hasn't been " + vnbc[v] + nnobles[n];

                ps3eso = "eso no " + "ha estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "hasn't been " + vnbc[v] + nnobles[n];

                ps4 = "ellos no " + "han estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "haven't been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no " + "hemos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "haven't been " + vnbc[v] + nnobles[n];

                break;
        }
    } // ya en negativo

    public void GenPastSimp2() {

        int sr = (int) (Math.random() * 2);
        switch (neg) {
            case 1:
                if (sr == 0) {
                    ps1 = "yo " + ps1pre[v] + nnoblesesp[n];
                    ps1eng = "I " + vnbp[v] + nnobles[n];

                    ps2 = "tú " + ps2pre[v] + nnoblesesp[n];
                    ps2eng = "you " + vnbp[v] + nnobles[n];

                    ps3 = "él " + ps3p[v] + nnoblesesp[n];
                    ps3eng = "he " + vnbp[v] + nnobles[n];

                    ps3ella = "ella " + ps3p[v] + nnoblesesp[n];
                    ps3she = "she " + vnbp[v] + nnobles[n];

                    ps3eso = "eso " + ps3p[v] + nnoblesesp[n];
                    ps3it = "it " + vnbp[v] + nnobles[n];

                    ps4 = "ellos " + vn4p[v] + nnoblesesp[n];
                    ps4eng = "they " + vnbp[v] + nnobles[n];

                    ps5 = "nosotros " + vn5p[v] + nnoblesesp[n];
                    ps5eng = "we " + vnbp[v] + nnobles[n];
                } else {
                    ps1 = "yo " + ps1imp[v] + nnoblesesp[n];
                    ps1eng = "I " + vnbp[v] + nnobles[n];

                    ps2 = "tú " + ps2imp[v] + nnoblesesp[n];
                    ps2eng = "you " + vnbp[v] + nnobles[n];

                    ps3 = "él " + ps3imp[v] + nnoblesesp[n];
                    ps3eng = "he " + vnbp[v] + nnobles[n];

                    ps3ella = "ella " + ps3imp[v] + nnoblesesp[n];
                    ps3she = "she " + vnbp[v] + nnobles[n];

                    ps3eso = "eso " + ps3imp[v] + nnoblesesp[n];
                    ps3it = "it " + vnbp[v] + nnobles[n];

                    ps4 = "ellos " + vn4imp[v] + nnoblesesp[n];
                    ps4eng = "they " + vnbp[v] + nnobles[n];

                    ps5 = "nosotros " + vn5imp[v] + nnoblesesp[n];
                    ps5eng = "we " + vnbp[v] + nnobles[n];
                }
                break;

            case 0:
                if (sr == 0) {
                    ps1 = "yo " + "no " + ps1pre[v] + nnoblesesp[n];
                    ps1eng = "I " + "didn't " + vnb[v] + nnobles[n];

                    ps2 = "tú " + "no " + ps2pre[v] + nnoblesesp[n];
                    ps2eng = "you " + "didn't " + vnb[v] + nnobles[n];

                    ps3 = "él " + "no " + ps3p[v] + nnoblesesp[n];
                    ps3eng = "he " + "din't " + vnb[v] + nnobles[n];

                    ps3ella = "ella " + "no " + ps3p[v] + nnoblesesp[n];
                    ps3she = "she " + "didn't " + vnb[v] + nnobles[n];

                    ps3eso = "eso " + "no " + ps3p[v] + nnoblesesp[n];
                    ps3it = "it " + "didn't " + vnb[v] + nnobles[n];

                    ps4 = "ellos " + "no " + vn4p[v] + nnoblesesp[n];
                    ps4eng = "they " + "didn't " + vnb[v] + nnobles[n];

                    ps5 = "nosotros " + "no " + vn5p[v] + nnoblesesp[n];
                    ps5eng = "we " + "didn't " + vnb[v] + nnobles[n];
                } else {
                    ps1 = "yo " + "no " + ps1imp[v] + nnoblesesp[n];
                    ps1eng = "I " + "didn't " + vnb[v] + nnobles[n];

                    ps2 = "tú " + "no " + ps2imp[v] + nnoblesesp[n];
                    ps2eng = "you " + "didn't " + vnb[v] + nnobles[n];

                    ps3 = "él " + "no " + ps3imp[v] + nnoblesesp[n];
                    ps3eng = "he " + "didn't " + vnb[v] + nnobles[n];

                    ps3ella = "ella " + "no " + ps3imp[v] + nnoblesesp[n];
                    ps3she = "she " + "didn't " + vnb[v] + nnobles[n];

                    ps3eso = "eso " + "no " + ps3imp[v] + nnoblesesp[n];
                    ps3it = "it " + "didn't " + vnb[v] + nnobles[n];

                    ps4 = "ellos " + "no " + vn4imp[v] + nnoblesesp[n];
                    ps4eng = "they " + "didn't " + vnb[v] + nnobles[n];

                    ps5 = "nosotros " + "no " + vn5imp[v] + nnoblesesp[n];
                    ps5eng = "we " + "didn't " + vnb[v] + nnobles[n];
                }
                break;
        }
    }
    public void GenPastCont2() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "estaba " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "was " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "estabas " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "were " + vnbc[v] + nnobles[n];

                ps3 = "él " + "estaba " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "was " + vnbc[v] + nnobles[n];

                ps3ella = "ella " + "estaba " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "was " + vnbc[v] + nnobles[n];

                ps3eso = "eso " + "estaba " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "was " + vnbc[v] + nnobles[n];

                ps4 = "ellos " + "estaban " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "were " + vnbc[v] + nnobles[n];

                ps5 = "nosotros " + "estabamos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "were " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "estaba " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "wasn't " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "estabas " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "weren't " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "estaba " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "wasn't " + vnbc[v] + nnobles[n];

                ps3ella = "ella no " + "estaba " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "wasn't " + vnbc[v] + nnobles[n];

                ps3eso = "eso no " + "estaba " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "wasn't " + vnbc[v] + nnobles[n];

                ps4 = "ellos no " + "estaban " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "weren't " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no " + "estabamos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "weren't " + vnbc[v] + nnobles[n];
                break;
        }


    } // negativo ya
    public void GenPastPerf2() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "había " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "had " + vpeng[v] + nnobles[n];

                ps2 = "tú " + "habías " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "had " + vpeng[v] + nnobles[n];

                ps3 = "él " + "había " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "had " + vpeng[v] + nnobles[n];

                ps3ella = "ella " + "había " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "had " + vpeng[v] + nnobles[n];

                ps3eso = "eso " + "había " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "had " + vpeng[v] + nnobles[n];

                ps4 = "ellos " + "habían " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "had " + vpeng[v] + nnobles[n];

                ps5 = "nosotros " + "habíamos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "had " + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "había " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "hadn't " + vpeng[v] + nnobles[n];

                ps2 = "tú no " + "habías " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "hadn't " + vpeng[v] + nnobles[n];

                ps3 = "él no " + "había " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "hadn't " + vpeng[v] + nnobles[n];

                ps3ella = "ella no " + "había " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "hadn't " + vpeng[v] + nnobles[n];

                ps3eso = "eso no " + "había " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "hadn't " + vpeng[v] + nnobles[n];

                ps4 = "ellos no " + "habían " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "hadn't " + vpeng[v] + nnobles[n];

                ps5 = "nosotros no " + "habíamos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "hadn't " + vpeng[v] + nnobles[n];

                break;
        }


    } // negativo ya
    public void GenPastPerfCont2() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "had been " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "had been " + vnbc[v] + nnobles[n];

                ps3 = "él " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "had been " + vnbc[v] + nnobles[n];

                ps3ella = "ella " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "had been " + vnbc[v] + nnobles[n];

                ps3eso = "eso " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "had been " + vnbc[v] + nnobles[n];

                ps4 = "ellos " + "habían estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "had been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros " + "habíamos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "had been " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "hadn't been " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "hadn't been " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "hadn't been " + vnbc[v] + nnobles[n];

                ps3ella = "ella no " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "hadn't been " + vnbc[v] + nnobles[n];

                ps3eso = "eso no " + "había estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "hadn't been " + vnbc[v] + nnobles[n];

                ps4 = "ellos no " + "habían estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "hadn't been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no " + "habíamos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "hadn't been " + vnbc[v] + nnobles[n];
                break;
        }

    } // negativo

    public void GenFutSimp2() {
        switch (neg) {
            case 0:
                ps1 = "yo " + vn1f[v] + nnoblesesp[n];
                ps1eng = "I " + "will " + vnb[v] + nnobles[n];

                ps2 = "tú " + vn2f[v] + nnoblesesp[n];
                ps2eng = "you " + "will " + vnb[v] + nnobles[n];

                ps3 = "él " + vn3f[v] + nnoblesesp[n];
                ps3eng = "he " + "will " + vnb[v] + nnobles[n];

                ps3ella = "ella " + vn3f[v] + nnoblesesp[n];
                ps3she = "she " + "will " + vnb[v] + nnobles[n];

                ps3eso = "eso " + vn3f[v] + nnoblesesp[n];
                ps3it = "it " + "will " + vnb[v] + nnobles[n];

                ps4 = "ellos " + vn4f[v] + nnoblesesp[n];
                ps4eng = "they " + "will " + vnb[v] + nnobles[n];

                ps5 = "nosotros " + vn5f[v] + nnoblesesp[n];
                ps5eng = "we " + "will " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + vn1f[v] + nnoblesesp[n];
                ps1eng = "I " + "won't " + vnb[v] + nnobles[n];

                ps2 = "tú no " + vn2f[v] + nnoblesesp[n];
                ps2eng = "you " + "won't " + vnb[v] + nnobles[n];

                ps3 = "él no " + vn3f[v] + nnoblesesp[n];
                ps3eng = "he " + "won't " + vnb[v] + nnobles[n];

                ps3ella = "ella no " + vn3f[v] + nnoblesesp[n];
                ps3she = "she " + "won't " + vnb[v] + nnobles[n];

                ps3eso = "eso no " + vn3f[v] + nnoblesesp[n];
                ps3it = "it " + "won't " + vnb[v] + nnobles[n];

                ps4 = "ellos no " + vn4f[v] + nnoblesesp[n];
                ps4eng = "they " + "won't " + vnb[v] + nnobles[n];

                ps5 = "nosotros no " + vn5f[v] + nnoblesesp[n];
                ps5eng = "we " + "won't " + vnb[v] + nnobles[n];
                break;
        }
    } // neg
    public void GenFutCont2() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "estaré " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "will " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "estarás " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "will " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él " + "estará " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "will be " + vnbc[v] + nnobles[n];

                ps3ella = "ella estará " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "will be " + vnbc[v] + nnobles[n];

                ps3eso = "eso estará " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "will be " + vnbc[v] + nnobles[n];

                ps4 = "ellos estarán " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "will be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros estarémos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "will be " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "estaré " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "won't " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "estarás " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "won't " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "estará " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "won't be " + vnbc[v] + nnobles[n];

                ps3ella = "ella no estará " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "won't be " + vnbc[v] + nnobles[n];

                ps3eso = "eso no estará " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "won't be " + vnbc[v] + nnobles[n];

                ps4 = "ellos no estarán " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "won't be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no estarémos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "won't be " + vnbc[v] + nnobles[n];
                break;
        }

    } // neg
    public void GenFutPerf2() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "habré " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "will have " + vpeng[v] + nnobles[n];

                ps2 = "tú " + "habrás " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "will have " + vpeng[v] + nnobles[n];

                ps3 = "él " + "habrá " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "will have " + vpeng[v] + nnobles[n];

                ps3ella = "ella habrá " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "will have " + vpeng[v] + nnobles[n];

                ps3eso = "eso habrá " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "will have " + vpeng[v] + nnobles[n];

                ps4 = "ellos habrán " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "will have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros habrémos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "will have " + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "habré " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "won't have " + vpeng[v] + nnobles[n];

                ps2 = "tú no " + "habrás " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "won't have " + vpeng[v] + nnobles[n];

                ps3 = "él no " + "habrá " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "won't have " + vpeng[v] + nnobles[n];

                ps3ella = "ella no habrá " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "won't have " + vpeng[v] + nnobles[n];

                ps3eso = "eso no habrá " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "won't have " + vpeng[v] + nnobles[n];

                ps4 = "ellos no habrán " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "won't have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros no habrémos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "won't have " + vpeng[v] + nnobles[n];

                break;
        }

    }  // neg
    public void GenFutPerfCont2() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "habré estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "will have been " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "habrás estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "will have been " + vnbc[v] + nnobles[n];

                ps3 = "él " + "habrá estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "will have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella habrá estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "will have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso habrá estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "will have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos habrán estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "will have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros habrémos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "will have been " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "habré estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "won't have been " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "habrás estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "won't have been " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "habrá estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "won't have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella no habrá estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "won't have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso no habrá estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "won't have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos no habrán estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "won't have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no habrémos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "won't have been " + vnbc[v] + nnobles[n];
                break;
        }


    } // neg
    // aqui estan los del would
    public void GenWouldSimp2() {
        switch (neg) {
            case 0:
                ps1 = "yo " + vn1w[v] + nnoblesesp[n];
                ps1eng = "I " + "would " + vnb[v] + nnobles[n];

                ps2 = "tú " + vn2w[v] + nnoblesesp[n];
                ps2eng = "you " + "would " + vnb[v] + nnobles[n];

                ps3 = "él " + vn3w[v] + nnoblesesp[n];
                ps3eng = "he " + "would " + vnb[v] + nnobles[n];

                ps3ella = "ella " + vn3w[v] + nnoblesesp[n];
                ps3she = "she " + "would " + vnb[v] + nnobles[n];

                ps3eso = "eso " + vn3w[v] + nnoblesesp[n];
                ps3it = "it " + "would " + vnb[v] + nnobles[n];

                ps4 = "ellos " + vn4w[v] + nnoblesesp[n];
                ps4eng = "they " + "would " + vnb[v] + nnobles[n];

                ps5 = "nosotros " + vn5w[v] + nnoblesesp[n];
                ps5eng = "we " + "would " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + vn1w[v] + nnoblesesp[n];
                ps1eng = "I " + "wouldn't " + vnb[v] + nnobles[n];

                ps2 = "tú no " + vn2w[v] + nnoblesesp[n];
                ps2eng = "you " + "wouldn't " + vnb[v] + nnobles[n];

                ps3 = "él no " + vn3w[v] + nnoblesesp[n];
                ps3eng = "he " + "wouldn't " + vnb[v] + nnobles[n];

                ps3ella = "ella no " + vn3w[v] + nnoblesesp[n];
                ps3she = "she " + "wouldn't " + vnb[v] + nnobles[n];

                ps3eso = "eso no " + vn3w[v] + nnoblesesp[n];
                ps3it = "it " + "wouldn't " + vnb[v] + nnobles[n];

                ps4 = "ellos no " + vn4w[v] + nnoblesesp[n];
                ps4eng = "they " + "wouldn't " + vnb[v] + nnobles[n];

                ps5 = "nosotros no " + vn5w[v] + nnoblesesp[n];
                ps5eng = "we " + "wouldn't " + vnb[v] + nnobles[n];
                break;
        }
    }  // neg
    public void GenWouldCont2() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "estaría " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "would " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "estarías " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "would " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él " + "estaría " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "would be " + vnbc[v] + nnobles[n];

                ps3ella = "ella estaría " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "would be " + vnbc[v] + nnobles[n];

                ps3eso = "eso estaría " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "would be " + vnbc[v] + nnobles[n];

                ps4 = "ellos estaría " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "would be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros estaríamos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "would be " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "estaría " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "wouldn't " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "estarías " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "wouldn't " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "estaría " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "wouldn't be " + vnbc[v] + nnobles[n];

                ps3ella = "ella no estaría " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "wouldn't be " + vnbc[v] + nnobles[n];

                ps3eso = "eso no estaría " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "wouldn't be " + vnbc[v] + nnobles[n];

                ps4 = "ellos no estarían " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "wouldn't be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no estaríamos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "wouldn't be " + vnbc[v] + nnobles[n];
                break;
        }
    }  // neg
    public void GenWouldPerf2() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "hubiera " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "would have " + vpeng[v] + nnobles[n];

                ps2 = "tú " + "hubieras " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "would have " + vpeng[v] + nnobles[n];

                ps3 = "él " + "hubiera " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "would have " + vpeng[v] + nnobles[n];

                ps3ella = "ella hubiera " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "would have " + vpeng[v] + nnobles[n];

                ps3eso = "eso hubiera " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "would have " + vpeng[v] + nnobles[n];

                ps4 = "ellos hubieran " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "would have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros hubieramos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "would have " + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "hubiera " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "wouldn't have " + vpeng[v] + nnobles[n];

                ps2 = "tú no " + "hubieras " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "wouldn't have " + vpeng[v] + nnobles[n];

                ps3 = "él no " + "hubiera " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "wouldn't have " + vpeng[v] + nnobles[n];

                ps3ella = "ella no hubiera " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "wouldn't have " + vpeng[v] + nnobles[n];

                ps3eso = "eso no hubiera " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "wouldn't have " + vpeng[v] + nnobles[n];

                ps4 = "ellos no hubieran " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "wouldn't have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros no hubieramos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "wouldn't have " + vpeng[v] + nnobles[n];
                break;
        }
    }  // neg
    public void GenWouldPerfCont2() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "hubiera estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "would have been " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "hubieras estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "would have been " + vnbc[v] + nnobles[n];

                ps3 = "él " + "hubiera estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "would have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella hubiera estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "would have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso hubiera estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "would have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos hubieran estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "would have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros hubieramos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "would have been " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "hubiera estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "wouldn't have been " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "hubieras estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "wouldn't have been " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "hubiera estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "wouldn't have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella no hubiera estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "wouldn't have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso no hubiera estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "wouldn't have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos no hubieran estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "wouldn't have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no hubieramos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "wouldn't have been " + vnbc[v] + nnobles[n];
                break;
        }

    } // neg

    // aqui estan los del could
    public void GenCouldSimp2() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "podría " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I " + "could " + vnb[v] + nnobles[n];

                ps2 = "tú " + "podrías " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you " + "could " + vnb[v] + nnobles[n];

                ps3 = "él " + "podría " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he " + "could " + vnb[v] + nnobles[n];

                ps3ella = "ella " + "podría " + vnbs[v] + nnoblesesp[n];
                ps3she = "she " + "could " + vnb[v] + nnobles[n];

                ps3eso = "eso " + "podría " + vnbs[v] + nnoblesesp[n];
                ps3it = "it " + "could " + vnb[v] + nnobles[n];

                ps4 = "ellos " + "podrían " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they " + "could " + vnb[v] + nnobles[n];

                ps5 = "nosotros " + "podríamos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we " + "could " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "podría " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I " + "couldn't " + vnb[v] + nnobles[n];

                ps2 = "tú no " + "podrías " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you " + "couldn't " + vnb[v] + nnobles[n];

                ps3 = "él no " + "podría " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he " + "couldn't " + vnb[v] + nnobles[n];

                ps3ella = "ella no " + "podría " + vnbs[v] + nnoblesesp[n];
                ps3she = "she " + "couldn't " + vnb[v] + nnobles[n];

                ps3eso = "eso no " + "podría " + vnbs[v] + nnoblesesp[n];
                ps3it = "it " + "couldn't " + vnb[v] + nnobles[n];

                ps4 = "ellos no " + "podrían " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they " + "couldn't " + vnb[v] + nnobles[n];

                ps5 = "nosotros no " + "podríamos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we " + "couldn't " + vnb[v] + nnobles[n];
                break;
        }
    } // neg
    public void GenCouldCont2() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "podría estar " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "could " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "podrías estar " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "could " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él " + "podría estar " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "could be " + vnbc[v] + nnobles[n];

                ps3ella = "ella podría estar " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "could be " + vnbc[v] + nnobles[n];

                ps3eso = "eso podría estar " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "could be " + vnbc[v] + nnobles[n];

                ps4 = "ellos podrían estar " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "could be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros podríamos estar " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "could be " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "podría estar " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "couldn't " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "podrías estar " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "couldn't " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "podría estar " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "couldn't be " + vnbc[v] + nnobles[n];

                ps3ella = "ella no podría estar " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "couldn't be " + vnbc[v] + nnobles[n];

                ps3eso = "eso no podría estar " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "couldn't be " + vnbc[v] + nnobles[n];

                ps4 = "ellos no podrían estar " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "couldn't be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no podríamos estar " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "couldn't be " + vnbc[v] + nnobles[n];
                break;
        }
    } // neg
    public void GenCouldPerf2() {
        switch (neg) {

            case 0:
                ps1 = "yo " + "pude haber " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "could have " + vpeng[v] + nnobles[n];

                ps2 = "tú " + "pudiste haber " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "could have " + vpeng[v] + nnobles[n];

                ps3 = "él " + "pudo haber " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "could have " + vpeng[v] + nnobles[n];

                ps3ella = "ella pudo haber " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "could have " + vpeng[v] + nnobles[n];

                ps3eso = "eso pudo haber " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "could have " + vpeng[v] + nnobles[n];

                ps4 = "ellos pudieron haber " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "could have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros pudimos haber " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "could have " + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "pude haber " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "couldn't have " + vpeng[v] + nnobles[n];

                ps2 = "tú no " + "pudiste haber " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "couldn't have " + vpeng[v] + nnobles[n];

                ps3 = "él no " + "pudo haber " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "couldn't have " + vpeng[v] + nnobles[n];

                ps3ella = "ella no pudo haber " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "couldn't have " + vpeng[v] + nnobles[n];

                ps3eso = "eso no pudo haber " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "couldn't have " + vpeng[v] + nnobles[n];

                ps4 = "ellos no pudieron haber " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "couldn't have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros no pudimos haber " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "couldn't have " + vpeng[v] + nnobles[n];

                break;
        }

    }  // neg
    public void GenCouldPerfCont2() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "pude haber estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "could have been " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "pudiste haber estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "could have been " + vnbc[v] + nnobles[n];

                ps3 = "él " + "pudo haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "could have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella pudo haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "could have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso pudo haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "could have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos pudieron haber estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "could have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros " + "pudimos haber estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "could have been " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "pude haber estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "couldn't have been " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "pudiste haber estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "couldn't have been " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "pudo haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "couldn't have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella no pudo haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "couldn't have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso no pudo haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "couldn't have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos no pudieron haber estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "couldn't have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no " + "pudimos haber estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "couldn't have been " + vnbc[v] + nnobles[n];
                break;
        }

    }  // neg

    // aqui van los del should
    public void GenShouldSimp2() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "debería " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I " + "should " + vnb[v] + nnobles[n];

                ps2 = "tú " + "deberías " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you " + "should " + vnb[v] + nnobles[n];

                ps3 = "él " + "debería " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he " + "should " + vnb[v] + nnobles[n];

                ps3ella = "ella " + "debería " + vnbs[v] + nnoblesesp[n];
                ps3she = "she " + "should " + vnb[v] + nnobles[n];

                ps3eso = "eso " + "debería " + vnbs[v] + nnoblesesp[n];
                ps3it = "it " + "should " + vnb[v] + nnobles[n];

                ps4 = "ellos " + "deberían " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they " + "should " + vnb[v] + nnobles[n];

                ps5 = "nosotros " + "deberíamos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we " + "should " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "debería " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I " + "shouldn't " + vnb[v] + nnobles[n];

                ps2 = "tú no " + "deberías " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you " + "shouldn't " + vnb[v] + nnobles[n];

                ps3 = "él no " + "debería " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he " + "shouldn't " + vnb[v] + nnobles[n];

                ps3ella = "ella no " + "debería " + vnbs[v] + nnoblesesp[n];
                ps3she = "she " + "shouldn't " + vnb[v] + nnobles[n];

                ps3eso = "eso no " + "debería " + vnbs[v] + nnoblesesp[n];
                ps3it = "it " + "shouldn't " + vnb[v] + nnobles[n];

                ps4 = "ellos no " + "deberían " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they " + "shouldn't " + vnb[v] + nnobles[n];

                ps5 = "nosotros no " + "deberíamos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we " + "shouldn't " + vnb[v] + nnobles[n];
                break;
        }
    }  // neg
    public void GenShouldCont2() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "debería estar " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "should " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "deberías estar " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "should " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él " + "debería estar " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "should be " + vnbc[v] + nnobles[n];

                ps3ella = "ella debería estar " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "should be " + vnbc[v] + nnobles[n];

                ps3eso = "eso debería estar " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "should be " + vnbc[v] + nnobles[n];

                ps4 = "ellos deberían estar " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "should be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros deberíamos estar " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "should be " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "debería estar " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "shouldn't " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "deberías estar " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "shouldn't " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "debería estar " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "shouldn't be " + vnbc[v] + nnobles[n];

                ps3ella = "ella no debería estar " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "shouldn't be " + vnbc[v] + nnobles[n];

                ps3eso = "eso no debería estar " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "shouldn't be " + vnbc[v] + nnobles[n];

                ps4 = "ellos no deberían estar " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "shouldn't be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no deberíamos estar " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "shouldn't be " + vnbc[v] + nnobles[n];
                break;
        }
    } // neg
    public void GenShouldPerf2() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "debí haber " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "should have " + vpeng[v] + nnobles[n];

                ps2 = "tú " + "debíste haber " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "should have " + vpeng[v] + nnobles[n];

                ps3 = "él " + "debío haber " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "should have " + vpeng[v] + nnobles[n];

                ps3ella = "ella debío haber " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "should have " + vpeng[v] + nnobles[n];

                ps3eso = "eso " + "debío haber " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "should have " + vpeng[v] + nnobles[n];

                ps4 = "ellos debíeron haber " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "should have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros debímos haber " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "should have " + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "debí haber " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "shouldn't have " + vpeng[v] + nnobles[n];

                ps2 = "tú no " + "debíste haber " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "shouldn't have " + vpeng[v] + nnobles[n];

                ps3 = "él no " + "debío haber " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "shouldn't have " + vpeng[v] + nnobles[n];

                ps3ella = "ella no debío haber " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "shouldn't have " + vpeng[v] + nnobles[n];

                ps3eso = "eso no " + "debío haber " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "shouldn't have " + vpeng[v] + nnobles[n];

                ps4 = "ellos no debíeron haber " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "shouldn't have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros no debímos haber " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "shouldn't have " + vpeng[v] + nnobles[n];
                break;
        }
    } // neg
    public void GenShouldPerfCont2() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "debí haber estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "should have been " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "debiste haber estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "should have been " + vnbc[v] + nnobles[n];

                ps3 = "él " + "debió haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "should have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella debió haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "should have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso debió haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "should have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos debieron haber estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "should have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros " + "debimos haber estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "should have been " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "debí haber estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "shouldn't have been " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "debiste haber estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "shouldn't have been " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "debió haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "shouldn't have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella no debió haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "shouldn't have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso no debió haber estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "shouldn't have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos no debieron haber estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "shouldn't have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no " + "debimos haber estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "shouldn't have been " + vnbc[v] + nnobles[n];
                break;
        }


    } // neg
    // los del might
    public void GenMightSimp2() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "quizá " + vn1y3subj[v] + nnoblesesp[n];
                ps1eng = "I " + "might " + vnb[v] + nnobles[n];

                ps2 = "tú " + "quizá " + vn2subj[v] + nnoblesesp[n];
                ps2eng = "you " + "might " + vnb[v] + nnobles[n];

                ps3 = "él " + "quizá" + vn1y3subj[v] + nnoblesesp[n];
                ps3eng = "he " + "might " + vnb[v] + nnobles[n];

                ps3ella = "ella " + "quizá " + vn1y3subj[v] + nnoblesesp[n];
                ps3she = "she " + "might " + vnb[v] + nnobles[n];

                ps3eso = "eso " + "quizá " + vn1y3subj[v] + nnoblesesp[n];
                ps3it = "it " + "might " + vnb[v] + nnobles[n];

                ps4 = "ellos " + "quizá " + vn4subj[v] + nnoblesesp[n];
                ps4eng = "they " + "might " + vnb[v] + nnobles[n];

                ps5 = "nosotros " + "quizá " + vn5subj[v] + nnoblesesp[n];
                ps5eng = "we " + "might " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "quizá " + vn1y3subj[v] + nnoblesesp[n];
                ps1eng = "I " + "might not " + vnb[v] + nnobles[n];

                ps2 = "tú no " + "quizá " + vn2subj[v] + nnoblesesp[n];
                ps2eng = "you " + "might not " + vnb[v] + nnobles[n];

                ps3 = "él no " + "quizá" + vn1y3subj[v] + nnoblesesp[n];
                ps3eng = "he " + "might not " + vnb[v] + nnobles[n];

                ps3ella = "ella no " + "quizá " + vn1y3subj[v] + nnoblesesp[n];
                ps3she = "she " + "might not " + vnb[v] + nnobles[n];

                ps3eso = "eso no " + "quizá " + vn1y3subj[v] + nnoblesesp[n];
                ps3it = "it " + "might not " + vnb[v] + nnobles[n];

                ps4 = "ellos no " + "quizá " + vn4subj[v] + nnoblesesp[n];
                ps4eng = "they " + "might not " + vnb[v] + nnobles[n];

                ps5 = "nosotros no " + "quizá " + vn5subj[v] + nnoblesesp[n];
                ps5eng = "we " + "might not " + vnb[v] + nnobles[n];
                break;
        }
    }  // neg
    public void GenMightCont2() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "quizá esté " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "might " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "quizá estés " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "might " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él " + "quizá esté " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "might be " + vnbc[v] + nnobles[n];

                ps3ella = "ella quizá esté " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "might be " + vnbc[v] + nnobles[n];

                ps3eso = "eso quizá esté " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "might be " + vnbc[v] + nnobles[n];

                ps4 = "ellos quizá estén " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "might be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros quizá estemos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "might be " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo " + "quizá no esté " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "might not " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "quizá no estés " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "might not " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él " + "quizá no esté " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "might not be " + vnbc[v] + nnobles[n];

                ps3ella = "ella quizá no esté " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "might not be " + vnbc[v] + nnobles[n];

                ps3eso = "eso quizá no esté " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "might not be " + vnbc[v] + nnobles[n];

                ps4 = "ellos quizá no estén " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "might not be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros quizá no estemos " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "might not be " + vnbc[v] + nnobles[n];
                break;
        }
    } // neg
    public void GenMightPerf2() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "quizá haya " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "might have " + vpeng[v] + nnobles[n];

                ps2 = "tú " + "quizá hayas " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "might have " + vpeng[v] + nnobles[n];

                ps3 = "él " + "quizá haya " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "might have " + vpeng[v] + nnobles[n];

                ps3ella = "ella quizá haya " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "might have " + vpeng[v] + nnobles[n];

                ps3eso = "eso " + "quizá haya " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "might have " + vpeng[v] + nnobles[n];

                ps4 = "ellos quizá hayan " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "might have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros quizá hayamos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "might have " + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo " + "quizá no haya " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I " + "might not have " + vpeng[v] + nnobles[n];

                ps2 = "tú " + "quizá no hayas " + vpsp[v] + nnoblesesp[n];
                ps2eng = "you " + "might not have " + vpeng[v] + nnobles[n];

                ps3 = "él " + "quizá no haya " + vpsp[v] + nnoblesesp[n];
                ps3eng = "he " + "might not have " + vpeng[v] + nnobles[n];

                ps3ella = "ella quizá no haya " + vpsp[v] + nnoblesesp[n];
                ps3she = "she " + "might not have " + vpeng[v] + nnobles[n];

                ps3eso = "eso " + "quizá no haya " + vpsp[v] + nnoblesesp[n];
                ps3it = "it " + "might not have " + vpeng[v] + nnobles[n];

                ps4 = "ellos quizá no hayan " + vpsp[v] + nnoblesesp[n];
                ps4eng = "they " + "might not have " + vpeng[v] + nnobles[n];

                ps5 = "nosotros quizá no hayamos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "we " + "might not have " + vpeng[v] + nnobles[n];
                break;
        }
    } // neg
    public void GenMightPerfCont2() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "quizá haya estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "might have been " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "quizá hayas estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "might have been " + vnbc[v] + nnobles[n];

                ps3 = "él " + "quizá haya estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "might have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella quizá haya estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "might have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso quizá haya estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "might have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos quizá hayan estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "might have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros " + "quizá hayamos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "might have been " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo " + "quizá no haya estado " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "might not have been " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "quizá no hayas estado " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "might not have been " + vnbc[v] + nnobles[n];

                ps3 = "él " + "quizá no haya estado " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "might not have been " + vnbc[v] + nnobles[n];

                ps3ella = "ella quizá no haya estado " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "might not have been " + vnbc[v] + nnobles[n];

                ps3eso = "eso quizá no haya estado " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "might not have been " + vnbc[v] + nnobles[n];

                ps4 = "ellos quizá no hayan estado " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "might not have been " + vnbc[v] + nnobles[n];

                ps5 = "nosotros " + "quizá no hayamos estado " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "might not have been " + vnbc[v] + nnobles[n];
                break;
        }


    } // neg

    // aqui van los del can
    public void GenCanSimp2() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "puedo " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I " + "can " + vnb[v] + nnobles[n];

                ps2 = "tú " + "puedes " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you " + "can " + vnb[v] + nnobles[n];

                ps3 = "él " + "puede " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he " + "can " + vnb[v] + nnobles[n];

                ps3ella = "ella " + "puede " + vnbs[v] + nnoblesesp[n];
                ps3she = "she " + "can " + vnb[v] + nnobles[n];

                ps3eso = "eso " + "puede " + vnbs[v] + nnoblesesp[n];
                ps3it = "it " + "can " + vnb[v] + nnobles[n];

                ps4 = "ellos " + "pueden " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they " + "can " + vnb[v] + nnobles[n];

                ps5 = "nosotros " + "podemos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we " + "can " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "puedo " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I " + "can't " + vnb[v] + nnobles[n];

                ps2 = "tú no " + "puedes " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you " + "can't " + vnb[v] + nnobles[n];

                ps3 = "él no " + "puede " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he " + "can't " + vnb[v] + nnobles[n];

                ps3ella = "ella no " + "puede " + vnbs[v] + nnoblesesp[n];
                ps3she = "she " + "can't " + vnb[v] + nnobles[n];

                ps3eso = "eso no " + "puede " + vnbs[v] + nnoblesesp[n];
                ps3it = "it " + "can't " + vnb[v] + nnobles[n];

                ps4 = "ellos no " + "pueden " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they " + "can't " + vnb[v] + nnobles[n];

                ps5 = "nosotros no " + "podemos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we " + "can't  " + vnb[v] + nnobles[n];
                break;
        }

    }  //neg
    public void GenCanCont2() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "puedo estar " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "can " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "puedes estar " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "can " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él " + "puede estar " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "can be " + vnbc[v] + nnobles[n];

                ps3ella = "ella puede estar " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "can be " + vnbc[v] + nnobles[n];

                ps3eso = "eso puede estar " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "can be " + vnbc[v] + nnobles[n];

                ps4 = "ellos pueden estar " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "can be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros podemos estar " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "can be " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "puedo estar " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "can't " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "no puedes estar " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "can't " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él " + "no puede estar " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "can't be " + vnbc[v] + nnobles[n];

                ps3ella = "ella no puede estar " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "can't be " + vnbc[v] + nnobles[n];

                ps3eso = "eso no puede estar " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "can't be " + vnbc[v] + nnobles[n];

                ps4 = "ellos no pueden estar " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "can't be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no podemos estar " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "can't be " + vnbc[v] + nnobles[n];
                break;
        }

    }       // neg
    // los del must
    public void GenMustSimp2() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "debo " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I " + "must " + vnb[v] + nnobles[n];

                ps2 = "tú " + "debes " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you " + "must " + vnb[v] + nnobles[n];

                ps3 = "él " + "debe " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he " + "must " + vnb[v] + nnobles[n];

                ps3ella = "ella " + "debe " + vnbs[v] + nnoblesesp[n];
                ps3she = "she " + "must " + vnb[v] + nnobles[n];

                ps3eso = "eso " + "debe " + vnbs[v] + nnoblesesp[n];
                ps3it = "it " + "must " + vnb[v] + nnobles[n];

                ps4 = "ellos " + "deben " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they " + "must " + vnb[v] + nnobles[n];

                ps5 = "nosotros " + "debemos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we " + "must " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "debo " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I " + "mustn't " + vnb[v] + nnobles[n];

                ps2 = "tú no " + "debes " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you " + "mustn't " + vnb[v] + nnobles[n];

                ps3 = "él no " + "debe " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he " + "mustn't " + vnb[v] + nnobles[n];

                ps3ella = "ella no " + "debe " + vnbs[v] + nnoblesesp[n];
                ps3she = "she " + "mustn't " + vnb[v] + nnobles[n];

                ps3eso = "eso no " + "debe " + vnbs[v] + nnoblesesp[n];
                ps3it = "it " + "mustn't " + vnb[v] + nnobles[n];

                ps4 = "ellos no " + "deben " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they " + "mustn't " + vnb[v] + nnobles[n];

                ps5 = "nosotros no " + "debemos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we " + "mustn't " + vnb[v] + nnobles[n];

                break;
        }
    }  // nuev
    public void GenMustCont2() {

        switch (neg) {
            case 0:
                ps1 = "yo " + "debo estar " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "must " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú " + "debes estar " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "must " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él " + "debe estar " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "must be " + vnbc[v] + nnobles[n];

                ps3ella = "ella debe estar " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "must be " + vnbc[v] + nnobles[n];

                ps3eso = "eso debe estar " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "must be " + vnbc[v] + nnobles[n];

                ps4 = "ellos deben estar " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "must be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros debemos estar " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "must be " + vnbc[v] + nnobles[n];
                break;
            case 1:
                ps1 = "yo no " + "debo estar " + vnbcs[v] + nnoblesesp[n];
                ps1eng = "I " + "mustn't " + "be " + vnbc[v] + nnobles[n];

                ps2 = "tú no " + "debes estar " + vnbcs[v] + nnoblesesp[n];
                ps2eng = "you " + "mustn't " + "be " + vnbc[v] + nnobles[n];

                ps3 = "él no " + "debe estar " + vnbcs[v] + nnoblesesp[n];
                ps3eng = "he " + "mustn't be " + vnbc[v] + nnobles[n];

                ps3ella = "ella no debe estar " + vnbcs[v] + nnoblesesp[n];
                ps3she = "she " + "mustn't be " + vnbc[v] + nnobles[n];

                ps3eso = "eso no debe estar " + vnbcs[v] + nnoblesesp[n];
                ps3it = "it " + "mustn't be " + vnbc[v] + nnobles[n];

                ps4 = "ellos no deben estar " + vnbcs[v] + nnoblesesp[n];
                ps4eng = "they " + "mustn't be " + vnbc[v] + nnobles[n];

                ps5 = "nosotros no debemos estar " + vnbcs[v] + nnoblesesp[n];
                ps5eng = "we " + "mustn't be " + vnbc[v] + nnobles[n];

                break;
        }
    } // nuev
    // non-basics
    //want to dificultad 2
    public void WantYouTo2() {
        int rn1 = (int) (Math.random() * 6);
        int rn2 = (int) (Math.random() * 5);
        int neg = (int) (Math.random() * 2);

        //want to subject
        String wtsj[] = {"I want ", "you want ", "he wants ", "she wants ", "it wants ", "we want ", "they want "};
        //want to subject negative
        String wtsjn[] = {"I don't want ", "you don't want ", "he doesn't want ", "she doesn't want ", "it doesn't want "
                , "we don't want ", "they don't want "};
        //want to object
        String wtobj1[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj2[] = {"me to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj3[] = {"you to " + vnb[v], "me to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj4[] = {"you to " + vnb[v], "him to " + vnb[v], "me to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj5[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "me to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj6[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "them to " + vnb[v]};
        String wtobj7[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "me to " + vnb[v]};

        //sujetos want to en sp
        String wtsjs[] = {"yo quiero ", "tú quieres ", "él quiere ", "ella quiere ", "eso quiere ", "nosotros queremos ", "ellos quieren "};
        //sujetos want to en sp negativo
        String wtsjsn[] = {"yo no quiero ", "tú no quieres ", "él no quiere ", "ella no quiere ", "eso no quiere ", "nosotros no queremos ", "ellos no quieren "};

        // objetos wt en sp
        String wtobj1s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj2s[] = {"que yo " + vn1y3subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj3s[] = {"que tú " + vn2subj[v], "que yo " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj4s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que yo " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj5s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que yo " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj6s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que ellos " + vn4subj[v]};
        String wtobj7s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que yo " + vn1y3subj[v]};

        switch (neg) {
            case 0:
                ps1 = wtsjs[0] + wtobj1s[rn1] + nnoblesesp[n];
                ps1eng = wtsj[0] + wtobj1[rn1] + nnobles[n];

                ps2 = wtsjs[1] + wtobj2s[rn1] + nnoblesesp[n];
                ps2eng = wtsj[1] + wtobj2[rn1] + nnobles[n];

                ps3 = wtsjs[2] + wtobj3s[rn1] + nnoblesesp[n];
                ps3eng = wtsj[2] + wtobj3[rn1] + nnobles[n];

                ps3ella = wtsjs[3] + wtobj4s[rn1] + nnoblesesp[n];
                ps3she = wtsj[3] + wtobj4[rn1] + nnobles[n];

                ps3eso = wtsjs[4] + wtobj5s[rn1] + nnoblesesp[n];
                ps3it = wtsj[4] + wtobj5[rn1] + nnobles[n];

                ps4 = wtsjs[6] + wtobj6s[rn2] + nnoblesesp[n];
                ps4eng = wtsj[6] + wtobj6[rn2] + nnobles[n];

                ps5 = wtsjs[5] + wtobj7s[rn1] + nnoblesesp[n];
                ps5eng = wtsj[5] + wtobj7[rn1] + nnobles[n];
                break;
            case 1:
                ps1 = wtsjsn[0] + wtobj1s[rn1] + nnoblesesp[n];
                ps1eng = wtsjn[0] + wtobj1[rn1] + nnobles[n];

                ps2 = wtsjsn[1] + wtobj2s[rn1] + nnoblesesp[n];
                ps2eng = wtsjn[1] + wtobj2[rn1] + nnobles[n];

                ps3 = wtsjsn[2] + wtobj3s[rn1] + nnoblesesp[n];
                ps3eng = wtsjn[2] + wtobj3[rn1] + nnobles[n];

                ps3ella = wtsjsn[3] + wtobj4s[rn1] + nnoblesesp[n];
                ps3she = wtsjn[3] + wtobj4[rn1] + nnobles[n];

                ps3eso = wtsjsn[4] + wtobj5s[rn1] + nnoblesesp[n];
                ps3it = wtsjn[4] + wtobj5[rn1] + nnobles[n];

                ps4 = wtsjsn[6] + wtobj6s[rn2] + nnoblesesp[n];
                ps4eng = wtsjn[6] + wtobj6[rn2] + nnobles[n];

                ps5 = wtsjsn[5] + wtobj7s[rn1] + nnoblesesp[n];
                ps5eng = wtsjn[5] + wtobj7[rn1] + nnobles[n];
                break;
        }
    }

    //for to dificultad 2
    public void ForSubTo2() {
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String ftsj[] = {
                "for me to ", "for you to ", "for him to ", "for her to ", "for it to ",
                "for them to ", "for us to "
        };

        //subject in spanish
        String ftsjs[] = {
                "para que yo ", "para que tú ", "para que él ", "para que ella ",
                "para que eso ", "para que ellos ", "para que nosotros "
        };

        //subject in eng negative
        String ftsjn[] = {
                "for me not to ", "for you not to ", "for him not to ", "for her not to ",
                "for it not to ", "for them not to ", "for us not to "
        };

        //subject in spanish negative
        String ftsjsn[] = {
                "para que yo no ", "para que tú no ", "para que él no ", "para que ella no ",
                "para que eso no ", "para que ellos no ", "para que nosotros no "
        };

        switch (neg) {
            case 0:
                ps1 = ftsjs[0] + vn1y3subj[v] + nnoblesesp[n];
                ps1eng = ftsj[0] + vnb[v] + nnobles[n];

                ps2 = ftsjs[1] + vn2subj[v] + nnoblesesp[n];
                ps2eng = ftsj[1] + vnb[v] + nnobles[n];

                ps3 = ftsjs[2] + vn1y3subj[v] + nnoblesesp[n];
                ps3eng = ftsj[2] + vnb[v] + nnobles[n];

                ps3ella = ftsjs[3] + vn1y3subj[v] + nnoblesesp[n];
                ps3she = ftsj[3] + vnb[v] + nnobles[n];

                ps3eso = ftsjs[4] + vn1y3subj[v] + nnoblesesp[n];
                ps3it = ftsj[4] + vnb[v] + nnobles[n];

                ps4 = ftsjs[5] + vn4subj[v] + nnoblesesp[n];
                ps4eng = ftsj[5] + vnb[v] + nnobles[n];

                ps5 = ftsjs[6] + vn5subj[v] + nnoblesesp[n];
                ps5eng = ftsj[6] + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = ftsjsn[0] + vn1y3subj[v] + nnoblesesp[n];
                ps1eng = ftsjn[0] + vnb[v] + nnobles[n];

                ps2 = ftsjsn[1] + vn2subj[v] + nnoblesesp[n];
                ps2eng = ftsjn[1] + vnb[v] + nnobles[n];

                ps3 = ftsjsn[2] + vn1y3subj[v] + nnoblesesp[n];
                ps3eng = ftsjn[2] + vnb[v] + nnobles[n];

                ps3ella = ftsjsn[3] + vn1y3subj[v] + nnoblesesp[n];
                ps3she = ftsjn[3] + vnb[v] + nnobles[n];

                ps3eso = ftsjsn[4] + vn1y3subj[v] + nnoblesesp[n];
                ps3it = ftsjn[4] + vnb[v] + nnobles[n];

                ps4 = ftsjsn[5] + vn4subj[v] + nnoblesesp[n];
                ps4eng = ftsjn[5] + vnb[v] + nnobles[n];

                ps5 = ftsjsn[6] + vn5subj[v] + nnoblesesp[n];
                ps5eng = ftsjn[6] + vnb[v] + nnobles[n];
                break;
        }
    }
    // Supposed to
    // se supone que tiene que pasar cases 2 y 3
    // se supone que va a pasar cases 4 y 5

    public void supposedtopres() {

        switch (vc) {
            case 0:
                ps1 = "Se supone que " + vn1[v] + nnoblesesp[n];
                ps1eng = "I'm supposed to " + vnb[v] + nnobles[n];

                ps2 = "Se supone que " + vn2[v] + nnoblesesp[n];
                ps2eng = "you are supposed to " + vnb[v] + nnobles[n];

                ps3 = "Se supone que él " + vn3[v] + nnoblesesp[n];
                ps3eng = "he is supposed to " + vnb[v] + nnobles[n];

                ps3ella = "Se supone que ella " + vn3[v] + nnoblesesp[n];
                ps3she = "she is supposed to " + vnb[v] + nnobles[n];

                ps3eso = "Se supone que eso " + vn3[v] + nnoblesesp[n];
                ps3it = "it is supposed to " + vnb[v] + nnobles[n];

                ps4 = "se supone que " + vn4[v] + nnoblesesp[n];
                ps4eng = "they are supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que " + vn5[v] + nnoblesesp[n];
                ps5eng = "we are supposed to " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "se supone que no " + vn1[v] + nnoblesesp[n];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n];

                ps2 = "se supone que no " + vn2[v] + nnoblesesp[n];
                ps2eng = "you aren't supposed to " + vnb[v] + nnobles[n];

                ps3 = "se supone que él no " + vn3[v] + nnoblesesp[n];
                ps3eng = "he isn't supposed to " + vnb[v] + nnobles[n];

                ps3ella = "se supone que ella no " + vn3[v] + nnoblesesp[n];
                ps3she = "she isn't supposed to " + vnb[v] + nnobles[n];

                ps3eso = "se supone que eso no " + vn3[v] + nnoblesesp[n];
                ps3it = "it isn't supposed to  " + vnb[v] + nnobles[n];

                ps4 = "se supone que no " + vn4[v] + nnoblesesp[n];
                ps4eng = "they aren't supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que no " + vn5[v] + nnoblesesp[n];
                ps5eng = "we aren't supposed to " + vnb[v] + nnobles[n];
                break;

            case 2:
                ps1 = "se supone que tengo que " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I'm supposed to " + vnb[v] + nnobles[n];

                ps2 = "se supone que tienes que " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you are supposed to " + vnb[v] + nnobles[n];

                ps3 = "se supone que él tiene que " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he is supposed to " + vnb[v] + nnobles[n];

                ps3ella = "se supone que ella tiene que " + vnbs[v] + nnoblesesp[n];
                ps3she = "she is supposed to " + vnb[v] + nnobles[n];

                ps3eso = "se supone que eso tiene que " + vnbs[v] + nnoblesesp[n];
                ps3it = "it is supposed to  " + vnb[v] + nnobles[n];

                ps4 = "se supone que tienen que " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they are supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que tenemos que " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we are supposed to " + vnb[v] + nnobles[n];
                break;

            case 3:
                ps1 = "se supone que no tengo que " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n];

                ps2 = "se supone que no tienes que " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you aren't supposed to " + vnb[v] + nnobles[n];

                ps3 = "se supone que él no tiene que  " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he isn't supposed to " + vnb[v] + nnobles[n];

                ps3ella = "se supone que ella no tiene que " + vnbs[v] + nnoblesesp[n];
                ps3she = "she isn't supposed to " + vnb[v] + nnobles[n];

                ps3eso = "se supone que eso no tiene que " + vnbs[v] + nnoblesesp[n];
                ps3it = "it isn't supposed to  " + vnb[v] + nnobles[n];

                ps4 = "se supone que no tienen que " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they aren't supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que no tenemos que " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we aren't supposed to " + vnb[v] + nnobles[n];
                break;

            case 4:
    ps1 = "se supone que voy a " + vnbs[v] + nnoblesesp[n];
    ps1eng = "I'm supposed to " + vnb[v] + nnobles[n];

    ps2 = "se supone que vas a " + vnbs[v] + nnoblesesp[n];
    ps2eng = "you are supposed to " + vnb[v] + nnobles[n];

    ps3 = "se supone que él va a " + vnbs[v] + nnoblesesp[n];
    ps3eng = "he is supposed to " + vnb[v] + nnobles[n];

    ps3ella = "se supone que ella va a " + vnbs[v] + nnoblesesp[n];
    ps3she = "she is supposed to " + vnb[v] + nnobles[n];

    ps3eso = "se supone que eso va a " + vnbs[v] + nnoblesesp[n];
    ps3it = "it is supposed to  " + vnb[v] + nnobles[n];

    ps4 = "se supone que van a " + vnbs[v] + nnoblesesp[n];
    ps4eng = "they are supposed to " + vnb[v] + nnobles[n];

    ps5 = "se supone que vamos a " + vnbs[v] + nnoblesesp[n];
    ps5eng = "we are supposed to " + vnb[v] + nnobles[n];
                break;

            case 5:
                ps1 = "se supone no voy a " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n];

                ps2 = "se supone que no vas a " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you aren't supposed to " + vnb[v] + nnobles[n];

                ps3 = "se supone que él no va a " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he isn't supposed to " + vnb[v] + nnobles[n];

                ps3ella = "se supone que ella no va a " + vnbs[v] + nnoblesesp[n];
                ps3she = "she isn't supposed to " + vnb[v] + nnobles[n];

                ps3eso = "se supone que eso no va a " + vnbs[v] + nnoblesesp[n];
                ps3it = "it isn't supposed to  " + vnb[v] + nnobles[n];

                ps4 = "se supone que no van a " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they aren't supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que no vamos a " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we aren't supposed to " + vnb[v] + nnobles[n];
                break;

        }
    } //SergioVazquez 250322

    public void supposedtopast() {

        switch (neg) {
            case 0:
                ps1 = "Se supone que yo " + ps1imp[v] + nnoblesesp[n];
                ps1eng = "I was supposed to " + vnb[v] + nnobles[n];

                ps2 = "Se supone que tú " + ps2imp[v] + nnoblesesp[n];
                ps2eng = "you were supposed to " + vnb[v] + nnobles[n];

                ps3 = "Se supone que él " + ps3imp[v] + nnoblesesp[n];
                ps3eng = "he was supposed to " + vnb[v] + nnobles[n];

                ps3ella = "Se supone que ella " + ps3imp[v] + nnoblesesp[n];
                ps3she = "she was supposed to " + vnb[v]+ nnobles[n];

                ps3eso = "Se supone que eso " + ps3imp[v] + nnoblesesp[n];
                ps3it = "it was supposed to " + vn3[v] + nnobles[n];

                ps4 = "se supone que " + vn4imp[v] + nnoblesesp[n];
                ps4eng = "they were supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que " + vn5imp[v] + nnoblesesp[n];
                ps5eng = "we were supposed to " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "se supone que no " + ps1imp[v] + nnoblesesp[n];
                ps1eng = "I wasn't supposed to " + vnb[v] + nnobles[n];

                ps2 = "se supone que no " + ps2imp[v] + nnoblesesp[n];
                ps2eng = "you weren't supposed to " + vnb[v] + nnobles[n];

                ps3 = "se supone que él no " + ps3imp[v] + nnoblesesp[n];
                ps3eng = "he wasn't supposed to " + vnb[v] + nnobles[n];

                ps3ella = "se supone que ella no " + ps3imp[v] + nnoblesesp[n];
                ps3she = "she wasn't supposed to " + vnb[v] + nnobles[n];

                ps3eso = "se supone que eso no " + ps3imp[v] + nnoblesesp[n];
                ps3it = "it wasn't supposed to " + vnb[v] + nnobles[n];

                ps4 = "se supone que no " + vn4imp[v] + nnoblesesp[n];
                ps4eng = "they weren't supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que no " + vn5imp[v] + nnoblesesp[n];
                ps5eng = "we weren't supposed to " + vnb[v] + nnobles[n];
                break;

            case 2:
                ps1 = "Se supone que tenía que " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I was supposed to " + vnb[v] + nnobles[n];

                ps2 = "Se supone que tenías que " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you were supposed to " + vnb[v] + nnobles[n];

                ps3 = "Se supone que él tenía que " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he was supposed to " + vnb[v] + nnobles[n];

                ps3ella = "Se supone que ella tenía que " + vnbs[v] + nnoblesesp[n];
                ps3she = "she was supposed to " + vnb[v]+ nnobles[n];

                ps3eso = "Se supone que eso tenía que " + vnbs[v] + nnoblesesp[n];
                ps3it = "it was supposed to " + vn3[v] + nnobles[n];

                ps4 = "se supone que tenían que " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they were supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que teníamos que " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we were supposed to " + vnb[v] + nnobles[n];
                break;
            case 3:
                ps1 = "Se supone que no tenía que " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I wasn't supposed to " + vnb[v] + nnobles[n];

                ps2 = "Se supone que no tenías que " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you weren't supposed to " + vnb[v] + nnobles[n];

                ps3 = "Se supone que él no tenía que " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he wasn't supposed to " + vnb[v] + nnobles[n];

                ps3ella = "Se supone que ella no tenía que " + vnbs[v] + nnoblesesp[n];
                ps3she = "she wasn't supposed to " + vn3[v] + nnobles[n];

                ps3eso = "Se supone que eso no tenía que " + vnbs[v] + nnoblesesp[n];
                ps3it = "it wasn't supposed to " + vn3[v] + nnobles[n];

                ps4 = "se supone que no tenían que " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they weren't supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que no teníamos que " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we weren't supposed to " + vnb[v] + nnobles[n];
                break;

            case 4:
                ps1 = "Se supone iba a " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I was supposed to " + vnb[v] + nnobles[n];

                ps2 = "Se supone que ibas a " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you were supposed to " + vnb[v] + nnobles[n];

                ps3 = "Se supone que él iba a " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he was supposed to " + vnb[v] + nnobles[n];

                ps3ella = "Se supone que ella iba a " + vnbs[v] + nnoblesesp[n];
                ps3she = "she was supposed to " + vnb[v]+ nnobles[n];

                ps3eso = "Se supone que eso iba a " + vnbs[v] + nnoblesesp[n];
                ps3it = "it was supposed to " + vn3[v] + nnobles[n];

                ps4 = "se supone que iban a " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they were supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que ibamos a " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we were supposed to " + vnb[v] + nnobles[n];
                break;
            case 5:
                ps1 = "Se supone que no iba a " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I wasn't supposed to " + vnb[v] + nnobles[n];

                ps2 = "Se supone que no ibas a " + vnbs[v] + nnoblesesp[n];
                ps2eng = "you weren't supposed to " + vnb[v] + nnobles[n];

                ps3 = "Se supone que él no iba a " + vnbs[v] + nnoblesesp[n];
                ps3eng = "he wasn't supposed to " + vnb[v] + nnobles[n];

                ps3ella = "Se supone que ella no iba a " + vnbs[v] + nnoblesesp[n];
                ps3she = "she wasn't supposed to " + vn3[v] + nnobles[n];

                ps3eso = "Se supone que eso no iba a " + vnbs[v] + nnoblesesp[n];
                ps3it = "it wasn't supposed to " + vn3[v] + nnobles[n];

                ps4 = "se supone que no iban a " + vnbs[v] + nnoblesesp[n];
                ps4eng = "they weren't supposed to " + vnb[v] + nnobles[n];

                ps5 = "se supone que no ibamos a " + vnbs[v] + nnoblesesp[n];
                ps5eng = "we weren't supposed to " + vnb[v] + nnobles[n];
                break;
        }
    } //SergioVazquez 250322

    //Wish Past Simple Dif 2
    public void WishPastSimpDif2() {

        switch (neg) {
            case 0:
                ps1 = "Ojalá yo " + ps1wish[v] + nnoblesesp[n];
                ps1eng = "I wish " + "I " + vnbp[v] + nnobles[n];

                ps2 = "Ojalá tú " + ps2wish[v] + nnoblesesp[n];
                ps2eng = "I wish " + "you " + vnbp[v] + nnobles[n];

                ps3 = "Ojalá él " + ps3wish[v] + nnoblesesp[n];
                ps3eng = "I wish " + "he " + vnbp[v] + nnobles[n];

                ps3ella = "Ojalá ella " + ps3wish[v] + nnoblesesp[n];
                ps3she = "I wish " + "she " + vnbp[v] + nnobles[n];

                ps3eso = "Ojalá eso " + ps3wish[v] + nnoblesesp[n];
                ps3it = "I wish " + "it " + vnbp[v] + nnobles[n];

                ps4 = "Ojalá ellos " + ps4wish[v] + nnoblesesp[n];
                ps4eng = "I wish " + "they " + vnbp[v] + nnobles[n];

                ps5 = "Ojalá nosotros " + ps5wish[v] + nnoblesesp[n];
                ps5eng = "I wish " + "we " + vnbp[v] + nnobles[n];
                break;
            case 1:
                ps1 = "Ojalá yo no " + ps1wish[v] + nnoblesesp[n];
                ps1eng = "I wish I didn't " + vnb[v] + nnobles[n];

                ps2 = "Ojalá tú no " + ps2wish[v] + nnoblesesp[n];
                ps2eng = "I wish you didn't " + vnb[v] + nnobles[n];

                ps3 = "Ojalá él no " + ps3wish[v] + nnoblesesp[n];
                ps3eng = "I wish he didn't " + vnb[v] + nnobles[n];

                ps3ella = "Ojalá ella no " + ps3wish[v] + nnoblesesp[n];
                ps3she = "I wish she didn't " + vnb[v] + nnobles[n];

                ps3eso = "Ojalá eso no " + ps3wish[v] + nnoblesesp[n];
                ps3it = "I wish it didn't " + vnb[v] + nnobles[n];

                ps4 = "Ojalá ellos no " + ps4wish[v] + nnoblesesp[n];
                ps4eng = "I wish they didn't " + vnb[v] + nnobles[n];

                ps5 = "Ojalá nosotros no " + ps5wish[v] + nnoblesesp[n];
                ps5eng = "I wish we didn't " + vnb[v] + nnobles[n];

                break;
        }
    }

    public void WishPastPerfDif2() {

        switch (neg) {
            case 0:
                ps1 = "Ojalá yo hubiera " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I wish I had " + vpeng[v] + nnobles[n];

                ps2 = "Ojalá tú hubieras " + vpsp[v] + nnoblesesp[n];
                ps2eng = "I wish you had " + vpeng[v] + nnobles[n];

                ps3 = "Ojalá él hubiera " + vpsp[v] + nnoblesesp[n];
                ps3eng = "I wish he had " + vpeng[v] + nnobles[n];

                ps3ella = "Ojalá ella hubiera " + vpsp[v] + nnoblesesp[n];
                ps3she = "I wish she had " + vpeng[v] + nnobles[n];

                ps3eso = "Ojalá eso hubiera " + vpsp[v] + nnoblesesp[n];
                ps3it = "I wish it had " +  vpeng[v] + nnobles[n];

                ps4 = "Ojalá ellos hubieran " + vpsp[v] + nnoblesesp[n];
                ps4eng = "I wish they had " + vpeng[v] + nnobles[n];

                ps5 = "Ojalá nosotros hubieramos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "I wish we had " + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "Ojalá yo no hubiera " + vpsp[v] + nnoblesesp[n];
                ps1eng = "I wish I hadn't " + vpeng[v] + nnobles[n];

                ps2 = "Ojalá tú no hubieras " + vpsp[v] + nnoblesesp[n];
                ps2eng = "I wish you hadn't " + vpeng[v] + nnobles[n];

                ps3 = "Ojalá él no hubiera " + vpsp[v] + nnoblesesp[n];
                ps3eng = "I wish he hadn't " + vpeng[v] + nnobles[n];

                ps3ella = "Ojalá ella no hubiera " + vpsp[v] + nnoblesesp[n];
                ps3she = "I wish she hadn't " + vpeng[v] + nnobles[n];

                ps3eso = "Ojalá eso no hubiera " + vpsp[v] + nnoblesesp[n];
                ps3it = "I wish it hadn't " + vpeng[v] + nnobles[n];

                ps4 = "Ojalá ellos no hubieran " + vpsp[v] + nnoblesesp[n];
                ps4eng = "I wish they hadn't " + vpeng[v] + nnobles[n];

                ps5 = "Ojalá nosotros no hubieramos " + vpsp[v] + nnoblesesp[n];
                ps5eng = "I wish we hadn't " + vpeng[v] + nnobles[n];

                break;


        }
    }

    public void WishWouldDif2() {

        switch (neg) {
            case 0:
                ps1 = "Ojalá yo " + ps1wish[v] + nnoblesesp[n];
                ps1eng = "I wish I would " + vnb[v] + nnobles[n];

                ps2 = "Ojalá tú " + ps2wish[v] + nnoblesesp[n];
                ps2eng = "I wish you would " + vnb[v] + nnobles[n];

                ps3 = "Ojalá él " + ps3wish[v] + nnoblesesp[n];
                ps3eng = "I wish he would " + vnb[v] + nnobles[n];

                ps3ella = "Ojalá ella " + ps3wish[v] + nnoblesesp[n];
                ps3she = "I wish she would " + vnb[v] + nnobles[n];

                ps3eso = "Ojalá eso " + ps3wish[v] + nnoblesesp[n];
                ps3it = "I wish it would " +  vnb[v] + nnobles[n];

                ps4 = "Ojalá ellos " + ps4wish[v] + nnoblesesp[n];
                ps4eng = "I wish they would " + vnb[v] + nnobles[n];

                ps5 = "Ojalá nosotros " + ps5wish[v] + nnoblesesp[n];
                ps5eng = "I wish we would " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "Ojalá yo no " + ps1wish[v] + nnoblesesp[n];
                ps1eng = "I wish I wouldn't " + vnb[v] + nnobles[n];

                ps2 = "Ojalá tú no " + ps2wish[v] + nnoblesesp[n];
                ps2eng = "I wish you wouldn't " + vnb[v] + nnobles[n];

                ps3 = "Ojalá él no " + ps3wish[v] + nnoblesesp[n];
                ps3eng = "I wish he wouldn't " + vnb[v] + nnobles[n];

                ps3ella = "Ojalá ella no " + ps3wish[v] + nnoblesesp[n];
                ps3she = "I wish she wouldn't " + vnb[v] + nnobles[n];

                ps3eso = "Ojalá eso no " + ps3wish[v] + nnoblesesp[n];
                ps3it = "I wish it wouldn't " + vnb[v] + nnobles[n];

                ps4 = "Ojalá ellos no " + ps4wish[v] + nnoblesesp[n];
                ps4eng = "I wish they wouldn't " + vnb[v] + nnobles[n];

                ps5 = "Ojalá nosotros no " + ps5wish[v] + nnoblesesp[n];
                ps5eng = "I wish we wouldn't " + vnb[v] + nnobles[n];

                break;



        }
    }

    // USED TO DIF 2
    public void UsedToDif2() {
        switch (neg) {
            case 0:
                ps1 = "Yo solía " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I used to " + vnb[v] + nnobles[n];

                ps2 = "Tú solías " + vnbs[v] + nnoblesesp[n];
                ps2eng = "You used to " + vnb[v] + nnobles[n];

                ps3 = "Él solía " + vnbs[v] + nnoblesesp[n];
                ps3eng = "He used to " + vnb[v] + nnobles[n];

                ps3ella = "Ella solía " + vnbs[v] + nnoblesesp[n];
                ps3she = "She used to " + vnb[v] + nnobles[n];

                ps3eso = "Eso solía " + vnbs[v] + nnoblesesp[n];
                ps3it = "It used to " + vnb[v] + nnobles[n];

                ps4 = "Ellos solían " + vnbs[v] + nnoblesesp[n];
                ps4eng = "They used to " + vnb[v] + nnobles[n];

                ps5 = "Nosotros solíamos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "We used to " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "Yo no solía " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I didn't use to " + vnb[v] + nnobles[n];

                ps2 = "Tú no solías " + vnbs[v] + nnoblesesp[n];
                ps2eng = "You didn't use to " + vnb[v] + nnobles[n];

                ps3 = "Él no solía " + vnbs[v] + nnoblesesp[n];
                ps3eng = "He didn't use to " + vnb[v] + nnobles[n];

                ps3ella = "Ella no solía " + vnbs[v] + nnoblesesp[n];
                ps3she = "she didn't use to " + vnb[v] + nnobles[n];

                ps3eso = "Eso no solía " + vnbs[v] + nnoblesesp[n];
                ps3it = "It didn't use to  " + vnb[v] + nnobles[n];

                ps4 = "Ellos no solían " + vnbs[v] + nnoblesesp[n];
                ps4eng = "They didn't use to " + vnb[v] + nnobles[n];

                ps5 = "Nosotros no solíamos " + vnbs[v] + nnoblesesp[n];
                ps5eng = "We didn't use to " + vnb[v] + nnobles[n];
                break;

        }
    } //SergioVazquez 120422

    // BE USED TO DIF 2
    public void BeUsedToDif2() {
        switch (neg) {
            case 0:
                ps1 = "Yo estoy acostumbrado a " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I'm used to " + vnbc[v] + nnobles[n];

                ps2 = "Tu estás acostumbrado a " + vnbs[v] + nnoblesesp[n];
                ps2eng = "You are used to " + vnbc[v] + nnobles[n];

                ps3 = "Él está acostumbrado a " + vnbs[v] + nnoblesesp[n];
                ps3eng = "He is used to " + vnbc[v] + nnobles[n];

                ps3ella = "Ella está acostumbrada a  " + vnbs[v] + nnoblesesp[n];
                ps3she = "She is used to " + vnbc[v] + nnobles[n];

                ps3eso = "Eso está acostumbrado a " + vnbs[v] + nnoblesesp[n];
                ps3it = "It is used to " + vnbc[v] + nnobles[n];

                ps4 = "Ellos están acostumbrados a " + vnbs[v] + nnoblesesp[n];
                ps4eng = "They are used to " + vnbc[v] + nnobles[n];

                ps5 = "Nosotros estamos acostumbrados a " + vnbs[v] + nnoblesesp[n];
                ps5eng = "We are used to " + vnbc[v] + nnobles[n];
                break;

            case 1:
                ps1 = "Yo no estoy acostumbrado a " + vnbs[v] + nnoblesesp[n];
                ps1eng = "I'm not used to " + vnbc[v] + nnobles[n];

                ps2 = "Tu no estás acostumbrado a " + vnbs[v] + nnoblesesp[n];
                ps2eng = "You aren't used to " + vnbc[v] + nnobles[n];

                ps3 = "Él no está acostumbrado a " + vnbs[v] + nnoblesesp[n];
                ps3eng = "He isn't used to " + vnbc[v] + nnobles[n];

                ps3ella = "Ella no está acostumbrada a  " + vnbs[v] + nnoblesesp[n];
                ps3she = "She isn't used to " + vnbc[v] + nnobles[n];

                ps3eso = "Eso no está acostumbrado a " + vnbs[v] + nnoblesesp[n];
                ps3it = "It isn't used to " + vnbc[v] + nnobles[n];

                ps4 = "Ellos no están acostumbrados a " + vnbs[v] + nnoblesesp[n];
                ps4eng = "They aren't used to " + vnbc[v] + nnobles[n];

                ps5 = "Nosotros no estamos acostumbrados a " + vnbs[v] + nnoblesesp[n];
                ps5eng = "We aren't used to " + vnbc[v] + nnobles[n];
                break;
        }
    } //SergioVazquez 130422

    //What 2
    public void GenWhatSimp2() {
        int neg = (int) (Math.random() * 6);
        int sr = (int) (Math.random() * 2);
        switch (neg) {
            //Presente
            case 0:
                ps1 = "¿Que " + vn1[v] + nnoblesesp[n] + "?";
                ps1eng = "What do i " + vnb[v] + nnobles[n];

                ps2 = "¿Que " + vn2[v] + nnoblesesp[n] + "?";
                ps2eng = "What do you " + vnb[v] + nnobles[n];

                ps3 = "¿Que " + vn3[v] + nnoblesesp[n] + "él?";
                ps3eng = "What does he " + vnb[v] + nnobles[n];

                ps3ella = "¿Que " + vn3[v] + nnoblesesp[n] + "ella?";
                ps3she = "What does she " + vnb[v] + nnobles[n];

                ps3eso = "¿Que " + vn3[v] + nnoblesesp[n] + "eso?";
                ps3it = "What does it " + vnb[v] + nnobles[n];

                ps4 = "¿Que " + vn4[v] + nnoblesesp[n] + "?";
                ps4eng = "What do they " + vnb[v] + nnobles[n];

                ps5 = "¿Que " + vn5[v] + nnoblesesp[n] + "?";
                ps5eng = "What do we " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "¿Que no " + vn1[v] + nnoblesesp[n] + "?";
                ps1eng = "What don't i " + vnb[v] + nnobles[n];

                ps2 = "¿Que no " + vn2[v] + nnoblesesp[n] + "?";
                ps2eng = "What don't you " + vnb[v] + nnobles[n];

                ps3 = "¿Que no " + vn3[v] + nnoblesesp[n] + "él?";
                ps3eng = "What doesn't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Que no " + vn3[v] + nnoblesesp[n] + "ella?";
                ps3she = "What doesn't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Que no " + vn3[v] + nnoblesesp[n] + "eso?";
                ps3it = "What doesn't it " + vnb[v] + nnobles[n];

                ps4 = "¿Que no " + vn4[v] + nnoblesesp[n] + "?";
                ps4eng = "What don't they " + vnb[v] + nnobles[n];

                ps5 = "¿Que no " + vn5[v] + nnoblesesp[n] + "?";
                ps5eng = "What don't we " + vnb[v] + nnobles[n];
                break;

            //Pasado
            case 2:
                if (sr == 0) {
                    ps1 = "¿Que " + ps1pre[v] + nnoblesesp[n] + "?";
                    ps1eng = "What did i" + vnb[v] + nnobles[n];

                    ps2 = "¿Que " + ps2pre[v] + nnoblesesp[n] + "?";
                    ps2eng = "What did you " + vnb[v] + nnobles[n];

                    ps3 = "¿Que " + ps3p[v] + nnoblesesp[n] + "él?";
                    ps3eng = "What did he " + vnb[v] + nnobles[n];

                    ps3ella = "¿Que " + ps3p[v] + nnoblesesp[n] + "ella?";
                    ps3she = "What did she " + vnb[v] + nnobles[n];

                    ps3eso = "¿Que " + ps3p[v] + nnoblesesp[n] + "eso?";
                    ps3it = "What did it " + vnb[v] + nnobles[n];

                    ps4 = "¿Que " + vn4p[v] + nnoblesesp[n] + "?";
                    ps4eng = "What did they " + vnb[v] + nnobles[n];

                    ps5 = "¿Que " + vn5p[v] + nnoblesesp[n] + "?";
                    ps5eng = "What did we " + vnb[v] + nnobles[n];
                } else {
                    ps1 = "¿Que " + ps1imp[v] + nnoblesesp[n] + "?";
                    ps1eng = "What did i " + vnb[v] + nnobles[n];

                    ps2 = "¿Que " + ps2imp[v] + nnoblesesp[n] + "?";
                    ps2eng = "What did you " + vnb[v] + nnobles[n];

                    ps3 = "¿Que " + ps3imp[v] + nnoblesesp[n] + "él?";
                    ps3eng = "What did he " + vnb[v] + nnobles[n];

                    ps3ella = "¿Que " + ps3imp[v] + nnoblesesp[n] + "ella?";
                    ps3she = "What did she " + vnb[v] + nnobles[n];

                    ps3eso = "¿Que " + ps3imp[v] + nnoblesesp[n] + "eso?";
                    ps3it = "What did it " + vnb[v] + nnobles[n];

                    ps4 = "¿Que " + vn4imp[v] + nnoblesesp[n] + "?";
                    ps4eng = "What did they " + vnb[v] + nnobles[n];

                    ps5 = "¿Que " + vn5imp[v] + nnoblesesp[n] + "?";
                    ps5eng = "What did we " + vnb[v] + nnobles[n];
                }
                break;
            case 3:
                if (sr == 0) {
                    ps1 = "¿Que no " + ps1pre[v] + nnoblesesp[n] + "?";
                    ps1eng = "What didn't i " + vnb[v] + nnobles[n];

                    ps2 = "¿Que no " + ps2pre[v] + nnoblesesp[n] + "?";
                    ps2eng = "What didn't you " + vnb[v] + nnobles[n];

                    ps3 = "¿Que no " + ps3p[v] + nnoblesesp[n] + "él?";
                    ps3eng = "What didn't he " + vnb[v] + nnobles[n];

                    ps3ella = "¿Que no " + ps3p[v] + nnoblesesp[n] + "ella?";
                    ps3she = "What didn't she " + vnb[v] + nnobles[n];

                    ps3eso = "¿Que no " + ps3p[v] + nnoblesesp[n] + "eso?";
                    ps3it = "What didn't it " + vnb[v] + nnobles[n];

                    ps4 = "¿Que no " + vn4p[v] + nnoblesesp[n] + "?";
                    ps4eng = "What didn't they " + vnb[v] + nnobles[n];

                    ps5 = "¿Que no " + vn5p[v] + nnoblesesp[n] + "?";
                    ps5eng = "What didn't we " + vnb[v] + nnobles[n];
                } else {
                    ps1 = "¿Que no " + ps1imp[v] + nnoblesesp[n] + "?";
                    ps1eng = "What didn't i " + vnb[v] + nnobles[n];

                    ps2 = "¿Que no " + ps2imp[v] + nnoblesesp[n] + "?";
                    ps2eng = "What didn't you " + vnb[v] + nnobles[n];

                    ps3 = "¿Que no " + ps3imp[v] + nnoblesesp[n] + "él?";
                    ps3eng = "What didn't he " + vnb[v] + nnobles[n];

                    ps3ella = "¿Que no " + ps3imp[v] + nnoblesesp[n] + "ella?";
                    ps3she = "What didn't she " + vnb[v] + nnobles[n];

                    ps3eso = "¿Que no " + ps3imp[v] + nnoblesesp[n] + "eso?";
                    ps3it = "What didn't it " + vnb[v] + nnobles[n];

                    ps4 = "¿Que no " + vn4imp[v] + nnoblesesp[n] + "?";
                    ps4eng = "What didn't they " + vnb[v] + nnobles[n];

                    ps5 = "¿Que no " + vn5imp[v] + nnoblesesp[n] + "?";
                    ps5eng = "What didn't we " + vnb[v] + nnobles[n];
                }
                break;

            //Futuro
            case 4:
                ps1 = "¿Que " + vn1f[v] + nnoblesesp[n] + "?";
                ps1eng = "What will i " + vnb[v] + nnobles[n];

                ps2 = "¿Que " + vn2f[v] + nnoblesesp[n] + "?";
                ps2eng = "What will you " + vnb[v] + nnobles[n];

                ps3 = "¿Que " + vn3f[v] + nnoblesesp[n] + "él?";
                ps3eng = "What will he " + vnb[v] + nnobles[n];

                ps3ella = "¿Que " + vn3f[v] + nnoblesesp[n] + "ella?";
                ps3she = "What will she " + vnb[v] + nnobles[n];

                ps3eso = "¿Que " + vn3f[v] + nnoblesesp[n] + "eso?";
                ps3it = "What will it " + vnb[v] + nnobles[n];

                ps4 = "¿Que " + vn4f[v] + nnoblesesp[n] + "?";
                ps4eng = "What will they " + vnb[v] + nnobles[n];

                ps5 = "¿Que " + vn5f[v] + nnoblesesp[n] + "?";
                ps5eng = "What will we " + vnb[v] + nnobles[n];
                break;
            case 5:
                ps1 = "¿Que no " + vn1f[v] + nnoblesesp[n] + "?";
                ps1eng = "What won't i " + vnb[v] + nnobles[n];

                ps2 = "¿Que no " + vn2f[v] + nnoblesesp[n] + "?";
                ps2eng = "What won't you " + vnb[v] + nnobles[n];

                ps3 = "¿Que no " + vn3f[v] + nnoblesesp[n] + "él?";
                ps3eng = "What won't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Que no " + vn3f[v] + nnoblesesp[n] + "ella?";
                ps3she = "What won't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Que no " + vn3f[v] + nnoblesesp[n] + "eso?";
                ps3it = "What won't it " + vnb[v] + nnobles[n];

                ps4 = "¿Que no " + vn4f[v] + nnoblesesp[n] + "?";
                ps4eng = "What won't they " + vnb[v] + nnobles[n];

                ps5 = "¿Que no " + vn5f[v] + nnoblesesp[n] + "?";
                ps5eng = "What won't we " + vnb[v] + nnobles[n];
                break;
        }
    }//LR 14/12/2022
    public void GenWhatCont2() {
        switch (neg) {
            case 0:
                ps1 = "¿Que " + scontIesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps1eng = "What " + scontI[s] + vnbc[v] + nnobles[n];

                ps2 = "¿Que " + scontYouesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps2eng = "What " + scontYou[s] + vnbc[v] + nnobles[n];

                ps3 = "¿Que " + scontHeesp[s] + vnbcs[v] + nnoblesesp[n] + "él?";
                ps3eng = "What " + scontHe[s] + vnbc[v] + nnobles[n];

                ps3ella = "¿Que " + scontSheesp[s] + vnbcs[v] + nnoblesesp[n] + "ella?";
                ps3she = "What " + scontShe[s] + vnbc[v] + nnobles[n];

                ps3eso = "¿Que " + scontItesp[s] + vnbcs[v] + nnoblesesp[n] + "eso?";
                ps3it = "What " + scontIt[s] + vnbc[v] + nnobles[n];

                ps4 = "¿Que " + scontTheyesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps4eng = "What " + scontThey[s] + vnbc[v] + nnobles[n];

                ps5 = "¿Que " + scontWeesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps5eng = "What " + scontWe[s] + vnbc[v] + nnobles[n];
                break;

            case 1:
                ps1 = "¿Que " + scontIespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps1eng = "What " + scontIdont[s] + vnbc[v] + nnobles[n];

                ps2 = "¿Que " + scontYouespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps2eng = "What " + scontYoudont[s] + vnbc[v] + nnobles[n];

                ps3 = "¿Que " + scontHeespno[s] + vnbcs[v] + nnoblesesp[n] + "él?";
                ps3eng = "What " + scontHedont[s] + vnbc[v] + nnobles[n];

                ps3ella = "¿Que " + scontSheespno[s] + vnbcs[v] + nnoblesesp[n] + "ella?";
                ps3she = "What " + scontShedont[s] + vnbc[v] + nnobles[n];

                ps3eso = "¿Que " + scontItespno[s] + vnbcs[v] + nnoblesesp[n] + "eso?";
                ps3it = "What " + scontItdont[s] + vnbc[v] + nnobles[n];

                ps4 = "¿Que " + scontTheyespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps4eng = "What " + scontTheydont[s] + vnbc[v] + nnobles[n];

                ps5 = "¿Que " + scontWeespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps5eng = "What " + scontWedont[s] + vnbc[v] + nnobles[n];
                break;
        }
    }//LR 14/12/2022
    public void GenWhatPerf2() {
        switch (neg) {
            case 0:
                ps1 = "¿Que " + sperfIesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps1eng = "What " + sperfI[s] + vpeng[v] + nnobles[n];

                ps2 = "¿Que " + sperfYouesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps2eng = "What " + sperfYou[s] + vpeng[v] + nnobles[n];

                ps3 = "¿Que " + sperfHeesp[s] + vpsp[v] + nnoblesesp[n] + "él?";
                ps3eng = "What " + sperfHe[s] + vpeng[v] + nnobles[n];

                ps3ella = "¿Que " + sperfSheesp[s] + vpsp[v] + nnoblesesp[n] + "ella?";
                ps3she = "What " + sperfShe[s] + vpeng[v] + nnobles[n];

                ps3eso = "¿Que " + sperfItesp[s] + vpsp[v] + nnoblesesp[n] + "eso?";
                ps3it = "What " + sperfIt[s] + vpeng[v] + nnobles[n];

                ps4 = "¿Que " + sperfTheyesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps4eng = "What " + sperfThey[s] + vpeng[v] + nnobles[n];

                ps5 = "¿Que " + sperfWeesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps5eng = "What " + sperfWe[s] + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "¿Que " + sperfIespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps1eng = "What " + sperfIdont[s] + vpeng[v] + nnobles[n];

                ps2 = "¿Que " + sperfYouespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps2eng = "What " + sperfYoudont[s] + vpeng[v] + nnobles[n];

                ps3 = "¿Que " + sperfHeespno[s] + vpsp[v] + nnoblesesp[n] + "él?";
                ps3eng = "What " + sperfHedont[s] + vpeng[v] + nnobles[n];

                ps3ella = "¿Que " + sperfSheespno[s] + vpsp[v] + nnoblesesp[n] + "ella?";
                ps3she = "What " + sperfShedont[s] + vpeng[v] + nnobles[n];

                ps3eso = "¿Que " + sperfItespno[s] + vpsp[v] + nnoblesesp[n] + "eso?";
                ps3it = "What " + sperfItdont[s] + vpeng[v] + nnobles[n];

                ps4 = "¿Que " + sperfTheyespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps4eng = "What " + sperfTheydont[s] + vpeng[v] + nnobles[n];

                ps5 = "¿Que " + sperfWeespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps5eng = "What " + sperfWedont[s] + vpeng[v] + nnobles[n];

                break;
        }
    }//LR 14/12/2022

    //What Modales 2
    public void GenWhatModalsSimp2() {
        int neg = (int) (Math.random() * 6);
        switch (neg){
            //Would
            case 0:
                ps1 = "¿Que " + vn1w[v] + nnoblesesp[n] + "?";
                ps1eng = "What " + "would i " + vnb[v] + nnobles[n];

                ps2 = "¿Que " + vn2w[v] + nnoblesesp[n] + "?";
                ps2eng = "What " + "would you " + vnb[v] + nnobles[n];

                ps3 = "¿Que " + vn3w[v] + nnoblesesp[n] + "él?";
                ps3eng = "What " + "would he " + vnb[v] + nnobles[n];

                ps3ella = "¿Que " + vn3w[v] + nnoblesesp[n] + "ella?";
                ps3she = "What " + "would she " + vnb[v] + nnobles[n];

                ps3eso = "¿Que " + vn3w[v] + nnoblesesp[n] + "eso?";
                ps3it = "What " + "would it " + vnb[v] + nnobles[n];

                ps4 = "¿Que " + vn4w[v] + nnoblesesp[n] + "?";
                ps4eng = "What " + "would they " + vnb[v] + nnobles[n];

                ps5 = "¿Que " + vn5w[v] + nnoblesesp[n] + "?";
                ps5eng = "What " + "would we " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "¿Que no " + vn1w[v] + nnoblesesp[n] + "?";
                ps1eng = "What " + "wouldn't i " + vnb[v] + nnobles[n];

                ps2 = "¿Que no " + vn2w[v] + nnoblesesp[n] + "?";
                ps2eng = "What " + "wouldn't you " + vnb[v] + nnobles[n];

                ps3 = "¿Que no " + vn3w[v] + nnoblesesp[n] + "él?";
                ps3eng = "What " + "wouldn't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Que no " + vn3w[v] + nnoblesesp[n] + "ella?";
                ps3she = "What " + "wouldn't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Que no " + vn3w[v] + nnoblesesp[n] + "eso?";
                ps3it = "What " + "wouldn't it " + vnb[v] + nnobles[n];

                ps4 = "¿Que no " + vn4w[v] + nnoblesesp[n] + "?";
                ps4eng = "What " + "wouldn't they " + vnb[v] + nnobles[n];

                ps5 = "¿Que no " + vn5w[v] + nnoblesesp[n] + "?";
                ps5eng = "What " + "wouldn't we " + vnb[v] + nnobles[n];
                break;

            //Could
            case 2:
                ps1 = "¿Que " + "podría " + vnbs[v] + nnoblesesp[n] + "?";
                ps1eng = "What " + "could i " + vnb[v] + nnobles[n];

                ps2 = "¿Que " + "podrías " + vnbs[v] + nnoblesesp[n] + "?";
                ps2eng = "What " + "could you " + vnb[v] + nnobles[n];

                ps3 = "¿Que " + "podría " + vnbs[v] + nnoblesesp[n] + "él?";
                ps3eng = "What " + "could he " + vnb[v] + nnobles[n];

                ps3ella = "¿Que " + "podría " + vnbs[v] + nnoblesesp[n] + "ella?";
                ps3she = "What " + "could she " + vnb[v] + nnobles[n];

                ps3eso = "¿Que " + "podría " + vnbs[v] + nnoblesesp[n] + "eso?";
                ps3it = "What " + "could it " + vnb[v] + nnobles[n];

                ps4 = "¿Que " + "podrían " + vnbs[v] + nnoblesesp[n] + "?";
                ps4eng = "What " + "could they " + vnb[v] + nnobles[n];

                ps5 = "¿Que " + "podríamos " + vnbs[v] + nnoblesesp[n] + "?";
                ps5eng = "What " + "could we " + vnb[v] + nnobles[n];
                break;
            case 3:
                ps1 = "¿Que no " + "podría " + vnbs[v] + nnoblesesp[n] + "?";
                ps1eng = "What " + "couldn't i " + vnb[v] + nnobles[n];

                ps2 = "¿Que no " + "podrías " + vnbs[v] + nnoblesesp[n] + "?";
                ps2eng = "What " + "couldn't you " + vnb[v] + nnobles[n];

                ps3 = "¿Que no " + "podría " + vnbs[v] + nnoblesesp[n] + "él?";
                ps3eng = "What " + "couldn't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Que no " + "podría " + vnbs[v] + nnoblesesp[n] + "ella?";
                ps3she = "What " + "couldn't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Que no " + "podría " + vnbs[v] + nnoblesesp[n] + "eso?";
                ps3it = "What " + "couldn't it " + vnb[v] + nnobles[n];

                ps4 = "¿Que no " + "podrían " + vnbs[v] + nnoblesesp[n] + "?";
                ps4eng = "What " + "couldn't they " + vnb[v] + nnobles[n];

                ps5 = "¿Que no " + "podríamos " + vnbs[v] + nnoblesesp[n] + "?";
                ps5eng = "What " + "couldn't we " + vnb[v] + nnobles[n];
                break;

            //Should
            case 4:
                ps1 = "¿Que " + "debería " + vnbs[v] + nnoblesesp[n] + "?";
                ps1eng = "What " + "should i " + vnb[v] + nnobles[n];

                ps2 = "¿Que " + "deberías " + vnbs[v] + nnoblesesp[n] + "?";
                ps2eng = "What " + "should you " + vnb[v] + nnobles[n];

                ps3 = "¿Que " + "debería " + vnbs[v] + nnoblesesp[n] + "él?";
                ps3eng = "What " + "should he " + vnb[v] + nnobles[n];

                ps3ella = "¿Que " + "debería " + vnbs[v] + nnoblesesp[n] + "ella?";
                ps3she = "What " + "should she " + vnb[v] + nnobles[n];

                ps3eso = "¿Que " + "debería " + vnbs[v] + nnoblesesp[n] + "eso?";
                ps3it = "What " + "should it " + vnb[v] + nnobles[n];

                ps4 = "¿Que " + "deberían " + vnbs[v] + nnoblesesp[n] + "?";
                ps4eng = "What " + "should they " + vnb[v] + nnobles[n];

                ps5 = "¿Que " + "deberíamos " + vnbs[v] + nnoblesesp[n] + "?";
                ps5eng = "What " + "should we " + vnb[v] + nnobles[n];
                break;
            case 5:
                ps1 = "¿Que no " + "debería " + vnbs[v] + nnoblesesp[n] + "?";
                ps1eng = "What " + "shouldn't i " + vnb[v] + nnobles[n];

                ps2 = "¿Que no " + "deberías " + vnbs[v] + nnoblesesp[n] + "?";
                ps2eng = "What " + "shouldn't you " + vnb[v] + nnobles[n];

                ps3 = "¿Que no " + "debería " + vnbs[v] + nnoblesesp[n] + "él?";
                ps3eng = "What " + "shouldn't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Que no " + "debería " + vnbs[v] + nnoblesesp[n] + "ella?";
                ps3she = "What " + "shouldn't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Que no " + "debería " + vnbs[v] + nnoblesesp[n] + "eso?";
                ps3it = "What " + "shouldn't it " + vnb[v] + nnobles[n];

                ps4 = "¿Que no " + "deberían " + vnbs[v] + nnoblesesp[n] + "?";
                ps4eng = "What " + "shouldn't they " + vnb[v] + nnobles[n];

                ps5 = "¿Que no " + "deberíamos " + vnbs[v] + nnoblesesp[n] + "?";
                ps5eng = "What " + "shouldn't we " + vnb[v] + nnobles[n];
                break;

        }
    }//LR 14/12/2022
    public void GenWhatModalsCont2() {
        switch (neg) {
            case 0:
                ps1 = "¿Que " + scontmIesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps1eng = "What " + scontmI[s] + vnbc[v] + nnobles[n];

                ps2 = "¿Que " + scontmYouesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps2eng = "What " + scontmYou[s] + vnbc[v] + nnobles[n];

                ps3 = "¿Que " + scontmHeesp[s] + vnbcs[v] + nnoblesesp[n] + "él?";
                ps3eng = "What " + scontmHe[s] + vnbc[v] + nnobles[n];

                ps3ella = "¿Que " + scontmSheesp[s] + vnbcs[v] + nnoblesesp[n] + "ella?";
                ps3she = "What " + scontmShe[s] + vnbc[v] + nnobles[n];

                ps3eso = "¿Que " + scontmItesp[s] + vnbcs[v] + nnoblesesp[n] + "eso?";
                ps3it = "What " + scontmIt[s] + vnbc[v] + nnobles[n];

                ps4 = "¿Que " + scontmTheyesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps4eng = "What " + scontmThey[s] + vnbc[v] + nnobles[n];

                ps5 = "¿Que " + scontmWeesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps5eng = "What " + scontmWe[s] + vnbc[v] + nnobles[n];
                break;

            case 1:
                ps1 = "¿Que " + scontmIespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps1eng = "What " + scontmIdont[s] + vnbc[v] + nnobles[n];

                ps2 = "¿Que " + scontmYouespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps2eng = "What " + scontmYoudont[s] + vnbc[v] + nnobles[n];

                ps3 = "¿Que " + scontmHeespno[s] + vnbcs[v] + nnoblesesp[n] + "él?";
                ps3eng = "What " + scontmHedont[s] + vnbc[v] + nnobles[n];

                ps3ella = "¿Que " + scontmSheespno[s] + vnbcs[v] + nnoblesesp[n] + "ella?";
                ps3she = "What " + scontmShedont[s] + vnbc[v] + nnobles[n];

                ps3eso = "¿Que " + scontmItespno[s] + vnbcs[v] + nnoblesesp[n] + "eso?";
                ps3it = "What " + scontmItdont[s] + vnbc[v] + nnobles[n];

                ps4 = "¿Que " + scontmTheyespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps4eng = "What " + scontmTheydont[s] + vnbc[v] + nnobles[n];

                ps5 = "¿Que " + scontmWeespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps5eng = "What " + scontmWedont[s] + vnbc[v] + nnobles[n];
                break;
        }
    }//LR 14/12/2022
    public void GenWhatModalsPerf2() {
        switch (neg) {
            case 0:
                ps1 = "¿Que " + sperfmIesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps1eng = "What " + sperfmI[s] + vpeng[v] + nnobles[n];

                ps2 = "¿Que " + sperfmYouesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps2eng = "What " + sperfmYou[s] + vpeng[v] + nnobles[n];

                ps3 = "¿Que " + sperfmHeesp[s] + vpsp[v] + nnoblesesp[n] + "él?";
                ps3eng = "What " + sperfmHe[s] + vpeng[v] + nnobles[n];

                ps3ella = "¿Que " + sperfmSheesp[s] + vpsp[v] + nnoblesesp[n] + "ella?";
                ps3she = "What " + sperfmShe[s] + vpeng[v] + nnobles[n];

                ps3eso = "¿Que " + sperfmItesp[s] + vpsp[v] + nnoblesesp[n] + "eso?";
                ps3it = "What " + sperfmIt[s] + vpeng[v] + nnobles[n];

                ps4 = "¿Que " + sperfmTheyesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps4eng = "What " + sperfmThey[s] + vpeng[v] + nnobles[n];

                ps5 = "¿Que " + sperfmWeesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps5eng = "What " + sperfmWe[s] + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "¿Que " + sperfmIespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps1eng = "What " + sperfmIdont[s] + vpeng[v] + nnobles[n];

                ps2 = "¿Que " + sperfmYouespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps2eng = "What " + sperfmYoudont[s] + vpeng[v] + nnobles[n];

                ps3 = "¿Que " + sperfmHeespno[s] + vpsp[v] + nnoblesesp[n] + "él?";
                ps3eng = "What " + sperfmHedont[s] + vpeng[v] + nnobles[n];

                ps3ella = "¿Que " + sperfmSheespno[s] + vpsp[v] + nnoblesesp[n] + "ella?";
                ps3she = "What " + sperfmShedont[s] + vpeng[v] + nnobles[n];

                ps3eso = "¿Que " + sperfmItespno[s] + vpsp[v] + nnoblesesp[n] + "eso?";
                ps3it = "What " + sperfmItdont[s] + vpeng[v] + nnobles[n];

                ps4 = "¿Que " + sperfmTheyespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps4eng = "What " + sperfmTheydont[s] + vpeng[v] + nnobles[n];

                ps5 = "¿Que " + sperfmWeespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps5eng = "What " + sperfmWedont[s] + vpeng[v] + nnobles[n];

                break;
        }
    }//LR 14/12/2022

    //When 2
    public void GenWhenSimp2() {
        int neg = (int) (Math.random() * 6);
        int sr = (int) (Math.random() * 2);
        switch (neg) {
            //Presente
            case 0:
                ps1 = "¿Cuándo " + vn1[v] + nnoblesesp[n] + "?";
                ps1eng = "When do i " + vnb[v] + nnobles[n];

                ps2 = "¿Cuándo " + vn2[v] + nnoblesesp[n] + "?";
                ps2eng = "When do you " + vnb[v] + nnobles[n];

                ps3 = "¿Cuándo " + vn3[v] + nnoblesesp[n] + "él?";
                ps3eng = "When does he " + vnb[v] + nnobles[n];

                ps3ella = "¿Cuándo " + vn3[v] + nnoblesesp[n] + "ella?";
                ps3she = "When does she " + vnb[v] + nnobles[n];

                ps3eso = "¿Cuándo " + vn3[v] + nnoblesesp[n] + "eso?";
                ps3it = "When does it " + vnb[v] + nnobles[n];

                ps4 = "¿Cuándo " + vn4[v] + nnoblesesp[n] + "?";
                ps4eng = "When do they " + vnb[v] + nnobles[n];

                ps5 = "¿Cuándo " + vn5[v] + nnoblesesp[n] + "?";
                ps5eng = "When do we " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "¿Cuándo no " + vn1[v] + nnoblesesp[n] + "?";
                ps1eng = "When don't i " + vnb[v] + nnobles[n];

                ps2 = "¿Cuándo no " + vn2[v] + nnoblesesp[n] + "?";
                ps2eng = "When don't you " + vnb[v] + nnobles[n];

                ps3 = "¿Cuándo no " + vn3[v] + nnoblesesp[n] + "él?";
                ps3eng = "When doesn't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Cuándo no " + vn3[v] + nnoblesesp[n] + "ella?";
                ps3she = "When doesn't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Cuándo no " + vn3[v] + nnoblesesp[n] + "eso?";
                ps3it = "When doesn't it " + vnb[v] + nnobles[n];

                ps4 = "¿Cuándo no " + vn4[v] + nnoblesesp[n] + "?";
                ps4eng = "When don't they " + vnb[v] + nnobles[n];

                ps5 = "¿Cuándo no " + vn5[v] + nnoblesesp[n] + "?";
                ps5eng = "When don't we " + vnb[v] + nnobles[n];
                break;

            //Pasado
            case 2:
                if (sr == 0) {
                    ps1 = "¿Cuándo " + ps1pre[v] + nnoblesesp[n] + "?";
                    ps1eng = "When did i" + vnb[v] + nnobles[n];

                    ps2 = "¿Cuándo " + ps2pre[v] + nnoblesesp[n] + "?";
                    ps2eng = "When did you " + vnb[v] + nnobles[n];

                    ps3 = "¿Cuándo " + ps3p[v] + nnoblesesp[n] + "él?";
                    ps3eng = "When did he " + vnb[v] + nnobles[n];

                    ps3ella = "¿Cuándo " + ps3p[v] + nnoblesesp[n] + "ella?";
                    ps3she = "When did she " + vnb[v] + nnobles[n];

                    ps3eso = "¿Cuándo " + ps3p[v] + nnoblesesp[n] + "eso?";
                    ps3it = "When did it " + vnb[v] + nnobles[n];

                    ps4 = "¿Cuándo " + vn4p[v] + nnoblesesp[n] + "?";
                    ps4eng = "When did they " + vnb[v] + nnobles[n];

                    ps5 = "¿Cuándo " + vn5p[v] + nnoblesesp[n] + "?";
                    ps5eng = "When did we " + vnb[v] + nnobles[n];
                } else {
                    ps1 = "¿Cuándo " + ps1imp[v] + nnoblesesp[n] + "?";
                    ps1eng = "When did i " + vnb[v] + nnobles[n];

                    ps2 = "¿Cuándo " + ps2imp[v] + nnoblesesp[n] + "?";
                    ps2eng = "When did you " + vnb[v] + nnobles[n];

                    ps3 = "¿Cuándo " + ps3imp[v] + nnoblesesp[n] + "él?";
                    ps3eng = "When did he " + vnb[v] + nnobles[n];

                    ps3ella = "¿Cuándo " + ps3imp[v] + nnoblesesp[n] + "ella?";
                    ps3she = "When did she " + vnb[v] + nnobles[n];

                    ps3eso = "¿Cuándo " + ps3imp[v] + nnoblesesp[n] + "eso?";
                    ps3it = "When did it " + vnb[v] + nnobles[n];

                    ps4 = "¿Cuándo " + vn4imp[v] + nnoblesesp[n] + "?";
                    ps4eng = "When did they " + vnb[v] + nnobles[n];

                    ps5 = "¿Cuándo " + vn5imp[v] + nnoblesesp[n] + "?";
                    ps5eng = "When did we " + vnb[v] + nnobles[n];
                }
                break;
            case 3:
                if (sr == 0) {
                    ps1 = "¿Cuándo no " + ps1pre[v] + nnoblesesp[n] + "?";
                    ps1eng = "When didn't i " + vnb[v] + nnobles[n];

                    ps2 = "¿Cuándo no " + ps2pre[v] + nnoblesesp[n] + "?";
                    ps2eng = "When didn't you " + vnb[v] + nnobles[n];

                    ps3 = "¿Cuándo no " + ps3p[v] + nnoblesesp[n] + "él?";
                    ps3eng = "When didn't he " + vnb[v] + nnobles[n];

                    ps3ella = "¿Cuándo no " + ps3p[v] + nnoblesesp[n] + "ella?";
                    ps3she = "When didn't she " + vnb[v] + nnobles[n];

                    ps3eso = "¿Cuándo no " + ps3p[v] + nnoblesesp[n] + "eso?";
                    ps3it = "When didn't it " + vnb[v] + nnobles[n];

                    ps4 = "¿Cuándo no " + vn4p[v] + nnoblesesp[n] + "?";
                    ps4eng = "When didn't they " + vnb[v] + nnobles[n];

                    ps5 = "¿Cuándo no " + vn5p[v] + nnoblesesp[n] + "?";
                    ps5eng = "When didn't we " + vnb[v] + nnobles[n];
                } else {
                    ps1 = "¿Cuándo no " + ps1imp[v] + nnoblesesp[n] + "?";
                    ps1eng = "When didn't i " + vnb[v] + nnobles[n];

                    ps2 = "¿Cuándo no " + ps2imp[v] + nnoblesesp[n] + "?";
                    ps2eng = "When didn't you " + vnb[v] + nnobles[n];

                    ps3 = "¿Cuándo no " + ps3imp[v] + nnoblesesp[n] + "él?";
                    ps3eng = "When didn't he " + vnb[v] + nnobles[n];

                    ps3ella = "¿Cuándo no " + ps3imp[v] + nnoblesesp[n] + "ella?";
                    ps3she = "When didn't she " + vnb[v] + nnobles[n];

                    ps3eso = "¿Cuándo no " + ps3imp[v] + nnoblesesp[n] + "eso?";
                    ps3it = "When didn't it " + vnb[v] + nnobles[n];

                    ps4 = "¿Cuándo no " + vn4imp[v] + nnoblesesp[n] + "?";
                    ps4eng = "When didn't they " + vnb[v] + nnobles[n];

                    ps5 = "¿Cuándo no " + vn5imp[v] + nnoblesesp[n] + "?";
                    ps5eng = "When didn't we " + vnb[v] + nnobles[n];
                }
                break;

            //Futuro
            case 4:
                ps1 = "¿Cuándo " + vn1f[v] + nnoblesesp[n] + "?";
                ps1eng = "When will i " + vnb[v] + nnobles[n];

                ps2 = "¿Cuándo " + vn2f[v] + nnoblesesp[n] + "?";
                ps2eng = "When will you " + vnb[v] + nnobles[n];

                ps3 = "¿Cuándo " + vn3f[v] + nnoblesesp[n] + "él?";
                ps3eng = "When will he " + vnb[v] + nnobles[n];

                ps3ella = "¿Cuándo " + vn3f[v] + nnoblesesp[n] + "ella?";
                ps3she = "When will she " + vnb[v] + nnobles[n];

                ps3eso = "¿Cuándo " + vn3f[v] + nnoblesesp[n] + "eso?";
                ps3it = "When will it " + vnb[v] + nnobles[n];

                ps4 = "¿Cuándo " + vn4f[v] + nnoblesesp[n] + "?";
                ps4eng = "When will they " + vnb[v] + nnobles[n];

                ps5 = "¿Cuándo " + vn5f[v] + nnoblesesp[n] + "?";
                ps5eng = "When will we " + vnb[v] + nnobles[n];
                break;
            case 5:
                ps1 = "¿Cuándo no " + vn1f[v] + nnoblesesp[n] + "?";
                ps1eng = "When won't i " + vnb[v] + nnobles[n];

                ps2 = "¿Cuándo no " + vn2f[v] + nnoblesesp[n] + "?";
                ps2eng = "When won't you " + vnb[v] + nnobles[n];

                ps3 = "¿Cuándo no " + vn3f[v] + nnoblesesp[n] + "él?";
                ps3eng = "When won't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Cuándo no " + vn3f[v] + nnoblesesp[n] + "ella?";
                ps3she = "When won't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Cuándo no " + vn3f[v] + nnoblesesp[n] + "eso?";
                ps3it = "When won't it " + vnb[v] + nnobles[n];

                ps4 = "¿Cuándo no " + vn4f[v] + nnoblesesp[n] + "?";
                ps4eng = "When won't they " + vnb[v] + nnobles[n];

                ps5 = "¿Cuándo no " + vn5f[v] + nnoblesesp[n] + "?";
                ps5eng = "When won't we " + vnb[v] + nnobles[n];
                break;
        }
    }//LR 14/12/2022
    public void GenWhenCont2() {
        switch (neg) {
            case 0:
                ps1 = "¿Cuándo " + scontIesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps1eng = "When " + scontI[s] + vnbc[v] + nnobles[n];

                ps2 = "¿Cuándo " + scontYouesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps2eng = "When " + scontYou[s] + vnbc[v] + nnobles[n];

                ps3 = "¿Cuándo " + scontHeesp[s] + vnbcs[v] + nnoblesesp[n] + "él?";
                ps3eng = "When " + scontHe[s] + vnbc[v] + nnobles[n];

                ps3ella = "¿Cuándo " + scontSheesp[s] + vnbcs[v] + nnoblesesp[n] + "ella?";
                ps3she = "When " + scontShe[s] + vnbc[v] + nnobles[n];

                ps3eso = "¿Cuándo " + scontItesp[s] + vnbcs[v] + nnoblesesp[n] + "eso?";
                ps3it = "When " + scontIt[s] + vnbc[v] + nnobles[n];

                ps4 = "¿Cuándo " + scontTheyesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps4eng = "When " + scontThey[s] + vnbc[v] + nnobles[n];

                ps5 = "¿Cuándo " + scontWeesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps5eng = "When " + scontWe[s] + vnbc[v] + nnobles[n];
                break;

            case 1:
                ps1 = "¿Cuándo " + scontIespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps1eng = "When " + scontIdont[s] + vnbc[v] + nnobles[n];

                ps2 = "¿Cuándo " + scontYouespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps2eng = "When " + scontYoudont[s] + vnbc[v] + nnobles[n];

                ps3 = "¿Cuándo " + scontHeespno[s] + vnbcs[v] + nnoblesesp[n] + "él?";
                ps3eng = "When " + scontHedont[s] + vnbc[v] + nnobles[n];

                ps3ella = "¿Cuándo " + scontSheespno[s] + vnbcs[v] + nnoblesesp[n] + "ella?";
                ps3she = "When " + scontShedont[s] + vnbc[v] + nnobles[n];

                ps3eso = "¿Cuándo " + scontItespno[s] + vnbcs[v] + nnoblesesp[n] + "eso?";
                ps3it = "When " + scontItdont[s] + vnbc[v] + nnobles[n];

                ps4 = "¿Cuándo " + scontTheyespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps4eng = "When " + scontTheydont[s] + vnbc[v] + nnobles[n];

                ps5 = "¿Cuándo " + scontWeespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps5eng = "When " + scontWedont[s] + vnbc[v] + nnobles[n];
                break;
        }
    }//LR 14/12/2022
    public void GenWhenPerf2() {
        switch (neg) {
            case 0:
                ps1 = "¿Cuándo " + sperfIesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps1eng = "When " + sperfI[s] + vpeng[v] + nnobles[n];

                ps2 = "¿Cuándo " + sperfYouesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps2eng = "When " + sperfYou[s] + vpeng[v] + nnobles[n];

                ps3 = "¿Cuándo " + sperfHeesp[s] + vpsp[v] + nnoblesesp[n] + "él?";
                ps3eng = "When " + sperfHe[s] + vpeng[v] + nnobles[n];

                ps3ella = "¿Cuándo " + sperfSheesp[s] + vpsp[v] + nnoblesesp[n] + "ella?";
                ps3she = "When " + sperfShe[s] + vpeng[v] + nnobles[n];

                ps3eso = "¿Cuándo " + sperfItesp[s] + vpsp[v] + nnoblesesp[n] + "eso?";
                ps3it = "When " + sperfIt[s] + vpeng[v] + nnobles[n];

                ps4 = "¿Cuándo " + sperfTheyesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps4eng = "When " + sperfThey[s] + vpeng[v] + nnobles[n];

                ps5 = "¿Cuándo " + sperfWeesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps5eng = "When " + sperfWe[s] + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "¿Cuándo " + sperfIespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps1eng = "When " + sperfIdont[s] + vpeng[v] + nnobles[n];

                ps2 = "¿Cuándo " + sperfYouespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps2eng = "When " + sperfYoudont[s] + vpeng[v] + nnobles[n];

                ps3 = "¿Cuándo " + sperfHeespno[s] + vpsp[v] + nnoblesesp[n] + "él?";
                ps3eng = "When " + sperfHedont[s] + vpeng[v] + nnobles[n];

                ps3ella = "¿Cuándo " + sperfSheespno[s] + vpsp[v] + nnoblesesp[n] + "ella?";
                ps3she = "When " + sperfShedont[s] + vpeng[v] + nnobles[n];

                ps3eso = "¿Cuándo " + sperfItespno[s] + vpsp[v] + nnoblesesp[n] + "eso?";
                ps3it = "When " + sperfItdont[s] + vpeng[v] + nnobles[n];

                ps4 = "¿Cuándo " + sperfTheyespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps4eng = "When " + sperfTheydont[s] + vpeng[v] + nnobles[n];

                ps5 = "¿Cuándo " + sperfWeespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps5eng = "When " + sperfWedont[s] + vpeng[v] + nnobles[n];

                break;
        }
    }//LR 14/12/2022

    //When Modales 2
    public void GenWhenModalsSimp2() {
        int neg = (int) (Math.random() * 6);
        switch (neg){
            //Would
            case 0:
                ps1 = "¿Cuándo " + vn1w[v] + nnoblesesp[n] + "?";
                ps1eng = "When " + "would i " + vnb[v] + nnobles[n];

                ps2 = "¿Cuándo " + vn2w[v] + nnoblesesp[n] + "?";
                ps2eng = "When " + "would you " + vnb[v] + nnobles[n];

                ps3 = "¿Cuándo " + vn3w[v] + nnoblesesp[n] + "él?";
                ps3eng = "When " + "would he " + vnb[v] + nnobles[n];

                ps3ella = "¿Cuándo " + vn3w[v] + nnoblesesp[n] + "ella?";
                ps3she = "When " + "would she " + vnb[v] + nnobles[n];

                ps3eso = "¿Cuándo " + vn3w[v] + nnoblesesp[n] + "eso?";
                ps3it = "When " + "would it " + vnb[v] + nnobles[n];

                ps4 = "¿Cuándo " + vn4w[v] + nnoblesesp[n] + "?";
                ps4eng = "When " + "would they " + vnb[v] + nnobles[n];

                ps5 = "¿Cuándo " + vn5w[v] + nnoblesesp[n] + "?";
                ps5eng = "When " + "would we " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "¿Cuándo no " + vn1w[v] + nnoblesesp[n] + "?";
                ps1eng = "When " + "wouldn't i " + vnb[v] + nnobles[n];

                ps2 = "¿Cuándo no " + vn2w[v] + nnoblesesp[n] + "?";
                ps2eng = "When " + "wouldn't you " + vnb[v] + nnobles[n];

                ps3 = "¿Cuándo no " + vn3w[v] + nnoblesesp[n] + "él?";
                ps3eng = "When " + "wouldn't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Cuándo no " + vn3w[v] + nnoblesesp[n] + "ella?";
                ps3she = "When " + "wouldn't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Cuándo no " + vn3w[v] + nnoblesesp[n] + "eso?";
                ps3it = "When " + "wouldn't it " + vnb[v] + nnobles[n];

                ps4 = "¿Cuándo no " + vn4w[v] + nnoblesesp[n] + "?";
                ps4eng = "When " + "wouldn't they " + vnb[v] + nnobles[n];

                ps5 = "¿Cuándo no " + vn5w[v] + nnoblesesp[n] + "?";
                ps5eng = "When " + "wouldn't we " + vnb[v] + nnobles[n];
                break;

            //Could
            case 2:
                ps1 = "¿Cuándo " + "podría " + vnbs[v] + nnoblesesp[n] + "?";
                ps1eng = "When " + "could i " + vnb[v] + nnobles[n];

                ps2 = "¿Cuándo " + "podrías " + vnbs[v] + nnoblesesp[n] + "?";
                ps2eng = "When " + "could you " + vnb[v] + nnobles[n];

                ps3 = "¿Cuándo " + "podría " + vnbs[v] + nnoblesesp[n] + "él?";
                ps3eng = "When " + "could he " + vnb[v] + nnobles[n];

                ps3ella = "¿Cuándo " + "podría " + vnbs[v] + nnoblesesp[n] + "ella?";
                ps3she = "When " + "could she " + vnb[v] + nnobles[n];

                ps3eso = "¿Cuándo " + "podría " + vnbs[v] + nnoblesesp[n] + "eso?";
                ps3it = "When " + "could it " + vnb[v] + nnobles[n];

                ps4 = "¿Cuándo " + "podrían " + vnbs[v] + nnoblesesp[n] + "?";
                ps4eng = "When " + "could they " + vnb[v] + nnobles[n];

                ps5 = "¿Cuándo " + "podríamos " + vnbs[v] + nnoblesesp[n] + "?";
                ps5eng = "When " + "could we " + vnb[v] + nnobles[n];
                break;
            case 3:
                ps1 = "¿Cuándo no " + "podría " + vnbs[v] + nnoblesesp[n] + "?";
                ps1eng = "When " + "couldn't i " + vnb[v] + nnobles[n];

                ps2 = "¿Cuándo no " + "podrías " + vnbs[v] + nnoblesesp[n] + "?";
                ps2eng = "When " + "couldn't you " + vnb[v] + nnobles[n];

                ps3 = "¿Cuándo no " + "podría " + vnbs[v] + nnoblesesp[n] + "él?";
                ps3eng = "When " + "couldn't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Cuándo no " + "podría " + vnbs[v] + nnoblesesp[n] + "ella?";
                ps3she = "When " + "couldn't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Cuándo no " + "podría " + vnbs[v] + nnoblesesp[n] + "eso?";
                ps3it = "When " + "couldn't it " + vnb[v] + nnobles[n];

                ps4 = "¿Cuándo no " + "podrían " + vnbs[v] + nnoblesesp[n] + "?";
                ps4eng = "When " + "couldn't they " + vnb[v] + nnobles[n];

                ps5 = "¿Cuándo no " + "podríamos " + vnbs[v] + nnoblesesp[n] + "?";
                ps5eng = "When " + "couldn't we " + vnb[v] + nnobles[n];
                break;

            //Should
            case 4:
                ps1 = "¿Cuándo " + "debería " + vnbs[v] + nnoblesesp[n] + "?";
                ps1eng = "When " + "should i " + vnb[v] + nnobles[n];

                ps2 = "¿Cuándo " + "deberías " + vnbs[v] + nnoblesesp[n] + "?";
                ps2eng = "When " + "should you " + vnb[v] + nnobles[n];

                ps3 = "¿Cuándo " + "debería " + vnbs[v] + nnoblesesp[n] + "él?";
                ps3eng = "When " + "should he " + vnb[v] + nnobles[n];

                ps3ella = "¿Cuándo " + "debería " + vnbs[v] + nnoblesesp[n] + "ella?";
                ps3she = "When " + "should she " + vnb[v] + nnobles[n];

                ps3eso = "¿Cuándo " + "debería " + vnbs[v] + nnoblesesp[n] + "eso?";
                ps3it = "When " + "should it " + vnb[v] + nnobles[n];

                ps4 = "¿Cuándo " + "deberían " + vnbs[v] + nnoblesesp[n] + "?";
                ps4eng = "When " + "should they " + vnb[v] + nnobles[n];

                ps5 = "¿Cuándo " + "deberíamos " + vnbs[v] + nnoblesesp[n] + "?";
                ps5eng = "When " + "should we " + vnb[v] + nnobles[n];
                break;
            case 5:
                ps1 = "¿Cuándo no " + "debería " + vnbs[v] + nnoblesesp[n] + "?";
                ps1eng = "When " + "shouldn't i " + vnb[v] + nnobles[n];

                ps2 = "¿Cuándo no " + "deberías " + vnbs[v] + nnoblesesp[n] + "?";
                ps2eng = "When " + "shouldn't you " + vnb[v] + nnobles[n];

                ps3 = "¿Cuándo no " + "debería " + vnbs[v] + nnoblesesp[n] + "él?";
                ps3eng = "When " + "shouldn't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Cuándo no " + "debería " + vnbs[v] + nnoblesesp[n] + "ella?";
                ps3she = "When " + "shouldn't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Cuándo no " + "debería " + vnbs[v] + nnoblesesp[n] + "eso?";
                ps3it = "When " + "shouldn't it " + vnb[v] + nnobles[n];

                ps4 = "¿Cuándo no " + "deberían " + vnbs[v] + nnoblesesp[n] + "?";
                ps4eng = "When " + "shouldn't they " + vnb[v] + nnobles[n];

                ps5 = "¿Cuándo no " + "deberíamos " + vnbs[v] + nnoblesesp[n] + "?";
                ps5eng = "When " + "shouldn't we " + vnb[v] + nnobles[n];
                break;

        }
    }//LR 14/12/2022
    public void GenWhenModalsCont2() {
        switch (neg) {
            case 0:
                ps1 = "¿Cuándo " + scontmIesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps1eng = "When " + scontmI[s] + vnbc[v] + nnobles[n];

                ps2 = "¿Cuándo " + scontmYouesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps2eng = "When " + scontmYou[s] + vnbc[v] + nnobles[n];

                ps3 = "¿Cuándo " + scontmHeesp[s] + vnbcs[v] + nnoblesesp[n] + "él?";
                ps3eng = "When " + scontmHe[s] + vnbc[v] + nnobles[n];

                ps3ella = "¿Cuándo " + scontmSheesp[s] + vnbcs[v] + nnoblesesp[n] + "ella?";
                ps3she = "When " + scontmShe[s] + vnbc[v] + nnobles[n];

                ps3eso = "¿Cuándo " + scontmItesp[s] + vnbcs[v] + nnoblesesp[n] + "eso?";
                ps3it = "When " + scontmIt[s] + vnbc[v] + nnobles[n];

                ps4 = "¿Cuándo " + scontmTheyesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps4eng = "When " + scontmThey[s] + vnbc[v] + nnobles[n];

                ps5 = "¿Cuándo " + scontmWeesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps5eng = "When " + scontmWe[s] + vnbc[v] + nnobles[n];
                break;

            case 1:
                ps1 = "¿Cuándo " + scontmIespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps1eng = "When " + scontmIdont[s] + vnbc[v] + nnobles[n];

                ps2 = "¿Cuándo " + scontmYouespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps2eng = "When " + scontmYoudont[s] + vnbc[v] + nnobles[n];

                ps3 = "¿Cuándo " + scontmHeespno[s] + vnbcs[v] + nnoblesesp[n] + "él?";
                ps3eng = "When " + scontmHedont[s] + vnbc[v] + nnobles[n];

                ps3ella = "¿Cuándo " + scontmSheespno[s] + vnbcs[v] + nnoblesesp[n] + "ella?";
                ps3she = "When " + scontmShedont[s] + vnbc[v] + nnobles[n];

                ps3eso = "¿Cuándo " + scontmItespno[s] + vnbcs[v] + nnoblesesp[n] + "eso?";
                ps3it = "When " + scontmItdont[s] + vnbc[v] + nnobles[n];

                ps4 = "¿Cuándo " + scontmTheyespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps4eng = "When " + scontmTheydont[s] + vnbc[v] + nnobles[n];

                ps5 = "¿Cuándo " + scontmWeespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps5eng = "When " + scontmWedont[s] + vnbc[v] + nnobles[n];
                break;
        }
    }//LR 14/12/2022
    public void GenWhenModalsPerf2() {
        switch (neg) {
            case 0:
                ps1 = "¿Cuándo " + sperfmIesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps1eng = "When " + sperfmI[s] + vpeng[v] + nnobles[n];

                ps2 = "¿Cuándo " + sperfmYouesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps2eng = "When " + sperfmYou[s] + vpeng[v] + nnobles[n];

                ps3 = "¿Cuándo " + sperfmHeesp[s] + vpsp[v] + nnoblesesp[n] + "él?";
                ps3eng = "When " + sperfmHe[s] + vpeng[v] + nnobles[n];

                ps3ella = "¿Cuándo " + sperfmSheesp[s] + vpsp[v] + nnoblesesp[n] + "ella?";
                ps3she = "When " + sperfmShe[s] + vpeng[v] + nnobles[n];

                ps3eso = "¿Cuándo " + sperfmItesp[s] + vpsp[v] + nnoblesesp[n] + "eso?";
                ps3it = "When " + sperfmIt[s] + vpeng[v] + nnobles[n];

                ps4 = "¿Cuándo " + sperfmTheyesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps4eng = "When " + sperfmThey[s] + vpeng[v] + nnobles[n];

                ps5 = "¿Cuándo " + sperfmWeesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps5eng = "When " + sperfmWe[s] + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "¿Cuándo " + sperfmIespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps1eng = "When " + sperfmIdont[s] + vpeng[v] + nnobles[n];

                ps2 = "¿Cuándo " + sperfmYouespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps2eng = "When " + sperfmYoudont[s] + vpeng[v] + nnobles[n];

                ps3 = "¿Cuándo " + sperfmHeespno[s] + vpsp[v] + nnoblesesp[n] + "él?";
                ps3eng = "When " + sperfmHedont[s] + vpeng[v] + nnobles[n];

                ps3ella = "¿Cuándo " + sperfmSheespno[s] + vpsp[v] + nnoblesesp[n] + "ella?";
                ps3she = "When " + sperfmShedont[s] + vpeng[v] + nnobles[n];

                ps3eso = "¿Cuándo " + sperfmItespno[s] + vpsp[v] + nnoblesesp[n] + "eso?";
                ps3it = "When " + sperfmItdont[s] + vpeng[v] + nnobles[n];

                ps4 = "¿Cuándo " + sperfmTheyespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps4eng = "When " + sperfmTheydont[s] + vpeng[v] + nnobles[n];

                ps5 = "¿Cuándo " + sperfmWeespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps5eng = "When " + sperfmWedont[s] + vpeng[v] + nnobles[n];

                break;
        }
    }//LR 14/12/2022

    //Where 2
    public void GenWhereSimp2() {
        int neg = (int) (Math.random() * 6);
        int sr = (int) (Math.random() * 2);
        switch (neg) {
            //Presente
            case 0:
                ps1 = "¿Dónde " + vn1[v] + nnoblesesp[n] + "?";
                ps1eng = "Where do i " + vnb[v] + nnobles[n];

                ps2 = "¿Dónde " + vn2[v] + nnoblesesp[n] + "?";
                ps2eng = "Where do you " + vnb[v] + nnobles[n];

                ps3 = "¿Dónde " + vn3[v] + nnoblesesp[n] + "él?";
                ps3eng = "Where does he " + vnb[v] + nnobles[n];

                ps3ella = "¿Dónde " + vn3[v] + nnoblesesp[n] + "ella?";
                ps3she = "Where does she " + vnb[v] + nnobles[n];

                ps3eso = "¿Dónde " + vn3[v] + nnoblesesp[n] + "eso?";
                ps3it = "Where does it " + vnb[v] + nnobles[n];

                ps4 = "¿Dónde " + vn4[v] + nnoblesesp[n] + "?";
                ps4eng = "Where do they " + vnb[v] + nnobles[n];

                ps5 = "¿Dónde " + vn5[v] + nnoblesesp[n] + "?";
                ps5eng = "Where do we " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "¿Dónde no " + vn1[v] + nnoblesesp[n] + "?";
                ps1eng = "Where don't i " + vnb[v] + nnobles[n];

                ps2 = "¿Dónde no " + vn2[v] + nnoblesesp[n] + "?";
                ps2eng = "Where don't you " + vnb[v] + nnobles[n];

                ps3 = "¿Dónde no " + vn3[v] + nnoblesesp[n] + "él?";
                ps3eng = "Where doesn't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Dónde no " + vn3[v] + nnoblesesp[n] + "ella?";
                ps3she = "Where doesn't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Dónde no " + vn3[v] + nnoblesesp[n] + "eso?";
                ps3it = "Where doesn't it " + vnb[v] + nnobles[n];

                ps4 = "¿Dónde no " + vn4[v] + nnoblesesp[n] + "?";
                ps4eng = "Where don't they " + vnb[v] + nnobles[n];

                ps5 = "¿Dónde no " + vn5[v] + nnoblesesp[n] + "?";
                ps5eng = "Where don't we " + vnb[v] + nnobles[n];
                break;

            //Pasado
            case 2:
                if (sr == 0) {
                    ps1 = "¿Dónde " + ps1pre[v] + nnoblesesp[n] + "?";
                    ps1eng = "Where did i" + vnb[v] + nnobles[n];

                    ps2 = "¿Dónde " + ps2pre[v] + nnoblesesp[n] + "?";
                    ps2eng = "Where did you " + vnb[v] + nnobles[n];

                    ps3 = "¿Dónde " + ps3p[v] + nnoblesesp[n] + "él?";
                    ps3eng = "Where did he " + vnb[v] + nnobles[n];

                    ps3ella = "¿Dónde " + ps3p[v] + nnoblesesp[n] + "ella?";
                    ps3she = "Where did she " + vnb[v] + nnobles[n];

                    ps3eso = "¿Dónde " + ps3p[v] + nnoblesesp[n] + "eso?";
                    ps3it = "Where did it " + vnb[v] + nnobles[n];

                    ps4 = "¿Dónde " + vn4p[v] + nnoblesesp[n] + "?";
                    ps4eng = "Where did they " + vnb[v] + nnobles[n];

                    ps5 = "¿Dónde " + vn5p[v] + nnoblesesp[n] + "?";
                    ps5eng = "Where did we " + vnb[v] + nnobles[n];
                } else {
                    ps1 = "¿Dónde " + ps1imp[v] + nnoblesesp[n] + "?";
                    ps1eng = "Where did i " + vnb[v] + nnobles[n];

                    ps2 = "¿Dónde " + ps2imp[v] + nnoblesesp[n] + "?";
                    ps2eng = "Where did you " + vnb[v] + nnobles[n];

                    ps3 = "¿Dónde " + ps3imp[v] + nnoblesesp[n] + "él?";
                    ps3eng = "Where did he " + vnb[v] + nnobles[n];

                    ps3ella = "¿Dónde " + ps3imp[v] + nnoblesesp[n] + "ella?";
                    ps3she = "Where did she " + vnb[v] + nnobles[n];

                    ps3eso = "¿Dónde " + ps3imp[v] + nnoblesesp[n] + "eso?";
                    ps3it = "Where did it " + vnb[v] + nnobles[n];

                    ps4 = "¿Dónde " + vn4imp[v] + nnoblesesp[n] + "?";
                    ps4eng = "Where did they " + vnb[v] + nnobles[n];

                    ps5 = "¿Dónde " + vn5imp[v] + nnoblesesp[n] + "?";
                    ps5eng = "Where did we " + vnb[v] + nnobles[n];
                }
                break;
            case 3:
                if (sr == 0) {
                    ps1 = "¿Dónde no " + ps1pre[v] + nnoblesesp[n] + "?";
                    ps1eng = "Where didn't i " + vnb[v] + nnobles[n];

                    ps2 = "¿Dónde no " + ps2pre[v] + nnoblesesp[n] + "?";
                    ps2eng = "Where didn't you " + vnb[v] + nnobles[n];

                    ps3 = "¿Dónde no " + ps3p[v] + nnoblesesp[n] + "él?";
                    ps3eng = "Where didn't he " + vnb[v] + nnobles[n];

                    ps3ella = "¿Dónde no " + ps3p[v] + nnoblesesp[n] + "ella?";
                    ps3she = "Where didn't she " + vnb[v] + nnobles[n];

                    ps3eso = "¿Dónde no " + ps3p[v] + nnoblesesp[n] + "eso?";
                    ps3it = "Where didn't it " + vnb[v] + nnobles[n];

                    ps4 = "¿Dónde no " + vn4p[v] + nnoblesesp[n] + "?";
                    ps4eng = "Where didn't they " + vnb[v] + nnobles[n];

                    ps5 = "¿Dónde no " + vn5p[v] + nnoblesesp[n] + "?";
                    ps5eng = "Where didn't we " + vnb[v] + nnobles[n];
                } else {
                    ps1 = "¿Dónde no " + ps1imp[v] + nnoblesesp[n] + "?";
                    ps1eng = "Where didn't i " + vnb[v] + nnobles[n];

                    ps2 = "¿Dónde no " + ps2imp[v] + nnoblesesp[n] + "?";
                    ps2eng = "Where didn't you " + vnb[v] + nnobles[n];

                    ps3 = "¿Dónde no " + ps3imp[v] + nnoblesesp[n] + "él?";
                    ps3eng = "Where didn't he " + vnb[v] + nnobles[n];

                    ps3ella = "¿Dónde no " + ps3imp[v] + nnoblesesp[n] + "ella?";
                    ps3she = "Where didn't she " + vnb[v] + nnobles[n];

                    ps3eso = "¿Dónde no " + ps3imp[v] + nnoblesesp[n] + "eso?";
                    ps3it = "Where didn't it " + vnb[v] + nnobles[n];

                    ps4 = "¿Dónde no " + vn4imp[v] + nnoblesesp[n] + "?";
                    ps4eng = "Where didn't they " + vnb[v] + nnobles[n];

                    ps5 = "¿Dónde no " + vn5imp[v] + nnoblesesp[n] + "?";
                    ps5eng = "Where didn't we " + vnb[v] + nnobles[n];
                }
                break;

            //Futuro
            case 4:
                ps1 = "¿Dónde " + vn1f[v] + nnoblesesp[n] + "?";
                ps1eng = "Where will i " + vnb[v] + nnobles[n];

                ps2 = "¿Dónde " + vn2f[v] + nnoblesesp[n] + "?";
                ps2eng = "Where will you " + vnb[v] + nnobles[n];

                ps3 = "¿Dónde " + vn3f[v] + nnoblesesp[n] + "él?";
                ps3eng = "Where will he " + vnb[v] + nnobles[n];

                ps3ella = "¿Dónde " + vn3f[v] + nnoblesesp[n] + "ella?";
                ps3she = "Where will she " + vnb[v] + nnobles[n];

                ps3eso = "¿Dónde " + vn3f[v] + nnoblesesp[n] + "eso?";
                ps3it = "Where will it " + vnb[v] + nnobles[n];

                ps4 = "¿Dónde " + vn4f[v] + nnoblesesp[n] + "?";
                ps4eng = "Where will they " + vnb[v] + nnobles[n];

                ps5 = "¿Dónde " + vn5f[v] + nnoblesesp[n] + "?";
                ps5eng = "Where will we " + vnb[v] + nnobles[n];
                break;
            case 5:
                ps1 = "¿Dónde no " + vn1f[v] + nnoblesesp[n] + "?";
                ps1eng = "Where won't i " + vnb[v] + nnobles[n];

                ps2 = "¿Dónde no " + vn2f[v] + nnoblesesp[n] + "?";
                ps2eng = "Where won't you " + vnb[v] + nnobles[n];

                ps3 = "¿Dónde no " + vn3f[v] + nnoblesesp[n] + "él?";
                ps3eng = "Where won't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Dónde no " + vn3f[v] + nnoblesesp[n] + "ella?";
                ps3she = "Where won't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Dónde no " + vn3f[v] + nnoblesesp[n] + "eso?";
                ps3it = "Where won't it " + vnb[v] + nnobles[n];

                ps4 = "¿Dónde no " + vn4f[v] + nnoblesesp[n] + "?";
                ps4eng = "Where won't they " + vnb[v] + nnobles[n];

                ps5 = "¿Dónde no " + vn5f[v] + nnoblesesp[n] + "?";
                ps5eng = "Where won't we " + vnb[v] + nnobles[n];
                break;
        }
    }//LR 14/12/2022
    public void GenWhereCont2() {
        switch (neg) {
            case 0:
                ps1 = "¿Dónde " + scontIesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps1eng = "Where " + scontI[s] + vnbc[v] + nnobles[n];

                ps2 = "¿Dónde " + scontYouesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps2eng = "Where " + scontYou[s] + vnbc[v] + nnobles[n];

                ps3 = "¿Dónde " + scontHeesp[s] + vnbcs[v] + nnoblesesp[n] + "él?";
                ps3eng = "Where " + scontHe[s] + vnbc[v] + nnobles[n];

                ps3ella = "¿Dónde " + scontSheesp[s] + vnbcs[v] + nnoblesesp[n] + "ella?";
                ps3she = "Where " + scontShe[s] + vnbc[v] + nnobles[n];

                ps3eso = "¿Dónde " + scontItesp[s] + vnbcs[v] + nnoblesesp[n] + "eso?";
                ps3it = "Where " + scontIt[s] + vnbc[v] + nnobles[n];

                ps4 = "¿Dónde " + scontTheyesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps4eng = "Where " + scontThey[s] + vnbc[v] + nnobles[n];

                ps5 = "¿Dónde " + scontWeesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps5eng = "Where " + scontWe[s] + vnbc[v] + nnobles[n];
                break;

            case 1:
                ps1 = "¿Dónde " + scontIespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps1eng = "Where " + scontIdont[s] + vnbc[v] + nnobles[n];

                ps2 = "¿Dónde " + scontYouespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps2eng = "Where " + scontYoudont[s] + vnbc[v] + nnobles[n];

                ps3 = "¿Dónde " + scontHeespno[s] + vnbcs[v] + nnoblesesp[n] + "él?";
                ps3eng = "Where " + scontHedont[s] + vnbc[v] + nnobles[n];

                ps3ella = "¿Dónde " + scontSheespno[s] + vnbcs[v] + nnoblesesp[n] + "ella?";
                ps3she = "Where " + scontShedont[s] + vnbc[v] + nnobles[n];

                ps3eso = "¿Dónde " + scontItespno[s] + vnbcs[v] + nnoblesesp[n] + "eso?";
                ps3it = "Where " + scontItdont[s] + vnbc[v] + nnobles[n];

                ps4 = "¿Dónde " + scontTheyespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps4eng = "Where " + scontTheydont[s] + vnbc[v] + nnobles[n];

                ps5 = "¿Dónde " + scontWeespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps5eng = "Where " + scontWedont[s] + vnbc[v] + nnobles[n];
                break;
        }
    }//LR 14/12/2022
    public void GenWherePerf2() {
        switch (neg) {
            case 0:
                ps1 = "¿Dónde " + sperfIesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps1eng = "Where " + sperfI[s] + vpeng[v] + nnobles[n];

                ps2 = "¿Dónde " + sperfYouesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps2eng = "Where " + sperfYou[s] + vpeng[v] + nnobles[n];

                ps3 = "¿Dónde " + sperfHeesp[s] + vpsp[v] + nnoblesesp[n] + "él?";
                ps3eng = "Where " + sperfHe[s] + vpeng[v] + nnobles[n];

                ps3ella = "¿Dónde " + sperfSheesp[s] + vpsp[v] + nnoblesesp[n] + "ella?";
                ps3she = "Where " + sperfShe[s] + vpeng[v] + nnobles[n];

                ps3eso = "¿Dónde " + sperfItesp[s] + vpsp[v] + nnoblesesp[n] + "eso?";
                ps3it = "Where " + sperfIt[s] + vpeng[v] + nnobles[n];

                ps4 = "¿Dónde " + sperfTheyesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps4eng = "Where " + sperfThey[s] + vpeng[v] + nnobles[n];

                ps5 = "¿Dónde " + sperfWeesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps5eng = "Where " + sperfWe[s] + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "¿Dónde " + sperfIespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps1eng = "Where " + sperfIdont[s] + vpeng[v] + nnobles[n];

                ps2 = "¿Dónde " + sperfYouespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps2eng = "Where " + sperfYoudont[s] + vpeng[v] + nnobles[n];

                ps3 = "¿Dónde " + sperfHeespno[s] + vpsp[v] + nnoblesesp[n] + "él?";
                ps3eng = "Where " + sperfHedont[s] + vpeng[v] + nnobles[n];

                ps3ella = "¿Dónde " + sperfSheespno[s] + vpsp[v] + nnoblesesp[n] + "ella?";
                ps3she = "Where " + sperfShedont[s] + vpeng[v] + nnobles[n];

                ps3eso = "¿Dónde " + sperfItespno[s] + vpsp[v] + nnoblesesp[n] + "eso?";
                ps3it = "Where " + sperfItdont[s] + vpeng[v] + nnobles[n];

                ps4 = "¿Dónde " + sperfTheyespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps4eng = "Where " + sperfTheydont[s] + vpeng[v] + nnobles[n];

                ps5 = "¿Dónde " + sperfWeespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps5eng = "Where " + sperfWedont[s] + vpeng[v] + nnobles[n];

                break;
        }
    }//LR 14/12/2022

    //Where Modales 2
    public void GenWhereModalsSimp2() {
        int neg = (int) (Math.random() * 6);
        switch (neg){
            //Would
            case 0:
                ps1 = "¿Dónde " + vn1w[v] + nnoblesesp[n] + "?";
                ps1eng = "Where " + "would i " + vnb[v] + nnobles[n];

                ps2 = "¿Dónde " + vn2w[v] + nnoblesesp[n] + "?";
                ps2eng = "Where " + "would you " + vnb[v] + nnobles[n];

                ps3 = "¿Dónde " + vn3w[v] + nnoblesesp[n] + "él?";
                ps3eng = "Where " + "would he " + vnb[v] + nnobles[n];

                ps3ella = "¿Dónde " + vn3w[v] + nnoblesesp[n] + "ella?";
                ps3she = "Where " + "would she " + vnb[v] + nnobles[n];

                ps3eso = "¿Dónde " + vn3w[v] + nnoblesesp[n] + "eso?";
                ps3it = "Where " + "would it " + vnb[v] + nnobles[n];

                ps4 = "¿Dónde " + vn4w[v] + nnoblesesp[n] + "?";
                ps4eng = "Where " + "would they " + vnb[v] + nnobles[n];

                ps5 = "¿Dónde " + vn5w[v] + nnoblesesp[n] + "?";
                ps5eng = "Where " + "would we " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "¿Dónde no " + vn1w[v] + nnoblesesp[n] + "?";
                ps1eng = "Where " + "wouldn't i " + vnb[v] + nnobles[n];

                ps2 = "¿Dónde no " + vn2w[v] + nnoblesesp[n] + "?";
                ps2eng = "Where " + "wouldn't you " + vnb[v] + nnobles[n];

                ps3 = "¿Dónde no " + vn3w[v] + nnoblesesp[n] + "él?";
                ps3eng = "Where " + "wouldn't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Dónde no " + vn3w[v] + nnoblesesp[n] + "ella?";
                ps3she = "Where " + "wouldn't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Dónde no " + vn3w[v] + nnoblesesp[n] + "eso?";
                ps3it = "Where " + "wouldn't it " + vnb[v] + nnobles[n];

                ps4 = "¿Dónde no " + vn4w[v] + nnoblesesp[n] + "?";
                ps4eng = "Where " + "wouldn't they " + vnb[v] + nnobles[n];

                ps5 = "¿Dónde no " + vn5w[v] + nnoblesesp[n] + "?";
                ps5eng = "Where " + "wouldn't we " + vnb[v] + nnobles[n];
                break;

            //Could
            case 2:
                ps1 = "¿Dónde " + "podría " + vnbs[v] + nnoblesesp[n] + "?";
                ps1eng = "Where " + "could i " + vnb[v] + nnobles[n];

                ps2 = "¿Dónde " + "podrías " + vnbs[v] + nnoblesesp[n] + "?";
                ps2eng = "Where " + "could you " + vnb[v] + nnobles[n];

                ps3 = "¿Dónde " + "podría " + vnbs[v] + nnoblesesp[n] + "él?";
                ps3eng = "Where " + "could he " + vnb[v] + nnobles[n];

                ps3ella = "¿Dónde " + "podría " + vnbs[v] + nnoblesesp[n] + "ella?";
                ps3she = "Where " + "could she " + vnb[v] + nnobles[n];

                ps3eso = "¿Dónde " + "podría " + vnbs[v] + nnoblesesp[n] + "eso?";
                ps3it = "Where " + "could it " + vnb[v] + nnobles[n];

                ps4 = "¿Dónde " + "podrían " + vnbs[v] + nnoblesesp[n] + "?";
                ps4eng = "Where " + "could they " + vnb[v] + nnobles[n];

                ps5 = "¿Dónde " + "podríamos " + vnbs[v] + nnoblesesp[n] + "?";
                ps5eng = "Where " + "could we " + vnb[v] + nnobles[n];
                break;
            case 3:
                ps1 = "¿Dónde no " + "podría " + vnbs[v] + nnoblesesp[n] + "?";
                ps1eng = "Where " + "couldn't i " + vnb[v] + nnobles[n];

                ps2 = "¿Dónde no " + "podrías " + vnbs[v] + nnoblesesp[n] + "?";
                ps2eng = "Where " + "couldn't you " + vnb[v] + nnobles[n];

                ps3 = "¿Dónde no " + "podría " + vnbs[v] + nnoblesesp[n] + "él?";
                ps3eng = "Where " + "couldn't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Dónde no " + "podría " + vnbs[v] + nnoblesesp[n] + "ella?";
                ps3she = "Where " + "couldn't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Dónde no " + "podría " + vnbs[v] + nnoblesesp[n] + "eso?";
                ps3it = "Where " + "couldn't it " + vnb[v] + nnobles[n];

                ps4 = "¿Dónde no " + "podrían " + vnbs[v] + nnoblesesp[n] + "?";
                ps4eng = "Where " + "couldn't they " + vnb[v] + nnobles[n];

                ps5 = "¿Dónde no " + "podríamos " + vnbs[v] + nnoblesesp[n] + "?";
                ps5eng = "Where " + "couldn't we " + vnb[v] + nnobles[n];
                break;

            //Should
            case 4:
                ps1 = "¿Dónde " + "debería " + vnbs[v] + nnoblesesp[n] + "?";
                ps1eng = "Where " + "should i " + vnb[v] + nnobles[n];

                ps2 = "¿Dónde " + "deberías " + vnbs[v] + nnoblesesp[n] + "?";
                ps2eng = "Where " + "should you " + vnb[v] + nnobles[n];

                ps3 = "¿Dónde " + "debería " + vnbs[v] + nnoblesesp[n] + "él?";
                ps3eng = "Where " + "should he " + vnb[v] + nnobles[n];

                ps3ella = "¿Dónde " + "debería " + vnbs[v] + nnoblesesp[n] + "ella?";
                ps3she = "Where " + "should she " + vnb[v] + nnobles[n];

                ps3eso = "¿Dónde " + "debería " + vnbs[v] + nnoblesesp[n] + "eso?";
                ps3it = "Where " + "should it " + vnb[v] + nnobles[n];

                ps4 = "¿Dónde " + "deberían " + vnbs[v] + nnoblesesp[n] + "?";
                ps4eng = "Where " + "should they " + vnb[v] + nnobles[n];

                ps5 = "¿Dónde " + "deberíamos " + vnbs[v] + nnoblesesp[n] + "?";
                ps5eng = "Where " + "should we " + vnb[v] + nnobles[n];
                break;
            case 5:
                ps1 = "¿Dónde no " + "debería " + vnbs[v] + nnoblesesp[n] + "?";
                ps1eng = "Where " + "shouldn't i " + vnb[v] + nnobles[n];

                ps2 = "¿Dónde no " + "deberías " + vnbs[v] + nnoblesesp[n] + "?";
                ps2eng = "Where " + "shouldn't you " + vnb[v] + nnobles[n];

                ps3 = "¿Dónde no " + "debería " + vnbs[v] + nnoblesesp[n] + "él?";
                ps3eng = "Where " + "shouldn't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Dónde no " + "debería " + vnbs[v] + nnoblesesp[n] + "ella?";
                ps3she = "Where " + "shouldn't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Dónde no " + "debería " + vnbs[v] + nnoblesesp[n] + "eso?";
                ps3it = "Where " + "shouldn't it " + vnb[v] + nnobles[n];

                ps4 = "¿Dónde no " + "deberían " + vnbs[v] + nnoblesesp[n] + "?";
                ps4eng = "Where " + "shouldn't they " + vnb[v] + nnobles[n];

                ps5 = "¿Dónde no " + "deberíamos " + vnbs[v] + nnoblesesp[n] + "?";
                ps5eng = "Where " + "shouldn't we " + vnb[v] + nnobles[n];
                break;

        }
    }//LR 14/12/2022
    public void GenWhereModalsCont2() {
        switch (neg) {
            case 0:
                ps1 = "¿Dónde " + scontmIesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps1eng = "Where " + scontmI[s] + vnbc[v] + nnobles[n];

                ps2 = "¿Dónde " + scontmYouesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps2eng = "Where " + scontmYou[s] + vnbc[v] + nnobles[n];

                ps3 = "¿Dónde " + scontmHeesp[s] + vnbcs[v] + nnoblesesp[n] + "él?";
                ps3eng = "Where " + scontmHe[s] + vnbc[v] + nnobles[n];

                ps3ella = "¿Dónde " + scontmSheesp[s] + vnbcs[v] + nnoblesesp[n] + "ella?";
                ps3she = "Where " + scontmShe[s] + vnbc[v] + nnobles[n];

                ps3eso = "¿Dónde " + scontmItesp[s] + vnbcs[v] + nnoblesesp[n] + "eso?";
                ps3it = "Where " + scontmIt[s] + vnbc[v] + nnobles[n];

                ps4 = "¿Dónde " + scontmTheyesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps4eng = "Where " + scontmThey[s] + vnbc[v] + nnobles[n];

                ps5 = "¿Dónde " + scontmWeesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps5eng = "Where " + scontmWe[s] + vnbc[v] + nnobles[n];
                break;

            case 1:
                ps1 = "¿Dónde " + scontmIespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps1eng = "Where " + scontmIdont[s] + vnbc[v] + nnobles[n];

                ps2 = "¿Dónde " + scontmYouespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps2eng = "Where " + scontmYoudont[s] + vnbc[v] + nnobles[n];

                ps3 = "¿Dónde " + scontmHeespno[s] + vnbcs[v] + nnoblesesp[n] + "él?";
                ps3eng = "Where " + scontmHedont[s] + vnbc[v] + nnobles[n];

                ps3ella = "¿Dónde " + scontmSheespno[s] + vnbcs[v] + nnoblesesp[n] + "ella?";
                ps3she = "Where " + scontmShedont[s] + vnbc[v] + nnobles[n];

                ps3eso = "¿Dónde " + scontmItespno[s] + vnbcs[v] + nnoblesesp[n] + "eso?";
                ps3it = "Where " + scontmItdont[s] + vnbc[v] + nnobles[n];

                ps4 = "¿Dónde " + scontmTheyespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps4eng = "Where " + scontmTheydont[s] + vnbc[v] + nnobles[n];

                ps5 = "¿Dónde " + scontmWeespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps5eng = "Where " + scontmWedont[s] + vnbc[v] + nnobles[n];
                break;
        }
    }//LR 14/12/2022
    public void GenWhereModalsPerf2() {
        switch (neg) {
            case 0:
                ps1 = "¿Dónde " + sperfmIesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps1eng = "Where " + sperfmI[s] + vpeng[v] + nnobles[n];

                ps2 = "¿Dónde " + sperfmYouesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps2eng = "Where " + sperfmYou[s] + vpeng[v] + nnobles[n];

                ps3 = "¿Dónde " + sperfmHeesp[s] + vpsp[v] + nnoblesesp[n] + "él?";
                ps3eng = "Where " + sperfmHe[s] + vpeng[v] + nnobles[n];

                ps3ella = "¿Dónde " + sperfmSheesp[s] + vpsp[v] + nnoblesesp[n] + "ella?";
                ps3she = "Where " + sperfmShe[s] + vpeng[v] + nnobles[n];

                ps3eso = "¿Dónde " + sperfmItesp[s] + vpsp[v] + nnoblesesp[n] + "eso?";
                ps3it = "Where " + sperfmIt[s] + vpeng[v] + nnobles[n];

                ps4 = "¿Dónde " + sperfmTheyesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps4eng = "Where " + sperfmThey[s] + vpeng[v] + nnobles[n];

                ps5 = "¿Dónde " + sperfmWeesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps5eng = "Where " + sperfmWe[s] + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "¿Dónde " + sperfmIespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps1eng = "Where " + sperfmIdont[s] + vpeng[v] + nnobles[n];

                ps2 = "¿Dónde " + sperfmYouespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps2eng = "Where " + sperfmYoudont[s] + vpeng[v] + nnobles[n];

                ps3 = "¿Dónde " + sperfmHeespno[s] + vpsp[v] + nnoblesesp[n] + "él?";
                ps3eng = "Where " + sperfmHedont[s] + vpeng[v] + nnobles[n];

                ps3ella = "¿Dónde " + sperfmSheespno[s] + vpsp[v] + nnoblesesp[n] + "ella?";
                ps3she = "Where " + sperfmShedont[s] + vpeng[v] + nnobles[n];

                ps3eso = "¿Dónde " + sperfmItespno[s] + vpsp[v] + nnoblesesp[n] + "eso?";
                ps3it = "Where " + sperfmItdont[s] + vpeng[v] + nnobles[n];

                ps4 = "¿Dónde " + sperfmTheyespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps4eng = "Where " + sperfmTheydont[s] + vpeng[v] + nnobles[n];

                ps5 = "¿Dónde " + sperfmWeespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps5eng = "Where " + sperfmWedont[s] + vpeng[v] + nnobles[n];

                break;
        }
    }//LR 14/12/2022

    //Why 2
    public void GenWhySimp2() {
        int neg = (int) (Math.random() * 6);
        int sr = (int) (Math.random() * 2);
        switch (neg) {
            //Presente
            case 0:
                ps1 = "¿Por qué " + vn1[v] + nnoblesesp[n] + "?";
                ps1eng = "Why do i " + vnb[v] + nnobles[n];

                ps2 = "¿Por qué " + vn2[v] + nnoblesesp[n] + "?";
                ps2eng = "Why do you " + vnb[v] + nnobles[n];

                ps3 = "¿Por qué " + vn3[v] + nnoblesesp[n] + "él?";
                ps3eng = "Why does he " + vnb[v] + nnobles[n];

                ps3ella = "¿Por qué " + vn3[v] + nnoblesesp[n] + "ella?";
                ps3she = "Why does she " + vnb[v] + nnobles[n];

                ps3eso = "¿Por qué " + vn3[v] + nnoblesesp[n] + "eso?";
                ps3it = "Why does it " + vnb[v] + nnobles[n];

                ps4 = "¿Por qué " + vn4[v] + nnoblesesp[n] + "?";
                ps4eng = "Why do they " + vnb[v] + nnobles[n];

                ps5 = "¿Por qué " + vn5[v] + nnoblesesp[n] + "?";
                ps5eng = "Why do we " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "¿Por qué no " + vn1[v] + nnoblesesp[n] + "?";
                ps1eng = "Why don't i " + vnb[v] + nnobles[n];

                ps2 = "¿Por qué no " + vn2[v] + nnoblesesp[n] + "?";
                ps2eng = "Why don't you " + vnb[v] + nnobles[n];

                ps3 = "¿Por qué no " + vn3[v] + nnoblesesp[n] + "él?";
                ps3eng = "Why doesn't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Por qué no " + vn3[v] + nnoblesesp[n] + "ella?";
                ps3she = "Why doesn't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Por qué no " + vn3[v] + nnoblesesp[n] + "eso?";
                ps3it = "Why doesn't it " + vnb[v] + nnobles[n];

                ps4 = "¿Por qué no " + vn4[v] + nnoblesesp[n] + "?";
                ps4eng = "Why don't they " + vnb[v] + nnobles[n];

                ps5 = "¿Por qué no " + vn5[v] + nnoblesesp[n] + "?";
                ps5eng = "Why don't we " + vnb[v] + nnobles[n];
                break;

            //Pasado
            case 2:
                if (sr == 0) {
                    ps1 = "¿Por qué " + ps1pre[v] + nnoblesesp[n] + "?";
                    ps1eng = "Why did i" + vnb[v] + nnobles[n];

                    ps2 = "¿Por qué " + ps2pre[v] + nnoblesesp[n] + "?";
                    ps2eng = "Why did you " + vnb[v] + nnobles[n];

                    ps3 = "¿Por qué " + ps3p[v] + nnoblesesp[n] + "él?";
                    ps3eng = "Why did he " + vnb[v] + nnobles[n];

                    ps3ella = "¿Por qué " + ps3p[v] + nnoblesesp[n] + "ella?";
                    ps3she = "Why did she " + vnb[v] + nnobles[n];

                    ps3eso = "¿Por qué " + ps3p[v] + nnoblesesp[n] + "eso?";
                    ps3it = "Why did it " + vnb[v] + nnobles[n];

                    ps4 = "¿Por qué " + vn4p[v] + nnoblesesp[n] + "?";
                    ps4eng = "Why did they " + vnb[v] + nnobles[n];

                    ps5 = "¿Por qué " + vn5p[v] + nnoblesesp[n] + "?";
                    ps5eng = "Why did we " + vnb[v] + nnobles[n];
                } else {
                    ps1 = "¿Por qué " + ps1imp[v] + nnoblesesp[n] + "?";
                    ps1eng = "Why did i " + vnb[v] + nnobles[n];

                    ps2 = "¿Por qué " + ps2imp[v] + nnoblesesp[n] + "?";
                    ps2eng = "Why did you " + vnb[v] + nnobles[n];

                    ps3 = "¿Por qué " + ps3imp[v] + nnoblesesp[n] + "él?";
                    ps3eng = "Why did he " + vnb[v] + nnobles[n];

                    ps3ella = "¿Por qué " + ps3imp[v] + nnoblesesp[n] + "ella?";
                    ps3she = "Why did she " + vnb[v] + nnobles[n];

                    ps3eso = "¿Por qué " + ps3imp[v] + nnoblesesp[n] + "eso?";
                    ps3it = "Why did it " + vnb[v] + nnobles[n];

                    ps4 = "¿Por qué " + vn4imp[v] + nnoblesesp[n] + "?";
                    ps4eng = "Why did they " + vnb[v] + nnobles[n];

                    ps5 = "¿Por qué " + vn5imp[v] + nnoblesesp[n] + "?";
                    ps5eng = "Why did we " + vnb[v] + nnobles[n];
                }
                break;
            case 3:
                if (sr == 0) {
                    ps1 = "¿Por qué no " + ps1pre[v] + nnoblesesp[n] + "?";
                    ps1eng = "Why didn't i " + vnb[v] + nnobles[n];

                    ps2 = "¿Por qué no " + ps2pre[v] + nnoblesesp[n] + "?";
                    ps2eng = "Why didn't you " + vnb[v] + nnobles[n];

                    ps3 = "¿Por qué no " + ps3p[v] + nnoblesesp[n] + "él?";
                    ps3eng = "Why didn't he " + vnb[v] + nnobles[n];

                    ps3ella = "¿Por qué no " + ps3p[v] + nnoblesesp[n] + "ella?";
                    ps3she = "Why didn't she " + vnb[v] + nnobles[n];

                    ps3eso = "¿Por qué no " + ps3p[v] + nnoblesesp[n] + "eso?";
                    ps3it = "Why didn't it " + vnb[v] + nnobles[n];

                    ps4 = "¿Por qué no " + vn4p[v] + nnoblesesp[n] + "?";
                    ps4eng = "Why didn't they " + vnb[v] + nnobles[n];

                    ps5 = "¿Por qué no " + vn5p[v] + nnoblesesp[n] + "?";
                    ps5eng = "Why didn't we " + vnb[v] + nnobles[n];
                } else {
                    ps1 = "¿Por qué no " + ps1imp[v] + nnoblesesp[n] + "?";
                    ps1eng = "Why didn't i " + vnb[v] + nnobles[n];

                    ps2 = "¿Por qué no " + ps2imp[v] + nnoblesesp[n] + "?";
                    ps2eng = "Why didn't you " + vnb[v] + nnobles[n];

                    ps3 = "¿Por qué no " + ps3imp[v] + nnoblesesp[n] + "él?";
                    ps3eng = "Why didn't he " + vnb[v] + nnobles[n];

                    ps3ella = "¿Por qué no " + ps3imp[v] + nnoblesesp[n] + "ella?";
                    ps3she = "Why didn't she " + vnb[v] + nnobles[n];

                    ps3eso = "¿Por qué no " + ps3imp[v] + nnoblesesp[n] + "eso?";
                    ps3it = "Why didn't it " + vnb[v] + nnobles[n];

                    ps4 = "¿Por qué no " + vn4imp[v] + nnoblesesp[n] + "?";
                    ps4eng = "Why didn't they " + vnb[v] + nnobles[n];

                    ps5 = "¿Por qué no " + vn5imp[v] + nnoblesesp[n] + "?";
                    ps5eng = "Why didn't we " + vnb[v] + nnobles[n];
                }
                break;

            //Futuro
            case 4:
                ps1 = "¿Por qué " + vn1f[v] + nnoblesesp[n] + "?";
                ps1eng = "Why will i " + vnb[v] + nnobles[n];

                ps2 = "¿Por qué " + vn2f[v] + nnoblesesp[n] + "?";
                ps2eng = "Why will you " + vnb[v] + nnobles[n];

                ps3 = "¿Por qué " + vn3f[v] + nnoblesesp[n] + "él?";
                ps3eng = "Why will he " + vnb[v] + nnobles[n];

                ps3ella = "¿Por qué " + vn3f[v] + nnoblesesp[n] + "ella?";
                ps3she = "Why will she " + vnb[v] + nnobles[n];

                ps3eso = "¿Por qué " + vn3f[v] + nnoblesesp[n] + "eso?";
                ps3it = "Why will it " + vnb[v] + nnobles[n];

                ps4 = "¿Por qué " + vn4f[v] + nnoblesesp[n] + "?";
                ps4eng = "Why will they " + vnb[v] + nnobles[n];

                ps5 = "¿Por qué " + vn5f[v] + nnoblesesp[n] + "?";
                ps5eng = "Why will we " + vnb[v] + nnobles[n];
                break;
            case 5:
                ps1 = "¿Por qué no " + vn1f[v] + nnoblesesp[n] + "?";
                ps1eng = "Why won't i " + vnb[v] + nnobles[n];

                ps2 = "¿Por qué no " + vn2f[v] + nnoblesesp[n] + "?";
                ps2eng = "Why won't you " + vnb[v] + nnobles[n];

                ps3 = "¿Por qué no " + vn3f[v] + nnoblesesp[n] + "él?";
                ps3eng = "Why won't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Por qué no " + vn3f[v] + nnoblesesp[n] + "ella?";
                ps3she = "Why won't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Por qué no " + vn3f[v] + nnoblesesp[n] + "eso?";
                ps3it = "Why won't it " + vnb[v] + nnobles[n];

                ps4 = "¿Por qué no " + vn4f[v] + nnoblesesp[n] + "?";
                ps4eng = "Why won't they " + vnb[v] + nnobles[n];

                ps5 = "¿Por qué no " + vn5f[v] + nnoblesesp[n] + "?";
                ps5eng = "Why won't we " + vnb[v] + nnobles[n];
                break;
        }
    }//LR 14/12/2022
    public void GenWhyCont2() {
        switch (neg) {
            case 0:
                ps1 = "¿Por qué " + scontIesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps1eng = "Why " + scontI[s] + vnbc[v] + nnobles[n];

                ps2 = "¿Por qué " + scontYouesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps2eng = "Why " + scontYou[s] + vnbc[v] + nnobles[n];

                ps3 = "¿Por qué " + scontHeesp[s] + vnbcs[v] + nnoblesesp[n] + "él?";
                ps3eng = "Why " + scontHe[s] + vnbc[v] + nnobles[n];

                ps3ella = "¿Por qué " + scontSheesp[s] + vnbcs[v] + nnoblesesp[n] + "ella?";
                ps3she = "Why " + scontShe[s] + vnbc[v] + nnobles[n];

                ps3eso = "¿Por qué " + scontItesp[s] + vnbcs[v] + nnoblesesp[n] + "eso?";
                ps3it = "Why " + scontIt[s] + vnbc[v] + nnobles[n];

                ps4 = "¿Por qué " + scontTheyesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps4eng = "Why " + scontThey[s] + vnbc[v] + nnobles[n];

                ps5 = "¿Por qué " + scontWeesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps5eng = "Why " + scontWe[s] + vnbc[v] + nnobles[n];
                break;

            case 1:
                ps1 = "¿Por qué " + scontIespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps1eng = "Why " + scontIdont[s] + vnbc[v] + nnobles[n];

                ps2 = "¿Por qué " + scontYouespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps2eng = "Why " + scontYoudont[s] + vnbc[v] + nnobles[n];

                ps3 = "¿Por qué " + scontHeespno[s] + vnbcs[v] + nnoblesesp[n] + "él?";
                ps3eng = "Why " + scontHedont[s] + vnbc[v] + nnobles[n];

                ps3ella = "¿Por qué " + scontSheespno[s] + vnbcs[v] + nnoblesesp[n] + "ella?";
                ps3she = "Why " + scontShedont[s] + vnbc[v] + nnobles[n];

                ps3eso = "¿Por qué " + scontItespno[s] + vnbcs[v] + nnoblesesp[n] + "eso?";
                ps3it = "Why " + scontItdont[s] + vnbc[v] + nnobles[n];

                ps4 = "¿Por qué " + scontTheyespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps4eng = "Why " + scontTheydont[s] + vnbc[v] + nnobles[n];

                ps5 = "¿Por qué " + scontWeespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps5eng = "Why " + scontWedont[s] + vnbc[v] + nnobles[n];
                break;
        }
    }//LR 14/12/2022
    public void GenWhyPerf2() {
        switch (neg) {
            case 0:
                ps1 = "¿Por qué " + sperfIesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps1eng = "Why " + sperfI[s] + vpeng[v] + nnobles[n];

                ps2 = "¿Por qué " + sperfYouesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps2eng = "Why " + sperfYou[s] + vpeng[v] + nnobles[n];

                ps3 = "¿Por qué " + sperfHeesp[s] + vpsp[v] + nnoblesesp[n] + "él?";
                ps3eng = "Why " + sperfHe[s] + vpeng[v] + nnobles[n];

                ps3ella = "¿Por qué " + sperfSheesp[s] + vpsp[v] + nnoblesesp[n] + "ella?";
                ps3she = "Why " + sperfShe[s] + vpeng[v] + nnobles[n];

                ps3eso = "¿Por qué " + sperfItesp[s] + vpsp[v] + nnoblesesp[n] + "eso?";
                ps3it = "Why " + sperfIt[s] + vpeng[v] + nnobles[n];

                ps4 = "¿Por qué " + sperfTheyesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps4eng = "Why " + sperfThey[s] + vpeng[v] + nnobles[n];

                ps5 = "¿Por qué " + sperfWeesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps5eng = "Why " + sperfWe[s] + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "¿Por qué " + sperfIespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps1eng = "Why " + sperfIdont[s] + vpeng[v] + nnobles[n];

                ps2 = "¿Por qué " + sperfYouespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps2eng = "Why " + sperfYoudont[s] + vpeng[v] + nnobles[n];

                ps3 = "¿Por qué " + sperfHeespno[s] + vpsp[v] + nnoblesesp[n] + "él?";
                ps3eng = "Why " + sperfHedont[s] + vpeng[v] + nnobles[n];

                ps3ella = "¿Por qué " + sperfSheespno[s] + vpsp[v] + nnoblesesp[n] + "ella?";
                ps3she = "Why " + sperfShedont[s] + vpeng[v] + nnobles[n];

                ps3eso = "¿Por qué " + sperfItespno[s] + vpsp[v] + nnoblesesp[n] + "eso?";
                ps3it = "Why " + sperfItdont[s] + vpeng[v] + nnobles[n];

                ps4 = "¿Por qué " + sperfTheyespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps4eng = "Why " + sperfTheydont[s] + vpeng[v] + nnobles[n];

                ps5 = "¿Por qué " + sperfWeespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps5eng = "Why " + sperfWedont[s] + vpeng[v] + nnobles[n];

                break;
        }
    }//LR 14/12/2022

    //Why Modales 2
    public void GenWhyModalsSimp2() {
        int neg = (int) (Math.random() * 6);
        switch (neg){
            //Would
            case 0:
                ps1 = "¿Por qué " + vn1w[v] + nnoblesesp[n] + "?";
                ps1eng = "Why " + "would i " + vnb[v] + nnobles[n];

                ps2 = "¿Por qué " + vn2w[v] + nnoblesesp[n] + "?";
                ps2eng = "Why " + "would you " + vnb[v] + nnobles[n];

                ps3 = "¿Por qué " + vn3w[v] + nnoblesesp[n] + "él?";
                ps3eng = "Why " + "would he " + vnb[v] + nnobles[n];

                ps3ella = "¿Por qué " + vn3w[v] + nnoblesesp[n] + "ella?";
                ps3she = "Why " + "would she " + vnb[v] + nnobles[n];

                ps3eso = "¿Por qué " + vn3w[v] + nnoblesesp[n] + "eso?";
                ps3it = "Why " + "would it " + vnb[v] + nnobles[n];

                ps4 = "¿Por qué " + vn4w[v] + nnoblesesp[n] + "?";
                ps4eng = "Why " + "would they " + vnb[v] + nnobles[n];

                ps5 = "¿Por qué " + vn5w[v] + nnoblesesp[n] + "?";
                ps5eng = "Why " + "would we " + vnb[v] + nnobles[n];
                break;
            case 1:
                ps1 = "¿Por qué no " + vn1w[v] + nnoblesesp[n] + "?";
                ps1eng = "Why " + "wouldn't i " + vnb[v] + nnobles[n];

                ps2 = "¿Por qué no " + vn2w[v] + nnoblesesp[n] + "?";
                ps2eng = "Why " + "wouldn't you " + vnb[v] + nnobles[n];

                ps3 = "¿Por qué no " + vn3w[v] + nnoblesesp[n] + "él?";
                ps3eng = "Why " + "wouldn't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Por qué no " + vn3w[v] + nnoblesesp[n] + "ella?";
                ps3she = "Why " + "wouldn't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Por qué no " + vn3w[v] + nnoblesesp[n] + "eso?";
                ps3it = "Why " + "wouldn't it " + vnb[v] + nnobles[n];

                ps4 = "¿Por qué no " + vn4w[v] + nnoblesesp[n] + "?";
                ps4eng = "Why " + "wouldn't they " + vnb[v] + nnobles[n];

                ps5 = "¿Por qué no " + vn5w[v] + nnoblesesp[n] + "?";
                ps5eng = "Why " + "wouldn't we " + vnb[v] + nnobles[n];
                break;

            //Could
            case 2:
                ps1 = "¿Por qué " + "podría " + vnbs[v] + nnoblesesp[n] + "?";
                ps1eng = "Why " + "could i " + vnb[v] + nnobles[n];

                ps2 = "¿Por qué " + "podrías " + vnbs[v] + nnoblesesp[n] + "?";
                ps2eng = "Why " + "could you " + vnb[v] + nnobles[n];

                ps3 = "¿Por qué " + "podría " + vnbs[v] + nnoblesesp[n] + "él?";
                ps3eng = "Why " + "could he " + vnb[v] + nnobles[n];

                ps3ella = "¿Por qué " + "podría " + vnbs[v] + nnoblesesp[n] + "ella?";
                ps3she = "Why " + "could she " + vnb[v] + nnobles[n];

                ps3eso = "¿Por qué " + "podría " + vnbs[v] + nnoblesesp[n] + "eso?";
                ps3it = "Why " + "could it " + vnb[v] + nnobles[n];

                ps4 = "¿Por qué " + "podrían " + vnbs[v] + nnoblesesp[n] + "?";
                ps4eng = "Why " + "could they " + vnb[v] + nnobles[n];

                ps5 = "¿Por qué " + "podríamos " + vnbs[v] + nnoblesesp[n] + "?";
                ps5eng = "Why " + "could we " + vnb[v] + nnobles[n];
                break;
            case 3:
                ps1 = "¿Por qué no " + "podría " + vnbs[v] + nnoblesesp[n] + "?";
                ps1eng = "Why " + "couldn't i " + vnb[v] + nnobles[n];

                ps2 = "¿Por qué no " + "podrías " + vnbs[v] + nnoblesesp[n] + "?";
                ps2eng = "Why " + "couldn't you " + vnb[v] + nnobles[n];

                ps3 = "¿Por qué no " + "podría " + vnbs[v] + nnoblesesp[n] + "él?";
                ps3eng = "Why " + "couldn't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Por qué no " + "podría " + vnbs[v] + nnoblesesp[n] + "ella?";
                ps3she = "Why " + "couldn't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Por qué no " + "podría " + vnbs[v] + nnoblesesp[n] + "eso?";
                ps3it = "Why " + "couldn't it " + vnb[v] + nnobles[n];

                ps4 = "¿Por qué no " + "podrían " + vnbs[v] + nnoblesesp[n] + "?";
                ps4eng = "Why " + "couldn't they " + vnb[v] + nnobles[n];

                ps5 = "¿Por qué no " + "podríamos " + vnbs[v] + nnoblesesp[n] + "?";
                ps5eng = "Why " + "couldn't we " + vnb[v] + nnobles[n];
                break;

            //Should
            case 4:
                ps1 = "¿Por qué " + "debería " + vnbs[v] + nnoblesesp[n] + "?";
                ps1eng = "Why " + "should i " + vnb[v] + nnobles[n];

                ps2 = "¿Por qué " + "deberías " + vnbs[v] + nnoblesesp[n] + "?";
                ps2eng = "Why " + "should you " + vnb[v] + nnobles[n];

                ps3 = "¿Por qué " + "debería " + vnbs[v] + nnoblesesp[n] + "él?";
                ps3eng = "Why " + "should he " + vnb[v] + nnobles[n];

                ps3ella = "¿Por qué " + "debería " + vnbs[v] + nnoblesesp[n] + "ella?";
                ps3she = "Why " + "should she " + vnb[v] + nnobles[n];

                ps3eso = "¿Por qué " + "debería " + vnbs[v] + nnoblesesp[n] + "eso?";
                ps3it = "Why " + "should it " + vnb[v] + nnobles[n];

                ps4 = "¿Por qué " + "deberían " + vnbs[v] + nnoblesesp[n] + "?";
                ps4eng = "Why " + "should they " + vnb[v] + nnobles[n];

                ps5 = "¿Por qué " + "deberíamos " + vnbs[v] + nnoblesesp[n] + "?";
                ps5eng = "Why " + "should we " + vnb[v] + nnobles[n];
                break;
            case 5:
                ps1 = "¿Por qué no " + "debería " + vnbs[v] + nnoblesesp[n] + "?";
                ps1eng = "Why " + "shouldn't i " + vnb[v] + nnobles[n];

                ps2 = "¿Por qué no " + "deberías " + vnbs[v] + nnoblesesp[n] + "?";
                ps2eng = "Why " + "shouldn't you " + vnb[v] + nnobles[n];

                ps3 = "¿Por qué no " + "debería " + vnbs[v] + nnoblesesp[n] + "él?";
                ps3eng = "Why " + "shouldn't he " + vnb[v] + nnobles[n];

                ps3ella = "¿Por qué no " + "debería " + vnbs[v] + nnoblesesp[n] + "ella?";
                ps3she = "Why " + "shouldn't she " + vnb[v] + nnobles[n];

                ps3eso = "¿Por qué no " + "debería " + vnbs[v] + nnoblesesp[n] + "eso?";
                ps3it = "Why " + "shouldn't it " + vnb[v] + nnobles[n];

                ps4 = "¿Por qué no " + "deberían " + vnbs[v] + nnoblesesp[n] + "?";
                ps4eng = "Why " + "shouldn't they " + vnb[v] + nnobles[n];

                ps5 = "¿Por qué no " + "deberíamos " + vnbs[v] + nnoblesesp[n] + "?";
                ps5eng = "Why " + "shouldn't we " + vnb[v] + nnobles[n];
                break;

        }
    }//LR 14/12/2022
    public void GenWhyModalsCont2() {
        switch (neg) {
            case 0:
                ps1 = "¿Por qué " + scontmIesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps1eng = "Why " + scontmI[s] + vnbc[v] + nnobles[n];

                ps2 = "¿Por qué " + scontmYouesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps2eng = "Why " + scontmYou[s] + vnbc[v] + nnobles[n];

                ps3 = "¿Por qué " + scontmHeesp[s] + vnbcs[v] + nnoblesesp[n] + "él?";
                ps3eng = "Why " + scontmHe[s] + vnbc[v] + nnobles[n];

                ps3ella = "¿Por qué " + scontmSheesp[s] + vnbcs[v] + nnoblesesp[n] + "ella?";
                ps3she = "Why " + scontmShe[s] + vnbc[v] + nnobles[n];

                ps3eso = "¿Por qué " + scontmItesp[s] + vnbcs[v] + nnoblesesp[n] + "eso?";
                ps3it = "Why " + scontmIt[s] + vnbc[v] + nnobles[n];

                ps4 = "¿Por qué " + scontmTheyesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps4eng = "Why " + scontmThey[s] + vnbc[v] + nnobles[n];

                ps5 = "¿Por qué " + scontmWeesp[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps5eng = "Why " + scontmWe[s] + vnbc[v] + nnobles[n];
                break;

            case 1:
                ps1 = "¿Por qué " + scontmIespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps1eng = "Why " + scontmIdont[s] + vnbc[v] + nnobles[n];

                ps2 = "¿Por qué " + scontmYouespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps2eng = "Why " + scontmYoudont[s] + vnbc[v] + nnobles[n];

                ps3 = "¿Por qué " + scontmHeespno[s] + vnbcs[v] + nnoblesesp[n] + "él?";
                ps3eng = "Why " + scontmHedont[s] + vnbc[v] + nnobles[n];

                ps3ella = "¿Por qué " + scontmSheespno[s] + vnbcs[v] + nnoblesesp[n] + "ella?";
                ps3she = "Why " + scontmShedont[s] + vnbc[v] + nnobles[n];

                ps3eso = "¿Por qué " + scontmItespno[s] + vnbcs[v] + nnoblesesp[n] + "eso?";
                ps3it = "Why " + scontmItdont[s] + vnbc[v] + nnobles[n];

                ps4 = "¿Por qué " + scontmTheyespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps4eng = "Why " + scontmTheydont[s] + vnbc[v] + nnobles[n];

                ps5 = "¿Por qué " + scontmWeespno[s] + vnbcs[v] + nnoblesesp[n] + "?";
                ps5eng = "Why " + scontmWedont[s] + vnbc[v] + nnobles[n];
                break;
        }
    }//LR 14/12/2022
    public void GenWhyModalsPerf2() {
        switch (neg) {
            case 0:
                ps1 = "¿Por qué " + sperfmIesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps1eng = "Why " + sperfmI[s] + vpeng[v] + nnobles[n];

                ps2 = "¿Por qué " + sperfmYouesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps2eng = "Why " + sperfmYou[s] + vpeng[v] + nnobles[n];

                ps3 = "¿Por qué " + sperfmHeesp[s] + vpsp[v] + nnoblesesp[n] + "él?";
                ps3eng = "Why " + sperfmHe[s] + vpeng[v] + nnobles[n];

                ps3ella = "¿Por qué " + sperfmSheesp[s] + vpsp[v] + nnoblesesp[n] + "ella?";
                ps3she = "Why " + sperfmShe[s] + vpeng[v] + nnobles[n];

                ps3eso = "¿Por qué " + sperfmItesp[s] + vpsp[v] + nnoblesesp[n] + "eso?";
                ps3it = "Why " + sperfmIt[s] + vpeng[v] + nnobles[n];

                ps4 = "¿Por qué " + sperfmTheyesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps4eng = "Why " + sperfmThey[s] + vpeng[v] + nnobles[n];

                ps5 = "¿Por qué " + sperfmWeesp[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps5eng = "Why " + sperfmWe[s] + vpeng[v] + nnobles[n];
                break;
            case 1:
                ps1 = "¿Por qué " + sperfmIespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps1eng = "Why " + sperfmIdont[s] + vpeng[v] + nnobles[n];

                ps2 = "¿Por qué " + sperfmYouespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps2eng = "Why " + sperfmYoudont[s] + vpeng[v] + nnobles[n];

                ps3 = "¿Por qué " + sperfmHeespno[s] + vpsp[v] + nnoblesesp[n] + "él?";
                ps3eng = "Why " + sperfmHedont[s] + vpeng[v] + nnobles[n];

                ps3ella = "¿Por qué " + sperfmSheespno[s] + vpsp[v] + nnoblesesp[n] + "ella?";
                ps3she = "Why " + sperfmShedont[s] + vpeng[v] + nnobles[n];

                ps3eso = "¿Por qué " + sperfmItespno[s] + vpsp[v] + nnoblesesp[n] + "eso?";
                ps3it = "Why " + sperfmItdont[s] + vpeng[v] + nnobles[n];

                ps4 = "¿Por qué " + sperfmTheyespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps4eng = "Why " + sperfmTheydont[s] + vpeng[v] + nnobles[n];

                ps5 = "¿Por qué " + sperfmWeespno[s] + vpsp[v] + nnoblesesp[n] + "?";
                ps5eng = "Why " + sperfmWedont[s] + vpeng[v] + nnobles[n];

                break;
        }
    }//LR 14/12/2022

    // presentes dificultad 3 nobles, abstractos, oo,people
    public void GenPresSimp3() {
        switch (negg) {
            case 0:
                ps1 = "yo " + vn1[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I " + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I " + vnb[v] + nnobles[n] + frequadv[r];

                ps2 = "tú " + vn2[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you " + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you " + vnb[v] + nnobles[n] + frequadv[r];

                ps3 = "él " + vn3[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he " + vnb3[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he " + vnb3[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella " + vn3[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she " + vnb3[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she " + vnb3[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso " + vn3[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it " + vnb3[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it " + vnb3[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos " + vn4[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they " + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they " + vnb[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros " + vn5[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we " + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we " + vnb[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo " + "no " + vn1[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I " + "don't " + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I " + "don't " + vnb[v] + nnobles[n] + frequadv[r];

                ps2 = "tú " + "no " + vn2[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you " + "don't " + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you " + "don't " + vnb[v] + nnobles[n] + frequadv[r];

                ps3 = "él " + "no " + vn3[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he " + "doesn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he " + "doesn't " + vnb[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella " + "no " + vn3[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she " + "doesn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she " + "doesn't " + vnb[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso " + "no " + vn3[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it " + "doesn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it " + "doesn't " + vnb[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos " + "no " + vn4[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they " + "don't " + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they " + "don't " + vnb[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros " + "no " + vn5[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we " + "don't " + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we " + "don't " + vnb[v] + nnobles[n] + frequadv[r];

                break;


        }

    }
    public void GenPresCont3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "estoy " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I am "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I am " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú "  + "estás " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you are "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you are " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él "  + "está " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he is "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he is " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella "  + "está " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she is "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she is " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso "  + "está " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it is "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it is " + vnbc[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos "  + "están " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they are "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they are " + vnbc[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros "  + "estamos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we are "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we are " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "estoy " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I'm not "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I'm not " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú no " + "estás " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you aren't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you aren't " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él no " + "está " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he isn't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he isn't " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella no " + "está " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she isn't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she isn't " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso no " + "está " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it isn't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it isn't " + vnbc[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos no " + "están " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they aren't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they aren't " + vnbc[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros no " + "estamos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we aren't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we aren't " + vnbc[v] + nnobles[n] + frequadv[r];

                break;

        }

    }
    public void GenPresPerf3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "he " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I have "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I have " + vpeng[v] + nnobles[n] + frequadv[r];

                ps2 = "tú "  + "has " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you have "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you have " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3 = "él "  + "ha " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he has "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he has " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella "  + "ha " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she has "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she has " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso "  + "ha " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it has "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it has " + vpeng[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos "  + "han " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they have "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they have " + vpeng[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros "  + "hemos " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we have "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we have " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
            case 1:

                ps1 = "yo no " + "he " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I haven't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I haven't " + vpeng[v] + nnobles[n] + frequadv[r];

                ps2 = "tú no " + "has " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you haven't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you haven't " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3 = "él no " + "ha " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he hasn't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he hasn't " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella no " + "ha " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she hasn't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she hasn't " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso no " + "ha " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it hasn't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it hasn't " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "han " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they haven't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they haven't " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "hemos " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we haven't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we haven't " + vpeng[v] + nnobles[n] + frequadv[r];

                break;

        }

    }
    public void GenPresPerfCont3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "he estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú "  + "has estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él "  + "ha estdo " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he has "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he has " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella "  + "ha estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she has "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "she has " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso "  + "ha estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it has "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "he has " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos "  + "han estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros "  + "hemos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "he estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I haven't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I haven't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú no " + "has estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you haven't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you haven't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él no " + "ha estdo " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he hasn't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he hasn't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella no " + "ha estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she hasn't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she hasn't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso no " + "ha estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it hasn't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it hasn't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos no " + "han estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they haven't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they haven't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros no " + "hemos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we haven't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we haven't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                break;
        }

    }

    //pasados
    public void GenPastSimp3() {
        int sr = (int) (Math.random() * 2);
        switch (neg) {
            case 1:
                if (sr == 0) {
                    ps1 = "yo "  + ps1pre[v] + nnoblesesp[n] + advfrequ[r];
                    ps1eng = "I "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps1eng2 = "I " + vnbp[v] + nnobles[n] + frequadv[r];


                    ps2 = "tú "  + ps2pre[v] + nnoblesesp[n] + advfrequ[r];
                    ps2eng = "you "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps2eng2 = "you " + vnbp[v] + nnobles[n] + frequadv[r];


                    ps3 = "él "  + ps3p[v] + nnoblesesp[n] + advfrequ[r];
                    ps3eng = "he "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps3eng2 = "he " + vnbp[v] + nnobles[n] + frequadv[r];

                    ps3ella = "ella "  + ps3p[v] + nnoblesesp[n] + advfrequ[r];
                    ps3she = "she "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps3she = "she " + vnbp[v] + nnobles[n] + frequadv[r];

                    ps3eso = "eso "  + ps3p[v] + nnoblesesp[n] + advfrequ[r];
                    ps3it = "it "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps3it = "it " + vnbp[v] + nnobles[n] + frequadv[r];

                    ps4 = "ellos "  + vn4p[v] + nnoblesesp[n] + advfrequ[r];
                    ps4eng = "they "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps4eng = "they " + vnbp[v] + nnobles[n] + frequadv[r];


                    ps5 = "nosotros "  + vn5p[v] + nnoblesesp[n] + advfrequ[r];
                    ps5eng = "we "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps5eng = "we " + vnbp[v] + nnobles[n] + frequadv[r];

                } else {
                    ps1 = "yo "  + ps1imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps1eng = "I "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps1eng = "I " + vnbp[v] + nnobles[n] + frequadv[r];


                    ps2 = "tú "  + ps2imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps2eng = "you "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps2eng = "you " + vnbp[v] + nnobles[n] + frequadv[r];


                    ps3 = "él "  + ps3imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps3eng = "he "  + vnbp[v] + nnobles[n] + frequadv[r];
                    ps3eng = "he " + vnbp[v] + nnobles[n] + frequadv[r];

                    ps3ella = "ella "  + ps3imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps3she = "she "  + vnbp[v] + nnobles[n] + frequadv[r];

                    ps3eso = "eso "  + ps3imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps3it = "it "  + vnbp[v] + nnobles[n] + frequadv[r];

                    ps4 = "ellos "  + vn4imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps4eng = "they "  + vnbp[v] + nnobles[n] + frequadv[r];

                    ps5 = "nosotros "  + vn5imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps5eng = "we "  + vnbp[v] + nnobles[n] + frequadv[r];
                }
                break;

            case 0:
                if (sr == 0) {
                    ps1 = "yo " + "no "  + ps1pre[v] + nnoblesesp[n] + advfrequ[r];
                    ps1eng = "I " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];

                    ps2 = "tú " + "no "  + ps2pre[v] + nnoblesesp[n] + advfrequ[r];
                    ps2eng = "you " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];

                    ps3 = "él " + "no "  + ps3p[v] + nnoblesesp[n] + advfrequ[r];
                    ps3eng = "he " + "din't "  + vnb[v] + nnobles[n] + frequadv[r];

                    ps3ella = "ella " + "no "  + ps3p[v] + nnoblesesp[n] + advfrequ[r];
                    ps3she = "she " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];

                    ps3eso = "eso " + "no "  + ps3p[v] + nnoblesesp[n] + advfrequ[r];
                    ps3it = "it " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];

                    ps4 = "ellos " + "no "  + vn4p[v] + nnoblesesp[n] + advfrequ[r];
                    ps4eng = "they " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];

                    ps5 = "nosotros " + "no "  + vn5p[v] + nnoblesesp[n] + advfrequ[r];
                    ps5eng = "we " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];
                } else {
                    ps1 = "yo " + "no "  + ps1imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps1eng = "I " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];
                    ps1eng2 = "I " + "didn't " + vnb[v] + nnobles[n] + frequadv[r];


                    ps2 = "tú " + "no "  + ps2imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps2eng = "you " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];
                    ps2eng2 = "you " + "didn't " + vnb[v] + nnobles[n] + frequadv[r];


                    ps3 = "él " + "no "  + ps3imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps3eng = "he " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];
                    ps3eng2 = "he " + "didn't " + vnb[v] + nnobles[n] + frequadv[r];


                    ps3ella = "ella " + "no "  + ps3imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps3she = "she " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];
                    ps3she2 = "she " + "didn't " + vnb[v] + nnobles[n] + frequadv[r];


                    ps3eso = "eso " + "no "  + ps3imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps3it = "it " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];
                    ps3iteng2 = "it " + "didn't " + vnb[v] + nnobles[n] + frequadv[r];


                    ps4 = "ellos " + "no "  + vn4imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps4eng = "they " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];
                    ps4eng2 = "they " + "didn't " + vnb[v] + nnobles[n] + frequadv[r];


                    ps5 = "nosotros " + "no "  + vn5imp[v] + nnoblesesp[n] + advfrequ[r];
                    ps5eng = "we " + "didn't "  + vnb[v] + nnobles[n] + frequadv[r];
                    ps5eng2 = "we " + "didn't " + vnb[v] + nnobles[n] + frequadv[r];

                }
                break;
        }
    }
    public void GenPastCont3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "estaba " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I was "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I was " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú "  + "estabas " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you were "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you were " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él "  + "estaba " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he was "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he was " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella "  + "estaba " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she was "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she was " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso "  + "estaba " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it was "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it was " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + "estaban " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they were "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they were " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros "  + "estábamos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we were "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we were " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "estaba " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I wasn't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I wasn't " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no " + "estabas " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you weren't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you weren't " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él no " + "estaba " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he wasn't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he wasn't " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "estaba " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she wasn't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she wasn't " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "estaba " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it wasn't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it wasn't " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "estaban " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they weren't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they weren't " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "estábamos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we weren't "  + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we weren't " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }

    }
    public void GenPastPerf3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "había " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I had "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I had " + vpeng[v] + nnobles[n] + frequadv[r];

                ps2 = "tú "  + "habías " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you had "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you had " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3 = "él "  + "había " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he had "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he had " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella "  + "había " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she had "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she had " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso "  + "había " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it had "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it had " + vpeng[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos "  + "habían " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they had "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they had " + vpeng[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros "  + "habíamos " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we had "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we had " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "había " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I hadn't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I hadn't " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no " + "habías " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you hadn't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you hadn't " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él no " + "había " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he hadn't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he hadn't " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "había " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she hadn't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she hadn't " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "había " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it hadn't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it hadn't " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "habían " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they hadn't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they hadn't " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "habíamos " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we hadn't "  + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we hadn't " + vpeng[v] + nnobles[n] + frequadv[r];

                break;


        }

    }
    public void GenPastPerfCont3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "había estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I had "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I had " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú "  + "habías estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you had "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you had " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él "  + "había estdo " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he had "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he had " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella "  + "había estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she had "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she had " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso "  + "había estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it had "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it had " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + "habían estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they had "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they had " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros "  + "habíamos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we had "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we had " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "había estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I hadn't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I hadn't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú no " + "habías estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you hadn't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you hadn't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él no " + "había estdo " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he hadn't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he hadn't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella no " + "había estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she hadn't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she hadn't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso no " + "había estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it hadn't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it hadn't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos no " + "habían estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they hadn't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they hadn't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros no " + "habíamos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we hadn't "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we hadn't " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }

    //futuros
    public void GenFutSimp3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + vn1f[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I will "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I will " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú "  + vn2f[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you will "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you will " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él "  + vn3f[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he will "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he will " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella "  + vn3f[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she will "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she will " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso "  + vn3f[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it will "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it will " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + vn4f[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they will "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they will " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros "  + vn5f[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we will "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we will " + vnb[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo " + "no " + vn1f[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I " + "won't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I " + "won't " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú " + "no " + vn2f[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you " + "won't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you " + "won't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él " + "no " + vn3f[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he " + "won't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he " + "won't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella " + "no " + vn3f[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she " + "won't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she " + "won't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso " + "no " + vn3f[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it " + "won't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it " + "won't " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos " + "no " + vn4f[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they " + "won't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they " + "won't " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros " + "no " + vn5f[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we " + "won't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we " + "won't " + vnb[v] + nnobles[n] + frequadv[r];

                break;
        }

    }
    public void GenFutCont3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "estaré " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I will "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I will " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú "  + "estarás " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you will "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you will " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él "  + "estará " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he will "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he will " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella "  + "estará " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she will "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she will " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso "  + "estará " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it will "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it will " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + "estarán " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they will "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they will " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros "  + "estaremos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we will "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we will " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "estaré " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I won't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I won't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú no " + "estarás " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you won't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you won't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él no " + "estará " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he won't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he won't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "estará " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she won't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she won't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "estará " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it won't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it won't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "estarán " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they won't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they won't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "estaremos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we won't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we won't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }

    }
    public void GenFutPerf3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "habré " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I will "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I will " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú "  + "habrás " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you will "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you will " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él "  + "habrá " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he will "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he will " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella "  + "habrá " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she will "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she will " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso "  + "habrá " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it will "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it will " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + "habrán " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they will "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they will " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros "  + "habremos " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we will "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we will " + "have " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "habré " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I won't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I won't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no " + "habrás " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you won't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you won't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él no " + "habrá " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he won't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he won't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "habrá " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she won't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she won't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "habrá " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it won't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it won't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "habrán " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they won't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they won't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "habremos " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we won't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we won't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
        }

    }
    public void GenFutPerfCont3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "habré estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I will have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I will have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú "  + "habrás estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you will have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you will have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él "  + "habrá estdo " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he will have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he will have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella "  + "habrá estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she will have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she will have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso "  + "habrá estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it will have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it will have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + "habrán estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they will have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they will have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros "  + "habremos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we will have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we will have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                break;
            case 1:
                ps1 = "yo no " + "habré estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I won't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I won't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no " + "habrás estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you won't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you won't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él no " + "habrá estdo " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he won't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he won't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "habrá estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she won't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she won't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "habrá estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it won't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it won't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "habrán estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they won't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they won't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "habremos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we won't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we won't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }

    //would
    public void GenWouldSimp3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + vn1w[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I would "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I would " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú "  + vn2w[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you would "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you would " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él "  + vn3w[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he would "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he would " + vnb[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella "  + vn3w[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she would "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she would " + vnb[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso "  + vn3w[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it would "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it would " + vnb[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos "  + vn4w[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they would "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they would " + vnb[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros "  + vn5w[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we would "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng = "we would " + vnb[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo " + "no " + vn1w[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I " + "wouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I " + "wouldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú " + "no " + vn2w[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you " + "wouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you " + "wouldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él " + "no " + vn3w[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he " + "wouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he " + "wouldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella " + "no " + vn3w[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she " + "wouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she " + "wouldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso " + "no " + vn3w[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it " + "wouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it " + "wouldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos " + "no " + vn4w[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they " + "wouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they " + "wouldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros " + "no " + vn5w[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we " + "wouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we " + "wouldn't " + vnb[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenWouldCont3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "estaría " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I would "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I would " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú "  + "estarías " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you would "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you would " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él "  + "estaría " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he would "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he would " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella "  + "estaría " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she would "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she would " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso "  + "estaría " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it would "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it would " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos "  + "estarían " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they would "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they would " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros "  + "estaríamos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we would "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we would " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "estaría " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I wouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I wouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no " + "estarías " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you wouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you wouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él no " + "estaría " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he wouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he wouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "estaría " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she wouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she wouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "estaría " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it wouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it wouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "estarían " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they wouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they wouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros no " + "estaríamos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we wouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we wouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenWouldPerf3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I would "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I would " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú "  + "hubieras " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you would "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you would " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él "  + "hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he would "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he would " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella "  + "hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she would "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she would " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso "  + "hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it would "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it would " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + "hubieran " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they would "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they would " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros "  + "hubieramos " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we would "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we would " + "have " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I wouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I wouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no " + "hubieras " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you wouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng = "you wouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you wouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él no " + "hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he wouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he wouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she wouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she wouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it wouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it wouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "hubieran " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they wouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they wouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "hubieramos " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we wouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng = "we wouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenWouldPerfCont3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "hubiera estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I would have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I would have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú "  + "hubieras estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you would have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you would have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él "  + "hubiera estdo " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he would have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he would have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella "  + "hubiera estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she would have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she would have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso "  + "hubiera estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it would have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it would have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + "hubieran estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they would have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they would have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros "  + "hubieramos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we would have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we would have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "hubiera estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I wouldn't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I wouldn't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no " + "hubieras estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you wouldn't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you wouldn't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él no " + "hubiera estdo " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he wouldn't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he wouldn't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "hubiera estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she wouldn't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she wouldn't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "hubiera estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it wouldn't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it wouldn't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "hubieran estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they wouldn't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they wouldn't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "hubieramos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we wouldn't have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we wouldn't have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }

    //could
    public void GenCouldSimp3() {
        switch (negg) {
            case 0:
                ps1 = "yo podría " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I could " + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I could " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú podrías " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you could " + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you could " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él podría " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he could " + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he could " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella podría " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she could " + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she could " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso podría " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it could " + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it could " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos podrían " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they could " + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they could " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros podríamos " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we could " + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we could " + vnb[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo " + "no podría " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú " + "no podrías " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él " + "no podría " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella " + "no podría " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso " + "no podría " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos " + "no podrían " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros " + "no podríamos " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we " + "couldn't " + vnb[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenCouldCont3() {
        switch (negg) {
            case 0:
                ps1 = "yo podría "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I could "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I could " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú podrías "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you could "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you could " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él podría "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he could "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he could " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella podría "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she could "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she could " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso podría "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it could "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it could " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos podrían "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they could "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they could " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros podríamos "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we could "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we could " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no podría " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I couldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I couldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no podrías " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you couldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you couldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él no podría " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he couldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he couldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no podría " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she couldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she couldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no podría " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it couldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it couldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no podrían " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they couldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they couldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no podríamos " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we couldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we couldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenCouldPerf3() {
        switch (negg) {
            case 0:
                ps1 = "yo pude " +  "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú pudiste " +  "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él pudo " +  "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella pudo " +  "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso pudo " +  "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos pudieron " +  "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros pudimos  " +  "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we could " + "have " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no pude " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no pudiste " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];

                ps3 = "él no pudo " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no pudo " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no pudo " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no pudieron " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no pudimos " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we couldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenCouldPerfCont3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "pude haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I could have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I could have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú "  + "pudiste haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you could have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you could have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él "  + "pudo haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he could have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he could have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella "  + "pudo haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she could have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she could have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso "  + "pudo haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it could have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it could have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + "pudieron haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they could have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they could have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros "  + "pudimos haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we could have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we could have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "pude haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I couldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I couldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no " + "pudiste haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you couldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you couldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él no " + "pudo haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he couldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he couldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "pudo haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she couldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she couldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "pudo haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it couldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it couldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "pudieron haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "we couldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "we couldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "pudimos haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "they couldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "they couldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }

    //should
    public void GenShouldSimp3() {
        switch (negg) {
            case 0:
                ps1 = "yo debería "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I should "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I should " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú deberías "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you should "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you should " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él debería "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he should "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he should " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella debería "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she should "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she should " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso debería "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it should "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it should " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos deberían "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they should "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they should " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros deberíamos "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we should "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we should " + vnb[v] + nnobles[n] + frequadv[r];
                break;
            case 1:
                ps1 = "yo " + "no debería " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I " + "shouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I " + "shouldn't " + vnb[v] + nnobles[n] + frequadv[r];

                ps2 = "tú " + "no deberías " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you " + "shouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you " + "shouldn't " + vnb[v] + nnobles[n] + frequadv[r];

                ps3 = "él " + "no debería " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he " + "shouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he " + "shouldn't " + vnb[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella " + "no debería " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she " + "shouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she " + "shouldn't " + vnb[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso " + "no debería " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it " + "shouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it " + "shouldn't " + vnb[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos " + "no deberían " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they " + "shouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they " + "shouldn't " + vnb[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros " + "no deberíamos " + vnbs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we " + "shouldn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we " + "shouldn't " + vnb[v] + nnobles[n] + frequadv[r];
                break;
        }
    }
    public void GenShouldCont3() {
        switch (negg) {
            case 0:
                ps1 = "yo debería "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I should "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I should " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú deberías "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you should "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you should " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él debería "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he should "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he should "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella debería "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she should "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she should " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso debería "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it should "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it should " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos deberían "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they should "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they should " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros deberíamos "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we should "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we should " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no debería " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I shouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I shouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no deberías " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you shouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you shouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él no debería " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he shouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he shouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3ella = "ella no debería " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she shouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she shouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3eso = "eso no debería " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it shouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it shouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps4 = "ellos no deberían " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they shouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they shouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps5 = "nosotros no deberíamos " + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we shouldn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we shouldn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenShouldPerf3() {
        switch (negg) {
            case 0:
                ps1 = "yo debí "  + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I should "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I should " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú debiste "  + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you should "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you should " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él debió "  + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he should "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he should " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella debió "  + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she should "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she should " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso debió "  + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it should "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it should " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos debieron "  + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they should "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they should " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros debimos  "  + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we should "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we should " + "have " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no debí " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I shouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I shouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no debiste " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you shouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you shouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él no debió " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he shouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he shouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no debió " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she shouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she shouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no debió " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it shouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it shouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no debieron " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they shouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they shouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no debimos " + "haber " + vpsp[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we shouldn't "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we shouldn't " + "have " + vpeng[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenShouldPerfCont3() {
        switch (negg) {
            case 0:
                ps1 = "yo "  + "debí haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I should have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I should have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú "  + "debiste haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you should have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you should have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él "  + "debió haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he should have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he should have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella "  + "debió haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she should have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she should have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso "  + "debió haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it should have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it should have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos "  + "debieron haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they should have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they should have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros "  + "debimos haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we should have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we should have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "debí haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I shouldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I shouldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no " + "debiste haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you shouldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you shouldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él no " + "debió haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he shouldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he shouldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no " + "debió haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she shouldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she shouldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no " + "debió haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it shouldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it shouldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no " + "debieron haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they shouldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they shouldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no " + "debimos haber estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we shouldn't "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we shouldn't " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }

    //might
    public void GenMightSimp3() {
        switch (negg) {
            case 0:
                ps1 = "yo quizá " + vn1y3subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I might " + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I might " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú quizá " + vn2subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you might " + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you might " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él quizá " + vn1y3subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he might " + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he might " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella quizá " + vn1y3subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she might " + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she might " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso quizá " + vn1y3subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it might " + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it might " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos quizá " + vn4subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they might " + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they might " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros quizá " + vn5subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we might " + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we might " + vnb[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo " + "quizá no " + vn1y3subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps1eng = "I " + "might not " + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I " + "might not " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú " + "quizá no " + vn2subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps2eng = "you " + "might not " + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you " + "might not " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él " + "quizá no " + vn1y3subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3eng = "he " + "might not " + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he " + "might not " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella " + "quizá no " + vn1y3subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3she = "she " + "might not " + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she " + "might not " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso " + "quizá no " + vn1y3subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps3it = "it " + "might not " + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it " + "might not " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos " + "quizá no " + vn4subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps4eng = "they " + "might not " + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they " + "might not " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros " + "quizá no " + vn5subj[v] + nnoblesesp[n] + advfrequ[r] ;
                ps5eng = "we " + "might not " + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we " + "might not " + vnb[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenMightCont3() {
        switch (negg) {
            case 0:
                ps1 = "yo quizá "  + "esté " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I might "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I might " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú quizá "  + "estés " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you might "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you might " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él quizá "  + "esté " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he might "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he might " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella quizá "  + "esté " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she might "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she might " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso quizá "  + "esté " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it might "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it might " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos quizá "  + "estén " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they might "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they might " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros quizá "  + "estemos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we might "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we might " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo quizá no "  + "esté " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I might not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I might not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps2 = "tú quizá no "  + "estés " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you might not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you might not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                ps3 = "él quizá no "  + "esté " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he might not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he might not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella quizá no "  + "esté " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she might not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she might not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso quizá no "  + "esté " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it might not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it might not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos quizá no "  + "estén " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they might not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they might not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros quizá no "  + "estemos " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we might not "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we might not " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenMightPerf3() {
        switch (negg) {
            case 0:
                ps1 = "yo quizá "  + "haya " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I might "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I might " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú quizá "  + "hayas " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you might "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you might " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él quizá "  + "haya " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he might "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he might " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella quizá "  + "haya " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she might "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she = "she might " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso quizá "  + "haya " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it might "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it might " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos quizá "  + "hayan " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they might "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng = "they might " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros quizá  "  + "hayamos " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we might "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng = "we might " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                break;
            case 1:
                ps1 = "yo quizá no "  + "haya " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I might not "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I might not " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps2 = "tú quizá no "  + "hayas " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you might not "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you might not " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3 = "él quizá no "  + "haya " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he might not "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he might not " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella quizá no "  + "haya " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she might not "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she might not " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso quizá no "  + "haya " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it might not "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it might not " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos quizá no "  + "hayan " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they might not "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they might not " + "have " + vpeng[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros quizá no "  + "hayamos " + vpsp[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we might not "  + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we might not " + "have " + vpeng[v] + nnobles[n] + frequadv[r];
                break;
        }
    }
    public void GenMightPerfCont3() {
        switch (negg) {
            case 0:
                ps1 = "yo quizá "  + "haya estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I might have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I might have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú quizá "  + "hayas estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you might have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you might have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él quizá "  + "haya estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he might have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he might have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella quizá "  + "haya estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she might have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she might have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso quizá "  + "haya estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it might have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it might have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos quizá "  + "hayan estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they might have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they might have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros quizá "  + "hayamos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we might have "  + "been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we might have " + "been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;

            case 1:
                ps1 = "yo quizá no "  + "haya estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I might not "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I might not " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú quizá no "  + "hayas estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you might not "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you might not " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él quizá no "  + "haya estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he might not "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he might not " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella quizá no "  + "haya estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she might not "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she might not " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso quizá no "  + "haya estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it might not "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it might not " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos quizá no "  + "hayan estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they might not "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they might not " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros quizá no "  + "hayamos estado " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we might not "  + "have been " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we might not " + "have been " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }

    // can y must Simp y Cont
    public void GenCanSimp3() {
        switch (negg) {
            case 0:
                ps1 = "yo puedo "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I can "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I can " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú puedes "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you can "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you can " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él puede "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he can "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he can " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella puede "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she can "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she can " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso puede "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it can "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it can " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos pueden "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they can "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they can " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros podemos "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we can "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng = "we can " + vnb[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo " + "no puedo "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I " + "can't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I " + "can't " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú " + "no puedes "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you " + "can't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you " + "can't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él " + "no puede "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he " + "can't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he " + "can't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella " + "no puede "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she " + "can't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she " + "can't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso " + "no puede "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it " + "can't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it " + "can't " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos " + "no pueden "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they " + "can't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they " + "can't " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros " + "no podemos "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we " + "can't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we " + "can't " + vnb[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenCanCont3() {
        switch (negg) {
            case 0:
                ps1 = "yo puedo "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I can "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I can " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú puedes "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you can "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you can " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he can "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he can " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she can "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she can " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it can "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it can " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos pueden "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they can "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they can " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros podemos "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we can "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we can " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no puedo "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I can't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I can't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no puedes "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you can't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you can't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él no puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he can't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he can't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she can't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she can't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it can't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it can't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no pueden "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they can't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they can't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no podemos "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we can't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we can't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }
    public void GenMustSimp3() {
        switch (negg) {
            case 0:
                ps1 = "yo debo "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I must "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I must " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú debes "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you must "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you must " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él debe "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he must "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he must " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella debe "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she must "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she must " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso debe "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it must "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it must " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos deben "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they must "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they must " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros debemos "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we must "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we must " + vnb[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo " + "no debo "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I " + "mustn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I " + "mustn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps2 = "tú " + "no debes "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you " + "mustn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you " + "mustn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3 = "él " + "no debe "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he " + "mustn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he " + "mustn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella " + "no debe "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she " + "mustn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she " + "mustn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso " + "no debe "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it " + "mustn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it " + "mustn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos " + "no deben "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they " + "mustn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they " + "mustn't " + vnb[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros " + "no debemos "  + vnbs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we " + "mustn't "  + vnb[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we " + "mustn't " + vnb[v] + nnobles[n] + frequadv[r];
                break;
        }
    }// nuevo
    public void GenMustCont3() {
        switch (negg) {
            case 0:
                ps1 = "yo debo "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I must "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I must " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú debes "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you must "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you must " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he must "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he must " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she must "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she must " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it must "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it must " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos deben "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they must "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they must " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros debemos "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we must "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we must " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no debo "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps1eng = "I mustn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps1eng2 = "I mustn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps2 = "tú no debes "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps2eng = "you mustn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps2eng2 = "you mustn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3 = "él no debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3eng = "he mustn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3eng2 = "he mustn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3ella = "ella no debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3she = "she mustn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3she2 = "she mustn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps3eso = "eso no debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps3it = "it mustn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps3iteng2 = "it mustn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps4 = "ellos no deben "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps4eng = "they mustn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps4eng2 = "they mustn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];


                ps5 = "nosotros no debemos "  + "estar " + vnbcs[v] + nnoblesesp[n] + advfrequ[r];
                ps5eng = "we mustn't "  + "be " + vnbc[v] + nnobles[n] + frequadv[r];
                ps5eng2 = "we mustn't " + "be " + vnbc[v] + nnobles[n] + frequadv[r];

                break;
        }
    }// nuevo

    String objyo[]= {"te ","lo ", "la ","lo ", "los ", "nos "};
    String objtu[]= {"me ","lo ", "la ","lo ", "los ", "nos "};
    String objel[]= {"me ","te ", "la ","lo ", "los ", "nos "};
    String objella[]= {"me ","lo ", "te ","lo ", "los ", "nos "};
    String objeso[]= {"me ","lo ", "te ","la ", "los ", "nos "};
    String objellos[]= {"me ","lo ", "te ","lo ", "la ", "nos "};
    String objnos[]= {"lo ", "te ","lo ", "los ", "la "};

    String obji[]= {"you ","him ", "her ","it ", "them ", "us "};
    String objyou[]= {"me ","him ", "her ","it ", "them ", "us "};
    String objhe[]= {"me ","you ", "her ","it ", "them ", "us "};
    String objshe[]= {"me ","him ", "you ","it ", "them ", "us "};
    String objit[]= {"me ","him ", "you ","her ", "them ", "us "};
    String objthem[]= {"me ","him ", "you ","it ", "her ", "us "};
    String objus[]= {"him ", "you ","it ", "them ", "her "};

    String vp1 []={"acuesto ", "afieto ", "divierto ",
            "olvido ", "duermo ",  "pongo ", "baño ",
            "escondo ","como ","me comporto ", "quedo ", "levanto ",
            "quejo ", "marcho ", "meto a ", "muero ",
            "niego ", "dirigo a ", "acuerdo "
    };

    String vp2 []={"acuestas ", "afeitas ", "diviertes ",
            "olvidas ", "duermes ", "pones ", "bañas ",
            "escondes ","comes ","te comportas ", "quedas ", "levantas ",
            "quejas ", "marchas ", "metes a ", "mueres ",
            "niegas ", "diriges a ", "acuerdas "
    };
    String vp3 []={"acuesta ", "afeita ", "divierte ",
            "olvida ", "duerme ",  "pone ", "baña ",
            "esconde ","come ","se comporta ", "queda ", "levanta ",
            "queja ", "marcha ", "mete a ", "muere ",
            "niega ", "dirige a ", "acuerda "
    };
    String vp4 []={"acuestan ", "afeitan ", "divierten ",
            "olvidan ", "duermen ",  "ponen ", "bañan ",
            "esconden ","comen ","se comportan ", "quedan ", "levantan ",
            "quejan ", "marchan ", "meten a ", "mueren ",
            "niegan ", "dirigen a ", "acuerdan "
    };

    String vp5 []={"acostamos ", "afeitamos ", "divertimos ",
            "olvidamos ", "dormimos ","ponemos ", "bañamos ",
            "escondemos ","comemos ","nos comportamos ",     "quedamos ", "levantamos ",
            "quejamos ", "marchamos ", "metemos a ", "morimos ",
            "negamos ", "dirigimos a ", "acordamos "
    };

    // verbos pronominativos ingl[es
    String vpe1[]={"lay down ", "shave ", "have fun " , "forget ",  "sleep ", "wear ",
            "shower ", "hide ", "eat ","behave ", "stay ", "get up ", "complaint "
            ,"leave ", "get in ", "die ", "refuse ", "head to ", "remember "
    };
    String vpe2[]={"lay down ", "shave ", "have fun " , "forget ", "sleep ","wear ",
            "shower ", "hide ", "eat ","behave ", "stay ", "get up ", "complaint "
            ,"leave ", "get in ", "die ", "refuse ", "head to ", "remember "
    };
    String vpe3[]={"lays down ", "shaves ", "has fun " , "forget ", "sleeps ","wears ",
            "showers ", "hides ", "eats ","behaves ", "stays ", "gets up ", "complaints "
            ,"leaves ", "gets in ", "dies ", "refuses ", "heads to ", "remembers "
    };
    String vpe4[]={"lay down ", "shave ", "have fun " , "forget ", "sleep ", "wear ",
            "shower ", "hide ", "eat ","behave ", "stay ", "get up ", "complaint "
            ,"leave ", "get in ", "die ", "refuse ", "head to ", "remember "
    };

    String vpe5[]={"lay down ", "shave ", "have fun " , "forget ", "sleep ", "wear ",
            "shower ", "hide ", "eat ","behave ", "stay ", "get up ", "complaint "
            ,"leave ", "get in ", "die ", "refuse ", "head to ", "remember "
    };

    String vg1[]={"enojo ", "aburro ", "confundo ", "canso ", "alegro ",
            "pierdo ", "impresiono ", "asusto ", "lleno ", "drogo ", "agito ",
            "emociono ", "averguenzo ", "deprimo ", "caso ", "embarazo "
    };
    String vg2[]={"enojas ", "aburres ", "confundes ", "cansas ", "alegras ",
            "pierdes ", "impresionas ", "asustas ", "llenas ", "drogas ", "agitas ",
            "emocionas ", "averguenzas ", "deprimes ", "casas ", "embarazas "
    };
    String vg3[]={"enoja ", "aburre ", "confunde ", "cansa ", "alegra ",
            "pierde ", "impresiona ", "asusta ", "llena ", "droga ", "agita ",
            "emociona ", "averguenza ", "deprime ", "casa ", "embaraza "
    };
    String vg4[]={"enojan ", "aburren ", "confunden ", "cansan ", "alegran ",
            "pierden ", "impresionan ", "asustan ", "llenan ", "drogan ", "agitan ",
            "emocionan ", "averguenzan ", "deprimen ", "casan ", "embarazan "
    };

    String vg5[]={"enojamos ", "aburrimos ", "confundimos ", "cansamos ", "alegramos ",
            "perdemos ", "impresionamos ", "asustamos ", "llenamos ", "drogamos ", "agitamos ",
            "emocionamos ", "avergonzamos ", "deprimimos ", "casamos ", "embarazamos "
    };

    String vgeng[]={"angry ", "bored ", "confused ", "tired ", "happy ",
            "lost ", "impressed ", "scared ", "filled ", "high ", "agitated ",
            "excited ", "embarrased ", "depressed ", "married ", "pregnant "
    };
    //dificultad 3
    public void WantYouTo3() {
        int rn1 = (int) (Math.random() * 6);
        int rn2 = (int) (Math.random() * 5);
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        //want to subject
        String wtsj[] = {"I want ", "you want ", "he wants ", "she wants ", "it wants ", "we want ", "they want "};
        //want to subject negative
        String wtsjn[] = {"I don't want ", "you don't want ", "he doesn't want ", "she doesn't want ", "it doesn't want "
                , "we don't want ", "they don't want "};
        //want to object
        String wtobj1[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj2[] = {"me to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj3[] = {"you to " + vnb[v], "me to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj4[] = {"you to " + vnb[v], "him to " + vnb[v], "me to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj5[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "me to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj6[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "them to " + vnb[v]};
        String wtobj7[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "me to " + vnb[v]};

        //sujetos want to en sp
        String wtsjs[] = {"yo quiero ", "tú quieres ", "él quiere ", "ella quiere ", "eso quiere ", "nosotros queremos ", "ellos quieren "};
        //sujetos want to en sp negativo
        String wtsjsn[] = {"yo no quiero ", "tú no quieres ", "él no quiere ", "ella no quiere ", "eso no quiere ", "nosotros no queremos ", "ellos no quieren "};

        // objetos wt en sp
        String wtobj1s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj2s[] = {"que yo " + vn1y3subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj3s[] = {"que tú " + vn2subj[v], "que yo " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj4s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que yo " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj5s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que yo " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj6s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que ellos " + vn4subj[v]};
        String wtobj7s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que yo " + vn1y3subj[v]};

        switch (neg) {
            case 0:
                ps1 = wtsjs[0] + wtobj1s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = wtsj[0] + wtobj1[rn1] + nnobles[n] + frequadv[radv];

                ps2 = wtsjs[1] + wtobj2s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = wtsj[1] + wtobj2[rn1] + nnobles[n] + frequadv[radv];

                ps3 = wtsjs[2] + wtobj3s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = wtsj[2] + wtobj3[rn1] + nnobles[n] + frequadv[radv];

                ps3ella = wtsjs[3] + wtobj4s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps3she = wtsj[3] + wtobj4[rn1] + nnobles[n] + frequadv[radv];

                ps3eso = wtsjs[4] + wtobj5s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps3it = wtsj[4] + wtobj5[rn1] + nnobles[n] + frequadv[radv];

                ps4 = wtsjs[6] + wtobj6s[rn2] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = wtsj[6] + wtobj6[rn2] + nnobles[n] + frequadv[radv];

                ps5 = wtsjs[5] + wtobj7s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = wtsj[5] + wtobj7[rn1] + nnobles[n] + frequadv[radv];
                break;
            case 1:
                ps1 = wtsjsn[0] + wtobj1s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = wtsjn[0] + wtobj1[rn1] + nnobles[n] + frequadv[radv];

                ps2 = wtsjsn[1] + wtobj2s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = wtsjn[1] + wtobj2[rn1] + nnobles[n] + frequadv[radv];

                ps3 = wtsjsn[2] + wtobj3s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = wtsjn[2] + wtobj3[rn1] + nnobles[n] + frequadv[radv];

                ps3ella = wtsjsn[3] + wtobj4s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps3she = wtsjn[3] + wtobj4[rn1] + nnobles[n] + frequadv[radv];

                ps3eso = wtsjsn[4] + wtobj5s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps3it = wtsjn[4] + wtobj5[rn1] + nnobles[n] + frequadv[radv];

                ps4 = wtsjsn[6] + wtobj6s[rn2] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = wtsjn[6] + wtobj6[rn2] + nnobles[n] + frequadv[radv];

                ps5 = wtsjsn[5] + wtobj7s[rn1] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = wtsjn[5] + wtobj7[rn1] + nnobles[n] + frequadv[radv];
                break;
        }
    }//PD 19/04/2022

    //for to dificultad 3
    public void ForSubTo3() {
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        //subject in eng
        String ftsj[] = {
                "for me to ", "for you to ", "for him to ", "for her to ", "for it to ",
                "for them to ", "for us to "
        };

        //subject in spanish
        String ftsjs[] = {
                "para que yo ", "para que tú ", "para que él ", "para que ella ",
                "para que eso ", "para que ellos ", "para que nosotros "
        };

        //subject in eng negative
        String ftsjn[] = {
                "for me not to ", "for you not to ", "for him not to ", "for her not to ",
                "for it not to ", "for them not to ", "for us not to "
        };

        //subject in spanish negative
        String ftsjsn[] = {
                "para que yo no ", "para que tú no ", "para que él no ", "para que ella no ",
                "para que eso no ", "para que ellos no ", "para que nosotros no "
        };

        switch (neg) {
            case 0:
                ps1 = ftsjs[0] + vn1y3subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = ftsj[0] + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = ftsjs[1] + vn2subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = ftsj[1] + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = ftsjs[2] + vn1y3subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = ftsj[2] + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = ftsjs[3] + vn1y3subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = ftsj[3] + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = ftsjs[4] + vn1y3subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = ftsj[4] + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = ftsjs[5] + vn4subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = ftsj[5] + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = ftsjs[6] + vn5subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = ftsj[6] + vnb[v] + nnobles[n] + frequadv[radv];
                break;
            case 1:
                ps1 = ftsjsn[0] + vn1y3subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = ftsjn[0] + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = ftsjsn[1] + vn2subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = ftsjn[1] + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = ftsjsn[2] + vn1y3subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = ftsjn[2] + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = ftsjsn[3] + vn1y3subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = ftsjn[3] + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = ftsjsn[4] + vn1y3subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = ftsjn[4] + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = ftsjsn[5] + vn4subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = ftsjn[5] + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = ftsjsn[6] + vn5subj[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = ftsjn[6] + vnb[v] + nnobles[n] + frequadv[radv];
                break;
        }
    }//PD 19/04/2022


    public void supposedtopres3() {
        int radv = (int) (Math.random() * frequadv.length);
        switch (vc) {
            case 0:
                ps1 = "Se supone que " + vn1[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I'm supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Se supone que " + vn2[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you are supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Se supone que él " + vn3[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he is supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Se supone que ella " + vn3[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she is supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Se supone que eso " + vn3[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it is supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que " + vn4[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they are supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que " + vn5[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we are supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;
            case 1:
                ps1 = "se supone que no " + vn1[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "se supone que no " + vn2[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you aren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "se supone que él no " + vn3[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he isn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "se supone que ella no " + vn3[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she isn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "se supone que eso no " + vn3[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it isn't supposed to  " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que no " + vn4[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they aren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que no " + vn5[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we aren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;

            case 2:
                ps1 = "se supone que tengo que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I'm supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "se supone que tienes que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you are supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "se supone que él tiene que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he is supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "se supone que ella tiene que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she is supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "se supone que eso tiene que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it is supposed to  " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que tienen que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they are supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que tenemos que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we are supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;

            case 3:
                ps1 = "se supone que no tengo que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "se supone que no tienes que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you aren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "se supone que él no tiene que  " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he isn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "se supone que ella no tiene que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she isn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "se supone que eso no tiene que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it isn't supposed to  " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que no tienen que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they aren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que no tenemos que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we aren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;

            case 4:
                ps1 = "se supone que voy a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I'm supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "se supone que vas a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you are supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "se supone que él va a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he is supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "se supone que ella va a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she is supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "se supone que eso va a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it is supposed to  " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que van a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they are supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que vamos a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we are supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;

            case 5:
                ps1 = "se supone no voy a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "se supone que no vas a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you aren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "se supone que él no va a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he isn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "se supone que ella no va a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she isn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "se supone que eso no va a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it isn't supposed to  " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que no van a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they aren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que no vamos a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we aren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;

        }
    } //PD 21/04/2022

    public void supposedtopast3() {
        int radv = (int) (Math.random() * frequadv.length);
        switch (neg) {
            case 0:
                ps1 = "Se supone que yo " + ps1imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I was supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Se supone que tú " + ps2imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you were supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Se supone que él " + ps3imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he was supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Se supone que ella " + ps3imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she was supposed to " + vnb[v]+ nnobles[n] + frequadv[radv];

                ps3eso = "Se supone que eso " + ps3imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it was supposed to " + vn3[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que " + vn4imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they were supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que " + vn5imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we were supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;
            case 1:
                ps1 = "se supone que no " + ps1imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I wasn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "se supone que no " + ps2imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you weren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "se supone que él no " + ps3imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he wasn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "se supone que ella no " + ps3imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she wasn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "se supone que eso no " + ps3imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it wasn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que no " + vn4imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they weren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que no " + vn5imp[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we weren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;

            case 2:
                ps1 = "Se supone que tenía que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I was supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Se supone que tenías que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you were supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Se supone que él tenía que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he was supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Se supone que ella tenía que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she was supposed to " + vnb[v]+ nnobles[n] + frequadv[radv];

                ps3eso = "Se supone que eso tenía que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it was supposed to " + vn3[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que tenían que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they were supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que teníamos que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we were supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;
            case 3:
                ps1 = "Se supone que no tenía que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I wasn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Se supone que no tenías que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you weren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Se supone que él no tenía que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he wasn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Se supone que ella no tenía que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she wasn't supposed to " + vn3[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Se supone que eso no tenía que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it wasn't supposed to " + vn3[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que no tenían que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they weren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que no teníamos que " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we weren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;

            case 4:
                ps1 = "Se supone iba a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I was supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Se supone que ibas a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you were supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Se supone que él iba a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he was supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Se supone que ella iba a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she was supposed to " + vnb[v]+ nnobles[n] + frequadv[radv];

                ps3eso = "Se supone que eso iba a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it was supposed to " + vn3[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que iban a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they were supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que ibamos a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we were supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;
            case 5:
                ps1 = "Se supone que no iba a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I wasn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Se supone que no ibas a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "you weren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Se supone que él no iba a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "he wasn't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Se supone que ella no iba a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she wasn't supposed to " + vn3[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Se supone que eso no iba a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "it wasn't supposed to " + vn3[v] + nnobles[n] + frequadv[radv];

                ps4 = "se supone que no iban a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "they weren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "se supone que no ibamos a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "we weren't supposed to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;
        }
    } //PD 21/04/2022

    //Wish Past Simple Dif 2
    public void WishPastSimpDif3() {
        int radv = (int) (Math.random() * frequadv.length);
        switch (neg) {
            case 0:
                ps1 = "Ojalá yo " + ps1wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I wish " + "I " + vnbp[v] + nnobles[n] + frequadv[radv];

                ps2 = "Ojalá tú " + ps2wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "I wish " + "you " + vnbp[v] + nnobles[n] + frequadv[radv];

                ps3 = "Ojalá él " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "I wish " + "he " + vnbp[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ojalá ella " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "I wish " + "she " + vnbp[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Ojalá eso " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "I wish " + "it " + vnbp[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ojalá ellos " + ps4wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "I wish " + "they " + vnbp[v] + nnobles[n] + frequadv[radv];

                ps5 = "Ojalá nosotros " + ps5wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "I wish " + "we " + vnbp[v] + nnobles[n] + frequadv[radv];
                break;
            case 1:
                ps1 = "Ojalá yo no " + ps1wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I wish I didn't " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Ojalá tú no " + ps2wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "I wish you didn't " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Ojalá él no " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "I wish he didn't " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ojalá ella no " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "I wish she didn't " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Ojalá eso no " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "I wish it didn't " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ojalá ellos no " + ps4wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "I wish they didn't " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "Ojalá nosotros no " + ps5wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "I wish we didn't " + vnb[v] + nnobles[n] + frequadv[radv];

                break;
        }
    } //PD 21/04/2022

    public void WishPastPerfDif3() {
        int radv = (int) (Math.random() * frequadv.length);
        switch (neg) {
            case 0:
                ps1 = "Ojalá yo hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I wish I had " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps2 = "Ojalá tú hubieras " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "I wish you had " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps3 = "Ojalá él hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "I wish he had " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ojalá ella hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "I wish she had " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Ojalá eso hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "I wish it had " +  vpeng[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ojalá ellos hubieran " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "I wish they had " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps5 = "Ojalá nosotros hubieramos " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "I wish we had " + vpeng[v] + nnobles[n] + frequadv[radv];
                break;
            case 1:
                ps1 = "Ojalá yo no hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I wish I hadn't " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps2 = "Ojalá tú no hubieras " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "I wish you hadn't " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps3 = "Ojalá él no hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "I wish he hadn't " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ojalá ella no hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "I wish she hadn't " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Ojalá eso no hubiera " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "I wish it hadn't " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ojalá ellos no hubieran " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "I wish they hadn't " + vpeng[v] + nnobles[n] + frequadv[radv];

                ps5 = "Ojalá nosotros no hubieramos " + vpsp[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "I wish we hadn't " + vpeng[v] + nnobles[n] + frequadv[radv];

                break;


        }
    } //PD 21/04/2022

    public void WishWouldDif3() {
        int radv = (int) (Math.random() * frequadv.length);
        switch (neg) {
            case 0:
                ps1 = "Ojalá yo " + ps1wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I wish I would " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Ojalá tú " + ps2wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "I wish you would " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Ojalá él " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "I wish he would " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ojalá ella " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "I wish she would " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Ojalá eso " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "I wish it would " +  vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ojalá ellos " + ps4wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "I wish they would " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "Ojalá nosotros " + ps5wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "I wish we would " + vnb[v] + nnobles[n] + frequadv[radv];
                break;
            case 1:
                ps1 = "Ojalá yo no " + ps1wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I wish I wouldn't " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Ojalá tú no " + ps2wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "I wish you wouldn't " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Ojalá él no " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "I wish he wouldn't " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ojalá ella no " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "I wish she wouldn't " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Ojalá eso no " + ps3wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "I wish it wouldn't " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ojalá ellos no " + ps4wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "I wish they wouldn't " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "Ojalá nosotros no " + ps5wish[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "I wish we wouldn't " + vnb[v] + nnobles[n] + frequadv[radv];

                break;



        }
    } //PD 22/04/2022

    // USED TO DIF 2
    public void UsedToDif3() {
        int radv = (int) (Math.random() * frequadv.length);
        switch (neg) {
            case 0:
                ps1 = "Yo solía " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I used to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Tú solías " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "You used to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Él solía " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "He used to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ella solía " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "She used to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Eso solía " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "It used to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ellos solían " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "They used to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "Nosotros solíamos " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "We used to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;
            case 1:
                ps1 = "Yo no solía " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I didn't use to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps2 = "Tú no solías " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "You didn't use to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3 = "Él no solía " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "He didn't use to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ella no solía " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "she didn't use to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Eso no solía " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "It didn't use to  " + vnb[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ellos no solían " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "They didn't use to " + vnb[v] + nnobles[n] + frequadv[radv];

                ps5 = "Nosotros no solíamos " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "We didn't use to " + vnb[v] + nnobles[n] + frequadv[radv];
                break;

        }
    } //PD 22/04/2022

    // BE USED TO DIF 2
    public void BeUsedToDif3() {
        int radv = (int) (Math.random() * frequadv.length);
        switch (neg) {
            case 0:
                ps1 = "Yo estoy acostumbrado a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I'm used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps2 = "Tu estás acostumbrado a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "You are used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps3 = "Él está acostumbrado a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "He is used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ella está acostumbrada a  " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "She is used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Eso está acostumbrado a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "It is used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ellos están acostumbrados a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "They are used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps5 = "Nosotros estamos acostumbrados a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "We are used to " + vnbc[v] + nnobles[n] + frequadv[radv];
                break;

            case 1:
                ps1 = "Yo no estoy acostumbrado a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps1eng = "I'm not used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps2 = "Tu no estás acostumbrado a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps2eng = "You aren't used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps3 = "Él no está acostumbrado a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3eng = "He isn't used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps3ella = "Ella no está acostumbrada a  " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3she = "She isn't used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps3eso = "Eso no está acostumbrado a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps3it = "It isn't used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps4 = "Ellos no están acostumbrados a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps4eng = "They aren't used to " + vnbc[v] + nnobles[n] + frequadv[radv];

                ps5 = "Nosotros no estamos acostumbrados a " + vnbs[v] + nnoblesesp[n] + advfrequ[radv];
                ps5eng = "We aren't used to " + vnbc[v] + nnobles[n] + frequadv[radv];
                break;
        }
    } //PD 22/04/2022


    // dificultad 4- igual qeu la tres pero le agregamos prep phrases
    // let frequency adverbs always be at the end with the prep phrase
    //Presentes Dif 4
    public void GenPresSimp4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + vn1[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps1eng2 = "I " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps2 = "tú " + vn2[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];;
                ps2eng = "you " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps2eng2 = "you " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps3 = "él " + vn3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];;
                ps3eng = "he " + vnb3[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3eng2 = "he " + vnb3[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps3ella = "ella " + vn3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];;
                ps3she = "she " + vnb3[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3she2 = "she " + vnb3[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps3eso = "eso " + vn3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];;
                ps3it = "it " + vnb3[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3iteng2 = "it " + vnb3[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps4 = "ellos " + vn4[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];;
                ps4eng = "they " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps4eng2 = "they " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps5 = "nosotros " + vn5[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];;
                ps5eng = "we " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps5eng2 = "we " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                break;
            case 1:
                ps1 = "yo " + "no " + vn1[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I " + "don't " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps1eng2 = "I " + "don't " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps2 = "tú " + "no " + vn2[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you " + "don't " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps2eng2 = "you " + "don't " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps3 = "él " + "no " + vn3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he " + "doesn't " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3eng2 = "he " + "doesn't " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps3ella = "ella " + "no " + vn3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she " + "doesn't " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3she2 = "she " + "doesn't " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps3eso = "eso " + "no " + vn3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it " + "doesn't " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3iteng2 = "it " + "doesn't " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps4 = "ellos " + "no " + vn4[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they " + "don't " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps4eng2 = "they " + "don't " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps5 = "nosotros " + "no " + vn5[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we " + "don't " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps5eng2 = "we " + "don't " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2] + frequadv[r] ;

                break;


        }

    } //SV 230422
    public void GenPresCont4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + "estoy " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I am " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps1eng2 = "I am " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps2 = "tú " + "estás " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you are " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps2eng2 = "you are " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él " + "está " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he is " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + advfrequ[r];
                ps3eng2 = "he is " + vnbc[v] + nnobles[n]  + prep.noblesspecialeng[p][p2] + advfrequ[r];

                ps3ella = "ella " + "está " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she is " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + advfrequ[r];
                ps3she2 = "she is " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + advfrequ[r];

                ps3eso = "eso " + "está " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it is " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + advfrequ[r];
                ps3iteng2 = "it is " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + advfrequ[r];

                ps4 = "ellos " + "están " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they are " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + advfrequ[r];
                ps4eng2 = "they are " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + advfrequ[r];

                ps5 = "nosotros " + "estamos " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we are " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + advfrequ[r];
                ps5eng2 = "we are " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + advfrequ[r];

                break;
            case 1:
                ps1 = "yo no " + "estoy " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I'm not " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps1eng2 = "I'm not " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps2 = "tú no " + "estás " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you aren't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps2eng2 = "you aren't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él no " + "está " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he isn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3eng2 = "he isn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3ella = "ella no " + "está " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she isn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3she2 = "she isn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3eso = "eso no " + "está " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it isn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3iteng2 = "it isn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps4 = "ellos no " + "están " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they aren't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps4eng2 = "they aren't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps5 = "nosotros no " + "estamos " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we aren't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps5eng2 = "we aren't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;

        }

    } //SV 230422
    public void GenPresPerf4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + "he " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps1eng2 = "I have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps2 = "tú " + "has " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él " + "ha " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he has " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he has " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3ella = "ella " + "ha " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she has " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she has " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3eso = "eso " + "ha " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it has " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it has " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps4 = "ellos " + "han " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps5 = "nosotros " + "hemos " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
            case 1:

                ps1 = "yo no " + "he " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r] ;
                ps1eng = "I haven't " + vpeng[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps1eng2 = "I haven't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps2 = "tú no " + "has " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r] ;
                ps2eng = "you haven't " + vpeng[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps2eng2 = "you haven't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps3 = "él no " + "ha " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r] ;
                ps3eng = "he hasn't " + vpeng[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3eng2 = "he hasn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps3ella = "ella no " + "ha " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r] ;
                ps3she = "she hasn't " + vpeng[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3she2 = "she hasn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps3eso = "eso no " + "ha " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r] ;
                ps3it = "it hasn't " + vpeng[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3iteng2 = "it hasn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;


                ps4 = "ellos no " + "han " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r] ;
                ps4eng = "they haven't " + vpeng[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps4eng2 = "they haven't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;


                ps5 = "nosotros no " + "hemos " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r] ;
                ps5eng = "we haven't " + vpeng[v] + nnobles[n]+prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps5eng2 = "we haven't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;

                break;

        }

    } //SV 230422
    public void GenPresPerfCont4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + "he estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps2 = "tú " + "has estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you have " + "been " + vnbc[v] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él " + "ha estdo " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he has " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he has " + "been " + vnbc[v] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3ella = "ella " + "ha estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she has " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "she has " + "been " + vnbc[v] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3eso = "eso " + "ha estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it has " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "he has " + "been " + vnbc[v] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps4 = "ellos " + "han estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they have " + "been " + vnbc[v] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps5 = "nosotros " + "hemos estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we have " + "been " + vnbc[v] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "he estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I haven't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I haven't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps2 = "tú no " + "has estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you haven't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you haven't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él no " + "ha estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he hasn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he hasn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3ella = "ella no " + "ha estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she hasn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she hasn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3eso = "eso no " + "ha estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it hasn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it hasn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps4 = "ellos no " + "han estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they haven't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they haven't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps5 = "nosotros no " + "hemos estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we haven't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we haven't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                break;
        }

    } //SV 230422

    //Pasados Dif 4
    public void GenPastSimp4() {
        int sr = (int) (Math.random() * 2);
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (neg) {
            case 1:
                if (sr == 0) {
                    ps1 = "yo " + ps1pre[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps1eng = "I " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps1eng2 = "I " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps2 = "tú " + ps2pre[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                    ps2eng = "you " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps2eng2 = "you " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps3 = "él " + ps3p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3eng = "he " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps3eng2 = "he " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps3ella = "ella " + ps3p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3she = "she " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps3she = "she " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps3eso = "eso " + ps3p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3it = "it " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps3it = "it " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps4 = "ellos " + vn4p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps4eng = "they " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps4eng = "they " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps5 = "nosotros " + vn5p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps5eng = "we " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps5eng = "we " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                } else {
                    ps1 = "yo " + ps1imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps1eng = "I " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps1eng = "I " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps2 = "tú " + ps2imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps2eng = "you " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps2eng = "you " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps3 = "él " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r] ;
                    ps3eng = "he " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps3eng = "he " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps3ella = "ella " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3she = "she " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps3eso = "eso " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3it = "it " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps4 = "ellos " + vn4imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps4eng = "they " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps5 = "nosotros " + vn5imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps5eng = "we " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                }
                break;

            case 0:
                if (sr == 0) {
                    ps1 = "yo " + "no " + ps1pre[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps1eng = "I " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps2 = "tú " + "no " + ps2pre[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps2eng = "you " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps3 = "él " + "no " + ps3p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3eng = "he " + "din't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps3ella = "ella " + "no " + ps3p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3she = "she " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps3eso = "eso " + "no " + ps3p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3it = "it " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps4 = "ellos " + "no " + vn4p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps4eng = "they " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                    ps5 = "nosotros " + "no " + vn5p[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps5eng = "we " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                } else {
                    ps1 = "yo " + "no " + ps1imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps1eng = "I " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps1eng2 = "I " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps2 = "tú " + "no " + ps2imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps2eng = "you " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps2eng2 = "you " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps3 = "él " + "no " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3eng = "he " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps3eng2 = "he " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps3ella = "ella " + "no " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3she = "she " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps3she2 = "she " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps3eso = "eso " + "no " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps3it = "it " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps3iteng2 = "it " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps4 = "ellos " + "no " + vn4imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps4eng = "they " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps4eng2 = "they " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                    ps5 = "nosotros " + "no " + vn5imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                    ps5eng = "we " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                    ps5eng2 = "we " + "didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                }
                break;
        }
    } //SV 260422
    public void GenPastCont4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + "estaba " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I was " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I was " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps2 = "tú " + "estabas " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you were " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you were " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él " + "estaba " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he was " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he was " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella " + "estaba " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she was " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she was " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso " + "estaba " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it was " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it was " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos " + "estaban " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they were " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they were " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros " + "estábamos " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we were " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we were " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "estaba " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I wasn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I wasn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps2 = "tú no " + "estabas " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you weren't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you weren't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3 = "él no " + "estaba " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he wasn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he wasn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella no " + "estaba " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she wasn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she wasn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso no " + "estaba " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it wasn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3iteng2 = "it wasn't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos no " + "estaban " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they weren't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they weren't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros no " + "estábamos " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we weren't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we weren't " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
        }

    } //SV 260422
    public void GenPastPerf4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + "había " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps2 = "tú " + "habías " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él " + "había " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3ella = "ella " + "había " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3eso = "eso " + "había " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps4 = "ellos " + "habían " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps5 = "nosotros " + "habíamos " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "había " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps2 = "tú no " + "habías " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3 = "él no " + "había " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella no " + "había " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso no " + "había " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos no " + "habían " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros no " + "habíamos " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;

                break;


        }

    } //SV 260422
    public void GenPastPerfCont4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + "había estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps2 = "tú " + "habías estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3 = "él " + "había estdo " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella " + "había estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso " + "había estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos " + "habían estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps5 = "nosotros " + "habíamos estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we had " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "había estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I hadn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I hadn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps2 = "tú no " + "habías estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you hadn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you hadn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él no " + "había estdo " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he hadn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he hadn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3ella = "ella no " + "había estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she hadn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she hadn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3eso = "eso no " + "había estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it hadn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it hadn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps4 = "ellos no " + "habían estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they hadn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they hadn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps5 = "nosotros no " + "habíamos estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we hadn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we hadn't " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
        }
    } //SV 260422

    //Futuros Dif 4
    public void GenFutSimp4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + vn1f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps2 = "tú " + vn2f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3 = "él " + vn3f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella " + vn3f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso " + vn3f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos " + vn4f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros " + vn5f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we will " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
            case 1:
                ps1 = "yo " + "no " + vn1f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps2 = "tú " + "no " + vn2f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3 = "él " + "no " + vn3f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella " + "no " + vn3f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso " + "no " + vn3f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos " + "no " + vn4f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros " + "no " + vn5f[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we " + "won't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
        }

    } //SV 260422
    public void GenFutCont4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + "estaré " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r] ;

                ps2 = "tú " + "estarás " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él " + "estará " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3ella = "ella " + "estará " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3eso = "eso " + "estará " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos " + "estarán " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros " + "estaremos " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we will " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "estaré " + vnbcs[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps2 = "tú no " + "estarás " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                ps3 = "él no " + "estará " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella no " + "estará " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso no " + "estará " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos no " + "estarán " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros no " + "estaremos " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we won't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
        }

    } //SV 260422
    public void GenFutPerf4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + "habré " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps2 = "tú " + "habrás " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3 = "él " + "habrá " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella " + "habrá " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso " + "habrá " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos " + "habrán " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros " + "habremos " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we will " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
            case 1:
                ps1 = "yo no " + "habré " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I won't " + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps2 = "tú no " + "habrás " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3 = "él no " + "habrá " + vpsp[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella no " + "habrá " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she won't " + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps3she2 = "she won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso no " + "habrá " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos no " + "habrán " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros no " + "habremos " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we won't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
        }

    } //SV 260422
    public void GenFutPerfCont4() {
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo " + "habré estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I will have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps1eng2 = "I will have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps2 = "tú " + "habrás estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you will have " + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you will have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3 = "él " + "habrá estdo " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he will have " + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he will have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella " + "habrá estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she will have " + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she will have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso " + "habrá estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it will have " + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it will have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos " + "habrán estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they will have " + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they will have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros " + "habremos estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we will have " + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we will have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                break;
            case 1:
                ps1 = "yo no " + "habré estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps1eng = "I won't have " + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[r] ;
                ps1eng2 = "I won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps2 = "tú no " + "habrás estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps2eng = "you won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps2eng2 = "you won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3 = "él no " + "habrá estdo " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3eng = "he won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3eng2 = "he won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3ella = "ella no " + "habrá estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3she = "she won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3she2 = "she won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps3eso = "eso no " + "habrá estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps3it = "it won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps3iteng2 = "it won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps4 = "ellos no " + "habrán estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps4eng = "they won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps4eng2 = "they won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];


                ps5 = "nosotros no " + "habremos estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[r];
                ps5eng = "we won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];
                ps5eng2 = "we won't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[r];

                break;
        }
    } //SV 260422

    //Would Dif 4
    public void GenWouldSimp4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo "  + vn1w[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I would "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú "  + vn2w[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you would "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él "  + vn3w[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he would "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "ella "  + vn3w[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she would "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "eso "  + vn3w[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it would "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "ellos "  + vn4w[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they would "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "nosotros "  + vn5w[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we would "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng = "we would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo " + "no " + vn1w[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I " + "wouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I " + "wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú " + "no " + vn2w[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you " + "wouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you " + "wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él " + "no " + vn3w[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he " + "wouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he " + "wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella " + "no " + vn3w[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she " + "wouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she " + "wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso " + "no " + vn3w[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it " + "wouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it " + "wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos " + "no " + vn4w[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they " + "wouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they " + "wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros " + "no " + vn5w[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we " + "wouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we " + "wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 270422
    public void GenWouldCont4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo "  + "estaría " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I would "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I would " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "tú "  + "estarías " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you would "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you would " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "él "  + "estaría " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he would "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he would " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "ella "  + "estaría " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she would "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she would " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "eso "  + "estaría " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it would "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it would " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "ellos "  + "estarían " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they would "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they would " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "nosotros "  + "estaríamos " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we would "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we would " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no " + "estaría " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I wouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no " + "estarías " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you wouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you wouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él no " + "estaría " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he wouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he wouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no " + "estaría " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she wouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she wouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso no " + "estaría " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it wouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it wouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no " + "estarían " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they wouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they wouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "nosotros no " + "estaríamos " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we wouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we wouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 270422
    public void GenWouldPerf4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo "  + "hubiera " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I would "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I would " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú "  + "hubieras " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you would "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you would " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él "  + "hubiera " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he would "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he would " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella "  + "hubiera " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she would "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she would " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso "  + "hubiera " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it would "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it would " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos "  + "hubieran " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they would "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they would " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros "  + "hubieramos " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we would "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we would " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no " + "hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I wouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no " + "hubieras " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you wouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you wouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él no " + "hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he wouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he wouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no " + "hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she wouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she wouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso no " + "hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it wouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it wouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no " + "hubieran " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they wouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they wouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros no " + "hubieramos " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we wouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng = "we wouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 270422
    public void GenWouldPerfCont4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo "  + "hubiera estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I would have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I would have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú "  + "hubieras estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you would have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you would have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él "  + "hubiera estdo " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he would have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he would have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella "  + "hubiera estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she would have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she would have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso "  + "hubiera estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it would have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it would have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos "  + "hubieran estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they would have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they would have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros "  + "hubieramos estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we would have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we would have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no " + "hubiera estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wouldn't have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I wouldn't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no " + "hubieras estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you wouldn't have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you wouldn't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él no " + "hubiera estdo " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he wouldn't have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he wouldn't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no " + "hubiera estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she wouldn't have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she wouldn't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso no " + "hubiera estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it wouldn't have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it wouldn't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no " + "hubieran estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they wouldn't have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they wouldn't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros no " + "hubieramos estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we wouldn't have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we wouldn't have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 270422

    //could Dif 4
    public void GenCouldSimp4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo podría " + vnbs[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I could " + vnb[v] + nnobles[n]  + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú podrías " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él podría " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella podría " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso podría " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos podrían " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros podríamos " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we could " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo " + "no podría " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú " + "no podrías " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él " + "no podría " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella " + "no podría " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso " + "no podría " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos " + "no podrían " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros " + "no podríamos " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we " + "couldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422
    public void GenCouldCont4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo podría "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I could "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I could " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú podrías "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you could "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you could " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él podría "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he could "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he could " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella podría "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she could "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she could " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso podría "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it could "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it could " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos podrían "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they could "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they could " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros podríamos "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we could "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we could " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no podría " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I couldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I couldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no podrías " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you couldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you couldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él no podría " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he couldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he couldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no podría " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she couldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she couldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso no podría " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it couldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it couldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no podrían " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they couldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they couldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros no podríamos " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we couldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we couldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422
    public void GenCouldPerf4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo pude " +  "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú pudiste " +  "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él pudo " +  "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella pudo " +  "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso pudo " +  "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos pudieron " +  "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros pudimos  " +  "haber " + vpsp[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we could " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no pude " + "haber " + vpsp[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[radv];;
                ps1eng = "I couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no pudiste " + "haber " + vpsp[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[radv];;
                ps2eng = "you couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "él no pudo " + "haber " + vpsp[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[radv];;
                ps3eng = "he couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no pudo " + "haber " + vpsp[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[radv];;
                ps3she = "she couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso no pudo " + "haber " + vpsp[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[radv];;
                ps3it = "it couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no pudieron " + "haber " + vpsp[v] + nnoblesesp[n]  + prep.noblesspecial[p][p2] + advfrequ[radv];;
                ps4eng = "they couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros no pudimos " + "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we couldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422
    public void GenCouldPerfCont4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo "  + "pude haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I could have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I could have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú "  + "pudiste haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you could have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you could have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él "  + "pudo haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he could have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he could have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella "  + "pudo haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she could have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she could have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso "  + "pudo haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it could have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it could have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos "  + "pudieron haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they could have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they could have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros "  + "pudimos haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we could have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we could have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no " + "pude haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I couldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I couldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no " + "pudiste haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you couldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you couldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él no " + "pudo haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he couldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he couldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no " + "pudo haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she couldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she couldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso no " + "pudo haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it couldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it couldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no " + "pudieron haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "we couldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "we couldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros no " + "pudimos haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "they couldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "they couldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422

    //should Dif 4
    public void GenShouldSimp4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo debería "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I should "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I should " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú deberías "  + vnbs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you should "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you should " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él debería "  + vnbs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he should "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he should " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella debería "  + vnbs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she should "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she should " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso debería "  + vnbs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it should "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it should " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos deberían "  + vnbs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they should "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they should " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros deberíamos "  + vnbs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we should "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we should " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = "yo " + "no debería " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I " + "shouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I " + "shouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "tú " + "no deberías " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you " + "shouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you " + "shouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "él " + "no debería " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he " + "shouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he " + "shouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "ella " + "no debería " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she " + "shouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she " + "shouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "eso " + "no debería " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it " + "shouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it " + "shouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "ellos " + "no deberían " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they " + "shouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they " + "shouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "nosotros " + "no deberíamos " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we " + "shouldn't "  + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we " + "shouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
        }
    } //SV 280422
    public void GenShouldCont4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo debería "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I should "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I should " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú deberías "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you should "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you should " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él debería "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he should "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he should "  + "be " + vnbc[v] + prep.noblesspecialeng[p][p2] + frequadv[radv]+ nnobles[n];


                ps3ella = "ella debería "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she should "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she should " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso debería "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it should "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it should " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos deberían "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they should "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they should " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros deberíamos "  + "estar " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we should "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we should " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no debería " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I shouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I shouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no deberías " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you shouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you shouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "él no debería " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he shouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he shouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "ella no debería " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she shouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she shouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "eso no debería " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it shouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it shouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "ellos no deberían " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they shouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they shouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "nosotros no deberíamos " + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we shouldn't "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we shouldn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422
    public void GenShouldPerf4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo debí "  + "haber " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I should "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I should " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú debiste "  + "haber " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you should "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you should " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él debió "  + "haber " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he should "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he should " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella debió "  + "haber " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she should "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she should " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso debió "  + "haber " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it should "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it should " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos debieron "  + "haber " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they should "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they should " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros debimos  "  + "haber " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we should "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we should " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no debí " + "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I shouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I shouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no debiste " + "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you shouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you shouldn't " + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él no debió " + "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he shouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he shouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no debió " + "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she shouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she shouldn't " + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso no debió " + "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it shouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it shouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no debieron " + "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they shouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they shouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros no debimos " + "haber " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we shouldn't "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we shouldn't " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422
    public void GenShouldPerfCont4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo "  + "debí haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I should have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I should have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú "  + "debiste haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you should have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you should have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él "  + "debió haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he should have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he should have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella "  + "debió haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she should have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she should have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso "  + "debió haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it should have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it should have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos "  + "debieron haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they should have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they should have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros "  + "debimos haber estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we should have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we should have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no " + "debí haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I shouldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I shouldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no " + "debiste haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you shouldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you shouldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él no " + "debió haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he shouldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he shouldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no " + "debió haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she shouldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she shouldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso no " + "debió haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it shouldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it shouldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no " + "debieron haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they shouldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they shouldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros no " + "debimos haber estado " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we shouldn't "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we shouldn't " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422

    //might Dif 4
    public void GenMightSimp4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo quiza " + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú quiza " + vn2subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él quiza " + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella quiza " + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso quiza " + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos quiza " + vn4subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros quiza " + vn5subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we might " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo " + "quiza no " + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú " + "quiza no " + vn2subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él " + "quiza no " + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella " + "quiza no " + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso " + "quiza no " + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos " + "quiza no " + vn4subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros " + "quiza no " + vn5subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we " + "might not " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422
    public void GenMightCont4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo quizá "  + "esté " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I might "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I might " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú quizá "  + "estés " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you might "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you might " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él quizá "  + "esté " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he might "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he might " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella quizá "  + "esté " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she might "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she might " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso quizá "  + "esté " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it might "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it might " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos quizá "  + "estén " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they might "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they might " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros quizá "  + "estemos " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we might "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we might " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo quizá no "  + "esté " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I might not "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I might not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "tú quizá no "  + "estés " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you might not "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you might not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "él quizá no "  + "esté " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he might not "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he might not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella quizá no "  + "esté " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she might not "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she might not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso quizá no "  + "esté " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it might not "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it might not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos quizá no "  + "estén " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they might not "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they might not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros quizá no "  + "estemos " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we might not "  + "be " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we might not " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422
    public void GenMightPerf4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo quizá "  + "haya " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I might "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I might " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú quizá "  + "hayas " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you might "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you might " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él quizá "  + "haya " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he might "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he might " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella quizá "  + "haya " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she might "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she = "she might " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso quizá "  + "haya " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it might "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it might " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos quizá "  + "hayan " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they might "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng = "they might " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros quizá  "  + "hayamos " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we might "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng = "we might " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = "yo quizá no "  + "haya " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I might not "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I might not " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú quizá no "  + "hayas " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you might not "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you might not " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él quizá no "  + "haya " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he might not "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he might not " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella quizá no "  + "haya " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she might not "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she might not " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso quizá no "  + "haya " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it might not "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it might not " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos quizá no "  + "hayan " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they might not "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they might not " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros quizá no "  + "hayamos " + vpsp[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we might not "  + "have " + vpeng[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we might not " + "have " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
        }
    } //SV 280422
    public void GenMightPerfCont4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo quizá "  + "haya estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I might have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I might have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú quizá "  + "hayas estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you might have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you might have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él quizá "  + "haya estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he might have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he might have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella quizá "  + "haya estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she might have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she might have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso quizá "  + "haya estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it might have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it might have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos quizá "  + "hayan estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they might have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they might have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros quizá "  + "hayamos estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we might have "  + "been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we might have " + "been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;

            case 1:
                ps1 = "yo quizá no "  + "haya estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I might not "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I might not " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú quizá no "  + "hayas estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you might not "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you might not " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él quizá no "  + "haya estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he might not "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he might not " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella quizá no "  + "haya estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she might not "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she might not " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso quizá no "  + "haya estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it might not "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it might not " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos quizá no "  + "hayan estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they might not "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they might not " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros quizá no "  + "hayamos estado " + vnbcs[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we might not "  + "have been " + vnbc[v] + nnobles[n]+ prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we might not " + "have been " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //SV 280422


    //DIF 4 PD

    // can y must Simp y Cont
    public void GenCanSimp4() {
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo puedo "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I can "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I can " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps1 = "yo puedo "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I can "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I can " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú puedes "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you can "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you can " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él puede "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he can "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he can " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella puede "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she can "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she can " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso puede "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it can "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it can " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos pueden "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they can "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they can " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros podemos "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we can "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng = "we can " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo " + "no puedo "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I " + "can't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I " + "can't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú " + "no puedes "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you " + "can't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you " + "can't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él " + "no puede "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he " + "can't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he " + "can't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella " + "no puede "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she " + "can't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she " + "can't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso " + "no puede "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it " + "can't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it " + "can't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos " + "no pueden "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they " + "can't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they " + "can't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros " + "no podemos "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we " + "can't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we " + "can't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    }//PD 27/04/2022
    public void GenCanCont4(){
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo puedo "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I can "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I can " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú puedes "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you can "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you can " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he can "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he can " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she can "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she can " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it can "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it can " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos pueden "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they can "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they can " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros podemos "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we can "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we can " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no puedo "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I can't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I can't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no puedes "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you can't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you can't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él no puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he can't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he can't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she can't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she can't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso no puede "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it can't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it can't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no pueden "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they can't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they can't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros no podemos "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we can't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we can't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    }//PD 27/04/2022

    public void GenMustSimp4(){
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        int radv = (int) (Math.random() * frequadv.length);
        switch (negg) {
            case 0:
                ps1 = "yo debo "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I must "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I must " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú debes "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you must "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you must " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él debe "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he must "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he must " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella debe "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she must "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she must " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso debe "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it must "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it must " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos deben "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they must "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they must " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros debemos "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we must "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we must " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo " + "no debo "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I " + "mustn't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I " + "mustn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú " + "no debes "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you " + "mustn't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you " + "mustn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él " + "no debe "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he " + "mustn't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he " + "mustn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella " + "no debe "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she " + "mustn't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she " + "mustn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso " + "no debe "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it " + "mustn't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it " + "mustn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos " + "no deben "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they " + "mustn't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they " + "mustn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros " + "no debemos "  + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we " + "mustn't "  + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we " + "mustn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
        }
    }// nuevo
    public void GenMustCont4(){
        Intrans prep = new Intrans();
        int radv = (int) (Math.random() * frequadv.length);
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (negg) {
            case 0:
                ps1 = "yo debo "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I must "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I must " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú debes "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you must "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you must " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he must "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he must " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she must "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she must " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it must "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it must " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos deben "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they must "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they must " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros debemos "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we must "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we must " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
            case 1:
                ps1 = "yo no debo "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I mustn't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps1eng2 = "I mustn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps2 = "tú no debes "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you mustn't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps2eng2 = "you mustn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3 = "él no debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he mustn't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3eng2 = "he mustn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3ella = "ella no debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she mustn't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3she2 = "she mustn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps3eso = "eso no debe "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it mustn't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps3iteng2 = "it mustn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps4 = "ellos no deben "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they mustn't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps4eng2 = "they mustn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];


                ps5 = "nosotros no debemos "  + "estar " + vnbcs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we mustn't "  + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                ps5eng2 = "we mustn't " + "be " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    }// nuevo

    //want to 4
    public void WantYouTo4() {
        int rn1 = (int) (Math.random() * 6);
        int rn2 = (int) (Math.random() * 5);
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);

        //want to subject
        String wtsj[] = {"I want ", "you want ", "he wants ", "she wants ", "it wants ", "we want ", "they want "};
        //want to subject negative
        String wtsjn[] = {"I don't want ", "you don't want ", "he doesn't want ", "she doesn't want ", "it doesn't want "
                , "we don't want ", "they don't want "};
        //want to object
        String wtobj1[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj2[] = {"me to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj3[] = {"you to " + vnb[v], "me to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj4[] = {"you to " + vnb[v], "him to " + vnb[v], "me to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj5[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "me to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj6[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "them to " + vnb[v]};
        String wtobj7[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "me to " + vnb[v]};

        //sujetos want to en sp
        String wtsjs[] = {"yo quiero ", "tú quieres ", "él quiere ", "ella quiere ", "eso quiere ", "nosotros queremos ", "ellos quieren "};
        //sujetos want to en sp negativo
        String wtsjsn[] = {"yo no quiero ", "tú no quieres ", "él no quiere ", "ella no quiere ", "eso no quiere ", "nosotros no queremos ", "ellos no quieren "};

        // objetos wt en sp
        String wtobj1s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj2s[] = {"que yo " + vn1y3subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj3s[] = {"que tú " + vn2subj[v], "que yo " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj4s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que yo " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj5s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que yo " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj6s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que ellos " + vn4subj[v]};
        String wtobj7s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que yo " + vn1y3subj[v]};

        switch (neg) {
            case 0:
                ps1 = wtsjs[0] + wtobj1s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = wtsj[0] + wtobj1[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = wtsjs[1] + wtobj2s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = wtsj[1] + wtobj2[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = wtsjs[2] + wtobj3s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = wtsj[2] + wtobj3[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = wtsjs[3] + wtobj4s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = wtsj[3] + wtobj4[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = wtsjs[4] + wtobj5s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = wtsj[4] + wtobj5[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = wtsjs[6] + wtobj6s[rn2] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = wtsj[6] + wtobj6[rn2] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = wtsjs[5] + wtobj7s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = wtsj[5] + wtobj7[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = wtsjsn[0] + wtobj1s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = wtsjn[0] + wtobj1[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = wtsjsn[1] + wtobj2s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = wtsjn[1] + wtobj2[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = wtsjsn[2] + wtobj3s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = wtsjn[2] + wtobj3[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = wtsjsn[3] + wtobj4s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = wtsjn[3] + wtobj4[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = wtsjsn[4] + wtobj5s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = wtsjn[4] + wtobj5[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = wtsjsn[6] + wtobj6s[rn2] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = wtsjn[6] + wtobj6[rn2] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = wtsjsn[5] + wtobj7s[rn1] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = wtsjn[5] + wtobj7[rn1] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
        }
    }//PD 27/04/2022

    //for to dificultad 4
    public void ForSubTo4() {
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);

        //subject in eng
        String ftsj[] = {
                "for me to ", "for you to ", "for him to ", "for her to ", "for it to ",
                "for them to ", "for us to "
        };

        //subject in spanish
        String ftsjs[] = {
                "para que yo ", "para que tú ", "para que él ", "para que ella ",
                "para que eso ", "para que ellos ", "para que nosotros "
        };

        //subject in eng negative
        String ftsjn[] = {
                "for me not to ", "for you not to ", "for him not to ", "for her not to ",
                "for it not to ", "for them not to ", "for us not to "
        };

        //subject in spanish negative
        String ftsjsn[] = {
                "para que yo no ", "para que tú no ", "para que él no ", "para que ella no ",
                "para que eso no ", "para que ellos no ", "para que nosotros no "
        };

        switch (neg) {
            case 0:
                ps1 = ftsjs[0] + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = ftsj[0] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = ftsjs[1] + vn2subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = ftsj[1] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = ftsjs[2] + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = ftsj[2] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = ftsjs[3] + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = ftsj[3] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = ftsjs[4] + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = ftsj[4] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = ftsjs[5] + vn4subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = ftsj[5] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = ftsjs[6] + vn5subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = ftsj[6] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = ftsjsn[0] + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = ftsjn[0] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = ftsjsn[1] + vn2subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = ftsjn[1] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = ftsjsn[2] + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = ftsjn[2] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = ftsjsn[3] + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = ftsjn[3] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = ftsjsn[4] + vn1y3subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = ftsjn[4] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = ftsjsn[5] + vn4subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = ftsjn[5] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = ftsjsn[6] + vn5subj[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = ftsjn[6] + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
        }
    }//PD 27/04/2022



    public void supposedtopres4() {
        int radv = (int) (Math.random() * frequadv.length);
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (vc) {
            case 0:
                ps1 = "Se supone que " + vn1[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I'm supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Se supone que " + vn2[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you are supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Se supone que él " + vn3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he is supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Se supone que ella " + vn3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she is supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Se supone que eso " + vn3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it is supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que " + vn4[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they are supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que " + vn5[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we are supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = "se supone que no " + vn1[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "se supone que no " + vn2[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you aren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "se supone que él no " + vn3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he isn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "se supone que ella no " + vn3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she isn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "se supone que eso no " + vn3[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it isn't supposed to  " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que no " + vn4[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they aren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que no " + vn5[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we aren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;

            case 2:
                ps1 = "se supone que tengo que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I'm supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "se supone que tienes que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you are supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "se supone que él tiene que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he is supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "se supone que ella tiene que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she is supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "se supone que eso tiene que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it is supposed to  " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que tienen que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they are supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que tenemos que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we are supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;

            case 3:
                ps1 = "se supone que no tengo que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I'm supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "se supone que no tienes que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you are supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "se supone que él no tiene que  " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he is supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "se supone que ella no tiene que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she is supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "se supone que eso no tiene que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it is supposed to  " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que no tienen que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they are supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que no tenemos que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we are supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;

            case 4:
                ps1 = "se supone que voy a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "se supone que vas a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you aren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "se supone que él va a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he isn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "se supone que ella va a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she isn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "se supone que eso va a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it isn't supposed to  " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que van a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they aren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que vamos a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we aren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;

            case 5:
                ps1 = "se supone no voy a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I'm not supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "se supone que no vas a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you aren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "se supone que él no va a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he isn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "se supone que ella no va a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she isn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "se supone que eso no va a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it isn't supposed to  " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que no van a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they aren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que no vamos a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we aren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;

        }
    } //PD 29/04/2022

    public void supposedtopast4() {
        int radv = (int) (Math.random() * frequadv.length);
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (neg) {
            case 0:
                ps1 = "Se supone que yo " + ps1imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I was supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Se supone que tú " + ps2imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you were supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Se supone que él " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he was supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Se supone que ella " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she was supposed to " + vnb[v]+ nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Se supone que eso " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it was supposed to " + vn3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que " + vn4imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they were supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que " + vn5imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we were supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = "se supone que no " + ps1imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wasn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "se supone que no " + ps2imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you weren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "se supone que él no " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he wasn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "se supone que ella no " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she wasn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "se supone que eso no " + ps3imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it wasn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que no " + vn4imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they weren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que no " + vn5imp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we weren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;

            case 2:
                ps1 = "Se supone que tenía que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I was supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Se supone que tenías que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you were supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Se supone que él tenía que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he was supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Se supone que ella tenía que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she was supposed to " + vnb[v]+ nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Se supone que eso tenía que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it was supposed to " + vn3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que tenían que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they were supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que teníamos que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we were supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 3:
                ps1 = "Se supone que no tenía que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wasn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Se supone que no tenías que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you weren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Se supone que él no tenía que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he wasn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Se supone que ella no tenía que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she wasn't supposed to " + vn3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Se supone que eso no tenía que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it wasn't supposed to " + vn3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que no tenían que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they weren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que no teníamos que " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we weren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;

            case 4:
                ps1 = "Se supone iba a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I was supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Se supone que ibas a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you were supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Se supone que él iba a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he was supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Se supone que ella iba a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she was supposed to " + vnb[v]+ nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Se supone que eso iba a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it was supposed to " + vn3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que iban a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they were supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que ibamos a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we were supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 5:
                ps1 = "Se supone que no iba a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wasn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Se supone que no ibas a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "you weren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Se supone que él no iba a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "he wasn't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Se supone que ella no iba a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she wasn't supposed to " + vn3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Se supone que eso no iba a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "it wasn't supposed to " + vn3[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "se supone que no iban a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "they weren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "se supone que no ibamos a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "we weren't supposed to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
        }
    } //PD 29/04/2022

    //Wish Past Simple Dif 2
    public void WishPastSimpDif4() {
        int radv = (int) (Math.random() * frequadv.length);
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (neg) {
            case 0:
                ps1 = "Ojalá yo " + ps1wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wish " + "I " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Ojalá tú " + ps2wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "I wish " + "you " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Ojalá él " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "I wish " + "he " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ojalá ella " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "I wish " + "she " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Ojalá eso " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "I wish " + "it " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ojalá ellos " + ps4wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "I wish " + "they " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Ojalá nosotros " + ps5wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "I wish " + "we " + vnbp[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = "Ojalá yo no " + ps1wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wish I didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Ojalá tú no " + ps2wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "I wish you didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Ojalá él no " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "I wish he didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ojalá ella no " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "I wish she didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Ojalá eso no " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "I wish it didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ojalá ellos no " + ps4wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "I wish they didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Ojalá nosotros no " + ps5wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "I wish we didn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;
        }
    } //PD 29/04/2022

    public void WishPastPerfDif4() {
        int radv = (int) (Math.random() * frequadv.length);
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (neg) {
            case 0:
                ps1 = "Ojalá yo hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wish I had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Ojalá tú hubieras " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "I wish you had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Ojalá él hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "I wish he had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ojalá ella hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "I wish she had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Ojalá eso hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "I wish it had " +  vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ojalá ellos hubieran " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "I wish they had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Ojalá nosotros hubieramos " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "I wish we had " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = "Ojalá yo no hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wish I hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Ojalá tú no hubieras " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "I wish you hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Ojalá él no hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "I wish he hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ojalá ella no hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "I wish she hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Ojalá eso no hubiera " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "I wish it hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ojalá ellos no hubieran " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "I wish they hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Ojalá nosotros no hubieramos " + vpsp[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "I wish we hadn't " + vpeng[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;


        }
    } //PD 29/04/2022

    public void WishWouldDif4() {
        int radv = (int) (Math.random() * frequadv.length);
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (neg) {
            case 0:
                ps1 = "Ojalá yo " + ps1wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wish I would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Ojalá tú " + ps2wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "I wish you would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Ojalá él " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "I wish he would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ojalá ella " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "I wish she would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Ojalá eso " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "I wish it would " +  vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ojalá ellos " + ps4wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "I wish they would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Ojalá nosotros " + ps5wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "I wish we would " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = "Ojalá yo no " + ps1wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I wish I wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Ojalá tú no " + ps2wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "I wish you wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Ojalá él no " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "I wish he wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ojalá ella no " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "I wish she wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Ojalá eso no " + ps3wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "I wish it wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ojalá ellos no " + ps4wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "I wish they wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Ojalá nosotros no " + ps5wish[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "I wish we wouldn't " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                break;



        }
    } //PD 29/04/2022

    // USED TO DIF 2
    public void UsedToDif4() {
        int radv = (int) (Math.random() * frequadv.length);
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (neg) {
            case 0:
                ps1 = "Yo solía " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I used to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Tú solías " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "You used to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Él solía " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "He used to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ella solía " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "She used to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Eso solía " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "It used to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ellos solían " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "They used to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Nosotros solíamos " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "We used to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
            case 1:
                ps1 = "Yo no solía " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I didn't use to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Tú no solías " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "You didn't use to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Él no solía " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "He didn't use to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ella no solía " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "she didn't use to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Eso no solía " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "It didn't use to  " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ellos no solían " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "They didn't use to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Nosotros no solíamos " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "We didn't use to " + vnb[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;

        }
    } //PD 29/04/2022

    // BE USED TO DIF 2
    public void BeUsedToDif4() {
        int radv = (int) (Math.random() * frequadv.length);
        Intrans prep = new Intrans();
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (neg) {
            case 0:
                ps1 = "Yo estoy acostumbrado a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I'm used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Tu estás acostumbrado a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "You are used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Él está acostumbrado a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "He is used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ella está acostumbrada a  " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "She is used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Eso está acostumbrado a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "It is used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ellos están acostumbrados a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "They are used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Nosotros estamos acostumbrados a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "We are used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;

            case 1:
                ps1 = "Yo no estoy acostumbrado a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps1eng = "I'm not used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps2 = "Tu no estás acostumbrado a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps2eng = "You aren't used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3 = "Él no está acostumbrado a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3eng = "He isn't used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3ella = "Ella no está acostumbrada a  " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3she = "She isn't used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps3eso = "Eso no está acostumbrado a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps3it = "It isn't used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps4 = "Ellos no están acostumbrados a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps4eng = "They aren't used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];

                ps5 = "Nosotros no estamos acostumbrados a " + vnbs[v] + nnoblesesp[n] + prep.noblesspecial[p][p2] + advfrequ[radv];
                ps5eng = "We aren't used to " + vnbc[v] + nnobles[n] + prep.noblesspecialeng[p][p2] + frequadv[radv];
                break;
        }
    } //PD 29/04/2022
    String ps6eng;

    Intrans prep = new Intrans();
    // interferencias, 0 a 100,presente simple
    public void intporsujetops0a100(){

        switch (neg) {
            case 0:
                ps1 =  vn1[v] + nnoblesesp[n] ;
                ps1eng = "I " + vnb[v] + nnobles[n];

                ps2 = vn2[v] + nnoblesesp[n];
                ps2eng = "you " + vnb[v] + nnobles[n];

                ps3 = vn3[v] + nnoblesesp[n];
                ps3eng = "he " + vnb3[v] + nnobles[n];

                ps3ella = vn3[v] + nnoblesesp[n];
                ps3she = "she " + vnb3[v] + nnobles[n];

                ps3eso = vn3[v] + nnoblesesp[n];
                ps3it = "it " + vnb3[v] + nnobles[n];

                ps4 = vn4[v] + nnoblesesp[n];
                ps4eng = "they " + vnb[v] + nnobles[n];

                ps5 =  vn5[v] + nnoblesesp[n];
                ps5eng = "we " + vnb[v] + nnobles[n];
                break;
            case 1 :
                ps1 =  "no "+ vn1[v] + nnoblesesp[n];
                ps1eng = "I " + "don't "+ vnb[v] + nnobles[n];

                ps2 = "no "+vn2[v] + nnoblesesp[n];
                ps2eng = "you " +   "don't "+ vnb[v] + nnobles[n];

                ps3 =   "no "+   vn3[v] + nnoblesesp[n];
                ps3eng = "he " +  "doesn't "+ vnb[v] + nnobles[n];

                ps3ella =   "no "+ vn3[v] + nnoblesesp[n];
                ps3she = "she " + "doesn't " + vnb[v] + nnobles[n];

                ps3eso =  "no "+ vn3[v] + nnoblesesp[n];
                ps3it = "it " + "doesn't "+ vnb[v] + nnobles[n];

                ps4 =  "no "+ vn4[v] + nnoblesesp[n];
                ps4eng = "they " + "don't " +vnb[v] + nnobles[n];

                ps5 =   "no "+  vn5[v] + nnoblesesp[n];
                ps5eng = "we " + "don't "+ vnb[v] + nnobles[n];
                break;

        }
    }  // por sujeto
    public void intporprepps0a100(){
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (neg) {
            case 0:
                ps1 = prep.noblesspecial[p][p2] + vn1[v] + nnoblesesp[n] ;
                ps1eng = "I " + vnb[v] + nnobles[n] +prep.noblesspecialeng[p][p2]  ;

                ps2 =prep.noblesspecial[p][p2] +vn2[v] + nnoblesesp[n];
                ps2eng = "you " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps3 =prep.noblesspecial[p][p2] + vn3[v] + nnoblesesp[n];
                ps3eng = "he " + vnb3[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps3ella = prep.noblesspecial[p][p2] + vn3[v] + nnoblesesp[n];
                ps3she = "she " + vnb3[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps3eso = prep.noblesspecial[p][p2] +vn3[v] + nnoblesesp[n];
                ps3it = "it " + vnb3[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps4 = prep.noblesspecial[p][p2] +vn4[v] + nnoblesesp[n];
                ps4eng = "they " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps5 =  prep.noblesspecial[p][p2] +vn5[v] + nnoblesesp[n];
                ps5eng = "we " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];
                break;
            case 1 :
                ps1 = prep.noblesspecial[p][p2] + "no "+ vn1[v] + nnoblesesp[n];
                ps1eng = "I " + "don't "+ vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps2 = prep.noblesspecial[p][p2] +"no "+vn2[v] + nnoblesesp[n];
                ps2eng = "you " +   "don't "+ vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps3 = prep.noblesspecial[p][p2] +  "no "+   vn3[v] + nnoblesesp[n];
                ps3eng = "he " +  "doesn't "+ vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps3ella =  prep.noblesspecial[p][p2] + "no "+ vn3[v] + nnoblesesp[n];
                ps3she = "she " + "doesn't " + vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps3eso = prep.noblesspecial[p][p2] + "no "+ vn3[v] + nnoblesesp[n];
                ps3it = "it " + "doesn't "+ vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps4 =prep.noblesspecial[p][p2] +  "no "+ vn4[v] + nnoblesesp[n];
                ps4eng = "they " + "don't " +vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];

                ps5 = prep.noblesspecial[p][p2] +  "no "+  vn5[v] + nnoblesesp[n];
                ps5eng = "we " + "don't "+ vnb[v] + nnobles[n]+prep.noblesspecialeng[p][p2];
                break;

        }
    }   // por prep
    public void intporobjps0a100(){
        int i= (int)(Math.random()*objyo.length);
        int y=(int)(Math.random()*objtu.length);
        int e=(int)(Math.random()*objel.length);
        int ell=(int)(Math.random()*objella.length);
        int it=(int)(Math.random()*objeso.length);
        int th=(int)(Math.random()*objellos.length);
        int us=(int)(Math.random()* objnos.length);
        switch (neg) {
            case 0:
                ps1 =  objyo[i] +   vn1[v] ;
                ps1eng = "I " + vnb[v] + obji[i];

                ps2 = objtu[y] + vn2[v] ;
                ps2eng = "you "+ vnb[v] + objyou[y];

                ps3 = "él " + objel[e] + vn3[v] ;
                ps3eng = "he " + vnb3[v] + objhe[e];

                ps3ella = "ella " +objella[ell] + vn3[v];
                ps3she = "she " + vnb3[v] + objshe[ell];

                ps3eso = "eso " + objeso[it] +vn3[v] ;
                ps3it = "it " + vnb3[v] + objit[it];

                ps4 =objellos[th] + vn4[v] ;
                ps4eng = "they " + vnb[v] + objthem[th];

                ps5 = objnos[us] + vn5[v] ;
                ps5eng = "we " + vnb[v] + objus[us];
                break;
            case 1 :
                ps1 =  "no "+ objyo[i] +   vn1[v] ;
                ps1eng = "I " +"don't "+ vnb[v] + obji[i];

                ps2 = "no "+objtu[y] + vn2[v] ;
                ps2eng = "you " +"don't "+ vnb[v] + objyou[y];

                ps3 = "él " +"no "+ objel[e] + vn3[v] ;
                ps3eng = "he " +"doesn't "+ vnb[v] + objhe[e];

                ps3ella = "ella " +"no "+objella[ell] + vn3[v];
                ps3she = "she " + "doesn't "+vnb[v] + objshe[ell];

                ps3eso = "eso " + "no "+objeso[it] +vn3[v] ;
                ps3it = "it " + "doesn't "+vnb[v] + objit[it];

                ps4 = "no "+objellos[th] + vn4[v] ;
                ps4eng = "they " + "don't "+vnb[v] + objthem[th];

                ps5 =  "no "+   objnos[us] + vn5[v] ;
                ps5eng = "we " + "don't "+vnb[v] + objus[us];
                break;

        }
    }   // por objeto
    public void intreflps0a100(){
        int control = (int)(Math.random()*2);
        int v=(int)(Math.random()*15);
        switch (control){
            case 0:
                ps1 = "me "+ vp1[v];
                ps1eng = "I "+ vpe1[v];

                ps2= "te "+ vp2[v];
                ps2eng ="you "+vpe2[v];

                ps3= "él se "+ vp3[v];
                ps3eng ="he "+vpe3[v];

                ps3ella= "ella se "+vp3[v];
                ps3she= "she "+vpe3[v];

                ps3eso= "eso se "+vp3[v];
                ps3it="it "+vpe3[v];

                ps4= "se "+vp4[v];
                ps4eng = "they "+vpe4[v];

                ps5 = "nos "+vp5[v];
                ps5eng="we "+vpe5[v];
                break;

            case 1:
                ps1 = "me "+ vg1[v];
                ps1eng = "I get "+ vgeng[v];

                ps2= "te "+ vg2[v];
                ps2eng ="you get "+vgeng[v];

                ps3= "él se "+ vg3[v];
                ps3eng ="he gets "+vgeng[v];

                ps3ella= "ella se "+vg3[v];
                ps3she= "she gets "+vgeng[v];

                ps3eso= "eso se "+vg3[v];
                ps3it="it gets "+vgeng[v];

                ps4= "se "+vg4[v];
                ps4eng = "they get "+vgeng[v];

                ps5 = "nos "+vg5[v];
                ps5eng="we get "+vgeng[v];
                break;

            case 2:
                ps1 = "yo me " + vn1[v] + " a mi mismo " ;
                ps1eng = "I " + vnb[v] + " myself ";

                ps2 = "tú te " + vn2[v] +" a ti mismo ";
                ps2eng = "you " + vnb[v] + " yourself " ;

                ps3 = "él se " + vn3[v] + " a si mismo " ;
                ps3eng = "he " + vnb3[v] + " himself ";

                ps3ella = "ella se " + vn3[v]+ " a si misma ";
                ps3she = "she " + vnb3[v] + " herself ";

                ps3eso = "eso se " + vn3[v] + " a si mismo ";
                ps3it = "it " + vnb3[v] + " itself ";

                ps4 = "ellos se " + vn4[v] + " a si mismos ";
                ps4eng = "they " + vnb[v] + " themselves ";

                ps5 = "nosotros nos " + vn5[v]+ " a nosotros mismos ";
                ps5eng = "we " + vnb[v]+ " ourselves " ;
                break;

            case 3:
                ps1 = "no me "+ vp1[v];
                ps1eng = "I don't "+ vpe1[v];

                ps2= "no te "+ vp2[v] ;
                ps2eng ="you don't "+vpe2[v];

                ps3= "él no se "+ vp3[v];
                ps3eng ="he doesn't "+vpe3[v];

                ps3ella= "ella no se "+vp3[v];
                ps3she= "she doesn't "+vpe3[v];

                ps3eso= "eso no se "+vp3[v];
                ps3it="it doesn't "+vpe3[v];

                ps4= "no se "+vp4[v];
                ps4eng = "they don't "+vpe4[v];

                ps5 = "no nos "+vp5[v];
                ps5eng="we don't "+vpe5[v];
                break;

            case 4:
                ps1 = "no me "+ vg1[v];
                ps1eng = "I get "+ vgeng[v];

                ps2= "no te "+ vg2[v];
                ps2eng ="you get "+vgeng[v];

                ps3= "él no se "+ vg3[v];
                ps3eng ="he gets "+vgeng[v];

                ps3ella= "ella no se "+vg3[v];
                ps3she= "she gets "+vgeng[v];

                ps3eso= "eso no se "+vg3[v];
                ps3it="it gets "+vgeng[v];

                ps4= "no se "+vg4[v];
                ps4eng = "they get "+vgeng[v];

                ps5 = "no nos "+vg5[v];
                ps5eng="we get "+vgeng[v];
                break;

            case 5:
                ps1 = "no me " + vn1[v] + " a mi mismo " ;
                ps1eng = "I don't " + vnb[v] + " myself ";

                ps2 = "no te " + vn2[v] +" a ti mismo ";
                ps2eng = "you don't " + vnb[v] + " yourself " ;

                ps3 = "él no se " + vn3[v] + " a si mismo " ;
                ps3eng = "he doesn't " + vnb[v] + " himself ";

                ps3ella = "ella no se " + vn3[v]+ " a si misma ";
                ps3she = "she doesn't " + vnb[v] + " herself ";

                ps3eso = "eso no se " + vn3[v] + " a si mismo ";
                ps3it = "it doesn't " + vnb[v] + " itself ";

                ps4 = "ellos no se " + vn4[v] + " a si mismos ";
                ps4eng = "they don't " + vnb[v] + " themselves ";

                ps5 = "nosotros no nos " + vn5[v]+ " a nosotros mismos ";
                ps5eng = "we don't " + vnb[v]+ " ourselves " ;
                break;
        }



    }    // por reflexivo, incluye pronominal y get , reflx normales
    public void intporpasiva0a100(){
        int p= (int)(Math.random()*prep.noblesspecial.length );
        int p2=(int)(Math.random()*prep.noblesspecial[p].length);
        switch (neg) {
            case 0:
                ps3 = "se " + vn3[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2];
                ps3eng = "he " + vnb3[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps3she = "she " + vnb3[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps3it = "it " + vnb3[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps4eng = "they " + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps1eng= "one " + vnb3[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps5eng="we " + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps6eng = nnobles[n] + "gets " + vpeng[v]+ prep.noblesspecialeng[p][p2];
                break;
            case 1 :
                ps3 = "no se " + vn3[v] + nnoblesesp[n]+ prep.noblesspecial[p][p2];
                ps3eng = "he doesn't " + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps3she = "she doesn't " + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps3it = "it doesn't " + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps4eng = "they don't " + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps1eng= "one doesn't " + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps5eng="we don't " + vnb[v] + nnobles[n]+ prep.noblesspecialeng[p][p2];
                ps6eng = nnobles[n] + "doesn't get " + vpeng[v]+ prep.noblesspecialeng[p][p2];
                break;

        }
    } // se pasiva

    //DIF 1
    //PRESENTES
    public void GenPresSimp1() {

        switch (neg) {
            case 0:
                ps1 = "yo " + vn1[v];
                ps1eng = "I " + vnb[v];

                ps2 = "tú " + vn2[v];
                ps2eng = "you " + vnb[v];

                ps3 = "él " + vn3[v];
                ps3eng = "he " + vnb3[v];

                ps3ella = "ella " + vn3[v];
                ps3she = "she " + vnb3[v];

                ps3eso = "eso " + vn3[v];
                ps3it = "it " + vnb3[v];

                ps4 = "ellos " + vn4[v];
                ps4eng = "they " + vnb[v];

                ps5 = "nosotros " + vn5[v];
                ps5eng = "we " + vnb[v];
                break;
            case 1:
                ps1 = "yo " + "no " + vn1[v];
                ps1eng = "I " + "don't " + vnb[v];

                ps2 = "tú " + "no " + vn2[v];
                ps2eng = "you " + "don't " + vnb[v];

                ps3 = "él " + "no " + vn3[v];
                ps3eng = "he " + "doesn't " + vnb[v];

                ps3ella = "ella " + "no " + vn3[v];
                ps3she = "she " + "doesn't " + vnb[v];

                ps3eso = "eso " + "no " + vn3[v];
                ps3it = "it " + "doesn't " + vnb[v];

                ps4 = "ellos " + "no " + vn4[v];
                ps4eng = "they " + "don't " + vnb[v];

                ps5 = "nosotros " + "no " + vn5[v];
                ps5eng = "we " + "don't " + vnb[v];
                break;

        }
    }//PD 10/06/2022
    public void GenPresCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "estoy " + vnbcs[v];
                ps1eng = "I " + "am " + vnbc[v];

                ps2 = "tú " + "estás " + vnbcs[v];
                ps2eng = "you " + "are " + vnbc[v];

                ps3 = "él " + "está " + vnbcs[v];
                ps3eng = "he " + "is " + vnbc[v];

                ps3ella = "ella " + "está " + vnbcs[v];
                ps3she = "she " + "is " + vnbc[v];

                ps3eso = "eso " + "está " + vnbcs[v];
                ps3it = "it " + "is " + vnbc[v];

                ps4 = "ellos " + "están " + vnbcs[v];
                ps4eng = "they " + "are " + vnbc[v];

                ps5 = "nosotros " + "estamos " + vnbcs[v];
                ps5eng = "we " + "are " + vnbc[v];
                break;

            case 1:
                ps1 = "yo " + "no " + "estoy " + vnbcs[v];
                ps1eng = "I " + "am " + "not " + vnbc[v];

                ps2 = "tú " + "no " + "estás " + vnbcs[v];
                ps2eng = "you " + "aren't " + vnbc[v];

                ps3 = "él " + "no " + "está " + vnbcs[v];
                ps3eng = "he " + "isn't " + vnbc[v];

                ps3ella = "ella " + "no " + "está " + vnbcs[v];
                ps3she = "she " + "isn't " + vnbc[v];

                ps3eso = "eso " + "no " + "está " + vnbcs[v];
                ps3it = "it " + "isn't " + vnbc[v];

                ps4 = "ellos no " + "están " + vnbcs[v];
                ps4eng = "they " + "aren't " + vnbc[v];

                ps5 = "nosotros no " + "estamos " + vnbcs[v];
                ps5eng = "we " + "aren't " + vnbc[v];
                break;
        }
    }//PD 10/06/2022
    public void GenPresPerf1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "he " + vpsp[v];
                ps1eng = "I " + "have " + vpeng[v];

                ps2 = "tú " + "has " + vpsp[v];
                ps2eng = "you " + "have " + vpeng[v];

                ps3 = "él " + "ha " + vpsp[v];
                ps3eng = "he " + "has " + vpeng[v];

                ps3ella = "ella " + "ha " + vpsp[v];
                ps3she = "she " + "has " + vpeng[v];

                ps3eso = "eso " + "ha " + vpsp[v];
                ps3it = "it " + "has " + vpeng[v];

                ps4 = "ellos " + "han " + vpsp[v];
                ps4eng = "they " + "have " + vpeng[v];

                ps5 = "nosotros " + "hemos " + vpsp[v];
                ps5eng = "we " + "have " + vpeng[v];
                break;
            case 1:
                ps1 = "yo no " + "he " + vpsp[v];
                ps1eng = "I " + "haven't " + vpeng[v];

                ps2 = "tú no " + "has " + vpsp[v];
                ps2eng = "you " + "haven't " + vpeng[v];

                ps3 = "él no " + "ha " + vpsp[v];
                ps3eng = "he " + "hasn't " + vpeng[v];

                ps3ella = "ella no " + "ha " + vpsp[v];
                ps3she = "she " + "hasn't " + vpeng[v];

                ps3eso = "eso no " + "ha " + vpsp[v];
                ps3it = "it " + "hasn't " + vpeng[v];

                ps4 = "ellos no " + "han " + vpsp[v];
                ps4eng = "they " + "haven't " + vpeng[v];

                ps5 = "nosotros no " + "hemos " + vpsp[v];
                ps5eng = "we " + "haven't " + vpeng[v];

                break;
        }
    }//PD 10/06/2022
    public void GenPresPerfCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "he estado " + vnbcs[v];
                ps1eng = "I " + "have been " + vnbc[v];

                ps2 = "tú " + "has estado " + vnbcs[v];
                ps2eng = "you " + "have been " + vnbc[v];

                ps3 = "él " + "ha estado " + vnbcs[v];
                ps3eng = "he " + "has been " + vnbc[v];

                ps3ella = "ella " + "ha estado " + vnbcs[v];
                ps3she = "she " + "has been " + vnbc[v];

                ps3eso = "eso " + "ha estado " + vnbcs[v];
                ps3it = "it " + "has been " + vnbc[v];

                ps4 = "ellos " + "han estado " + vnbcs[v];
                ps4eng = "they " + "have been " + vnbc[v];

                ps5 = "nosotros " + "hemos estado " + vnbcs[v];
                ps5eng = "we " + "have been " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "he estado " + vnbcs[v];
                ps1eng = "I " + "haven't been " + vnbc[v];

                ps2 = "tú no " + "has estado " + vnbcs[v];
                ps2eng = "you " + "haven't been " + vnbc[v];

                ps3 = "él no " + "ha estado " + vnbcs[v];
                ps3eng = "he " + "hasn't been " + vnbc[v];

                ps3ella = "ella no " + "ha estado " + vnbcs[v];
                ps3she = "she " + "hasn't been " + vnbc[v];

                ps3eso = "eso no " + "ha estado " + vnbcs[v];
                ps3it = "it " + "hasn't been " + vnbc[v];

                ps4 = "ellos no " + "han estado " + vnbcs[v];
                ps4eng = "they " + "haven't been " + vnbc[v];

                ps5 = "nosotros no " + "hemos estado " + vnbcs[v];
                ps5eng = "we " + "haven't been " + vnbc[v];

                break;
        }
    }//PD 10/06/2022

    //PASADOS
    public void GenPassSimp1() {
        int sr = (int) (Math.random() * 2);
        switch (neg) {
            case 1:
                if (sr == 0) {
                    ps1 = "yo " + ps1pre[v] ;
                    ps1eng = "I " + vnbp[v] ;

                    ps2 = "tú " + ps2pre[v] ;
                    ps2eng = "you " + vnbp[v] ;

                    ps3 = "él " + ps3p[v] ;
                    ps3eng = "he " + vnbp[v] ;

                    ps3ella = "ella " + ps3p[v] ;
                    ps3she = "she " + vnbp[v] ;

                    ps3eso = "eso " + ps3p[v] ;
                    ps3it = "it " + vnbp[v] ;

                    ps4 = "ellos " + vn4p[v] ;
                    ps4eng = "they " + vnbp[v] ;

                    ps5 = "nosotros " + vn5p[v] ;
                    ps5eng = "we " + vnbp[v] ;
                } else {
                    ps1 = "yo " + ps1imp[v] ;
                    ps1eng = "I " + vnbp[v] ;

                    ps2 = "tú " + ps2imp[v] ;
                    ps2eng = "you " + vnbp[v] ;

                    ps3 = "él " + ps3imp[v] ;
                    ps3eng = "he " + vnbp[v] ;

                    ps3ella = "ella " + ps3imp[v] ;
                    ps3she = "she " + vnbp[v] ;

                    ps3eso = "eso " + ps3imp[v] ;
                    ps3it = "it " + vnbp[v] ;

                    ps4 = "ellos " + vn4imp[v] ;
                    ps4eng = "they " + vnbp[v] ;

                    ps5 = "nosotros " + vn5imp[v] ;
                    ps5eng = "we " + vnbp[v] ;
                }
                break;

            case 0:
                if (sr == 0) {
                    ps1 = "yo " + "no " + ps1pre[v] ;
                    ps1eng = "I " + "didn't " + vnb[v] ;

                    ps2 = "tú " + "no " + ps2pre[v] ;
                    ps2eng = "you " + "didn't " + vnb[v] ;

                    ps3 = "él " + "no " + ps3p[v] ;
                    ps3eng = "he " + "didn't " + vnb[v] ;

                    ps3ella = "ella " + "no " + ps3p[v] ;
                    ps3she = "she " + "didn't " + vnb[v] ;

                    ps3eso = "eso " + "no " + ps3p[v] ;
                    ps3it = "it " + "didn't " + vnb[v] ;

                    ps4 = "ellos " + "no " + vn4p[v] ;
                    ps4eng = "they " + "didn't " + vnb[v] ;

                    ps5 = "nosotros " + "no " + vn5p[v] ;
                    ps5eng = "we " + "didn't " + vnb[v] ;
                } else {
                    ps1 = "yo " + "no " + ps1imp[v] ;
                    ps1eng = "I " + "didn't " + vnb[v] ;

                    ps2 = "tú " + "no " + ps2imp[v] ;
                    ps2eng = "you " + "didn't " + vnb[v] ;

                    ps3 = "él " + "no " + ps3imp[v] ;
                    ps3eng = "he " + "didn't " + vnb[v] ;

                    ps3ella = "ella " + "no " + ps3imp[v] ;
                    ps3she = "she " + "didn't " + vnb[v] ;

                    ps3eso = "eso " + "no " + ps3imp[v] ;
                    ps3it = "it " + "didn't " + vnb[v] ;

                    ps4 = "ellos " + "no " + vn4imp[v] ;
                    ps4eng = "they " + "didn't " + vnb[v] ;

                    ps5 = "nosotros " + "no " + vn5imp[v] ;
                    ps5eng = "we " + "didn't " + vnb[v] ;
                }
                break;

        }
    }//PD 10/06/2022
    public void GenPassCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "estaba " + vnbcs[v];
                ps1eng = "I " + "was " + vnbc[v];

                ps2 = "tú " + "estabas " + vnbcs[v];
                ps2eng = "you " + "were " + vnbc[v];

                ps3 = "él " + "estaba " + vnbcs[v];
                ps3eng = "he " + "was " + vnbc[v];

                ps3ella = "ella " + "estaba " + vnbcs[v];
                ps3she = "she " + "was " + vnbc[v];

                ps3eso = "eso " + "estaba " + vnbcs[v];
                ps3it = "it " + "was " + vnbc[v];

                ps4 = "ellos " + "estaban " + vnbcs[v];
                ps4eng = "they " + "were " + vnbc[v];

                ps5 = "nosotros " + "estabamos " + vnbcs[v];
                ps5eng = "we " + "were " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "estaba " + vnbcs[v];
                ps1eng = "I " + "wasn't " + vnbc[v];

                ps2 = "tú no " + "estabas " + vnbcs[v];
                ps2eng = "you " + "weren't " + vnbc[v];

                ps3 = "él no " + "estaba " + vnbcs[v];
                ps3eng = "he " + "wasn't " + vnbc[v];

                ps3ella = "ella no " + "estaba " + vnbcs[v];
                ps3she = "she " + "wasn't " + vnbc[v];

                ps3eso = "eso no " + "estaba " + vnbcs[v];
                ps3it = "it " + "wasn't " + vnbc[v];

                ps4 = "ellos no " + "estaban " + vnbcs[v];
                ps4eng = "they " + "weren't " + vnbc[v];

                ps5 = "nosotros no " + "estabamos " + vnbcs[v];
                ps5eng = "we " + "weren't " + vnbc[v];
                break;
        }
    }//PD 10/06/2022
    public void GenPassPerf1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "había " + vpsp[v];
                ps1eng = "I " + "had " + vpeng[v];

                ps2 = "tú " + "habías " + vpsp[v];
                ps2eng = "you " + "had " + vpeng[v];

                ps3 = "él " + "había " + vpsp[v];
                ps3eng = "he " + "had " + vpeng[v];

                ps3ella = "ella " + "había " + vpsp[v];
                ps3she = "she " + "had " + vpeng[v];

                ps3eso = "eso " + "había " + vpsp[v];
                ps3it = "it " + "had " + vpeng[v];

                ps4 = "ellos " + "habían " + vpsp[v];
                ps4eng = "they " + "had " + vpeng[v];

                ps5 = "nosotros " + "habíamos " + vpsp[v];
                ps5eng = "we " + "had " + vpeng[v];
                break;
            case 1:
                ps1 = "yo no " + "había " + vpsp[v];
                ps1eng = "I " + "hadn't " + vpeng[v];

                ps2 = "tú no " + "habías " + vpsp[v];
                ps2eng = "you " + "hadn't " + vpeng[v];

                ps3 = "él no " + "había " + vpsp[v];
                ps3eng = "he " + "hadn't " + vpeng[v];

                ps3ella = "ella no " + "había " + vpsp[v];
                ps3she = "she " + "hadn't " + vpeng[v];

                ps3eso = "eso no " + "había " + vpsp[v];
                ps3it = "it " + "hadn't " + vpeng[v];

                ps4 = "ellos no " + "habían " + vpsp[v];
                ps4eng = "they " + "hadn't " + vpeng[v];

                ps5 = "nosotros no " + "habíamos " + vpsp[v];
                ps5eng = "we " + "hadn't " + vpeng[v];

                break;
        }
    }//PD 10/06/2022
    public void GenPassPerfCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "había estado " + vnbcs[v];
                ps1eng = "I " + "had been " + vnbc[v];

                ps2 = "tú " + "había estado " + vnbcs[v];
                ps2eng = "you " + "had been " + vnbc[v];

                ps3 = "él " + "había estado " + vnbcs[v];
                ps3eng = "he " + "had been " + vnbc[v];

                ps3ella = "ella " + "había estado " + vnbcs[v];
                ps3she = "she " + "had been " + vnbc[v];

                ps3eso = "eso " + "había estado " + vnbcs[v];
                ps3it = "it " + "had been " + vnbc[v];

                ps4 = "ellos " + "habían estado " + vnbcs[v];
                ps4eng = "they " + "had been " + vnbc[v];

                ps5 = "nosotros " + "habíamos estado " + vnbcs[v];
                ps5eng = "we " + "had been " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "había estado " + vnbcs[v];
                ps1eng = "I " + "hadn't been " + vnbc[v];

                ps2 = "tú no " + "había estado " + vnbcs[v];
                ps2eng = "you " + "hadn't been " + vnbc[v];

                ps3 = "él no " + "había estado " + vnbcs[v];
                ps3eng = "he " + "hadn't been " + vnbc[v];

                ps3ella = "ella no " + "había estado " + vnbcs[v];
                ps3she = "she " + "hadn't been " + vnbc[v];

                ps3eso = "eso no " + "había estado " + vnbcs[v];
                ps3it = "it " + "hadn't been " + vnbc[v];

                ps4 = "ellos no " + "habían estado " + vnbcs[v];
                ps4eng = "they " + "hadn't been " + vnbc[v];

                ps5 = "nosotros no " + "habíamos estado " + vnbcs[v];
                ps5eng = "we " + "hadn't been " + vnbc[v];
                break;
        }
    }//PD 10/06/2022

    //FUTUROS
    public void GenFutSimp1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + vn1f[v];
                ps1eng = "I " + "will " + vnb[v];

                ps2 = "tú " + vn2f[v];
                ps2eng = "you " + "will " + vnb[v];

                ps3 = "él " + vn3f[v];
                ps3eng = "he " + "will " + vnb[v];

                ps3ella = "ella " + vn3f[v];
                ps3she = "she " + "will " + vnb[v];

                ps3eso = "eso " + vn3f[v];
                ps3it = "it " + "will " + vnb[v];

                ps4 = "ellos " + vn4f[v];
                ps4eng = "they " + "will " + vnb[v];

                ps5 = "nosotros " + vn5f[v];
                ps5eng = "we " + "will " + vnb[v];
                break;
            case 1:
                ps1 = "yo no " + vn1f[v];
                ps1eng = "I " + "won't " + vnb[v];

                ps2 = "tú no " + vn2f[v];
                ps2eng = "you " + "won't " + vnb[v];

                ps3 = "él no " + vn3f[v];
                ps3eng = "he " + "won't " + vnb[v];

                ps3ella = "ella no " + vn3f[v];
                ps3she = "she " + "won't " + vnb[v];

                ps3eso = "eso no " + vn3f[v];
                ps3it = "it " + "won't " + vnb[v];

                ps4 = "ellos no " + vn4f[v];
                ps4eng = "they " + "won't " + vnb[v];

                ps5 = "nosotros no " + vn5f[v];
                ps5eng = "we " + "won't " + vnb[v];
                break;
        }
    }//PD 10/06/2022
    public void GenFutCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "estaré " + vnbcs[v];
                ps1eng = "I " + "will " + "be " + vnbc[v];

                ps2 = "tú " + "estabas " + vnbcs[v];
                ps2eng = "you " + "will " + "be " + vnbc[v];

                ps3 = "él " + "estará " + vnbcs[v];
                ps3eng = "he " + "will be " + vnbc[v];

                ps3ella = "ella estará " + vnbcs[v];
                ps3she = "she " + "will be " + vnbc[v];

                ps3eso = "eso estará " + vnbcs[v];
                ps3it = "it " + "will be " + vnbc[v];

                ps4 = "ellos estarán " + vnbcs[v];
                ps4eng = "they " + "will be " + vnbc[v];

                ps5 = "nosotros estarémos " + vnbcs[v];
                ps5eng = "we " + "will be " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "estaré " + vnbcs[v];
                ps1eng = "I " + "won't " + "be " + vnbc[v];

                ps2 = "tú no " + "estarás " + vnbcs[v];
                ps2eng = "you " + "won't " + "be " + vnbc[v];

                ps3 = "él no " + "estará " + vnbcs[v];
                ps3eng = "he " + "won't be " + vnbc[v];

                ps3ella = "ella no estará " + vnbcs[v];
                ps3she = "she " + "won't be " + vnbc[v];

                ps3eso = "eso no estará " + vnbcs[v];
                ps3it = "it " + "won't be " + vnbc[v];

                ps4 = "ellos no estarán " + vnbcs[v];
                ps4eng = "they " + "won't be " + vnbc[v];

                ps5 = "nosotros no estarémos " + vnbcs[v];
                ps5eng = "we " + "won't be " + vnbc[v];
                break;
        }
    }//PD 10/06/2022
    public void GenFutPerf1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "habré " + vpsp[v];
                ps1eng = "I " + "will have " + vpeng[v];

                ps2 = "tú " + "habrás " + vpsp[v];
                ps2eng = "you " + "will have " + vpeng[v];

                ps3 = "él " + "habrá " + vpsp[v];
                ps3eng = "he " + "will have " + vpeng[v];

                ps3ella = "ella habrá " + vpsp[v];
                ps3she = "she " + "will have " + vpeng[v];

                ps3eso = "eso habrá " + vpsp[v];
                ps3it = "it " + "will have " + vpeng[v];

                ps4 = "ellos habrán " + vpsp[v];
                ps4eng = "they " + "will have " + vpeng[v];

                ps5 = "nosotros habrémos " + vpsp[v];
                ps5eng = "we " + "will have " + vpeng[v];
                break;
            case 1:
                ps1 = "yo no " + "habré " + vpsp[v];
                ps1eng = "I " + "won't have " + vpeng[v];

                ps2 = "tú no " + "habrás " + vpsp[v];
                ps2eng = "you " + "won't have " + vpeng[v];

                ps3 = "él no " + "habrá " + vpsp[v];
                ps3eng = "he " + "won't have " + vpeng[v];

                ps3ella = "ella no habrá " + vpsp[v];
                ps3she = "she " + "won't have " + vpeng[v];

                ps3eso = "eso no habrá " + vpsp[v];
                ps3it = "it " + "won't have " + vpeng[v];

                ps4 = "ellos no habrán " + vpsp[v];
                ps4eng = "they " + "won't have " + vpeng[v];

                ps5 = "nosotros no habrémos " + vpsp[v];
                ps5eng = "we " + "won't have " + vpeng[v];

                break;
        }
    }//PD 10/06/2022
    public void GenFutPerfCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "habré estado " + vnbcs[v];
                ps1eng = "I " + "will have been " + vnbc[v];

                ps2 = "tú " + "habrás estado " + vnbcs[v];
                ps2eng = "you " + "will have been " + vnbc[v];

                ps3 = "él " + "habrá estado " + vnbcs[v];
                ps3eng = "he " + "will have been " + vnbc[v];

                ps3ella = "ella habrá estado " + vnbcs[v];
                ps3she = "she " + "will have been " + vnbc[v];

                ps3eso = "eso habrá estado " + vnbcs[v];
                ps3it = "it " + "will have been " + vnbc[v];

                ps4 = "ellos habrán estado " + vnbcs[v];
                ps4eng = "they " + "will have been " + vnbc[v];

                ps5 = "nosotros habrémos estado " + vnbcs[v];
                ps5eng = "we " + "will have been " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "habré estado " + vnbcs[v];
                ps1eng = "I " + "won't have been " + vnbc[v];

                ps2 = "tú no " + "habrás estado " + vnbcs[v];
                ps2eng = "you " + "won't have been " + vnbc[v];

                ps3 = "él no " + "habrá estado " + vnbcs[v];
                ps3eng = "he " + "won't have been " + vnbc[v];

                ps3ella = "ella no habrá estado " + vnbcs[v];
                ps3she = "she " + "won't have been " + vnbc[v];

                ps3eso = "eso no habrá estado " + vnbcs[v];
                ps3it = "it " + "won't have been " + vnbc[v];

                ps4 = "ellos no habrán estado " + vnbcs[v];
                ps4eng = "they " + "won't have been " + vnbc[v];

                ps5 = "nosotros no habrémos estado " + vnbcs[v];
                ps5eng = "we " + "won't have been " + vnbc[v];
                break;
        }
    }//PD 10/06/2022

    //WOULD
    public void GenWouldSimp1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + vn1w[v];
                ps1eng = "I " + "would " + vnb[v];

                ps2 = "tú " + vn2w[v];
                ps2eng = "you " + "would " + vnb[v];

                ps3 = "él " + vn3w[v];
                ps3eng = "he " + "would " + vnb[v];

                ps3ella = "ella " + vn3w[v];
                ps3she = "she " + "would " + vnb[v];

                ps3eso = "eso " + vn3w[v];
                ps3it = "it " + "would " + vnb[v];

                ps4 = "ellos " + vn4w[v];
                ps4eng = "they " + "would " + vnb[v];

                ps5 = "nosotros " + vn5w[v];
                ps5eng = "we " + "would " + vnb[v];
                break;
            case 1:
                ps1 = "yo no " + vn1w[v];
                ps1eng = "I " + "wouldn't " + vnb[v];

                ps2 = "tú no " + vn2w[v];
                ps2eng = "you " + "wouldn't " + vnb[v];

                ps3 = "él no " + vn3w[v];
                ps3eng = "he " + "wouldn't " + vnb[v];

                ps3ella = "ella no " + vn3w[v];
                ps3she = "she " + "wouldn't " + vnb[v];

                ps3eso = "eso no " + vn3w[v];
                ps3it = "it " + "wouldn't " + vnb[v];

                ps4 = "ellos no " + vn4w[v];
                ps4eng = "they " + "wouldn't " + vnb[v];

                ps5 = "nosotros no " + vn5w[v];
                ps5eng = "we " + "wouldn't " + vnb[v];
                break;
        }
    }//PD 13/06/2022
    public void GenWouldCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "estaría " + vnbcs[v];
                ps1eng = "I " + "would " + "be " + vnbc[v];

                ps2 = "tú " + "estarías " + vnbcs[v];
                ps2eng = "you " + "would " + "be " + vnbc[v];

                ps3 = "él " + "estaría " + vnbcs[v];
                ps3eng = "he " + "would be " + vnbc[v];

                ps3ella = "ella estaría " + vnbcs[v];
                ps3she = "she " + "would be " + vnbc[v];

                ps3eso = "eso estaría " + vnbcs[v];
                ps3it = "it " + "would be " + vnbc[v];

                ps4 = "ellos estarían " + vnbcs[v];
                ps4eng = "they " + "would be " + vnbc[v];

                ps5 = "nosotros estaríamos " + vnbcs[v];
                ps5eng = "we " + "would be " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "estaría " + vnbcs[v];
                ps1eng = "I " + "wouldn't " + "be " + vnbc[v];

                ps2 = "tú no " + "estarías " + vnbcs[v];
                ps2eng = "you " + "wouldn't " + "be " + vnbc[v];

                ps3 = "él no " + "estaría " + vnbcs[v];
                ps3eng = "he " + "wouldn't be " + vnbc[v];

                ps3ella = "ella no estaría " + vnbcs[v];
                ps3she = "she " + "wouldn't be " + vnbc[v];

                ps3eso = "eso no estaría " + vnbcs[v];
                ps3it = "it " + "wouldn't be " + vnbc[v];

                ps4 = "ellos no estarían " + vnbcs[v];
                ps4eng = "they " + "wouldn't be " + vnbc[v];

                ps5 = "nosotros no estaríamos " + vnbcs[v];
                ps5eng = "we " + "wouldn't be " + vnbc[v];
                break;
        }
    }//PD 13/06/2022
    public void GenWouldPerf1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "hubiera " + vpsp[v];
                ps1eng = "I " + "would have " + vpeng[v];

                ps2 = "tú " + "hubieras " + vpsp[v];
                ps2eng = "you " + "would have " + vpeng[v];

                ps3 = "él " + "hubiera " + vpsp[v];
                ps3eng = "he " + "would have " + vpeng[v];

                ps3ella = "ella hubiera " + vpsp[v];
                ps3she = "she " + "would have " + vpeng[v];

                ps3eso = "eso hubiera " + vpsp[v];
                ps3it = "it " + "would have " + vpeng[v];

                ps4 = "ellos hubieran " + vpsp[v];
                ps4eng = "they " + "would have " + vpeng[v];

                ps5 = "nosotros hubieramos " + vpsp[v];
                ps5eng = "we " + "would have " + vpeng[v];
                break;
            case 1:
                ps1 = "yo no " + "hubiera " + vpsp[v];
                ps1eng = "I " + "wouldn't have " + vpeng[v];

                ps2 = "tú no " + "hubieras " + vpsp[v];
                ps2eng = "you " + "wouldn't have " + vpeng[v];

                ps3 = "él no " + "hubiera " + vpsp[v];
                ps3eng = "he " + "wouldn't have " + vpeng[v];

                ps3ella = "ella no hubiera " + vpsp[v];
                ps3she = "she " + "wouldn't have " + vpeng[v];

                ps3eso = "eso no hubiera " + vpsp[v];
                ps3it = "it " + "wouldn't have " + vpeng[v];

                ps4 = "ellos no hubieran " + vpsp[v];
                ps4eng = "they " + "wouldn't have " + vpeng[v];

                ps5 = "nosotros no hubieramos " + vpsp[v];
                ps5eng = "we " + "wouldn't have " + vpeng[v];
                break;
        }
    }//PD 13/06/2022
    public void GenWouldPerfCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "hubiera estado " + vnbcs[v];
                ps1eng = "I " + "would have been " + vnbc[v];

                ps2 = "tú " + "hubieras estado " + vnbcs[v];
                ps2eng = "you " + "would have been " + vnbc[v];

                ps3 = "él " + "hubiera estado " + vnbcs[v];
                ps3eng = "he " + "would have been " + vnbc[v];

                ps3ella = "ella hubiera estado " + vnbcs[v];
                ps3she = "she " + "would have been " + vnbc[v];

                ps3eso = "eso hubiera estado " + vnbcs[v];
                ps3it = "it " + "would have been " + vnbc[v];

                ps4 = "ellos hubieran estado " + vnbcs[v];
                ps4eng = "they " + "would have been " + vnbc[v];

                ps5 = "nosotros hubieramos estado " + vnbcs[v];
                ps5eng = "we " + "would have been " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "hubiera estado " + vnbcs[v];
                ps1eng = "I " + "wouldn't have been " + vnbc[v];

                ps2 = "tú no " + "hubieras estado " + vnbcs[v];
                ps2eng = "you " + "wouldn't have been " + vnbc[v];

                ps3 = "él no " + "hubiera estado " + vnbcs[v];
                ps3eng = "he " + "wouldn't have been " + vnbc[v];

                ps3ella = "ella no hubiera estado " + vnbcs[v];
                ps3she = "she " + "wouldn't have been " + vnbc[v];

                ps3eso = "eso no hubiera estado " + vnbcs[v];
                ps3it = "it " + "wouldn't have been " + vnbc[v];

                ps4 = "ellos no hubieran estado " + vnbcs[v];
                ps4eng = "they " + "wouldn't have been " + vnbc[v];

                ps5 = "nosotros no hubieramos estado " + vnbcs[v];
                ps5eng = "we " + "wouldn't have been " + vnbc[v];
                break;
        }
    }//PD 13/06/2022

    //COULD
    public void GenCouldSimp1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "podría " + vnbs[v];
                ps1eng = "I " + "could " + vnb[v];

                ps2 = "tú " + "podrías " + vnbs[v];
                ps2eng = "you " + "could " + vnb[v];

                ps3 = "él " + "podría " + vnbs[v];
                ps3eng = "he " + "could " + vnb[v];

                ps3ella = "ella " + "podría " + vnbs[v];
                ps3she = "she " + "could " + vnb[v];

                ps3eso = "eso " + "podría " + vnbs[v];
                ps3it = "it " + "could " + vnb[v];

                ps4 = "ellos " + "podrían " + vnbs[v];
                ps4eng = "they " + "could " + vnb[v];

                ps5 = "nosotros " + "podríamos " + vnbs[v];
                ps5eng = "we " + "could " + vnb[v];
                break;
            case 1:
                ps1 = "yo no " + "podría " + vnbs[v];
                ps1eng = "I " + "couldn't " + vnb[v];

                ps2 = "tú no " + "podrías " + vnbs[v];
                ps2eng = "you " + "couldn't " + vnb[v];

                ps3 = "él no " + "podría " + vnbs[v];
                ps3eng = "he " + "couldn't " + vnb[v];

                ps3ella = "ella no " + "podría " + vnbs[v];
                ps3she = "she " + "couldn't " + vnb[v];

                ps3eso = "eso no " + "podría " + vnbs[v];
                ps3it = "it " + "couldn't " + vnb[v];

                ps4 = "ellos no " + "podrían " + vnbs[v];
                ps4eng = "they " + "couldn't " + vnb[v];

                ps5 = "nosotros no " + "podríamos " + vnbs[v];
                ps5eng = "we " + "couldn't " + vnb[v];
                break;
        }
    }//PD 13/06/2022
    public void GenCouldCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "podría estar " + vnbcs[v];
                ps1eng = "I " + "could " + "be " + vnbc[v];

                ps2 = "tú " + "podrías estar " + vnbcs[v];
                ps2eng = "you " + "could " + "be " + vnbc[v];

                ps3 = "él " + "podría estar " + vnbcs[v];
                ps3eng = "he " + "could be " + vnbc[v];

                ps3ella = "ella podría estar " + vnbcs[v];
                ps3she = "she " + "could be " + vnbc[v];

                ps3eso = "eso podría estar " + vnbcs[v];
                ps3it = "it " + "could be " + vnbc[v];

                ps4 = "ellos podrían estar " + vnbcs[v];
                ps4eng = "they " + "could be " + vnbc[v];

                ps5 = "nosotros podríamos estar " + vnbcs[v];
                ps5eng = "we " + "could be " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "podría estar " + vnbcs[v];
                ps1eng = "I " + "couldn't " + "be " + vnbc[v];

                ps2 = "tú no " + "podrías estar " + vnbcs[v];
                ps2eng = "you " + "couldn't " + "be " + vnbc[v];

                ps3 = "él no " + "podría estar " + vnbcs[v];
                ps3eng = "he " + "couldn't be " + vnbc[v];

                ps3ella = "ella no podría estar " + vnbcs[v];
                ps3she = "she " + "couldn't be " + vnbc[v];

                ps3eso = "eso no podría estar " + vnbcs[v];
                ps3it = "it " + "couldn't be " + vnbc[v];

                ps4 = "ellos no podrían estar " + vnbcs[v];
                ps4eng = "they " + "couldn't be " + vnbc[v];

                ps5 = "nosotros no podríamos estar " + vnbcs[v];
                ps5eng = "we " + "couldn't be " + vnbc[v];
                break;
        }
    }//PD 13/06/2022
    public void GenCouldPerf1() {
        switch (neg) {

            case 0:
                ps1 = "yo " + "pude haber " + vpsp[v];
                ps1eng = "I " + "could have " + vpeng[v];

                ps2 = "tú " + "pudiste haber " + vpsp[v];
                ps2eng = "you " + "could have " + vpeng[v];

                ps3 = "él " + "pudo haber " + vpsp[v];
                ps3eng = "he " + "could have " + vpeng[v];

                ps3ella = "ella pudo haber " + vpsp[v];
                ps3she = "she " + "could have " + vpeng[v];

                ps3eso = "eso pudo haber " + vpsp[v];
                ps3it = "it " + "could have " + vpeng[v];

                ps4 = "ellos pudieron haber " + vpsp[v];
                ps4eng = "they " + "could have " + vpeng[v];

                ps5 = "nosotros pudimos haber " + vpsp[v];
                ps5eng = "we " + "could have " + vpeng[v];
                break;
            case 1:
                ps1 = "yo no " + "pude haber " + vpsp[v];
                ps1eng = "I " + "couldn't have " + vpeng[v];

                ps2 = "tú no " + "pudiste haber " + vpsp[v];
                ps2eng = "you " + "couldn't have " + vpeng[v];

                ps3 = "él no " + "pudo haber " + vpsp[v];
                ps3eng = "he " + "couldn't have " + vpeng[v];

                ps3ella = "ella no pudo haber " + vpsp[v];
                ps3she = "she " + "couldn't have " + vpeng[v];

                ps3eso = "eso no pudo haber " + vpsp[v];
                ps3it = "it " + "couldn't have " + vpeng[v];

                ps4 = "ellos no pudieron haber " + vpsp[v];
                ps4eng = "they " + "couldn't have " + vpeng[v];

                ps5 = "nosotros no pudimos haber " + vpsp[v];
                ps5eng = "we " + "couldn't have " + vpeng[v];

                break;
        }
    }//PD 13/06/2022
    public void GenCouldPerfCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "pude haber estado " + vnbcs[v];
                ps1eng = "I " + "could have been " + vnbc[v];

                ps2 = "tú " + "pudiste haber estado " + vnbcs[v];
                ps2eng = "you " + "could have been " + vnbc[v];

                ps3 = "él " + "pudo haber estado " + vnbcs[v];
                ps3eng = "he " + "could have been " + vnbc[v];

                ps3ella = "ella pudo haber estado " + vnbcs[v];
                ps3she = "she " + "could have been " + vnbc[v];

                ps3eso = "eso pudo haber estado " + vnbcs[v];
                ps3it = "it " + "could have been " + vnbc[v];

                ps4 = "ellos pudieron haber estado " + vnbcs[v];
                ps4eng = "they " + "could have been " + vnbc[v];

                ps5 = "nosotros " + "pudimos haber estado " + vnbcs[v];
                ps5eng = "we " + "could have been " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "pude haber estado " + vnbcs[v];
                ps1eng = "I " + "couldn't have been " + vnbc[v];

                ps2 = "tú no " + "pudiste haber estado " + vnbcs[v];
                ps2eng = "you " + "couldn't have been " + vnbc[v];

                ps3 = "él no " + "pudo haber estado " + vnbcs[v];
                ps3eng = "he " + "couldn't have been " + vnbc[v];

                ps3ella = "ella no pudo haber estado " + vnbcs[v];
                ps3she = "she " + "couldn't have been " + vnbc[v];

                ps3eso = "eso no pudo haber estado " + vnbcs[v];
                ps3it = "it " + "couldn't have been " + vnbc[v];

                ps4 = "ellos no pudieron haber estado " + vnbcs[v];
                ps4eng = "they " + "couldn't have been " + vnbc[v];

                ps5 = "nosotros no " + "pudimos haber estado " + vnbcs[v];
                ps5eng = "we " + "couldn't have been " + vnbc[v];
                break;
        }
    }//PD 13/06/2022

    //SHOULD
    public void GenShouldSimp1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "debería " + vnbs[v];
                ps1eng = "I " + "should " + vnb[v];

                ps2 = "tú " + "deberías " + vnbs[v];
                ps2eng = "you " + "should " + vnb[v];

                ps3 = "él " + "debería " + vnbs[v];
                ps3eng = "he " + "should " + vnb[v];

                ps3ella = "ella " + "debería " + vnbs[v];
                ps3she = "she " + "should " + vnb[v];

                ps3eso = "eso " + "debería " + vnbs[v];
                ps3it = "it " + "should " + vnb[v];

                ps4 = "ellos " + "deberían " + vnbs[v];
                ps4eng = "they " + "should " + vnb[v];

                ps5 = "nosotros " + "deberíamos " + vnbs[v];
                ps5eng = "we " + "should " + vnb[v];
                break;
            case 1:
                ps1 = "yo no " + "debería " + vnbs[v];
                ps1eng = "I " + "shouldn't " + vnb[v];

                ps2 = "tú no " + "deberías " + vnbs[v];
                ps2eng = "you " + "shouldn't " + vnb[v];

                ps3 = "él no " + "debería " + vnbs[v];
                ps3eng = "he " + "shouldn't " + vnb[v];

                ps3ella = "ella no " + "debería " + vnbs[v];
                ps3she = "she " + "shouldn't " + vnb[v];

                ps3eso = "eso no " + "debería " + vnbs[v];
                ps3it = "it " + "shouldn't " + vnb[v];

                ps4 = "ellos no " + "deberían " + vnbs[v];
                ps4eng = "they " + "shouldn't " + vnb[v];

                ps5 = "nosotros no " + "deberíamos " + vnbs[v];
                ps5eng = "we " + "shouldn't " + vnb[v];
                break;
        }
    }//PD 13/06/2022
    public void GenShouldCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "debería estar " + vnbcs[v];
                ps1eng = "I " + "should " + "be " + vnbc[v];

                ps2 = "tú " + "deberías estar " + vnbcs[v];
                ps2eng = "you " + "should " + "be " + vnbc[v];

                ps3 = "él " + "debería estar " + vnbcs[v];
                ps3eng = "he " + "should be " + vnbc[v];

                ps3ella = "ella debería estar " + vnbcs[v];
                ps3she = "she " + "should be " + vnbc[v];

                ps3eso = "eso debería estar " + vnbcs[v];
                ps3it = "it " + "should be " + vnbc[v];

                ps4 = "ellos deberían estar " + vnbcs[v];
                ps4eng = "they " + "should be " + vnbc[v];

                ps5 = "nosotros deberíamos estar " + vnbcs[v];
                ps5eng = "we " + "should be " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "debería estar " + vnbcs[v];
                ps1eng = "I " + "shouldn't " + "be " + vnbc[v];

                ps2 = "tú no " + "deberías estar " + vnbcs[v];
                ps2eng = "you " + "shouldn't " + "be " + vnbc[v];

                ps3 = "él no " + "debería estar " + vnbcs[v];
                ps3eng = "he " + "shouldn't be " + vnbc[v];

                ps3ella = "ella no debería estar " + vnbcs[v];
                ps3she = "she " + "shouldn't be " + vnbc[v];

                ps3eso = "eso no debería estar " + vnbcs[v];
                ps3it = "it " + "shouldn't be " + vnbc[v];

                ps4 = "ellos no deberían estar " + vnbcs[v];
                ps4eng = "they " + "shouldn't be " + vnbc[v];

                ps5 = "nosotros no deberíamos estar " + vnbcs[v];
                ps5eng = "we " + "shouldn't be " + vnbc[v];
                break;
        }
    }//PD 13/06/2022
    public void GenShouldPerf1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "debí haber " + vpsp[v];
                ps1eng = "I " + "should have " + vpeng[v];

                ps2 = "tú " + "debíste haber " + vpsp[v];
                ps2eng = "you " + "should have " + vpeng[v];

                ps3 = "él " + "debío haber " + vpsp[v];
                ps3eng = "he " + "should have " + vpeng[v];

                ps3ella = "ella debío haber " + vpsp[v];
                ps3she = "she " + "should have " + vpeng[v];

                ps3eso = "eso " + "debío haber " + vpsp[v];
                ps3it = "it " + "should have " + vpeng[v];

                ps4 = "ellos debíeron haber " + vpsp[v];
                ps4eng = "they " + "should have " + vpeng[v];

                ps5 = "nosotros debímos haber " + vpsp[v];
                ps5eng = "we " + "should have " + vpeng[v];
                break;
            case 1:
                ps1 = "yo no " + "debí haber " + vpsp[v];
                ps1eng = "I " + "shouldn't have " + vpeng[v];

                ps2 = "tú no " + "debíste haber " + vpsp[v];
                ps2eng = "you " + "shouldn't have " + vpeng[v];

                ps3 = "él no " + "debío haber " + vpsp[v];
                ps3eng = "he " + "shouldn't have " + vpeng[v];

                ps3ella = "ella no debío haber " + vpsp[v];
                ps3she = "she " + "shouldn't have " + vpeng[v];

                ps3eso = "eso no " + "debío haber " + vpsp[v];
                ps3it = "it " + "shouldn't have " + vpeng[v];

                ps4 = "ellos no debíeron haber " + vpsp[v];
                ps4eng = "they " + "shouldn't have " + vpeng[v];

                ps5 = "nosotros no debímos haber " + vpsp[v];
                ps5eng = "we " + "shouldn't have " + vpeng[v];
                break;
        }
    }//PD 13/06/2022
    public void GenShouldPerfCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "debí haber estado " + vnbcs[v];
                ps1eng = "I " + "should have been " + vnbc[v];

                ps2 = "tú " + "debiste haber estado " + vnbcs[v];
                ps2eng = "you " + "should have been " + vnbc[v];

                ps3 = "él " + "debió haber estado " + vnbcs[v];
                ps3eng = "he " + "should have been " + vnbc[v];

                ps3ella = "ella debió haber estado " + vnbcs[v];
                ps3she = "she " + "should have been " + vnbc[v];

                ps3eso = "eso debió haber estado " + vnbcs[v];
                ps3it = "it " + "should have been " + vnbc[v];

                ps4 = "ellos debieron haber estado " + vnbcs[v];
                ps4eng = "they " + "should have been " + vnbc[v];

                ps5 = "nosotros " + "debimos haber estado " + vnbcs[v];
                ps5eng = "we " + "should have been " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "debí haber estado " + vnbcs[v];
                ps1eng = "I " + "shouldn't have been " + vnbc[v];

                ps2 = "tú no " + "debiste haber estado " + vnbcs[v];
                ps2eng = "you " + "shouldn't have been " + vnbc[v];

                ps3 = "él no " + "debió haber estado " + vnbcs[v];
                ps3eng = "he " + "shouldn't have been " + vnbc[v];

                ps3ella = "ella no debió haber estado " + vnbcs[v];
                ps3she = "she " + "shouldn't have been " + vnbc[v];

                ps3eso = "eso no debió haber estado " + vnbcs[v];
                ps3it = "it " + "shouldn't have been " + vnbc[v];

                ps4 = "ellos no debieron haber estado " + vnbcs[v];
                ps4eng = "they " + "shouldn't have been " + vnbc[v];

                ps5 = "nosotros no " + "debimos haber estado " + vnbcs[v];
                ps5eng = "we " + "shouldn't have been " + vnbc[v];
                break;
        }
    }//PD 13/06/2022

    //MIGHT
    public void GenMightSimp1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "quizá " + vn1y3subj[v];
                ps1eng = "I " + "might " + vnb[v];

                ps2 = "tú " + "quizá " + vn2subj[v];
                ps2eng = "you " + "might " + vnb[v];

                ps3 = "él " + "quizá " + vn1y3subj[v];
                ps3eng = "he " + "might " + vnb[v];

                ps3ella = "ella " + "quizá " + vn1y3subj[v];
                ps3she = "she " + "might " + vnb[v];

                ps3eso = "eso " + "quizá " + vn1y3subj[v];
                ps3it = "it " + "might " + vnb[v];

                ps4 = "ellos " + "quizá " + vn4subj[v];
                ps4eng = "they " + "might " + vnb[v];

                ps5 = "nosotros " + "quizá " + vn5subj[v];
                ps5eng = "we " + "might " + vnb[v];
                break;
            case 1:
                ps1 = "yo " + "quizá no " + vn1y3subj[v];
                ps1eng = "I " + "might not " + vnb[v];

                ps2 = "tú " + "quizá no " + vn2subj[v];
                ps2eng = "you " + "might not " + vnb[v];

                ps3 = "él " + "quizá no " + vn1y3subj[v];
                ps3eng = "he " + "might not " + vnb[v];

                ps3ella = "ella " + "quizá no " + vn1y3subj[v];
                ps3she = "she " + "might not " + vnb[v];

                ps3eso = "eso " + "quizá no " + vn1y3subj[v];
                ps3it = "it " + "might not " + vnb[v];

                ps4 = "ellos " + "quizá no " + vn4subj[v];
                ps4eng = "they " + "might not " + vnb[v];

                ps5 = "nosotros " + "quizá no " + vn5subj[v];
                ps5eng = "we " + "might not " + vnb[v];
                break;
        }
    }//PD 13/06/2022
    public void GenMightCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "quizá esté " + vnbcs[v];
                ps1eng = "I " + "might " + "be " + vnbc[v];

                ps2 = "tú " + "quizá estés " + vnbcs[v];
                ps2eng = "you " + "might " + "be " + vnbc[v];

                ps3 = "él " + "quizá esté " + vnbcs[v];
                ps3eng = "he " + "might be " + vnbc[v];

                ps3ella = "ella quizá esté " + vnbcs[v];
                ps3she = "she " + "might be " + vnbc[v];

                ps3eso = "eso quizá esté " + vnbcs[v];
                ps3it = "it " + "might be " + vnbc[v];

                ps4 = "ellos quizá estén " + vnbcs[v];
                ps4eng = "they " + "might be " + vnbc[v];

                ps5 = "nosotros quizá estemos " + vnbcs[v];
                ps5eng = "we " + "might be " + vnbc[v];
                break;
            case 1:
                ps1 = "yo " + "quizá no esté " + vnbcs[v];
                ps1eng = "I " + "might not " + "be " + vnbc[v];

                ps2 = "tú " + "quizá no estés " + vnbcs[v];
                ps2eng = "you " + "might not " + "be " + vnbc[v];

                ps3 = "él " + "quizá no esté " + vnbcs[v];
                ps3eng = "he " + "might not be " + vnbc[v];

                ps3ella = "ella quizá no esté " + vnbcs[v];
                ps3she = "she " + "might not be " + vnbc[v];

                ps3eso = "eso quizá no esté " + vnbcs[v];
                ps3it = "it " + "might not be " + vnbc[v];

                ps4 = "ellos quizá no estén " + vnbcs[v];
                ps4eng = "they " + "might not be " + vnbc[v];

                ps5 = "nosotros quizá no estemos " + vnbcs[v];
                ps5eng = "we " + "might not be " + vnbc[v];
                break;
        }
    }//PD 13/06/2022
    public void GenMightPerf1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "quizá haya " + vpsp[v];
                ps1eng = "I " + "might have " + vpeng[v];

                ps2 = "tú " + "quizá hayas " + vpsp[v];
                ps2eng = "you " + "might have " + vpeng[v];

                ps3 = "él " + "quizá haya " + vpsp[v];
                ps3eng = "he " + "might have " + vpeng[v];

                ps3ella = "ella quizá haya " + vpsp[v];
                ps3she = "she " + "might have " + vpeng[v];

                ps3eso = "eso " + "quizá haya " + vpsp[v];
                ps3it = "it " + "might have " + vpeng[v];

                ps4 = "ellos quizá hayan " + vpsp[v];
                ps4eng = "they " + "might have " + vpeng[v];

                ps5 = "nosotros quizá hayamos " + vpsp[v];
                ps5eng = "we " + "might have " + vpeng[v];
                break;
            case 1:
                ps1 = "yo " + "quizá no haya " + vpsp[v];
                ps1eng = "I " + "might not have " + vpeng[v];

                ps2 = "tú " + "quizá no hayas " + vpsp[v];
                ps2eng = "you " + "might not have " + vpeng[v];

                ps3 = "él " + "quizá no haya " + vpsp[v];
                ps3eng = "he " + "might not have " + vpeng[v];

                ps3ella = "ella quizá no haya " + vpsp[v];
                ps3she = "she " + "might not have " + vpeng[v];

                ps3eso = "eso " + "quizá no haya " + vpsp[v];
                ps3it = "it " + "might not have " + vpeng[v];

                ps4 = "ellos quizá no hayan " + vpsp[v];
                ps4eng = "they " + "might not have " + vpeng[v];

                ps5 = "nosotros quizá no hayamos " + vpsp[v];
                ps5eng = "we " + "might not have " + vpeng[v];
                break;
        }
    }//PD 13/06/2022
    public void GenMightPerfCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "quizá haya estado " + vnbcs[v];
                ps1eng = "I " + "might have been " + vnbc[v];

                ps2 = "tú " + "quizá hayas estado " + vnbcs[v];
                ps2eng = "you " + "might have been " + vnbc[v];

                ps3 = "él " + "quizá haya estado " + vnbcs[v];
                ps3eng = "he " + "might have been " + vnbc[v];

                ps3ella = "ella quizá haya estado " + vnbcs[v];
                ps3she = "she " + "might have been " + vnbc[v];

                ps3eso = "eso quizá haya estado " + vnbcs[v];
                ps3it = "it " + "might have been " + vnbc[v];

                ps4 = "ellos quizá hayan estado " + vnbcs[v];
                ps4eng = "they " + "might have been " + vnbc[v];

                ps5 = "nosotros " + "quizá hayamos estado " + vnbcs[v];
                ps5eng = "we " + "might have been " + vnbc[v];
                break;
            case 1:
                ps1 = "yo " + "quizá no haya estado " + vnbcs[v];
                ps1eng = "I " + "might not have been " + vnbc[v];

                ps2 = "tú " + "quizá no hayas estado " + vnbcs[v];
                ps2eng = "you " + "might not have been " + vnbc[v];

                ps3 = "él " + "quizá no haya estado " + vnbcs[v];
                ps3eng = "he " + "might not have been " + vnbc[v];

                ps3ella = "ella quizá no haya estado " + vnbcs[v];
                ps3she = "she " + "might not have been " + vnbc[v];

                ps3eso = "eso quizá no haya estado " + vnbcs[v];
                ps3it = "it " + "might not have been " + vnbc[v];

                ps4 = "ellos quizá no hayan estado " + vnbcs[v];
                ps4eng = "they " + "might not have been " + vnbc[v];

                ps5 = "nosotros " + "quizá no hayamos estado " + vnbcs[v];
                ps5eng = "we " + "might not have been " + vnbc[v];
                break;
        }
    }//PD 13/06/2022

    //CAN
    public void GenCanSimp1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "puedo " + vnbs[v];
                ps1eng = "I " + "can " + vnb[v];

                ps2 = "tú " + "puedes " + vnbs[v];
                ps2eng = "you " + "can " + vnb[v];

                ps3 = "él " + "puede " + vnbs[v];
                ps3eng = "he " + "can " + vnb[v];

                ps3ella = "ella " + "puede " + vnbs[v];
                ps3she = "she " + "can " + vnb[v];

                ps3eso = "eso " + "puede " + vnbs[v];
                ps3it = "it " + "can " + vnb[v];

                ps4 = "ellos " + "pueden " + vnbs[v];
                ps4eng = "they " + "can " + vnb[v];

                ps5 = "nosotros " + "podemos " + vnbs[v];
                ps5eng = "we " + "can " + vnb[v];
                break;
            case 1:
                ps1 = "yo no " + "puedo " + vnbs[v];
                ps1eng = "I " + "can't " + vnb[v];

                ps2 = "tú no " + "puedes " + vnbs[v];
                ps2eng = "you " + "can't " + vnb[v];

                ps3 = "él no " + "puede " + vnbs[v];
                ps3eng = "he " + "can't " + vnb[v];

                ps3ella = "ella no " + "puede " + vnbs[v];
                ps3she = "she " + "can't " + vnb[v];

                ps3eso = "eso no " + "puede " + vnbs[v];
                ps3it = "it " + "can't " + vnb[v];

                ps4 = "ellos no " + "pueden " + vnbs[v];
                ps4eng = "they " + "can't " + vnb[v];

                ps5 = "nosotros no " + "podemos " + vnbs[v];
                ps5eng = "we " + "can't  " + vnb[v];
                break;
        }
    }//PD 13/06/2022
    public void GenCanCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "puedo estar " + vnbcs[v];
                ps1eng = "I " + "can " + "be " + vnbc[v];

                ps2 = "tú " + "puedes estar " + vnbcs[v];
                ps2eng = "you " + "can " + "be " + vnbc[v];

                ps3 = "él " + "puede estar " + vnbcs[v];
                ps3eng = "he " + "can be " + vnbc[v];

                ps3ella = "ella puede estar " + vnbcs[v];
                ps3she = "she " + "can be " + vnbc[v];

                ps3eso = "eso puede estar " + vnbcs[v];
                ps3it = "it " + "can be " + vnbc[v];

                ps4 = "ellos pueden estar " + vnbcs[v];
                ps4eng = "they " + "can be " + vnbc[v];

                ps5 = "nosotros podemos estar " + vnbcs[v];
                ps5eng = "we " + "can be " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "puedo estar " + vnbcs[v];
                ps1eng = "I " + "can't " + "be " + vnbc[v];

                ps2 = "tú " + "no puedes estar " + vnbcs[v];
                ps2eng = "you " + "can't " + "be " + vnbc[v];

                ps3 = "él " + "no puede estar " + vnbcs[v];
                ps3eng = "he " + "can't be " + vnbc[v];

                ps3ella = "ella no puede estar " + vnbcs[v];
                ps3she = "she " + "can't be " + vnbc[v];

                ps3eso = "eso no puede estar " + vnbcs[v];
                ps3it = "it " + "can't be " + vnbc[v];

                ps4 = "ellos no pueden estar " + vnbcs[v];
                ps4eng = "they " + "can't be " + vnbc[v];

                ps5 = "nosotros no podemos estar " + vnbcs[v];
                ps5eng = "we " + "can't be " + vnbc[v];
                break;
        }
    }//PD 13/06/2022

    //MUST
    public void GenMustSimp1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "debo " + vnbs[v];
                ps1eng = "I " + "must " + vnb[v];

                ps2 = "tú " + "debes " + vnbs[v];
                ps2eng = "you " + "must " + vnb[v];

                ps3 = "él " + "debe " + vnbs[v];
                ps3eng = "he " + "must " + vnb[v];

                ps3ella = "ella " + "debe " + vnbs[v];
                ps3she = "she " + "must " + vnb[v];

                ps3eso = "eso " + "debe " + vnbs[v];
                ps3it = "it " + "must " + vnb[v];

                ps4 = "ellos " + "deben " + vnbs[v];
                ps4eng = "they " + "must " + vnb[v];

                ps5 = "nosotros " + "debemos " + vnbs[v];
                ps5eng = "we " + "must " + vnb[v];
                break;
            case 1:
                ps1 = "yo no " + "debo " + vnbs[v];
                ps1eng = "I " + "mustn't " + vnb[v];

                ps2 = "tú no " + "debes " + vnbs[v];
                ps2eng = "you " + "mustn't " + vnb[v];

                ps3 = "él no " + "debe " + vnbs[v];
                ps3eng = "he " + "mustn't " + vnb[v];

                ps3ella = "ella no " + "debe " + vnbs[v];
                ps3she = "she " + "mustn't " + vnb[v];

                ps3eso = "eso no " + "debe " + vnbs[v];
                ps3it = "it " + "mustn't " + vnb[v];

                ps4 = "ellos no " + "deben " + vnbs[v];
                ps4eng = "they " + "mustn't " + vnb[v];

                ps5 = "nosotros no " + "debemos " + vnbs[v];
                ps5eng = "we " + "mustn't " + vnb[v];

                break;
        }
    }//nuevo
    public void GenMustCont1() {
        switch (neg) {
            case 0:
                ps1 = "yo " + "debo estar " + vnbcs[v];
                ps1eng = "I " + "must " + "be " + vnbc[v];

                ps2 = "tú " + "debes estar " + vnbcs[v];
                ps2eng = "you " + "must " + "be " + vnbc[v];

                ps3 = "él " + "debe estar " + vnbcs[v];
                ps3eng = "he " + "must be " + vnbc[v];

                ps3ella = "ella debe estar " + vnbcs[v];
                ps3she = "she " + "must be " + vnbc[v];

                ps3eso = "eso debe estar " + vnbcs[v];
                ps3it = "it " + "must be " + vnbc[v];

                ps4 = "ellos deben estar " + vnbcs[v];
                ps4eng = "they " + "must be " + vnbc[v];

                ps5 = "nosotros debemos estar " + vnbcs[v];
                ps5eng = "we " + "must be " + vnbc[v];
                break;
            case 1:
                ps1 = "yo no " + "debo estar " + vnbcs[v];
                ps1eng = "I " + "mustn't " + "be " + vnbc[v];

                ps2 = "tú no " + "debes estar " + vnbcs[v];
                ps2eng = "you " + "mustn't " + "be " + vnbc[v];

                ps3 = "él no " + "debe estar " + vnbcs[v];
                ps3eng = "he " + "mustn't be " + vnbc[v];

                ps3ella = "ella no debe estar " + vnbcs[v];
                ps3she = "she " + "mustn't be " + vnbc[v];

                ps3eso = "eso no debe estar " + vnbcs[v];
                ps3it = "it " + "mustn't be " + vnbc[v];

                ps4 = "ellos no deben estar " + vnbcs[v];
                ps4eng = "they " + "mustn't be " + vnbc[v];

                ps5 = "nosotros no debemos estar " + vnbcs[v];
                ps5eng = "we " + "mustn't be " + vnbc[v];

                break;
        }
    }//nuevo


    // non basics
    // want to dificultad 1
    public void WantYouTo1() {
        int rn1 = (int) (Math.random() * 6);
        int rn2 = (int) (Math.random() * 5);
        int neg = (int) (Math.random() * 2);

        //want to subject
        String wtsj[] = {"I want ", "you want ", "he wants ", "she wants ", "it wants ", "we want ", "they want "};
        //want to subject negative
        String wtsjn[] = {"I don't want ", "you don't want ", "he doesn't want ", "she doesn't want ", "it doesn't want "
                , "we don't want ", "they don't want "};
        //want to object
        String wtobj1[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj2[] = {"me to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj3[] = {"you to " + vnb[v], "me to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj4[] = {"you to " + vnb[v], "him to " + vnb[v], "me to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj5[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "me to " + vnb[v], "us to " + vnb[v], "them to " + vnb[v]};
        String wtobj6[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "them to " + vnb[v]};
        String wtobj7[] = {"you to " + vnb[v], "him to " + vnb[v], "her to " + vnb[v], "it to " + vnb[v], "us to " + vnb[v], "me to " + vnb[v]};

        //sujetos want to en sp
        String wtsjs[] = {"yo quiero ", "tú quieres ", "él quiere ", "ella quiere ", "eso quiere ", "nosotros queremos ", "ellos quieren "};
        //sujetos want to en sp negativo
        String wtsjsn[] = {"yo no quiero ", "tú no quieres ", "él no quiere ", "ella no quiere ", "eso no quiere ", "nosotros no queremos ", "ellos no quieren "};

        // objetos wt en sp
        String wtobj1s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj2s[] = {"que yo " + vn1y3subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj3s[] = {"que tú " + vn2subj[v], "que yo " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj4s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que yo " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj5s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que yo " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que ellos " + vn4subj[v]};
        String wtobj6s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que ellos " + vn4subj[v]};
        String wtobj7s[] = {"que tú " + vn2subj[v], "que él " + vn1y3subj[v], "que ella " + vn1y3subj[v], "que eso " + vn1y3subj[v], "que nosotros " + vn5subj[v], "que yo " + vn1y3subj[v]};

        switch (neg) {
            case 0:
                ps1eng = wtsj[0] + wtobj1[rn1];
                ps1 = wtsjs[0] + wtobj1s[rn1];

                ps2eng = wtsj[1] + wtobj2[rn1];
                ps2 = wtsjs[1] + wtobj2s[rn1];

                ps3eng = wtsj[2] + wtobj3[rn1];
                ps3 = wtsjs[2] + wtobj3s[rn1];

                ps3she = wtsj[3] + wtobj4[rn1];
                ps3ella = wtsjs[3] + wtobj4s[rn1];

                ps3it = wtsj[4] + wtobj5[rn1];
                ps3eso = wtsjs[4] + wtobj5s[rn1];

                ps4eng = wtsj[6] + wtobj6[rn2];
                ps4 = wtsjs[6] + wtobj6s[rn2];

                ps5eng = wtsj[5] + wtobj7[rn1];
                ps5 = wtsjs[5] + wtobj7s[rn1];
                break;
            case 1:
                ps1eng = wtsjn[0] + wtobj1[rn1];
                ps1 = wtsjsn[0] + wtobj1s[rn1];

                ps2eng = wtsjn[1] + wtobj2[rn1];
                ps2 = wtsjsn[1] + wtobj2s[rn1];

                ps3eng = wtsjn[2] + wtobj3[rn1];
                ps3 = wtsjsn[2] + wtobj3s[rn1];

                ps3she = wtsjn[3] + wtobj4[rn1];
                ps3ella = wtsjsn[3] + wtobj4s[rn1];

                ps3it = wtsjn[4] + wtobj5[rn1];
                ps3eso = wtsjsn[4] + wtobj5s[rn1];

                ps4eng = wtsjn[6] + wtobj6[rn2];
                ps4 = wtsjsn[6] + wtobj6s[rn2];

                ps5eng = wtsjn[5] + wtobj7[rn1];
                ps5 = wtsjsn[5] + wtobj7s[rn1];
                break;
        }

    }//PD 14/06/2022
    //for me to dificultad 1
    public void ForSubTo1() {
        int neg = (int) (Math.random() * 2);

        //subject in eng
        String ftsj[] = {
                "for me to ", "for you to ", "for him to ", "for her to ", "for it to ",
                "for them to ", "for us to "
        };

        //subject in spanish
        String ftsjs[] = {
                "para que yo ", "para que tú ", "para que él ", "para que ella ",
                "para que eso ", "para que ellos ", "para que nosotros "
        };

        //subject in eng negative
        String ftsjn[] = {
                "for me not to ", "for you not to ", "for him not to ", "for her not to ",
                "for it not to ", "for them not to ", "for us not to "
        };

        //subject in spanish negative
        String ftsjsn[] = {
                "para que yo no ", "para que tú no ", "para que él no ", "para que ella no ",
                "para que eso no ", "para que ellos no ", "para que nosotros no "
        };

        switch (neg) {
            case 0:
                ps1eng = ftsj[0] + vnb[v];
                ps1 = ftsjs[0] + vn1y3subj[v];

                ps2eng = ftsj[1] + vnb[v];
                ps2 = ftsjs[1] + vn2subj[v];

                ps3eng = ftsj[2] + vnb[v];
                ps3 = ftsjs[2] + vn1y3subj[v];

                ps3she = ftsj[3] + vnb[v];
                ps3ella = ftsjs[3] + vn1y3subj[v];

                ps3it = ftsj[4] + vnb[v];
                ps3eso = ftsjs[4] + vn1y3subj[v];

                ps4eng = ftsj[5] + vnb[v];
                ps4 = ftsjs[5] + vn4subj[v];

                ps5eng = ftsj[6] + vnb[v];
                ps5 = ftsjs[6] + vn5subj[v];
                break;
            case 1:
                ps1eng = ftsjn[0] + vnb[v];
                ps1 = ftsjsn[0] + vn1y3subj[v];

                ps2eng = ftsjn[1] + vnb[v];
                ps2 = ftsjsn[1] + vn2subj[v];

                ps3eng = ftsjn[2] + vnb[v];
                ps3 = ftsjsn[2] + vn1y3subj[v];

                ps3she = ftsjn[3] + vnb[v];
                ps3ella = ftsjsn[3] + vn1y3subj[v];

                ps3it = ftsjn[4] + vnb[v];
                ps3eso = ftsjsn[4] + vn1y3subj[v];

                ps4eng = ftsjn[5] + vnb[v];
                ps4 = ftsjsn[5] + vn4subj[v];

                ps5eng = ftsjn[6] + vnb[v];
                ps5 = ftsjsn[6] + vn5subj[v];
                break;
        }
    }//PD 14/06/2022


    //SUPOSSED TO
    public void SupposedToPres1() {
        int vc = (int) (Math.random() * 6);
        switch (vc) {
            case 0:
                ps1 = "Se supone que " + vn1[v];
                ps1eng = "I'm supposed to " + vnb[v];

                ps2 = "Se supone que " + vn2[v];
                ps2eng = "you are supposed to " + vnb[v];

                ps3 = "Se supone que él " + vnbs[v];
                ps3eng = "he is supposed to " + vnb[v];

                ps3ella = "Se supone que ella " + vnbs[v];
                ps3she = "she is supposed to " + vnb[v];

                ps3eso = "Se supone que eso " + vnbs[v];
                ps3it = "it is supposed to " + vnb[v];

                ps4 = "se supone que " + vn4[v];
                ps4eng = "they are supposed to " + vnb[v];

                ps5 = "se supone que " + vn5[v];
                ps5eng = "we are supposed to " + vnb[v];
                break;
            case 1:
                ps1 = "se supone que no " + vn1[v];
                ps1eng = "I'm not supposed to " + vnb[v];

                ps2 = "se supone que no " + vn2[v];
                ps2eng = "you aren't supposed to " + vnb[v];

                ps3 = "se supone que él no " + vnbs[v];
                ps3eng = "he isn't supposed to " + vnb[v];

                ps3ella = "se supone que ella no " + vnbs[v];
                ps3she = "she isn't supposed to " + vnb[v];

                ps3eso = "se supone que eso no " + vnbs[v];
                ps3it = "it isn't supposed to  " + vnb[v];

                ps4 = "se supone que no " + vn4[v];
                ps4eng = "they aren't supposed to " + vnb[v];

                ps5 = "se supone que no " + vn5[v];
                ps5eng = "we aren't supposed to " + vnb[v];
                break;

            case 2:
                ps1 = "se supone que tengo que " + vnbs[v];
                ps1eng = "I'm supposed to " + vnb[v];

                ps2 = "se supone que tienes que " + vnbs[v];
                ps2eng = "you are supposed to " + vnb[v];

                ps3 = "se supone que él tiene que " + vnbs[v];
                ps3eng = "he is supposed to " + vnb[v];

                ps3ella = "se supone que ella tiene que " + vnbs[v];
                ps3she = "she is supposed to " + vnb[v];

                ps3eso = "se supone que eso tiene que " + vnbs[v];
                ps3it = "it is supposed to  " + vnb[v];

                ps4 = "se supone que tienen que " + vnbs[v];
                ps4eng = "they are supposed to " + vnb[v];

                ps5 = "se supone que tenemos que " + vnbs[v];
                ps5eng = "we are supposed to " + vnb[v];
                break;

            case 3:
                ps1 = "se supone que no tengo que " + vnbs[v];
                ps1eng = "I'm not supposed to " + vnb[v];

                ps2 = "se supone que no tienes que " + vnbs[v];
                ps2eng = "you aren't supposed to " + vnb[v];

                ps3 = "se supone que él no tiene que  " + vnbs[v];
                ps3eng = "he isn't supposed to " + vnb[v];

                ps3ella = "se supone que ella no tiene que " + vnbs[v];
                ps3she = "she isn't supposed to " + vnb[v];

                ps3eso = "se supone que eso no tiene que " + vnbs[v];
                ps3it = "it isn't supposed to  " + vnb[v];

                ps4 = "se supone que no tienen que " + vnbs[v];
                ps4eng = "they aren't supposed to " + vnb[v];

                ps5 = "se supone que no tenemos que " + vnbs[v];
                ps5eng = "we aren't supposed to " + vnb[v];
                break;

            case 4:
                ps1 = "se supone que voy a " + vnbs[v];
                ps1eng = "I'm supposed to " + vnb[v];

                ps2 = "se supone que vas a " + vnbs[v];
                ps2eng = "you are supposed to " + vnb[v];

                ps3 = "se supone que él va a " + vnbs[v];
                ps3eng = "he is supposed to " + vnb[v];

                ps3ella = "se supone que ella va a " + vnbs[v];
                ps3she = "she is supposed to " + vnb[v];

                ps3eso = "se supone que eso va a " + vnbs[v];
                ps3it = "it is supposed to " + vnb[v];

                ps4 = "se supone que van a " + vnbs[v];
                ps4eng = "they are supposed to " + vnb[v];

                ps5 = "se supone que vamos a " + vnbs[v];
                ps5eng = "we are supposed to " + vnb[v];

                break;

            case 5:
                ps1 = "se supone no voy a " + vnbs[v];
                ps1eng = "I'm not supposed to " + vnb[v];

                ps2 = "se supone que no vas a " + vnbs[v];
                ps2eng = "you aren't supposed to " + vnb[v];

                ps3 = "se supone que él no va a " + vnbs[v];
                ps3eng = "he isn't supposed to " + vnb[v];

                ps3ella = "se supone que ella no va a " + vnbs[v];
                ps3she = "she isn't supposed to " + vnb[v];

                ps3eso = "se supone que eso no va a " + vnbs[v];
                ps3it = "it isn't supposed to  " + vnb[v];

                ps4 = "se supone que no van a " + vnbs[v];
                ps4eng = "they aren't supposed to " + vnb[v];

                ps5 = "se supone que no vamos a " + vnbs[v];
                ps5eng = "we aren't supposed to " + vnb[v];
                break;

        }
    }//PD 15/06/2022
    public void SupposedToPast1() {
        int neg = (int) (Math.random() * 2);

        switch (neg) {
            case 0:
                ps1 = "Se supone que yo " + ps1imp[v];
                ps1eng = "I was supposed to " + vnb[v];

                ps2 = "Se supone que tú " + ps2imp[v];
                ps2eng = "you were supposed to " + vnb[v];

                ps3 = "Se supone que él " + ps3imp[v];
                ps3eng = "he was supposed to " + vnb[v];

                ps3ella = "Se supone que ella " + ps3imp[v];
                ps3she = "she was supposed to " + vnb[v];

                ps3eso = "Se supone que eso " + ps3imp[v];
                ps3it = "it was supposed to " + vn3[v];

                ps4 = "se supone que " + vn4imp[v];
                ps4eng = "they were supposed to " + vnb[v];

                ps5 = "se supone que " + vn5imp[v];
                ps5eng = "we were supposed to " + vnb[v];
                break;
            case 1:
                ps1 = "se supone que no " + ps1imp[v];
                ps1eng = "I wasn't supposed to " + vnb[v];

                ps2 = "se supone que no " + ps2imp[v];
                ps2eng = "you weren't supposed to " + vnb[v];

                ps3 = "se supone que él no " + ps3imp[v];
                ps3eng = "he wasn't supposed to " + vnb[v];

                ps3ella = "se supone que ella no " + ps3imp[v];
                ps3she = "she wasn't supposed to " + vnb[v];

                ps3eso = "se supone que eso no " + ps3imp[v];
                ps3it = "it wasn't supposed to " + vnb[v];

                ps4 = "se supone que no " + vn4imp[v];
                ps4eng = "they weren't supposed to " + vnb[v];

                ps5 = "se supone que no " + vn5imp[v];
                ps5eng = "we weren't supposed to " + vnb[v];
                break;

            case 2:
                ps1 = "Se supone que tenía que " + vnbs[v];
                ps1eng = "I was supposed to " + vnb[v];

                ps2 = "Se supone que tenías que " + vnbs[v];
                ps2eng = "you were supposed to " + vnb[v];

                ps3 = "Se supone que él tenía que " + vnbs[v];
                ps3eng = "he was supposed to " + vnb[v];

                ps3ella = "Se supone que ella tenía que " + vnbs[v];
                ps3she = "she was supposed to " + vnb[v];

                ps3eso = "Se supone que eso tenía que " + vnbs[v];
                ps3it = "it was supposed to " + vn3[v];

                ps4 = "se supone que tenían que " + vnbs[v];
                ps4eng = "they were supposed to " + vnb[v];

                ps5 = "se supone que teníamos que " + vnbs[v];
                ps5eng = "we were supposed to " + vnb[v];
                break;
            case 3:
                ps1 = "Se supone que no tenía que " + vnbs[v];
                ps1eng = "I wasn't supposed to " + vnb[v];

                ps2 = "Se supone que no tenías que " + vnbs[v];
                ps2eng = "you weren't supposed to " + vnb[v];

                ps3 = "Se supone que él no tenía que " + vnbs[v];
                ps3eng = "he wasn't supposed to " + vnb3[v];

                ps3ella = "Se supone que ella no tenía que " + vnbs[v];
                ps3she = "she wasn't supposed to " + vn3[v];

                ps3eso = "Se supone que eso no tenía que " + vnbs[v];
                ps3it = "it wasn't supposed to " + vn3[v];

                ps4 = "se supone que no tenían que " + vnbs[v];
                ps4eng = "they weren't supposed to " + vnb[v];

                ps5 = "se supone que no teníamos que " + vnbs[v];
                ps5eng = "we weren't supposed to " + vnb[v];
                break;

            case 4:
                ps1 = "Se supone iba a " + vnbs[v];
                ps1eng = "I was supposed to " + vnb[v];

                ps2 = "Se supone que ibas a " + vnbs[v];
                ps2eng = "you were supposed to " + vnb[v];

                ps3 = "Se supone que él iba a " + vnbs[v];
                ps3eng = "he was supposed to " + vnb[v];

                ps3ella = "Se supone que ella iba a " + vnbs[v];
                ps3she = "she was supposed to " + vnb[v];

                ps3eso = "Se supone que eso iba a " + vnbs[v];
                ps3it = "it was supposed to " + vnb[v];

                ps4 = "se supone que iban a " + vnbs[v];
                ps4eng = "they were supposed to " + vnb[v];

                ps5 = "se supone que ibamos a " + vnbs[v];
                ps5eng = "we were supposed to " + vnb[v];
                break;
            case 5:
                ps1 = "Se supone que no iba a " + vnbs[v];
                ps1eng = "I wasn't supposed to " + vnb[v];

                ps2 = "Se supone que no ibas a " + vnbs[v];
                ps2eng = "you weren't supposed to " + vnb[v];

                ps3 = "Se supone que él no iba a " + vnbs[v];
                ps3eng = "he wasn't supposed to " + vnb3[v];

                ps3ella = "Se supone que ella no iba a " + vnbs[v];
                ps3she = "she wasn't supposed to " + vn3[v];

                ps3eso = "Se supone que eso no iba a " + vnbs[v];
                ps3it = "it wasn't supposed to " + vn3[v];

                ps4 = "se supone que no iban a " + vnbs[v];
                ps4eng = "they weren't supposed to " + vnb[v];

                ps5 = "se supone que no ibamos a " + vnbs[v];
                ps5eng = "we weren't supposed to " + vnb[v];
                break;
        }
    }//PD 15/06/2022

    //Wish Past Simple
    public void WishPastSimp1() {
        int neg = (int) (Math.random() * 2);
        switch (neg) {
            case 0:
                ps1 = "Ojalá yo " + ps1wish[v];
                ps1eng = "I wish " + "I " + vnbp[v];

                ps2 = "Ojalá tú " + ps2wish[v];
                ps2eng = "I wish " + "you " + vnbp[v];

                ps3 = "Ojalá él " + ps3wish[v];
                ps3eng = "I wish " + "he " + vnbp[v];

                ps3ella = "Ojalá ella " + ps3wish[v];
                ps3she = "I wish " + "she " + vnbp[v];

                ps3eso = "Ojalá eso " + ps3wish[v];
                ps3it = "I wish " + "it " + vnbp[v];

                ps4 = "Ojalá ellos " + ps4wish[v];
                ps4eng = "I wish " + "they " + vnbp[v];

                ps5 = "Ojalá nosotros " + ps5wish[v];
                ps5eng = "I wish " + "we " + vnbp[v];
                break;
            case 1:
                ps1 = "Ojalá yo no " + ps1wish[v];
                ps1eng = "I wish I didn't " + vnb[v];

                ps2 = "Ojalá tú no " + ps2wish[v];
                ps2eng = "I wish you didn't " + vnb[v];

                ps3 = "Ojalá él no " + ps3wish[v];
                ps3eng = "I wish he didn't " + vnb[v];

                ps3ella = "Ojalá ella no " + ps3wish[v];
                ps3she = "I wish she didn't " + vnb[v];

                ps3eso = "Ojalá eso no " + ps3wish[v];
                ps3it = "I wish it didn't " + vnb[v];

                ps4 = "Ojalá ellos no " + ps4wish[v];
                ps4eng = "I wish they didn't " + vnb[v];

                ps5 = "Ojalá nosotros no " + ps5wish[v];
                ps5eng = "I wish we didn't " + vnb[v];

                break;
        }
    }//PD 15/06/2022
    public void WishPastPerf1() {
        int neg = (int) (Math.random() * 2);
        switch (neg) {
            case 0:
                ps1 = "Ojalá yo hubiera " + vpsp[v];
                ps1eng = "I wish I had " + vpeng[v];

                ps2 = "Ojalá tú hubieras " + vpsp[v];
                ps2eng = "I wish you had " + vpeng[v];

                ps3 = "Ojalá él hubiera " + vpsp[v];
                ps3eng = "I wish he had " + vpeng[v];

                ps3ella = "Ojalá ella hubiera " + vpsp[v];
                ps3she = "I wish she had " + vpeng[v];

                ps3eso = "Ojalá eso hubiera " + vpsp[v];
                ps3it = "I wish it had " +  vpeng[v];

                ps4 = "Ojalá ellos hubieran " + vpsp[v];
                ps4eng = "I wish they had " + vpeng[v];

                ps5 = "Ojalá nosotros hubieramos " + vpsp[v];
                ps5eng = "I wish we had " + vpeng[v];
                break;
            case 1:
                ps1 = "Ojalá yo no hubiera " + vpsp[v];
                ps1eng = "I wish I hadn't " + vpeng[v];

                ps2 = "Ojalá tú no hubieras " + vpsp[v];
                ps2eng = "I wish you hadn't " + vpeng[v];

                ps3 = "Ojalá él no hubiera " + vpsp[v];
                ps3eng = "I wish he hadn't " + vpeng[v];

                ps3ella = "Ojalá ella no hubiera " + vpsp[v];
                ps3she = "I wish she hadn't " + vpeng[v];

                ps3eso = "Ojalá eso no hubiera " + vpsp[v];
                ps3it = "I wish it hadn't " + vpeng[v];

                ps4 = "Ojalá ellos no hubieran " + vpsp[v];
                ps4eng = "I wish they hadn't " + vpeng[v];

                ps5 = "Ojalá nosotros no hubieramos " + vpsp[v];
                ps5eng = "I wish we hadn't " + vpeng[v];

                break;


        }
    }//PD 15/06/2022
    public void WishWould1() {
        int neg = (int) (Math.random() * 2);
        switch (neg) {
            case 0:
                ps1 = "Ojalá yo " + ps1wish[v];
                ps1eng = "I wish I would " + vnb[v];

                ps2 = "Ojalá tú " + ps2wish[v];
                ps2eng = "I wish you would " + vnb[v];

                ps3 = "Ojalá él " + ps3wish[v];
                ps3eng = "I wish he would " + vnb[v];

                ps3ella = "Ojalá ella " + ps3wish[v];
                ps3she = "I wish she would " + vnb[v];

                ps3eso = "Ojalá eso " + ps3wish[v];
                ps3it = "I wish it would " +  vnb[v];

                ps4 = "Ojalá ellos " + ps4wish[v];
                ps4eng = "I wish they would " + vnb[v];

                ps5 = "Ojalá nosotros " + ps5wish[v];
                ps5eng = "I wish we would " + vnb[v];
                break;
            case 1:
                ps1 = "Ojalá yo no " + ps1wish[v];
                ps1eng = "I wish I wouldn't " + vnb[v];

                ps2 = "Ojalá tú no " + ps2wish[v];
                ps2eng = "I wish you wouldn't " + vnb[v];

                ps3 = "Ojalá él no " + ps3wish[v];
                ps3eng = "I wish he wouldn't " + vnb[v];

                ps3ella = "Ojalá ella no " + ps3wish[v];
                ps3she = "I wish she wouldn't " + vnb[v];

                ps3eso = "Ojalá eso no " + ps3wish[v];
                ps3it = "I wish it wouldn't " + vnb[v];

                ps4 = "Ojalá ellos no " + ps4wish[v];
                ps4eng = "I wish they wouldn't " + vnb[v];

                ps5 = "Ojalá nosotros no " + ps5wish[v];
                ps5eng = "I wish we wouldn't " + vnb[v];

                break;



        }
    }//PD 15/06/2022

    // USED TO
    public void UsedTo1() {
        int neg = (int) (Math.random() * 2);
        switch (neg) {
            case 0:
                ps1 = "Yo solía " + vnbs[v];
                ps1eng = "I used to " + vnb[v];

                ps2 = "Tú solías " + vnbs[v];
                ps2eng = "You used to " + vnb[v];

                ps3 = "Él solía " + vnbs[v];
                ps3eng = "He used to " + vnb[v];

                ps3ella = "Ella solía " + vnbs[v];
                ps3she = "She used to " + vnb[v];

                ps3eso = "Eso solía " + vnbs[v];
                ps3it = "It used to " + vnb[v];

                ps4 = "Ellos solían " + vnbs[v];
                ps4eng = "They used to " + vnb[v];

                ps5 = "Nosotros solíamos " + vnbs[v];
                ps5eng = "We used to " + vnb[v];
                break;
            case 1:
                ps1 = "Yo no solía " + vnbs[v];
                ps1eng = "I didn't use to " + vnb[v];

                ps2 = "Tú no solías " + vnbs[v];
                ps2eng = "You didn't use to " + vnb[v];

                ps3 = "Él no solía " + vnbs[v];
                ps3eng = "He didn't use to " + vnb[v];

                ps3ella = "Ella no solía " + vnbs[v];
                ps3she = "she didn't use to " + vnb[v];

                ps3eso = "Eso no solía " + vnbs[v];
                ps3it = "It didn't use to  " + vnb[v];

                ps4 = "Ellos no solían " + vnbs[v];
                ps4eng = "They didn't use to " + vnb[v];

                ps5 = "Nosotros no solíamos " + vnbs[v];
                ps5eng = "We didn't use to " + vnb[v];
                break;

        }
    }//PD 15/06/2022
    // BE USED TO
    public void BeUsedTo1() {
        int neg = (int) (Math.random() * 2);
        switch (neg) {
            case 0:
                ps1 = "Yo estoy acostumbrado a " + vnbs[v];
                ps1eng = "I'm used to " + vnbc[v];

                ps2 = "Tu estás acostumbrado a " + vnbs[v];
                ps2eng = "You are used to " + vnbc[v];

                ps3 = "Él está acostumbrado a " + vnbs[v];
                ps3eng = "He is used to " + vnbc[v];

                ps3ella = "Ella está acostumbrada a  " + vnbs[v];
                ps3she = "She is used to " + vnbc[v];

                ps3eso = "Eso está acostumbrado a " + vnbs[v];
                ps3it = "It is used to " + vnbc[v];

                ps4 = "Ellos están acostumbrados a " + vnbs[v];
                ps4eng = "They are used to " + vnbc[v];

                ps5 = "Nosotros estamos acostumbrados a " + vnbs[v];
                ps5eng = "We are used to " + vnbc[v];
                break;

            case 1:
                ps1 = "Yo no estoy acostumbrado a " + vnbs[v];
                ps1eng = "I'm not used to " + vnbc[v];

                ps2 = "Tu no estás acostumbrado a " + vnbs[v];
                ps2eng = "You aren't used to " + vnbc[v];

                ps3 = "Él no está acostumbrado a " + vnbs[v];
                ps3eng = "He isn't used to " + vnbc[v];

                ps3ella = "Ella no está acostumbrada a  " + vnbs[v];
                ps3she = "She isn't used to " + vnbc[v];

                ps3eso = "Eso no está acostumbrado a " + vnbs[v];
                ps3it = "It isn't used to " + vnbc[v];

                ps4 = "Ellos no están acostumbrados a " + vnbs[v];
                ps4eng = "They aren't used to " + vnbc[v];

                ps5 = "Nosotros no estamos acostumbrados a " + vnbs[v];
                ps5eng = "We aren't used to " + vnbc[v];
                break;
        }
    }//PD 15/06/2022

    //REPORTED SPEECH
    public void ReportedSpeech1(){
        int neg = (int) (Math.random() * 2);
        //subject
        String RsSj[] = {"I ","you ","he ","she ","it ","they ","we "};

        //subject esp
        String RsSjesp[] = {"yo ","tu ","el ","ella ","eso ","ellos ","nosotros "};

        //second subject
        String RsS2j[] = {"I ","you ","he ","she ","she ","they ","we "};

        //second subject esp
        String RsS2jesp[] = {"yo ","tu ","el ","ella ","ella ","ellos ", "nosotros "};

        //ps1pre
        //vnbp
        int sc = (int) (Math.random() * RsS2j.length);

        String PreRand [] = {
                ps1pre[v],ps2pre[v],ps3p[v],ps3p[v],ps3p[v],vn4p[v],vn5p[v]
        };

        switch (neg){
            case 0:
                ps1 = RsSjesp[0] + "dije que " + RsS2jesp[sc] + PreRand[sc] + nnoblesesp[n];
                ps1eng = RsSj[0] + "said that " + RsS2j[sc] + vnbp[v] + nnobles[n];

                ps2 = RsSjesp[1] + "dijiste que " + RsS2jesp[sc] + PreRand[sc] + nnoblesesp[n];
                ps2eng = RsSj[1] + "said that " + RsS2j[sc] + vnbp[v] + nnobles[n];

                ps3 = RsSjesp[2] + "dijo que " + RsS2jesp[sc] + PreRand[sc] + nnoblesesp[n];
                ps3eng = RsSj[2] + "said that " + RsS2j[sc] + vnbp[v] + nnobles[n];

                ps3ella = RsSjesp[3] + "dijo que " + RsS2jesp[sc] + PreRand[sc] + nnoblesesp[n];
                ps3she = RsSj[3] + "said that " + RsS2j[sc] + vnbp[v] + nnobles[n];

                ps3eso = RsSjesp[4] + "dijo que " + RsS2jesp[sc] + PreRand[sc] + nnoblesesp[n];
                ps3it = RsSj[4] + "said that " + RsS2j[sc] + vnbp[v] + nnobles[n];

                ps4 = RsSjesp[5] + "dijeron que " + RsS2jesp[sc] + PreRand[sc] + nnoblesesp[n];
                ps4eng = RsSj[5] + "said that " + RsS2j[sc] + vnbp[v] + nnobles[n];

                ps5 = RsSjesp[6] + "dijimos que " + RsS2jesp[sc] + PreRand[sc] + nnoblesesp[n];
                ps5eng = RsSj[6] + "said that " + RsS2j[sc] + vnbp[v] + nnobles[n];
                break;
            case 1:
                ps1 = RsSjesp[0] + "dije que " + RsS2jesp[sc] + "no " + PreRand[sc] + nnoblesesp[n];
                ps1eng = RsSj[0] + "said that " + RsS2j[sc] + "didn't " + vnbp[v] + nnobles[n];

                ps2 = RsSjesp[1] + "dijiste que " + RsS2jesp[sc] + "no " + PreRand[sc] + nnoblesesp[n];
                ps2eng = RsSj[1] + "said that " + RsS2j[sc] + "didn't " + vnbp[v] + nnobles[n];

                ps3 = RsSjesp[2] + "dijo que " + RsS2jesp[sc] + "no " + PreRand[sc] + nnoblesesp[n];
                ps3eng = RsSj[2] + "said that " + RsS2j[sc] + "didn't " + vnbp[v] + nnobles[n];

                ps3ella = RsSjesp[3] + "dijo que " + RsS2jesp[sc] + "no " + PreRand[sc] + nnoblesesp[n];
                ps3she = RsSj[3] + "said that " + RsS2j[sc] + "didn't " + vnbp[v] + nnobles[n];

                ps3eso = RsSjesp[4] + "dijo que " + RsS2jesp[sc] + "no " + PreRand[sc] + nnoblesesp[n];
                ps3it = RsSj[4] + "said that " + RsS2j[sc] + "didn't " + vnbp[v] + nnobles[n];

                ps4 = RsSjesp[5] + "dijeron que " + RsS2jesp[sc] + "no " + PreRand[sc] + nnoblesesp[n];
                ps4eng = RsSj[5] + "said that " + RsS2j[sc] + "didn't " + vnbp[v] + nnobles[n];

                ps5 = RsSjesp[6] + "dijimos que " + RsS2jesp[sc] + "no " + PreRand[sc] + nnoblesesp[n];
                ps5eng = RsSj[6] + "said that " + RsS2j[sc] + "didn't " + vnbp[v] + nnobles[n];
                break;
        }
    }//PD 29/11/2022

    //What
    public void GenWhatSimp1() {
        int neg = (int) (Math.random() * 6);
        int sr = (int) (Math.random() * 2);
        switch (neg) {
            //Presente
            case 0:
                ps1 = "¿Que " + vn1[v] + "?";
                ps1eng = "What do i " + vnb[v];

                ps2 = "¿Que " + vn2[v] + "?";
                ps2eng = "What do you " + vnb[v];

                ps3 = "¿Que " + vn3[v] + "él?";
                ps3eng = "What does he " + vnb[v];

                ps3ella = "¿Que " + vn3[v] + "ella?";
                ps3she = "What does she " + vnb[v];

                ps3eso = "¿Que " + vn3[v] + "eso?";
                ps3it = "What does it " + vnb[v];

                ps4 = "¿Que " + vn4[v] + "?";
                ps4eng = "What do they " + vnb[v];

                ps5 = "¿Que " + vn5[v] + "?";
                ps5eng = "What do we " + vnb[v];
                break;
            case 1:
                ps1 = "¿Que no " + vn1[v] + "?";
                ps1eng = "What don't i " + vnb[v];

                ps2 = "¿Que no " + vn2[v] + "?";
                ps2eng = "What don't you " + vnb[v];

                ps3 = "¿Que no " + vn3[v] + "él?";
                ps3eng = "What doesn't he " + vnb[v];

                ps3ella = "¿Que no " + vn3[v] + "ella?";
                ps3she = "What doesn't she " + vnb[v];

                ps3eso = "¿Que no " + vn3[v] + "eso?";
                ps3it = "What doesn't it " + vnb[v];

                ps4 = "¿Que no " + vn4[v] + "?";
                ps4eng = "What don't they " + vnb[v];

                ps5 = "¿Que no " + vn5[v] + "?";
                ps5eng = "What don't we " + vnb[v];
                break;

                //Pasado
            case 2:
                if (sr == 0) {
                    ps1 = "¿Que " + ps1pre[v] + "?";
                    ps1eng = "What did i" + vnb[v];

                    ps2 = "¿Que " + ps2pre[v] + "?";
                    ps2eng = "What did you " + vnb[v];

                    ps3 = "¿Que " + ps3p[v] + "él?";
                    ps3eng = "What did he " + vnb[v];

                    ps3ella = "¿Que " + ps3p[v] + "ella?";
                    ps3she = "What did she " + vnb[v];

                    ps3eso = "¿Que " + ps3p[v] + "eso?";
                    ps3it = "What did it " + vnb[v];

                    ps4 = "¿Que " + vn4p[v] + "?";
                    ps4eng = "What did they " + vnb[v];

                    ps5 = "¿Que " + vn5p[v] + "?";
                    ps5eng = "What did we " + vnb[v];
                } else {
                    ps1 = "¿Que " + ps1imp[v] + "?";
                    ps1eng = "What did i " + vnb[v];

                    ps2 = "¿Que " + ps2imp[v] + "?";
                    ps2eng = "What did you " + vnb[v];

                    ps3 = "¿Que " + ps3imp[v] + "él?";
                    ps3eng = "What did he " + vnb[v];

                    ps3ella = "¿Que " + ps3imp[v] + "ella?";
                    ps3she = "What did she " + vnb[v];

                    ps3eso = "¿Que " + ps3imp[v] + "eso?";
                    ps3it = "What did it " + vnb[v];

                    ps4 = "¿Que " + vn4imp[v] + "?";
                    ps4eng = "What did they " + vnb[v];

                    ps5 = "¿Que " + vn5imp[v] + "?";
                    ps5eng = "What did we " + vnb[v];
                }
                break;
            case 3:
                if (sr == 0) {
                    ps1 = "¿Que no " + ps1pre[v] + "?";
                    ps1eng = "What didn't i " + vnb[v];

                    ps2 = "¿Que no " + ps2pre[v] + "?";
                    ps2eng = "What didn't you " + vnb[v];

                    ps3 = "¿Que no " + ps3p[v] + "él?";
                    ps3eng = "What didn't he " + vnb[v];

                    ps3ella = "¿Que no " + ps3p[v] + "ella?";
                    ps3she = "What didn't she " + vnb[v];

                    ps3eso = "¿Que no " + ps3p[v] + "eso?";
                    ps3it = "What didn't it " + vnb[v];

                    ps4 = "¿Que no " + vn4p[v] + "?";
                    ps4eng = "What didn't they " + vnb[v];

                    ps5 = "¿Que no " + vn5p[v] + "?";
                    ps5eng = "What didn't we " + vnb[v];
                } else {
                    ps1 = "¿Que no " + ps1imp[v] + "?";
                    ps1eng = "What didn't i " + vnb[v];

                    ps2 = "¿Que no " + ps2imp[v] + "?";
                    ps2eng = "What didn't you " + vnb[v];

                    ps3 = "¿Que no " + ps3imp[v] + "él?";
                    ps3eng = "What didn't he " + vnb[v];

                    ps3ella = "¿Que no " + ps3imp[v] + "ella?";
                    ps3she = "What didn't she " + vnb[v];

                    ps3eso = "¿Que no " + ps3imp[v] + "eso?";
                    ps3it = "What didn't it " + vnb[v];

                    ps4 = "¿Que no " + vn4imp[v] + "?";
                    ps4eng = "What didn't they " + vnb[v];

                    ps5 = "¿Que no " + vn5imp[v] + "?";
                    ps5eng = "What didn't we " + vnb[v];
                }
                break;

                //Futuro
            case 4:
                ps1 = "¿Que " + vn1f[v] + "?";
                ps1eng = "What will i " + vnb[v];

                ps2 = "¿Que " + vn2f[v] + "?";
                ps2eng = "What will you " + vnb[v];

                ps3 = "¿Que " + vn3f[v] + "él?";
                ps3eng = "What will he " + vnb[v];

                ps3ella = "¿Que " + vn3f[v] + "ella?";
                ps3she = "What will she " + vnb[v];

                ps3eso = "¿Que " + vn3f[v] + "eso?";
                ps3it = "What will it " + vnb[v];

                ps4 = "¿Que " + vn4f[v] + "?";
                ps4eng = "What will they " + vnb[v];

                ps5 = "¿Que " + vn5f[v] + "?";
                ps5eng = "What will we " + vnb[v];
                break;
            case 5:
                ps1 = "¿Que no " + vn1f[v] + "?";
                ps1eng = "What won't i " + vnb[v];

                ps2 = "¿Que no " + vn2f[v] + "?";
                ps2eng = "What won't you " + vnb[v];

                ps3 = "¿Que no " + vn3f[v] + "él?";
                ps3eng = "What won't he " + vnb[v];

                ps3ella = "¿Que no " + vn3f[v] + "ella?";
                ps3she = "What won't she " + vnb[v];

                ps3eso = "¿Que no " + vn3f[v] + "eso?";
                ps3it = "What won't it " + vnb[v];

                ps4 = "¿Que no " + vn4f[v] + "?";
                ps4eng = "What won't they " + vnb[v];

                ps5 = "¿Que no " + vn5f[v] + "?";
                ps5eng = "What won't we " + vnb[v];
                break;
        }
    }//LR 02/12/2022
    public void GenWhatCont1() {
        switch (neg) {
            case 0:
                ps1 = "¿Que " + scontIesp[s] + vnbcs[v] + "?";
                ps1eng = "What " + scontI[s] + vnbc[v];

                ps2 = "¿Que " + scontYouesp[s] + vnbcs[v] + "?";
                ps2eng = "What " + scontYou[s] + vnbc[v];

                ps3 = "¿Que " + scontHeesp[s] + vnbcs[v] + "él?";
                ps3eng = "What " + scontHe[s] + vnbc[v];

                ps3ella = "¿Que " + scontSheesp[s] + vnbcs[v] + "ella?";
                ps3she = "What " + scontShe[s] + vnbc[v];

                ps3eso = "¿Que " + scontItesp[s] + vnbcs[v] + "eso?";
                ps3it = "What " + scontIt[s] + vnbc[v];

                ps4 = "¿Que " + scontTheyesp[s] + vnbcs[v] + "?";
                ps4eng = "What " + scontThey[s] + vnbc[v];

                ps5 = "¿Que " + scontWeesp[s] + vnbcs[v] + "?";
                ps5eng = "What " + scontWe[s] + vnbc[v];
                break;

            case 1:
                ps1 = "¿Que " + scontIespno[s] + vnbcs[v] + "?";
                ps1eng = "What " + scontIdont[s] + vnbc[v];

                ps2 = "¿Que " + scontYouespno[s] + vnbcs[v] + "?";
                ps2eng = "What " + scontYoudont[s] + vnbc[v];

                ps3 = "¿Que " + scontHeespno[s] + vnbcs[v] + "él?";
                ps3eng = "What " + scontHedont[s] + vnbc[v];

                ps3ella = "¿Que " + scontSheespno[s] + vnbcs[v] + "ella?";
                ps3she = "What " + scontShedont[s] + vnbc[v];

                ps3eso = "¿Que " + scontItespno[s] + vnbcs[v] + "eso?";
                ps3it = "What " + scontItdont[s] + vnbc[v];

                ps4 = "¿Que " + scontTheyespno[s] + vnbcs[v] + "?";
                ps4eng = "What " + scontTheydont[s] + vnbc[v];

                ps5 = "¿Que " + scontWeespno[s] + vnbcs[v] + "?";
                ps5eng = "What " + scontWedont[s] + vnbc[v];
                break;
        }
    }//LR 02/12/2022
    public void GenWhatPerf1() {
        switch (neg) {
            case 0:
                ps1 = "¿Que " + sperfIesp[s] + vpsp[v] + "?";
                ps1eng = "What " + sperfI[s] + vpeng[v];

                ps2 = "¿Que " + sperfYouesp[s] + vpsp[v] + "?";
                ps2eng = "What " + sperfYou[s] + vpeng[v];

                ps3 = "¿Que " + sperfHeesp[s] + vpsp[v] + "él?";
                ps3eng = "What " + sperfHe[s] + vpeng[v];

                ps3ella = "¿Que " + sperfSheesp[s] + vpsp[v] + "ella?";
                ps3she = "What " + sperfShe[s] + vpeng[v];

                ps3eso = "¿Que " + sperfItesp[s] + vpsp[v] + "eso?";
                ps3it = "What " + sperfIt[s] + vpeng[v];

                ps4 = "¿Que " + sperfTheyesp[s] + vpsp[v] + "?";
                ps4eng = "What " + sperfThey[s] + vpeng[v];

                ps5 = "¿Que " + sperfWeesp[s] + vpsp[v] + "?";
                ps5eng = "What " + sperfWe[s] + vpeng[v];
                break;
            case 1:
                ps1 = "¿Que " + sperfIespno[s] + vpsp[v] + "?";
                ps1eng = "What " + sperfIdont[s] + vpeng[v];

                ps2 = "¿Que " + sperfYouespno[s] + vpsp[v] + "?";
                ps2eng = "What " + sperfYoudont[s] + vpeng[v];

                ps3 = "¿Que " + sperfHeespno[s] + vpsp[v] + "él?";
                ps3eng = "What " + sperfHedont[s] + vpeng[v];

                ps3ella = "¿Que " + sperfSheespno[s] + vpsp[v] + "ella?";
                ps3she = "What " + sperfShedont[s] + vpeng[v];

                ps3eso = "¿Que " + sperfItespno[s] + vpsp[v] + "eso?";
                ps3it = "What " + sperfItdont[s] + vpeng[v];

                ps4 = "¿Que " + sperfTheyespno[s] + vpsp[v] + "?";
                ps4eng = "What " + sperfTheydont[s] + vpeng[v];

                ps5 = "¿Que " + sperfWeespno[s] + vpsp[v] + "?";
                ps5eng = "What " + sperfWedont[s] + vpeng[v];

                break;
        }
    }//LR 02/12/2022

   //What Modales
   public void GenWhatModalsSimp1(){
       int neg = (int) (Math.random() * 6);
        switch (neg){
            //Would
            case 0:
                ps1 = "¿Que " + vn1w[v] + "?";
                ps1eng = "What " + "would i " + vnb[v];

                ps2 = "¿Que " + vn2w[v] + "?";
                ps2eng = "What " + "would you " + vnb[v];

                ps3 = "¿Que " + vn3w[v] + "él?";
                ps3eng = "What " + "would he " + vnb[v];

                ps3ella = "¿Que " + vn3w[v] + "ella?";
                ps3she = "What " + "would she " + vnb[v];

                ps3eso = "¿Que " + vn3w[v] + "eso?";
                ps3it = "What " + "would it " + vnb[v];

                ps4 = "¿Que " + vn4w[v] + "?";
                ps4eng = "What " + "would they " + vnb[v];

                ps5 = "¿Que " + vn5w[v] + "?";
                ps5eng = "What " + "would we " + vnb[v];
                break;
            case 1:
                ps1 = "¿Que no " + vn1w[v] + "?";
                ps1eng = "What " + "wouldn't i " + vnb[v];

                ps2 = "¿Que no " + vn2w[v] + "?";
                ps2eng = "What " + "wouldn't you " + vnb[v];

                ps3 = "¿Que no " + vn3w[v] + "él?";
                ps3eng = "What " + "wouldn't he " + vnb[v];

                ps3ella = "¿Que no " + vn3w[v] + "ella?";
                ps3she = "What " + "wouldn't she " + vnb[v];

                ps3eso = "¿Que no " + vn3w[v] + "eso?";
                ps3it = "What " + "wouldn't it " + vnb[v];

                ps4 = "¿Que no " + vn4w[v] + "?";
                ps4eng = "What " + "wouldn't they " + vnb[v];

                ps5 = "¿Que no " + vn5w[v] + "?";
                ps5eng = "What " + "wouldn't we " + vnb[v];
                break;

            //Could
            case 2:
                ps1 = "¿Que " + "podría " + vnbs[v] + "?";
                ps1eng = "What " + "could i " + vnb[v];

                ps2 = "¿Que " + "podrías " + vnbs[v] + "?";
                ps2eng = "What " + "could you " + vnb[v];

                ps3 = "¿Que " + "podría " + vnbs[v] + "él?";
                ps3eng = "What " + "could he " + vnb[v];

                ps3ella = "¿Que " + "podría " + vnbs[v] + "ella?";
                ps3she = "What " + "could she " + vnb[v];

                ps3eso = "¿Que " + "podría " + vnbs[v] + "eso?";
                ps3it = "What " + "could it " + vnb[v];

                ps4 = "¿Que " + "podrían " + vnbs[v] + "?";
                ps4eng = "What " + "could they " + vnb[v];

                ps5 = "¿Que " + "podríamos " + vnbs[v] + "?";
                ps5eng = "What " + "could we " + vnb[v];
                break;
            case 3:
                ps1 = "¿Que no " + "podría " + vnbs[v] + "?";
                ps1eng = "What " + "couldn't i " + vnb[v];

                ps2 = "¿Que no " + "podrías " + vnbs[v] + "?";
                ps2eng = "What " + "couldn't you " + vnb[v];

                ps3 = "¿Que no " + "podría " + vnbs[v] + "él?";
                ps3eng = "What " + "couldn't he " + vnb[v];

                ps3ella = "¿Que no " + "podría " + vnbs[v] + "ella?";
                ps3she = "What " + "couldn't she " + vnb[v];

                ps3eso = "¿Que no " + "podría " + vnbs[v] + "eso?";
                ps3it = "What " + "couldn't it " + vnb[v];

                ps4 = "¿Que no " + "podrían " + vnbs[v] + "?";
                ps4eng = "What " + "couldn't they " + vnb[v];

                ps5 = "¿Que no " + "podríamos " + vnbs[v] + "?";
                ps5eng = "What " + "couldn't we " + vnb[v];
                break;

                //Should
            case 4:
                ps1 = "¿Que " + "debería " + vnbs[v] + "?";
                ps1eng = "What " + "should i " + vnb[v];

                ps2 = "¿Que " + "deberías " + vnbs[v] + "?";
                ps2eng = "What " + "should you " + vnb[v];

                ps3 = "¿Que " + "debería " + vnbs[v] + "él?";
                ps3eng = "What " + "should he " + vnb[v];

                ps3ella = "¿Que " + "debería " + vnbs[v] + "ella?";
                ps3she = "What " + "should she " + vnb[v];

                ps3eso = "¿Que " + "debería " + vnbs[v] + "eso?";
                ps3it = "What " + "should it " + vnb[v];

                ps4 = "¿Que " + "deberían " + vnbs[v] + "?";
                ps4eng = "What " + "should they " + vnb[v];

                ps5 = "¿Que " + "deberíamos " + vnbs[v] + "?";
                ps5eng = "What " + "should we " + vnb[v];
                break;
            case 5:
                ps1 = "¿Que no " + "debería " + vnbs[v] + "?";
                ps1eng = "What " + "shouldn't i " + vnb[v];

                ps2 = "¿Que no " + "deberías " + vnbs[v] + "?";
                ps2eng = "What " + "shouldn't you " + vnb[v];

                ps3 = "¿Que no " + "debería " + vnbs[v] + "él?";
                ps3eng = "What " + "shouldn't he " + vnb[v];

                ps3ella = "¿Que no " + "debería " + vnbs[v] + "ella?";
                ps3she = "What " + "shouldn't she " + vnb[v];

                ps3eso = "¿Que no " + "debería " + vnbs[v] + "eso?";
                ps3it = "What " + "shouldn't it " + vnb[v];

                ps4 = "¿Que no " + "deberían " + vnbs[v] + "?";
                ps4eng = "What " + "shouldn't they " + vnb[v];

                ps5 = "¿Que no " + "deberíamos " + vnbs[v] + "?";
                ps5eng = "What " + "shouldn't we " + vnb[v];
                break;

        }
   }//LR 07/12/2022
   public void GenWhatModalsCont1() {
        switch (neg) {
            case 0:
                ps1 = "¿Que " + scontmIesp[s] + vnbcs[v] + "?";
                ps1eng = "What " + scontmI[s] + vnbc[v];

                ps2 = "¿Que " + scontmYouesp[s] + vnbcs[v] + "?";
                ps2eng = "What " + scontmYou[s] + vnbc[v];

                ps3 = "¿Que " + scontmHeesp[s] + vnbcs[v] + "él?";
                ps3eng = "What " + scontmHe[s] + vnbc[v];

                ps3ella = "¿Que " + scontmSheesp[s] + vnbcs[v] + "ella?";
                ps3she = "What " + scontmShe[s] + vnbc[v];

                ps3eso = "¿Que " + scontmItesp[s] + vnbcs[v] + "eso?";
                ps3it = "What " + scontmIt[s] + vnbc[v];

                ps4 = "¿Que " + scontmTheyesp[s] + vnbcs[v] + "?";
                ps4eng = "What " + scontmThey[s] + vnbc[v];

                ps5 = "¿Que " + scontmWeesp[s] + vnbcs[v] + "?";
                ps5eng = "What " + scontmWe[s] + vnbc[v];
                break;

            case 1:
                ps1 = "¿Que " + scontmIespno[s] + vnbcs[v] + "?";
                ps1eng = "What " + scontmIdont[s] + vnbc[v];

                ps2 = "¿Que " + scontmYouespno[s] + vnbcs[v] + "?";
                ps2eng = "What " + scontmYoudont[s] + vnbc[v];

                ps3 = "¿Que " + scontmHeespno[s] + vnbcs[v] + "él?";
                ps3eng = "What " + scontmHedont[s] + vnbc[v];

                ps3ella = "¿Que " + scontmSheespno[s] + vnbcs[v] + "ella?";
                ps3she = "What " + scontmShedont[s] + vnbc[v];

                ps3eso = "¿Que " + scontmItespno[s] + vnbcs[v] + "eso?";
                ps3it = "What " + scontmItdont[s] + vnbc[v];

                ps4 = "¿Que " + scontmTheyespno[s] + vnbcs[v] + "?";
                ps4eng = "What " + scontmTheydont[s] + vnbc[v];

                ps5 = "¿Que " + scontmWeespno[s] + vnbcs[v] + "?";
                ps5eng = "What " + scontmWedont[s] + vnbc[v];
                break;
        }
    }//LR 07/12/2022
   public void GenWhatModalsPerf1() {
        switch (neg) {
            case 0:
                ps1 = "¿Que " + sperfmIesp[s] + vpsp[v] + "?";
                ps1eng = "What " + sperfmI[s] + vpeng[v];

                ps2 = "¿Que " + sperfmYouesp[s] + vpsp[v] + "?";
                ps2eng = "What " + sperfmYou[s] + vpeng[v];

                ps3 = "¿Que " + sperfmHeesp[s] + vpsp[v] + "él?";
                ps3eng = "What " + sperfmHe[s] + vpeng[v];

                ps3ella = "¿Que " + sperfmSheesp[s] + vpsp[v] + "ella?";
                ps3she = "What " + sperfmShe[s] + vpeng[v];

                ps3eso = "¿Que " + sperfmItesp[s] + vpsp[v] + "eso?";
                ps3it = "What " + sperfmIt[s] + vpeng[v];

                ps4 = "¿Que " + sperfmTheyesp[s] + vpsp[v] + "?";
                ps4eng = "What " + sperfmThey[s] + vpeng[v];

                ps5 = "¿Que " + sperfmWeesp[s] + vpsp[v] + "?";
                ps5eng = "What " + sperfmWe[s] + vpeng[v];
                break;
            case 1:
                ps1 = "¿Que " + sperfmIespno[s] + vpsp[v] + "?";
                ps1eng = "What " + sperfmIdont[s] + vpeng[v];

                ps2 = "¿Que " + sperfmYouespno[s] + vpsp[v] + "?";
                ps2eng = "What " + sperfmYoudont[s] + vpeng[v];

                ps3 = "¿Que " + sperfmHeespno[s] + vpsp[v] + "él?";
                ps3eng = "What " + sperfmHedont[s] + vpeng[v];

                ps3ella = "¿Que " + sperfmSheespno[s] + vpsp[v] + "ella?";
                ps3she = "What " + sperfmShedont[s] + vpeng[v];

                ps3eso = "¿Que " + sperfmItespno[s] + vpsp[v] + "eso?";
                ps3it = "What " + sperfmItdont[s] + vpeng[v];

                ps4 = "¿Que " + sperfmTheyespno[s] + vpsp[v] + "?";
                ps4eng = "What " + sperfmTheydont[s] + vpeng[v];

                ps5 = "¿Que " + sperfmWeespno[s] + vpsp[v] + "?";
                ps5eng = "What " + sperfmWedont[s] + vpeng[v];

                break;
        }
    }//LR 02/12/2022

   //When
   public void GenWhenSimp1() {
        int neg = (int) (Math.random() * 6);
        int sr = (int) (Math.random() * 2);
        switch (neg) {
            //Presente
            case 0:
                ps1 = "¿Cuándo " + vn1[v] + "?";
                ps1eng = "When do i " + vnb[v];

                ps2 = "¿Cuándo " + vn2[v] + "?";
                ps2eng = "When do you " + vnb[v];

                ps3 = "¿Cuándo " + vn3[v] + "él?";
                ps3eng = "When does he " + vnb[v];

                ps3ella = "¿Cuándo " + vn3[v] + "ella?";
                ps3she = "When does she " + vnb[v];

                ps3eso = "¿Cuándo " + vn3[v] + "eso?";
                ps3it = "When does it " + vnb[v];

                ps4 = "¿Cuándo " + vn4[v] + "?";
                ps4eng = "When do they " + vnb[v];

                ps5 = "¿Cuándo " + vn5[v] + "?";
                ps5eng = "When do we " + vnb[v];
                break;
            case 1:
                ps1 = "¿Cuándo no " + vn1[v] + "?";
                ps1eng = "When don't i " + vnb[v];

                ps2 = "¿Cuándo no " + vn2[v] + "?";
                ps2eng = "When don't you " + vnb[v];

                ps3 = "¿Cuándo no " + vn3[v] + "él?";
                ps3eng = "When doesn't he " + vnb[v];

                ps3ella = "¿Cuándo no " + vn3[v] + "ella?";
                ps3she = "When doesn't she " + vnb[v];

                ps3eso = "¿Cuándo no " + vn3[v] + "eso?";
                ps3it = "When doesn't it " + vnb[v];

                ps4 = "¿Cuándo no " + vn4[v] + "?";
                ps4eng = "When don't they " + vnb[v];

                ps5 = "¿Cuándo no " + vn5[v] + "?";
                ps5eng = "When don't we " + vnb[v];
                break;

            //Pasado
            case 2:
                if (sr == 0) {
                    ps1 = "¿Cuándo " + ps1pre[v] + "?";
                    ps1eng = "When did i" + vnb[v];

                    ps2 = "¿Cuándo " + ps2pre[v] + "?";
                    ps2eng = "When did you " + vnb[v];

                    ps3 = "¿Cuándo " + ps3p[v] + "él?";
                    ps3eng = "When did he " + vnb[v];

                    ps3ella = "¿Cuándo " + ps3p[v] + "ella?";
                    ps3she = "When did she " + vnb[v];

                    ps3eso = "¿Cuándo " + ps3p[v] + "eso?";
                    ps3it = "When did it " + vnb[v];

                    ps4 = "¿Cuándo " + vn4p[v] + "?";
                    ps4eng = "When did they " + vnb[v];

                    ps5 = "¿Cuándo " + vn5p[v] + "?";
                    ps5eng = "When did we " + vnb[v];
                } else {
                    ps1 = "¿Cuándo " + ps1imp[v] + "?";
                    ps1eng = "When did i " + vnb[v];

                    ps2 = "¿Cuándo " + ps2imp[v] + "?";
                    ps2eng = "When did you " + vnb[v];

                    ps3 = "¿Cuándo " + ps3imp[v] + "él?";
                    ps3eng = "When did he " + vnb[v];

                    ps3ella = "¿Cuándo " + ps3imp[v] + "ella?";
                    ps3she = "When did she " + vnb[v];

                    ps3eso = "¿Cuándo " + ps3imp[v] + "eso?";
                    ps3it = "When did it " + vnb[v];

                    ps4 = "¿Cuándo " + vn4imp[v] + "?";
                    ps4eng = "When did they " + vnb[v];

                    ps5 = "¿Cuándo " + vn5imp[v] + "?";
                    ps5eng = "When did we " + vnb[v];
                }
                break;
            case 3:
                if (sr == 0) {
                    ps1 = "¿Cuándo no " + ps1pre[v] + "?";
                    ps1eng = "When didn't i " + vnb[v];

                    ps2 = "¿Cuándo no " + ps2pre[v] + "?";
                    ps2eng = "When didn't you " + vnb[v];

                    ps3 = "¿Cuándo no " + ps3p[v] + "él?";
                    ps3eng = "When didn't he " + vnb[v];

                    ps3ella = "¿Cuándo no " + ps3p[v] + "ella?";
                    ps3she = "When didn't she " + vnb[v];

                    ps3eso = "¿Cuándo no " + ps3p[v] + "eso?";
                    ps3it = "When didn't it " + vnb[v];

                    ps4 = "¿Cuándo no " + vn4p[v] + "?";
                    ps4eng = "When didn't they " + vnb[v];

                    ps5 = "¿Cuándo no " + vn5p[v] + "?";
                    ps5eng = "When didn't we " + vnb[v];
                } else {
                    ps1 = "¿Cuándo no " + ps1imp[v] + "?";
                    ps1eng = "When didn't i " + vnb[v];

                    ps2 = "¿Cuándo no " + ps2imp[v] + "?";
                    ps2eng = "When didn't you " + vnb[v];

                    ps3 = "¿Cuándo no " + ps3imp[v] + "él?";
                    ps3eng = "When didn't he " + vnb[v];

                    ps3ella = "¿Cuándo no " + ps3imp[v] + "ella?";
                    ps3she = "When didn't she " + vnb[v];

                    ps3eso = "¿Cuándo no " + ps3imp[v] + "eso?";
                    ps3it = "When didn't it " + vnb[v];

                    ps4 = "¿Cuándo no " + vn4imp[v] + "?";
                    ps4eng = "When didn't they " + vnb[v];

                    ps5 = "¿Cuándo no " + vn5imp[v] + "?";
                    ps5eng = "When didn't we " + vnb[v];
                }
                break;

            //Futuro
            case 4:
                ps1 = "¿Cuándo " + vn1f[v] + "?";
                ps1eng = "When will i " + vnb[v];

                ps2 = "¿Cuándo " + vn2f[v] + "?";
                ps2eng = "When will you " + vnb[v];

                ps3 = "¿Cuándo " + vn3f[v] + "él?";
                ps3eng = "When will he " + vnb[v];

                ps3ella = "¿Cuándo " + vn3f[v] + "ella?";
                ps3she = "When will she " + vnb[v];

                ps3eso = "¿Cuándo " + vn3f[v] + "eso?";
                ps3it = "When will it " + vnb[v];

                ps4 = "¿Cuándo " + vn4f[v] + "?";
                ps4eng = "When will they " + vnb[v];

                ps5 = "¿Cuándo " + vn5f[v] + "?";
                ps5eng = "When will we " + vnb[v];
                break;
            case 5:
                ps1 = "¿Cuándo no " + vn1f[v] + "?";
                ps1eng = "When won't i " + vnb[v];

                ps2 = "¿Cuándo no " + vn2f[v] + "?";
                ps2eng = "When won't you " + vnb[v];

                ps3 = "¿Cuándo no " + vn3f[v] + "él?";
                ps3eng = "When won't he " + vnb[v];

                ps3ella = "¿Cuándo no " + vn3f[v] + "ella?";
                ps3she = "When won't she " + vnb[v];

                ps3eso = "¿Cuándo no " + vn3f[v] + "eso?";
                ps3it = "When won't it " + vnb[v];

                ps4 = "¿Cuándo no " + vn4f[v] + "?";
                ps4eng = "When won't they " + vnb[v];

                ps5 = "¿Cuándo no " + vn5f[v] + "?";
                ps5eng = "When won't we " + vnb[v];
                break;
        }
    }//LR 13/12/2022
   public void GenWhenCont1() {
        switch (neg) {
            case 0:
                ps1 = "¿Cuándo " + scontIesp[s] + vnbcs[v] + "?";
                ps1eng = "When " + scontI[s] + vnbc[v];

                ps2 = "¿Cuándo " + scontYouesp[s] + vnbcs[v] + "?";
                ps2eng = "When " + scontYou[s] + vnbc[v];

                ps3 = "¿Cuándo " + scontHeesp[s] + vnbcs[v] + "él?";
                ps3eng = "When " + scontHe[s] + vnbc[v];

                ps3ella = "¿Cuándo " + scontSheesp[s] + vnbcs[v] + "ella?";
                ps3she = "When " + scontShe[s] + vnbc[v];

                ps3eso = "¿Cuándo " + scontItesp[s] + vnbcs[v] + "eso?";
                ps3it = "When " + scontIt[s] + vnbc[v];

                ps4 = "¿Cuándo " + scontTheyesp[s] + vnbcs[v] + "?";
                ps4eng = "When " + scontThey[s] + vnbc[v];

                ps5 = "¿Cuándo " + scontWeesp[s] + vnbcs[v] + "?";
                ps5eng = "When " + scontWe[s] + vnbc[v];
                break;

            case 1:
                ps1 = "¿Cuándo " + scontIespno[s] + vnbcs[v] + "?";
                ps1eng = "When " + scontIdont[s] + vnbc[v];

                ps2 = "¿Cuándo " + scontYouespno[s] + vnbcs[v] + "?";
                ps2eng = "When " + scontYoudont[s] + vnbc[v];

                ps3 = "¿Cuándo " + scontHeespno[s] + vnbcs[v] + "él?";
                ps3eng = "When " + scontHedont[s] + vnbc[v];

                ps3ella = "¿Cuándo " + scontSheespno[s] + vnbcs[v] + "ella?";
                ps3she = "When " + scontShedont[s] + vnbc[v];

                ps3eso = "¿Cuándo " + scontItespno[s] + vnbcs[v] + "eso?";
                ps3it = "When " + scontItdont[s] + vnbc[v];

                ps4 = "¿Cuándo " + scontTheyespno[s] + vnbcs[v] + "?";
                ps4eng = "When " + scontTheydont[s] + vnbc[v];

                ps5 = "¿Cuándo " + scontWeespno[s] + vnbcs[v] + "?";
                ps5eng = "When " + scontWedont[s] + vnbc[v];
                break;
        }
    }//LR 13/12/2022
   public void GenWhenPerf1() {
        switch (neg) {
            case 0:
                ps1 = "¿Cuándo " + sperfIesp[s] + vpsp[v] + "?";
                ps1eng = "When " + sperfI[s] + vpeng[v];

                ps2 = "¿Cuándo " + sperfYouesp[s] + vpsp[v] + "?";
                ps2eng = "When " + sperfYou[s] + vpeng[v];

                ps3 = "¿Cuándo " + sperfHeesp[s] + vpsp[v] + "él?";
                ps3eng = "When " + sperfHe[s] + vpeng[v];

                ps3ella = "¿Cuándo " + sperfSheesp[s] + vpsp[v] + "ella?";
                ps3she = "When " + sperfShe[s] + vpeng[v];

                ps3eso = "¿Cuándo " + sperfItesp[s] + vpsp[v] + "eso?";
                ps3it = "When " + sperfIt[s] + vpeng[v];

                ps4 = "¿Cuándo " + sperfTheyesp[s] + vpsp[v] + "?";
                ps4eng = "When " + sperfThey[s] + vpeng[v];

                ps5 = "¿Cuándo " + sperfWeesp[s] + vpsp[v] + "?";
                ps5eng = "When " + sperfWe[s] + vpeng[v];
                break;
            case 1:
                ps1 = "¿Cuándo " + sperfIespno[s] + vpsp[v] + "?";
                ps1eng = "When " + sperfIdont[s] + vpeng[v];

                ps2 = "¿Cuándo " + sperfYouespno[s] + vpsp[v] + "?";
                ps2eng = "When " + sperfYoudont[s] + vpeng[v];

                ps3 = "¿Cuándo " + sperfHeespno[s] + vpsp[v] + "él?";
                ps3eng = "When " + sperfHedont[s] + vpeng[v];

                ps3ella = "¿Cuándo " + sperfSheespno[s] + vpsp[v] + "ella?";
                ps3she = "When " + sperfShedont[s] + vpeng[v];

                ps3eso = "¿Cuándo " + sperfItespno[s] + vpsp[v] + "eso?";
                ps3it = "When " + sperfItdont[s] + vpeng[v];

                ps4 = "¿Cuándo " + sperfTheyespno[s] + vpsp[v] + "?";
                ps4eng = "When " + sperfTheydont[s] + vpeng[v];

                ps5 = "¿Cuándo " + sperfWeespno[s] + vpsp[v] + "?";
                ps5eng = "When " + sperfWedont[s] + vpeng[v];

                break;
        }
    }//LR 13/12/2022

   //When Modales
   public void GenWhenModalsSimp1(){
        int neg = (int) (Math.random() * 6);
        switch (neg){
            //Would
            case 0:
                ps1 = "¿Cuándo " + vn1w[v] + "?";
                ps1eng = "When " + "would i " + vnb[v];

                ps2 = "¿Cuándo " + vn2w[v] + "?";
                ps2eng = "When " + "would you " + vnb[v];

                ps3 = "¿Cuándo " + vn3w[v] + "él?";
                ps3eng = "When " + "would he " + vnb[v];

                ps3ella = "¿Cuándo " + vn3w[v] + "ella?";
                ps3she = "When " + "would she " + vnb[v];

                ps3eso = "¿Cuándo " + vn3w[v] + "eso?";
                ps3it = "When " + "would it " + vnb[v];

                ps4 = "¿Cuándo " + vn4w[v] + "?";
                ps4eng = "When " + "would they " + vnb[v];

                ps5 = "¿Cuándo " + vn5w[v] + "?";
                ps5eng = "When " + "would we " + vnb[v];
                break;
            case 1:
                ps1 = "¿Cuándo no " + vn1w[v] + "?";
                ps1eng = "When " + "wouldn't i " + vnb[v];

                ps2 = "¿Cuándo no " + vn2w[v] + "?";
                ps2eng = "When " + "wouldn't you " + vnb[v];

                ps3 = "¿Cuándo no " + vn3w[v] + "él?";
                ps3eng = "When " + "wouldn't he " + vnb[v];

                ps3ella = "¿Cuándo no " + vn3w[v] + "ella?";
                ps3she = "When " + "wouldn't she " + vnb[v];

                ps3eso = "¿Cuándo no " + vn3w[v] + "eso?";
                ps3it = "When " + "wouldn't it " + vnb[v];

                ps4 = "¿Cuándo no " + vn4w[v] + "?";
                ps4eng = "When " + "wouldn't they " + vnb[v];

                ps5 = "¿Cuándo no " + vn5w[v] + "?";
                ps5eng = "When " + "wouldn't we " + vnb[v];
                break;

            //Could
            case 2:
                ps1 = "¿Cuándo " + "podría " + vnbs[v] + "?";
                ps1eng = "When " + "could i " + vnb[v];

                ps2 = "¿Cuándo " + "podrías " + vnbs[v] + "?";
                ps2eng = "When " + "could you " + vnb[v];

                ps3 = "¿Cuándo " + "podría " + vnbs[v] + "él?";
                ps3eng = "When " + "could he " + vnb[v];

                ps3ella = "¿Cuándo " + "podría " + vnbs[v] + "ella?";
                ps3she = "When " + "could she " + vnb[v];

                ps3eso = "¿Cuándo " + "podría " + vnbs[v] + "eso?";
                ps3it = "When " + "could it " + vnb[v];

                ps4 = "¿Cuándo " + "podrían " + vnbs[v] + "?";
                ps4eng = "When " + "could they " + vnb[v];

                ps5 = "¿Cuándo " + "podríamos " + vnbs[v] + "?";
                ps5eng = "When " + "could we " + vnb[v];
                break;
            case 3:
                ps1 = "¿Cuándo no " + "podría " + vnbs[v] + "?";
                ps1eng = "When " + "couldn't i " + vnb[v];

                ps2 = "¿Cuándo no " + "podrías " + vnbs[v] + "?";
                ps2eng = "When " + "couldn't you " + vnb[v];

                ps3 = "¿Cuándo no " + "podría " + vnbs[v] + "él?";
                ps3eng = "When " + "couldn't he " + vnb[v];

                ps3ella = "¿Cuándo no " + "podría " + vnbs[v] + "ella?";
                ps3she = "When " + "couldn't she " + vnb[v];

                ps3eso = "¿Cuándo no " + "podría " + vnbs[v] + "eso?";
                ps3it = "When " + "couldn't it " + vnb[v];

                ps4 = "¿Cuándo no " + "podrían " + vnbs[v] + "?";
                ps4eng = "When " + "couldn't they " + vnb[v];

                ps5 = "¿Cuándo no " + "podríamos " + vnbs[v] + "?";
                ps5eng = "When " + "couldn't we " + vnb[v];
                break;

            //Should
            case 4:
                ps1 = "¿Cuándo " + "debería " + vnbs[v] + "?";
                ps1eng = "When " + "should i " + vnb[v];

                ps2 = "¿Cuándo " + "deberías " + vnbs[v] + "?";
                ps2eng = "When " + "should you " + vnb[v];

                ps3 = "¿Cuándo " + "debería " + vnbs[v] + "él?";
                ps3eng = "When " + "should he " + vnb[v];

                ps3ella = "¿Cuándo " + "debería " + vnbs[v] + "ella?";
                ps3she = "When " + "should she " + vnb[v];

                ps3eso = "¿Cuándo " + "debería " + vnbs[v] + "eso?";
                ps3it = "When " + "should it " + vnb[v];

                ps4 = "¿Cuándo " + "deberían " + vnbs[v] + "?";
                ps4eng = "When " + "should they " + vnb[v];

                ps5 = "¿Cuándo " + "deberíamos " + vnbs[v] + "?";
                ps5eng = "When " + "should we " + vnb[v];
                break;
            case 5:
                ps1 = "¿Cuándo no " + "debería " + vnbs[v] + "?";
                ps1eng = "When " + "shouldn't i " + vnb[v];

                ps2 = "¿Cuándo no " + "deberías " + vnbs[v] + "?";
                ps2eng = "When " + "shouldn't you " + vnb[v];

                ps3 = "¿Cuándo no " + "debería " + vnbs[v] + "él?";
                ps3eng = "When " + "shouldn't he " + vnb[v];

                ps3ella = "¿Cuándo no " + "debería " + vnbs[v] + "ella?";
                ps3she = "When " + "shouldn't she " + vnb[v];

                ps3eso = "¿Cuándo no " + "debería " + vnbs[v] + "eso?";
                ps3it = "When " + "shouldn't it " + vnb[v];

                ps4 = "¿Cuándo no " + "deberían " + vnbs[v] + "?";
                ps4eng = "When " + "shouldn't they " + vnb[v];

                ps5 = "¿Cuándo no " + "deberíamos " + vnbs[v] + "?";
                ps5eng = "When " + "shouldn't we " + vnb[v];
                break;

        }
    }//LR 13/12/2022
   public void GenWhenModalsCont1() {
        switch (neg) {
            case 0:
                ps1 = "¿Cuándo " + scontmIesp[s] + vnbcs[v] + "?";
                ps1eng = "When " + scontmI[s] + vnbc[v];

                ps2 = "¿Cuándo " + scontmYouesp[s] + vnbcs[v] + "?";
                ps2eng = "When " + scontmYou[s] + vnbc[v];

                ps3 = "¿Cuándo " + scontmHeesp[s] + vnbcs[v] + "él?";
                ps3eng = "When " + scontmHe[s] + vnbc[v];

                ps3ella = "¿Cuándo " + scontmSheesp[s] + vnbcs[v] + "ella?";
                ps3she = "When " + scontmShe[s] + vnbc[v];

                ps3eso = "¿Cuándo " + scontmItesp[s] + vnbcs[v] + "eso?";
                ps3it = "When " + scontmIt[s] + vnbc[v];

                ps4 = "¿Cuándo " + scontmTheyesp[s] + vnbcs[v] + "?";
                ps4eng = "When " + scontmThey[s] + vnbc[v];

                ps5 = "¿Cuándo " + scontmWeesp[s] + vnbcs[v] + "?";
                ps5eng = "When " + scontmWe[s] + vnbc[v];
                break;

            case 1:
                ps1 = "¿Cuándo " + scontmIespno[s] + vnbcs[v] + "?";
                ps1eng = "When " + scontmIdont[s] + vnbc[v];

                ps2 = "¿Cuándo " + scontmYouespno[s] + vnbcs[v] + "?";
                ps2eng = "When " + scontmYoudont[s] + vnbc[v];

                ps3 = "¿Cuándo " + scontmHeespno[s] + vnbcs[v] + "él?";
                ps3eng = "When " + scontmHedont[s] + vnbc[v];

                ps3ella = "¿Cuándo " + scontmSheespno[s] + vnbcs[v] + "ella?";
                ps3she = "When " + scontmShedont[s] + vnbc[v];

                ps3eso = "¿Cuándo " + scontmItespno[s] + vnbcs[v] + "eso?";
                ps3it = "When " + scontmItdont[s] + vnbc[v];

                ps4 = "¿Cuándo " + scontmTheyespno[s] + vnbcs[v] + "?";
                ps4eng = "When " + scontmTheydont[s] + vnbc[v];

                ps5 = "¿Cuándo " + scontmWeespno[s] + vnbcs[v] + "?";
                ps5eng = "When " + scontmWedont[s] + vnbc[v];
                break;
        }
    }//LR 13/12/2022
   public void GenWhenModalsPerf1() {
        switch (neg) {
            case 0:
                ps1 = "¿Cuándo " + sperfmIesp[s] + vpsp[v] + "?";
                ps1eng = "When " + sperfmI[s] + vpeng[v];

                ps2 = "¿Cuándo " + sperfmYouesp[s] + vpsp[v] + "?";
                ps2eng = "When " + sperfmYou[s] + vpeng[v];

                ps3 = "¿Cuándo " + sperfmHeesp[s] + vpsp[v] + "él?";
                ps3eng = "When " + sperfmHe[s] + vpeng[v];

                ps3ella = "¿Cuándo " + sperfmSheesp[s] + vpsp[v] + "ella?";
                ps3she = "When " + sperfmShe[s] + vpeng[v];

                ps3eso = "¿Cuándo " + sperfmItesp[s] + vpsp[v] + "eso?";
                ps3it = "When " + sperfmIt[s] + vpeng[v];

                ps4 = "¿Cuándo " + sperfmTheyesp[s] + vpsp[v] + "?";
                ps4eng = "When " + sperfmThey[s] + vpeng[v];

                ps5 = "¿Cuándo " + sperfmWeesp[s] + vpsp[v] + "?";
                ps5eng = "When " + sperfmWe[s] + vpeng[v];
                break;
            case 1:
                ps1 = "¿Cuándo " + sperfmIespno[s] + vpsp[v] + "?";
                ps1eng = "When " + sperfmIdont[s] + vpeng[v];

                ps2 = "¿Cuándo " + sperfmYouespno[s] + vpsp[v] + "?";
                ps2eng = "When " + sperfmYoudont[s] + vpeng[v];

                ps3 = "¿Cuándo " + sperfmHeespno[s] + vpsp[v] + "él?";
                ps3eng = "When " + sperfmHedont[s] + vpeng[v];

                ps3ella = "¿Cuándo " + sperfmSheespno[s] + vpsp[v] + "ella?";
                ps3she = "When " + sperfmShedont[s] + vpeng[v];

                ps3eso = "¿Cuándo " + sperfmItespno[s] + vpsp[v] + "eso?";
                ps3it = "When " + sperfmItdont[s] + vpeng[v];

                ps4 = "¿Cuándo " + sperfmTheyespno[s] + vpsp[v] + "?";
                ps4eng = "When " + sperfmTheydont[s] + vpeng[v];

                ps5 = "¿Cuándo " + sperfmWeespno[s] + vpsp[v] + "?";
                ps5eng = "When " + sperfmWedont[s] + vpeng[v];

                break;
        }
    }//LR 13/12/2022

   //Where
   public void GenWhereSimp1() {
        int neg = (int) (Math.random() * 6);
        int sr = (int) (Math.random() * 2);
        switch (neg) {
            //Presente
            case 0:
                ps1 = "¿Dónde " + vn1[v] + "?";
                ps1eng = "Where do i " + vnb[v];

                ps2 = "¿Dónde " + vn2[v] + "?";
                ps2eng = "Where do you " + vnb[v];

                ps3 = "¿Dónde " + vn3[v] + "él?";
                ps3eng = "Where does he " + vnb[v];

                ps3ella = "¿Dónde " + vn3[v] + "ella?";
                ps3she = "Where does she " + vnb[v];

                ps3eso = "¿Dónde " + vn3[v] + "eso?";
                ps3it = "Where does it " + vnb[v];

                ps4 = "¿Dónde " + vn4[v] + "?";
                ps4eng = "Where do they " + vnb[v];

                ps5 = "¿Dónde " + vn5[v] + "?";
                ps5eng = "Where do we " + vnb[v];
                break;
            case 1:
                ps1 = "¿Dónde no " + vn1[v] + "?";
                ps1eng = "Where don't i " + vnb[v];

                ps2 = "¿Dónde no " + vn2[v] + "?";
                ps2eng = "Where don't you " + vnb[v];

                ps3 = "¿Dónde no " + vn3[v] + "él?";
                ps3eng = "Where doesn't he " + vnb[v];

                ps3ella = "¿Dónde no " + vn3[v] + "ella?";
                ps3she = "Where doesn't she " + vnb[v];

                ps3eso = "¿Dónde no " + vn3[v] + "eso?";
                ps3it = "Where doesn't it " + vnb[v];

                ps4 = "¿Dónde no " + vn4[v] + "?";
                ps4eng = "Where don't they " + vnb[v];

                ps5 = "¿Dónde no " + vn5[v] + "?";
                ps5eng = "Where don't we " + vnb[v];
                break;

            //Pasado
            case 2:
                if (sr == 0) {
                    ps1 = "¿Dónde " + ps1pre[v] + "?";
                    ps1eng = "Where did i" + vnb[v];

                    ps2 = "¿Dónde " + ps2pre[v] + "?";
                    ps2eng = "Where did you " + vnb[v];

                    ps3 = "¿Dónde " + ps3p[v] + "él?";
                    ps3eng = "Where did he " + vnb[v];

                    ps3ella = "¿Dónde " + ps3p[v] + "ella?";
                    ps3she = "Where did she " + vnb[v];

                    ps3eso = "¿Dónde " + ps3p[v] + "eso?";
                    ps3it = "Where did it " + vnb[v];

                    ps4 = "¿Dónde " + vn4p[v] + "?";
                    ps4eng = "Where did they " + vnb[v];

                    ps5 = "¿Dónde " + vn5p[v] + "?";
                    ps5eng = "Where did we " + vnb[v];
                } else {
                    ps1 = "¿Dónde " + ps1imp[v] + "?";
                    ps1eng = "Where did i " + vnb[v];

                    ps2 = "¿Dónde " + ps2imp[v] + "?";
                    ps2eng = "Where did you " + vnb[v];

                    ps3 = "¿Dónde " + ps3imp[v] + "él?";
                    ps3eng = "Where did he " + vnb[v];

                    ps3ella = "¿Dónde " + ps3imp[v] + "ella?";
                    ps3she = "Where did she " + vnb[v];

                    ps3eso = "¿Dónde " + ps3imp[v] + "eso?";
                    ps3it = "Where did it " + vnb[v];

                    ps4 = "¿Dónde " + vn4imp[v] + "?";
                    ps4eng = "Where did they " + vnb[v];

                    ps5 = "¿Dónde " + vn5imp[v] + "?";
                    ps5eng = "Where did we " + vnb[v];
                }
                break;
            case 3:
                if (sr == 0) {
                    ps1 = "¿Dónde no " + ps1pre[v] + "?";
                    ps1eng = "Where didn't i " + vnb[v];

                    ps2 = "¿Dónde no " + ps2pre[v] + "?";
                    ps2eng = "Where didn't you " + vnb[v];

                    ps3 = "¿Dónde no " + ps3p[v] + "él?";
                    ps3eng = "Where didn't he " + vnb[v];

                    ps3ella = "¿Dónde no " + ps3p[v] + "ella?";
                    ps3she = "Where didn't she " + vnb[v];

                    ps3eso = "¿Dónde no " + ps3p[v] + "eso?";
                    ps3it = "Where didn't it " + vnb[v];

                    ps4 = "¿Dónde no " + vn4p[v] + "?";
                    ps4eng = "Where didn't they " + vnb[v];

                    ps5 = "¿Dónde no " + vn5p[v] + "?";
                    ps5eng = "Where didn't we " + vnb[v];
                } else {
                    ps1 = "¿Dónde no " + ps1imp[v] + "?";
                    ps1eng = "Where didn't i " + vnb[v];

                    ps2 = "¿Dónde no " + ps2imp[v] + "?";
                    ps2eng = "Where didn't you " + vnb[v];

                    ps3 = "¿Dónde no " + ps3imp[v] + "él?";
                    ps3eng = "Where didn't he " + vnb[v];

                    ps3ella = "¿Dónde no " + ps3imp[v] + "ella?";
                    ps3she = "Where didn't she " + vnb[v];

                    ps3eso = "¿Dónde no " + ps3imp[v] + "eso?";
                    ps3it = "Where didn't it " + vnb[v];

                    ps4 = "¿Dónde no " + vn4imp[v] + "?";
                    ps4eng = "Where didn't they " + vnb[v];

                    ps5 = "¿Dónde no " + vn5imp[v] + "?";
                    ps5eng = "Where didn't we " + vnb[v];
                }
                break;

            //Futuro
            case 4:
                ps1 = "¿Dónde " + vn1f[v] + "?";
                ps1eng = "Where will i " + vnb[v];

                ps2 = "¿Dónde " + vn2f[v] + "?";
                ps2eng = "Where will you " + vnb[v];

                ps3 = "¿Dónde " + vn3f[v] + "él?";
                ps3eng = "Where will he " + vnb[v];

                ps3ella = "¿Dónde " + vn3f[v] + "ella?";
                ps3she = "Where will she " + vnb[v];

                ps3eso = "¿Dónde " + vn3f[v] + "eso?";
                ps3it = "Where will it " + vnb[v];

                ps4 = "¿Dónde " + vn4f[v] + "?";
                ps4eng = "Where will they " + vnb[v];

                ps5 = "¿Dónde " + vn5f[v] + "?";
                ps5eng = "Where will we " + vnb[v];
                break;
            case 5:
                ps1 = "¿Dónde no " + vn1f[v] + "?";
                ps1eng = "Where won't i " + vnb[v];

                ps2 = "¿Dónde no " + vn2f[v] + "?";
                ps2eng = "Where won't you " + vnb[v];

                ps3 = "¿Dónde no " + vn3f[v] + "él?";
                ps3eng = "Where won't he " + vnb[v];

                ps3ella = "¿Dónde no " + vn3f[v] + "ella?";
                ps3she = "Where won't she " + vnb[v];

                ps3eso = "¿Dónde no " + vn3f[v] + "eso?";
                ps3it = "Where won't it " + vnb[v];

                ps4 = "¿Dónde no " + vn4f[v] + "?";
                ps4eng = "Where won't they " + vnb[v];

                ps5 = "¿Dónde no " + vn5f[v] + "?";
                ps5eng = "Where won't we " + vnb[v];
                break;
        }
    }//LR 13/12/2022
   public void GenWhereCont1() {
        switch (neg) {
            case 0:
                ps1 = "¿Dónde " + scontIesp[s] + vnbcs[v] + "?";
                ps1eng = "Where " + scontI[s] + vnbc[v];

                ps2 = "¿Dónde " + scontYouesp[s] + vnbcs[v] + "?";
                ps2eng = "Where " + scontYou[s] + vnbc[v];

                ps3 = "¿Dónde " + scontHeesp[s] + vnbcs[v] + "él?";
                ps3eng = "Where " + scontHe[s] + vnbc[v];

                ps3ella = "¿Dónde " + scontSheesp[s] + vnbcs[v] + "ella?";
                ps3she = "Where " + scontShe[s] + vnbc[v];

                ps3eso = "¿Dónde " + scontItesp[s] + vnbcs[v] + "eso?";
                ps3it = "Where " + scontIt[s] + vnbc[v];

                ps4 = "¿Dónde " + scontTheyesp[s] + vnbcs[v] + "?";
                ps4eng = "Where " + scontThey[s] + vnbc[v];

                ps5 = "¿Dónde " + scontWeesp[s] + vnbcs[v] + "?";
                ps5eng = "Where " + scontWe[s] + vnbc[v];
                break;

            case 1:
                ps1 = "¿Dónde " + scontIespno[s] + vnbcs[v] + "?";
                ps1eng = "Where " + scontIdont[s] + vnbc[v];

                ps2 = "¿Dónde " + scontYouespno[s] + vnbcs[v] + "?";
                ps2eng = "Where " + scontYoudont[s] + vnbc[v];

                ps3 = "¿Dónde " + scontHeespno[s] + vnbcs[v] + "él?";
                ps3eng = "Where " + scontHedont[s] + vnbc[v];

                ps3ella = "¿Dónde " + scontSheespno[s] + vnbcs[v] + "ella?";
                ps3she = "Where " + scontShedont[s] + vnbc[v];

                ps3eso = "¿Dónde " + scontItespno[s] + vnbcs[v] + "eso?";
                ps3it = "Where " + scontItdont[s] + vnbc[v];

                ps4 = "¿Dónde " + scontTheyespno[s] + vnbcs[v] + "?";
                ps4eng = "Where " + scontTheydont[s] + vnbc[v];

                ps5 = "¿Dónde " + scontWeespno[s] + vnbcs[v] + "?";
                ps5eng = "Where " + scontWedont[s] + vnbc[v];
                break;
        }
    }//LR 13/12/2022
   public void GenWherePerf1() {
        switch (neg) {
            case 0:
                ps1 = "¿Dónde " + sperfIesp[s] + vpsp[v] + "?";
                ps1eng = "Where " + sperfI[s] + vpeng[v];

                ps2 = "¿Dónde " + sperfYouesp[s] + vpsp[v] + "?";
                ps2eng = "Where " + sperfYou[s] + vpeng[v];

                ps3 = "¿Dónde " + sperfHeesp[s] + vpsp[v] + "él?";
                ps3eng = "Where " + sperfHe[s] + vpeng[v];

                ps3ella = "¿Dónde " + sperfSheesp[s] + vpsp[v] + "ella?";
                ps3she = "Where " + sperfShe[s] + vpeng[v];

                ps3eso = "¿Dónde " + sperfItesp[s] + vpsp[v] + "eso?";
                ps3it = "Where " + sperfIt[s] + vpeng[v];

                ps4 = "¿Dónde " + sperfTheyesp[s] + vpsp[v] + "?";
                ps4eng = "Where " + sperfThey[s] + vpeng[v];

                ps5 = "¿Dónde " + sperfWeesp[s] + vpsp[v] + "?";
                ps5eng = "Where " + sperfWe[s] + vpeng[v];
                break;
            case 1:
                ps1 = "¿Dónde " + sperfIespno[s] + vpsp[v] + "?";
                ps1eng = "Where " + sperfIdont[s] + vpeng[v];

                ps2 = "¿Dónde " + sperfYouespno[s] + vpsp[v] + "?";
                ps2eng = "Where " + sperfYoudont[s] + vpeng[v];

                ps3 = "¿Dónde " + sperfHeespno[s] + vpsp[v] + "él?";
                ps3eng = "Where " + sperfHedont[s] + vpeng[v];

                ps3ella = "¿Dónde " + sperfSheespno[s] + vpsp[v] + "ella?";
                ps3she = "Where " + sperfShedont[s] + vpeng[v];

                ps3eso = "¿Dónde " + sperfItespno[s] + vpsp[v] + "eso?";
                ps3it = "Where " + sperfItdont[s] + vpeng[v];

                ps4 = "¿Dónde " + sperfTheyespno[s] + vpsp[v] + "?";
                ps4eng = "Where " + sperfTheydont[s] + vpeng[v];

                ps5 = "¿Dónde " + sperfWeespno[s] + vpsp[v] + "?";
                ps5eng = "Where " + sperfWedont[s] + vpeng[v];

                break;
        }
    }//LR 13/12/2022

   //Where Modales
   public void GenWhereModalsSimp1(){
        int neg = (int) (Math.random() * 6);
        switch (neg){
            //Would
            case 0:
                ps1 = "¿Dónde " + vn1w[v] + "?";
                ps1eng = "Where " + "would i " + vnb[v];

                ps2 = "¿Dónde " + vn2w[v] + "?";
                ps2eng = "Where " + "would you " + vnb[v];

                ps3 = "¿Dónde " + vn3w[v] + "él?";
                ps3eng = "Where " + "would he " + vnb[v];

                ps3ella = "¿Dónde " + vn3w[v] + "ella?";
                ps3she = "Where " + "would she " + vnb[v];

                ps3eso = "¿Dónde " + vn3w[v] + "eso?";
                ps3it = "Where " + "would it " + vnb[v];

                ps4 = "¿Dónde " + vn4w[v] + "?";
                ps4eng = "Where " + "would they " + vnb[v];

                ps5 = "¿Dónde " + vn5w[v] + "?";
                ps5eng = "Where " + "would we " + vnb[v];
                break;
            case 1:
                ps1 = "¿Dónde no " + vn1w[v] + "?";
                ps1eng = "Where " + "wouldn't i " + vnb[v];

                ps2 = "¿Dónde no " + vn2w[v] + "?";
                ps2eng = "Where " + "wouldn't you " + vnb[v];

                ps3 = "¿Dónde no " + vn3w[v] + "él?";
                ps3eng = "Where " + "wouldn't he " + vnb[v];

                ps3ella = "¿Dónde no " + vn3w[v] + "ella?";
                ps3she = "Where " + "wouldn't she " + vnb[v];

                ps3eso = "¿Dónde no " + vn3w[v] + "eso?";
                ps3it = "Where " + "wouldn't it " + vnb[v];

                ps4 = "¿Dónde no " + vn4w[v] + "?";
                ps4eng = "Where " + "wouldn't they " + vnb[v];

                ps5 = "¿Dónde no " + vn5w[v] + "?";
                ps5eng = "Where " + "wouldn't we " + vnb[v];
                break;

            //Could
            case 2:
                ps1 = "¿Dónde " + "podría " + vnbs[v] + "?";
                ps1eng = "Where " + "could i " + vnb[v];

                ps2 = "¿Dónde " + "podrías " + vnbs[v] + "?";
                ps2eng = "Where " + "could you " + vnb[v];

                ps3 = "¿Dónde " + "podría " + vnbs[v] + "él?";
                ps3eng = "Where " + "could he " + vnb[v];

                ps3ella = "¿Dónde " + "podría " + vnbs[v] + "ella?";
                ps3she = "Where " + "could she " + vnb[v];

                ps3eso = "¿Dónde " + "podría " + vnbs[v] + "eso?";
                ps3it = "Where " + "could it " + vnb[v];

                ps4 = "¿Dónde " + "podrían " + vnbs[v] + "?";
                ps4eng = "Where " + "could they " + vnb[v];

                ps5 = "¿Dónde " + "podríamos " + vnbs[v] + "?";
                ps5eng = "Where " + "could we " + vnb[v];
                break;
            case 3:
                ps1 = "¿Dónde no " + "podría " + vnbs[v] + "?";
                ps1eng = "Where " + "couldn't i " + vnb[v];

                ps2 = "¿Dónde no " + "podrías " + vnbs[v] + "?";
                ps2eng = "Where " + "couldn't you " + vnb[v];

                ps3 = "¿Dónde no " + "podría " + vnbs[v] + "él?";
                ps3eng = "Where " + "couldn't he " + vnb[v];

                ps3ella = "¿Dónde no " + "podría " + vnbs[v] + "ella?";
                ps3she = "Where " + "couldn't she " + vnb[v];

                ps3eso = "¿Dónde no " + "podría " + vnbs[v] + "eso?";
                ps3it = "Where " + "couldn't it " + vnb[v];

                ps4 = "¿Dónde no " + "podrían " + vnbs[v] + "?";
                ps4eng = "Where " + "couldn't they " + vnb[v];

                ps5 = "¿Dónde no " + "podríamos " + vnbs[v] + "?";
                ps5eng = "Where " + "couldn't we " + vnb[v];
                break;

            //Should
            case 4:
                ps1 = "¿Dónde " + "debería " + vnbs[v] + "?";
                ps1eng = "Where " + "should i " + vnb[v];

                ps2 = "¿Dónde " + "deberías " + vnbs[v] + "?";
                ps2eng = "Where " + "should you " + vnb[v];

                ps3 = "¿Dónde " + "debería " + vnbs[v] + "él?";
                ps3eng = "Where " + "should he " + vnb[v];

                ps3ella = "¿Dónde " + "debería " + vnbs[v] + "ella?";
                ps3she = "Where " + "should she " + vnb[v];

                ps3eso = "¿Dónde " + "debería " + vnbs[v] + "eso?";
                ps3it = "Where " + "should it " + vnb[v];

                ps4 = "¿Dónde " + "deberían " + vnbs[v] + "?";
                ps4eng = "Where " + "should they " + vnb[v];

                ps5 = "¿Dónde " + "deberíamos " + vnbs[v] + "?";
                ps5eng = "Where " + "should we " + vnb[v];
                break;
            case 5:
                ps1 = "¿Dónde no " + "debería " + vnbs[v] + "?";
                ps1eng = "Where " + "shouldn't i " + vnb[v];

                ps2 = "¿Dónde no " + "deberías " + vnbs[v] + "?";
                ps2eng = "Where " + "shouldn't you " + vnb[v];

                ps3 = "¿Dónde no " + "debería " + vnbs[v] + "él?";
                ps3eng = "Where " + "shouldn't he " + vnb[v];

                ps3ella = "¿Dónde no " + "debería " + vnbs[v] + "ella?";
                ps3she = "Where " + "shouldn't she " + vnb[v];

                ps3eso = "¿Dónde no " + "debería " + vnbs[v] + "eso?";
                ps3it = "Where " + "shouldn't it " + vnb[v];

                ps4 = "¿Dónde no " + "deberían " + vnbs[v] + "?";
                ps4eng = "Where " + "shouldn't they " + vnb[v];

                ps5 = "¿Dónde no " + "deberíamos " + vnbs[v] + "?";
                ps5eng = "Where " + "shouldn't we " + vnb[v];
                break;

        }
    }//LR 13/12/2022
   public void GenWhereModalsCont1() {
        switch (neg) {
            case 0:
                ps1 = "¿Dónde " + scontmIesp[s] + vnbcs[v] + "?";
                ps1eng = "Where " + scontmI[s] + vnbc[v];

                ps2 = "¿Dónde " + scontmYouesp[s] + vnbcs[v] + "?";
                ps2eng = "Where " + scontmYou[s] + vnbc[v];

                ps3 = "¿Dónde " + scontmHeesp[s] + vnbcs[v] + "él?";
                ps3eng = "Where " + scontmHe[s] + vnbc[v];

                ps3ella = "¿Dónde " + scontmSheesp[s] + vnbcs[v] + "ella?";
                ps3she = "Where " + scontmShe[s] + vnbc[v];

                ps3eso = "¿Dónde " + scontmItesp[s] + vnbcs[v] + "eso?";
                ps3it = "Where " + scontmIt[s] + vnbc[v];

                ps4 = "¿Dónde " + scontmTheyesp[s] + vnbcs[v] + "?";
                ps4eng = "Where " + scontmThey[s] + vnbc[v];

                ps5 = "¿Dónde " + scontmWeesp[s] + vnbcs[v] + "?";
                ps5eng = "Where " + scontmWe[s] + vnbc[v];
                break;

            case 1:
                ps1 = "¿Dónde " + scontmIespno[s] + vnbcs[v] + "?";
                ps1eng = "Where " + scontmIdont[s] + vnbc[v];

                ps2 = "¿Dónde " + scontmYouespno[s] + vnbcs[v] + "?";
                ps2eng = "Where " + scontmYoudont[s] + vnbc[v];

                ps3 = "¿Dónde " + scontmHeespno[s] + vnbcs[v] + "él?";
                ps3eng = "Where " + scontmHedont[s] + vnbc[v];

                ps3ella = "¿Dónde " + scontmSheespno[s] + vnbcs[v] + "ella?";
                ps3she = "Where " + scontmShedont[s] + vnbc[v];

                ps3eso = "¿Dónde " + scontmItespno[s] + vnbcs[v] + "eso?";
                ps3it = "Where " + scontmItdont[s] + vnbc[v];

                ps4 = "¿Dónde " + scontmTheyespno[s] + vnbcs[v] + "?";
                ps4eng = "Where " + scontmTheydont[s] + vnbc[v];

                ps5 = "¿Dónde " + scontmWeespno[s] + vnbcs[v] + "?";
                ps5eng = "Where " + scontmWedont[s] + vnbc[v];
                break;
        }
    }//LR 13/12/2022
   public void GenWhereModalsPerf1() {
        switch (neg) {
            case 0:
                ps1 = "¿Dónde " + sperfmIesp[s] + vpsp[v] + "?";
                ps1eng = "Where " + sperfmI[s] + vpeng[v];

                ps2 = "¿Dónde " + sperfmYouesp[s] + vpsp[v] + "?";
                ps2eng = "Where " + sperfmYou[s] + vpeng[v];

                ps3 = "¿Dónde " + sperfmHeesp[s] + vpsp[v] + "él?";
                ps3eng = "Where " + sperfmHe[s] + vpeng[v];

                ps3ella = "¿Dónde " + sperfmSheesp[s] + vpsp[v] + "ella?";
                ps3she = "Where " + sperfmShe[s] + vpeng[v];

                ps3eso = "¿Dónde " + sperfmItesp[s] + vpsp[v] + "eso?";
                ps3it = "Where " + sperfmIt[s] + vpeng[v];

                ps4 = "¿Dónde " + sperfmTheyesp[s] + vpsp[v] + "?";
                ps4eng = "Where " + sperfmThey[s] + vpeng[v];

                ps5 = "¿Dónde " + sperfmWeesp[s] + vpsp[v] + "?";
                ps5eng = "Where " + sperfmWe[s] + vpeng[v];
                break;
            case 1:
                ps1 = "¿Dónde " + sperfmIespno[s] + vpsp[v] + "?";
                ps1eng = "Where " + sperfmIdont[s] + vpeng[v];

                ps2 = "¿Dónde " + sperfmYouespno[s] + vpsp[v] + "?";
                ps2eng = "Where " + sperfmYoudont[s] + vpeng[v];

                ps3 = "¿Dónde " + sperfmHeespno[s] + vpsp[v] + "él?";
                ps3eng = "Where " + sperfmHedont[s] + vpeng[v];

                ps3ella = "¿Dónde " + sperfmSheespno[s] + vpsp[v] + "ella?";
                ps3she = "Where " + sperfmShedont[s] + vpeng[v];

                ps3eso = "¿Dónde " + sperfmItespno[s] + vpsp[v] + "eso?";
                ps3it = "Where " + sperfmItdont[s] + vpeng[v];

                ps4 = "¿Dónde " + sperfmTheyespno[s] + vpsp[v] + "?";
                ps4eng = "Where " + sperfmTheydont[s] + vpeng[v];

                ps5 = "¿Dónde " + sperfmWeespno[s] + vpsp[v] + "?";
                ps5eng = "Where " + sperfmWedont[s] + vpeng[v];

                break;
        }
    }//LR 13/12/2022

   //Why
   public void GenWhySimp1() {
        int neg = (int) (Math.random() * 6);
        int sr = (int) (Math.random() * 2);
        switch (neg) {
            //Presente
            case 0:
                ps1 = "¿Por qué " + vn1[v] + "?";
                ps1eng = "Why do i " + vnb[v];

                ps2 = "¿Por qué " + vn2[v] + "?";
                ps2eng = "Why do you " + vnb[v];

                ps3 = "¿Por qué " + vn3[v] + "él?";
                ps3eng = "Why does he " + vnb[v];

                ps3ella = "¿Por qué " + vn3[v] + "ella?";
                ps3she = "Why does she " + vnb[v];

                ps3eso = "¿Por qué " + vn3[v] + "eso?";
                ps3it = "Why does it " + vnb[v];

                ps4 = "¿Por qué " + vn4[v] + "?";
                ps4eng = "Why do they " + vnb[v];

                ps5 = "¿Por qué " + vn5[v] + "?";
                ps5eng = "Why do we " + vnb[v];
                break;
            case 1:
                ps1 = "¿Por qué no " + vn1[v] + "?";
                ps1eng = "Why don't i " + vnb[v];

                ps2 = "¿Por qué no " + vn2[v] + "?";
                ps2eng = "Why don't you " + vnb[v];

                ps3 = "¿Por qué no " + vn3[v] + "él?";
                ps3eng = "Why doesn't he " + vnb[v];

                ps3ella = "¿Por qué no " + vn3[v] + "ella?";
                ps3she = "Why doesn't she " + vnb[v];

                ps3eso = "¿Por qué no " + vn3[v] + "eso?";
                ps3it = "Why doesn't it " + vnb[v];

                ps4 = "¿Por qué no " + vn4[v] + "?";
                ps4eng = "Why don't they " + vnb[v];

                ps5 = "¿Por qué no " + vn5[v] + "?";
                ps5eng = "Why don't we " + vnb[v];
                break;

            //Pasado
            case 2:
                if (sr == 0) {
                    ps1 = "¿Por qué " + ps1pre[v] + "?";
                    ps1eng = "Why did i" + vnb[v];

                    ps2 = "¿Por qué " + ps2pre[v] + "?";
                    ps2eng = "Why did you " + vnb[v];

                    ps3 = "¿Por qué " + ps3p[v] + "él?";
                    ps3eng = "Why did he " + vnb[v];

                    ps3ella = "¿Por qué " + ps3p[v] + "ella?";
                    ps3she = "Why did she " + vnb[v];

                    ps3eso = "¿Por qué " + ps3p[v] + "eso?";
                    ps3it = "Why did it " + vnb[v];

                    ps4 = "¿Por qué " + vn4p[v] + "?";
                    ps4eng = "Why did they " + vnb[v];

                    ps5 = "¿Por qué " + vn5p[v] + "?";
                    ps5eng = "Why did we " + vnb[v];
                } else {
                    ps1 = "¿Por qué " + ps1imp[v] + "?";
                    ps1eng = "Why did i " + vnb[v];

                    ps2 = "¿Por qué " + ps2imp[v] + "?";
                    ps2eng = "Why did you " + vnb[v];

                    ps3 = "¿Por qué " + ps3imp[v] + "él?";
                    ps3eng = "Why did he " + vnb[v];

                    ps3ella = "¿Por qué " + ps3imp[v] + "ella?";
                    ps3she = "Why did she " + vnb[v];

                    ps3eso = "¿Por qué " + ps3imp[v] + "eso?";
                    ps3it = "Why did it " + vnb[v];

                    ps4 = "¿Por qué " + vn4imp[v] + "?";
                    ps4eng = "Why did they " + vnb[v];

                    ps5 = "¿Por qué " + vn5imp[v] + "?";
                    ps5eng = "Why did we " + vnb[v];
                }
                break;
            case 3:
                if (sr == 0) {
                    ps1 = "¿Por qué no " + ps1pre[v] + "?";
                    ps1eng = "Why didn't i " + vnb[v];

                    ps2 = "¿Por qué no " + ps2pre[v] + "?";
                    ps2eng = "Why didn't you " + vnb[v];

                    ps3 = "¿Por qué no " + ps3p[v] + "él?";
                    ps3eng = "Why didn't he " + vnb[v];

                    ps3ella = "¿Por qué no " + ps3p[v] + "ella?";
                    ps3she = "Why didn't she " + vnb[v];

                    ps3eso = "¿Por qué no " + ps3p[v] + "eso?";
                    ps3it = "Why didn't it " + vnb[v];

                    ps4 = "¿Por qué no " + vn4p[v] + "?";
                    ps4eng = "Why didn't they " + vnb[v];

                    ps5 = "¿Por qué no " + vn5p[v] + "?";
                    ps5eng = "Why didn't we " + vnb[v];
                } else {
                    ps1 = "¿Por qué no " + ps1imp[v] + "?";
                    ps1eng = "Why didn't i " + vnb[v];

                    ps2 = "¿Por qué no " + ps2imp[v] + "?";
                    ps2eng = "Why didn't you " + vnb[v];

                    ps3 = "¿Por qué no " + ps3imp[v] + "él?";
                    ps3eng = "Why didn't he " + vnb[v];

                    ps3ella = "¿Por qué no " + ps3imp[v] + "ella?";
                    ps3she = "Why didn't she " + vnb[v];

                    ps3eso = "¿Por qué no " + ps3imp[v] + "eso?";
                    ps3it = "Why didn't it " + vnb[v];

                    ps4 = "¿Por qué no " + vn4imp[v] + "?";
                    ps4eng = "Why didn't they " + vnb[v];

                    ps5 = "¿Por qué no " + vn5imp[v] + "?";
                    ps5eng = "Why didn't we " + vnb[v];
                }
                break;

            //Futuro
            case 4:
                ps1 = "¿Por qué " + vn1f[v] + "?";
                ps1eng = "Why will i " + vnb[v];

                ps2 = "¿Por qué " + vn2f[v] + "?";
                ps2eng = "Why will you " + vnb[v];

                ps3 = "¿Por qué " + vn3f[v] + "él?";
                ps3eng = "Why will he " + vnb[v];

                ps3ella = "¿Por qué " + vn3f[v] + "ella?";
                ps3she = "Why will she " + vnb[v];

                ps3eso = "¿Por qué " + vn3f[v] + "eso?";
                ps3it = "Why will it " + vnb[v];

                ps4 = "¿Por qué " + vn4f[v] + "?";
                ps4eng = "Why will they " + vnb[v];

                ps5 = "¿Por qué " + vn5f[v] + "?";
                ps5eng = "Why will we " + vnb[v];
                break;
            case 5:
                ps1 = "¿Por qué no " + vn1f[v] + "?";
                ps1eng = "Why won't i " + vnb[v];

                ps2 = "¿Por qué no " + vn2f[v] + "?";
                ps2eng = "Why won't you " + vnb[v];

                ps3 = "¿Por qué no " + vn3f[v] + "él?";
                ps3eng = "Why won't he " + vnb[v];

                ps3ella = "¿Por qué no " + vn3f[v] + "ella?";
                ps3she = "Why won't she " + vnb[v];

                ps3eso = "¿Por qué no " + vn3f[v] + "eso?";
                ps3it = "Why won't it " + vnb[v];

                ps4 = "¿Por qué no " + vn4f[v] + "?";
                ps4eng = "Why won't they " + vnb[v];

                ps5 = "¿Por qué no " + vn5f[v] + "?";
                ps5eng = "Why won't we " + vnb[v];
                break;
        }
    }//LR 13/12/2022
   public void GenWhyCont1() {
        switch (neg) {
            case 0:
                ps1 = "¿Por qué " + scontIesp[s] + vnbcs[v] + "?";
                ps1eng = "Why " + scontI[s] + vnbc[v];

                ps2 = "¿Por qué " + scontYouesp[s] + vnbcs[v] + "?";
                ps2eng = "Why " + scontYou[s] + vnbc[v];

                ps3 = "¿Por qué " + scontHeesp[s] + vnbcs[v] + "él?";
                ps3eng = "Why " + scontHe[s] + vnbc[v];

                ps3ella = "¿Por qué " + scontSheesp[s] + vnbcs[v] + "ella?";
                ps3she = "Why " + scontShe[s] + vnbc[v];

                ps3eso = "¿Por qué " + scontItesp[s] + vnbcs[v] + "eso?";
                ps3it = "Why " + scontIt[s] + vnbc[v];

                ps4 = "¿Por qué " + scontTheyesp[s] + vnbcs[v] + "?";
                ps4eng = "Why " + scontThey[s] + vnbc[v];

                ps5 = "¿Por qué " + scontWeesp[s] + vnbcs[v] + "?";
                ps5eng = "Why " + scontWe[s] + vnbc[v];
                break;

            case 1:
                ps1 = "¿Por qué " + scontIespno[s] + vnbcs[v] + "?";
                ps1eng = "Why " + scontIdont[s] + vnbc[v];

                ps2 = "¿Por qué " + scontYouespno[s] + vnbcs[v] + "?";
                ps2eng = "Why " + scontYoudont[s] + vnbc[v];

                ps3 = "¿Por qué " + scontHeespno[s] + vnbcs[v] + "él?";
                ps3eng = "Why " + scontHedont[s] + vnbc[v];

                ps3ella = "¿Por qué " + scontSheespno[s] + vnbcs[v] + "ella?";
                ps3she = "Why " + scontShedont[s] + vnbc[v];

                ps3eso = "¿Por qué " + scontItespno[s] + vnbcs[v] + "eso?";
                ps3it = "Why " + scontItdont[s] + vnbc[v];

                ps4 = "¿Por qué " + scontTheyespno[s] + vnbcs[v] + "?";
                ps4eng = "Why " + scontTheydont[s] + vnbc[v];

                ps5 = "¿Por qué " + scontWeespno[s] + vnbcs[v] + "?";
                ps5eng = "Why " + scontWedont[s] + vnbc[v];
                break;
        }
    }//LR 13/12/2022
   public void GenWhyPerf1() {
        switch (neg) {
            case 0:
                ps1 = "¿Por qué " + sperfIesp[s] + vpsp[v] + "?";
                ps1eng = "Why " + sperfI[s] + vpeng[v];

                ps2 = "¿Por qué " + sperfYouesp[s] + vpsp[v] + "?";
                ps2eng = "Why " + sperfYou[s] + vpeng[v];

                ps3 = "¿Por qué " + sperfHeesp[s] + vpsp[v] + "él?";
                ps3eng = "Why " + sperfHe[s] + vpeng[v];

                ps3ella = "¿Por qué " + sperfSheesp[s] + vpsp[v] + "ella?";
                ps3she = "Why " + sperfShe[s] + vpeng[v];

                ps3eso = "¿Por qué " + sperfItesp[s] + vpsp[v] + "eso?";
                ps3it = "Why " + sperfIt[s] + vpeng[v];

                ps4 = "¿Por qué " + sperfTheyesp[s] + vpsp[v] + "?";
                ps4eng = "Why " + sperfThey[s] + vpeng[v];

                ps5 = "¿Por qué " + sperfWeesp[s] + vpsp[v] + "?";
                ps5eng = "Why " + sperfWe[s] + vpeng[v];
                break;
            case 1:
                ps1 = "¿Por qué " + sperfIespno[s] + vpsp[v] + "?";
                ps1eng = "Why " + sperfIdont[s] + vpeng[v];

                ps2 = "¿Por qué " + sperfYouespno[s] + vpsp[v] + "?";
                ps2eng = "Why " + sperfYoudont[s] + vpeng[v];

                ps3 = "¿Por qué " + sperfHeespno[s] + vpsp[v] + "él?";
                ps3eng = "Why " + sperfHedont[s] + vpeng[v];

                ps3ella = "¿Por qué " + sperfSheespno[s] + vpsp[v] + "ella?";
                ps3she = "Why " + sperfShedont[s] + vpeng[v];

                ps3eso = "¿Por qué " + sperfItespno[s] + vpsp[v] + "eso?";
                ps3it = "Why " + sperfItdont[s] + vpeng[v];

                ps4 = "¿Por qué " + sperfTheyespno[s] + vpsp[v] + "?";
                ps4eng = "Why " + sperfTheydont[s] + vpeng[v];

                ps5 = "¿Por qué " + sperfWeespno[s] + vpsp[v] + "?";
                ps5eng = "Why " + sperfWedont[s] + vpeng[v];

                break;
        }
    }//LR 13/12/2022

   //Why Modales
   public void GenWhyModalsSimp1(){
        int neg = (int) (Math.random() * 6);
        switch (neg){
            //Would
            case 0:
                ps1 = "¿Por qué " + vn1w[v] + "?";
                ps1eng = "Why " + "would i " + vnb[v];

                ps2 = "¿Por qué " + vn2w[v] + "?";
                ps2eng = "Why " + "would you " + vnb[v];

                ps3 = "¿Por qué " + vn3w[v] + "él?";
                ps3eng = "Why " + "would he " + vnb[v];

                ps3ella = "¿Por qué " + vn3w[v] + "ella?";
                ps3she = "Why " + "would she " + vnb[v];

                ps3eso = "¿Por qué " + vn3w[v] + "eso?";
                ps3it = "Why " + "would it " + vnb[v];

                ps4 = "¿Por qué " + vn4w[v] + "?";
                ps4eng = "Why " + "would they " + vnb[v];

                ps5 = "¿Por qué " + vn5w[v] + "?";
                ps5eng = "Why " + "would we " + vnb[v];
                break;
            case 1:
                ps1 = "¿Por qué no " + vn1w[v] + "?";
                ps1eng = "Why " + "wouldn't i " + vnb[v];

                ps2 = "¿Por qué no " + vn2w[v] + "?";
                ps2eng = "Why " + "wouldn't you " + vnb[v];

                ps3 = "¿Por qué no " + vn3w[v] + "él?";
                ps3eng = "Why " + "wouldn't he " + vnb[v];

                ps3ella = "¿Por qué no " + vn3w[v] + "ella?";
                ps3she = "Why " + "wouldn't she " + vnb[v];

                ps3eso = "¿Por qué no " + vn3w[v] + "eso?";
                ps3it = "Why " + "wouldn't it " + vnb[v];

                ps4 = "¿Por qué no " + vn4w[v] + "?";
                ps4eng = "Why " + "wouldn't they " + vnb[v];

                ps5 = "¿Por qué no " + vn5w[v] + "?";
                ps5eng = "Why " + "wouldn't we " + vnb[v];
                break;

            //Could
            case 2:
                ps1 = "¿Por qué " + "podría " + vnbs[v] + "?";
                ps1eng = "Why " + "could i " + vnb[v];

                ps2 = "¿Por qué " + "podrías " + vnbs[v] + "?";
                ps2eng = "Why " + "could you " + vnb[v];

                ps3 = "¿Por qué " + "podría " + vnbs[v] + "él?";
                ps3eng = "Why " + "could he " + vnb[v];

                ps3ella = "¿Por qué " + "podría " + vnbs[v] + "ella?";
                ps3she = "Why " + "could she " + vnb[v];

                ps3eso = "¿Por qué " + "podría " + vnbs[v] + "eso?";
                ps3it = "Why " + "could it " + vnb[v];

                ps4 = "¿Por qué " + "podrían " + vnbs[v] + "?";
                ps4eng = "Why " + "could they " + vnb[v];

                ps5 = "¿Por qué " + "podríamos " + vnbs[v] + "?";
                ps5eng = "Why " + "could we " + vnb[v];
                break;
            case 3:
                ps1 = "¿Por qué no " + "podría " + vnbs[v] + "?";
                ps1eng = "Why " + "couldn't i " + vnb[v];

                ps2 = "¿Por qué no " + "podrías " + vnbs[v] + "?";
                ps2eng = "Why " + "couldn't you " + vnb[v];

                ps3 = "¿Por qué no " + "podría " + vnbs[v] + "él?";
                ps3eng = "Why " + "couldn't he " + vnb[v];

                ps3ella = "¿Por qué no " + "podría " + vnbs[v] + "ella?";
                ps3she = "Why " + "couldn't she " + vnb[v];

                ps3eso = "¿Por qué no " + "podría " + vnbs[v] + "eso?";
                ps3it = "Why " + "couldn't it " + vnb[v];

                ps4 = "¿Por qué no " + "podrían " + vnbs[v] + "?";
                ps4eng = "Why " + "couldn't they " + vnb[v];

                ps5 = "¿Por qué no " + "podríamos " + vnbs[v] + "?";
                ps5eng = "Why " + "couldn't we " + vnb[v];
                break;

            //Should
            case 4:
                ps1 = "¿Por qué " + "debería " + vnbs[v] + "?";
                ps1eng = "Why " + "should i " + vnb[v];

                ps2 = "¿Por qué " + "deberías " + vnbs[v] + "?";
                ps2eng = "Why " + "should you " + vnb[v];

                ps3 = "¿Por qué " + "debería " + vnbs[v] + "él?";
                ps3eng = "Why " + "should he " + vnb[v];

                ps3ella = "¿Por qué " + "debería " + vnbs[v] + "ella?";
                ps3she = "Why " + "should she " + vnb[v];

                ps3eso = "¿Por qué " + "debería " + vnbs[v] + "eso?";
                ps3it = "Why " + "should it " + vnb[v];

                ps4 = "¿Por qué " + "deberían " + vnbs[v] + "?";
                ps4eng = "Why " + "should they " + vnb[v];

                ps5 = "¿Por qué " + "deberíamos " + vnbs[v] + "?";
                ps5eng = "Why " + "should we " + vnb[v];
                break;
            case 5:
                ps1 = "¿Por qué no " + "debería " + vnbs[v] + "?";
                ps1eng = "Why " + "shouldn't i " + vnb[v];

                ps2 = "¿Por qué no " + "deberías " + vnbs[v] + "?";
                ps2eng = "Why " + "shouldn't you " + vnb[v];

                ps3 = "¿Por qué no " + "debería " + vnbs[v] + "él?";
                ps3eng = "Why " + "shouldn't he " + vnb[v];

                ps3ella = "¿Por qué no " + "debería " + vnbs[v] + "ella?";
                ps3she = "Why " + "shouldn't she " + vnb[v];

                ps3eso = "¿Por qué no " + "debería " + vnbs[v] + "eso?";
                ps3it = "Why " + "shouldn't it " + vnb[v];

                ps4 = "¿Por qué no " + "deberían " + vnbs[v] + "?";
                ps4eng = "Why " + "shouldn't they " + vnb[v];

                ps5 = "¿Por qué no " + "deberíamos " + vnbs[v] + "?";
                ps5eng = "Why " + "shouldn't we " + vnb[v];
                break;

        }
    }//LR 13/12/2022
   public void GenWhyModalsCont1() {
        switch (neg) {
            case 0:
                ps1 = "¿Por qué " + scontmIesp[s] + vnbcs[v] + "?";
                ps1eng = "Why " + scontmI[s] + vnbc[v];

                ps2 = "¿Por qué " + scontmYouesp[s] + vnbcs[v] + "?";
                ps2eng = "Why " + scontmYou[s] + vnbc[v];

                ps3 = "¿Por qué " + scontmHeesp[s] + vnbcs[v] + "él?";
                ps3eng = "Why " + scontmHe[s] + vnbc[v];

                ps3ella = "¿Por qué " + scontmSheesp[s] + vnbcs[v] + "ella?";
                ps3she = "Why " + scontmShe[s] + vnbc[v];

                ps3eso = "¿Por qué " + scontmItesp[s] + vnbcs[v] + "eso?";
                ps3it = "Why " + scontmIt[s] + vnbc[v];

                ps4 = "¿Por qué " + scontmTheyesp[s] + vnbcs[v] + "?";
                ps4eng = "Why " + scontmThey[s] + vnbc[v];

                ps5 = "¿Por qué " + scontmWeesp[s] + vnbcs[v] + "?";
                ps5eng = "Why " + scontmWe[s] + vnbc[v];
                break;

            case 1:
                ps1 = "¿Por qué " + scontmIespno[s] + vnbcs[v] + "?";
                ps1eng = "Why " + scontmIdont[s] + vnbc[v];

                ps2 = "¿Por qué " + scontmYouespno[s] + vnbcs[v] + "?";
                ps2eng = "Why " + scontmYoudont[s] + vnbc[v];

                ps3 = "¿Por qué " + scontmHeespno[s] + vnbcs[v] + "él?";
                ps3eng = "Why " + scontmHedont[s] + vnbc[v];

                ps3ella = "¿Por qué " + scontmSheespno[s] + vnbcs[v] + "ella?";
                ps3she = "Why " + scontmShedont[s] + vnbc[v];

                ps3eso = "¿Por qué " + scontmItespno[s] + vnbcs[v] + "eso?";
                ps3it = "Why " + scontmItdont[s] + vnbc[v];

                ps4 = "¿Por qué " + scontmTheyespno[s] + vnbcs[v] + "?";
                ps4eng = "Why " + scontmTheydont[s] + vnbc[v];

                ps5 = "¿Por qué " + scontmWeespno[s] + vnbcs[v] + "?";
                ps5eng = "Why " + scontmWedont[s] + vnbc[v];
                break;
        }
    }//LR 13/12/2022
   public void GenWhyModalsPerf1() {
        switch (neg) {
            case 0:
                ps1 = "¿Por qué " + sperfmIesp[s] + vpsp[v] + "?";
                ps1eng = "Why " + sperfmI[s] + vpeng[v];

                ps2 = "¿Por qué " + sperfmYouesp[s] + vpsp[v] + "?";
                ps2eng = "Why " + sperfmYou[s] + vpeng[v];

                ps3 = "¿Por qué " + sperfmHeesp[s] + vpsp[v] + "él?";
                ps3eng = "Why " + sperfmHe[s] + vpeng[v];

                ps3ella = "¿Por qué " + sperfmSheesp[s] + vpsp[v] + "ella?";
                ps3she = "Why " + sperfmShe[s] + vpeng[v];

                ps3eso = "¿Por qué " + sperfmItesp[s] + vpsp[v] + "eso?";
                ps3it = "Why " + sperfmIt[s] + vpeng[v];

                ps4 = "¿Por qué " + sperfmTheyesp[s] + vpsp[v] + "?";
                ps4eng = "Why " + sperfmThey[s] + vpeng[v];

                ps5 = "¿Por qué " + sperfmWeesp[s] + vpsp[v] + "?";
                ps5eng = "Why " + sperfmWe[s] + vpeng[v];
                break;
            case 1:
                ps1 = "¿Por qué " + sperfmIespno[s] + vpsp[v] + "?";
                ps1eng = "Why " + sperfmIdont[s] + vpeng[v];

                ps2 = "¿Por qué " + sperfmYouespno[s] + vpsp[v] + "?";
                ps2eng = "Why " + sperfmYoudont[s] + vpeng[v];

                ps3 = "¿Por qué " + sperfmHeespno[s] + vpsp[v] + "él?";
                ps3eng = "Why " + sperfmHedont[s] + vpeng[v];

                ps3ella = "¿Por qué " + sperfmSheespno[s] + vpsp[v] + "ella?";
                ps3she = "Why " + sperfmShedont[s] + vpeng[v];

                ps3eso = "¿Por qué " + sperfmItespno[s] + vpsp[v] + "eso?";
                ps3it = "Why " + sperfmItdont[s] + vpeng[v];

                ps4 = "¿Por qué " + sperfmTheyespno[s] + vpsp[v] + "?";
                ps4eng = "Why " + sperfmTheydont[s] + vpeng[v];

                ps5 = "¿Por qué " + sperfmWeespno[s] + vpsp[v] + "?";
                ps5eng = "Why " + sperfmWedont[s] + vpeng[v];

                break;
        }
    }//LR 13/12/2022

   //Who
   public void GenWhoSimp1() {
        int neg = (int) (Math.random() * 6);
        int sr = (int) (Math.random() * 2);
        switch (neg) {
            //Presente
            case 0:
                ps1 = "¿Quién " + vn1[v] + "?";
                ps1eng = "Who do i " + vnb[v];

                ps2 = "¿Quién " + vn2[v] + "?";
                ps2eng = "Who do you " + vnb[v];

                ps3 = "¿Quién " + vn3[v] + "él?";
                ps3eng = "Who does he " + vnb[v];

                ps3ella = "¿Quién " + vn3[v] + "ella?";
                ps3she = "Who does she " + vnb[v];

                ps3eso = "¿Quién " + vn3[v] + "eso?";
                ps3it = "Who does it " + vnb[v];

                ps4 = "¿Quién " + vn4[v] + "?";
                ps4eng = "Who do they " + vnb[v];

                ps5 = "¿Quién " + vn5[v] + "?";
                ps5eng = "Who do we " + vnb[v];
                break;
            case 1:
                ps1 = "¿Quién no " + vn1[v] + "?";
                ps1eng = "Who don't i " + vnb[v];

                ps2 = "¿Quién no " + vn2[v] + "?";
                ps2eng = "Who don't you " + vnb[v];

                ps3 = "¿Quién no " + vn3[v] + "él?";
                ps3eng = "Who doesn't he " + vnb[v];

                ps3ella = "¿Quién no " + vn3[v] + "ella?";
                ps3she = "Who doesn't she " + vnb[v];

                ps3eso = "¿Quién no " + vn3[v] + "eso?";
                ps3it = "Who doesn't it " + vnb[v];

                ps4 = "¿Quién no " + vn4[v] + "?";
                ps4eng = "Who don't they " + vnb[v];

                ps5 = "¿Quién no " + vn5[v] + "?";
                ps5eng = "Who don't we " + vnb[v];
                break;

            //Pasado
            case 2:
                if (sr == 0) {
                    ps1 = "¿Quién " + ps1pre[v] + "?";
                    ps1eng = "Who did i" + vnb[v];

                    ps2 = "¿Quién " + ps2pre[v] + "?";
                    ps2eng = "Who did you " + vnb[v];

                    ps3 = "¿Quién " + ps3p[v] + "él?";
                    ps3eng = "Who did he " + vnb[v];

                    ps3ella = "¿Quién " + ps3p[v] + "ella?";
                    ps3she = "Who did she " + vnb[v];

                    ps3eso = "¿Quién " + ps3p[v] + "eso?";
                    ps3it = "Who did it " + vnb[v];

                    ps4 = "¿Quién " + vn4p[v] + "?";
                    ps4eng = "Who did they " + vnb[v];

                    ps5 = "¿Quién " + vn5p[v] + "?";
                    ps5eng = "Who did we " + vnb[v];
                } else {
                    ps1 = "¿Quién " + ps1imp[v] + "?";
                    ps1eng = "Who did i " + vnb[v];

                    ps2 = "¿Quién " + ps2imp[v] + "?";
                    ps2eng = "Who did you " + vnb[v];

                    ps3 = "¿Quién " + ps3imp[v] + "él?";
                    ps3eng = "Who did he " + vnb[v];

                    ps3ella = "¿Quién " + ps3imp[v] + "ella?";
                    ps3she = "Who did she " + vnb[v];

                    ps3eso = "¿Quién " + ps3imp[v] + "eso?";
                    ps3it = "Who did it " + vnb[v];

                    ps4 = "¿Quién " + vn4imp[v] + "?";
                    ps4eng = "Who did they " + vnb[v];

                    ps5 = "¿Quién " + vn5imp[v] + "?";
                    ps5eng = "Who did we " + vnb[v];
                }
                break;
            case 3:
                if (sr == 0) {
                    ps1 = "¿Quién no " + ps1pre[v] + "?";
                    ps1eng = "Who didn't i " + vnb[v];

                    ps2 = "¿Quién no " + ps2pre[v] + "?";
                    ps2eng = "Who didn't you " + vnb[v];

                    ps3 = "¿Quién no " + ps3p[v] + "él?";
                    ps3eng = "Who didn't he " + vnb[v];

                    ps3ella = "¿Quién no " + ps3p[v] + "ella?";
                    ps3she = "Who didn't she " + vnb[v];

                    ps3eso = "¿Quién no " + ps3p[v] + "eso?";
                    ps3it = "Who didn't it " + vnb[v];

                    ps4 = "¿Quién no " + vn4p[v] + "?";
                    ps4eng = "Who didn't they " + vnb[v];

                    ps5 = "¿Quién no " + vn5p[v] + "?";
                    ps5eng = "Who didn't we " + vnb[v];
                } else {
                    ps1 = "¿Quién no " + ps1imp[v] + "?";
                    ps1eng = "Who didn't i " + vnb[v];

                    ps2 = "¿Quién no " + ps2imp[v] + "?";
                    ps2eng = "Who didn't you " + vnb[v];

                    ps3 = "¿Quién no " + ps3imp[v] + "él?";
                    ps3eng = "Who didn't he " + vnb[v];

                    ps3ella = "¿Quién no " + ps3imp[v] + "ella?";
                    ps3she = "Who didn't she " + vnb[v];

                    ps3eso = "¿Quién no " + ps3imp[v] + "eso?";
                    ps3it = "Who didn't it " + vnb[v];

                    ps4 = "¿Quién no " + vn4imp[v] + "?";
                    ps4eng = "Who didn't they " + vnb[v];

                    ps5 = "¿Quién no " + vn5imp[v] + "?";
                    ps5eng = "Who didn't we " + vnb[v];
                }
                break;

            //Futuro
            case 4:
                ps1 = "¿Quién " + vn1f[v] + "?";
                ps1eng = "Who will i " + vnb[v];

                ps2 = "¿Quién " + vn2f[v] + "?";
                ps2eng = "Who will you " + vnb[v];

                ps3 = "¿Quién " + vn3f[v] + "él?";
                ps3eng = "Who will he " + vnb[v];

                ps3ella = "¿Quién " + vn3f[v] + "ella?";
                ps3she = "Who will she " + vnb[v];

                ps3eso = "¿Quién " + vn3f[v] + "eso?";
                ps3it = "Who will it " + vnb[v];

                ps4 = "¿Quién " + vn4f[v] + "?";
                ps4eng = "Who will they " + vnb[v];

                ps5 = "¿Quién " + vn5f[v] + "?";
                ps5eng = "Who will we " + vnb[v];
                break;
            case 5:
                ps1 = "¿Quién no " + vn1f[v] + "?";
                ps1eng = "Who won't i " + vnb[v];

                ps2 = "¿Quién no " + vn2f[v] + "?";
                ps2eng = "Who won't you " + vnb[v];

                ps3 = "¿Quién no " + vn3f[v] + "él?";
                ps3eng = "Who won't he " + vnb[v];

                ps3ella = "¿Quién no " + vn3f[v] + "ella?";
                ps3she = "Who won't she " + vnb[v];

                ps3eso = "¿Quién no " + vn3f[v] + "eso?";
                ps3it = "Who won't it " + vnb[v];

                ps4 = "¿Quién no " + vn4f[v] + "?";
                ps4eng = "Who won't they " + vnb[v];

                ps5 = "¿Quién no " + vn5f[v] + "?";
                ps5eng = "Who won't we " + vnb[v];
                break;
        }
    }//LR 13/12/2022
   public void GenWhoCont1() {
        switch (neg) {
            case 0:
                ps1 = "¿Quién " + scontIesp[s] + vnbcs[v] + "?";
                ps1eng = "Who " + scontI[s] + vnbc[v];

                ps2 = "¿Quién " + scontYouesp[s] + vnbcs[v] + "?";
                ps2eng = "Who " + scontYou[s] + vnbc[v];

                ps3 = "¿Quién " + scontHeesp[s] + vnbcs[v] + "él?";
                ps3eng = "Who " + scontHe[s] + vnbc[v];

                ps3ella = "¿Quién " + scontSheesp[s] + vnbcs[v] + "ella?";
                ps3she = "Who " + scontShe[s] + vnbc[v];

                ps3eso = "¿Quién " + scontItesp[s] + vnbcs[v] + "eso?";
                ps3it = "Who " + scontIt[s] + vnbc[v];

                ps4 = "¿Quién " + scontTheyesp[s] + vnbcs[v] + "?";
                ps4eng = "Who " + scontThey[s] + vnbc[v];

                ps5 = "¿Quién " + scontWeesp[s] + vnbcs[v] + "?";
                ps5eng = "Who " + scontWe[s] + vnbc[v];
                break;

            case 1:
                ps1 = "¿Quién " + scontIespno[s] + vnbcs[v] + "?";
                ps1eng = "Who " + scontIdont[s] + vnbc[v];

                ps2 = "¿Quién " + scontYouespno[s] + vnbcs[v] + "?";
                ps2eng = "Who " + scontYoudont[s] + vnbc[v];

                ps3 = "¿Quién " + scontHeespno[s] + vnbcs[v] + "él?";
                ps3eng = "Who " + scontHedont[s] + vnbc[v];

                ps3ella = "¿Quién " + scontSheespno[s] + vnbcs[v] + "ella?";
                ps3she = "Who " + scontShedont[s] + vnbc[v];

                ps3eso = "¿Quién " + scontItespno[s] + vnbcs[v] + "eso?";
                ps3it = "Who " + scontItdont[s] + vnbc[v];

                ps4 = "¿Quién " + scontTheyespno[s] + vnbcs[v] + "?";
                ps4eng = "Who " + scontTheydont[s] + vnbc[v];

                ps5 = "¿Quién " + scontWeespno[s] + vnbcs[v] + "?";
                ps5eng = "Who " + scontWedont[s] + vnbc[v];
                break;
        }
    }//LR 13/12/2022
   public void GenWhoPerf1() {
        switch (neg) {
            case 0:
                ps1 = "¿Quién " + sperfIesp[s] + vpsp[v] + "?";
                ps1eng = "Who " + sperfI[s] + vpeng[v];

                ps2 = "¿Quién " + sperfYouesp[s] + vpsp[v] + "?";
                ps2eng = "Who " + sperfYou[s] + vpeng[v];

                ps3 = "¿Quién " + sperfHeesp[s] + vpsp[v] + "él?";
                ps3eng = "Who " + sperfHe[s] + vpeng[v];

                ps3ella = "¿Quién " + sperfSheesp[s] + vpsp[v] + "ella?";
                ps3she = "Who " + sperfShe[s] + vpeng[v];

                ps3eso = "¿Quién " + sperfItesp[s] + vpsp[v] + "eso?";
                ps3it = "Who " + sperfIt[s] + vpeng[v];

                ps4 = "¿Quién " + sperfTheyesp[s] + vpsp[v] + "?";
                ps4eng = "Who " + sperfThey[s] + vpeng[v];

                ps5 = "¿Quién " + sperfWeesp[s] + vpsp[v] + "?";
                ps5eng = "Who " + sperfWe[s] + vpeng[v];
                break;
            case 1:
                ps1 = "¿Quién " + sperfIespno[s] + vpsp[v] + "?";
                ps1eng = "Who " + sperfIdont[s] + vpeng[v];

                ps2 = "¿Quién " + sperfYouespno[s] + vpsp[v] + "?";
                ps2eng = "Who " + sperfYoudont[s] + vpeng[v];

                ps3 = "¿Quién " + sperfHeespno[s] + vpsp[v] + "él?";
                ps3eng = "Who " + sperfHedont[s] + vpeng[v];

                ps3ella = "¿Quién " + sperfSheespno[s] + vpsp[v] + "ella?";
                ps3she = "Who " + sperfShedont[s] + vpeng[v];

                ps3eso = "¿Quién " + sperfItespno[s] + vpsp[v] + "eso?";
                ps3it = "Who " + sperfItdont[s] + vpeng[v];

                ps4 = "¿Quién " + sperfTheyespno[s] + vpsp[v] + "?";
                ps4eng = "Who " + sperfTheydont[s] + vpeng[v];

                ps5 = "¿Quién " + sperfWeespno[s] + vpsp[v] + "?";
                ps5eng = "Who " + sperfWedont[s] + vpeng[v];

                break;
        }
    }//LR 13/12/2022

   //Who Modales
   public void GenWhoModalsSimp1(){
        int neg = (int) (Math.random() * 6);
        switch (neg){
            //Would
            case 0:
                ps1 = "¿Quién " + vn1w[v] + "?";
                ps1eng = "Who " + "would i " + vnb[v];

                ps2 = "¿Quién " + vn2w[v] + "?";
                ps2eng = "Who " + "would you " + vnb[v];

                ps3 = "¿Quién " + vn3w[v] + "él?";
                ps3eng = "Who " + "would he " + vnb[v];

                ps3ella = "¿Quién " + vn3w[v] + "ella?";
                ps3she = "Who " + "would she " + vnb[v];

                ps3eso = "¿Quién " + vn3w[v] + "eso?";
                ps3it = "Who " + "would it " + vnb[v];

                ps4 = "¿Quién " + vn4w[v] + "?";
                ps4eng = "Who " + "would they " + vnb[v];

                ps5 = "¿Quién " + vn5w[v] + "?";
                ps5eng = "Who " + "would we " + vnb[v];
                break;
            case 1:
                ps1 = "¿Quién no " + vn1w[v] + "?";
                ps1eng = "Who " + "wouldn't i " + vnb[v];

                ps2 = "¿Quién no " + vn2w[v] + "?";
                ps2eng = "Who " + "wouldn't you " + vnb[v];

                ps3 = "¿Quién no " + vn3w[v] + "él?";
                ps3eng = "Who " + "wouldn't he " + vnb[v];

                ps3ella = "¿Quién no " + vn3w[v] + "ella?";
                ps3she = "Who " + "wouldn't she " + vnb[v];

                ps3eso = "¿Quién no " + vn3w[v] + "eso?";
                ps3it = "Who " + "wouldn't it " + vnb[v];

                ps4 = "¿Quién no " + vn4w[v] + "?";
                ps4eng = "Who " + "wouldn't they " + vnb[v];

                ps5 = "¿Quién no " + vn5w[v] + "?";
                ps5eng = "Who " + "wouldn't we " + vnb[v];
                break;

            //Could
            case 2:
                ps1 = "¿Quién " + "podría " + vnbs[v] + "?";
                ps1eng = "Who " + "could i " + vnb[v];

                ps2 = "¿Quién " + "podrías " + vnbs[v] + "?";
                ps2eng = "Who " + "could you " + vnb[v];

                ps3 = "¿Quién " + "podría " + vnbs[v] + "él?";
                ps3eng = "Who " + "could he " + vnb[v];

                ps3ella = "¿Quién " + "podría " + vnbs[v] + "ella?";
                ps3she = "Who " + "could she " + vnb[v];

                ps3eso = "¿Quién " + "podría " + vnbs[v] + "eso?";
                ps3it = "Who " + "could it " + vnb[v];

                ps4 = "¿Quién " + "podrían " + vnbs[v] + "?";
                ps4eng = "Who " + "could they " + vnb[v];

                ps5 = "¿Quién " + "podríamos " + vnbs[v] + "?";
                ps5eng = "Who " + "could we " + vnb[v];
                break;
            case 3:
                ps1 = "¿Quién no " + "podría " + vnbs[v] + "?";
                ps1eng = "Who " + "couldn't i " + vnb[v];

                ps2 = "¿Quién no " + "podrías " + vnbs[v] + "?";
                ps2eng = "Who " + "couldn't you " + vnb[v];

                ps3 = "¿Quién no " + "podría " + vnbs[v] + "él?";
                ps3eng = "Who " + "couldn't he " + vnb[v];

                ps3ella = "¿Quién no " + "podría " + vnbs[v] + "ella?";
                ps3she = "Who " + "couldn't she " + vnb[v];

                ps3eso = "¿Quién no " + "podría " + vnbs[v] + "eso?";
                ps3it = "Who " + "couldn't it " + vnb[v];

                ps4 = "¿Quién no " + "podrían " + vnbs[v] + "?";
                ps4eng = "Who " + "couldn't they " + vnb[v];

                ps5 = "¿Quién no " + "podríamos " + vnbs[v] + "?";
                ps5eng = "Who " + "couldn't we " + vnb[v];
                break;

            //Should
            case 4:
                ps1 = "¿Quién " + "debería " + vnbs[v] + "?";
                ps1eng = "Who " + "should i " + vnb[v];

                ps2 = "¿Quién " + "deberías " + vnbs[v] + "?";
                ps2eng = "Who " + "should you " + vnb[v];

                ps3 = "¿Quién " + "debería " + vnbs[v] + "él?";
                ps3eng = "Who " + "should he " + vnb[v];

                ps3ella = "¿Quién " + "debería " + vnbs[v] + "ella?";
                ps3she = "Who " + "should she " + vnb[v];

                ps3eso = "¿Quién " + "debería " + vnbs[v] + "eso?";
                ps3it = "Who " + "should it " + vnb[v];

                ps4 = "¿Quién " + "deberían " + vnbs[v] + "?";
                ps4eng = "Who " + "should they " + vnb[v];

                ps5 = "¿Quién " + "deberíamos " + vnbs[v] + "?";
                ps5eng = "Who " + "should we " + vnb[v];
                break;
            case 5:
                ps1 = "¿Quién no " + "debería " + vnbs[v] + "?";
                ps1eng = "Who " + "shouldn't i " + vnb[v];

                ps2 = "¿Quién no " + "deberías " + vnbs[v] + "?";
                ps2eng = "Who " + "shouldn't you " + vnb[v];

                ps3 = "¿Quién no " + "debería " + vnbs[v] + "él?";
                ps3eng = "Who " + "shouldn't he " + vnb[v];

                ps3ella = "¿Quién no " + "debería " + vnbs[v] + "ella?";
                ps3she = "Who " + "shouldn't she " + vnb[v];

                ps3eso = "¿Quién no " + "debería " + vnbs[v] + "eso?";
                ps3it = "Who " + "shouldn't it " + vnb[v];

                ps4 = "¿Quién no " + "deberían " + vnbs[v] + "?";
                ps4eng = "Who " + "shouldn't they " + vnb[v];

                ps5 = "¿Quién no " + "deberíamos " + vnbs[v] + "?";
                ps5eng = "Who " + "shouldn't we " + vnb[v];
                break;

        }
    }//LR 13/12/2022
   public void GenWhoModalsCont1() {
        switch (neg) {
            case 0:
                ps1 = "¿Quién " + scontmIesp[s] + vnbcs[v] + "?";
                ps1eng = "Who " + scontmI[s] + vnbc[v];

                ps2 = "¿Quién " + scontmYouesp[s] + vnbcs[v] + "?";
                ps2eng = "Who " + scontmYou[s] + vnbc[v];

                ps3 = "¿Quién " + scontmHeesp[s] + vnbcs[v] + "él?";
                ps3eng = "Who " + scontmHe[s] + vnbc[v];

                ps3ella = "¿Quién " + scontmSheesp[s] + vnbcs[v] + "ella?";
                ps3she = "Who " + scontmShe[s] + vnbc[v];

                ps3eso = "¿Quién " + scontmItesp[s] + vnbcs[v] + "eso?";
                ps3it = "Who " + scontmIt[s] + vnbc[v];

                ps4 = "¿Quién " + scontmTheyesp[s] + vnbcs[v] + "?";
                ps4eng = "Who " + scontmThey[s] + vnbc[v];

                ps5 = "¿Quién " + scontmWeesp[s] + vnbcs[v] + "?";
                ps5eng = "Who " + scontmWe[s] + vnbc[v];
                break;

            case 1:
                ps1 = "¿Quién " + scontmIespno[s] + vnbcs[v] + "?";
                ps1eng = "Who " + scontmIdont[s] + vnbc[v];

                ps2 = "¿Quién " + scontmYouespno[s] + vnbcs[v] + "?";
                ps2eng = "Who " + scontmYoudont[s] + vnbc[v];

                ps3 = "¿Quién " + scontmHeespno[s] + vnbcs[v] + "él?";
                ps3eng = "Who " + scontmHedont[s] + vnbc[v];

                ps3ella = "¿Quién " + scontmSheespno[s] + vnbcs[v] + "ella?";
                ps3she = "Who " + scontmShedont[s] + vnbc[v];

                ps3eso = "¿Quién " + scontmItespno[s] + vnbcs[v] + "eso?";
                ps3it = "Who " + scontmItdont[s] + vnbc[v];

                ps4 = "¿Quién " + scontmTheyespno[s] + vnbcs[v] + "?";
                ps4eng = "Who " + scontmTheydont[s] + vnbc[v];

                ps5 = "¿Quién " + scontmWeespno[s] + vnbcs[v] + "?";
                ps5eng = "Who " + scontmWedont[s] + vnbc[v];
                break;
        }
    }//LR 13/12/2022
   public void GenWhoModalsPerf1() {
        switch (neg) {
            case 0:
                ps1 = "¿Quién " + sperfmIesp[s] + vpsp[v] + "?";
                ps1eng = "Who " + sperfmI[s] + vpeng[v];

                ps2 = "¿Quién " + sperfmYouesp[s] + vpsp[v] + "?";
                ps2eng = "Who " + sperfmYou[s] + vpeng[v];

                ps3 = "¿Quién " + sperfmHeesp[s] + vpsp[v] + "él?";
                ps3eng = "Who " + sperfmHe[s] + vpeng[v];

                ps3ella = "¿Quién " + sperfmSheesp[s] + vpsp[v] + "ella?";
                ps3she = "Who " + sperfmShe[s] + vpeng[v];

                ps3eso = "¿Quién " + sperfmItesp[s] + vpsp[v] + "eso?";
                ps3it = "Who " + sperfmIt[s] + vpeng[v];

                ps4 = "¿Quién " + sperfmTheyesp[s] + vpsp[v] + "?";
                ps4eng = "Who " + sperfmThey[s] + vpeng[v];

                ps5 = "¿Quién " + sperfmWeesp[s] + vpsp[v] + "?";
                ps5eng = "Who " + sperfmWe[s] + vpeng[v];
                break;
            case 1:
                ps1 = "¿Quién " + sperfmIespno[s] + vpsp[v] + "?";
                ps1eng = "Who " + sperfmIdont[s] + vpeng[v];

                ps2 = "¿Quién " + sperfmYouespno[s] + vpsp[v] + "?";
                ps2eng = "Who " + sperfmYoudont[s] + vpeng[v];

                ps3 = "¿Quién " + sperfmHeespno[s] + vpsp[v] + "él?";
                ps3eng = "Who " + sperfmHedont[s] + vpeng[v];

                ps3ella = "¿Quién " + sperfmSheespno[s] + vpsp[v] + "ella?";
                ps3she = "Who " + sperfmShedont[s] + vpeng[v];

                ps3eso = "¿Quién " + sperfmItespno[s] + vpsp[v] + "eso?";
                ps3it = "Who " + sperfmItdont[s] + vpeng[v];

                ps4 = "¿Quién " + sperfmTheyespno[s] + vpsp[v] + "?";
                ps4eng = "Who " + sperfmTheydont[s] + vpeng[v];

                ps5 = "¿Quién " + sperfmWeespno[s] + vpsp[v] + "?";
                ps5eng = "Who " + sperfmWedont[s] + vpeng[v];

                break;
        }
    }//LR 13/12/2022

   //How
   public void GenHowSimp1() {
        int neg = (int) (Math.random() * 6);
        int sr = (int) (Math.random() * 2);
        switch (neg) {
            //Presente
            case 0:
                ps1 = "¿Cómo " + vn1[v] + "?";
                ps1eng = "How do i " + vnb[v];

                ps2 = "¿Cómo " + vn2[v] + "?";
                ps2eng = "How do you " + vnb[v];

                ps3 = "¿Cómo " + vn3[v] + "él?";
                ps3eng = "How does he " + vnb[v];

                ps3ella = "¿Cómo " + vn3[v] + "ella?";
                ps3she = "How does she " + vnb[v];

                ps3eso = "¿Cómo " + vn3[v] + "eso?";
                ps3it = "How does it " + vnb[v];

                ps4 = "¿Cómo " + vn4[v] + "?";
                ps4eng = "How do they " + vnb[v];

                ps5 = "¿Cómo " + vn5[v] + "?";
                ps5eng = "How do we " + vnb[v];
                break;
            case 1:
                ps1 = "¿Cómo no " + vn1[v] + "?";
                ps1eng = "How don't i " + vnb[v];

                ps2 = "¿Cómo no " + vn2[v] + "?";
                ps2eng = "How don't you " + vnb[v];

                ps3 = "¿Cómo no " + vn3[v] + "él?";
                ps3eng = "How doesn't he " + vnb[v];

                ps3ella = "¿Cómo no " + vn3[v] + "ella?";
                ps3she = "How doesn't she " + vnb[v];

                ps3eso = "¿Cómo no " + vn3[v] + "eso?";
                ps3it = "How doesn't it " + vnb[v];

                ps4 = "¿Cómo no " + vn4[v] + "?";
                ps4eng = "How don't they " + vnb[v];

                ps5 = "¿Cómo no " + vn5[v] + "?";
                ps5eng = "How don't we " + vnb[v];
                break;

            //Pasado
            case 2:
                if (sr == 0) {
                    ps1 = "¿Cómo " + ps1pre[v] + "?";
                    ps1eng = "How did i" + vnb[v];

                    ps2 = "¿Cómo " + ps2pre[v] + "?";
                    ps2eng = "How did you " + vnb[v];

                    ps3 = "¿Cómo " + ps3p[v] + "él?";
                    ps3eng = "How did he " + vnb[v];

                    ps3ella = "¿Cómo " + ps3p[v] + "ella?";
                    ps3she = "How did she " + vnb[v];

                    ps3eso = "¿Cómo " + ps3p[v] + "eso?";
                    ps3it = "How did it " + vnb[v];

                    ps4 = "¿Cómo " + vn4p[v] + "?";
                    ps4eng = "How did they " + vnb[v];

                    ps5 = "¿Cómo " + vn5p[v] + "?";
                    ps5eng = "How did we " + vnb[v];
                } else {
                    ps1 = "¿Cómo " + ps1imp[v] + "?";
                    ps1eng = "How did i " + vnb[v];

                    ps2 = "¿Cómo " + ps2imp[v] + "?";
                    ps2eng = "How did you " + vnb[v];

                    ps3 = "¿Cómo " + ps3imp[v] + "él?";
                    ps3eng = "How did he " + vnb[v];

                    ps3ella = "¿Cómo " + ps3imp[v] + "ella?";
                    ps3she = "How did she " + vnb[v];

                    ps3eso = "¿Cómo " + ps3imp[v] + "eso?";
                    ps3it = "How did it " + vnb[v];

                    ps4 = "¿Cómo " + vn4imp[v] + "?";
                    ps4eng = "How did they " + vnb[v];

                    ps5 = "¿Cómo " + vn5imp[v] + "?";
                    ps5eng = "How did we " + vnb[v];
                }
                break;
            case 3:
                if (sr == 0) {
                    ps1 = "¿Cómo no " + ps1pre[v] + "?";
                    ps1eng = "How didn't i " + vnb[v];

                    ps2 = "¿Cómo no " + ps2pre[v] + "?";
                    ps2eng = "How didn't you " + vnb[v];

                    ps3 = "¿Cómo no " + ps3p[v] + "él?";
                    ps3eng = "How didn't he " + vnb[v];

                    ps3ella = "¿Cómo no " + ps3p[v] + "ella?";
                    ps3she = "How didn't she " + vnb[v];

                    ps3eso = "¿Cómo no " + ps3p[v] + "eso?";
                    ps3it = "How didn't it " + vnb[v];

                    ps4 = "¿Cómo no " + vn4p[v] + "?";
                    ps4eng = "How didn't they " + vnb[v];

                    ps5 = "¿Cómo no " + vn5p[v] + "?";
                    ps5eng = "How didn't we " + vnb[v];
                } else {
                    ps1 = "¿Cómo no " + ps1imp[v] + "?";
                    ps1eng = "How didn't i " + vnb[v];

                    ps2 = "¿Cómo no " + ps2imp[v] + "?";
                    ps2eng = "How didn't you " + vnb[v];

                    ps3 = "¿Cómo no " + ps3imp[v] + "él?";
                    ps3eng = "How didn't he " + vnb[v];

                    ps3ella = "¿Cómo no " + ps3imp[v] + "ella?";
                    ps3she = "How didn't she " + vnb[v];

                    ps3eso = "¿Cómo no " + ps3imp[v] + "eso?";
                    ps3it = "How didn't it " + vnb[v];

                    ps4 = "¿Cómo no " + vn4imp[v] + "?";
                    ps4eng = "How didn't they " + vnb[v];

                    ps5 = "¿Cómo no " + vn5imp[v] + "?";
                    ps5eng = "How didn't we " + vnb[v];
                }
                break;

            //Futuro
            case 4:
                ps1 = "¿Cómo " + vn1f[v] + "?";
                ps1eng = "How will i " + vnb[v];

                ps2 = "¿Cómo " + vn2f[v] + "?";
                ps2eng = "How will you " + vnb[v];

                ps3 = "¿Cómo " + vn3f[v] + "él?";
                ps3eng = "How will he " + vnb[v];

                ps3ella = "¿Cómo " + vn3f[v] + "ella?";
                ps3she = "How will she " + vnb[v];

                ps3eso = "¿Cómo " + vn3f[v] + "eso?";
                ps3it = "How will it " + vnb[v];

                ps4 = "¿Cómo " + vn4f[v] + "?";
                ps4eng = "How will they " + vnb[v];

                ps5 = "¿Cómo " + vn5f[v] + "?";
                ps5eng = "How will we " + vnb[v];
                break;
            case 5:
                ps1 = "¿Cómo no " + vn1f[v] + "?";
                ps1eng = "How won't i " + vnb[v];

                ps2 = "¿Cómo no " + vn2f[v] + "?";
                ps2eng = "How won't you " + vnb[v];

                ps3 = "¿Cómo no " + vn3f[v] + "él?";
                ps3eng = "How won't he " + vnb[v];

                ps3ella = "¿Cómo no " + vn3f[v] + "ella?";
                ps3she = "How won't she " + vnb[v];

                ps3eso = "¿Cómo no " + vn3f[v] + "eso?";
                ps3it = "How won't it " + vnb[v];

                ps4 = "¿Cómo no " + vn4f[v] + "?";
                ps4eng = "How won't they " + vnb[v];

                ps5 = "¿Cómo no " + vn5f[v] + "?";
                ps5eng = "How won't we " + vnb[v];
                break;
        }
    }//LR 13/12/2022
   public void GenHowCont1() {
        switch (neg) {
            case 0:
                ps1 = "¿Cómo " + scontIesp[s] + vnbcs[v] + "?";
                ps1eng = "How " + scontI[s] + vnbc[v];

                ps2 = "¿Cómo " + scontYouesp[s] + vnbcs[v] + "?";
                ps2eng = "How " + scontYou[s] + vnbc[v];

                ps3 = "¿Cómo " + scontHeesp[s] + vnbcs[v] + "él?";
                ps3eng = "How " + scontHe[s] + vnbc[v];

                ps3ella = "¿Cómo " + scontSheesp[s] + vnbcs[v] + "ella?";
                ps3she = "How " + scontShe[s] + vnbc[v];

                ps3eso = "¿Cómo " + scontItesp[s] + vnbcs[v] + "eso?";
                ps3it = "How " + scontIt[s] + vnbc[v];

                ps4 = "¿Cómo " + scontTheyesp[s] + vnbcs[v] + "?";
                ps4eng = "How " + scontThey[s] + vnbc[v];

                ps5 = "¿Cómo " + scontWeesp[s] + vnbcs[v] + "?";
                ps5eng = "How " + scontWe[s] + vnbc[v];
                break;

            case 1:
                ps1 = "¿Cómo " + scontIespno[s] + vnbcs[v] + "?";
                ps1eng = "How " + scontIdont[s] + vnbc[v];

                ps2 = "¿Cómo " + scontYouespno[s] + vnbcs[v] + "?";
                ps2eng = "How " + scontYoudont[s] + vnbc[v];

                ps3 = "¿Cómo " + scontHeespno[s] + vnbcs[v] + "él?";
                ps3eng = "How " + scontHedont[s] + vnbc[v];

                ps3ella = "¿Cómo " + scontSheespno[s] + vnbcs[v] + "ella?";
                ps3she = "How " + scontShedont[s] + vnbc[v];

                ps3eso = "¿Cómo " + scontItespno[s] + vnbcs[v] + "eso?";
                ps3it = "How " + scontItdont[s] + vnbc[v];

                ps4 = "¿Cómo " + scontTheyespno[s] + vnbcs[v] + "?";
                ps4eng = "How " + scontTheydont[s] + vnbc[v];

                ps5 = "¿Cómo " + scontWeespno[s] + vnbcs[v] + "?";
                ps5eng = "How " + scontWedont[s] + vnbc[v];
                break;
        }
    }//LR 13/12/2022
   public void GenHowPerf1() {
        switch (neg) {
            case 0:
                ps1 = "¿Cómo " + sperfIesp[s] + vpsp[v] + "?";
                ps1eng = "How " + sperfI[s] + vpeng[v];

                ps2 = "¿Cómo " + sperfYouesp[s] + vpsp[v] + "?";
                ps2eng = "How " + sperfYou[s] + vpeng[v];

                ps3 = "¿Cómo " + sperfHeesp[s] + vpsp[v] + "él?";
                ps3eng = "How " + sperfHe[s] + vpeng[v];

                ps3ella = "¿Cómo " + sperfSheesp[s] + vpsp[v] + "ella?";
                ps3she = "How " + sperfShe[s] + vpeng[v];

                ps3eso = "¿Cómo " + sperfItesp[s] + vpsp[v] + "eso?";
                ps3it = "How " + sperfIt[s] + vpeng[v];

                ps4 = "¿Cómo " + sperfTheyesp[s] + vpsp[v] + "?";
                ps4eng = "How " + sperfThey[s] + vpeng[v];

                ps5 = "¿Cómo " + sperfWeesp[s] + vpsp[v] + "?";
                ps5eng = "How " + sperfWe[s] + vpeng[v];
                break;
            case 1:
                ps1 = "¿Cómo " + sperfIespno[s] + vpsp[v] + "?";
                ps1eng = "How " + sperfIdont[s] + vpeng[v];

                ps2 = "¿Cómo " + sperfYouespno[s] + vpsp[v] + "?";
                ps2eng = "How " + sperfYoudont[s] + vpeng[v];

                ps3 = "¿Cómo " + sperfHeespno[s] + vpsp[v] + "él?";
                ps3eng = "How " + sperfHedont[s] + vpeng[v];

                ps3ella = "¿Cómo " + sperfSheespno[s] + vpsp[v] + "ella?";
                ps3she = "How " + sperfShedont[s] + vpeng[v];

                ps3eso = "¿Cómo " + sperfItespno[s] + vpsp[v] + "eso?";
                ps3it = "How " + sperfItdont[s] + vpeng[v];

                ps4 = "¿Cómo " + sperfTheyespno[s] + vpsp[v] + "?";
                ps4eng = "How " + sperfTheydont[s] + vpeng[v];

                ps5 = "¿Cómo " + sperfWeespno[s] + vpsp[v] + "?";
                ps5eng = "How " + sperfWedont[s] + vpeng[v];

                break;
        }
    }//LR 13/12/2022

   //How Modales
   public void GenHowModalsSimp1(){
        int neg = (int) (Math.random() * 6);
        switch (neg){
            //Would
            case 0:
                ps1 = "¿Cómo " + vn1w[v] + "?";
                ps1eng = "How " + "would i " + vnb[v];

                ps2 = "¿Cómo " + vn2w[v] + "?";
                ps2eng = "How " + "would you " + vnb[v];

                ps3 = "¿Cómo " + vn3w[v] + "él?";
                ps3eng = "How " + "would he " + vnb[v];

                ps3ella = "¿Cómo " + vn3w[v] + "ella?";
                ps3she = "How " + "would she " + vnb[v];

                ps3eso = "¿Cómo " + vn3w[v] + "eso?";
                ps3it = "How " + "would it " + vnb[v];

                ps4 = "¿Cómo " + vn4w[v] + "?";
                ps4eng = "How " + "would they " + vnb[v];

                ps5 = "¿Cómo " + vn5w[v] + "?";
                ps5eng = "How " + "would we " + vnb[v];
                break;
            case 1:
                ps1 = "¿Cómo no " + vn1w[v] + "?";
                ps1eng = "How " + "wouldn't i " + vnb[v];

                ps2 = "¿Cómo no " + vn2w[v] + "?";
                ps2eng = "How " + "wouldn't you " + vnb[v];

                ps3 = "¿Cómo no " + vn3w[v] + "él?";
                ps3eng = "How " + "wouldn't he " + vnb[v];

                ps3ella = "¿Cómo no " + vn3w[v] + "ella?";
                ps3she = "How " + "wouldn't she " + vnb[v];

                ps3eso = "¿Cómo no " + vn3w[v] + "eso?";
                ps3it = "How " + "wouldn't it " + vnb[v];

                ps4 = "¿Cómo no " + vn4w[v] + "?";
                ps4eng = "How " + "wouldn't they " + vnb[v];

                ps5 = "¿Cómo no " + vn5w[v] + "?";
                ps5eng = "How " + "wouldn't we " + vnb[v];
                break;

            //Could
            case 2:
                ps1 = "¿Cómo " + "podría " + vnbs[v] + "?";
                ps1eng = "How " + "could i " + vnb[v];

                ps2 = "¿Cómo " + "podrías " + vnbs[v] + "?";
                ps2eng = "How " + "could you " + vnb[v];

                ps3 = "¿Cómo " + "podría " + vnbs[v] + "él?";
                ps3eng = "How " + "could he " + vnb[v];

                ps3ella = "¿Cómo " + "podría " + vnbs[v] + "ella?";
                ps3she = "How " + "could she " + vnb[v];

                ps3eso = "¿Cómo " + "podría " + vnbs[v] + "eso?";
                ps3it = "How " + "could it " + vnb[v];

                ps4 = "¿Cómo " + "podrían " + vnbs[v] + "?";
                ps4eng = "How " + "could they " + vnb[v];

                ps5 = "¿Cómo " + "podríamos " + vnbs[v] + "?";
                ps5eng = "How " + "could we " + vnb[v];
                break;
            case 3:
                ps1 = "¿Cómo no " + "podría " + vnbs[v] + "?";
                ps1eng = "How " + "couldn't i " + vnb[v];

                ps2 = "¿Cómo no " + "podrías " + vnbs[v] + "?";
                ps2eng = "How " + "couldn't you " + vnb[v];

                ps3 = "¿Cómo no " + "podría " + vnbs[v] + "él?";
                ps3eng = "How " + "couldn't he " + vnb[v];

                ps3ella = "¿Cómo no " + "podría " + vnbs[v] + "ella?";
                ps3she = "How " + "couldn't she " + vnb[v];

                ps3eso = "¿Cómo no " + "podría " + vnbs[v] + "eso?";
                ps3it = "How " + "couldn't it " + vnb[v];

                ps4 = "¿Cómo no " + "podrían " + vnbs[v] + "?";
                ps4eng = "How " + "couldn't they " + vnb[v];

                ps5 = "¿Cómo no " + "podríamos " + vnbs[v] + "?";
                ps5eng = "How " + "couldn't we " + vnb[v];
                break;

            //Should
            case 4:
                ps1 = "¿Cómo " + "debería " + vnbs[v] + "?";
                ps1eng = "How " + "should i " + vnb[v];

                ps2 = "¿Cómo " + "deberías " + vnbs[v] + "?";
                ps2eng = "How " + "should you " + vnb[v];

                ps3 = "¿Cómo " + "debería " + vnbs[v] + "él?";
                ps3eng = "How " + "should he " + vnb[v];

                ps3ella = "¿Cómo " + "debería " + vnbs[v] + "ella?";
                ps3she = "How " + "should she " + vnb[v];

                ps3eso = "¿Cómo " + "debería " + vnbs[v] + "eso?";
                ps3it = "How " + "should it " + vnb[v];

                ps4 = "¿Cómo " + "deberían " + vnbs[v] + "?";
                ps4eng = "How " + "should they " + vnb[v];

                ps5 = "¿Cómo " + "deberíamos " + vnbs[v] + "?";
                ps5eng = "How " + "should we " + vnb[v];
                break;
            case 5:
                ps1 = "¿Cómo no " + "debería " + vnbs[v] + "?";
                ps1eng = "How " + "shouldn't i " + vnb[v];

                ps2 = "¿Cómo no " + "deberías " + vnbs[v] + "?";
                ps2eng = "How " + "shouldn't you " + vnb[v];

                ps3 = "¿Cómo no " + "debería " + vnbs[v] + "él?";
                ps3eng = "How " + "shouldn't he " + vnb[v];

                ps3ella = "¿Cómo no " + "debería " + vnbs[v] + "ella?";
                ps3she = "How " + "shouldn't she " + vnb[v];

                ps3eso = "¿Cómo no " + "debería " + vnbs[v] + "eso?";
                ps3it = "How " + "shouldn't it " + vnb[v];

                ps4 = "¿Cómo no " + "deberían " + vnbs[v] + "?";
                ps4eng = "How " + "shouldn't they " + vnb[v];

                ps5 = "¿Cómo no " + "deberíamos " + vnbs[v] + "?";
                ps5eng = "How " + "shouldn't we " + vnb[v];
                break;

        }
    }//LR 13/12/2022
   public void GenHowModalsCont1() {
        switch (neg) {
            case 0:
                ps1 = "¿Cómo " + scontmIesp[s] + vnbcs[v] + "?";
                ps1eng = "How " + scontmI[s] + vnbc[v];

                ps2 = "¿Cómo " + scontmYouesp[s] + vnbcs[v] + "?";
                ps2eng = "How " + scontmYou[s] + vnbc[v];

                ps3 = "¿Cómo " + scontmHeesp[s] + vnbcs[v] + "él?";
                ps3eng = "How " + scontmHe[s] + vnbc[v];

                ps3ella = "¿Cómo " + scontmSheesp[s] + vnbcs[v] + "ella?";
                ps3she = "How " + scontmShe[s] + vnbc[v];

                ps3eso = "¿Cómo " + scontmItesp[s] + vnbcs[v] + "eso?";
                ps3it = "How " + scontmIt[s] + vnbc[v];

                ps4 = "¿Cómo " + scontmTheyesp[s] + vnbcs[v] + "?";
                ps4eng = "How " + scontmThey[s] + vnbc[v];

                ps5 = "¿Cómo " + scontmWeesp[s] + vnbcs[v] + "?";
                ps5eng = "How " + scontmWe[s] + vnbc[v];
                break;

            case 1:
                ps1 = "¿Cómo " + scontmIespno[s] + vnbcs[v] + "?";
                ps1eng = "How " + scontmIdont[s] + vnbc[v];

                ps2 = "¿Cómo " + scontmYouespno[s] + vnbcs[v] + "?";
                ps2eng = "How " + scontmYoudont[s] + vnbc[v];

                ps3 = "¿Cómo " + scontmHeespno[s] + vnbcs[v] + "él?";
                ps3eng = "How " + scontmHedont[s] + vnbc[v];

                ps3ella = "¿Cómo " + scontmSheespno[s] + vnbcs[v] + "ella?";
                ps3she = "How " + scontmShedont[s] + vnbc[v];

                ps3eso = "¿Cómo " + scontmItespno[s] + vnbcs[v] + "eso?";
                ps3it = "How " + scontmItdont[s] + vnbc[v];

                ps4 = "¿Cómo " + scontmTheyespno[s] + vnbcs[v] + "?";
                ps4eng = "How " + scontmTheydont[s] + vnbc[v];

                ps5 = "¿Cómo " + scontmWeespno[s] + vnbcs[v] + "?";
                ps5eng = "How " + scontmWedont[s] + vnbc[v];
                break;
        }
    }//LR 13/12/2022
   public void GenHowModalsPerf1() {
        switch (neg) {
            case 0:
                ps1 = "¿Cómo " + sperfmIesp[s] + vpsp[v] + "?";
                ps1eng = "How " + sperfmI[s] + vpeng[v];

                ps2 = "¿Cómo " + sperfmYouesp[s] + vpsp[v] + "?";
                ps2eng = "How " + sperfmYou[s] + vpeng[v];

                ps3 = "¿Cómo " + sperfmHeesp[s] + vpsp[v] + "él?";
                ps3eng = "How " + sperfmHe[s] + vpeng[v];

                ps3ella = "¿Cómo " + sperfmSheesp[s] + vpsp[v] + "ella?";
                ps3she = "How " + sperfmShe[s] + vpeng[v];

                ps3eso = "¿Cómo " + sperfmItesp[s] + vpsp[v] + "eso?";
                ps3it = "How " + sperfmIt[s] + vpeng[v];

                ps4 = "¿Cómo " + sperfmTheyesp[s] + vpsp[v] + "?";
                ps4eng = "How " + sperfmThey[s] + vpeng[v];

                ps5 = "¿Cómo " + sperfmWeesp[s] + vpsp[v] + "?";
                ps5eng = "How " + sperfmWe[s] + vpeng[v];
                break;
            case 1:
                ps1 = "¿Cómo " + sperfmIespno[s] + vpsp[v] + "?";
                ps1eng = "How " + sperfmIdont[s] + vpeng[v];

                ps2 = "¿Cómo " + sperfmYouespno[s] + vpsp[v] + "?";
                ps2eng = "How " + sperfmYoudont[s] + vpeng[v];

                ps3 = "¿Cómo " + sperfmHeespno[s] + vpsp[v] + "él?";
                ps3eng = "How " + sperfmHedont[s] + vpeng[v];

                ps3ella = "¿Cómo " + sperfmSheespno[s] + vpsp[v] + "ella?";
                ps3she = "How " + sperfmShedont[s] + vpeng[v];

                ps3eso = "¿Cómo " + sperfmItespno[s] + vpsp[v] + "eso?";
                ps3it = "How " + sperfmItdont[s] + vpeng[v];

                ps4 = "¿Cómo " + sperfmTheyespno[s] + vpsp[v] + "?";
                ps4eng = "How " + sperfmTheydont[s] + vpeng[v];

                ps5 = "¿Cómo " + sperfmWeespno[s] + vpsp[v] + "?";
                ps5eng = "How " + sperfmWedont[s] + vpeng[v];

                break;
        }
    }//LR 13/12/2022

   //How Much
   public void GenHowMuchSimp1() {
        int neg = (int) (Math.random() * 6);
        int sr = (int) (Math.random() * 2);
        switch (neg) {
            //Presente
            case 0:
                ps1 = "¿Cuanto " + vn1[v] + "?";
                ps1eng = "How much do i " + vnb[v];

                ps2 = "¿Cuanto " + vn2[v] + "?";
                ps2eng = "How much do you " + vnb[v];

                ps3 = "¿Cuanto " + vn3[v] + "él?";
                ps3eng = "How much does he " + vnb[v];

                ps3ella = "¿Cuanto " + vn3[v] + "ella?";
                ps3she = "How much does she " + vnb[v];

                ps3eso = "¿Cuanto " + vn3[v] + "eso?";
                ps3it = "How much does it " + vnb[v];

                ps4 = "¿Cuanto " + vn4[v] + "?";
                ps4eng = "How much do they " + vnb[v];

                ps5 = "¿Cuanto " + vn5[v] + "?";
                ps5eng = "How much do we " + vnb[v];
                break;
            case 1:
                ps1 = "¿Cuanto no " + vn1[v] + "?";
                ps1eng = "How much don't i " + vnb[v];

                ps2 = "¿Cuanto no " + vn2[v] + "?";
                ps2eng = "How much don't you " + vnb[v];

                ps3 = "¿Cuanto no " + vn3[v] + "él?";
                ps3eng = "How much doesn't he " + vnb[v];

                ps3ella = "¿Cuanto no " + vn3[v] + "ella?";
                ps3she = "How much doesn't she " + vnb[v];

                ps3eso = "¿Cuanto no " + vn3[v] + "eso?";
                ps3it = "How much doesn't it " + vnb[v];

                ps4 = "¿Cuanto no " + vn4[v] + "?";
                ps4eng = "How much don't they " + vnb[v];

                ps5 = "¿Cuanto no " + vn5[v] + "?";
                ps5eng = "How much don't we " + vnb[v];
                break;

            //Pasado
            case 2:
                if (sr == 0) {
                    ps1 = "¿Cuanto " + ps1pre[v] + "?";
                    ps1eng = "How much did i" + vnb[v];

                    ps2 = "¿Cuanto " + ps2pre[v] + "?";
                    ps2eng = "How much did you " + vnb[v];

                    ps3 = "¿Cuanto " + ps3p[v] + "él?";
                    ps3eng = "How much did he " + vnb[v];

                    ps3ella = "¿Cuanto " + ps3p[v] + "ella?";
                    ps3she = "How much did she " + vnb[v];

                    ps3eso = "¿Cuanto " + ps3p[v] + "eso?";
                    ps3it = "How much did it " + vnb[v];

                    ps4 = "¿Cuanto " + vn4p[v] + "?";
                    ps4eng = "How much did they " + vnb[v];

                    ps5 = "¿Cuanto " + vn5p[v] + "?";
                    ps5eng = "How much did we " + vnb[v];
                } else {
                    ps1 = "¿Cuanto " + ps1imp[v] + "?";
                    ps1eng = "How much did i " + vnb[v];

                    ps2 = "¿Cuanto " + ps2imp[v] + "?";
                    ps2eng = "How much did you " + vnb[v];

                    ps3 = "¿Cuanto " + ps3imp[v] + "él?";
                    ps3eng = "How much did he " + vnb[v];

                    ps3ella = "¿Cuanto " + ps3imp[v] + "ella?";
                    ps3she = "How much did she " + vnb[v];

                    ps3eso = "¿Cuanto " + ps3imp[v] + "eso?";
                    ps3it = "How much did it " + vnb[v];

                    ps4 = "¿Cuanto " + vn4imp[v] + "?";
                    ps4eng = "How much did they " + vnb[v];

                    ps5 = "¿Cuanto " + vn5imp[v] + "?";
                    ps5eng = "How much did we " + vnb[v];
                }
                break;
            case 3:
                if (sr == 0) {
                    ps1 = "¿Cuanto no " + ps1pre[v] + "?";
                    ps1eng = "How much didn't i " + vnb[v];

                    ps2 = "¿Cuanto no " + ps2pre[v] + "?";
                    ps2eng = "How much didn't you " + vnb[v];

                    ps3 = "¿Cuanto no " + ps3p[v] + "él?";
                    ps3eng = "How much didn't he " + vnb[v];

                    ps3ella = "¿Cuanto no " + ps3p[v] + "ella?";
                    ps3she = "How much didn't she " + vnb[v];

                    ps3eso = "¿Cuanto no " + ps3p[v] + "eso?";
                    ps3it = "How much didn't it " + vnb[v];

                    ps4 = "¿Cuanto no " + vn4p[v] + "?";
                    ps4eng = "How much didn't they " + vnb[v];

                    ps5 = "¿Cuanto no " + vn5p[v] + "?";
                    ps5eng = "How much didn't we " + vnb[v];
                } else {
                    ps1 = "¿Cuanto no " + ps1imp[v] + "?";
                    ps1eng = "How much didn't i " + vnb[v];

                    ps2 = "¿Cuanto no " + ps2imp[v] + "?";
                    ps2eng = "How much didn't you " + vnb[v];

                    ps3 = "¿Cuanto no " + ps3imp[v] + "él?";
                    ps3eng = "How much didn't he " + vnb[v];

                    ps3ella = "¿Cuanto no " + ps3imp[v] + "ella?";
                    ps3she = "How much didn't she " + vnb[v];

                    ps3eso = "¿Cuanto no " + ps3imp[v] + "eso?";
                    ps3it = "How much didn't it " + vnb[v];

                    ps4 = "¿Cuanto no " + vn4imp[v] + "?";
                    ps4eng = "How much didn't they " + vnb[v];

                    ps5 = "¿Cuanto no " + vn5imp[v] + "?";
                    ps5eng = "How much didn't we " + vnb[v];
                }
                break;

            //Futuro
            case 4:
                ps1 = "¿Cuanto " + vn1f[v] + "?";
                ps1eng = "How much will i " + vnb[v];

                ps2 = "¿Cuanto " + vn2f[v] + "?";
                ps2eng = "How much will you " + vnb[v];

                ps3 = "¿Cuanto " + vn3f[v] + "él?";
                ps3eng = "How much will he " + vnb[v];

                ps3ella = "¿Cuanto " + vn3f[v] + "ella?";
                ps3she = "How much will she " + vnb[v];

                ps3eso = "¿Cuanto " + vn3f[v] + "eso?";
                ps3it = "How much will it " + vnb[v];

                ps4 = "¿Cuanto " + vn4f[v] + "?";
                ps4eng = "How much will they " + vnb[v];

                ps5 = "¿Cuanto " + vn5f[v] + "?";
                ps5eng = "How much will we " + vnb[v];
                break;
            case 5:
                ps1 = "¿Cuanto no " + vn1f[v] + "?";
                ps1eng = "How much won't i " + vnb[v];

                ps2 = "¿Cuanto no " + vn2f[v] + "?";
                ps2eng = "How much won't you " + vnb[v];

                ps3 = "¿Cuanto no " + vn3f[v] + "él?";
                ps3eng = "How much won't he " + vnb[v];

                ps3ella = "¿Cuanto no " + vn3f[v] + "ella?";
                ps3she = "How much won't she " + vnb[v];

                ps3eso = "¿Cuanto no " + vn3f[v] + "eso?";
                ps3it = "How much won't it " + vnb[v];

                ps4 = "¿Cuanto no " + vn4f[v] + "?";
                ps4eng = "How much won't they " + vnb[v];

                ps5 = "¿Cuanto no " + vn5f[v] + "?";
                ps5eng = "How much won't we " + vnb[v];
                break;
        }
    }//LR 13/12/2022
   public void GenHowMuchCont1() {
        switch (neg) {
            case 0:
                ps1 = "¿Cuanto " + scontIesp[s] + vnbcs[v] + "?";
                ps1eng = "How much " + scontI[s] + vnbc[v];

                ps2 = "¿Cuanto " + scontYouesp[s] + vnbcs[v] + "?";
                ps2eng = "How much " + scontYou[s] + vnbc[v];

                ps3 = "¿Cuanto " + scontHeesp[s] + vnbcs[v] + "él?";
                ps3eng = "How much " + scontHe[s] + vnbc[v];

                ps3ella = "¿Cuanto " + scontSheesp[s] + vnbcs[v] + "ella?";
                ps3she = "How much " + scontShe[s] + vnbc[v];

                ps3eso = "¿Cuanto " + scontItesp[s] + vnbcs[v] + "eso?";
                ps3it = "How much " + scontIt[s] + vnbc[v];

                ps4 = "¿Cuanto " + scontTheyesp[s] + vnbcs[v] + "?";
                ps4eng = "How much " + scontThey[s] + vnbc[v];

                ps5 = "¿Cuanto " + scontWeesp[s] + vnbcs[v] + "?";
                ps5eng = "How much " + scontWe[s] + vnbc[v];
                break;

            case 1:
                ps1 = "¿Cuanto " + scontIespno[s] + vnbcs[v] + "?";
                ps1eng = "How much " + scontIdont[s] + vnbc[v];

                ps2 = "¿Cuanto " + scontYouespno[s] + vnbcs[v] + "?";
                ps2eng = "How much " + scontYoudont[s] + vnbc[v];

                ps3 = "¿Cuanto " + scontHeespno[s] + vnbcs[v] + "él?";
                ps3eng = "How much " + scontHedont[s] + vnbc[v];

                ps3ella = "¿Cuanto " + scontSheespno[s] + vnbcs[v] + "ella?";
                ps3she = "How much " + scontShedont[s] + vnbc[v];

                ps3eso = "¿Cuanto " + scontItespno[s] + vnbcs[v] + "eso?";
                ps3it = "How much " + scontItdont[s] + vnbc[v];

                ps4 = "¿Cuanto " + scontTheyespno[s] + vnbcs[v] + "?";
                ps4eng = "How much " + scontTheydont[s] + vnbc[v];

                ps5 = "¿Cuanto " + scontWeespno[s] + vnbcs[v] + "?";
                ps5eng = "How much " + scontWedont[s] + vnbc[v];
                break;
        }
    }//LR 13/12/2022
   public void GenHowMuchPerf1() {
        switch (neg) {
            case 0:
                ps1 = "¿Cuanto " + sperfIesp[s] + vpsp[v] + "?";
                ps1eng = "How much " + sperfI[s] + vpeng[v];

                ps2 = "¿Cuanto " + sperfYouesp[s] + vpsp[v] + "?";
                ps2eng = "How much " + sperfYou[s] + vpeng[v];

                ps3 = "¿Cuanto " + sperfHeesp[s] + vpsp[v] + "él?";
                ps3eng = "How much " + sperfHe[s] + vpeng[v];

                ps3ella = "¿Cuanto " + sperfSheesp[s] + vpsp[v] + "ella?";
                ps3she = "How much " + sperfShe[s] + vpeng[v];

                ps3eso = "¿Cuanto " + sperfItesp[s] + vpsp[v] + "eso?";
                ps3it = "How much " + sperfIt[s] + vpeng[v];

                ps4 = "¿Cuanto " + sperfTheyesp[s] + vpsp[v] + "?";
                ps4eng = "How much " + sperfThey[s] + vpeng[v];

                ps5 = "¿Cuanto " + sperfWeesp[s] + vpsp[v] + "?";
                ps5eng = "How much " + sperfWe[s] + vpeng[v];
                break;
            case 1:
                ps1 = "¿Cuanto " + sperfIespno[s] + vpsp[v] + "?";
                ps1eng = "How much " + sperfIdont[s] + vpeng[v];

                ps2 = "¿Cuanto " + sperfYouespno[s] + vpsp[v] + "?";
                ps2eng = "How much " + sperfYoudont[s] + vpeng[v];

                ps3 = "¿Cuanto " + sperfHeespno[s] + vpsp[v] + "él?";
                ps3eng = "How much " + sperfHedont[s] + vpeng[v];

                ps3ella = "¿Cuanto " + sperfSheespno[s] + vpsp[v] + "ella?";
                ps3she = "How much " + sperfShedont[s] + vpeng[v];

                ps3eso = "¿Cuanto " + sperfItespno[s] + vpsp[v] + "eso?";
                ps3it = "How much " + sperfItdont[s] + vpeng[v];

                ps4 = "¿Cuanto " + sperfTheyespno[s] + vpsp[v] + "?";
                ps4eng = "How much " + sperfTheydont[s] + vpeng[v];

                ps5 = "¿Cuanto " + sperfWeespno[s] + vpsp[v] + "?";
                ps5eng = "How much " + sperfWedont[s] + vpeng[v];

                break;
        }
    }//LR 13/12/2022

   //How Much Modales
   public void GenHowMuchModalsSimp1(){
        int neg = (int) (Math.random() * 6);
        switch (neg){
            //Would
            case 0:
                ps1 = "¿Cuanto " + vn1w[v] + "?";
                ps1eng = "How much " + "would i " + vnb[v];

                ps2 = "¿Cuanto " + vn2w[v] + "?";
                ps2eng = "How much " + "would you " + vnb[v];

                ps3 = "¿Cuanto " + vn3w[v] + "él?";
                ps3eng = "How much " + "would he " + vnb[v];

                ps3ella = "¿Cuanto " + vn3w[v] + "ella?";
                ps3she = "How much " + "would she " + vnb[v];

                ps3eso = "¿Cuanto " + vn3w[v] + "eso?";
                ps3it = "How much " + "would it " + vnb[v];

                ps4 = "¿Cuanto " + vn4w[v] + "?";
                ps4eng = "How much " + "would they " + vnb[v];

                ps5 = "¿Cuanto " + vn5w[v] + "?";
                ps5eng = "How much " + "would we " + vnb[v];
                break;
            case 1:
                ps1 = "¿Cuanto no " + vn1w[v] + "?";
                ps1eng = "How much " + "wouldn't i " + vnb[v];

                ps2 = "¿Cuanto no " + vn2w[v] + "?";
                ps2eng = "How much " + "wouldn't you " + vnb[v];

                ps3 = "¿Cuanto no " + vn3w[v] + "él?";
                ps3eng = "How much " + "wouldn't he " + vnb[v];

                ps3ella = "¿Cuanto no " + vn3w[v] + "ella?";
                ps3she = "How much " + "wouldn't she " + vnb[v];

                ps3eso = "¿Cuanto no " + vn3w[v] + "eso?";
                ps3it = "How much " + "wouldn't it " + vnb[v];

                ps4 = "¿Cuanto no " + vn4w[v] + "?";
                ps4eng = "How much " + "wouldn't they " + vnb[v];

                ps5 = "¿Cuanto no " + vn5w[v] + "?";
                ps5eng = "How much " + "wouldn't we " + vnb[v];
                break;

            //Could
            case 2:
                ps1 = "¿Cuanto " + "podría " + vnbs[v] + "?";
                ps1eng = "How much " + "could i " + vnb[v];

                ps2 = "¿Cuanto " + "podrías " + vnbs[v] + "?";
                ps2eng = "How much " + "could you " + vnb[v];

                ps3 = "¿Cuanto " + "podría " + vnbs[v] + "él?";
                ps3eng = "How much " + "could he " + vnb[v];

                ps3ella = "¿Cuanto " + "podría " + vnbs[v] + "ella?";
                ps3she = "How much " + "could she " + vnb[v];

                ps3eso = "¿Cuanto " + "podría " + vnbs[v] + "eso?";
                ps3it = "How much " + "could it " + vnb[v];

                ps4 = "¿Cuanto " + "podrían " + vnbs[v] + "?";
                ps4eng = "How much " + "could they " + vnb[v];

                ps5 = "¿Cuanto " + "podríamos " + vnbs[v] + "?";
                ps5eng = "How much " + "could we " + vnb[v];
                break;
            case 3:
                ps1 = "¿Cuanto no " + "podría " + vnbs[v] + "?";
                ps1eng = "How much " + "couldn't i " + vnb[v];

                ps2 = "¿Cuanto no " + "podrías " + vnbs[v] + "?";
                ps2eng = "How much " + "couldn't you " + vnb[v];

                ps3 = "¿Cuanto no " + "podría " + vnbs[v] + "él?";
                ps3eng = "How much " + "couldn't he " + vnb[v];

                ps3ella = "¿Cuanto no " + "podría " + vnbs[v] + "ella?";
                ps3she = "How much " + "couldn't she " + vnb[v];

                ps3eso = "¿Cuanto no " + "podría " + vnbs[v] + "eso?";
                ps3it = "How much " + "couldn't it " + vnb[v];

                ps4 = "¿Cuanto no " + "podrían " + vnbs[v] + "?";
                ps4eng = "How much " + "couldn't they " + vnb[v];

                ps5 = "¿Cuanto no " + "podríamos " + vnbs[v] + "?";
                ps5eng = "How much " + "couldn't we " + vnb[v];
                break;

            //Should
            case 4:
                ps1 = "¿Cuanto " + "debería " + vnbs[v] + "?";
                ps1eng = "How much " + "should i " + vnb[v];

                ps2 = "¿Cuanto " + "deberías " + vnbs[v] + "?";
                ps2eng = "How much " + "should you " + vnb[v];

                ps3 = "¿Cuanto " + "debería " + vnbs[v] + "él?";
                ps3eng = "How much " + "should he " + vnb[v];

                ps3ella = "¿Cuanto " + "debería " + vnbs[v] + "ella?";
                ps3she = "How much " + "should she " + vnb[v];

                ps3eso = "¿Cuanto " + "debería " + vnbs[v] + "eso?";
                ps3it = "How much " + "should it " + vnb[v];

                ps4 = "¿Cuanto " + "deberían " + vnbs[v] + "?";
                ps4eng = "How much " + "should they " + vnb[v];

                ps5 = "¿Cuanto " + "deberíamos " + vnbs[v] + "?";
                ps5eng = "How much " + "should we " + vnb[v];
                break;
            case 5:
                ps1 = "¿Cuanto no " + "debería " + vnbs[v] + "?";
                ps1eng = "How much " + "shouldn't i " + vnb[v];

                ps2 = "¿Cuanto no " + "deberías " + vnbs[v] + "?";
                ps2eng = "How much " + "shouldn't you " + vnb[v];

                ps3 = "¿Cuanto no " + "debería " + vnbs[v] + "él?";
                ps3eng = "How much " + "shouldn't he " + vnb[v];

                ps3ella = "¿Cuanto no " + "debería " + vnbs[v] + "ella?";
                ps3she = "How much " + "shouldn't she " + vnb[v];

                ps3eso = "¿Cuanto no " + "debería " + vnbs[v] + "eso?";
                ps3it = "How much " + "shouldn't it " + vnb[v];

                ps4 = "¿Cuanto no " + "deberían " + vnbs[v] + "?";
                ps4eng = "How much " + "shouldn't they " + vnb[v];

                ps5 = "¿Cuanto no " + "deberíamos " + vnbs[v] + "?";
                ps5eng = "How much " + "shouldn't we " + vnb[v];
                break;

        }
    }//LR 13/12/2022
   public void GenHowMuchModalsCont1() {
        switch (neg) {
            case 0:
                ps1 = "¿Cuanto " + scontmIesp[s] + vnbcs[v] + "?";
                ps1eng = "How much " + scontmI[s] + vnbc[v];

                ps2 = "¿Cuanto " + scontmYouesp[s] + vnbcs[v] + "?";
                ps2eng = "How much " + scontmYou[s] + vnbc[v];

                ps3 = "¿Cuanto " + scontmHeesp[s] + vnbcs[v] + "él?";
                ps3eng = "How much " + scontmHe[s] + vnbc[v];

                ps3ella = "¿Cuanto " + scontmSheesp[s] + vnbcs[v] + "ella?";
                ps3she = "How much " + scontmShe[s] + vnbc[v];

                ps3eso = "¿Cuanto " + scontmItesp[s] + vnbcs[v] + "eso?";
                ps3it = "How much " + scontmIt[s] + vnbc[v];

                ps4 = "¿Cuanto " + scontmTheyesp[s] + vnbcs[v] + "?";
                ps4eng = "How much " + scontmThey[s] + vnbc[v];

                ps5 = "¿Cuanto " + scontmWeesp[s] + vnbcs[v] + "?";
                ps5eng = "How much " + scontmWe[s] + vnbc[v];
                break;

            case 1:
                ps1 = "¿Cuanto " + scontmIespno[s] + vnbcs[v] + "?";
                ps1eng = "How much " + scontmIdont[s] + vnbc[v];

                ps2 = "¿Cuanto " + scontmYouespno[s] + vnbcs[v] + "?";
                ps2eng = "How much " + scontmYoudont[s] + vnbc[v];

                ps3 = "¿Cuanto " + scontmHeespno[s] + vnbcs[v] + "él?";
                ps3eng = "How much " + scontmHedont[s] + vnbc[v];

                ps3ella = "¿Cuanto " + scontmSheespno[s] + vnbcs[v] + "ella?";
                ps3she = "How much " + scontmShedont[s] + vnbc[v];

                ps3eso = "¿Cuanto " + scontmItespno[s] + vnbcs[v] + "eso?";
                ps3it = "How much " + scontmItdont[s] + vnbc[v];

                ps4 = "¿Cuanto " + scontmTheyespno[s] + vnbcs[v] + "?";
                ps4eng = "How much " + scontmTheydont[s] + vnbc[v];

                ps5 = "¿Cuanto " + scontmWeespno[s] + vnbcs[v] + "?";
                ps5eng = "How much " + scontmWedont[s] + vnbc[v];
                break;
        }
    }//LR 13/12/2022
   public void GenHowMuchModalsPerf1() {
        switch (neg) {
            case 0:
                ps1 = "¿Cuanto " + sperfmIesp[s] + vpsp[v] + "?";
                ps1eng = "How much " + sperfmI[s] + vpeng[v];

                ps2 = "¿Cuanto " + sperfmYouesp[s] + vpsp[v] + "?";
                ps2eng = "How much " + sperfmYou[s] + vpeng[v];

                ps3 = "¿Cuanto " + sperfmHeesp[s] + vpsp[v] + "él?";
                ps3eng = "How much " + sperfmHe[s] + vpeng[v];

                ps3ella = "¿Cuanto " + sperfmSheesp[s] + vpsp[v] + "ella?";
                ps3she = "How much " + sperfmShe[s] + vpeng[v];

                ps3eso = "¿Cuanto " + sperfmItesp[s] + vpsp[v] + "eso?";
                ps3it = "How much " + sperfmIt[s] + vpeng[v];

                ps4 = "¿Cuanto " + sperfmTheyesp[s] + vpsp[v] + "?";
                ps4eng = "How much " + sperfmThey[s] + vpeng[v];

                ps5 = "¿Cuanto " + sperfmWeesp[s] + vpsp[v] + "?";
                ps5eng = "How much " + sperfmWe[s] + vpeng[v];
                break;
            case 1:
                ps1 = "¿Cuanto " + sperfmIespno[s] + vpsp[v] + "?";
                ps1eng = "How much " + sperfmIdont[s] + vpeng[v];

                ps2 = "¿Cuanto " + sperfmYouespno[s] + vpsp[v] + "?";
                ps2eng = "How much " + sperfmYoudont[s] + vpeng[v];

                ps3 = "¿Cuanto " + sperfmHeespno[s] + vpsp[v] + "él?";
                ps3eng = "How much " + sperfmHedont[s] + vpeng[v];

                ps3ella = "¿Cuanto " + sperfmSheespno[s] + vpsp[v] + "ella?";
                ps3she = "How much " + sperfmShedont[s] + vpeng[v];

                ps3eso = "¿Cuanto " + sperfmItespno[s] + vpsp[v] + "eso?";
                ps3it = "How much " + sperfmItdont[s] + vpeng[v];

                ps4 = "¿Cuanto " + sperfmTheyespno[s] + vpsp[v] + "?";
                ps4eng = "How much " + sperfmTheydont[s] + vpeng[v];

                ps5 = "¿Cuanto " + sperfmWeespno[s] + vpsp[v] + "?";
                ps5eng = "How much " + sperfmWedont[s] + vpeng[v];

                break;
        }
    }//LR 13/12/2022

   //How Many
   public void GenHowManySimp1() {
        int neg = (int) (Math.random() * 6);
        int sr = (int) (Math.random() * 2);
        switch (neg) {
            //Presente
            case 0:
                ps1 = "¿Cuantos " + vn1[v] + "?";
                ps1eng = "How many do i " + vnb[v];

                ps2 = "¿Cuantos " + vn2[v] + "?";
                ps2eng = "How many do you " + vnb[v];

                ps3 = "¿Cuantos " + vn3[v] + "él?";
                ps3eng = "How many does he " + vnb[v];

                ps3ella = "¿Cuantos " + vn3[v] + "ella?";
                ps3she = "How many does she " + vnb[v];

                ps3eso = "¿Cuantos " + vn3[v] + "eso?";
                ps3it = "How many does it " + vnb[v];

                ps4 = "¿Cuantos " + vn4[v] + "?";
                ps4eng = "How many do they " + vnb[v];

                ps5 = "¿Cuantos " + vn5[v] + "?";
                ps5eng = "How many do we " + vnb[v];
                break;
            case 1:
                ps1 = "¿Cuantos no " + vn1[v] + "?";
                ps1eng = "How many don't i " + vnb[v];

                ps2 = "¿Cuantos no " + vn2[v] + "?";
                ps2eng = "How many don't you " + vnb[v];

                ps3 = "¿Cuantos no " + vn3[v] + "él?";
                ps3eng = "How many doesn't he " + vnb[v];

                ps3ella = "¿Cuantos no " + vn3[v] + "ella?";
                ps3she = "How many doesn't she " + vnb[v];

                ps3eso = "¿Cuantos no " + vn3[v] + "eso?";
                ps3it = "How many doesn't it " + vnb[v];

                ps4 = "¿Cuantos no " + vn4[v] + "?";
                ps4eng = "How many don't they " + vnb[v];

                ps5 = "¿Cuantos no " + vn5[v] + "?";
                ps5eng = "How many don't we " + vnb[v];
                break;

            //Pasado
            case 2:
                if (sr == 0) {
                    ps1 = "¿Cuantos " + ps1pre[v] + "?";
                    ps1eng = "How many did i" + vnb[v];

                    ps2 = "¿Cuantos " + ps2pre[v] + "?";
                    ps2eng = "How many did you " + vnb[v];

                    ps3 = "¿Cuantos " + ps3p[v] + "él?";
                    ps3eng = "How many did he " + vnb[v];

                    ps3ella = "¿Cuantos " + ps3p[v] + "ella?";
                    ps3she = "How many did she " + vnb[v];

                    ps3eso = "¿Cuantos " + ps3p[v] + "eso?";
                    ps3it = "How many did it " + vnb[v];

                    ps4 = "¿Cuantos " + vn4p[v] + "?";
                    ps4eng = "How many did they " + vnb[v];

                    ps5 = "¿Cuantos " + vn5p[v] + "?";
                    ps5eng = "How many did we " + vnb[v];
                } else {
                    ps1 = "¿Cuantos " + ps1imp[v] + "?";
                    ps1eng = "How many did i " + vnb[v];

                    ps2 = "¿Cuantos " + ps2imp[v] + "?";
                    ps2eng = "How many did you " + vnb[v];

                    ps3 = "¿Cuantos " + ps3imp[v] + "él?";
                    ps3eng = "How many did he " + vnb[v];

                    ps3ella = "¿Cuantos " + ps3imp[v] + "ella?";
                    ps3she = "How many did she " + vnb[v];

                    ps3eso = "¿Cuantos " + ps3imp[v] + "eso?";
                    ps3it = "How many did it " + vnb[v];

                    ps4 = "¿Cuantos " + vn4imp[v] + "?";
                    ps4eng = "How many did they " + vnb[v];

                    ps5 = "¿Cuantos " + vn5imp[v] + "?";
                    ps5eng = "How many did we " + vnb[v];
                }
                break;
            case 3:
                if (sr == 0) {
                    ps1 = "¿Cuantos no " + ps1pre[v] + "?";
                    ps1eng = "How many didn't i " + vnb[v];

                    ps2 = "¿Cuantos no " + ps2pre[v] + "?";
                    ps2eng = "How many didn't you " + vnb[v];

                    ps3 = "¿Cuantos no " + ps3p[v] + "él?";
                    ps3eng = "How many didn't he " + vnb[v];

                    ps3ella = "¿Cuantos no " + ps3p[v] + "ella?";
                    ps3she = "How many didn't she " + vnb[v];

                    ps3eso = "¿Cuantos no " + ps3p[v] + "eso?";
                    ps3it = "How many didn't it " + vnb[v];

                    ps4 = "¿Cuantos no " + vn4p[v] + "?";
                    ps4eng = "How many didn't they " + vnb[v];

                    ps5 = "¿Cuantos no " + vn5p[v] + "?";
                    ps5eng = "How many didn't we " + vnb[v];
                } else {
                    ps1 = "¿Cuantos no " + ps1imp[v] + "?";
                    ps1eng = "How many didn't i " + vnb[v];

                    ps2 = "¿Cuantos no " + ps2imp[v] + "?";
                    ps2eng = "How many didn't you " + vnb[v];

                    ps3 = "¿Cuantos no " + ps3imp[v] + "él?";
                    ps3eng = "How many didn't he " + vnb[v];

                    ps3ella = "¿Cuantos no " + ps3imp[v] + "ella?";
                    ps3she = "How many didn't she " + vnb[v];

                    ps3eso = "¿Cuantos no " + ps3imp[v] + "eso?";
                    ps3it = "How many didn't it " + vnb[v];

                    ps4 = "¿Cuantos no " + vn4imp[v] + "?";
                    ps4eng = "How many didn't they " + vnb[v];

                    ps5 = "¿Cuantos no " + vn5imp[v] + "?";
                    ps5eng = "How many didn't we " + vnb[v];
                }
                break;

            //Futuro
            case 4:
                ps1 = "¿Cuantos " + vn1f[v] + "?";
                ps1eng = "How many will i " + vnb[v];

                ps2 = "¿Cuantos " + vn2f[v] + "?";
                ps2eng = "How many will you " + vnb[v];

                ps3 = "¿Cuantos " + vn3f[v] + "él?";
                ps3eng = "How many will he " + vnb[v];

                ps3ella = "¿Cuantos " + vn3f[v] + "ella?";
                ps3she = "How many will she " + vnb[v];

                ps3eso = "¿Cuantos " + vn3f[v] + "eso?";
                ps3it = "How many will it " + vnb[v];

                ps4 = "¿Cuantos " + vn4f[v] + "?";
                ps4eng = "How many will they " + vnb[v];

                ps5 = "¿Cuantos " + vn5f[v] + "?";
                ps5eng = "How many will we " + vnb[v];
                break;
            case 5:
                ps1 = "¿Cuantos no " + vn1f[v] + "?";
                ps1eng = "How many won't i " + vnb[v];

                ps2 = "¿Cuantos no " + vn2f[v] + "?";
                ps2eng = "How many won't you " + vnb[v];

                ps3 = "¿Cuantos no " + vn3f[v] + "él?";
                ps3eng = "How many won't he " + vnb[v];

                ps3ella = "¿Cuantos no " + vn3f[v] + "ella?";
                ps3she = "How many won't she " + vnb[v];

                ps3eso = "¿Cuantos no " + vn3f[v] + "eso?";
                ps3it = "How many won't it " + vnb[v];

                ps4 = "¿Cuantos no " + vn4f[v] + "?";
                ps4eng = "How many won't they " + vnb[v];

                ps5 = "¿Cuantos no " + vn5f[v] + "?";
                ps5eng = "How many won't we " + vnb[v];
                break;
        }
    }//LR 13/12/2022
   public void GenHowManyCont1() {
        switch (neg) {
            case 0:
                ps1 = "¿Cuantos " + scontIesp[s] + vnbcs[v] + "?";
                ps1eng = "How many " + scontI[s] + vnbc[v];

                ps2 = "¿Cuantos " + scontYouesp[s] + vnbcs[v] + "?";
                ps2eng = "How many " + scontYou[s] + vnbc[v];

                ps3 = "¿Cuantos " + scontHeesp[s] + vnbcs[v] + "él?";
                ps3eng = "How many " + scontHe[s] + vnbc[v];

                ps3ella = "¿Cuantos " + scontSheesp[s] + vnbcs[v] + "ella?";
                ps3she = "How many " + scontShe[s] + vnbc[v];

                ps3eso = "¿Cuantos " + scontItesp[s] + vnbcs[v] + "eso?";
                ps3it = "How many " + scontIt[s] + vnbc[v];

                ps4 = "¿Cuantos " + scontTheyesp[s] + vnbcs[v] + "?";
                ps4eng = "How many " + scontThey[s] + vnbc[v];

                ps5 = "¿Cuantos " + scontWeesp[s] + vnbcs[v] + "?";
                ps5eng = "How many " + scontWe[s] + vnbc[v];
                break;

            case 1:
                ps1 = "¿Cuantos " + scontIespno[s] + vnbcs[v] + "?";
                ps1eng = "How many " + scontIdont[s] + vnbc[v];

                ps2 = "¿Cuantos " + scontYouespno[s] + vnbcs[v] + "?";
                ps2eng = "How many " + scontYoudont[s] + vnbc[v];

                ps3 = "¿Cuantos " + scontHeespno[s] + vnbcs[v] + "él?";
                ps3eng = "How many " + scontHedont[s] + vnbc[v];

                ps3ella = "¿Cuantos " + scontSheespno[s] + vnbcs[v] + "ella?";
                ps3she = "How many " + scontShedont[s] + vnbc[v];

                ps3eso = "¿Cuantos " + scontItespno[s] + vnbcs[v] + "eso?";
                ps3it = "How many " + scontItdont[s] + vnbc[v];

                ps4 = "¿Cuantos " + scontTheyespno[s] + vnbcs[v] + "?";
                ps4eng = "How many " + scontTheydont[s] + vnbc[v];

                ps5 = "¿Cuantos " + scontWeespno[s] + vnbcs[v] + "?";
                ps5eng = "How many " + scontWedont[s] + vnbc[v];
                break;
        }
    }//LR 13/12/2022
   public void GenHowManyPerf1() {
        switch (neg) {
            case 0:
                ps1 = "¿Cuantos " + sperfIesp[s] + vpsp[v] + "?";
                ps1eng = "How many " + sperfI[s] + vpeng[v];

                ps2 = "¿Cuantos " + sperfYouesp[s] + vpsp[v] + "?";
                ps2eng = "How many " + sperfYou[s] + vpeng[v];

                ps3 = "¿Cuantos " + sperfHeesp[s] + vpsp[v] + "él?";
                ps3eng = "How many " + sperfHe[s] + vpeng[v];

                ps3ella = "¿Cuantos " + sperfSheesp[s] + vpsp[v] + "ella?";
                ps3she = "How many " + sperfShe[s] + vpeng[v];

                ps3eso = "¿Cuantos " + sperfItesp[s] + vpsp[v] + "eso?";
                ps3it = "How many " + sperfIt[s] + vpeng[v];

                ps4 = "¿Cuantos " + sperfTheyesp[s] + vpsp[v] + "?";
                ps4eng = "How many " + sperfThey[s] + vpeng[v];

                ps5 = "¿Cuantos " + sperfWeesp[s] + vpsp[v] + "?";
                ps5eng = "How many " + sperfWe[s] + vpeng[v];
                break;
            case 1:
                ps1 = "¿Cuantos " + sperfIespno[s] + vpsp[v] + "?";
                ps1eng = "How many " + sperfIdont[s] + vpeng[v];

                ps2 = "¿Cuantos " + sperfYouespno[s] + vpsp[v] + "?";
                ps2eng = "How many " + sperfYoudont[s] + vpeng[v];

                ps3 = "¿Cuantos " + sperfHeespno[s] + vpsp[v] + "él?";
                ps3eng = "How many " + sperfHedont[s] + vpeng[v];

                ps3ella = "¿Cuantos " + sperfSheespno[s] + vpsp[v] + "ella?";
                ps3she = "How many " + sperfShedont[s] + vpeng[v];

                ps3eso = "¿Cuantos " + sperfItespno[s] + vpsp[v] + "eso?";
                ps3it = "How many " + sperfItdont[s] + vpeng[v];

                ps4 = "¿Cuantos " + sperfTheyespno[s] + vpsp[v] + "?";
                ps4eng = "How many " + sperfTheydont[s] + vpeng[v];

                ps5 = "¿Cuantos " + sperfWeespno[s] + vpsp[v] + "?";
                ps5eng = "How many " + sperfWedont[s] + vpeng[v];

                break;
        }
    }//LR 13/12/2022

   //How Many Modales
   public void GenHowManyModalsSimp1(){
        int neg = (int) (Math.random() * 6);
        switch (neg){
            //Would
            case 0:
                ps1 = "¿Cuantos " + vn1w[v] + "?";
                ps1eng = "How many " + "would i " + vnb[v];

                ps2 = "¿Cuantos " + vn2w[v] + "?";
                ps2eng = "How many " + "would you " + vnb[v];

                ps3 = "¿Cuantos " + vn3w[v] + "él?";
                ps3eng = "How many " + "would he " + vnb[v];

                ps3ella = "¿Cuantos " + vn3w[v] + "ella?";
                ps3she = "How many " + "would she " + vnb[v];

                ps3eso = "¿Cuantos " + vn3w[v] + "eso?";
                ps3it = "How many " + "would it " + vnb[v];

                ps4 = "¿Cuantos " + vn4w[v] + "?";
                ps4eng = "How many " + "would they " + vnb[v];

                ps5 = "¿Cuantos " + vn5w[v] + "?";
                ps5eng = "How many " + "would we " + vnb[v];
                break;
            case 1:
                ps1 = "¿Cuantos no " + vn1w[v] + "?";
                ps1eng = "How many " + "wouldn't i " + vnb[v];

                ps2 = "¿Cuantos no " + vn2w[v] + "?";
                ps2eng = "How many " + "wouldn't you " + vnb[v];

                ps3 = "¿Cuantos no " + vn3w[v] + "él?";
                ps3eng = "How many " + "wouldn't he " + vnb[v];

                ps3ella = "¿Cuantos no " + vn3w[v] + "ella?";
                ps3she = "How many " + "wouldn't she " + vnb[v];

                ps3eso = "¿Cuantos no " + vn3w[v] + "eso?";
                ps3it = "How many " + "wouldn't it " + vnb[v];

                ps4 = "¿Cuantos no " + vn4w[v] + "?";
                ps4eng = "How many " + "wouldn't they " + vnb[v];

                ps5 = "¿Cuantos no " + vn5w[v] + "?";
                ps5eng = "How many " + "wouldn't we " + vnb[v];
                break;

            //Could
            case 2:
                ps1 = "¿Cuantos " + "podría " + vnbs[v] + "?";
                ps1eng = "How many " + "could i " + vnb[v];

                ps2 = "¿Cuantos " + "podrías " + vnbs[v] + "?";
                ps2eng = "How many " + "could you " + vnb[v];

                ps3 = "¿Cuantos " + "podría " + vnbs[v] + "él?";
                ps3eng = "How many " + "could he " + vnb[v];

                ps3ella = "¿Cuantos " + "podría " + vnbs[v] + "ella?";
                ps3she = "How many " + "could she " + vnb[v];

                ps3eso = "¿Cuantos " + "podría " + vnbs[v] + "eso?";
                ps3it = "How many " + "could it " + vnb[v];

                ps4 = "¿Cuantos " + "podrían " + vnbs[v] + "?";
                ps4eng = "How many " + "could they " + vnb[v];

                ps5 = "¿Cuantos " + "podríamos " + vnbs[v] + "?";
                ps5eng = "How many " + "could we " + vnb[v];
                break;
            case 3:
                ps1 = "¿Cuantos no " + "podría " + vnbs[v] + "?";
                ps1eng = "How many " + "couldn't i " + vnb[v];

                ps2 = "¿Cuantos no " + "podrías " + vnbs[v] + "?";
                ps2eng = "How many " + "couldn't you " + vnb[v];

                ps3 = "¿Cuantos no " + "podría " + vnbs[v] + "él?";
                ps3eng = "How many " + "couldn't he " + vnb[v];

                ps3ella = "¿Cuantos no " + "podría " + vnbs[v] + "ella?";
                ps3she = "How many " + "couldn't she " + vnb[v];

                ps3eso = "¿Cuantos no " + "podría " + vnbs[v] + "eso?";
                ps3it = "How many " + "couldn't it " + vnb[v];

                ps4 = "¿Cuantos no " + "podrían " + vnbs[v] + "?";
                ps4eng = "How many " + "couldn't they " + vnb[v];

                ps5 = "¿Cuantos no " + "podríamos " + vnbs[v] + "?";
                ps5eng = "How many " + "couldn't we " + vnb[v];
                break;

            //Should
            case 4:
                ps1 = "¿Cuantos " + "debería " + vnbs[v] + "?";
                ps1eng = "How many " + "should i " + vnb[v];

                ps2 = "¿Cuantos " + "deberías " + vnbs[v] + "?";
                ps2eng = "How many " + "should you " + vnb[v];

                ps3 = "¿Cuantos " + "debería " + vnbs[v] + "él?";
                ps3eng = "How many " + "should he " + vnb[v];

                ps3ella = "¿Cuantos " + "debería " + vnbs[v] + "ella?";
                ps3she = "How many " + "should she " + vnb[v];

                ps3eso = "¿Cuantos " + "debería " + vnbs[v] + "eso?";
                ps3it = "How many " + "should it " + vnb[v];

                ps4 = "¿Cuantos " + "deberían " + vnbs[v] + "?";
                ps4eng = "How many " + "should they " + vnb[v];

                ps5 = "¿Cuantos " + "deberíamos " + vnbs[v] + "?";
                ps5eng = "How many " + "should we " + vnb[v];
                break;
            case 5:
                ps1 = "¿Cuantos no " + "debería " + vnbs[v] + "?";
                ps1eng = "How many " + "shouldn't i " + vnb[v];

                ps2 = "¿Cuantos no " + "deberías " + vnbs[v] + "?";
                ps2eng = "How many " + "shouldn't you " + vnb[v];

                ps3 = "¿Cuantos no " + "debería " + vnbs[v] + "él?";
                ps3eng = "How many " + "shouldn't he " + vnb[v];

                ps3ella = "¿Cuantos no " + "debería " + vnbs[v] + "ella?";
                ps3she = "How many " + "shouldn't she " + vnb[v];

                ps3eso = "¿Cuantos no " + "debería " + vnbs[v] + "eso?";
                ps3it = "How many " + "shouldn't it " + vnb[v];

                ps4 = "¿Cuantos no " + "deberían " + vnbs[v] + "?";
                ps4eng = "How many " + "shouldn't they " + vnb[v];

                ps5 = "¿Cuantos no " + "deberíamos " + vnbs[v] + "?";
                ps5eng = "How many " + "shouldn't we " + vnb[v];
                break;

        }
    }//LR 13/12/2022
   public void GenHowManyModalsCont1() {
        switch (neg) {
            case 0:
                ps1 = "¿Cuantos " + scontmIesp[s] + vnbcs[v] + "?";
                ps1eng = "How many " + scontmI[s] + vnbc[v];

                ps2 = "¿Cuantos " + scontmYouesp[s] + vnbcs[v] + "?";
                ps2eng = "How many " + scontmYou[s] + vnbc[v];

                ps3 = "¿Cuantos " + scontmHeesp[s] + vnbcs[v] + "él?";
                ps3eng = "How many " + scontmHe[s] + vnbc[v];

                ps3ella = "¿Cuantos " + scontmSheesp[s] + vnbcs[v] + "ella?";
                ps3she = "How many " + scontmShe[s] + vnbc[v];

                ps3eso = "¿Cuantos " + scontmItesp[s] + vnbcs[v] + "eso?";
                ps3it = "How many " + scontmIt[s] + vnbc[v];

                ps4 = "¿Cuantos " + scontmTheyesp[s] + vnbcs[v] + "?";
                ps4eng = "How many " + scontmThey[s] + vnbc[v];

                ps5 = "¿Cuantos " + scontmWeesp[s] + vnbcs[v] + "?";
                ps5eng = "How many " + scontmWe[s] + vnbc[v];
                break;

            case 1:
                ps1 = "¿Cuantos " + scontmIespno[s] + vnbcs[v] + "?";
                ps1eng = "How many " + scontmIdont[s] + vnbc[v];

                ps2 = "¿Cuantos " + scontmYouespno[s] + vnbcs[v] + "?";
                ps2eng = "How many " + scontmYoudont[s] + vnbc[v];

                ps3 = "¿Cuantos " + scontmHeespno[s] + vnbcs[v] + "él?";
                ps3eng = "How many " + scontmHedont[s] + vnbc[v];

                ps3ella = "¿Cuantos " + scontmSheespno[s] + vnbcs[v] + "ella?";
                ps3she = "How many " + scontmShedont[s] + vnbc[v];

                ps3eso = "¿Cuantos " + scontmItespno[s] + vnbcs[v] + "eso?";
                ps3it = "How many " + scontmItdont[s] + vnbc[v];

                ps4 = "¿Cuantos " + scontmTheyespno[s] + vnbcs[v] + "?";
                ps4eng = "How many " + scontmTheydont[s] + vnbc[v];

                ps5 = "¿Cuantos " + scontmWeespno[s] + vnbcs[v] + "?";
                ps5eng = "How many " + scontmWedont[s] + vnbc[v];
                break;
        }
    }//LR 13/12/2022
   public void GenHowManyModalsPerf1() {
        switch (neg) {
            case 0:
                ps1 = "¿Cuantos " + sperfmIesp[s] + vpsp[v] + "?";
                ps1eng = "How many " + sperfmI[s] + vpeng[v];

                ps2 = "¿Cuantos " + sperfmYouesp[s] + vpsp[v] + "?";
                ps2eng = "How many " + sperfmYou[s] + vpeng[v];

                ps3 = "¿Cuantos " + sperfmHeesp[s] + vpsp[v] + "él?";
                ps3eng = "How many " + sperfmHe[s] + vpeng[v];

                ps3ella = "¿Cuantos " + sperfmSheesp[s] + vpsp[v] + "ella?";
                ps3she = "How many " + sperfmShe[s] + vpeng[v];

                ps3eso = "¿Cuantos " + sperfmItesp[s] + vpsp[v] + "eso?";
                ps3it = "How many " + sperfmIt[s] + vpeng[v];

                ps4 = "¿Cuantos " + sperfmTheyesp[s] + vpsp[v] + "?";
                ps4eng = "How many " + sperfmThey[s] + vpeng[v];

                ps5 = "¿Cuantos " + sperfmWeesp[s] + vpsp[v] + "?";
                ps5eng = "How many " + sperfmWe[s] + vpeng[v];
                break;
            case 1:
                ps1 = "¿Cuantos " + sperfmIespno[s] + vpsp[v] + "?";
                ps1eng = "How many " + sperfmIdont[s] + vpeng[v];

                ps2 = "¿Cuantos " + sperfmYouespno[s] + vpsp[v] + "?";
                ps2eng = "How many " + sperfmYoudont[s] + vpeng[v];

                ps3 = "¿Cuantos " + sperfmHeespno[s] + vpsp[v] + "él?";
                ps3eng = "How many " + sperfmHedont[s] + vpeng[v];

                ps3ella = "¿Cuantos " + sperfmSheespno[s] + vpsp[v] + "ella?";
                ps3she = "How many " + sperfmShedont[s] + vpeng[v];

                ps3eso = "¿Cuantos " + sperfmItespno[s] + vpsp[v] + "eso?";
                ps3it = "How many " + sperfmItdont[s] + vpeng[v];

                ps4 = "¿Cuantos " + sperfmTheyespno[s] + vpsp[v] + "?";
                ps4eng = "How many " + sperfmTheydont[s] + vpeng[v];

                ps5 = "¿Cuantos " + sperfmWeespno[s] + vpsp[v] + "?";
                ps5eng = "How many " + sperfmWedont[s] + vpeng[v];

                break;
        }
    }//LR 13/12/2022
}

