package com.leal.cipm_testing;

public class Intrans3 {
    Generator3 gen = new Generator3();

    int rand;
    int rand2;
    int rand3;
    int rand4;
    int r5;
    int r6;
    int r7;
    int r8;
    int r9;
    int r10;
    int r11;
    int r12;
    int r13;
    int r14;
    int r15;
    int r16;
    int r17;
    int r18;
    int r19;
    int r20;
    int r21;
    int r22;
    int r23;
    int r24;
    int r25;
    int r26;
    int r27;
    int r28;
    int r29;
    int r30;
    int r31;
    int r32;
    int r33;
    int r34;
    int r35;
    int r36;
    int r37;
    int r38;
    int r39;
    int r40;
    int r41;
    int r42;



    String vib[] = {
            "rest ", "charge ", "dance ", "live ", "stop ",
            "fail ", "worry ", "travel ", "return ", "walk ", "run ",
            "rise ", "fly "
    };

    String vibesp[] = {"descansar ", "cobrar ", "bailar ", "vivir ",
            "detener ", "fallar ", "preocuparse ", "viajar ", "devolver ",
            "caminar ", "correr ", "subir ", "volar "
    };

    // verbos intransitivos tercera persona eng
    String vib3[] = {"rests ", "charges ", "dances ", "lives ", "stops ",
            "fails ", "worries ", "travels ", "returns ", "walks ", "runs ",
            "rises ", "flies "

    };
    // verbos intransitivos base tercera persona esp
    String vib3esp[] = {"descansa ", "cobra ", "baila ", "vive ", "se detiene ",
            "falla ", "preocupaciones ", "viaja ", "regresa ", "camina ",
            "corre ", "sube ", "vuela "
    };

    // continuos intransitivos inglés
    String vib3cont[] = {"resting ", "charging ", "dancing ", "living ",
            "stopping ", "failing ", "worrying ", "traveling ", "returning ",
            "walking ", "running ", "rising ", "flying "
    };

    // participio intransitivo esp
    String vib3contesp[] = {"descansando ", "cobrando ", "bailando ", "viviendo ",
            "deteniendo ", "fallando ", "preocupando ", "viajando ", "regresando ",
            "caminando ", "corriendo ", "subiendo ", "volando "
    };

    //participio intransitivo inglés
    String viparticiple[] = {"rested ", "charged ", "danced ", "lived ",
            "stopped ", "failed ", "worried ", "traveled ", "returned ",
            "walked ", "run ", "risen ", "flown "
    };
    String vibparticipiosp[] = {"descansado ", "cobrado ", "bailado ", "vivido ",
            "detengo ", "fallado ", "preocupado ", "viajado ", "regresado ",
            "caminando ", "corrido ", "subido ", "volado "
    };

    //verbos intransitivos base primera
    String vib1[] = {"descanso ", "cobro ", "bailo ", "vivo ",
            "me detengo ", "fallo ", "me preocupo ", "viajo ", "regreso ",
            "camino ", "corro ", "subo ", "vuelo "
    };
    //verbos intransitivos base segunda
    String vib2[] = {"descansas ", "cobras ", "bailas ", "vives ",
            "te detenienes ", "fallas ", "te preocupas ", "viajas ", "regresas ",
            "caminas ", "corres ", "subes ", "vuelas "
    };

    String vib3p[]={
            "descansa ","cobra ","baila ","vive ","se detiene ","falla ",
            "se preocupa ","viaja ","regresa ","camina ","corre ",
            "sube ","vuela "
    };

    //verbos intransitivos base tercera plural
    String vib4[] = {"descansan ", "cobran ", "bailan ", "viven ",
            "se detienen ", "fallan ", "se preocupan ", "viajan ", "regresan ",
            "caminan ", "corren ", "suben ", "vuelan "
    };
    //verbos intransitivos base nosotros
    String vibnos[] = {"descansamos ", "cobramos ", "bailamos ", "vivimos ",
            "nos detenemos ", "fallamos ", "nos preocupamos ", "viajamos ", "regresamos ",
            "caminamos ", "corremos ", "subimos ", "volamos "
    };

    //verbo intrasitivo base futuro primer persona
    String vib1f[] = {"descansaré ", "cobraré ", "bailaré ", "viviré ",
            "me detendré ", "fallaré ", "preocuparé ", "viajaré ", "regresaré ",
            "caminaré ", "correré ", "subiré ", "volaré "
    };
    //verbo intrasitivo base futuro segunda persona
    String vib2f[] = {"descansarás ", "cobrarás ", "bailarás ", "vivirás ",
            "te detendrás ", "fallarás ", "preocuparás ", "viajarás ", "regresarás ",
            "caminarás ", "correrás ", "subirás ", "volarás "
    };
    //verbo intranstivo base futuro tercera persona
    String vib3f[] = {
            "descansará ", "cobrará ", "bailará ", "vivirá ",
            "se detendrá ", "fallará ", "preocupará ", "viajará ", "regresará ",
            "caminará ", "correrá ", "subirá ", "volará "
    };
    //verbo intransitivo base futuro cuarta persona
    String vib4f[] = {"descansarán ", "cobrarán ", "bailarán ", "vivirán ",
            "se detendran ", "fallarán ", "preocuparán ", "viajarán ", "regresarán ",
            "caminarán ", "correrán ", "subirán ", "volarán "
    };
    //verbo intransitivo base futuro nosotros
    String vibfnos[] = {"descansaremos ", "cobraremos ", "bailaremos ", "viviremos ",
            "nos detendremos ", "fallamos ", "preocupamos ", "viajamos ", "regresamos ",
            "caminamos ", "corremos ", "subimos ", "volamos "
    };

    // subjuntivos intransitivos
    String vib1s[] = {
            "descanse ", "cobre ", "baile ", "viva ",
            "me detuve ", "falle ", "preocupe ", "viaje ", "regrese ",
            "camine ", "corra ", "suba ", "vuele "
    };
    String vib2s[] = {"descanses ", "cobres ", "bailes ", "vivas ",
            "se detuvo ", "falles ", "preocupes ", "viajes ", "regreses ",
            "camines ", "corras ", "subas ", "vueles "
    };
    String vib3s[] = {"descanse ", "cobre ", "baile ", "viva ",
            "se detuvo ", "falle ", "preocupe ", "viaje ", "regrese ",
            "camine ", "corra ", "suba ", "vuele "
    };
    String vib4s[] = {"descansen ", "cobren ", "bailen ", "vivan ",
            "se detienen ", "fallen ", "preocupen ", "viajen ", "regresen ",
            "caminen ", "corran ", "suban ", "vuelen "
    };
    String vib5s[] = {"descansemos ", "cobremos ", "bailemos ", "vivamos ",
            "nos detuvimos ", "fallemos ", "preocupemos ", "viajemos ", "regresemos ",
            "caminemos ", "corramos ", "subamos ", "volemos "
    };


    // hipoteticos intransitivos
    String vib1w[] = {"descansaría ", "cobraría ", "bailaría ", "viviría ",
            "me dentedría ", "fallaría ", "preocuparía ", "viajaría ", "devolvería ",
            "caminaría ", "correría ", "subiría ", "volaría "
    };
    String vib2w[] = {"descansarías ", "cobrarías ", "bailarías ", "vivirías ",
            "te detendrías ", "fallarías ", "preocuparías ", "viajarías ", "devolverías ",
            "caminarías ", "correrías ", "subirías ", "volarías "
    };
    String vib3w[] = {"descansaría ", "cobraría ", "bailaría ", "viviría ",
            "se detendría ", "fallaría ", "preocuparía ", "viajaría ", "devolvería ",
            "caminaría ", "correría ", "subiría ", "volaría "
    };
    String vib4w[] = {"descansarían ", "cobrarían ", "bailarían ", "vivirían ",
            "se detendrían ", "fallarían ", "preocuparían ", "viajarían ", "devolverían ",
            "caminarían ", "correrían ", "subirían ", "volarían "
    };
    String vib5w[] = {"descansaríamos ", "cobraríamos ", "bailaríamos ", "viviríamos ",
            "nos detendríamos ", "fallaríamos ", "preocuparíamos ", "viajaríamos ", "devolveríamos ",
            "caminaríamos ", "correríamos ", "subiríamos ", "volaríamos "
    };

    //fin de verbos

    String with[] = {"with the wife ", "with the children ", "with children ", "with men ", "with a man",
            "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ", "with the woman ",
            "with the dentist ", "with the mailman ", "with the fireman ", "with people ", "with the people ", "with a nurse ",
            "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
            "with my friend ", "with my cousin ", "with the father ", "with the mother "
    };
    String con[] = {"con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
            "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
            "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ", "con gente ", "con la gente ",
            "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ", "con el maestro ", "con mi amiparticipate ",
            "con mi primo ", "con el papá ", "con la mamá "
    };

    String at[] = {"at the restaurant", "at school ", "at the house ", "at the concert ", "at the store ", "at church ", "at the hospital ",
            "at the office ", "at the station "
    };
    String aten[] = {"en el restaurante (pero no dentro) ", "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
            "en el concierto (pero no dentro) ",
            "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ", "en el hospital (pero no dentro) ",
            "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "
    };

    String from[] = {"from the jungle ", "from the house ", "from the office ", "from the hospital "
    };
    String defrom[] = {"de la selva ", "de la casa ", "de la oficina ", "de el hospital "
    };
    String defromdesde[] = {"desde la selva ", "desde la casa ", "desde la oficina ", "desde el hospital "
    };

    String during[] = {"during the game ", "during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
    };
    String duringsp[] = {"durante el juego ", "durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
    };

    String until[] = {"until tomorrow ", "until the next day ", "until next year ", "until five "
    };
    String hasta[] = {"hasta mañana ", "hasta el siguiente dia ", "hasta el siguiente año ", "hasta las cinco "
    };

    String among[] = {"among people ", "among artist ", "among teachers "
    };
    String entreamong[] = {"entre gente ", "entre artistas ", "entre maestros "
    };

    String through[] = {"through the days ", "through the forest ", "through the vegetation ", "through the house "
    };
    String throughsp[] = {"a través de los dias ", "a través de el bosque ", "a través de la vegetación ", "a través de la casa "
    };

    String towrd[] = {"towards the house ", "towards the person ", "towards the police station ", "towards knowledge "
    };
    String hacia[] = {"hacia la casa ", "hacia la persona ", "hacia la estación de policia ", "hacia el conocimiento "
    };

    String to[] = {"to the house ", "to the store ", "to school ", "to the concert "
    };
    String toa[] = {"a la casa ", "a la tienda ", "a la escuela ", "a el concierto"
    };

    String in[] = {"in the house ", "in the friedge ", "in the year ", "in the bus ", "in the car ", "in the club "
    };
    String indent[] = {"en la casa ", "el el refrigerador ", "en el año ", "en el camion ", "en el carro ", "en el antro "
    };

    String ffor[] = {"for everyone ", "for you ", "for the city ", "for my friend "
    };
    String para[] = {"para todos ", "para ti ", "para la ciudad ", "para mi amiparticipate "
    };

    String on[] = {"on the table ", "on the wall ", "on the surface ", "on the roof ", "on the window "
    };
    String sobreon[] = {"sobre la mesa ", "sobre la pared ", "sobre la superficie ", "sobre el techo ", "sobre la ventana "
    };

    String by[] = {"by the house ", "by the station ", "by the river ", "by the park "
    };
    String bypor[] = {"por la casa ", "por la estación ", "por el rio ", "por el parque "
    };

    String about[] = {"about you ", "about the problems ", "about the book ", "about the situation "
    };
    String aboutsob[] = {"sobre ti ", "sobre el problema ", "sobre el libro ", "sobre la situación "
    };

    String above[] = {"above the house ", "above the car ", "above your head "
    };
    String abovesp[] = {"por encima de la casa", "por encima de el carro ", "por encima de tu cabeza "
    };

    String between[] = {"between the car and the house ", "between you and me ", "between two places "
    };
    String betweensp[] = {"entre el carro y la casa ", "entre tu y yo ", "entre dos lugares "
    };

    String since[] = {"since five ", "since this morning ", "since last year "
    };
    String sincesp[] = {"desde las cinco ", "desde esta mañana ", "desde el año pasado "
    };

    String under[] = {"under the radar ", "under the bed ", "under the house ", "under you "
    };
    String undersp[] = {"por debajo del radar ", "debajo de la cama ", "por debajo de la casa ", "debajo de ti "
    };

    String without[] = {"without you ", "without money ", "without permission "
    };
    String sin[] = {"sin ti ", "sin dinero ", "sin permiso "
    };

    String across[] = {"across the street ", "across the nation ", "across the park "
    };
    String acrossp[] = {"cruzando la calle ", "cruzando la nacion ", "cruzando el parque "
    };

    String behind[] = {"behind the car ", "behind the house ", "behind the restaurant "
    };
    String behindsp[] = {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
    };

    String beyond[] = {"beyond the forest ", "beyond the city ", "beyond the jugle "
    };
    String beyondsp[] = {"más allá de el bosque ", "más allá de la ciudad ", "más allá de la selva "
    };

    String outof[] = {"out of the house ", "out of jail ", "out of school ", "out of the car "
    };
    String outofsp[] = {"fuera de la casa", "fuera de la carcel ", "fuera de la escuela ", "fuera de el carro "
    };

    String around[] = {"around the house ", "around the park ", "around the church ", "around the block "
    };
    String aroundsp[] = {"al rededor de la casa ", "al rededor del parque ", "al rededor de la iglesia ", "al rededor de la cuadra "
    };

    String near[] = {"near the house ", "near the station ", "near the end ", "near the river "
    };
    String nearsp[] = {"cerca de la casa ", "cerca de la estación ", "cerca de el fin ", "cerca del rio "
    };


    String advfrequ[] = {
            "siempre ", "constantemente ", "frecuentemente ",
            "generalmente ", "normalmente ", "ocasionalmente ",
            "seguido ", "raramente ", "regularmente ",
            "usualmente ", "felizmente ", "temprano ",
            "tarde ", "diariamente ", "perfectamente ",
            "fácilmente ", "cuidadosamente ", "abiertamente ",
            "finalmente ", "peligrosamente ", "desesperadamente ",
            "ocasionalmente ", "seguido ", "calmadamente "
    };
    String frequadv[] = {
            "always ", "constantly ", "frequently ",
            "generally ", "normally ", "occasionally ",
            "often ", "rarely ", "regularly ",
            "usually ", "happily ", "early ",
            "late ", "daily ", "perfectly ",
            "easily ", "carefully ", "openly ",
            "finally ", "dangerouslly ", "desperately ",
            "occasionally ", "often ", "calmly "
    };

    // the single dimention arrays are on top, now to make the special 2 dimentional arrays

    String restSpecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "},
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "},
    };
    String descansarSpecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "},
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "},
    };

    String chargeSpecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "},
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "},
    };
    String cobrarSpecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "},
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "},
    };

    String danceSpecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "},
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "},
    };
    String bailarSpecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "},
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "},
    };

    String liveSpecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "},
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "},
    };
    String vivirSpecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "},
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "},
    };

    String stopSpecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "},
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "},
    };
    String detenerSpecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "},
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "},
    };

    String failSpecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "},
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "},
    };
    String fallarSpecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "},
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "},
    };

    String worrySpecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "},
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "},
    };
    String preocuparseSpecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "},
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "},
    };

    String travelSpecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "},
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "},
    };
    String viajarSpecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "},
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "},
    };

    String returnSpecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "},
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "},
    };
    String devolverSpecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "},
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "},

    };

    String walkSpecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "},
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "},
    };
    String caminarSpecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "},
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "},
    };

    String runSpecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "},
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "},
    };
    String correrSpecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "},
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "},

    };

    String riseSpecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "},
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "},

    };
    String subirSpecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "},
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "},
    };

    String flySpecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "},
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "},
    };
    String volarSpecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "},
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "},
    };

    String arrayEsp;
    String arrayEng;

    public void randstarter() {
        rand = (int) (Math.random() * vib.length);
        rand2 = (int) (Math.random() * gen.pronombres.length);
        rand3 = (int) (Math.random() * restSpecial.length);
        rand4 = (int) (Math.random() * restSpecial[rand3].length);
        r5 = (int) (Math.random() * chargeSpecial.length);
        r6 = (int) (Math.random() * chargeSpecial[r5].length);
        r7 = (int) (Math.random() * danceSpecial.length);
        r8 = (int) (Math.random() * danceSpecial[r7].length);
        r9 = (int) (Math.random() * liveSpecial.length);
        r10 = (int) (Math.random() * liveSpecial[r9].length);
        r11 = (int) (Math.random() * stopSpecial.length);
        r12 = (int) (Math.random() * stopSpecial[r11].length);
        r13 = (int) (Math.random() * failSpecial.length);
        r14 = (int) (Math.random() * failSpecial[r13].length);
        r15 = (int) (Math.random() * worrySpecial.length);
        r16 = (int) (Math.random() * worrySpecial[r15].length);
        r17 = (int) (Math.random() * travelSpecial.length);
        r18 = (int) (Math.random() * travelSpecial[r17].length);
        r19 = (int) (Math.random() * returnSpecial.length);
        r20 = (int) (Math.random() * returnSpecial[r19].length);
        r21 = (int) (Math.random() * walkSpecial.length);
        r22 = (int) (Math.random() * walkSpecial[r21].length);
        r23 = (int) (Math.random() * runSpecial.length);
        r24 = (int) (Math.random() * runSpecial[r23].length);
        r25 = (int) (Math.random() * riseSpecial.length);
        r26 = (int) (Math.random() * riseSpecial[r25].length);
        r27 = (int) (Math.random() * flySpecial.length);
        r28 = (int) (Math.random() * flySpecial[r27].length);
        
    }

    public void arraySpe(){
        String temp = vib[rand];

        switch (temp){
            case "rest ":
                arrayEsp = descansarSpecial[rand3][rand4];
                arrayEng = restSpecial[rand3][rand4];

                break;
            case "charge ":
                arrayEsp = cobrarSpecial[r5][r6];
                arrayEng = chargeSpecial[r5][r6];

                break;
            case "dance ":
                arrayEsp = bailarSpecial[r7][r8];
                arrayEng = danceSpecial[r7][r8];

                break;
            case "live ":
                arrayEsp = vivirSpecial[r9][r10];
                arrayEng = liveSpecial[r9][r10];

                break;
            case "stop ":
                arrayEsp = detenerSpecial[r11][r12];
                arrayEng = stopSpecial[r11][r12];

                break;
            case "fail ":
                arrayEsp = fallarSpecial[r13][r14];
                arrayEng = failSpecial[r13][r14];

                break;
            case "worry ":
                arrayEsp = preocuparseSpecial[r15][r16];
                arrayEng = worrySpecial[r15][r16];

                break;
            case "travel ":
                arrayEsp = viajarSpecial[r17][r18];
                arrayEng = travelSpecial[r17][r18];

                break;
            case "return ":
                arrayEsp = devolverSpecial[r19][r20];
                arrayEng = returnSpecial[r19][r20];

                break;
            case "walk ":
                arrayEsp = caminarSpecial[r21][r22];
                arrayEng = walkSpecial[r21][r22];

                break;
            case "run ":
                arrayEsp = correrSpecial[r23][r24];
                arrayEng = runSpecial[r23][r24];

                break;
            case "rise ":
                arrayEsp = subirSpecial[r25][r26];
                arrayEng = riseSpecial[r25][r26];

                break;
            case "fly ":
                arrayEsp = volarSpecial[r27][r28];
                arrayEng = flySpecial[r27][r28];

                break;
        }
    }

    String sp1;
    String eng1;
    String eng12;
    String sp2;
    String eng2;
    String eng22;
    String sp3;
    String eng3;
    String eng32;
    String sp4;
    String eng4;
    String eng42;
    String sp5;
    String eng5;
    String eng52;
    String sp6;
    String eng6;
    String eng62;
    String sp7;
    String eng7;
    String eng72;

    //DIFICULTAD 1 RESPALDO FEB 2323
    public void Prueba1(){
        
        randstarter();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg){
                    case 0:
                        sp1 = "yo " + vib1[rand];
                        eng1 = "I " + vib[rand];
                        eng12 = "I " + vib[rand];
                        sp2 = "tú " + vib2[rand];
                        eng2 = "you " + vib[rand];
                        eng22 = "you " + vib[rand];
                        sp3 = "él " + vib3esp[rand];
                        eng3 = "he " + vib[rand];
                        eng32 = "he " + vib[rand];
                        sp4 = "ella " + vib3esp[rand];
                        eng4 = "she " + vib[rand];
                        eng42 = "she " + vib[rand];
                        sp5 = "eso " + vib3esp[rand];
                        eng5 = "it " + vib[rand];
                        eng52 = "it " + vib[rand];
                        sp6 = "ellos " + vib3p[rand];
                        eng6 = "they " + vib[rand];
                        eng62 = "they " + vib[rand];
                        sp7 = "nosotros " + vibnos[rand];
                        eng7 = "we " + vib[rand];
                        eng72 = "we " + vib[rand];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1[rand];
                        eng1 = "I do not " + vib[rand];
                        eng12 = "I don't " + vib[rand];
                        sp2 = "tú " + "no " + vib2[rand];
                        eng2 = "you do not " + vib[rand];
                        eng22 = "you don't " + vib[rand];
                        sp3 = "él no " + vib3esp[rand];
                        eng3 = "he do not " + vib[rand];
                        eng32 = "he don't " + vib[rand];
                        sp4 = "ella no " + vib3esp[rand];
                        eng4 = "she do not " + vib[rand];
                        eng42 = "she don't " + vib[rand];
                        sp5 = "eso no " + vib3esp[rand];
                        eng5 = "it do not " + vib[rand];
                        eng52 = "it don't " + vib[rand];
                        sp6 = "ellos " + "no " + vib3p[rand];
                        eng6 = "they do not " + vib[rand];
                        eng62 = "they don't " + vib[rand];
                        sp7 = "nosotros " + "no " + vibnos[rand];
                        eng7 = "we do not " + vib[rand];
                        eng72 = "we don't " + vib[rand];
                        break;
                }
            }
        }
    }
    public void Prueba2(){
        
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg){
                    case 0:
                        sp1 = "yo " + vib1[rand] + arrayEsp;
                        eng1 = "I " + vib[rand] + arrayEng;
                        eng12 = "I " + vib[rand] + arrayEng;
                        sp2 = "tú " + vib2[rand] + arrayEsp;
                        eng2 = "you " + vib[rand] + arrayEng;
                        eng22 = "you " + vib[rand] + arrayEng;
                        sp3 = "él " + vib3esp[rand] + arrayEsp;
                        eng3 = "he " + vib[rand] + arrayEng;
                        eng32 = "he " + vib[rand] + arrayEng;
                        sp4 = "ella " + vib3esp[rand] + arrayEsp;
                        eng4 = "she " + vib[rand] + arrayEng;
                        eng42 = "she " + vib[rand] + arrayEng;
                        sp5 = "eso " + vib3esp[rand] + arrayEsp;
                        eng5 = "it " + vib[rand] + arrayEng;
                        eng52 = "it " + vib[rand] + arrayEng;
                        sp6 = "ellos " + vib3p[rand] + arrayEsp;
                        eng6 = "they " + vib[rand] + arrayEng;
                        eng62 = "they " + vib[rand] + arrayEng;
                        sp7 = "nosotros " + vibnos[rand] + arrayEsp;
                        eng7 = "we " + vib[rand] + arrayEng;
                        eng72 = "we " + vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + arrayEsp;
                        eng1 = "I do not " + vib[rand] + arrayEng;
                        eng12 = "I don't " + vib[rand] + arrayEng;
                        sp2 = "tú " + "no " + vib2[rand] + arrayEsp;
                        eng2 = "you do not " + vib[rand] + arrayEng;
                        eng22 = "you don't " + vib[rand] + arrayEng;
                        sp3 = "él no " + vib3esp[rand] + arrayEsp;
                        eng3 = "he do not " + vib[rand] + arrayEng;
                        eng32 = "he don't " + vib[rand] + arrayEng;
                        sp4 = "ella no " + vib3esp[rand] + arrayEsp;
                        eng4 = "she do not " + vib[rand] + arrayEng;
                        eng42 = "she don't " + vib[rand] + arrayEng;
                        sp5 = "eso no " + vib3esp[rand] + arrayEsp;
                        eng5 = "it do not " + vib[rand] + arrayEng;
                        eng52 = "it don't " + vib[rand] + arrayEng;
                        sp6 = "ellos " + "no " + vib3p[rand] + arrayEsp;
                        eng6 = "they do not " + vib[rand] + arrayEng;
                        eng62 = "they don't " + vib[rand] + arrayEng;
                        sp7 = "nosotros " + "no " + vibnos[rand] + arrayEsp;
                        eng7 = "we do not " + vib[rand] + arrayEng;
                        eng72 = "we don't " + vib[rand] + arrayEng;
                        break;
                }
            }
        }
    }
    public void Prueba3(){
        
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg){
                    case 0:
                        sp1 = "yo " + vib1[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + vib[rand] + arrayEng + frequadv[radv];
                        eng12 = "I " + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + vib2[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + vib[rand] + arrayEng + frequadv[radv];
                        eng22 = "you " + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + vib3esp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + vib[rand] + arrayEng + frequadv[radv];
                        eng32 = "he " + vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + vib3esp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + vib[rand] + arrayEng + frequadv[radv];
                        eng42 = "she " + vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + vib3esp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + vib[rand] + arrayEng + frequadv[radv];
                        eng52 = "it " + vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + vib3p[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + vib[rand] + arrayEng + frequadv[radv];
                        eng62 = "they " + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + vibnos[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + vib[rand] + arrayEng + frequadv[radv];
                        eng72 = "we " + vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I do not " + vib[rand] + arrayEng + frequadv[radv];
                        eng12 = "I don't " + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + "no " + vib2[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you do not " + vib[rand] + arrayEng + frequadv[radv];
                        eng22 = "you don't " + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no " + vib3esp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he do not " + vib[rand] + arrayEng + frequadv[radv];
                        eng32 = "he don't " + vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no " + vib3esp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she do not " + vib[rand] + arrayEng + frequadv[radv];
                        eng42 = "she don't " + vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no " + vib3esp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it do not " + vib[rand] + arrayEng + frequadv[radv];
                        eng52 = "it don't " + vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + "no " + vib3p[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they do not " + vib[rand] + arrayEng + frequadv[radv];
                        eng62 = "they don't " + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + "no " + vibnos[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we do not " + vib[rand] + arrayEng + frequadv[radv];
                        eng72 = "we don't " + vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }

    //presentes
    public void GenPresSimp1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1[rand];
                        eng1 = "I " + vib[rand];
                        eng12 = "I " + vib[rand];
                        sp2 = "tú " + vib2[rand];
                        eng2 = "you " + vib[rand];
                        eng22 = "you " + vib[rand];
                        sp3 = "él " + vib3p[rand];
                        eng3 = "he " + vib[rand];
                        eng32 = "he " + vib[rand];
                        sp4 = "ella " + vib3p[rand];
                        eng4 = "she " + vib[rand];
                        eng42 = "she " + vib[rand];
                        sp5 = "eso " + vib3p[rand];
                        eng5 = "it " + vib[rand];
                        eng52 = "it " + vib[rand];
                        sp6 = "ellos " + vib4[rand];
                        eng6 = "they " + vib[rand];
                        eng62 = "they " + vib[rand];
                        sp7 = "nosotros " + vibnos[rand];
                        eng7 = "we " + vib[rand];
                        eng72 = "we " + vib[rand];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1[rand];
                        eng1 = "I do not " + vib[rand];
                        eng12 = "I don't " + vib[rand];
                        sp2 = "tú " + "no " + vib2[rand];
                        eng2 = "you do not " + vib[rand];
                        eng22 = "you don't " + vib[rand];
                        sp3 = "él no " + vib3p[rand];
                        eng3 = "he do not " + vib[rand];
                        eng32 = "he don't " + vib[rand];
                        sp4 = "ella no " + vib3p[rand];
                        eng4 = "she do not " + vib[rand];
                        eng42 = "she don't " + vib[rand];
                        sp5 = "eso no " + vib3p[rand];
                        eng5 = "it do not " + vib[rand];
                        eng52 = "it don't " + vib[rand];
                        sp6 = "ellos " + "no " + vib4[rand];
                        eng6 = "they do not " + vib[rand];
                        eng62 = "they don't " + vib[rand];
                        sp7 = "nosotros " + "no " + vibnos[rand];
                        eng7 = "we do not " + vib[rand];
                        eng72 = "we don't " + vib[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPresCont1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estoy " + vib3contesp[rand];
                        eng1 = "I am " + vib3cont[rand];
                        eng12 = "I'm " + vib3cont[rand];
                        sp2 = "tú estás " + vib3contesp[rand];
                        eng2 = "you are " + vib3cont[rand];
                        eng22 = "you're " + vib3cont[rand];
                        sp3 = "él está " + vib3contesp[rand];
                        eng3 = "he is " + vib3cont[rand];
                        eng32 = "he's " + vib3cont[rand];
                        sp4 = "ella está " + vib3contesp[rand];
                        eng4 = "she is " + vib3cont[rand];
                        eng42 = "she's " + vib3cont[rand];
                        sp5 = "eso está " + vib3contesp[rand];
                        eng5 = "it is " + vib3cont[rand];
                        eng52 = "it's " + vib3cont[rand];
                        sp6 = "ellos están " + vib3contesp[rand];
                        eng6 = "they are " + vib3cont[rand];
                        eng62 = "they're " + vib3cont[rand];
                        sp7 = "nosotros estamos " + vib3contesp[rand];
                        eng7 = "we are " + vib3cont[rand];
                        eng72 = "we're " + vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no estoy " + vib3contesp[rand];
                        eng1 = "I am not " + vib3cont[rand];
                        eng12 = "I'm not " + vib3cont[rand];
                        sp2 = "tú no estás " + vib3contesp[rand];
                        eng2 = "you are not " + vib3cont[rand];
                        eng22 = "you aren't " + vib3cont[rand];
                        sp3 = "él no está " + vib3contesp[rand];
                        eng3 = "he is not " + vib3cont[rand];
                        eng32 = "he isn't " + vib3cont[rand];
                        sp4 = "ella no está " + vib3contesp[rand];
                        eng4 = "she is not " + vib3cont[rand];
                        eng42 = "she isn't " + vib3cont[rand];
                        sp5 = "eso no está " + vib3contesp[rand];
                        eng5 = "it is not " + vib3cont[rand];
                        eng52 = "it isn't " + vib3cont[rand];
                        sp6 = "ellos no están " + vib3contesp[rand];
                        eng6 = "they are not  " + vib3cont[rand];
                        eng62 = "they aren't  " + vib3cont[rand];
                        sp7 = "nosotros no estamos " + vib3contesp[rand];
                        eng7 = "we are not  " + vib3cont[rand];
                        eng72 = "we aren't  " + vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPresPerf1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo he " + vibparticipiosp[rand];
                        eng1 = "I have " + viparticiple[rand];
                        eng12 = "I've " + viparticiple[rand];
                        sp2 = "tú has " + vibparticipiosp[rand];
                        eng2 = "you have " + viparticiple[rand];
                        eng22 = "you've " + viparticiple[rand];
                        sp3 = "él ha " + vibparticipiosp[rand];
                        eng3 = "he has " + viparticiple[rand];
                        eng32 = "he's " + viparticiple[rand];
                        sp4 = "ella ha " + vibparticipiosp[rand];
                        eng4 = "she has " + viparticiple[rand];
                        eng42 = "she's " + viparticiple[rand];
                        sp5 = "eso ha " + vibparticipiosp[rand];
                        eng5 = "it has " + viparticiple[rand];
                        eng52 = "it's " + viparticiple[rand];
                        sp6 = "ellos han " + vibparticipiosp[rand];
                        eng6 = "they have " + viparticiple[rand];
                        eng62 = "they've " + viparticiple[rand];
                        sp7 = "nosotros hemos " + vibparticipiosp[rand];
                        eng7 = "we have " + viparticiple[rand];
                        eng72 = "we've " + viparticiple[rand];
                        break;
                    case 1:
                        sp1 = "yo no he " + vibparticipiosp[rand];
                        eng1 = "I have not " + viparticiple[rand];
                        eng12 = "I haven't " + viparticiple[rand];
                        sp2 = "tú no has " + vibparticipiosp[rand];
                        eng2 = "you have not " + viparticiple[rand];
                        eng22 = "you haven't " + viparticiple[rand];
                        sp3 = "él no ha " + vibparticipiosp[rand];
                        eng3 = "he has not " + viparticiple[rand];
                        eng32 = "he hasn't " + viparticiple[rand];
                        sp4 = "ella no ha " + vibparticipiosp[rand];
                        eng4 = "she has not " + viparticiple[rand];
                        eng42 = "she hasn't " + viparticiple[rand];
                        sp5 = "eso no ha " + vibparticipiosp[rand];
                        eng5 = "it has not " + viparticiple[rand];
                        eng52 = "it hasn't " + viparticiple[rand];
                        sp6 = "ellos no han " + vibparticipiosp[rand];
                        eng6 = "they have not  " + viparticiple[rand];
                        eng62 = "they haven't  " + viparticiple[rand];
                        sp7 = "nosotros no hemos " + vibparticipiosp[rand];
                        eng7 = "we have not  " + viparticiple[rand];
                        eng72 = "we haven't  " + viparticiple[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenPresPerfCont1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo he estado " + vib3contesp[rand];
                        eng1 = "I have been " + vib3cont[rand];
                        sp2 = "tú has estado " + vib3contesp[rand];
                        eng2 = "you have been " + vib3cont[rand];
                        sp3 = "él ha estado " + vib3contesp[rand];
                        eng3 = "he has been " + vib3cont[rand];
                        sp4 = "ella ha estado " + vib3contesp[rand];
                        eng4 = "she has been " + vib3cont[rand];
                        sp5 = "eso ha estado " + vib3contesp[rand];
                        eng5 = "it has been " + vib3cont[rand];
                        sp6 = "ellos han estado " + vib3contesp[rand];
                        eng6 = "they have been " + vib3cont[rand];
                        sp7 = "nosotros hemos estado " + vib3contesp[rand];
                        eng7 = "we have been " + vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no he estado " + vib3contesp[rand];
                        eng1 = "I haven't been " + vib3cont[rand];
                        sp2 = "tú no has estado " + vib3contesp[rand];
                        eng2 = "you haven't been " + vib3cont[rand];
                        sp3 = "él no ha estado " + vib3contesp[rand];
                        eng3 = "he hasn't been " + vib3cont[rand];
                        sp4 = "ella no ha estado " + vib3contesp[rand];
                        eng4 = "she hasn't been " + vib3cont[rand];
                        sp5 = "eso no ha estado " + vib3contesp[rand];
                        eng5 = "it hasn't been " + vib3cont[rand];
                        sp6 = "ellos no han estado " + vib3contesp[rand];
                        eng6 = "they haven't been " + vib3cont[rand];
                        sp7 = "nosotros no hemos estado " + vib3contesp[rand];
                        eng7 = "we haven't been " + vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Pasados
    public void GenPastSimp1() {
        Pasts pas = new Pasts();
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 4);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    // 0 - positivo preterito, 1- negativo preterito
                    // 2- positivo imperfecto 3. negativo imperfecto
                    case 0:
                        sp1 = "yo " + pas.vibp1pr[rand];
                        eng1 = "I " + pas.vibpast[rand];
                        sp2 = "tú " + pas.vibp2pr[rand];
                        eng2 = "you " + pas.vibpast[rand];
                        sp3 = "él " + pas.vibp3pr[rand];
                        eng3 = "he " + pas.vibpast[rand];
                        sp4 = "ella " + pas.vibp3pr[rand];
                        eng4 = "she " + pas.vibpast[rand];
                        sp5 = "eso " + pas.vibp3pr[rand];
                        eng5 = "it " + pas.vibpast[rand];
                        sp6 = "ellos " + pas.vibp4pr[rand];
                        eng6 = "they " + pas.vibpast[rand];
                        sp7 = "nosotros " + pas.vibp5pr[rand];
                        eng7 = "we " + pas.vibpast[rand];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + pas.vibp1pr[rand];
                        eng1 = "I " + "didn't " + pas.vib[rand];
                        sp2 = "tú " + "no " + pas.vibp2pr[rand];
                        eng2 = "you " + "didn't " + pas.vib[rand];
                        sp3 = "él " + "no " + pas.vibp3pr[rand];
                        eng3 = "he " + "didn't " + pas.vib[rand];
                        sp4 = "ella " + "no " + pas.vibp3pr[rand];
                        eng4 = "she " + "didn't " + pas.vib[rand];
                        sp5 = "eso " + "no " + pas.vibp3pr[rand];
                        eng5 = "it " + "didn't " + pas.vib[rand];
                        sp6 = "ellos " + "no " + pas.vibp4pr[rand];
                        eng6 = "they " + "didn't " + pas.vib[rand];
                        sp7 = "nosotros " + "no " + pas.vibp5pr[rand];
                        eng7 = "we " + "didn't " + pas.vib[rand];
                        break;
                    case 2:
                        sp1 = "yo " + pas.vibp1[rand];
                        eng1 = "I " + pas.vibpast[rand];
                        sp2 = "tú " + pas.vibp2[rand];
                        eng2 = "you " + pas.vibpast[rand];
                        sp3 = "él " + pas.vibp3[rand];
                        eng3 = "he " + pas.vibpast[rand];
                        sp4 = "ella " + pas.vibp3[rand];
                        eng4 = "she " + pas.vibpast[rand];
                        sp5 = "eso " + pas.vibp3[rand];
                        eng5 = "it " + pas.vibpast[rand];
                        sp6 = "ellos " + pas.vibp4[rand];
                        eng6 = "they " + pas.vibpast[rand];
                        sp7 = "nosotros " + pas.vibp5[rand];
                        eng7 = "we " + pas.vibpast[rand];
                        break;
                    case 3:
                        sp1 = "yo " + "no " + pas.vibp1[rand];
                        eng1 = "I " + "didn't " + pas.vib[rand];
                        sp2 = "tú " + "no " + pas.vibp2[rand];
                        eng2 = "you " + "didn't " + pas.vib[rand];
                        sp3 = "él " + "no " + pas.vibp3[rand];
                        eng3 = "he " + "didn't " + pas.vib[rand];
                        sp4 = "ella " + "no " + pas.vibp3[rand];
                        eng4 = "she " + "didn't " + pas.vib[rand];
                        sp5 = "eso " + "no " + pas.vibp3[rand];
                        eng5 = "it " + "didn't " + pas.vib[rand];
                        sp6 = "ellos " + "no " + pas.vibp4[rand];
                        eng6 = "they " + "didn't " + pas.vib[rand];
                        sp7 = "nosotros " + "no " + pas.vibp5[rand];
                        eng7 = "we " + "didn't " + pas.vib[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPastCont1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estaba " + vib3contesp[rand];
                        eng1 = "I was " + vib3cont[rand];
                        eng12 = "I was " + vib3cont[rand];
                        sp2 = "tú estabas " + vib3contesp[rand];
                        eng2 = "you were " + vib3cont[rand];
                        eng22 = "you were " + vib3cont[rand];
                        sp3 = "él estaba " + vib3contesp[rand];
                        eng3 = "he was " + vib3cont[rand];
                        eng32 = "he was " + vib3cont[rand];
                        sp4 = "ella estaba " + vib3contesp[rand];
                        eng4 = "she was " + vib3cont[rand];
                        eng42 = "she was " + vib3cont[rand];
                        sp5 = "eso estaba " + vib3contesp[rand];
                        eng5 = "it was " + vib3cont[rand];
                        eng52 = "it was " + vib3cont[rand];
                        sp6 = "ellos estaban " + vib3contesp[rand];
                        eng6 = "they were " + vib3cont[rand];
                        eng62 = "they were " + vib3cont[rand];
                        sp7 = "nosotros estabamos " + vib3contesp[rand];
                        eng7 = "we were " + vib3cont[rand];
                        eng72 = "we were " + vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no estaba " + vib3contesp[rand];
                        eng1 = "I was not " + vib3cont[rand];
                        eng12 = "I wasn't " + vib3cont[rand];
                        sp2 = "tú no estabas " + vib3contesp[rand];
                        eng2 = "you were not " + vib3cont[rand];
                        eng22 = "you weren't " + vib3cont[rand];
                        sp3 = "él no estaba " + vib3contesp[rand];
                        eng3 = "he was not " + vib3cont[rand];
                        eng32 = "he wasn't " + vib3cont[rand];
                        sp4 = "ella no estaba " + vib3contesp[rand];
                        eng4 = "she was not " + vib3cont[rand];
                        eng42 = "she wasn't " + vib3cont[rand];
                        sp5 = "eso no estaba " + vib3contesp[rand];
                        eng5 = "it was not " + vib3cont[rand];
                        eng52 = "it wasn't " + vib3cont[rand];
                        sp6 = "ellos no estaban " + vib3contesp[rand];
                        eng6 = "they were not  " + vib3cont[rand];
                        eng62 = "they weren't  " + vib3cont[rand];
                        sp7 = "nosotros no estabamos " + vib3contesp[rand];
                        eng7 = "we were not  " + vib3cont[rand];
                        eng72 = "we weren't  " + vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPastPerf1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo habia " + vibparticipiosp[rand];
                        eng1 = "I had " + viparticiple[rand];
                        eng12 = "I had " + viparticiple[rand];
                        sp2 = "tú habias " + vibparticipiosp[rand];
                        eng2 = "you had " + viparticiple[rand];
                        eng22 = "you had " + viparticiple[rand];
                        sp3 = "él habia " + vibparticipiosp[rand];
                        eng3 = "he had " + viparticiple[rand];
                        eng32 = "he had " + viparticiple[rand];
                        sp4 = "ella habia " + vibparticipiosp[rand];
                        eng4 = "she had " + viparticiple[rand];
                        eng42 = "she had " + viparticiple[rand];
                        sp5 = "eso habia " + vibparticipiosp[rand];
                        eng5 = "it had " + viparticiple[rand];
                        eng52 = "it had " + viparticiple[rand];
                        sp6 = "ellos habian " + vibparticipiosp[rand];
                        eng6 = "they had " + viparticiple[rand];
                        eng62 = "they had " + viparticiple[rand];
                        sp7 = "nosotros habiamos " + vibparticipiosp[rand];
                        eng7 = "we had " + viparticiple[rand];
                        eng72 = "we had " + viparticiple[rand];
                        break;
                    case 1:
                        sp1 = "yo no habia " + vibparticipiosp[rand];
                        eng1 = "I had not " + viparticiple[rand];
                        eng12 = "I hadn't " + viparticiple[rand];
                        sp2 = "tú no habias " + vibparticipiosp[rand];
                        eng2 = "you had not " + viparticiple[rand];
                        eng22 = "you hadn't " + viparticiple[rand];
                        sp3 = "él no habia " + vibparticipiosp[rand];
                        eng3 = "he had not " + viparticiple[rand];
                        eng32 = "he hadn't " + viparticiple[rand];
                        sp4 = "ella no habia " + vibparticipiosp[rand];
                        eng4 = "she had not " + viparticiple[rand];
                        eng42 = "she hadn't " + viparticiple[rand];
                        sp5 = "eso no habia " + vibparticipiosp[rand];
                        eng5 = "it had not " + viparticiple[rand];
                        eng52 = "it hadn't " + viparticiple[rand];
                        sp6 = "ellos no habian " + vibparticipiosp[rand];
                        eng6 = "they had not  " + viparticiple[rand];
                        eng62 = "they hadn't  " + viparticiple[rand];
                        sp7 = "nosotros no habiamos " + vibparticipiosp[rand];
                        eng7 = "we had not  " + viparticiple[rand];
                        eng72 = "we hadn't  " + viparticiple[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPastPerfCont1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo había estado " + vib3contesp[rand];
                        eng1 = "I had been " + vib3cont[rand];
                        sp2 = "tú habías estado " + vib3contesp[rand];
                        eng2 = "you had been " + vib3cont[rand];
                        sp3 = "él había estado " + vib3contesp[rand];
                        eng3 = "he had been " + vib3cont[rand];
                        sp4 = "ella había estado " + vib3contesp[rand];
                        eng4 = "she had been " + vib3cont[rand];
                        sp5 = "eso había estado " + vib3contesp[rand];
                        eng5 = "it had been " + vib3cont[rand];
                        sp6 = "ellos habían " + vib3contesp[rand];
                        eng6 = "they had been " + vib3cont[rand];
                        sp7 = "nosotros habíamos estado " + vib3contesp[rand];
                        eng7 = "we had been " + vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no había estado " + vib3contesp[rand];
                        eng1 = "I hadn't been " + vib3cont[rand];
                        sp2 = "tú no habías estado  " + vib3contesp[rand];
                        eng2 = "you hadn't been " + vib3cont[rand];
                        sp3 = "él no había estado " + vib3contesp[rand];
                        eng3 = "he hadn't been " + vib3cont[rand];
                        sp4 = "ella no había estado " + vib3contesp[rand];
                        eng4 = "she hadn't been " + vib3cont[rand];
                        sp5 = "eso no había estado " + vib3contesp[rand];
                        eng5 = "it hadn't been " + vib3cont[rand];
                        sp6 = "ellos no habían " + vib3contesp[rand];
                        eng6 = "they hadn't been " + vib3cont[rand];
                        sp7 = "nosotros no habíamos estado " + vib3contesp[rand];
                        eng7 = "we hadn't been " + vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Futuros
    public void GenFutSimp1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1f[rand];
                        eng1 = "I will " + vib[rand];
                        sp2 = "tú " + vib2f[rand];
                        eng2 = "you will " + vib[rand];
                        sp3 = "él " + vib3f[rand];
                        eng3 = "he will " + vib[rand];
                        sp4 = "ella " + vib3f[rand];
                        eng4 = "she will " + vib[rand];
                        sp5 = "eso " + vib3f[rand];
                        eng5 = "it will " + vib[rand];
                        sp6 = "ellos " + vib4f[rand];
                        eng6 = "they will " + vib[rand];
                        sp7 = "nosotros " + vibfnos[rand];
                        eng7 = "we will " + vib[rand];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1f[rand];
                        eng1 = "I " + "won't " + vib[rand];
                        sp2 = "tú " + "no " + vib2f[rand];
                        eng2 = "you " + "won't " + vib[rand];
                        sp3 = "él " + "no " + vib3f[rand];
                        eng3 = "he " + "won't " + vib[rand];
                        sp4 = "ella " + "no " + vib3f[rand];
                        eng4 = "she " + "won't " + vib[rand];
                        sp5 = "eso " + "no " + vib3f[rand];
                        eng5 = "it " + "won't " + vib[rand];
                        sp6 = "ellos " + "no " + vib4f[rand];
                        eng6 = "they " + "won't " + vib[rand];
                        sp7 = "nosotros " + "no " + vibfnos[rand];
                        eng7 = "we " + "won't " + vib[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenFutCont1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estaré " + vib3contesp[rand];
                        eng1 = "I will be " + vib3cont[rand];
                        eng12 = "I'll be " + vib3cont[rand];
                        sp2 = "tú estaras " + vib3contesp[rand];
                        eng2 = "you will be " + vib3cont[rand];
                        eng22 = "you'll be " + vib3cont[rand];
                        sp3 = "él estaré " + vib3contesp[rand];
                        eng3 = "he will be " + vib3cont[rand];
                        eng32 = "he'll be " + vib3cont[rand];
                        sp4 = "ella estaré " + vib3contesp[rand];
                        eng4 = "she will be " + vib3cont[rand];
                        eng32 = "he'll be " + vib3cont[rand];
                        sp5 = "eso estaré " + vib3contesp[rand];
                        eng5 = "it will be " + vib3cont[rand];
                        eng52 = "it'll be " + vib3cont[rand];
                        sp6 = "ellos estaran " + vib3contesp[rand];
                        eng6 = "they will be " + vib3cont[rand];
                        eng62 = "they'll be " + vib3cont[rand];
                        sp7 = "nosotros estaremos " + vib3contesp[rand];
                        eng7 = "we will be " + vib3cont[rand];
                        eng72 = "we'll be " + vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no estaré " + vib3contesp[rand];
                        eng1 = "I will not be " + vib3cont[rand];
                        eng12 = "I won't be " + vib3cont[rand];
                        sp2 = "tú no estaras " + vib3contesp[rand];
                        eng2 = "you will not be " + vib3cont[rand];
                        eng22 = "you won't be " + vib3cont[rand];
                        sp3 = "él no estaré " + vib3contesp[rand];
                        eng3 = "he will not be " + vib3cont[rand];
                        eng32 = "he won't be " + vib3cont[rand];
                        sp4 = "ella no estaré " + vib3contesp[rand];
                        eng4 = "she will not be " + vib3cont[rand];
                        eng42 = "she won't be " + vib3cont[rand];
                        sp5 = "eso no estaré " + vib3contesp[rand];
                        eng5 = "it will not be " + vib3cont[rand];
                        eng52 = "it won't be " + vib3cont[rand];
                        sp6 = "ellos no estaran " + vib3contesp[rand];
                        eng6 = "they will not be " + vib3cont[rand];
                        eng62 = "they won't be " + vib3cont[rand];
                        sp7 = "nosotros no estaremos " + vib3contesp[rand];
                        eng7 = "we will not be " + vib3cont[rand];
                        eng72 = "we won't be " + vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenFutPerf1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo habre " + vibparticipiosp[rand];
                        eng1 = "I will have " + viparticiple[rand];
                        eng12 = "I'll have " + viparticiple[rand];
                        sp2 = "tú habrás " + vibparticipiosp[rand];
                        eng2 = "you will have " + viparticiple[rand];
                        eng22 = "you'll have " + viparticiple[rand];
                        sp3 = "él habrá " + vibparticipiosp[rand];
                        eng3 = "he will have " + viparticiple[rand];
                        eng32 = "he'll have  " + viparticiple[rand];
                        sp4 = "ella habrá " + vibparticipiosp[rand];
                        eng4 = "she will have " + viparticiple[rand];
                        eng42 = "she'll have  " + viparticiple[rand];
                        sp5 = "eso habrá " + vibparticipiosp[rand];
                        eng5 = "it will have " + viparticiple[rand];
                        eng52 = "it'll have  " + viparticiple[rand];
                        sp6 = "ellos habrán " + vibparticipiosp[rand];
                        eng6 = "they will have " + viparticiple[rand];
                        eng62 = "they'll have " + viparticiple[rand];
                        sp7 = "nosotros habremos "  + vibparticipiosp[rand];
                        eng7 = "we will have " + viparticiple[rand];
                        eng72 = "we'll have " + viparticiple[rand];
                        break;
                    case 1:
                        sp1 = "yo no habre " + vibparticipiosp[rand];
                        eng1 = "I will not have " + viparticiple[rand];
                        eng12 = "I won't have " + viparticiple[rand];
                        sp2 = "tú no habrás " + vibparticipiosp[rand];
                        eng2 = "you will not have " + viparticiple[rand];
                        eng22 = "you won't have " + viparticiple[rand];
                        sp3 = "él no habrá " + vibparticipiosp[rand];
                        eng3 = "he will not have " + viparticiple[rand];
                        eng32 = "he won't have " + viparticiple[rand];
                        sp4 = "ella no habrá " + vibparticipiosp[rand];
                        eng4 = "she will not have " + viparticiple[rand];
                        eng42 = "she won't have " + viparticiple[rand];
                        sp5 = "eso no habrá " + vibparticipiosp[rand];
                        eng5 = "it will not have " + viparticiple[rand];
                        eng52 = "it won't have " + viparticiple[rand];
                        sp6 = "ellos no habrán " + vibparticipiosp[rand];
                        eng6 = "they will not have  " + viparticiple[rand];
                        eng62 = "they won't have  " + viparticiple[rand];
                        sp7 = "nosotros no habremos "  + vibparticipiosp[rand];
                        eng7 = "we will not have  " + viparticiple[rand];
                        eng72 = "we won't have  " + viparticiple[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenFutPerfCont1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo habré estado " + vib3contesp[rand];
                        eng1 = "I will have been " + vib3cont[rand];
                        sp2 = "tú habrás estado " + vib3contesp[rand];
                        eng2 = "you will have been " + vib3cont[rand];
                        sp3 = "él habrá estado " + vib3contesp[rand];
                        eng3 = "he will have been " + vib3cont[rand];
                        sp4 = "ella habrá estado " + vib3contesp[rand];
                        eng4 = "she will have been " + vib3cont[rand];
                        sp5 = "eso habrá estado " + vib3contesp[rand];
                        eng5 = "it will have been " + vib3cont[rand];
                        sp6 = "ellos habrán estado " + vib3contesp[rand];
                        eng6 = "they will have been " + vib3cont[rand];
                        sp7 = "nosotros habremos estado " + vib3contesp[rand];
                        eng7 = "we will have been " + vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no habré estado " + vib3contesp[rand];
                        eng1 = "I won't have been " + vib3cont[rand];
                        sp2 = "tú no habrás estado  " + vib3contesp[rand];
                        eng2 = "you won't have been " + vib3cont[rand];
                        sp3 = "él no habrá estado   " + vib3contesp[rand];
                        eng3 = "he won't have been " + vib3cont[rand];
                        sp4 = "ella no habrá estado   " + vib3contesp[rand];
                        eng4 = "she won't have been " + vib3cont[rand];
                        sp5 = "eso no habrá estado   " + vib3contesp[rand];
                        eng5 = "it won't have been " + vib3cont[rand];
                        sp6 = "ellos no habran estado " + vib3contesp[rand];
                        eng6 = "they won't have been " + vib3cont[rand];
                        sp7 = "nosotros no habremos estado " + vib3contesp[rand];
                        eng7 = "we won't have been " + vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Would
    public void GenWouldSimp1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1w[rand];
                        eng1 = "I would " + vib[rand];
                        sp2 = "tú " + vib2w[rand];
                        eng2 = "you would " + vib[rand];
                        sp3 = "él " + vib3w[rand];
                        eng3 = "he would " + vib[rand];
                        sp4 = "ella " + vib3w[rand];
                        eng4 = "she would " + vib[rand];
                        sp5 = "eso " + vib3w[rand];
                        eng5 = "it would " + vib[rand];
                        sp6 = "ellos " + vib4w[rand];
                        eng6 = "they would " + vib[rand];
                        sp7 = "nosotros " + vib5w[rand];
                        eng7 = "we would " + vib[rand];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1w[rand];
                        eng1 = "I " + "wouldn't " + vib[rand];
                        sp2 = "tú " + "no " + vib2w[rand];
                        eng2 = "you " + "wouldn't " + vib[rand];
                        sp3 = "él " + "no " + vib3w[rand];
                        eng3 = "he " + "wouldn't " + vib[rand];
                        sp4 = "ella " + "no " + vib3w[rand];
                        eng4 = "she " + "wouldn't " + vib[rand];
                        sp5 = "eso " + "no " + vib3w[rand];
                        eng5 = "it " + "wouldn't " + vib[rand];
                        sp6 = "ellos " + "no " + vib4w[rand];
                        eng6 = "they " + "wouldn't " + vib[rand];
                        sp7 = "nosotros " + "no " + vib5w[rand];
                        eng7 = "we " + "wouldn't " + vib[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenWouldCont1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estaría " + vib3contesp[rand];
                        eng1 = "I would be " + vib3cont[rand];
                        eng12 = "I'd be " + vib3cont[rand];
                        sp2 = "tú estarías " + vib3contesp[rand];
                        eng2 = "you would be " + vib3cont[rand];
                        eng22 = "you'd be " + vib3cont[rand];
                        sp3 = "él estaría " + vib3contesp[rand];
                        eng3 = "he would be " + vib3cont[rand];
                        eng32 = "he'd be " + vib3cont[rand];
                        sp4 = "ella estaría " + vib3contesp[rand];
                        eng4 = "she would be " + vib3cont[rand];
                        eng42 = "she'd be " + vib3cont[rand];
                        sp5 = "eso estaría " + vib3contesp[rand];
                        eng5 = "it would be " + vib3cont[rand];
                        eng52 = "it'd be " + vib3cont[rand];
                        sp6 = "ellos estarían " + vib3contesp[rand];
                        eng6 = "they would be " + vib3cont[rand];
                        eng62 = "they'd be " + vib3cont[rand];
                        sp7 = "nosotros estaríamos " + vib3contesp[rand];
                        eng7 = "we would be " + vib3cont[rand];
                        eng72 = "we'd be " + vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no estaría " + vib3contesp[rand];
                        eng1 = "I would not be " + vib3cont[rand];
                        eng12 = "I wouldn't be " + vib3cont[rand];
                        sp2 = "tú no estarías " + vib3contesp[rand];
                        eng2 = "you would not be " + vib3cont[rand];
                        eng22 = "you wouldn't be " + vib3cont[rand];
                        sp3 = "él no estaría " + vib3contesp[rand];
                        eng3 = "he would not be " + vib3cont[rand];
                        eng32 = "he wouldn't be " + vib3cont[rand];
                        sp4 = "ella no estaría " + vib3contesp[rand];
                        eng4 = "she would not be " + vib3cont[rand];
                        eng42 = "she wouldn't be " + vib3cont[rand];
                        sp5 = "eso no estaría " + vib3contesp[rand];
                        eng5 = "it would not be " + vib3cont[rand];
                        eng52 = "it wouldn't be " + vib3cont[rand];
                        sp6 = "ellos no estarían " + vib3contesp[rand];
                        eng6 = "they would not be  " + vib3cont[rand];
                        eng62 = "they wouldn't be  " + vib3cont[rand];
                        sp7 = "nosotros no estaríamos " + vib3contesp[rand];
                        eng7 = "we would not be  " + vib3cont[rand];
                        eng72 = "we wouldn't be  " + vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenWouldPerf1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo hubiera " + vibparticipiosp[rand];
                        eng1 = "I would have " + viparticiple[rand];
                        eng12 = "I'd have " + viparticiple[rand];
                        sp2 = "tú hubieras " + vibparticipiosp[rand];
                        eng2 = "you would have " + viparticiple[rand];
                        eng22 = "you'd have " + viparticiple[rand];
                        sp3 = "él hubiera " + vibparticipiosp[rand];
                        eng3 = "he would have " + viparticiple[rand];
                        eng32 = "he'd have  " + viparticiple[rand];
                        sp4 = "ella hubiera " + vibparticipiosp[rand];
                        eng4 = "she would have " + viparticiple[rand];
                        eng42 = "she'd have  " + viparticiple[rand];
                        sp5 = "eso hubiera " + vibparticipiosp[rand];
                        eng5 = "it would have " + viparticiple[rand];
                        eng52 = "it'd have  " + viparticiple[rand];
                        sp6 = "ellos hubieran " + vibparticipiosp[rand];
                        eng6 = "they would have " + viparticiple[rand];
                        eng62 = "they'd have " + viparticiple[rand];
                        sp7 = "nosotros habríamos "  + vibparticipiosp[rand];
                        eng7 = "we would have " + viparticiple[rand];
                        eng72 = "we'd have " + viparticiple[rand];
                        break;
                    case 1:
                        sp1 = "yo no hubiera " + vibparticipiosp[rand];
                        eng1 = "I would not have " + viparticiple[rand];
                        eng12 = "I wouldn't have " + viparticiple[rand];
                        sp2 = "tú no hubieras " + vibparticipiosp[rand];
                        eng2 = "you would not have " + viparticiple[rand];
                        eng22 = "you wouldn't have " + viparticiple[rand];
                        sp3 = "él no hubiera " + vibparticipiosp[rand];
                        eng3 = "he would not have " + viparticiple[rand];
                        eng32 = "he wouldn't have " + viparticiple[rand];
                        sp4 = "ella no hubiera " + vibparticipiosp[rand];
                        eng4 = "she would not have " + viparticiple[rand];
                        eng42 = "she wouldn't have " + viparticiple[rand];
                        sp5 = "eso no hubiera " + vibparticipiosp[rand];
                        eng5 = "it would not have " + viparticiple[rand];
                        eng52 = "it wouldn't have " + viparticiple[rand];
                        sp6 = "ellos no hubieran " + vibparticipiosp[rand];
                        eng6 = "they would not have  " + viparticiple[rand];
                        eng62 = "they wouldn't have  " + viparticiple[rand];
                        sp7 = "nosotros no habríamos "  + vibparticipiosp[rand];
                        eng7 = "we would not have  " + viparticiple[rand];
                        eng72 = "we wouldn't have  " + viparticiple[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenWouldPerfCont1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo hubiera estado " + vib3contesp[rand];
                        eng1 = "I would have been " + vib3cont[rand];
                        sp2 = "tú hubieras estado " + vib3contesp[rand];
                        eng2 = "you would have been " + vib3cont[rand];
                        sp3 = "él hubiera estado " + vib3contesp[rand];
                        eng3 = "he would have been " + vib3cont[rand];
                        sp4 = "ella hubiera estado " + vib3contesp[rand];
                        eng4 = "she would have been " + vib3cont[rand];
                        sp5 = "eso hubiera estado " + vib3contesp[rand];
                        eng5 = "it would have been " + vib3cont[rand];
                        sp6 = "ellos hubieran estado " + vib3contesp[rand];
                        eng6 = "they would have been " + vib3cont[rand];
                        sp7 = "nosotros hubiésemos estado " + vib3contesp[rand];
                        eng7 = "we would have been " + vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no hubiera estado " + vib3contesp[rand];
                        eng1 = "I wouldn't have been " + vib3cont[rand];
                        sp2 = "tú no hubieras estado  " + vib3contesp[rand];
                        eng2 = "you wouldn't have been " + vib3cont[rand];
                        sp3 = "él no hubiera estado   " + vib3contesp[rand];
                        eng3 = "he wouldn't have been " + vib3cont[rand];
                        sp4 = "ella no hubiera estado   " + vib3contesp[rand];
                        eng4 = "she wouldn't have been " + vib3cont[rand];
                        sp5 = "eso no hubiera estado   " + vib3contesp[rand];
                        eng5 = "it wouldn't have been " + vib3cont[rand];
                        sp6 = "ellos no habran estado " + vib3contesp[rand];
                        eng6 = "they wouldn't have been " + vib3cont[rand];
                        sp7 = "nosotros no hubiésemos estado " + vib3contesp[rand];
                        eng7 = "we wouldn't have been " + vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //COULD
    public void GenCouldSimp1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo podría " + vibesp[rand];
                        eng1 = "I could " + vib[rand];
                        sp2 = "tú podrías " + vibesp[rand];
                        eng2 = "you could " + vib[rand];
                        sp3 = "él podría " + vibesp[rand];
                        eng3 = "he could " + vib[rand];
                        sp4 = "ella podría " + vibesp[rand];
                        eng4 = "she could " + vib[rand];
                        sp5 = "eso podría " + vibesp[rand];
                        eng5 = "it could " + vib[rand];
                        sp6 = "ellos podrían " + vibesp[rand];
                        eng6 = "they could " + vib[rand];
                        sp7 = "nosotros podríamos " + vibesp[rand];
                        eng7 = "we could " + vib[rand];
                        break;
                    case 1:
                        sp1 = "yo " + "no podría " + vibesp[rand];
                        eng1 = "I " + "couldn't " + vib[rand];
                        sp2 = "tú " + "no podrías " + vibesp[rand];
                        eng2 = "you " + "couldn't " + vib[rand];
                        sp3 = "él " + "no podría " + vibesp[rand];
                        eng3 = "he " + "couldn't " + vib[rand];
                        sp4 = "ella " + "no podría " + vibesp[rand];
                        eng4 = "she " + "couldn't " + vib[rand];
                        sp5 = "eso " + "no podría " + vibesp[rand];
                        eng5 = "it " + "couldn't " + vib[rand];
                        sp6 = "ellos " + "no podrían " + vibesp[rand];
                        eng6 = "they " + "couldn't " + vib[rand];
                        sp7 = "nosotros " + "no podríamos " + vibesp[rand];
                        eng7 = "we " + "couldn't " + vib[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenCouldCont1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo podría estar " + vib3contesp[rand];
                        eng1 = "I could be " + vib3cont[rand];
                        eng12 = "I could be " + vib3cont[rand];
                        sp2 = "tú podrías estar " + vib3contesp[rand];
                        eng2 = "you could be " + vib3cont[rand];
                        eng22 = "you could be " + vib3cont[rand];
                        sp3 = "él podría estar " + vib3contesp[rand];
                        eng3 = "he could be " + vib3cont[rand];
                        eng32 = "he could be " + vib3cont[rand];
                        sp4 = "ella podría estar " + vib3contesp[rand];
                        eng4 = "she could be " + vib3cont[rand];
                        eng42 = "she could be " + vib3cont[rand];
                        sp5 = "eso podría estar " + vib3contesp[rand];
                        eng5 = "it could be " + vib3cont[rand];
                        eng52 = "it could be " + vib3cont[rand];
                        sp6 = "ellos podrían estar " + vib3contesp[rand];
                        eng6 = "they could be " + vib3cont[rand];
                        eng62 = "they could be " + vib3cont[rand];
                        sp7 = "nosotros podríamos estar " + vib3contesp[rand];
                        eng7 = "we could be " + vib3cont[rand];
                        eng72 = "we could be " + vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no podría estar " + vib3contesp[rand];
                        eng1 = "I could not be " + vib3cont[rand];
                        eng12 = "I couldn't be " + vib3cont[rand];
                        sp2 = "tú no podrías estar " + vib3contesp[rand];
                        eng2 = "you could not be " + vib3cont[rand];
                        eng22 = "you couldn't be " + vib3cont[rand];
                        sp3 = "él no podría estar " + vib3contesp[rand];
                        eng3 = "he could not be " + vib3cont[rand];
                        eng32 = "he couldn't be " + vib3cont[rand];
                        sp4 = "ella no podría estar " + vib3contesp[rand];
                        eng4 = "she could not be " + vib3cont[rand];
                        eng42 = "she couldn't be " + vib3cont[rand];
                        sp5 = "eso no podría estar " + vib3contesp[rand];
                        eng5 = "it could not be " + vib3cont[rand];
                        eng52 = "it couldn't be " + vib3cont[rand];
                        sp6 = "ellos no podrían estar " + vib3contesp[rand];
                        eng6 = "they could not be  " + vib3cont[rand];
                        eng62 = "they couldn't be  " + vib3cont[rand];
                        sp7 = "nosotros no podríamos estar " + vib3contesp[rand];
                        eng7 = "we could not be  " + vib3cont[rand];
                        eng72 = "we couldn't be  " + vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenCouldPerf1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo pudiese haber " + vibparticipiosp[rand];
                        eng1 = "I could have " + viparticiple[rand];
                        eng12 = "I could have " + viparticiple[rand];
                        sp2 = "tú pudieses haber " + vibparticipiosp[rand];
                        eng2 = "you could have " + viparticiple[rand];
                        eng22 = "you could have " + viparticiple[rand];
                        sp3 = "él pudiese haber " + vibparticipiosp[rand];
                        eng3 = "he could have " + viparticiple[rand];
                        eng32 = "he could have  " + viparticiple[rand];
                        sp4 = "ella pudiese haber " + vibparticipiosp[rand];
                        eng4 = "she could have " + viparticiple[rand];
                        eng42 = "she could have  " + viparticiple[rand];
                        sp5 = "eso pudiese haber " + vibparticipiosp[rand];
                        eng5 = "it could have " + viparticiple[rand];
                        eng52 = "it could have  " + viparticiple[rand];
                        sp6 = "ellos pudiesen haber " + vibparticipiosp[rand];
                        eng6 = "they could have " + viparticiple[rand];
                        eng62 = "they could have " + viparticiple[rand];
                        sp7 = "nosotros pudiesemos haber "  + vibparticipiosp[rand];
                        eng7 = "we could have " + viparticiple[rand];
                        eng72 = "we could have " + viparticiple[rand];
                        break;
                    case 1:
                        sp1 = "yo no pudiese haber " + vibparticipiosp[rand];
                        eng1 = "I could not have " + viparticiple[rand];
                        eng12 = "I couldn't have " + viparticiple[rand];
                        sp2 = "tú no pudieses haber " + vibparticipiosp[rand];
                        eng2 = "you could not have " + viparticiple[rand];
                        eng22 = "you couldn't have " + viparticiple[rand];
                        sp3 = "él no pudiese haber " + vibparticipiosp[rand];
                        eng3 = "he could not have " + viparticiple[rand];
                        eng32 = "he couldn't have " + viparticiple[rand];
                        sp4 = "ella no pudiese haber " + vibparticipiosp[rand];
                        eng4 = "she could not have " + viparticiple[rand];
                        eng42 = "she couldn't have " + viparticiple[rand];
                        sp5 = "eso no pudiese haber " + vibparticipiosp[rand];
                        eng5 = "it could not have " + viparticiple[rand];
                        eng52 = "it couldn't have " + viparticiple[rand];
                        sp6 = "ellos no pudiesen haber " + vibparticipiosp[rand];
                        eng6 = "they could not have  " + viparticiple[rand];
                        eng62 = "they couldn't have  " + viparticiple[rand];
                        sp7 = "nosotros no pudiesemos haber "  + vibparticipiosp[rand];
                        eng7 = "we could not have  " + viparticiple[rand];
                        eng72 = "we couldn't have  " + viparticiple[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenCouldPerfCont1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo podría haber estado " + vib3contesp[rand];
                        eng1 = "I could have been " + vib3cont[rand];
                        sp2 = "tú podrías haber estado " + vib3contesp[rand];
                        eng2 = "you could have been " + vib3cont[rand];
                        sp3 = "él podría haber estado " + vib3contesp[rand];
                        eng3 = "he could have been " + vib3cont[rand];
                        sp4 = "ella podría haber estado " + vib3contesp[rand];
                        eng4 = "she could have been " + vib3cont[rand];
                        sp5 = "eso podría haber estado " + vib3contesp[rand];
                        eng5 = "it could have been " + vib3cont[rand];
                        sp6 = "ellos podrían haber estado " + vib3contesp[rand];
                        eng6 = "they could have been " + vib3cont[rand];
                        sp7 = "nosotros podríamos haber estado " + vib3contesp[rand];
                        eng7 = "we could have been " + vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no podría haber estado " + vib3contesp[rand];
                        eng1 = "I couldn't have been " + vib3cont[rand];
                        sp2 = "tú no podrías haber estado  " + vib3contesp[rand];
                        eng2 = "you couldn't have been " + vib3cont[rand];
                        sp3 = "él no podría haber estado   " + vib3contesp[rand];
                        eng3 = "he couldn't have been " + vib3cont[rand];
                        sp4 = "ella no podría haber estado   " + vib3contesp[rand];
                        eng4 = "she couldn't have been " + vib3cont[rand];
                        sp5 = "eso no podría haber estado   " + vib3contesp[rand];
                        eng5 = "it couldn't have been " + vib3cont[rand];
                        sp6 = "ellos no habran estado " + vib3contesp[rand];
                        eng6 = "they couldn't have been " + vib3cont[rand];
                        sp7 = "nosotros no podríamos haber estado " + vib3contesp[rand];
                        eng7 = "we couldn't have been " + vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Might
    public void GenMightSimp1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá " + vib1s[rand];
                        eng1 = "I might " + vib[rand];
                        sp2 = "tú quizá " + vib2s[rand];
                        eng2 = "you might " + vib[rand];
                        sp3 = "él quizá " + vib3s[rand];
                        eng3 = "he might " + vib[rand];
                        sp4 = "ella quizá " + vib3s[rand];
                        eng4 = "she might " + vib[rand];
                        sp5 = "eso quizá " + vib3s[rand];
                        eng5 = "it might " + vib[rand];
                        sp6 = "ellos quizá " + vib4s[rand];
                        eng6 = "they might " + vib[rand];
                        sp7 = "nosotros quizá " + vib5s[rand];
                        eng7 = "we might " + vib[rand];
                        break;
                    case 1:
                        sp1 = "yo " + "quizá no " + vib1s[rand];
                        eng1 = "I " + "might not  " + vib[rand];
                        sp2 = "tú " + "quizá no " + vib2s[rand];
                        eng2 = "you " + "might not  " + vib[rand];
                        sp3 = "él " + "quizá no " + vib3s[rand];
                        eng3 = "he " + "might not  " + vib[rand];
                        sp4 = "ella " + "quizá no " + vib3s[rand];
                        eng4 = "she " + "might not  " + vib[rand];
                        sp5 = "eso " + "quizá no " + vib3s[rand];
                        eng5 = "it " + "might not  " + vib[rand];
                        sp6 = "ellos " + "quizá no " + vib4s[rand];
                        eng6 = "they " + "might not  " + vib[rand];
                        sp7 = "nosotros " + "quizá no " + vib5s[rand];
                        eng7 = "we " + "might not  " + vib[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenMightCont1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá esté " + vib3contesp[rand];
                        eng1 = "I might be " + vib3cont[rand];
                        eng12 = "I might be " + vib3cont[rand];
                        sp2 = "tú quizá estés " + vib3contesp[rand];
                        eng2 = "you might be " + vib3cont[rand];
                        eng22 = "you might be " + vib3cont[rand];
                        sp3 = "él quizá esté " + vib3contesp[rand];
                        eng3 = "he might be " + vib3cont[rand];
                        eng32 = "he might be " + vib3cont[rand];
                        sp4 = "ella quizá esté " + vib3contesp[rand];
                        eng4 = "she might be " + vib3cont[rand];
                        eng42 = "she might be " + vib3cont[rand];
                        sp5 = "eso quizá esté " + vib3contesp[rand];
                        eng5 = "it might be " + vib3cont[rand];
                        eng52 = "it might be " + vib3cont[rand];
                        sp6 = "ellos quizá estén " + vib3contesp[rand];
                        eng6 = "they might be " + vib3cont[rand];
                        eng62 = "they might be " + vib3cont[rand];
                        sp7 = "nosotros quizá estémos " + vib3contesp[rand];
                        eng7 = "we might be " + vib3cont[rand];
                        eng72 = "we might be " + vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no quizá esté " + vib3contesp[rand];
                        eng1 = "I might not be " + vib3cont[rand];
                        eng12 = "I mightn't be " + vib3cont[rand];
                        sp2 = "tú no quizá estés " + vib3contesp[rand];
                        eng2 = "you might not be " + vib3cont[rand];
                        eng22 = "you mightn't be " + vib3cont[rand];
                        sp3 = "él no quizá esté " + vib3contesp[rand];
                        eng3 = "he might not be " + vib3cont[rand];
                        eng32 = "he mightn't be " + vib3cont[rand];
                        sp4 = "ella no quizá esté " + vib3contesp[rand];
                        eng4 = "she might not be " + vib3cont[rand];
                        eng42 = "she mightn't be " + vib3cont[rand];
                        sp5 = "eso no quizá esté " + vib3contesp[rand];
                        eng5 = "it might not be " + vib3cont[rand];
                        eng52 = "it mightn't be " + vib3cont[rand];
                        sp6 = "ellos no quizá estén " + vib3contesp[rand];
                        eng6 = "they might not be  " + vib3cont[rand];
                        eng62 = "they mightn't be  " + vib3cont[rand];
                        sp7 = "nosotros no quizá estémos " + vib3contesp[rand];
                        eng7 = "we might not be  " + vib3cont[rand];
                        eng72 = "we mightn't be  " + vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenMightPerf1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá haya " + vibparticipiosp[rand];
                        eng1 = "I might have " + viparticiple[rand];
                        eng12 = "I might have " + viparticiple[rand];
                        sp2 = "tú quizá hayas " + vibparticipiosp[rand];
                        eng2 = "you might have " + viparticiple[rand];
                        eng22 = "you might have " + viparticiple[rand];
                        sp3 = "él quizá haya " + vibparticipiosp[rand];
                        eng3 = "he might have " + viparticiple[rand];
                        eng32 = "he might have  " + viparticiple[rand];
                        sp4 = "ella quizá haya " + vibparticipiosp[rand];
                        eng4 = "she might have " + viparticiple[rand];
                        eng42 = "she might have  " + viparticiple[rand];
                        sp5 = "eso quizá haya " + vibparticipiosp[rand];
                        eng5 = "it might have " + viparticiple[rand];
                        eng52 = "it might have  " + viparticiple[rand];
                        sp6 = "ellos quizá hayan " + vibparticipiosp[rand];
                        eng6 = "they might have " + viparticiple[rand];
                        eng62 = "they might have " + viparticiple[rand];
                        sp7 = "nosotros quizá hayamos "  + vibparticipiosp[rand];
                        eng7 = "we might have " + viparticiple[rand];
                        eng72 = "we might have " + viparticiple[rand];
                        break;
                    case 1:
                        sp1 = "yo no quizá haya " + vibparticipiosp[rand];
                        eng1 = "I might not have " + viparticiple[rand];
                        eng12 = "I mightn't have " + viparticiple[rand];
                        sp2 = "tú no quizá hayas " + vibparticipiosp[rand];
                        eng2 = "you might not have " + viparticiple[rand];
                        eng22 = "you mightn't have " + viparticiple[rand];
                        sp3 = "él no quizá haya " + vibparticipiosp[rand];
                        eng3 = "he might not have " + viparticiple[rand];
                        eng32 = "he mightn't have " + viparticiple[rand];
                        sp4 = "ella no quizá haya " + vibparticipiosp[rand];
                        eng4 = "she might not have " + viparticiple[rand];
                        eng42 = "she mightn't have " + viparticiple[rand];
                        sp5 = "eso no quizá haya " + vibparticipiosp[rand];
                        eng5 = "it might not have " + viparticiple[rand];
                        eng52 = "it mightn't have " + viparticiple[rand];
                        sp6 = "ellos no quizá hayan " + vibparticipiosp[rand];
                        eng6 = "they might not have  " + viparticiple[rand];
                        eng62 = "they mightn't have  " + viparticiple[rand];
                        sp7 = "nosotros no quizá hayamos "  + vibparticipiosp[rand];
                        eng7 = "we might not have  " + viparticiple[rand];
                        eng72 = "we mightn't have  " + viparticiple[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenMightPerfCont1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá haya estado " + vib3contesp[rand];
                        eng1 = "I might have been " + vib3cont[rand];
                        sp2 = "tú quizá hayas estado " + vib3contesp[rand];
                        eng2 = "you might have been " + vib3cont[rand];
                        sp3 = "él quizá haya estado " + vib3contesp[rand];
                        eng3 = "he might have been " + vib3cont[rand];
                        sp4 = "ella quizá haya estado " + vib3contesp[rand];
                        eng4 = "she might have been " + vib3cont[rand];
                        sp5 = "eso quizá haya estado " + vib3contesp[rand];
                        eng5 = "it might have been " + vib3cont[rand];
                        sp6 = "ellos quizá hayan estado " + vib3contesp[rand];
                        eng6 = "they might have been " + vib3cont[rand];
                        sp7 = "nosotros quizá hayamos estado " + vib3contesp[rand];
                        eng7 = "we might have been " + vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo quizá no haya estado " + vib3contesp[rand];
                        eng1 = "I might not have been " + vib3cont[rand];
                        sp2 = "tú quizá no hayas estado  " + vib3contesp[rand];
                        eng2 = "you might not have been " + vib3cont[rand];
                        sp3 = "él quizá no haya estado   " + vib3contesp[rand];
                        eng3 = "he might not have been " + vib3cont[rand];
                        sp4 = "ella quizá no haya estado   " + vib3contesp[rand];
                        eng4 = "she might not have been " + vib3cont[rand];
                        sp5 = "eso quizá no haya estado   " + vib3contesp[rand];
                        eng5 = "it might not have been " + vib3cont[rand];
                        sp6 = "ellos no habran estado " + vib3contesp[rand];
                        eng6 = "they might not have been " + vib3cont[rand];
                        sp7 = "nosotros quizá no hayamos estado " + vib3contesp[rand];
                        eng7 = "we might not have been " + vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //SHOULD
    public void GenShouldSimp1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería " + vibesp[rand];
                        eng1 = "I should " + vib[rand];
                        sp2 = "tú deberías " + vibesp[rand];
                        eng2 = "you should " + vib[rand];
                        sp3 = "él debería " + vibesp[rand];
                        eng3 = "he should " + vib[rand];
                        sp4 = "ella debería " + vibesp[rand];
                        eng4 = "she should " + vib[rand];
                        sp5 = "eso debería " + vibesp[rand];
                        eng5 = "it should " + vib[rand];
                        sp6 = "ellos deberían " + vibesp[rand];
                        eng6 = "they should " + vib[rand];
                        sp7 = "nosotros deberíamos " + vibesp[rand];
                        eng7 = "we should " + vib[rand];
                        break;
                    case 1:
                        sp1 = "yo " + "no debería " + vibesp[rand];
                        eng1 = "I " + "shouldn't " + vib[rand];
                        sp2 = "tú " + "no deberías " + vibesp[rand];
                        eng2 = "you " + "shouldn't " + vib[rand];
                        sp3 = "él " + "no debería " + vibesp[rand];
                        eng3 = "he " + "shouldn't " + vib[rand]+ arrayEng;
                        sp4 = "ella " + "no debería " + vibesp[rand];
                        eng4 = "she " + "shouldn't " + vib[rand];
                        sp5 = "eso " + "no debería " + vibesp[rand];
                        eng5 = "it " + "shouldn't " + vib[rand]+ arrayEng;
                        sp6 = "ellos " + "no deberían " + vibesp[rand];
                        eng6 = "they " + "shouldn't " + vib[rand];
                        sp7 = "nosotros " + "no deberíamos " + vibesp[rand];
                        eng7 = "we " + "shouldn't " + vib[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenShouldCont1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería estar " + vib3contesp[rand];
                        eng1 = "I should be " + vib3cont[rand];
                        eng12 = "I should be " + vib3cont[rand];
                        sp2 = "tú deberías estar " + vib3contesp[rand];
                        eng2 = "you should be " + vib3cont[rand];
                        eng22 = "you should be " + vib3cont[rand];
                        sp3 = "él debería estar " + vib3contesp[rand];
                        eng3 = "he should be " + vib3cont[rand];
                        eng32 = "he should be " + vib3cont[rand];
                        sp4 = "ella debería estar " + vib3contesp[rand];
                        eng4 = "she should be " + vib3cont[rand];
                        eng42 = "she should be " + vib3cont[rand];
                        sp5 = "eso debería estar " + vib3contesp[rand];
                        eng5 = "it should be " + vib3cont[rand];
                        eng52 = "it should be " + vib3cont[rand];
                        sp6 = "ellos deberían estar " + vib3contesp[rand];
                        eng6 = "they should be " + vib3cont[rand];
                        eng62 = "they should be " + vib3cont[rand];
                        sp7 = "nosotros deberíamos estar " + vib3contesp[rand];
                        eng7 = "we should be " + vib3cont[rand];
                        eng72 = "we should be " + vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no debería estar " + vib3contesp[rand];
                        eng1 = "I should not be " + vib3cont[rand];
                        eng12 = "I shouldn't be " + vib3cont[rand];
                        sp2 = "tú no deberías estar " + vib3contesp[rand];
                        eng2 = "you should not be " + vib3cont[rand];
                        eng22 = "you shouldn't be " + vib3cont[rand];
                        sp3 = "él no debería estar " + vib3contesp[rand];
                        eng3 = "he should not be " + vib3cont[rand];
                        eng32 = "he shouldn't be " + vib3cont[rand];
                        sp4 = "ella no debería estar " + vib3contesp[rand];
                        eng4 = "she should not be " + vib3cont[rand];
                        eng42 = "she shouldn't be " + vib3cont[rand];
                        sp5 = "eso no debería estar " + vib3contesp[rand];
                        eng5 = "it should not be " + vib3cont[rand];
                        eng52 = "it shouldn't be " + vib3cont[rand];
                        sp6 = "ellos no deberían estar " + vib3contesp[rand];
                        eng6 = "they should not be  " + vib3cont[rand];
                        eng62 = "they shouldn't be  " + vib3cont[rand];
                        sp7 = "nosotros no deberíamos estar " + vib3contesp[rand];
                        eng7 = "we should not be  " + vib3cont[rand];
                        eng72 = "we shouldn't be  " + vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenShouldPerf1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería haber " + vibparticipiosp[rand];
                        eng1 = "I should have " + viparticiple[rand];
                        eng12 = "I should have " + viparticiple[rand];
                        sp2 = "tú deberías haber " + vibparticipiosp[rand];
                        eng2 = "you should have " + viparticiple[rand];
                        eng22 = "you should have " + viparticiple[rand];
                        sp3 = "él debería haber " + vibparticipiosp[rand];
                        eng3 = "he should have " + viparticiple[rand];
                        eng32 = "he should have  " + viparticiple[rand];
                        sp4 = "ella debería haber " + vibparticipiosp[rand];
                        eng4 = "she should have " + viparticiple[rand];
                        eng42 = "she should have  " + viparticiple[rand];
                        sp5 = "eso debería haber " + vibparticipiosp[rand];
                        eng5 = "it should have " + viparticiple[rand];
                        eng52 = "it should have  " + viparticiple[rand];
                        sp6 = "ellos deberían haber " + vibparticipiosp[rand];
                        eng6 = "they should have " + viparticiple[rand];
                        eng62 = "they should have " + viparticiple[rand];
                        sp7 = "nosotros deberíamos haber "  + vibparticipiosp[rand];
                        eng7 = "we should have " + viparticiple[rand];
                        eng72 = "we should have " + viparticiple[rand];
                        break;
                    case 1:
                        sp1 = "yo no debería haber " + vibparticipiosp[rand];
                        eng1 = "I should not have " + viparticiple[rand];
                        eng12 = "I shouldn't have " + viparticiple[rand];
                        sp2 = "tú no deberías haber " + vibparticipiosp[rand];
                        eng2 = "you should not have " + viparticiple[rand];
                        eng22 = "you shouldn't have " + viparticiple[rand];
                        sp3 = "él no debería haber " + vibparticipiosp[rand];
                        eng3 = "he should not have " + viparticiple[rand];
                        eng32 = "he shouldn't have " + viparticiple[rand];
                        sp4 = "ella no debería haber " + vibparticipiosp[rand];
                        eng4 = "she should not have " + viparticiple[rand];
                        eng42 = "she shouldn't have " + viparticiple[rand];
                        sp5 = "eso no debería haber " + vibparticipiosp[rand];
                        eng5 = "it should not have " + viparticiple[rand];
                        eng52 = "it shouldn't have " + viparticiple[rand];
                        sp6 = "ellos no deberían haber " + vibparticipiosp[rand];
                        eng6 = "they should not have  " + viparticiple[rand];
                        eng62 = "they shouldn't have  " + viparticiple[rand];
                        sp7 = "nosotros no deberíamos haber "  + vibparticipiosp[rand];
                        eng7 = "we should not have  " + viparticiple[rand];
                        eng72 = "we shouldn't have  " + viparticiple[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenShouldPerfCont1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería haber estado " + vib3contesp[rand];
                        eng1 = "I should have been " + vib3cont[rand];
                        sp2 = "tú deberías haber estado " + vib3contesp[rand];
                        eng2 = "you should have been " + vib3cont[rand];
                        sp3 = "él debería haber estado " + vib3contesp[rand];
                        eng3 = "he should have been " + vib3cont[rand];
                        sp4 = "ella debería haber estado " + vib3contesp[rand];
                        eng4 = "she should have been " + vib3cont[rand];
                        sp5 = "eso debería haber estado " + vib3contesp[rand];
                        eng5 = "it should have been " + vib3cont[rand];
                        sp6 = "ellos deberían haber estado " + vib3contesp[rand];
                        eng6 = "they should have been " + vib3cont[rand];
                        sp7 = "nosotros deberíamos haber estado " + vib3contesp[rand];
                        eng7 = "we should have been " + vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no debería haber estado " + vib3contesp[rand];
                        eng1 = "I shouldn't have been " + vib3cont[rand];
                        sp2 = "tú no deberías haber estado " + vib3contesp[rand];
                        eng2 = "you shouldn't have been " + vib3cont[rand];
                        sp3 = "él no debería haber estado " + vib3contesp[rand];
                        eng3 = "he shouldn't have been " + vib3cont[rand];
                        sp4 = "ella no debería haber estado " + vib3contesp[rand];
                        eng4 = "she shouldn't have been " + vib3cont[rand];
                        sp5 = "eso no debería haber estado " + vib3contesp[rand];
                        eng5 = "it shouldn't have been " + vib3cont[rand];
                        sp6 = "ellos no deberían haber estado " + vib3contesp[rand];
                        eng6 = "they shouldn't have been " + vib3cont[rand];
                        sp7 = "nosotros no deberíamos haber estado " + vib3contesp[rand];
                        eng7 = "we shouldn't have been " + vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Can
    public void GenCanSimp1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo puedo " + vibesp[rand];
                        eng1 = "I can " + vib[rand];
                        sp2 = "tú puedes " + vibesp[rand];
                        eng2 = "you can " + vib[rand];
                        sp3 = "él puede " + vibesp[rand];
                        eng3 = "he can " + vib[rand];
                        sp4 = "ella puede " + vibesp[rand];
                        eng4 = "she can " + vib[rand];
                        sp5 = "eso puede " + vibesp[rand];
                        eng5 = "it can " + vib[rand];
                        sp6 = "ellos pueden " + vibesp[rand];
                        eng6 = "they can " + vib[rand];
                        sp7 = "nosotros podemos " + vibesp[rand];
                        eng7 = "we can " + vib[rand];
                        break;
                    case 1:
                        sp1 = "yo " + "no puedo " + vibesp[rand];
                        eng1 = "I " + "can't " + vib[rand];
                        sp2 = "tú " + "no puedes " + vibesp[rand];
                        eng2 = "you " + "can't " + vib[rand];
                        sp3 = "él " + "no puede " + vibesp[rand];
                        eng3 = "he " + "can't " + vib[rand];
                        sp4 = "ella " + "no puede " + vibesp[rand];
                        eng4 = "she " + "can't " + vib[rand];
                        sp5 = "eso " + "no puede " + vibesp[rand];
                        eng5 = "it " + "can't " + vib[rand];
                        sp6 = "ellos " + "no pueden " + vibesp[rand];
                        eng6 = "they " + "can't " + vib[rand];
                        sp7 = "nosotros " + "no podemos " + vibesp[rand];
                        eng7 = "we " + "can't " + vib[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenCanCont1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo puedo estar " + vib3contesp[rand];
                        eng1 = "I can be " + vib3cont[rand];
                        eng12 = "I can be " + vib3cont[rand];
                        sp2 = "tú puedes estar " + vib3contesp[rand];
                        eng2 = "you can be " + vib3cont[rand];
                        eng22 = "you can be " + vib3cont[rand];
                        sp3 = "él puede estar " + vib3contesp[rand];
                        eng3 = "he can be " + vib3cont[rand];
                        eng32 = "he can be " + vib3cont[rand];
                        sp4 = "ella puede estar " + vib3contesp[rand];
                        eng4 = "she can be " + vib3cont[rand];
                        eng42 = "she can be " + vib3cont[rand];
                        sp5 = "eso puede estar " + vib3contesp[rand];
                        eng5 = "it can be " + vib3cont[rand];
                        eng52 = "it can be " + vib3cont[rand];
                        sp6 = "ellos pueden estar " + vib3contesp[rand];
                        eng6 = "they can be " + vib3cont[rand];
                        eng62 = "they can be " + vib3cont[rand];
                        sp7 = "nosotros podemos estar " + vib3contesp[rand];
                        eng7 = "we can be " + vib3cont[rand];
                        eng72 = "we can be " + vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no puedo estar " + vib3contesp[rand];
                        eng1 = "I can not be " + vib3cont[rand];
                        eng12 = "I can't be " + vib3cont[rand];
                        sp2 = "tú no puedes estar " + vib3contesp[rand];
                        eng2 = "you can not be " + vib3cont[rand];
                        eng22 = "you can't be " + vib3cont[rand];
                        sp3 = "él no puede estar " + vib3contesp[rand];
                        eng3 = "he can not be " + vib3cont[rand];
                        eng32 = "he can't be " + vib3cont[rand];
                        sp4 = "ella no puede estar " + vib3contesp[rand];
                        eng4 = "she can not be " + vib3cont[rand];
                        eng42 = "she can't be " + vib3cont[rand];
                        sp5 = "eso no puede estar " + vib3contesp[rand];
                        eng5 = "it can not be " + vib3cont[rand];
                        eng52 = "it can't be " + vib3cont[rand];
                        sp6 = "ellos no pueden estar " + vib3contesp[rand];
                        eng6 = "they can not be  " + vib3cont[rand];
                        eng62 = "they can't be  " + vib3cont[rand];
                        sp7 = "nosotros no podemos estar " + vib3contesp[rand];
                        eng7 = "we can not be  " + vib3cont[rand];
                        eng72 = "we can't be  " + vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    //Must
    public void GenMustSimp1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debo " + vibesp[rand];
                        eng1 = "I must " + vib[rand];
                        sp2 = "tú debés " + vibesp[rand];
                        eng2 = "you must " + vib[rand];
                        sp3 = "él debe " + vibesp[rand];
                        eng3 = "he must " + vib[rand];
                        sp4 = "ella debe " + vibesp[rand];
                        eng4 = "she must " + vib[rand];
                        sp5 = "eso debe " + vibesp[rand];
                        eng5 = "it must " + vib[rand];
                        sp6 = "ellos deben " + vibesp[rand];
                        eng6 = "they must " + vib[rand];
                        sp7 = "nosotros debemos " + vibesp[rand];
                        eng7 = "we must " + vib[rand];
                        break;
                    case 1:
                        sp1 = "yo " + "no debo " + vibesp[rand];
                        eng1 = "I " + "mustn't " + vib[rand];
                        sp2 = "tú " + "no debés " + vibesp[rand];
                        eng2 = "you " + "mustn't " + vib[rand];
                        sp3 = "él " + "no debe " + vibesp[rand];
                        eng3 = "he " + "mustn't " + vib3p[rand];
                        sp4 = "ella " + "no debe " + vibesp[rand];
                        eng4 = "she " + "mustn't " + vib3p[rand];
                        sp5 = "eso " + "no debe " + vibesp[rand];
                        eng5 = "it " + "mustn't " + vib3p[rand];
                        sp6 = "ellos " + "no deben " + vibesp[rand];
                        eng6 = "they " + "mustn't " + vib[rand];
                        sp7 = "nosotros " + "no debemos " + vibesp[rand];
                        eng7 = "we " + "mustn't " + vib[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenMustCont1() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debo estar " + vib3contesp[rand];
                        eng1 = "I must be " + vib3cont[rand];
                        eng12 = "I must be " + vib3cont[rand];
                        sp2 = "tú debes estar " + vib3contesp[rand];
                        eng2 = "you must be " + vib3cont[rand];
                        eng22 = "you must be " + vib3cont[rand];
                        sp3 = "él debe estar " + vib3contesp[rand];
                        eng3 = "he must be " + vib3cont[rand];
                        eng32 = "he must be " + vib3cont[rand];
                        sp4 = "ella debe estar " + vib3contesp[rand];
                        eng4 = "she must be " + vib3cont[rand];
                        eng42 = "she must be " + vib3cont[rand];
                        sp5 = "eso debe estar " + vib3contesp[rand];
                        eng5 = "it must be " + vib3cont[rand];
                        eng52 = "it must be " + vib3cont[rand];
                        sp6 = "ellos deben estar " + vib3contesp[rand];
                        eng6 = "they must be " + vib3cont[rand];
                        eng62 = "they must be " + vib3cont[rand];
                        sp7 = "nosotros debemos estar " + vib3contesp[rand];
                        eng7 = "we must be " + vib3cont[rand];
                        eng72 = "we must be " + vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no debo estar " + vib3contesp[rand];
                        eng1 = "I must not be " + vib3cont[rand];
                        eng12 = "I mustn't be " + vib3cont[rand];
                        sp2 = "tú no debes estar " + vib3contesp[rand];
                        eng2 = "you must not be " + vib3cont[rand];
                        eng22 = "you mustn't be " + vib3cont[rand];
                        sp3 = "él no debe estar " + vib3contesp[rand];
                        eng3 = "he must not be " + vib3cont[rand];
                        eng32 = "he mustn't be " + vib3cont[rand];
                        sp4 = "ella no debe estar " + vib3contesp[rand];
                        eng4 = "she must not be " + vib3cont[rand];
                        eng42 = "she mustn't be " + vib3cont[rand];
                        sp5 = "eso no debe estar " + vib3contesp[rand];
                        eng5 = "it must not be " + vib3cont[rand];
                        eng52 = "it mustn't be " + vib3cont[rand];
                        sp6 = "ellos no deben estar " + vib3contesp[rand];
                        eng6 = "they must not be  " + vib3cont[rand];
                        eng62 = "they mustn't be  " + vib3cont[rand];
                        sp7 = "nosotros no debemos estar " + vib3contesp[rand];
                        eng7 = "we must not be  " + vib3cont[rand];
                        eng72 = "we mustn't be  " + vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023

    public void GenAbleTo1(){
        gen = new Generator3();
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + "soy capaz de " + vibesp[rand];
                        eng1 = "I am " + "able to " + vib[rand];
                        eng12 = "I'm " + "able to " + vib[rand];

                        sp2 = "tú " + "eres capaz de " + vibesp[rand];
                        eng2 = "you are " + "able to " + vib[rand];
                        eng22 = "you're " + "able to " + vib[rand];

                        sp3 = "él " + "es capaz de " + vibesp[rand];
                        eng3 = "he is " + "able to " + vib[rand];
                        eng32 = "he's " + "able to " + vib[rand];

                        sp4 = "ella " + "es capaz de " + vibesp[rand];
                        eng4 = "she is " + "able to " + vib[rand];
                        eng42 = "she's " + "able to " + vib[rand];

                        sp5 = "eso " + "es capaz de " + vibesp[rand];
                        eng5 = "it is " + "able to " + vib[rand];
                        eng52 = "it's " + "able to " + vib[rand];

                        sp6 = "ellos " + "son capaz de " + vibesp[rand];
                        eng6 = "they are " + "able to " + vib[rand];
                        eng62 = "they're " + "able to " + vib[rand];

                        sp7 = "nosotros " + "somos capaz de " + vibesp[rand];
                        eng7 = "we are " + "able to " + vib[rand];
                        eng72 = "we're " + "able to " + vib[rand];
                        break;
                    case 1:
                        sp1 = "yo no " + "soy capaz de " + vibesp[rand];
                        eng1 = "I am not " + "able to " + vib[rand];
                        eng12 = "I'm not " + "able to " + vib[rand];

                        sp2 = "tú no " + "eres capaz de " + vibesp[rand];
                        eng2 = "you are not " + "able to " + vib[rand];
                        eng22 = "you're not " + "able to " + vib[rand];

                        sp3 = "él no " + "es capaz de " + vibesp[rand];
                        eng3 = "he is not " + "able to " + vib[rand];
                        eng32 = "he's not " + "able to " + vib[rand];

                        sp4 = "ella no " + "es capaz de " + vibesp[rand];
                        eng4 = "she is not " + "able to " + vib[rand];
                        eng42 = "she's not " + "able to " + vib[rand];

                        sp5 = "eso no " + "es capaz de " + vibesp[rand];
                        eng5 = "it is not " + "able to " + vib[rand];
                        eng52 = "it's not " + "able to " + vib[rand];

                        sp6 = "ellos no " + "son capaz de " + vibesp[rand];
                        eng6 = "they are not " + "able to " + vib[rand];
                        eng62 = "they're not " + "able to " + vib[rand];

                        sp7 = "nosotros no " + "somos capaz de " + vibesp[rand];
                        eng7 = "we are not " + "able to " + vib[rand];
                        eng72 = "we're not " + "able to " + vib[rand];
                        break;

                }
            }
        }
    }//PD FEB 2023

    //for to dificultad 3 SOlO INTRANS
    public void forSubTo1() {

        Pasts3 pas = new Pasts3();
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int rn1 = (int) (Math.random() * 6);
        int rn2 = (int) (Math.random() * 5);
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

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = ftsjs[0] + pas.vis1[rand];
                        eng1 = ftsj[0] + vib[rand];
                        sp2 = ftsjs[1] + pas.vis2[rand];
                        eng2 = ftsj[1] + vib[rand];
                        sp3 = ftsjs[2] + pas.vis3[rand];
                        eng3 = ftsj[2] + vib[rand];
                        sp4 = ftsjs[3] + pas.vis3[rand];
                        eng4 = ftsj[3] + vib[rand];
                        sp5 = ftsjs[4] + pas.vis3[rand];
                        eng5 = ftsj[4] + vib[rand];
                        sp6 = ftsjs[5] + pas.vis4[rand];
                        eng6 = ftsj[5] + vib[rand];
                        sp7 = ftsjs[6] + pas.vis5[rand];
                        eng7 = ftsj[6] + vib[rand];
                        break;
                    case 1:
                        sp1 = ftsjsn[0] + pas.vis1[rand];
                        eng1 = ftsjn[0] + vib[rand];
                        sp2 = ftsjsn[1] + pas.vis2[rand];
                        eng2 = ftsjn[1] + vib[rand];
                        sp3 = ftsjsn[2] + pas.vis3[rand];
                        eng3 = ftsjn[2] + vib[rand];
                        sp4 = ftsjsn[3] + pas.vis3[rand];
                        eng4 = ftsjn[3] + vib[rand];
                        sp5 = ftsjsn[4] + pas.vis3[rand];
                        eng5 = ftsjn[4] + vib[rand];
                        sp6 = ftsjsn[5] + pas.vis4[rand];
                        eng6 = ftsjn[5] + vib[rand];
                        sp7 = ftsjsn[6] + pas.vis5[rand];
                        eng7 = ftsjn[6] + vib[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //want to dificultad 3 SOLO INTRANS
    public void wantyouto1() {

        Pasts3 pas = new Pasts3();
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int rn1 = (int) (Math.random() * 6);
        int rn2 = (int) (Math.random() * 5);
        int neg = (int) (Math.random() * 2);


        //want to subject
        String wtsj[] = {"I want ", "you want ", "he wants ", "she wants ", "it wants ", "we want ", "they want "};
        //want to subject negative
        String wtsjn[] = {"I don't want ", "you don't want ", "he doesn't want ", "she doesn't want ", "it doesn't want "
                , "we don't want ", "they don't want "};
        //sujetos want to en sp
        String wtsjs[] = {"yo quiero ", "tú quieres ", "él quiere ", "ella quiere ", "eso quiere ", "nosotros queremos ", "ellos quieren "};
        //sujetos want to en sp negativo
        String wtsjsn[] = {"yo no quiero ", "tú no quieres ", "él no quiere ", "eso no quiere ", "ella no quiere ", "nosotros no queremos ", "ellos no quieren "};

        String wtobj1[] = {"you to " + vib[rand], "him to " + vib[rand], "her to " + vib[rand],
                "it to " + vib[rand], "us to " + vib[rand], "them to " + vib[rand]};
        String wtobj2[] = {"me to " + vib[rand], "him to " + vib[rand], "her to " + vib[rand],
                "it to " + vib[rand], "us to " + vib[rand], "them to " + vib[rand]};
        String wtobj3[] = {"you to " + vib[rand], "me to " + vib[rand], "her to " + vib[rand],
                "it to " + vib[rand], "us to " + vib[rand], "them to " + vib[rand]};
        String wtobj4[] = {"you to " + vib[rand], "him to " + vib[rand], "me to " + vib[rand],
                "it to " + vib[rand], "us to " + vib[rand], "them to " + vib[rand]};
        String wtobj5[] = {"you to " + vib[rand], "him to " + vib[rand], "her to " + vib[rand],
                "me to " + vib[rand], "us to " + vib[rand], "them to " + vib[rand]};
        String wtobj6[] = {"you to " + vib[rand], "him to " + vib[rand], "her to " + vib[rand],
                "it to " + vib[rand], "them to " + vib[rand]};
        String wtobj7[] = {"you to " + vib[rand], "him to " + vib[rand], "her to " + vib[rand],
                "it to " + vib[rand], "us to " + vib[rand], "me to " + vib[rand]};

        // objetos wt en sp
        String wtobj1s[] = {"que tú " + pas.vis2[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis5[rand], "que ellos " + pas.vis4[rand]};
        String wtobj2s[] = {"que yo " + pas.vis1[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis3[rand], "que ellos " + pas.vis3[rand]};
        String wtobj3s[] = {"que tú " + pas.vis2[rand], "que yo " + pas.vis1[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis5[rand], "que ellos " + pas.vis4[rand]};
        String wtobj4s[] = {"que tú " + pas.vis2[rand], "que él " + pas.vis3[rand], "que yo " + pas.vis1[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis5[rand], "que ellos " + pas.vis4[rand]};
        String wtobj5s[] = {"que tú " + pas.vis2[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que yo " + pas.vis1[rand], "que nosotros " + pas.vis5[rand], "que ellos " + pas.vis4[rand]};
        String wtobj6s[] = {"que tú " + pas.vis2[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que ellos " + pas.vis4[rand]};
        String wtobj7s[] = {"que tú " + pas.vis2[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis5[rand], "que yo " + pas.vis1[rand]};

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = wtsjs[0] + wtobj1s[rn1];
                        eng1 = wtsj[0] + wtobj1[rn1];
                        sp2 = wtsjs[1] + wtobj2s[rn1];
                        eng2 = wtsj[1] + wtobj2[rn1];
                        sp3 = wtsjs[2] + wtobj3s[rn1];
                        eng3 = wtsj[2] + wtobj3[rn1];
                        sp4 = wtsjs[3] + wtobj4s[rn1];
                        eng4 = wtsj[3] + wtobj4[rn1];
                        sp5 = wtsjs[4] + wtobj5s[rn1];
                        eng5 = wtsj[4] + wtobj5[rn1];
                        sp6 = wtsjs[5] + wtobj6s[rn2];
                        eng6 = wtsj[5] + wtobj6[rn2];
                        sp7 = wtsjs[6] + wtobj7s[rn1];
                        eng7 = wtsj[6] + wtobj7[rn1];
                        break;
                    case 1:
                        sp1 = wtsjsn[0] + wtobj1s[rn1];
                        eng1 = wtsjn[0] + wtobj1[rn1];
                        sp2 = wtsjsn[1] + wtobj2s[rn1];
                        eng2 = wtsjn[1] + wtobj2[rn1];
                        sp3 = wtsjsn[2] + wtobj3s[rn1];
                        eng3 = wtsjn[2] + wtobj3[rn1];
                        sp4 = wtsjsn[3] + wtobj4s[rn1];
                        eng4 = wtsjn[3] + wtobj4[rn1];
                        sp5 = wtsjsn[4] + wtobj5s[rn1];
                        eng5 = wtsjn[4] + wtobj5[rn1];
                        sp6 = wtsjsn[5] + wtobj6s[rn2];
                        eng6 = wtsjn[5] + wtobj6[rn2];
                        sp7 = wtsjsn[6] + wtobj7s[rn1];
                        eng7 = wtsjn[6] + wtobj7[rn1];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //presentes
    public void GenPresSimp2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1[rand] + arrayEsp;
                        eng1 = "I " + vib[rand] + arrayEng;
                        eng12 = "I " + vib[rand] + arrayEng;
                        sp2 = "tú " + vib2[rand] + arrayEsp;
                        eng2 = "you " + vib[rand] + arrayEng;
                        eng22 = "you " + vib[rand] + arrayEng;
                        sp3 = "él " + vib3p[rand] + arrayEsp;
                        eng3 = "he " + vib[rand] + arrayEng;
                        eng32 = "he " + vib[rand] + arrayEng;
                        sp4 = "ella " + vib3p[rand] + arrayEsp;
                        eng4 = "she " + vib[rand] + arrayEng;
                        eng42 = "she " + vib[rand] + arrayEng;
                        sp5 = "eso " + vib3p[rand] + arrayEsp;
                        eng5 = "it " + vib[rand] + arrayEng;
                        eng52 = "it " + vib[rand] + arrayEng;
                        sp6 = "ellos " + vib4[rand] + arrayEsp;
                        eng6 = "they " + vib[rand] + arrayEng;
                        eng62 = "they " + vib[rand] + arrayEng;
                        sp7 = "nosotros " + vibnos[rand] + arrayEsp;
                        eng7 = "we " + vib[rand] + arrayEng;
                        eng72 = "we " + vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + arrayEsp;
                        eng1 = "I do not " + vib[rand] + arrayEng;
                        eng12 = "I don't " + vib[rand] + arrayEng;
                        sp2 = "tú " + "no " + vib2[rand] + arrayEsp;
                        eng2 = "you do not " + vib[rand] + arrayEng;
                        eng22 = "you don't " + vib[rand] + arrayEng;
                        sp3 = "él no " + vib3p[rand] + arrayEsp;
                        eng3 = "he do not " + vib[rand] + arrayEng;
                        eng32 = "he don't " + vib[rand] + arrayEng;
                        sp4 = "ella no " + vib3p[rand] + arrayEsp;
                        eng4 = "she do not " + vib[rand] + arrayEng;
                        eng42 = "she don't " + vib[rand] + arrayEng;
                        sp5 = "eso no " + vib3p[rand] + arrayEsp;
                        eng5 = "it do not " + vib[rand] + arrayEng;
                        eng52 = "it don't " + vib[rand] + arrayEng;
                        sp6 = "ellos " + "no " + vib4[rand] + arrayEsp;
                        eng6 = "they do not " + vib[rand] + arrayEng;
                        eng62 = "they don't " + vib[rand] + arrayEng;
                        sp7 = "nosotros " + "no " + vibnos[rand] + arrayEsp;
                        eng7 = "we do not " + vib[rand] + arrayEng;
                        eng72 = "we don't " + vib[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPresCont2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estoy " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I am " + vib3cont[rand] + arrayEng;
                        eng12 = "I'm " + vib3cont[rand] + arrayEng;
                        sp2 = "tú estás " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you are " + vib3cont[rand] + arrayEng;
                        eng22 = "you're " + vib3cont[rand] + arrayEng;
                        sp3 = "él está " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he is " + vib3cont[rand] + arrayEng;
                        eng32 = "he's " + vib3cont[rand] + arrayEng;
                        sp4 = "ella está " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she is " + vib3cont[rand] + arrayEng;
                        eng42 = "she's " + vib3cont[rand] + arrayEng;
                        sp5 = "eso está " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it is " + vib3cont[rand] + arrayEng;
                        eng52 = "it's " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos están " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they are " + vib3cont[rand] + arrayEng;
                        eng62 = "they're " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros estamos " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we are " + vib3cont[rand] + arrayEng;
                        eng72 = "we're " + vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no estoy " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I am not " + vib3cont[rand] + arrayEng;
                        eng12 = "I'm not " + vib3cont[rand] + arrayEng;
                        sp2 = "tú no estás " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you are not " + vib3cont[rand] + arrayEng;
                        eng22 = "you aren't " + vib3cont[rand] + arrayEng;
                        sp3 = "él no está " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he is not " + vib3cont[rand] + arrayEng;
                        eng32 = "he isn't " + vib3cont[rand] + arrayEng;
                        sp4 = "ella no está " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she is not " + vib3cont[rand] + arrayEng;
                        eng42 = "she isn't " + vib3cont[rand] + arrayEng;
                        sp5 = "eso no está " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it is not " + vib3cont[rand] + arrayEng;
                        eng52 = "it isn't " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos no están " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they are not  " + vib3cont[rand] + arrayEng;
                        eng62 = "they aren't  " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no estamos " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we are not  " + vib3cont[rand] + arrayEng;
                        eng72 = "we aren't  " + vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPresPerf2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo he " + vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I have " + viparticiple[rand] + arrayEng;
                        eng12 = "I've " + viparticiple[rand] + arrayEng;
                        sp2 = "tú has " + vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you have " + viparticiple[rand] + arrayEng;
                        eng22 = "you've " + viparticiple[rand] + arrayEng;
                        sp3 = "él ha " + vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he has " + viparticiple[rand] + arrayEng;
                        eng32 = "he's " + viparticiple[rand] + arrayEng;
                        sp4 = "ella ha " + vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she has " + viparticiple[rand] + arrayEng;
                        eng42 = "she's " + viparticiple[rand] + arrayEng;
                        sp5 = "eso ha " + vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it has " + viparticiple[rand] + arrayEng;
                        eng52 = "it's " + viparticiple[rand] + arrayEng;
                        sp6 = "ellos han " + vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they have " + viparticiple[rand] + arrayEng;
                        eng62 = "they've " + viparticiple[rand] + arrayEng;
                        sp7 = "nosotros hemos " + vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we have " + viparticiple[rand] + arrayEng;
                        eng72 = "we've " + viparticiple[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no he " + vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I have not " + viparticiple[rand] + arrayEng;
                        eng12 = "I haven't " + viparticiple[rand] + arrayEng;
                        sp2 = "tú no has " + vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you have not " + viparticiple[rand] + arrayEng;
                        eng22 = "you haven't " + viparticiple[rand] + arrayEng;
                        sp3 = "él no ha " + vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he has not " + viparticiple[rand] + arrayEng;
                        eng32 = "he hasn't " + viparticiple[rand] + arrayEng;
                        sp4 = "ella no ha " + vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she has not " + viparticiple[rand] + arrayEng;
                        eng42 = "she hasn't " + viparticiple[rand] + arrayEng;
                        sp5 = "eso no ha " + vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it has not " + viparticiple[rand] + arrayEng;
                        eng52 = "it hasn't " + viparticiple[rand] + arrayEng;
                        sp6 = "ellos no han " + vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they have not  " + viparticiple[rand] + arrayEng;
                        eng62 = "they haven't  " + viparticiple[rand] + arrayEng;
                        sp7 = "nosotros no hemos " + vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we have not  " + viparticiple[rand] + arrayEng;
                        eng72 = "we haven't  " + viparticiple[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenPresPerfCont2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo he estado " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I have been " + vib3cont[rand] + arrayEng;
                        sp2 = "tú has estado " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you have been " + vib3cont[rand] + arrayEng;
                        sp3 = "él ha estado " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he has been " + vib3cont[rand] + arrayEng;
                        sp4 = "ella ha estado " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she has been " + vib3cont[rand] + arrayEng;
                        sp5 = "eso ha estado " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it has been " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos han estado " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they have been " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros hemos estado " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we have been " + vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no he estado " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I haven't been " + vib3cont[rand] + arrayEng;
                        sp2 = "tú no has estado " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you haven't been " + vib3cont[rand] + arrayEng;
                        sp3 = "él no ha estado " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he hasn't been " + vib3cont[rand] + arrayEng;
                        sp4 = "ella no ha estado " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she hasn't been " + vib3cont[rand] + arrayEng;
                        sp5 = "eso no ha estado " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it hasn't been " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos no han estado " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they haven't been " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no hemos estado " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we haven't been " + vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Pasados
    public void GenPastSimp2() {
        Pasts pas = new Pasts();
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 4);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    // 0 - positivo preterito, 1- negativo preterito
                    // 2- positivo imperfecto 3. negativo imperfecto
                    case 0:
                        sp1 = "yo " + pas.vibp1pr[rand] + arrayEsp;
                        eng1 = "I " + pas.vibpast[rand] + arrayEng;
                        sp2 = "tú " + pas.vibp2pr[rand] + arrayEsp;
                        eng2 = "you " + pas.vibpast[rand] + arrayEng;
                        sp3 = "él " + pas.vibp3pr[rand] + arrayEsp;
                        eng3 = "he " + pas.vibpast[rand] + arrayEng;
                        sp4 = "ella " + pas.vibp3pr[rand] + arrayEsp;
                        eng4 = "she " + pas.vibpast[rand] + arrayEng;
                        sp5 = "eso " + pas.vibp3pr[rand] + arrayEsp;
                        eng5 = "it " + pas.vibpast[rand] + arrayEng;
                        sp6 = "ellos " + pas.vibp4pr[rand] + arrayEsp;
                        eng6 = "they " + pas.vibpast[rand] + arrayEng;
                        sp7 = "nosotros " + pas.vibp5pr[rand] + arrayEsp;
                        eng7 = "we " + pas.vibpast[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo " + "no " + pas.vibp1pr[rand] + arrayEsp;
                        eng1 = "I " + "didn't " + pas.vib[rand] + arrayEng;
                        sp2 = "tú " + "no " + pas.vibp2pr[rand] + arrayEsp;
                        eng2 = "you " + "didn't " + pas.vib[rand] + arrayEng;
                        sp3 = "él " + "no " + pas.vibp3pr[rand] + arrayEsp;
                        eng3 = "he " + "didn't " + pas.vib[rand] + arrayEng;
                        sp4 = "ella " + "no " + pas.vibp3pr[rand] + arrayEsp;
                        eng4 = "she " + "didn't " + pas.vib[rand] + arrayEng;
                        sp5 = "eso " + "no " + pas.vibp3pr[rand] + arrayEsp;
                        eng5 = "it " + "didn't " + pas.vib[rand] + arrayEng;
                        sp6 = "ellos " + "no " + pas.vibp4pr[rand] + arrayEsp;
                        eng6 = "they " + "didn't " + pas.vib[rand] + arrayEng;
                        sp7 = "nosotros " + "no " + pas.vibp5pr[rand] + arrayEsp;
                        eng7 = "we " + "didn't " + pas.vib[rand] + arrayEng;
                        break;
                    case 2:
                        sp1 = "yo " + pas.vibp1[rand] + arrayEsp;
                        eng1 = "I " + pas.vibpast[rand] + arrayEng;
                        sp2 = "tú " + pas.vibp2[rand] + arrayEsp;
                        eng2 = "you " + pas.vibpast[rand] + arrayEng;
                        sp3 = "él " + pas.vibp3[rand] + arrayEsp;
                        eng3 = "he " + pas.vibpast[rand] + arrayEng;
                        sp4 = "ella " + pas.vibp3[rand] + arrayEsp;
                        eng4 = "she " + pas.vibpast[rand] + arrayEng;
                        sp5 = "eso " + pas.vibp3[rand] + arrayEsp;
                        eng5 = "it " + pas.vibpast[rand] + arrayEng;
                        sp6 = "ellos " + pas.vibp4[rand] + arrayEsp;
                        eng6 = "they " + pas.vibpast[rand] + arrayEng;
                        sp7 = "nosotros " + pas.vibp5[rand] + arrayEsp;
                        eng7 = "we " + pas.vibpast[rand] + arrayEng;
                        break;
                    case 3:
                        sp1 = "yo " + "no " + pas.vibp1[rand] + arrayEsp;
                        eng1 = "I " + "didn't " + pas.vib[rand] + arrayEng;
                        sp2 = "tú " + "no " + pas.vibp2[rand] + arrayEsp;
                        eng2 = "you " + "didn't " + pas.vib[rand] + arrayEng;
                        sp3 = "él " + "no " + pas.vibp3[rand] + arrayEsp;
                        eng3 = "he " + "didn't " + pas.vib[rand] + arrayEng;
                        sp4 = "ella " + "no " + pas.vibp3[rand] + arrayEsp;
                        eng4 = "she " + "didn't " + pas.vib[rand] + arrayEng;
                        sp5 = "eso " + "no " + pas.vibp3[rand] + arrayEsp;
                        eng5 = "it " + "didn't " + pas.vib[rand] + arrayEng;
                        sp6 = "ellos " + "no " + pas.vibp4[rand] + arrayEsp;
                        eng6 = "they " + "didn't " + pas.vib[rand] + arrayEng;
                        sp7 = "nosotros " + "no " + pas.vibp5[rand] + arrayEsp;
                        eng7 = "we " + "didn't " + pas.vib[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPastCont2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estaba " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I was " + vib3cont[rand] + arrayEng;
                        eng12 = "I was " + vib3cont[rand] + arrayEng;
                        sp2 = "tú estabas " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you were " + vib3cont[rand] + arrayEng;
                        eng22 = "you were " + vib3cont[rand] + arrayEng;
                        sp3 = "él estaba " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he was " + vib3cont[rand] + arrayEng;
                        eng32 = "he was " + vib3cont[rand] + arrayEng;
                        sp4 = "ella estaba " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she was " + vib3cont[rand] + arrayEng;
                        eng42 = "she was " + vib3cont[rand] + arrayEng;
                        sp5 = "eso estaba " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it was " + vib3cont[rand] + arrayEng;
                        eng52 = "it was " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos estaban " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they were " + vib3cont[rand] + arrayEng;
                        eng62 = "they were " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros estabamos " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we were " + vib3cont[rand] + arrayEng;
                        eng72 = "we were " + vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no estaba " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I was not " + vib3cont[rand] + arrayEng;
                        eng12 = "I wasn't " + vib3cont[rand] + arrayEng;
                        sp2 = "tú no estabas " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you were not " + vib3cont[rand] + arrayEng;
                        eng22 = "you weren't " + vib3cont[rand] + arrayEng;
                        sp3 = "él no estaba " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he was not " + vib3cont[rand] + arrayEng;
                        eng32 = "he wasn't " + vib3cont[rand] + arrayEng;
                        sp4 = "ella no estaba " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she was not " + vib3cont[rand] + arrayEng;
                        eng42 = "she wasn't " + vib3cont[rand] + arrayEng;
                        sp5 = "eso no estaba " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it was not " + vib3cont[rand] + arrayEng;
                        eng52 = "it wasn't " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos no estaban " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they were not  " + vib3cont[rand] + arrayEng;
                        eng62 = "they weren't  " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no estabamos " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we were not  " + vib3cont[rand] + arrayEng;
                        eng72 = "we weren't  " + vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPastPerf2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo habia " + vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I had " + viparticiple[rand] + arrayEng;
                        eng12 = "I had " + viparticiple[rand] + arrayEng;
                        sp2 = "tú habias " + vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you had " + viparticiple[rand] + arrayEng;
                        eng22 = "you had " + viparticiple[rand] + arrayEng;
                        sp3 = "él habia " + vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he had " + viparticiple[rand] + arrayEng;
                        eng32 = "he had " + viparticiple[rand] + arrayEng;
                        sp4 = "ella habia " + vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she had " + viparticiple[rand] + arrayEng;
                        eng42 = "she had " + viparticiple[rand] + arrayEng;
                        sp5 = "eso habia " + vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it had " + viparticiple[rand] + arrayEng;
                        eng52 = "it had " + viparticiple[rand] + arrayEng;
                        sp6 = "ellos habian " + vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they had " + viparticiple[rand] + arrayEng;
                        eng62 = "they had " + viparticiple[rand] + arrayEng;
                        sp7 = "nosotros habiamos " + vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we had " + viparticiple[rand] + arrayEng;
                        eng72 = "we had " + viparticiple[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no habia " + vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I had not " + viparticiple[rand] + arrayEng;
                        eng12 = "I hadn't " + viparticiple[rand] + arrayEng;
                        sp2 = "tú no habias " + vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you had not " + viparticiple[rand] + arrayEng;
                        eng22 = "you hadn't " + viparticiple[rand] + arrayEng;
                        sp3 = "él no habia " + vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he had not " + viparticiple[rand] + arrayEng;
                        eng32 = "he hadn't " + viparticiple[rand] + arrayEng;
                        sp4 = "ella no habia " + vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she had not " + viparticiple[rand] + arrayEng;
                        eng42 = "she hadn't " + viparticiple[rand] + arrayEng;
                        sp5 = "eso no habia " + vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it had not " + viparticiple[rand] + arrayEng;
                        eng52 = "it hadn't " + viparticiple[rand] + arrayEng;
                        sp6 = "ellos no habian " + vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they had not  " + viparticiple[rand] + arrayEng;
                        eng62 = "they hadn't  " + viparticiple[rand] + arrayEng;
                        sp7 = "nosotros no habiamos " + vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we had not  " + viparticiple[rand] + arrayEng;
                        eng72 = "we hadn't  " + viparticiple[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPastPerfCont2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo había estado " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I had been " + vib3cont[rand] + arrayEng;
                        sp2 = "tú habías estado " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you had been " + vib3cont[rand] + arrayEng;
                        sp3 = "él había estado " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he had been " + vib3cont[rand] + arrayEng;
                        sp4 = "ella había estado " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she had been " + vib3cont[rand] + arrayEng;
                        sp5 = "eso había estado " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it had been " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos habían " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they had been " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros habíamos estado " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we had been " + vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no había estado " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I hadn't been " + vib3cont[rand] + arrayEng;
                        sp2 = "tú no habías estado  " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you hadn't been " + vib3cont[rand] + arrayEng;
                        sp3 = "él no había estado " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he hadn't been " + vib3cont[rand] + arrayEng;
                        sp4 = "ella no había estado " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she hadn't been " + vib3cont[rand] + arrayEng;
                        sp5 = "eso no había estado " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it hadn't been " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos no habían " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they hadn't been " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no habíamos estado " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we hadn't been " + vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Futuros
    public void GenFutSimp2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1f[rand] + arrayEsp;
                        eng1 = "I will " + vib[rand] + arrayEng;
                        sp2 = "tú " + vib2f[rand] + arrayEsp;
                        eng2 = "you will " + vib[rand] + arrayEng;
                        sp3 = "él " + vib3f[rand] + arrayEsp;
                        eng3 = "he will " + vib[rand] + arrayEng;
                        sp4 = "ella " + vib3f[rand] + arrayEsp;
                        eng4 = "she will " + vib[rand] + arrayEng;
                        sp5 = "eso " + vib3f[rand] + arrayEsp;
                        eng5 = "it will " + vib[rand] + arrayEng;
                        sp6 = "ellos " + vib4f[rand] + arrayEsp;
                        eng6 = "they will " + vib[rand] + arrayEng;
                        sp7 = "nosotros " + vibfnos[rand] + arrayEsp;
                        eng7 = "we will " + vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1f[rand] + arrayEsp;
                        eng1 = "I " + "won't " + vib[rand] + arrayEng;
                        sp2 = "tú " + "no " + vib2f[rand] + arrayEsp;
                        eng2 = "you " + "won't " + vib[rand] + arrayEng;
                        sp3 = "él " + "no " + vib3f[rand] + arrayEsp;
                        eng3 = "he " + "won't " + vib[rand] + arrayEng;
                        sp4 = "ella " + "no " + vib3f[rand] + arrayEsp;
                        eng4 = "she " + "won't " + vib[rand] + arrayEng;
                        sp5 = "eso " + "no " + vib3f[rand] + arrayEsp;
                        eng5 = "it " + "won't " + vib[rand] + arrayEng;
                        sp6 = "ellos " + "no " + vib4f[rand] + arrayEsp;
                        eng6 = "they " + "won't " + vib[rand] + arrayEng;
                        sp7 = "nosotros " + "no " + vibfnos[rand] + arrayEsp;
                        eng7 = "we " + "won't " + vib[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenFutCont2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estaré " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I will be " + vib3cont[rand] + arrayEng;
                        eng12 = "I'll be " + vib3cont[rand] + arrayEng;
                        sp2 = "tú estaras " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you will be " + vib3cont[rand] + arrayEng;
                        eng22 = "you'll be " + vib3cont[rand] + arrayEng;
                        sp3 = "él estaré " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he will be " + vib3cont[rand] + arrayEng;
                        eng32 = "he'll be " + vib3cont[rand] + arrayEng;
                        sp4 = "ella estaré " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she will be " + vib3cont[rand] + arrayEng;
                        eng32 = "he'll be " + vib3cont[rand] + arrayEng;
                        sp5 = "eso estaré " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it will be " + vib3cont[rand] + arrayEng;
                        eng52 = "it'll be " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos estaran " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they will be " + vib3cont[rand] + arrayEng;
                        eng62 = "they'll be " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros estaremos " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we will be " + vib3cont[rand] + arrayEng;
                        eng72 = "we'll be " + vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no estaré " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I will not be " + vib3cont[rand] + arrayEng;
                        eng12 = "I won't be " + vib3cont[rand] + arrayEng;
                        sp2 = "tú no estaras " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you will not be " + vib3cont[rand] + arrayEng;
                        eng22 = "you won't be " + vib3cont[rand] + arrayEng;
                        sp3 = "él no estaré " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he will not be " + vib3cont[rand] + arrayEng;
                        eng32 = "he won't be " + vib3cont[rand] + arrayEng;
                        sp4 = "ella no estaré " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she will not be " + vib3cont[rand] + arrayEng;
                        eng42 = "she won't be " + vib3cont[rand] + arrayEng;
                        sp5 = "eso no estaré " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it will not be " + vib3cont[rand] + arrayEng;
                        eng52 = "it won't be " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos no estaran " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they will not be " + vib3cont[rand] + arrayEng;
                        eng62 = "they won't be " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no estaremos " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we will not be " + vib3cont[rand] + arrayEng;
                        eng72 = "we won't be " + vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenFutPerf2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo habre " + vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I will have " + viparticiple[rand] + arrayEng;
                        eng12 = "I'll have " + viparticiple[rand] + arrayEng;
                        sp2 = "tú habrás " + vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you will have " + viparticiple[rand] + arrayEng;
                        eng22 = "you'll have " + viparticiple[rand] + arrayEng;
                        sp3 = "él habrá " + vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he will have " + viparticiple[rand] + arrayEng;
                        eng32 = "he'll have  " + viparticiple[rand] + arrayEng;
                        sp4 = "ella habrá " + vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she will have " + viparticiple[rand] + arrayEng;
                        eng42 = "she'll have  " + viparticiple[rand] + arrayEng;
                        sp5 = "eso habrá " + vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it will have " + viparticiple[rand] + arrayEng;
                        eng52 = "it'll have  " + viparticiple[rand] + arrayEng;
                        sp6 = "ellos habrán " + vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they will have " + viparticiple[rand] + arrayEng;
                        eng62 = "they'll have " + viparticiple[rand] + arrayEng;
                        sp7 = "nosotros habremos "  + vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we will have " + viparticiple[rand] + arrayEng;
                        eng72 = "we'll have " + viparticiple[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no habre " + vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I will not have " + viparticiple[rand] + arrayEng;
                        eng12 = "I won't have " + viparticiple[rand] + arrayEng;
                        sp2 = "tú no habrás " + vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you will not have " + viparticiple[rand] + arrayEng;
                        eng22 = "you won't have " + viparticiple[rand] + arrayEng;
                        sp3 = "él no habrá " + vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he will not have " + viparticiple[rand] + arrayEng;
                        eng32 = "he won't have " + viparticiple[rand] + arrayEng;
                        sp4 = "ella no habrá " + vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she will not have " + viparticiple[rand] + arrayEng;
                        eng42 = "she won't have " + viparticiple[rand] + arrayEng;
                        sp5 = "eso no habrá " + vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it will not have " + viparticiple[rand] + arrayEng;
                        eng52 = "it won't have " + viparticiple[rand] + arrayEng;
                        sp6 = "ellos no habrán " + vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they will not have  " + viparticiple[rand] + arrayEng;
                        eng62 = "they won't have  " + viparticiple[rand] + arrayEng;
                        sp7 = "nosotros no habremos "  + vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we will not have  " + viparticiple[rand] + arrayEng;
                        eng72 = "we won't have  " + viparticiple[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenFutPerfCont2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo habré estado " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I will have been " + vib3cont[rand] + arrayEng;
                        sp2 = "tú habrás estado " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you will have been " + vib3cont[rand] + arrayEng;
                        sp3 = "él habrá estado " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he will have been " + vib3cont[rand] + arrayEng;
                        sp4 = "ella habrá estado " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she will have been " + vib3cont[rand] + arrayEng;
                        sp5 = "eso habrá estado " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it will have been " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos habrán estado " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they will have been " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros habremos estado " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we will have been " + vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no habré estado " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I won't have been " + vib3cont[rand] + arrayEng;
                        sp2 = "tú no habrás estado  " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you won't have been " + vib3cont[rand] + arrayEng;
                        sp3 = "él no habrá estado   " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he won't have been " + vib3cont[rand] + arrayEng;
                        sp4 = "ella no habrá estado   " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she won't have been " + vib3cont[rand] + arrayEng;
                        sp5 = "eso no habrá estado   " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it won't have been " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos no habran estado " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they won't have been " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no habremos estado " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we won't have been " + vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Would
    public void GenWouldSimp2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1w[rand] + arrayEsp;
                        eng1 = "I would " + vib[rand] + arrayEng;
                        sp2 = "tú " + vib2w[rand] + arrayEsp;
                        eng2 = "you would " + vib[rand] + arrayEng;
                        sp3 = "él " + vib3w[rand] + arrayEsp;
                        eng3 = "he would " + vib[rand] + arrayEng;
                        sp4 = "ella " + vib3w[rand] + arrayEsp;
                        eng4 = "she would " + vib[rand] + arrayEng;
                        sp5 = "eso " + vib3w[rand] + arrayEsp;
                        eng5 = "it would " + vib[rand] + arrayEng;
                        sp6 = "ellos " + vib4w[rand] + arrayEsp;
                        eng6 = "they would " + vib[rand] + arrayEng;
                        sp7 = "nosotros " + vib5w[rand] + arrayEsp;
                        eng7 = "we would " + vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1w[rand] + arrayEsp;
                        eng1 = "I " + "wouldn't " + vib[rand] + arrayEng;
                        sp2 = "tú " + "no " + vib2w[rand] + arrayEsp;
                        eng2 = "you " + "wouldn't " + vib[rand] + arrayEng;
                        sp3 = "él " + "no " + vib3w[rand] + arrayEsp;
                        eng3 = "he " + "wouldn't " + vib[rand] + arrayEng;
                        sp4 = "ella " + "no " + vib3w[rand] + arrayEsp;
                        eng4 = "she " + "wouldn't " + vib[rand] + arrayEng;
                        sp5 = "eso " + "no " + vib3w[rand] + arrayEsp;
                        eng5 = "it " + "wouldn't " + vib[rand] + arrayEng;
                        sp6 = "ellos " + "no " + vib4w[rand] + arrayEsp;
                        eng6 = "they " + "wouldn't " + vib[rand] + arrayEng;
                        sp7 = "nosotros " + "no " + vib5w[rand] + arrayEsp;
                        eng7 = "we " + "wouldn't " + vib[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenWouldCont2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estaría " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I would be " + vib3cont[rand] + arrayEng;
                        eng12 = "I'd be " + vib3cont[rand] + arrayEng;
                        sp2 = "tú estarías " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you would be " + vib3cont[rand] + arrayEng;
                        eng22 = "you'd be " + vib3cont[rand] + arrayEng;
                        sp3 = "él estaría " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he would be " + vib3cont[rand] + arrayEng;
                        eng32 = "he'd be " + vib3cont[rand] + arrayEng;
                        sp4 = "ella estaría " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she would be " + vib3cont[rand] + arrayEng;
                        eng42 = "she'd be " + vib3cont[rand] + arrayEng;
                        sp5 = "eso estaría " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it would be " + vib3cont[rand] + arrayEng;
                        eng52 = "it'd be " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos estarían " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they would be " + vib3cont[rand] + arrayEng;
                        eng62 = "they'd be " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros estaríamos " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we would be " + vib3cont[rand] + arrayEng;
                        eng72 = "we'd be " + vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no estaría " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I would not be " + vib3cont[rand] + arrayEng;
                        eng12 = "I wouldn't be " + vib3cont[rand] + arrayEng;
                        sp2 = "tú no estarías " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you would not be " + vib3cont[rand] + arrayEng;
                        eng22 = "you wouldn't be " + vib3cont[rand] + arrayEng;
                        sp3 = "él no estaría " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he would not be " + vib3cont[rand] + arrayEng;
                        eng32 = "he wouldn't be " + vib3cont[rand] + arrayEng;
                        sp4 = "ella no estaría " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she would not be " + vib3cont[rand] + arrayEng;
                        eng42 = "she wouldn't be " + vib3cont[rand] + arrayEng;
                        sp5 = "eso no estaría " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it would not be " + vib3cont[rand] + arrayEng;
                        eng52 = "it wouldn't be " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos no estarían " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they would not be  " + vib3cont[rand] + arrayEng;
                        eng62 = "they wouldn't be  " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no estaríamos " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we would not be  " + vib3cont[rand] + arrayEng;
                        eng72 = "we wouldn't be  " + vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenWouldPerf2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo hubiera " + vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I would have " + viparticiple[rand] + arrayEng;
                        eng12 = "I'd have " + viparticiple[rand] + arrayEng;
                        sp2 = "tú hubieras " + vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you would have " + viparticiple[rand] + arrayEng;
                        eng22 = "you'd have " + viparticiple[rand] + arrayEng;
                        sp3 = "él hubiera " + vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he would have " + viparticiple[rand] + arrayEng;
                        eng32 = "he'd have  " + viparticiple[rand] + arrayEng;
                        sp4 = "ella hubiera " + vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she would have " + viparticiple[rand] + arrayEng;
                        eng42 = "she'd have  " + viparticiple[rand] + arrayEng;
                        sp5 = "eso hubiera " + vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it would have " + viparticiple[rand] + arrayEng;
                        eng52 = "it'd have  " + viparticiple[rand] + arrayEng;
                        sp6 = "ellos hubieran " + vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they would have " + viparticiple[rand] + arrayEng;
                        eng62 = "they'd have " + viparticiple[rand] + arrayEng;
                        sp7 = "nosotros habríamos "  + vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we would have " + viparticiple[rand] + arrayEng;
                        eng72 = "we'd have " + viparticiple[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no hubiera " + vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I would not have " + viparticiple[rand] + arrayEng;
                        eng12 = "I wouldn't have " + viparticiple[rand] + arrayEng;
                        sp2 = "tú no hubieras " + vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you would not have " + viparticiple[rand] + arrayEng;
                        eng22 = "you wouldn't have " + viparticiple[rand] + arrayEng;
                        sp3 = "él no hubiera " + vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he would not have " + viparticiple[rand] + arrayEng;
                        eng32 = "he wouldn't have " + viparticiple[rand] + arrayEng;
                        sp4 = "ella no hubiera " + vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she would not have " + viparticiple[rand] + arrayEng;
                        eng42 = "she wouldn't have " + viparticiple[rand] + arrayEng;
                        sp5 = "eso no hubiera " + vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it would not have " + viparticiple[rand] + arrayEng;
                        eng52 = "it wouldn't have " + viparticiple[rand] + arrayEng;
                        sp6 = "ellos no hubieran " + vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they would not have  " + viparticiple[rand] + arrayEng;
                        eng62 = "they wouldn't have  " + viparticiple[rand] + arrayEng;
                        sp7 = "nosotros no habríamos "  + vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we would not have  " + viparticiple[rand] + arrayEng;
                        eng72 = "we wouldn't have  " + viparticiple[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenWouldPerfCont2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo hubiera estado " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I would have been " + vib3cont[rand] + arrayEng;
                        sp2 = "tú hubieras estado " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you would have been " + vib3cont[rand] + arrayEng;
                        sp3 = "él hubiera estado " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he would have been " + vib3cont[rand] + arrayEng;
                        sp4 = "ella hubiera estado " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she would have been " + vib3cont[rand] + arrayEng;
                        sp5 = "eso hubiera estado " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it would have been " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos hubieran estado " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they would have been " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros hubiésemos estado " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we would have been " + vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no hubiera estado " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I wouldn't have been " + vib3cont[rand] + arrayEng;
                        sp2 = "tú no hubieras estado  " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you wouldn't have been " + vib3cont[rand] + arrayEng;
                        sp3 = "él no hubiera estado   " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he wouldn't have been " + vib3cont[rand] + arrayEng;
                        sp4 = "ella no hubiera estado   " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she wouldn't have been " + vib3cont[rand] + arrayEng;
                        sp5 = "eso no hubiera estado   " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it wouldn't have been " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos no habran estado " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they wouldn't have been " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no hubiésemos estado " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we wouldn't have been " + vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023

    //COULD
    public void GenCouldSimp2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo podría " + vibesp[rand] + arrayEsp;
                        eng1 = "I could " + vib[rand] + arrayEng;
                        sp2 = "tú podrías " + vibesp[rand] + arrayEsp;
                        eng2 = "you could " + vib[rand] + arrayEng;
                        sp3 = "él podría " + vibesp[rand] + arrayEsp;
                        eng3 = "he could " + vib[rand] + arrayEng;
                        sp4 = "ella podría " + vibesp[rand] + arrayEsp;
                        eng4 = "she could " + vib[rand] + arrayEng;
                        sp5 = "eso podría " + vibesp[rand] + arrayEsp;
                        eng5 = "it could " + vib[rand] + arrayEng;
                        sp6 = "ellos podrían " + vibesp[rand] + arrayEsp;
                        eng6 = "they could " + vib[rand] + arrayEng;
                        sp7 = "nosotros podríamos " + vibesp[rand] + arrayEsp;
                        eng7 = "we could " + vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo " + "no podría " + vibesp[rand] + arrayEsp;
                        eng1 = "I " + "couldn't " + vib[rand] + arrayEng;
                        sp2 = "tú " + "no podrías " + vibesp[rand] + arrayEsp;
                        eng2 = "you " + "couldn't " + vib[rand] + arrayEng;
                        sp3 = "él " + "no podría " + vibesp[rand] + arrayEsp;
                        eng3 = "he " + "couldn't " + vib[rand] + arrayEng;
                        sp4 = "ella " + "no podría " + vibesp[rand] + arrayEsp;
                        eng4 = "she " + "couldn't " + vib[rand] + arrayEng;
                        sp5 = "eso " + "no podría " + vibesp[rand] + arrayEsp;
                        eng5 = "it " + "couldn't " + vib[rand] + arrayEng;
                        sp6 = "ellos " + "no podrían " + vibesp[rand] + arrayEsp;
                        eng6 = "they " + "couldn't " + vib[rand] + arrayEng;
                        sp7 = "nosotros " + "no podríamos " + vibesp[rand] + arrayEsp;
                        eng7 = "we " + "couldn't " + vib[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenCouldCont2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo podría estar " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I could be " + vib3cont[rand] + arrayEng;
                        eng12 = "I could be " + vib3cont[rand] + arrayEng;
                        sp2 = "tú podrías estar " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you could be " + vib3cont[rand] + arrayEng;
                        eng22 = "you could be " + vib3cont[rand] + arrayEng;
                        sp3 = "él podría estar " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he could be " + vib3cont[rand] + arrayEng;
                        eng32 = "he could be " + vib3cont[rand] + arrayEng;
                        sp4 = "ella podría estar " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she could be " + vib3cont[rand] + arrayEng;
                        eng42 = "she could be " + vib3cont[rand] + arrayEng;
                        sp5 = "eso podría estar " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it could be " + vib3cont[rand] + arrayEng;
                        eng52 = "it could be " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos podrían estar " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they could be " + vib3cont[rand] + arrayEng;
                        eng62 = "they could be " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros podríamos estar " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we could be " + vib3cont[rand] + arrayEng;
                        eng72 = "we could be " + vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no podría estar " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I could not be " + vib3cont[rand] + arrayEng;
                        eng12 = "I couldn't be " + vib3cont[rand] + arrayEng;
                        sp2 = "tú no podrías estar " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you could not be " + vib3cont[rand] + arrayEng;
                        eng22 = "you couldn't be " + vib3cont[rand] + arrayEng;
                        sp3 = "él no podría estar " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he could not be " + vib3cont[rand] + arrayEng;
                        eng32 = "he couldn't be " + vib3cont[rand] + arrayEng;
                        sp4 = "ella no podría estar " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she could not be " + vib3cont[rand] + arrayEng;
                        eng42 = "she couldn't be " + vib3cont[rand] + arrayEng;
                        sp5 = "eso no podría estar " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it could not be " + vib3cont[rand] + arrayEng;
                        eng52 = "it couldn't be " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos no podrían estar " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they could not be  " + vib3cont[rand] + arrayEng;
                        eng62 = "they couldn't be  " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no podríamos estar " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we could not be  " + vib3cont[rand] + arrayEng;
                        eng72 = "we couldn't be  " + vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenCouldPerf2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo pudiese haber " + vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I could have " + viparticiple[rand] + arrayEng;
                        eng12 = "I could have " + viparticiple[rand] + arrayEng;
                        sp2 = "tú pudieses haber " + vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you could have " + viparticiple[rand] + arrayEng;
                        eng22 = "you could have " + viparticiple[rand] + arrayEng;
                        sp3 = "él pudiese haber " + vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he could have " + viparticiple[rand] + arrayEng;
                        eng32 = "he could have  " + viparticiple[rand] + arrayEng;
                        sp4 = "ella pudiese haber " + vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she could have " + viparticiple[rand] + arrayEng;
                        eng42 = "she could have  " + viparticiple[rand] + arrayEng;
                        sp5 = "eso pudiese haber " + vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it could have " + viparticiple[rand] + arrayEng;
                        eng52 = "it could have  " + viparticiple[rand] + arrayEng;
                        sp6 = "ellos pudiesen haber " + vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they could have " + viparticiple[rand] + arrayEng;
                        eng62 = "they could have " + viparticiple[rand] + arrayEng;
                        sp7 = "nosotros pudiesemos haber "  + vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we could have " + viparticiple[rand] + arrayEng;
                        eng72 = "we could have " + viparticiple[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no pudiese haber " + vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I could not have " + viparticiple[rand] + arrayEng;
                        eng12 = "I couldn't have " + viparticiple[rand] + arrayEng;
                        sp2 = "tú no pudieses haber " + vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you could not have " + viparticiple[rand] + arrayEng;
                        eng22 = "you couldn't have " + viparticiple[rand] + arrayEng;
                        sp3 = "él no pudiese haber " + vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he could not have " + viparticiple[rand] + arrayEng;
                        eng32 = "he couldn't have " + viparticiple[rand] + arrayEng;
                        sp4 = "ella no pudiese haber " + vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she could not have " + viparticiple[rand] + arrayEng;
                        eng42 = "she couldn't have " + viparticiple[rand] + arrayEng;
                        sp5 = "eso no pudiese haber " + vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it could not have " + viparticiple[rand] + arrayEng;
                        eng52 = "it couldn't have " + viparticiple[rand] + arrayEng;
                        sp6 = "ellos no pudiesen haber " + vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they could not have  " + viparticiple[rand] + arrayEng;
                        eng62 = "they couldn't have  " + viparticiple[rand] + arrayEng;
                        sp7 = "nosotros no pudiesemos haber "  + vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we could not have  " + viparticiple[rand] + arrayEng;
                        eng72 = "we couldn't have  " + viparticiple[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenCouldPerfCont2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo podría haber estado " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I could have been " + vib3cont[rand] + arrayEng;
                        sp2 = "tú podrías haber estado " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you could have been " + vib3cont[rand] + arrayEng;
                        sp3 = "él podría haber estado " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he could have been " + vib3cont[rand] + arrayEng;
                        sp4 = "ella podría haber estado " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she could have been " + vib3cont[rand] + arrayEng;
                        sp5 = "eso podría haber estado " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it could have been " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos podrían haber estado " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they could have been " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros podríamos haber estado " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we could have been " + vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no podría haber estado " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I couldn't have been " + vib3cont[rand] + arrayEng;
                        sp2 = "tú no podrías haber estado  " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you couldn't have been " + vib3cont[rand] + arrayEng;
                        sp3 = "él no podría haber estado   " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he couldn't have been " + vib3cont[rand] + arrayEng;
                        sp4 = "ella no podría haber estado   " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she couldn't have been " + vib3cont[rand] + arrayEng;
                        sp5 = "eso no podría haber estado   " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it couldn't have been " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos no habran estado " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they couldn't have been " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no podríamos haber estado " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we couldn't have been " + vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Might
    public void GenMightSimp2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá " + vib1s[rand] + arrayEsp;
                        eng1 = "I might " + vib[rand] + arrayEng;
                        sp2 = "tú quizá " + vib2s[rand] + arrayEsp;
                        eng2 = "you might " + vib[rand] + arrayEng;
                        sp3 = "él quizá " + vib3s[rand] + arrayEsp;
                        eng3 = "he might " + vib[rand] + arrayEng;
                        sp4 = "ella quizá " + vib3s[rand] + arrayEsp;
                        eng4 = "she might " + vib[rand] + arrayEng;
                        sp5 = "eso quizá " + vib3s[rand] + arrayEsp;
                        eng5 = "it might " + vib[rand] + arrayEng;
                        sp6 = "ellos quizá " + vib4s[rand] + arrayEsp;
                        eng6 = "they might " + vib[rand] + arrayEng;
                        sp7 = "nosotros quizá " + vib5s[rand] + arrayEsp;
                        eng7 = "we might " + vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo " + "quizá no " + vib1s[rand] + arrayEsp;
                        eng1 = "I " + "might not  " + vib[rand] + arrayEng;
                        sp2 = "tú " + "quizá no " + vib2s[rand] + arrayEsp;
                        eng2 = "you " + "might not  " + vib[rand] + arrayEng;
                        sp3 = "él " + "quizá no " + vib3s[rand] + arrayEsp;
                        eng3 = "he " + "might not  " + vib[rand] + arrayEng;
                        sp4 = "ella " + "quizá no " + vib3s[rand] + arrayEsp;
                        eng4 = "she " + "might not  " + vib[rand] + arrayEng;
                        sp5 = "eso " + "quizá no " + vib3s[rand] + arrayEsp;
                        eng5 = "it " + "might not  " + vib[rand] + arrayEng;
                        sp6 = "ellos " + "quizá no " + vib4s[rand] + arrayEsp;
                        eng6 = "they " + "might not  " + vib[rand] + arrayEng;
                        sp7 = "nosotros " + "quizá no " + vib5s[rand] + arrayEsp;
                        eng7 = "we " + "might not  " + vib[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenMightCont2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá esté " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I might be " + vib3cont[rand] + arrayEng;
                        eng12 = "I might be " + vib3cont[rand] + arrayEng;
                        sp2 = "tú quizá estés " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you might be " + vib3cont[rand] + arrayEng;
                        eng22 = "you might be " + vib3cont[rand] + arrayEng;
                        sp3 = "él quizá esté " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he might be " + vib3cont[rand] + arrayEng;
                        eng32 = "he might be " + vib3cont[rand] + arrayEng;
                        sp4 = "ella quizá esté " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she might be " + vib3cont[rand] + arrayEng;
                        eng42 = "she might be " + vib3cont[rand] + arrayEng;
                        sp5 = "eso quizá esté " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it might be " + vib3cont[rand] + arrayEng;
                        eng52 = "it might be " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos quizá estén " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they might be " + vib3cont[rand] + arrayEng;
                        eng62 = "they might be " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros quizá estémos " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we might be " + vib3cont[rand] + arrayEng;
                        eng72 = "we might be " + vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no quizá esté " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I might not be " + vib3cont[rand] + arrayEng;
                        eng12 = "I mightn't be " + vib3cont[rand] + arrayEng;
                        sp2 = "tú no quizá estés " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you might not be " + vib3cont[rand] + arrayEng;
                        eng22 = "you mightn't be " + vib3cont[rand] + arrayEng;
                        sp3 = "él no quizá esté " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he might not be " + vib3cont[rand] + arrayEng;
                        eng32 = "he mightn't be " + vib3cont[rand] + arrayEng;
                        sp4 = "ella no quizá esté " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she might not be " + vib3cont[rand] + arrayEng;
                        eng42 = "she mightn't be " + vib3cont[rand] + arrayEng;
                        sp5 = "eso no quizá esté " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it might not be " + vib3cont[rand] + arrayEng;
                        eng52 = "it mightn't be " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos no quizá estén " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they might not be  " + vib3cont[rand] + arrayEng;
                        eng62 = "they mightn't be  " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no quizá estémos " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we might not be  " + vib3cont[rand] + arrayEng;
                        eng72 = "we mightn't be  " + vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenMightPerf2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá haya " + vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I might have " + viparticiple[rand] + arrayEng;
                        eng12 = "I might have " + viparticiple[rand] + arrayEng;
                        sp2 = "tú quizá hayas " + vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you might have " + viparticiple[rand] + arrayEng;
                        eng22 = "you might have " + viparticiple[rand] + arrayEng;
                        sp3 = "él quizá haya " + vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he might have " + viparticiple[rand] + arrayEng;
                        eng32 = "he might have  " + viparticiple[rand] + arrayEng;
                        sp4 = "ella quizá haya " + vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she might have " + viparticiple[rand] + arrayEng;
                        eng42 = "she might have  " + viparticiple[rand] + arrayEng;
                        sp5 = "eso quizá haya " + vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it might have " + viparticiple[rand] + arrayEng;
                        eng52 = "it might have  " + viparticiple[rand] + arrayEng;
                        sp6 = "ellos quizá hayan " + vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they might have " + viparticiple[rand] + arrayEng;
                        eng62 = "they might have " + viparticiple[rand] + arrayEng;
                        sp7 = "nosotros quizá hayamos "  + vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we might have " + viparticiple[rand] + arrayEng;
                        eng72 = "we might have " + viparticiple[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no quizá haya " + vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I might not have " + viparticiple[rand] + arrayEng;
                        eng12 = "I mightn't have " + viparticiple[rand] + arrayEng;
                        sp2 = "tú no quizá hayas " + vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you might not have " + viparticiple[rand] + arrayEng;
                        eng22 = "you mightn't have " + viparticiple[rand] + arrayEng;
                        sp3 = "él no quizá haya " + vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he might not have " + viparticiple[rand] + arrayEng;
                        eng32 = "he mightn't have " + viparticiple[rand] + arrayEng;
                        sp4 = "ella no quizá haya " + vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she might not have " + viparticiple[rand] + arrayEng;
                        eng42 = "she mightn't have " + viparticiple[rand] + arrayEng;
                        sp5 = "eso no quizá haya " + vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it might not have " + viparticiple[rand] + arrayEng;
                        eng52 = "it mightn't have " + viparticiple[rand] + arrayEng;
                        sp6 = "ellos no quizá hayan " + vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they might not have  " + viparticiple[rand] + arrayEng;
                        eng62 = "they mightn't have  " + viparticiple[rand] + arrayEng;
                        sp7 = "nosotros no quizá hayamos "  + vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we might not have  " + viparticiple[rand] + arrayEng;
                        eng72 = "we mightn't have  " + viparticiple[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenMightPerfCont2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá haya estado " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I might have been " + vib3cont[rand] + arrayEng;
                        sp2 = "tú quizá hayas estado " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you might have been " + vib3cont[rand] + arrayEng;
                        sp3 = "él quizá haya estado " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he might have been " + vib3cont[rand] + arrayEng;
                        sp4 = "ella quizá haya estado " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she might have been " + vib3cont[rand] + arrayEng;
                        sp5 = "eso quizá haya estado " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it might have been " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos quizá hayan estado " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they might have been " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros quizá hayamos estado " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we might have been " + vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo quizá no haya estado " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I might not have been " + vib3cont[rand] + arrayEng;
                        sp2 = "tú quizá no hayas estado  " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you might not have been " + vib3cont[rand] + arrayEng;
                        sp3 = "él quizá no haya estado   " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he might not have been " + vib3cont[rand] + arrayEng;
                        sp4 = "ella quizá no haya estado   " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she might not have been " + vib3cont[rand] + arrayEng;
                        sp5 = "eso quizá no haya estado   " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it might not have been " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos no habran estado " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they might not have been " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros quizá no hayamos estado " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we might not have been " + vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023

    //SHOULD
    public void GenShouldSimp2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería " + vibesp[rand] + arrayEsp;
                        eng1 = "I should " + vib[rand] + arrayEng;
                        sp2 = "tú deberías " + vibesp[rand] + arrayEsp;
                        eng2 = "you should " + vib[rand] + arrayEng;
                        sp3 = "él debería " + vibesp[rand] + arrayEsp;
                        eng3 = "he should " + vib[rand] + arrayEng;
                        sp4 = "ella debería " + vibesp[rand] + arrayEsp;
                        eng4 = "she should " + vib[rand] + arrayEng;
                        sp5 = "eso debería " + vibesp[rand] + arrayEsp;
                        eng5 = "it should " + vib[rand] + arrayEng;
                        sp6 = "ellos deberían " + vibesp[rand] + arrayEsp;
                        eng6 = "they should " + vib[rand] + arrayEng;
                        sp7 = "nosotros deberíamos " + vibesp[rand] + arrayEsp;
                        eng7 = "we should " + vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo " + "no debería " + vibesp[rand] + arrayEsp;
                        eng1 = "I " + "shouldn't " + vib[rand] + arrayEng;
                        sp2 = "tú " + "no deberías " + vibesp[rand] + arrayEsp;
                        eng2 = "you " + "shouldn't " + vib[rand] + arrayEng;
                        sp3 = "él " + "no debería " + vibesp[rand] + arrayEsp;
                        eng3 = "he " + "shouldn't " + vib[rand]+ arrayEng;
                        sp4 = "ella " + "no debería " + vibesp[rand] + arrayEsp;
                        eng4 = "she " + "shouldn't " + vib[rand] + arrayEng;
                        sp5 = "eso " + "no debería " + vibesp[rand] + arrayEsp;
                        eng5 = "it " + "shouldn't " + vib[rand]+ arrayEng;
                        sp6 = "ellos " + "no deberían " + vibesp[rand] + arrayEsp;
                        eng6 = "they " + "shouldn't " + vib[rand] + arrayEng;
                        sp7 = "nosotros " + "no deberíamos " + vibesp[rand] + arrayEsp;
                        eng7 = "we " + "shouldn't " + vib[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenShouldCont2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería estar " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I should be " + vib3cont[rand] + arrayEng;
                        eng12 = "I should be " + vib3cont[rand] + arrayEng;
                        sp2 = "tú deberías estar " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you should be " + vib3cont[rand] + arrayEng;
                        eng22 = "you should be " + vib3cont[rand] + arrayEng;
                        sp3 = "él debería estar " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he should be " + vib3cont[rand] + arrayEng;
                        eng32 = "he should be " + vib3cont[rand] + arrayEng;
                        sp4 = "ella debería estar " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she should be " + vib3cont[rand] + arrayEng;
                        eng42 = "she should be " + vib3cont[rand] + arrayEng;
                        sp5 = "eso debería estar " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it should be " + vib3cont[rand] + arrayEng;
                        eng52 = "it should be " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos deberían estar " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they should be " + vib3cont[rand] + arrayEng;
                        eng62 = "they should be " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros deberíamos estar " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we should be " + vib3cont[rand] + arrayEng;
                        eng72 = "we should be " + vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no debería estar " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I should not be " + vib3cont[rand] + arrayEng;
                        eng12 = "I shouldn't be " + vib3cont[rand] + arrayEng;
                        sp2 = "tú no deberías estar " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you should not be " + vib3cont[rand] + arrayEng;
                        eng22 = "you shouldn't be " + vib3cont[rand] + arrayEng;
                        sp3 = "él no debería estar " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he should not be " + vib3cont[rand] + arrayEng;
                        eng32 = "he shouldn't be " + vib3cont[rand] + arrayEng;
                        sp4 = "ella no debería estar " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she should not be " + vib3cont[rand] + arrayEng;
                        eng42 = "she shouldn't be " + vib3cont[rand] + arrayEng;
                        sp5 = "eso no debería estar " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it should not be " + vib3cont[rand] + arrayEng;
                        eng52 = "it shouldn't be " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos no deberían estar " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they should not be  " + vib3cont[rand] + arrayEng;
                        eng62 = "they shouldn't be  " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no deberíamos estar " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we should not be  " + vib3cont[rand] + arrayEng;
                        eng72 = "we shouldn't be  " + vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenShouldPerf2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería haber " + vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I should have " + viparticiple[rand] + arrayEng;
                        eng12 = "I should have " + viparticiple[rand] + arrayEng;
                        sp2 = "tú deberías haber " + vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you should have " + viparticiple[rand] + arrayEng;
                        eng22 = "you should have " + viparticiple[rand] + arrayEng;
                        sp3 = "él debería haber " + vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he should have " + viparticiple[rand] + arrayEng;
                        eng32 = "he should have  " + viparticiple[rand] + arrayEng;
                        sp4 = "ella debería haber " + vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she should have " + viparticiple[rand] + arrayEng;
                        eng42 = "she should have  " + viparticiple[rand] + arrayEng;
                        sp5 = "eso debería haber " + vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it should have " + viparticiple[rand] + arrayEng;
                        eng52 = "it should have  " + viparticiple[rand] + arrayEng;
                        sp6 = "ellos deberían haber " + vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they should have " + viparticiple[rand] + arrayEng;
                        eng62 = "they should have " + viparticiple[rand] + arrayEng;
                        sp7 = "nosotros deberíamos haber "  + vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we should have " + viparticiple[rand] + arrayEng;
                        eng72 = "we should have " + viparticiple[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no debería haber " + vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I should not have " + viparticiple[rand] + arrayEng;
                        eng12 = "I shouldn't have " + viparticiple[rand] + arrayEng;
                        sp2 = "tú no deberías haber " + vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you should not have " + viparticiple[rand] + arrayEng;
                        eng22 = "you shouldn't have " + viparticiple[rand] + arrayEng;
                        sp3 = "él no debería haber " + vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he should not have " + viparticiple[rand] + arrayEng;
                        eng32 = "he shouldn't have " + viparticiple[rand] + arrayEng;
                        sp4 = "ella no debería haber " + vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she should not have " + viparticiple[rand] + arrayEng;
                        eng42 = "she shouldn't have " + viparticiple[rand] + arrayEng;
                        sp5 = "eso no debería haber " + vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it should not have " + viparticiple[rand] + arrayEng;
                        eng52 = "it shouldn't have " + viparticiple[rand] + arrayEng;
                        sp6 = "ellos no deberían haber " + vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they should not have  " + viparticiple[rand] + arrayEng;
                        eng62 = "they shouldn't have  " + viparticiple[rand] + arrayEng;
                        sp7 = "nosotros no deberíamos haber "  + vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we should not have  " + viparticiple[rand] + arrayEng;
                        eng72 = "we shouldn't have  " + viparticiple[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenShouldPerfCont2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería haber estado " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I should have been " + vib3cont[rand] + arrayEng;
                        sp2 = "tú deberías haber estado " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you should have been " + vib3cont[rand] + arrayEng;
                        sp3 = "él debería haber estado " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he should have been " + vib3cont[rand] + arrayEng;
                        sp4 = "ella debería haber estado " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she should have been " + vib3cont[rand] + arrayEng;
                        sp5 = "eso debería haber estado " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it should have been " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos deberían haber estado " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they should have been " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros deberíamos haber estado " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we should have been " + vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no debería haber estado " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I shouldn't have been " + vib3cont[rand] + arrayEng;
                        sp2 = "tú no deberías haber estado " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you shouldn't have been " + vib3cont[rand] + arrayEng;
                        sp3 = "él no debería haber estado " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he shouldn't have been " + vib3cont[rand] + arrayEng;
                        sp4 = "ella no debería haber estado " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she shouldn't have been " + vib3cont[rand] + arrayEng;
                        sp5 = "eso no debería haber estado " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it shouldn't have been " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos no deberían haber estado " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they shouldn't have been " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no deberíamos haber estado " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we shouldn't have been " + vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Can
    public void GenCanSimp2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo puedo " + vibesp[rand] + arrayEsp;
                        eng1 = "I can " + vib[rand] + arrayEng;
                        sp2 = "tú puedes " + vibesp[rand] + arrayEsp;
                        eng2 = "you can " + vib[rand] + arrayEng;
                        sp3 = "él puede " + vibesp[rand] + arrayEsp;
                        eng3 = "he can " + vib[rand] + arrayEng;
                        sp4 = "ella puede " + vibesp[rand] + arrayEsp;
                        eng4 = "she can " + vib[rand] + arrayEng;
                        sp5 = "eso puede " + vibesp[rand] + arrayEsp;
                        eng5 = "it can " + vib[rand] + arrayEng;
                        sp6 = "ellos pueden " + vibesp[rand] + arrayEsp;
                        eng6 = "they can " + vib[rand] + arrayEng;
                        sp7 = "nosotros podemos " + vibesp[rand] + arrayEsp;
                        eng7 = "we can " + vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo " + "no puedo " + vibesp[rand] + arrayEsp;
                        eng1 = "I " + "can't " + vib[rand] + arrayEng;
                        sp2 = "tú " + "no puedes " + vibesp[rand] + arrayEsp;
                        eng2 = "you " + "can't " + vib[rand] + arrayEng;
                        sp3 = "él " + "no puede " + vibesp[rand] + arrayEsp;
                        eng3 = "he " + "can't " + vib[rand] + arrayEng;
                        sp4 = "ella " + "no puede " + vibesp[rand] + arrayEsp;
                        eng4 = "she " + "can't " + vib[rand] + arrayEng;
                        sp5 = "eso " + "no puede " + vibesp[rand] + arrayEsp;
                        eng5 = "it " + "can't " + vib[rand] + arrayEng;
                        sp6 = "ellos " + "no pueden " + vibesp[rand] + arrayEsp;
                        eng6 = "they " + "can't " + vib[rand] + arrayEng;
                        sp7 = "nosotros " + "no podemos " + vibesp[rand] + arrayEsp;
                        eng7 = "we " + "can't " + vib[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenCanCont2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo puedo estar " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I can be " + vib3cont[rand] + arrayEng;
                        eng12 = "I can be " + vib3cont[rand] + arrayEng;
                        sp2 = "tú puedes estar " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you can be " + vib3cont[rand] + arrayEng;
                        eng22 = "you can be " + vib3cont[rand] + arrayEng;
                        sp3 = "él puede estar " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he can be " + vib3cont[rand] + arrayEng;
                        eng32 = "he can be " + vib3cont[rand] + arrayEng;
                        sp4 = "ella puede estar " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she can be " + vib3cont[rand] + arrayEng;
                        eng42 = "she can be " + vib3cont[rand] + arrayEng;
                        sp5 = "eso puede estar " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it can be " + vib3cont[rand] + arrayEng;
                        eng52 = "it can be " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos pueden estar " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they can be " + vib3cont[rand] + arrayEng;
                        eng62 = "they can be " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros podemos estar " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we can be " + vib3cont[rand] + arrayEng;
                        eng72 = "we can be " + vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no puedo estar " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I can not be " + vib3cont[rand] + arrayEng;
                        eng12 = "I can't be " + vib3cont[rand] + arrayEng;
                        sp2 = "tú no puedes estar " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you can not be " + vib3cont[rand] + arrayEng;
                        eng22 = "you can't be " + vib3cont[rand] + arrayEng;
                        sp3 = "él no puede estar " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he can not be " + vib3cont[rand] + arrayEng;
                        eng32 = "he can't be " + vib3cont[rand] + arrayEng;
                        sp4 = "ella no puede estar " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she can not be " + vib3cont[rand] + arrayEng;
                        eng42 = "she can't be " + vib3cont[rand] + arrayEng;
                        sp5 = "eso no puede estar " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it can not be " + vib3cont[rand] + arrayEng;
                        eng52 = "it can't be " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos no pueden estar " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they can not be  " + vib3cont[rand] + arrayEng;
                        eng62 = "they can't be  " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no podemos estar " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we can not be  " + vib3cont[rand] + arrayEng;
                        eng72 = "we can't be  " + vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    //Must
    public void GenMustSimp2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debo " + vibesp[rand] + arrayEsp;
                        eng1 = "I must " + vib[rand] + arrayEng;
                        sp2 = "tú debés " + vibesp[rand] + arrayEsp;
                        eng2 = "you must " + vib[rand] + arrayEng;
                        sp3 = "él debe " + vibesp[rand] + arrayEsp;
                        eng3 = "he must " + vib[rand] + arrayEng;
                        sp4 = "ella debe " + vibesp[rand] + arrayEsp;
                        eng4 = "she must " + vib[rand] + arrayEng;
                        sp5 = "eso debe " + vibesp[rand] + arrayEsp;
                        eng5 = "it must " + vib[rand] + arrayEng;
                        sp6 = "ellos deben " + vibesp[rand] + arrayEsp;
                        eng6 = "they must " + vib[rand] + arrayEng;
                        sp7 = "nosotros debemos " + vibesp[rand] + arrayEsp;
                        eng7 = "we must " + vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo " + "no debo " + vibesp[rand] + arrayEsp;
                        eng1 = "I " + "mustn't " + vib[rand] + arrayEng;
                        sp2 = "tú " + "no debés " + vibesp[rand] + arrayEsp;
                        eng2 = "you " + "mustn't " + vib[rand] + arrayEng;
                        sp3 = "él " + "no debe " + vibesp[rand] + arrayEsp;
                        eng3 = "he " + "mustn't " + vib3p[rand] + arrayEng;
                        sp4 = "ella " + "no debe " + vibesp[rand] + arrayEsp;
                        eng4 = "she " + "mustn't " + vib3p[rand] + arrayEng;
                        sp5 = "eso " + "no debe " + vibesp[rand] + arrayEsp;
                        eng5 = "it " + "mustn't " + vib3p[rand] + arrayEng;
                        sp6 = "ellos " + "no deben " + vibesp[rand] + arrayEsp;
                        eng6 = "they " + "mustn't " + vib[rand] + arrayEng;
                        sp7 = "nosotros " + "no debemos " + vibesp[rand] + arrayEsp;
                        eng7 = "we " + "mustn't " + vib[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenMustCont2() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debo estar " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I must be " + vib3cont[rand] + arrayEng;
                        eng12 = "I must be " + vib3cont[rand] + arrayEng;
                        sp2 = "tú debes estar " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you must be " + vib3cont[rand] + arrayEng;
                        eng22 = "you must be " + vib3cont[rand] + arrayEng;
                        sp3 = "él debe estar " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he must be " + vib3cont[rand] + arrayEng;
                        eng32 = "he must be " + vib3cont[rand] + arrayEng;
                        sp4 = "ella debe estar " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she must be " + vib3cont[rand] + arrayEng;
                        eng42 = "she must be " + vib3cont[rand] + arrayEng;
                        sp5 = "eso debe estar " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it must be " + vib3cont[rand] + arrayEng;
                        eng52 = "it must be " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos deben estar " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they must be " + vib3cont[rand] + arrayEng;
                        eng62 = "they must be " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros debemos estar " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we must be " + vib3cont[rand] + arrayEng;
                        eng72 = "we must be " + vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no debo estar " + vib3contesp[rand] + arrayEsp;
                        eng1 = "I must not be " + vib3cont[rand] + arrayEng;
                        eng12 = "I mustn't be " + vib3cont[rand] + arrayEng;
                        sp2 = "tú no debes estar " + vib3contesp[rand] + arrayEsp;
                        eng2 = "you must not be " + vib3cont[rand] + arrayEng;
                        eng22 = "you mustn't be " + vib3cont[rand] + arrayEng;
                        sp3 = "él no debe estar " + vib3contesp[rand] + arrayEsp;
                        eng3 = "he must not be " + vib3cont[rand] + arrayEng;
                        eng32 = "he mustn't be " + vib3cont[rand] + arrayEng;
                        sp4 = "ella no debe estar " + vib3contesp[rand] + arrayEsp;
                        eng4 = "she must not be " + vib3cont[rand] + arrayEng;
                        eng42 = "she mustn't be " + vib3cont[rand] + arrayEng;
                        sp5 = "eso no debe estar " + vib3contesp[rand] + arrayEsp;
                        eng5 = "it must not be " + vib3cont[rand] + arrayEng;
                        eng52 = "it mustn't be " + vib3cont[rand] + arrayEng;
                        sp6 = "ellos no deben estar " + vib3contesp[rand] + arrayEsp;
                        eng6 = "they must not be  " + vib3cont[rand] + arrayEng;
                        eng62 = "they mustn't be  " + vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no debemos estar " + vib3contesp[rand] + arrayEsp;
                        eng7 = "we must not be  " + vib3cont[rand] + arrayEng;
                        eng72 = "we mustn't be  " + vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023

    public void GenAbleTo2(){
        gen = new Generator3();
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + "soy capaz de " + vibesp[rand] + arrayEsp;
                        eng1 = "I am " + "able to " + vib[rand] + arrayEng;
                        eng12 = "I'm " + "able to " + vib[rand] + arrayEng;

                        sp2 = "tú " + "eres capaz de " + vibesp[rand] + arrayEsp;
                        eng2 = "you are " + "able to " + vib[rand] + arrayEng;
                        eng22 = "you're " + "able to " + vib[rand] + arrayEng;

                        sp3 = "él " + "es capaz de " + vibesp[rand] + arrayEsp;
                        eng3 = "he is " + "able to " + vib[rand] + arrayEng;
                        eng32 = "he's " + "able to " + vib[rand] + arrayEng;

                        sp4 = "ella " + "es capaz de " + vibesp[rand] + arrayEsp;
                        eng4 = "she is " + "able to " + vib[rand] + arrayEng;
                        eng42 = "she's " + "able to " + vib[rand] + arrayEng;

                        sp5 = "eso " + "es capaz de " + vibesp[rand] + arrayEsp;
                        eng5 = "it is " + "able to " + vib[rand] + arrayEng;
                        eng52 = "it's " + "able to " + vib[rand] + arrayEng;

                        sp6 = "ellos " + "son capaz de " + vibesp[rand] + arrayEsp;
                        eng6 = "they are " + "able to " + vib[rand] + arrayEng;
                        eng62 = "they're " + "able to " + vib[rand] + arrayEng;

                        sp7 = "nosotros " + "somos capaz de " + vibesp[rand] + arrayEsp;
                        eng7 = "we are " + "able to " + vib[rand] + arrayEng;
                        eng72 = "we're " + "able to " + vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no " + "soy capaz de " + vibesp[rand] + arrayEsp;
                        eng1 = "I am not " + "able to " + vib[rand] + arrayEng;
                        eng12 = "I'm not " + "able to " + vib[rand] + arrayEng;

                        sp2 = "tú no " + "eres capaz de " + vibesp[rand] + arrayEsp;
                        eng2 = "you are not " + "able to " + vib[rand] + arrayEng;
                        eng22 = "you're not " + "able to " + vib[rand] + arrayEng;

                        sp3 = "él no " + "es capaz de " + vibesp[rand] + arrayEsp;
                        eng3 = "he is not " + "able to " + vib[rand] + arrayEng;
                        eng32 = "he's not " + "able to " + vib[rand] + arrayEng;

                        sp4 = "ella no " + "es capaz de " + vibesp[rand] + arrayEsp;
                        eng4 = "she is not " + "able to " + vib[rand] + arrayEng;
                        eng42 = "she's not " + "able to " + vib[rand] + arrayEng;

                        sp5 = "eso no " + "es capaz de " + vibesp[rand] + arrayEsp;
                        eng5 = "it is not " + "able to " + vib[rand] + arrayEng;
                        eng52 = "it's not " + "able to " + vib[rand] + arrayEng;

                        sp6 = "ellos no " + "son capaz de " + vibesp[rand] + arrayEsp;
                        eng6 = "they are not " + "able to " + vib[rand] + arrayEng;
                        eng62 = "they're not " + "able to " + vib[rand] + arrayEng;

                        sp7 = "nosotros no " + "somos capaz de " + vibesp[rand] + arrayEsp;
                        eng7 = "we are not " + "able to " + vib[rand] + arrayEng;
                        eng72 = "we're not " + "able to " + vib[rand] + arrayEng;
                        break;

                }
            }
        }
    }//PD FEB 2023

    //for to dificultad 3 SOlO INTRANS
    public void forSubTo2() {

        Pasts3 pas = new Pasts3();
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int rn1 = (int) (Math.random() * 6);
        int rn2 = (int) (Math.random() * 5);
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

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = ftsjs[0] + pas.vis1[rand] + arrayEsp;
                        eng1 = ftsj[0] + vib[rand] + arrayEng;
                        sp2 = ftsjs[1] + pas.vis2[rand] + arrayEsp;
                        eng2 = ftsj[1] + vib[rand] + arrayEng;
                        sp3 = ftsjs[2] + pas.vis3[rand] + arrayEsp;
                        eng3 = ftsj[2] + vib[rand] + arrayEng;
                        sp4 = ftsjs[3] + pas.vis3[rand] + arrayEsp;
                        eng4 = ftsj[3] + vib[rand] + arrayEng;
                        sp5 = ftsjs[4] + pas.vis3[rand] + arrayEsp;
                        eng5 = ftsj[4] + vib[rand] + arrayEng;
                        sp6 = ftsjs[5] + pas.vis4[rand] + arrayEsp;
                        eng6 = ftsj[5] + vib[rand] + arrayEng;
                        sp7 = ftsjs[6] + pas.vis5[rand] + arrayEsp;
                        eng7 = ftsj[6] + vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = ftsjsn[0] + pas.vis1[rand] + arrayEsp;
                        eng1 = ftsjn[0] + vib[rand] + arrayEng;
                        sp2 = ftsjsn[1] + pas.vis2[rand] + arrayEsp;
                        eng2 = ftsjn[1] + vib[rand] + arrayEng;
                        sp3 = ftsjsn[2] + pas.vis3[rand] + arrayEsp;
                        eng3 = ftsjn[2] + vib[rand] + arrayEng;
                        sp4 = ftsjsn[3] + pas.vis3[rand] + arrayEsp;
                        eng4 = ftsjn[3] + vib[rand] + arrayEng;
                        sp5 = ftsjsn[4] + pas.vis3[rand] + arrayEsp;
                        eng5 = ftsjn[4] + vib[rand] + arrayEng;
                        sp6 = ftsjsn[5] + pas.vis4[rand] + arrayEsp;
                        eng6 = ftsjn[5] + vib[rand] + arrayEng;
                        sp7 = ftsjsn[6] + pas.vis5[rand] + arrayEsp;
                        eng7 = ftsjn[6] + vib[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023

    //want to dificultad 3 SOLO INTRANS
    public void wantyouto2() {

        Pasts3 pas = new Pasts3();
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int rn1 = (int) (Math.random() * 6);
        int rn2 = (int) (Math.random() * 5);
        int neg = (int) (Math.random() * 2);


        //want to subject
        String wtsj[] = {"I want ", "you want ", "he wants ", "she wants ", "it wants ", "we want ", "they want "};
        //want to subject negative
        String wtsjn[] = {"I don't want ", "you don't want ", "he doesn't want ", "she doesn't want ", "it doesn't want "
                , "we don't want ", "they don't want "};
        //sujetos want to en sp
        String wtsjs[] = {"yo quiero ", "tú quieres ", "él quiere ", "ella quiere ", "eso quiere ", "nosotros queremos ", "ellos quieren "};
        //sujetos want to en sp negativo
        String wtsjsn[] = {"yo no quiero ", "tú no quieres ", "él no quiere ", "eso no quiere ", "ella no quiere ", "nosotros no queremos ", "ellos no quieren "};

        String wtobj1[] = {"you to " + vib[rand], "him to " + vib[rand], "her to " + vib[rand],
                "it to " + vib[rand], "us to " + vib[rand], "them to " + vib[rand]};
        String wtobj2[] = {"me to " + vib[rand], "him to " + vib[rand], "her to " + vib[rand],
                "it to " + vib[rand], "us to " + vib[rand], "them to " + vib[rand]};
        String wtobj3[] = {"you to " + vib[rand], "me to " + vib[rand], "her to " + vib[rand],
                "it to " + vib[rand], "us to " + vib[rand], "them to " + vib[rand]};
        String wtobj4[] = {"you to " + vib[rand], "him to " + vib[rand], "me to " + vib[rand],
                "it to " + vib[rand], "us to " + vib[rand], "them to " + vib[rand]};
        String wtobj5[] = {"you to " + vib[rand], "him to " + vib[rand], "her to " + vib[rand],
                "me to " + vib[rand], "us to " + vib[rand], "them to " + vib[rand]};
        String wtobj6[] = {"you to " + vib[rand], "him to " + vib[rand], "her to " + vib[rand],
                "it to " + vib[rand], "them to " + vib[rand]};
        String wtobj7[] = {"you to " + vib[rand], "him to " + vib[rand], "her to " + vib[rand],
                "it to " + vib[rand], "us to " + vib[rand], "me to " + vib[rand]};

        // objetos wt en sp
        String wtobj1s[] = {"que tú " + pas.vis2[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis5[rand], "que ellos " + pas.vis4[rand]};
        String wtobj2s[] = {"que yo " + pas.vis1[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis3[rand], "que ellos " + pas.vis3[rand]};
        String wtobj3s[] = {"que tú " + pas.vis2[rand], "que yo " + pas.vis1[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis5[rand], "que ellos " + pas.vis4[rand]};
        String wtobj4s[] = {"que tú " + pas.vis2[rand], "que él " + pas.vis3[rand], "que yo " + pas.vis1[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis5[rand], "que ellos " + pas.vis4[rand]};
        String wtobj5s[] = {"que tú " + pas.vis2[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que yo " + pas.vis1[rand], "que nosotros " + pas.vis5[rand], "que ellos " + pas.vis4[rand]};
        String wtobj6s[] = {"que tú " + pas.vis2[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que ellos " + pas.vis4[rand]};
        String wtobj7s[] = {"que tú " + pas.vis2[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis5[rand], "que yo " + pas.vis1[rand]};

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = wtsjs[0] + wtobj1s[rn1] + arrayEsp;
                        eng1 = wtsj[0] + wtobj1[rn1] + arrayEng;
                        sp2 = wtsjs[1] + wtobj2s[rn1] + arrayEsp;
                        eng2 = wtsj[1] + wtobj2[rn1] + arrayEng;
                        sp3 = wtsjs[2] + wtobj3s[rn1] + arrayEsp;
                        eng3 = wtsj[2] + wtobj3[rn1] + arrayEng;
                        sp4 = wtsjs[3] + wtobj4s[rn1] + arrayEsp;
                        eng4 = wtsj[3] + wtobj4[rn1] + arrayEng;
                        sp5 = wtsjs[4] + wtobj5s[rn1] + arrayEsp;
                        eng5 = wtsj[4] + wtobj5[rn1] + arrayEng;
                        sp6 = wtsjs[5] + wtobj6s[rn2] + arrayEsp;
                        eng6 = wtsj[5] + wtobj6[rn2] + arrayEng;
                        sp7 = wtsjs[6] + wtobj7s[rn1] + arrayEsp;
                        eng7 = wtsj[6] + wtobj7[rn1] + arrayEng;
                        break;
                    case 1:
                        sp1 = wtsjsn[0] + wtobj1s[rn1] + arrayEsp;
                        eng1 = wtsjn[0] + wtobj1[rn1] + arrayEng;
                        sp2 = wtsjsn[1] + wtobj2s[rn1] + arrayEsp;
                        eng2 = wtsjn[1] + wtobj2[rn1] + arrayEng;
                        sp3 = wtsjsn[2] + wtobj3s[rn1] + arrayEsp;
                        eng3 = wtsjn[2] + wtobj3[rn1] + arrayEng;
                        sp4 = wtsjsn[3] + wtobj4s[rn1] + arrayEsp;
                        eng4 = wtsjn[3] + wtobj4[rn1] + arrayEng;
                        sp5 = wtsjsn[4] + wtobj5s[rn1] + arrayEsp;
                        eng5 = wtsjn[4] + wtobj5[rn1] + arrayEng;
                        sp6 = wtsjsn[5] + wtobj6s[rn2] + arrayEsp;
                        eng6 = wtsjn[5] + wtobj6[rn2] + arrayEng;
                        sp7 = wtsjsn[6] + wtobj7s[rn1] + arrayEsp;
                        eng7 = wtsjn[6] + wtobj7[rn1] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023

    /*public void intporprep() {
        
        randstarter();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        switch (temp) {
            case "dance ":
                switch (neg) {
                    case 0:
                        sp1 = bailarSpecial[rand3][rand4]+"yo " + vib1[rand] ;
                        eng1 = "I " + vib[rand] + danceSpecial[rand3][rand4];
                        sp2 =bailarSpecial[rand3][rand4]+ "tú " + vib2[rand] ;
                        eng2 = "you " + vib[rand] + danceSpecial[rand3][rand4];
                        sp3 =bailarSpecial[rand3][rand4]+ "él " + vib4[rand] ;
                        eng3 = "he " + vib3p[rand] + danceSpecial[rand3][rand4];
                        sp4 =bailarSpecial[rand3][rand4]+ "ella " + vib4[rand] ;
                        eng4 = "she " + vib3p[rand] + danceSpecial[rand3][rand4];
                        sp5 = bailarSpecial[rand3][rand4]+"eso " + vib4[rand] ;
                        eng5 = "it " + vib3p[rand] + danceSpecial[rand3][rand4];
                        sp6 =bailarSpecial[rand3][rand4]+ "ellos " + vib4[rand] ;
                        eng6 = "they " + vib[rand] + danceSpecial[rand3][rand4];
                        sp7 =bailarSpecial[rand3][rand4]+ "nosotros " + vibnos[rand];
                        eng7 = "we " + vib[rand] + danceSpecial[rand3][rand4];
                        break;
                    case 1:
                        sp1 =bailarSpecial[rand3][rand4]+ "yo " + "no " + vib1[rand] ;
                        eng1 = "I " + "don't " + vib[rand] + danceSpecial[rand3][rand4];
                        sp2 =bailarSpecial[rand3][rand4]+ "tú " + "no " + vib2[rand] ;
                        eng2 = "you " + "don't " + vib[rand] + danceSpecial[rand3][rand4];
                        sp3 = bailarSpecial[rand3][rand4]+"él " + "no " + vib4[rand] ;
                        eng3 = "he " + "doesn't " + vib[rand] + danceSpecial[rand3][rand4];
                        sp4 = bailarSpecial[rand3][rand4]+"ella " + "no " + vib4[rand] ;
                        eng4 = "she " + "doesn't " + vib[rand] + danceSpecial[rand3][rand4];
                        sp5 =bailarSpecial[rand3][rand4]+ "eso " + "no " + vib4[rand] ;
                        eng5 = "it " + "doesn't " + vib[rand] + danceSpecial[rand3][rand4];
                        sp6 =bailarSpecial[rand3][rand4]+ "ellos " + "no " + vib4[rand] ;
                        eng6 = "they " + "don't " + vib[rand] + danceSpecial[rand3][rand4];
                        sp7 = bailarSpecial[rand3][rand4]+"nosotros " + "no " + vibnos[rand];
                        eng7 = "we " + "don't " + vib[rand] + danceSpecial[rand3][rand4];
                        break;
                }
                break;
            case "live ":
                switch (neg) {
                    case 0:
                        sp1 = vivirSpecial[r5][r6]+"yo " + vib1[rand] ;
                        eng1 = "I " + vib[rand] + liveSpecial[r5][r6];
                        sp2 =vivirSpecial[r5][r6]+ "tú " + vib2[rand] ;
                        eng2 = "you " + vib[rand] + liveSpecial[r5][r6];
                        sp3 =vivirSpecial[r5][r6]+ "él " + vib4[rand] ;
                        eng3 = "he " + vib3p[rand] + liveSpecial[r5][r6];
                        sp4 =vivirSpecial[r5][r6]+ "ella " + vib4[rand] ;
                        eng4 = "she " + vib3p[rand] + liveSpecial[r5][r6];
                        sp5 = vivirSpecial[r5][r6]+"eso " + vib4[rand] ;
                        eng5 = "it " + vib3p[rand] + liveSpecial[r5][r6];
                        sp6 =vivirSpecial[r5][r6]+ "ellos " + vib4[rand] ;
                        eng6 = "they " + vib[rand] + liveSpecial[r5][r6];
                        sp7 =vivirSpecial[r5][r6]+ "nosotros " + vibnos[rand];
                        eng7 = "we " + vib[rand] + liveSpecial[r5][r6];
                        break;
                    case 1:
                        sp1 =vivirSpecial[r5][r6]+ "yo " + "no " + vib1[rand] ;
                        eng1 = "I " + "don't " + vib[rand] + liveSpecial[r5][r6];
                        sp2 =vivirSpecial[r5][r6]+ "tú " + "no " + vib2[rand] ;
                        eng2 = "you " + "don't " + vib[rand] + liveSpecial[r5][r6];
                        sp3 = vivirSpecial[r5][r6]+"él " + "no " + vib4[rand] ;
                        eng3 = "he " + "doesn't " + vib[rand] + liveSpecial[r5][r6];
                        sp4 = vivirSpecial[r5][r6]+"ella " + "no " + vib4[rand] ;
                        eng4 = "she " + "doesn't " + vib[rand] + liveSpecial[r5][r6];
                        sp5 =vivirSpecial[r5][r6]+ "eso " + "no " + vib4[rand] ;
                        eng5 = "it " + "doesn't " + vib[rand] + liveSpecial[r5][r6];
                        sp6 =vivirSpecial[r5][r6]+ "ellos " + "no " + vib4[rand] ;
                        eng6 = "they " + "don't " + vib[rand] + liveSpecial[r5][r6];
                        sp7 = vivirSpecial[r5][r6]+"nosotros " + "no " + vibnos[rand];
                        eng7 = "we " + "don't " + vib[rand] + liveSpecial[r5][r6];
                        break;
                } // last one
                break;
            case "stop ":
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1[rand] + detenerSpecial[r7][r8];
                        eng1 = "I " + vib[rand] + stopSpecial[r7][r8];

                        sp2 = "tú " + vib2[rand] + detenerSpecial[r7][r8];
                        eng2 = "you " + vib[rand] + stopSpecial[r7][r8];

                        sp3 = "él " + vib4[rand] + detenerSpecial[r7][r8];
                        eng3 = "he " + vib3p[rand] + stopSpecial[r7][r8];

                        sp4 = "ella " + vib4[rand] + detenerSpecial[r7][r8];
                        eng4 = "she " + vib3p[rand] + stopSpecial[r7][r8];

                        sp5 = "eso " + vib4[rand] + detenerSpecial[r7][r8];
                        eng5 = "it " + vib3p[rand] + stopSpecial[r7][r8];

                        sp6 = "ellos " + vib4[rand] + detenerSpecial[r7][r8];
                        eng6 = "they " + vib[rand] + stopSpecial[r7][r8];

                        sp7 = "nosotros " + vibnos[rand] + detenerSpecial[r7][r8];
                        eng7 = "we " + vib[rand] + stopSpecial[r7][r8];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + detenerSpecial[r7][r8];
                        eng1 = "I " + "don't " + vib[rand] + stopSpecial[r7][r8];

                        sp2 = "tú " + "no " + vib2[rand] + detenerSpecial[r7][r8];
                        eng2 = "you " + "don't " + vib[rand] + stopSpecial[r7][r8];
                        sp3 = "él " + "no " + vib4[rand] + detenerSpecial[r7][r8];
                        eng3 = "he " + "doesn't " + vib[rand] + stopSpecial[r7][r8];
                        sp4 = "ella " + "no " + vib4[rand] + detenerSpecial[r7][r8];
                        eng4 = "she " + "doesn't " + vib[rand] + stopSpecial[r7][r8];

                        sp5 = "eso " + "no " + vib4[rand] + detenerSpecial[r7][r8];
                        eng5 = "it " + "doesn't " + vib[rand] + stopSpecial[r7][r8];

                        sp6 = "ellos " + "no " + vib4[rand] + detenerSpecial[r7][r8];
                        eng6 = "they " + "don't " + vib[rand] + stopSpecial[r7][r8];

                        sp7 = "nosotros " + "no " + vibnos[rand] + detenerSpecial[r7][r8];
                        eng7 = "we " + "don't " + vib[rand] + stopSpecial[r7][r8];
                        break;
                }
                break;
            case "fail ":
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1[rand] + fallarSpecial[r9][r10];
                        eng1 = "I " + vib[rand] + failSpecial[r9][r10];

                        sp2 = "tú " + vib2[rand] + fallarSpecial[r9][r10];
                        eng2 = "you " + vib[rand] + failSpecial[r9][r10];

                        sp3 = "él " + vib4[rand] + fallarSpecial[r9][r10];
                        eng3 = "he " + vib3p[rand] + failSpecial[r9][r10];
                        sp4 = "ella " + vib4[rand] + fallarSpecial[r9][r10];
                        eng4 = "she " + vib3p[rand] + failSpecial[r9][r10];
                        sp5 = "eso " + vib4[rand] + fallarSpecial[r9][r10];
                        eng5 = "it " + vib3p[rand] + failSpecial[r9][r10];
                        sp6 = "ellos " + vib4[rand] + fallarSpecial[r9][r10];
                        eng6 = "they " + vib[rand] + failSpecial[r9][r10];
                        sp7 = "nosotros " + vibnos[rand] + fallarSpecial[r9][r10];
                        eng7 = "we " + vib[rand] + failSpecial[r9][r10];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + fallarSpecial[r9][r10];
                        eng1 = "I " + "don't " + vib[rand] + failSpecial[r9][r10];
                        sp2 = "tú " + "no " + vib2[rand] + fallarSpecial[r9][r10];
                        eng2 = "you " + "don't " + vib[rand] + failSpecial[r9][r10];
                        sp3 = "él " + "no " + vib4[rand] + fallarSpecial[r9][r10];
                        eng3 = "he " + "doesn't " + vib[rand] + failSpecial[r9][r10];
                        sp4 = "ella " + "no " + vib4[rand] + fallarSpecial[r9][r10];
                        eng4 = "she " + "doesn't " + vib[rand] + failSpecial[r9][r10];
                        sp5 = "eso " + "no " + vib4[rand] + fallarSpecial[r9][r10];
                        eng5 = "it " + "doesn't " + vib[rand] + failSpecial[r9][r10];
                        sp6 = "ellos " + "no " + vib4[rand] + fallarSpecial[r9][r10];
                        eng6 = "they " + "don't " + vib[rand] + failSpecial[r9][r10];
                        sp7 = "nosotros " + "no " + vibnos[rand] + fallarSpecial[r9][r10];
                        eng7 = "we " + "don't " + vib[rand] + failSpecial[r9][r10];
                        break;
                }
                break;
            case "worry ":
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1[rand] + preocuparseSpecial[r11][r12];
                        eng1 = "I " + vib[rand] + worrySpecial[r11][r12];

                        sp2 = "tú " + vib2[rand] + preocuparseSpecial[r11][r12];
                        eng2 = "you " + vib[rand] + worrySpecial[r11][r12];
                        sp3 = "él " + vib4[rand] + preocuparseSpecial[r11][r12];
                        eng3 = "he " + vib3p[rand] + worrySpecial[r11][r12];
                        sp4 = "ella " + vib4[rand] + preocuparseSpecial[r11][r12];
                        eng4 = "she " + vib3p[rand] + worrySpecial[r11][r12];
                        sp5 = "eso " + vib4[rand] + preocuparseSpecial[r11][r12];
                        eng5 = "it " + vib3p[rand] + worrySpecial[r11][r12];
                        sp6 = "ellos " + vib4[rand] + preocuparseSpecial[r11][r12];
                        eng6 = "they " + vib[rand] + worrySpecial[r11][r12];
                        sp7 = "nosotros " + vibnos[rand] + preocuparseSpecial[r11][r12];
                        eng7 = "we " + vib[rand] + worrySpecial[r11][r12];
                        break;

                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + preocuparseSpecial[r11][r12];
                        eng1 = "I " + "don't " + vib[rand] + worrySpecial[r11][r12];
                        sp2 = "tú " + "no " + vib2[rand] + preocuparseSpecial[r11][r12];
                        eng2 = "you " + "don't " + vib[rand] + worrySpecial[r11][r12];
                        sp3 = "él " + "no " + vib4[rand] + preocuparseSpecial[r11][r12];
                        eng3 = "he " + "doesn't " + vib[rand] + worrySpecial[r11][r12];
                        sp4 = "ella " + "no " + vib4[rand] + preocuparseSpecial[r11][r12];
                        eng4 = "she " + "doesn't " + vib[rand] + worrySpecial[r11][r12];
                        sp5 = "eso " + "no " + vib4[rand] + preocuparseSpecial[r11][r12];
                        eng5 = "it " + "doesn't " + vib[rand] + worrySpecial[r11][r12];
                        sp6 = "ellos " + "no " + vib4[rand] + preocuparseSpecial[r11][r12];
                        eng6 = "they " + "don't " + vib[rand] + worrySpecial[r11][r12];
                        sp7 = "nosotros " + "no " + vibnos[rand] + preocuparseSpecial[r11][r12];
                        eng7 = "we " + "don't " + vib[rand] + worrySpecial[r11][r12];
                        break;
                }
                break;
            case "travel ":
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1[rand] + viajarSpecial[r13][r14];
                        eng1 = "I " + vib[rand] + travelSpecial[r13][r14];
                        sp2 = "tú " + vib2[rand] + viajarSpecial[r13][r14];
                        eng2 = "you " + vib[rand] + travelSpecial[r13][r14];
                        sp3 = "él " + vib4[rand] + viajarSpecial[r13][r14];
                        eng3 = "he " + vib3p[rand] + travelSpecial[r13][r14];
                        sp4 = "ella " + vib4[rand] + viajarSpecial[r13][r14];
                        eng4 = "she " + vib3p[rand] + travelSpecial[r13][r14];

                        sp5 = "eso " + vib4[rand] + viajarSpecial[r13][r14];
                        eng5 = "it " + vib3p[rand] + travelSpecial[r13][r14];
                        sp6 = "ellos " + vib4[rand] + viajarSpecial[r13][r14];
                        eng6 = "they " + vib[rand] + travelSpecial[r13][r14];
                        sp7 = "nosotros " + vibnos[rand] + viajarSpecial[r13][r14];
                        eng7 = "we " + vib[rand] + travelSpecial[r13][r14];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + viajarSpecial[r13][r14];
                        eng1 = "I " + "don't " + vib[rand] + travelSpecial[r13][r14];
                        sp2 = "tú " + "no " + vib2[rand] + viajarSpecial[r13][r14];
                        eng2 = "you " + "don't " + vib[rand] + travelSpecial[r13][r14];

                        sp3 = "él " + "no " + vib4[rand] + viajarSpecial[r13][r14];
                        eng3 = "he " + "doesn't " + vib[rand] + travelSpecial[r13][r14];
                        sp4 = "ella " + "no " + vib4[rand] + viajarSpecial[r13][r14];
                        eng4 = "she " + "doesn't " + vib[rand] + travelSpecial[r13][r14];
                        sp5 = "eso " + "no " + vib4[rand] + viajarSpecial[r13][r14];
                        eng5 = "it " + "doesn't " + vib[rand] + travelSpecial[r13][r14];
                        sp6 = "ellos " + "no " + vib4[rand] + viajarSpecial[r13][r14];
                        eng6 = "they " + "don't " + vib[rand] + travelSpecial[r13][r14];
                        sp7 = "nosotros " + "no " + vibnos[rand] + viajarSpecial[r13][r14];
                        eng7 = "we " + "don't " + vib[rand] + travelSpecial[r13][r14];
                        break;
                }
                break;
            case "return ":
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1[rand] + devolverSpecial[r15][r16];
                        eng1 = "I " + vib[rand] + worrySpecial[r15][r16];
                        sp2 = "tú " + vib2[rand] + devolverSpecial[r15][r16];
                        eng2 = "you " + vib[rand] + worrySpecial[r15][r16];
                        sp3 = "él " + vib4[rand] + devolverSpecial[r15][r16];
                        eng3 = "he " + vib3p[rand] + worrySpecial[r15][r16];
                        sp4 = "ella " + vib4[rand] + devolverSpecial[r15][r16];
                        eng4 = "she " + vib3p[rand] + worrySpecial[r15][r16];
                        sp5 = "eso " + vib4[rand] + devolverSpecial[r15][r16];
                        eng5 = "it " + vib3p[rand] + worrySpecial[r15][r16];
                        sp6 = "ellos " + vib4[rand] + devolverSpecial[r15][r16];
                        eng6 = "they " + vib[rand] + worrySpecial[r15][r16];
                        sp7 = "nosotros " + vibnos[rand] + devolverSpecial[r15][r16];
                        eng7 = "we " + vib[rand] + worrySpecial[r15][r16];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + devolverSpecial[r15][r16];
                        eng1 = "I " + "don't " + vib[rand] + worrySpecial[r15][r16];
                        sp2 = "tú " + "no " + vib2[rand] + devolverSpecial[r15][r16];
                        eng2 = "you " + "don't " + vib[rand] + worrySpecial[r15][r16];
                        sp3 = "él " + "no " + vib4[rand] + devolverSpecial[r15][r16];
                        eng3 = "he " + "doesn't " + vib[rand] + worrySpecial[r15][r16];
                        sp4 = "ella " + "no " + vib4[rand] + devolverSpecial[r15][r16];
                        eng4 = "she " + "doesn't " + vib[rand] + worrySpecial[r15][r16];
                        sp5 = "eso " + "no " + vib4[rand] + devolverSpecial[r15][r16];
                        eng5 = "it " + "doesn't " + vib[rand] + worrySpecial[r15][r16];
                        sp6 = "ellos " + "no " + vib4[rand] + devolverSpecial[r15][r16];
                        eng6 = "they " + "don't " + vib[rand] + worrySpecial[r15][r16];
                        sp7 = "nosotros " + "no " + vibnos[rand] + devolverSpecial[r15][r16];
                        eng7 = "we " + "don't " + vib[rand] + worrySpecial[r15][r16];
                        break;
                }
                break;
            case "walk ":
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1[rand] + caminarSpecial[r17][r18];
                        eng1 = "I " + vib[rand] + returnSpecial[r17][r18];
                        sp2 = "tú " + vib2[rand] + caminarSpecial[r17][r18];
                        eng2 = "you " + vib[rand] + returnSpecial[r17][r18];
                        sp3 = "él " + vib4[rand] + caminarSpecial[r17][r18];
                        eng3 = "he " + vib3p[rand] + returnSpecial[r17][r18];
                        sp4 = "ella " + vib4[rand] + caminarSpecial[r17][r18];
                        eng4 = "she " + vib3p[rand] + returnSpecial[r17][r18];
                        sp5 = "eso " + vib4[rand] + caminarSpecial[r17][r18];
                        eng5 = "it " + vib3p[rand] + returnSpecial[r17][r18];
                        sp6 = "ellos " + vib4[rand] + caminarSpecial[r17][r18];
                        eng6 = "they " + vib[rand] + returnSpecial[r17][r18];
                        sp7 = "nosotros " + vibnos[rand] + caminarSpecial[r17][r18];
                        eng7 = "we " + vib[rand] + returnSpecial[r17][r18];
                        break;

                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + caminarSpecial[r17][r18];
                        eng1 = "I " + "don't " + vib[rand] + returnSpecial[r17][r18];
                        sp2 = "tú " + "no " + vib2[rand] + caminarSpecial[r17][r18];
                        eng2 = "you " + "don't " + vib[rand] + returnSpecial[r17][r18];
                        sp3 = "él " + "no " + vib4[rand] + caminarSpecial[r17][r18];
                        eng3 = "he " + "doesn't " + vib[rand] + returnSpecial[r17][r18];
                        sp4 = "ella " + "no " + vib4[rand] + caminarSpecial[r17][r18];
                        eng4 = "she " + "doesn't " + vib[rand] + returnSpecial[r17][r18];
                        sp5 = "eso " + "no " + vib4[rand] + caminarSpecial[r17][r18];
                        eng5 = "it " + "doesn't " + vib[rand] + returnSpecial[r17][r18];
                        sp6 = "ellos " + "no " + vib4[rand] + caminarSpecial[r17][r18];
                        sp6 = "they " + "don't " + vib[rand] + returnSpecial[r17][r18];
                        sp7 = "nosotros " + "no " + vibnos[rand] + caminarSpecial[r17][r18];
                        eng7 = "we " + "don't " + vib[rand] + returnSpecial[r17][r18];
                        break;
                }
                break;
            case "move ":
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1[rand] + walkSpecial[r19][r20];
                        eng1 = "I " + vib[rand] + runSpecial[r19][r20];
                        sp2 = "tú " + vib2[rand] + walkSpecial[r19][r20];
                        eng2 = "you " + vib[rand] + runSpecial[r19][r20];
                        sp3 = "él " + vib4[rand] + walkSpecial[r19][r20];
                        eng3 = "he " + vib3p[rand] + runSpecial[r19][r20];
                        sp4 = "ella " + vib4[rand] + walkSpecial[r19][r20];
                        eng4 = "she " + vib3p[rand] + runSpecial[r19][r20];
                        sp5 = "eso " + vib4[rand] + walkSpecial[r19][r20];
                        eng5 = "it " + vib3p[rand] + runSpecial[r19][r20];
                        sp6 = "ellos " + vib4[rand] + walkSpecial[r19][r20];
                        eng6 = "they " + vib[rand] + runSpecial[r19][r20];
                        sp7 = "nosotros " + vibnos[rand] + walkSpecial[r19][r20];
                        eng7 = "we " + vib[rand] + runSpecial[r19][r20];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + walkSpecial[r19][r20];
                        eng1 = "I " + "don't " + vib[rand] + runSpecial[r19][r20];
                        sp2 = "tú " + "no " + vib2[rand] + walkSpecial[r19][r20];
                        eng2 = "you " + "don't " + vib[rand] + runSpecial[r19][r20];
                        sp3 = "él " + "no " + vib4[rand] + walkSpecial[r19][r20];
                        eng3 = "he " + "doesn't " + vib[rand] + runSpecial[r19][r20];

                        sp4 = "ella " + "no " + vib4[rand] + walkSpecial[r19][r20];
                        eng4 = "she " + "doesn't " + vib[rand] + runSpecial[r19][r20];
                        sp5 = "eso " + "no " + vib4[rand] + walkSpecial[r19][r20];
                        eng5 = "it " + "doesn't " + vib[rand] + runSpecial[r19][r20];

                        sp6 = "ellos " + "no " + vib4[rand] + walkSpecial[r19][r20];
                        eng6 = "they " + "don't " + vib[rand] + runSpecial[r19][r20];

                        sp7 = "nosotros " + "no " + vibnos[rand] + walkSpecial[r19][r20];
                        eng7 = "we " + "don't " + vib[rand] + runSpecial[r19][r20];
                        break;
                }
                break;
            case "live ":
                switch (neg) {
                    case 0:

                        sp1 = "yo " + vib1[rand] + vivspecial[r21][r22];
                        eng1 = "I " + vib[rand] + livespecial[r21][r22];
                        sp2 = "tú " + vib2[rand] + vivspecial[r21][r22];
                        eng2 = "you " + vib[rand] + livespecial[r21][r22];
                        sp3 = "él " + vib4[rand] + vivspecial[r21][r22];
                        eng3 = "he " + vib3p[rand] + livespecial[r21][r22];
                        sp4 = "ella " + vib4[rand] + vivspecial[r21][r22];
                        eng4 = "she " + vib3p[rand] + livespecial[r21][r22];
                        sp5 = "eso " + vib4[rand] + vivspecial[r21][r22];
                        eng5 = "it " + vib3p[rand] + livespecial[r21][r22];
                        sp6 = "ellos " + vib4[rand] + vivspecial[r21][r22];
                        sp6 = "they " + vib[rand] + livespecial[r21][r22];
                        sp7 = "nosotros " + vibnos[rand] + vivspecial[r21][r22];
                        eng7 = "we " + vib[rand] + livespecial[r21][r22];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + vivspecial[r21][r22];
                        eng1 = "I " + "don't " + vib[rand] + livespecial[r21][r22];
                        sp2 = "tú " + "no " + vib2[rand] + vivspecial[r21][r22];
                        eng2 = "you " + "don't " + vib[rand] + livespecial[r21][r22];
                        sp3 = "él " + "no " + vib4[rand] + vivspecial[r21][r22];
                        eng3 = "he " + "doesn't " + vib[rand] + livespecial[r21][r22];
                        sp4 = "ella " + "no " + vib4[rand] + vivspecial[r21][r22];
                        eng4 = "she " + "doesn't " + vib[rand] + livespecial[r21][r22];
                        sp5 = "eso " + "no " + vib4[rand] + vivspecial[r21][r22];
                        eng5 = "it " + "doesn't " + vib[rand] + livespecial[r21][r22];
                        sp6 = "ellos " + "no " + vib4[rand] + vivspecial[r21][r22];
                        eng6 = "they " + "don't " + vib[rand] + livespecial[r21][r22];
                        sp7 = "nosotros " + "no " + vibnos[rand] + vivspecial[r21][r22];
                        eng7 = "we " + "don't " + vib[rand] + livespecial[r21][r22];
                        break;
                }
                break;
            case "sit ":
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1[rand] + sentspecial[r23][r24];
                        eng1 = "I " + vib[rand] + sitspecial[r23][r24];
                        sp2 = "tú " + vib2[rand] + sentspecial[r23][r24];
                        eng2 = "you " + vib[rand] + sitspecial[r23][r24];
                        sp3 = "él " + vib4[rand] + sentspecial[r23][r24];
                        eng3 = "he " + vib3p[rand] + sitspecial[r23][r24];
                        sp4 = "ella " + vib4[rand] + sentspecial[r23][r24];
                        eng4 = "she " + vib3p[rand] + sitspecial[r23][r24];
                        sp5 = "eso " + vib4[rand] + sentspecial[r23][r24];
                        eng5 = "it " + vib3p[rand] + sitspecial[r23][r24];
                        sp6 = "ellos " + vib4[rand] + sentspecial[r23][r24];
                        eng6 = "they " + vib[rand] + sitspecial[r23][r24];
                        sp7 = "nosotros " + vibnos[rand] + sentspecial[r23][r24];
                        eng7 = "we " + vib[rand] + sitspecial[r23][r24];
                        break;

                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + sentspecial[r23][r24];
                        eng1 = "I " + "don't " + vib[rand] + sitspecial[r23][r24];
                        sp2 = "tú " + "no " + vib2[rand] + sentspecial[r23][r24];
                        eng2 = "you " + "don't " + vib[rand] + sitspecial[r23][r24];
                        sp3 = "él " + "no " + vib4[rand] + sentspecial[r23][r24];
                        eng3 = "he " + "doesn't " + vib[rand] + sitspecial[r23][r24];
                        sp4 = "ella " + "no " + vib4[rand] + sentspecial[r23][r24];
                        eng4 = "she " + "doesn't " + vib[rand] + sitspecial[r23][r24];
                        sp5 = "eso " + "no " + vib4[rand] + sentspecial[r23][r24];
                        eng5 = "it " + "doesn't " + vib[rand] + sitspecial[r23][r24];
                        sp6 = "ellos " + "no " + vib4[rand] + sentspecial[r23][r24];
                        eng6 = "they " + "don't " + vib[rand] + sitspecial[r23][r24];
                        sp7 = "nosotros " + "no " + vibnos[rand] + sentspecial[r23][r24];
                        eng7 = "we " + "don't " + vib[rand] + sitspecial[r23][r24];
                        break;
                }
                break;
            case "stand ":
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1[rand] + parspecial[r25][r26];
                        eng1 = "I " + vib[rand] + standspecial[r25][r26];
                        sp2 = "tú " + vib2[rand] + parspecial[r25][r26];
                        eng2 = "you " + vib[rand] + standspecial[r25][r26];
                        sp3 = "él " + vib4[rand] + parspecial[r25][r26];
                        eng3 = "he " + vib3p[rand] + standspecial[r25][r26];
                        sp4 = "ella " + vib4[rand] + parspecial[r25][r26];
                        eng4 = "she " + vib3p[rand] + standspecial[r25][r26];
                        sp5 = "eso " + vib4[rand] + parspecial[r25][r26];
                        eng5 = "it " + vib3p[rand] + standspecial[r25][r26];
                        sp6 = "ellos " + vib4[rand] + parspecial[r25][r26];
                        eng6 = "they " + vib[rand] + standspecial[r25][r26];
                        sp7 = "nosotros " + vibnos[rand] + parspecial[r25][r26];
                        eng7 = "we " + vib[rand] + standspecial[r25][r26];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + parspecial[r25][r26];
                        eng1 = "I " + "don't " + vib[rand] + standspecial[r25][r26];
                        sp2 = "tú " + "no " + vib2[rand] + parspecial[r25][r26];
                        eng2 = "you " + "don't " + vib[rand] + standspecial[r25][r26];
                        sp3 = "él " + "no " + vib4[rand] + parspecial[r25][r26];
                        eng3 = "he " + "doesn't " + vib[rand] + standspecial[r25][r26];
                        sp4 = "ella " + "no " + vib4[rand] + parspecial[r25][r26];
                        eng4 = "she " + "doesn't " + vib[rand] + standspecial[r25][r26];
                        sp5 = "eso " + "no " + vib4[rand] + parspecial[r25][r26];
                        eng5 = "it " + "doesn't " + vib[rand] + standspecial[r25][r26];
                        sp6 = "ellos " + "no " + vib4[rand] + parspecial[r25][r26];
                        eng6 = "they " + "don't " + vib[rand] + standspecial[r25][r26];
                        sp7 = "nosotros " + "no " + vibnos[rand] + parspecial[r25][r26];
                        eng7 = "we " + "don't " + vib[rand] + standspecial[r25][r26];
                        break;
                }
                break;
            case "understand ":
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1[rand] + entspecial[r27][r28];
                        eng1 = "I " + vib[rand] + undspecial[r27][r28];
                        sp2 = "tú " + vib2[rand] + entspecial[r27][r28];
                        eng2 = "you " + vib[rand] + undspecial[r27][r28];
                        sp3 = "él " + vib4[rand] + entspecial[r27][r28];
                        eng3 = "he " + vib3p[rand] + undspecial[r27][r28];
                        sp4 = "ella " + vib4[rand] + entspecial[r27][r28];
                        eng4 = "she " + vib3p[rand] + undspecial[r27][r28];
                        sp5 = "eso " + vib4[rand] + entspecial[r27][r28];
                        eng5 = "it " + vib3p[rand] + undspecial[r27][r28];
                        sp6 = "ellos " + vib4[rand] + entspecial[r27][r28];
                        eng6 = "they " + vib[rand] + undspecial[r27][r28];
                        sp7 = "nosotros " + vibnos[rand] + entspecial[r27][r28];
                        eng7 = "we " + vib[rand] + undspecial[r27][r28];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + entspecial[r27][r28];
                        eng1 = "I " + "don't " + vib[rand] + undspecial[r27][r28];
                        sp2 = "tú " + "no " + vib2[rand] + entspecial[r27][r28];
                        eng2 = "you " + "don't " + vib[rand] + undspecial[r27][r28];

                        sp3 = "él " + "no " + vib4[rand] + entspecial[r27][r28];
                        eng3 = "he " + "doesn't " + vib[rand] + undspecial[r27][r28];
                        sp4 = "ella " + "no " + vib4[rand] + entspecial[r27][r28];
                        eng4 = "she " + "doesn't " + vib[rand] + undspecial[r27][r28];
                        sp5 = "eso " + "no " + vib4[rand] + entspecial[r27][r28];
                        eng5 = "it " + "doesn't " + vib[rand] + undspecial[r27][r28];
                        sp6 = "ellos " + "no " + vib4[rand] + entspecial[r27][r28];
                        eng6 = "they " + "don't " + vib[rand] + undspecial[r27][r28];
                        sp7 = "nosotros " + "no " + vibnos[rand] + entspecial[r27][r28];
                        eng7 = "we " + "don't " + vib[rand] + undspecial[r27][r28];
                        break;
                }
                break;
            case "walk ":
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1[rand] + camspecial[r29][r30];
                        eng1 = "I " + vib[rand] + walkspecial[r29][r30];
                        sp2 = "tú " + vib2[rand] + camspecial[r29][r30];
                        eng2 = "you " + vib[rand] + walkspecial[r29][r30];
                        sp3 = "él " + vib4[rand] + camspecial[r29][r30];
                        eng3 = "he " + vib3p[rand] + walkspecial[r29][r30];
                        sp4 = "ella " + vib4[rand] + camspecial[r29][r30];
                        eng4 = "she " + vib3p[rand] + walkspecial[r29][r30];
                        sp5 = "eso " + vib4[rand] + camspecial[r29][r30];
                        eng5 = "it " + vib3p[rand] + walkspecial[r29][r30];
                        sp6 = "ellos " + vib4[rand] + camspecial[r29][r30];
                        eng6 = "they " + vib[rand] + walkspecial[r29][r30];
                        sp7 = "nosotros " + vibnos[rand] + camspecial[r29][r30];
                        eng7 = "we " + vib[rand] + walkspecial[r29][r30];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + camspecial[r29][r30];
                        eng1 = "I " + "don't " + vib[rand] + walkspecial[r29][r30];
                        sp2 = "tú " + "no " + vib2[rand] + camspecial[r29][r30];
                        eng2 = "you " + "don't " + vib[rand] + walkspecial[r29][r30];
                        sp3 = "él " + "no " + vib4[rand] + camspecial[r29][r30];
                        eng3 = "he " + "doesn't " + vib[rand] + walkspecial[r29][r30];
                        sp4 = "ella " + "no " + vib4[rand] + camspecial[r29][r30];
                        eng4 = "she " + "doesn't " + vib[rand] + walkspecial[r29][r30];
                        sp5 = "eso " + "no " + vib4[rand] + camspecial[r29][r30];
                        eng5 = "it " + "doesn't " + vib[rand] + walkspecial[r29][r30];
                        sp6 = "ellos " + "no " + vib4[rand] + camspecial[r29][r30];
                        eng6 = "they " + "don't " + vib[rand] + walkspecial[r29][r30];
                        sp7 = "nosotros " + "no " + vibnos[rand] + camspecial[r29][r30];
                        eng7 = "we " + "don't " + vib[rand] + walkspecial[r29][r30];
                        break;
                }
                break;
            case "grow ":
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1[rand] + crecspecial[r31][r32];
                        eng1 = "I " + vib[rand] + growspecial[r31][r32];
                        sp2 = "tú " + vib2[rand] + crecspecial[r31][r32];
                        eng2 = "you " + vib[rand] + growspecial[r31][r32];
                        sp3 = "él " + vib4[rand] + crecspecial[r31][r32];
                        eng3 = "he " + vib3p[rand] + growspecial[r31][r32];
                        sp4 = "ella " + vib4[rand] + crecspecial[r31][r32];
                        eng4 = "she " + vib3p[rand] + growspecial[r31][r32];
                        sp5 = "eso " + vib4[rand] + crecspecial[r31][r32];
                        eng5 = "it " + vib3p[rand] + growspecial[r31][r32];
                        sp6 = "ellos " + vib4[rand] + crecspecial[r31][r32];
                        eng6 = "they " + vib[rand] + growspecial[r31][r32];
                        sp7 = "nosotros " + vibnos[rand] + crecspecial[r31][r32];
                        eng7 = "we " + vib[rand] + growspecial[r31][r32];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + crecspecial[r31][r32];
                        eng1 = "I " + "don't " + vib[rand] + growspecial[r31][r32];
                        sp2 = "tú " + "no " + vib2[rand] + crecspecial[r31][r32];
                        eng2 = "you " + "don't " + vib[rand] + growspecial[r31][r32];

                        sp3 = "él " + "no " + vib4[rand] + crecspecial[r31][r32];
                        eng3 = "he " + "doesn't " + vib[rand] + growspecial[r31][r32];
                        sp4 = "ella " + "no " + vib4[rand] + crecspecial[r31][r32];
                        eng4 = "she " + "doesn't " + vib[rand] + growspecial[r31][r32];
                        sp5 = "eso " + "no " + vib4[rand] + crecspecial[r31][r32];
                        eng5 = "it " + "doesn't " + vib[rand] + growspecial[r31][r32];
                        sp6 = "ellos " + "no " + vib4[rand] + crecspecial[r31][r32];
                        eng6 = "they " + "don't " + vib[rand] + growspecial[r31][r32];
                        sp7 = "nosotros " + "no " + vibnos[rand] + crecspecial[r31][r32];
                        eng7 = "we " + "don't " + vib[rand] + growspecial[r31][r32];
                        break;
                }
                break;
            case "wait ":
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1[rand] + espspecial[r33][r34];
                        eng1 = "I " + vib[rand] + waitspecial[r33][r34];
                        sp2 = "tú " + vib2[rand] + espspecial[r33][r34];
                        eng2 = "you " + vib[rand] + waitspecial[r33][r34];
                        sp3 = "él " + vib4[rand] + espspecial[r33][r34];
                        eng3 = "he " + vib3p[rand] + waitspecial[r33][r34];
                        sp4 = "ella " + vib4[rand] + espspecial[r33][r34];
                        eng4 = "she " + vib3p[rand] + waitspecial[r33][r34];
                        sp5 = "eso " + vib4[rand] + espspecial[r33][r34];
                        eng5 = "it " + vib3p[rand] + waitspecial[r33][r34];
                        sp6 = "ellos " + vib4[rand] + espspecial[r33][r34];
                        eng6 = "they " + vib[rand] + waitspecial[r33][r34];
                        sp7 = "nosotros " + vibnos[rand] + espspecial[r33][r34];
                        eng7 = "we " + vib[rand] + waitspecial[r33][r34];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + espspecial[r33][r34];
                        eng1 = "I " + "don't " + vib[rand] + waitspecial[r33][r34];
                        sp2 = "tú " + "no " + vib2[rand] + espspecial[r33][r34];
                        eng2 = "you " + "don't " + vib[rand] + waitspecial[r33][r34];
                        sp3 = "él " + "no " + vib4[rand] + espspecial[r33][r34];
                        eng3 = "he " + "doesn't " + vib[rand] + waitspecial[r33][r34];
                        sp4 = "ella " + "no " + vib4[rand] + espspecial[r33][r34];
                        eng4 = "she " + "doesn't " + vib[rand] + waitspecial[r33][r34];
                        sp5 = "eso " + "no " + vib4[rand] + espspecial[r33][r34];
                        eng5 = "it " + "doesn't " + vib[rand] + waitspecial[r33][r34];
                        sp6 = "ellos " + "no " + vib4[rand] + espspecial[r33][r34];
                        eng6 = "they " + "don't " + vib[rand] + waitspecial[r33][r34];
                        sp7 = "nosotros " + "no " + vibnos[rand] + espspecial[r33][r34];
                        eng7 = "we " + "don't " + vib[rand] + waitspecial[r33][r34];
                        break;
                }
                break;
            case "die ":
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1[rand] + morbailarSpecial[r35][r36];
                        eng1 = "I " + vib[rand] + diespecial[r35][r36];
                        sp2 = "tú " + vib2[rand] + morbailarSpecial[r35][r36];
                        eng2 = "you " + vib[rand] + diespecial[r35][r36];
                        sp3 = "él " + vib4[rand] + morbailarSpecial[r35][r36];
                        eng3 = "he " + vib3p[rand] + diespecial[r35][r36];
                        sp4 = "ella " + vib4[rand] + morbailarSpecial[r35][r36];
                        eng4 = "she " + vib3p[rand] + diespecial[r35][r36];
                        sp5 = "eso " + vib4[rand] + morbailarSpecial[r35][r36];
                        eng5 = "it " + vib3p[rand] + diespecial[r35][r36];
                        sp6 = "ellos " + vib4[rand] + morbailarSpecial[r35][r36];
                        eng6 = "they " + vib[rand] + diespecial[r35][r36];
                        sp7 = "nosotros " + vibnos[rand] + morbailarSpecial[r35][r36];
                        eng7 = "we " + vib[rand] + diespecial[r35][r36];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + morbailarSpecial[r35][r36];
                        eng1 = "I " + "don't " + vib[rand] + diespecial[r35][r36];
                        sp2 = "tú " + "no " + vib2[rand] + morbailarSpecial[r35][r36];
                        eng2 = "you " + "don't " + vib[rand] + diespecial[r35][r36];
                        sp3 = "él " + "no " + vib4[rand] + morbailarSpecial[r35][r36];
                        eng3 = "he " + "doesn't " + vib[rand] + diespecial[r35][r36];
                        sp4 = "ella " + "no " + vib4[rand] + morbailarSpecial[r35][r36];
                        eng4 = "she " + "doesn't " + vib[rand] + diespecial[r35][r36];
                        sp5 = "eso " + "no " + vib4[rand] + morbailarSpecial[r35][r36];
                        eng5 = "it " + "doesn't " + vib[rand] + diespecial[r35][r36];
                        sp6 = "ellos " + "no " + vib4[rand] + morbailarSpecial[r35][r36];
                        eng6 = "they " + "don't " + vib[rand] + diespecial[r35][r36];
                        sp7 = "nosotros " + "no " + vibnos[rand] + morbailarSpecial[r35][r36];
                        eng7 = "we " + "don't " + vib[rand] + diespecial[r35][r36];
                        break;
                }
                break;
            case "stay ":
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1[rand] + quedspecial[r37][r38];
                        eng1 = "I " + vib[rand] + stayspecial[r37][r38];
                        sp2 = "tú " + vib2[rand] + quedspecial[r37][r38];
                        eng2 = "you " + vib[rand] + stayspecial[r37][r38];
                        sp3 = "él " + vib4[rand] + quedspecial[r37][r38];
                        eng3 = "he " + vib3p[rand] + stayspecial[r37][r38];
                        sp4 = "ella " + vib4[rand] + quedspecial[r37][r38];
                        eng4 = "she " + vib3p[rand] + stayspecial[r37][r38];
                        sp5 = "eso " + vib4[rand] + quedspecial[r37][r38];
                        eng5 = "it " + vib3p[rand] + stayspecial[r37][r38];
                        sp6 = "ellos " + vib4[rand] + quedspecial[r37][r38];
                        eng6 = "they " + vib[rand] + stayspecial[r37][r38];
                        sp7 = "nosotros " + vibnos[rand] + quedspecial[r37][r38];
                        eng7 = "we " + vib[rand] + stayspecial[r37][r38];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + quedspecial[r37][r38];
                        eng1 = "I " + "don't " + vib[rand] + stayspecial[r37][r38];
                        sp2 = "tú " + "no " + vib2[rand] + quedspecial[r37][r38];
                        eng2 = "you " + "don't " + vib[rand] + stayspecial[r37][r38];
                        sp3 = "él " + "no " + vib4[rand] + quedspecial[r37][r38];
                        eng3 = "he " + "doesn't " + vib[rand] + stayspecial[r37][r38];
                        sp4 = "ella " + "no " + vib4[rand] + quedspecial[r37][r38];
                        eng4 = "she " + "doesn't " + vib[rand] + stayspecial[r37][r38];
                        sp5 = "eso " + "no " + vib4[rand] + quedspecial[r37][r38];
                        eng5 = "it " + "doesn't " + vib[rand] + stayspecial[r37][r38];
                        sp6 = "ellos " + "no " + vib4[rand] + quedspecial[r37][r38];
                        eng6 = "they " + "don't " + vib[rand] + stayspecial[r37][r38];
                        sp7 = "nosotros " + "no " + vibnos[rand] + quedspecial[r37][r38];
                        eng7 = "we " + "don't " + vib[rand] + stayspecial[r37][r38];
                        break;
                }
                break;

        }

    }*/

    //DIFICULTAD 3

    //presentes
    public void GenPresSimp3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + vib[rand] + arrayEng + frequadv[radv];
                        eng12 = "I " + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + vib2[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + vib[rand] + arrayEng + frequadv[radv];
                        eng22 = "you " + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + vib3p[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + vib[rand] + arrayEng + frequadv[radv];
                        eng32 = "he " + vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + vib3p[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + vib[rand] + arrayEng + frequadv[radv];
                        eng42 = "she " + vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + vib3p[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + vib[rand] + arrayEng + frequadv[radv];
                        eng52 = "it " + vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + vib4[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + vib[rand] + arrayEng + frequadv[radv];
                        eng62 = "they " + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + vibnos[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + vib[rand] + arrayEng + frequadv[radv];
                        eng72 = "we " + vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I do not " + vib[rand] + arrayEng + frequadv[radv];
                        eng12 = "I don't " + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + "no " + vib2[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you do not " + vib[rand] + arrayEng + frequadv[radv];
                        eng22 = "you don't " + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no " + vib3p[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he do not " + vib[rand] + arrayEng + frequadv[radv];
                        eng32 = "he don't " + vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no " + vib3p[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she do not " + vib[rand] + arrayEng + frequadv[radv];
                        eng42 = "she don't " + vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no " + vib3p[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it do not " + vib[rand] + arrayEng + frequadv[radv];
                        eng52 = "it don't " + vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + "no " + vib4[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they do not " + vib[rand] + arrayEng + frequadv[radv];
                        eng62 = "they don't " + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + "no " + vibnos[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we do not " + vib[rand] + arrayEng + frequadv[radv];
                        eng72 = "we don't " + vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPresCont3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estoy " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I am " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I'm " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú estás " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you are " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you're " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él está " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he is " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he's " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella está " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she is " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she's " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso está " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it is " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it's " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos están " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they are " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they're " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros estamos " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we are " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we're " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no estoy " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I am not " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I'm not " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no estás " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you are not " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you aren't " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no está " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he is not " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he isn't " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no está " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she is not " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she isn't " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no está " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it is not " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it isn't " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no están " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they are not  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they aren't  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no estamos " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we are not  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we aren't  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPresPerf3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo he " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I've " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú has " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you've " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él ha " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he has " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he's " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella ha " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she has " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she's " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso ha " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it has " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it's " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos han " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they've " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros hemos " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we've " + viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no he " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I have not " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I haven't " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no has " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you have not " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you haven't " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no ha " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he has not " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he hasn't " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no ha " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she has not " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she hasn't " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no ha " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it has not " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it hasn't " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no han " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they have not  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they haven't  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no hemos " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we have not  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we haven't  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenPresPerfCont3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo he estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú has estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él ha estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he has been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella ha estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she has been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso ha estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it has been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos han estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros hemos estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no he estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I haven't been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no has estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you haven't been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no ha estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he hasn't been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no ha estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she hasn't been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no ha estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it hasn't been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no han estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they haven't been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no hemos estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we haven't been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Pasados
    public void GenPastSimp3() {
        Pasts pas = new Pasts();
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 4);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    // 0 - positivo preterito, 1- negativo preterito
                    // 2- positivo imperfecto 3. negativo imperfecto
                    case 0:
                        sp1 = "yo " + pas.vibp1pr[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + pas.vibpast[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + pas.vibp2pr[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + pas.vibpast[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + pas.vibp3pr[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + pas.vibpast[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + pas.vibp3pr[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + pas.vibpast[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + pas.vibp3pr[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + pas.vibpast[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + pas.vibp4pr[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + pas.vibpast[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + pas.vibp5pr[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + pas.vibpast[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + pas.vibp1pr[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + "didn't " + pas.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + "no " + pas.vibp2pr[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + "didn't " + pas.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + "no " + pas.vibp3pr[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + "didn't " + pas.vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + "no " + pas.vibp3pr[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + "didn't " + pas.vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + "no " + pas.vibp3pr[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + "didn't " + pas.vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + "no " + pas.vibp4pr[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + "didn't " + pas.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + "no " + pas.vibp5pr[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + "didn't " + pas.vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 2:
                        sp1 = "yo " + pas.vibp1[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + pas.vibpast[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + pas.vibp2[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + pas.vibpast[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + pas.vibp3[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + pas.vibpast[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + pas.vibp3[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + pas.vibpast[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + pas.vibp3[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + pas.vibpast[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + pas.vibp4[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + pas.vibpast[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + pas.vibp5[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + pas.vibpast[rand] + arrayEng + frequadv[radv];
                        break;
                    case 3:
                        sp1 = "yo " + "no " + pas.vibp1[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + "didn't " + pas.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + "no " + pas.vibp2[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + "didn't " + pas.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + "no " + pas.vibp3[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + "didn't " + pas.vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + "no " + pas.vibp3[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + "didn't " + pas.vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + "no " + pas.vibp3[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + "didn't " + pas.vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + "no " + pas.vibp4[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + "didn't " + pas.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + "no " + pas.vibp5[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + "didn't " + pas.vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPastCont3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estaba " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I was " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I was " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú estabas " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you were " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you were " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él estaba " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he was " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he was " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella estaba " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she was " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she was " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso estaba " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it was " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it was " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos estaban " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they were " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they were " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros estabamos " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we were " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we were " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no estaba " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I was not " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I wasn't " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no estabas " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you were not " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you weren't " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no estaba " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he was not " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he wasn't " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no estaba " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she was not " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she wasn't " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no estaba " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it was not " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it wasn't " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no estaban " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they were not  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they weren't  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no estabamos " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we were not  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we weren't  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPastPerf3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo habia " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I had " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I had " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú habias " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you had " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you had " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él habia " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he had " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he had " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella habia " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she had " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she had " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso habia " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it had " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it had " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos habian " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they had " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they had " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros habiamos " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we had " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we had " + viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no habia " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I had not " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I hadn't " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no habias " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you had not " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you hadn't " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no habia " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he had not " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he hadn't " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no habia " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she had not " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she hadn't " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no habia " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it had not " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it hadn't " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no habian " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they had not  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they hadn't  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no habiamos " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we had not  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we hadn't  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPastPerfCont3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo había estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I had been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú habías estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you had been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él había estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he had been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella había estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she had been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso había estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it had been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos habían " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they had been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros habíamos estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we had been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no había estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I hadn't been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no habías estado  " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you hadn't been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no había estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he hadn't been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no había estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she hadn't been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no había estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it hadn't been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no habían " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they hadn't been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no habíamos estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we hadn't been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Futuros
    public void GenFutSimp3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1f[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I will " + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + vib2f[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you will " + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + vib3f[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he will " + vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + vib3f[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she will " + vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + vib3f[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it will " + vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + vib4f[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they will " + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + vibfnos[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we will " + vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1f[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + "won't " + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + "no " + vib2f[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + "won't " + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + "no " + vib3f[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + "won't " + vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + "no " + vib3f[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + "won't " + vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + "no " + vib3f[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + "won't " + vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + "no " + vib4f[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + "won't " + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + "no " + vibfnos[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + "won't " + vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenFutCont3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estaré " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I will be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I'll be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú estaras " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you will be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you'll be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él estaré " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he will be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he'll be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella estaré " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she will be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he'll be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso estaré " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it will be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it'll be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos estaran " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they will be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they'll be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros estaremos " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we will be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we'll be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no estaré " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I will not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I won't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no estaras " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you will not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you won't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no estaré " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he will not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he won't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no estaré " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she will not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she won't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no estaré " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it will not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it won't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no estaran " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they will not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they won't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no estaremos " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we will not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we won't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenFutPerf3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo habre " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I will have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I'll have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú habrás " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you will have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you'll have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él habrá " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he will have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he'll have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella habrá " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she will have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she'll have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso habrá " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it will have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it'll have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos habrán " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they will have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they'll have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros habremos "  + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we will have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we'll have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no habre " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I will not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I won't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no habrás " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you will not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you won't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no habrá " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he will not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he won't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no habrá " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she will not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she won't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no habrá " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it will not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it won't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no habrán " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they will not have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they won't have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no habremos "  + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we will not have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we won't have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenFutPerfCont3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo habré estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I will have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú habrás estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you will have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él habrá estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he will have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella habrá estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she will have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso habrá estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it will have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos habrán estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they will have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros habremos estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we will have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no habré estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I won't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no habrás estado  " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you won't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no habrá estado   " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he won't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no habrá estado   " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she won't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no habrá estado   " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it won't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no habran estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they won't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no habremos estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we won't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Would
    public void GenWouldSimp3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + vib1w[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I would " + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + vib2w[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you would " + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + vib3w[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he would " + vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + vib3w[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she would " + vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + vib3w[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it would " + vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + vib4w[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they would " + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + vib5w[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we would " + vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + vib1w[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + "wouldn't " + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + "no " + vib2w[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + "wouldn't " + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + "no " + vib3w[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + "wouldn't " + vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + "no " + vib3w[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + "wouldn't " + vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + "no " + vib3w[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + "wouldn't " + vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + "no " + vib4w[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + "wouldn't " + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + "no " + vib5w[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + "wouldn't " + vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenWouldCont3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estaría " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I would be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I'd be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú estarías " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you would be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you'd be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él estaría " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he would be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he'd be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella estaría " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she would be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she'd be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso estaría " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it would be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it'd be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos estarían " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they would be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they'd be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros estaríamos " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we would be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we'd be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no estaría " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I would not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I wouldn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no estarías " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you would not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you wouldn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no estaría " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he would not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he wouldn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no estaría " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she would not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she wouldn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no estaría " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it would not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it wouldn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no estarían " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they would not be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they wouldn't be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no estaríamos " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we would not be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we wouldn't be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenWouldPerf3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo hubiera " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I would have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I'd have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú hubieras " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you would have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you'd have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él hubiera " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he would have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he'd have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella hubiera " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she would have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she'd have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso hubiera " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it would have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it'd have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos hubieran " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they would have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they'd have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros habríamos "  + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we would have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we'd have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no hubiera " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I would not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I wouldn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no hubieras " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you would not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you wouldn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no hubiera " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he would not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he wouldn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no hubiera " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she would not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she wouldn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no hubiera " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it would not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it wouldn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no hubieran " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they would not have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they wouldn't have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no habríamos "  + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we would not have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we wouldn't have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenWouldPerfCont3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo hubiera estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I would have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú hubieras estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you would have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él hubiera estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he would have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella hubiera estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she would have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso hubiera estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it would have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos hubieran estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they would have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros hubiésemos estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we would have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no hubiera estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I wouldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no hubieras estado  " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you wouldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no hubiera estado   " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he wouldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no hubiera estado   " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she wouldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no hubiera estado   " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it wouldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no habran estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they wouldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no hubiésemos estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we wouldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //COULD
    public void GenCouldSimp3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo podría " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I could " + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú podrías " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you could " + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él podría " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he could " + vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella podría " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she could " + vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso podría " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it could " + vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos podrían " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they could " + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros podríamos " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we could " + vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo " + "no podría " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + "couldn't " + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + "no podrías " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + "couldn't " + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + "no podría " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + "couldn't " + vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + "no podría " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + "couldn't " + vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + "no podría " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + "couldn't " + vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + "no podrían " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + "couldn't " + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + "no podríamos " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + "couldn't " + vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenCouldCont3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo podría estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I could be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I could be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú podrías estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you could be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you could be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él podría estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he could be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he could be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella podría estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she could be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she could be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso podría estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it could be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it could be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos podrían estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they could be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they could be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros podríamos estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we could be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we could be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no podría estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I could not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I couldn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no podrías estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you could not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you couldn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no podría estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he could not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he couldn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no podría estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she could not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she couldn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no podría estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it could not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it couldn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no podrían estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they could not be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they couldn't be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no podríamos estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we could not be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we couldn't be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenCouldPerf3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo pudiese haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I could have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I could have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú pudieses haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you could have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you could have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él pudiese haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he could have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he could have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella pudiese haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she could have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she could have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso pudiese haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it could have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it could have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos pudiesen haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they could have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they could have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros pudiesemos haber "  + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we could have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we could have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no pudiese haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I could not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I couldn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no pudieses haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you could not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you couldn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no pudiese haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he could not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he couldn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no pudiese haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she could not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she couldn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no pudiese haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it could not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it couldn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no pudiesen haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they could not have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they couldn't have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no pudiesemos haber "  + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we could not have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we couldn't have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenCouldPerfCont3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo podría haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I could have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú podrías haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you could have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él podría haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he could have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella podría haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she could have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso podría haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it could have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos podrían haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they could have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros podríamos haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we could have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no podría haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I couldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no podrías haber estado  " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you couldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no podría haber estado   " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he couldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no podría haber estado   " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she couldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no podría haber estado   " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it couldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no habran estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they couldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no podríamos haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we couldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Might
    public void GenMightSimp3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá " + vib1s[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I might " + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú quizá " + vib2s[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you might " + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él quizá " + vib3s[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he might " + vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella quizá " + vib3s[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she might " + vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso quizá " + vib3s[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it might " + vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos quizá " + vib4s[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they might " + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros quizá " + vib5s[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we might " + vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo " + "quizá no " + vib1s[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + "might not  " + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + "quizá no " + vib2s[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + "might not  " + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + "quizá no " + vib3s[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + "might not  " + vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + "quizá no " + vib3s[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + "might not  " + vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + "quizá no " + vib3s[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + "might not  " + vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + "quizá no " + vib4s[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + "might not  " + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + "quizá no " + vib5s[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + "might not  " + vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenMightCont3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá esté " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I might be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I might be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú quizá estés " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you might be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you might be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él quizá esté " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he might be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he might be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella quizá esté " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she might be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she might be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso quizá esté " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it might be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it might be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos quizá estén " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they might be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they might be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros quizá estémos " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we might be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we might be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no quizá esté " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I might not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I mightn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no quizá estés " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you might not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you mightn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no quizá esté " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he might not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he mightn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no quizá esté " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she might not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she mightn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no quizá esté " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it might not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it mightn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no quizá estén " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they might not be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they mightn't be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no quizá estémos " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we might not be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we mightn't be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenMightPerf3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá haya " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I might have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I might have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú quizá hayas " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you might have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you might have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él quizá haya " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he might have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he might have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella quizá haya " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she might have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she might have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso quizá haya " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it might have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it might have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos quizá hayan " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they might have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they might have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros quizá hayamos "  + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we might have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we might have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no quizá haya " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I might not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I mightn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no quizá hayas " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you might not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you mightn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no quizá haya " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he might not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he mightn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no quizá haya " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she might not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she mightn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no quizá haya " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it might not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it mightn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no quizá hayan " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they might not have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they mightn't have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no quizá hayamos "  + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we might not have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we mightn't have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenMightPerfCont3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá haya estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I might have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú quizá hayas estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you might have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él quizá haya estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he might have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella quizá haya estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she might have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso quizá haya estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it might have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos quizá hayan estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they might have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros quizá hayamos estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we might have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo quizá no haya estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I might not have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú quizá no hayas estado  " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you might not have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él quizá no haya estado   " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he might not have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella quizá no haya estado   " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she might not have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso quizá no haya estado   " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it might not have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no habran estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they might not have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros quizá no hayamos estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we might not have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //SHOULD
    public void GenShouldSimp3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I should " + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú deberías " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you should " + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él debería " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he should " + vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella debería " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she should " + vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso debería " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it should " + vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos deberían " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they should " + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros deberíamos " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we should " + vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo " + "no debería " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + "shouldn't " + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + "no deberías " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + "shouldn't " + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + "no debería " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + "shouldn't " + vib[rand]+ arrayEng + frequadv[radv];
                        sp4 = "ella " + "no debería " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + "shouldn't " + vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + "no debería " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + "shouldn't " + vib[rand]+ arrayEng + frequadv[radv];
                        sp6 = "ellos " + "no deberían " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + "shouldn't " + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + "no deberíamos " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + "shouldn't " + vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenShouldCont3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I should be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I should be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú deberías estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you should be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you should be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él debería estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he should be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he should be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella debería estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she should be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she should be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso debería estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it should be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it should be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos deberían estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they should be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they should be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros deberíamos estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we should be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we should be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no debería estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I should not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I shouldn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no deberías estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you should not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you shouldn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no debería estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he should not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he shouldn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no debería estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she should not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she shouldn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no debería estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it should not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it shouldn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no deberían estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they should not be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they shouldn't be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no deberíamos estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we should not be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we shouldn't be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenShouldPerf3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I should have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I should have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú deberías haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you should have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you should have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él debería haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he should have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he should have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella debería haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she should have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she should have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso debería haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it should have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it should have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos deberían haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they should have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they should have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros deberíamos haber "  + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we should have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we should have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no debería haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I should not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I shouldn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no deberías haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you should not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you shouldn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no debería haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he should not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he shouldn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no debería haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she should not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she shouldn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no debería haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it should not have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it shouldn't have " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no deberían haber " + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they should not have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they shouldn't have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no deberíamos haber "  + vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we should not have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we shouldn't have  " + viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenShouldPerfCont3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I should have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú deberías haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you should have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él debería haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he should have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella debería haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she should have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso debería haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it should have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos deberían haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they should have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros deberíamos haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we should have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no debería haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I shouldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no deberías haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you shouldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no debería haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he shouldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no debería haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she shouldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no debería haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it shouldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no deberían haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they shouldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no deberíamos haber estado " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we shouldn't have been " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Can
    public void GenCanSimp3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo puedo " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I can " + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú puedes " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you can " + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él puede " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he can " + vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella puede " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she can " + vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso puede " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it can " + vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos pueden " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they can " + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros podemos " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we can " + vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo " + "no puedo " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + "can't " + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + "no puedes " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + "can't " + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + "no puede " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + "can't " + vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + "no puede " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + "can't " + vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + "no puede " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + "can't " + vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + "no pueden " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + "can't " + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + "no podemos " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + "can't " + vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenCanCont3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo puedo estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I can be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I can be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú puedes estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you can be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you can be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él puede estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he can be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he can be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella puede estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she can be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she can be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso puede estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it can be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it can be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos pueden estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they can be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they can be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros podemos estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we can be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we can be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no puedo estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I can not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I can't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no puedes estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you can not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you can't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no puede estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he can not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he can't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no puede estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she can not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she can't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no puede estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it can not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it can't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no pueden estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they can not be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they can't be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no podemos estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we can not be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we can't be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    //Must
    public void GenMustSimp3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debo " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I must " + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú debés " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you must " + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él debe " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he must " + vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella debe " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she must " + vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso debe " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it must " + vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos deben " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they must " + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros debemos " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we must " + vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo " + "no debo " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + "mustn't " + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + "no debés " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + "mustn't " + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + "no debe " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + "mustn't " + vib3p[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + "no debe " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + "mustn't " + vib3p[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + "no debe " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + "mustn't " + vib3p[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + "no deben " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + "mustn't " + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + "no debemos " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + "mustn't " + vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenMustCont3() {
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debo estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I must be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I must be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú debes estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you must be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you must be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él debe estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he must be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he must be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella debe estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she must be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she must be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso debe estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it must be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it must be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos deben estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they must be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they must be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros debemos estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we must be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we must be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no debo estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I must not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I mustn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no debes estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you must not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you mustn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no debe estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he must not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he mustn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no debe estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she must not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she mustn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no debe estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it must not be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it mustn't be " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no deben estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they must not be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they mustn't be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no debemos estar " + vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we must not be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we mustn't be  " + vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023

    public void GenAbleTo3(){
        gen = new Generator3();
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + "soy capaz de " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I am " + "able to " + vib[rand] + arrayEng + frequadv[radv];
                        eng12 = "I'm " + "able to " + vib[rand] + arrayEng + frequadv[radv];

                        sp2 = "tú " + "eres capaz de " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you are " + "able to " + vib[rand] + arrayEng + frequadv[radv];
                        eng22 = "you're " + "able to " + vib[rand] + arrayEng + frequadv[radv];

                        sp3 = "él " + "es capaz de " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he is " + "able to " + vib[rand] + arrayEng + frequadv[radv];
                        eng32 = "he's " + "able to " + vib[rand] + arrayEng + frequadv[radv];

                        sp4 = "ella " + "es capaz de " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she is " + "able to " + vib[rand] + arrayEng + frequadv[radv];
                        eng42 = "she's " + "able to " + vib[rand] + arrayEng + frequadv[radv];

                        sp5 = "eso " + "es capaz de " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it is " + "able to " + vib[rand] + arrayEng + frequadv[radv];
                        eng52 = "it's " + "able to " + vib[rand] + arrayEng + frequadv[radv];

                        sp6 = "ellos " + "son capaz de " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they are " + "able to " + vib[rand] + arrayEng + frequadv[radv];
                        eng62 = "they're " + "able to " + vib[rand] + arrayEng + frequadv[radv];

                        sp7 = "nosotros " + "somos capaz de " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we are " + "able to " + vib[rand] + arrayEng + frequadv[radv];
                        eng72 = "we're " + "able to " + vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no " + "soy capaz de " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I am not " + "able to " + vib[rand] + arrayEng + frequadv[radv];
                        eng12 = "I'm not " + "able to " + vib[rand] + arrayEng + frequadv[radv];

                        sp2 = "tú no " + "eres capaz de " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you are not " + "able to " + vib[rand] + arrayEng + frequadv[radv];
                        eng22 = "you're not " + "able to " + vib[rand] + arrayEng + frequadv[radv];

                        sp3 = "él no " + "es capaz de " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he is not " + "able to " + vib[rand] + arrayEng + frequadv[radv];
                        eng32 = "he's not " + "able to " + vib[rand] + arrayEng + frequadv[radv];

                        sp4 = "ella no " + "es capaz de " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she is not " + "able to " + vib[rand] + arrayEng + frequadv[radv];
                        eng42 = "she's not " + "able to " + vib[rand] + arrayEng + frequadv[radv];

                        sp5 = "eso no " + "es capaz de " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it is not " + "able to " + vib[rand] + arrayEng + frequadv[radv];
                        eng52 = "it's not " + "able to " + vib[rand] + arrayEng + frequadv[radv];

                        sp6 = "ellos no " + "son capaz de " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they are not " + "able to " + vib[rand] + arrayEng + frequadv[radv];
                        eng62 = "they're not " + "able to " + vib[rand] + arrayEng + frequadv[radv];

                        sp7 = "nosotros no " + "somos capaz de " + vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we are not " + "able to " + vib[rand] + arrayEng + frequadv[radv];
                        eng72 = "we're not " + "able to " + vib[rand] + arrayEng + frequadv[radv];
                        break;

                }
            }
        }
    }//PD FEB 2023

    //for to dificultad 3 SOlO INTRANS
    public void forSubTo3() {

        Pasts3 pas = new Pasts3();
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int rn1 = (int) (Math.random() * 6);
        int rn2 = (int) (Math.random() * 5);
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

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = ftsjs[0] + pas.vis1[rand] + arrayEsp + advfrequ[radv];
                        eng1 = ftsj[0] + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = ftsjs[1] + pas.vis2[rand] + arrayEsp + advfrequ[radv];
                        eng2 = ftsj[1] + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = ftsjs[2] + pas.vis3[rand] + arrayEsp + advfrequ[radv];
                        eng3 = ftsj[2] + vib[rand] + arrayEng + frequadv[radv];
                        sp4 = ftsjs[3] + pas.vis3[rand] + arrayEsp + advfrequ[radv];
                        eng4 = ftsj[3] + vib[rand] + arrayEng + frequadv[radv];
                        sp5 = ftsjs[4] + pas.vis3[rand] + arrayEsp + advfrequ[radv];
                        eng5 = ftsj[4] + vib[rand] + arrayEng + frequadv[radv];
                        sp6 = ftsjs[5] + pas.vis4[rand] + arrayEsp + advfrequ[radv];
                        eng6 = ftsj[5] + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = ftsjs[6] + pas.vis5[rand] + arrayEsp + advfrequ[radv];
                        eng7 = ftsj[6] + vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = ftsjsn[0] + pas.vis1[rand] + arrayEsp + advfrequ[radv];
                        eng1 = ftsjn[0] + vib[rand] + arrayEng + frequadv[radv];
                        sp2 = ftsjsn[1] + pas.vis2[rand] + arrayEsp + advfrequ[radv];
                        eng2 = ftsjn[1] + vib[rand] + arrayEng + frequadv[radv];
                        sp3 = ftsjsn[2] + pas.vis3[rand] + arrayEsp + advfrequ[radv];
                        eng3 = ftsjn[2] + vib[rand] + arrayEng + frequadv[radv];
                        sp4 = ftsjsn[3] + pas.vis3[rand] + arrayEsp + advfrequ[radv];
                        eng4 = ftsjn[3] + vib[rand] + arrayEng + frequadv[radv];
                        sp5 = ftsjsn[4] + pas.vis3[rand] + arrayEsp + advfrequ[radv];
                        eng5 = ftsjn[4] + vib[rand] + arrayEng + frequadv[radv];
                        sp6 = ftsjsn[5] + pas.vis4[rand] + arrayEsp + advfrequ[radv];
                        eng6 = ftsjn[5] + vib[rand] + arrayEng + frequadv[radv];
                        sp7 = ftsjsn[6] + pas.vis5[rand] + arrayEsp + advfrequ[radv];
                        eng7 = ftsjn[6] + vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //want to dificultad 3 SOLO INTRANS
    public void wantyouto3() {

        Pasts3 pas = new Pasts3();
        randstarter();
        arraySpe();
        String temp = vib[rand];
        int rn1 = (int) (Math.random() * 6);
        int rn2 = (int) (Math.random() * 5);
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        //want to subject
        String wtsj[] = {"I want ", "you want ", "he wants ", "she wants ", "it wants ", "we want ", "they want "};
        //want to subject negative
        String wtsjn[] = {"I don't want ", "you don't want ", "he doesn't want ", "she doesn't want ", "it doesn't want "
                , "we don't want ", "they don't want "};
        //sujetos want to en sp
        String wtsjs[] = {"yo quiero ", "tú quieres ", "él quiere ", "ella quiere ", "eso quiere ", "nosotros queremos ", "ellos quieren "};
        //sujetos want to en sp negativo
        String wtsjsn[] = {"yo no quiero ", "tú no quieres ", "él no quiere ", "eso no quiere ", "ella no quiere ", "nosotros no queremos ", "ellos no quieren "};

        String wtobj1[] = {"you to " + vib[rand], "him to " + vib[rand], "her to " + vib[rand],
                "it to " + vib[rand], "us to " + vib[rand], "them to " + vib[rand]};
        String wtobj2[] = {"me to " + vib[rand], "him to " + vib[rand], "her to " + vib[rand],
                "it to " + vib[rand], "us to " + vib[rand], "them to " + vib[rand]};
        String wtobj3[] = {"you to " + vib[rand], "me to " + vib[rand], "her to " + vib[rand],
                "it to " + vib[rand], "us to " + vib[rand], "them to " + vib[rand]};
        String wtobj4[] = {"you to " + vib[rand], "him to " + vib[rand], "me to " + vib[rand],
                "it to " + vib[rand], "us to " + vib[rand], "them to " + vib[rand]};
        String wtobj5[] = {"you to " + vib[rand], "him to " + vib[rand], "her to " + vib[rand],
                "me to " + vib[rand], "us to " + vib[rand], "them to " + vib[rand]};
        String wtobj6[] = {"you to " + vib[rand], "him to " + vib[rand], "her to " + vib[rand],
                "it to " + vib[rand], "them to " + vib[rand]};
        String wtobj7[] = {"you to " + vib[rand], "him to " + vib[rand], "her to " + vib[rand],
                "it to " + vib[rand], "us to " + vib[rand], "me to " + vib[rand]};

        // objetos wt en sp
        String wtobj1s[] = {"que tú " + pas.vis2[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis5[rand], "que ellos " + pas.vis4[rand]};
        String wtobj2s[] = {"que yo " + pas.vis1[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis3[rand], "que ellos " + pas.vis3[rand]};
        String wtobj3s[] = {"que tú " + pas.vis2[rand], "que yo " + pas.vis1[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis5[rand], "que ellos " + pas.vis4[rand]};
        String wtobj4s[] = {"que tú " + pas.vis2[rand], "que él " + pas.vis3[rand], "que yo " + pas.vis1[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis5[rand], "que ellos " + pas.vis4[rand]};
        String wtobj5s[] = {"que tú " + pas.vis2[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que yo " + pas.vis1[rand], "que nosotros " + pas.vis5[rand], "que ellos " + pas.vis4[rand]};
        String wtobj6s[] = {"que tú " + pas.vis2[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que ellos " + pas.vis4[rand]};
        String wtobj7s[] = {"que tú " + pas.vis2[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis5[rand], "que yo " + pas.vis1[rand]};

        for (String verbs : vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = wtsjs[0] + wtobj1s[rn1] + arrayEsp + advfrequ[radv];
                        eng1 = wtsj[0] + wtobj1[rn1] + arrayEng + frequadv[radv];
                        sp2 = wtsjs[1] + wtobj2s[rn1] + arrayEsp + advfrequ[radv];
                        eng2 = wtsj[1] + wtobj2[rn1] + arrayEng + frequadv[radv];
                        sp3 = wtsjs[2] + wtobj3s[rn1] + arrayEsp + advfrequ[radv];
                        eng3 = wtsj[2] + wtobj3[rn1] + arrayEng + frequadv[radv];
                        sp4 = wtsjs[3] + wtobj4s[rn1] + arrayEsp + advfrequ[radv];
                        eng4 = wtsj[3] + wtobj4[rn1] + arrayEng + frequadv[radv];
                        sp5 = wtsjs[4] + wtobj5s[rn1] + arrayEsp + advfrequ[radv];
                        eng5 = wtsj[4] + wtobj5[rn1] + arrayEng + frequadv[radv];
                        sp6 = wtsjs[5] + wtobj6s[rn2] + arrayEsp + advfrequ[radv];
                        eng6 = wtsj[5] + wtobj6[rn2] + arrayEng + frequadv[radv];
                        sp7 = wtsjs[6] + wtobj7s[rn1] + arrayEsp + advfrequ[radv];
                        eng7 = wtsj[6] + wtobj7[rn1] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = wtsjsn[0] + wtobj1s[rn1] + arrayEsp + advfrequ[radv];
                        eng1 = wtsjn[0] + wtobj1[rn1] + arrayEng + frequadv[radv];
                        sp2 = wtsjsn[1] + wtobj2s[rn1] + arrayEsp + advfrequ[radv];
                        eng2 = wtsjn[1] + wtobj2[rn1] + arrayEng + frequadv[radv];
                        sp3 = wtsjsn[2] + wtobj3s[rn1] + arrayEsp + advfrequ[radv];
                        eng3 = wtsjn[2] + wtobj3[rn1] + arrayEng + frequadv[radv];
                        sp4 = wtsjsn[3] + wtobj4s[rn1] + arrayEsp + advfrequ[radv];
                        eng4 = wtsjn[3] + wtobj4[rn1] + arrayEng + frequadv[radv];
                        sp5 = wtsjsn[4] + wtobj5s[rn1] + arrayEsp + advfrequ[radv];
                        eng5 = wtsjn[4] + wtobj5[rn1] + arrayEng + frequadv[radv];
                        sp6 = wtsjsn[5] + wtobj6s[rn2] + arrayEsp + advfrequ[radv];
                        eng6 = wtsjn[5] + wtobj6[rn2] + arrayEng + frequadv[radv];
                        sp7 = wtsjsn[6] + wtobj7s[rn1] + arrayEsp + advfrequ[radv];
                        eng7 = wtsjn[6] + wtobj7[rn1] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023


}

