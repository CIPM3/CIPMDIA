package com.leal.cipm_testing;

import java.util.Arrays;
import java.util.Random;

public class NewVerbClass {




    String[] verbs = {
            "have ", "do ", "say ", "go ", "get ",
            "make ", "know ", "think ", "see ", "take ",
            //9
            "come ", "want ", "look ", "use ", "find ",
            "give ", "tell ", "work ", "call ",  "try ",
            //19
            "ask ", "need ", "feel ", "become ", "leave ",
            "put ", "mean ",
            //26
            "let ", "keep ", "begin ", "seem ", "talk ",
            "turn ", "help ", "start ", "show ", "hear ",
            //36
            "run ", "play ", "move ", "like ",
            "believe ", "hold ", "live ",
            //44
            "bring ", "write ", "provide ", "sit ", "stand ",
            "lose ", "meet ", "pay ", "include ",
            //53
            "continue ", "change ", "set ", "lead ",
            "learn ", "understand ", "watch ", "follow ",
            //61

            "stop ", "speak ", "create ", "allow ",
            "read ", "spend ", "add ", "grow ", "open ",
            //70

            "walk ", "offer ", "remember ", "win ",
            "appear ", "consider ", "love ", "buy ",
            //78


            "wait ", "die ", "send ", "expect ", "serve ",
            //83
            "stay ", "build ", "fall ", "cut ", "kill ",
            "reach ", "remain ", "suggest ",
            //91

            "raise ", "pass ", "sell ", "require ",
            "decide ", "report ", "return ", "pull ",
            //99
            "explain ", "carry ", "develop ", "hope ",
            "drive ", "break " };



    String[] verbsParticipleSpanish = {
            "tenido ", "hecho ", "dicho ", "ido ",
            "obtenido ",
            "hecho ", "conocido ", "pensado ", "visto ", "tomado ",
            "venido ", "querido ", "mirado ", "usado ", "encontrado ",
            "dado ", "contado ", "trabajado ", "llamado ", "intentado ",
            "preguntado ", "necesitado ", "sentido ", "convertido ", "dejado ",
            "puesto ", "referido a ",
            "dejado ", "mantenido ", "comenzado ", "parecido ", "hablado ",
            "girado ", "ayudado ", "empezado ", "mostrado ", "oído ",
            "corrido ", "jugado ", "movido ", "gustado ",
            "creído ", "sostenido ", "vivido ",
            "traído ", "escrito ", "proporcionado ", "sentado ", "estado de pie ",
            "perdido ", "encontrado ", "pagado ", "incluido ",
            "continuado ", "cambiado ", "puesto ", "liderado ",
            "aprendido ", "entendido ", "visto ", "seguido ",
            "dejado de ", "hablado ", "creado ", "permitido ",
            "leído ", "gastado ", "añadido ", "crecido ", "abierto ",
            "caminado ", "ofrecido ", "recordado ", "ganado ",
            "aparecido ", "considerado ", "amado ", "comprado ",
            "esperado ", "muerto ", "enviado ", "esperado ", "servido ",
            "quedado ", "construido ", "caído ", "cortado ", "matado ",
            "alcanzado ", "permanecido ", "sugerido ",
            "elevado ", "pasado ", "vendido ", "requerido ",
            "decidido ", "informado ", "devuelto ", "tirado ",
            "explicado ", "llevado ", "desarrollado ", "esperado ",
            "conducido ", "roto "
    };



    String[] verbsPastTense = {
            "had ", "did ", "said ", "went ", "got ",
            "made ", "knew ", "thought ", "saw ", "took ",
            //9
            "came ", "wanted ", "looked ", "used ", "found ",
            "gave ", "told ", "worked ", "called ",  "tried ",
            //19
            "asked ", "needed ", "felt ", "became ", "left ",
            "put ", "meant ",
            //26
            "let ", "kept ", "began ", "seemed ", "talked ",
            "turned ", "helped ", "started ", "showed ", "heard ",
            //36
            "ran ", "played ", "moved ", "liked ",
            "believed ", "held ", "lived ",
            //44
            "brought ", "wrote ", "provided ", "sat ", "stood ",
            "lost ", "met ", "paid ", "included ",
            //53
            "continued ", "changed ", "set ", "led ",
            "learned ", "understood ", "watched ", "followed ",
            //61
            "stopped ", "spoke ", "created ", "allowed ",
            "read ", "spent ", "added ", "grew ", "opened ",
            //70
            "walked ", "offered ", "remembered ", "won ",
            "appeared ", "considered ", "loved ", "bought ",
            //78
            "waited ", "died ", "sent ", "expected ", "served ",
            //83
            "stayed ", "built ", "fell ", "cut ", "killed ",
            "reached ", "remained ", "suggested ",
            //91
            "raised ", "passed ", "sold ", "required ",
            "decided ", "reported ", "returned ", "pulled ",
            //99
            "explained ", "carried ", "developed ", "hoped ",
            "drove ", "broke " };

    String[] verbsIng = {
            "having ", "doing ", "saying ", "going ", "getting ",
            "making ", "knowing ", "thinking ", "seeing ", "taking ",
            "coming ", "wanting ", "looking ", "using ", "finding ",
            "giving ", "telling ", "working ", "calling ", "trying ",
            "asking ", "needing ", "feeling ", "becoming ", "leaving ",
            "putting ", "meaning ",
            "letting ", "keeping ", "beginning ", "seeming ", "talking ",
            "turning ", "helping ", "starting ", "showing ", "hearing ",
            "running ", "playing ", "moving ", "liking ",
            "believing ", "holding ", "living ",
            "bringing ", "writing ", "providing ", "sitting ", "standing ",
            "losing ", "meeting ", "paying ", "including ",
            "continuing ", "changing ", "setting ", "leading ",
            "learning ", "understanding ", "watching ", "following ",
            "stopping ", "speaking ", "creating ", "allowing ",
            "reading ", "spending ", "adding ", "growing ", "opening ",
            "walking ", "offering ", "remembering ", "winning ",
            "appearing ", "considering ", "loving ", "buying ",
            "waiting ", "dying ", "sending ", "expecting ", "serving ",
            "staying ", "building ", "falling ", "cutting ", "killing ",
            "reaching ", "remaining ", "suggesting ",
            "raising ", "passing ", "selling ", "requiring ",
            "deciding ", "reporting ", "returning ", "pulling ",
            "explaining ", "carrying ", "developing ", "hoping ",
            "driving ", "breaking "
    };
    String[] verbosConGerundio = {
            "teniendo ", "haciendo ", "diciendo ", "yendo ", "obteniendo ",
            "haciendo ", "sabiendo ", "pensando ", "viendo ", "tomando ",
            "viniendo ", "queriendo ", "mirando ", "usando ", "encontrando ",
            "dando ", "diciendo ", "trabajando ", "llamando ", "intentando ",
            "preguntando ", "necesitando ", "sintiendo ", "convirtiéndose ", "dejando ",
            "poniendo ", "refireindo a ",
            "dejando ", "manteniendo ", "comenzando ", "pareciendo ", "hablando ",
            "girando ", "ayudando ", "empezando ", "mostrando ", "escuchando ",
            "corriendo ", "jugando ", "moviendo ", "gustando ",
            "creyendo ", "sosteniendo ", "viviendo ",
            "trayendo ", "escribiendo ", "proporcionando ", "sentándose ", "parándose ",
            "perdiendo ", "conociendo ", "pagando ", "incluyendo ",
            "continuando ", "cambiando ", "ajustando ", "liderando ",
            "aprendiendo ", "entendiendo ", "mirando ", "siguiendo ",
            "dejando de ", "hablando ", "creando ", "permitiendo ",
            "leyendo ", "gastando ", "añadiendo ", "creciendo ", "abriendo ",
            "caminando ", "ofreciendo ", "recordando ", "ganando ",
            "apareciendo ", "considerando ", "amando ", "comprando ",
            "esperando ", "muriendo ", "enviando ", "esperando ", "sirviendo ",
            "quedándose ", "construyendo ", "cayendo ", "cortando ", "matando ",
            "alcanzando ", "permaneciendo ", "sugiriendo ",
            "levantando ", "pasando ", "vendiendo ", "requiriendo ",
            "decidiendo ", "informando ", "volviendo ", "tirando ",
            "explicando ", "llevando ", "desarrollando ", "esperando ",
            "conduciendo ", "rompiendo "
    };


    String[] verbsSpanish = {
            "tener ", "hacer ", "decir ", "ir ", "obtener ",
            "hacer ", "saber ", "pensar ", "ver ", "tomar ",
            "venir ", "querer ", "mirar ", "usar ", "encontrar ",
            "dar ", "decir ", "trabajar ", "llamar ", "intentar ",
            "preguntar ", "necesitar ", "sentir ", "convertirse en ", "dejar ",
            "poner ", "referir a ",
            "permitir ", "mantener ", "empezar ", "parecer ", "hablar ",
            "girar ", "ayudar ", "comenzar ", "mostrar ", "oír ",
            "correr ", "jugar ", "mover ", "gustar ",
            "creer ", "sostener ", "vivir ",
            "traer ", "escribir ", "proporcionar ", "sentar ", "estar de pie ",
            "perder ", "conocer ", "pagar ", "incluir ",
            "continuar ", "cambiar ", "poner ", "liderar ",
            "aprender ", "entender ", "mirar ", "seguir ",
            "dejar de ", "hablar ", "crear ", "permitir ",
            "leer ", "gastar ", "añadir ", "crecer ", "abrir ",
            "caminar ", "ofrecer ", "recordar ", "ganar ",
            "aparecer ", "considerar ", "amar ", "comprar ",
            "esperar ", "morir ", "enviar ", "esperar ", "servir ",
            "quedarse ", "construir ", "caer ", "cortar ", "matar ",
            "alcanzar ", "permanecer ", "sugerir ",
            "elevar ", "pasar ", "vender ", "requerir ",
            "decidir ", "informar ", "devolver ", "tirar ",
            "explicar ", "llevar ", "desarrollar ", "esperar ",
            "conducir ", "romper "
    };
    String[] verbsSpanishHypotheticalSecondPerson = {
            "tendrías ", "harías ", "dirías ", "irías ", "obtendrías ",
            "harías ", "sabrías ", "pensarías ", "verías ", "tomarías ",
            "vendrías ", "querrías ", "mirarías ", "usarías ", "encontrarías ",
            "darías ", "dirías ", "trabajarías ", "llamarías ", "intentarías ",
            "preguntarías ", "necesitarías ", "sentirías ", "convertirías ", "dejarías ",
            "pondrías ", "referirías a ",
            "permitirías ", "mantendrías ", "empezarías ", "parecerías ", "hablarías ",
            "girarías ", "ayudarías ", "comenzarías ", "mostrarías ", "oirías ",
            "correrías ", "jugarías ", "moverías ", "gustarías ",
            "creerías ", "sostendrías ", "vivirías ",
            "traerías ", "escribirías ", "proporcionarías ", "sentarías ", "estarías de pie ",
            "perderías ", "conocerías ", "pagarías ", "incluirías ",
            "continuarías ", "cambiarías ", "pondrías ", "liderarías ",
            "aprenderías ", "entenderías ", "mirarías ", "seguirías ",
            "dejarías de ", "hablarías ", "crearías ", "permitirías ",
            "leerías ", "gastarías ", "añadirías ", "crecerías ", "abrirías ",
            "caminarías ", "ofrecerías ", "recordarías ", "ganarías ",
            "aparecerías ", "considerarías ", "amarías ", "comprarías ",
            "esperarías ", "morirías ", "enviarías ", "esperarías ", "servirías ",
            "quedarías ", "construirías ", "caerías ", "cortarías ", "matarías ",
            "alcanzarías ", "permanecerías ", "sugerirías ",
            "elevarías ", "pasarías ", "venderías ", "requerirías ",
            "decidirías ", "informarías ", "devolverías ", "tirarías ",
            "explicarías ", "llevarías ", "desarrollarías ", "esperarías ",
            "conducirías ", "romperías "
    };

    String[] verbsSpanishHypothetical = {
            "tendría ", "haría ", "diría ", "iría ", "obtendría ",
            "haría ", "sabría ", "pensaría ", "vería ", "tomaría ",
            "vendría ", "querría ", "miraría ", "usaría ", "encontraría ",
            "daría ", "diría ", "trabajaría ", "llamaría ", "intentaría ",
            "preguntaría ", "necesitaría ", "sentiría ", "convertiría ", "dejaría ",
            "pondría ", "referiría a ",
            "permitiría ", "mantendría ", "empezaría ", "parecería ", "hablaría ",
            "giraría ", "ayudaría ", "comenzaría ", "mostraría ", "oiría ",
            "correría ", "jugaría ", "movería ", "gustaría ",
            "creería ", "sostendría ", "viviría ",
            "traería ", "escribiría ", "proporcionaría ", "sentaría ", "estaría de pie ",
            "perdería ", "conocería ", "pagaría ", "incluiría ",
            "continuaría ", "cambiaría ", "pondría ", "lideraría ",
            "aprendería ", "entendería ", "miraría ", "seguiría ",
            "dejaría de ", "hablaría ", "crearía ", "permitiría ",
            "leería ", "gastaría ", "añadiría ", "crecería ", "abriría ",
            "caminaría ", "ofrecería ", "recordaría ", "ganaría ",
            "aparecería ", "consideraría ", "amaría ", "compraría ",
            "esperaría ", "moriría ", "enviaría ", "esperaría ", "serviría ",
            "quedaría ", "construiría ", "caería ", "cortaría ", "mataría ",
            "alcanzaría ", "permanecería ", "sugeriría ",
            "elevaría ", "pasaría ", "vendería ", "requeriría ",
            "decidiría ", "informaría ", "devolvería ", "tiraría ",
            "explicaría ", "llevaría ", "desarrollaría ", "esperaría ",
            "conduciría ", "rompería "
    };
    String[] verbsSpanishHypotheticalThirdPlural = {
            "tendrían ", "harían ", "dirían ", "irían ", "obtendrían ",
            "harían ", "sabrían ", "pensarían ", "verían ", "tomarían ",
            "vendrían ", "querrían ", "mirarían ", "usarían ", "encontrarían ",
            "darían ", "dirían ", "trabajarían ", "llamarían ", "intentarían ",
            "preguntarían ", "necesitarían ", "sentirían ", "convertirían ", "dejarían ",
            "pondrían ", "referirían a ",
            "permitirían ", "mantendrían ", "empezarían ", "parecerían ", "hablarían ",
            "girarían ", "ayudarían ", "comenzarían ", "mostrarían ", "oirían ",
            "correrían ", "jugarían ", "moverían ", "gustarían ",
            "creerían ", "sostendrían ", "vivirían ",
            "traerían ", "escribirían ", "proporcionarían ", "sentarían ", "estarían de pie ",
            "perderían ", "conocerían ", "pagarían ", "incluirían ",
            "continuarían ", "cambiarían ", "pondrían ", "liderarían ",
            "aprenderían ", "entenderían ", "mirarían ", "seguirían ",
            "dejarían de ", "hablarían ", "crearían ", "permitirían ",
            "leerían ", "gastarían ", "añadirían ", "crecerían ", "abrirían ",
            "caminarían ", "ofrecerían ", "recordarían ", "ganarían ",
            "aparecerían ", "considerarían ", "amarían ", "comprarían ",
            "esperarían ", "morirían ", "enviarían ", "esperarían ", "servirían ",
            "quedarían ", "construirían ", "caerían ", "cortarían ", "matarían ",
            "alcanzarían ", "permanecerían ", "sugerirían ",
            "elevarían ", "pasarían ", "venderían ", "requerirían ",
            "decidirían ", "informarían ", "devolverían ", "tirarían ",
            "explicarían ", "llevarían ", "desarrollarían ", "esperarían ",
            "conducirían ", "romperían "
    };
    String[] verbsSpanishHypotheticalFirstPlural = {
            "tendríamos ", "haríamos ", "diríamos ", "iríamos ", "obtendríamos ",
            "haríamos ", "sabríamos ", "pensaríamos ", "veríamos ", "tomaríamos ",
            "vendríamos ", "querríamos ", "miraríamos ", "usaríamos ", "encontraríamos ",
            "daríamos ", "diríamos ", "trabajaríamos ", "llamaríamos ", "intentaríamos ",
            "preguntaríamos ", "necesitaríamos ", "sentiríamos ", "convertiríamos ", "dejaríamos ",
            "pondríamos ", "referiríamos a ",
            "permitiríamos ", "mantendríamos ", "empezaríamos ", "pareceríamos ", "hablaríamos ",
            "giraríamos ", "ayudaríamos ", "comenzaríamos ", "mostraríamos ", "oiríamos ",
            "correríamos ", "jugaríamos ", "moveríamos ", "gustaríamos ",
            "creeríamos ", "sostendríamos ", "viviríamos ",
            "traeríamos ", "escribiríamos ", "proporcionaríamos ", "sentaríamos ", "estaríamos de pie ",
            "perderíamos ", "conoceríamos ", "pagaríamos ", "incluiríamos ",
            "continuaríamos ", "cambiaríamos ", "pondríamos ", "lideraríamos ",
            "aprenderíamos ", "entenderíamos ", "miraríamos ", "seguiríamos ",
            "dejaríamos de ", "hablaríamos ", "crearíamos ", "permitiríamos ",
            "leeríamos ", "gastaríamos ", "añadiríamos ", "creceríamos ", "abriríamos ",
            "caminaríamos ", "ofreceríamos ", "recordaríamos ", "ganaríamos ",
            "apareceríamos ", "consideraríamos ", "amaríamos ", "compraríamos ",
            "esperaríamos ", "moriríamos ", "enviaríamos ", "esperaríamos ", "serviríamos ",
            "quedaríamos ", "construiríamos ", "caeríamos ", "cortaríamos ", "mataríamos ",
            "alcanzaríamos ", "permaneceríamos ", "sugeriríamos ",
            "elevaríamos ", "pasaríamos ", "venderíamos ", "requeriríamos ",
            "decidiríamos ", "informaríamos ", "devolveríamos ", "tiraríamos ",
            "explicaríamos ", "llevaríamos ", "desarrollaríamos ", "esperaríamos ",
            "conduciríamos ", "romperíamos "
    };

    String[] verbsParticiple = {
            "had ", "done ", "said ", "gone ",
            "gotten ",
            "made ", "known ", "thought ", "seen ", "taken ",
            "come ", "wanted ", "looked ", "used ", "found ",
            "given ", "told ", "worked ", "called ", "tried ",
            "asked ", "needed ", "felt ", "become ", "left ",
            "put ", "meant ",
            "let ", "kept ", "begun ", "seemed ", "talked ",
            "turned ", "helped ", "started ", "shown ", "heard ",
            "run ", "played ", "moved ", "liked ",
            "believed ", "held ", "lived ",
            "brought ", "written ", "provided ", "sat ", "stood ",
            "lost ", "met ", "paid ", "included ",
            "continued ", "changed ", "set ", "led ",
            "learned ", "understood ", "watched ", "followed ",
            "stopped ", "spoken ", "created ", "allowed ",
            "read ", "spent ", "added ", "grown ", "opened ",
            "walked ", "offered ", "remembered ", "won ",
            "appeared ", "considered ", "loved ", "bought ",
            "waited ", "died ", "sent ", "expected ", "served ",
            "stayed ", "built ", "fallen ", "cut ", "killed ",
            "reached ", "remained ", "suggested ",
            "raised ", "passed ", "sold ", "required ",
            "decided ", "reported ", "returned ", "pulled ",
            "explained ", "carried ", "developed ", "hoped ",
            "driven ", "broken "
    };
            String[] verbsThirdPerson = {
        "has ", "does ", "says ", "goes ", "gets ", "makes ", "knows ", "thinks ", "sees ", "takes ", "comes ", "wants ", "looks ", "uses ", "finds ",
                "gives ", "tells ", "works ", "calls ",  "tries ", "asks ", "needs ", "feels ", "becomes ", "leaves ", "puts ", "means ",
                "lets ", "keeps ", "begins ", "seems ", "talks ", "turns ", "helps ", "starts ", "shows ", "hears ", "runs ", "plays ", "moves ", "likes ",
                "believes ", "holds ", "lives ",  "brings ", "writes ", "provides ", "sits ", "stands ", "loses ", "meets ", "pays ", "includes ",
                "continues ", "changes ", "sets ", "leads ", "learns ", "understands ", "watches ", "follows ", "stops ", "speaks ", "creates ", "allows ",
                "reads ", "spends ", "adds ", "grows ", "opens ", "walks ", "offers ", "remembers ", "wins ", "appears ", "considers ", "loves ", "buys ",
                "waits ", "dies ", "sends ", "expects ", "serves ", "stays ", "builds ", "falls ", "cuts ", "kills ", "reaches ", "remains ", "suggests ",
                "raises ", "passes ", "sells ", "requires ", "decides ", "reports ", "returns ", "pulls ", "explains ", "carries ", "develops ", "hopes ",
                "drives ", "breaks "
    };

    String[] verbsSpanishFirstPersonPastImperfect = {
            "tenía ", // have (tener)
            "hacía ", // do (hacer)
            "decía ", // say (decir)
            "iba ", // go (ir)
            "obtenía ", // get (obtener)
            "hacía ", // make (hacer)
            "sabía ", // know (saber)
            "pensaba ", // think (pensar)
            "veía ", // see (ver)
            "tomaba ", // take (tomar)
            "venía ", // come (venir)
            "quería ", // want (querer)
            "miraba ", // look (mirar)
            "usaba ", // use (usar)
            "encontraba ", // find (encontrar)
            "daba ", // give (dar)
            "decía ", // tell (decir)
            "trabajaba ", // work (trabajar)
            "llamaba ", // call (llamar)
            "intentaba ", // try (intentar)
            "preguntaba ", // ask (preguntar)
            "necesitaba ", // need (necesitar)
            "sentía ", // feel (sentir)
            "me volvía ", // become (llegar a ser)
            "dejaba ", // leave (dejar)
            "ponía ", // put (poner)
            "me refería a ", // mean (significar)
            "dejaba ", // let (dejar)
            "mantenía ", // keep (mantener)
            "empezaba ", // begin (empezar)
            "parecía ", // seem (parecer)
            "hablaba ", // talk (hablar)
            "giraba ", // turn (girar)
            "ayudaba ", // help (ayudar)
            "empezaba ", // start (empezar)
            "mostraba ", // show (mostrar)
            "oía ", // hear (oir)
            "corría ", // run (correr)
            "jugaba ", // play (jugar)
            "movía ", // move (mover)
            "gustaba ", // like (gustar)
            "creía ", // believe (creer)
            "sostenía ", // hold (sostener)
            "vivía ", // live (vivir)
            "traía ", // bring (traer)
            "escribía ", // write (escribir)
            "proporcionaba ", // provide (proporcionar)
            "me sentaba ", // sit (sentarse)
            "estaba de pie ", // stand (estar de pie)
            "perdía ", // lose (perder)
            "me encontraba ", // meet (encontrar)
            "pagaba ", // pay (pagar)
            "incluía ", // include (incluir)
            "continuaba ", // continue (continuar)
            "cambiaba ", // change (cambiar)
            "ponía ", // set (poner)
            "lideraba ", // lead (liderar)
            "aprendía ", // learn (aprender)
            "entendía ", // understand (entender)
            "miraba ", // watch (mirar)
            "seguía ", // follow (seguir)
            "dejaba de ", // stop (detener)
            "hablaba ", // speak (hablar)
            "creaba ", // create (crear)
            "permitía ", // allow (permitir)
            "leía ", // read (leer)
            "gastaba ", // spend (gastar)
            "añadía ", // add (añadir)
            "crecía ", // grow (crecer)
            "abría ", // open (abrir)
            "caminaba ", // walk (caminar)
            "ofrecía ", // offer (ofrecer)
            "recordaba ", // remember (recordar)
            "ganaba ", // win (ganar)
            "aparecía ", // appear (aparecer)
            "consideraba ", // consider (considerar)
            "amaba ", // love (amar)
            "compraba ", // buy (comprar)
            "esperaba ", // wait (esperar)
            "moría ", // die (morir)
            "enviaba ", // send (enviar)
            "esperaba ", // expect (esperar)
            "servía ", // serve (servir)
            "me quedaba ", // stay (quedarse)
            "construía ", // build (construir)
            "caía ", // fall (caer)
            "cortaba ", // cut (cortar)
            "mataba ", // kill (matar)
            "alcanzaba ", // reach (alcanzar)
            "permanecía ", // remain (permanecer)
            "sugería ", // suggest (sugerir)
            "elevaba ", // raise (elevar)
            "pasaba ", // pass (pasar)
            "vendía ", // sell (vender)
            "requería ", // require (requerir)
            "decidía ", // decide (decidir)
            "informaba ", // report (informar)
            "me devolvía ", // return (volver)
            "tiraba ", // pull (tirar)
            "explicaba ", // explain (explicar)
            "llevaba ", // carry (llevar)
            "desarrollaba ", // develop (desarrollar)
            "esperaba ", // hope (esperar)
            "conducía ", // drive (conducir)
            "rompía " // break (romper)
    };
    String[] verbsSpanishThirdPersonPluralPastImperfect = {
            "tenían ", // have (tener)
            "hacían ", // do (hacer)
            "decían ", // say (decir)
            "iban ", // go (ir)
            "obtenían ", // get (obtener)
            "hacían ", // make (hacer)
            "sabían ", // know (saber)
            "pensaban ", // think (pensar)
            "veían ", // see (ver)
            "tomaban ", // take (tomar)
            "venían ", // come (venir)
            "querían ", // want (querer)
            "miraban ", // look (mirar)
            "usaban ", // use (usar)
            "encontraban ", // find (encontrar)
            "daban ", // give (dar)
            "decían ", // tell (decir)
            "trabajaban ", // work (trabajar)
            "llamaban ", // call (llamar)
            "intentaban ", // try (intentar)
            "preguntaban ", // ask (preguntar)
            "necesitaban ", // need (necesitar)
            "sentían ", // feel (sentir)
            "se volvían ", // become (llegar a ser)
            "dejaban ", // leave (dejar)
            "ponían ", // put (poner)
            "se referían a ", // mean (significar)
            "dejaban ", // let (dejar)
            "mantenían ", // keep (mantener)
            "empezaban ", // begin (empezar)
            "parecían ", // seem (parecer)
            "hablaban ", // talk (hablar)
            "giraban ", // turn (girar)
            "ayudaban ", // help (ayudar)
            "empezaban ", // start (empezar)
            "mostraban ", // show (mostrar)
            "oían ", // hear (oir)
            "corrían ", // run (correr)
            "jugaban ", // play (jugar)
            "movían ", // move (mover)
            "gustaban ", // like (gustar)
            "creían ", // believe (creer)
            "sostenían ", // hold (sostener)
            "vivían ", // live (vivir)
            "traían ", // bring (traer)
            "escribían ", // write (escribir)
            "proporcionaban ", // provide (proporcionar)
            "se sentaban ", // sit (sentarse)
            "estaban de pie ", // stand (estar de pie)
            "perdían ", // lose (perder)
            "se encontraban ", // meet (encontrar)
            "pagaban ", // pay (pagar)
            "incluían ", // include (incluir)
            "continuaban ", // continue (continuar)
            "cambiaban ", // change (cambiar)
            "ponían ", // set (poner)
            "lideraban ", // lead (liderar)
            "aprendían ", // learn (aprender)
            "entendían ", // understand (entender)
            "miraban ", // watch (mirar)
            "seguían ", // follow (seguir)
            "dejaban de ", // stop (detener)
            "hablaban ", // speak (hablar)
            "creaban ", // create (crear)
            "permitían ", // allow (permitir)
            "leían ", // read (leer)
            "gastaban ", // spend (gastar)
            "añadían ", // add (añadir)
            "crecían ", // grow (crecer)
            "abrían ", // open (abrir)
            "caminaban ", // walk (caminar)
            "ofrecían ", // offer (ofrecer)
            "recordaban ", // remember (recordar)
            "ganaban ", // win (ganar)
            "aparecían ", // appear (aparecer)
            "consideraban ", // consider (considerar)
            "amaban ", // love (amar)
            "compraban ", // buy (comprar)
            "esperaban ", // wait (esperar)
            "morían ", // die (morir)
            "enviaban ", // send (enviar)
            "esperaban ", // expect (esperar)
            "servían ", // serve (servir)
            "se quedaban ", // stay (quedarse)
            "construían ", // build (construir)
            "caían ", // fall (caer)
            "cortaban ", // cut (cortar)
            "mataban ", // kill (matar)
            "alcanzaban ", // reach (alcanzar)
            "permanecían ", // remain (permanecer)
            "sugerían ", // suggest (sugerir)
            "elevaban ", // raise (elevar)
            "pasaban ", // pass (pasar)
            "vendían ", // sell (vender)
            "requerían ", // require (requerir)
            "decidían ", // decide (decidir)
            "informaban ", // report (informar)
            "se devolvían ", // return (volver)
            "tiraban ", // pull (tirar)
            "explicaban ", // explain (explicar)
            "llevaban ", // carry (llevar)
            "desarrollaban ", // develop (desarrollar)
            "esperaban ", // hope (esperar)
            "conducían ", // drive (conducir)
            "rompían " // break (romper)
    };
    String[] verbsSpanishFirstPersonPluralPastImperfect = {
            "teníamos ", // have (tener)
            "hacíamos ", // do (hacer)
            "decíamos ", // say (decir)
            "íbamos ", // go (ir)
            "obteníamos ", // get (obtener)
            "hacíamos ", // make (hacer)
            "sabíamos ", // know (saber)
            "pensábamos ", // think (pensar)
            "veíamos ", // see (ver)
            "tomábamos ", // take (tomar)
            "veníamos ", // come (venir)
            "queríamos ", // want (querer)
            "mirábamos ", // look (mirar)
            "usábamos ", // use (usar)
            "encontrábamos ", // find (encontrar)
            "dábamos ", // give (dar)
            "decíamos ", // tell (decir)
            "trabajábamos ", // work (trabajar)
            "llamábamos ", // call (llamar)
            "intentábamos ", // try (intentar)
            "preguntábamos ", // ask (preguntar)
            "necesitábamos ", // need (necesitar)
            "sentíamos ", // feel (sentir)
            "nos volvíamos ", // become (llegar a ser)
            "dejábamos ", // leave (dejar)
            "poníamos ", // put (poner)
            "nos referíamos a ", // mean (significar)
            "dejábamos ", // let (dejar)
            "manteníamos ", // keep (mantener)
            "empezábamos ", // begin (empezar)
            "parecíamos ", // seem (parecer)
            "hablábamos ", // talk (hablar)
            "girábamos ", // turn (girar)
            "ayudábamos ", // help (ayudar)
            "empezábamos ", // start (empezar)
            "mostrábamos ", // show (mostrar)
            "oíamos ", // hear (oir)
            "corríamos ", // run (correr)
            "jugábamos ", // play (jugar)
            "movíamos ", // move (mover)
            "gustábamos ", // like (gustar)
            "creíamos ", // believe (creer)
            "sosteníamos ", // hold (sostener)
            "vivíamos ", // live (vivir)
            "traíamos ", // bring (traer)
            "escribíamos ", // write (escribir)
            "proporcionábamos ", // provide (proporcionar)
            "nos sentábamos ", // sit (sentarse)
            "estábamos de pie ", // stand (estar de pie)
            "perdíamos ", // lose (perder)
            "nos encontrábamos ", // meet (encontrar)
            "pagábamos ", // pay (pagar)
            "incluíamos ", // include (incluir)
            "continuábamos ", // continue (continuar)
            "cambiábamos ", // change (cambiar)
            "poníamos ", // set (poner)
            "liderábamos ", // lead (liderar)
            "aprendíamos ", // learn (aprender)
            "entendíamos ", // understand (entender)
            "mirábamos ", // watch (mirar)
            "seguíamos ", // follow (seguir)
            "dejábamos de ", // stop (detener)
            "hablábamos ", // speak (hablar)
            "creábamos ", // create (crear)
            "permitíamos ", // allow (permitir)
            "leíamos ", // read (leer)
            "gastábamos ", // spend (gastar)
            "añadíamos ", // add (añadir)
            "crecíamos ", // grow (crecer)
            "abríamos ", // open (abrir)
            "caminábamos ", // walk (caminar)
            "ofrecíamos ", // offer (ofrecer)
            "recordábamos ", // remember (recordar)
            "ganábamos ", // win (ganar)
            "aparecíamos ", // appear (aparecer)
            "considerábamos ", // consider (considerar)
            "amábamos ", // love (amar)
            "comprábamos ", // buy (comprar)
            "esperábamos ", // wait (esperar)
            "moríamos ", // die (morir)
            "enviábamos ", // send (enviar)
            "esperábamos ", // expect (esperar)
            "servíamos ", // serve (servir)
            "nos quedábamos ", // stay (quedarse)
            "construíamos ", // build (construir)
            "caíamos ", // fall (caer)
            "cortábamos ", // cut (cortar)
            "matábamos ", // kill (matar)
            "alcanzábamos ", // reach (alcanzar)
            "permanecíamos ", // remain (permanecer)
            "sugeríamos ", // suggest (sugerir)
            "elevábamos ", // raise (elevar)
            "pasábamos ", // pass (pasar)
            "vendíamos ", // sell (vender)
            "requeríamos ", // require (requerir)
            "decidíamos ", // decide (decidir)
            "informábamos ", // report (informar)
            "nos devolvíamos ", // return (volver)
            "tirábamos ", // pull (tirar)
            "explicábamos ", // explain (explicar)
            "llevábamos ", // carry (llevar)
            "desarrollábamos ", // develop (desarrollar)
            "esperábamos ", // hope (esperar)
            "conducíamos ", // drive (conducir)
            "rompíamos " // break (romper)
    };

    String[] verbsSpanishFirstPerson = {
            "tengo ", // have (tener)
            "hago ", // do (hacer)
            "digo ", // say (decir)
            "voy ", // go (ir)
            "obtengo ", // get (obtener)
            "hago ", // make (hacer)
            "sé ", // know (saber)
            "pienso ", // think (pensar)
            "veo ", // see (ver)
            "tomo ", // take (tomar)
            "vengo ", // come (venir)
            "quiero ", // want (querer)
            "miro ", // look (mirar)
            "uso ", // use (usar)
            "encuentro ", // find (encontrar)

            "doy ", // give (dar)
            "digo ", // tell (decir)
            "trabajo ", // work (trabajar)
            "llamo ", // call (llamar)
            "intento ", // try (intentar)

            "pregunto ", // ask (preguntar)
            "necesito ", // need (necesitar)
            "siento ", // feel (sentir)
            "me vuelvo ", // become (llegar a ser)
            "dejo ", // leave (dejar)

            "pongo ", // put (poner)
            "me refiero a ", // mean (significar)

            "dejo ", // let (dejar)
            "mantengo ", // keep (mantener)
            "empiezo ", // begin (empezar)
            "parezco ", // seem (parecer)
            "hablo ", // talk (hablar)

            "giro ", // turn (girar)
            "ayudo ", // help (ayudar)
            "empiezo ", // start (empezar)
            "muestro ", // show (mostrar)
            "oigo ", // hear (oir)

            "corro ", // run (correr)
            "juego ", // play (jugar)
            "muevo ", // move (mover)
            "gusto ", // like (gustar)

            "creo ", // believe (creer)
            "sostengo ", // hold (sostener)
            "vivo ", // live (vivir)

            "traigo ", // bring (traer)
            "escribo ", // write (escribir)
            "proporciono ", // provide (proporcionar)
            "me siento ", // sit (sentarse)

            "estoy de pie ", // stand (estar de pie)
            "pierdo ", // lose (perder)

            "me encuentro ", // meet (encontrar)
            "pago ", // pay (pagar)
            "incluyo ", // include (incluir)
            "continúo ", // continue (continuar)
            "cambio ", // change (cambiar)
            "pongo ", // set (poner)
            "lidero ", // lead (liderar)



            "aprendo ", // learn (aprender)
            "entiendo ", // understand (entender)
            "miro ", // watch (mirar)
            "sigo ", // follow (seguir)

            "dejo de ", // stop (detener)
            "hablo ", // speak (hablar)
            "creo ", // create (crear)
            "permito ", // allow (permitir)

            "leo ", // read (leer)
            "gasto ", // spend (gastar)
            "añado ", // add (añadir)
            "crezco ", // grow (crecer)
            "abro ", // open (abrir)

            "camino ", // walk (caminar)
            "ofrezco ", // offer (ofrecer)
            "recuerdo ", // remember (recordar)
            "gano ", // win (ganar)

            "aparezco ", // appear (aparecer)
            "considero ", // consider (considerar)
            "amo ", // love (amar)
            "compro ", // buy (comprar)

            "espero ", // wait (esperar)
            "muero ", // die (morir)
            "envío ", // send (enviar)
            "espero ", // expect (esperar)
            "sirvo ", // serve (servir)

            "me quedo ", // stay (quedarse)
            "construyo ", // build (construir)
            "caigo ", // fall (caer)
            "corto ", // cut (cortar)
            "mato ", // kill (matar)

            "alcanzo ", // reach (alcanzar)
            "permanezco ", // remain (permanecer)
            "sugiero ", // suggest (sugerir)

            "elevo ", // raise (elevar)
            "paso ", // pass (pasar)
            "vendo ", // sell (vender)
            "requiero ", // require (requerir)

            "decido ", // decide (decidir)
            "informo ", // report (informar)
            "me devuelvo ", // return (volver)
            "tiro ", // pull (tirar)

            "explico ", // explain (explicar)
            "llevo ", // carry (llevar)
            "desarrollo ", // develop (desarrollar)
            "espero ", // hope (esperar)
            "conduzco ", // drive (conducir)
            "rompo " // break (romper)
    };
    String[] verbsSpanishFirstPersonPast = {
            "tuve ", // tener
            "hice ", // hacer
            "dije ", // decir
            "fui ", // ir
            "obtuve ", // obtener
            "hice ", // hacer (repeated for "make")
            "supe ", // saber
            "pensé ", // pensar
            "vi ", // ver
            "tomé ", // tomar
            "vine ", // venir
            "quise ", // querer
            "miré ", // mirar
            "usé ", // usar
            "encontré ", // encontrar

            "di ", // dar
            "dije ", // decir (repeated for "tell")
            "trabajé ", // trabajar
            "llamé ", // llamar
            "intenté ", // intentar

            "pregunté ", // preguntar
            "necesité ", // necesitar
            "sentí ", // sentir
            "me volví ", // llegar a ser
            "dejé ", // dejar

            "puse ", // poner
            "me referí a ", // significar

            "dejé ", // dejar (repeated for "let")
            "mantuve ", // mantener
            "empecé ", // empezar
            "parecí ", // parecer
            "hablé ", // hablar

            "giré ", // girar
            "ayudé ", // ayudar
            "empecé ", // empezar (repeated for "start")
            "mostré ", // mostrar
            "oí ", // oir

            "corrí ", // correr
            "jugué ", // jugar
            "moví ", // mover
            "gusté ", // gustar

            "creí ", // creer
            "sostuve ", // sostener
            "viví ", // vivir

            "traje ", // traer
            "escribí ", // escribir
            "proporcioné ", // proporcionar
            "me senté ", // sentarse

            "estuve de pie ", // estar de pie
            "perdí ", // perder

            "encontré ", // encontrar (repeated for "meet")
            "pagué ", // pagar
            "incluí ", // incluir
            "continué ", // continuar
            "cambié ", // cambiar
            "puse ", // poner (repeated for "set")
            "lideré ", // liderar

            "aprendí ", // aprender
            "entendí ", // entender
            "miré ", // mirar (repeated for "watch")
            "seguí ", // seguir

            "dejé de ", // detener
            "hablé ", // hablar (repeated for "speak")
            "creé ", // crear
            "permití ", // permitir

            "leí ", // leer
            "gasté ", // gastar
            "añadí ", // añadir
            "crecí ", // crecer
            "abrí ", // abrir

            "caminé ", // caminar
            "ofrecí ", // ofrecer
            "recordé ", // recordar
            "gané ", // ganar

            "aparecí ", // aparecer
            "consideré ", // considerar
            "amé ", // amar
            "compré ", // comprar

            "esperé ", // esperar
            "morí ", // morir
            "envié ", // enviar
            "esperé ", // esperar (repeated for "expect")
            "serví ", // servir

            "me quedé ", // quedarse
            "construí ", // construir
            "caí ", // caer
            "corté ", // cortar
            "maté ", // matar

            "alcancé ", // alcanzar
            "permanecí ", // permanecer
            "sugerí ", // sugerir

            "elevé ", // elevar
            "pasé ", // pasar
            "vendí ", // vender
            "requerí ", // requerir

            "decidí ", // decidir
            "informé ", // informar
            "devolví ", // volver
            "tiré ", // tirar

            "expliqué ", // explicar
            "llevé ", // llevar
            "desarrollé ", // desarrollar
            "esperé ", // esperar (repeated for "hope")
            "conduje ", // conducir
            "rompí " // romper
    };
    String[] verbsSpanishSecondPersonSingularPast = {
            "tuviste ", "hiciste ", "dijiste ", "fuiste ", "obtuviste ",
            "hiciste ", "supiste ", "pensaste ", "viste ", "tomaste ",
            "viniste ", "quisiste ", "miraste ", "usaste ", "encontraste ",
            "diste ", "dijiste ", "trabajaste ", "llamaste ", "intentaste ",
            "preguntaste ", "necesitaste ", "sentiste ", "te volviste ", "dejaste ",
            "pusiste ", "te referiste a ",
            "dejaste ", "mantuviste ", "empezaste ", "pareciste ", "hablaste ",
            "giraste ", "ayudaste ", "empezaste ", "mostraste ", "oíste ",
            "corriste ", "jugaste ", "moviste ", "gustaste ",
            "creíste ", "sostuviste ", "viviste ",
            "trajiste ", "escribiste ", "proporcionaste ", "te sentaste ",
            "estuviste de pie ", "perdiste ",
            "encontraste ", "pagaste ", "incluiste ", "continuaste ", "cambiaste ", "pusiste ", "lideraste ",
            "aprendiste ", "entendiste ", "miraste ", "seguiste ",
            "dejaste de ", "hablaste ", "creaste ", "permitiste ",
            "leíste ", "gastaste ", "añadiste ", "creciste ", "abriste ",
            "caminaste ", "ofreciste ", "recordaste ", "ganaste ",
            "apareciste ", "consideraste ", "amaste ", "compraste ",
            "esperaste ", "moriste ", "enviaste ", "esperaste ", "serviste ",
            "te quedaste ", "construiste ", "caíste ", "cortaste ", "mataste ",
            "alcanzaste ", "permaneciste ", "sugeriste ",
            "elevaste ", "pasaste ", "vendiste ", "requeriste ",
            "decidiste ", "informaste ", "devolviste ", "tiraste ",
            "explicaste ", "llevaste ", "desarrollaste ", "esperaste ", "condujiste ", "rompiste "
    };
    String[] verbsSpanishThirdPersonSingularPast = {
            "tuvo ", "hizo ", "dijo ", "fue ", "obtuvo ",
            "hizo ", "supo ", "pensó ", "vio ", "tomó ",
            "vino ", "quiso ", "miró ", "usó ", "encontró ",
            "dio ", "dijo ", "trabajó ", "llamó ", "intentó ",
            "preguntó ", "necesitó ", "sintió ", "se volvió ", "dejó ",
            "puso ", "se refirío a ",
            "dejó ", "mantuvo ", "empezó ", "pareció ", "habló ",
            "giró ", "ayudó ", "empezó ", "mostró ", "oyó ",
            "corrió ", "jugó ", "movió ", "gustó ",
            "creyó ", "sostuvo ", "vivió ",
            "trajo ", "escribió ", "proporcionó ", "se sentó ",
            "estuvo de pie ", "perdió ",
            "encontró ", "pagó ", "incluyó ", "continuó ", "cambió ", "puso ", "lideró ",
            "aprendió ", "entendió ", "miró ", "siguió ",
            "dejó de ", "habló ", "creó ", "permitió ",
            "leyó ", "gastó ", "añadió ", "creció ", "abrió ",
            "caminó ", "ofreció ", "recordó ", "ganó ",
            "apareció ", "consideró ", "amó ", "compró ",
            "esperó ", "murió ", "envió ", "esperó ", "sirvió ",
            "se quedó ", "construyó ", "cayó ", "cortó ", "mató ",
            "alcanzó ", "permaneció ", "sugirió ",
            "elevó ", "pasó ", "vendió ", "requirió ",
            "decidió ", "informó ", "devolvió ", "tiró ",
            "explicó ", "llevó ", "desarrolló ", "esperó ", "condujo ", "rompió "
    };
    String[] verbsSpanishThirdPersonPluralPast = {
            "tuvieron ", "hicieron ", "dijeron ", "fueron ", "obtuvieron ",
            "hicieron ", "supieron ", "pensaron ", "vieron ", "tomaron ",
            "vinieron ", "quisieron ", "miraron ", "usaron ", "encontraron ",
            "dieron ", "dijeron ", "trabajaron ", "llamaron ", "intentaron ",
            "preguntaron ", "necesitaron ", "sintieron ", "se volvieron ", "dejaron ",
            "pusieron ", "se refirieron a ",
            "dejaron ", "mantuvieron ", "empezaron ", "parecieron ", "hablaron ",
            "giraron ", "ayudaron ", "empezaron ", "mostraron ", "oyeron ",
            "corrieron ", "jugaron ", "movieron ", "gustaron ",
            "creyeron ", "sostuvieron ", "vivieron ",
            "trajeron ", "escribieron ", "proporcionaron ", "se sentaron ",
            "estuvieron de pie ", "perdieron ",
            "encontraron ", "pagaron ", "incluyeron ", "continuaron ", "cambiaron ", "pusieron ", "lideraron ",
            "aprendieron ", "entendieron ", "miraron ", "siguieron ",
            "dejaron de ", "hablaron ", "crearon ", "permitieron ",
            "leyeron ", "gastaron ", "añadieron ", "crecieron ", "abrieron ",
            "caminaron ", "ofrecieron ", "recordaron ", "ganaron ",
            "aparecieron ", "consideraron ", "amaron ", "compraron ",
            "esperaron ", "murieron ", "enviaron ", "esperaron ", "sirvieron ",
            "se quedaron ", "construyeron ", "cayeron ", "cortaron ", "mataron ",
            "alcanzaron ", "permanecieron ", "sugirieron ",
            "elevaron ", "pasaron ", "vendieron ", "requirieron ",
            "decidieron ", "informaron ", "devolvieron ", "tiraron ",
            "explicaron ", "llevaron ", "desarrollaron ", "esperaron ", "condujeron ", "rompieron "
    };
    String[] verbsSpanishFirstPersonPluralPast = {
            "tuvimos ", "hicimos ", "dijimos ", "fuimos ", "obtuvimos ",
            "hicimos ", "supimos ", "pensamos ", "vimos ", "tomamos ",
            "vinimos ", "quisimos ", "miramos ", "usamos ", "encontramos ",
            "dimos ", "dijimos ", "trabajamos ", "llamamos ", "intentamos ",
            "preguntamos ", "necesitamos ", "sentimos ", "nos volvimos ", "dejamos ",
            "pusimos ", "nos referimos a ",
            "dejamos ", "mantuvimos ", "empezamos ", "parecimos ", "hablamos ",
            "giramos ", "ayudamos ", "empezamos ", "mostramos ", "oímos ",
            "corrimos ", "jugamos ", "movimos ", "gustamos ",
            "creímos ", "sostuvimos ", "vivimos ",
            "trajimos ", "escribimos ", "proporcionamos ", "nos sentamos ",
            "estuvimos de pie ", "perdimos ",
            "encontramos ", "pagamos ", "incluimos ", "continuamos ", "cambiamos ", "pusimos ", "lideramos ",
            "aprendimos ", "entendimos ", "miramos ", "seguimos ",
            "dejamos de ", "hablamos ", "creamos ", "permitimos ",
            "leímos ", "gastamos ", "añadimos ", "crecimos ", "abrimos ",
            "caminamos ", "ofrecimos ", "recordamos ", "ganamos ",
            "aparecimos ", "consideramos ", "amamos ", "compramos ",
            "esperamos ", "morimos ", "enviamos ", "esperamos ", "servimos ",
            "nos quedamos ", "construimos ", "caímos ", "cortamos ", "matamos ",
            "alcanzamos ", "permanecimos ", "sugerimos ",
            "elevamos ", "pasamos ", "vendimos ", "requerimos ",
            "decidimos ", "informamos ", "devolvimos ", "tiramos ",
            "explicamos ", "llevamos ", "desarrollamos ", "esperamos ", "condujimos ", "rompimos "
    };

    String[] verbsSpanishSecondPerson = {
            "tienes ", "haces ", "dices ", "vas ", "obtienes ", "haces ", "sabes ", "piensas ", "ves ", "tomas ",
            "vienes ", "quieres ", "miras ", "usas ", "encuentras ", "das ", "dices ", "trabajas ", "llamas ",
            "intentas ", "preguntas ", "necesitas ", "sientes ", "te vuelves ", "dejas ", "pones ", "te refieres a ",
            "dejas ", "mantienes ", "empiezas ", "pareces ", "hablas ", "giras ", "ayudas ", "empiezas ", "muestras ",
            "oyes ", "corres ", "juegas ", "mueves ", "gustas ", "crees ", "sostienes ", "vives ",
            "traes ", "escribes ", "proporcionas ", "te sientas ", "estás de pie ", "pierdes ", "encuentras ", "pagas ",
            "incluyes ", "continúas ", "cambias ", "pones ", "lideras ", "aprendes ", "entiendes ", "miras ", "sigues ",
            "dejas de ", "hablas ", "creas ", "permites ", "lees ", "gastas ", "añades ", "creces ", "abres ", "caminas ",
            "ofreces ", "recuerdas ", "ganas ", "apareces ", "consideras ", "amas ", "compras ", "esperas ", "mueres ",
            "envías ", "esperas ", "sirves ", "te quedas ", "construyes ", "caes ", "cortas ", "matas ", "alcanzas ",
            "permaneces ", "sugieres ", "elevas ", "pasas ", "vendes ", "requieres ", "decides ", "informas ", "te devuelves ",
            "tiras ", "explicas ", "llevas ", "desarrollas ", "esperas ", "conduces ", "rompes "
    };


    String[] verbsSpanishThirdPerson = {
            "tiene ", "hace ", "dice ", "va ", "obtiene ", "hace ", "sabe ", "piensa ", "ve ", "toma ",
            "viene ", "quiere ", "mira ", "usa ", "encuentra ", "da ", "dice ", "trabaja ", "llama ",
            "intenta ", "pregunta ", "necesita ", "siente ", "se vuelve ", "deja ", "pone ", "se refiere a ",
            "deja ", "mantiene ", "empieza ", "parece ", "habla ", "gira ", "ayuda ", "empieza ", "muestra ",
            "oye ", "corre ", "juega ", "mueve ", "gusta ", "cree ", "sostiene ", "vive ",
            "trae ", "escribe ", "proporciona ", "se sienta ", "está de pie ", "pierde ", "encuentra ", "paga ",
            "incluye ", "continúa ", "cambia ", "pone ", "lidera ", "aprende ", "entiende ", "mira ", "sigue ",
            "deja de ", "habla ", "crea ", "permite ", "lee ", "gasta ", "añade ", "crece ", "abre ", "camina ",
            "ofrece ", "recuerda ", "gana ", "aparece ", "considera ", "ama ", "compra ", "espera ", "muere ",
            "envía ", "espera ", "sirve ", "se queda ", "construye ", "cae ", "corta ", "mata ", "alcanza ",
            "permanece ", "sugiere ", "eleva ", "pasa ", "vende ", "requiere ", "decide ", "informa ", "regresa ",
            "tira ", "explica ", "lleva ", "desarrolla ", "espera ", "conduce ", "rompe "
    };
    String[] verbsSpanishThirdPersonPlural = {
            "tienen ", "hacen ", "dicen ", "van ", "obtienen ", "hacen ", "saben ", "piensan ", "ven ", "toman ",
            "vienen ", "quieren ", "miran ", "usan ", "encuentran ", "dan ", "dicen ", "trabajan ", "llaman ",
            "intentan ", "preguntan ", "necesitan ", "sienten ", "se vuelven ", "dejan ", "ponen ", "se refieren a ",
            "dejan ", "mantienen ", "empiezan ", "parecen ", "hablan ", "giran ", "ayudan ", "empiezan ", "muestran ",
            "oyen ", "corren ", "juegan ", "mueven ", "gustan ", "creen ", "sostienen ", "viven ",
            "traen ", "escriben ", "proporcionan ", "se sientan ", "están de pie ", "pierden ", "encuentran ", "pagan ",
            "incluyen ", "continúan ", "cambian ", "ponen ", "lideran ", "aprenden ", "entienden ", "miran ", "siguen ",
            "dejan de ", "hablan ", "crean ", "permiten ", "leen ", "gastan ", "añaden ", "crecen ", "abren ", "caminan ",
            "ofrecen ", "recuerdan ", "ganan ", "aparecen ", "consideran ", "aman ", "compran ", "esperan ", "mueren ",
            "envían ", "esperan ", "sirven ", "se quedan ", "construyen ", "caen ", "cortan ", "matan ", "alcanzan ",
            "permanecen ", "sugieren ", "elevan ", "pasan ", "venden ", "requieren ", "deciden ", "informan ", "regresan ",
            "tiran ", "explican ", "llevan ", "desarrollan ", "esperan ", "conducen ", "rompen "
    };
    String[] verbsSpanishFirstPersonPlural = {
            "tenemos ", "hacemos ", "decimos ", "vamos ", "obtenemos ", "hacemos ", "sabemos ", "pensamos ", "vemos ", "tomamos ",
            "venimos ", "queremos ", "miramos ", "usamos ", "encontramos ", "damos ", "decimos ", "trabajamos ", "llamamos ",
            "intentamos ", "preguntamos ", "necesitamos ", "sentimos ", "nos volvemos ", "dejamos ", "ponemos ", "nos referimos a ",
            "dejamos ", "mantenemos ", "empezamos ", "parecemos ", "hablamos ", "giramos ", "ayudamos ", "empezamos ", "mostramos ",
            "oímos ", "corremos ", "jugamos ", "movemos ", "gustamos ", "creemos ", "sostenemos ", "vivimos ",
            "traemos ", "escribimos ", "proporcionamos ", "nos sentamos ", "estamos de pie ", "perdemos ", "encontramos ", "pagamos ",
            "incluimos ", "continuamos ", "cambiamos ", "ponemos ", "lideramos ", "aprendemos ", "entendemos ", "miramos ", "seguimos ",
            "dejamos de ", "hablamos ", "creamos ", "permitimos ", "leemos ", "gastamos ", "añadimos ", "crecemos ", "abrimos ", "caminamos ",
            "ofrecemos ", "recordamos ", "ganamos ", "aparecemos ", "consideramos ", "amamos ", "compramos ", "esperamos ", "morimos ",
            "enviamos ", "esperamos ", "servimos ", "nos quedamos ", "construimos ", "caemos ", "cortamos ", "matamos ", "alcanzamos ",
            "permanecemos ", "sugerimos ", "elevamos ", "pasamos ", "vendemos ", "requerimos ", "decidimos ", "informamos ", "nos devolvemos ",
            "tiramos ", "explicamos ", "llevamos ", "desarrollamos ", "esperamos ", "conducimos ", "rompemos "
    };
    String[] verbsSpanishFirstPersonPluralPastSubjunctive = {
            "tuviéramos ",
            "hiciéramos ",
            "dijéramos ",
            "fuéramos ",
            "obtuviéramos ",
            "hiciéramos ",
            "supiéramos ",
            "pensáramos ",
            "viéramos ",
            "tomáramos ",
            "viniéramos ",
            "quisiéramos ",
            "miráramos ",
            "usáramos ",
            "encontráramos ",
            "diéramos ",
            "dijéramos ",
            "trabajáramos ",
            "llamáramos ",
            "intentáramos ",
            "preguntáramos ",
            "necesitáramos ",
            "sintiéramos ",
            "llegáramos a ser ",
            "dejáramos ",
            "pusiéramos ",
            "nos refirieramos a ",
            "dejáramos ",
            "mantuviéramos ",
            "empezáramos ",
            "pareciéramos ",
            "habláramos ",
            "giráramos ",
            "ayudáramos ",
            "empezáramos ",
            "mostráramos ",
            "oyéramos ",
            "corriéramos ",
            "jugáramos ",
            "moviéramos ",
            "gustáramos ",
            "creyéramos ",
            "sostuviéramos ",
            "viéramos ",
            "trajéramos ",
            "escribiéramos ",
            "proporcionáramos ",
            "nos sentáramos ",
            "estuviéramos de pie ",
            "perdiéramos ",
            "encontráramos ",
            "pagáramos ",
            "incluyéramos ",
            "continuáramos ",
            "cambiáramos ",
            "pusiéramos ",
            "lideráramos ",
            "aprendiéramos ",
            "entendiéramos ",
            "miráramos ",
            "siguiéramos ",
            "detuviéramos ",
            "habláramos ",
            "creáramos ",
            "permitiéramos ",
            "leyéramos ",
            "gastáramos ",
            "añadiéramos ",
            "creciéramos ",
            "abriéramos ",
            "camináramos ",
            "ofreciéramos ",
            "recordáramos ",
            "ganáramos ",
            "apareciéramos ",
            "consideráramos ",
            "amáramos ",
            "compráramos ",
            "esperáramos ",
            "muriéramos ",
            "enviáramos ",
            "esperáramos ",
            "sirviéramos ",
            "nos quedáramos ",
            "construyéramos ",
            "cajéramos ",
            "cortáramos ",
            "matáramos ",
            "alcanzáramos ",
            "permaneciéramos ",
            "sugiriéramos ",
            "eleváramos ",
            "pasáramos ",
            "vendiéramos ",
            "requiriéramos ",
            "decidiéramos ",
            "informáramos ",
            "volviéramos ",
            "tiráramos ",
            "explicáramos ",
            "lleváramos ",
            "desarrolláramos ",
            "esperáramos ",
            "condujéramos ",
            "rompiéramos "
    };

    String[] verbsSpanishFirstPersonSubjunctive = {
            "tenga ", // have (tener)
            "haga ", // do (hacer)
            "diga ", // say (decir)
            "vaya ", // go (ir)
            "obtenga ", // get (obtener)
            "haga ", // make (hacer)
            "sepa ", // know (saber)
            "piense ", // think (pensar)
            "vea ", // see (ver)
            "tome ", // take (tomar)
            "venga ", // come (venir)
            "quiera ", // want (querer)
            "mire ", // look (mirar)
            "use ", // use (usar)
            "encuentre ", // find (encontrar)
            "dé ", // give (dar)
            "diga ", // tell (decir)
            "trabaje ", // work (trabajar)
            "llame ", // call (llamar)
            "intente ", // try (intentar)
            "pregunte ", // ask (preguntar)
            "necesite ", // need (necesitar)
            "sienta ", // feel (sentir)
            "me vuelva ", // become (llegar a ser)
            "deje ", // leave (dejar)
            "ponga ", // put (poner)
            "me refiera a ", // mean (significar)
            "deje ", // let (dejar)
            "mantenga ", // keep (mantener)
            "empiece ", // begin (empezar)
            "parezca ", // seem (parecer)
            "hable ", // talk (hablar)
            "gire ", // turn (girar)
            "ayude ", // help (ayudar)
            "empiece ", // start (empezar)
            "muestre ", // show (mostrar)
            "oiga ", // hear (oir)
            "corra ", // run (correr)
            "juegue ", // play (jugar)
            "mueva ", // move (mover)
            "guste ", // like (gustar)
            "crea ", // believe (creer)
            "sostenga ", // hold (sostener)
            "viva ", // live (vivir)
            "traiga ", // bring (traer)
            "escriba ", // write (escribir)
            "proporcione ", // provide (proporcionar)
            "me siente ", // sit (sentarse)
            "esté de pie ", // stand (estar de pie)
            "pierda ", // lose (perder)
            "encuentre ", // meet (encontrar)
            "pague ", // pay (pagar)
            "incluya ", // include (incluir)
            "continúe ", // continue (continuar)
            "cambie ", // change (cambiar)
            "ponga ", // set (poner)
            "lidere ", // lead (liderar)
            "aprenda ", // learn (aprender)
            "entienda ", // understand (entender)
            "mire ", // watch (mirar)
            "siga ", // follow (seguir)
            "deje de ", // stop (detener)
            "hable ", // speak (hablar)
            "cree ", // create (crear)
            "permita ", // allow (permitir)
            "lea ", // read (leer)
            "gaste ", // spend (gastar)
            "añada ", // add (añadir)
            "crezca ", // grow (crecer)
            "abra ", // open (abrir)
            "camine ", // walk (caminar)
            "ofrezca ", // offer (ofrecer)
            "recuerde ", // remember (recordar)
            "gane ", // win (ganar)
            "aparezca ", // appear (aparecer)
            "considere ", // consider (considerar)
            "ame ", // love (amar)
            "compre ", // buy (comprar)
            "espere ", // wait (esperar)
            "muera ", // die (morir)
            "envíe ", // send (enviar)
            "espere ", // expect (esperar)
            "sirva ", // serve (servir)
            "me quede ", // stay (quedarse)
            "construya ", // build (construir)
            "caiga ", // fall (caer)
            "corte ", // cut (cortar)
            "mate ", // kill (matar)
            "alcance ", // reach (alcanzar)
            "permanezca ", // remain (permanecer)
            "sugiera ", // suggest (sugerir)
            "eleve ", // raise (elevar)
            "pase ", // pass (pasar)
            "venda ", // sell (vender)
            "requiera ", // require (requerir)
            "decida ", // decide (decidir)
            "informe ", // report (informar)
            "me devuelva ", // return (volver)
            "tire ", // pull (tirar)
            "explique ", // explain (explicar)
            "lleve ", // carry (llevar)
            "desarrolle ", // develop (desarrollar)
            "espere ", // hope (esperar)
            "conduzca ", // drive (conducir)
            "rompa " // break (romper)
    };
    String[] verbsSpanishThirdPersonSubjunctive = {
            "tenga ", "haga ", "diga ", "vaya ", "obtenga ", "haga ", "sepa ", "piense ", "vea ", "tome ",
            "venga ", "quiera ", "mire ", "use ", "encuentre ", "dé ", "diga ", "trabaje ", "llame ", "intente ",
            "pregunte ", "necesite ", "sienta ", "se vuelva ", "deje ", "ponga ", "se refiera ", "deje ", "mantenga ", "empiece ",
            "parezca ", "hable ", "gire ", "ayude ", "empiece ", "muestre ", "oiga ", "corra ", "juegue ", "mueva ",
            "guste ", "crea ", "sostenga ", "viva ", "traiga ", "escriba ", "proporcione ", "se siente ", "esté de pie ", "pierda ",
            "encuentre ", "pague ", "incluya ", "continúe ", "cambie ", "ponga ", "lidere ", "aprenda ", "entienda ", "mire ",
            "siga ", "deje de ", "hable ", "cree ", "permita ", "lea ", "gaste ", "añada ", "crezca ", "abra ",
            "camine ", "ofrezca ", "recuerde ", "gane ", "aparezca ", "considere ", "ame ", "compre ", "espere ", "muera ",
            "envíe ", "espere ", "sirva ", "se quede ", "construya ", "caiga ", "corte ", "mate ", "alcance ", "permanezca ",
            "sugiera ", "eleve ", "pase ", "venda ", "requiera ", "decida ", "informe ", "se devuelva ", "tire ", "explique ",
            "lleve ", "desarrolle ", "espere ", "conduzca ", "rompa "
    };

    String[] verbsSpanishFirstPersonPastSubjunctive = {
            "tuviera ", // have (tener)
            "hiciera ", // do (hacer)
            "dijera ", // say (decir)
            "fuera ", // go (ir)
            "obtuviera ", // get (obtener)
            "hiciera ", // make (hacer)
            "supiera ", // know (saber)
            "pensara ", // think (pensar)
            "viera ", // see (ver)
            "tomara ", // take (tomar)
            "viniera ", // come (venir)
            "quisiera ", // want (querer)
            "mirara ", // look (mirar)
            "usara ", // use (usar)
            "encontrara ", // find (encontrar)
            "diera ", // give (dar)
            "dijera ", // tell (decir)
            "trabajara ", // work (trabajar)
            "llamara ", // call (llamar)
            "intentara ", // try (intentar)
            "preguntara ", // ask (preguntar)
            "necesitara ", // need (necesitar)
            "sintiera ", // feel (sentir)
            "me volviera ", // become (llegar a ser)
            "dejara ", // leave (dejar)
            "pusiera ", // put (poner)
            "se refiriera a ", // mean (significar)
            "dejara ", // let (dejar)
            "mantuviera ", // keep (mantener)
            "empezara ", // begin (empezar)
            "pareciera ", // seem (parecer)
            "hablara ", // talk (hablar)
            "girara ", // turn (girar)
            "ayudara ", // help (ayudar)
            "empezara ", // start (empezar)
            "mostrara ", // show (mostrar)
            "oyera ", // hear (oir)
            "corriera ", // run (correr)
            "jugara ", // play (jugar)
            "moviera ", // move (mover)
            "gustara ", // like (gustar)
            "creyera ", // believe (creer)
            "sostuviera ", // hold (sostener)
            "viviera ", // live (vivir)
            "trajera ", // bring (traer)
            "escribiera ", // write (escribir)
            "proporcionara ", // provide (proporcionar)
            "me sentara ", // sit (sentarse)
            "estuviera de pie ", // stand (estar de pie)
            "perdiera ", // lose (perder)
            "encontrara ", // meet (encontrar)
            "pagara ", // pay (pagar)
            "incluyera ", // include (incluir)
            "continuara ", // continue (continuar)
            "cambiara ", // change (cambiar)
            "pusiera ", // set (poner)
            "liderara ", // lead (liderar)
            "aprendiera ", // learn (aprender)
            "entendiera ", // understand (entender)
            "mirara ", // watch (mirar)
            "siguiera ", // follow (seguir)
            "dejara de ", // stop (detener)
            "hablara ", // speak (hablar)
            "creara ", // create (crear)
            "permitiera ", // allow (permitir)
            "leyera ", // read (leer)
            "gastara ", // spend (gastar)
            "añadiera ", // add (añadir)
            "creciera ", // grow (crecer)
            "abriera ", // open (abrir)
            "caminara ", // walk (caminar)
            "ofreciera ", // offer (ofrecer)
            "recordara ", // remember (recordar)
            "ganara ", // win (ganar)
            "apareciera ", // appear (aparecer)
            "considerara ", // consider (considerar)
            "amara ", // love (amar)
            "comprara ", // buy (comprar)
            "esperara ", // wait (esperar)
            "muriera ", // die (morir)
            "enviara ", // send (enviar)
            "esperara ", // expect (esperar)
            "sirviera ", // serve (servir)
            "me quedara ", // stay (quedarse)
            "construyera ", // build (construir)
            "cayera ", // fall (caer)
            "cortara ", // cut (cortar)
            "matara ", // kill (matar)
            "alcanzara ", // reach (alcanzar)
            "permaneciera ", // remain (permanecer)
            "sugiriera ", // suggest (sugerir)
            "elevara ", // raise (elevar)
            "pasara ", // pass (pasar)
            "vendiera ", // sell (vender)
            "requiriera ", // require (requerir)
            "decidiera ", // decide (decidir)
            "informara ", // report (informar)
            "devolviera ", // return (volver)
            "tirara ", // pull (tirar)
            "explicara ", // explain (explicar)
            "llevara ", // carry (llevar)
            "desarrollara ", // develop (desarrollar)
            "esperara ", // hope (esperar)
            "condujera ", // drive (conducir)
            "rompiera " // break (romper)
    };
    String[] verbsSpanishSecondPersonPastSubjunctive = {
            "tuvieras ", // have (tener)
            "hicieras ", // do (hacer)
            "dijeras ", // say (decir)
            "fueras ", // go (ir)
            "obtuvieras ", // get (obtener)
            "hicieras ", // make (hacer)
            "supieras ", // know (saber)
            "pensaras ", // think (pensar)
            "vieras ", // see (ver)
            "tomaras ", // take (tomar)
            "vinieras ", // come (venir)
            "quisieras ", // want (querer)
            "miraras ", // look (mirar)
            "usaras ", // use (usar)
            "encontraras ", // find (encontrar)
            "dieras ", // give (dar)
            "dijeras ", // tell (decir)
            "trabajaras ", // work (trabajar)
            "llamaras ", // call (llamar)
            "intentaras ", // try (intentar)
            "preguntaras ", // ask (preguntar)
            "necesitaras ", // need (necesitar)
            "sintieras ", // feel (sentir)
            "te volvieras ", // become (llegar a ser)
            "dejaras ", // leave (dejar)
            "pusieras ", // put (poner)
            "te refirieras a ", // mean (significar)
            "dejaras ", // let (dejar)
            "mantuvieras ", // keep (mantener)
            "empezaras ", // begin (empezar)
            "parecieras ", // seem (parecer)
            "hablaras ", // talk (hablar)
            "giraras ", // turn (girar)
            "ayudaras ", // help (ayudar)
            "empezaras ", // start (empezar)
            "mostraras ", // show (mostrar)
            "oyeras ", // hear (oir)
            "corrieras ", // run (correr)
            "jugaras ", // play (jugar)
            "movieras ", // move (mover)
            "gustaras ", // like (gustar)
            "creyeras ", // believe (creer)
            "sostuvieras ", // hold (sostener)
            "vivieras ", // live (vivir)
            "trajeras ", // bring (traer)
            "escribieras ", // write (escribir)
            "proporcionaras ", // provide (proporcionar)
            "te sentaras ", // sit (sentarse)
            "estuvieras de pie ", // stand (estar de pie)
            "perdieras ", // lose (perder)
            "encontraras ", // meet (encontrar)
            "pagaras ", // pay (pagar)
            "incluyeras ", // include (incluir)
            "continuaras ", // continue (continuar)
            "cambiaras ", // change (cambiar)
            "pusieras ", // set (poner)
            "lideraras ", // lead (liderar)
            "aprendieras ", // learn (aprender)
            "entendieras ", // understand (entender)
            "miraras ", // watch (mirar)
            "siguieras ", // follow (seguir)
            "dejaras de ", // stop (detener)
            "hablaras ", // speak (hablar)
            "crearas ", // create (crear)
            "permitieras ", // allow (permitir)
            "leyeras ", // read (leer)
            "gastaras ", // spend (gastar)
            "añadieras ", // add (añadir)
            "crecieras ", // grow (crecer)
            "abrieras ", // open (abrir)
            "caminaras ", // walk (caminar)
            "ofrecieras ", // offer (ofrecer)
            "recordaras ", // remember (recordar)
            "ganaras ", // win (ganar)
            "aparecieras ", // appear (aparecer)
            "consideraras ", // consider (considerar)
            "amaras ", // love (amar)
            "compraras ", // buy (comprar)
            "esperaras ", // wait (esperar)
            "murieras ", // die (morir)
            "enviaras ", // send (enviar)
            "esperaras ", // expect (esperar)
            "sirvieras ", // serve (servir)
            "te quedaras ", // stay (quedarse)
            "construyeras ", // build (construir)
            "cayeras ", // fall (caer)
            "cortaras ", // cut (cortar)
            "mataras ", // kill (matar)
            "alcanzaras ", // reach (alcanzar)
            "permanecieras ", // remain (permanecer)
            "sugirieras ", // suggest (sugerir)
            "elevaras ", // raise (elevar)
            "pasaras ", // pass (pasar)
            "vendieras ", // sell (vender)
            "requirieras ", // require (requerir)
            "decidieras ", // decide (decidir)
            "informaras ", // report (informar)
            "devolvieras ", // return (volver)
            "tiraras ", // pull (tirar)
            "explicaras ", // explain (explicar)
            "llevaras ", // carry (llevar)
            "desarrollaras ", // develop (desarrollar)
            "esperaras ", // hope (esperarar)
            "condujeras ", // drive (conducir)
            "rompieras " // break (romper)
    };
    String[] verbsSpanishThirdPersonPastSubjunctive = {
            "tuviera ", // have (tener)
            "hiciera ", // Do (hacer)
            "dijera ", // Say (decir)
            "fuera ", // Go (ir)
            "obtuviera ", // Get (obtener)
            "hiciera ", // Make (hacer)
            "supiera ", // Know (saber)
            "pensara ", // Think (pensar)
            "viera ", // See (ver)
            "tomara ", // Take (tomar)
            "viniera ", // Come (venir)
            "quisiera ", // Want (querer)
            "mirara ", // Look (mirar)
            "usara ", // Use (usar)
            "encontrara ", // Find (encontrar)
            "diera ", // Give (dar)
            "dijera ", // Tell (decir)
            "trabajara ", // Work (trabajar)
            "llamara ", // Call (llamar)
            "intentara ", // Try (intentar)
            "preguntara ", // Ask (preguntar)
            "necesitara ", // Need (necesitar)
            "sintiera ", // Feel (sentir)
            "se volviera ", // Become (llegar a ser)
            "dejara ", // Leave (dejar)
            "pusiera ", // Put (poner)
            "se refiera a ", // Mean (significar)
            "dejara ", // Let (dejar)
            "mantuviera ", // Keep (mantener)
            "empezara ", // Begin (empezar)
            "pareciera ", // Seem (parecer)
            "hablara ", // Talk (hablar)
            "girara ", // Turn (girar)
            "ayudara ", // Help (ayudar)
            "empezara ", // Start (empezar)
            "mostrara ", // Show (mostrar)
            "oyera ", // Hear (oir)
            "corriera ", // Run (correr)
            "jugara ", // Play (jugar)
            "moviera ", // Move (mover)
            "gustara ", // Like (gustar)
            "creyera ", // Believe (creer)
            "sostviera ", // Hold (sostener)
            "viviera ", // Live (vivir)
            "trajera ", // Bring (traer)
            "escribiera ", // Write (escribir)
            "proporcionara ", // Provide (proporcionar)
            "se sentara ", // Sit (sentarse)
            "estuviera de pie ", // Stand (estar de pie)
            "perdiera ", // Lose (perder)
            "encontrara ", // Meet (encontrar)
            "pagara ", // Pay (pagar)
            "incluyera ", // Include (incluir)
            "continuara ", // Continue (continuar)
            "cambiara ", // Change (cambiar)
            "pusiera ", // Set (poner)
            "liderara ", // Lead (liderar)
            "aprendiera ", // Learn (aprender)
            "entendiera ", // Understand (entender)
            "mirara ", // Watch (mirar)
            "siguiera ", // Follow (seguir)
            "dejara de ", // Stop (detener)
            "hablara ", // Speak (hablar)
            "creara ", // Create (crear)
            "permitiera ", // Allow (permitir)
            "leyera ", // Read (leer)
            "gastara ", // Spend (gastar)
            "añadiera ", // Add (añadir)
            "creciera ", // Grow (crecer)
            "abriera ", // Open (abrir)
            "caminara ", // Walk (caminar)
            "ofreciera ", // Offer (ofrecer)
            "recordara ", // Remember (recordar)
            "ganara ", // Win (ganar)
            "apareciera ", // Appear (aparecer)
            "considerara ", // Consider (considerar)
            "amara ", // Love (amar)
            "comprara ", // Buy (comprar)
            "esperara ", // Wait (esperar)
            "muriera ", // Die (morir)
            "enviara ", // Send (enviar)
            "esperara ", // Expect (esperar)
            "sirviera ", // Serve (servir)
            "se quedara ", // Stay (quedarse)
            "construyera ", // Build (construir)
            "cayera ", // Fall (caer)
            "cortara ", // Cut (cortar)
            "matara ", // Kill (matar)
            "alcanzara ", // Reach (alcanzar)
            "permaneciera ", // Remain (permanecer)
            "sugiriera ", // Suggest (sugerir)
            "elevara ", // raise (elevar)
            "pasara ", // pass (pasar)
            "vendiera ", // sell (vender)
            "requiriera ", // require (requerir)
            "decidiera ", // decide (decidir)
            "informara ", // report (informar)
            "devolviera ", // return (volver)
            "tirara ", // pull (tirar)
            "explicara ", // explain (explicar)
            "llevara ", // carry (llevar)
            "desarrollara ", // develop (desarrollar)
            "esperara ", // hope (esperarar)
            "condujera ", // drive (conducir)
            "rompiera " // break (romper)
    };
    String[] verbsSpanishThirdPersonPluralPastSubjunctive = {
            "tuvieran ", // have (tener)
            "hicieran ", // do (hacer)
            "dijeran ", // say (decir)
            "fueran ", // go (ir)
            "obtuvieran ", // get (obtener)
            "hicieran ", // make (hacer)
            "supieran ", // know (saber)
            "pensaran ", // think (pensar)
            "vieran ", // see (ver)
            "tomaran ", // take (tomar)
            "vinieran ", // come (venir)
            "quisieran ", // want (querer)
            "miraran ", // look (mirar)
            "usaran ", // use (usar)
            "encontraran ", // find (encontrar)
            "dieran ", // give (dar)
            "dijeran ", // tell (decir)
            "trabajaran ", // work (trabajar)
            "llamaran ", // call (llamar)
            "intentaran ", // try (intentar)
            "preguntaran ", // ask (preguntar)
            "necesitaran ", // need (necesitar)
            "sintieran ", // feel (sentir)
            "se volvieran ", // become (llegar a ser)
            "dejaran ", // leave (dejar)
            "pusieran ", // put (poner)
            "se refieran a ", // mean (significar)
            "dejaran ", // let (dejar)
            "mantuvieran ", // keep (mantener)
            "empezaran ", // begin (empezar)
            "parecieran ", // seem (parecer)
            "hablaran ", // talk (hablar)
            "giraran ", // turn (girar)
            "ayudaran ", // help (ayudar)
            "empezaran ", // start (empezar)
            "mostraran ", // show (mostrar)
            "oyeran ", // hear (oir)
            "corrieran ", // run (correr)
            "jugarn ", // play (jugar)
            "movieran ", // move (mover)
            "gustaran ", // like (gustar)
            "creyeran ", // believe (creer)
            "sostuvieran ", // hold (sostener)
            "vivieran ", // live (vivir)
            "trajeran ", // bring (traer)
            "escribieran ", // write (escribir)
            "proporcionaran ", // provide (proporcionar)
            "se sentaran ", // sit (sentarse)
            "estuvieran de pie ", // stand (estar de pie)
            "perdieran ", // lose (perder)
            "encontraran ", // meet (encontrar)
            "pagaran ", // pay (pagar)
            "incluyeran ", // include (incluir)
            "continuaran ", // continue (continuar)
            "cambiaran ", // change (cambiar)
            "pusieran ", // set (poner)
            "lideraran ", // lead (liderar)
            "aprendieran ", // learn (aprender)
            "entendieran ", // understand (entender)
            "miraran ", // watch (mirar)
            "siguieran ", // follow (seguir)
            "dejaran de ", // stop (detener)
            "hablaran ", // speak (hablar)
            "crearan ", // create (crear)
            "permitieran ", // allow (permitir)
            "leyeran ", // read (leer)
            "gastaran ", // spend (gastar)
            "añadieran ", // add (añadir)
            "crecieran ", // grow (crecer)
            "abrieran ", // open (abrir)
            "caminaran ", // walk (caminar)
            "ofrecieran ", // offer (ofrecer)
            "recordaran ", // remember (recordar)
            "ganaran ", // win (ganar)
            "aparecieran ", // appear (aparecer)
            "consideraran ", // consider (considerar)
            "amaran ", // love (amar)
            "compraren ", // buy (comprar)
            "esperaran ", // wait (esperar)
            "murieran ", // die (morir)
            "enviaran ", // send (enviar)
            "esperaran ", // expect (esperar)
            "sirvieran ", // serve (servir)
            "se quedaran ", // stay (quedarse)
            "construyeran ", // build (construir)
            "cayeran ", // fall (caer)
            "cortaran ", // cut (cortar)
            "mataran ", // kill (matar)
            "alcanzaran ", // reach (alcanzar)
            "permanecieran ", // remain (permanecer)
            "sugirieran ", // suggest (sugerir)
            "elevaran ", // raise (elevar)
            "pasaran ", // pass (pasar)
            "vendieran ", // sell (vender)
            "requirieran ", // require (requerir)
            "decidieran ", // decide (decidir)
            "informaran ", // report (informar)
            "devolvieran ", // return (volver)
            "tiraran ", // pull (tirar)
            "explicaran ", // explain (explicar)
            "llevaran ", // carry (llevar)
            "desarrollaran ", // develop (desarrollar)
            "esperaran ", // hope (esperar)
            "condujeran ", // drive (conducir)
            "rompieran " // break (romper)
    };

    String[] verbsSpanishSecondPersonSubjunctive = {
            "tengas ", // have (tener)
            "hagas ", // do (hacer)
            "digas ", // say (decir)
            "vayas ", // go (ir)
            "obtengas ", // get (obtener)
            "hagas ", // make (hacer)
            "sepas ", // know (saber)
            "pienses ", // think (pensar)
            "veas ", // see (ver)
            "tomes ", // take (tomar)
            "vengas ", // come (venir)
            "quieras ", // want (querer)
            "mires ", // look (mirar)
            "uses ", // use (usar)
            "encuentres ", // find (encontrar)
            "des ", // give (dar)
            "digas ", // tell (decir)
            "trabajes ", // work (trabajar)
            "llames ", // call (llamar)
            "intentes ", // try (intentar)
            "preguntes ", // ask (preguntar)
            "necesites ", // need (necesitar)
            "sientas ", // feel (sentir)
            "te vuelvas ", // become (llegar a ser)
            "dejes ", // leave (dejar)
            "pongas ", // put (poner)
            "te refieras a ", // mean (significar)
            "dejes ", // let (dejar)
            "mantengas ", // keep (mantener)
            "empieces ", // begin (empezar)
            "parezcas ", // seem (parecer)
            "hables ", // talk (hablar)
            "gires ", // turn (girar)
            "ayudes ", // help (ayudar)
            "empieces ", // start (empezar)
            "muestres ", // show (mostrar)
            "oigas ", // hear (oir)
            "corras ", // run (correr)
            "juegues ", // play (jugar)
            "muevas ", // move (mover)
            "gustes ", // like (gustar)
            "creas ", // believe (creer)
            "sostengas ", // hold (sostener)
            "vivas ", // live (vivir)
            "traigas ", // bring (traer)
            "escribas ", // write (escribir)
            "proporciones ", // provide (proporcionar)
            "te sientes ", // sit (sentarse)
            "estés de pie ", // stand (estar de pie)
            "pierdas ", // lose (perder)
            "encuentres ", // meet (encontrar)
            "pagues ", // pay (pagar)
            "incluyas ", // include (incluir)
            "continúes ", // continue (continuar)
            "cambies ", // change (cambiar)
            "pongas ", // set (poner)
            "lideres ", // lead (liderar)
            "aprendas ", // learn (aprender)
            "entiendas ", // understand (entender)
            "mires ", // watch (mirar)
            "sigas ", // follow (seguir)
            "dejes de ", // stop (detener)
            "hables ", // speak (hablar)
            "crees ", // create (crear)
            "permitas ", // allow (permitir)
            "leas ", // read (leer)
            "gastes ", // spend (gastar)
            "añadas ", // add (añadir)
            "crezcas ", // grow (crecer)
            "abras ", // open (abrir)
            "caminas ", // walk (caminar)
            "ofrezcas ", // offer (ofrecer)
            "recuerdes ", // remember (recordar)
            "ganes ", // win (ganar)
            "aparezcas ", // appear (aparecer)
            "consideres ", // consider (considerar)
            "ames ", // love (amar)
            "compres ", // buy (comprar)
            "esperes ", // wait (esperar)
            "mueras ", // die (morir)
            "envíes ", // send (enviar)
            "esperes ", // expect (esperar)
            "sirvas ", // serve (servir)
            "te quedes ", // stay (quedarse)
            "construyas ", // build (construir)
            "caigas ", // fall (caer)
            "cortes ", // cut (cortar)
            "mates ", // kill (matar)
            "alcances ", // reach (alcanzar)
            "permanezcas ", // remain (permanecer)
            "sugieras ", // suggest (sugerir)
            "eleves ", // raise (elevar)
            "pases ", // pass (pasar)
            "vendas ", // sell (vender)
            "requieras ", // require (requerir)
            "decidas ", // decide (decidir)
            "informes ", // report (informar)
            "te devuelvas ", // return (volver)
            "tires ", // pull (tirar)
            "expliques ", // explain (explicar)
            "lleves ", // carry (llevar)
            "desarrolles ", // develop (desarrollar)
            "esperes ", // hope (esperar)
            "conduzcas ", // drive (conducir)
            "rompas " // break (romper)
    };
    String[] verbsSpanishThirdPersonPluralSubjunctive = {
            "tengan ", // have (tener)
            "hagan ", // do (hacer)
            "digan ", // say (decir)
            "vayan ", // go (ir)
            "obtengan ", // get (obtener)
            "hagan ", // make (hacer)
            "sepan ", // know (saber)
            "piensen ", // think (pensar)
            "vean ", // see (ver)
            "tomen ", // take (tomar)
            "vengan ", // come (venir)
            "quieran ", // want (querer)
            "miren ", // look (mirar)
            "usen ", // use (usar)
            "encuentren ", // find (encontrar)
            "den ", // give (dar)
            "digan ", // tell (decir)
            "trabajen ", // work (trabajar)
            "llamen ", // call (llamar)
            "intenten ", // try (intentar)
            "pregunten ", // ask (preguntar)
            "necesiten ", // need (necesitar)
            "sientan ", // feel (sentir)
            "se vuelvan ", // become (llegar a ser)
            "dejen ", // leave (dejar)
            "pongan ", // put (poner)
            "se refieran a ", // mean (significar)
            "dejen ", // let (dejar)
            "mantengan ", // keep (mantener)
            "empiecen ", // begin (empezar)
            "parezcan ", // seem (parecer)
            "hablen ", // talk (hablar)
            "giren ", // turn (girar)
            "ayuden ", // help (ayudar)
            "empiecen ", // start (empezar)
            "muestren ", // show (mostrar)
            "oigan ", // hear (oir)
            "corran ", // run (correr)
            "jueguen ", // play (jugar)
            "muevan ", // move (mover)
            "gusten ", // like (gustar)
            "crean ", // believe (creer)
            "sostengan ", // hold (sostener)
            "vivan ", // live (vivir)
            "traigan ", // bring (traer)
            "escriban ", // write (escribir)
            "proporcionen ", // provide (proporcionar)
            "se sienten ", // sit (sentarse)
            "estén de pie ", // stand (estar de pie)
            "pierdan ", // lose (perder)
            "encuentren ", // meet (encontrar)
            "paguen ", // pay (pagar)
            "incluyan ", // include (incluir)
            "continúen ", // continue (continuar)
            "cambien ", // change (cambiar)
            "pongan ", // set (poner)
            "lideren ", // lead (liderar)
            "aprendan ", // learn (aprender)
            "entiendan ", // understand (entender)
            "miren ", // watch (mirar)
            "sigan ", // follow (seguir)
            "dejen de ", // stop (detener)
            "hablen ", // speak (hablar)
            "creen ", // create (crear)
            "permitan ", // allow (permitir)
            "lean ", // read (leer)
            "gasten ", // spend (gastar)
            "añadan ", // add (añadir)
            "crezcan ", // grow (crecer)
            "abran ", // open (abrir)
            "caminen ", // walk (caminar)
            "ofrezcan ", // offer (ofrecer)
            "recuerden ", // remember (recordar)
            "ganen ", // win (ganar)
            "aparezcan ", // appear (aparecer)
            "consideren ", // consider (considerar)
            "amen ", // love (amar)
            "compren ", // buy (comprar)
            "esperen ", // wait (esperar)
            "mueran ", // die (morir)
            "envíen ", // send (enviar)
            "esperen ", // expect (esperar)
            "sirvan ", // serve (servir)
            "se queden ", // stay (quedarse)
            "construyan ", // build (construir)
            "caigan ", // fall (caer)
            "corten ", // cut (cortar)
            "maten ", // kill (matar)
            "alcancen ", // reach (alcanzar)
            "permanezcan ", // remain (permanecer)
            "sugieran ", // suggest (sugerir)
            "eleven ", // raise (elevar)
            "pasen ", // pass (pasar)
            "vendan ", // sell (vender)
            "requieran ", // require (requerir)
            "decidan ", // decide (decidir)
            "informen ", // report (informar)
            "se devuelvan ", // return (volver)
            "tiren ", // pull (tirar)
            "expliquen ", // explain (explicar)
            "lleven ", // carry (llevar)
            "desarrollen ", // develop (desarrollar)
            "esperen ", // hope (esperar)
            "conduzcan ", // drive (conducir)
            "rompan " // break (romper)
    };
    String[] verbsSpanishFirstPersonPluralSubjunctive = {
            "tengamos ", // have (tener)
            "hagamos ", // do (hacer)
            "digamos ", // say (decir)
            "vayamos ", // go (ir)
            "obtengamos ", // get (obtener)
            "hagamos ", // make (hacer)
            "sepamos ", // know (saber)
            "pensemos ", // think (pensar)
            "veamos ", // see (ver)
            "tomemos ", // take (tomar)
            "vengamos ", // come (venir)
            "queramos ", // want (querer)
            "miremos ", // look (mirar)
            "usemos ", // use (usar)
            "encontremos ", // find (encontrar)
            "demos ", // give (dar)
            "digamos ", // tell (decir)
            "trabajemos ", // work (trabajar)
            "llamemos ", // call (llamar)
            "intentemos ", // try (intentar)
            "preguntemos ", // ask (preguntar)
            "necesitemos ", // need (necesitar)
            "sintamos ", // feel (sentir)
            "nos volvamos ", // become (llegar a ser)
            "dejemos ", // leave (dejar)
            "pongamos ", // put (poner)
            "nos refiramos a ", // mean (significar)
            "dejemos ", // let (dejar)
            "mantengamos ", // keep (mantener)
            "empecemos ", // begin (empezar)
            "parezcamos ", // seem (parecer)
            "hablemos ", // talk (hablar)
            "giremos ", // turn (girar)
            "ayudemos ", // help (ayudar)
            "empecemos ", // start (empezar)
            "mostremos ", // show (mostrar)
            "oigamos ", // hear (oir)
            "corramos ", // run (correr)
            "juguemos ", // play (jugar)
            "movamos ", // move (mover)
            "gustemos ", // like (gustar)
            "creamos ", // believe (creer)
            "sostengamos ", // hold (sostener)
            "vivamos ", // live (vivir)
            "traigamos ", // bring (traer)
            "escribamos ", // write (escribir)
            "proporcionemos ", // provide (proporcionar)
            "nos sentemos ", // sit (sentarse)
            "estemos de pie ", // stand (estar de pie)
            "perdamos ", // lose (perder)
            "encontremos ", // meet (encontrar)
            "paguemos ", // pay (pagar)
            "incluyamos ", // include (incluir)
            "continuemos ", // continue (continuar)
            "cambiemos ", // change (cambiar)
            "pongamos ", // set (poner)
            "lidere ", // lead (liderar)
            "aprendamos ", // learn (aprender)
            "entendamos ", // understand (entender)
            "miremos ", // watch (mirar)
            "sigamos ", // follow (seguir)
            "dejemos de ", // stop (detener)
            "hablemos ", // speak (hablar)
            "creemos ", // create (crear)
            "permitamos ", // allow (permitir)
            "leamos ", // read (leer)
            "gastemos ", // spend (gastar)
            "añadamos ", // add (añadir)
            "crezcamos ", // grow (crecer)
            "abramos ", // open (abrir)
            "caminemos ", // walk (caminar)
            "ofrezcamos ", // offer (ofrecer)
            "recordemos ", // remember (recordar)
            "ganemos ", // win (ganar)
            "aparezcamos ", // appear (aparecer)
            "consideremos ", // consider (considerar)
            "amemos ", // love (amar)
            "compremos ", // buy (comprar)
            "esperemos ", // wait (esperar)
            "muramos ", // die (morir)
            "enviemos ", // send (enviar)
            "esperemos ", // expect (esperar)
            "sirvamos ", // serve (servir)
            "nos quedemos ", // stay (quedarse)
            "construyamos ", // build (construir)
            "caigamos ", // fall (caer)
            "cortemos ", // cut (cortar)
            "matemos ", // kill (matar)
            "alcancemos ", // reach (alcanzar)
            "permanezcamos ", // remain (permanecer)
            "sugiramos ", // suggest (sugerir)
            "elevemos ", // raise (elevar)
            "pasemos ", // pass (pasar)
            "vendamos ", // sell (vender)
            "requiramos ", // require (requerir)
            "decidamos ", // decide (decidir)
            "informemos ", // report (informar)
            "devolvamos ", // return (volver)
            "tiremos ", // pull (tirar)
            "expliquemos ", // explain (explicar)
            "llevemos ", // carry (llevar)
            "desarrollemos ", // develop (desarrollar)
            "esperemos ", // hope (esperar)
            "conduzcamos ", // drive (conducir)
            "rompamos " // break (romper)
    };

    String[][] verbObjects = {
            // Objects for "tener " (to have)
            {"time ", "money ", "food ", "the floor ", "love "},

            // Objects for "hacer " (to do)
            {"a favor ", "a magic trick ", "good ", "everything ", "nothing "},

            // Objects for "decir " (to say)
            {"the truth ", "a lie ", "a story ", "goodbye ", "hello "},

            // Objects for "ir " (to go)
            {"to school ", "to work ", "home ", "to the store ", "to bed "},

            // Objects for "obtener " (to get)
            {"results ", "information ", "approval ", "a job ", "tickets "},

            // Objects for "hacer " (/make)
            {"homework ", "a plan ", "a cake ", "an effort ", "progress "},

            // Objects for "saber " (to know)
            {"the answer ", "a secret ", "the way ", "the truth ", "nothing "},

            // Objects for "pensar " (to think)
            {"about the future ", "of an idea ", "about life ", "positively ", "about a solution "},

            // Objects for "ver " (to see)
            {"a movie ", "a doctor ", "the point ", "the difference ", "a friend "},

            // Objects for "tomar " (to take)
            {"a break ", "a photo ", "a seat ", "a test ", "medicine "},

            // Objects for "venir " (to come)
            {"to visit ", "to an agreement ", "to the party ", "to a conclusion ", "to help "},

            // objects for "querer " / to want
            {"to eat something ", "to leave early ", "to know the truth ", "to buy a house ", "to travel the world "},

            // Objects for "mirar " (to look)
            {"at the sky ", "through the window ", "at the mirror ", "at photos ", "at the clock "},

            // Objects for "usar " (to use)
            {"a pen ", "a computer ", "a tool ", "social media ", "an application "},

            // Objects for "encontrar " (to find)
            {"a solution ", "a friend ", "a job ", "a key ", "peace of mind "},

            // Objects for "dar " (to give)
            {"a gift ", "advice ", "a hug ", "a presentation ", "a lecture "},

            // Objects for "contar " (to tell)
            {"a story ", "the truth ", "a joke ", "a secret ", "lies "},

            // Objects for "trabajar " (to work)
            {"on a project ", "overtime ", "in an office ", "with a team ", "under pressure "},

            // Objects for "llamar " (to call)
            {"a friend ", "for help ", "a taxi ", "the police ", "a meeting "},

            // Objects for "intentar " (to try)
            {"to learn something new ", "to cook ", "to fix it ", "to make amends ", "to reach out "},

            // Objects for "preguntar " (to ask)
            {"for directions ", "a question ", "for help ", "for permission ", "about a topic "},

            // necestiar
            {"a hug ", "money ", "to talk to you ", "to ask something ","love "},

            // Objects for "to feel "
            {"happiness ", "sadness ", "pain ", "nervousness ", "heat "},

            // Objects for "to become "
            {"a teacher ", "an expert ", "a member ", "a friend ", "a champion "},

            // Objects for "to leave "
            {"the house ", "the job ", "a note ", "school ", "a message "},

            // Objects for "to put/place "
            {"the table ", "clothes ", "a book ", "the alarm ", "decorations "},

            // Objects for "to mean "
            {"a word ", "a gesture ", "a look ", "a symbol ", "an agreement "},

            // Objects for "to let "
            {"the kids run ", "the past go ", "people in ", "go ", "things happen "},
            // Objects for "to keep "
            {"a secret ", "calm ", "a diary ", "faith ", "distance "},

            // Objects for "to begin/start "
            {"a book ", "a movie ", "a project ", "a course ", "a diet "},

            // Objects for "to seem "
            {"interesting ", "easy ", "difficult ", "strange ", "possible "},

            // Objects for "to talk "
            {"on the phone ", "in public ", "with friends ", "about politics ", "about love "},

            //turn
            {"to the right ", "to the left ", "the page ", "the head ", "the steering wheel "},

            // Objects for "to help "
            {"a friend ", "at home ", "with homework ", "the parents ", "others "},

            // Objects for "to start "
            {"the day ", "a conversation ", "a business ", "to run ", "to study "},

            // Objects for "to show "
            {"a document ", "the way ", "a photo ", "interest ", "the ticket "},

            // Objects for "to hear "
            {"music ", "a noise ", "the rain ", "the news ", "a voice "},

            // Objects for "to run "
            {"a marathon ", "in the park ", "fast ", "every day ", "for pleasure "},

            // Objects for "to play "
            {"soccer ", "video games ", "chess ", "cards ", "in the park "},

            // Objects for "to move "
            {"a chair ", "the house ", "the car ", "furniture ", "abroad "},

            // Objects for "to like "
            {"music ", "food ", "traveling ", "reading ", "sports "},

            // Objects for "to believe "
            {"in ghosts ", "a story ", "in yourself ", "in love ", "in science "},
            //hold
            {"a meeting ", "a record ", "an opinion ", "a ceremony ", "hands "},

            // Objects for "to live "
            {"in a city ", "with family ", "an adventure ", "a life ", "alone "},



            // Objects for "to bring "
            {"joy ", "a friend ", "a gift ", "news ", "supplies "},

            // Objects for "to write "
            {"a letter ", "a book ", "an email ", "a report ", "a story "},

            // Objects for "to provide "
            {"support ", "information ", "a service ", "help ", "evidence "},

            // Objects for "to sit "
            {"on a chair ", "on the floor ", "in a meeting ", "at the table ", "by the window "},

            // Objects for "to stand "
            {"in line ", "for a long time ", "for a cause ", "at the door ", "by someone "},

            // Objects for "to lose "
            {"weight ", "a game ", "a friend ", "time ", "money "},

            // Objects for "to meet "
            {"a friend ", "a deadline ", "a goal ", "at a place ", "someone new "},

            // pay
            {"the bill ", "attention ", "a fine ", "a visit ", "respects "},

            // Objects for "to include "
            {"all members ", "details ", "a section ", "extras ", "a warning "},

            // Objects for "to continue "
            {"the journey ", "working ", "studying ", "a conversation ", "a tradition "},

            // Objects for "to change "
            {"clothes ", "a decision ", "a tire ", "direction ", "attitude "},

            // Objects for "to set "
            {"the table ", "a record ", "an alarm ", "a date ", "standards "},

            // Objects for "to lead "
            {"a team ", "a project ", "the way ", "a discussion ", "an initiative "},

            // Objects for "to learn "
            {"a language ", "a skill ", "the truth ", "from mistakes ", "a lesson "},

            // Objects for "to understand "
            {"a concept ", "feelings ", "a joke ", "a situation ", "instructions "},

            // Objects for "to watch "
            {"a movie ", "the news ", "a game ", "a show ", "the sky "},

            // Objects for "to follow "
            {"instructions ", "a leader ", "a trend ", "a path ", "advice "},
            //stop
            {"thinking  ", "working ", "smoking ", "talking ", "worrying "},

            // Objects for "to speak "
            {"the truth ", "softly ", "publicly ", "about a problem ", "a language "},

            // Objects for "to create "
            {"art ", "a website ", "music ", "a plan ", "a story "},

            // Objects for "to allow "
            {"entry ", "freedom ", "a break ", "a mistake ", "pets "},

            // Objects for "to read "
            {"a book ", "a magazine ", "the room ", "in the couch ", "well "},



            // Objects for "to spend "
            {"money ", "time ", "energy ", "the holidays ", "effort "},

            // Objects for "to add "
            {"sugar ", "details ", "a comment ", "flavor ", "value "},

            // Objects for "to grow "
            {"plants ", "in the city ", "a lot ", "spiritually ", "during the year "},


            // Objects for "to open "
            {"a door ", "a window ", "a business ", "a book ", "an account "},

            // Objects for "to walk "
            {"the dog ", "in the park ", "to school ", "home ", "a long distance "},

            // Objects for "to offer "
            {"help ", "a job ", "a gift ", "advice ", "a discount "},
            // Objects for "to remember "
            {"a name ", "an anniversary ", "to lock the door ", "a password ", "a joke "},

            // Objects for "to win "
            {"a game ", "a prize ", "a competition ", "a scholarship ", "respect "},

            // Objects for "to appear "
            {"on TV ", "in a movie ", "at an event ", "in court ", "suddenly "},

            // Objects for "to consider "
            {"an offer ", "a proposal ", "the consequences ", "a career change ", "someone's feelings "},

            // Objects for "to love "
            {"a person ", "a pet ", "traveling ", "cooking ", "reading "},

            // Objects for "to buy "
            {"groceries ", "a car ", "a house ", "clothes ", "a gift "},

            // Objects for "to wait "
            {"for a bus ", "in line ", "for an appointment ", "for a call ", "for someone "},

            // Objects for "to die "
            {"peacefully ", "suddenly ", "in battle ", "of old age ", "from illness "},

            // Objects for "to send "
            {"an email ", "a letter ", "a package ", "a message ", "flowers "},

            // Objects for "to expect "
            {"a delivery ", "a visit ", "an outcome ", "a call ", "results "},

            // Objects for "to serve "
            {"food ", "a customer ", "the nation ", "a sentence ", "a purpose "},

            // Objects for "to stay "
            {"at a hotel ", "with friends ", "in shape ", "focused ", "calm "},

            // Objects for "to build "
            {"a house ", "a relationship ", "muscle ", "an app ", "a career "},

            // Objects for "to fall "
            {"asleep ", "in love ", "apart ", "behind ", "into a trap "},

            // Objects for "to cut "
            {"hair ", "a cake ", "expenses ", "a deal ", "the grass "},

            // Objects for "to kill "
            {"time ", "a spider ", "a character in a story ", "the engine ", "pain "},

            // Objects for "to reach "
            {"a goal ", "the top ", "an agreement ", "out to someone ", "a conclusion "},

           //remain
            {"calm ", "in a place ", "silent ", "unchanged ", "a mystery "},
            //suggest
            {"a plan ", "an idea ", "improvements ", "a meeting ", "a solution "},
            //raise
            {"funds ", "awareness ", "a child ", "the roof ", "a question "},

            // Objects for "to pass "
            {"a test ", "the ball ", "by a place ", "a law ", "down traditions "},

            // Objects for "to sell "
            {"a house ", "a car ", "products ", "tickets ", "art "},

            // Objects for "to require "
            {"approval ", "a license ", "effort ", "patience ", "a password "},

            // Objects for "to decide "
            {"on a destination ", "to leave ", "on a course of action ", "against it ", "in favor "},

            // Objects for "to report "
            {"an incident ", "to the police ", "earnings ", "a discovery ", "weather conditions "},

            // Objects for "to return "
            {"a book ", "home ", "a call ", "to normal ", "goods "},

            // Objects for "to pull "
            {"a door ", "strings ", "away ", "up ", "towards you "},

            // Objects for "to explain "
            {"a theory ", "a situation ", "a joke ", "a process ", "your reasoning "},

            // Objects for "to carry "
            {"a bag ", "responsibility ", "a child ", "goods ", "a message "},

            // Objects for "to develop "
            {"a skill ", "a film ", "a plan ", "a relationship ", "software "},

            // Objects for "to hope "
            {"for the best ", "to win ", "for recovery ", "to see the person again ", "for success "},

            // Objects for "to drive "
            {"a car ", "crazy ", "an initiative ", "home ", "growth "},

            // Objects for "to break "
            {"a record ", "the law ", "a habit ", "the silence ", "a heart "}
    };

    String[][] verbObjectsSpanish = {
            // Objetos para "tener "
            {"tiempo ", "dinero ", "comida ", "el suelo ", "amor "},

            // Objects for "hacer " (to do)
            {"un favor ", "un truco de magia ", "bien ", "todo ", "nada "},

            // Objetos para "decir "
            {"la verdad ", "una mentira ", "una historia ", "adiós ", "hola "},

            // Objetos para "ir "
            {"a la escuela ", "al trabajo ", "a casa ", "a la tienda ", "a la cama "},

            // Objetos para "obtener "
            {"resultados ", "información ", "aprobación ", "un trabajo ", "entradas "},

            // Objetos para "make "
            {"tarea ", "un plan ", "un pastel ", "un esfuerzo ", "progreso "},

            // Objetos para "saber "
            {"la respuesta ", "un secreto ", "el camino ", "la verdad ", "nada "},

            // Objetos para "pensar "
            {"en el futuro ", "en una idea ", "en la vida ", "positivamente ", "en una solución "},

            // Objetos para "ver "
            {"una película ", "a un doctor ", "el punto ", "la diferencia ", "a un amigo "},

            // Objetos para "tomar "
            {"un descanso ", "una foto ", "un asiento ", "un examen ", "medicina "},

            // Objetos para "venir "
            {"a visitar ", "a un acuerdo ", "a la fiesta ", "a una conclusión ", "a ayudar "},

            // Objetos para "querer "
            {"comer algo ", "salir temprano ", "saber la verdad ", "comprar una casa ", "viajar por el mundo "},

            // Objetos para "mirar "
            {"al cielo ", "por la ventana ", "al espejo ", "fotos ", "al reloj "},

            // Objetos para "usar "
            {"un bolígrafo ", "una computadora ", "una herramienta ", "redes sociales ", "una aplicación "},

            // Objetos para "encontrar "
            {"una solución ", "a un amigo ", "un trabajo ", "una llave ", "paz mental "},

            // Objetos para "dar "
            {"un regalo ", "consejo ", "un abrazo ", "una presentación ", "una conferencia "},

            // Objetos para "contar " (repeated, seems like a mistake, should be "contar " for "to tell ")
            {"una historia ", "la verdad ", "un chiste ", "un secreto ", "mentiras "},

            // Objetos para "trabajar "
            {"en un proyecto ", "horas extras ", "en una oficina ", "con un equipo ", "bajo presión "},

            // Objetos para "llamar "
            {"a un amigo ", "por ayuda ", "un taxi ", "a la policía ", "una reunión "},

            // Objetos para "intentar "
            {"aprender algo nuevo ", "cocinar ", "arreglarlo ", "hacer las paces ", "contactar "},

            // Objetos para "preguntar "
            {"por direcciones ", "una pregunta ", "por ayuda ", "por permiso ", "sobre un tema "},

            // objects for necesitar
            {"un abrazo ","dinero ", "hablar contigo ", "preguntar algo ","amor "},
            // Objects for "sentir " (to feel)
            {"felicidad ", "tristeza ", "dolor ", "nerviosismo ", "calor "},

            // Objects for "llegar a ser " (to become)
            {"profesor ", "experto ", "miembro ", "amigo ", "campeón "},

            // Objects for "dejar " (to leave)
            {"la casa ", "el trabajo ", "una nota ", "la escuela ", "un mensaje "},

            // Objects for "poner " (to put/place)
            {"la mesa ", "ropa ", "un libro ", "la alarma ", "decoraciones "},

            // Objects for "significar " (to mean)
            {"una palabra ", "un gesto ", "una mirada ", "un símbolo ", "un acuerdo "},

            //let
            {"a los niños correr ", "el pasado ir ", "gente entrar ", "ir ", "que las cosas sucedan "},
            // Objects for "mantener " (to keep)
            {"un secreto ", "la calma ", "un diario ", "la fe ", "la distancia "},

            // Objects for "empezar " (to begin/start)
            {"un libro ", "una película ", "un proyecto ", "un curso ", "una dieta "},

            // Objects for "parecer " (to seem)
            {"interesante ", "fácil ", "difícil ", "raro ", "posible "},

            // Objects for "hablar " (/talk)
            {"por teléfono ", "en público ", "con amigos ", "sobre política ", "de amor "},

            //turn
            {"a la derecha ", "a la izquierda ", "la página ", "la cabeza ", "el volante "},

            // Objects for "ayudar " (to help)
            {"a un amigo ", "en casa ", "con la tarea ", "a los padres ", "a los demás "},

            // Objects for "empezar " (to start)
            {"el día ", "una conversación ", "un negocio ", "a correr ", "a estudiar "},

            // Objects for "mostrar " (to show)
            {"un documento ", "el camino ", "una foto ", "interés ", "el ticket "},

            // Objects for "oír " (to hear)
            {"música ", "un ruido ", "la lluvia ", "las noticias ", "una voz "},

            // Objects for "correr " (to run)
            {"un maratón ", "en el parque ", "rápido ", "todos los días ", "por placer "},

            // Objects for "jugar " (to play)
            {"fútbol ", "videojuegos ", "al ajedrez ", "cartas ", "en el parque "},

            // Objects for "mover " (to move)
            {"una silla ", "la casa ", "el coche ", "los muebles ", "al extranjero "},

            // Objects for "gustar " (to like)
            {"la música ", "la comida ", "viajar ", "leer ", "el deporte "},

            // Objects for "creer " (to believe)
            {"en fantasmas ", "una historia ", "en ti mismo ", "en el amor ", "en la ciencia "},
            //hold
            {"una reunión ", "un récord ", "una opinión ", "una ceremonia ", "manos "},

            // Objetos para "vivir "
            {"en una ciudad ", "con la familia ", "una aventura ", "una vida ", "solo "},


            // Objetos para "traer "
            {"alegría ", "un amigo ", "un regalo ", "noticias ", "suministros "},

            // Objetos para "escribir "
            {"una carta ", "un libro ", "un correo electrónico ", "un informe ", "una historia "},

            // Objetos para "proporcionar "
            {"apoyo ", "información ", "un servicio ", "ayuda ", "evidencia "},

            // Objetos para "sentarse "
            {"en una silla ", "en el suelo ", "en una reunión ", "en la mesa ", "junto a la ventana "},

            // Objetos para "estar de pie "
            {"en la fila ", "por mucho tiempo ", "por una causa ", "en la puerta ", "al lado de alguien "},

            // Objetos para "perder "
            {"peso ", "un juego ", "un amigo ", "tiempo ", "dinero "},

            // Objetos para "encontrar "
            {"un amigo ", "un plazo ", "un objetivo ", "en un lugar ", "a alguien nuevo "},

            //pagar
            {"la cuenta ", "atención ", "una multa ", "una visita ", "respetos "},

            // Objetos para "incluir "
            {"todos los miembros ", "detalles ", "una sección ", "extras ", "una advertencia "},

            // Objetos para "continuar "
            {"el viaje ", "trabajando ", "estudiando ", "una conversación ", "una tradición "},

            // Objetos para "cambiar "
            {"ropa ", "una decisión ", "una llanta ", "dirección ", "actitud "},

            // Objetos para "establecer "
            {"la mesa ", "un récord ", "una alarma ", "una cita ", "estándares "},

            // Objetos para "liderar "
            {"un equipo ", "un proyecto ", "el camino ", "una discusión ", "una iniciativa "},

            // Objetos para "aprender "
            {"un idioma ", "una habilidad ", "la verdad ", "de los errores ", "una lección "},

            // Objetos para "entender "
            {"un concepto ", "sentimientos ", "un chiste ", "una situación ", "instrucciones "},

            // Objetos para "mirar "
            {"una película ", "las noticias ", "un partido ", "un espectáculo ", "el cielo "},

            // Objetos para "seguir "
            {"instrucciones ", "un líder ", "una tendencia ", "un camino ", "consejos "},

            //stop
             {"pensar ", "trabajar ", "fumar ", "hablar ", "preocuparse "},

    // Objects for "to speak "
    {"la verdad ", "suavemente ", "públicamente ", "sobre un problema ", "un idioma "},

    // Objects for "to create "
     {"arte ", "un sitio web ", "música ", "un plan ", "una historia "},

    // Objects for "to allow "
     {"entrada ", "libertad ", "un descanso ", "un error ", "mascotas "},

    // Objects for "to read "
    {"un libro ", "una revista ", "el ambiente ", "en el sofá", "bien "},

    // Objects for "to spend "
    {"dinero ", "tiempo ", "energía ", "las vacaciones ", "esfuerzo "},

    // Objects for "to add "
     {"azúcar ", "detalles ", "un comentario ", "sabor ", "valor "},

               // Objects for "to grow "
              {"plantas ", "en la ciudad ", "mucho ", "espiritualmente ", "durante el año "},

              // Objects for "to open "
                {"una puerta ", "una ventana ", "un negocio ", "un libro ", "una cuenta "},

                // Objects for "to walk "
                  {"el perro ", "en el parque ", "a la escuela ", "a casa ", "una larga distancia "},

               // Objects for "to offer "
              {"ayuda ", "un trabajo ", "un regalo ", "consejo ", "un descuento "},

            //rememberb
            {"un nombre ", "un aniversario ", "cerrar la puerta con llave ", "una contraseña ", "un chiste "},

            // Objetos para "ganar "
            {"un juego ", "un premio ", "una competencia ", "una beca ", "respeto "},

            // Objetos para "aparecer "
            {"en la televisión ", "en una película ", "en un evento ", "en el tribunal ", "de repente "},

            // Objetos para "considerar "
            {"una oferta ", "una propuesta ", "las consecuencias ", "un cambio de carrera ", "los sentimientos de alguien "},

            // Objetos para "amar "
            {"a una persona ", "a una mascota ", "viajar ", "cocinar ", "leer "},

            // Objetos para "comprar "
            {"comestibles ", "un coche ", "una casa ", "ropa ", "un regalo "},

            // Objetos para "esperar "
            {"un autobús ", "en la fila ", "una cita ", "una llamada ", "a alguien "},

            // Objetos para "morir "
            {"pacíficamente ", "de repente ", "en batalla ", "de vejez ", "de una enfermedad "},

            // Objetos para "enviar "
            {"un correo electrónico ", "una carta ", "un paquete ", "un mensaje ", "flores "},

            // Objetos para "esperar " (in the sense of expecting)
            {"una entrega ", "una visita ", "un resultado ", "una llamada ", "resultados "},

            // Objetos para "servir "
            {"comida ", "a un cliente ", "a la nación ", "una condena ", "un propósito "},

            // Objetos para "quedarse "
            {"en un hotel ", "con amigos ", "en forma ", "concentrado ", "tranquilo "},

            // Objetos para "construir "
            {"una casa ", "una relación ", "músculo ", "una aplicación ", "una carrera "},

            // Objetos para "caer "
            {"dormido ", "enamorado ", "a pedazos ", "atrás ", "en una trampa "},

            // Objetos para "cortar "
            {"el cabello ", "un pastel ", "gastos ", "un trato ", "el césped "},

            // Objetos para "matar "
            {"el tiempo ", "una araña ", "a un personaje en una historia ", "el motor ", "el dolor "},

            // Objetos para "alcanzar "
            {"una meta ", "la cima ", "un acuerdo ", "a alguien ", "una conclusión "},

            //remain
             {"en calma ", "en un lugar ", "silencioso ", "sin cambios ", "un misterio "},
             //suggest
             {"un plan ", "una idea ", "mejoras ", "una reunión ", "una solución "},
              //raise
             {"fondos ", "conciencia ", "un niño ", "el techo ", "una pregunta "},

             // Objetos para "pasar "
            {"una prueba ", "el balón ", "por un lugar ", "una ley ", "tradiciones "},

            // Objetos para "vender "
            {"una casa ", "un coche ", "productos ", "entradas ", "arte "},

            // Objetos para "requerir "
            {"aprobación ", "una licencia ", "esfuerzo ", "paciencia ", "una contraseña "},

            // Objetos para "decidir "
            {"sobre un destino ", "salir ", "sobre un curso de acción ", "en contra ", "a favor "},

            // Objetos para "informar "
            {"un incidente ", "a la policía ", "ganancias ", "un descubrimiento ", "condiciones meteorológicas "},

            // Objetos para "regresar "
            {"un libro ", "a casa ", "una llamada ", "a la normalidad ", "bienes "},

            // Objetos para "tirar "
            {"de una puerta ", "de cuerdas ", "hacia atrás ", "hacia arriba ", "hacia ti "},

            // Objetos para "explicar "
            {"una teoría ", "una situación ", "un chiste ", "un proceso ", "tu razonamiento "},

            // Objetos para "llevar "
            {"una bolsa ", "responsabilidad ", "un niño ", "mercancías ", "un mensaje "},

            // Objetos para "desarrollar "
            {"una habilidad ", "un filme ", "un plan ", "una relación ", "software "},

            // Objetos para "esperar "
            {"lo mejor ", "ganar ", "la recuperación ", "ver a la persona de nuevo ", "el éxito "},

            // Objetos para "conducir "
            {"un coche ", "a la locura ", "una iniciativa ", "a casa ", "crecimiento "},
            // Objects for "to break "
            {"un record ", "la ley ", "un habito ", "el silencio ", "un corazon "}
    };

    String[] verbsSpanishFirstPersonFuture = {
            "tendré ", // will have (tener)
            "haré ", // will do (hacer)
            "diré ", // will say (decir)
            "iré ", // will go (ir)
            "obtendré ", // will get (obtener)
            "haré ", // will make (hacer again, same as do)
            "sabré ", // will know (saber)
            "pensaré ", // will think (pensar)
            "veré ", // will see (ver)
            "tomaré ", // will take (tomar)
            "vendré ", // will come (venir)
            "querré ", // will want (querer)
            "miraré ", // will look (mirar)
            "usaré ", // will use (usar)
            "encontraré ", // will find (encontrar)
            "daré ", // will give (dar)
            "diré ", // will tell (decir, used for "tell " as well)
            "trabajaré ", // will work (trabajar)
            "llamaré ", // will call (llamar)
            "intentaré ", // will try (intentar)
            "preguntaré ", // will ask (preguntar)
            "necesitaré ", // will need (necesitar)
            "sentiré ", // will feel (sentir)
            "me volveré ", // will become (volverse)
            "dejaré ", // will leave (dejar)
            "pondré ", // will put (poner)
            "me referiré a ", // will mean (significar)
            "dejaré ", // will let (dejar, used for "let " as well)
            "mantendré ", // will keep (mantener)
            "empezaré ", // will begin (empezar)
            "pareceré ", // will seem (parecer)
            "hablaré ", // will talk (hablar)
            "giraré ", // will turn (girar)
            "ayudaré ", // will help (ayudar)
            "empezaré ", // will start (empezar, used for "start " as well)
            "mostraré ", // will show (mostrar)
            "oiré ", // will hear (oir)
            "correré ", // will run (correr)
            "jugaré ", // will play (jugar)
            "moveré ", // will move (mover)
            "gustaré ", // will like (gustar, though "me gustará" is more accurate)
            "creeré ", // will believe (creer)
            "sostendré ", // will hold (sostener)
            "viviré ", // will live (vivir)
            "traeré ", // will bring (traer)
            "escribiré ", // will write (escribir)
            "proporcionaré ", // will provide (proporcionar)
            "me sentaré ", // will sit (sentarse)
            "estaré de pie ", // will stand (estar de pie, though this is more about being than standing)
            "perderé ", // will lose (perder)
            "encontraré ", // will meet (encontrar, used for "meet " as well)
            "pagaré ", // will pay (pagar)
            "incluiré ", // will include (incluir)
            "continuaré ", // will continue (continuar)
            "cambiaré ", // will change (cambiar)
            "pondré ", // will set (poner, used for "set " as well)
            "lideraré ", // will lead (liderar)
            "aprenderé ", // will learn (aprender)
            "entenderé ", // will understand (entender)
            "miraré ", // will watch (mirar)
            "seguiré ", // will follow (seguir)
            "dejaré de ", // will stop (detener)
            "hablaré ", // will speak (hablar)
            "crearé ", // will create (crear)
            "permitiré ", // will allow (permitir)
            "leeré ", // will read (leer)
            "gastaré ", // will spend (gastar)
            "añadiré ", // will add (añadir)
            "creceré ", // will grow (crecer)
            "abriré ", // will open (abrir)
            "caminaré ", // will walk (caminar)
            "ofreceré ", // will offer (ofrecer)
            "recordaré ", // will remember (recordar)
            "ganaré ", // will win (ganar)
            "apareceré ", // will appear (aparecer)
            "consideraré ", // will consider (considerar)
            "amaré ", // will love (amar)
            "compraré ", // will buy (comprar)
            "esperaré ", // will wait (esperar)
            "moriré ", // will die (morir)
            "enviaré ", // will send (enviar)
            "esperaré ", // will expect (esperar)
            "serviré ", // will serve (servir)
            "quedaré ", // will stay (quedarse)
            "construiré ", // will build (construir)
            "caeré ", // will fall (caer)
            "cortaré ", // will cut (cortar)
            "mataré ", // will kill (matar)
            "alcanzaré ", // will reach (alcanzar)
            "permaneceré ", // will remain (permanecer)
            "sugeriré ", // will suggest (sugerir)
            "elevaré ", // will raise (elevar)
            "pasaré ", // will pass (pasar)
            "venderé ", // will sell (vender)
            "requeriré ", // will require (requerir)
            "decidiré ", // will decide (decidir)
            "informaré ", // will report (informar)
            "devolveré ", // will return (volver)
            "tiraré ", // will pull (tirar)
            "explicaré ", // will explain (explicar)
            "llevaré ", // will carry (llevar)
            "desarrollaré ", // will develop (desarrollar)
            "esperaré ", // will hope (esperar)
            "conduciré ", // will drive (conducir)
            "romperé " // will break (romper)

    };
    String[] verbsSpanishSecondPersonFuture = {
            "tendrás ", // you will have (tener)
            "harás ", // you will do (hacer)
            "dirás ", // you will say (decir)
            "irás ", // you will go (ir)
            "obtendrás ", // you will get (obtener)
            "harás ", // you will make (hacer again, same as do)
            "sabrás ", // you will know (saber)
            "pensarás ", // you will think (pensar)
            "verás ", // you will see (ver)
            "tomarás ", // you will take (tomar)
            "vendrás ", // you will come (venir)
            "querrás ", // you will want (querer)
            "mirarás ", // you will look (mirar)
            "usarás ", // you will use (usar)
            "encontrarás ", // you will find (encontrar)
            "darás ", // you will give (dar)
            "dirás ", // you will tell (decir, used for "tell " as well)
            "trabajarás ", // you will work (trabajar)
            "llamarás ", // you will call (llamar)
            "intentarás ", // you will try (intentar)
            "preguntarás ", // you will ask (preguntar)
            "necesitarás ", // you will need (necesitar)
            "sentirás ", // you will feel (sentir)
            "te volverás ", // you will become (volverse)
            "dejarás ", // you will leave (dejar)
            "pondrás ", // you will put (poner)
            "te referiras a ", // you will mean (significar)
            "dejarás ", // you will let (dejar, used for "let " as well)
            "mantendrás ", // you will keep (mantener)
            "empezarás ", // you will begin (empezar)
            "parecerás ", // you will seem (parecer)
            "hablarás ", // you will talk (hablar)
            "girarás ", // you will turn (girar)
            "ayudarás ", // you will help (ayudar)
            "empezarás ", // you will start (empezar, used for "start " as well)
            "mostrarás ", // you will show (mostrar)
            "oirás ", // you will hear (oir)
            "correrás ", // you will run (correr)
            "jugarás ", // you will play (jugar)
            "moverás ", // you will move (mover)
            "gustarás ", // you will like (gustar, though "te gustará" is more accurate)
            "creerás ", // you will believe (creer)
            "sostendrás ", // you will hold (sostener)
            "vivirás ", // you will live (vivir)
            "traerás ", // you will bring (traer)
            "escribirás ", // you will write (escribir)
            "proporcionarás ", // you will provide (proporcionar)
            "te sentarás ", // you will sit (sentarse)
            "estarás de pie ", // you will stand (estar de pie, though this is more about being than standing)
            "perderás ", // you will lose (perder)
            "encontrarás ", // you will meet (encontrar, used for "meet " as well)
            "pagarás ", // you will pay (pagar)
            "incluirás ", // you will include (incluir)
            "continuarás ", // you will continue (continuar)
            "cambiarás ", // you will change (cambiar)
            "pondrás ", // you will set (poner, used for "set " as well)
            "liderarás ", // you will lead (liderar)
            "aprenderás ", // you will learn (aprender)
            "entenderás ", // you will understand (entender)
            "mirarás ", // you will watch (mirar)
            "seguirás ", // you will follow (seguir)
            "dejarás de ", // you will stop (detener)
            "hablarás ", // you will speak (hablar)
            "crearás ", // you will create (crear)
            "permitirás ", // you will allow (permitir)
            "leerás ", // you will read (leer)
            "gastarás ", // you will spend (gastar)
            "añadirás ", // you will add (añadir)
            "crecerás ", // you will grow (crecer)
            "abrirás ", // you will open (abrir)
            "caminarás ", // you will walk (caminar)
            "ofrecerás ", // you will offer (ofrecer)
            "recordarás ", // you will remember (recordar)
            "ganarás ", // you will win (ganar)
            "aparecerás ", // you will appear (aparecer)
            "considerarás ", // you will consider (considerar)
            "amarás ", // you will love (amar)
            "comprarás ", // you will buy (comprar)
            "esperarás ", // you will wait (esperar)
            "morirás ", // you will die (morir)
            "enviarás ", // you will send (enviar)
            "esperarás ", // you will expect (esperar)
            "servirás ", // you will serve (servir)
            "quedarás ", // you will stay (quedarse)
            "construirás ", // you will build (construir)
            "caerás ", // you will fall (caer)
            "cortarás ", // you will cut (cortar)
            "matarás ", // you will kill (matar)
            "alcanzarás ", // you will reach (alcanzar)
            "permanecerás ", // you will remain (permanecer)
            "sugerirás ", // you will suggest (sugerir)
            "elevarás ", // you will raise (elevar)
            "pasarás ", // you will pass (pasar)
            "venderás ", // you will sell (vender)
            "requerirás ", // you will require (requerir)
            "decidirás ", // you will decide (decidir)
            "informarás ", // you will report (informar)
            "devolverás ", // you will return (volver)
            "tirarás ", // you will pull (tirar)
            "explicarás ", // you will explain (explicar)
            "llevarás ", // you will carry (llevar)
            "desarrollarás ", // you will develop (desarrollar)
            "esperarás ", // you will hope (esperar)
            "conducirás ", // you will drive (conducir)
            "romperás " // you will break (romper)
    };
    String[] verbsSpanishThirdPersonFuture = {
            "tendrá ", // he/she/it will have (tener)
            "hará ", // he/she/it will do (hacer)
            "dirá ", // he/she/it will say (decir)
            "irá ", // he/she/it will go (ir)
            "obtendrá ", // he/she/it will get (obtener)
            "hará ", // he/she/it will make (hacer again, same as do)
            "sabrá ", // he/she/it will know (saber)
            "pensará ", // he/she/it will think (pensar)
            "verá ", // he/she/it will see (ver)
            "tomará ", // he/she/it will take (tomar)
            "vendrá ", // he/she/it will come (venir)
            "querrá ", // he/she/it will want (querer)
            "mirará ", // he/she/it will look (mirar)
            "usará ", // he/she/it will use (usar)
            "encontrará ", // he/she/it will find (encontrar)
            "dará ", // he/she/it will give (dar)
            "dirá ", // he/she/it will tell (decir, used for "tell " as well)
            "trabajará ", // he/she/it will work (trabajar)
            "llamará ", // he/she/it will call (llamar)
            "intentará ", // he/she/it will try (intentar)
            "preguntará ", // he/she/it will ask (preguntar)
            "necesitará ", // he/she/it will need (necesitar)
            "sentirá ", // he/she/it will feel (sentir)
            "se volverá ", // he/she/it will become (volverse)
            "dejará ", // he/she/it will leave (dejar)
            "pondrá ", // he/she/it will put (poner)
            "se referira a ", // he/she/it will mean (significar)
            "dejará ", // he/she/it will let (dejar, used for "let " as well)
            "mantendrá ", // he/she/it will keep (mantener)
            "empezará ", // he/she/it will begin (empezar)
            "parecerá ", // he/she/it will seem (parecer)
            "hablará ", // he/she/it will talk (hablar)
            "girará ", // he/she/it will turn (girar)
            "ayudará ", // he/she/it will help (ayudar)
            "empezará ", // he/she/it will start (empezar, used for "start " as well)
            "mostrará ", // he/she/it will show (mostrar)
            "oirá ", // he/she/it will hear (oir)
            "correrá ", // he/she/it will run (correr)
            "jugará ", // he/she/it will play (jugar)
            "moverá ", // he/she/it will move (mover)
            "gustará ", // he/she/it will like (gustar, though "le gustará" is more accurate)
            "creerá ", // he/she/it will believe (creer)
            "sostendrá ", // he/she/it will hold (sostener)
            "vivirá ", // he/she/it will live (vivir)
            "traerá ", // he/she/it will bring (traer)
            "escribirá ", // he/she/it will write (escribir)
            "proporcionará ", // he/she/it will provide (proporcionar)
            "se sentará ", // he/she/it will sit (sentarse)
            "estará de pie ", // he/she/it will stand (estar de pie, though this is more about being than standing)
            "perderá ", // he/she/it will lose (perder)
            "encontrará ", // he/she/it will meet (encontrar, used for "meet " as well)
            "pagará ", // he/she/it will pay (pagar)
            "incluirá ", // he/she/it will include (incluir)
            "continuará ", // he/she/it will continue (continuar)
            "cambiará ", // he/she/it will change (cambiar)
            "pondrá ", // he/she/it will set (poner, used for "set " as well)
            "liderará ", // he/she/it will lead (liderar)
            "aprenderá ", // he/she/it will learn (aprender)
            "entenderá ", // he/she/it will understand (entender)
            "mirará ", // he/she/it will watch (mirar)
            "seguirá ", // he/she/it will follow (seguir)
            "dejará de ", // he/she/it will stop (detener)
            "hablará ", // he/she/it will speak (hablar)
            "creará ", // he/she/it will create (crear)
            "permitirá ", // he/she/it will allow (permitir)
            "leerá ", // he/she/it will read (leer)
            "gastará ", // he/she/it will spend (gastar)
            "añadirá ", // he/she/it will add (añadir)
            "crecerá ", // he/she/it will grow (crecer)
            "abrirá ", // he/she/it will open (abrir)
            "caminará ", // he/she/it will walk (caminar)
            "ofrecerá ", // he/she/it will offer (ofrecer)
            "recordará ", // he/she/it will remember (recordar)
            "ganará ", // he/she/it will win (ganar)
            "aparecerá ", // he/she/it will appear (aparecer)
            "considerará ", // he/she/it will consider (considerar)
            "amará ", // he/she/it will love (amar)
            "comprará ", // he/she/it will buy (comprar)
            "esperará ", // he/she/it will wait (esperar)
            "morirá ", // he/she/it will die (morir)
            "enviará ", // he/she/it will send (enviar)
            "esperará ", // he/she/it will expect (esperar)
            "servirá ", // he/she/it will serve (servir)
            "quedará ", // he/she/it will stay (quedarse)
            "construirá ", // he/she/it will build (construir)
            "caerá ", // he/she/it will fall (caer)
            "cortará ", // he/she/it will cut (cortar)
            "matará ", // he/she/it will kill (matar)
            "alcanzará ", // he/she/it will reach (alcanzar)
            "permanecerá ", // he/she/it will remain (permanecer)
            "sugerirá ", // he/she/it will suggest (sugerir)
            "elevará ", // he/she/it will raise (elevar)
            "pasará ", // he/she/it will pass (pasar)
            "venderá ", // he/she/it will sell (vender)
            "requerirá ", // he/she/it will require (requerir)
            "decidirá ", // he/she/it will decide (decidir)
            "informará ", // he/she/it will report (informar)
            "devolverá ", // he/she/it will return (volver)
            "tirará ", // he/she/it will pull (tirar)
            "explicará ", // he/she/it will explain (explicar)
            "llevará ", // he/she/it will carry (llevar)
            "desarrollará ", // he/she/it will develop (desarrollar)
            "esperará ", // he/she/it will hope (esperar)
            "conducirá ", // he/she/it will drive (conducir)
            "romperá " // he/she/it will break (romper)
    };
    String[] verbsSpanishThirdPersonPluralFuture = {
            "tendrán ", // they will have (tener)
            "harán ", // they will do (hacer)
            "dirán ", // they will say (decir)
            "irán ", // they will go (ir)
            "obtendrán ", // they will get (obtener)
            "harán ", // they will make (hacer again, same as do)
            "sabrán ", // they will know (saber)
            "pensarán ", // they will think (pensar)
            "verán ", // they will see (ver)
            "tomarán ", // they will take (tomar)
            "vendrán ", // they will come (venir)
            "querrán ", // they will want (querer)
            "mirarán ", // they will look (mirar)
            "usarán ", // they will use (usar)
            "encontrarán ", // they will find (encontrar)
            "darán ", // they will give (dar)
            "dirán ", // they will tell (decir, used for "tell " as well)
            "trabajarán ", // they will work (trabajar)
            "llamarán ", // they will call (llamar)
            "intentarán ", // they will try (intentar)
            "preguntarán ", // they will ask (preguntar)
            "necesitarán ", // they will need (necesitar)
            "sentirán ", // they will feel (sentir)
            "se volverán ", // they will become (volverse)
            "dejarán ", // they will leave (dejar)
            "pondrán ", // they will put (poner)
            "se referirán a ", // they will mean (significar)
            "dejarán ", // they will let (dejar, used for "let " as well)
            "mantendrán ", // they will keep (mantener)
            "empezarán ", // they will begin (empezar)
            "parecerán ", // they will seem (parecer)
            "hablarán ", // they will talk (hablar)
            "girarán ", // they will turn (girar)
            "ayudarán ", // they will help (ayudar)
            "empezarán ", // they will start (empezar, used for "start " as well)
            "mostrarán ", // they will show (mostrar)
            "oirán ", // they will hear (oir)
            "correrán ", // they will run (correr)
            "jugarán ", // they will play (jugar)
            "moverán ", // they will move (mover)
            "gustarán ", // they will like (gustar, though "les gustará" is more accurate)
            "creerán ", // they will believe (creer)
            "sostendrán ", // they will hold (sostener)
            "vivirán ", // they will live (vivir)
            "traerán ", // they will bring (traer)
            "escribirán ", // they will write (escribir)
            "proporcionarán ", // they will provide (proporcionar)
            "se sentarán ", // they will sit (sentarse)
            "estarán de pie ", // they will stand (estar de pie, though this is more about being than standing)
            "perderán ", // they will lose (perder)
            "encontrarán ", // they will meet (encontrar, used for "meet " as well)
            "pagarán ", // they will pay (pagar)
            "incluirán ", // they will include (incluir)
            "continuarán ", // they will continue (continuar)
            "cambiarán ", // they will change (cambiar)
            "pondrán ", // they will set (poner, used for "set " as well)
            "liderarán ", // they will lead (liderar)
            "aprenderán ", // they will learn (aprender)
            "entenderán ", // they will understand (entender)
            "mirarán ", // they will watch (mirar)
            "seguirán ", // they will follow (seguir)
            "dejarán de ", // they will stop (detener)
            "hablarán ", // they will speak (hablar)
            "crearán ", // they will create (crear)
            "permitirán ", // they will allow (permitir)
            "leerán ", // they will read (leer)
            "gastarán ", // they will spend (gastar)
            "añadirán ", // they will add (añadir)
            "crecerán ", // they will grow (crecer)
            "abrirán ", // they will open (abrir)
            "caminarán ", // they will walk (caminar)
            "ofrecerán ", // they will offer (ofrecer)
            "recordarán ", // they will remember (recordar)
            "ganarán ", // they will win (ganar)
            "aparecerán ", // they will appear (aparecer)
            "considerarán ", // they will consider (considerar)
            "amarán ", // they will love (amar)
            "comprarán ", // they will buy (comprar)
            "esperarán ", // they will wait (esperar)
            "morirán ", // they will die (morir)
            "enviarán ", // they will send (enviar)
            "esperarán ", // they will expect (esperar)
            "servirán ", // they will serve (servir)
            "quedarán ", // they will stay (quedarse)
            "construirán ", // they will build (construir)
            "caerán ", // they will fall (caer)
            "cortarán ", // they will cut (cortar)
            "matarán ", // they will kill (matar)
            "alcanzarán ", // they will reach (alcanzar)
            "permanecerán ", // they will remain (permanecer)
            "sugerirán ", // they will suggest (sugerir)
            "elevarán ", // they will raise (elevar)
            "pasarán ", // they will pass (pasar)
            "venderán ", // they will sell (vender)
            "requerirán ", // they will require (requerir)
            "decidirán ", // they will decide (decidir)
            "informarán ", // they will report (informar)
            "devolverán ", // they will return (volver)
            "tirarán ", // they will pull (tirar)
            "explicarán ", // they will explain (explicar)
            "llevarán ", // they will carry (llevar)
            "desarrollarán ", // they will develop (desarrollar)
            "esperarán ", // they will hope (esperar)
            "conducirán ", // they will drive (conducir)
            "romperán " // they will break (romper)
    };
    String[] verbsSpanishFirstPersonPluralFuture = {
            "tendremos ", // we will have (tener)
            "haremos ", // we will do (hacer)
            "diremos ", // we will say (decir)
            "iremos ", // we will go (ir)
            "obtendremos ", // we will get (obtener)
            "haremos ", // we will make (hacer again, same as do)
            "sabremos ", // we will know (saber)
            "pensaremos ", // we will think (pensar)
            "veremos ", // we will see (ver)
            "tomaremos ", // we will take (tomar)
            "vendremos ", // we will come (venir)
            "querremos ", // we will want (querer)
            "miraremos ", // we will look (mirar)
            "usaremos ", // we will use (usar)
            "encontraremos ", // we will find (encontrar)
            "daremos ", // we will give (dar)
            "diremos ", // we will tell (decir, used for "tell " as well)
            "trabajaremos ", // we will work (trabajar)
            "llamaremos ", // we will call (llamar)
            "intentaremos ", // we will try (intentar)
            "preguntaremos ", // we will ask (preguntar)
            "necesitaremos ", // we will need (necesitar)
            "sentiremos ", // we will feel (sentir)
            "nos volveremos ", // we will become (volverse)
            "dejaremos ", // we will leave (dejar)
            "pondremos ", // we will put (poner)
            "nos referiremos a ", // we will mean (significar)
            "dejaremos ", // we will let (dejar, used for "let " as well)
            "mantendremos ", // we will keep (mantener)
            "empezaremos ", // we will begin (empezar)
            "pareceremos ", // we will seem (parecer)
            "hablaremos ", // we will talk (hablar)
            "giraremos ", // we will turn (girar)
            "ayudaremos ", // we will help (ayudar)
            "empezaremos ", // we will start (empezar, used for "start " as well)
            "mostraremos ", // we will show (mostrar)
            "oiremos ", // we will hear (oir)
            "correremos ", // we will run (correr)
            "jugaremos ", // we will play (jugar)
            "moveremos ", // we will move (mover)
            "gustaremos ", // we will like (gustar, though "nos gustará" is more accurate)
            "creeremos ", // we will believe (creer)
            "sostendremos ", // we will hold (sostener)
            "viviremos ", // we will live (vivir)
            "traeremos ", // we will bring (traer)
            "escribiremos ", // we will write (escribir)
            "proporcionaremos ", // we will provide (proporcionar)
            "nos sentaremos ", // we will sit (sentarse)
            "estaremos de pie ", // we will stand (estar de pie, though this is more about being than standing)
            "perderemos ", // we will lose (perder)
            "nos encontraremos ", // we will meet (encontrar, used for "meet " as well)
            "pagaremos ", // we will pay (pagar)
            "incluiremos ", // we will include (incluir)
            "continuaremos ", // we will continue (continuar)
            "cambiaremos ", // we will change (cambiar)
            "pondremos ", // we will set (poner, used for "set " as well)
            "lideraremos ", // we will lead (liderar)
            "aprenderemos ", // we will learn (aprender)
            "entenderemos ", // we will understand (entender)
            "miraremos ", // we will watch (mirar)
            "seguiremos ", // we will follow (seguir)
            "dejaremos de ", // we will stop (detener)
            "hablaremos ", // we will speak (hablar)
            "crearemos ", // we will create (crear)
            "permitiremos ", // we will allow (permitir)
            "leeremos ", // we will read (leer)
            "gastaremos ", // we will spend (gastar)
            "añadiremos ", // we will add (añadir)
            "creceremos ", // we will grow (crecer)
            "abriremos ", // we will open (abrir)
            "caminaremos ", // we will walk (caminar)
            "ofreceremos ", // we will offer (ofrecer)
            "recordaremos ", // we will remember (recordar)
            "ganaremos ", // we will win (ganar)
            "apareceremos ", // we will appear (aparecer)
            "consideraremos ", // we will consider (considerar)
            "amaremos ", // we will love (amar)
            "compraremos ", // we will buy (comprar)
            "esperaremos ", // we will wait (esperar)
            "moriremos ", // we will die (morir)
            "enviaremos ", // we will send (enviar)
            "esperaremos ", // we will expect (esperar)
            "serviremos ", // we will serve (servir)
            "quedaremos ", // we will stay (quedarse)
            "construiremos ", // we will build (construir)
            "caeremos ", // we will fall (caer)
            "cortaremos ", // we will cut (cortar)
            "mataremos ", // we will kill (matar)
            "alcanzaremos ", // we will reach (alcanzar)
            "permaneceremos ", // we will remain (permanecer)
            "sugeriremos ", // we will suggest (sugerir)
            "elevaremos ", // we will raise (elevar)
            "pasaremos ", // we will pass (pasar)
            "venderemos ", // we will sell (vender)
            "requeriremos ", // we will require (requerir)
            "decidiremos ", // we will decide (decidir)
            "informaremos ", // we will report (informar)
            "devolveremos ", // we will return (volver)
            "tiraremos ", // we will pull (tirar)
            "explicaremos ", // we will explain (explicar)
            "llevararemos ", // we will carry (llevar)
            "desarrollaremos ", // we will develop (desarrollar)
            "esperaremos ", // we will hope (esperar)
            "conduciremos ", // we will drive (conducir)
            "romperemos " // we will break (romper)
    };

      String[] subjectsEnglish = {"I ", "You ", "He ", "She ", "We ", "They "};
      String[] subjectsSpanish = {"Yo ", "Tú ", "Él ", "Ella ", "Nosotros " , "Ellos "};
    String[] preposiciones = {"hacia arriba ", "hacia afuera ", "hacia abajo ", "hacia adentro ", "hacia adelante ", "hacia atrás ", "hacia la derecha ","hacia la casa "};
    String[] prepositions = {"up ", "out ", "down ", "in ", "on ", "back ", "right ","home "};
    String[] verbsWithPrepositions = {
            "look ", // Common with up, out, back
            "jump ", // Common with up
            "hold ", // Common with up, on
            "go ", // Common with out, down, in, back
            "come ", // Common with out, down, in, back
            "walk ", // Common with out
            "run ", // Common with out
            "knock ", // Common with down
            "write ", // Common with down
            "bring ", // Common with in
            "move ", // Common with in
            "turn ", // Common with in, right
            "pull ", // Common with on
            "fall ", // Common with back
            "step ", // Common with back

    };
    String[] verbsWithPrepositionsThirdPerson = {
            "looks ", // Common with up, out, back
            "jumps ", // Common with up
            "holds ", // Common with up, on
            "goes ", // Common with out, down, in, back
            "comes ", // Common with out, down, in, back
            "walks ", // Common with out
            "runs ", // Common with out
            "knocks ", // Common with down
            "writes ", // Common with down
            "brings ", // Common with in
            "moves ", // Common with in
            "turns ", // Common with in, right
            "pulls ", // Common with on
            "falls ", // Common with back
            "steps ", // Common with back
    };
    String[] verbsWithPrepositionsFirstPersonSingular = {
            "miro ", // Common with up, out, back
            "salto ", // Common with up
            "sostengo ", // Common with up, on
            "voy ", // Common with out, down, in, back
            "vengo ", // Common with out, down, in, back
            "camino ", // Common with out
            "corro ", // Common with out
            "golpeo ", // Common with down
            "escribo ", // Common with down
            "traigo ", // Common with in
            "muevo ", // Common with in
            "giro ", // Common with in, right
            "tiro ", // Common with on
            "caigo ", // Common with back
            "doy un paso ", // Common with back
    };
    String[] verbsWithPrepositionsSecondPersonSingular = {
            "miras ", // Common with up, out, back
            "saltas ", // Common with up
            "sostienes ", // Common with up, on
            "vas ", // Common with out, down, in, back
            "vienes ", // Common with out, down, in, back
            "caminas ", // Common with out
            "corres ", // Common with out
            "golpeas ", // Common with down
            "escribes ", // Common with down
            "traes ", // Common with in
            "mueves ", // Common with in
            "giras ", // Common with in, right
            "tiras ", // Common with on
            "caes ", // Common with back
            "das un paso ", // Common with back
    };
    String[] verbsWithPrepositionsThirdPersonSingular = {
            "mira ", // Common with up, out, back
            "salta ", // Common with up
            "sostiene ", // Common with up, on
            "va ", // Common with out, down, in, back
            "viene ", // Common with out, down, in, back
            "camina ", // Common with out
            "corre ", // Common with out
            "golpea ", // Common with down
            "escribe ", // Common with down
            "trae ", // Common with in
            "mueve ", // Common with in
            "gira ", // Common with in, right
            "tira ", // Common with on
            "cae ", // Common with back
            "da un paso ", // Common with back
    };
    String[] verbsWithPrepositionsThirdPersonPlural = {
            "miran ", // Common with up, out, back
            "saltan ", // Common with up
            "sostienen ", // Common with up, on
            "van ", // Common with out, down, in, back
            "vienen ", // Common with out, down, in, back
            "caminan ", // Common with out
            "corren ", // Common with out
            "golpean ", // Common with down
            "escriben ", // Common with down
            "traen ", // Common with in
            "mueven ", // Common with in
            "giran ", // Common with in, right
            "tiran ", // Common with on
            "caen ", // Common with back
            "dan un paso ", // Common with back
    };
    String[] verbsWithPrepositionsFirstPersonPlural = {
            "miramos ", // Common with up, out, back
            "saltamos ", // Common with up
            "sostenemos ", // Common with up, on
            "vamos ", // Common with out, down, in, back
            "venimos ", // Common with out, down, in, back
            "caminamos ", // Common with out
            "corremos ", // Common with out
            "golpeamos ", // Common with down
            "escribimos ", // Common with down
            "traemos ", // Common with in
            "movemos ", // Common with in
            "giramos ", // Common with in, right
            "tiramos ", // Common with on
            "caemos ", // Common with back
            "damos un paso ", // Common with back
    };
    String[] verbsAbout = {
            "run ",
            "walk ",
            "wander ",
            "roam ",
            "move ",
            "look ",
            "search ",
            "scatter ",
            "rummage ",
            "mill ",
            "stroll ",
            "rush "
    };
    String[] verbsThirdPersonAbout = {
            "runs ",
            "walks ",
            "wanders ",
            "roams ",
            "moves ",
            "looks ",
            "searches ",
            "scatters ",
            "rummages ",
            "mills ",
            "strolls ",
            "rushes "
    };
    // 1. First Person Singular (yo)
    String[] firstPersonSingularAbout = {
            "corro ", // run
            "camino ", // walk
            "vago ", // wander
            "deambulo ", // roam
            "me muevo ", // move
            "busco ", // look
            "busco ", // search
            "esparzo ", // scatter
            "rebusco ", // rummage
            "me muevo sin rumbo ", // mill (not a direct translation, as "milling about " is more idiomatic)
            "paseo ", // stroll
            "me apresuro " // rush
    };

    // 2. First Person Plural (nosotros/nosotras)
    String[] firstPersonPluralAbout = {
            "corremos ",
            "caminamos ",
            "vagamos ",
            "deambulamos ",
            "nos movemos ",
            "buscamos ",
            "buscamos ",
            "esparcimos ",
            "rebuscamos ",
            "nos movemos sin rumbo ",
            "paseamos ",
            "nos apresuramos "
    };

    // 3. Third Person Singular (él/ella/usted)
    String[] thirdPersonSingularAbout = {
            "corre ",
            "camina ",
            "vaga ",
            "deambula ",
            "se mueve ",
            "busca ",
            "busca ",
            "esparce ",
            "rebusca ",
            "se mueve sin rumbo ",
            "pasea ",
            "se apresura "
    };

    // 4. Third Person Plural (ellos/ellas/ustedes)
    String[] thirdPersonPluralAbout = {
            "corren ",
            "caminan ",
            "vagan ",
            "deambulan ",
            "se mueven ",
            "buscan ",
            "buscan ",
            "esparcen ",
            "rebuscan ",
            "se mueven sin rumbo ",
            "pasean ",
            "se apresuran "
    };

    // 5. Second Person Singular (tú)
    String[] secondPersonSingularAbout = {
            "corres ",
            "caminas ",
            "vagas ",
            "deambulas ",
            "te mueves ",
            "buscas ",
            "buscas ",
            "esparces ",
            "rebuscas ",
            "te mueves sin rumbo ",
            "paseas ",
            "te apresuras "
    };


    public void prepAdv(){

    }
    String[] adverbsLastPos = {"now ", "more ", "also ", "here ",
            "well ", "there ", "again ", "today ", "far ",
            "often ", "later ", "much ", "once ", "together ",
            "around ", "enough ", "little ", "sometimes ", "less "};
    String[] adverbsMidPos = {"just ", "now ", "then ", "only ",
            "even ", "still ", "too ", "never ", "really ", "always ",
            "maybe ", "probably ", "actually ", "perhaps ", "finally "};
    String[] adverbsMidPosSp = {"justo ", "ahora ", "entonces ", "sólo ", "incluso ", "aún ", "también ",
            "nunca ", "realmente ", "siempre ", "quizás ", "probablemente ", "de hecho ", "tal vez ", "finalmente "};

    String[] adverbsInitialPos = {"how ", "when ", "why ",
            "where ", "however ","as ", };


    String[] questionWordsWithElse = {"What else ", "Who else ", "Where else ", "When else ", "Why else ", "How else "};
    String[] questionWordsWithElseSpanish = {"¿Qué más?", "¿Quién más?", "¿Dónde más?", "¿Cuándo más?", "¿Por qué más?", "¿Cómo más?"};
    String[] phrasesBeforeAgo = {
            "a few seconds ",
            "several minutes ",
            "a couple of hours ",
            "a few days ",
            "several weeks ",
            "a couple of months ",
            "a few years ",
            "many decades ",
            "several centuries ",
            "over a millennium ",
            "a decade ",
            "half a century ",
            "one year ",
            "two decades ",
            "three hours ",
            "four weeks ",
            "five minutes ",
            "six months "
    };

    String[] phrasesBeforeAgoSpanish = {
            "unos segundos ",
            "varios minutos ",
            "un par de horas ",
            "unos días ",
            "varias semanas ",
            "un par de meses ",
            "unos años ",
            "muchas décadas ",
            "varios siglos ",
            "más de un milenio ",
            "una década ",
            "medio siglo ",
            "un año ",
            "dos décadas ",
            "tres horas ",
            "cuatro semanas ",
            "cinco minutos ",
            "seis meses "
    };
    public void GenAgo(){
        int el = (int)(Math.random()*phrasesBeforeAgo.length);
        gens= "hace "+ phrasesBeforeAgoSpanish[el];
        gene= phrasesBeforeAgo[el] + "ago ";
    }
    public void GenElse(){
        int el = (int)(Math.random()*questionWordsWithElse.length);
        gens= questionWordsWithElseSpanish[el];
        gene= questionWordsWithElse[el];
    }
    String[] verbsWithLong = {"wait ", "stay ", "last ", "take ", "work ", "live ", "survive ", "endure ", "continue "};

    String[] verbsWithLongThirdPerson = {"waits ", "stays ", "lasts ", "takes ", "works ", "lives ", "survives ", "endures ", "continues "};
    String[] firstPersonSingular = {"espero ", "me quedo ", "duro ", "tomo ", "trabajo ", "vivo ", "sobrevivo ", "soporto ", "continúo "};
    String[] firstPersonPlural = {"esperamos ", "nos quedamos ", "duramos ", "tomamos ", "trabajamos ", "vivimos ", "sobrevivimos ", "soportamos ", "continuamos "};
    String[] secondPersonSingular = {"esperas ", "te quedas ", "duras ", "tomas ", "trabajas ", "vives ", "sobrevives ", "soportas ", "continúas "};
    String[] thirdPersonSingular = {"espera ", "se queda ", "dura ", "toma ", "trabaja ", "vive ", "sobrevive ", "soporta ", "continúa "};
    String[] thirdPersonPlural = {"esperan ", "se quedan ", "duran ", "toman ", "trabajan ", "viven ", "sobreviven ", "soportan ", "continúan "};
    String[] verbsWithOverThirdPerson = {
            "flies over ",
            "jumps over ",
            "hovers over ",
            "passes over ",
            "glides over ",
            "looks over ",
            "climbs over ",
            "bends over ",
            "reaches over "
    };
    String[] verbsWithOver = {
            "fly over ",
            "jump over ",
            "hover over ",
            "pass over ",
            "glide over ",
            "look over ",
            "climb over ",
            "bend over ",
            "reach over "
    };
    String[] firstPersonSingularSpanish = {
            "vuelo sobre ", // I fly over
            "salto sobre ", // I jump over
            "floto sobre ", // I hover over
            "paso sobre ", // I pass over
            "planeo sobre ", // I glide over
            "miro sobre ", // I look over
            "escalo ", // I climb over
            "me inclino sobre ", // I bend over
            "alcanzo sobre " // I reach over
    };
    String[] firstPersonPluralSpanish = {
            "volamos sobre ", // We fly over
            "saltamos sobre ", // We jump over
            "flotamos sobre ", // We hover over
            "pasamos sobre ", // We pass over
            "planeamos sobre ", // We glide over
            "miramos sobre ", // We look over
            "escalamos ", // We climb over
            "nos inclinamos sobre ", // We bend over
            "alcanzamos sobre " // We reach over
    };
    String[] thirdPersonSingularSpanish = {
            "vuela sobre ", // He/She flies over
            "salta sobre ", // He/She jumps over
            "flota sobre ", // He/She hovers over
            "pasa sobre ", // He/She passes over
            "planea sobre ", // He/She glides over
            "mira sobre ", // He/She looks over
            "escala ", // He/She climbs over
            "se inclina sobre ", // He/She bends over
            "alcanza sobre " // He/She reaches over
    };
    String[] thirdPersonPluralSpanish = {
            "vuelan sobre ", // They fly over
            "saltan sobre ", // They jump over
            "flotan sobre ", // They hover over
            "pasan sobre ", // They pass over
            "planean sobre ", // They glide over
            "miran sobre ", // They look over
            "escalan ", // They climb over
            "se inclinan sobre ", // They bend over
            "alcanzan sobre " // They reach over
    };

    String[] secondPersonSingularSpanish = {
            "vuelas sobre ", // You fly over
            "saltas sobre ", // You jump over
            "flotas sobre ", // You hover over
            "pasas sobre ", // You pass over
            "planeas sobre ", // You glide over
            "miras sobre ", // You look over
            "escalas ", // You climb over
            "te inclinas sobre ", // You bend over
            "alcanzas sobre " // You reach over
    };
    String[] objectsBeforeHappen = {
            "the event ",
            "the consequence ",
            "the incident ",
            "the accident ",
            "the situation ",
            "the phenomenon ",
            "the occurrence ",
            "the disaster ",
            "the change ",
            "the development ",
            "the outcome ",
            "the anomaly ",
            "the emergency ",
            "the crisis ",
            "the adventure ",
            "the action ",
            "the result ",
            "the episode ",
            "the scenario ",
            "the instance "
    };
    String[] phrasesAfterHappen = {
            "every day ",
            "almost never ",
            "in the morning ",
            "at night ",
            "once in a while ",
            "every now and then ",
            "during the storm ",
            "when it rains ",
            "without warning ",
            "all of a sudden ",
            "from time to time ",
            "at the worst possible moment ",
            "right before our eyes ",
            "out of the blue ",
            "in the blink of an eye ",
            "under certain conditions ",
            "when you least expect it ",
            "on a daily basis ",
            "in an instant ",
            "at any moment "
    };
    String[] phrarsesHappen = {
            "todos los días ",
            "casi nunca ",
            "por la mañana ",
            "por la noche ",
            "de vez en cuando ",
            "de tanto en tanto ",
            "durante la tormenta ",
            "cuando llueve ",
            "sin previo aviso ",
            "de repente ",
            "de vez en cuando ",
            "en el peor momento posible ",
            "justo delante de nuestros ojos ",
            "de la nada ",
            "en un abrir y cerrar de ojos ",
            "bajo ciertas condiciones ",
            "cuando menos lo esperas ",
            "a diario ",
            "en un instante ",
            "en cualquier momento "
    };
    String[] objetosHappen = {
            "el evento ",
            "la consecuencia ",
            "el incidente ",
            "el accidente ",
            "la situación ",
            "el fenómeno ",
            "el suceso ",
            "el desastre ",
            "el cambio ",
            "el desarrollo ",
            "el resultado ",
            "la anomalía ",
            "la emergencia ",
            "la crisis ",
            "la aventura ",
            "la acción ",
            "el resultado ",
            "el episodio ",
            "el escenario ",
            "el caso "
    };
    String[] thereBeVariations = {
            "there is ",
            "there are ",
            "there was ",
            "there were ",
            "there will be ",
            "there would be ",
            "there could be ",
            "there should be ",
            "there might be ",
            "there has been ",
            "there have been ",
            "there had been ",
            "there will have been ",
            "there would have been ",
            "there could have been ",
            "there should have been ",
            "there might have been ",
            "there is going to be ",
            "there was going to be "
    };
    String[] thereBeVariationsEnglishSpanish = {
            "there is - hay ",
            "Pthere are - hay ",
            "there was - había ",
            "Pthere were - habían ",
            "there will be - habrá",
            "Pthere will be - habrán ",
            "there would be - habría ",
            "there could be - podría haber ",
            "there should be - debería haber ",
            "there might be - quiza haya ",
            "there has been - ha habido ",
            "Pthere have been - han habido ",
            "there had been - había habido ",
            "there will have been - habrá habido ",
            "there would have been - habría habido ",
            "there could have been - pudo haber habido ",
            "there should have been - debió haber habido ",
            "there might have been - quiza haya habido ",
            "there is going to be - va a haber ",
            "Pthere are going to be - van a haber ",
            "there was going to be - iba a haber ",
            "Pthere were going to be - iban a haber "
    };
    String[] verbsWithOff = {
            "take off ",
            "pull off ",
            "kick off ",
            "blast off ",
            "brush off ",
            "call off ",
            "cool off ",
            "cut off ",
            "doze off ",
            "drop off ",
            "finish off ",
            "get off ",
            "give off ",
            "go off ",
            "hold off ",
            "jump off ",
            "knock off ",
            "lay off ",
            "log off ",
            "pay off ",
            "peel off ",
            "put off ",
            "rip off ",
            "rub off ",
            "run off ",
            "send off ",
            "set off ",
            "shake off ",
            "show off ",
            "sleep off ",
            "switch off ",
            "take off ",
            "tear off ",
            "tell off ",
            "think off ",
            "throw off ",
            "turn off ",
            "warn off ",
            "wash off ",
            "wipe off ",
            "work off ",
            "write off "
    };
    String[] verbsWithOffSpanish = {
            "despegar ", // take off
            "lograr ", // pull off
            "iniciar ", // kick off
            "despegar ", // blast off
            "desprender ", // brush off
            "cancelar ", // call off
            "enfriarse ", // cool off
            "cortar ", // cut off
            "dormirse ", // doze off
            "dejar ", // drop off
            "terminar ", // finish off
            "bajar ", // get off
            "emitir ", // give off
            "explotar ", // go off
            "aplazar ", // hold off
            "saltar ", // jump off
            "terminar ", // knock off
            "despedir ", // lay off
            "cerrar sesión ", // log off
            "pagar ", // pay off
            "pelar ", // peel off
            "posponer ", // put off
            "estafar ", // rip off
            "frotar ", // rub off
            "huir ", // run off
            "despedir ", // send off
            "provocar ", // set off
            "sacudirse ", // shake off
            "presumir ", // show off
            "recuperarse ", // sleep off
            "apagar ", // switch off
            "despegar ", // take off again, but could use "arrancar " for variety
            "arrancar ", // tear off
            "reprender ", // tell off
            "idear ", // think off (no direct translation, "idear " is "to devise ")
            "liberarse ", // throw off
            "apagar ", // turn off
            "advertir ", // warn off
            "lavar ", // wash off
            "limpiar ", // wipe off
            "compensar ", // work off
            "cancelar ", // write off
    };
    String[] phrasalVerbs = {
            "Uact up ",
            "add up ",//trans
            "Uadd up ",//intrans
            "Uback down ",
            "Ubear with ",
            "blow up ",
            "break down ",//trans
            "Ubreak down ",//intrans
            "bring up ",
            "call off ",
            "Ucalm down ",//trans
            "calm down ",//intrans
            "Ucarry on ",
            "Ucatch up to ",
            "check out ",
            "Ucome across ",
            "Ucome back ",
            "Ucut back on ",
            "Udeal with ",
            "drop off ",
            "Ueat out ",
            "Ufall apart ",
            "Ufill in ",
            "find out ",//trans
            "Ufind out ",//intrans
            "Uget along ",
            "give back ",//trans
            "Ugive back ",//intrans
            "Ugo ahead ",
            "Uhang out ",
            "Uhold on ",
            "keep off ",
            "kick off ",
            "lay off ",
            "Ulook into ",
            "make up ",
            "Umove on ",
            "pay back ",
            "pick up ",
            "put away ",
            "Urun out ",
            "set up ",
            "show off ",
            "Ustand out ",
            "Utake off ",
            "Utalk over ",
            "think over ",
            "throw away ",
            "try on ",
            "turn down ",
            "use up ",
            "Uwake up ",
            "Uwalk out ",
            "Uwork out ",
            "write down "
    };
    String[] phrasalVerbsThirdPerson = {
            "Uacts up ",
            "adds up ",//
            "Uadds up ",//

            "Ubacks down ",
            "Ubears with ",
            "blows up ",

            "breaks down ",//trns
            "Ubreaks down ",//intr

            "brings up ",
            "calls off ",

            "Ucalms down ",//int
            "calms down ",//trn
            "Ucarries on ",
            "Ucatches up to ",
            "checks out ",
            "Ucomes across ",
            "Ucomes back ",
            "Ucuts back on ",
            "Udeals with ",
            "drops off ",
            "Ueats out ",
            "Ufalls apart ",
            "Ufills in ",
            "finds out ",//trns
            "Ufinds out ",//intrs
            "Ugets along ",
            "gives back ",//trns
            "Ugives back ",//intrs
            "Ugoes ahead ",
            "Uhangs out ",
            "Uholds on ",
            "keeps off ",
            "kicks off ",
            "lays off ",
            "Ulooks into ",
            "makes up ",
            "moves on ",
            "pays back ",
            "picks up ",
            "puts away ",
            "Uruns out ",
            "sets up ",
            "shows off ",
            "Ustands out ",
            "Utakes off ",
            "Utalks over ",
            "thinks over ",
            "throws away ",
            "tries on ",
            "turns down ",
            "uses up ",
            "wakes up ",
            "Uwalks out ",
            "Uworks out ",
            "writes down "
    };

    String[] phrasalVerbsSpanish = {
            "portarse mal ",
            "sumar ",
            "ceder ",
            "aguantar con ",
            "explotar ",
            "descomponerse ",
            "mencionar ",
            "cancelar ",
            "calmarse ",
            "continuar ",
            "ponerse al día con ",
            "revisar ",
            "encontrarse con ",
            "volver ",
            "reducir ",
            "lidiar con ",
            "dejar en un lugar ",
            "comer fuera ",
            "desmoronarse ",
            "rellenar ",
            "descubrir ",
            "llevarse bien ",
            "devolver ",
            "proceder ",
            "pasar el rato ",
            "esperar ",
            "mantenerse alejado ",
            "iniciar ",
            "despedir ",
            "investigar ",
            "inventar ",
            "seguir adelante ",
            "devolver dinero ",
            "recoger ",
            "guardar ",
            "agotarse ",
            "establecer ",
            "presumir ",
            "destacar ",
            "despegar ",
            "discutir ",
            "considerar ",
            "tirar ",
            "probarse ",
            "rechazar ",
            "consumir todo ",
            "despertarse ",
            "caminar fuera ",
            "ejercitarse ",
            "anotar "
    };
    String[][] phrasalVerbSpanishObjects = {
            {"portarse mal, interrumpir ", "portarse mal, interrumpir ",  "volver a fallar ", "surgir de repente "}, // act up
            {"cuadran ", "suman ", "suman rápidamente ", "se acumulan "}, // add up
            {"retractarse, echarse para atrás ", "ceder, retractarse ", "ceder, bajar sus exigencias ", "rendirse ante la competencia "}, // back down
            {"ten paciencia conmigo por un momento ", "ten paciencia con este retraso ", "disculpe las molestias ", "ten paciencia conmigo "}, // bear with
            {"inflar ", "explotar, volar ", "estallar, empeorar ", "fracasar "}, // blow up
            {"venirse abajo emocionalmente ", "averiarse ", "romper a llorar ", "averiarse "}, // break down
            {"sacar un tema delicado ", "mencionar recuerdos de la infancia ", "sacar a colación la propuesta ", "mencionar el asunto "}, // bring up
            {"cancelar ", "cancelar ", "cancelar ", "cancelar "}, // call off
            {"cálmate / tranquilizate antes de continuar ", "cálmate / tranquilizate después de las noticias ", "cálmate / tranquilizate y piensa con claridad ", "calma / tranquiliza a tu hijo "}, // calm down
            {"continúa con tu trabajo ", "continúa con el plan ", "sigue adelante a pesar de las dificultades ", "continúa la tradición "}, // carry on
            {"ponerse al día con viejos amigos ", "ponerse al día con las noticias ", "ponerse al día con el trabajo ", "ponerse al día con la serie "} // catch up
    };
    String[][] phrasalVerbObjects = {
            {"in class ", "during the meeting ", "again ", "unexpectedly "}, // act up
            {"the numbers ",  "the expenses "}, // add up trans
            { "to a total ", "quickly "}, // add up intrans

            {"from a challenge ", "in an argument ", "from their demands ", "from the competition "}, // back down
            {"me for a moment ", "this delay ", "the inconvenience ", "me "}, // bear with
            {"the balloon ", "the building ", "the argument ", "the project "}, // blow up


            {"the report ","the information ", "the situation "}, // break down trans
            {"emotionally ", "in the middle of the wake ",
                    "with my friends "}, // break down intrans


            {"a sensitive topic ", "childhood memories ",
                    "the proposal ", "the issue "}, // bring up
            {"the meeting ", "the wedding ", "the event ", "the deal "}, // call off

            {"before we continue ",
                    "after the news ", "to think clearly "}, // calm down intrans
            {"him ", "her ", "them ",
                    "your friend ","your child "}, // calm down trans

            {"with your work ", "with the plan ", "despite the difficulties ", "the tradition "}, // carry on
            // catch up
            {"with old friends ", "on the news ", "with work ", "with the series "},

// check out
            {"the new cafe ", "this book from the library ", "the latest movie ", "the view from here "},

// come across
            {"an old photo ", "a rare species ", "a great deal ", "a fascinating story "},

// come back
            {"from vacation ", "to win ", "to visit ", "with a vengeance "},

// cut back
            {"on spending ", "on sweets ", "on screen time ", "on water usage "},

// deal with
            {"the problem directly ", "customer complaints ", "stress ", "the consequences "},

// drop off
            {"the kids at school ", "a package ", "a friend at the airport ", "energy levels "},

// eat out
            {"at a fancy restaurant ", "with friends ", "tonight ", "once a week "},

// fall apart
            {"the plan ", "the cake ", "the relationship ", "under pressure "},

// fill in
            {"a form ", "for someone ", "the blanks ", "a gap in knowledge "},
// find out trans
            {"the truth ", "the secret ", "the results "},
            //find out intrans
            { "about the secret ", "in the morning ", "what happened "},

// get along
            {"with coworkers ", "with the neighbors ", "well with others ", "with family members "},

// give back
            { "the borrowed book ", "the money ", },
            // give back intrans
            {"to the community ",  "to those in need "},

// go ahead
            {"with the plan ", "and start without me ", "with the presentation ", "with your idea "},

// hang out
            {"with friends ", "at the mall ", "at the park ", "online "},

// hold on
            {"a moment ", "to the railing ", "to your dreams ", "for the next available agent "},

// keep off
            {"the grass ", "private property ", "the topic ", "the weight "},

// kick off
            {"the meeting ", "the party ", "the project ", "the game "},

// lay off
            {"workers ", "the criticism ", "the sweets ", "the pressure "},

// look into
            {"the matter ", "the future ", "the mirror ", "the possibilities "},
// make up
            {"a story ", "after a fight ", "your mind ", "a bed "},

// move on
            {"to the next topic ", "from this place ", "after a breakup ", "with your life "},

// pay back
            {"the loan ", "a friend ", "the favor ", "money owed "},

// pick up
            {"the pace ", "a language ", "groceries ", "a package "},

// put away
            {"your clothes ", "the dishes ", "savings ", "a book "},

// run out
            {"of time ", "of milk ", "of patience ", "of options "},

// set up
            {"a meeting ", "equipment ", "a company ", "an account "},

// show off
            {"a new car ", "skills ", "a dance move ", "a collection "},

// stand out
            {"in a crowd ", "from the competition ", "with bright colors ", "for your beliefs "},

// take off
            {"early from work ", "a sticker ", "on a trip ", "clothes quickly "},
// talk over
            {"the plan ", "the problem ", "the details ", "the situation "},

// think over
            {"the offer ", "the proposal ", "the decision ", "the consequences "},

// throw away
            {"the trash ", "old clothes ", "unused items ", "waste "},

// try on
            {"clothes ", "a hat ", "shoes ", "a new style "},

// turn down
            {"the volume ", "an offer ", "the heat ", "an invitation "},

// use up
            {"all the milk ", "the battery ", "resources ", "your energy "},

// wake up
            {"early ", "late ", "the neighbors ", "refreshed "},

// walk out
            {"of the meeting ", "on a job ", "of the cinema ", "in protest "},

// work out
            {"at the gym ", "a problem ", "a solution ", "relationship issues "},

// write down
            {"the address ", "your thoughts ", "a reminder ", "notes "}


    };
    String[][] phrasalVerbObjectsSpanish = {
            {"en clase ", "durante la reunión ", "de nuevo ", "inesperadamente "}, // act up
            {"los números ", "los gastos "}, // add up
            {"a un total ", "rápidamente "}, // add up
            {"de un desafío ", "en una discusión ", "de sus demandas ", "de la competencia "}, // back down
            {"aguántame un momento ", "con este retraso ", "con la molestia ", "conmigo "}, // bear with
            {"el globo ", "el edificio ", "la discusión ", "el proyecto "}, // blow up


            {"el reporte ", "la información ",
                    "la situación "}, // break down trns
            {"emocionalmente ","en medio del velorio ",
                    "con mis amigos "}, // break down intrs


            {"un tema sensible ", "recuerdos de la infancia ",
                    "la propuesta ", "el asunto "}, // bring up
            {"la reunión ", "la boda ", "el evento ",
                    "el acuerdo "}, // call off

            {"antes de que continuemos ", "después de las noticias ",
                    "para pensar con claridad "}, // calm down
             {"a él ", "a ella ","a ellos ",
                     "a tu amigo ", "a tu hijo "}, // calm down


            {"con tu trabajo ", "con el plan ", "a pesar de las dificultades ", "la tradición "}, // carry on

            // catch up
            {"con viejos amigos ", "en las noticias ", "con el trabajo ", "con la serie "},

// check out
            {"el nuevo café ", "este libro de la biblioteca ", "la última película ", "la vista desde aquí "},

// come across
            {"una foto antigua ", "una especie rara ", "una gran oferta ", "una historia fascinante "},

// come back
            {"de vacaciones ", "para ganar ", "para visitar ", "con venganza "},

// cut back
            {"en gastos ", "en dulces ", "en tiempo de pantalla ", "en el consumo de agua "},

// deal with
            {"el problema directamente ", "quejas de clientes ", "estrés ", "las consecuencias "},

// drop off
            {"los niños en la escuela ", "un paquete ", "un amigo en el aeropuerto ", "niveles de energía "},

// eat out
            {"en un restaurante elegante ", "con amigos ", "esta noche ", "una vez a la semana "},

// fall apart
            {"el plan ", "el pastel ", "la relación ", "bajo presión "},

// fill in
            {"un formulario ", "por alguien ", "los espacios en blanco ", "una laguna en el conocimiento "},
// find out trans
            {"la verdad ", "el secreto ", "los resultados ",},
           //find out intrans
            {"sobre el secreto ", "en la mañana ", "lo qué pasó "},

// get along
            {"con compañeros de trabajo ", "con los vecinos ", "bien con otros ", "con miembros de la familia "},

// give back
            { "el libro prestado ","el dinero "},

            {"a la comunidad ", "a los necesitados "},

// go ahead
            {"con el plan ", "y comienza sin mí ", "con la presentación ", "con tu idea "},

// hang out
            {"con amigos ", "en el centro comercial ", "en el parque ", "en línea "},

// hold on
            {"un momento ", "al pasamanos ", "a tus sueños ", "para el próximo agente disponible "},

// keep off
            {"el césped ", "propiedad privada ", "el tema ", "el peso "},

// kick off
            {"la reunión ", "la fiesta ", "el proyecto ", "el juego "},

// lay off
            {"trabajadores ", "las críticas ", "los dulces ", "la presión "},

// look into
            {"el asunto ", "el futuro ", "el espejo ", "las posibilidades "},
// make up
            {"una historia ", "después de una pelea ", "tu decisión ", "una cama "},

// move on
            {"al siguiente tema ", "de este lugar ", "después de una ruptura ", "con tu vida "},

// pay back
            {"el préstamo ", "a un amigo ", "el favor ", "dinero adeudado "},

// pick up
            {"el ritmo ", "un idioma ", "comestibles ", "un paquete "},

// put away
            {"tu ropa ", "los platos ", "ahorros ", "un libro "},

// run out
            {"de tiempo ", "de leche ", "de paciencia ", "de opciones "},

// set up
            {"una reunión ", "equipo ", "una empresa ", "una cuenta "},

// show off
            {"un coche nuevo ", "habilidades ", "un paso de baile ", "una colección "},

// stand out
            {"en una multitud ", "de la competencia ", "con colores brillantes ", "por tus creencias "},

// take off
            {"temprano del trabajo ", "una pegatina ", "en un viaje ", "ropa rápidamente "},
// talk over
            {"el plan ", "el problema ", "los detalles ", "la situación "},

// think over
            {"la oferta ", "la propuesta ", "la decisión ", "las consecuencias "},

// throw away
            {"la basura ", "ropa vieja ", "artículos sin usar ", "desperdicio "},

// try on
            {"ropa ", "un sombrero ", "zapatos ", "un nuevo estilo "},

// turn down
            {"el volumen ", "una oferta ", "el calor ", "una invitación "},

// use up
            {"toda la leche ", "toda la batería ", "todos los recursos ", "toda tu energía "},

// wake up
            {"temprano ", "tarde ", "a los vecinos ", "refrescado "},

// walk out
            {"de la reunión ", "de un trabajo ", "del cine ", "en protesta "},

// work out
            {"en el gimnasio ", "un problema ", "una solución ", "problemas de relación "},

// write down
            {"la dirección ", "tus pensamientos ", "un recordatorio ", "notas "}
    };

    String[] phrasalVerbsSpanishFirstPerson = {
            "me porto mal ",
            "sumo ",//trans
            "sumo ",//intrans
            "cedo ",
            "tengo paciencia ",
            "explotó",
            "analizo ",//trans
            "me descompongo ",//intrans
            "menciono ",
            "cancelo ",
            "me calmo ",//trans
            "calmo ",// intrans
            "continúo ",
            "me pongo al día ",
            "reviso ",
            "me encuentro con ",
            "vuelvo ",
            "reduzco ",
            "lido con ",
            "dejo en un lugar ",
            "como fuera ",
            "me desmorono ",
            "relleno ",
            "descubro ",//trans
            "descubro ",//intrans
            "me llevo bien ",
            "regreso ",//trans
            "devuelvo ",//intrans
            "procedo ",
            "paso el rato ",
            "espero ",
            "me mantengo alejado ",
            "inicio ",
            "despido ",
            "investigo ",
            "invento ",
            "sigo adelante ",
            "devuelvo dinero ",
            "recojo ",
            "guardo ",
            "se me agota ",
            "establezco ",
            "presumo ",
            "destaco ",
            "despego ",
            "discuto ",
            "considero ",
            "tiro ",
            "me pruebo ",
            "rechazo ",
            "consumo ",
            "me despierto ",
            "camino fuera ",
            "me ejercito ",
            "anoto "
    };
    String[] phrasalVerbsSpanishSecondPerson = {
            "te portas mal ",
            "sumas ",//trans
            "sumas ",//intrans
            "cedes ",
            "tienes paciencia ",
            "explotas ",
            "analizas ",//trans
            "te descompones ",//intrans
            "mencionas ",
            "cancelas ",
            "te calmas ",//trans
            "calmas ",//intrans
            "continúas ",
            "te pones al día ",
            "revisas ",
            "te encuentras con ",
            "vuelves ",
            "reduces ",
            "lidas con ",
            "dejas en un lugar ",
            "comes fuera ",
            "te desmoronas ",
            "rellenas ",
            "descubres ",//trans
            "descubres ",//intrans
            "te llevas bien ",
            "regresas ",//trans
            "devuelves ",//intrans
            "procedes ",
            "pasas el rato ",
            "esperas ",
            "te mantienes alejado ",
            "inicias ",
            "despides ",
            "investigas ",
            "inventas ",
            "sigues adelante ",
            "devuelves dinero ",
            "recoges ",
            "guardas ",
            "se te agota ",
            "estableces ",
            "presumes ",
            "destacas ",
            "despegas ",
            "discutes ",
            "consideras ",
            "tiras ",
            "te pruebas ",
            "rechazas ",
            "consumes ",
            "te despiertas ",
            "caminas fuera ",
            "te ejercitas ",
            "anotas "
    };
    String[] phrasalVerbsSpanishThirdPerson = {
            "se porta mal ",
            "suma ",//trans
            "suma ",//intrans
            "cede ",
            "tiene paciencia ",
            "explota ",
            "analiza ",//trans
            "se descompone ",//intrans

            "menciona ",
            "cancela ",

            "se calma ",//trans
            "calma ",//intrans
            "continúa ",
            "se pone al día con ",
            "revisa ",
            "se encuentra con ",
            "vuelve ",
            "reduce ",
            "lida con ",
            "deja en un lugar ",
            "come fuera ",
            "se desmorona ",
            "rellena ",
            "descubre ",//trans
            "descubre ",//intrans
            "se lleva bien ",
            "regresa ",//trans
            "devuelve ",//intrans
            "procede ",
            "pasa el rato ",
            "espera ",
            "se mantiene alejado ",
            "inicia ",
            "despide ",
            "investiga ",
            "inventa ",
            "sigue adelante ",
            "devuelve dinero ",
            "recoge ",
            "guarda ",
            "se le agota ",
            "establece ",
            "presume ",
            "destaca ",
            "despega ",
            "discute ",
            "considera ",
            "tira ",
            "se prueba ",
            "rechaza ",
            "consume ",
            "se despierta ",
            "camina fuera ",
            "se ejercita ",
            "anota "
    };
    String[] phrasalVerbsSpanishThirdPersonPlural = {
            "se portan mal ",
            "suman ",//trans
            "suman ",//intrans
            "ceden ",
            "tienen paciencia ",
            "explotan ",
            "analizan ",//trans
            "se descomponen ",//intrans
            "mencionan ",
            "cancelan ",
            "se calman ",//trans
            "calman ",//intrans
            "continúan ",
            "se ponen al día ",
            "revisan ",
            "se encuentran con ",
            "vuelven ",
            "reducen ",
            "lidan con ",
            "dejan en un lugar ",
            "comen fuera ",
            "se desmoronan ",
            "rellenan ",
            "descubren ",//trans
            "descubren ",//intrans
            "se llevan bien ",
            "regresan ",//trnas
            "se devuelven ",//intrans
            "proceden ",
            "pasan el rato ",
            "esperan ",
            "se mantienen alejados ",
            "inician ",
            "despiden ",
            "investigan ",
            "inventan ",
            "siguen adelante ",
            "devuelven dinero ",
            "recogen ",
            "guardan ",
            "se les agota ",
            "establecen ",
            "presumen ",
            "destacan ",
            "despegan ",
            "discuten ",
            "consideran ",
            "tiran ",
            "se prueban ",
            "rechazan ",
            "consumen ",
            "se despiertan ",
            "caminan fuera ",
            "se ejercitan ",
            "anotan "
    };
    String[] phrasalVerbsSpanishFirstPersonPlural = {
            "nos portamos mal ",
            "sumamos ",//trans
            "sumamos ",//intrans
            "cedemos ",
            "tenemos paciencia ",
            "explotamos ",
            "analizamos ",//trans
            "nos descomponemos ",//intrans
            "mencionamos ",
            "cancelamos ",
            "nos calmamos ", //trans
            "calmamos ",// intrans
            "continuamos ",
            "nos ponemos al día ",
            "revisamos ",
            "nos encontramos con ",
            "volvemos ",
            "reducimos ",
            "lidiamos con ",
            "dejamos en un lugar ",
            "comemos fuera ",
            "nos desmoronamos ",
            "rellenamos ",
            "descubrimos ",//trans
            "descubrimos ",//intrans
            "nos llevamos bien ",
            "regresamos ",//trans
            "nos devolvemos ",//intrans
            "procedemos ",
            "pasamos el rato ",
            "esperamos ",
            "nos mantenemos alejados ",
            "iniciamos ",
            "despedimos ",
            "investigamos ",
            "inventamos ",
            "seguimos adelante ",
            "devolvemos dinero ",
            "recogemos ",
            "guardamos ",
            "se nos agota ",
            "establecemos ",
            "presumimos ",
            "destacamos ",
            "despegamos ",
            "discutimos ",
            "consideramos ",
            "tiramos ",
            "nos probamos ",
            "rechazamos ",
            "consumimos ",
            "nos despertamos ",
            "caminamos fuera ",
            "nos ejercitamos ",
            "anotamos "
    };
    String[] objectPronouns1 = {

            "you ",
            "him ",
            "her ",
            "it ",
            "us ",
            "them "
    };
    String[] objectPronouns1Sp = {

            "te ",
            "le ",
            "la ",
            "le ",
            "nos ",
            "les "
    };
    String[] objectPronouns1CausativoSp = {

            "ti ",
            "él ",
            "ella ",
            "eso ",
            "nosotros ",
            "ellos "
    };
    String[] objectPronouns2 = {
            "me ",
            "him ",
            "her ",
            "it ",
            "us ",
            "them "
    };
    String[] objectPronouns2Sp = {
            "me ",
            "le ",
            "la ",
            "le ",
            "nos ",
            "les "
    };
    String[] objectPronouns3 = {
            "me ",
            "you ",
            "him ",
            "her ",
            "it ",
            "us ",
            "them "
    };
    String[] objectPronouns3Sp = {
            "me ",
            "te ",
            "le ",
            "la ",
            "le ",
            "nos ",
            "les "
    };
    String[] objectPronouns4 = {
            "me ",
            "you ",
            "him ",
            "her ",
            "it ",
            "us ",
            "them "
    };
    String[] objectPronouns4Sp = {
            "me ",
            "te ",
            "le ",
            "la ",
            "le ",
            "nos ",
            "les "
    };
    String[] objectPronouns5 = {

            "you ",
            "him ",
            "her ",
            "it ",

            "them "
    };
    String[] objectPronouns5sp = {

            "te ",
            "le ",
            "la ",
            "le ",

            "les "
    };
    String[] objectPronouns6 = {
            "me ",
            "you ",
            "him ",
            "her ",
            "it ",
            "us ",
            "them "

    };
    String[] objectPronouns6Sp = {
            "me ",
            "te ",
            "le ",
            "la ",
            "le ",
            "nos ",
            "les "

    };
    String[] personalPronouns = {
            "I ",
            "you ",
            "he ",
            "she ",
            "we ",
            "they "
    };

    String gene2,gens2;
    String[][] pvppVerbsComplements = {
            // love
            {"a lot ", "everyday ", "in the house ", "little "},
            // sell
            {"houses ", "cars ", "old books ", "vintage clothes "},
            // tell
            {"a story ", "the truth ", "a secret ", "their plans "},
            // show
            {"the truth ", "the feelings ", "a discovery ", "the way "},
            // give
            {"presents ", "advice ", "support ", "a chance "},
            // send
            {"letters ", "packages ", "an email ", "a message "},
            // offer
            {"a deal ", "a gift ", "an opportunity ", "help "},
            // teach
            {"English ", "math ", "history ", "science "},
            // promise
            {"to call ", "to visit ", "a secret ", "a plan "},
            // lend
            {"money ", "books ", "a hand ", "tools "},
            // pay
            {"the bill ", "with money ", "a fine ", "a compliment "},
            // call
            {"in the afternoon ", "everyday ", "always ", "at night "},
            // help
            {"with homework ", "to move ", "to be better ", "to understand "},
            // follow
            {"to the school ", "everywhere ", "sometimes ", "well "},
            // thank
            {"for the gift ", "for the help ", "for the support ", "for the understanding "},
            // admire
            {"a lot ", "from a distance ", "as a person ", "little "},
            // serve
            {"food ", "sometimes ", "everyday ", "now and then "},
            // protect
            {"in the house ", "at night ", "for ever ", "privately "},
            // forgive
            {"for the mistkes ", "for what happened ", "for the debt ", "for the offense "},
            // invite
            {"to a party ", "for dinner ", "to join ", "to participate "},
            // inform
            {"about changes ", "of the rights ", "about updates ", "of decisions "},

            // guide
            {"through the city ", "in their studies ", "through the process ", "in development "},
            // support
            {"in tough times ", "in their career ", "in their cause ", "in their project "},
            // mention
            {"in the conversation ", "in the meeting ", "as a reference ", "in the story "},
            // ask
            {"about their interests ", "for additional help ", "to use the bathroom ", "about their well-being "},
            // answer
            {"promptly ", "in detail ", "eagerly ", "honestly "},
            // please
            {"with the performance ", "with the decision ", "by making an effort ", "with ease "},

            // warn
            {"of impending dangers ", "before it's too late ", "about the impact ", "about the deadline "},
            // order
            {"for dinner ", "to clean their room ", "new supplies ", "for silence in the room "},
            // encourage
            {"to try again ", "to join the team ", "to face their fears ", "to dedicate time to study "},

            // permit
            {"entry into the building ", "early departure ", "conducting activities ", "use of the equipment "},
            // advise
            {"to be cautious ", "on finances ", "against bad habits ", "to explore new places "},
            // affect
            {"in the heart ", "in the overall health ", "in the final decision ", "in the academic performance "},

            // fear
            {"at night ", "in the morning", "in theory ", "in life "},
            // hate
            {"a lot ", "because of the past ", "little ", "today "},
            // know
            {"from church ", "very well ", "for many years ", "little "},
            // meet
            {"at the gathering ", "to achieve their goals ", "to uphold standards ", "at the agreed place "},
            // remember
            {"since childhood ", "in the park ", "in their birthday ", "in the good old times "}

    };

    String[][] pvppVerbsComplementosSpanish = {
            // amar
            {"mucho ", "todos los dias ", "en la casa ", "poco "},
            // vender
            {"casas ", "coches ", "libros viejos ", "ropa vintage "},
            // decir
            {"una historia ", "la verdad ", "un secreto ", "sus planes "},
            // mostrar
            {"la verdad ", "los sentimientos ", "un descubrimiento ", "el camino "},
            // dar
            {"regalos ", "consejos ", "apoyo ", "una oportunidad "},
            // enviar
            {"cartas ", "paquetes ", "un correo ", "un mensaje "},
            // ofrecer
            {"un trato ", "un regalo ", "una oportunidad ", "ayuda "},
            // enseñar
            {"inglés ", "matemáticas ", "historia ", "ciencia "},
            // prometer
            {"llamar ", "visitar ", "un secreto ", "un plan "},
            // prestar
            {"dinero ", "libros ", "una mano ", "herramientas "},
            // pagar
            {"la cuenta ", "con dinero ", "una multa ", "un cumplido "},
            // llamar
            {"en la tarde ", "todos los dias ", "siempre ", "en la noche "},
            // ayudar
            {"con la tarea ", "a mudarse ", "a ser mejor ", "a entender "},
            // seguir
            {"a la escuela ", "a todos lados ", "a veces ", "bien "},
            // agradecer
            {"por el regalo ", "por la ayuda ", "por el apoyo ", "por la comprensión "},
            // admirar
            {"mucho ", "desde lejos ", "como persona ", "poco "},
            // servir
            {"comida ", "a veces ", "todos los dias ", "de vez en cuando "},
            // proteger
            {"en la casa ", "en la noche ", "para siempre ", "en privado "},
            // perdonar
            {"por los errores ", "por lo que pasó ", "por la deuda ", "por la ofensa "},
            // invitar
            {"a una fiesta ", "a cenar ", "a unirse ", "a participar "},
            // informar
            {"sobre cambios ", "de los derechos ", "sobre actualizaciones ", "de decisiones "},

            //guiar
            {"a través de la ciudad ", "en sus estudios ", "durante el proceso ", "en el desarrollo "},
            // apoyar
            {"en momentos difíciles ", "en su carrera ", "en su causa ", "en su proyecto "},
            // mencionar
            {"en la conversación ", "en la reunión ", "como referencia ", "en la historia "},
            // preguntar
            {"sobre sus intereses ", "por ayuda adicional ", "para usar el baño ", "sobre su bienestar "},
            // responder
            {"rápidamente ", "con detalle ", "con entusiasmo ", "con sinceridad "},
            // complacer
            {"con la actuación ", "con la decisión ", "haciendo un esfuerzo ", "con facilidad "},

            // advertir
            {"sobre los peligros próximos ", "antes de que sea tarde ", "sobre el efecto ", "sobre la fecha límite "},
            // ordenar
            {"para la cena ", "que limpien su cuarto ", "nuevos materiales ", "silencio en la sala "},
            // animar
            {"a intentarlo de nuevo ", "a unirse al equipo ", "a enfrentar sus miedos ", "a dedicar tiempo al estudio "},

            // permitir
            {"la entrada al edificio ", "la salida antes de tiempo ", "la realización de actividades ", "el uso del equipo "},
            // aconsejar
            {"ser prudente ", "en sus finanzas ", "evitar malos hábitos ", "explorar nuevos lugares "},
            // afectar
            {"en el corazón ", "en la salud en general ", "en la decisión final ", "en el rendimiento escolar "},

            // temer
            {"en la noche ", "en la mañana ", "en teoría ", "en la vida "},
            // odiar
            {"mucho ", "por el pasado ", "poco ", "hoy "},
            // conocer
            {"de la iglesia ", "muy bien ", "por muchos años ", "poco "},
            // encontrar
            {"en la reunión ", "para cumplir sus metas ", "para mantener los estándares ", "en el lugar acordado "},
            // recordar
            {"desde la niñez ", "en el parque ", "en el día de su cumpleaños ", "en los buenos tiempos pasados "}

    };

    String[] pvppVerbs = {
            "love ", "sell ", "tell ", "show ", "give ",
            "send ", "offer ", "teach ", "promise ", "lend ",
            "pay ", "call ", "help ",  "follow ",
            "thank ", "admire ", "serve ", "protect ", "forgive ",
            "invite ", "inform ", "guide ", "support ", "mention ",
            "ask ", "answer ", "please ", "warn ", "order ",
            "encourage ", "permit ", "advise ", "affect ", "fear ",
            "hate ", "know ", "meet ", "remember "
    };
    String[] pvppVerbsPastTense = {
            "loved ", "sold ", "told ", "showed ", "gave ",
            "sent ", "offered ", "taught ", "promised ", "lent ",
            "paid ", "called ", "helped ", "followed ",
            "thanked ", "admired ", "served ", "protected ", "forgave ",
            "invited ", "informed ", "guided ", "supported ", "mentioned ",
            "asked ", "answered ", "pleased ", "warned ", "ordered ",
            "encouraged ", "permitted ", "advised ", "affected ", "feared ",
            "hated ", "knew ", "met ", "remembered "
    };

    String[] pvppVerbsThirdPerson = {
            "loves ", "sells ", "tells ", "shows ", "gives ",
            "sends ", "offers ", "teaches ", "promises ", "lends ",
            "pays ", "calls ", "helps ",  "follows ",
            "thanks ", "admires ", "serves ", "protects ", "forgives ",
            "invites ", "informs ", "guides ", "supports ", "mentions ",
            "asks ", "answers ", "pleases ", "warns ", "orders ",
            "encourages ", "permits ", "advises ", "affects ", "fears ",
            "hates ", "knows ", "meets ", "remembers "
    };
    String[] firstPersonSingularPvppSpanish = {
            "amo ", "vendo ", "digo ", "muestro ", "doy ",
            "envío ", "ofrezco ", "enseño ", "prometo ", "presto ",
            "pago ", "llamo ", "ayudo ", "sigo ",
            "agradezco ", "admiro ", "sirvo ", "protejo ", "perdono ",
            "invito ", "informo ", "guío ", "apoyo ", "menciono ",
            "pregunto ", "respondo ", "agrado ", "adviento ", "ordeno ",
            "animo ", "permito ", "aconsejo ", "afecto ", "temo ",
            "odio ", "conozco ", "encuentro ", "recuerdo "
    };
    String[] firstPersonSingularPvppSpanishPast = {
            "amé ", "vendí ", "dije ", "mostré ", "di ",
            "envié ", "ofrecí ", "enseñé ", "prometí ", "presté ",
            "pagué ", "llamé ", "ayudé ", "seguí ",
            "agradecí ", "admiré ", "serví ", "protegí ", "perdoné ",
            "invité ", "informé ", "guié ", "apoyé ", "mencioné ",
            "pregunté ", "respondí ", "agradé ", "advertí ", "ordené ",
            "animé ", "permití ", "aconsejé ", "afecté ", "temí ",
            "odié ", "conocí ", "encontré ", "recordé "
    };
    String[] firstPersonSingularPvppSpanishImperfect = {
            "amaba ", "vendía ", "decía ", "mostraba ", "daba ",
            "enviaba ", "ofrecía ", "enseñaba ", "prometía ", "prestaba ",
            "pagaba ", "llamaba ", "ayudaba ", "seguía ",
            "agradecía ", "admiraba ", "servía ", "protegía ", "perdonaba ",
            "invitaba ", "informaba ", "guiaba ", "apoyaba ", "mencionaba ",
            "preguntaba ", "respondía ", "agradaba ", "advertía ", "ordenaba ",
            "animaba ", "permitía ", "aconsejaba ", "afectaba ", "temía ",
            "odiaba ", "conocía ", "encontraba ", "recordaba "
    };


    String[] firstPersonPluralPvppSpanish = {
            "amamos ", "vendemos ", "decimos ", "mostramos ", "damos ",
            "enviamos ", "ofrecemos ", "enseñamos ", "prometemos ", "prestamos ",
            "pagamos ", "llamamos ", "ayudamos ",  "seguimos ",
            "agradecemos ", "admiramos ", "servimos ", "protegemos ", "perdonamos ",
            "invitamos ", "informamos ", "guíamos ", "apoyamos ", "mencionamos ",
            "preguntamos ", "respondemos ", "agradamos ", "advertimos ", "ordenamos ",
            "animamos ", "permitimos ", "aconsejamos ", "afectamos ", "tememos ",
            "odiamos ", "conocemos ", "encontramos ", "recordamos "
    };
    String[] firstPersonPluralPvppSpanishPreterito = {
            "amamos ", "vendimos ", "dijimos ", "mostramos ", "dimos ",
            "enviamos ", "ofrecimos ", "enseñamos ", "prometimos ", "prestamos ",
            "pagamos ", "llamamos ", "ayudamos ", "seguimos ",
            "agradecimos ", "admiramos ", "servimos ", "protegimos ", "perdonamos ",
            "invitamos ", "informamos ", "guíamos ", "apoyamos ", "mencionamos ",
            "preguntamos ", "respondimos ", "agradamos ", "advertimos ", "ordenamos ",
            "animamos ", "permitimos ", "aconsejamos ", "afectamos ", "temimos ",
            "odiamos ", "conocimos ", "encontramos ", "recordamos "
    };
    String[] firstPersonPluralPvppSpanishImperfecto = {
            "amábamos ", "vendíamos ", "decíamos ", "mostrábamos ", "dábamos ",
            "enviábamos ", "ofrecíamos ", "enseñábamos ", "prometíamos ", "prestábamos ",
            "pagábamos ", "llamábamos ", "ayudábamos ", "seguíamos ",
            "agradecíamos ", "admirábamos ", "servíamos ", "protegíamos ", "perdonábamos ",
            "invitábamos ", "informábamos ", "guíabamos ", "apoyábamos ", "mencionábamos ",
            "preguntábamos ", "respondíamos ", "agradábamos ", "advertíamos ", "ordenábamos ",
            "animábamos ", "permitíamos ", "aconsejábamos ", "afectábamos ", "temíamos ",
            "odiábamos ", "conocíamos ", "encontrábamos ", "recordábamos "
    };

    String[] secondPersonSingularPvppSpanish = {
            "amas ", "vendes ", "dices ", "muestras ", "das ",
            "envías ", "ofreces ", "enseñas ", "prometes ", "prestas ",
            "pagas ", "llamas ", "ayudas ",  "sigues ",
            "agradeces ", "admiras ", "sirves ", "proteges ", "perdonas ",
            "invitas ", "informas ", "guías ", "apoyas ", "mencionas ",
            "preguntas ", "respondes ", "agradas ", "adviertes ", "ordenas ",
            "animas ", "permites ", "aconsejas ", "afectas ", "temes ",
            "odias ", "conoces ", "encuentras ", "recuerdas "
    };
    String[] secondPersonSingularPvppSpanishPreterito = {
            "amaste ", "vendiste ", "dijiste ", "mostraste ", "diste ",
            "enviaste ", "ofreciste ", "enseñaste ", "prometiste ", "prestaste ",
            "pagaste ", "llamaste ", "ayudaste ", "seguiste ",
            "agradeciste ", "admiraste ", "serviste ", "protegiste ", "perdonaste ",
            "invitaste ", "informaste ", "guiaste ", "apoyaste ", "mencionaste ",
            "preguntaste ", "respondiste ", "agradaste ", "advertiste ", "ordenaste ",
            "animaste ", "permitiste ", "aconsejaste ", "afectaste ", "temiste ",
            "odiaste ", "conociste ", "encontraste ", "recordaste "
    };
    String[] secondPersonSingularPvppSpanishImperfecto = {
            "amabas ", "vendías ", "decías ", "mostrabas ", "dabas ",
            "enviabas ", "ofrecías ", "enseñabas ", "prometías ", "prestabas ",
            "pagabas ", "llamabas ", "ayudabas ", "seguías ",
            "agradecías ", "admirabas ", "servías ", "protegías ", "perdonabas ",
            "invitabas ", "informabas ", "guiabas ", "apoyabas ", "mencionabas ",
            "preguntabas ", "respondías ", "agradabas ", "advertías ", "ordenabas ",
            "animabas ", "permitías ", "aconsejabas ", "afectabas ", "temías ",
            "odiabas ", "conocías ", "encontrabas ", "recordabas "
    };

    String[] thirdPersonSingularPvppSpanish = {
            "ama ", "vende ", "dice ", "muestra ", "da ",
            "envía ", "ofrece ", "enseña ", "promete ", "presta ",
            "paga ", "llama ", "ayuda ",  "sigue ",
            "agradece ", "admira ", "sirve ", "protege ", "perdona ",
            "invita ", "informa ", "guía ", "apoya ", "menciona ",
            "pregunta ", "responde ", "agrada ", "advierte ", "ordena ",
            "anima ", "permite ", "aconseja ", "afecta ", "teme ",
            "odia ", "conoce ", "encuentra ", "recuerda "
    };
    String[] thirdPersonSingularPvppSpanishPreterito = {
            "amó ", "vendió ", "dijo ", "mostró ", "dio ",
            "envió ", "ofreció ", "enseñó ", "prometió ", "prestó ",
            "pagó ", "llamó ", "ayudó ", "siguió ",
            "agradeció ", "admiró ", "sirvió ", "protegió ", "perdonó ",
            "invitó ", "informó ", "guió ", "apoyó ", "mencionó ",
            "preguntó ", "respondió ", "agradó ", "advirtió ", "ordenó ",
            "animó ", "permitió ", "aconsejó ", "afectó ", "temió ",
            "odió ", "conoció ", "encontró ", "recordó "
    };
    String[] thirdPersonSingularPvppSpanishImperfecto = {
            "amaba ", "vendía ", "decía ", "mostraba ", "daba ",
            "enviaba ", "ofrecía ", "enseñaba ", "prometía ", "prestaba ",
            "pagaba ", "llamaba ", "ayudaba ", "seguía ",
            "agradecía ", "admiraba ", "servía ", "protegía ", "perdonaba ",
            "invitaba ", "informaba ", "guiaba ", "apoyaba ", "mencionaba ",
            "preguntaba ", "respondía ", "agradaba ", "advertía ", "ordenaba ",
            "animaba ", "permitía ", "aconsejaba ", "afectaba ", "temía ",
            "odiaba ", "conocía ", "encontraba ", "recordaba "
    };

    String[] thirdPersonPluralPvppSpanish = {
            "aman ", "venden ", "dicen ", "muestran ", "dan ",
            "envían ", "ofrecen ", "enseñan ", "prometen ", "prestan ",
            "pagan ", "llaman ", "ayudan ",  "siguen ",
            "agradecen ", "admiran ", "sirven ", "protegen ", "perdonan ",
            "invitan ", "informan ", "guían ", "apoyan ", "mencionan ",
            "preguntan ", "responden ", "agradan ", "advierten ", "ordenan ",
            "animan ", "permiten ", "aconsejan ", "afectan ", "temen ",
            "odian ", "conocen ", "encuentran ", "recuerdan "
    };
    String[] thirdPersonPluralPvppSpanishPreterito = {
            "amaron ", "vendieron ", "dijeron ", "mostraron ", "dieron ",
            "enviaron ", "ofrecieron ", "enseñaron ", "prometieron ", "prestaron ",
            "pagaron ", "llamaron ", "ayudaron ", "siguieron ",
            "agradecieron ", "admiraron ", "sirvieron ", "protegieron ", "perdonaron ",
            "invitaron ", "informaron ", "guiaron ", "apoyaron ", "mencionaron ",
            "preguntaron ", "respondieron ", "agradaron ", "advirtieron ", "ordenaron ",
            "animaron ", "permitieron ", "aconsejaron ", "afectaron ", "temieron ",
            "odiaron ", "conocieron ", "encontraron ", "recordaron "
    };
    String[] thirdPersonPluralPvppSpanishImperfecto = {
            "amaban ", "vendían ", "decían ", "mostraban ", "daban ",
            "enviaban ", "ofrecían ", "enseñaban ", "prometían ", "prestaban ",
            "pagaban ", "llamaban ", "ayudaban ", "seguían ",
            "agradecían ", "admiraban ", "servían ", "protegían ", "perdonaban ",
            "invitaban ", "informaban ", "guiaban ", "apoyaban ", "mencionaban ",
            "preguntaban ", "respondían ", "agradaban ", "advertían ", "ordenaban ",
            "animaban ", "permitían ", "aconsejaban ", "afectaban ", "temían ",
            "odiaban ", "conocían ", "encontraban ", "recordaban "
    };


    String[] getSpanish1 = {
            "me canso ", "me enfermo ", "me mejoro ", "me empeoro ", "me enojo ", "me emociono ", "me caliento ",
            "me asusto ", "me tardo ", "me pierdo ", "me alisto ", "me ensucio ", "me limpio ", "me mojo ",
            "me seco ", "me envejezco ", "me ocupo ", "me calmo ", "me alegro ", "me entristezco ",
            "me aburro ", "me avergüenzo ", "me frustro ", "me impaciento ", "me pongo celoso ", "me motivo ",
            "me tranquilizo ", "me sorprendo ", "me tenso ", "me incomodo ", "me preocupo ", "me agoto "
    };

    String[] getSpanish4 = {
            "nos cansamos ", "nos enfermamos ", "nos mejoramos ", "nos empeoramos ", "nos enojamos ", "nos emocionamos ", "nos calentamos ",
            "nos asustamos ", "nos tardamos ", "nos perdemos ", "nos alistamos ", "nos ensuciamos ", "nos limpiamos ", "nos mojamos ",
            "nos secamos ", "nos envejecemos ", "nos ocupamos ", "nos calmamos ", "nos alegramos ", "nos entristecemos ",
            "nos aburrimos ", "nos avergonzamos ", "nos frustramos ", "nos impacientamos ", "nos ponemos celosos ", "nos motivamos ",
            "nos tranquilizamos ", "nos sorprendemos ", "nos tensamos ", "nos incomodamos ", "nos preocupamos ", "nos agotamos "
    };

    String[] getSpanish2 = {
            "te cansas ", "te enfermas ", "te mejoras ", "te empeoras ", "te enojas ", "te emocionas ", "te calientas ",
            "te asustas ", "te tardas ", "te pierdes ", "te alistas ", "te ensucias ", "te limpias ", "te mojas ",
            "te secas ", "te envejeces ", "te ocupas ", "te calmas ", "te alegras ", "te entristeces ",
            "te aburres ", "te avergüenzas ", "te frustras ", "te impacientas ", "te pones celoso ", "te motivas ",
            "te tranquilizas ", "te sorprendes ", "te tensas ", "te incomodas ", "te preocupas ", "te agotas "
    };

    String[] getSpanish3 = {
            "se cansa ", "se enferma ", "se mejora ", "se empeora ", "se enoja ", "se emociona ", "se calienta ",
            "se asusta ", "se tarda ", "se pierde ", "se alista ", "se ensucia ", "se limpia ", "se moja ",
            "se seca ", "se envejece ", "se ocupa ", "se calma ", "se alegra ", "se entristece ",
            "se aburre ", "se avergüenza ", "se frustra ", "se impacienta ", "se pone celoso ", "se motiva ",
            "se tranquiliza ", "se sorprende ", "se tensa ", "se incomoda ", "se preocupa ", "se agota "
    };
    String[] getSpanish5 = {
            "se cansan ", "se enferman ", "se mejoran ", "se empeoran ", "se enojan ", "se emocionan ", "se calientan ",
            "se asustan ", "se tardan ", "se pierden ", "se alistan ", "se ensucian ", "se limpian ", "se mojan ",
            "se secan ", "se envejecen ", "se ocupan ", "se calman ", "se alegran ", "se entristecen ",
            "se aburren ", "se avergüenzan ", "se frustran ", "se impacientan ", "se ponen celosos ", "se motivan ",
            "se tranquilizan ", "se sorprenden ", "se tensan ", "se incomodan ", "se preocupan ", "se agotan "
    };
    String[] getEnglishVerbs = {"Tired ", "Sick ", "Better ",
            "Worse ", "Angry ", "Excited ", "Hot ", "Scared ", "Late ",
            "Lost ", "Ready ", "Dirty ", "Clean ", "Wet ", "Dry ", "old ",
            "Busy ", "Calm ", "Happy ", "Sad ", "Bored ", "Ashamed ", "Frustrated ",
            "Impatient ", "Jealous ", "Motivated ", "Calm ", "Surprised ", "Tense ",
            "Uncomfortable ", "Worried ", "Exhausted "};
    String[] combinedAdjectivesSpanishFeminine = {
          "hambrienta ", "sedienta ",
            "fría ", "nerviosa ",  "tarde ",
            "grande ",
            "ansiosa ", "curiosa ", "determinada ", "agradecida ",
            "esperanzada ",  "conocedora ", "solitaria ", "nerviosa ",
            "optimista ", "orgullosa ",
            "vulnerable ", "joven "
    };
    String[] combinedAdjectivesSpanishMasculine = {
            "hambriento ", "sediento ",
            "frío ", "nervioso ", "tarde ",
            "grande ",
            "ansioso ", "curioso ", "determinado ", "agradecido ",
            "esperanzado ", "conocedor ", "solitario ", "nervioso ",
            "optimista ", "orgulloso ",
            "vulnerable ", "joven "
    };

    String[] combinedAdjectivesSpanishMasculinePlural = {
            "hambrientos ", "sedientos ",
            "fríos ", "nerviosos ", "tarde ",
            "grandes ",
            "ansiosos ", "curiosos ", "determinados ", "agradecidos ",
            "esperanzados ", "conocedores ", "solitarios ", "nerviosos ",
            "optimistas ", "orgullosos ",
            "vulnerables ", "jóvenes "
    };

    String[] combinedAdjectivesEnglishShort = {
            "hungry ", "thirsty ",
            "cold ", "nervous ", "late ",
            "big ",
            "anxious ", "curious ", "determined ", "grateful ",
            "hopeful ", "knowledgeable ", "lonely ", "nervous ",
            "optimistic ", "proud ",
            "vulnerable ", "young "
    };
    String[] reflexiveVerbs = {
            "adapt ", "amuse ", "apply ", "assert ", "blame ", "cut ", "defend ", "enjoy ",
            "express ", "hurt ", "introduce ", "kill ", "prepare ", "pride ", "reinvent ",
            "respect ", "teach ", "tell ", "accustom ", "apply ", "behave ", "challenge ",
            "comfort ", "educate ", "embarrass ", "empower ", "exhaust ", "forgive ", "free ",
            "humble ", "improve ", "indulge ", "injure ", "inspire ", "introduce ", "motivate ",
            "protect ", "remind "
    };
    String[] reflexiveVerbsThirdPersonSingular = {
            "adapts ", "amuses ", "applies ", "asserts ", "blames ", "cuts ", "defends ", "enjoys ",
            "expresses ", "hurts ", "introduces ", "kills ", "prepares ", "prides ", "reinvents ",
            "respects ", "teaches ", "tells ", "accustoms ", "applies ", "behaves ", "challenges ",
            "comforts ", "educates ", "embarrasses ", "empowers ", "exhausts ", "forgives ", "frees ",
            "humbles ", "improves ", "indulges ", "injures ", "inspires ", "introduces ", "motivates ",
            "protects ", "reminds "
    };

    String[] reflexiveVerbsSpanish1 = {
            "me adapto ", "me asombro ", "me aplico ", "me afirmo ", "me culpo ", "me corto ", "me defiendo ", "me disfruto ",
            "me expreso ", "me hago daño ", "me presento ", "me mato ", "me preparo ", "me enorgullezco ", "me reinvento ",
            "me respeto ", "me enseño ", "me digo ", "me acostumbro ", "me aplico ", "me comporto ", "me desafío ",
            "me consuelo ", "me educo ", "me avergüenzo ", "me empodero ", "me agoto ", "me perdono ", "me libero ",
            "me humillo ", "me mejoro ", "me indulgo ", "me lesiono ", "me inspiro ", "me presento ", "me motivo ",
            "me protejo ", "me recuerdo "
    };
    String[] reflexiveVerbsSpanishPlural4 = {
            "nos adaptamos ", "nos asombramos ", "nos aplicamos ", "nos afirmamos ", "nos culpamos ", "nos cortamos ", "nos defendemos ", "nos disfrutamos ",
            "nos expresamos ", "nos hacemos daño ", "nos presentamos ", "nos matamos ", "nos preparamos ", "nos enorgullecemos ", "nos reinventamos ",
            "nos respetamos ", "nos enseñamos ", "nos decimos ", "nos acostumbramos ", "nos aplicamos ", "nos comportamos ", "nos desafiamos ",
            "nos consolamos ", "nos educamos ", "nos avergonzamos ", "nos empoderamos ", "nos agotamos ", "nos perdonamos ", "nos liberamos ",
            "nos humillamos ", "nos mejoramos ", "nos indulgamos ", "nos lesionamos ", "nos inspiramos ", "nos presentamos ", "nos motivamos ",
            "nos protegemos ", "nos recordamos "
    };

    String[] reflexiveVerbsSpanishSecondPerson = {
            "te adaptas ", "te asombras ", "te aplicas ", "te afirmas ", "te culpas ", "te cortas ", "te defiendes ", "te disfrutas ",
            "te expresas ", "te haces daño ", "te presentas ", "te matas ", "te preparas ", "te enorgulleces ", "te reinventas ",
            "te respetas ", "te enseñas ", "te dices ", "te acostumbras ", "te aplicas ", "te comportas ", "te desafías ",
            "te consuelas ", "te educas ", "te avergüenzas ", "te empoderas ", "te agotas ", "te perdonas ", "te liberas ",
            "te humillas ", "te mejoras ", "te indulgas ", "te lesionas ", "te inspiras ", "te presentas ", "te motivas ",
            "te proteges ", "te recuerdas "
    };
    String[] reflexiveVerbsSpanishThirdPersonSingular = {
            "se adapta ", "se asombra ", "se aplica ", "se afirma ", "se culpa ", "se corta ", "se defiende ", "se disfruta ",
            "se expresa ", "se hace daño ", "se presenta ", "se mata ", "se prepara ", "se enorgullece ", "se reinventa ",
            "se respeta ", "se enseña ", "se dice ", "se acostumbra ", "se aplica ", "se comporta ", "se desafía ",
            "se consuela ", "se educa ", "se avergüenza ", "se empodera ", "se agota ", "se perdona ", "se libera ",
            "se humilla ", "se mejora ", "se indulga ", "se lesiona ", "se inspira ", "se presenta ", "se motiva ",
            "se protege ", "se recuerda "
    };
    String[] reflexiveVerbsSpanishThirdPersonPlural = {
            "se adaptan ", "se asombran ", "se aplican ", "se afirman ", "se culpan ", "se cortan ", "se defienden ", "se disfrutan ",
            "se expresan ", "se hacen daño ", "se presentan ", "se matan ", "se preparan ", "se enorgullecen ", "se reinventan ",
            "se respetan ", "se enseñan ", "se dicen ", "se acostumbran ", "se aplican ", "se comportan ", "se desafían ",
            "se consuelan ", "se educan ", "se avergüenzan ", "se empoderan ", "se agotan ", "se perdonan ", "se liberan ",
            "se humillan ", "se mejoran ", "se indulgan ", "se lesionan ", "se inspiran ", "se presentan ", "se motivan ",
            "se protegen ", "se recuerdan "
    };
    String[] verbsVJ = {
            "agree ",
            "appear ",
            "arrange ",
            "ask ",
            "begin ",

            "care ",
            "cease ",
            "choose ",
            "claim ",

            "decide ",
            "demand ",
            "deserve ",
            "dread ",
            "expect ",

            "forget ",
            "get ",

            "hate ",
            "hesitate ",

            "intend ",
            "learn ",
            "like ",
            "love ",
            "manage ",
            "need ",
            "neglect ",
            "offer ",
            "plan ",
            "prefer ",
            "prepare ",
            "pretend ",
            "promise ",
            "propose ",
            "refuse ",
            "regret ",
            "remember ",

            "start ",
            "swear ",
            "tend ",
            "threaten ",
            "try ",
            "vow ",
            "wait ",
            "want ",
            "wish ",
            "yearn ",
            "admit ",
            "advise ",
            "allow ",
            "anticipate ",
            "appreciate ",
            "avoid ",


            "defend ",
            "delay ",
            "deny ",
            "despise ",
            "discuss ",
            "dislike ",
            "dread ",
            "enjoy ",
            "finish ",
            "forget ",
            "hate ",
            "imagine ",
            "love ",
            "mention ",
            "miss ",
            "need ",
            "permit ",
            "postpone ",
            "practice ",
            "propose ",
            "quit ",
            "recall ",
            "recommend ",
            "regret ",
            "remember ",
            "report ",
            "require ",
            "resent ",
            "resist ",
            "risk ",
            "suggest ",
            "tolerate ",
    };


    String[] verbsThirdPersonSingularVJ = {
            "agrees ",
            "appears ",
            "arranges ",
            "asks ",
            "begins ",

            "cares ",
            "ceases ",
            "chooses ",
            "claims ",

            "decides ",
            "demands ",
            "deserves ",
            "dreads ",
            "expects ",

            "forgets ",
            "gets ",

            "hates ",
            "hesitates ",

            "intends ",
            "learns ",
            "likes ",
            "loves ",
            "manages ",
            "needs ",
            "neglects ",
            "offers ",
            "plans ",
            "prefers ",
            "prepares ",
            "pretends ",
            "promises ",
            "proposes ",
            "refuses ",
            "regrets ",
            "remembers ",

            "starts ",
            "swears ",
            "tends ",
            "threatens ",
            "tries ",
            "vows ",
            "waits ",
            "wants ",
            "wishes ",
            "yearns ",
            "admits ",
            "advises ",
            "allows ",
            "anticipates ",
            "appreciates ",
            "avoids ",


            "defends ",
            "delays ",
            "denies ",
            "despises ",
            "discusses ",
            "dislikes ",
            "dreads ",
            "enjoys ",
            "finishes ",
            "forgets ",
            "hates ",
            "imagines ",
            "loves ",
            "mentions ",
            "misses ",
            "needs ",
            "permits ",
            "postpones ",
            "practices ",
            "proposes ",
            "quits ",
            "recalls ",
            "recommends ",
            "regrets ",
            "remembers ",
            "reports ",
            "requires ",
            "resents ",
            "resists ",
            "risks ",
            "suggests ",
            "tolerates ",
    };
    String[] verbsFirstPersonSingularSpanishVJ = {
            "estoy de acuerdo en ", // agree
            "parezco ", // appear
            "organizo ", // arrange
            "pido ", // ask
            "comienzo a ", // begin


            "me importa ", // care
            "ceso de ", // cease
            "elijo ", // choose
            "afirmo ", // claim
            "decido ", // decide
            "exijo ", // demand
            "merezco ", // deserve
            "temo ", // dread
            "espero ", // expect
            "olvido ", // forget
            "consigo ", // get
            "odio ", // hate
            "dudo ", // hesitate
            "tengo la intención de ", // intend
            "aprendo a ", // learn
            "me gusta ", // like
            "amo ", // love
            "logro ", // manage
            "necesito ", // need
            "descuido ", // neglect
            "ofrezco ", // offer
            "planeo ", // plan
            "prefiero ", // prefer
            "me preparo para ", // prepare
            "finjo ", // pretend
            "prometo ", // promise
            "propongo ", // propose
            "rechazo ", // refuse
            "lamento ", // regret
            "recuerdo ", // remember
            "empiezo ", // start
            "juro ", // swear
            "tiendo a ", // tend
            "amenazo en ", // threaten
            "intento ", // try
            "juro ", // vow
            "espero para ", // wait
            "quiero ", // want
            "deseo ", // wish
            "anhelo ", // yearn
            "admito ", // admit
            "aconsejo ", // advise
            "permito ", // allow
            "anticipo ", // anticipate
            "aprecio ", // appreciate
            "evito ", // avoid


            "defiendo ", // defend
            "retraso ", // delay
            "niego ", // deny
            "desprecio ", // despise
            "discuto ", // discuss
            "disgusto ", // dislike
            "temo ", // dread
            "disfruto ", // enjoy
            "termino ", // finish
            "olvido ", // forget
            "odio ", // hate
            "imagino ", // imagine
            "amo ", // love
            "menciono ", // mention
            "extraño ", // miss
            "necesito ", // need
            "permito ", // permit
            "pospongo ", // postpone
            "practico ", // practice
            "propongo ", // propose
            "dejo ", // quit
            "recuerdo ", // recall
            "recomiendo ", // recommend
            "lamento ", // regret
            "recuerdo ", // remember
            "denuncio ", // report
            "requiero ", // require
            "resentimiento ", // resent
            "resisto ", // resist
            "arriesgo ", // risk
            "sugiero ", // suggest
            "tolero ", // tolerate
    };
    String[] verbsSpanishSecondPersonPastImperfect = {
            "tenías ", // have (tener)
            "hacías ", // do (hacer)
            "decías ", // say (decir)
            "ibas ", // go (ir)
            "obtenías ", // get (obtener)
            "hacías ", // make (hacer)
            "sabías ", // know (saber)
            "pensabas ", // think (pensar)
            "veías ", // see (ver)
            "tomabas ", // take (tomar)
            "venías ", // come (venir)
            "querías ", // want (querer)
            "mirabas ", // look (mirar)
            "usabas ", // use (usar)
            "encontrabas ", // find (encontrar)
            "dabas ", // give (dar)
            "decías ", // tell (decir)
            "trabajabas ", // work (trabajar)
            "llamabas ", // call (llamar)
            "intentabas ", // try (intentar)
            "preguntabas ", // ask (preguntar)
            "necesitabas ", // need (necesitar)
            "sentías ", // feel (sentir)
            "te volvías ", // become (llegar a ser)
            "dejabas ", // leave (dejar)
            "ponías ", // put (poner)
            "te referías a ", // mean (significar)
            "dejabas ", // let (dejar)
            "mantenías ", // keep (mantener)
            "empezabas ", // begin (empezar)
            "parecías ", // seem (parecer)
            "hablabas ", // talk (hablar)
            "girabas ", // turn (girar)
            "ayudabas ", // help (ayudar)
            "empezabas ", // start (empezar)
            "mostrabas ", // show (mostrar)
            "oías ", // hear (oir)
            "corrías ", // run (correr)
            "jugabas ", // play (jugar)
            "movías ", // move (mover)
            "gustabas ", // like (gustar)
            "creías ", // believe (creer)
            "sostenías ", // hold (sostener)
            "vivías ", // live (vivir)
            "traías ", // bring (traer)
            "escribías ", // write (escribir)
            "proporcionabas ", // provide (proporcionar)
            "te sentabas ", // sit (sentarse)
            "estabas de pie ", // stand (estar de pie)
            "perdías ", // lose (perder)
            "te encontrabas ", // meet (encontrar)
            "pagabas ", // pay (pagar)
            "incluías ", // include (incluir)
            "continuabas ", // continue (continuar)
            "cambiabas ", // change (cambiar)
            "ponías ", // set (poner)
            "liderabas ", // lead (liderar)
            "aprendías ", // learn (aprender)
            "entendías ", // understand (entender)
            "mirabas ", // watch (mirar)
            "seguías ", // follow (seguir)
            "dejabas de ", // stop (detener)
            "hablabas ", // speak (hablar)
            "creabas ", // create (crear)
            "permitías ", // allow (permitir)
            "leías ", // read (leer)
            "gastabas ", // spend (gastar)
            "añadías ", // add (añadir)
            "crecías ", // grow (crecer)
            "abrías ", // open (abrir)
            "caminabas ", // walk (caminar)
            "ofrecías ", // offer (ofrecer)
            "recordabas ", // remember (recordar)
            "ganabas ", // win (ganar)
            "aparecías ", // appear (aparecer)
            "considerabas ", // consider (considerar)
            "amabas ", // love (amar)
            "comprabas ", // buy (comprar)
            "esperabas ", // wait (esperar)
            "morías ", // die (morir)
            "enviabas ", // send (enviar)
            "esperabas ", // expect (esperar)
            "servías ", // serve (servir)
            "te quedabas ", // stay (quedarse)
            "construías ", // build (construir)
            "caías ", // fall (caer)
            "cortabas ", // cut (cortar)
            "matabas ", // kill (matar)
            "alcanzabas ", // reach (alcanzar)
            "permanecías ", // remain (permanecer)
            "sugerías ", // suggest (sugerir)
            "elevabas ", // raise (elevar)
            "pasabas ", // pass (pasar)
            "vendías ", // sell (vender)
            "requerías ", // require (requerir)
            "decidías ", // decide (decidir)
            "informabas ", // report (informar)
            "te devolvías ", // return (volver)
            "tirabas ", // pull (tirar)
            "explicabas ", // explain (explicar)
            "llevabas ", // carry (llevar)
            "desarrollabas ", // develop (desarrollar)
            "esperabas ", // hope (esperar)
            "conducías ", // drive (conducir)
            "rompías " // break (romper)
    };

    String[] verbsFirstPersonPluralSpanishVJ = {
            "estamos de acuerdo en ", // agree
            "parecemos ", // appear
            "organizamos ", // arrange
            "pedimos ", // ask
            "comenzamos a ", // begin


            "nos importa ", // care
            "cesamos de ", // cease
            "elegimos ", // choose
            "afirmamos ", // claim
            "decidimos ", // decide
            "exigimos ", // demand
            "merecemos ", // deserve
            "tememos ", // dread
            "esperamos ", // expect
            "olvidamos ", // forget
            "conseguimos ", // get
            "odiamos ", // hate
            "dudamos en ", // hesitate
            "tenemos la intención de ", // intend
            "aprendemos a ", // learn
            "nos gusta ", // like
            "amamos ", // love
            "logramos ", // manage
            "necesitamos ", // need
            "descuidamos ", // neglect
            "ofrecemos ", // offer
            "planeamos ", // plan
            "preferimos ", // prefer
            "nos preparamos para ", // prepare
            "fingimos ", // pretend
            "prometemos ", // promise
            "proponemos ", // propose
            "rechazamos ", // refuse
            "lamentamos ", // regret
            "recordamos ", // remember
            "empezamos a ", // start
            "juramos ", // swear
            "tendemos a ", // tend
            "amenazamos en ", // threaten
            "intentamos ", // try
            "juramos ", // vow
            "esperamos para ", // wait
            "queremos ", // want
            "deseamos ", // wish
            "anhelamos ", // yearn
            "admitimos ", // admit
            "aconsejamos ", // advise
            "permitimos ", // allow
            "anticipamos ", // anticipate
            "apreciamos ", // appreciate
            "evitamos ", // avoid


            "defendemos ", // defend
            "retrasamos ", // delay
            "negamos ", // deny
            "despreciamos ", // despise
            "discutimos ", // discuss
            "disgustamos ", // dislike
            "tememos ", // dread
            "disfrutamos ", // enjoy
            "terminamos ", // finish
            "olvidamos ", // forget
            "odiamos ", // hate
            "imaginamos ", // imagine
            "amamos ", // love
            "mencionamos ", // mention
            "extrañamos ", // miss
            "necesitamos ", // need
            "permitimos ", // permit
            "posponemos ", // postpone
            "practicamos ", // practice
            "proponemos ", // propose
            "dejamos ", // quit
            "recordamos ", // recall
            "recomendamos ", // recommend
            "lamentamos ", // regret
            "recordamos ", // remember
            "denunciamos ", // report
            "requerimos ", // require
            "resentimos ", // resent
            "resistimos ", // resist
            "arriesgamos ", // risk
            "sugerimos ", // suggest
            "toleramos ", // tolerate
    };
    String[] verbsSecondPersonSingularSpanishVJ = {
            "estás de acuerdo en ", // agree
            "pareces ", // appear
            "organizas ", // arrange
            "pides ", // ask
            "comienzas a ", // begin


            "te importa ", // care
            "cesas de ", // cease
            "eliges ", // choose
            "afirmas ", // claim
            "decides ", // decide
            "exiges ", // demand
            "mereces ", // deserve
            "temes ", // dread
            "esperas ", // expect
            "olvidas ", // forget
            "consigues ", // get
            "odias ", // hate
            "dudas ", // hesitate
            "tienes la intención de ", // intend
            "aprendes a ", // learn
            "te gusta ", // like
            "amas ", // love
            "logras ", // manage
            "necesitas ", // need
            "descuidas ", // neglect
            "ofreces ", // offer
            "planeas ", // plan
            "prefieres ", // prefer
            "te preparas para ", // prepare
            "finges ", // pretend
            "prometes ", // promise
            "propones ", // propose
            "rechazas ", // refuse
            "lamentas ", // regret
            "recuerdas ", // remember
            "empiezas a ", // start
            "juras ", // swear
            "tiendes a ", // tend
            "amenazas en ", // threaten
            "intentas ", // try
            "juras ", // vow
            "esperas ", // wait
            "quieres ", // want
            "deseas ", // wish
            "anhelas ", // yearn
            "admites ", // admit
            "aconsejas ", // advise
            "permites ", // allow
            "anticipas ", // anticipate
            "aprecias ", // appreciate
            "evitas ", // avoid


            "defiendes ", // defend
            "retrasas ", // delay
            "niegas ", // deny
            "desprecias ", // despise
            "discutes ", // discuss
            "disgustas ", // dislike
            "temes ", // dread
            "disfrutas ", // enjoy
            "terminas ", // finish
            "olvidas ", // forget
            "odias ", // hate
            "imaginas ", // imagine
            "amas ", // love
            "mencionas ", // mention
            "extrañas ", // miss
            "necesitas ", // need
            "permites ", // permit
            "pospones ", // postpone
            "practicas ", // practice
            "propones ", // propose
            "dejas ", // quit
            "recuerdas ", // recall
            "recomiendas ", // recommend
            "lamentas ", // regret
            "recuerdas ", // remember
            "denuncias ", // report
            "requieres ", // require
            "resentis ", // resent
            "resistes ", // resist
            "arriesgas ", // risk
            "sugieres ", // suggest
            "toleras ", // tolerate
    };
    String[] verbsThirdPersonSingularSpanishVJ = {
            "está de acuerdo en ", // agree
            "parece ", // appear
            "organiza ", // arrange
            "pide ", // ask
            "comienza a ", // begin


            "le importa ", // care
            "cesa de ", // cease
            "elige ", // choose
            "afirma ", // claim
            "decide ", // decide
            "exige ", // demand
            "merece ", // deserve
            "teme ", // dread
            "espera ", // expect
            "olvida ", // forget
            "consigue ", // get
            "odia ", // hate
            "duda ", // hesitate
            "tiene la intención de ", // intend
            "aprende a ", // learn
            "le gusta ", // like
            "ama ", // love
            "logra ", // manage
            "necesita ", // need
            "descuida ", // neglect
            "ofrece ", // offer
            "planea ", // plan
            "prefiere ", // prefer
            "se prepara para ", // prepare
            "finge ", // pretend
            "promete ", // promise
            "propone ", // propose
            "rechaza ", // refuse
            "lamenta ", // regret
            "recuerda ", // remember
            "empieza a ", // start
            "jura ", // swear
            "tiende a ", // tend
            "amenaza ", // threaten
            "intenta ", // try
            "jura ", // vow
            "espera ", // wait
            "quiere ", // want
            "desea ", // wish
            "anhela ", // yearn
            "admite ", // admit
            "aconseja ", // advise
            "permite ", // allow
            "anticipa ", // anticipate
            "aprecia ", // appreciate
            "evita ", // avoid


            "defiende ", // defend
            "retrasa ", // delay
            "niega ", // deny
            "desprecia ", // despise
            "discute ", // discuss
            "disgusta ", // dislike
            "teme ", // dread
            "disfruta ", // enjoy
            "termina ", // finish
            "olvida ", // forget
            "odia ", // hate
            "imagina ", // imagine
            "ama ", // love
            "menciona ", // mention
            "extraña ", // miss
            "necesita ", // need
            "permite ", // permit
            "pospone ", // postpone
            "practica ", // practice
            "propone ", // propose
            "deja ", // quit
            "recuerda ", // recall
            "recomienda ", // recommend
            "lamenta ", // regret
            "recuerda ", // remember
            "denuncia ", // report
            "requiere ", // require
            "resente ", // resent
            "resiste ", // resist
            "arriesga ", // risk
            "sugiere ", // suggest
            "tolera ", // tolerate
    };
    String[] verbsThirdPersonPluralSpanishVJ = {
            "están de acuerdo en ", // agree
            "parece ", // appear
            "organizan ", // arrange
            "piden ", // ask
            "empiezan ", // begin


            "les importa ", // care
            "cesan de ", // cease
            "eligen ", // choose
            "afirman ", // claim
            "deciden ", // decide
            "exigen ", // demand
            "merecen ", // deserve
            "temen ", // dread
            "esperan ", // expect
            "olvidan ", // forget
            "consiguen ", // get
            "odian ", // hate
            "dudan ", // hesitate
            "tienen la intención de ", // intend
            "aprenden a ", // learn
            "les gusta ", // like
            "aman ", // love
            "logran ", // manage
            "necesitan ", // need
            "descuidan ", // neglect
            "ofrecen ", // offer
            "planean ", // plan
            "prefieren ", // prefer
            "se preparan para ", // prepare
            "fingen ", // pretend
            "prometen ", // promise
            "proponen ", // propose
            "rechazan ", // refuse
            "lamentan ", // regret
            "recuerdan ", // remember
            "empiezan a ", // start
            "juran ", // swear
            "tienden a ", // tend
            "amenazan ", // threaten
            "intentan ", // try
            "juran ", // vow
            "esperan ", // wait
            "quieren ", // want
            "desean ", // wish
            "anhelan ", // yearn
            "admiten ", // admit
            "aconsejan ", // advise
            "permiten ", // allow
            "anticipan ", // anticipate
            "aprecian ", // appreciate
            "evitan ", // avoid


            "defienden ", // defend
            "retrasan ", // delay
            "niegan ", // deny
            "desprecian ", // despise
            "discuten ", // discuss
            "disgustan ", // dislike
            "temen ", // dread
            "disfrutan ", // enjoy
            "terminan ", // finish
            "olvidan ", // forget
            "odian ", // hate
            "imaginan ", // imagine
            "aman ", // love
            "mencionan ", // mention
            "extrañan ", // miss
            "necesitan ", // need
            "permiten ", // permit
            "posponen ", // postpone
            "practican ", // practice
            "proponen ", // propose
            "dejan ", // quit
            "recuerdan ", // recall
            "recomiendan ", // recommend
            "lamentan ", // regret
            "recuerdan ", // remember
            "denuncian ", // report
            "requieren ", // require
            "resenten ", // resent
            "resisten ", // resist
            "arriesgan ", // risk
            "sugieren ", // suggest
            "toleran ", // tolerate
    };
    public void GenVerbosJuntos(){
        int v = (int)(Math.random()*verbsVJ.length);
        int ve= (int)(Math.random()*verbs.length);
        int p = (int)(Math.random()* subjectsEnglish.length);
        String pronoun = subjectsEnglish[p];
        int v2= (int)(Math.random()*verbObjects[ve].length);
        switch (pronoun){

            case "I ":
                gene= "I "+  verbsVJ[v]+"to "+verbs[ve]+  verbObjects[ve][v2];
                gene2= "I "+  verbsVJ[v]+verbsIng[ve]+  verbObjects[ve][v2];
                gens = "Yo "+verbsFirstPersonSingularSpanishVJ[v]+verbsSpanish[ve]+  verbObjectsSpanish[ve][v2];
                break;

            case "You ":
                gene= "You "+ verbsVJ[v]+"to "+verbs[ve]+verbObjects[ve][v2];
                gene2= "You "+ verbsVJ[v]+verbsIng[ve]+verbObjects[ve][v2];
                gens = "Tú "+verbsSecondPersonSingularSpanishVJ[v]+verbsSpanish[ve]+verbObjectsSpanish[ve][v2];
                break;

            case "He ":
                gene= "He "+ verbsThirdPersonSingularVJ[v]+"to "+verbs[ve]+verbObjects[ve][v2];
                gene2= "He "+ verbsThirdPersonSingularVJ[v]+verbsIng[ve]+verbObjects[ve][v2];
                gens = "Él "+verbsThirdPersonSingularSpanishVJ[v]+verbsSpanish[ve]+verbObjectsSpanish[ve][v2];
                break;

            case "She ":
                gene= "She "+ verbsThirdPersonSingularVJ[v]+"to "+verbs[ve]+verbObjects[ve][v2];
                gene2= "She "+ verbsThirdPersonSingularVJ[v]+verbsIng[ve]+verbObjects[ve][v2];
                gens = "Ella "+verbsThirdPersonSingularSpanishVJ[v]+verbsSpanish[ve]+verbObjectsSpanish[ve][v2];
                break;


            case "We ":
                gene= "We "+ verbsVJ[v]+"to "+verbs[ve]+verbObjects[ve][v2];
                gene2= "We "+ verbsVJ[v]+verbsIng[ve]+verbObjects[ve][v2];
                gens = "Nosotros "+verbsFirstPersonPluralSpanishVJ[v]+verbsSpanish[ve]+verbObjectsSpanish[ve][v2];
                break;

            case "They ":
                gene= "They "+ verbsVJ[v]+"to "+verbs[ve]+verbObjects[ve][v2];
                gene2= "They "+ verbsVJ[v]+verbsIng[ve]+verbObjects[ve][v2];
                gens = "Ellos "+verbsThirdPersonPluralSpanishVJ[v]+verbsSpanish[ve]+verbObjectsSpanish[ve][v2];
                break;
        }
    }
    public void GenCausatives(){
        int p = (int)(Math.random()* subjectsEnglish.length);
        int ob1=(int)(Math.random()* objectPronouns1.length);
        int ob2=(int)(Math.random()* objectPronouns2.length);
        int ob3=(int)(Math.random()* objectPronouns3.length);
        int ob4=(int)(Math.random()* objectPronouns4.length);
        int ob5=(int)(Math.random()* objectPronouns5.length);

        int v= (int)(Math.random()*verbs.length);
        int v2= (int)(Math.random()*verbObjects[v].length);

        String pronoun = subjectsEnglish[p];

        int get = (int)(Math.random()*2)    ;
        if(get==0){
            switch (pronoun){
                case "I ":
                    gene = "I have "+objectPronouns1[ob1]+verbs[v]+verbObjects[v][v2];
                    gens = "yo "+objectPronouns1Sp[ob1]+"pongo a "+verbsSpanish[v]+ verbObjectsSpanish[v][v2];

                    if (objectPronouns1[ob1].equals("him ")){
                        gene2 ="I have it "+verbs[v]+verbObjects[v][v2];
                    }else if (objectPronouns1[ob1].equals("it ")){
                        gene2 ="I have him "+verbs[v]+verbObjects[v][v2];

                    }else {
                        gene2= ".";
                    }

                    break;

                case"You ":

                    gene = "you have "+objectPronouns2[ob2]+verbs[v]+verbObjects[v][v2];
                    gens = "tú "+objectPronouns2Sp[ob2]+"pones a "+verbsSpanish[v]+ verbObjectsSpanish[v][v2];
                    if (objectPronouns2[ob2].equals("him ")){
                        gene2 ="You have it "+verbs[v]+verbObjects[v][v2];
                    }else if (objectPronouns2[ob2].equals("it ")){
                        gene2 ="You have him "+verbs[v]+verbObjects[v][v2];

                    }else {
                        gene2= ".";
                    }

                    break;

                case "He ":
                    gene = "he has "+objectPronouns3[ob3]+verbs[v]+verbObjects[v][v2];
                    gens = "él "+objectPronouns3Sp[ob3]+"pone a "+verbsSpanish[v]+ verbObjectsSpanish[v][v2];

                    if (objectPronouns3[ob3].equals("him ")){
                        gene2 ="He has it "+verbs[v]+verbObjects[v][v2];
                    }else if (objectPronouns3[ob3].equals("it ")){
                        gene2 ="He has him "+verbs[v]+verbObjects[v][v2];

                    }else {
                        gene2= ".";
                    }

                    break;

                case "She ":
                    gene = "she has "+objectPronouns3[ob3]+verbs[v]+verbObjects[v][v2];
                    gens = "ella "+objectPronouns3Sp[ob3]+"pone a "+verbsSpanish[v]+ verbObjectsSpanish[v][v2];
                    if (objectPronouns3[ob3].equals("him ")){
                        gene2 ="She has it "+verbs[v]+verbObjects[v][v2];
                    }else if (objectPronouns3[ob3].equals("it ")){
                        gene2 ="She has him "+verbs[v]+verbObjects[v][v2];

                    }else {
                        gene2= ".";
                    }
                    break;

                case "We ":

                    gene = "we have "+objectPronouns4[ob4]+verbs[v]+verbObjects[v][v2];
                    gens = "nosotros "+objectPronouns4Sp[ob4]+"ponemos a "+verbsSpanish[v]+ verbObjectsSpanish[v][v2];
                    if (objectPronouns4[ob4].equals("him ")){
                        gene2 ="We have it "+verbs[v]+verbObjects[v][v2];
                    }else if (objectPronouns4[ob4].equals("it ")){
                        gene2 ="We have him "+verbs[v]+verbObjects[v][v2];

                    }else {
                        gene2= ".";
                    }
                    break;

                case "They ":
                    gene = "they have "+objectPronouns5[ob5]+verbs[v]+verbObjects[v][v2];
                    gens = "ellos "+objectPronouns5sp[ob5]+"ponen a "+verbsSpanish[v]+  verbObjectsSpanish[v][v2];
                    if (objectPronouns5[ob5].equals("him ")){
                        gene2 ="They have it "+verbs[v]+verbObjects[v][v2];
                    }else if (objectPronouns5[ob5].equals("it ")){
                        gene2 ="They have him "+verbs[v]+verbObjects[v][v2];

                    }else {
                        gene2= ".";
                    }

                    break;
            }
        }else {
            switch (pronoun){
                case "I ":
                    gene = "I get "+objectPronouns1[ob1]+"to "+ verbs[v]+verbObjects[v][v2];
                    gens = "yo "+objectPronouns1Sp[ob1]+"convenzo de "+verbsSpanish[v]+ verbObjectsSpanish[v][v2];
                    if (objectPronouns1[ob1].equals("him ")){
                        gene2 ="I get it to "+verbs[v]+verbObjects[v][v2];
                    }else if (objectPronouns1[ob1].equals("it ")){
                        gene2 ="I get him to "+verbs[v]+verbObjects[v][v2];

                    }else {
                        gene2= ".";
                    }
                    break;

                case"You ":

                    gene = "you get "+objectPronouns2[ob2]+"to "+verbs[v]+verbObjects[v][v2];
                    gens = "tu "+objectPronouns2Sp[ob2]+"convences de "+verbsSpanish[v]+ verbObjectsSpanish[v][v2];
                    if (objectPronouns2[ob2].equals("him ")){
                        gene2 ="You get it to "+verbs[v]+verbObjects[v][v2];
                    }else if (objectPronouns2[ob2].equals("it ")){
                        gene2 ="You get him to "+verbs[v]+verbObjects[v][v2];

                    }else {
                        gene2= ".";
                    }

                    break;

                case "He ":
                    gene = "he gets "+objectPronouns3[ob3]+"to "+verbs[v]+verbObjects[v][v2];
                    gens = "él "+objectPronouns3Sp[ob3]+"convence de "+verbsSpanish[v]+ verbObjectsSpanish[v][v2];
                    if (objectPronouns3[ob3].equals("him ")){
                        gene2 ="He gets it to "+verbs[v]+verbObjects[v][v2];
                    }else if (objectPronouns3[ob3].equals("it ")){
                        gene2 ="He gets him to "+verbs[v]+verbObjects[v][v2];

                    }else {
                        gene2= ".";
                    }

                    break;

                case "She ":
                    gene = "she gets "+objectPronouns3[ob3]+"to "+verbs[v]+verbObjects[v][v2];
                    gens = "ella "+objectPronouns3Sp[ob3]+"convence de "+verbsSpanish[v]+ verbObjectsSpanish[v][v2];
                    if (objectPronouns3[ob3].equals("him ")){
                        gene2 ="She gets it to "+verbs[v]+verbObjects[v][v2];
                    }else if (objectPronouns3[ob3].equals("it ")){
                        gene2 ="She gets him to "+verbs[v]+verbObjects[v][v2];

                    }else {
                        gene2= ".";
                    }
                    break;

                case "We ":

                    gene = "we get "+objectPronouns4[ob4]+"to "+verbs[v]+verbObjects[v][v2];
                    gens = "nosotros "+objectPronouns4Sp[ob4]+"convencemos de "+verbsSpanish[v]+ verbObjectsSpanish[v][v2];
                    if (objectPronouns4[ob4].equals("him ")){
                        gene2 ="We get it to "+verbs[v]+verbObjects[v][v2];
                    }else if (objectPronouns4[ob4].equals("it ")){
                        gene2 ="We get him to "+verbs[v]+verbObjects[v][v2];

                    }else {
                        gene2= ".";
                    }
                    break;

                case "They ":
                    gene = "they get "+objectPronouns5[ob5]+"to "+verbs[v]+verbObjects[v][v2];
                    gens = "ellos "+objectPronouns5sp[ob5]+"convencen de "+verbsSpanish[v]+  verbObjectsSpanish[v][v2];
                    if (objectPronouns5[ob5].equals("him ")){
                        gene2 ="They get it to "+verbs[v]+verbObjects[v][v2];
                    }else if (objectPronouns5[ob5].equals("it ")){
                        gene2 ="They get him to "+verbs[v]+verbObjects[v][v2];

                    }else {
                        gene2= ".";
                    }

                    break;
            }
        }


    }

    public void GenReflexives(){
        int p = (int)(Math.random()* subjectsEnglish.length);
        int v = (int) (Math.random()* reflexiveVerbsSpanishSecondPerson.length);
        String pronoun = subjectsEnglish[p];
        switch (pronoun){
            case "I ":
                gens = "yo "+reflexiveVerbsSpanish1[v]+"a mi mismo";
                gene = "I "+ reflexiveVerbs[v] + "myself";
                break;

            case"You ":
                gens = "tú " +reflexiveVerbsSpanishSecondPerson[v]+"a ti mismo";
                gene = "you "+ reflexiveVerbs[v] + "yourself";
                break;

            case "He ":
                gens ="él "+ reflexiveVerbsSpanishThirdPersonSingular[v]+"a si mismo";
                gene = "he "+ reflexiveVerbsThirdPersonSingular[v] + "himself";

                break;

            case "She ":
                gens = "ella "+ reflexiveVerbsSpanishThirdPersonSingular[v]+"a si misma";
                gene = "she "+ reflexiveVerbsThirdPersonSingular[v] + "herself";
                break;

            case "We ":
                gens = "nosotros "+ reflexiveVerbsSpanishPlural4[v]+"a nosotros mismos";
                gene = "we "+ reflexiveVerbs[v] + "ourselves";
                break;

            case "They ":
                gens ="ellos "+ reflexiveVerbsSpanishThirdPersonPlural[v]+"a ellos mismos";
                gene = "they "+ reflexiveVerbs[v] + "themselves";
                break;
        }

    }

    public void GenGetStructures(){
        int adj = (int) (Math.random()* combinedAdjectivesSpanishMasculinePlural.length);
        int p = (int) (Math.random()* subjectsSpanish.length);
        int r = (int)(Math.random()*3);
        int r2= (int)(Math.random()*2);
        String mascPlural = combinedAdjectivesSpanishMasculinePlural[adj];
        String englishAdj = combinedAdjectivesEnglishShort[adj];
        String spanishMaleSingular = combinedAdjectivesSpanishMasculine[adj];
        String spanishFemaleSingular = combinedAdjectivesSpanishFeminine[adj];
        String pronombre = subjectsSpanish[p];
        String pronoun = subjectsEnglish[p];
        String spBody  = "";
        String engBody = "get ";

          if(r2==0){
              switch (pronombre){
                  case "Yo ":
                      switch (r){
                          case 0:
                              spBody="me hago "+spanishMaleSingular;

                              break;

                          case 1:
                              spBody="me vuelvo "+spanishMaleSingular;
                              break;

                          case 2:
                              spBody="me pongo "+spanishMaleSingular;
                              break;
                      }
                      break;

                  case "Tú ":
                      switch (r){
                          case 0:
                              spBody="te haces "+spanishMaleSingular;
                              break;

                          case 1:
                              spBody="te vuelves "+spanishMaleSingular;
                              break;

                          case 2:
                              spBody="te pones "+spanishMaleSingular;
                              break;
                      }
                      break;

                  case "Él ":
                      switch (r){
                          case 0:
                              spBody="se hace "+spanishMaleSingular;
                              break;

                          case 1:
                              spBody="se vuelve "+spanishMaleSingular;
                              break;

                          case 2:
                              spBody="se pone "+spanishMaleSingular;
                              break;
                      }
                      break;

                  case "Ella ":
                      switch (r){
                          case 0:
                              spBody="se hace "+spanishFemaleSingular;
                              break;

                          case 1:
                              spBody="se vuelve "+spanishFemaleSingular;
                              break;

                          case 2:
                              spBody="se pone "+spanishFemaleSingular;
                              break;
                      }
                      break;

                  case "Nosotros ":
                      switch (r){
                          case 0:
                              spBody="nos hacemos "+mascPlural;
                              break;

                          case 1:
                              spBody="nos volvemos "+mascPlural;
                              break;

                          case 2:
                              spBody="nos ponemos "+mascPlural;
                              break;
                      }
                      break;

                  case "Ellos ":
                      switch (r){
                          case 0:
                              spBody="se hacen "+mascPlural;
                              break;

                          case 1:
                              spBody="se vuelven "+mascPlural;
                              break;

                          case 2:
                              spBody="se ponen "+mascPlural;
                              break;
                      }
                      break;


              }
              if(pronoun.equals("He ")||pronoun.equals("She ")){
                  engBody = "gets ";
              }
              gens = pronombre+spBody;
              gene = pronoun+engBody+englishAdj;
          }else {
              int getr = (int)(Math.random()* getSpanish1.length);
              switch (pronombre) {
                  case "Yo ":
                     gens= "yo "+getSpanish1[getr];
                     gene="I get "+getEnglishVerbs[getr];
                      break;

                  case "Tú ":
                      gens="tú "+getSpanish2[getr];
                      gene="you get "+getEnglishVerbs[getr];
                      break;

                  case "Él ":
                      gens ="él "+ getSpanish3[getr];
                      gene = "he gets "+getEnglishVerbs[getr];
                      gene2= "she gets "+getEnglishVerbs[getr];
                      break;

                  case "Ella ":
                      gens= "ella "+  getSpanish3[getr];
                      gene =  "she gets "+getEnglishVerbs[getr];
                      gene2=  "he gets "+getEnglishVerbs[getr];
                      break;

                  case "Nosotros ":
                      gens="nosotros "+getSpanish4[getr];
                      gene =  "we get "+getEnglishVerbs[getr];
                      break;

                  case "Ellos ":
                      gens= "ellos "+  getSpanish5[getr];
                      gene =  "they get "+getEnglishVerbs[getr];
                      break;


              }
          }






    }

    VerbLists v = new VerbLists();
    public void GenIntReflx2(){
        int p = (int) (Math.random()* subjectsSpanish.length);
        String pronombre = subjectsSpanish[p];
              int getr = (int)(Math.random()* getSpanish1.length);
              switch (pronombre) {
                  case "Yo ":
                     gens= "yo "+getSpanish1[getr];
                     gene="I get "+getEnglishVerbs[getr];
                      break;

                  case "Tú ":
                      gens="tú "+getSpanish2[getr];
                      gene="you get "+getEnglishVerbs[getr];
                      break;

                  case "Él ":
                      gens ="él "+ getSpanish3[getr];
                      gene = "he gets "+getEnglishVerbs[getr];
                      gene2= "she gets "+getEnglishVerbs[getr];
                      break;

                  case "Ella ":
                      gens= "ella "+  getSpanish3[getr];
                      gene =  "she gets "+getEnglishVerbs[getr];
                      gene2=  "he gets "+getEnglishVerbs[getr];
                      break;

                  case "Nosotros ":
                      gens="nosotros "+getSpanish4[getr];
                      gene =  "we get "+getEnglishVerbs[getr];
                      break;

                  case "Ellos ":
                      gens= "ellos "+  getSpanish5[getr];
                      gene =  "they get "+getEnglishVerbs[getr];
                      break;


              }







    }
    public void GenIntReflx1(){
        int p = (int)(Math.random()* subjectsEnglish.length);
        int v = (int) (Math.random()* reflexiveVerbsSpanishSecondPerson.length);
        String pronoun = subjectsEnglish[p];
        switch (pronoun){
            case "I ":
                gens = reflexiveVerbsSpanish1[v];
                gene = "I "+ reflexiveVerbs[v] + "myself";

                break;

            case"You ":
                gens = reflexiveVerbsSpanishSecondPerson[v];
                gene = "you "+ reflexiveVerbs[v] + "yourself";
                break;

            case "He ":
                gens =reflexiveVerbsSpanishThirdPersonSingular[v]+"a si mismo";
                gene = "he "+ reflexiveVerbsThirdPersonSingular[v] + "himself";

                break;

            case "She ":
                gens =  reflexiveVerbsSpanishThirdPersonSingular[v]+"a si misma";
                gene = "she "+ reflexiveVerbsThirdPersonSingular[v] + "herself";
                break;

            case "We ":
                gens =  reflexiveVerbsSpanishPlural4[v];
                gene = "we "+ reflexiveVerbs[v] + "ourselves";
                break;

            case "They ":
                gens = reflexiveVerbsSpanishThirdPersonPlural[v];
                gene = "they "+ reflexiveVerbs[v] + "themselves";
                break;
        }


    }




    String gens3,gene3;
    public void GenSupposedTo(boolean isPast){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbrand= (int)(Math.random()*verbs.length);
        int objRand=(int)(Math.random()*verbObjects.length);
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        String pronoun= subjectsEnglish[pronounRand];
        switch (pronoun){
            case "I ":
                if(!isPast){
                    gene= "I am supposed to "+verbs[verbrand]+ verbObjects[verbrand][ob2];
                    gens= "se supone que yo tengo que "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens2= "se supone que yo debo "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens3= "se supone que yo voy a "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];

                }else {
                    gene= "I was supposed to "+verbs[verbrand]+ verbObjects[verbrand][ob2];
                    gens= "se supone que yo tenía que "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens2= "se supone que yo debía "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens3= "se supone que yo iba a "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                }
                break;
            case "You ":
                if(!isPast){
                    gene= "you are supposed to "+verbs[verbrand]+ verbObjects[verbrand][ob2];
                    gens= "se supone que tú tienes que "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens2= "se supone que tú debes "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens3= "se supone que tú vas a "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];

                }else {
                    gene= "you were supposed to "+verbs[verbrand]+ verbObjects[verbrand][ob2];
                    gens= "se supone que tú tenías que "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens2= "se supone que tú debías "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens3= "se supone que tú ibas a "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];

                }
                break;
            case "He ":
                if(!isPast){
                    gene= "he is supposed to "+verbs[verbrand]+ verbObjects[verbrand][ob2];
                    gens= "se supone que él tiene que "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens2= "se supone que él debe "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens3= "se supone que él va a "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];

                }else {
                    gene= "he was supposed to "+verbs[verbrand]+ verbObjects[verbrand][ob2];
                    gens= "se supone que él tenía que "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens2= "se supone que él debía "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens3= "se supone que él iba a "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];

                }
                break;
            case "She ":
                if(!isPast){
                    gene= "she is supposed to "+verbs[verbrand]+ verbObjects[verbrand][ob2];
                    gens= "se supone que ella tiene que "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens2= "se supone que ella debe "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens3= "se supone que ella va a "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];

                }else{
                    gene= "she was supposed to "+verbs[verbrand]+ verbObjects[verbrand][ob2];
                    gens= "se supone que ella tenía que "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens2= "se supone que ella debía "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens3= "se supone que ella iba a "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];

                }
                break;
            case "We ":
                if(!isPast){
                    gene= "we are supposed to "+verbs[verbrand]+ verbObjects[verbrand][ob2];
                    gens= "se supone que nosotros tenemos que "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens2= "se supone que nosotros debemos "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens3= "se supone que nosotros vamos a "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];

                }else {
                    gene= "we were supposed to "+verbs[verbrand]+ verbObjects[verbrand][ob2];
                    gens= "se supone que nosotros teníamos que "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens2= "se supone que nosotros debíamos "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens3= "se supone que nosotros ibamos a "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                }
                break;
            case "They ":
                if(!isPast){
                    gene= "they are supposed to "+verbs[verbrand]+ verbObjects[verbrand][ob2];
                    gens= "se supone que ellos tienen que "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens2= "se supone que ellos deben "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens3= "se supone que ellos van a "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];

                }else {
                    gene= "they were supposed to "+verbs[verbrand]+ verbObjects[verbrand][ob2];
                    gens= "se supone que ellos tenían que "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens2= "se supone que ellos debían "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];
                    gens3= "se supone que ellos iban a "+verbsSpanish[verbrand]+verbObjectsSpanish[verbrand][ob2];

                }
                break;
        }
    }
    public void GenPvpp(){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*pvppVerbsThirdPerson.length);
        String pronoun= subjectsEnglish[pronounRand];
        int pp= (int)(Math.random()*objectPronouns1.length);
        int pp3= (int)(Math.random()*objectPronouns3.length);
        int ppnos=(int)(Math.random()*objectPronouns5.length);

        switch (pronoun){
            case "I ":
                gene = subjectsEnglish[0]+pvppVerbs[verbRand]+ objectPronouns1[pp];
                gens = subjectsSpanish[0]+objectPronouns1Sp[pp]+ firstPersonSingularPvppSpanish[verbRand];
                if (objectPronouns1[pp].equals("him ")){
                    gene2 = subjectsEnglish[0]+pvppVerbs[verbRand]+ "it ";
                }else if (objectPronouns1[pp].equals("it ")){
                    gene2 = subjectsEnglish[0]+pvppVerbs[verbRand]+"him ";
                }else {
                    gene2= ".";
                }
                break;

            case "You ":
                gene = subjectsEnglish[1]+pvppVerbs[verbRand]+ objectPronouns2[pp];
                gens = subjectsSpanish[1]+objectPronouns2Sp[pp]+secondPersonSingularPvppSpanish[verbRand];
                if (objectPronouns2[pp].equals("him ")){
                    gene2 = subjectsEnglish[1]+pvppVerbs[verbRand]+ "it ";
                } else if (objectPronouns2[pp].equals("it ")){
                    gene2 = subjectsEnglish[1]+pvppVerbs[verbRand]+"him ";
                }else {
                    gene2= ".";
                }
                break;

            case "He ":
                gene= subjectsEnglish[2]+pvppVerbsThirdPerson[verbRand]+ objectPronouns3[pp3];
                gens = subjectsSpanish[2]+objectPronouns3Sp[pp3]+thirdPersonSingularPvppSpanish[verbRand];
                if (objectPronouns3[pp3].equals("it ")){
                    gene2 = subjectsEnglish[2]+pvppVerbsThirdPerson[verbRand]+"him ";
                }else if (objectPronouns3[pp3].equals("him ")){
                    gene2 = subjectsEnglish[2]+pvppVerbsThirdPerson[verbRand]+"it ";
                }else {
                    gene2= ".";
                }
                break;

            case "She ":
                gene= subjectsEnglish[3]+pvppVerbsThirdPerson[verbRand]+ objectPronouns4[pp3];
                gens = subjectsSpanish[3]+objectPronouns4Sp[pp3]+thirdPersonSingularPvppSpanish[verbRand];
                if (objectPronouns4[pp3].equals("him ")){
                    gene2 = subjectsEnglish[3]+pvppVerbsThirdPerson[verbRand]+ "it ";
                }else if (objectPronouns4[pp3].equals("it ")){
                    gene2 = subjectsEnglish[3]+pvppVerbsThirdPerson[verbRand]+"him ";
                }else {
                    gene2= ".";
                }

                break;

            case "We ":
                gens= subjectsSpanish[4]+objectPronouns5sp[ppnos]+firstPersonPluralPvppSpanish[verbRand];
                gene = subjectsEnglish[4]+pvppVerbs[verbRand]+ objectPronouns5[ppnos];
                if (objectPronouns5[ppnos].equals("him ")){
                    gene2 = subjectsEnglish[4]+pvppVerbs[verbRand]+ "it ";
                }else if (objectPronouns5[ppnos].equals("it ")){
                    gene2 = subjectsEnglish[4]+pvppVerbs[verbRand]+"him ";
                }else {
                    gene2= ".";
                }
                break;

            case "They ":
                gene = subjectsEnglish[5]+pvppVerbs[verbRand]+ objectPronouns6[pp];
                gens = subjectsSpanish[5]+objectPronouns6Sp[pp]+thirdPersonPluralPvppSpanish [verbRand];
                if (objectPronouns6[pp].equals("him ")){
                    gene2 = subjectsEnglish[5]+pvppVerbs[verbRand]+ "it ";
                }else if (objectPronouns6[pp].equals("it ")){
                    gene2 = subjectsEnglish[5]+pvppVerbs[verbRand]+"him ";
                }else {
                    gene2= ".";
                }
                break;
        }
    }
    public void GenIntPorObj(){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*pvppVerbsThirdPerson.length);
        String pronoun= subjectsEnglish[pronounRand];
        int pp= (int)(Math.random()*objectPronouns1.length);
        int pp3= (int)(Math.random()*objectPronouns3.length);
        int ppnos=(int)(Math.random()*objectPronouns5.length);

        switch (pronoun){
            case "I ":
                gene = subjectsEnglish[0]+pvppVerbs[verbRand]+ objectPronouns1[pp];
                gens =objectPronouns1Sp[pp]+ firstPersonSingularPvppSpanish[verbRand];
                if (objectPronouns1[pp].equals("him ")){
                    gene2 = subjectsEnglish[0]+pvppVerbs[verbRand]+ "it ";
                }else if (objectPronouns1[pp].equals("it ")){
                    gene2 = subjectsEnglish[0]+pvppVerbs[verbRand]+"him ";
                }else {
                    gene2= ".";
                }
                break;

            case "You ":
                gene = subjectsEnglish[1]+pvppVerbs[verbRand]+ objectPronouns2[pp];
                gens = objectPronouns2Sp[pp]+secondPersonSingularPvppSpanish[verbRand];
                if (objectPronouns2[pp].equals("him ")){
                    gene2 = subjectsEnglish[1]+pvppVerbs[verbRand]+ "it ";
                } else if (objectPronouns2[pp].equals("it ")){
                    gene2 = subjectsEnglish[1]+pvppVerbs[verbRand]+"him ";
                }else {
                    gene2= ".";
                }
                break;

            case "He ":
                gene= subjectsEnglish[2]+pvppVerbsThirdPerson[verbRand]+ objectPronouns3[pp3];
                gene3= subjectsEnglish[3]+pvppVerbsThirdPerson[verbRand]+ objectPronouns3[pp3];
                gens = objectPronouns3Sp[pp3]+thirdPersonSingularPvppSpanish[verbRand];
                if (objectPronouns3[pp3].equals("it ")){
                    gene2 = subjectsEnglish[2]+pvppVerbsThirdPerson[verbRand]+"him ";
                    gene3 = subjectsEnglish[3]+pvppVerbsThirdPerson[verbRand]+"him ";
                }else if (objectPronouns3[pp3].equals("him ")){
                    gene2 = subjectsEnglish[2]+pvppVerbsThirdPerson[verbRand]+"it ";
                    gene3 = subjectsEnglish[3]+pvppVerbsThirdPerson[verbRand]+"it ";
                }else {
                    gene2= ".";
                }
                break;

            case "She ":
                gene= subjectsEnglish[3]+pvppVerbsThirdPerson[verbRand]+ objectPronouns4[pp3];
                gene3= subjectsEnglish[2]+pvppVerbsThirdPerson[verbRand]+ objectPronouns4[pp3];
                gens = objectPronouns4Sp[pp3]+thirdPersonSingularPvppSpanish[verbRand];
                if (objectPronouns4[pp3].equals("him ")){
                    gene2 = subjectsEnglish[3]+pvppVerbsThirdPerson[verbRand]+ "it ";
                    gene3 = subjectsEnglish[2]+pvppVerbsThirdPerson[verbRand]+ "it ";
                }else if (objectPronouns4[pp3].equals("it ")){
                    gene2 = subjectsEnglish[3]+pvppVerbsThirdPerson[verbRand]+"him ";
                    gene3 = subjectsEnglish[2]+pvppVerbsThirdPerson[verbRand]+"him ";
                }else {
                    gene2= ".";
                }

                break;

            case "We ":
                gens= objectPronouns5sp[ppnos]+firstPersonPluralPvppSpanish[verbRand];
                gene =subjectsEnglish[4]+ pvppVerbs[verbRand]+ objectPronouns5[ppnos];
                if (objectPronouns5[ppnos].equals("him ")){
                    gene2 = subjectsEnglish[4]+pvppVerbs[verbRand]+ "it ";
                }else if (objectPronouns5[ppnos].equals("it ")){
                    gene2 = subjectsEnglish[4]+pvppVerbs[verbRand]+"him ";
                }else {
                    gene2= ".";
                }
                break;

            case "They ":
                gene = subjectsEnglish[5]+pvppVerbs[verbRand]+ objectPronouns6[pp];
                gens = objectPronouns6Sp[pp]+thirdPersonPluralPvppSpanish [verbRand];
                if (objectPronouns6[pp].equals("him ")){
                    gene2 = subjectsEnglish[5]+pvppVerbs[verbRand]+ "it ";
                }else if (objectPronouns6[pp].equals("it ")){
                    gene2 = subjectsEnglish[5]+pvppVerbs[verbRand]+"him ";
                }else {
                    gene2= ".";
                }
                break;
        }
    }
    public void GenPvppPast(){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*pvppVerbsThirdPerson.length);
        int ob2= (int)(Math.random()*pvppVerbsComplements[verbRand].length);
        String pronoun= subjectsEnglish[pronounRand];
        int pp= (int)(Math.random()*objectPronouns1.length);
        int pp3= (int)(Math.random()*objectPronouns3.length);
        int ppnos=(int)(Math.random()*objectPronouns5.length);
        String spanishObject=pvppVerbsComplementosSpanish[verbRand][ob2];
        String englishObject= pvppVerbsComplements[verbRand][ob2];

        switch (pronoun){
            case "I ":
                gene = subjectsEnglish[0]+pvppVerbsPastTense[verbRand]+ objectPronouns1[pp]+englishObject;
                gens = subjectsSpanish[0]+objectPronouns1Sp[pp]+ firstPersonSingularPvppSpanishPast[verbRand]+spanishObject;
                if (objectPronouns1[pp].equals("him ")){
                    gene2 = subjectsEnglish[0]+pvppVerbsPastTense[verbRand]+ "it "+englishObject;
                }else if (objectPronouns1[pp].equals("it ")){
                    gene2 = subjectsEnglish[0]+pvppVerbsPastTense[verbRand]+"him "+englishObject;
                }else {
                    gene2= ".";
                }
                break;

            case "You ":
                gene = subjectsEnglish[1]+pvppVerbsPastTense[verbRand]+ objectPronouns2[pp]+englishObject;
                gens = subjectsSpanish[1]+objectPronouns2Sp[pp]+secondPersonSingularPvppSpanishPreterito[verbRand]+spanishObject;
                if (objectPronouns2[pp].equals("him ")){
                    gene2 = subjectsEnglish[1]+pvppVerbsPastTense[verbRand]+ "it "+englishObject;
                } else if (objectPronouns2[pp].equals("it ")){
                    gene2 = subjectsEnglish[1]+pvppVerbsPastTense[verbRand]+"him "+englishObject;
                }else {
                    gene2= ".";
                }
                break;

            case "He ":
                gene= subjectsEnglish[2]+pvppVerbsPastTense[verbRand]+ objectPronouns3[pp3]+englishObject;
                gens = subjectsSpanish[2]+objectPronouns3Sp[pp3]+thirdPersonSingularPvppSpanishPreterito[verbRand]+spanishObject;
                if (objectPronouns3[pp3].equals("it ")){
                    gene2 = subjectsEnglish[2]+pvppVerbsPastTense[verbRand]+"him "+englishObject;
                }else if (objectPronouns3[pp3].equals("him ")){
                    gene2 = subjectsEnglish[2]+pvppVerbsPastTense[verbRand]+"it "+englishObject;
                }else {
                    gene2= ".";
                }
                break;

            case "She ":
                gene= subjectsEnglish[3]+pvppVerbsPastTense[verbRand]+ objectPronouns4[pp3]+englishObject;
                gens = subjectsSpanish[3]+objectPronouns4Sp[pp3]+thirdPersonSingularPvppSpanishPreterito[verbRand]+spanishObject;
                if (objectPronouns4[pp3].equals("him ")){
                    gene2 = subjectsEnglish[3]+pvppVerbsPastTense[verbRand]+ "it "+englishObject;
                }else if (objectPronouns4[pp3].equals("it ")){
                    gene2 = subjectsEnglish[3]+pvppVerbsPastTense[verbRand]+"him "+englishObject;
                }else {
                    gene2= ".";
                }

                break;

            case "We ":
                gens= subjectsSpanish[4]+objectPronouns5sp[ppnos]+firstPersonPluralPvppSpanishPreterito[verbRand]+spanishObject;
                gene = subjectsEnglish[4]+pvppVerbsPastTense[verbRand]+ objectPronouns5[ppnos]+englishObject;
                if (objectPronouns5[ppnos].equals("him ")){
                    gene2 = subjectsEnglish[4]+pvppVerbsPastTense[verbRand]+ "it "+englishObject;
                }else if (objectPronouns5[ppnos].equals("it ")){
                    gene2 = subjectsEnglish[4]+pvppVerbsPastTense[verbRand]+"him "+englishObject;
                }else {
                    gene2= ".";
                }
                break;

            case "They ":
                gene = subjectsEnglish[5]+pvppVerbsPastTense[verbRand]+ objectPronouns6[pp]+englishObject;
                gens = subjectsSpanish[5]+objectPronouns6Sp[pp]+thirdPersonPluralPvppSpanishPreterito[verbRand];
                if (objectPronouns6[pp].equals("him ")){
                    gene2 = subjectsEnglish[5]+pvppVerbsPastTense[verbRand]+ "it ";
                }else if (objectPronouns6[pp].equals("it ")){
                    gene2 = subjectsEnglish[5]+pvppVerbsPastTense[verbRand]+"him ";
                }else {
                    gene2= ".";
                }
                break;
        }
    }
    public void GenOff(){
    int off= (int)  (Math.random()*verbsWithOff.length);
    gens = verbsWithOffSpanish[off];
    gene = verbsWithOff[off];
}
    cerotofifty cero = new cerotofifty();
    public void GenThereBe(){
        int t= (int)(Math.random()* thereBeVariations.length);
        int c= (int)(Math.random()*cero.sustP.length);
        int cs= (int)(Math.random()*cero.sust.length);
        String sustantivotagged = cero.sustTagged[cs];
        char gender = sustantivotagged.charAt(sustantivotagged.length() - 1); // Get last character
        String temp = thereBeVariationsEnglishSpanish[t];
        String temp2;
        String temp3;
        String englishPart,spanishPart;
        if(temp.startsWith("P")){
            temp2 = temp.substring(1);
            String[] parts = temp2.split(" - ");
            if (parts.length == 2) { // Ensure the sentence was correctly split into two parts
                 englishPart = parts[0].trim(); // Trim to remove any leading or trailing spaces
                 spanishPart = parts[1].trim(); // Trim to remove any leading or trailing spaces
                gens = spanishPart+" "+cero.sustP[c];
                gene = englishPart+ " " +cero.nounP[c];

            }

        }else {
            temp2 = temp;
            String[] parts = temp2.split(" - ");
            if (parts.length == 2) { // Ensure the sentence was correctly split into two parts
                englishPart = parts[0].trim(); // Trim to remove any leading or trailing spaces
                spanishPart = parts[1].trim(); // Trim to remove any leading or trailing spaces

                if(gender=='M'){
                    gens = spanishPart+" un "+cero.sust[cs];
                    gene = englishPart+ " a " +cero.noun[cs];
                }else {
                    gens = spanishPart+" una "+cero.sust[cs];
                    gene = englishPart+ " a " +cero.noun[cs];
                }

            }
        }
    }
    public void genHappen(){
        int h= (int)(Math.random()*objetosHappen.length);
        int o = (int)(Math.random()*phrarsesHappen.length);
        gens = objetosHappen[h] +"sucede " +phrarsesHappen[o];
        gene= objectsBeforeHappen[h]+"happens "+phrasesAfterHappen[o];
    }

    public void genLong() {
    int pronounRand = (int) (Math.random() * subjectsEnglish.length);
    String pronoun = subjectsEnglish[pronounRand];
    int v = (int)(Math.random()*verbsWithLong.length);

        switch (pronoun) {
            case "I ":
                gens = "yo "+  firstPersonSingular[v]+ "mucho tiempo ";
                gene ="I "+ verbsWithLong[v]+"long ";
                break;

            case "You ":
                gene ="you "+verbsWithLong[v]+"long ";
                gens ="tú "+secondPersonSingular[v]+ "mucho tiempo ";
                break;

            case "He ":
                gene = "he "+ verbsWithLongThirdPerson[v]+"long ";
                gens ="él "+thirdPersonSingular[v]+ "mucho tiempo ";

                break;

            case "She ":
                gene = "she "+verbsWithLongThirdPerson[v]+"long ";
                gens = "ella "+ thirdPersonSingular[v]+ "mucho tiempo ";

                break;

            case "We ":
                gens ="Nosotros "+ firstPersonPlural[v]+ "mucho tiempo ";
                gene ="We "+verbsWithLong[v]+"long ";
                break;

            case "They ":
                gene ="They "+verbsWithLong[v]+"long ";
                gens = "ellos "+thirdPersonPlural[v]+ "mucho tiempo ";
                break;
        }
    }
    public void genAbout() {
        int pronounRand = (int) (Math.random() * subjectsEnglish.length);
        String pronoun = subjectsEnglish[pronounRand];
        int v = (int)(Math.random()*verbsAbout.length);

        switch (pronoun) {
            case "I ":
                gens = "yo "+  firstPersonSingularAbout[v]+ "alrededor ";
                gene ="I "+ verbsAbout[v]+"about ";
                break;

            case "You ":
                gene ="you "+verbsAbout[v]+"about ";
                gens ="tú "+secondPersonSingularAbout[v]+ "alrededor ";
                break;

            case "He ":
                gene = "he "+ verbsAbout[v]+"about ";
                gens ="él "+thirdPersonSingularAbout[v]+ "alrededor ";

                break;

            case "She ":
                gene = "she "+verbsAbout[v]+"about ";
                gens = "ella "+ thirdPersonSingularAbout[v]+ "alrededor ";

                break;

            case "We ":
                gens ="Nosotros "+ firstPersonPluralAbout[v]+ "alrededor ";
                gene ="We "+verbsAbout[v]+"about ";
                break;

            case "They ":
                gene ="They "+verbsAbout[v]+"about ";
                gens = "ellos "+thirdPersonPluralAbout[v]+ "alrededor ";
                break;
        }
    }
    public void genOver() {
        int pronounRand = (int) (Math.random() * subjectsEnglish.length);
        String pronoun = subjectsEnglish[pronounRand];
        int v = (int)(Math.random()*verbsWithOver.length);

        switch (pronoun) {
            case "I ":
                gens = "yo "+  firstPersonSingularSpanish[v];
                gene ="I "+ verbsWithOver[v];
                break;

            case "You ":
                gene ="you "+verbsWithOver[v];
                gens ="tú "+secondPersonSingularSpanish[v];
                break;

            case "He ":
                gene = "he "+ verbsWithOverThirdPerson[v];
                gens ="él "+thirdPersonSingularSpanish[v];

                break;

            case "She ":
                gene = "she "+verbsWithOverThirdPerson[v];
                gens = "ella "+ thirdPersonSingularSpanish[v];

                break;

            case "We ":
                gens ="Nosotros "+ firstPersonPluralSpanish[v];
                gene ="We "+verbsWithOver[v];
                break;

            case "They ":
                gene ="They "+verbsWithOver[v];
                gens = "ellos "+thirdPersonPluralSpanish[v];
                break;
        }
    }
    String gens,gene;
    public void GenPresSimp(){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*verbs.length);
        int objRand=(int)(Math.random()*verbObjects.length);
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        String pronoun= subjectsEnglish[pronounRand];

        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[0]+verbsSpanishFirstPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "You ":
                gene= subjectsEnglish[1]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[1]+verbsSpanishSecondPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "He ":
                gene= subjectsEnglish[2]+verbsThirdPerson[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[2]+verbsSpanishThirdPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gene= subjectsEnglish[3]+verbsThirdPerson[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[3]+verbsSpanishThirdPerson[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "We ":
                gens= subjectsSpanish[4]+verbsSpanishFirstPersonPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                gene = subjectsEnglish[4]+verbs[verbRand]+ verbObjects[verbRand][ob2 ];
                break;

            case "They ":
                gene = subjectsEnglish[5]+verbs[verbRand]+verbObjects[verbRand][ob2];
                gens = subjectsSpanish[5]+verbsSpanishThirdPersonPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }
    }

    public void GenPresSimp(int pronounRand,int verbRand,int ob2,String pronoun){

        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[0]+verbsSpanishFirstPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "You ":
                gene= subjectsEnglish[1]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[1]+verbsSpanishSecondPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "He ":
                gene= subjectsEnglish[2]+verbsThirdPerson[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[2]+verbsSpanishThirdPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gene= subjectsEnglish[3]+verbsThirdPerson[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[3]+verbsSpanishThirdPerson[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "We ":
                gens= subjectsSpanish[4]+verbsSpanishFirstPersonPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                gene = subjectsEnglish[4]+verbs[verbRand]+ verbObjects[verbRand][ob2 ];
                break;

            case "They ":
                gene = subjectsEnglish[5]+verbs[verbRand]+verbObjects[verbRand][ob2];
                gens = subjectsSpanish[5]+verbsSpanishThirdPersonPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }
    }
    public void GenPresSimpNoS(int pronounRand,int verbRand,int ob2,String pronoun){

        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[0]+verbsSpanishFirstPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "You ":
                gene= subjectsEnglish[1]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[1]+verbsSpanishSecondPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "He ":
                gene= subjectsEnglish[2]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[2]+verbsSpanishThirdPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gene= subjectsEnglish[3]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[3]+verbsSpanishThirdPerson[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "We ":
                gens= subjectsSpanish[4]+verbsSpanishFirstPersonPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                gene = subjectsEnglish[4]+verbs[verbRand]+ verbObjects[verbRand][ob2 ];
                break;

            case "They ":
                gene = subjectsEnglish[5]+verbs[verbRand]+verbObjects[verbRand][ob2];
                gens = subjectsSpanish[5]+verbsSpanishThirdPersonPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }
    }
    public void GenPastSimp(){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*verbsPastTense.length);
        int objRand=(int)(Math.random()*verbObjects.length);
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        String pronoun= subjectsEnglish[pronounRand];

        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+verbsPastTense[verbRand]+ verbObjects[verbRand][ob2];
                gene2= subjectsEnglish[0]+verbs[verbRand]+ verbObjects[verbRand][ob2];

                gens = subjectsSpanish[0]+verbsSpanishFirstPersonPast[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                // this is for wish
                gens2 = subjectsSpanish[0]+verbsSpanishFirstPersonPastSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "You ":
                gene= subjectsEnglish[1]+verbsPastTense[verbRand]+ verbObjects[verbRand][ob2];
                gene2= subjectsEnglish[1]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[1]+verbsSpanishSecondPersonSingularPast[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                // for wish
                gens2 = subjectsSpanish[1]+verbsSpanishSecondPersonPastSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "He ":
                gene= subjectsEnglish[2]+verbsPastTense[verbRand]+ verbObjects[verbRand][ob2];
                gene2= subjectsEnglish[2]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[2]+verbsSpanishThirdPersonSingularPast[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                //for wish
                gens2 = subjectsSpanish[2]+verbsSpanishThirdPersonPastSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gene= subjectsEnglish[3]+verbsPastTense[verbRand]+ verbObjects[verbRand][ob2];
                gene2= subjectsEnglish[3]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[3]+verbsSpanishThirdPersonSingularPast[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                // for wish
                gens2 = subjectsSpanish[3]+verbsSpanishThirdPersonPastSubjunctive[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "We ":
                gens= subjectsSpanish[4]+verbsSpanishFirstPersonPluralPast[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                //for wish
                gens2= subjectsSpanish[4]+verbsSpanishFirstPersonPluralPastSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2];

                gene = subjectsEnglish[4]+verbsPastTense[verbRand]+ verbObjects[verbRand][ob2 ];
                gene2 = subjectsEnglish[4]+verbs[verbRand]+ verbObjects[verbRand][ob2 ];
                break;

            case "They ":
                gene = subjectsEnglish[5]+verbsPastTense[verbRand]+verbObjects[verbRand][ob2];
                gene2 = subjectsEnglish[5]+verbs[verbRand]+verbObjects[verbRand][ob2];
                gens = subjectsSpanish[5]+verbsSpanishThirdPersonPluralPast[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                // for wish
                gens2 = subjectsSpanish[5]+verbsSpanishThirdPersonPluralPastSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }
    }
    public void GenPastSimp(int pronounRand,int verbRand ,int ob2,String pronoun){

        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+verbsPastTense[verbRand]+ verbObjects[verbRand][ob2];
                gene2= subjectsEnglish[0]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[0]+verbsSpanishFirstPersonPast[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "You ":
                gene= subjectsEnglish[1]+verbsPastTense[verbRand]+ verbObjects[verbRand][ob2];
                gene2= subjectsEnglish[1]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[1]+verbsSpanishSecondPersonSingularPast[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "He ":
                gene= subjectsEnglish[2]+verbsPastTense[verbRand]+ verbObjects[verbRand][ob2];
                gene2= subjectsEnglish[2]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[2]+verbsSpanishThirdPersonSingularPast[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gene= subjectsEnglish[3]+verbsPastTense[verbRand]+ verbObjects[verbRand][ob2];
                gene2= subjectsEnglish[3]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[3]+verbsSpanishThirdPersonSingularPast[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "We ":
                gens= subjectsSpanish[4]+verbsSpanishFirstPersonPluralPast[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                gene = subjectsEnglish[4]+verbsPastTense[verbRand]+ verbObjects[verbRand][ob2 ];
                gene2 = subjectsEnglish[4]+verbs[verbRand]+ verbObjects[verbRand][ob2 ];
                break;

            case "They ":
                gene = subjectsEnglish[5]+verbsPastTense[verbRand]+verbObjects[verbRand][ob2];
                gene2 = subjectsEnglish[5]+verbs[verbRand]+verbObjects[verbRand][ob2];
                gens = subjectsSpanish[5]+verbsSpanishThirdPersonPluralPast[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }
    }
    public void GenPresSimpPhrasalVerbs(){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*phrasalVerbs.length);
        int ob2= (int)(Math.random()*phrasalVerbObjects[verbRand].length);
        String pronoun= subjectsEnglish[pronounRand];
        String taggedVerb = phrasalVerbs[verbRand];
        String taggedVerb3= phrasalVerbsThirdPerson[verbRand];
        if(taggedVerb.startsWith("U")){
            String verb = taggedVerb.trim().substring(1);
            String verb3 = taggedVerb3.trim().substring(1);
            switch (pronoun){
                case "I ":
                    gene= subjectsEnglish[0]+verb+" "+ phrasalVerbObjects[verbRand][ob2];
                    gens = subjectsSpanish[0]+phrasalVerbsSpanishFirstPerson[verbRand]+ phrasalVerbObjectsSpanish[verbRand][ob2 ];
                    break;

                case "You ":
                    gene= subjectsEnglish[1]+verb+" "+ phrasalVerbObjects[verbRand][ob2];
                    gens = subjectsSpanish[1]+phrasalVerbsSpanishSecondPerson[verbRand]+ phrasalVerbObjectsSpanish[verbRand][ob2 ];
                    break;

                case "He ":
                    gene= subjectsEnglish[2]+verb3+" "+ phrasalVerbObjects[verbRand][ob2];
                    gens = subjectsSpanish[2]+phrasalVerbsSpanishThirdPerson[verbRand]+ phrasalVerbObjectsSpanish[verbRand][ob2 ];

                    break;

                case "She ":
                    gene= subjectsEnglish[3]+verb3+" "+ phrasalVerbObjects[verbRand][ob2];
                    gens = subjectsSpanish[3]+phrasalVerbsSpanishThirdPerson[verbRand]+phrasalVerbObjectsSpanish[verbRand][ob2 ];
                    break;

                case "We ":
                    gens= subjectsSpanish[4]+phrasalVerbsSpanishFirstPersonPlural[verbRand]+ phrasalVerbObjectsSpanish[verbRand][ob2];
                    gene = subjectsEnglish[4]+verb+" "+ phrasalVerbObjects[verbRand][ob2 ];
                    break;

                case "They ":
                    gene = subjectsEnglish[5]+verb+" "+phrasalVerbObjects[verbRand][ob2];
                    gens = subjectsSpanish[5]+phrasalVerbsSpanishThirdPersonPlural[verbRand]+ phrasalVerbObjectsSpanish[verbRand][ob2 ];
                    break;
            }
        }else {

            String[] parts = taggedVerb.trim().split(" ");
            String[] parts3= taggedVerb3.trim().split(" ");
           String verb=parts[0];
           String particle = parts[1];
           String verb3 = parts3[0];
           String particle3=parts3[1];

            switch (pronoun){
                case "I ":
                    gene= subjectsEnglish[0]+verb+" "+phrasalVerbObjects[verbRand][ob2]+particle;
                    gens = subjectsSpanish[0]+phrasalVerbsSpanishFirstPerson[verbRand]+ phrasalVerbObjectsSpanish[verbRand][ob2 ];
                    break;

                case "You ":
                    gene= subjectsEnglish[1]+verb+" "+ phrasalVerbObjects[verbRand][ob2]+particle;
                    gens = subjectsSpanish[1]+phrasalVerbsSpanishSecondPerson[verbRand]+ phrasalVerbObjectsSpanish[verbRand][ob2 ];
                    break;

                case "He ":
                    gene= subjectsEnglish[2]+verb3+" " + phrasalVerbObjects[verbRand][ob2]+particle3;
                    gens = subjectsSpanish[2]+phrasalVerbsSpanishThirdPerson[verbRand]+ phrasalVerbObjectsSpanish[verbRand][ob2 ];

                    break;

                case "She ":
                    gene= subjectsEnglish[3]+verb3+" "+ phrasalVerbObjects[verbRand][ob2]+particle3;
                    gens = subjectsSpanish[3]+phrasalVerbsSpanishThirdPerson[verbRand]+phrasalVerbObjectsSpanish[verbRand][ob2 ];
                    break;

                case "We ":
                    gens= subjectsSpanish[4]+phrasalVerbsSpanishFirstPersonPlural[verbRand]+ phrasalVerbObjectsSpanish[verbRand][ob2];
                    gene = subjectsEnglish[4]+verb+" "+phrasalVerbObjects[verbRand][ob2 ]+particle;
                    break;

                case "They ":
                    gene = subjectsEnglish[5]+verb+" "+phrasalVerbObjects[verbRand][ob2]+particle;
                    gens = subjectsSpanish[5]+phrasalVerbsSpanishThirdPersonPlural[verbRand]+ phrasalVerbObjectsSpanish[verbRand][ob2 ];
                    break;
            }


        }

    }

    public void GenAlmost(String almost,String casi){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*verbs.length);
        int objRand=(int)(Math.random()*verbObjects.length);
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        String pronoun= subjectsEnglish[pronounRand];

        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+almost +verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[0]+casi+verbsSpanishFirstPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "You ":
                gene= subjectsEnglish[1]+almost+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[1]+casi+verbsSpanishSecondPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "He ":
                gene= subjectsEnglish[2]+almost+verbsThirdPerson[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[2]+casi+verbsSpanishThirdPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gene= subjectsEnglish[3]+almost+verbsThirdPerson[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[3]+casi+verbsSpanishThirdPerson[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "We ":
                gens= subjectsSpanish[4]+casi+verbsSpanishFirstPersonPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                gene = subjectsEnglish[4]+almost+verbs[verbRand]+ verbObjects[verbRand][ob2 ];
                break;

            case "They ":
                gene = subjectsEnglish[5]+almost+verbs[verbRand]+verbObjects[verbRand][ob2];
                gens = subjectsSpanish[5]+casi+verbsSpanishThirdPersonPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }
    }
    public void GenPresSimpSubjunctive(){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*verbs.length);
        int objRand=(int)(Math.random()*verbObjects.length);
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        String pronoun= subjectsEnglish[pronounRand];

        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[0]+verbsSpanishFirstPersonSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "You ":
                gene= subjectsEnglish[1]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[1]+verbsSpanishSecondPersonSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "He ":
                gene= subjectsEnglish[2]+verbsThirdPerson[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[2]+verbsSpanishThirdPersonSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gene= subjectsEnglish[3]+verbsThirdPerson[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[3]+verbsSpanishThirdPersonSubjunctive[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "We ":
                gens= subjectsSpanish[4]+verbsSpanishFirstPersonPluralSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                gene = subjectsEnglish[4]+verbs[verbRand]+ verbObjects[verbRand][ob2 ];
                break;

            case "They ":
                gene = subjectsEnglish[5]+verbs[verbRand]+verbObjects[verbRand][ob2];
                gens = subjectsSpanish[5]+verbsSpanishThirdPersonPluralSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }
    }
    public void GenPastSimpSubjunctive(){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*verbsPastTense.length);
        int objRand=(int)(Math.random()*verbObjects.length);
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        String pronoun= subjectsEnglish[pronounRand];

        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+verbsPastTense[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[0]+verbsSpanishFirstPersonPastSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "You ":
                gene= subjectsEnglish[1]+verbsPastTense[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[1]+verbsSpanishSecondPersonPastSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "He ":
                gene= subjectsEnglish[2]+verbsPastTense[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[2]+verbsSpanishThirdPersonPastSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gene= subjectsEnglish[3]+verbsPastTense[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[3]+verbsSpanishThirdPersonPastSubjunctive[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "We ":
                gens= subjectsSpanish[4]+verbsSpanishFirstPersonPluralPastSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                gene = subjectsEnglish[4]+verbsPastTense[verbRand]+ verbObjects[verbRand][ob2 ];
                break;

            case "They ":
                gene = subjectsEnglish[5]+verbsPastTense[verbRand]+verbObjects[verbRand][ob2];
                gens = subjectsSpanish[5]+verbsSpanishThirdPersonPluralPastSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }
    }
    public void GenPresSimpSubjunctive(String modalEng,String modalSp){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*verbs.length);
        int objRand=(int)(Math.random()*verbObjects.length);
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        String pronoun= subjectsEnglish[pronounRand];

        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+modalEng+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[0]+modalSp+verbsSpanishFirstPersonSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "You ":
                gene= subjectsEnglish[1]+modalEng+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[1]+modalSp+verbsSpanishSecondPersonSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "He ":
                gene= subjectsEnglish[2]+modalEng+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[2]+modalSp+verbsSpanishFirstPersonSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gene= subjectsEnglish[3]+modalEng+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[3]+modalSp+verbsSpanishFirstPersonSubjunctive[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "We ":
                gens= subjectsSpanish[4]+modalSp+verbsSpanishFirstPersonPluralSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                gene = subjectsEnglish[4]+modalEng+verbs[verbRand]+ verbObjects[verbRand][ob2 ];
                break;

            case "They ":
                gene = subjectsEnglish[5]+modalEng+verbs[verbRand]+verbObjects[verbRand][ob2];
                gens = subjectsSpanish[5]+modalSp+verbsSpanishThirdPersonPluralSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }
    }
    public void GenForTo(){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*verbs.length);
        int objRand=(int)(Math.random()*verbObjects.length);
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        String pronoun= subjectsEnglish[pronounRand];

        switch (pronoun){
            case "I ":
                gene= "for me to "+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = "para que yo "+verbsSpanishFirstPersonSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "You ":
                gene="for you to "+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = "para que tú "+verbsSpanishSecondPersonSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "He ":
                gene= "for him to "+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = "para que él "+verbsSpanishFirstPersonSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gene= "for her to "+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = "para que ella "+verbsSpanishFirstPersonSubjunctive[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "We ":
                gens="para que nosotros "+verbsSpanishFirstPersonPluralSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                gene =  "for us to "+verbs[verbRand]+ verbObjects[verbRand][ob2 ];
                break;

            case "They ":
                gene ="for them to "+verbs[verbRand]+verbObjects[verbRand][ob2];
                gens = "para que ellos "+verbsSpanishThirdPersonPluralSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }
    }
    public void GenMay(String modalEng, String modalSp) {
        int pronounRand = (int) (Math.random() * subjectsEnglish.length);
        int verbRand = (int) (Math.random() * verbs.length);
        int objRand = (int) (Math.random() * verbObjects.length);
        int ob2 = (int) (Math.random() * verbObjects[objRand].length);
        String pronoun = subjectsEnglish[pronounRand];

        switch (pronoun) {
            case "I ":
                gene = subjectsEnglish[0] + modalEng + verbs[verbRand] + verbObjects[verbRand][ob2];
                gens = modalSp + subjectsSpanish[0] + verbsSpanishFirstPersonSubjunctive[verbRand] + verbObjectsSpanish[verbRand][ob2];
                break;

            case "You ":
                gene = subjectsEnglish[1] + modalEng + verbs[verbRand] + verbObjects[verbRand][ob2];
                gens = modalSp + subjectsSpanish[1] + verbsSpanishSecondPersonSubjunctive[verbRand] + verbObjectsSpanish[verbRand][ob2];
                break;

            case "He ":
                gene = subjectsEnglish[2] + modalEng + verbs[verbRand] + verbObjects[verbRand][ob2];
                gens = modalSp + subjectsSpanish[2] + verbsSpanishFirstPersonSubjunctive[verbRand] + verbObjectsSpanish[verbRand][ob2];
                break;

            case "She ":
                gene = subjectsEnglish[3] + modalEng + verbs[verbRand] + verbObjects[verbRand][ob2];
                gens = modalSp + subjectsSpanish[3] + verbsSpanishFirstPersonSubjunctive[verbRand] + verbObjectsSpanish[verbRand][ob2];
                break;

            case "We ":
                gene = subjectsEnglish[4] + modalEng + verbs[verbRand] + verbObjects[verbRand][ob2];
                gens = modalSp + subjectsSpanish[4] + verbsSpanishFirstPersonPluralSubjunctive[verbRand] + verbObjectsSpanish[verbRand][ob2];
                break;

            case "They ":
                gene = subjectsEnglish[5] + modalEng + verbs[verbRand] + verbObjects[verbRand][ob2];
                gens = modalSp + subjectsSpanish[5] + verbsSpanishThirdPersonPluralSubjunctive[verbRand] + verbObjectsSpanish[verbRand][ob2];
                break;
        }
    }

    public void GenPerfectTenses(String eng1,String eng2,String sp1,String sp2,String sp3,String sp4,String sp5){
        int pronounRand=  (int)(Math.random()*subjectsEnglish.length);
        int verbRand=  (int)(Math.random()*verbsParticiple.length);
        int objRand = (int) (Math.random() * verbObjects.length);
        int ob2=  (int)(Math.random()*verbObjects[objRand].length);
        String pronoun= "I ";
        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+eng1+verbsParticiple[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[0]+sp1+verbsParticipleSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "You ":
                gene= subjectsEnglish[1]+eng1+ verbsParticiple[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[1]+sp2+verbsParticipleSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "He ":
                gene= subjectsEnglish[2]+eng2+verbsParticiple[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[2]+sp3+verbsParticipleSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gene= subjectsEnglish[3]+eng2+verbsParticiple[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[3]+sp3+verbsParticipleSpanish[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "We ":
                gens= subjectsSpanish[4]+eng1+verbsParticipleSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                gene = subjectsEnglish[4]+sp4+verbs[verbRand]+ verbObjects[verbRand][ob2 ];
                break;

            case "They ":
                gene = subjectsEnglish[5]+eng1+verbsParticiple[verbRand]+verbObjects[verbRand][ob2];
                gens = subjectsSpanish[5]+sp5+verbsParticipleSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }

    }
    public void GenContTenses(String eng1,String eng2,String eng3,String sp1,String sp2,String sp3,String sp4,String sp5){
        int pronounRand=  (int)(Math.random()*subjectsEnglish.length);
        int verbRand=  (int)(Math.random()*verbsParticiple.length);
        int ob2=  (int)(Math.random()*verbObjects[verbRand].length);
        String pronoun= subjectsEnglish[pronounRand];
        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+eng1+verbsIng[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[0]+sp1+verbosConGerundio[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "You ":
                gene= subjectsEnglish[1]+eng2+ verbsIng[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[1]+sp2+verbosConGerundio[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "He ":
                gene= subjectsEnglish[2]+eng3+verbsIng[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[2]+sp3+verbosConGerundio[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gene= subjectsEnglish[3]+eng3+verbsIng[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[3]+sp3+verbosConGerundio[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "We ":
                gens= subjectsSpanish[4]+sp4+verbosConGerundio[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                gene = subjectsEnglish[4]+eng2+verbsIng[verbRand]+ verbObjects[verbRand][ob2 ];
                break;

            case "They ":
                gene = subjectsEnglish[5]+eng2+verbsIng[verbRand]+verbObjects[verbRand][ob2];
                gens = subjectsSpanish[5]+sp5+verbosConGerundio[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }

    }

    public void GenConj(String conjunction,String conector){
        int pronounRand=  (int)(Math.random()*subjectsEnglish.length);
        int verbRand=  (int)(Math.random()*verbs.length);
        int ob2=  (int)(Math.random()*verbObjects[verbRand].length);
        String pronoun= subjectsEnglish[pronounRand];
        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+verbs[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                gens = subjectsSpanish[0]+verbsSpanishFirstPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;
                break;

            case "You ":
                gene= subjectsEnglish[1]+verbs[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                gens = subjectsSpanish[1]+verbsSpanishSecondPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;
                break;

            case "He ":
                gene= subjectsEnglish[2]+verbsThirdPerson[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                gens = subjectsSpanish[2]+verbsSpanishThirdPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;

                break;

            case "She ":
                gene= subjectsEnglish[3]+verbsThirdPerson[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                gens = subjectsSpanish[3]+verbsSpanishThirdPerson[verbRand]+verbObjectsSpanish[verbRand][ob2 ]+conector;
                break;

            case "We ":
                gens= subjectsSpanish[4]+verbsSpanishFirstPersonPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2]+conector;
                gene = subjectsEnglish[4]+verbs[verbRand]+ verbObjects[verbRand][ob2 ]+conjunction;
                break;

            case "They ":
                gene = subjectsEnglish[5]+verbs[verbRand]+verbObjects[verbRand][ob2]+conjunction;
                gens = subjectsSpanish[5]+verbsSpanishThirdPersonPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;
                break;
        }

    }
    public void GenConjFuture(String conjunction,String conector){
        int pronounRand=  (int)(Math.random()*subjectsEnglish.length);
        int verbRand=  (int)(Math.random()*verbs.length);
        int ob2=  (int)(Math.random()*verbObjects[verbRand].length);
        String pronoun= subjectsEnglish[pronounRand];
        int rand = (int)(Math.random()*2);
        if(rand==0){
            switch (pronoun){
                case "I ":
                    gene= subjectsEnglish[0]+"will " +verbs[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[0]+verbsSpanishFirstPersonFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;
                    break;

                case "You ":
                    gene= subjectsEnglish[1]+"will "+verbs[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[1]+verbsSpanishSecondPersonFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;
                    break;

                case "He ":
                    gene= subjectsEnglish[2]+"will "+verbs[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[2]+verbsSpanishThirdPersonFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;

                    break;

                case "She ":
                    gene= subjectsEnglish[3]+"will "+verbs[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[3]+verbsSpanishThirdPersonFuture[verbRand]+verbObjectsSpanish[verbRand][ob2 ]+conector;
                    break;

                case "We ":
                    gens= subjectsSpanish[4]+verbsSpanishFirstPersonPluralFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2]+conector;
                    gene = subjectsEnglish[4]+"will "+verbs[verbRand]+ verbObjects[verbRand][ob2 ]+conjunction;
                    break;

                case "They ":
                    gene = subjectsEnglish[5]+"will "+verbs[verbRand]+verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[5]+verbsSpanishThirdPersonPluralFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;
                    break;
            }
        }else {
            switch (pronoun){
                case "I ":
                    gene= subjectsEnglish[0]+"won't " +verbs[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[0]+"no "+verbsSpanishFirstPersonFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;
                    break;

                case "You ":
                    gene= subjectsEnglish[1]+"won't "+verbs[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[1]+"no "+ verbsSpanishSecondPersonFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;
                    break;

                case "He ":
                    gene= subjectsEnglish[2]+"won't "+verbs[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[2]+"no "+ verbsSpanishThirdPersonFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;

                    break;

                case "She ":
                    gene= subjectsEnglish[3]+"won't "+verbs[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[3]+"no "+ verbsSpanishThirdPersonFuture[verbRand]+verbObjectsSpanish[verbRand][ob2 ]+conector;
                    break;

                case "We ":
                    gens= subjectsSpanish[4]+"no "+ verbsSpanishFirstPersonPluralFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2]+conector;
                    gene = subjectsEnglish[4]+"won't "+verbs[verbRand]+ verbObjects[verbRand][ob2 ]+conjunction;
                    break;

                case "They ":
                    gene = subjectsEnglish[5]+"won't "+verbs[verbRand]+verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[5]+"no "+ verbsSpanishThirdPersonPluralFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;
                    break;
            }
        }



    }
    public void GenConjFuture2(String conjunction,String conector){
        int pronounRand=  (int)(Math.random()*subjectsEnglish.length);
        int verbRand=  (int)(Math.random()*verbs.length);
        int ob2=  (int)(Math.random()*verbObjects[verbRand].length);
        String pronoun= subjectsEnglish[pronounRand];
        int rand =0;
        if(rand==0){
            switch (pronoun){
                case "I ":
                    gene= subjectsEnglish[0]+"will " +verbs[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[0]+verbsSpanishFirstPersonFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;
                    break;

                case "You ":
                    gene= subjectsEnglish[1]+"will "+verbs[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[1]+verbsSpanishSecondPersonFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;
                    break;

                case "He ":
                    gene= subjectsEnglish[2]+"will "+verbs[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[2]+verbsSpanishThirdPersonFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;

                    break;

                case "She ":
                    gene= subjectsEnglish[3]+"will "+verbs[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[3]+verbsSpanishThirdPersonFuture[verbRand]+verbObjectsSpanish[verbRand][ob2 ]+conector;
                    break;

                case "We ":
                    gens= subjectsSpanish[4]+verbsSpanishFirstPersonPluralFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2]+conector;
                    gene = subjectsEnglish[4]+"will "+verbs[verbRand]+ verbObjects[verbRand][ob2 ]+conjunction;
                    break;

                case "They ":
                    gene = subjectsEnglish[5]+"will "+verbs[verbRand]+verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[5]+verbsSpanishThirdPersonPluralFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;
                    break;
            }
        }else {
            switch (pronoun){
                case "I ":
                    gene= subjectsEnglish[0]+"won't " +verbs[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[0]+"no "+verbsSpanishFirstPersonFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;
                    break;

                case "You ":
                    gene= subjectsEnglish[1]+"won't "+verbs[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[1]+"no "+ verbsSpanishSecondPersonFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;
                    break;

                case "He ":
                    gene= subjectsEnglish[2]+"won't "+verbs[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[2]+"no "+ verbsSpanishThirdPersonFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;

                    break;

                case "She ":
                    gene= subjectsEnglish[3]+"won't "+verbs[verbRand]+ verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[3]+"no "+ verbsSpanishThirdPersonFuture[verbRand]+verbObjectsSpanish[verbRand][ob2 ]+conector;
                    break;

                case "We ":
                    gens= subjectsSpanish[4]+"no "+ verbsSpanishFirstPersonPluralFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2]+conector;
                    gene = subjectsEnglish[4]+"won't "+verbs[verbRand]+ verbObjects[verbRand][ob2 ]+conjunction;
                    break;

                case "They ":
                    gene = subjectsEnglish[5]+"won't "+verbs[verbRand]+verbObjects[verbRand][ob2]+conjunction;
                    gens = subjectsSpanish[5]+"no "+ verbsSpanishThirdPersonPluralFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+conector;
                    break;
            }
        }



    }
    public void GenFuture(){
        int pronounRand=  (int)(Math.random()*subjectsEnglish.length);
        int verbRand=  (int)(Math.random()*verbs.length);
        int ob2=  (int)(Math.random()*verbObjects[verbRand].length);
        String pronoun= subjectsEnglish[pronounRand];
        int rand = 0;
        if(rand==0){
            switch (pronoun){
                case "I ":
                    gene= subjectsEnglish[0]+"will " +verbs[verbRand]+ verbObjects[verbRand][ob2];
                    gens = subjectsSpanish[0]+verbsSpanishFirstPersonFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                    break;

                case "You ":
                    gene= subjectsEnglish[1]+"will "+verbs[verbRand]+ verbObjects[verbRand][ob2];
                    gens = subjectsSpanish[1]+verbsSpanishSecondPersonFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                    break;

                case "He ":
                    gene= subjectsEnglish[2]+"will "+verbs[verbRand]+ verbObjects[verbRand][ob2];
                    gens = subjectsSpanish[2]+verbsSpanishThirdPersonFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                    break;

                case "She ":
                    gene= subjectsEnglish[3]+"will "+verbs[verbRand]+ verbObjects[verbRand][ob2];
                    gens = subjectsSpanish[3]+verbsSpanishThirdPersonFuture[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                    break;

                case "We ":
                    gens= subjectsSpanish[4]+verbsSpanishFirstPersonPluralFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                    gene = subjectsEnglish[4]+"will "+verbs[verbRand]+ verbObjects[verbRand][ob2 ];
                    break;

                case "They ":
                    gene = subjectsEnglish[5]+"will "+verbs[verbRand]+verbObjects[verbRand][ob2];
                    gens = subjectsSpanish[5]+verbsSpanishThirdPersonPluralFuture[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                    break;
            }

        }



    }
    public void GenWould(){
        int pronounRand=  (int)(Math.random()*subjectsEnglish.length);
        int verbRand=  (int)(Math.random()*verbsSpanishHypothetical.length);
        int ob2=  (int)(Math.random()*verbObjects[verbRand].length);
        String pronoun= subjectsEnglish[pronounRand];
        int rand =0;
        if(rand==0){
            switch (pronoun){
                case "I ":
                    gene= subjectsEnglish[0]+"would " +verbs[verbRand]+ verbObjects[verbRand][ob2];
                    gens = subjectsSpanish[0]+verbsSpanishHypothetical[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                    gens2 = subjectsSpanish[0]+verbsSpanishFirstPersonSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                    break;

                case "You ":
                    gene= subjectsEnglish[1]+"would "+verbs[verbRand]+ verbObjects[verbRand][ob2];
                    gens = subjectsSpanish[1]+verbsSpanishHypotheticalSecondPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                    gens2 = subjectsSpanish[1]+verbsSpanishSecondPersonSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                    break;

                case "He ":
                    gene= subjectsEnglish[2]+"would "+verbs[verbRand]+ verbObjects[verbRand][ob2];
                    gens = subjectsSpanish[2]+verbsSpanishHypothetical[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                    // para el wish
                    gens2 = subjectsSpanish[2]+verbsSpanishThirdPersonSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                    break;

                case "She ":
                    gene= subjectsEnglish[3]+"would "+verbs[verbRand]+ verbObjects[verbRand][ob2];
                    gens = subjectsSpanish[3]+verbsSpanishHypothetical[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                    // para el wish
                    gens2 = subjectsSpanish[3]+verbsSpanishThirdPersonSubjunctive[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                    break;

                case "We ":
                    gens= subjectsSpanish[4]+verbsSpanishHypotheticalFirstPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                    // para el wish
                    gens2= subjectsSpanish[4]+verbsSpanishFirstPersonPluralSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2];

                    gene = subjectsEnglish[4]+"would "+verbs[verbRand]+ verbObjects[verbRand][ob2 ];
                    break;

                case "They ":
                    gene = subjectsEnglish[5]+"would "+verbs[verbRand]+verbObjects[verbRand][ob2];
                    gens = subjectsSpanish[5]+verbsSpanishHypotheticalThirdPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                    //para el wish
                    gens2 = subjectsSpanish[5]+verbsSpanishThirdPersonPluralSubjunctive[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                    break;
            }

        }



    }
    public void GenPresSimpModals(String modalEng,String ModalSp1,String Modalsp2,String Modalsp3,String modalsp4,String modalsp5){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*verbs.length);
        int objRand=(int)(Math.random()*verbObjects.length);
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        String pronoun= subjectsEnglish[pronounRand];
        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+modalEng+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[0]+ModalSp1+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "You ":
                gene= subjectsEnglish[1]+modalEng+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[1]+Modalsp2+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "He ":
                gene= subjectsEnglish[2]+modalEng+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[2]+Modalsp3+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gene= subjectsEnglish[3]+modalEng+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[3]+Modalsp3+verbsSpanish[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "We ":
                gens= subjectsSpanish[4]+modalsp4+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                gene = subjectsEnglish[4]+modalEng+verbs[verbRand]+ verbObjects[verbRand][ob2 ];
                break;

            case "They ":
                gene = subjectsEnglish[5]+modalEng+verbs[verbRand]+verbObjects[verbRand][ob2];
                gens = subjectsSpanish[5]+modalsp5+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }
    }
    public void GenUsedToPastImp(String modalEng,String ModalSp1,String Modalsp2,String Modalsp3,String modalsp4,String modalsp5){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*verbs.length);
        int objRand=(int)(Math.random()*verbObjects.length);
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        String pronoun= subjectsEnglish[pronounRand];


        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+modalEng+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[0]+ModalSp1+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                gens2 = subjectsSpanish[0]+verbsSpanishFirstPersonPastImperfect[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];


                break;

            case "You ":
                gene= subjectsEnglish[1]+modalEng+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[1]+Modalsp2+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                gens2 = subjectsSpanish[1]+verbsSpanishSecondPersonPastImperfect[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "He ":
                gene= subjectsEnglish[2]+modalEng+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[2]+Modalsp3+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                gens2 = subjectsSpanish[2]+verbsSpanishFirstPersonPastImperfect[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gene= subjectsEnglish[3]+modalEng+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[3]+Modalsp3+verbsSpanish[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                gens2 = subjectsSpanish[3]+verbsSpanishFirstPersonPastImperfect[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "We ":
                gene = subjectsEnglish[4]+modalEng+verbs[verbRand]+ verbObjects[verbRand][ob2 ];

                gens= subjectsSpanish[4]+modalsp4+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                gens2= subjectsSpanish[4]+verbsSpanishFirstPersonPluralPastImperfect[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                break;

            case "They ":
                gene = subjectsEnglish[5]+modalEng+verbs[verbRand]+verbObjects[verbRand][ob2];

                gens = subjectsSpanish[5]+modalsp5+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                gens2 = subjectsSpanish[5]+verbsSpanishThirdPersonPluralPastImperfect[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }
    }
    public void GenHaveTo(String modalEng,String modalEng3,String ModalSp1,String Modalsp2,String Modalsp3,String modalsp4,String modalsp5){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*verbs.length);
        int objRand=(int)(Math.random()*verbObjects.length);
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        String pronoun= subjectsEnglish[pronounRand];

        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+modalEng+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[0]+ModalSp1+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "You ":
                gene= subjectsEnglish[1]+modalEng+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[1]+Modalsp2+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "He ":
                gene= subjectsEnglish[2]+modalEng3+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[2]+Modalsp3+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gene= subjectsEnglish[3]+modalEng3+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[3]+Modalsp3+verbsSpanish[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "We ":
                gens= subjectsSpanish[4]+modalsp4+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                gene = subjectsEnglish[4]+modalEng+verbs[verbRand]+ verbObjects[verbRand][ob2 ];
                break;

            case "They ":
                gene = subjectsEnglish[5]+modalEng+verbs[verbRand]+verbObjects[verbRand][ob2];
                gens = subjectsSpanish[5]+modalsp5+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }
    }

    public void GenGoingTo(String modalEng1,String modalEng2,String modalEng3,String ModalSp1,String Modalsp2,String Modalsp3,String modalsp4,String modalsp5){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*verbs.length);
        int objRand=(int)(Math.random()*verbObjects.length);
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        String pronoun= subjectsEnglish[pronounRand];
        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+modalEng1+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[0]+ModalSp1+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "You ":
                gene= subjectsEnglish[1]+modalEng2+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[1]+Modalsp2+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "He ":
                gene= subjectsEnglish[2]+modalEng3+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[2]+Modalsp3+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gene= subjectsEnglish[3]+modalEng3+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[3]+Modalsp3+verbsSpanish[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "We ":
                gens= subjectsSpanish[4]+modalsp4+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                gene = subjectsEnglish[4]+modalEng2+verbs[verbRand]+ verbObjects[verbRand][ob2 ];
                break;

            case "They ":
                gene = subjectsEnglish[5]+modalEng2+verbs[verbRand]+verbObjects[verbRand][ob2];
                gens = subjectsSpanish[5]+modalsp5+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }
    }
    public void GenFeelLike(String modalEng1,String modalEng2,String modalEng3,String ModalSp1,String Modalsp2,String Modalsp3,String modalsp4,String modalsp5){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*verbs.length);
        int objRand=(int)(Math.random()*verbObjects.length);
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        String pronoun= subjectsEnglish[pronounRand];
        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+modalEng1+verbsIng[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[0]+ModalSp1+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "You ":
                gene= subjectsEnglish[1]+modalEng2+verbsIng[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[1]+Modalsp2+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "He ":
                gene= subjectsEnglish[2]+modalEng3+verbsIng[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[2]+Modalsp3+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gene= subjectsEnglish[3]+modalEng3+verbsIng[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[3]+Modalsp3+verbsSpanish[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "We ":
                gens= subjectsSpanish[4]+modalsp4+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                gene = subjectsEnglish[4]+modalEng1+verbsIng[verbRand]+ verbObjects[verbRand][ob2 ];
                break;

            case "They ":
                gene = subjectsEnglish[5]+modalEng1+verbsIng[verbRand]+verbObjects[verbRand][ob2];
                gens = subjectsSpanish[5]+modalsp5+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }
    }
    public void GenBeUsedTo(String modalEng1,String modalEng2,String modalEng3,String modalEng4,String ModalSp1,String Modalsp2,String Modalsp3,String Modalsp3f,String modalsp4,String modalsp5){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*verbs.length);
        int objRand=(int)(Math.random()*verbObjects.length);
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        String pronoun= subjectsEnglish[pronounRand];
        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+modalEng1+verbsIng[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[0]+ModalSp1+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "You ":
                gene= subjectsEnglish[1]+modalEng2+verbsIng[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[1]+Modalsp2+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "He ":
                gene= subjectsEnglish[2]+modalEng3+verbsIng[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[2]+Modalsp3+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gene= subjectsEnglish[3]+modalEng3+verbsIng[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[3]+Modalsp3f+verbsSpanish[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "We ":
                gens= subjectsSpanish[4]+modalsp4+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                gene = subjectsEnglish[4]+modalEng4+verbsIng[verbRand]+ verbObjects[verbRand][ob2 ];
                break;

            case "They ":
                gene = subjectsEnglish[5]+modalEng4+verbsIng[verbRand]+verbObjects[verbRand][ob2];
                gens = subjectsSpanish[5]+modalsp5+verbsSpanish[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }
    }

    public void GenPresSimpPrepasAdv(String preposition,String preposicion){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*verbsWithPrepositionsSecondPersonSingular.length);

        String pronoun= subjectsEnglish[pronounRand];

        switch (pronoun){
            case "I ":
                gene = subjectsEnglish[0]+verbsWithPrepositions[verbRand]+preposition;
                gens = subjectsSpanish[0]+verbsWithPrepositionsFirstPersonSingular[verbRand]+preposicion;
                break;

            case "You ":
                gene= subjectsEnglish[1]+verbsWithPrepositions[verbRand]+preposition;
                gens = subjectsSpanish[1]+verbsWithPrepositionsSecondPersonSingular[verbRand]+preposicion;
                break;

            case "He ":
                gene= subjectsEnglish[2]+verbsWithPrepositionsThirdPerson[verbRand]+preposition;
                gens = subjectsSpanish[2]+verbsWithPrepositionsThirdPersonSingular[verbRand]+preposicion;

                break;

            case "She ":
                gene= subjectsEnglish[3]+verbsWithPrepositionsThirdPerson[verbRand]+preposition;
                gens = subjectsSpanish[3]+verbsWithPrepositionsThirdPersonSingular[verbRand]+preposicion;
                break;

            case "We ":
                gens= subjectsSpanish[4]+verbsWithPrepositionsFirstPersonPlural[verbRand]+preposicion;
                gene = subjectsEnglish[4]+verbsWithPrepositions[verbRand]+preposition;
                break;

            case "They ":
                gene = subjectsEnglish[5]+verbsWithPrepositions[verbRand]+preposition;
                gens = subjectsSpanish[5]+verbsWithPrepositionsThirdPersonPlural[verbRand]+preposicion;
                break;
        }
    }
    public void GenPresSimpAdverbs(String adverb,String adverbio){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*verbs.length);
        int objRand=(int)(Math.random()*verbObjects.length);
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        String pronoun= subjectsEnglish[pronounRand];


        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+adverb+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[0]+adverbio+verbsSpanishFirstPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "You ":
                gene= subjectsEnglish[1]+adverb+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[1]+adverbio+verbsSpanishSecondPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "He ":
                gene= subjectsEnglish[2]+adverb+verbsThirdPerson[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[2]+adverbio+verbsSpanishThirdPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gene= subjectsEnglish[3]+adverb+verbsThirdPerson[verbRand]+ verbObjects[verbRand][ob2];
                gens = subjectsSpanish[3]+adverbio+verbsSpanishThirdPerson[verbRand]+verbObjectsSpanish[verbRand][ob2 ];
                break;

            case "We ":
                gens= subjectsSpanish[4]+adverbio+verbsSpanishFirstPersonPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                gene = subjectsEnglish[4]+adverb+verbs[verbRand]+ verbObjects[verbRand][ob2 ];
                break;

            case "They ":
                gene = subjectsEnglish[5]+adverb+verbs[verbRand]+verbObjects[verbRand][ob2];
                gens = subjectsSpanish[5]+adverbio+verbsSpanishThirdPersonPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }
    }
    public void   GenPresSimpAdverbs2(String adverb,String adverbio){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*verbs.length);
        int objRand=(int)(Math.random()*verbObjects.length);
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        String pronoun= subjectsEnglish[pronounRand];
        if(!adverb.equals("together ")){
            switch (pronoun){
                case "I ":
                    gene= subjectsEnglish[0]+verbs[verbRand]+ verbObjects[verbRand][ob2]+adverb;
                    gens = subjectsSpanish[0]+verbsSpanishFirstPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+adverbio;
                    break;

                case "You ":
                    gene= subjectsEnglish[1]+verbs[verbRand]+ verbObjects[verbRand][ob2]+adverb;
                    gens = subjectsSpanish[1]+verbsSpanishSecondPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+adverbio;
                    break;

                case "He ":
                    gene= subjectsEnglish[2]+verbsThirdPerson[verbRand]+ verbObjects[verbRand][ob2]+adverb;
                    gens = subjectsSpanish[2]+verbsSpanishThirdPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+adverbio;

                    break;

                case "She ":
                    gene= subjectsEnglish[3]+verbsThirdPerson[verbRand]+ verbObjects[verbRand][ob2]+adverb;
                    gens = subjectsSpanish[3]+verbsSpanishThirdPerson[verbRand]+verbObjectsSpanish[verbRand][ob2 ]+adverbio;
                    break;

                case "We ":
                    gens= subjectsSpanish[4]+verbsSpanishFirstPersonPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2]+adverbio;
                    gene = subjectsEnglish[4]+verbs[verbRand]+ verbObjects[verbRand][ob2 ]+adverb;
                    break;

                case "They ":
                    gene = subjectsEnglish[5]+verbs[verbRand]+verbObjects[verbRand][ob2]+adverb;
                    gens = subjectsSpanish[5]+verbsSpanishThirdPersonPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+adverbio;
                    break;
            }
        }else {
            gene = "they "+verbs[verbRand]+verbObjects[verbRand][ob2]+adverb;
            gens = "ellos "+verbsSpanishThirdPersonPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+adverbio;
        }


    }
    public void   GenPresSimpAdverbs2NoObject(String adverb,String adverbio){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*verbs.length);
        int objRand=(int)(Math.random()*verbObjects.length);
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        String pronoun= subjectsEnglish[pronounRand];
        if(!adverb.equals("together ")){
            switch (pronoun){
                case "I ":
                    gene= subjectsEnglish[0]+verbs[verbRand]+adverb;
                    gens = subjectsSpanish[0]+verbsSpanishFirstPerson[verbRand]+adverbio;
                    break;

                case "You ":
                    gene= subjectsEnglish[1]+verbs[verbRand]+adverb;
                    gens = subjectsSpanish[1]+verbsSpanishSecondPerson[verbRand]+adverbio;
                    break;

                case "He ":
                    gene= subjectsEnglish[2]+verbsThirdPerson[verbRand]+adverb;
                    gens = subjectsSpanish[2]+verbsSpanishThirdPerson[verbRand]+adverbio;

                    break;

                case "She ":
                    gene= subjectsEnglish[3]+verbsThirdPerson[verbRand]+adverb;
                    gens = subjectsSpanish[3]+verbsSpanishThirdPerson[verbRand]+adverbio;
                    break;

                case "We ":
                    gens= subjectsSpanish[4]+verbsSpanishFirstPersonPlural[verbRand]+adverbio;
                    gene = subjectsEnglish[4]+verbs[verbRand]+adverb;
                    break;

                case "They ":
                    gene = subjectsEnglish[5]+verbs[verbRand]+adverb;
                    gens = subjectsSpanish[5]+verbsSpanishThirdPersonPlural[verbRand]+adverbio;
                    break;
            }
        }else {
            gene = "they "+verbs[verbRand]+verbObjects[verbRand][ob2]+adverb;
            gens = "ellos "+verbsSpanishThirdPersonPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2 ]+adverbio;
        }


    }
    public void GenPresSimpAdverbs3(String adverb, String adverbio) {
        int pronounRand = (int) (Math.random() * subjectsEnglish.length);
        int verbRand = (int) (Math.random() * verbs.length);
        int objRand = (int) (Math.random() * verbObjects.length);
        int ob2 = (int) (Math.random() * verbObjects[objRand].length);
        String pronoun = subjectsEnglish[pronounRand];

        switch (pronoun) {
            case "I ":
                gene = adverb + subjectsEnglish[0] + verbs[verbRand] + verbObjects[verbRand][ob2];
                gens = adverbio + subjectsSpanish[0] + verbsSpanishFirstPerson[verbRand] + verbObjectsSpanish[verbRand][ob2];
                break;

            case "You ":
                gene = adverb + subjectsEnglish[1] + verbs[verbRand] + verbObjects[verbRand][ob2];
                gens = adverbio + subjectsSpanish[1] + verbsSpanishSecondPerson[verbRand] + verbObjectsSpanish[verbRand][ob2];
                break;

            case "He ":
                // Note: The original code seems to have a mistake by placing adverbio in the English sentence and adverb in the Spanish one.
                // Assuming it's a mistake and reversing it here to match the function parameters with language.
                gene = adverb + subjectsEnglish[2] + verbsThirdPerson[verbRand] + verbObjects[verbRand][ob2];
                gens = adverbio + subjectsSpanish[2] + verbsSpanishThirdPerson[verbRand] + verbObjectsSpanish[verbRand][ob2];
                break;

            case "She ":
                gene = adverb + subjectsEnglish[3] + verbsThirdPerson[verbRand] + verbObjects[verbRand][ob2];
                gens = adverbio + subjectsSpanish[3] + verbsSpanishThirdPerson[verbRand] + verbObjectsSpanish[verbRand][ob2];
                break;

            case "We ":
                gene = adverb + subjectsEnglish[4] + verbs[verbRand] + verbObjects[verbRand][ob2];
                gens = adverbio + subjectsSpanish[4] + verbsSpanishFirstPersonPlural[verbRand] + verbObjectsSpanish[verbRand][ob2];
                break;

            case "They ":
                gene = adverb + subjectsEnglish[5] + verbs[verbRand] + verbObjects[verbRand][ob2];
                gens = adverbio + subjectsSpanish[5] + verbsSpanishThirdPersonPlural[verbRand] + verbObjectsSpanish[verbRand][ob2];
                break;
        }
    }
    public void GenIntPorSujeto(){
        int pronounRand= (int)(Math.random()*subjectsEnglish.length);
        int verbRand= (int)(Math.random()*verbs.length);
        int objRand=(int)(Math.random()*verbObjects.length);
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        String pronoun= subjectsEnglish[pronounRand];

        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gene2= ".";
                gens = verbsSpanishFirstPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                break;

            case "You ":
                gene= subjectsEnglish[1]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gene2= ".";
                gens =verbsSpanishSecondPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                break;

            case "He ":
                gene= subjectsEnglish[2]+verbsThirdPerson[verbRand]+ verbObjects[verbRand][ob2];
                gene2= subjectsEnglish[3]+verbsThirdPerson[verbRand]+ verbObjects[verbRand][ob2];
                gens = verbsSpanishThirdPerson[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                break;

            case "She ":
                gene= subjectsEnglish[3]+verbsThirdPerson[verbRand]+ verbObjects[verbRand][ob2];
                gene2= subjectsEnglish[2]+verbsThirdPerson[verbRand]+ verbObjects[verbRand][ob2];
                gens = verbsSpanishThirdPerson[verbRand]+verbObjectsSpanish[verbRand][ob2];
                break;

            case "We ":
                gens= verbsSpanishFirstPersonPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                gene = subjectsEnglish[4]+verbs[verbRand]+ verbObjects[verbRand][ob2];
                gene2= ".";
                break;

            case "They ":
                gene = subjectsEnglish[5]+verbs[verbRand]+verbObjects[verbRand][ob2];
                gene2= ".";
                gens = verbsSpanishThirdPersonPlural[verbRand]+ verbObjectsSpanish[verbRand][ob2];
                break;
        }
    }

    public void GenPresSimp(String pronounparm, int verbpos){
        int objRand=(int)(Math.random()*verbObjects.length);
        int verbRand= (int)(Math.random()*verbs.length);
        String pronoun= pronounparm;
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        switch (pronoun){
            case "I ":
                gene= subjectsEnglish[0]+verbs[verbpos]+ verbObjects[verbpos][ob2];
                gens = subjectsSpanish[0]+verbsSpanishFirstPerson[verbpos]+ verbObjectsSpanish[verbpos][ob2 ];
                break;

            case "You ":
                gene= subjectsEnglish[1]+verbs[verbpos]+ verbObjects[verbpos][ob2];
                gens = subjectsSpanish[1]+verbsSpanishSecondPerson[verbpos]+ verbObjectsSpanish[verbpos][ob2 ];
                break;

            case "He ":
                gene= subjectsEnglish[2]+verbsThirdPerson[verbpos]+ verbObjects[verbpos][ob2];
                gens = subjectsSpanish[2]+verbsSpanishThirdPerson[verbpos]+ verbObjectsSpanish[verbpos][ob2 ];

                break;

            case "She ":
                gene= subjectsEnglish[3]+verbsThirdPerson[verbpos]+ verbObjects[verbpos][ob2];
                gens = subjectsSpanish[3]+verbsSpanishThirdPerson[verbpos]+verbObjectsSpanish[verbpos][ob2 ];
                break;

            case "We ":
                gens= subjectsSpanish[4]+verbsSpanishFirstPersonPlural[verbpos]+ verbObjectsSpanish[verbpos][ob2];
                gene = subjectsEnglish[4]+verbs[verbpos]+ verbObjects[verbpos][ob2 ];
                break;

            case "They ":
                gene = subjectsEnglish[5]+verbs[verbpos]+verbObjects[verbpos][ob2];
                gens = subjectsSpanish[5]+verbsSpanishThirdPersonPlural[verbpos]+ verbObjectsSpanish[verbpos][ob2 ];
                break;
        }
    }
    public void genVerbAndObject(String object,String objeto){
        int r = (int)(Math.random()*verbsSpanishThirdPerson.length);
        int ob2= (int)(Math.random()*verbObjects[r].length);

        if(object.equals("the news ")){
            gens = objeto + verbsSpanishThirdPersonPlural[r]+verbObjectsSpanish[r][ob2];
            gene = object +verbs[r]+verbObjects[r][ob2];
        }else if(object.equals("the people ")){
            gens = objeto + verbsSpanishThirdPerson[r]+verbObjectsSpanish[r][ob2];
            gene = object +verbs[r]+verbObjects[r][ob2];
        } else {
            gens = objeto + verbsSpanishThirdPerson[r]+verbObjectsSpanish[r][ob2];
            gene = object +verbsThirdPerson[r]+verbObjects[r][ob2];

        }

    }




}
