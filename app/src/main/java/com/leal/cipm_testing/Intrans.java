
package com.leal.cipm_testing;


import android.content.Context;
import android.widget.Toast;

public class Intrans {
    Generator gen;
    int randvcb;
    int randPV;
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

    int rPv1;
    int rPv2;

    //verbos generador 1 completos base
    String vcb[] = {
            "have ", "do ", "say ", "get ", "make ", "know ", "take ", "see ",
            "want ", "use ", "find ", "give ", "tell ", "call ", "try ", "ask ", "need ", "feel ",
            "leave ", "put ", "keep ", "begin ", "help ", "turn ", "start ", "show ", "hear ",
            "play ", "move ", "believe ", "hold ", "bring ", "write ", "provide ", "lose ", "pay ",
            "meet ", "include ", "continue ", "set ", "learn ", "change ", "lead ", "watch ",
            "follow ", "stop ", "create ", "speak ", "read ", "add ", "spend ", "open ", "win ",
            "offer ", "remember ", "love ", "consider ", "buy ", "serve ", "send ", "expect ",
            "build ", "cut ", "kill ", "go ", "think ", "come ", "look ",
            "work ", "play ", "talk ",
            "run ", "move ", "live ",
            "sit ", "stand ", "understand ",
            "walk ", "grow ", "wait ", "die ",
            "stay ", "fall ",
    };
    //verbos completos subjuntivos primera persona
    String vcb1s[] = {
            "tenga ", "haga ", "diga ", "obtenga ", "haga (make) ", "sepa ", "tome ", "vea ",
            "quiera ", "use ", "encuentre ", "de ", "comente ", "llame ", "intente ", "pregunte ", "necesite ", "sienta ",
            "deje (abandonar) ", "ponga ", "mantenga ", "comience ", "ayude ", "voltee ", "empiece ", "muestre ", "oiga ",
            "juege ", "mueva ", "crea ", "sostenga ", "traiga ", "escriba ", "provea ", "pierda ", "pague ",
            "conozca ", "incluya ", "continue ", "establezca (set) ", "aprenda ", "cambie ", "diriga ", "observe ",
            "siga ", "detenga ", "cree ", "hable ", "lea ", "agregue ", "gaste ", "abra ", "gane ",
            "ofrezca ", "recuerde ", "ame ", "considere ", "compre ", "sirva ", "envie ", "espere (expectativa) ",
            "construya ", "corte ", "mate ", "vaya ", "piense ", "venga ", "mire ", "trabaje ", "juege ", "platique ", "corra ", "mueva ", "viva ",
            "me siente ", "me pare ", "entienda ", "camine ", "crezca ", "espere ", "muera ", "me quede ", "me caiga "
    };
    //verbos completos subjuntivos segunda persona
    String vcb2s[] = {
            "tengas ", "hagas ", "digas ", "obtengas ", "hagas (make) ", "sepas ", "tomes ", "veas ",
            "quieras ", "uses ", "encuentres ", "des ", "comentes ", "llames ", "intentes ", "preguntes ", "necesites ", "sientas ",
            "dejes (abandonar) ", "pongas ", "mantengas ", "comiences ", "ayudes ", "voltees ", "empieces ", "muestres ", "oigas ",
            "jueges ", "muevas ", "creas ", "sostengas ", "traigas ", "escribas ", "proveas ", "pierdas ", "pagues ",
            "conozcas ", "incluyas ", "continues ", "establezcas (set) ", "aprendas ", "cambies ", "dirigas ", "observes ",
            "sigas ", "detengas ", "crees ", "hables ", "leas ", "agregues ", "gastes ", "abras ", "ganes ",
            "ofrezcas ", "recuerdes ", "ames ", "consideres ", "compres ", "sirvas ", "envies ", "esperes (expectativa) ",
            "construyas ", "cortes ", "mates ", "vayas ", "pienses ", "vengas ", "mires ", "trabajes ", "jueges ", "platiques ", "corras ", "muevas ", "vivas ",
            "te sientes ", "te pares ", "entiendas ", "camines ", "crezcas ", "esperes ", "te mueras ", "te quedes ", "te caigas "
    };
    //verbos completos subjuntivos tercera persona
    String vcb3s[] = {
            "tenga ", "haga ", "diga ", "obtenga ", "haga (make) ", "sepa ", "tome ", "vea ",
            "quiera ", "use ", "encuentre ", "de ", "comente ", "llame ", "intente ", "pregunte ", "necesite ", "sienta ",
            "deje (abandonar) ", "ponga ", "mantenga ", "comience ", "ayude ", "voltee ", "empiece ", "muestre ", "oiga ",
            "juege ", "mueva ", "crea ", "sostenga ", "traiga ", "escriba ", "provea ", "pierda ", "pague ",
            "conozca ", "incluya ", "continue ", "establezca (set) ", "aprenda ", "cambie ", "diriga ", "observe ",
            "siga ", "detenga ", "cree ", "hable ", "lea ", "agregue ", "gaste ", "abra ", "gane ",
            "ofrezca ", "recuerde ", "ame ", "considere ", "compre ", "sirva ", "envie ", "espere (expectativa) ",
            "construya ", "corte ", "mate ", "vaya ", "piense ", "venga ", "mire ", "trabaje ", "juege ", "platique ", "corra ", "mueva ", "viva ",
            "se siente ", "se pare ", "entienda ", "camine ", "crezca ", "espere ", "se muera ", "se quede ", "se caiga "
    };
    //verbos completos subjuntivos cuarta persona
    String vcb4s[] = {
            "tengan ", "hagan ", "digan ", "obtengan ", "hagan (make) ", "sepan ", "tomen ", "vean ",
            "quieran ", "usen ", "encuentren ", "den ", "comenten ", "llamen ", "intenten ", "pregunten ", "necesiten ", "sientan ",
            "dejen (abandonar) ", "pongan ", "mantengan ", "comiencen ", "ayuden ", "volteen ", "empiecen ", "muestren ", "oigan ",
            "juegen ", "muevan ", "crean ", "sostengan ", "traigan ", "escriban ", "provean ", "pierdan ", "paguen ",
            "conozcan ", "incluyan ", "continuen ", "establezcan (set) ", "aprendan ", "cambien ", "dirigan ", "observen ",
            "sigan ", "detengan ", "creen ", "hablen ", "lean ", "agreguen ", "gasten ", "abran ", "ganen ",
            "ofrezcan ", "recuerden ", "amen ", "consideren ", "compren ", "sirvan ", "envien ", "esperen (expectativa) ",
            "construyan ", "corten ", "maten ", "vayan ", "piensen ", "vengan ", "miren ", "trabajen ", "juegen ", "platiquen ", "corran ", "muevan ", "vivan ",
            "se sienten ", "se paren ", "entiendan ", "caminen ", "crezcan ", "esperen ", "se mueran ", "se queden ", "se caigan "
    };
    //verbos completos subjuntivos quinta persona
    String vcb5s[] = {
            "tengamos ", "hagamos ", "digamos ", "obtengamos ", "hagamos (make) ", "sepamos ", "tomemos ", "veamos ",
            "quieramos ", "usemos ", "encontremos ", "demos ", "comentemos ", "llamemos ", "intentemos ", "preguntemos ", "necesitemos ", "sintamos ",
            "dejemos (abandonar) ", "pongamos ", "mantengamos ", "comiencemos ", "ayudemos ", "volteemos ", "empecemos ", "mostremos ", "oigamos ",
            "jugemos ", "movamos ", "creemos ", "sostengamos ", "traigamos ", "escribamos ", "proveamos ", "perdamos ", "paguemos ",
            "conozcamos ", "incluyamos ", "continuemos ", "establezcamos (set) ", "aprendamos ", "cambiemos ", "dirigamos ", "observemos ",
            "sigamos ", "detengamos ", "creemos ", "hablemos ", "leamos ", "agreguemos ", "gastemos ", "abramos ", "ganemos ",
            "ofrezcamos ", "recordemos ", "amemos ", "consideremos ", "compremos ", "sirvamos ", "enviemos ", "esperemos (expectativa) ",
            "construyamos ", "cortemos ", "matemos ", "vayamos ", "pensemos ", "vengamos ", "miremos ", "trabajemos ", "juguemos ", "platiquemos ", "corramos ", "movamos ", "vivamos ",
            "nos sentemos ", "nos paremos ", "entendamos ", "caminemos ", "crezcamos ", "esperemos ", "nos muramos ", "nos quedemos ", "nos caigamos "
    };

    String some[] = {
            "time ", "year ", "day ", "man ", "child ", "world ", "state ",
            "student ", "group ", "country ", "problem ", "place ", "case ",
            "system ", "program ", "work ", "government ", "number ", "point ",
            "home ", "water ", "room ", "area ", "money ", "fact ", "month ", "lot ",
            "right ", "study ", "book ", "eye ", "job ", "business ", "side ", "kind ",
            "service ", "friend ", "father ", "power ", "game ", "end ", "member ", "car ",
            "name ", "president ", "team ", "minute ", "kid ", "body ", "parent ", "level ",
            "art ", "result ", "change ", "guy ", "moment ", "air ", "teacher "};

    //singular objects masculine spanish / these only have to match the ones above
    String soms[] = {"tiempo ", "año ", "dia ", "hombre ", "niño ", "mundo ", "estado ",
            "estudiante ", "grupo ", "país ", "problema ", "lugar ", "caso ", "sistema ",
            "programa ", "trabajo ", "gobierno ", "número ", "punto ", "hogar ", "agua ",
            "cuarto ", "área ", "dinero ", "hecho ", "mes ", "lote ", "derecho ", "estudio ",
            "libro ", "ojo ", "empleo ", "negocio ", "lado ", "tipo ", "servicio ",
            "amigo ", "padre ", "poder ", "juego ", "fin ", "miembro ", "carro ", "nombre ",
            "presidente ", "equipo ", "minuto ", "niño ", "cuerpo ", "padre ", "nivel ", "arte ",
            "resultado ", "cambio ", "tipo ", "momento ", "aire ", "maestro "
    };



    String with[] = {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
            "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
            "with the woman ",
            "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
            "with the people ", "with a nurse ",
            "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
            "with my friend ", "with my cousin ", "with the father ", "with the mother "
    };
    String con[] = {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
            "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
            "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
            "con gente ", "con la gente ",
            "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
            "con el maestro ", "con mi amigo ",
            "con mi primo ", "con el papá ", "con la mamá "
    };

    String at[] = {"at the restaurant ", "at school ", "at the house ", "at the concert ",
            "at the store ", "at church ", "at the hospital ",
            "at the office ", "at the station "
    };
    String aten[] = {"en el restaurante (pero no dentro) ",
            "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
            "en el concierto (pero no dentro) ",
            "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
            "en el hospital (pero no dentro) ",
            "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "
    };

    String from[] = {"from the house ", "from the office ", "from the hospital "
    };
    String defrom[] = {"de la casa ", "de la oficina ", "de el hospital "
    };
    String defromdesde[] = {"desde la casa ", "desde la oficina ", "desde el hospital "
    };

    String during[] = {"during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
    };
    String duringsp[] = {"durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
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
    String toa[] = {"a la casa ", "a la tienda ", "a la escuela ", "a el concierto "
    };

    String in[] = {"in the house ", "in the fridge ", "in the year ", "in the bus ", "in the car ", "in the club "
    };
    String indent[] = {"en la casa ", "en el refrigerador ", "en el año ", "en el camion ", "en el carro ", "en el antro "
    };

    String ffor[] = {"for everyone ", "for you ", "for the city ", "for my friend "
    };
    String para[] = {"para todos ", "para ti ", "para la ciudad ", "para mi amigo "
    };

    String on[] = {"on the table ", "on the wall ", "on the surface ", "on the roof ", "on the window "
    };
    String sobreon[] = {"sobre la mesa ", "sobre la pared ", "sobre la superficie ", "sobre el techo ", "sobre la ventana "
    };

    String by[] = {"by the house ", "by the station ", "by the river ", "by the park "
    };
    String bypor[] = {"por la casa ", "por la estación ", "por el rio ", "por el parque "
    };

    String about[] = {"about the problems ", "about the book ", "about the situation ", "about you "
    };
    String aboutsob[] = {"sobre el problema ", "sobre el libro ", "sobre la situación ", "sobre ti "
    };

    String above[] = {"above the house ", "above the car ", "above your head "
    };
    String abovesp[] = {"por encima de la casa ", "por encima de el carro ", "por encima de tu cabeza "
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
    String outofsp[] = {"fuera de la casa ", "fuera de la carcel ", "fuera de la escuela ", "fuera de el carro "
    };

    String around[] = {"around the house ", "around the park ", "around the church ", "around the block "
    };
    String aroundsp[] = {"al rededor de la casa ", "al rededor del parque ", "al rededor de la iglesia ", "al rededor de la cuadra "
    };

    String near[] = {"near the house ", "near the station ", "near the end ", "near the river "
    };
    String nearsp[] = {"cerca de la casa ", "cerca de la estación ", "cerca de el fin ", "cerca del rio "
    };


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

    // the single dimention arrays are on top, now to make the special 2 dimentional arrays
    //randy = (int) (Math.random() * with.length);
    String gospecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ", "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ", "with the nurse ", "with the manager ", "with the boss ",
                    "with the teacher ", "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
            },
            {"through the days ", "through the forest ", "through the vegetation ", "through the house "
            },
            {"towards the house ", "towards the person ", "towards the police station ", "towards knowledge "
            },
            {"to the house ", "to the store ", "to school ", "to the concert "},
            {"in the house ", "in the fridge ", "in the year ", "in the bus ", "in the car ", "in the club"
            },
            {"by the house ", "by the station ", "by the river ", "by the park "
            },
            {"between the car and the house ", "between you and me ", "between two places "
            },
            {"without you ", "without money ", "without permission "
            },
            {"behind the car ", "behind the house ", "behind the restaurant "
            },
            {"beyond the forest ", "beyond the city ", "beyond the jugle "
            },
            {"around the house ", "around the park ", "around the church ", "around the block "
            },
            {"near the house ", "near the station ", "near the end ", "near the river "
            }
    };
    String irspecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ", "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ", "con mi primo ", "con el papá ", "con la mamá "
            },
            {"durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
            },
            {"a través de los dias ", "a través de el bosque ", "a través de la vegetación ", "a través de la casa "
            },
            {"hacia la casa ", "hacia la persona ", "hacia la estación de policia ", "hacia el conocimiento "
            },
            {"a la casa ", "a la tienda ", "a la escuela ", "a el concierto "},
            {"en la casa ", "en el refrigerador ", "en el año ", "en el camion ", "en el carro ", "en el antro "
            },
            {"por la casa ", "por la estación ", "por el rio ", "por el parque "
            },
            {"entre el carro y la casa ", "entre tu y yo ", "entre dos lugares "
            },
            {"sin ti ", "sin dinero ", "sin permiso "
            },
            {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
            },
            {"más allá de el bosque ", "más allá de la ciudad ", "más allá de la selva "
            },
            {"al rededor de la casa ", "al rededor del parque ", "al rededor de la iglesia ", "al rededor de la cuadra "
            },
            {"cerca de la casa ", "cerca de la estación ", "cerca de el fin ", "cerca del rio "
            }
    };

    String thinkspecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "
            },
            {"during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
            },
            {"until tomorrow ", "until the next day ", "until next year ", "until five "
            },
            {"among people ", "among artist ", "among teachers "
            },
            {"through the days ", "through the forest ", "through the vegetation ", "through the house "
            },
            {"in the house ", "in the fridge ", "in the year ", "in the bus ", "in the car ", "in the club "
            },
            {"for everyone ", "for you ", "for the city ", "for my friend "
            },
            {"on the table ", "on the wall ", "on the surface ", "on the roof ", "on the window "
            },
            {"by the house ", "by the station ", "by the river ", "by the park "
            },
            {"about the problems ", "about the book ", "about the situation ", "about you "
            },
            {"above the house ", "above the car ", "above your head "
            },
            {"between the car and the house ", "between you and me ", "between two places "
            },
            {"since five ", "since this morning ", "since last year "
            },
            {"under the radar ", "under the bed ", "under the house ", "under you "
            },
            {"without you ", "without money ", "without permission "
            },
            {"behind the car ", "behind the house ", "behind the restaurant "
            },
            {"around the house ", "around the park ", "around the church ", "around the block "
            },
            {"near the house ", "near the station ", "near the end ", "near the river "
            }
    };
    String penspecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "
            },
            {"durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
            },
            {"hasta mañana ", "hasta el siguiente dia ", "hasta el siguiente año ", "hasta las cinco "
            },
            {"entre gente ", "entre artistas ", "entre maestros "
            },
            {"a través de los dias ", "a través de el bosque ", "a través de la vegetación ", "a través de la casa "
            },
            {"en la casa ", "en el refrigerador ", "en el año ", "en el camion ", "en el carro ", "en el antro "
            },
            {"para todos ", "para ti ", "para la ciudad ", "para mi amigo "
            },
            {"sobre la mesa ", "sobre la pared ", "sobre la superficie ", "sobre el techo ", "sobre la ventana "
            },
            {"por la casa ", "por la estación ", "por el rio ", "por el parque "
            },
            {"sobre el problema ", "sobre el libro ", "sobre la situación ", "sobre ti "
            },
            {"por encima de la casa ", "por encima de el carro ", "por encima de tu cabeza "
            },
            {"entre el carro y la casa ", "entre tu y yo ", "entre dos lugares "
            },
            {"desde las cinco ", "desde esta mañana ", "desde el año pasado "
            },
            {"por debajo del radar ", "debajo de la cama ", "por debajo de la casa ", "debajo de ti "
            },
            {"sin ti ", "sin dinero ", "sin permiso "
            },
            {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
            },
            {"al rededor de la casa ", "al rededor del parque ", "al rededor de la iglesia ", "al rededor de la cuadra "
            },
            {"cerca de la casa ", "cerca de la estación ", "cerca de el fin ", "cerca del rio "
            }
    };

    String comespecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"from the house ", "from the office ", "from the hospital "
            },
            {"during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
            },
            {"until tomorrow ", "until the next day ", "until next year ", "until five "
            },
            {"under the radar ", "under the bed ", "under the house ", "under you "
            },
            {"without you ", "without money ", "without permission "
            },
            {"behind the car ", "behind the house ", "behind the restaurant "
            },

    };
    String venspecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
            {"de la casa ", "de la oficina ", "de el hospital "
            },
            {"durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
            },
            {"hasta mañana ", "hasta el siguiente dia ", "hasta el siguiente año ", "hasta las cinco "
            },
            {"por debajo del radar ", "debajo de la cama ", "por debajo de la casa ", "debajo de ti "
            },
            {"sin ti ", "sin dinero ", "sin permiso "
            },
            {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
            }
    };

    String lookspecial[][] = {
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "
            },
            {"from the house ", "from the office ", "from the hospital "
            },
            {"during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
            },
            {"through the days ", "through the forest ", "through the vegetation ", "through the house "
            },
            {"towards the house ", "towards the person ", "towards the police station ", "towards knowledge "
            },
            {"on the table ", "on the wall ", "on the surface ", "on the roof ", "on the window "
            },
            {"between the car and the house ", "between you and me ", "between two places "
            },
            {"under the radar ", "under the bed ", "under the house ", "under you "
            },
            {"without you ", "without money ", "without permission "
            },
            {"behind the car ", "behind the house ", "behind the restaurant "
            },
            {"beyond the forest ", "beyond the city ", "beyond the jugle "
            },
            {"out of the house ", "out of jail ", "out of school ", "out of the car "
            },
            {"around the house ", "around the park ", "around the church ", "around the block "
            },
            {"near the house ", "near the station ", "near the end ", "near the river "
            }
    };
    String miraspecial[][] = {
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "
            },
            {"desde la casa ", "desde la oficina ", "desde el hospital "
            },
            {"durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
            },
            {"a través de los dias ", "a través de el bosque ", "a través de la vegetación ", "a través de la casa "
            },
            {"hacia la casa ", "hacia la persona ", "hacia la estación de policia ", "hacia el conocimiento "
            },
            {"sobre la mesa ", "sobre la pared ", "sobre la superficie ", "sobre el techo ", "sobre la ventana "
            },
            {"entre el carro y la casa ", "entre tu y yo ", "entre dos lugares "
            },
            {"por debajo del radar ", "debajo de la cama ", "por debajo de la casa ", "debajo de ti "
            },
            {"sin ti ", "sin dinero ", "sin permiso "
            },
            {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
            },
            {"más allá de el bosque ", "más allá de la ciudad ", "más allá de la selva "
            },
            {"fuera de la casa ", "fuera de la carcel ", "fuera de la escuela ", "fuera de el carro "
            },
            {"al rededor de la casa ", "al rededor del parque ", "al rededor de la iglesia ", "al rededor de la cuadra "
            },
            {"cerca de la casa ", "cerca de la estación ", "cerca de el fin ", "cerca del rio "
            }
    };
    String workspecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "
            },
            {"from the house ", "from the office ", "from the hospital "
            },
            {"during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
            },
            {"until tomorrow ", "until the next day ", "until next year ", "until five "
            },
            {"among people ", "among artist ", "among teachers "
            },
            {"through the days ", "through the forest ", "through the vegetation ", "through the house "
            },
            {"for everyone ", "for you ", "for the city ", "for my friend "
            },
            {"on the table ", "on the wall ", "on the surface ", "on the roof ", "on the window "
            },
            {"by the house ", "by the station ", "by the river ", "by the park "
            },
            {"under the radar ", "under the bed ", "under the house ", "under you "
            },
            {"without you ", "without money ", "without permission "
            },
            {"across the street ", "across the nation ", "across the park "
            },
            {"behind the car ", "behind the house ", "behind the restaurant "
            },
            {"around the house ", "around the park ", "around the church ", "around the block "
            },
            {"near the house ", "near the station ", "near the end ", "near the river "
            }
    };
    String trabspecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "
            },
            {"desde la casa ", "desde la oficina ", "desde el hospital "
            },
            {"durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
            },
            {"hasta mañana ", "hasta el siguiente dia ", "hasta el siguiente año ", "hasta las cinco "
            },
            {"entre gente ", "entre artistas ", "entre maestros "
            },
            {"a través de los dias ", "a través de el bosque ", "a través de la vegetación ", "a través de la casa "
            },
            {"para todos ", "para ti ", "para la ciudad ", "para mi amigo "
            },
            {"sobre la mesa ", "sobre la pared ", "sobre la superficie ", "sobre el techo ", "sobre la ventana "
            },
            {"por la casa ", "por la estación ", "por el rio ", "por el parque "
            },
            {"por debajo del radar ", "debajo de la cama ", "por debajo de la casa ", "debajo de ti "
            },
            {"sin ti ", "sin dinero ", "sin permiso "
            },
            {"cruzando la calle ", "cruzando la nacion ", "cruzando el parque "
            },
            {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
            },
            {"al rededor de la casa ", "al rededor del parque ", "al rededor de la iglesia ", "al rededor de la cuadra "
            },
            {"cerca de la casa ", "cerca de la estación ", "cerca de el fin ", "cerca del rio "
            }

    };

    String playspecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
            },
            {"until tomorrow ", "until the next day ", "until next year ", "until five "
            },
            {"among people ", "among artist ", "among teachers "
            },
            {"through the days ", "through the forest ", "through the vegetation ", "through the house "
            },
            {"in the house ", "in the fridge ", "in the year ", "in the bus ", "in the car ", "in the club "
            },
            {"for everyone ", "for you ", "for the city ", "for my friend "
            },
            {"on the table ", "on the wall ", "on the surface ", "on the roof ", "on the window "
            },
            {"since five ", "since this morning ", "since last year "
            },
            {"under the radar ", "under the bed ", "under the house ", "under you "
            },
            {"without you ", "without money ", "without permission "
            },
            {"across the street ", "across the nation ", "across the park "
            },
            {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
            },
            {"beyond the forest ", "beyond the city ", "beyond the jugle "
            },
            {"around the house ", "around the park ", "around the church ", "around the block "
            },
            {"near the house ", "near the station ", "near the end ", "near the river "
            }
    };
    String jugspecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
            {"durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
            },
            {"hasta mañana ", "hasta el siguiente dia ", "hasta el siguiente año ", "hasta las cinco "
            },
            {"entre gente ", "entre artistas ", "entre maestros "
            },
            {"a través de los dias ", "a través de el bosque ", "a través de la vegetación ", "a través de la casa "
            },
            {"en la casa ", "en el refrigerador ", "en el año ", "en el camion ", "en el carro ", "en el antro "
            },
            {"para todos ", "para ti ", "para la ciudad ", "para mi amigo "
            },
            {"sobre la mesa ", "sobre la pared ", "sobre la superficie ", "sobre el techo ", "sobre la ventana "
            },
            {"desde las cinco ", "desde esta mañana ", "desde el año pasado "
            },
            {"por debajo del radar ", "debajo de la cama ", "por debajo de la casa ", "debajo de ti "
            },
            {"sin ti ", "sin dinero ", "sin permiso "
            },
            {"cruzando la calle ", "cruzando la nacion ", "cruzando el parque "
            },
            {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
            },
            {"más allá de el bosque ", "más allá de la ciudad ", "más allá de la selva "
            },
            {"al rededor de la casa ", "al rededor del parque ", "al rededor de la iglesia ", "al rededor de la cuadra "
            },
            {"cerca de la casa ", "cerca de la estación ", "cerca de el fin ", "cerca del rio "
            }
    };
    String talkspecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "
            },
            {"during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
            },
            {"until tomorrow ", "until the next day ", "until next year ", "until five "
            },
            {"among people ", "among artist ", "among teachers "
            },
            {"through the days ", "through the forest ", "through the vegetation ", "through the house "
            },
            {"in the house ", "in the fridge ", "in the year ", "in the bus ", "in the car ", "in the club "
            },
            {"for everyone ", "for you ", "for the city ", "for my friend "
            },
            {"on the table ", "on the wall ", "on the surface ", "on the roof ", "on the window "
            },
            {"by the house ", "by the station ", "by the river ", "by the park "
            },
            {"about the problems ", "about the book ", "about the situation ", "about you "
            },
            {"between the car and the house ", "between you and me ", "between two places "
            },
            {"since five ", "since this morning ", "since last year "
            },
            {"under the radar ", "under the bed ", "under the house ", "under you "
            },
            {"without you ", "without money ", "without permission "
            },
            {"behind the car ", "behind the house ", "behind the restaurant "
            },
            {"around the house ", "around the park ", "around the church ", "around the block "
            },
            {"near the house ", "near the station ", "near the end ", "near the river "
            }
    };
    String platspecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "
            },
            {"durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
            },
            {"hasta mañana ", "hasta el siguiente dia ", "hasta el siguiente año ", "hasta las cinco "
            },
            {"entre gente ", "entre artistas ", "entre maestros "
            },
            {"a través de los dias ", "a través de el bosque ", "a través de la vegetación ", "a través de la casa "
            },
            {"en la casa ", "en el refrigerador ", "en el año ", "en el camion ", "en el carro ", "en el antro "
            },
            {"para todos ", "para ti ", "para la ciudad ", "para mi amigo "
            },
            {"sobre la mesa ", "sobre la pared ", "sobre la superficie ", "sobre el techo ", "sobre la ventana "
            },
            {"por la casa ", "por la estación ", "por el rio ", "por el parque "
            },
            {"sobre el problema ", "sobre el libro ", "sobre la situación ", "sobre ti "
            },
            {"entre el carro y la casa ", "entre tu y yo ", "entre dos lugares "
            },
            {"desde las cinco ", "desde esta mañana ", "desde el año pasado "
            },
            {"por debajo del radar ", "debajo de la cama ", "por debajo de la casa ", "debajo de ti "
            },
            {"sin ti ", "sin dinero ", "sin permiso "
            },
            {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
            },
            {"al rededor de la casa ", "al rededor del parque ", "al rededor de la iglesia ", "al rededor de la cuadra "
            },
            {"cerca de la casa ", "cerca de la estación ", "cerca de el fin ", "cerca del rio "
            }
    };

    String runspecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
            },
            {"until tomorrow ", "until the next day ", "until next year ", "until five "
            },
            {"among people ", "among artist ", "among teachers "
            },
            {"through the days ", "through the forest ", "through the vegetation ", "through the house "
            },
            {"towards the house ", "towards the person ", "towards the police station ", "towards knowledge "
            },
            {"to the house ", "to the store ", "to school ", "to the concert "
            },
            {"in the house ", "in the fridge ", "in the year ", "in the bus ", "in the car ", "in the club "
            },
            {"on the table ", "on the wall ", "on the surface ", "on the roof ", "on the window "
            },
            {"by the house ", "by the station ", "by the river ", "by the park "
            },
            {"above the house ", "above the car ", "above your head "
            },
            {"between the car and the house ", "between you and me ", "between two places "
            },
            {"since five ", "since this morning ", "since last year "
            },
            {"under the radar ", "under the bed ", "under the house ", "under you "
            },
            {"without you ", "without money ", "without permission "
            },
            {"across the street ", "across the nation ", "across the park "
            },
            {"behind the car ", "behind the house ", "behind the restaurant "
            },
            {"beyond the forest ", "beyond the city ", "beyond the jugle "
            },
            {"around the house ", "around the park ", "around the church ", "around the block "
            },
            {"near the house ", "near the station ", "near the end ", "near the river "
            }
    };
    String correrspecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
            {"durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
            },
            {"hasta mañana ", "hasta el siguiente dia ", "hasta el siguiente año ", "hasta las cinco "
            },
            {"entre gente ", "entre artistas ", "entre maestros "
            },
            {"a través de los dias ", "a través de el bosque ", "a través de la vegetación ", "a través de la casa "
            },
            {"hacia la casa ", "hacia la persona ", "hacia la estación de policia ", "hacia el conocimiento "
            },
            {"a la casa ", "a la tienda ", "a la escuela ", "a el concierto "
            },
            {"en la casa ", "en el refrigerador ", "en el año ", "en el camion ", "en el carro ", "en el antro "
            },
            {"sobre la mesa ", "sobre la pared ", "sobre la superficie ", "sobre el techo ", "sobre la ventana "
            },
            {"por la casa ", "por la estación ", "por el rio ", "por el parque "
            },
            {"por encima de la casa ", "por encima de el carro ", "por encima de tu cabeza "
            },
            {"entre el carro y la casa ", "entre tu y yo ", "entre dos lugares "
            },
            {"desde las cinco ", "desde esta mañana ", "desde el año pasado "
            },
            {"por debajo del radar ", "debajo de la cama ", "por debajo de la casa ", "debajo de ti "
            },
            {"sin ti ", "sin dinero ", "sin permiso "
            },
            {"cruzando la calle ", "cruzando la nacion ", "cruzando el parque "
            },
            {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
            },
            {"más allá de el bosque ", "más allá de la ciudad ", "más allá de la selva "
            },
            {"al rededor de la casa ", "al rededor del parque ", "al rededor de la iglesia ", "al rededor de la cuadra "
            },
            {"cerca de la casa ", "cerca de la estación ", "cerca de el fin ", "cerca del rio "
            }
    };
    String movespecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
            },
            {"until tomorrow ", "until the next day ", "until next year ", "until five "
            },
            {"among people ", "among artist ", "among teachers "
            },
            {"through the days ", "through the forest ", "through the vegetation ", "through the house "
            },
            {"towards the house ", "towards the person ", "towards the police station ", "towards knowledge "
            },
            {"to the house ", "to the store ", "to school ", "to the concert "
            },
            {"in the house ", "in the fridge ", "in the year ", "in the bus ", "in the car ", "in the club "
            },
            {"for everyone ", "for you ", "for the city ", "for my friend "
            },
            {"on the table ", "on the wall ", "on the surface ", "on the roof ", "on the window "
            },
            {"without you ", "without money ", "without permission "
            },
            {"behind the car ", "behind the house ", "behind the restaurant "
            },
            {"around the house ", "around the park ", "around the church ", "around the block "
            },
            {"near the house ", "near the station ", "near the end ", "near the river "
            }
    };
    String moverspecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
            {"durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
            },
            {"hasta mañana ", "hasta el siguiente dia ", "hasta el siguiente año ", "hasta las cinco "
            },
            {"entre gente ", "entre artistas ", "entre maestros "
            },
            {"a través de los dias ", "a través de el bosque ", "a través de la vegetación ", "a través de la casa "
            },
            {"hacia la casa ", "hacia la persona ", "hacia la estación de policia ", "hacia el conocimiento "
            },
            {"a la casa ", "a la tienda ", "a la escuela ", "a el concierto "
            },
            {"en la casa ", "en el refrigerador ", "en el año ", "en el camion ", "en el carro ", "en el antro "
            },
            {"para todos ", "para ti ", "para la ciudad ", "para mi amigo "
            },
            {"sobre la mesa ", "sobre la pared ", "sobre la superficie ", "sobre el techo ", "sobre la ventana "
            },
            {"sin ti ", "sin dinero ", "sin permiso "
            },
            {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
            },
            {"al rededor de la casa ", "al rededor del parque ", "al rededor de la iglesia ", "al rededor de la cuadra "
            },
            {"cerca de la casa ", "cerca de la estación ", "cerca de el fin ", "cerca del rio "
            }
    };

    String livespecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"in the house ", "in the fridge ", "in the year ", "in the bus ", "in the car ", "in the club "
            },
            {"for everyone ", "for you ", "for the city ", "for my friend "
            },
            {"on the table ", "on the wall ", "on the surface ", "on the roof ", "on the window "
            },
            {"by the house ", "by the station ", "by the river ", "by the park "
            },
            {"between the car and the house ", "between you and me ", "between two places "
            },
            {"under the radar ", "under the bed ", "under the house ", "under you "
            },
            {"without you ", "without money ", "without permission "
            },
            {"behind the car ", "behind the house ", "behind the restaurant "
            },
            {"near the house ", "near the station ", "near the end ", "near the river "
            }
    };
    String vivspecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
            {"en la casa ", "en el refrigerador ", "en el año ", "en el camion ", "en el carro ", "en el antro "
            },
            {"para todos ", "para ti ", "para la ciudad ", "para mi amigo "
            },
            {"sobre la mesa ", "sobre la pared ", "sobre la superficie ", "sobre el techo ", "sobre la ventana "
            },
            {"por la casa ", "por la estación ", "por el rio ", "por el parque "
            },
            {"entre el carro y la casa ", "entre tu y yo ", "entre dos lugares "
            },
            {"por debajo del radar ", "debajo de la cama ", "por debajo de la casa ", "debajo de ti "
            },
            {"sin ti ", "sin dinero ", "sin permiso "
            },
            {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
            },
            {"cerca de la casa ", "cerca de la estación ", "cerca de el fin ", "cerca del rio "
            }
    };
    String sitspecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "
            },
            {"during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
            },
            {"on the table ", "on the wall ", "on the surface ", "on the roof ", "on the window "
            },
            {"between the car and the house ", "between you and me ", "between two places "
            },
            {"under the radar ", "under the bed ", "under the house ", "under you "
            },
            {"without you ", "without money ", "without permission "
            },
            {"behind the car ", "behind the house ", "behind the restaurant "
            },
            {"around the house ", "around the park ", "around the church ", "around the block "
            },
            {"near the house ", "near the station ", "near the end ", "near the river "
            }

    };
    String sentspecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "
            },
            {"durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
            },
            {"sobre la mesa ", "sobre la pared ", "sobre la superficie ", "sobre el techo ", "sobre la ventana "
            },
            {"entre el carro y la casa ", "entre tu y yo ", "entre dos lugares "
            },
            {"por debajo del radar ", "debajo de la cama ", "por debajo de la casa ", "debajo de ti "
            },
            {"sin ti ", "sin dinero ", "sin permiso "
            },
            {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
            },
            {"al rededor de la casa ", "al rededor del parque ", "al rededor de la iglesia ", "al rededor de la cuadra "
            },
            {"cerca de la casa ", "cerca de la estación ", "cerca de el fin ", "cerca del rio "
            }
    };

    String standspecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "
            },
            {"during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
            },
            {"until tomorrow ", "until the next day ", "until next year ", "until five "
            },
            {"among people ", "among artist ", "among teachers "
            },
            {"in the house ", "in the fridge ", "in the year ", "in the bus ", "in the car ", "in the club "
            },
            {"on the table ", "on the wall ", "on the surface ", "on the roof ", "on the window "
            },
            {"between the car and the house ", "between you and me ", "between two places "
            },
            {"under the radar ", "under the bed ", "under the house ", "under you "
            },
            {"without you ", "without money ", "without permission "
            },
            {"behind the car ", "behind the house ", "behind the restaurant "
            },
            {"around the house ", "around the park ", "around the church ", "around the block "
            },
            {"near the house ", "near the station ", "near the end ", "near the river "
            }

    };
    String parspecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "
            },
            {"durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
            },
            {"hasta mañana ", "hasta el siguiente dia ", "hasta el siguiente año ", "hasta las cinco "
            },
            {"entre gente ", "entre artistas ", "entre maestros "
            },
            {"en la casa ", "en el refrigerador ", "en el año ", "en el camion ", "en el carro ", "en el antro "
            },
            {"sobre la mesa ", "sobre la pared ", "sobre la superficie ", "sobre el techo ", "sobre la ventana "
            },
            {"entre el carro y la casa ", "entre tu y yo ", "entre dos lugares "
            },
            {"por debajo del radar ", "debajo de la cama ", "por debajo de la casa ", "debajo de ti "
            },
            {"sin ti ", "sin dinero ", "sin permiso "
            },
            {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
            },
            {"al rededor de la casa ", "al rededor del parque ", "al rededor de la iglesia ", "al rededor de la cuadra "
            },
            {"cerca de la casa ", "cerca de la estación ", "cerca de el fin ", "cerca del rio "
            }
    };

    String undspecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"in the house ", "in the fridge ", "in the year ", "in the bus ", "in the car ", "in the club "
            },
            {"during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
            }
    };
    String entspecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
            {"en la casa ", "en el refrigerador ", "en el año ", "en el camion ", "en el carro ", "en el antro "
            },
            {"durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
            }
    };

    String walkspecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"from the house ", "from the office ", "from the hospital "
            },
            {"during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
            },
            {"until tomorrow ", "until the next day ", "until next year ", "until five "
            },
            {"among people ", "among artist ", "among teachers "
            },
            {"through the days ", "through the forest ", "through the vegetation ", "through the house "
            },
            {"towards the house ", "towards the person ", "towards the police station ", "towards knowledge "
            },
            {"to the house ", "to the store ", "to school ", "to the concert "
            },
            {"in the house ", "in the fridge ", "in the year ", "in the bus ", "in the car ", "in the club "
            },
            {"for everyone ", "for you ", "for the city ", "for my friend "
            },
            {"on the table ", "on the wall ", "on the surface ", "on the roof ", "on the window "
            },
            {"by the house ", "by the station ", "by the river ", "by the park "
            },
            {"between the car and the house ", "between you and me ", "between two places "
            },
            {"under the radar ", "under the bed ", "under the house ", "under you "
            },
            {"without you ", "without money ", "without permission "
            },
            {"behind the car ", "behind the house ", "behind the restaurant "
            },
            {"beyond the forest ", "beyond the city ", "beyond the jugle "
            },
            {"around the house ", "around the park ", "around the church ", "around the block "
            },
            {"near the house ", "near the station ", "near the end ", "near the river "
            }

    };
    String camspecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
            {"desde la casa ", "desde la oficina ", "desde el hospital "
            },
            {"durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
            },
            {"hasta mañana ", "hasta el siguiente dia ", "hasta el siguiente año ", "hasta las cinco "
            },
            {"entre gente ", "entre artistas ", "entre maestros "
            },
            {"a través de los dias ", "a través de el bosque ", "a través de la vegetación ", "a través de la casa "
            },
            {"hacia la casa ", "hacia la persona ", "hacia la estación de policia ", "hacia el conocimiento "
            },
            {"a la casa ", "a la tienda ", "a la escuela ", "a el concierto "
            },
            {"en la casa ", "en el refrigerador ", "en el año ", "en el camion ", "en el carro ", "en el antro "
            },
            {"para todos ", "para ti ", "para la ciudad ", "para mi amigo "
            },
            {"sobre la mesa ", "sobre la pared ", "sobre la superficie ", "sobre el techo ", "sobre la ventana "
            },
            {"por la casa ", "por la estación ", "por el rio ", "por el parque "
            },
            {"entre el carro y la casa ", "entre tu y yo ", "entre dos lugares "
            },
            {"por debajo del radar ", "debajo de la cama ", "por debajo de la casa ", "debajo de ti "
            },
            {"sin ti ", "sin dinero ", "sin permiso "
            },
            {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
            },
            {"más allá de el bosque ", "más allá de la ciudad ", "más allá de la selva "
            },
            {"al rededor de la casa ", "al rededor del parque ", "al rededor de la iglesia ", "al rededor de la cuadra "
            },
            {"cerca de la casa ", "cerca de la estación ", "cerca de el fin ", "cerca del rio "
            }
    };

    String growspecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
            },
            {"until tomorrow ", "until the next day ", "until next year ", "until five "
            },
            {"among people ", "among artist ", "among teachers "
            },
            {"through the days ", "through the forest ", "through the vegetation ", "through the house "
            },
            {"in the house ", "in the fridge ", "in the year ", "in the bus ", "in the car ", "in the club "
            },
            {"on the table ", "on the wall ", "on the surface ", "on the roof ", "on the window "
            },
            {"by the house ", "by the station ", "by the river ", "by the park "
            },
            {"between the car and the house ", "between you and me ", "between two places "
            },
            {"under the radar ", "under the bed ", "under the house ", "under you "
            },
            {"without you ", "without money ", "without permission "
            },
            {"behind the car ", "behind the house ", "behind the restaurant "
            },
            {"beyond the forest ", "beyond the city ", "beyond the jugle "
            },
            {"around the house ", "around the park ", "around the church ", "around the block "
            },
            {"near the house ", "near the station ", "near the end ", "near the river "
            }

    };
    String crecspecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
            {"durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
            },
            {"hasta mañana ", "hasta el siguiente dia ", "hasta el siguiente año ", "hasta las cinco "
            },
            {"entre gente ", "entre artistas ", "entre maestros "
            },
            {"a través de los dias ", "a través de el bosque ", "a través de la vegetación ", "a través de la casa "
            },
            {"en la casa ", "en el refrigerador ", "en el año ", "en el camion ", "en el carro ", "en el antro "
            },
            {"sobre la mesa ", "sobre la pared ", "sobre la superficie ", "sobre el techo ", "sobre la ventana "
            },
            {"por la casa ", "por la estación ", "por el rio ", "por el parque "
            },
            {"entre el carro y la casa ", "entre tu y yo ", "entre dos lugares "
            },
            {"por debajo del radar ", "debajo de la cama ", "por debajo de la casa ", "debajo de ti "
            },
            {"sin ti ", "sin dinero ", "sin permiso "
            },
            {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
            },
            {"más allá de el bosque ", "más allá de la ciudad ", "más allá de la selva "
            },
            {"al rededor de la casa ", "al rededor del parque ", "al rededor de la iglesia ", "al rededor de la cuadra "
            },
            {"cerca de la casa ", "cerca de la estación ", "cerca de el fin ", "cerca del rio "
            }
    };

    String waitspecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "
            },
            {"during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
            },
            {"until tomorrow ", "until the next day ", "until next year ", "until five "
            },
            {"among people ", "among artist ", "among teachers "
            },
            {"on the table ", "on the wall ", "on the surface ", "on the roof ", "on the window "
            },
            {"by the house ", "by the station ", "by the river ", "by the park "
            },
            {"between the car and the house ", "between you and me ", "between two places "
            },
            {"under the radar ", "under the bed ", "under the house ", "under you "
            },
            {"without you ", "without money ", "without permission "
            },
            {"behind the car ", "behind the house ", "behind the restaurant "
            },
            {"beyond the forest ", "beyond the city ", "beyond the jugle "
            },
            {"around the house ", "around the park ", "around the church ", "around the block "
            },
            {"near the house ", "near the station ", "near the end ", "near the river "
            }
    };
    String espspecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "
            },
            {"durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
            },
            {"hasta mañana ", "hasta el siguiente dia ", "hasta el siguiente año ", "hasta las cinco "
            },
            {"entre gente ", "entre artistas ", "entre maestros "
            },
            {"sobre la mesa ", "sobre la pared ", "sobre la superficie ", "sobre el techo ", "sobre la ventana "
            },
            {"por la casa ", "por la estación ", "por el rio ", "por el parque "
            },
            {"entre el carro y la casa ", "entre tu y yo ", "entre dos lugares "
            },
            {"por debajo del radar ", "debajo de la cama ", "por debajo de la casa ", "debajo de ti "
            },
            {"sin ti ", "sin dinero ", "sin permiso "
            },
            {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
            },
            {"más allá de el bosque ", "más allá de la ciudad ", "más allá de la selva "
            },
            {"al rededor de la casa ", "al rededor del parque ", "al rededor de la iglesia ", "al rededor de la cuadra "
            },
            {"cerca de la casa ", "cerca de la estación ", "cerca de el fin ", "cerca del rio "
            }
    };

    String diespecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "
            },
            {"during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
            },
            {"among people ", "among artist ", "among teachers "
            },
            {"on the table ", "on the wall ", "on the surface ", "on the roof ", "on the window "
            },
            {"for everyone ", "for you ", "for the city ", "for my friend "
            },
            {"by the house ", "by the station ", "by the river ", "by the park "
            },
            {"between the car and the house ", "between you and me ", "between two places "
            },
            {"under the radar ", "under the bed ", "under the house ", "under you "
            },
            {"without you ", "without money ", "without permission "
            },
            {"behind the car ", "behind the house ", "behind the restaurant "
            },
            {"beyond the forest ", "beyond the city ", "beyond the jugle "
            },
            {"around the house ", "around the park ", "around the church ", "around the block "
            },
            {"near the house ", "near the station ", "near the end ", "near the river "
            }
    };
    String morirspecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "
            },
            {"durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
            },
            {"entre gente ", "entre artistas ", "entre maestros "
            },
            {"sobre la mesa ", "sobre la pared ", "sobre la superficie ", "sobre el techo ", "sobre la ventana "
            },
            {"para todos ", "para ti ", "para la ciudad ", "para mi amigo "
            },
            {"por la casa ", "por la estación ", "por el rio ", "por el parque "
            },
            {"entre el carro y la casa ", "entre tu y yo ", "entre dos lugares "
            },
            {"por debajo del radar ", "debajo de la cama ", "por debajo de la casa ", "debajo de ti "
            },
            {"sin ti ", "sin dinero ", "sin permiso "
            },
            {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
            },
            {"más allá de el bosque ", "más allá de la ciudad ", "más allá de la selva "
            },
            {"al rededor de la casa ", "al rededor del parque ", "al rededor de la iglesia ", "al rededor de la cuadra "
            },
            {"cerca de la casa ", "cerca de la estación ", "cerca de el fin ", "cerca del rio "
            }
    };

    String stayspecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "
            },
            {"during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
            },
            {"among people ", "among artist ", "among teachers "
            },
            {"on the table ", "on the wall ", "on the surface ", "on the roof ", "on the window "
            },
            {"for everyone ", "for you ", "for the city ", "for my friend "
            },
            {"by the house ", "by the station ", "by the river ", "by the park "
            },
            {"between the car and the house ", "between you and me ", "between two places "
            },
            {"under the radar ", "under the bed ", "under the house ", "under you "
            },
            {"without you ", "without money ", "without permission "
            },
            {"behind the car ", "behind the house ", "behind the restaurant "
            },
            {"beyond the forest ", "beyond the city ", "beyond the jugle "
            },
            {"around the house ", "around the park ", "around the church ", "around the block "
            },
            {"near the house ", "near the station ", "near the end ", "near the river "
            }
    };
    String quedspecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "
            },
            {"durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
            },
            {"entre gente ", "entre artistas ", "entre maestros "
            },
            {"sobre la mesa ", "sobre la pared ", "sobre la superficie ", "sobre el techo ", "sobre la ventana "
            },
            {"para todos ", "para ti ", "para la ciudad ", "para mi amigo "
            },
            {"por la casa ", "por la estación ", "por el rio ", "por el parque "
            },
            {"entre el carro y la casa ", "entre tu y yo ", "entre dos lugares "
            },
            {"por debajo del radar ", "debajo de la cama ", "por debajo de la casa ", "debajo de ti "
            },
            {"sin ti ", "sin dinero ", "sin permiso "
            },
            {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
            },
            {"más allá de el bosque ", "más allá de la ciudad ", "más allá de la selva "
            },
            {"al rededor de la casa ", "al rededor del parque ", "al rededor de la iglesia ", "al rededor de la cuadra "
            },
            {"cerca de la casa ", "cerca de la estación ", "cerca de el fin ", "cerca del rio "
            }};

    String fallspecial[][] = {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "
            },
            {"from the house ", "from the office ", "from the hospital "
            },
            {"during the year ", "during the day ", "during the hour ", " during the school year ", "during the riots "
            },
            {"among people ", "among artist ", "among teachers "
            },
            {"through the days ", "through the forest ", "through the vegetation ", "through the house "
            },
            {"towards the house ", "towards the person ", "towards the police station ", "towards knowledge "
            },
            {"in the house ", "in the fridge ", "in the year ", "in the bus ", "in the car ", "in the club "
            },
            {"on the table ", "on the wall ", "on the surface ", "on the roof ", "on the window "
            },
            {"between the car and the house ", "between you and me ", "between two places "
            },
            {"under the radar ", "under the bed ", "under the house ", "under you "
            },
            {"without you ", "without money ", "without permission "
            },
            {"across the street ", "across the nation ", "across the park "
            },
            {"behind the car ", "behind the house ", "behind the restaurant "
            },
            {"around the house ", "around the park ", "around the church ", "around the block "
            }
    };
    String caerspecial[][] = {
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "
            },
            {"de la casa ", "de la oficina ", "de el hospital "
            },
            {"durante el año ", "durante el dia ", "durante la hora ", "durante el año escolar ", "durante los disturbios "
            },
            {"entre gente ", "entre artistas ", "entre maestros "
            },
            {"a través de los dias ", "a través de el bosque ", "a través de la vegetación ", "a través de la casa "
            },
            {"hacia la casa ", "hacia la persona ", "hacia la estación de policia ", "hacia el conocimiento "
            },
            {"en la casa ", "en el refrigerador ", "en el año ", "en el camion ", "en el carro ", "en el antro "
            },
            {"sobre la mesa ", "sobre la pared ", "sobre la superficie ", "sobre el techo ", "sobre la ventana "
            },
            {"entre el carro y la casa ", "entre tu y yo ", "entre dos lugares "
            },
            {"por debajo del radar ", "debajo de la cama ", "por debajo de la casa ", "debajo de ti "
            },
            {"sin ti ", "sin dinero ", "sin permiso "
            },
            {"cruzando la calle ", "cruzando la nacion ", "cruzando el parque "
            },
            {"atras de el carro ", "atras de la casa ", "atras de el restaurante "
            },
            {"al rededor de la casa ", "al rededor del parque ", "al rededor de la iglesia ", "al rededor de la cuadra "
            }


    };
    //with, at, during, until,among,in,by,since,under,around,near- verbos nobles preps
    String noblesspecial[][]={ {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
            "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
            "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
            "con gente ", "con la gente ",
            "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
            "con el maestro ", "con mi amigo ",
            "con mi primo ", "con el papá ", "con la mamá "
    },
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "
            },
            {"en la casa ", "en el refrigerador ", "en el año ", "en el camion ", "en el carro ", "en el antro "
            }

    };
    String noblesspecialeng[][]= {   {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
            "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
            "with the woman ",
            "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
            "with the people ", "with a nurse ",
            "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
            "with my friend ", "with my cousin ", "with the father ", "with the mother "
    },
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "
            },
            {"in the house ", "in the fridge ", "in the year ", "in the bus ", "in the car ", "in the club "
            }
    };

    //verbos abstractos preps
    String absspecial[][]={
            {"en la casa ", "en el refrigerador ", "en el año ", "en el camion ", "en el carro ", "en el antro "
            },
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
    };
    String absspecialeng[][]= {
            {"in the house ", "in the fridge ", "in the year ", "in the bus ", "in the car ", "in the club "
            },
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
    };

    //verbos people preps
    String peoplespecial[][]={
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "
            },
    };
    String peoplespecialeng[][]= {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "
            },
    };

    //Verbos Oo preps
    String Oospecial[][]={
            {"con la familia ", "con la esposa ", "con los niños ", "con niños ", "con hombres ", "con un hombre ",
                    "con el doctor ", "con un bebé ", "con el bebé ", "con la bibliotecaria ", "con una mujer ",
                    "con la mujer ", "con el dentista ", "con el cartero ", "con el bombero ",
                    "con gente ", "con la gente ",
                    "con una enfermera ", "con la enfermera ", "con el manager ", "con el jefe ",
                    "con el maestro ", "con mi amigo ",
                    "con mi primo ", "con el papá ", "con la mamá "
            },
            {"en el restaurante (pero no dentro) ",
                    "en la escuela (pero no dentro) ", "en la casa (pero no dentro) ",
                    "en el concierto (pero no dentro) ",
                    "en la tienda (pero no dentro) ", "en la iglesia (pero no dentro) ",
                    "en el hospital (pero no dentro) ",
                    "en la oficina (pero no dentro) ", "en la estación (pero no dentro) "
            },
    };
    String Oospecialeng[][]= {
            {"with the family ", "with the wife ", "with the children ", "with children ", "with men ", "with a man ",
                    "with the doctor ", "with a baby ", "with the baby ", "with the librarian ", "with a woman ",
                    "with the woman ",
                    "with the dentist ", "with the mailman ", "with the fireman ", "with people ",
                    "with the people ", "with a nurse ",
                    "with the nurse ", "with the manager ", "with the boss ", "with the teacher ",
                    "with my friend ", "with my cousin ", "with the father ", "with the mother "
            },
            {"at the restaurant ", "at school ", "at the house ", "at the concert ",
                    "at the store ", "at church ", "at the hospital ",
                    "at the office ", "at the station "
            },
    };

    String PhrasalVerb[]={
            "break ","bring ","call ","come ","cut ","do ","fall ",
            "get ","give ","go ","have ","keep ","let ","look ",
            "make ","pull ","put ","run ","see ","stand ","take ",
            "throw ","turn "
    };

    String PhrasalVerbEng[][]={
            {
                 "away ","down ","for ","in ","into ",
                    "off ","out ","through ","up "
            },
            {
                "about ","along ","around ","back ","down ",
                    "forth ","forward ","in ","into ","off ",
                    "on ","out ","over to ","round ","to ",
                    "together ","up "
            },
            {
                "around ","at ","away ","down ","for ",
                    "forth ","in ","off ","on ","out ",
                    "over ","up ","upon "
            },
            {
                "about ","across ","along ","apart ","at ",
                    "away ","back ","before ","between ",
                    "by ","down ","forth ","forward ",
                    "in for ","into ","loose ","of ",
                    "off ","out ","over ","round ",
                    "through ","to ","up ","upon "
            },
            {
                "across ","back on ","down ","in ",
                    "off ","out ","through ","up "
            },
            {
                "away with ","down ","for ","in ",
                    "out ","over ","up ","with ",
                    "without "
            },
            {
                "about ","apart ","away ","back ",
                    "behind ","down ","for ","in ",
                    "into ","off ","upon ","out ",
                    "over ","through ","to ","under "
            },
            {
                "about ","above ","across ","after ",
                    "ahead ","along with ","around ",
                    "at ","away ","back ","behind ",
                    "by ","down ","in ","into ",
                    "off ","off ","on ","out ","over ",
                    "rid of ","round ","through ","to ",
                    "together ","up "
            },
            {
                "away ","back ","in ","off ","onto ",
                    "out ","over to ","up "
            },
            {
                "about ","across ","along ","at ","back ",
                    "before ","by ","down ","for ","forward ",
                    "in ","into ","off ","on ","out ","round ",
                    "through ","to ","together ","towards ",
                    "under ","up against ","with ","without "
            },
            {
                "against ","around ","down as ","in ","off ",
                    "on ","out with ","over ","up "
            },
            {
                "ahead ","at ","away ","back ","down ","from ",
                    "in ","off ","on ","out ","to ","up "
            },
            {
                "down ","in ","into ","off ","on ","out ",
                    "up "
            },
            {
                "after ","away ","back on ","down on ",
                    "for ","forward to ","in on ","into ",
                    "on ","over ","round ","through ","to ",
                    "up "
            },
            {
                "after ","away with ","for ","of ","out ",
                    "over ","up "
            },
            {
                "ahead ","apart ","at ","away ","back ","down ",
                    "for ","in ","off ","on ","out of ","over ",
                    "through ","to ","together ","up "
            },
            {
                "across ","aside ","at ","away ","back ","before ",
                    "behind ","by ","down ","forth ","forward ",
                    "in ","off ","on ","out ","through ","to ",
                    "together ","towards ","under ","up "
            },
            {
                "across ","after ","around ","away ","by ",
                    "down ","for ","in ","into ","off ","on ",
                    "out ","over ","through ","to ","up "
            },
            {
                "about ","in ","into ","off ","out ","over ",
                    "through ","to "
            },
            {
                "about ","against ","apart ","aside ","back ",
                    "down ","forth ","in ","off ","on ",
                    "out ","to ","up "
            },
            {
                "about ","down ","for ","in for ","off ","out ",
                "over ","to ","up "
            },
            {
                "aback ","after ","along ","apart ","around ",
                    "aside ","away ","back ","care of ","down ",
                    "for ","in ","off ","on ","out ","over ",
                    "through ","to ","up ","upon "
            },
            {
                "away ","down ","in ","off ","on ","over ","together ",
                    "up "
            },
            {
                "against ","around ","away ","back ","down ","in ",
                "inside out ","into ","off ","on ","out ","over ","to ",
                    "up ","upside down "
            }
    };

    String PhrasalVerbEsp1[][]={
            {
                "me separo ","me rompo ","corro hacia ","fuerzo ","irrumpo ",
                    "termino ","me escapo ","me abro paso ","me deshice "
            },
            {
                "provoco ","traigo ","persuado ","devuelvo ","derribo ",
                    "doy a luz ","presento ","traigo ","hablo sobre ",
                    "logro ","causo ","publicar ","persuado a ",
                    "convenzo ","reanimo ","reconcilio ","menciono "
            }
    };

    String PhrasalVerbEsp2[][]={
            {
                    "te separas ","te rompes ","corres hacia ","fuerzas ","irrumpes ",
                    "terminas ","te escapas ","te abres paso ","te deshaces "
            },
            {
                    "provocas ","traigas ","persuades ","devuelves ","derribas ",
                    "das a luz ","presentas ","traes ","hablas sobre ",
                    "logras ","causas ","publicas ","persuades a ",
                    "convences ","reanimas ","reconcilias ","mencionas "
            }
    };

    String PhrasalVerbEsp3[][]={
            {
                    "se separa ","se rompe ","corre hacia ","fuerza ","irrumpe ",
                    "termina ","se escapa ","se abre paso ","se deshace "
            },
            {
                    "provoca ","trae ","persuade ","devuelve ","derriba ",
                    "da a luz ","presenta ","trae ","habla sobre ",
                    "logra ","causa ","publica ","persuade a ",
                    "convence ","reanima ","reconcilia ","menciona "
            }
    };

    String PhrasalVerbEsp4[][]={
            {
                    "se separan ","se rompen ","corren hacia ","fuerzan ","irrumpen ",
                    "terminan ","se escapan ","se abren paso ","se deshacen "
            },
            {
                    "provocan ","traen ","persuaden ","devuelven ","derriban ",
                    "dan a luz ","presentan ","traen ","hablan sobre ",
                    "logran ","causan ","publican ","persuaden a ",
                    "convencen ","reaniman ","reconcilian ","mencionan "
            }
    };

    String PhrasalVerbEsp5[][]={
            {
                    "nos separaremos ","nos romperemos ","correremos hacia ","forzaremos ","irrumpiremos ",
                    "terminaremos ","nos escaparemos ","nos abriremos paso ","nos deshacemos "
            },
            {
                    "provocamos ","traemos ","persuadimos ","devuelvemos ","derribamos ",
                    "damos a luz ","presentamos ","traemos ","hablamos sobre ",
                    "logramos ","causamos ","publicamos ","persuadimos a ",
                    "convencemos ","reanimamos ","reconciliamos ","mencionamos "
            }
    };

    String arrayEsp;
    String arrayEng;

    public void randstarter() {
        randvcb = (int) (Math.random() * vcb.length);
        randPV = (int) (Math.random() * PhrasalVerb.length);
        rand = (int) (Math.random() * gen.vib.length);
        rand2 = (int) (Math.random() * gen.pronombres.length);
        rand3 = (int) (Math.random() * gospecial.length);
        rand4 = (int) (Math.random() * gospecial[rand3].length);
        r5 = (int) (Math.random() * thinkspecial.length);
        r6 = (int) (Math.random() * thinkspecial[r5].length);
        r7 = (int) (Math.random() * comespecial.length);
        r8 = (int) (Math.random() * comespecial[r7].length);
        r9 = (int) (Math.random() * lookspecial.length);
        r10 = (int) (Math.random() * lookspecial[r9].length);
        r11 = (int) (Math.random() * workspecial.length);
        r12 = (int) (Math.random() * workspecial[r11].length);
        r13 = (int) (Math.random() * playspecial.length);
        r14 = (int) (Math.random() * playspecial[r13].length);
        r15 = (int) (Math.random() * talkspecial.length);
        r16 = (int) (Math.random() * talkspecial[r15].length);
        r17 = (int) (Math.random() * runspecial.length);
        r18 = (int) (Math.random() * runspecial[r17].length);
        r19 = (int) (Math.random() * moverspecial.length);
        r20 = (int) (Math.random() * moverspecial[r19].length);
        r21 = (int) (Math.random() * livespecial.length);
        r22 = (int) (Math.random() * livespecial[r21].length);
        r23 = (int) (Math.random() * sitspecial.length);
        r24 = (int) (Math.random() * sitspecial[r23].length);
        r25 = (int) (Math.random() * standspecial.length);
        r26 = (int) (Math.random() * standspecial[r25].length);
        r27 = (int) (Math.random() * undspecial.length);
        r28 = (int) (Math.random() * undspecial[r27].length);
        r29 = (int) (Math.random() * walkspecial.length);
        r30 = (int) (Math.random() * walkspecial[r29].length);
        r31 = (int) (Math.random() * growspecial.length);
        r32 = (int) (Math.random() * growspecial[r31].length);
        r33 = (int) (Math.random() * waitspecial.length);
        r34 = (int) (Math.random() * waitspecial[r33].length);
        r35 = (int) (Math.random() * diespecial.length);
        r36 = (int) (Math.random() * diespecial[r35].length);
        r37 = (int) (Math.random() * stayspecial.length);
        r38 = (int) (Math.random() * stayspecial[r37].length);
        r39 = (int) (Math.random() * fallspecial.length);
        r40 = (int) (Math.random() * fallspecial[r39].length);

        rPv1 = (int) (Math.random() * PhrasalVerbEng[0].length);
    }

    public void arraySpe(){
        String temp = gen.vib[rand];

        switch (temp){
            case "go ":
                arrayEsp = irspecial[rand3][rand4];
                arrayEng = gospecial[rand3][rand4];
                break;
            case "think ":
                arrayEsp = penspecial[r5][r6];
                arrayEng = thinkspecial[r5][r6];
                break;
            case "come ":
                arrayEsp = venspecial[r7][r8];
                arrayEng = comespecial[r7][r8];
                break;
            case "look ":
                arrayEsp = miraspecial[r9][r10];
                arrayEng = lookspecial[r9][r10];
                break;
            case "work ":
                arrayEsp = trabspecial[r11][r12];
                arrayEng = workspecial[r11][r12];
                break;
            case "play ":
                arrayEsp = jugspecial[r13][r14];
                arrayEng = playspecial[r13][r14];
                break;
            case "talk ":
                arrayEsp = platspecial[r15][r16];
                arrayEng = talkspecial[r15][r16];
                break;
            case "run ":
                arrayEsp = correrspecial[r17][r18];
                arrayEng = runspecial[r17][r18];
                break;
            case "move ":
                arrayEsp = moverspecial[r19][r20];
                arrayEng = movespecial[r19][r20];
                break;
            case "live ":
                arrayEsp = vivspecial[r21][r22];
                arrayEng = livespecial[r21][r22];
                break;
            case "sit ":
                arrayEsp = sentspecial[r23][r24];
                arrayEng = sitspecial[r23][r24];
                break;
            case "stand ":
                arrayEsp = parspecial[r25][r26];
                arrayEng = standspecial[r25][r26];
                break;
            case "understand ":
                arrayEsp = entspecial[r27][r28];
                arrayEng = undspecial[r27][r28];
                break;
            case "walk ":
                arrayEsp = camspecial[r29][r30];
                arrayEng = walkspecial[r29][r30];
                break;
            case "grow ":
                arrayEsp = crecspecial[r31][r32];
                arrayEng = growspecial[r31][r32];
                break;
            case "wait ":
                arrayEsp = espspecial[r33][r34];
                arrayEng = waitspecial[r33][r34];
                break;
            case "die ":
                arrayEsp = morirspecial[r35][r36];
                arrayEng = diespecial[r35][r36];
                break;
            case "stay ":
                arrayEsp = quedspecial[r37][r38];
                arrayEng = stayspecial[r37][r38];
                break;
            case "fall ":
                arrayEsp = caerspecial[r39][r40];
                arrayEng = fallspecial[r39][r40];
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

    //DIFICULTAD 3
    //presentes
    public void GenPresSimp1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg){
                    case 0:
                        sp1 = "yo " + gen.vib1[rand];
                        eng1 = "I " + gen.vib[rand];
                        eng12 = "I " + gen.vib[rand];
                        sp2 = "tú " + gen.vib2[rand];
                        eng2 = "you " + gen.vib[rand];
                        eng22 = "you " + gen.vib[rand];
                        sp3 = "él " + gen.vib3esp[rand];
                        eng3 = "he " + gen.vib[rand];
                        eng32 = "he " + gen.vib[rand];
                        sp4 = "ella " + gen.vib3esp[rand];
                        eng4 = "she " + gen.vib[rand];
                        eng42 = "she " + gen.vib[rand];
                        sp5 = "eso " + gen.vib3esp[rand];
                        eng5 = "it " + gen.vib[rand];
                        eng52 = "it " + gen.vib[rand];
                        sp6 = "ellos " + gen.vib3p[rand];
                        eng6 = "they " + gen.vib[rand];
                        eng62 = "they " + gen.vib[rand];
                        sp7 = "nosotros " + gen.vibnos[rand];
                        eng7 = "we " + gen.vib[rand];
                        eng72 = "we " + gen.vib[rand];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + gen.vib1[rand];
                        eng1 = "I do not " + gen.vib[rand];
                        eng12 = "I don't " + gen.vib[rand];
                        sp2 = "tú " + "no " + gen.vib2[rand];
                        eng2 = "you do not " + gen.vib[rand];
                        eng22 = "you don't " + gen.vib[rand];
                        sp3 = "él no " + gen.vib3esp[rand];
                        eng3 = "he does not " + gen.vib[rand];
                        eng32 = "he doesn't " + gen.vib[rand];
                        sp4 = "ella no " + gen.vib3esp[rand];
                        eng4 = "she does not " + gen.vib[rand];
                        eng42 = "she doesn't " + gen.vib[rand];
                        sp5 = "eso no " + gen.vib3esp[rand];
                        eng5 = "it does not " + gen.vib[rand];
                        eng52 = "it doesn't " + gen.vib[rand];
                        sp6 = "ellos " + "no " + gen.vib3p[rand];
                        eng6 = "they do not " + gen.vib[rand];
                        eng62 = "they don't " + gen.vib[rand];
                        sp7 = "nosotros " + "no " + gen.vibnos[rand];
                        eng7 = "we do not " + gen.vib[rand];
                        eng72 = "we don't " + gen.vib[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenPresCont1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estoy " + gen.vib3contesp[rand];
                        eng1 = "I am " + gen.vib3cont[rand];
                        eng12 = "I'm " + gen.vib3cont[rand];
                        sp2 = "tú estás " + gen.vib3contesp[rand];
                        eng2 = "you are " + gen.vib3cont[rand];
                        eng22 = "you're " + gen.vib3cont[rand];
                        sp3 = "él está " + gen.vib3contesp[rand];
                        eng3 = "he is " + gen.vib3cont[rand];
                        eng32 = "he's " + gen.vib3cont[rand];
                        sp4 = "ella está " + gen.vib3contesp[rand];
                        eng4 = "she is " + gen.vib3cont[rand];
                        eng42 = "she's " + gen.vib3cont[rand];
                        sp5 = "eso está " + gen.vib3contesp[rand];
                        eng5 = "it is " + gen.vib3cont[rand];
                        eng52 = "it's " + gen.vib3cont[rand];
                        sp6 = "ellos están " + gen.vib3contesp[rand];
                        eng6 = "they are " + gen.vib3cont[rand];
                        eng62 = "they're " + gen.vib3cont[rand];
                        sp7 = "nosotros estamos " + gen.vib3contesp[rand];
                        eng7 = "we are " + gen.vib3cont[rand];
                        eng72 = "we're " + gen.vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no estoy " + gen.vib3contesp[rand];
                        eng1 = "I am not " + gen.vib3cont[rand];
                        eng12 = "I'm not " + gen.vib3cont[rand];
                        sp2 = "tú no estás " + gen.vib3contesp[rand];
                        eng2 = "you are not " + gen.vib3cont[rand];
                        eng22 = "you aren't " + gen.vib3cont[rand];
                        sp3 = "él no está " + gen.vib3contesp[rand];
                        eng3 = "he is not " + gen.vib3cont[rand];
                        eng32 = "he isn't " + gen.vib3cont[rand];
                        sp4 = "ella no está " + gen.vib3contesp[rand];
                        eng4 = "she is not " + gen.vib3cont[rand];
                        eng42 = "she isn't " + gen.vib3cont[rand];
                        sp5 = "eso no está " + gen.vib3contesp[rand];
                        eng5 = "it is not " + gen.vib3cont[rand];
                        eng52 = "it isn't " + gen.vib3cont[rand];
                        sp6 = "ellos no están " + gen.vib3contesp[rand];
                        eng6 = "they are not  " + gen.vib3cont[rand];
                        eng62 = "they aren't  " + gen.vib3cont[rand];
                        sp7 = "nosotros no estamos " + gen.vib3contesp[rand];
                        eng7 = "we are not  " + gen.vib3cont[rand];
                        eng72 = "we aren't  " + gen.vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPresPerf1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo he " + gen.vibparticipiosp[rand];
                        eng1 = "I have " + gen.viparticiple[rand];
                        eng12 = "I've " + gen.viparticiple[rand];
                        sp2 = "tú has " + gen.vibparticipiosp[rand];
                        eng2 = "you have " + gen.viparticiple[rand];
                        eng22 = "you've " + gen.viparticiple[rand];
                        sp3 = "él ha " + gen.vibparticipiosp[rand];
                        eng3 = "he has " + gen.viparticiple[rand];
                        eng32 = "he's " + gen.viparticiple[rand];
                        sp4 = "ella ha " + gen.vibparticipiosp[rand];
                        eng4 = "she has " + gen.viparticiple[rand];
                        eng42 = "she's " + gen.viparticiple[rand];
                        sp5 = "eso ha " + gen.vibparticipiosp[rand];
                        eng5 = "it has " + gen.viparticiple[rand];
                        eng52 = "it's " + gen.viparticiple[rand];
                        sp6 = "ellos han " + gen.vibparticipiosp[rand];
                        eng6 = "they have " + gen.viparticiple[rand];
                        eng62 = "they've " + gen.viparticiple[rand];
                        sp7 = "nosotros hemos " + gen.vibparticipiosp[rand];
                        eng7 = "we have " + gen.viparticiple[rand];
                        eng72 = "we've " + gen.viparticiple[rand];
                        break;
                    case 1:
                        sp1 = "yo no he " + gen.vibparticipiosp[rand];
                        eng1 = "I have not " + gen.viparticiple[rand];
                        eng12 = "I haven't " + gen.viparticiple[rand];
                        sp2 = "tú no has " + gen.vibparticipiosp[rand];
                        eng2 = "you have not " + gen.viparticiple[rand];
                        eng22 = "you haven't " + gen.viparticiple[rand];
                        sp3 = "él no ha " + gen.vibparticipiosp[rand];
                        eng3 = "he has not " + gen.viparticiple[rand];
                        eng32 = "he hasn't " + gen.viparticiple[rand];
                        sp4 = "ella no ha " + gen.vibparticipiosp[rand];
                        eng4 = "she has not " + gen.viparticiple[rand];
                        eng42 = "she hasn't " + gen.viparticiple[rand];
                        sp5 = "eso no ha " + gen.vibparticipiosp[rand];
                        eng5 = "it has not " + gen.viparticiple[rand];
                        eng52 = "it hasn't " + gen.viparticiple[rand];
                        sp6 = "ellos no han " + gen.vibparticipiosp[rand];
                        eng6 = "they have not  " + gen.viparticiple[rand];
                        eng62 = "they haven't  " + gen.viparticiple[rand];
                        sp7 = "nosotros no hemos " + gen.vibparticipiosp[rand];
                        eng7 = "we have not  " + gen.viparticiple[rand];
                        eng72 = "we haven't  " + gen.viparticiple[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenPresPerfCont1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo he estado " + gen.vib3contesp[rand];
                        eng1 = "I have been " + gen.vib3cont[rand];
                        sp2 = "tú has estado " + gen.vib3contesp[rand];
                        eng2 = "you have been " + gen.vib3cont[rand];
                        sp3 = "él ha estado " + gen.vib3contesp[rand];
                        eng3 = "he has been " + gen.vib3cont[rand];
                        sp4 = "ella ha estado " + gen.vib3contesp[rand];
                        eng4 = "she has been " + gen.vib3cont[rand];
                        sp5 = "eso ha estado " + gen.vib3contesp[rand];
                        eng5 = "it has been " + gen.vib3cont[rand];
                        sp6 = "ellos han estado " + gen.vib3contesp[rand];
                        eng6 = "they have been " + gen.vib3cont[rand];
                        sp7 = "nosotros hemos estado " + gen.vib3contesp[rand];
                        eng7 = "we have been " + gen.vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no he estado " + gen.vib3contesp[rand];
                        eng1 = "I haven't been " + gen.vib3cont[rand];
                        sp2 = "tú no has estado " + gen.vib3contesp[rand];
                        eng2 = "you haven't been " + gen.vib3cont[rand];
                        sp3 = "él no ha estado " + gen.vib3contesp[rand];
                        eng3 = "he hasn't been " + gen.vib3cont[rand];
                        sp4 = "ella no ha estado " + gen.vib3contesp[rand];
                        eng4 = "she hasn't been " + gen.vib3cont[rand];
                        sp5 = "eso no ha estado " + gen.vib3contesp[rand];
                        eng5 = "it hasn't been " + gen.vib3cont[rand];
                        sp6 = "ellos no han estado " + gen.vib3contesp[rand];
                        eng6 = "they haven't been " + gen.vib3cont[rand];
                        sp7 = "nosotros no hemos estado " + gen.vib3contesp[rand];
                        eng7 = "we haven't been " + gen.vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Pasados
    public void GenPassSimp1() {
        gen = new Generator();
        Pasts pas = new Pasts();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 4);


        for (String verbs : gen.vib) {
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
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estaba " + gen.vib3contesp[rand];
                        eng1 = "I was " + gen.vib3cont[rand];
                        eng12 = "I was " + gen.vib3cont[rand];
                        sp2 = "tú estabas " + gen.vib3contesp[rand];
                        eng2 = "you were " + gen.vib3cont[rand];
                        eng22 = "you were " + gen.vib3cont[rand];
                        sp3 = "él estaba " + gen.vib3contesp[rand];
                        eng3 = "he was " + gen.vib3cont[rand];
                        eng32 = "he was " + gen.vib3cont[rand];
                        sp4 = "ella estaba " + gen.vib3contesp[rand];
                        eng4 = "she was " + gen.vib3cont[rand];
                        eng42 = "she was " + gen.vib3cont[rand];
                        sp5 = "eso estaba " + gen.vib3contesp[rand];
                        eng5 = "it was " + gen.vib3cont[rand];
                        eng52 = "it was " + gen.vib3cont[rand];
                        sp6 = "ellos estaban " + gen.vib3contesp[rand];
                        eng6 = "they were " + gen.vib3cont[rand];
                        eng62 = "they were " + gen.vib3cont[rand];
                        sp7 = "nosotros estabamos " + gen.vib3contesp[rand];
                        eng7 = "we were " + gen.vib3cont[rand];
                        eng72 = "we were " + gen.vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no estaba " + gen.vib3contesp[rand];
                        eng1 = "I was not " + gen.vib3cont[rand];
                        eng12 = "I wasn't " + gen.vib3cont[rand];
                        sp2 = "tú no estabas " + gen.vib3contesp[rand];
                        eng2 = "you were not " + gen.vib3cont[rand];
                        eng22 = "you weren't " + gen.vib3cont[rand];
                        sp3 = "él no estaba " + gen.vib3contesp[rand];
                        eng3 = "he was not " + gen.vib3cont[rand];
                        eng32 = "he wasn't " + gen.vib3cont[rand];
                        sp4 = "ella no estaba " + gen.vib3contesp[rand];
                        eng4 = "she was not " + gen.vib3cont[rand];
                        eng42 = "she wasn't " + gen.vib3cont[rand];
                        sp5 = "eso no estaba " + gen.vib3contesp[rand];
                        eng5 = "it was not " + gen.vib3cont[rand];
                        eng52 = "it wasn't " + gen.vib3cont[rand];
                        sp6 = "ellos no estaban " + gen.vib3contesp[rand];
                        eng6 = "they were not  " + gen.vib3cont[rand];
                        eng62 = "they weren't  " + gen.vib3cont[rand];
                        sp7 = "nosotros no estabamos " + gen.vib3contesp[rand];
                        eng7 = "we were not  " + gen.vib3cont[rand];
                        eng72 = "we weren't  " + gen.vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPassPerf1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo habia " + gen.vibparticipiosp[rand];
                        eng1 = "I had " + gen.viparticiple[rand];
                        eng12 = "I had " + gen.viparticiple[rand];
                        sp2 = "tú habias " + gen.vibparticipiosp[rand];
                        eng2 = "you had " + gen.viparticiple[rand];
                        eng22 = "you had " + gen.viparticiple[rand];
                        sp3 = "él habia " + gen.vibparticipiosp[rand];
                        eng3 = "he had " + gen.viparticiple[rand];
                        eng32 = "he had " + gen.viparticiple[rand];
                        sp4 = "ella habia " + gen.vibparticipiosp[rand];
                        eng4 = "she had " + gen.viparticiple[rand];
                        eng42 = "she had " + gen.viparticiple[rand];
                        sp5 = "eso habia " + gen.vibparticipiosp[rand];
                        eng5 = "it had " + gen.viparticiple[rand];
                        eng52 = "it had " + gen.viparticiple[rand];
                        sp6 = "ellos habian " + gen.vibparticipiosp[rand];
                        eng6 = "they had " + gen.viparticiple[rand];
                        eng62 = "they had " + gen.viparticiple[rand];
                        sp7 = "nosotros habiamos " + gen.vibparticipiosp[rand];
                        eng7 = "we had " + gen.viparticiple[rand];
                        eng72 = "we had " + gen.viparticiple[rand];
                        break;
                    case 1:
                        sp1 = "yo no habia " + gen.vibparticipiosp[rand];
                        eng1 = "I had not " + gen.viparticiple[rand];
                        eng12 = "I hadn't " + gen.viparticiple[rand];
                        sp2 = "tú no habias " + gen.vibparticipiosp[rand];
                        eng2 = "you had not " + gen.viparticiple[rand];
                        eng22 = "you hadn't " + gen.viparticiple[rand];
                        sp3 = "él no habia " + gen.vibparticipiosp[rand];
                        eng3 = "he had not " + gen.viparticiple[rand];
                        eng32 = "he hadn't " + gen.viparticiple[rand];
                        sp4 = "ella no habia " + gen.vibparticipiosp[rand];
                        eng4 = "she had not " + gen.viparticiple[rand];
                        eng42 = "she hadn't " + gen.viparticiple[rand];
                        sp5 = "eso no habia " + gen.vibparticipiosp[rand];
                        eng5 = "it had not " + gen.viparticiple[rand];
                        eng52 = "it hadn't " + gen.viparticiple[rand];
                        sp6 = "ellos no habian " + gen.vibparticipiosp[rand];
                        eng6 = "they had not  " + gen.viparticiple[rand];
                        eng62 = "they hadn't  " + gen.viparticiple[rand];
                        sp7 = "nosotros no habiamos " + gen.vibparticipiosp[rand];
                        eng7 = "we had not  " + gen.viparticiple[rand];
                        eng72 = "we hadn't  " + gen.viparticiple[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPassPerfCont1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo había estado " + gen.vib3contesp[rand];
                        eng1 = "I had been " + gen.vib3cont[rand];
                        sp2 = "tú habías estado " + gen.vib3contesp[rand];
                        eng2 = "you had been " + gen.vib3cont[rand];
                        sp3 = "él había estado " + gen.vib3contesp[rand];
                        eng3 = "he had been " + gen.vib3cont[rand];
                        sp4 = "ella había estado " + gen.vib3contesp[rand];
                        eng4 = "she had been " + gen.vib3cont[rand];
                        sp5 = "eso había estado " + gen.vib3contesp[rand];
                        eng5 = "it had been " + gen.vib3cont[rand];
                        sp6 = "ellos habían " + gen.vib3contesp[rand];
                        eng6 = "they had been " + gen.vib3cont[rand];
                        sp7 = "nosotros habíamos estado " + gen.vib3contesp[rand];
                        eng7 = "we had been " + gen.vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no había estado " + gen.vib3contesp[rand];
                        eng1 = "I hadn't been " + gen.vib3cont[rand];
                        sp2 = "tú no habías estado  " + gen.vib3contesp[rand];
                        eng2 = "you hadn't been " + gen.vib3cont[rand];
                        sp3 = "él no había estado " + gen.vib3contesp[rand];
                        eng3 = "he hadn't been " + gen.vib3cont[rand];
                        sp4 = "ella no había estado " + gen.vib3contesp[rand];
                        eng4 = "she hadn't been " + gen.vib3cont[rand];
                        sp5 = "eso no había estado " + gen.vib3contesp[rand];
                        eng5 = "it hadn't been " + gen.vib3cont[rand];
                        sp6 = "ellos no habían " + gen.vib3contesp[rand];
                        eng6 = "they hadn't been " + gen.vib3cont[rand];
                        sp7 = "nosotros no habíamos estado " + gen.vib3contesp[rand];
                        eng7 = "we hadn't been " + gen.vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Futuros
    public void GenFutSimp1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + gen.vib1f[rand];
                        eng1 = "I will " + gen.vib[rand];
                        sp2 = "tú " + gen.vib2f[rand];
                        eng2 = "you will " + gen.vib[rand];
                        sp3 = "él " + gen.vib3f[rand];
                        eng3 = "he will " + gen.vib[rand];
                        sp4 = "ella " + gen.vib3f[rand];
                        eng4 = "she will " + gen.vib[rand];
                        sp5 = "eso " + gen.vib3f[rand];
                        eng5 = "it will " + gen.vib[rand];
                        sp6 = "ellos " + gen.vib4f[rand];
                        eng6 = "they will " + gen.vib[rand];
                        sp7 = "nosotros " + gen.vibfnos[rand];
                        eng7 = "we will " + gen.vib[rand];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + gen.vib1f[rand];
                        eng1 = "I " + "won't " + gen.vib[rand];
                        sp2 = "tú " + "no " + gen.vib2f[rand];
                        eng2 = "you " + "won't " + gen.vib[rand];
                        sp3 = "él " + "no " + gen.vib3f[rand];
                        eng3 = "he " + "won't " + gen.vib[rand];
                        sp4 = "ella " + "no " + gen.vib3f[rand];
                        eng4 = "she " + "won't " + gen.vib[rand];
                        sp5 = "eso " + "no " + gen.vib3f[rand];
                        eng5 = "it " + "won't " + gen.vib[rand];
                        sp6 = "ellos " + "no " + gen.vib4f[rand];
                        eng6 = "they " + "won't " + gen.vib[rand];
                        sp7 = "nosotros " + "no " + gen.vibfnos[rand];
                        eng7 = "we " + "won't " + gen.vib[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenFutCont1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estaré " + gen.vib3contesp[rand];
                        eng1 = "I will be " + gen.vib3cont[rand];
                        eng12 = "I'll be " + gen.vib3cont[rand];
                        sp2 = "tú estaras " + gen.vib3contesp[rand];
                        eng2 = "you will be " + gen.vib3cont[rand];
                        eng22 = "you'll be " + gen.vib3cont[rand];
                        sp3 = "él estaré " + gen.vib3contesp[rand];
                        eng3 = "he will be " + gen.vib3cont[rand];
                        eng32 = "he'll be " + gen.vib3cont[rand];
                        sp4 = "ella estaré " + gen.vib3contesp[rand];
                        eng4 = "she will be " + gen.vib3cont[rand];
                        eng32 = "he'll be " + gen.vib3cont[rand];
                        sp5 = "eso estaré " + gen.vib3contesp[rand];
                        eng5 = "it will be " + gen.vib3cont[rand];
                        eng52 = "it'll be " + gen.vib3cont[rand];
                        sp6 = "ellos estaran " + gen.vib3contesp[rand];
                        eng6 = "they will be " + gen.vib3cont[rand];
                        eng62 = "they'll be " + gen.vib3cont[rand];
                        sp7 = "nosotros estaremos " + gen.vib3contesp[rand];
                        eng7 = "we will be " + gen.vib3cont[rand];
                        eng72 = "we'll be " + gen.vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no estaré " + gen.vib3contesp[rand];
                        eng1 = "I will not be " + gen.vib3cont[rand];
                        eng12 = "I won't be " + gen.vib3cont[rand];
                        sp2 = "tú no estaras " + gen.vib3contesp[rand];
                        eng2 = "you will not be " + gen.vib3cont[rand];
                        eng22 = "you won't be " + gen.vib3cont[rand];
                        sp3 = "él no estaré " + gen.vib3contesp[rand];
                        eng3 = "he will not be " + gen.vib3cont[rand];
                        eng32 = "he won't be " + gen.vib3cont[rand];
                        sp4 = "ella no estaré " + gen.vib3contesp[rand];
                        eng4 = "she will not be " + gen.vib3cont[rand];
                        eng42 = "she won't be " + gen.vib3cont[rand];
                        sp5 = "eso no estaré " + gen.vib3contesp[rand];
                        eng5 = "it will not be " + gen.vib3cont[rand];
                        eng52 = "it won't be " + gen.vib3cont[rand];
                        sp6 = "ellos no estaran " + gen.vib3contesp[rand];
                        eng6 = "they will not be " + gen.vib3cont[rand];
                        eng62 = "they won't be " + gen.vib3cont[rand];
                        sp7 = "nosotros no estaremos " + gen.vib3contesp[rand];
                        eng7 = "we will not be " + gen.vib3cont[rand];
                        eng72 = "we won't be " + gen.vib3cont[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenFutPerf1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo habre " + gen.vibparticipiosp[rand];
                        eng1 = "I will have " + gen.viparticiple[rand];
                        eng12 = "I'll have " + gen.viparticiple[rand];
                        sp2 = "tú habrás " + gen.vibparticipiosp[rand];
                        eng2 = "you will have " + gen.viparticiple[rand];
                        eng22 = "you'll have " + gen.viparticiple[rand];
                        sp3 = "él habrá " + gen.vibparticipiosp[rand];
                        eng3 = "he will have " + gen.viparticiple[rand];
                        eng32 = "he'll have  " + gen.viparticiple[rand];
                        sp4 = "ella habrá " + gen.vibparticipiosp[rand];
                        eng4 = "she will have " + gen.viparticiple[rand];
                        eng42 = "she'll have  " + gen.viparticiple[rand];
                        sp5 = "eso habrá " + gen.vibparticipiosp[rand];
                        eng5 = "it will have " + gen.viparticiple[rand];
                        eng52 = "it'll have  " + gen.viparticiple[rand];
                        sp6 = "ellos habrán " + gen.vibparticipiosp[rand];
                        eng6 = "they will have " + gen.viparticiple[rand];
                        eng62 = "they'll have " + gen.viparticiple[rand];
                        sp7 = "nosotros habremos "  + gen.vibparticipiosp[rand];
                        eng7 = "we will have " + gen.viparticiple[rand];
                        eng72 = "we'll have " + gen.viparticiple[rand];
                        break;
                    case 1:
                        sp1 = "yo no habre " + gen.vibparticipiosp[rand];
                        eng1 = "I will not have " + gen.viparticiple[rand];
                        eng12 = "I won't have " + gen.viparticiple[rand];
                        sp2 = "tú no habrás " + gen.vibparticipiosp[rand];
                        eng2 = "you will not have " + gen.viparticiple[rand];
                        eng22 = "you won't have " + gen.viparticiple[rand];
                        sp3 = "él no habrá " + gen.vibparticipiosp[rand];
                        eng3 = "he will not have " + gen.viparticiple[rand];
                        eng32 = "he won't have " + gen.viparticiple[rand];
                        sp4 = "ella no habrá " + gen.vibparticipiosp[rand];
                        eng4 = "she will not have " + gen.viparticiple[rand];
                        eng42 = "she won't have " + gen.viparticiple[rand];
                        sp5 = "eso no habrá " + gen.vibparticipiosp[rand];
                        eng5 = "it will not have " + gen.viparticiple[rand];
                        eng52 = "it won't have " + gen.viparticiple[rand];
                        sp6 = "ellos no habrán " + gen.vibparticipiosp[rand];
                        eng6 = "they will not have  " + gen.viparticiple[rand];
                        eng62 = "they won't have  " + gen.viparticiple[rand];
                        sp7 = "nosotros no habremos "  + gen.vibparticipiosp[rand];
                        eng7 = "we will not have  " + gen.viparticiple[rand];
                        eng72 = "we won't have  " + gen.viparticiple[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenFutPerfCont1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo habré estado " + gen.vib3contesp[rand];
                        eng1 = "I will have been " + gen.vib3cont[rand];
                        sp2 = "tú habrás estado " + gen.vib3contesp[rand];
                        eng2 = "you will have been " + gen.vib3cont[rand];
                        sp3 = "él habrá estado " + gen.vib3contesp[rand];
                        eng3 = "he will have been " + gen.vib3cont[rand];
                        sp4 = "ella habrá estado " + gen.vib3contesp[rand];
                        eng4 = "she will have been " + gen.vib3cont[rand];
                        sp5 = "eso habrá estado " + gen.vib3contesp[rand];
                        eng5 = "it will have been " + gen.vib3cont[rand];
                        sp6 = "ellos habrán estado " + gen.vib3contesp[rand];
                        eng6 = "they will have been " + gen.vib3cont[rand];
                        sp7 = "nosotros habremos estado " + gen.vib3contesp[rand];
                        eng7 = "we will have been " + gen.vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no habré estado " + gen.vib3contesp[rand];
                        eng1 = "I won't have been " + gen.vib3cont[rand];
                        sp2 = "tú no habrás estado  " + gen.vib3contesp[rand];
                        eng2 = "you won't have been " + gen.vib3cont[rand];
                        sp3 = "él no habrá estado   " + gen.vib3contesp[rand];
                        eng3 = "he won't have been " + gen.vib3cont[rand];
                        sp4 = "ella no habrá estado   " + gen.vib3contesp[rand];
                        eng4 = "she won't have been " + gen.vib3cont[rand];
                        sp5 = "eso no habrá estado   " + gen.vib3contesp[rand];
                        eng5 = "it won't have been " + gen.vib3cont[rand];
                        sp6 = "ellos no habran estado " + gen.vib3contesp[rand];
                        eng6 = "they won't have been " + gen.vib3cont[rand];
                        sp7 = "nosotros no habremos estado " + gen.vib3contesp[rand];
                        eng7 = "we won't have been " + gen.vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Would
    public void GenWouldSimp1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + gen.vib1w[rand];
                        eng1 = "I would " + gen.vib[rand];
                        sp2 = "tú " + gen.vib2w[rand];
                        eng2 = "you would " + gen.vib[rand];
                        sp3 = "él " + gen.vib3w[rand];
                        eng3 = "he would " + gen.vib[rand];
                        sp4 = "ella " + gen.vib3w[rand];
                        eng4 = "she would " + gen.vib[rand];
                        sp5 = "eso " + gen.vib3w[rand];
                        eng5 = "it would " + gen.vib[rand];
                        sp6 = "ellos " + gen.vib4w[rand];
                        eng6 = "they would " + gen.vib[rand];
                        sp7 = "nosotros " + gen.vib5w[rand];
                        eng7 = "we would " + gen.vib[rand];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + gen.vib1w[rand];
                        eng1 = "I " + "wouldn't " + gen.vib[rand];
                        sp2 = "tú " + "no " + gen.vib2w[rand];
                        eng2 = "you " + "wouldn't " + gen.vib[rand];
                        sp3 = "él " + "no " + gen.vib3w[rand];
                        eng3 = "he " + "wouldn't " + gen.vib[rand];
                        sp4 = "ella " + "no " + gen.vib3w[rand];
                        eng4 = "she " + "wouldn't " + gen.vib[rand];
                        sp5 = "eso " + "no " + gen.vib3w[rand];
                        eng5 = "it " + "wouldn't " + gen.vib[rand];
                        sp6 = "ellos " + "no " + gen.vib4w[rand];
                        eng6 = "they " + "wouldn't " + gen.vib[rand];
                        sp7 = "nosotros " + "no " + gen.vib5w[rand];
                        eng7 = "we " + "wouldn't " + gen.vib[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenWouldCont1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estaría " + gen.vib3contesp[rand];
                        eng1 = "I would be " + gen.vib3cont[rand];
                        eng12 = "I'd be " + gen.vib3cont[rand];
                        sp2 = "tú estarías " + gen.vib3contesp[rand];
                        eng2 = "you would be " + gen.vib3cont[rand];
                        eng22 = "you'd be " + gen.vib3cont[rand];
                        sp3 = "él estaría " + gen.vib3contesp[rand];
                        eng3 = "he would be " + gen.vib3cont[rand];
                        eng32 = "he'd be " + gen.vib3cont[rand];
                        sp4 = "ella estaría " + gen.vib3contesp[rand];
                        eng4 = "she would be " + gen.vib3cont[rand];
                        eng42 = "she'd be " + gen.vib3cont[rand];
                        sp5 = "eso estaría " + gen.vib3contesp[rand];
                        eng5 = "it would be " + gen.vib3cont[rand];
                        eng52 = "it'd be " + gen.vib3cont[rand];
                        sp6 = "ellos estarían " + gen.vib3contesp[rand];
                        eng6 = "they would be " + gen.vib3cont[rand];
                        eng62 = "they'd be " + gen.vib3cont[rand];
                        sp7 = "nosotros estaríamos " + gen.vib3contesp[rand];
                        eng7 = "we would be " + gen.vib3cont[rand];
                        eng72 = "we'd be " + gen.vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no estaría " + gen.vib3contesp[rand];
                        eng1 = "I would not be " + gen.vib3cont[rand];
                        eng12 = "I wouldn't be " + gen.vib3cont[rand];
                        sp2 = "tú no estarías " + gen.vib3contesp[rand];
                        eng2 = "you would not be " + gen.vib3cont[rand];
                        eng22 = "you wouldn't be " + gen.vib3cont[rand];
                        sp3 = "él no estaría " + gen.vib3contesp[rand];
                        eng3 = "he would not be " + gen.vib3cont[rand];
                        eng32 = "he wouldn't be " + gen.vib3cont[rand];
                        sp4 = "ella no estaría " + gen.vib3contesp[rand];
                        eng4 = "she would not be " + gen.vib3cont[rand];
                        eng42 = "she wouldn't be " + gen.vib3cont[rand];
                        sp5 = "eso no estaría " + gen.vib3contesp[rand];
                        eng5 = "it would not be " + gen.vib3cont[rand];
                        eng52 = "it wouldn't be " + gen.vib3cont[rand];
                        sp6 = "ellos no estarían " + gen.vib3contesp[rand];
                        eng6 = "they would not be  " + gen.vib3cont[rand];
                        eng62 = "they wouldn't be  " + gen.vib3cont[rand];
                        sp7 = "nosotros no estaríamos " + gen.vib3contesp[rand];
                        eng7 = "we would not be  " + gen.vib3cont[rand];
                        eng72 = "we wouldn't be  " + gen.vib3cont[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenWouldPerf1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo hubiera " + gen.vibparticipiosp[rand];
                        eng1 = "I would have " + gen.viparticiple[rand];
                        eng12 = "I'd have " + gen.viparticiple[rand];
                        sp2 = "tú hubieras " + gen.vibparticipiosp[rand];
                        eng2 = "you would have " + gen.viparticiple[rand];
                        eng22 = "you'd have " + gen.viparticiple[rand];
                        sp3 = "él hubiera " + gen.vibparticipiosp[rand];
                        eng3 = "he would have " + gen.viparticiple[rand];
                        eng32 = "he'd have  " + gen.viparticiple[rand];
                        sp4 = "ella hubiera " + gen.vibparticipiosp[rand];
                        eng4 = "she would have " + gen.viparticiple[rand];
                        eng42 = "she'd have  " + gen.viparticiple[rand];
                        sp5 = "eso hubiera " + gen.vibparticipiosp[rand];
                        eng5 = "it would have " + gen.viparticiple[rand];
                        eng52 = "it'd have  " + gen.viparticiple[rand];
                        sp6 = "ellos hubieran " + gen.vibparticipiosp[rand];
                        eng6 = "they would have " + gen.viparticiple[rand];
                        eng62 = "they'd have " + gen.viparticiple[rand];
                        sp7 = "nosotros habríamos "  + gen.vibparticipiosp[rand];
                        eng7 = "we would have " + gen.viparticiple[rand];
                        eng72 = "we'd have " + gen.viparticiple[rand];
                        break;
                    case 1:
                        sp1 = "yo no hubiera " + gen.vibparticipiosp[rand];
                        eng1 = "I would not have " + gen.viparticiple[rand];
                        eng12 = "I wouldn't have " + gen.viparticiple[rand];
                        sp2 = "tú no hubieras " + gen.vibparticipiosp[rand];
                        eng2 = "you would not have " + gen.viparticiple[rand];
                        eng22 = "you wouldn't have " + gen.viparticiple[rand];
                        sp3 = "él no hubiera " + gen.vibparticipiosp[rand];
                        eng3 = "he would not have " + gen.viparticiple[rand];
                        eng32 = "he wouldn't have " + gen.viparticiple[rand];
                        sp4 = "ella no hubiera " + gen.vibparticipiosp[rand];
                        eng4 = "she would not have " + gen.viparticiple[rand];
                        eng42 = "she wouldn't have " + gen.viparticiple[rand];
                        sp5 = "eso no hubiera " + gen.vibparticipiosp[rand];
                        eng5 = "it would not have " + gen.viparticiple[rand];
                        eng52 = "it wouldn't have " + gen.viparticiple[rand];
                        sp6 = "ellos no hubieran " + gen.vibparticipiosp[rand];
                        eng6 = "they would not have  " + gen.viparticiple[rand];
                        eng62 = "they wouldn't have  " + gen.viparticiple[rand];
                        sp7 = "nosotros no habríamos "  + gen.vibparticipiosp[rand];
                        eng7 = "we would not have  " + gen.viparticiple[rand];
                        eng72 = "we wouldn't have  " + gen.viparticiple[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenWouldPerfCont1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo hubiera estado " + gen.vib3contesp[rand];
                        eng1 = "I would have been " + gen.vib3cont[rand];
                        sp2 = "tú hubieras estado " + gen.vib3contesp[rand];
                        eng2 = "you would have been " + gen.vib3cont[rand];
                        sp3 = "él hubiera estado " + gen.vib3contesp[rand];
                        eng3 = "he would have been " + gen.vib3cont[rand];
                        sp4 = "ella hubiera estado " + gen.vib3contesp[rand];
                        eng4 = "she would have been " + gen.vib3cont[rand];
                        sp5 = "eso hubiera estado " + gen.vib3contesp[rand];
                        eng5 = "it would have been " + gen.vib3cont[rand];
                        sp6 = "ellos hubieran estado " + gen.vib3contesp[rand];
                        eng6 = "they would have been " + gen.vib3cont[rand];
                        sp7 = "nosotros hubiésemos estado " + gen.vib3contesp[rand];
                        eng7 = "we would have been " + gen.vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no hubiera estado " + gen.vib3contesp[rand];
                        eng1 = "I wouldn't have been " + gen.vib3cont[rand];
                        sp2 = "tú no hubieras estado  " + gen.vib3contesp[rand];
                        eng2 = "you wouldn't have been " + gen.vib3cont[rand];
                        sp3 = "él no hubiera estado   " + gen.vib3contesp[rand];
                        eng3 = "he wouldn't have been " + gen.vib3cont[rand];
                        sp4 = "ella no hubiera estado   " + gen.vib3contesp[rand];
                        eng4 = "she wouldn't have been " + gen.vib3cont[rand];
                        sp5 = "eso no hubiera estado   " + gen.vib3contesp[rand];
                        eng5 = "it wouldn't have been " + gen.vib3cont[rand];
                        sp6 = "ellos no habran estado " + gen.vib3contesp[rand];
                        eng6 = "they wouldn't have been " + gen.vib3cont[rand];
                        sp7 = "nosotros no hubiésemos estado " + gen.vib3contesp[rand];
                        eng7 = "we wouldn't have been " + gen.vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //COULD
    public void GenCouldSimp1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo podría " + gen.vibesp[rand];
                        eng1 = "I could " + gen.vib[rand];
                        sp2 = "tú podrías " + gen.vibesp[rand];
                        eng2 = "you could " + gen.vib[rand];
                        sp3 = "él podría " + gen.vibesp[rand];
                        eng3 = "he could " + gen.vib[rand];
                        sp4 = "ella podría " + gen.vibesp[rand];
                        eng4 = "she could " + gen.vib[rand];
                        sp5 = "eso podría " + gen.vibesp[rand];
                        eng5 = "it could " + gen.vib[rand];
                        sp6 = "ellos podrían " + gen.vibesp[rand];
                        eng6 = "they could " + gen.vib[rand];
                        sp7 = "nosotros podríamos " + gen.vibesp[rand];
                        eng7 = "we could " + gen.vib[rand];
                        break;
                    case 1:
                        sp1 = "yo " + "no podría " + gen.vibesp[rand];
                        eng1 = "I " + "couldn't " + gen.vib[rand];
                        sp2 = "tú " + "no podrías " + gen.vibesp[rand];
                        eng2 = "you " + "couldn't " + gen.vib[rand];
                        sp3 = "él " + "no podría " + gen.vibesp[rand];
                        eng3 = "he " + "couldn't " + gen.vib[rand];
                        sp4 = "ella " + "no podría " + gen.vibesp[rand];
                        eng4 = "she " + "couldn't " + gen.vib[rand];
                        sp5 = "eso " + "no podría " + gen.vibesp[rand];
                        eng5 = "it " + "couldn't " + gen.vib[rand];
                        sp6 = "ellos " + "no podrían " + gen.vibesp[rand];
                        eng6 = "they " + "couldn't " + gen.vib[rand];
                        sp7 = "nosotros " + "no podríamos " + gen.vibesp[rand];
                        eng7 = "we " + "couldn't " + gen.vib[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenCouldCont1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo podría estar " + gen.vib3contesp[rand];
                        eng1 = "I could be " + gen.vib3cont[rand];
                        eng12 = "I could be " + gen.vib3cont[rand];
                        sp2 = "tú podrías estar " + gen.vib3contesp[rand];
                        eng2 = "you could be " + gen.vib3cont[rand];
                        eng22 = "you could be " + gen.vib3cont[rand];
                        sp3 = "él podría estar " + gen.vib3contesp[rand];
                        eng3 = "he could be " + gen.vib3cont[rand];
                        eng32 = "he could be " + gen.vib3cont[rand];
                        sp4 = "ella podría estar " + gen.vib3contesp[rand];
                        eng4 = "she could be " + gen.vib3cont[rand];
                        eng42 = "she could be " + gen.vib3cont[rand];
                        sp5 = "eso podría estar " + gen.vib3contesp[rand];
                        eng5 = "it could be " + gen.vib3cont[rand];
                        eng52 = "it could be " + gen.vib3cont[rand];
                        sp6 = "ellos podrían estar " + gen.vib3contesp[rand];
                        eng6 = "they could be " + gen.vib3cont[rand];
                        eng62 = "they could be " + gen.vib3cont[rand];
                        sp7 = "nosotros podríamos estar " + gen.vib3contesp[rand];
                        eng7 = "we could be " + gen.vib3cont[rand];
                        eng72 = "we could be " + gen.vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no podría estar " + gen.vib3contesp[rand];
                        eng1 = "I could not be " + gen.vib3cont[rand];
                        eng12 = "I couldn't be " + gen.vib3cont[rand];
                        sp2 = "tú no podrías estar " + gen.vib3contesp[rand];
                        eng2 = "you could not be " + gen.vib3cont[rand];
                        eng22 = "you couldn't be " + gen.vib3cont[rand];
                        sp3 = "él no podría estar " + gen.vib3contesp[rand];
                        eng3 = "he could not be " + gen.vib3cont[rand];
                        eng32 = "he couldn't be " + gen.vib3cont[rand];
                        sp4 = "ella no podría estar " + gen.vib3contesp[rand];
                        eng4 = "she could not be " + gen.vib3cont[rand];
                        eng42 = "she couldn't be " + gen.vib3cont[rand];
                        sp5 = "eso no podría estar " + gen.vib3contesp[rand];
                        eng5 = "it could not be " + gen.vib3cont[rand];
                        eng52 = "it couldn't be " + gen.vib3cont[rand];
                        sp6 = "ellos no podrían estar " + gen.vib3contesp[rand];
                        eng6 = "they could not be  " + gen.vib3cont[rand];
                        eng62 = "they couldn't be  " + gen.vib3cont[rand];
                        sp7 = "nosotros no podríamos estar " + gen.vib3contesp[rand];
                        eng7 = "we could not be  " + gen.vib3cont[rand];
                        eng72 = "we couldn't be  " + gen.vib3cont[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenCouldPerf1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo pudiese haber " + gen.vibparticipiosp[rand];
                        eng1 = "I could have " + gen.viparticiple[rand];
                        eng12 = "I could have " + gen.viparticiple[rand];
                        sp2 = "tú pudieses haber " + gen.vibparticipiosp[rand];
                        eng2 = "you could have " + gen.viparticiple[rand];
                        eng22 = "you could have " + gen.viparticiple[rand];
                        sp3 = "él pudiese haber " + gen.vibparticipiosp[rand];
                        eng3 = "he could have " + gen.viparticiple[rand];
                        eng32 = "he could have  " + gen.viparticiple[rand];
                        sp4 = "ella pudiese haber " + gen.vibparticipiosp[rand];
                        eng4 = "she could have " + gen.viparticiple[rand];
                        eng42 = "she could have  " + gen.viparticiple[rand];
                        sp5 = "eso pudiese haber " + gen.vibparticipiosp[rand];
                        eng5 = "it could have " + gen.viparticiple[rand];
                        eng52 = "it could have  " + gen.viparticiple[rand];
                        sp6 = "ellos pudiesen haber " + gen.vibparticipiosp[rand];
                        eng6 = "they could have " + gen.viparticiple[rand];
                        eng62 = "they could have " + gen.viparticiple[rand];
                        sp7 = "nosotros pudiesemos haber "  + gen.vibparticipiosp[rand];
                        eng7 = "we could have " + gen.viparticiple[rand];
                        eng72 = "we could have " + gen.viparticiple[rand];
                        break;
                    case 1:
                        sp1 = "yo no pudiese haber " + gen.vibparticipiosp[rand];
                        eng1 = "I could not have " + gen.viparticiple[rand];
                        eng12 = "I couldn't have " + gen.viparticiple[rand];
                        sp2 = "tú no pudieses haber " + gen.vibparticipiosp[rand];
                        eng2 = "you could not have " + gen.viparticiple[rand];
                        eng22 = "you couldn't have " + gen.viparticiple[rand];
                        sp3 = "él no pudiese haber " + gen.vibparticipiosp[rand];
                        eng3 = "he could not have " + gen.viparticiple[rand];
                        eng32 = "he couldn't have " + gen.viparticiple[rand];
                        sp4 = "ella no pudiese haber " + gen.vibparticipiosp[rand];
                        eng4 = "she could not have " + gen.viparticiple[rand];
                        eng42 = "she couldn't have " + gen.viparticiple[rand];
                        sp5 = "eso no pudiese haber " + gen.vibparticipiosp[rand];
                        eng5 = "it could not have " + gen.viparticiple[rand];
                        eng52 = "it couldn't have " + gen.viparticiple[rand];
                        sp6 = "ellos no pudiesen haber " + gen.vibparticipiosp[rand];
                        eng6 = "they could not have  " + gen.viparticiple[rand];
                        eng62 = "they couldn't have  " + gen.viparticiple[rand];
                        sp7 = "nosotros no pudiesemos haber "  + gen.vibparticipiosp[rand];
                        eng7 = "we could not have  " + gen.viparticiple[rand];
                        eng72 = "we couldn't have  " + gen.viparticiple[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenCouldPerfCont1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo podría haber estado " + gen.vib3contesp[rand];
                        eng1 = "I could have been " + gen.vib3cont[rand];
                        sp2 = "tú podrías haber estado " + gen.vib3contesp[rand];
                        eng2 = "you could have been " + gen.vib3cont[rand];
                        sp3 = "él podría haber estado " + gen.vib3contesp[rand];
                        eng3 = "he could have been " + gen.vib3cont[rand];
                        sp4 = "ella podría haber estado " + gen.vib3contesp[rand];
                        eng4 = "she could have been " + gen.vib3cont[rand];
                        sp5 = "eso podría haber estado " + gen.vib3contesp[rand];
                        eng5 = "it could have been " + gen.vib3cont[rand];
                        sp6 = "ellos podrían haber estado " + gen.vib3contesp[rand];
                        eng6 = "they could have been " + gen.vib3cont[rand];
                        sp7 = "nosotros podríamos haber estado " + gen.vib3contesp[rand];
                        eng7 = "we could have been " + gen.vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no podría haber estado " + gen.vib3contesp[rand];
                        eng1 = "I couldn't have been " + gen.vib3cont[rand];
                        sp2 = "tú no podrías haber estado  " + gen.vib3contesp[rand];
                        eng2 = "you couldn't have been " + gen.vib3cont[rand];
                        sp3 = "él no podría haber estado   " + gen.vib3contesp[rand];
                        eng3 = "he couldn't have been " + gen.vib3cont[rand];
                        sp4 = "ella no podría haber estado   " + gen.vib3contesp[rand];
                        eng4 = "she couldn't have been " + gen.vib3cont[rand];
                        sp5 = "eso no podría haber estado   " + gen.vib3contesp[rand];
                        eng5 = "it couldn't have been " + gen.vib3cont[rand];
                        sp6 = "ellos no habran estado " + gen.vib3contesp[rand];
                        eng6 = "they couldn't have been " + gen.vib3cont[rand];
                        sp7 = "nosotros no podríamos haber estado " + gen.vib3contesp[rand];
                        eng7 = "we couldn't have been " + gen.vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Might
    public void GenMightSimp1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá " + gen.vib1s[rand];
                        eng1 = "I might " + gen.vib[rand];
                        sp2 = "tú quizá " + gen.vib2s[rand];
                        eng2 = "you might " + gen.vib[rand];
                        sp3 = "él quizá " + gen.vib3s[rand];
                        eng3 = "he might " + gen.vib[rand];
                        sp4 = "ella quizá " + gen.vib3s[rand];
                        eng4 = "she might " + gen.vib[rand];
                        sp5 = "eso quizá " + gen.vib3s[rand];
                        eng5 = "it might " + gen.vib[rand];
                        sp6 = "ellos quizá " + gen.vib4s[rand];
                        eng6 = "they might " + gen.vib[rand];
                        sp7 = "nosotros quizá " + gen.vib5s[rand];
                        eng7 = "we might " + gen.vib[rand];
                        break;
                    case 1:
                        sp1 = "yo " + "quizá no " + gen.vib1s[rand];
                        eng1 = "I " + "might not  " + gen.vib[rand];
                        sp2 = "tú " + "quizá no " + gen.vib2s[rand];
                        eng2 = "you " + "might not  " + gen.vib[rand];
                        sp3 = "él " + "quizá no " + gen.vib3s[rand];
                        eng3 = "he " + "might not  " + gen.vib[rand];
                        sp4 = "ella " + "quizá no " + gen.vib3s[rand];
                        eng4 = "she " + "might not  " + gen.vib[rand];
                        sp5 = "eso " + "quizá no " + gen.vib3s[rand];
                        eng5 = "it " + "might not  " + gen.vib[rand];
                        sp6 = "ellos " + "quizá no " + gen.vib4s[rand];
                        eng6 = "they " + "might not  " + gen.vib[rand];
                        sp7 = "nosotros " + "quizá no " + gen.vib5s[rand];
                        eng7 = "we " + "might not  " + gen.vib[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenMightCont1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá esté " + gen.vib3contesp[rand];
                        eng1 = "I might be " + gen.vib3cont[rand];
                        eng12 = "I might be " + gen.vib3cont[rand];
                        sp2 = "tú quizá estés " + gen.vib3contesp[rand];
                        eng2 = "you might be " + gen.vib3cont[rand];
                        eng22 = "you might be " + gen.vib3cont[rand];
                        sp3 = "él quizá esté " + gen.vib3contesp[rand];
                        eng3 = "he might be " + gen.vib3cont[rand];
                        eng32 = "he might be " + gen.vib3cont[rand];
                        sp4 = "ella quizá esté " + gen.vib3contesp[rand];
                        eng4 = "she might be " + gen.vib3cont[rand];
                        eng42 = "she might be " + gen.vib3cont[rand];
                        sp5 = "eso quizá esté " + gen.vib3contesp[rand];
                        eng5 = "it might be " + gen.vib3cont[rand];
                        eng52 = "it might be " + gen.vib3cont[rand];
                        sp6 = "ellos quizá estén " + gen.vib3contesp[rand];
                        eng6 = "they might be " + gen.vib3cont[rand];
                        eng62 = "they might be " + gen.vib3cont[rand];
                        sp7 = "nosotros quizá estémos " + gen.vib3contesp[rand];
                        eng7 = "we might be " + gen.vib3cont[rand];
                        eng72 = "we might be " + gen.vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no quizá esté " + gen.vib3contesp[rand];
                        eng1 = "I might not be " + gen.vib3cont[rand];
                        eng12 = "I mightn't be " + gen.vib3cont[rand];
                        sp2 = "tú no quizá estés " + gen.vib3contesp[rand];
                        eng2 = "you might not be " + gen.vib3cont[rand];
                        eng22 = "you mightn't be " + gen.vib3cont[rand];
                        sp3 = "él no quizá esté " + gen.vib3contesp[rand];
                        eng3 = "he might not be " + gen.vib3cont[rand];
                        eng32 = "he mightn't be " + gen.vib3cont[rand];
                        sp4 = "ella no quizá esté " + gen.vib3contesp[rand];
                        eng4 = "she might not be " + gen.vib3cont[rand];
                        eng42 = "she mightn't be " + gen.vib3cont[rand];
                        sp5 = "eso no quizá esté " + gen.vib3contesp[rand];
                        eng5 = "it might not be " + gen.vib3cont[rand];
                        eng52 = "it mightn't be " + gen.vib3cont[rand];
                        sp6 = "ellos no quizá estén " + gen.vib3contesp[rand];
                        eng6 = "they might not be  " + gen.vib3cont[rand];
                        eng62 = "they mightn't be  " + gen.vib3cont[rand];
                        sp7 = "nosotros no quizá estémos " + gen.vib3contesp[rand];
                        eng7 = "we might not be  " + gen.vib3cont[rand];
                        eng72 = "we mightn't be  " + gen.vib3cont[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenMightPerf1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá haya " + gen.vibparticipiosp[rand];
                        eng1 = "I might have " + gen.viparticiple[rand];
                        eng12 = "I might have " + gen.viparticiple[rand];
                        sp2 = "tú quizá hayas " + gen.vibparticipiosp[rand];
                        eng2 = "you might have " + gen.viparticiple[rand];
                        eng22 = "you might have " + gen.viparticiple[rand];
                        sp3 = "él quizá haya " + gen.vibparticipiosp[rand];
                        eng3 = "he might have " + gen.viparticiple[rand];
                        eng32 = "he might have  " + gen.viparticiple[rand];
                        sp4 = "ella quizá haya " + gen.vibparticipiosp[rand];
                        eng4 = "she might have " + gen.viparticiple[rand];
                        eng42 = "she might have  " + gen.viparticiple[rand];
                        sp5 = "eso quizá haya " + gen.vibparticipiosp[rand];
                        eng5 = "it might have " + gen.viparticiple[rand];
                        eng52 = "it might have  " + gen.viparticiple[rand];
                        sp6 = "ellos quizá hayan " + gen.vibparticipiosp[rand];
                        eng6 = "they might have " + gen.viparticiple[rand];
                        eng62 = "they might have " + gen.viparticiple[rand];
                        sp7 = "nosotros quizá hayamos "  + gen.vibparticipiosp[rand];
                        eng7 = "we might have " + gen.viparticiple[rand];
                        eng72 = "we might have " + gen.viparticiple[rand];
                        break;
                    case 1:
                        sp1 = "yo no quizá haya " + gen.vibparticipiosp[rand];
                        eng1 = "I might not have " + gen.viparticiple[rand];
                        eng12 = "I mightn't have " + gen.viparticiple[rand];
                        sp2 = "tú no quizá hayas " + gen.vibparticipiosp[rand];
                        eng2 = "you might not have " + gen.viparticiple[rand];
                        eng22 = "you mightn't have " + gen.viparticiple[rand];
                        sp3 = "él no quizá haya " + gen.vibparticipiosp[rand];
                        eng3 = "he might not have " + gen.viparticiple[rand];
                        eng32 = "he mightn't have " + gen.viparticiple[rand];
                        sp4 = "ella no quizá haya " + gen.vibparticipiosp[rand];
                        eng4 = "she might not have " + gen.viparticiple[rand];
                        eng42 = "she mightn't have " + gen.viparticiple[rand];
                        sp5 = "eso no quizá haya " + gen.vibparticipiosp[rand];
                        eng5 = "it might not have " + gen.viparticiple[rand];
                        eng52 = "it mightn't have " + gen.viparticiple[rand];
                        sp6 = "ellos no quizá hayan " + gen.vibparticipiosp[rand];
                        eng6 = "they might not have  " + gen.viparticiple[rand];
                        eng62 = "they mightn't have  " + gen.viparticiple[rand];
                        sp7 = "nosotros no quizá hayamos "  + gen.vibparticipiosp[rand];
                        eng7 = "we might not have  " + gen.viparticiple[rand];
                        eng72 = "we mightn't have  " + gen.viparticiple[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenMightPerfCont1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá haya estado " + gen.vib3contesp[rand];
                        eng1 = "I might have been " + gen.vib3cont[rand];
                        sp2 = "tú quizá hayas estado " + gen.vib3contesp[rand];
                        eng2 = "you might have been " + gen.vib3cont[rand];
                        sp3 = "él quizá haya estado " + gen.vib3contesp[rand];
                        eng3 = "he might have been " + gen.vib3cont[rand];
                        sp4 = "ella quizá haya estado " + gen.vib3contesp[rand];
                        eng4 = "she might have been " + gen.vib3cont[rand];
                        sp5 = "eso quizá haya estado " + gen.vib3contesp[rand];
                        eng5 = "it might have been " + gen.vib3cont[rand];
                        sp6 = "ellos quizá hayan estado " + gen.vib3contesp[rand];
                        eng6 = "they might have been " + gen.vib3cont[rand];
                        sp7 = "nosotros quizá hayamos estado " + gen.vib3contesp[rand];
                        eng7 = "we might have been " + gen.vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo quizá no haya estado " + gen.vib3contesp[rand];
                        eng1 = "I might not have been " + gen.vib3cont[rand];
                        sp2 = "tú quizá no hayas estado  " + gen.vib3contesp[rand];
                        eng2 = "you might not have been " + gen.vib3cont[rand];
                        sp3 = "él quizá no haya estado   " + gen.vib3contesp[rand];
                        eng3 = "he might not have been " + gen.vib3cont[rand];
                        sp4 = "ella quizá no haya estado   " + gen.vib3contesp[rand];
                        eng4 = "she might not have been " + gen.vib3cont[rand];
                        sp5 = "eso quizá no haya estado   " + gen.vib3contesp[rand];
                        eng5 = "it might not have been " + gen.vib3cont[rand];
                        sp6 = "ellos no habran estado " + gen.vib3contesp[rand];
                        eng6 = "they might not have been " + gen.vib3cont[rand];
                        sp7 = "nosotros quizá no hayamos estado " + gen.vib3contesp[rand];
                        eng7 = "we might not have been " + gen.vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //SHOULD
    public void GenShouldSimp1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería " + gen.vibesp[rand];
                        eng1 = "I should " + gen.vib[rand];
                        sp2 = "tú deberías " + gen.vibesp[rand];
                        eng2 = "you should " + gen.vib[rand];
                        sp3 = "él debería " + gen.vibesp[rand];
                        eng3 = "he should " + gen.vib[rand];
                        sp4 = "ella debería " + gen.vibesp[rand];
                        eng4 = "she should " + gen.vib[rand];
                        sp5 = "eso debería " + gen.vibesp[rand];
                        eng5 = "it should " + gen.vib[rand];
                        sp6 = "ellos deberían " + gen.vibesp[rand];
                        eng6 = "they should " + gen.vib[rand];
                        sp7 = "nosotros deberíamos " + gen.vibesp[rand];
                        eng7 = "we should " + gen.vib[rand];
                        break;
                    case 1:
                        sp1 = "yo " + "no debería " + gen.vibesp[rand];
                        eng1 = "I " + "shouldn't " + gen.vib[rand];
                        sp2 = "tú " + "no deberías " + gen.vibesp[rand];
                        eng2 = "you " + "shouldn't " + gen.vib[rand];
                        sp3 = "él " + "no debería " + gen.vibesp[rand];
                        eng3 = "he " + "shouldn't " + gen.vib[rand]+ arrayEng;
                        sp4 = "ella " + "no debería " + gen.vibesp[rand];
                        eng4 = "she " + "shouldn't " + gen.vib[rand];
                        sp5 = "eso " + "no debería " + gen.vibesp[rand];
                        eng5 = "it " + "shouldn't " + gen.vib[rand]+ arrayEng;
                        sp6 = "ellos " + "no deberían " + gen.vibesp[rand];
                        eng6 = "they " + "shouldn't " + gen.vib[rand];
                        sp7 = "nosotros " + "no deberíamos " + gen.vibesp[rand];
                        eng7 = "we " + "shouldn't " + gen.vib[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenShouldCont1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería estar " + gen.vib3contesp[rand];
                        eng1 = "I should be " + gen.vib3cont[rand];
                        eng12 = "I should be " + gen.vib3cont[rand];
                        sp2 = "tú deberías estar " + gen.vib3contesp[rand];
                        eng2 = "you should be " + gen.vib3cont[rand];
                        eng22 = "you should be " + gen.vib3cont[rand];
                        sp3 = "él debería estar " + gen.vib3contesp[rand];
                        eng3 = "he should be " + gen.vib3cont[rand];
                        eng32 = "he should be " + gen.vib3cont[rand];
                        sp4 = "ella debería estar " + gen.vib3contesp[rand];
                        eng4 = "she should be " + gen.vib3cont[rand];
                        eng42 = "she should be " + gen.vib3cont[rand];
                        sp5 = "eso debería estar " + gen.vib3contesp[rand];
                        eng5 = "it should be " + gen.vib3cont[rand];
                        eng52 = "it should be " + gen.vib3cont[rand];
                        sp6 = "ellos deberían estar " + gen.vib3contesp[rand];
                        eng6 = "they should be " + gen.vib3cont[rand];
                        eng62 = "they should be " + gen.vib3cont[rand];
                        sp7 = "nosotros deberíamos estar " + gen.vib3contesp[rand];
                        eng7 = "we should be " + gen.vib3cont[rand];
                        eng72 = "we should be " + gen.vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no debería estar " + gen.vib3contesp[rand];
                        eng1 = "I should not be " + gen.vib3cont[rand];
                        eng12 = "I shouldn't be " + gen.vib3cont[rand];
                        sp2 = "tú no deberías estar " + gen.vib3contesp[rand];
                        eng2 = "you should not be " + gen.vib3cont[rand];
                        eng22 = "you shouldn't be " + gen.vib3cont[rand];
                        sp3 = "él no debería estar " + gen.vib3contesp[rand];
                        eng3 = "he should not be " + gen.vib3cont[rand];
                        eng32 = "he shouldn't be " + gen.vib3cont[rand];
                        sp4 = "ella no debería estar " + gen.vib3contesp[rand];
                        eng4 = "she should not be " + gen.vib3cont[rand];
                        eng42 = "she shouldn't be " + gen.vib3cont[rand];
                        sp5 = "eso no debería estar " + gen.vib3contesp[rand];
                        eng5 = "it should not be " + gen.vib3cont[rand];
                        eng52 = "it shouldn't be " + gen.vib3cont[rand];
                        sp6 = "ellos no deberían estar " + gen.vib3contesp[rand];
                        eng6 = "they should not be  " + gen.vib3cont[rand];
                        eng62 = "they shouldn't be  " + gen.vib3cont[rand];
                        sp7 = "nosotros no deberíamos estar " + gen.vib3contesp[rand];
                        eng7 = "we should not be  " + gen.vib3cont[rand];
                        eng72 = "we shouldn't be  " + gen.vib3cont[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenShouldPerf1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería haber " + gen.vibparticipiosp[rand];
                        eng1 = "I should have " + gen.viparticiple[rand];
                        eng12 = "I should have " + gen.viparticiple[rand];
                        sp2 = "tú deberías haber " + gen.vibparticipiosp[rand];
                        eng2 = "you should have " + gen.viparticiple[rand];
                        eng22 = "you should have " + gen.viparticiple[rand];
                        sp3 = "él debería haber " + gen.vibparticipiosp[rand];
                        eng3 = "he should have " + gen.viparticiple[rand];
                        eng32 = "he should have  " + gen.viparticiple[rand];
                        sp4 = "ella debería haber " + gen.vibparticipiosp[rand];
                        eng4 = "she should have " + gen.viparticiple[rand];
                        eng42 = "she should have  " + gen.viparticiple[rand];
                        sp5 = "eso debería haber " + gen.vibparticipiosp[rand];
                        eng5 = "it should have " + gen.viparticiple[rand];
                        eng52 = "it should have  " + gen.viparticiple[rand];
                        sp6 = "ellos deberían haber " + gen.vibparticipiosp[rand];
                        eng6 = "they should have " + gen.viparticiple[rand];
                        eng62 = "they should have " + gen.viparticiple[rand];
                        sp7 = "nosotros deberíamos haber "  + gen.vibparticipiosp[rand];
                        eng7 = "we should have " + gen.viparticiple[rand];
                        eng72 = "we should have " + gen.viparticiple[rand];
                        break;
                    case 1:
                        sp1 = "yo no debería haber " + gen.vibparticipiosp[rand];
                        eng1 = "I should not have " + gen.viparticiple[rand];
                        eng12 = "I shouldn't have " + gen.viparticiple[rand];
                        sp2 = "tú no deberías haber " + gen.vibparticipiosp[rand];
                        eng2 = "you should not have " + gen.viparticiple[rand];
                        eng22 = "you shouldn't have " + gen.viparticiple[rand];
                        sp3 = "él no debería haber " + gen.vibparticipiosp[rand];
                        eng3 = "he should not have " + gen.viparticiple[rand];
                        eng32 = "he shouldn't have " + gen.viparticiple[rand];
                        sp4 = "ella no debería haber " + gen.vibparticipiosp[rand];
                        eng4 = "she should not have " + gen.viparticiple[rand];
                        eng42 = "she shouldn't have " + gen.viparticiple[rand];
                        sp5 = "eso no debería haber " + gen.vibparticipiosp[rand];
                        eng5 = "it should not have " + gen.viparticiple[rand];
                        eng52 = "it shouldn't have " + gen.viparticiple[rand];
                        sp6 = "ellos no deberían haber " + gen.vibparticipiosp[rand];
                        eng6 = "they should not have  " + gen.viparticiple[rand];
                        eng62 = "they shouldn't have  " + gen.viparticiple[rand];
                        sp7 = "nosotros no deberíamos haber "  + gen.vibparticipiosp[rand];
                        eng7 = "we should not have  " + gen.viparticiple[rand];
                        eng72 = "we shouldn't have  " + gen.viparticiple[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenShouldPerfCont1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería haber estado " + gen.vib3contesp[rand];
                        eng1 = "I should have been " + gen.vib3cont[rand];
                        sp2 = "tú deberías haber estado " + gen.vib3contesp[rand];
                        eng2 = "you should have been " + gen.vib3cont[rand];
                        sp3 = "él debería haber estado " + gen.vib3contesp[rand];
                        eng3 = "he should have been " + gen.vib3cont[rand];
                        sp4 = "ella debería haber estado " + gen.vib3contesp[rand];
                        eng4 = "she should have been " + gen.vib3cont[rand];
                        sp5 = "eso debería haber estado " + gen.vib3contesp[rand];
                        eng5 = "it should have been " + gen.vib3cont[rand];
                        sp6 = "ellos deberían haber estado " + gen.vib3contesp[rand];
                        eng6 = "they should have been " + gen.vib3cont[rand];
                        sp7 = "nosotros deberíamos haber estado " + gen.vib3contesp[rand];
                        eng7 = "we should have been " + gen.vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no debería haber estado " + gen.vib3contesp[rand];
                        eng1 = "I shouldn't have been " + gen.vib3cont[rand];
                        sp2 = "tú no deberías haber estado " + gen.vib3contesp[rand];
                        eng2 = "you shouldn't have been " + gen.vib3cont[rand];
                        sp3 = "él no debería haber estado " + gen.vib3contesp[rand];
                        eng3 = "he shouldn't have been " + gen.vib3cont[rand];
                        sp4 = "ella no debería haber estado " + gen.vib3contesp[rand];
                        eng4 = "she shouldn't have been " + gen.vib3cont[rand];
                        sp5 = "eso no debería haber estado " + gen.vib3contesp[rand];
                        eng5 = "it shouldn't have been " + gen.vib3cont[rand];
                        sp6 = "ellos no deberían haber estado " + gen.vib3contesp[rand];
                        eng6 = "they shouldn't have been " + gen.vib3cont[rand];
                        sp7 = "nosotros no deberíamos haber estado " + gen.vib3contesp[rand];
                        eng7 = "we shouldn't have been " + gen.vib3cont[rand];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Can
    public void GenCanSimp1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo puedo " + gen.vibesp[rand];
                        eng1 = "I can " + gen.vib[rand];
                        sp2 = "tú puedes " + gen.vibesp[rand];
                        eng2 = "you can " + gen.vib[rand];
                        sp3 = "él puede " + gen.vibesp[rand];
                        eng3 = "he can " + gen.vib[rand];
                        sp4 = "ella puede " + gen.vibesp[rand];
                        eng4 = "she can " + gen.vib[rand];
                        sp5 = "eso puede " + gen.vibesp[rand];
                        eng5 = "it can " + gen.vib[rand];
                        sp6 = "ellos pueden " + gen.vibesp[rand];
                        eng6 = "they can " + gen.vib[rand];
                        sp7 = "nosotros podemos " + gen.vibesp[rand];
                        eng7 = "we can " + gen.vib[rand];
                        break;
                    case 1:
                        sp1 = "yo " + "no puedo " + gen.vibesp[rand];
                        eng1 = "I " + "can't " + gen.vib[rand];
                        sp2 = "tú " + "no puedes " + gen.vibesp[rand];
                        eng2 = "you " + "can't " + gen.vib[rand];
                        sp3 = "él " + "no puede " + gen.vibesp[rand];
                        eng3 = "he " + "can't " + gen.vib[rand];
                        sp4 = "ella " + "no puede " + gen.vibesp[rand];
                        eng4 = "she " + "can't " + gen.vib[rand];
                        sp5 = "eso " + "no puede " + gen.vibesp[rand];
                        eng5 = "it " + "can't " + gen.vib[rand];
                        sp6 = "ellos " + "no pueden " + gen.vibesp[rand];
                        eng6 = "they " + "can't " + gen.vib[rand];
                        sp7 = "nosotros " + "no podemos " + gen.vibesp[rand];
                        eng7 = "we " + "can't " + gen.vib[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenCanCont1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo puedo estar " + gen.vib3contesp[rand];
                        eng1 = "I can be " + gen.vib3cont[rand];
                        eng12 = "I can be " + gen.vib3cont[rand];
                        sp2 = "tú puedes estar " + gen.vib3contesp[rand];
                        eng2 = "you can be " + gen.vib3cont[rand];
                        eng22 = "you can be " + gen.vib3cont[rand];
                        sp3 = "él puede estar " + gen.vib3contesp[rand];
                        eng3 = "he can be " + gen.vib3cont[rand];
                        eng32 = "he can be " + gen.vib3cont[rand];
                        sp4 = "ella puede estar " + gen.vib3contesp[rand];
                        eng4 = "she can be " + gen.vib3cont[rand];
                        eng42 = "she can be " + gen.vib3cont[rand];
                        sp5 = "eso puede estar " + gen.vib3contesp[rand];
                        eng5 = "it can be " + gen.vib3cont[rand];
                        eng52 = "it can be " + gen.vib3cont[rand];
                        sp6 = "ellos pueden estar " + gen.vib3contesp[rand];
                        eng6 = "they can be " + gen.vib3cont[rand];
                        eng62 = "they can be " + gen.vib3cont[rand];
                        sp7 = "nosotros podemos estar " + gen.vib3contesp[rand];
                        eng7 = "we can be " + gen.vib3cont[rand];
                        eng72 = "we can be " + gen.vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no puedo estar " + gen.vib3contesp[rand];
                        eng1 = "I can not be " + gen.vib3cont[rand];
                        eng12 = "I can't be " + gen.vib3cont[rand];
                        sp2 = "tú no puedes estar " + gen.vib3contesp[rand];
                        eng2 = "you can not be " + gen.vib3cont[rand];
                        eng22 = "you can't be " + gen.vib3cont[rand];
                        sp3 = "él no puede estar " + gen.vib3contesp[rand];
                        eng3 = "he can not be " + gen.vib3cont[rand];
                        eng32 = "he can't be " + gen.vib3cont[rand];
                        sp4 = "ella no puede estar " + gen.vib3contesp[rand];
                        eng4 = "she can not be " + gen.vib3cont[rand];
                        eng42 = "she can't be " + gen.vib3cont[rand];
                        sp5 = "eso no puede estar " + gen.vib3contesp[rand];
                        eng5 = "it can not be " + gen.vib3cont[rand];
                        eng52 = "it can't be " + gen.vib3cont[rand];
                        sp6 = "ellos no pueden estar " + gen.vib3contesp[rand];
                        eng6 = "they can not be  " + gen.vib3cont[rand];
                        eng62 = "they can't be  " + gen.vib3cont[rand];
                        sp7 = "nosotros no podemos estar " + gen.vib3contesp[rand];
                        eng7 = "we can not be  " + gen.vib3cont[rand];
                        eng72 = "we can't be  " + gen.vib3cont[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023
    //Must
    public void GenMustSimp1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debo " + gen.vibesp[rand];
                        eng1 = "I must " + gen.vib[rand];
                        sp2 = "tú debés " + gen.vibesp[rand];
                        eng2 = "you must " + gen.vib[rand];
                        sp3 = "él debe " + gen.vibesp[rand];
                        eng3 = "he must " + gen.vib[rand];
                        sp4 = "ella debe " + gen.vibesp[rand];
                        eng4 = "she must " + gen.vib[rand];
                        sp5 = "eso debe " + gen.vibesp[rand];
                        eng5 = "it must " + gen.vib[rand];
                        sp6 = "ellos deben " + gen.vibesp[rand];
                        eng6 = "they must " + gen.vib[rand];
                        sp7 = "nosotros debemos " + gen.vibesp[rand];
                        eng7 = "we must " + gen.vib[rand];
                        break;
                    case 1:
                        sp1 = "yo " + "no debo " + gen.vibesp[rand];
                        eng1 = "I " + "mustn't " + gen.vib[rand];
                        sp2 = "tú " + "no debés " + gen.vibesp[rand];
                        eng2 = "you " + "mustn't " + gen.vib[rand];
                        sp3 = "él " + "no debe " + gen.vibesp[rand];
                        eng3 = "he " + "mustn't " + gen.vib3esp[rand];
                        sp4 = "ella " + "no debe " + gen.vibesp[rand];
                        eng4 = "she " + "mustn't " + gen.vib3esp[rand];
                        sp5 = "eso " + "no debe " + gen.vibesp[rand];
                        eng5 = "it " + "mustn't " + gen.vib3esp[rand];
                        sp6 = "ellos " + "no deben " + gen.vibesp[rand];
                        eng6 = "they " + "mustn't " + gen.vib[rand];
                        sp7 = "nosotros " + "no debemos " + gen.vibesp[rand];
                        eng7 = "we " + "mustn't " + gen.vib[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenMustCont1() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debo estar " + gen.vib3contesp[rand];
                        eng1 = "I must be " + gen.vib3cont[rand];
                        eng12 = "I must be " + gen.vib3cont[rand];
                        sp2 = "tú debes estar " + gen.vib3contesp[rand];
                        eng2 = "you must be " + gen.vib3cont[rand];
                        eng22 = "you must be " + gen.vib3cont[rand];
                        sp3 = "él debe estar " + gen.vib3contesp[rand];
                        eng3 = "he must be " + gen.vib3cont[rand];
                        eng32 = "he must be " + gen.vib3cont[rand];
                        sp4 = "ella debe estar " + gen.vib3contesp[rand];
                        eng4 = "she must be " + gen.vib3cont[rand];
                        eng42 = "she must be " + gen.vib3cont[rand];
                        sp5 = "eso debe estar " + gen.vib3contesp[rand];
                        eng5 = "it must be " + gen.vib3cont[rand];
                        eng52 = "it must be " + gen.vib3cont[rand];
                        sp6 = "ellos deben estar " + gen.vib3contesp[rand];
                        eng6 = "they must be " + gen.vib3cont[rand];
                        eng62 = "they must be " + gen.vib3cont[rand];
                        sp7 = "nosotros debemos estar " + gen.vib3contesp[rand];
                        eng7 = "we must be " + gen.vib3cont[rand];
                        eng72 = "we must be " + gen.vib3cont[rand];
                        break;
                    case 1:
                        sp1 = "yo no debo estar " + gen.vib3contesp[rand];
                        eng1 = "I must not be " + gen.vib3cont[rand];
                        eng12 = "I mustn't be " + gen.vib3cont[rand];
                        sp2 = "tú no debes estar " + gen.vib3contesp[rand];
                        eng2 = "you must not be " + gen.vib3cont[rand];
                        eng22 = "you mustn't be " + gen.vib3cont[rand];
                        sp3 = "él no debe estar " + gen.vib3contesp[rand];
                        eng3 = "he must not be " + gen.vib3cont[rand];
                        eng32 = "he mustn't be " + gen.vib3cont[rand];
                        sp4 = "ella no debe estar " + gen.vib3contesp[rand];
                        eng4 = "she must not be " + gen.vib3cont[rand];
                        eng42 = "she mustn't be " + gen.vib3cont[rand];
                        sp5 = "eso no debe estar " + gen.vib3contesp[rand];
                        eng5 = "it must not be " + gen.vib3cont[rand];
                        eng52 = "it mustn't be " + gen.vib3cont[rand];
                        sp6 = "ellos no deben estar " + gen.vib3contesp[rand];
                        eng6 = "they must not be  " + gen.vib3cont[rand];
                        eng62 = "they mustn't be  " + gen.vib3cont[rand];
                        sp7 = "nosotros no debemos estar " + gen.vib3contesp[rand];
                        eng7 = "we must not be  " + gen.vib3cont[rand];
                        eng72 = "we mustn't be  " + gen.vib3cont[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023

    public void GenAbleTo1(){
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + "soy capaz de " + gen.vibesp[rand];
                        eng1 = "I am " + "able to " + gen.vib[rand];
                        eng12 = "I'm " + "able to " + gen.vib[rand];

                        sp2 = "tú " + "eres capaz de " + gen.vibesp[rand];
                        eng2 = "you are " + "able to " + gen.vib[rand];
                        eng22 = "you're " + "able to " + gen.vib[rand];

                        sp3 = "él " + "es capaz de " + gen.vibesp[rand];
                        eng3 = "he is " + "able to " + gen.vib[rand];
                        eng32 = "he's " + "able to " + gen.vib[rand];

                        sp4 = "ella " + "es capaz de " + gen.vibesp[rand];
                        eng4 = "she is " + "able to " + gen.vib[rand];
                        eng42 = "she's " + "able to " + gen.vib[rand];

                        sp5 = "eso " + "es capaz de " + gen.vibesp[rand];
                        eng5 = "it is " + "able to " + gen.vib[rand];
                        eng52 = "it's " + "able to " + gen.vib[rand];

                        sp6 = "ellos " + "son capaces de " + gen.vibesp[rand];
                        eng6 = "they are " + "able to " + gen.vib[rand];
                        eng62 = "they're " + "able to " + gen.vib[rand];

                        sp7 = "nosotros " + "somos capaces de " + gen.vibesp[rand];
                        eng7 = "we are " + "able to " + gen.vib[rand];
                        eng72 = "we're " + "able to " + gen.vib[rand];
                        break;
                    case 1:
                        sp1 = "yo no " + "soy capaz de " + gen.vibesp[rand];
                        eng1 = "I am not " + "able to " + gen.vib[rand];
                        eng12 = "I'm not " + "able to " + gen.vib[rand];

                        sp2 = "tú no " + "eres capaz de " + gen.vibesp[rand];
                        eng2 = "you are not " + "able to " + gen.vib[rand];
                        eng22 = "you're not " + "able to " + gen.vib[rand];

                        sp3 = "él no " + "es capaz de " + gen.vibesp[rand];
                        eng3 = "he is not " + "able to " + gen.vib[rand];
                        eng32 = "he's not " + "able to " + gen.vib[rand];

                        sp4 = "ella no " + "es capaz de " + gen.vibesp[rand];
                        eng4 = "she is not " + "able to " + gen.vib[rand];
                        eng42 = "she's not " + "able to " + gen.vib[rand];

                        sp5 = "eso no " + "es capaz de " + gen.vibesp[rand];
                        eng5 = "it is not " + "able to " + gen.vib[rand];
                        eng52 = "it's not " + "able to " + gen.vib[rand];

                        sp6 = "ellos no " + "son capaces de " + gen.vibesp[rand];
                        eng6 = "they are not " + "able to " + gen.vib[rand];
                        eng62 = "they're not " + "able to " + gen.vib[rand];

                        sp7 = "nosotros no " + "somos capaces de " + gen.vibesp[rand];
                        eng7 = "we are not " + "able to " + gen.vib[rand];
                        eng72 = "we're not " + "able to " + gen.vib[rand];
                        break;

                }
            }
        }
    }//PD FEB 2023

    public void GenPhrasalVerb1(){
        gen = new Generator();
        randstarter();
        String temp = PhrasalVerb[randPV];
        int neg = (int) (Math.random() * 2);


        for (String verbs : PhrasalVerb) {
            if (verbs.equals(temp)) {
                switch (neg){
                    case 0:
                        sp1 = "yo " + PhrasalVerbEsp1[0][rPv1];
                        eng1 = "I " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        eng12 = "I " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        sp2 = "tú " + PhrasalVerbEsp2[0][rPv1];
                        eng2 = "you " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        eng22 = "you " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        sp3 = "él " + PhrasalVerbEsp3[0][rPv1];
                        eng3 = "he " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        eng32 = "he " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        sp4 = "ella " + PhrasalVerbEsp3[0][rPv1];
                        eng4 = "she " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        eng42 = "she " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        sp5 = "eso " + PhrasalVerbEsp3[0][rPv1];
                        eng5 = "it " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        eng52 = "it " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        sp6 = "ellos " + PhrasalVerbEsp4[0][rPv1];
                        eng6 = "they " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        eng62 = "they " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        sp7 = "nosotros " + PhrasalVerbEsp5[0][rPv1];
                        eng7 = "we " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        eng72 = "we " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + PhrasalVerbEsp1[0][rPv1];
                        eng1 = "I do not " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        eng12 = "I don't " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        sp2 = "tú " + "no " + PhrasalVerbEsp2[0][rPv1];
                        eng2 = "you do not " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        eng22 = "you don't " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        sp3 = "él no " + PhrasalVerbEsp3[0][rPv1];
                        eng3 = "he does not " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        eng32 = "he doesn't " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        sp4 = "ella no " + PhrasalVerbEsp3[0][rPv1];
                        eng4 = "she does not " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        eng42 = "she doesn't " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        sp5 = "eso no " + PhrasalVerbEsp3[0][rPv1];
                        eng5 = "it does not " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        eng52 = "it doesn't " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        sp6 = "ellos " + "no " + PhrasalVerbEsp4[0][rPv1];
                        eng6 = "they do not " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        eng62 = "they don't " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        sp7 = "nosotros " + "no " + PhrasalVerbEsp5[0][rPv1];
                        eng7 = "we do not " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        eng72 = "we don't " + PhrasalVerb[0] + PhrasalVerbEng[0][rPv1];
                        break;
                }
            }
        }
    }//PD MAR 2023

    //for to dificultad 3 SOlO INTRANS
    public void forSubTo1() {
        gen = new Generator();
        Pasts pas = new Pasts();
        randstarter();
        String temp = gen.vib[rand];
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

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = ftsjs[0] + pas.vis1[rand];
                        eng1 = ftsj[0] + gen.vib[rand];
                        sp2 = ftsjs[1] + pas.vis2[rand];
                        eng2 = ftsj[1] + gen.vib[rand];
                        sp3 = ftsjs[2] + pas.vis3[rand];
                        eng3 = ftsj[2] + gen.vib[rand];
                        sp4 = ftsjs[3] + pas.vis3[rand];
                        eng4 = ftsj[3] + gen.vib[rand];
                        sp5 = ftsjs[4] + pas.vis3[rand];
                        eng5 = ftsj[4] + gen.vib[rand];
                        sp6 = ftsjs[5] + pas.vis4[rand];
                        eng6 = ftsj[5] + gen.vib[rand];
                        sp7 = ftsjs[6] + pas.vis5[rand];
                        eng7 = ftsj[6] + gen.vib[rand];
                        break;
                    case 1:
                        sp1 = ftsjsn[0] + pas.vis1[rand];
                        eng1 = ftsjn[0] + gen.vib[rand];
                        sp2 = ftsjsn[1] + pas.vis2[rand];
                        eng2 = ftsjn[1] + gen.vib[rand];
                        sp3 = ftsjsn[2] + pas.vis3[rand];
                        eng3 = ftsjn[2] + gen.vib[rand];
                        sp4 = ftsjsn[3] + pas.vis3[rand];
                        eng4 = ftsjn[3] + gen.vib[rand];
                        sp5 = ftsjsn[4] + pas.vis3[rand];
                        eng5 = ftsjn[4] + gen.vib[rand];
                        sp6 = ftsjsn[5] + pas.vis4[rand];
                        eng6 = ftsjn[5] + gen.vib[rand];
                        sp7 = ftsjsn[6] + pas.vis5[rand];
                        eng7 = ftsjn[6] + gen.vib[rand];
                        break;
                }
            }
        }
    }//PD FEB 2023

    //want to dificultad 3 SOLO INTRANS
    public void wantyouto1() {
        gen = new Generator();
        Pasts pas = new Pasts();
        randstarter();
        String temp = gen.vib[rand];
        int rn1 = (int) (Math.random() * 6);
        int rn2 = (int) (Math.random() * 5);
        int neg = (int) (Math.random() * 2);


        //want to subject
        String wtsj[] = {"I want ", "you want ", "he wants ", "she wants ",
                "it wants ", "we want ", "they want "};
        //want to subject negative
        String wtsjn[] = {"I don't want ", "you don't want " , "he doesn't want ", "she doesn't want ", "it doesn't want "
                , "we don't want ", "they don't want " };
        //sujetos want to en sp
        String wtsjs[] = {"yo quiero ", "tú quieres ", "él quiere ", "ella quiere ", "eso quiere ", "nosotros queremos ", "ellos quieren "};
        //sujetos want to en sp negativo
        String wtsjsn[] = {"yo no quiero ", "tú no quieres ", "él no quiere ", "ella no quiere ", "eso no quiere ", "nosotros no queremos ", "ellos no quieren "};

        String wtobj1[] = {"you to " + gen.vib[rand], "him to " + gen.vib[rand], "her to " + gen.vib[rand],
                "it to " + gen.vib[rand], "us to " + gen.vib[rand], "them to " + gen.vib[rand]};
        String wtobj2[] = {"me to " + gen.vib[rand], "him to " + gen.vib[rand], "her to " + gen.vib[rand],
                "it to " + gen.vib[rand], "us to " + gen.vib[rand], "them to " + gen.vib[rand]};
        String wtobj3[] = {"you to " + gen.vib[rand], "me to " + gen.vib[rand], "her to " + gen.vib[rand],
                "it to " + gen.vib[rand], "us to " + gen.vib[rand], "them to " + gen.vib[rand]};
        String wtobj4[] = {"you to " + gen.vib[rand], "him to " + gen.vib[rand], "me to " + gen.vib[rand],
                "it to " + gen.vib[rand], "us to " + gen.vib[rand], "them to " + gen.vib[rand]};
        String wtobj5[] = {"you to " + gen.vib[rand], "him to " + gen.vib[rand], "her to " + gen.vib[rand],
                "me to " + gen.vib[rand], "us to " + gen.vib[rand], "them to " + gen.vib[rand]};
        String wtobj6[] = {"you to " + gen.vib[rand], "him to " + gen.vib[rand], "her to " + gen.vib[rand],
                "it to " + gen.vib[rand], "them to " + gen.vib[rand]};
        String wtobj7[] = {"you to " + gen.vib[rand], "him to " + gen.vib[rand], "her to " + gen.vib[rand],
                "it to " + gen.vib[rand], "us to " + gen.vib[rand], "me to " + gen.vib[rand]};

        // objetos wt en sp
        String wtobj1s[] = {"que tú " + pas.vis2[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis5[rand], "que ellos " + pas.vis4[rand]};
        String wtobj2s[] = {"que yo " + pas.vis1[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis5[rand], "que ellos " + pas.vis4[rand]};

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

        for (String verbs : gen.vib) {
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

    //dificultad 2

    //DIFICULTAD 3
    //presentes
    public void GenPresSimp2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg){
                    case 0:
                        sp1 = "yo " + gen.vib1[rand] + arrayEsp;
                        eng1 = "I " + gen.vib[rand] + arrayEng;
                        eng12 = "I " + gen.vib[rand] + arrayEng;
                        sp2 = "tú " + gen.vib2[rand] + arrayEsp;
                        eng2 = "you " + gen.vib[rand] + arrayEng;
                        eng22 = "you " + gen.vib[rand] + arrayEng;
                        sp3 = "él " + gen.vib3esp[rand] + arrayEsp;
                        eng3 = "he " + gen.vib[rand] + arrayEng;
                        eng32 = "he " + gen.vib[rand] + arrayEng;
                        sp4 = "ella " + gen.vib3esp[rand] + arrayEsp;
                        eng4 = "she " + gen.vib[rand] + arrayEng;
                        eng42 = "she " + gen.vib[rand] + arrayEng;
                        sp5 = "eso " + gen.vib3esp[rand] + arrayEsp;
                        eng5 = "it " + gen.vib[rand] + arrayEng;
                        eng52 = "it " + gen.vib[rand] + arrayEng;
                        sp6 = "ellos " + gen.vib3p[rand] + arrayEsp;
                        eng6 = "they " + gen.vib[rand] + arrayEng;
                        eng62 = "they " + gen.vib[rand] + arrayEng;
                        sp7 = "nosotros " + gen.vibnos[rand] + arrayEsp;
                        eng7 = "we " + gen.vib[rand] + arrayEng;
                        eng72 = "we " + gen.vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo " + "no " + gen.vib1[rand] + arrayEsp;
                        eng1 = "I do not " + gen.vib[rand] + arrayEng;
                        eng12 = "I don't " + gen.vib[rand] + arrayEng;
                        sp2 = "tú " + "no " + gen.vib2[rand] + arrayEsp;
                        eng2 = "you do not " + gen.vib[rand] + arrayEng;
                        eng22 = "you don't " + gen.vib[rand] + arrayEng;
                        sp3 = "él no " + gen.vib3esp[rand] + arrayEsp;
                        eng3 = "he does not " + gen.vib[rand] + arrayEng;
                        eng32 = "he doesn't " + gen.vib[rand] + arrayEng;
                        sp4 = "ella no " + gen.vib3esp[rand] + arrayEsp;
                        eng4 = "she does not " + gen.vib[rand] + arrayEng;
                        eng42 = "she doesn't " + gen.vib[rand] + arrayEng;
                        sp5 = "eso no " + gen.vib3esp[rand] + arrayEsp;
                        eng5 = "it does not " + gen.vib[rand] + arrayEng;
                        eng52 = "it doesn't " + gen.vib[rand] + arrayEng;
                        sp6 = "ellos " + "no " + gen.vib3p[rand] + arrayEsp;
                        eng6 = "they do not " + gen.vib[rand] + arrayEng;
                        eng62 = "they don't " + gen.vib[rand] + arrayEng;
                        sp7 = "nosotros " + "no " + gen.vibnos[rand] + arrayEsp;
                        eng7 = "we do not " + gen.vib[rand] + arrayEng;
                        eng72 = "we don't " + gen.vib[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenPresCont2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estoy " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I am " + gen.vib3cont[rand] + arrayEng;
                        eng12 = "I'm " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú estás " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you are " + gen.vib3cont[rand] + arrayEng;
                        eng22 = "you're " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él está " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he is " + gen.vib3cont[rand] + arrayEng;
                        eng32 = "he's " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella está " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she is " + gen.vib3cont[rand] + arrayEng;
                        eng42 = "she's " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso está " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it is " + gen.vib3cont[rand] + arrayEng;
                        eng52 = "it's " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos están " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they are " + gen.vib3cont[rand] + arrayEng;
                        eng62 = "they're " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros estamos " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we are " + gen.vib3cont[rand] + arrayEng;
                        eng72 = "we're " + gen.vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no estoy " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I am not " + gen.vib3cont[rand] + arrayEng;
                        eng12 = "I'm not " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú no estás " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you are not " + gen.vib3cont[rand] + arrayEng;
                        eng22 = "you aren't " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él no está " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he is not " + gen.vib3cont[rand] + arrayEng;
                        eng32 = "he isn't " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella no está " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she is not " + gen.vib3cont[rand] + arrayEng;
                        eng42 = "she isn't " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso no está " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it is not " + gen.vib3cont[rand] + arrayEng;
                        eng52 = "it isn't " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos no están " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they are not  " + gen.vib3cont[rand] + arrayEng;
                        eng62 = "they aren't  " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no estamos " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we are not  " + gen.vib3cont[rand] + arrayEng;
                        eng72 = "we aren't  " + gen.vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPresPerf2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo he " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I have " + gen.viparticiple[rand] + arrayEng;
                        eng12 = "I've " + gen.viparticiple[rand] + arrayEng;
                        sp2 = "tú has " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you have " + gen.viparticiple[rand] + arrayEng;
                        eng22 = "you've " + gen.viparticiple[rand] + arrayEng;
                        sp3 = "él ha " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he has " + gen.viparticiple[rand] + arrayEng;
                        eng32 = "he's " + gen.viparticiple[rand] + arrayEng;
                        sp4 = "ella ha " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she has " + gen.viparticiple[rand] + arrayEng;
                        eng42 = "she's " + gen.viparticiple[rand] + arrayEng;
                        sp5 = "eso ha " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it has " + gen.viparticiple[rand] + arrayEng;
                        eng52 = "it's " + gen.viparticiple[rand] + arrayEng;
                        sp6 = "ellos han " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they have " + gen.viparticiple[rand] + arrayEng;
                        eng62 = "they've " + gen.viparticiple[rand] + arrayEng;
                        sp7 = "nosotros hemos " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we have " + gen.viparticiple[rand] + arrayEng;
                        eng72 = "we've " + gen.viparticiple[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no he " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I have not " + gen.viparticiple[rand] + arrayEng;
                        eng12 = "I haven't " + gen.viparticiple[rand] + arrayEng;
                        sp2 = "tú no has " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you have not " + gen.viparticiple[rand] + arrayEng;
                        eng22 = "you haven't " + gen.viparticiple[rand] + arrayEng;
                        sp3 = "él no ha " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he has not " + gen.viparticiple[rand] + arrayEng;
                        eng32 = "he hasn't " + gen.viparticiple[rand] + arrayEng;
                        sp4 = "ella no ha " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she has not " + gen.viparticiple[rand] + arrayEng;
                        eng42 = "she hasn't " + gen.viparticiple[rand] + arrayEng;
                        sp5 = "eso no ha " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it has not " + gen.viparticiple[rand] + arrayEng;
                        eng52 = "it hasn't " + gen.viparticiple[rand] + arrayEng;
                        sp6 = "ellos no han " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they have not  " + gen.viparticiple[rand] + arrayEng;
                        eng62 = "they haven't  " + gen.viparticiple[rand] + arrayEng;
                        sp7 = "nosotros no hemos " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we have not  " + gen.viparticiple[rand] + arrayEng;
                        eng72 = "we haven't  " + gen.viparticiple[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenPresPerfCont2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo he estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I have been " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú has estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you have been " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él ha estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he has been " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella ha estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she has been " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso ha estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it has been " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos han estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they have been " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros hemos estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we have been " + gen.vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no he estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I haven't been " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú no has estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you haven't been " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él no ha estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he hasn't been " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella no ha estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she hasn't been " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso no ha estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it hasn't been " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos no han estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they haven't been " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no hemos estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we haven't been " + gen.vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Pasados
    public void GenPastSimp2() {
        gen = new Generator();
        Pasts pas = new Pasts();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 4);


        for (String verbs : gen.vib) {
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
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estaba " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I was " + gen.vib3cont[rand] + arrayEng;
                        eng12 = "I was " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú estabas " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you were " + gen.vib3cont[rand] + arrayEng;
                        eng22 = "you were " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él estaba " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he was " + gen.vib3cont[rand] + arrayEng;
                        eng32 = "he was " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella estaba " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she was " + gen.vib3cont[rand] + arrayEng;
                        eng42 = "she was " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso estaba " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it was " + gen.vib3cont[rand] + arrayEng;
                        eng52 = "it was " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos estaban " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they were " + gen.vib3cont[rand] + arrayEng;
                        eng62 = "they were " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros estabamos " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we were " + gen.vib3cont[rand] + arrayEng;
                        eng72 = "we were " + gen.vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no estaba " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I was not " + gen.vib3cont[rand] + arrayEng;
                        eng12 = "I wasn't " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú no estabas " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you were not " + gen.vib3cont[rand] + arrayEng;
                        eng22 = "you weren't " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él no estaba " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he was not " + gen.vib3cont[rand] + arrayEng;
                        eng32 = "he wasn't " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella no estaba " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she was not " + gen.vib3cont[rand] + arrayEng;
                        eng42 = "she wasn't " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso no estaba " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it was not " + gen.vib3cont[rand] + arrayEng;
                        eng52 = "it wasn't " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos no estaban " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they were not  " + gen.vib3cont[rand] + arrayEng;
                        eng62 = "they weren't  " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no estabamos " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we were not  " + gen.vib3cont[rand] + arrayEng;
                        eng72 = "we weren't  " + gen.vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPastPerf2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo habia " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I had " + gen.viparticiple[rand] + arrayEng;
                        eng12 = "I had " + gen.viparticiple[rand] + arrayEng;
                        sp2 = "tú habias " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you had " + gen.viparticiple[rand] + arrayEng;
                        eng22 = "you had " + gen.viparticiple[rand] + arrayEng;
                        sp3 = "él habia " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he had " + gen.viparticiple[rand] + arrayEng;
                        eng32 = "he had " + gen.viparticiple[rand] + arrayEng;
                        sp4 = "ella habia " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she had " + gen.viparticiple[rand] + arrayEng;
                        eng42 = "she had " + gen.viparticiple[rand] + arrayEng;
                        sp5 = "eso habia " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it had " + gen.viparticiple[rand] + arrayEng;
                        eng52 = "it had " + gen.viparticiple[rand] + arrayEng;
                        sp6 = "ellos habian " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they had " + gen.viparticiple[rand] + arrayEng;
                        eng62 = "they had " + gen.viparticiple[rand] + arrayEng;
                        sp7 = "nosotros habiamos " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we had " + gen.viparticiple[rand] + arrayEng;
                        eng72 = "we had " + gen.viparticiple[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no habia " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I had not " + gen.viparticiple[rand] + arrayEng;
                        eng12 = "I hadn't " + gen.viparticiple[rand] + arrayEng;
                        sp2 = "tú no habias " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you had not " + gen.viparticiple[rand] + arrayEng;
                        eng22 = "you hadn't " + gen.viparticiple[rand] + arrayEng;
                        sp3 = "él no habia " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he had not " + gen.viparticiple[rand] + arrayEng;
                        eng32 = "he hadn't " + gen.viparticiple[rand] + arrayEng;
                        sp4 = "ella no habia " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she had not " + gen.viparticiple[rand] + arrayEng;
                        eng42 = "she hadn't " + gen.viparticiple[rand] + arrayEng;
                        sp5 = "eso no habia " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it had not " + gen.viparticiple[rand] + arrayEng;
                        eng52 = "it hadn't " + gen.viparticiple[rand] + arrayEng;
                        sp6 = "ellos no habian " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they had not  " + gen.viparticiple[rand] + arrayEng;
                        eng62 = "they hadn't  " + gen.viparticiple[rand] + arrayEng;
                        sp7 = "nosotros no habiamos " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we had not  " + gen.viparticiple[rand] + arrayEng;
                        eng72 = "we hadn't  " + gen.viparticiple[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPastPerfCont2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo había estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I had been " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú habías estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you had been " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él había estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he had been " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella había estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she had been " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso había estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it had been " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos habían " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they had been " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros habíamos estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we had been " + gen.vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no había estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I hadn't been " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú no habías estado  " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you hadn't been " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él no había estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he hadn't been " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella no había estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she hadn't been " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso no había estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it hadn't been " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos no habían " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they hadn't been " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no habíamos estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we hadn't been " + gen.vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Futuros
    public void GenFutSimp2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + gen.vib1f[rand] + arrayEsp;
                        eng1 = "I will " + gen.vib[rand] + arrayEng;
                        sp2 = "tú " + gen.vib2f[rand] + arrayEsp;
                        eng2 = "you will " + gen.vib[rand] + arrayEng;
                        sp3 = "él " + gen.vib3f[rand] + arrayEsp;
                        eng3 = "he will " + gen.vib[rand] + arrayEng;
                        sp4 = "ella " + gen.vib3f[rand] + arrayEsp;
                        eng4 = "she will " + gen.vib[rand] + arrayEng;
                        sp5 = "eso " + gen.vib3f[rand] + arrayEsp;
                        eng5 = "it will " + gen.vib[rand] + arrayEng;
                        sp6 = "ellos " + gen.vib4f[rand] + arrayEsp;
                        eng6 = "they will " + gen.vib[rand] + arrayEng;
                        sp7 = "nosotros " + gen.vibfnos[rand] + arrayEsp;
                        eng7 = "we will " + gen.vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo " + "no " + gen.vib1f[rand] + arrayEsp;
                        eng1 = "I " + "won't " + gen.vib[rand] + arrayEng;
                        sp2 = "tú " + "no " + gen.vib2f[rand] + arrayEsp;
                        eng2 = "you " + "won't " + gen.vib[rand] + arrayEng;
                        sp3 = "él " + "no " + gen.vib3f[rand] + arrayEsp;
                        eng3 = "he " + "won't " + gen.vib[rand] + arrayEng;
                        sp4 = "ella " + "no " + gen.vib3f[rand] + arrayEsp;
                        eng4 = "she " + "won't " + gen.vib[rand] + arrayEng;
                        sp5 = "eso " + "no " + gen.vib3f[rand] + arrayEsp;
                        eng5 = "it " + "won't " + gen.vib[rand] + arrayEng;
                        sp6 = "ellos " + "no " + gen.vib4f[rand] + arrayEsp;
                        eng6 = "they " + "won't " + gen.vib[rand] + arrayEng;
                        sp7 = "nosotros " + "no " + gen.vibfnos[rand] + arrayEsp;
                        eng7 = "we " + "won't " + gen.vib[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenFutCont2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estaré " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I will be " + gen.vib3cont[rand] + arrayEng;
                        eng12 = "I'll be " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú estaras " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you will be " + gen.vib3cont[rand] + arrayEng;
                        eng22 = "you'll be " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él estaré " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he will be " + gen.vib3cont[rand] + arrayEng;
                        eng32 = "he'll be " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella estaré " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she will be " + gen.vib3cont[rand] + arrayEng;
                        eng32 = "he'll be " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso estaré " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it will be " + gen.vib3cont[rand] + arrayEng;
                        eng52 = "it'll be " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos estaran " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they will be " + gen.vib3cont[rand] + arrayEng;
                        eng62 = "they'll be " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros estaremos " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we will be " + gen.vib3cont[rand] + arrayEng;
                        eng72 = "we'll be " + gen.vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no estaré " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I will not be " + gen.vib3cont[rand] + arrayEng;
                        eng12 = "I won't be " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú no estaras " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you will not be " + gen.vib3cont[rand] + arrayEng;
                        eng22 = "you won't be " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él no estaré " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he will not be " + gen.vib3cont[rand] + arrayEng;
                        eng32 = "he won't be " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella no estaré " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she will not be " + gen.vib3cont[rand] + arrayEng;
                        eng42 = "she won't be " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso no estaré " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it will not be " + gen.vib3cont[rand] + arrayEng;
                        eng52 = "it won't be " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos no estaran " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they will not be " + gen.vib3cont[rand] + arrayEng;
                        eng62 = "they won't be " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no estaremos " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we will not be " + gen.vib3cont[rand] + arrayEng;
                        eng72 = "we won't be " + gen.vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenFutPerf2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo habre " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I will have " + gen.viparticiple[rand] + arrayEng;
                        eng12 = "I'll have " + gen.viparticiple[rand] + arrayEng;
                        sp2 = "tú habrás " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you will have " + gen.viparticiple[rand] + arrayEng;
                        eng22 = "you'll have " + gen.viparticiple[rand] + arrayEng;
                        sp3 = "él habrá " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he will have " + gen.viparticiple[rand] + arrayEng;
                        eng32 = "he'll have  " + gen.viparticiple[rand] + arrayEng;
                        sp4 = "ella habrá " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she will have " + gen.viparticiple[rand] + arrayEng;
                        eng42 = "she'll have  " + gen.viparticiple[rand] + arrayEng;
                        sp5 = "eso habrá " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it will have " + gen.viparticiple[rand] + arrayEng;
                        eng52 = "it'll have  " + gen.viparticiple[rand] + arrayEng;
                        sp6 = "ellos habrán " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they will have " + gen.viparticiple[rand] + arrayEng;
                        eng62 = "they'll have " + gen.viparticiple[rand] + arrayEng;
                        sp7 = "nosotros habremos "  + gen.vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we will have " + gen.viparticiple[rand] + arrayEng;
                        eng72 = "we'll have " + gen.viparticiple[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no habre " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I will not have " + gen.viparticiple[rand] + arrayEng;
                        eng12 = "I won't have " + gen.viparticiple[rand] + arrayEng;
                        sp2 = "tú no habrás " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you will not have " + gen.viparticiple[rand] + arrayEng;
                        eng22 = "you won't have " + gen.viparticiple[rand] + arrayEng;
                        sp3 = "él no habrá " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he will not have " + gen.viparticiple[rand] + arrayEng;
                        eng32 = "he won't have " + gen.viparticiple[rand] + arrayEng;
                        sp4 = "ella no habrá " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she will not have " + gen.viparticiple[rand] + arrayEng;
                        eng42 = "she won't have " + gen.viparticiple[rand] + arrayEng;
                        sp5 = "eso no habrá " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it will not have " + gen.viparticiple[rand] + arrayEng;
                        eng52 = "it won't have " + gen.viparticiple[rand] + arrayEng;
                        sp6 = "ellos no habrán " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they will not have  " + gen.viparticiple[rand] + arrayEng;
                        eng62 = "they won't have  " + gen.viparticiple[rand] + arrayEng;
                        sp7 = "nosotros no habremos "  + gen.vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we will not have  " + gen.viparticiple[rand] + arrayEng;
                        eng72 = "we won't have  " + gen.viparticiple[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenFutPerfCont2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo habré estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I will have been " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú habrás estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you will have been " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él habrá estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he will have been " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella habrá estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she will have been " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso habrá estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it will have been " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos habrán estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they will have been " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros habremos estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we will have been " + gen.vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no habré estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I won't have been " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú no habrás estado  " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you won't have been " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él no habrá estado   " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he won't have been " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella no habrá estado   " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she won't have been " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso no habrá estado   " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it won't have been " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos no habran estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they won't have been " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no habremos estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we won't have been " + gen.vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Would
    public void GenWouldSimp2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + gen.vib1w[rand] + arrayEsp;
                        eng1 = "I would " + gen.vib[rand] + arrayEng;
                        sp2 = "tú " + gen.vib2w[rand] + arrayEsp;
                        eng2 = "you would " + gen.vib[rand] + arrayEng;
                        sp3 = "él " + gen.vib3w[rand] + arrayEsp;
                        eng3 = "he would " + gen.vib[rand] + arrayEng;
                        sp4 = "ella " + gen.vib3w[rand] + arrayEsp;
                        eng4 = "she would " + gen.vib[rand] + arrayEng;
                        sp5 = "eso " + gen.vib3w[rand] + arrayEsp;
                        eng5 = "it would " + gen.vib[rand] + arrayEng;
                        sp6 = "ellos " + gen.vib4w[rand] + arrayEsp;
                        eng6 = "they would " + gen.vib[rand] + arrayEng;
                        sp7 = "nosotros " + gen.vib5w[rand] + arrayEsp;
                        eng7 = "we would " + gen.vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo " + "no " + gen.vib1w[rand] + arrayEsp;
                        eng1 = "I " + "wouldn't " + gen.vib[rand] + arrayEng;
                        sp2 = "tú " + "no " + gen.vib2w[rand] + arrayEsp;
                        eng2 = "you " + "wouldn't " + gen.vib[rand] + arrayEng;
                        sp3 = "él " + "no " + gen.vib3w[rand] + arrayEsp;
                        eng3 = "he " + "wouldn't " + gen.vib[rand] + arrayEng;
                        sp4 = "ella " + "no " + gen.vib3w[rand] + arrayEsp;
                        eng4 = "she " + "wouldn't " + gen.vib[rand] + arrayEng;
                        sp5 = "eso " + "no " + gen.vib3w[rand] + arrayEsp;
                        eng5 = "it " + "wouldn't " + gen.vib[rand] + arrayEng;
                        sp6 = "ellos " + "no " + gen.vib4w[rand] + arrayEsp;
                        eng6 = "they " + "wouldn't " + gen.vib[rand] + arrayEng;
                        sp7 = "nosotros " + "no " + gen.vib5w[rand] + arrayEsp;
                        eng7 = "we " + "wouldn't " + gen.vib[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenWouldCont2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estaría " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I would be " + gen.vib3cont[rand] + arrayEng;
                        eng12 = "I'd be " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú estarías " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you would be " + gen.vib3cont[rand] + arrayEng;
                        eng22 = "you'd be " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él estaría " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he would be " + gen.vib3cont[rand] + arrayEng;
                        eng32 = "he'd be " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella estaría " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she would be " + gen.vib3cont[rand] + arrayEng;
                        eng42 = "she'd be " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso estaría " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it would be " + gen.vib3cont[rand] + arrayEng;
                        eng52 = "it'd be " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos estarían " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they would be " + gen.vib3cont[rand] + arrayEng;
                        eng62 = "they'd be " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros estaríamos " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we would be " + gen.vib3cont[rand] + arrayEng;
                        eng72 = "we'd be " + gen.vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no estaría " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I would not be " + gen.vib3cont[rand] + arrayEng;
                        eng12 = "I wouldn't be " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú no estarías " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you would not be " + gen.vib3cont[rand] + arrayEng;
                        eng22 = "you wouldn't be " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él no estaría " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he would not be " + gen.vib3cont[rand] + arrayEng;
                        eng32 = "he wouldn't be " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella no estaría " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she would not be " + gen.vib3cont[rand] + arrayEng;
                        eng42 = "she wouldn't be " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso no estaría " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it would not be " + gen.vib3cont[rand] + arrayEng;
                        eng52 = "it wouldn't be " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos no estarían " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they would not be  " + gen.vib3cont[rand] + arrayEng;
                        eng62 = "they wouldn't be  " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no estaríamos " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we would not be  " + gen.vib3cont[rand] + arrayEng;
                        eng72 = "we wouldn't be  " + gen.vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenWouldPerf2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo hubiera " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I would have " + gen.viparticiple[rand] + arrayEng;
                        eng12 = "I'd have " + gen.viparticiple[rand] + arrayEng;
                        sp2 = "tú hubieras " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you would have " + gen.viparticiple[rand] + arrayEng;
                        eng22 = "you'd have " + gen.viparticiple[rand] + arrayEng;
                        sp3 = "él hubiera " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he would have " + gen.viparticiple[rand] + arrayEng;
                        eng32 = "he'd have  " + gen.viparticiple[rand] + arrayEng;
                        sp4 = "ella hubiera " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she would have " + gen.viparticiple[rand] + arrayEng;
                        eng42 = "she'd have  " + gen.viparticiple[rand] + arrayEng;
                        sp5 = "eso hubiera " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it would have " + gen.viparticiple[rand] + arrayEng;
                        eng52 = "it'd have  " + gen.viparticiple[rand] + arrayEng;
                        sp6 = "ellos hubieran " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they would have " + gen.viparticiple[rand] + arrayEng;
                        eng62 = "they'd have " + gen.viparticiple[rand] + arrayEng;
                        sp7 = "nosotros habríamos "  + gen.vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we would have " + gen.viparticiple[rand] + arrayEng;
                        eng72 = "we'd have " + gen.viparticiple[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no hubiera " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I would not have " + gen.viparticiple[rand] + arrayEng;
                        eng12 = "I wouldn't have " + gen.viparticiple[rand] + arrayEng;
                        sp2 = "tú no hubieras " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you would not have " + gen.viparticiple[rand] + arrayEng;
                        eng22 = "you wouldn't have " + gen.viparticiple[rand] + arrayEng;
                        sp3 = "él no hubiera " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he would not have " + gen.viparticiple[rand] + arrayEng;
                        eng32 = "he wouldn't have " + gen.viparticiple[rand] + arrayEng;
                        sp4 = "ella no hubiera " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she would not have " + gen.viparticiple[rand] + arrayEng;
                        eng42 = "she wouldn't have " + gen.viparticiple[rand] + arrayEng;
                        sp5 = "eso no hubiera " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it would not have " + gen.viparticiple[rand] + arrayEng;
                        eng52 = "it wouldn't have " + gen.viparticiple[rand] + arrayEng;
                        sp6 = "ellos no hubieran " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they would not have  " + gen.viparticiple[rand] + arrayEng;
                        eng62 = "they wouldn't have  " + gen.viparticiple[rand] + arrayEng;
                        sp7 = "nosotros no habríamos "  + gen.vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we would not have  " + gen.viparticiple[rand] + arrayEng;
                        eng72 = "we wouldn't have  " + gen.viparticiple[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenWouldPerfCont2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo hubiera estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I would have been " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú hubieras estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you would have been " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él hubiera estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he would have been " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella hubiera estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she would have been " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso hubiera estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it would have been " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos hubieran estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they would have been " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros hubiésemos estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we would have been " + gen.vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no hubiera estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I wouldn't have been " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú no hubieras estado  " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you wouldn't have been " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él no hubiera estado   " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he wouldn't have been " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella no hubiera estado   " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she wouldn't have been " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso no hubiera estado   " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it wouldn't have been " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos no habran estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they wouldn't have been " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no hubiésemos estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we wouldn't have been " + gen.vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023

    //COULD
    public void GenCouldSimp2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo podría " + gen.vibesp[rand] + arrayEsp;
                        eng1 = "I could " + gen.vib[rand] + arrayEng;
                        sp2 = "tú podrías " + gen.vibesp[rand] + arrayEsp;
                        eng2 = "you could " + gen.vib[rand] + arrayEng;
                        sp3 = "él podría " + gen.vibesp[rand] + arrayEsp;
                        eng3 = "he could " + gen.vib[rand] + arrayEng;
                        sp4 = "ella podría " + gen.vibesp[rand] + arrayEsp;
                        eng4 = "she could " + gen.vib[rand] + arrayEng;
                        sp5 = "eso podría " + gen.vibesp[rand] + arrayEsp;
                        eng5 = "it could " + gen.vib[rand] + arrayEng;
                        sp6 = "ellos podrían " + gen.vibesp[rand] + arrayEsp;
                        eng6 = "they could " + gen.vib[rand] + arrayEng;
                        sp7 = "nosotros podríamos " + gen.vibesp[rand] + arrayEsp;
                        eng7 = "we could " + gen.vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo " + "no podría " + gen.vibesp[rand] + arrayEsp;
                        eng1 = "I " + "couldn't " + gen.vib[rand] + arrayEng;
                        sp2 = "tú " + "no podrías " + gen.vibesp[rand] + arrayEsp;
                        eng2 = "you " + "couldn't " + gen.vib[rand] + arrayEng;
                        sp3 = "él " + "no podría " + gen.vibesp[rand] + arrayEsp;
                        eng3 = "he " + "couldn't " + gen.vib[rand] + arrayEng;
                        sp4 = "ella " + "no podría " + gen.vibesp[rand] + arrayEsp;
                        eng4 = "she " + "couldn't " + gen.vib[rand] + arrayEng;
                        sp5 = "eso " + "no podría " + gen.vibesp[rand] + arrayEsp;
                        eng5 = "it " + "couldn't " + gen.vib[rand] + arrayEng;
                        sp6 = "ellos " + "no podrían " + gen.vibesp[rand] + arrayEsp;
                        eng6 = "they " + "couldn't " + gen.vib[rand] + arrayEng;
                        sp7 = "nosotros " + "no podríamos " + gen.vibesp[rand] + arrayEsp;
                        eng7 = "we " + "couldn't " + gen.vib[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenCouldCont2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo podría estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I could be " + gen.vib3cont[rand] + arrayEng;
                        eng12 = "I could be " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú podrías estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you could be " + gen.vib3cont[rand] + arrayEng;
                        eng22 = "you could be " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él podría estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he could be " + gen.vib3cont[rand] + arrayEng;
                        eng32 = "he could be " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella podría estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she could be " + gen.vib3cont[rand] + arrayEng;
                        eng42 = "she could be " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso podría estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it could be " + gen.vib3cont[rand] + arrayEng;
                        eng52 = "it could be " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos podrían estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they could be " + gen.vib3cont[rand] + arrayEng;
                        eng62 = "they could be " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros podríamos estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we could be " + gen.vib3cont[rand] + arrayEng;
                        eng72 = "we could be " + gen.vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no podría estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I could not be " + gen.vib3cont[rand] + arrayEng;
                        eng12 = "I couldn't be " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú no podrías estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you could not be " + gen.vib3cont[rand] + arrayEng;
                        eng22 = "you couldn't be " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él no podría estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he could not be " + gen.vib3cont[rand] + arrayEng;
                        eng32 = "he couldn't be " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella no podría estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she could not be " + gen.vib3cont[rand] + arrayEng;
                        eng42 = "she couldn't be " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso no podría estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it could not be " + gen.vib3cont[rand] + arrayEng;
                        eng52 = "it couldn't be " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos no podrían estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they could not be  " + gen.vib3cont[rand] + arrayEng;
                        eng62 = "they couldn't be  " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no podríamos estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we could not be  " + gen.vib3cont[rand] + arrayEng;
                        eng72 = "we couldn't be  " + gen.vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenCouldPerf2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo pudiese haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I could have " + gen.viparticiple[rand] + arrayEng;
                        eng12 = "I could have " + gen.viparticiple[rand] + arrayEng;
                        sp2 = "tú pudieses haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you could have " + gen.viparticiple[rand] + arrayEng;
                        eng22 = "you could have " + gen.viparticiple[rand] + arrayEng;
                        sp3 = "él pudiese haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he could have " + gen.viparticiple[rand] + arrayEng;
                        eng32 = "he could have  " + gen.viparticiple[rand] + arrayEng;
                        sp4 = "ella pudiese haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she could have " + gen.viparticiple[rand] + arrayEng;
                        eng42 = "she could have  " + gen.viparticiple[rand] + arrayEng;
                        sp5 = "eso pudiese haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it could have " + gen.viparticiple[rand] + arrayEng;
                        eng52 = "it could have  " + gen.viparticiple[rand] + arrayEng;
                        sp6 = "ellos pudiesen haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they could have " + gen.viparticiple[rand] + arrayEng;
                        eng62 = "they could have " + gen.viparticiple[rand] + arrayEng;
                        sp7 = "nosotros pudiesemos haber "  + gen.vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we could have " + gen.viparticiple[rand] + arrayEng;
                        eng72 = "we could have " + gen.viparticiple[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no pudiese haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I could not have " + gen.viparticiple[rand] + arrayEng;
                        eng12 = "I couldn't have " + gen.viparticiple[rand] + arrayEng;
                        sp2 = "tú no pudieses haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you could not have " + gen.viparticiple[rand] + arrayEng;
                        eng22 = "you couldn't have " + gen.viparticiple[rand] + arrayEng;
                        sp3 = "él no pudiese haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he could not have " + gen.viparticiple[rand] + arrayEng;
                        eng32 = "he couldn't have " + gen.viparticiple[rand] + arrayEng;
                        sp4 = "ella no pudiese haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she could not have " + gen.viparticiple[rand] + arrayEng;
                        eng42 = "she couldn't have " + gen.viparticiple[rand] + arrayEng;
                        sp5 = "eso no pudiese haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it could not have " + gen.viparticiple[rand] + arrayEng;
                        eng52 = "it couldn't have " + gen.viparticiple[rand] + arrayEng;
                        sp6 = "ellos no pudiesen haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they could not have  " + gen.viparticiple[rand] + arrayEng;
                        eng62 = "they couldn't have  " + gen.viparticiple[rand] + arrayEng;
                        sp7 = "nosotros no pudiesemos haber "  + gen.vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we could not have  " + gen.viparticiple[rand] + arrayEng;
                        eng72 = "we couldn't have  " + gen.viparticiple[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenCouldPerfCont2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo podría haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I could have been " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú podrías haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you could have been " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él podría haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he could have been " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella podría haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she could have been " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso podría haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it could have been " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos podrían haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they could have been " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros podríamos haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we could have been " + gen.vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no podría haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I couldn't have been " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú no podrías haber estado  " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you couldn't have been " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él no podría haber estado   " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he couldn't have been " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella no podría haber estado   " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she couldn't have been " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso no podría haber estado   " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it couldn't have been " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos no habran estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they couldn't have been " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no podríamos haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we couldn't have been " + gen.vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Might
    public void GenMightSimp2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá " + gen.vib1s[rand] + arrayEsp;
                        eng1 = "I might " + gen.vib[rand] + arrayEng;
                        sp2 = "tú quizá " + gen.vib2s[rand] + arrayEsp;
                        eng2 = "you might " + gen.vib[rand] + arrayEng;
                        sp3 = "él quizá " + gen.vib3s[rand] + arrayEsp;
                        eng3 = "he might " + gen.vib[rand] + arrayEng;
                        sp4 = "ella quizá " + gen.vib3s[rand] + arrayEsp;
                        eng4 = "she might " + gen.vib[rand] + arrayEng;
                        sp5 = "eso quizá " + gen.vib3s[rand] + arrayEsp;
                        eng5 = "it might " + gen.vib[rand] + arrayEng;
                        sp6 = "ellos quizá " + gen.vib4s[rand] + arrayEsp;
                        eng6 = "they might " + gen.vib[rand] + arrayEng;
                        sp7 = "nosotros quizá " + gen.vib5s[rand] + arrayEsp;
                        eng7 = "we might " + gen.vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo " + "quizá no " + gen.vib1s[rand] + arrayEsp;
                        eng1 = "I " + "might not  " + gen.vib[rand] + arrayEng;
                        sp2 = "tú " + "quizá no " + gen.vib2s[rand] + arrayEsp;
                        eng2 = "you " + "might not  " + gen.vib[rand] + arrayEng;
                        sp3 = "él " + "quizá no " + gen.vib3s[rand] + arrayEsp;
                        eng3 = "he " + "might not  " + gen.vib[rand] + arrayEng;
                        sp4 = "ella " + "quizá no " + gen.vib3s[rand] + arrayEsp;
                        eng4 = "she " + "might not  " + gen.vib[rand] + arrayEng;
                        sp5 = "eso " + "quizá no " + gen.vib3s[rand] + arrayEsp;
                        eng5 = "it " + "might not  " + gen.vib[rand] + arrayEng;
                        sp6 = "ellos " + "quizá no " + gen.vib4s[rand] + arrayEsp;
                        eng6 = "they " + "might not  " + gen.vib[rand] + arrayEng;
                        sp7 = "nosotros " + "quizá no " + gen.vib5s[rand] + arrayEsp;
                        eng7 = "we " + "might not  " + gen.vib[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenMightCont2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá esté " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I might be " + gen.vib3cont[rand] + arrayEng;
                        eng12 = "I might be " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú quizá estés " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you might be " + gen.vib3cont[rand] + arrayEng;
                        eng22 = "you might be " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él quizá esté " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he might be " + gen.vib3cont[rand] + arrayEng;
                        eng32 = "he might be " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella quizá esté " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she might be " + gen.vib3cont[rand] + arrayEng;
                        eng42 = "she might be " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso quizá esté " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it might be " + gen.vib3cont[rand] + arrayEng;
                        eng52 = "it might be " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos quizá estén " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they might be " + gen.vib3cont[rand] + arrayEng;
                        eng62 = "they might be " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros quizá estémos " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we might be " + gen.vib3cont[rand] + arrayEng;
                        eng72 = "we might be " + gen.vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no quizá esté " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I might not be " + gen.vib3cont[rand] + arrayEng;
                        eng12 = "I mightn't be " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú no quizá estés " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you might not be " + gen.vib3cont[rand] + arrayEng;
                        eng22 = "you mightn't be " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él no quizá esté " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he might not be " + gen.vib3cont[rand] + arrayEng;
                        eng32 = "he mightn't be " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella no quizá esté " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she might not be " + gen.vib3cont[rand] + arrayEng;
                        eng42 = "she mightn't be " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso no quizá esté " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it might not be " + gen.vib3cont[rand] + arrayEng;
                        eng52 = "it mightn't be " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos no quizá estén " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they might not be  " + gen.vib3cont[rand] + arrayEng;
                        eng62 = "they mightn't be  " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no quizá estémos " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we might not be  " + gen.vib3cont[rand] + arrayEng;
                        eng72 = "we mightn't be  " + gen.vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenMightPerf2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá haya " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I might have " + gen.viparticiple[rand] + arrayEng;
                        eng12 = "I might have " + gen.viparticiple[rand] + arrayEng;
                        sp2 = "tú quizá hayas " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you might have " + gen.viparticiple[rand] + arrayEng;
                        eng22 = "you might have " + gen.viparticiple[rand] + arrayEng;
                        sp3 = "él quizá haya " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he might have " + gen.viparticiple[rand] + arrayEng;
                        eng32 = "he might have  " + gen.viparticiple[rand] + arrayEng;
                        sp4 = "ella quizá haya " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she might have " + gen.viparticiple[rand] + arrayEng;
                        eng42 = "she might have  " + gen.viparticiple[rand] + arrayEng;
                        sp5 = "eso quizá haya " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it might have " + gen.viparticiple[rand] + arrayEng;
                        eng52 = "it might have  " + gen.viparticiple[rand] + arrayEng;
                        sp6 = "ellos quizá hayan " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they might have " + gen.viparticiple[rand] + arrayEng;
                        eng62 = "they might have " + gen.viparticiple[rand] + arrayEng;
                        sp7 = "nosotros quizá hayamos "  + gen.vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we might have " + gen.viparticiple[rand] + arrayEng;
                        eng72 = "we might have " + gen.viparticiple[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no quizá haya " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I might not have " + gen.viparticiple[rand] + arrayEng;
                        eng12 = "I mightn't have " + gen.viparticiple[rand] + arrayEng;
                        sp2 = "tú no quizá hayas " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you might not have " + gen.viparticiple[rand] + arrayEng;
                        eng22 = "you mightn't have " + gen.viparticiple[rand] + arrayEng;
                        sp3 = "él no quizá haya " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he might not have " + gen.viparticiple[rand] + arrayEng;
                        eng32 = "he mightn't have " + gen.viparticiple[rand] + arrayEng;
                        sp4 = "ella no quizá haya " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she might not have " + gen.viparticiple[rand] + arrayEng;
                        eng42 = "she mightn't have " + gen.viparticiple[rand] + arrayEng;
                        sp5 = "eso no quizá haya " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it might not have " + gen.viparticiple[rand] + arrayEng;
                        eng52 = "it mightn't have " + gen.viparticiple[rand] + arrayEng;
                        sp6 = "ellos no quizá hayan " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they might not have  " + gen.viparticiple[rand] + arrayEng;
                        eng62 = "they mightn't have  " + gen.viparticiple[rand] + arrayEng;
                        sp7 = "nosotros no quizá hayamos "  + gen.vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we might not have  " + gen.viparticiple[rand] + arrayEng;
                        eng72 = "we mightn't have  " + gen.viparticiple[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenMightPerfCont2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá haya estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I might have been " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú quizá hayas estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you might have been " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él quizá haya estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he might have been " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella quizá haya estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she might have been " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso quizá haya estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it might have been " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos quizá hayan estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they might have been " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros quizá hayamos estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we might have been " + gen.vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo quizá no haya estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I might not have been " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú quizá no hayas estado  " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you might not have been " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él quizá no haya estado   " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he might not have been " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella quizá no haya estado   " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she might not have been " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso quizá no haya estado   " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it might not have been " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos no habran estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they might not have been " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros quizá no hayamos estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we might not have been " + gen.vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023

    //SHOULD
    public void GenShouldSimp2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería " + gen.vibesp[rand] + arrayEsp;
                        eng1 = "I should " + gen.vib[rand] + arrayEng;
                        sp2 = "tú deberías " + gen.vibesp[rand] + arrayEsp;
                        eng2 = "you should " + gen.vib[rand] + arrayEng;
                        sp3 = "él debería " + gen.vibesp[rand] + arrayEsp;
                        eng3 = "he should " + gen.vib[rand] + arrayEng;
                        sp4 = "ella debería " + gen.vibesp[rand] + arrayEsp;
                        eng4 = "she should " + gen.vib[rand] + arrayEng;
                        sp5 = "eso debería " + gen.vibesp[rand] + arrayEsp;
                        eng5 = "it should " + gen.vib[rand] + arrayEng;
                        sp6 = "ellos deberían " + gen.vibesp[rand] + arrayEsp;
                        eng6 = "they should " + gen.vib[rand] + arrayEng;
                        sp7 = "nosotros deberíamos " + gen.vibesp[rand] + arrayEsp;
                        eng7 = "we should " + gen.vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo " + "no debería " + gen.vibesp[rand] + arrayEsp;
                        eng1 = "I " + "shouldn't " + gen.vib[rand] + arrayEng;
                        sp2 = "tú " + "no deberías " + gen.vibesp[rand] + arrayEsp;
                        eng2 = "you " + "shouldn't " + gen.vib[rand] + arrayEng;
                        sp3 = "él " + "no debería " + gen.vibesp[rand] + arrayEsp;
                        eng3 = "he " + "shouldn't " + gen.vib[rand]+ arrayEng;
                        sp4 = "ella " + "no debería " + gen.vibesp[rand] + arrayEsp;
                        eng4 = "she " + "shouldn't " + gen.vib[rand] + arrayEng;
                        sp5 = "eso " + "no debería " + gen.vibesp[rand] + arrayEsp;
                        eng5 = "it " + "shouldn't " + gen.vib[rand]+ arrayEng;
                        sp6 = "ellos " + "no deberían " + gen.vibesp[rand] + arrayEsp;
                        eng6 = "they " + "shouldn't " + gen.vib[rand] + arrayEng;
                        sp7 = "nosotros " + "no deberíamos " + gen.vibesp[rand] + arrayEsp;
                        eng7 = "we " + "shouldn't " + gen.vib[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenShouldCont2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I should be " + gen.vib3cont[rand] + arrayEng;
                        eng12 = "I should be " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú deberías estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you should be " + gen.vib3cont[rand] + arrayEng;
                        eng22 = "you should be " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él debería estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he should be " + gen.vib3cont[rand] + arrayEng;
                        eng32 = "he should be " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella debería estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she should be " + gen.vib3cont[rand] + arrayEng;
                        eng42 = "she should be " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso debería estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it should be " + gen.vib3cont[rand] + arrayEng;
                        eng52 = "it should be " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos deberían estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they should be " + gen.vib3cont[rand] + arrayEng;
                        eng62 = "they should be " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros deberíamos estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we should be " + gen.vib3cont[rand] + arrayEng;
                        eng72 = "we should be " + gen.vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no debería estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I should not be " + gen.vib3cont[rand] + arrayEng;
                        eng12 = "I shouldn't be " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú no deberías estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you should not be " + gen.vib3cont[rand] + arrayEng;
                        eng22 = "you shouldn't be " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él no debería estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he should not be " + gen.vib3cont[rand] + arrayEng;
                        eng32 = "he shouldn't be " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella no debería estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she should not be " + gen.vib3cont[rand] + arrayEng;
                        eng42 = "she shouldn't be " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso no debería estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it should not be " + gen.vib3cont[rand] + arrayEng;
                        eng52 = "it shouldn't be " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos no deberían estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they should not be  " + gen.vib3cont[rand] + arrayEng;
                        eng62 = "they shouldn't be  " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no deberíamos estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we should not be  " + gen.vib3cont[rand] + arrayEng;
                        eng72 = "we shouldn't be  " + gen.vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenShouldPerf2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I should have " + gen.viparticiple[rand] + arrayEng;
                        eng12 = "I should have " + gen.viparticiple[rand] + arrayEng;
                        sp2 = "tú deberías haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you should have " + gen.viparticiple[rand] + arrayEng;
                        eng22 = "you should have " + gen.viparticiple[rand] + arrayEng;
                        sp3 = "él debería haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he should have " + gen.viparticiple[rand] + arrayEng;
                        eng32 = "he should have  " + gen.viparticiple[rand] + arrayEng;
                        sp4 = "ella debería haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she should have " + gen.viparticiple[rand] + arrayEng;
                        eng42 = "she should have  " + gen.viparticiple[rand] + arrayEng;
                        sp5 = "eso debería haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it should have " + gen.viparticiple[rand] + arrayEng;
                        eng52 = "it should have  " + gen.viparticiple[rand] + arrayEng;
                        sp6 = "ellos deberían haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they should have " + gen.viparticiple[rand] + arrayEng;
                        eng62 = "they should have " + gen.viparticiple[rand] + arrayEng;
                        sp7 = "nosotros deberíamos haber "  + gen.vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we should have " + gen.viparticiple[rand] + arrayEng;
                        eng72 = "we should have " + gen.viparticiple[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no debería haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng1 = "I should not have " + gen.viparticiple[rand] + arrayEng;
                        eng12 = "I shouldn't have " + gen.viparticiple[rand] + arrayEng;
                        sp2 = "tú no deberías haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng2 = "you should not have " + gen.viparticiple[rand] + arrayEng;
                        eng22 = "you shouldn't have " + gen.viparticiple[rand] + arrayEng;
                        sp3 = "él no debería haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng3 = "he should not have " + gen.viparticiple[rand] + arrayEng;
                        eng32 = "he shouldn't have " + gen.viparticiple[rand] + arrayEng;
                        sp4 = "ella no debería haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng4 = "she should not have " + gen.viparticiple[rand] + arrayEng;
                        eng42 = "she shouldn't have " + gen.viparticiple[rand] + arrayEng;
                        sp5 = "eso no debería haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng5 = "it should not have " + gen.viparticiple[rand] + arrayEng;
                        eng52 = "it shouldn't have " + gen.viparticiple[rand] + arrayEng;
                        sp6 = "ellos no deberían haber " + gen.vibparticipiosp[rand] + arrayEsp;
                        eng6 = "they should not have  " + gen.viparticiple[rand] + arrayEng;
                        eng62 = "they shouldn't have  " + gen.viparticiple[rand] + arrayEng;
                        sp7 = "nosotros no deberíamos haber "  + gen.vibparticipiosp[rand] + arrayEsp;
                        eng7 = "we should not have  " + gen.viparticiple[rand] + arrayEng;
                        eng72 = "we shouldn't have  " + gen.viparticiple[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenShouldPerfCont2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I should have been " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú deberías haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you should have been " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él debería haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he should have been " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella debería haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she should have been " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso debería haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it should have been " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos deberían haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they should have been " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros deberíamos haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we should have been " + gen.vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no debería haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I shouldn't have been " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú no deberías haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you shouldn't have been " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él no debería haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he shouldn't have been " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella no debería haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she shouldn't have been " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso no debería haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it shouldn't have been " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos no deberían haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they shouldn't have been " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no deberíamos haber estado " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we shouldn't have been " + gen.vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Can
    public void GenCanSimp2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo puedo " + gen.vibesp[rand] + arrayEsp;
                        eng1 = "I can " + gen.vib[rand] + arrayEng;
                        sp2 = "tú puedes " + gen.vibesp[rand] + arrayEsp;
                        eng2 = "you can " + gen.vib[rand] + arrayEng;
                        sp3 = "él puede " + gen.vibesp[rand] + arrayEsp;
                        eng3 = "he can " + gen.vib[rand] + arrayEng;
                        sp4 = "ella puede " + gen.vibesp[rand] + arrayEsp;
                        eng4 = "she can " + gen.vib[rand] + arrayEng;
                        sp5 = "eso puede " + gen.vibesp[rand] + arrayEsp;
                        eng5 = "it can " + gen.vib[rand] + arrayEng;
                        sp6 = "ellos pueden " + gen.vibesp[rand] + arrayEsp;
                        eng6 = "they can " + gen.vib[rand] + arrayEng;
                        sp7 = "nosotros podemos " + gen.vibesp[rand] + arrayEsp;
                        eng7 = "we can " + gen.vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo " + "no puedo " + gen.vibesp[rand] + arrayEsp;
                        eng1 = "I " + "can't " + gen.vib[rand] + arrayEng;
                        sp2 = "tú " + "no puedes " + gen.vibesp[rand] + arrayEsp;
                        eng2 = "you " + "can't " + gen.vib[rand] + arrayEng;
                        sp3 = "él " + "no puede " + gen.vibesp[rand] + arrayEsp;
                        eng3 = "he " + "can't " + gen.vib[rand] + arrayEng;
                        sp4 = "ella " + "no puede " + gen.vibesp[rand] + arrayEsp;
                        eng4 = "she " + "can't " + gen.vib[rand] + arrayEng;
                        sp5 = "eso " + "no puede " + gen.vibesp[rand] + arrayEsp;
                        eng5 = "it " + "can't " + gen.vib[rand] + arrayEng;
                        sp6 = "ellos " + "no pueden " + gen.vibesp[rand] + arrayEsp;
                        eng6 = "they " + "can't " + gen.vib[rand] + arrayEng;
                        sp7 = "nosotros " + "no podemos " + gen.vibesp[rand] + arrayEsp;
                        eng7 = "we " + "can't " + gen.vib[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenCanCont2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo puedo estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I can be " + gen.vib3cont[rand] + arrayEng;
                        eng12 = "I can be " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú puedes estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you can be " + gen.vib3cont[rand] + arrayEng;
                        eng22 = "you can be " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él puede estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he can be " + gen.vib3cont[rand] + arrayEng;
                        eng32 = "he can be " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella puede estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she can be " + gen.vib3cont[rand] + arrayEng;
                        eng42 = "she can be " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso puede estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it can be " + gen.vib3cont[rand] + arrayEng;
                        eng52 = "it can be " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos pueden estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they can be " + gen.vib3cont[rand] + arrayEng;
                        eng62 = "they can be " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros podemos estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we can be " + gen.vib3cont[rand] + arrayEng;
                        eng72 = "we can be " + gen.vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no puedo estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I can not be " + gen.vib3cont[rand] + arrayEng;
                        eng12 = "I can't be " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú no puedes estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you can not be " + gen.vib3cont[rand] + arrayEng;
                        eng22 = "you can't be " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él no puede estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he can not be " + gen.vib3cont[rand] + arrayEng;
                        eng32 = "he can't be " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella no puede estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she can not be " + gen.vib3cont[rand] + arrayEng;
                        eng42 = "she can't be " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso no puede estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it can not be " + gen.vib3cont[rand] + arrayEng;
                        eng52 = "it can't be " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos no pueden estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they can not be  " + gen.vib3cont[rand] + arrayEng;
                        eng62 = "they can't be  " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no podemos estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we can not be  " + gen.vib3cont[rand] + arrayEng;
                        eng72 = "we can't be  " + gen.vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023
    //Must
    public void GenMustSimp2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debo " + gen.vibesp[rand] + arrayEsp;
                        eng1 = "I must " + gen.vib[rand] + arrayEng;
                        sp2 = "tú debés " + gen.vibesp[rand] + arrayEsp;
                        eng2 = "you must " + gen.vib[rand] + arrayEng;
                        sp3 = "él debe " + gen.vibesp[rand] + arrayEsp;
                        eng3 = "he must " + gen.vib[rand] + arrayEng;
                        sp4 = "ella debe " + gen.vibesp[rand] + arrayEsp;
                        eng4 = "she must " + gen.vib[rand] + arrayEng;
                        sp5 = "eso debe " + gen.vibesp[rand] + arrayEsp;
                        eng5 = "it must " + gen.vib[rand] + arrayEng;
                        sp6 = "ellos deben " + gen.vibesp[rand] + arrayEsp;
                        eng6 = "they must " + gen.vib[rand] + arrayEng;
                        sp7 = "nosotros debemos " + gen.vibesp[rand] + arrayEsp;
                        eng7 = "we must " + gen.vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo " + "no debo " + gen.vibesp[rand] + arrayEsp;
                        eng1 = "I " + "mustn't " + gen.vib[rand] + arrayEng;
                        sp2 = "tú " + "no debés " + gen.vibesp[rand] + arrayEsp;
                        eng2 = "you " + "mustn't " + gen.vib[rand] + arrayEng;
                        sp3 = "él " + "no debe " + gen.vibesp[rand] + arrayEsp;
                        eng3 = "he " + "mustn't " + gen.vib3esp[rand] + arrayEng;
                        sp4 = "ella " + "no debe " + gen.vibesp[rand] + arrayEsp;
                        eng4 = "she " + "mustn't " + gen.vib3esp[rand] + arrayEng;
                        sp5 = "eso " + "no debe " + gen.vibesp[rand] + arrayEsp;
                        eng5 = "it " + "mustn't " + gen.vib3esp[rand] + arrayEng;
                        sp6 = "ellos " + "no deben " + gen.vibesp[rand] + arrayEsp;
                        eng6 = "they " + "mustn't " + gen.vib[rand] + arrayEng;
                        sp7 = "nosotros " + "no debemos " + gen.vibesp[rand] + arrayEsp;
                        eng7 = "we " + "mustn't " + gen.vib[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenMustCont2() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);


        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debo estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I must be " + gen.vib3cont[rand] + arrayEng;
                        eng12 = "I must be " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú debes estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you must be " + gen.vib3cont[rand] + arrayEng;
                        eng22 = "you must be " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él debe estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he must be " + gen.vib3cont[rand] + arrayEng;
                        eng32 = "he must be " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella debe estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she must be " + gen.vib3cont[rand] + arrayEng;
                        eng42 = "she must be " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso debe estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it must be " + gen.vib3cont[rand] + arrayEng;
                        eng52 = "it must be " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos deben estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they must be " + gen.vib3cont[rand] + arrayEng;
                        eng62 = "they must be " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros debemos estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we must be " + gen.vib3cont[rand] + arrayEng;
                        eng72 = "we must be " + gen.vib3cont[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no debo estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng1 = "I must not be " + gen.vib3cont[rand] + arrayEng;
                        eng12 = "I mustn't be " + gen.vib3cont[rand] + arrayEng;
                        sp2 = "tú no debes estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng2 = "you must not be " + gen.vib3cont[rand] + arrayEng;
                        eng22 = "you mustn't be " + gen.vib3cont[rand] + arrayEng;
                        sp3 = "él no debe estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng3 = "he must not be " + gen.vib3cont[rand] + arrayEng;
                        eng32 = "he mustn't be " + gen.vib3cont[rand] + arrayEng;
                        sp4 = "ella no debe estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng4 = "she must not be " + gen.vib3cont[rand] + arrayEng;
                        eng42 = "she mustn't be " + gen.vib3cont[rand] + arrayEng;
                        sp5 = "eso no debe estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng5 = "it must not be " + gen.vib3cont[rand] + arrayEng;
                        eng52 = "it mustn't be " + gen.vib3cont[rand] + arrayEng;
                        sp6 = "ellos no deben estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng6 = "they must not be  " + gen.vib3cont[rand] + arrayEng;
                        eng62 = "they mustn't be  " + gen.vib3cont[rand] + arrayEng;
                        sp7 = "nosotros no debemos estar " + gen.vib3contesp[rand] + arrayEsp;
                        eng7 = "we must not be  " + gen.vib3cont[rand] + arrayEng;
                        eng72 = "we mustn't be  " + gen.vib3cont[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023

    public void GenAbleTo2(){
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + "soy capaz de " + gen.vibesp[rand] + arrayEsp;
                        eng1 = "I am " + "able to " + gen.vib[rand] + arrayEng;
                        eng12 = "I'm " + "able to " + gen.vib[rand] + arrayEng;

                        sp2 = "tú " + "eres capaz de " + gen.vibesp[rand] + arrayEsp;
                        eng2 = "you are " + "able to " + gen.vib[rand] + arrayEng;
                        eng22 = "you're " + "able to " + gen.vib[rand] + arrayEng;

                        sp3 = "él " + "es capaz de " + gen.vibesp[rand] + arrayEsp;
                        eng3 = "he is " + "able to " + gen.vib[rand] + arrayEng;
                        eng32 = "he's " + "able to " + gen.vib[rand] + arrayEng;

                        sp4 = "ella " + "es capaz de " + gen.vibesp[rand] + arrayEsp;
                        eng4 = "she is " + "able to " + gen.vib[rand] + arrayEng;
                        eng42 = "she's " + "able to " + gen.vib[rand] + arrayEng;

                        sp5 = "eso " + "es capaz de " + gen.vibesp[rand] + arrayEsp;
                        eng5 = "it is " + "able to " + gen.vib[rand] + arrayEng;
                        eng52 = "it's " + "able to " + gen.vib[rand] + arrayEng;

                        sp6 = "ellos " + "son capaces de " + gen.vibesp[rand] + arrayEsp;
                        eng6 = "they are " + "able to " + gen.vib[rand] + arrayEng;
                        eng62 = "they're " + "able to " + gen.vib[rand] + arrayEng;

                        sp7 = "nosotros " + "somos capaces de " + gen.vibesp[rand] + arrayEsp;
                        eng7 = "we are " + "able to " + gen.vib[rand] + arrayEng;
                        eng72 = "we're " + "able to " + gen.vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = "yo no " + "soy capaz de " + gen.vibesp[rand] + arrayEsp;
                        eng1 = "I am not " + "able to " + gen.vib[rand] + arrayEng;
                        eng12 = "I'm not " + "able to " + gen.vib[rand] + arrayEng;

                        sp2 = "tú no " + "eres capaz de " + gen.vibesp[rand] + arrayEsp;
                        eng2 = "you are not " + "able to " + gen.vib[rand] + arrayEng;
                        eng22 = "you're not " + "able to " + gen.vib[rand] + arrayEng;

                        sp3 = "él no " + "es capaz de " + gen.vibesp[rand] + arrayEsp;
                        eng3 = "he is not " + "able to " + gen.vib[rand] + arrayEng;
                        eng32 = "he's not " + "able to " + gen.vib[rand] + arrayEng;

                        sp4 = "ella no " + "es capaz de " + gen.vibesp[rand] + arrayEsp;
                        eng4 = "she is not " + "able to " + gen.vib[rand] + arrayEng;
                        eng42 = "she's not " + "able to " + gen.vib[rand] + arrayEng;

                        sp5 = "eso no " + "es capaz de " + gen.vibesp[rand] + arrayEsp;
                        eng5 = "it is not " + "able to " + gen.vib[rand] + arrayEng;
                        eng52 = "it's not " + "able to " + gen.vib[rand] + arrayEng;

                        sp6 = "ellos no " + "son capaces de " + gen.vibesp[rand] + arrayEsp;
                        eng6 = "they are not " + "able to " + gen.vib[rand] + arrayEng;
                        eng62 = "they're not " + "able to " + gen.vib[rand] + arrayEng;

                        sp7 = "nosotros no " + "somos capaces de " + gen.vibesp[rand] + arrayEsp;
                        eng7 = "we are not " + "able to " + gen.vib[rand] + arrayEng;
                        eng72 = "we're not " + "able to " + gen.vib[rand] + arrayEng;
                        break;

                }
            }
        }
    }//PD FEB 2023

    //for to dificultad 3 SOlO INTRANS
    public void forSubTo2() {
        gen = new Generator();
        Pasts pas = new Pasts();
        randstarter();
        String temp = gen.vib[rand];
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

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = ftsjs[0] + pas.vis1[rand] + arrayEsp;
                        eng1 = ftsj[0] + gen.vib[rand] + arrayEng;
                        sp2 = ftsjs[1] + pas.vis2[rand] + arrayEsp;
                        eng2 = ftsj[1] + gen.vib[rand] + arrayEng;
                        sp3 = ftsjs[2] + pas.vis3[rand] + arrayEsp;
                        eng3 = ftsj[2] + gen.vib[rand] + arrayEng;
                        sp4 = ftsjs[3] + pas.vis3[rand] + arrayEsp;
                        eng4 = ftsj[3] + gen.vib[rand] + arrayEng;
                        sp5 = ftsjs[4] + pas.vis3[rand] + arrayEsp;
                        eng5 = ftsj[4] + gen.vib[rand] + arrayEng;
                        sp6 = ftsjs[5] + pas.vis4[rand] + arrayEsp;
                        eng6 = ftsj[5] + gen.vib[rand] + arrayEng;
                        sp7 = ftsjs[6] + pas.vis5[rand] + arrayEsp;
                        eng7 = ftsj[6] + gen.vib[rand] + arrayEng;
                        break;
                    case 1:
                        sp1 = ftsjsn[0] + pas.vis1[rand] + arrayEsp;
                        eng1 = ftsjn[0] + gen.vib[rand] + arrayEng;
                        sp2 = ftsjsn[1] + pas.vis2[rand] + arrayEsp;
                        eng2 = ftsjn[1] + gen.vib[rand] + arrayEng;
                        sp3 = ftsjsn[2] + pas.vis3[rand] + arrayEsp;
                        eng3 = ftsjn[2] + gen.vib[rand] + arrayEng;
                        sp4 = ftsjsn[3] + pas.vis3[rand] + arrayEsp;
                        eng4 = ftsjn[3] + gen.vib[rand] + arrayEng;
                        sp5 = ftsjsn[4] + pas.vis3[rand] + arrayEsp;
                        eng5 = ftsjn[4] + gen.vib[rand] + arrayEng;
                        sp6 = ftsjsn[5] + pas.vis4[rand] + arrayEsp;
                        eng6 = ftsjn[5] + gen.vib[rand] + arrayEng;
                        sp7 = ftsjsn[6] + pas.vis5[rand] + arrayEsp;
                        eng7 = ftsjn[6] + gen.vib[rand] + arrayEng;
                        break;
                }
            }
        }
    }//PD FEB 2023

    //want to dificultad 3 SOLO INTRANS
    public void wantyouto2() {
        gen = new Generator();
        Pasts pas = new Pasts();
        randstarter();
        String temp = gen.vib[rand];
        int rn1 = (int) (Math.random() * 6);
        int rn2 = (int) (Math.random() * 5);
        int neg = (int) (Math.random() * 2);


        //want to subject
        String wtsj[] = {"I want ", "you want ", "he wants ", "she wants ",
                "it wants ", "we want ", "they want "};
        //want to subject negative
        String wtsjn[] = {"I don't want ", "you don't want " , "he doesn't want ", "she doesn't want ", "it doesn't want "
                , "we don't want ", "they don't want " };
        //sujetos want to en sp
        String wtsjs[] = {"yo quiero ", "tú quieres ", "él quiere ", "ella quiere ", "eso quiere ", "nosotros queremos ", "ellos quieren "};
        //sujetos want to en sp negativo
        String wtsjsn[] = {"yo no quiero ", "tú no quieres ", "él no quiere ", "ella no quiere ", "eso no quiere ", "nosotros no queremos ", "ellos no quieren "};

        String wtobj1[] = {"you to " + gen.vib[rand], "him to " + gen.vib[rand], "her to " + gen.vib[rand],
                "it to " + gen.vib[rand], "us to " + gen.vib[rand], "them to " + gen.vib[rand]};
        String wtobj2[] = {"me to " + gen.vib[rand], "him to " + gen.vib[rand], "her to " + gen.vib[rand],
                "it to " + gen.vib[rand], "us to " + gen.vib[rand], "them to " + gen.vib[rand]};
        String wtobj3[] = {"you to " + gen.vib[rand], "me to " + gen.vib[rand], "her to " + gen.vib[rand],
                "it to " + gen.vib[rand], "us to " + gen.vib[rand], "them to " + gen.vib[rand]};
        String wtobj4[] = {"you to " + gen.vib[rand], "him to " + gen.vib[rand], "me to " + gen.vib[rand],
                "it to " + gen.vib[rand], "us to " + gen.vib[rand], "them to " + gen.vib[rand]};
        String wtobj5[] = {"you to " + gen.vib[rand], "him to " + gen.vib[rand], "her to " + gen.vib[rand],
                "me to " + gen.vib[rand], "us to " + gen.vib[rand], "them to " + gen.vib[rand]};
        String wtobj6[] = {"you to " + gen.vib[rand], "him to " + gen.vib[rand], "her to " + gen.vib[rand],
                "it to " + gen.vib[rand], "them to " + gen.vib[rand]};
        String wtobj7[] = {"you to " + gen.vib[rand], "him to " + gen.vib[rand], "her to " + gen.vib[rand],
                "it to " + gen.vib[rand], "us to " + gen.vib[rand], "me to " + gen.vib[rand]};

        // objetos wt en sp
        String wtobj1s[] = {"que tú " + pas.vis2[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis5[rand], "que ellos " + pas.vis4[rand]};
        String wtobj2s[] = {"que yo " + pas.vis1[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis5[rand], "que ellos " + pas.vis4[rand]};

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

        for (String verbs : gen.vib) {
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



    // aqui vamos a hacer las interferencias
    // de aqui talvez se tenga que ir a un generador que ponga juntas varios metodos con la interferencia especifica

    //DIFICULTAD 3
    //presentes
    public void GenPresSimp3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg){
                    case 0:
                        sp1 = "yo " + gen.vib1[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng12 = "I " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + gen.vib2[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng22 = "you " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + gen.vib3esp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng32 = "he " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + gen.vib3esp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng42 = "she " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + gen.vib3esp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng52 = "it " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + gen.vib3p[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng62 = "they " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + gen.vibnos[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng72 = "we " + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + gen.vib1[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I do not " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng12 = "I don't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + "no " + gen.vib2[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you do not " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng22 = "you don't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no " + gen.vib3esp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he does not " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng32 = "he doesn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no " + gen.vib3esp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she does not " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng42 = "she doesn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no " + gen.vib3esp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it does not " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng52 = "it doesn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + "no " + gen.vib3p[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they do not " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng62 = "they don't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + "no " + gen.vibnos[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we do not " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng72 = "we don't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenPresCont3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estoy " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I am " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I'm " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú estás " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you are " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you're " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él está " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he is " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he's " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella está " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she is " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she's " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso está " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it is " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it's " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos están " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they are " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they're " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros estamos " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we are " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we're " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no estoy " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I am not " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I'm not " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no estás " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you are not " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you aren't " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no está " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he is not " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he isn't " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no está " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she is not " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she isn't " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no está " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it is not " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it isn't " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no están " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they are not  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they aren't  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no estamos " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we are not  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we aren't  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPresPerf3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo he " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I've " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú has " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you've " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él ha " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he has " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he's " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella ha " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she has " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she's " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso ha " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it has " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it's " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos han " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they've " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros hemos " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we've " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no he " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I have not " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I haven't " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no has " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you have not " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you haven't " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no ha " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he has not " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he hasn't " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no ha " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she has not " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she hasn't " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no ha " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it has not " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it hasn't " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no han " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they have not  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they haven't  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no hemos " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we have not  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we haven't  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenPresPerfCont3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo he estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú has estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él ha estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he has been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella ha estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she has been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso ha estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it has been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos han estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros hemos estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no he estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I haven't been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no has estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you haven't been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no ha estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he hasn't been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no ha estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she hasn't been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no ha estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it hasn't been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no han estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they haven't been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no hemos estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we haven't been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Pasados
    public void GenPastSimp3() {
        gen = new Generator();
        Pasts pas = new Pasts();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 4);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
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
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estaba " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I was " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I was " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú estabas " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you were " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you were " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él estaba " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he was " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he was " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella estaba " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she was " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she was " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso estaba " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it was " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it was " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos estaban " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they were " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they were " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros estabamos " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we were " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we were " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no estaba " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I was not " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I wasn't " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no estabas " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you were not " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you weren't " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no estaba " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he was not " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he wasn't " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no estaba " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she was not " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she wasn't " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no estaba " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it was not " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it wasn't " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no estaban " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they were not  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they weren't  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no estabamos " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we were not  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we weren't  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPastPerf3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo habia " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I had " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I had " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú habias " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you had " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you had " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él habia " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he had " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he had " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella habia " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she had " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she had " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso habia " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it had " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it had " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos habian " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they had " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they had " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros habiamos " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we had " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we had " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no habia " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I had not " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I hadn't " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no habias " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you had not " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you hadn't " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no habia " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he had not " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he hadn't " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no habia " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she had not " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she hadn't " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no habia " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it had not " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it hadn't " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no habian " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they had not  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they hadn't  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no habiamos " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we had not  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we hadn't  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenPastPerfCont3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo había estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I had been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú habías estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you had been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él había estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he had been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella había estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she had been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso había estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it had been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos habían " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they had been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros habíamos estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we had been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no había estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I hadn't been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no habías estado  " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you hadn't been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no había estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he hadn't been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no había estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she hadn't been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no había estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it hadn't been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no habían " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they hadn't been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no habíamos estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we hadn't been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Futuros
    public void GenFutSimp3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + gen.vib1f[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I will " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + gen.vib2f[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you will " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + gen.vib3f[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he will " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + gen.vib3f[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she will " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + gen.vib3f[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it will " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + gen.vib4f[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they will " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + gen.vibfnos[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we will " + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + gen.vib1f[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + "won't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + "no " + gen.vib2f[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + "won't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + "no " + gen.vib3f[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + "won't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + "no " + gen.vib3f[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + "won't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + "no " + gen.vib3f[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + "won't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + "no " + gen.vib4f[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + "won't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + "no " + gen.vibfnos[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + "won't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenFutCont3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estaré " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I will be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I'll be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú estaras " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you will be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you'll be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él estaré " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he will be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he'll be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella estaré " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she will be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he'll be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso estaré " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it will be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it'll be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos estaran " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they will be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they'll be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros estaremos " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we will be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we'll be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no estaré " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I will not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I won't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no estaras " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you will not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you won't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no estaré " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he will not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he won't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no estaré " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she will not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she won't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no estaré " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it will not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it won't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no estaran " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they will not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they won't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no estaremos " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we will not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we won't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenFutPerf3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo habre " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I will have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I'll have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú habrás " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you will have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you'll have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él habrá " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he will have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he'll have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella habrá " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she will have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she'll have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso habrá " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it will have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it'll have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos habrán " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they will have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they'll have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros habremos "  + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we will have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we'll have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no habre " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I will not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I won't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no habrás " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you will not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you won't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no habrá " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he will not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he won't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no habrá " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she will not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she won't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no habrá " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it will not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it won't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no habrán " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they will not have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they won't have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no habremos "  + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we will not have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we won't have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenFutPerfCont3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo habré estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I will have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú habrás estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you will have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él habrá estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he will have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella habrá estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she will have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso habrá estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it will have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos habrán estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they will have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros habremos estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we will have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no habré estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I won't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no habrás estado  " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you won't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no habrá estado   " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he won't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no habrá estado   " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she won't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no habrá estado   " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it won't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no habran estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they won't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no habremos estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we won't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Would
    public void GenWouldSimp3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + gen.vib1w[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I would " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + gen.vib2w[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you would " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + gen.vib3w[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he would " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + gen.vib3w[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she would " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + gen.vib3w[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it would " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + gen.vib4w[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they would " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + gen.vib5w[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we would " + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo " + "no " + gen.vib1w[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + "wouldn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + "no " + gen.vib2w[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + "wouldn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + "no " + gen.vib3w[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + "wouldn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + "no " + gen.vib3w[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + "wouldn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + "no " + gen.vib3w[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + "wouldn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + "no " + gen.vib4w[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + "wouldn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + "no " + gen.vib5w[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + "wouldn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenWouldCont3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo estaría " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I would be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I'd be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú estarías " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you would be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you'd be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él estaría " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he would be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he'd be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella estaría " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she would be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she'd be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso estaría " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it would be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it'd be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos estarían " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they would be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they'd be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros estaríamos " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we would be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we'd be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no estaría " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I would not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I wouldn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no estarías " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you would not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you wouldn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no estaría " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he would not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he wouldn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no estaría " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she would not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she wouldn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no estaría " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it would not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it wouldn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no estarían " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they would not be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they wouldn't be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no estaríamos " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we would not be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we wouldn't be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenWouldPerf3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo hubiera " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I would have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I'd have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú hubieras " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you would have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you'd have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él hubiera " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he would have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he'd have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella hubiera " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she would have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she'd have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso hubiera " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it would have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it'd have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos hubieran " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they would have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they'd have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros habríamos "  + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we would have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we'd have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no hubiera " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I would not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I wouldn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no hubieras " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you would not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you wouldn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no hubiera " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he would not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he wouldn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no hubiera " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she would not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she wouldn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no hubiera " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it would not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it wouldn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no hubieran " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they would not have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they wouldn't have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no habríamos "  + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we would not have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we wouldn't have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenWouldPerfCont3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo hubiera estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I would have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú hubieras estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you would have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él hubiera estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he would have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella hubiera estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she would have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso hubiera estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it would have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos hubieran estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they would have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros hubiésemos estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we would have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no hubiera estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I wouldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no hubieras estado  " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you wouldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no hubiera estado   " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he wouldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no hubiera estado   " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she wouldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no hubiera estado   " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it wouldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no habran estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they wouldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no hubiésemos estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we wouldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //COULD
    public void GenCouldSimp3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo podría " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I could " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú podrías " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you could " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él podría " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he could " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella podría " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she could " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso podría " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it could " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos podrían " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they could " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros podríamos " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we could " + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo " + "no podría " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + "couldn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + "no podrías " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + "couldn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + "no podría " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + "couldn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + "no podría " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + "couldn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + "no podría " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + "couldn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + "no podrían " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + "couldn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + "no podríamos " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + "couldn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenCouldCont3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo podría estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I could be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I could be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú podrías estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you could be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you could be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él podría estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he could be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he could be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella podría estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she could be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she could be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso podría estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it could be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it could be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos podrían estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they could be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they could be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros podríamos estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we could be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we could be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no podría estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I could not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I couldn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no podrías estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you could not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you couldn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no podría estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he could not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he couldn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no podría estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she could not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she couldn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no podría estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it could not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it couldn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no podrían estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they could not be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they couldn't be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no podríamos estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we could not be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we couldn't be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenCouldPerf3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo pudiese haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I could have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I could have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú pudieses haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you could have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you could have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él pudiese haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he could have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he could have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella pudiese haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she could have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she could have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso pudiese haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it could have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it could have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos pudiesen haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they could have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they could have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros pudiesemos haber "  + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we could have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we could have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no pudiese haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I could not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I couldn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no pudieses haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you could not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you couldn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no pudiese haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he could not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he couldn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no pudiese haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she could not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she couldn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no pudiese haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it could not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it couldn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no pudiesen haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they could not have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they couldn't have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no pudiesemos haber "  + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we could not have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we couldn't have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenCouldPerfCont3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo podría haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I could have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú podrías haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you could have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él podría haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he could have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella podría haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she could have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso podría haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it could have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos podrían haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they could have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros podríamos haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we could have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no podría haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I couldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no podrías haber estado  " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you couldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no podría haber estado   " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he couldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no podría haber estado   " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she couldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no podría haber estado   " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it couldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no habran estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they couldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no podríamos haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we couldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Might
    public void GenMightSimp3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá " + gen.vib1s[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I might " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú quizá " + gen.vib2s[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you might " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él quizá " + gen.vib3s[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he might " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella quizá " + gen.vib3s[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she might " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso quizá " + gen.vib3s[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it might " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos quizá " + gen.vib4s[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they might " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros quizá " + gen.vib5s[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we might " + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo " + "quizá no " + gen.vib1s[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + "might not  " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + "quizá no " + gen.vib2s[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + "might not  " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + "quizá no " + gen.vib3s[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + "might not  " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + "quizá no " + gen.vib3s[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + "might not  " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + "quizá no " + gen.vib3s[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + "might not  " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + "quizá no " + gen.vib4s[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + "might not  " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + "quizá no " + gen.vib5s[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + "might not  " + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023
    public void GenMightCont3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá esté " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I might be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I might be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú quizá estés " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you might be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you might be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él quizá esté " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he might be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he might be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella quizá esté " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she might be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she might be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso quizá esté " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it might be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it might be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos quizá estén " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they might be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they might be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros quizá estémos " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we might be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we might be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no quizá esté " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I might not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I mightn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no quizá estés " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you might not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you mightn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no quizá esté " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he might not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he mightn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no quizá esté " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she might not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she mightn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no quizá esté " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it might not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it mightn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no quizá estén " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they might not be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they mightn't be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no quizá estémos " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we might not be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we mightn't be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenMightPerf3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá haya " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I might have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I might have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú quizá hayas " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you might have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you might have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él quizá haya " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he might have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he might have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella quizá haya " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she might have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she might have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso quizá haya " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it might have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it might have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos quizá hayan " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they might have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they might have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros quizá hayamos "  + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we might have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we might have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no quizá haya " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I might not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I mightn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no quizá hayas " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you might not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you mightn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no quizá haya " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he might not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he mightn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no quizá haya " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she might not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she mightn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no quizá haya " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it might not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it mightn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no quizá hayan " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they might not have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they mightn't have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no quizá hayamos "  + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we might not have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we mightn't have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenMightPerfCont3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo quizá haya estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I might have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú quizá hayas estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you might have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él quizá haya estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he might have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella quizá haya estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she might have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso quizá haya estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it might have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos quizá hayan estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they might have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros quizá hayamos estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we might have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo quizá no haya estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I might not have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú quizá no hayas estado  " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you might not have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él quizá no haya estado   " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he might not have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella quizá no haya estado   " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she might not have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso quizá no haya estado   " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it might not have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no habran estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they might not have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros quizá no hayamos estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we might not have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //SHOULD
    public void GenShouldSimp3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I should " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú deberías " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you should " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él debería " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he should " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella debería " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she should " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso debería " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it should " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos deberían " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they should " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros deberíamos " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we should " + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo " + "no debería " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + "shouldn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + "no deberías " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + "shouldn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + "no debería " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + "shouldn't " + gen.vib[rand]+ arrayEng + frequadv[radv];
                        sp4 = "ella " + "no debería " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + "shouldn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + "no debería " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + "shouldn't " + gen.vib[rand]+ arrayEng + frequadv[radv];
                        sp6 = "ellos " + "no deberían " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + "shouldn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + "no deberíamos " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + "shouldn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenShouldCont3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I should be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I should be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú deberías estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you should be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you should be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él debería estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he should be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he should be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella debería estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she should be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she should be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso debería estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it should be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it should be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos deberían estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they should be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they should be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros deberíamos estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we should be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we should be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no debería estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I should not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I shouldn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no deberías estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you should not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you shouldn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no debería estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he should not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he shouldn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no debería estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she should not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she shouldn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no debería estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it should not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it shouldn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no deberían estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they should not be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they shouldn't be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no deberíamos estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we should not be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we shouldn't be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenShouldPerf3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I should have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I should have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú deberías haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you should have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you should have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él debería haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he should have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he should have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella debería haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she should have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she should have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso debería haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it should have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it should have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos deberían haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they should have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they should have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros deberíamos haber "  + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we should have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we should have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no debería haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I should not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng12 = "I shouldn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no deberías haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you should not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng22 = "you shouldn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no debería haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he should not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng32 = "he shouldn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no debería haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she should not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng42 = "she shouldn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no debería haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it should not have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng52 = "it shouldn't have " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no deberían haber " + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they should not have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng62 = "they shouldn't have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no deberíamos haber "  + gen.vibparticipiosp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we should not have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        eng72 = "we shouldn't have  " + gen.viparticiple[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenShouldPerfCont3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debería haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I should have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú deberías haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you should have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él debería haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he should have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella debería haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she should have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso debería haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it should have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos deberían haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they should have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros deberíamos haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we should have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no debería haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I shouldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no deberías haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you shouldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no debería haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he shouldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no debería haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she shouldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no debería haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it shouldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no deberían haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they shouldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no deberíamos haber estado " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we shouldn't have been " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }

    }//PD FEB 2023

    //Can
    public void GenCanSimp3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo puedo " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I can " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú puedes " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you can " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él puede " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he can " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella puede " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she can " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso puede " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it can " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos pueden " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they can " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros podemos " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we can " + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo " + "no puedo " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + "can't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + "no puedes " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + "can't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + "no puede " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + "can't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + "no puede " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + "can't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + "no puede " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + "can't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + "no pueden " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + "can't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + "no podemos " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + "can't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenCanCont3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo puedo estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I can be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I can be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú puedes estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you can be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you can be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él puede estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he can be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he can be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella puede estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she can be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she can be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso puede estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it can be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it can be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos pueden estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they can be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they can be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros podemos estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we can be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we can be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no puedo estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I can not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I can't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no puedes estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you can not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you can't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no puede estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he can not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he can't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no puede estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she can not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she can't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no puede estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it can not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it can't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no pueden estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they can not be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they can't be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no podemos estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we can not be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we can't be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023
    //Must
    public void GenMustSimp3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debo " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I must " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú debés " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you must " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él debe " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he must " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella debe " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she must " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso debe " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it must " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos deben " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they must " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros debemos " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we must " + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo " + "no debo " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I " + "mustn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú " + "no debés " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you " + "mustn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = "él " + "no debe " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he " + "mustn't " + gen.vib3esp[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella " + "no debe " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she " + "mustn't " + gen.vib3esp[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso " + "no debe " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it " + "mustn't " + gen.vib3esp[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos " + "no deben " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they " + "mustn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros " + "no debemos " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we " + "mustn't " + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023
    public void GenMustCont3() {
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo debo estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I must be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I must be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú debes estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you must be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you must be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él debe estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he must be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he must be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella debe estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she must be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she must be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso debe estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it must be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it must be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos deben estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they must be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they must be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros debemos estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we must be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we must be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no debo estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I must not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng12 = "I mustn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp2 = "tú no debes estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you must not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng22 = "you mustn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp3 = "él no debe estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he must not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng32 = "he mustn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp4 = "ella no debe estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she must not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng42 = "she mustn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp5 = "eso no debe estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it must not be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng52 = "it mustn't be " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp6 = "ellos no deben estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they must not be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng62 = "they mustn't be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        sp7 = "nosotros no debemos estar " + gen.vib3contesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we must not be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        eng72 = "we mustn't be  " + gen.vib3cont[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023

    public void GenAbleTo3(){
        gen = new Generator();
        randstarter();
        arraySpe();
        String temp = gen.vib[rand];
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = "yo " + "soy capaz de " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I am " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng12 = "I'm " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];

                        sp2 = "tú " + "eres capaz de " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you are " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng22 = "you're " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];

                        sp3 = "él " + "es capaz de " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he is " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng32 = "he's " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];

                        sp4 = "ella " + "es capaz de " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she is " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng42 = "she's " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];

                        sp5 = "eso " + "es capaz de " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it is " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng52 = "it's " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];

                        sp6 = "ellos " + "son capaces de " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they are " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng62 = "they're " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];

                        sp7 = "nosotros " + "somos capaces de " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we are " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng72 = "we're " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = "yo no " + "soy capaz de " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng1 = "I am not " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng12 = "I'm not " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];

                        sp2 = "tú no " + "eres capaz de " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng2 = "you are not " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng22 = "you're not " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];

                        sp3 = "él no " + "es capaz de " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng3 = "he is not " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng32 = "he's not " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];

                        sp4 = "ella no " + "es capaz de " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng4 = "she is not " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng42 = "she's not " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];

                        sp5 = "eso no " + "es capaz de " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng5 = "it is not " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng52 = "it's not " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];

                        sp6 = "ellos no " + "son capaces de " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng6 = "they are not " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng62 = "they're not " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];

                        sp7 = "nosotros no " + "somos capaces de " + gen.vibesp[rand] + arrayEsp + advfrequ[radv];
                        eng7 = "we are not " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];
                        eng72 = "we're not " + "able to " + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;

                }
            }
        }
    }//PD FEB 2023

    //for to dificultad 3 SOlO INTRANS
    public void forSubTo3() {
        gen = new Generator();
        Pasts pas = new Pasts();
        randstarter();
        String temp = gen.vib[rand];
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

        for (String verbs : gen.vib) {
            if (verbs.equals(temp)) {
                switch (neg) {
                    case 0:
                        sp1 = ftsjs[0] + pas.vis1[rand] + arrayEsp + advfrequ[radv];
                        eng1 = ftsj[0] + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = ftsjs[1] + pas.vis2[rand] + arrayEsp + advfrequ[radv];
                        eng2 = ftsj[1] + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = ftsjs[2] + pas.vis3[rand] + arrayEsp + advfrequ[radv];
                        eng3 = ftsj[2] + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp4 = ftsjs[3] + pas.vis3[rand] + arrayEsp + advfrequ[radv];
                        eng4 = ftsj[3] + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp5 = ftsjs[4] + pas.vis3[rand] + arrayEsp + advfrequ[radv];
                        eng5 = ftsj[4] + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp6 = ftsjs[5] + pas.vis4[rand] + arrayEsp + advfrequ[radv];
                        eng6 = ftsj[5] + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = ftsjs[6] + pas.vis5[rand] + arrayEsp + advfrequ[radv];
                        eng7 = ftsj[6] + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;
                    case 1:
                        sp1 = ftsjsn[0] + pas.vis1[rand] + arrayEsp + advfrequ[radv];
                        eng1 = ftsjn[0] + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp2 = ftsjsn[1] + pas.vis2[rand] + arrayEsp + advfrequ[radv];
                        eng2 = ftsjn[1] + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp3 = ftsjsn[2] + pas.vis3[rand] + arrayEsp + advfrequ[radv];
                        eng3 = ftsjn[2] + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp4 = ftsjsn[3] + pas.vis3[rand] + arrayEsp + advfrequ[radv];
                        eng4 = ftsjn[3] + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp5 = ftsjsn[4] + pas.vis3[rand] + arrayEsp + advfrequ[radv];
                        eng5 = ftsjn[4] + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp6 = ftsjsn[5] + pas.vis4[rand] + arrayEsp + advfrequ[radv];
                        eng6 = ftsjn[5] + gen.vib[rand] + arrayEng + frequadv[radv];
                        sp7 = ftsjsn[6] + pas.vis5[rand] + arrayEsp + advfrequ[radv];
                        eng7 = ftsjn[6] + gen.vib[rand] + arrayEng + frequadv[radv];
                        break;
                }
            }
        }
    }//PD FEB 2023

    //want to dificultad 3 SOLO INTRANS
    public void wantyouto3() {
        gen = new Generator();
        Pasts pas = new Pasts();
        randstarter();
        String temp = gen.vib[rand];
        int rn1 = (int) (Math.random() * 6);
        int rn2 = (int) (Math.random() * 5);
        int neg = (int) (Math.random() * 2);
        int radv = (int) (Math.random() * frequadv.length);

        //want to subject
        String wtsj[] = {"I want ", "you want ", "he wants ", "she wants ",
                "it wants ", "we want ", "they want "};
        //want to subject negative
        String wtsjn[] = {"I don't want ", "you don't want " , "he doesn't want ", "she doesn't want ", "it doesn't want "
                , "we don't want ", "they don't want " };
        //sujetos want to en sp
        String wtsjs[] = {"yo quiero ", "tú quieres ", "él quiere ", "ella quiere ", "eso quiere ", "nosotros queremos ", "ellos quieren "};
        //sujetos want to en sp negativo
        String wtsjsn[] = {"yo no quiero ", "tú no quieres ", "él no quiere ", "ella no quiere ", "eso no quiere ", "nosotros no queremos ", "ellos no quieren "};

        String wtobj1[] = {"you to " + gen.vib[rand], "him to " + gen.vib[rand], "her to " + gen.vib[rand],
                "it to " + gen.vib[rand], "us to " + gen.vib[rand], "them to " + gen.vib[rand]};
        String wtobj2[] = {"me to " + gen.vib[rand], "him to " + gen.vib[rand], "her to " + gen.vib[rand],
                "it to " + gen.vib[rand], "us to " + gen.vib[rand], "them to " + gen.vib[rand]};
        String wtobj3[] = {"you to " + gen.vib[rand], "me to " + gen.vib[rand], "her to " + gen.vib[rand],
                "it to " + gen.vib[rand], "us to " + gen.vib[rand], "them to " + gen.vib[rand]};
        String wtobj4[] = {"you to " + gen.vib[rand], "him to " + gen.vib[rand], "me to " + gen.vib[rand],
                "it to " + gen.vib[rand], "us to " + gen.vib[rand], "them to " + gen.vib[rand]};
        String wtobj5[] = {"you to " + gen.vib[rand], "him to " + gen.vib[rand], "her to " + gen.vib[rand],
                "me to " + gen.vib[rand], "us to " + gen.vib[rand], "them to " + gen.vib[rand]};
        String wtobj6[] = {"you to " + gen.vib[rand], "him to " + gen.vib[rand], "her to " + gen.vib[rand],
                "it to " + gen.vib[rand], "them to " + gen.vib[rand]};
        String wtobj7[] = {"you to " + gen.vib[rand], "him to " + gen.vib[rand], "her to " + gen.vib[rand],
                "it to " + gen.vib[rand], "us to " + gen.vib[rand], "me to " + gen.vib[rand]};

        // objetos wt en sp
        String wtobj1s[] = {"que tú " + pas.vis2[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis5[rand], "que ellos " + pas.vis4[rand]};
        String wtobj2s[] = {"que yo " + pas.vis1[rand], "que él " + pas.vis3[rand], "que ella " + pas.vis3[rand],
                "que eso " + pas.vis3[rand], "que nosotros " + pas.vis5[rand], "que ellos " + pas.vis4[rand]};

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

        for (String verbs : gen.vib) {
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

