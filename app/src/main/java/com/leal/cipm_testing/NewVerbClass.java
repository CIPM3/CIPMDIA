package com.leal.cipm_testing;

import java.util.Arrays;

public class NewVerbClass {

    String[] verbs = {
            "have ", "do ", "say ", "go ", "get ",
            "make ", "know ", "think ", "see ", "take ",
            "come ", "want ", "look ", "use ", "find ",
            "give ", "tell ", "work ", "call ",  "try ",
            "ask ", "need ", "feel ", "become ", "leave ",
            "put ", "mean ",
            "let ", "keep ", "begin ", "seem ", "talk ",
            "turn ", "help ", "start ", "show ", "hear ",
            "run ", "play ", "move ", "like ",
            "believe ", "hold ", "live ", "happen ",
            "bring ", "write ", "provide ", "sit ", "stand ",
            "lose ", "meet ", "pay ", "include ",
            "continue ", "change ", "set ", "lead ",
            "learn ", "understand ", "watch ", "follow ",
            "stop ", "speak ", "create ", "allow ",
            "read ", "spend ", "add ", "grow ", "open ",
            "walk ", "offer ", "remember ", "win ",
            "appear ", "consider ", "love ", "buy ",
            "wait ", "die ", "send ", "expect ", "serve ",
            "stay ", "build ", "fall ", "cut ", "kill ",
            "reach ", "remain ", "suggest ",
            "raise ", "pass ", "sell ", "require ",
            "decide ", "report ", "return ", "pull ",
            "explain ", "carry ", "develop ", "hope ",
            "drive ", "break " };

            String[] verbsThirdPerson = {
        "has ", "does ", "says ", "goes ", "gets ", "makes ", "knows ", "thinks ", "sees ", "takes ", "comes ", "wants ", "looks ", "uses ", "finds ",
                "gives ", "tells ", "works ", "calls ",  "tries ", "asks ", "needs ", "feels ", "becomes ", "leaves ", "puts ", "means ",
                "lets ", "keeps ", "begins ", "seems ", "talks ", "turns ", "helps ", "starts ", "shows ", "hears ", "runs ", "plays ", "moves ", "likes ",
                "believes ", "holds ", "lives ", "happens ", "brings ", "writes ", "provides ", "sits ", "stands ", "loses ", "meets ", "pays ", "includes ",
                "continues ", "changes ", "sets ", "leads ", "learns ", "understands ", "watches ", "follows ", "stops ", "speaks ", "creates ", "allows ",
                "reads ", "spends ", "adds ", "grows ", "opens ", "walks ", "offers ", "remembers ", "wins ", "appears ", "considers ", "loves ", "buys ",
                "waits ", "dies ", "sends ", "expects ", "serves ", "stays ", "builds ", "falls ", "cuts ", "kills ", "reaches ", "remains ", "suggests ",
                "raises ", "passes ", "sells ", "requires ", "decides ", "reports ", "returns ", "pulls ", "explains ", "carries ", "develops ", "hopes ",
                "drives ", "breaks "
    };
    String[] verbsSpanishFirstPerson = {
            "tengo ", // have (tener)
            "hago ", // do (hacer)
            "digo ", // say (decir)
            "voy ", // go (ir)
            "obtengo ", // get (obtener)
            "hago ", // make (hacer)
            "sé", // know (saber)
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
            "significo ", // mean (significar)

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
            "ocurre ", // happen (ocurrir)

            "traigo ", // bring (traer)
            "escribo ", // write (escribir)
            "proporciono ", // provide (proporcionar)
            "me siento ", // sit (sentarse)

            "estoy de pie ", // stand (estar de pie)
            "pierdo ", // lose (perder)

            "encuentro ", // meet (encontrar)
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

            "detengo ", // stop (detener)
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
            "vuelvo ", // return (volver)
            "tiro ", // pull (tirar)

            "explico ", // explain (explicar)
            "llevo ", // carry (llevar)
            "desarrollo ", // develop (desarrollar)
            "espero ", // hope (esperar)
            "conduzco ", // drive (conducir)
            "rompo " // break (romper)
    };
    String[] verbsSpanishSecondPerson = {
            "tienes ", "haces ", "dices ", "vas ", "obtienes ", "haces ", "sabes ", "piensas ", "ves ", "tomas ",
            "vienes ", "quieres ", "miras ", "usas ", "encuentras ", "das ", "dices ", "trabajas ", "llamas ",
            "intentas ", "preguntas ", "necesitas ", "sientes ", "te vuelves ", "dejas ", "pones ", "significas ",
            "dejas ", "mantienes ", "empiezas ", "pareces ", "hablas ", "giras ", "ayudas ", "empiezas ", "muestras ",
            "oyes ", "corres ", "juegas ", "mueves ", "gustas ", "crees ", "sostienes ", "vives ", "ocurre ",
            "traes ", "escribes ", "proporcionas ", "te sientas ", "estás de pie ", "pierdes ", "encuentras ", "pagas ",
            "incluyes ", "continúas ", "cambias ", "pones ", "lideras ", "aprendes ", "entiendes ", "miras ", "sigues ",
            "detienes ", "hablas ", "creas ", "permites ", "lees ", "gastas ", "añades ", "creces ", "abres ", "caminas ",
            "ofreces ", "recuerdas ", "ganas ", "apareces ", "consideras ", "amas ", "compras ", "esperas ", "mueres ",
            "envías ", "esperas ", "sirves ", "te quedas ", "construyes ", "caes ", "cortas ", "matas ", "alcanzas ",
            "permaneces ", "sugieres ", "elevas ", "pasas ", "vendes ", "requieres ", "decides ", "informas ", "vuelves ",
            "tiras ", "explicas ", "llevas ", "desarrollas ", "esperas ", "conduces ", "rompes "
    };


    String[] verbsSpanishThirdPerson = {
            "tiene ", "hace ", "dice ", "va ", "obtiene ", "hace ", "sabe ", "piensa ", "ve ", "toma ",
            "viene ", "quiere ", "mira ", "usa ", "encuentra ", "da ", "dice ", "trabaja ", "llama ",
            "intenta ", "pregunta ", "necesita ", "siente ", "se vuelve ", "deja ", "pone ", "significa ",
            "deja ", "mantiene ", "empieza ", "parece ", "habla ", "gira ", "ayuda ", "empieza ", "muestra ",
            "oye ", "corre ", "juega ", "mueve ", "gusta ", "cree ", "sostiene ", "vive ", "ocurre ",
            "trae ", "escribe ", "proporciona ", "se sienta ", "está de pie ", "pierde ", "encuentra ", "paga ",
            "incluye ", "continúa ", "cambia ", "pone ", "lidera ", "aprende ", "entiende ", "mira ", "sigue ",
            "detiene ", "habla ", "crea ", "permite ", "lee ", "gasta ", "añade ", "crece ", "abre ", "camina ",
            "ofrece ", "recuerda ", "gana ", "aparece ", "considera ", "ama ", "compra ", "espera ", "muere ",
            "envía ", "espera ", "sirve ", "se queda ", "construye ", "cae ", "corta ", "mata ", "alcanza ",
            "permanece ", "sugiere ", "eleva ", "pasa ", "vende ", "requiere ", "decide ", "informa ", "vuelve ",
            "tira ", "explica ", "lleva ", "desarrolla ", "espera ", "conduce ", "rompe "
    };
    String[] verbsSpanishThirdPersonPlural = {
            "tienen ", "hacen ", "dicen ", "van ", "obtienen ", "hacen ", "saben ", "piensan ", "ven ", "toman ",
            "vienen ", "quieren ", "miran ", "usan ", "encuentran ", "dan ", "dicen ", "trabajan ", "llaman ",
            "intentan ", "preguntan ", "necesitan ", "sienten ", "se vuelven ", "dejan ", "ponen ", "significan ",
            "dejan ", "mantienen ", "empiezan ", "parecen ", "hablan ", "giran ", "ayudan ", "empiezan ", "muestran ",
            "oyen ", "corren ", "juegan ", "mueven ", "gustan ", "creen ", "sostienen ", "viven ", "ocurre ",
            "traen ", "escriben ", "proporcionan ", "se sientan ", "están de pie ", "pierden ", "encuentran ", "pagan ",
            "incluyen ", "continúan ", "cambian ", "ponen ", "lideran ", "aprenden ", "entienden ", "miran ", "siguen ",
            "detienen ", "hablan ", "crean ", "permiten ", "leen ", "gastan ", "añaden ", "crecen ", "abren ", "caminan ",
            "ofrecen ", "recuerdan ", "ganan ", "aparecen ", "consideran ", "aman ", "compran ", "esperan ", "mueren ",
            "envían ", "esperan ", "sirven ", "se quedan ", "construyen ", "caen ", "cortan ", "matan ", "alcanzan ",
            "permanecen ", "sugieren ", "elevan ", "pasan ", "venden ", "requieren ", "deciden ", "informan ", "vuelven ",
            "tiran ", "explican ", "llevan ", "desarrollan ", "esperan ", "conducen ", "rompen "
    };
    String[] verbsSpanishFirstPersonPlural = {
            "tenemos ", "hacemos ", "decimos ", "vamos ", "obtenemos ", "hacemos ", "sabemos ", "pensamos ", "vemos ", "tomamos ",
            "venimos ", "queremos ", "miramos ", "usamos ", "encontramos ", "damos ", "decimos ", "trabajamos ", "llamamos ",
            "intentamos ", "preguntamos ", "necesitamos ", "sentimos ", "nos volvemos ", "dejamos ", "ponemos ", "significamos ",
            "dejamos ", "mantenemos ", "empezamos ", "parecemos ", "hablamos ", "giramos ", "ayudamos ", "empezamos ", "mostramos ",
            "oímos ", "corremos ", "jugamos ", "movemos ", "gustamos ", "creemos ", "sostenemos ", "vivimos ", "ocurre ",
            "traemos ", "escribimos ", "proporcionamos ", "nos sentamos ", "estamos de pie ", "perdemos ", "encontramos ", "pagamos ",
            "incluimos ", "continuamos ", "cambiamos ", "ponemos ", "lideramos ", "aprendemos ", "entendemos ", "miramos ", "seguimos ",
            "detenemos ", "hablamos ", "creamos ", "permitimos ", "leemos ", "gastamos ", "añadimos ", "crecemos ", "abrimos ", "caminamos ",
            "ofrecemos ", "recordamos ", "ganamos ", "aparecemos ", "consideramos ", "amamos ", "compramos ", "esperamos ", "morimos ",
            "enviamos ", "esperamos ", "servimos ", "nos quedamos ", "construimos ", "caemos ", "cortamos ", "matamos ", "alcanzamos ",
            "permanecemos ", "sugerimos ", "elevamos ", "pasamos ", "vendemos ", "requerimos ", "decidimos ", "informamos ", "volvemos ",
            "tiramos ", "explicamos ", "llevamos ", "desarrollamos ", "esperamos ", "conducimos ", "rompemos "
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
            {"a hug ", "money ", "to talk to you", "to ask something ","love "},

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
            {"the kids run ", "the past go ", "people in ", "go ", "things happen"},
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
            {"a chair ", "house ", "the car ", "furniture ", "abroad "},

            // Objects for "to like "
            {"music ", "food ", "traveling ", "reading ", "sports "},

            // Objects for "to believe "
            {"in ghosts ", "a story ", "in yourself ", "in love ", "in science "},
            //hold
            {"a meeting ", "a record ", "an opinion ", "a ceremony ", "hands "},

            // Objects for "to live "
            {"in a city ", "with family ", "an adventure ", "a life ", "alone "},

            // Objects for "to happen "
            {"an accident ", "a miracle ", "a change ", "an event ", "a situation "},

            // Objects for "to bring "
            {"joy ", "a friend ", "a gift ", "news ", "supplies "},

            // Objects for "to write "
            {"a letter ", "a book ", "an email ", "a report ", "a story "},

            // Objects for "to provide "
            {"support ", "information ", "a service ", "help ", "evidence "},

            // Objects for "to sit "
            {"on a chair ", "on the floor ", "in a meeting ", "at the table ", "by the window "},

            // Objects for "to stand "
            {"in line ", "up ", "for a cause ", "at the door ", "by someone "},

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
            {"the car ", "working ", "smoking ", "the music ", "worrying "},

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
            {"plants ", "tired ", "a business ", "older ", "closer "},

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
            {"on TV", "in a movie ", "at an event ", "in court ", "suddenly "},

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
            {"calm", "in place ", "silent", "unchanged", "a mystery"},
            //suggest
            {"a plan", "an idea", "improvements", "a meeting", "a solution"},
            //raise
            {"funds", "awareness", "a child", "the roof", "a question"},

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
            {"a door ", "strings ", "away ", "up ", "towards you"},

            // Objects for "to explain "
            {"a theory ", "a situation ", "a joke ", "a process ", "your reasoning "},

            // Objects for "to carry "
            {"a bag ", "responsibility ", "a child ", "goods ", "a message "},

            // Objects for "to develop "
            {"a skill ", "a film ", "a plan ", "a relationship ", "software "},

            // Objects for "to hope "
            {"for the best ", "to win ", "for recovery ", "to see you again ", "for success "},

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
            {"a los niños correr ", "el pasado ir ", "gente entrar ", "ir ", "que las cosas sucedan"},
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

            // Objetos para "ocurrir "
            {"un accidente ", "un milagro ", "un cambio ", "un evento ", "una situación "},

            // Objetos para "traer "
            {"alegría ", "un amigo ", "un regalo ", "noticias ", "suministros "},

            // Objetos para "escribir "
            {"una carta ", "un libro ", "un correo electrónico ", "un informe ", "una historia "},

            // Objetos para "proporcionar "
            {"apoyo ", "información ", "un servicio ", "ayuda ", "evidencia "},

            // Objetos para "sentarse "
            {"en una silla ", "en el suelo ", "en una reunión ", "en la mesa ", "junto a la ventana "},

            // Objetos para "estar de pie "
            {"en la fila ", "de pie ", "por una causa ", "en la puerta ", "al lado de alguien "},

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
             {"el coche ", "trabajando", "fumando", "la música", "preocupándose "},

    // Objects for "to speak"
    {"la verdad", "suavemente ", "públicamente ", "sobre un problema", "un idioma"},

    // Objects for "to create "
     {"arte ", "un sitio web", "música", "un plan", "una historia"},

    // Objects for "to allow"
     {"entrada", "libertad", "un descanso", "un error", "mascotas"},

    // Objects for "to read"
    {"un libro", "una revista", "el ambiente ", "en el sofá", "bien"},

    // Objects for "to spend"
    {"dinero", "tiempo", "energía", "las vacaciones", "esfuerzo"},

    // Objects for "to add"
     {"azúcar", "detalles", "un comentario", "sabor", "valor"},

               // Objects for "to grow"
              {"plantas", "cansado", "un negocio", "mayor", "más cercano"},

              // Objects for "to open"
                {"una puerta", "una ventana", "un negocio", "un libro", "una cuenta"},

                // Objects for "to walk"
                  {"el perro", "en el parque ", "a la escuela", "a casa", "una larga distancia"},

               // Objects for "to offer"
              {"ayuda", "un trabajo", "un regalo", "consejo", "un descuento"},

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
             {"calma", "en su lugar", "silencioso", "sin cambios", "un misterio"},
             //suggest
             {"un plan", "una idea", "mejoras", "una reunión", "una solución"},
              //raise
             {"fondos", "conciencia", "un niño", "el techo", "una pregunta"},

             // Objetos para "pasar "
            {"una prueba ", "el balón ", "por un lugar ", "una ley ", "tradiciones "},

            // Objetos para "vender "
            {"una casa ", "un coche ", "productos ", "entradas ", "arte "},

            // Objetos para "requerir "
            {"aprobación ", "una licencia ", "esfuerzo ", "paciencia ", "una contraseña "},

            // Objetos para "decidir "
            {"sobre un destino ", "irse ", "sobre un curso de acción ", "en contra ", "a favor "},

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
            {"lo mejor ", "ganar ", "la recuperación ", "verte de nuevo ", "el éxito "},

            // Objetos para "conducir "
            {"un coche ", "a la locura ", "una iniciativa ", "a casa ", "crecimiento "},
            // Objects for "to break "
            {"un record ", "la ley ", "un habito ", "el silencio ", "un corazon "}
    };
    private  String[] subjectsEnglish = {"I ", "You ", "He ", "She ", "We ", "They "};
    private  String[] subjectsSpanish = {"Yo ", "Tú ", "Él ", "Ella ", "Nosotros " , "Ellos "};


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
    public void GenPresSimp(String pronounparm, int verbpos){
        int objRand=(int)(Math.random()*verbObjects.length);
        int verbRand= (int)(Math.random()*verbs.length);
        String pronoun= pronounparm;
        int ob2= (int)(Math.random()*verbObjects[objRand].length);
        switch (pronoun){
            case "I ":
                gens= subjectsSpanish[0]+verbs[verbpos]+verbObjects[verbRand][ob2];
                gene = subjectsEnglish[0]+verbsSpanishFirstPerson[verbpos]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "You ":
                gens= subjectsSpanish[1]+verbs[verbpos]+ verbObjects[verbRand][ob2];
                gene = subjectsEnglish[1]+verbsSpanishSecondPerson[verbpos]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "He ":
                gens= subjectsSpanish[2]+verbsThirdPerson[verbpos]+verbObjects[verbRand][ob2];
                gene = subjectsEnglish[2]+verbsThirdPerson[verbpos]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "She ":
                gens= subjectsSpanish[3]+verbsThirdPerson[verbpos]+ verbObjects[verbRand][ob2];
                gene = subjectsEnglish[3]+verbsThirdPerson[verbpos]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "We ":
                gens= subjectsSpanish[4]+verbs[verbpos]+verbObjects[verbRand][ob2];
                gene = subjectsEnglish[4]+verbsSpanishFirstPersonPlural[verbpos]+ verbObjectsSpanish[verbRand][ob2 ];

                break;

            case "They ":
                gens= subjectsSpanish[5]+verbs[verbpos]+ verbObjects[verbRand][ob2];
                gene = subjectsEnglish[5]+verbsSpanishThirdPersonPlural[verbpos]+ verbObjectsSpanish[verbRand][ob2 ];
                break;
        }
    }


}
