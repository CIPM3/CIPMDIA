package com.leal.cipm_testing;

public class VerbLists {
    // Java String array with the 100 most common English words
    String[] commonEnglishWords = {
            "the", "be", "to", "of", "and", "a", "in", "that", "have", "I",
            "it", "for", "not", "on", "with", "he", "as", "you", "do", "at",
            "this", "but", "his", "by", "from", "they", "we", "say", "her", "she",
            "or", "an", "will", "my", "one", "all", "would", "there", "their", "what",
            "so", "up", "out", "if", "about", "who", "get", "which", "go", "me",
            "when", "make", "can", "like", "time", "no", "just", "him", "know", "take",
            "people", "into", "year", "your", "good", "some", "could", "them", "see", "other",
            "than", "then", "now", "look", "only", "come", "its", "over", "think", "also",
            "back", "after", "use", "two", "how", "our", "work", "first", "well", "way",
            "even", "new", "want", "because", "any", "these", "give", "day", "most", "us"
    };

    // Java String array with the Spanish translations of the 100 most common English words
    String[] commonSpanishWords = {
            "el,la,los,las", "ser", "a", "de", "y", "un", "en o dentro", "que", "tener", "yo",
            "eso", "para", "no", "en para superficies", "con", "él", "como", "tú", "hacer", "en para lugares generales",
            "esto", "pero", "su de él(posesivo)", "por para lugares", "de para proveniencia", "ellos", "nosotros", "decir", "su de ella", "ella",
            "o", "un o una", "modal para futuro", "mi", "uno", "todos", "modal para hípotetico", "allí", "su de ellos ", "qué para preguntar",
            "asi que", "arriba", "fuera", "si", "sobre", "quién", "obtener", "cual", "ir", "yo",
            "cuando", "hacer", "puede", "gustar", "tiempo", "no", "solo", "el como objeto", "saber", "tomar",
            "gente", "hacia dentro de", "año", "tu posesivo", "bueno", "algún", "podría", "ellos como objeto", "ver", "otro",
            "que para comparar", "entonces", "ahora", "mirar", "solamente", "venir", "su de eso", "por arriba de", "pensar", "también",
            "atrás", "después", "usar", "dos", "cómo ", "nuestro", "trabajar", "primero", "bien", "camino o forma",
            "incluso", "nuevo", "querer", "porque", "algún", "estos", "dar", "día", "el más", "nos"
    };
    public void firstOneHundred() {
        int r = (int) (Math.random() * commonEnglishWords.length);
        gene = commonEnglishWords[r];
        gens = commonSpanishWords[r];
    }
    String[] reflexiveIntransitiveVerbsEnglish = {
            "go away",
            "come over",
            "fall down",
            "stay",
            "fall asleep",
            "get up",
            "wake up",
            "sit down",
            "go to bed",
            "have fun",
            "bathe",
            "shower",
            "comb",
            "shave",
            "put on makeup",
            "get dressed",
            "move",
            "hide",
            "worry",
            "fall in love",
            "laugh",
            "regret",
            "feel",
            "say goodbye",
            "eat up",
            "stand up",
            "escape",
            "make an effort",
            "relax",
            "take care",
            "concentrate"
    };

    String[] reflexiveIntransitiveVerbsEnglishThirdPerson = {
            "goes away",
            "comes over",
            "falls down",
            "stays",
            "falls asleep",
            "gets up",
            "wakes up",
            "sits down",
            "goes to bed",
            "has fun",
            "bathes",
            "showers",
            "combs",
            "shaves",
            "puts on makeup",
            "gets dressed",
            "moves",
            "hides",
            "worries",
            "falls in love",
            "laughs",
            "regrets",
            "feels",
            "says goodbye",
            "eats up",
            "stands up",
            "escapes",
            "makes an effort",
            "relaxes",
            "takes care",
            "concentrates"
    };

    String[] reflexiveIntransitiveVerbsSpanishFirstPerson = {
            "me voy",
            "me vengo",
            "me caigo",
            "me quedo",
            "me duermo",
            "me levanto",
            "me despierto",
            "me siento",
            "me acuesto",
            "me divierto",
            "me baño",
            "me ducho",
            "me peino",
            "me afeito",
            "me maquillo",
            "me visto",
            "me mudo",
            "me escondo",
            "me preocupo",
            "me enamoro",
            "me río",
            "me arrepiento",
            "me siento",
            "me despido",
            "me como",
            "me paro",
            "me escapo",
            "me esfuerzo",
            "me relajo",
            "me cuido",
            "me concentro"
    };


    String[] reflexiveIntransitiveVerbsSpanishSecondPerson = {
            "te vas",
            "te vienes",
            "te caes",
            "te quedas",
            "te duermes",
            "te levantas",
            "te despiertas",
            "te sientas",
            "te acuestas",
            "te diviertes",
            "te bañas",
            "te duchas",
            "te peinas",
            "te afeitas",
            "te maquillas",
            "te vistes",
            "te mudas",
            "te escondes",
            "te preocupas",
            "te enamoras",
            "te ríes",
            "te arrepientes",
            "te sientes",
            "te despides",
            "te comes",
            "te paras",
            "te escapas",
            "te esfuerzas",
            "te relajas",
            "te cuidas",
            "te concentras"
    };

    String[] reflexiveIntransitiveVerbsSpanishThirdPerson = {
            "se va",
            "se viene",
            "se cae",
            "se queda",
            "se duerme",
            "se levanta",
            "se despierta",
            "se sienta",
            "se acuesta",
            "se divierte",
            "se baña",
            "se ducha",
            "se peina",
            "se afeita",
            "se maquilla",
            "se viste",
            "se muda",
            "se esconde",
            "se preocupa",
            "se enamora",
            "se ríe",
            "se arrepiente",
            "se siente",
            "se despide",
            "se come",
            "se para",
            "se escapa",
            "se esfuerza",
            "se relaja",
            "se cuida",
            "se concentra"
    };
    String[] reflexiveIntransitiveVerbsSpanishFirstPersonPlural = {
            "nos vamos",
            "nos venimos",
            "nos caemos",
            "nos quedamos",
            "nos dormimos",
            "nos levantamos",
            "nos despertamos",
            "nos sentamos",
            "nos acostamos",
            "nos divertimos",
            "nos bañamos",
            "nos duchamos",
            "nos peinamos",
            "nos afeitamos",
            "nos maquillamos",
            "nos vestimos",
            "nos mudamos",
            "nos escondemos",
            "nos preocupamos",
            "nos enamoramos",
            "nos reímos",
            "nos arrepentimos",
            "nos sentimos",
            "nos despedimos",
            "nos comemos",
            "nos paramos",
            "nos escapamos",
            "nos esforzamos",
            "nos relajamos",
            "nos cuidamos",
            "nos concentramos"
    };
    String[] reflexiveIntransitiveVerbsSpanishThirdPersonPlural = {
            "se van",
            "se vienen",
            "se caen",
            "se quedan",
            "se duermen",
            "se levantan",
            "se despiertan",
            "se sientan",
            "se acuestan",
            "se divierten",
            "se bañan",
            "se duchan",
            "se peinan",
            "se afeitan",
            "se maquillan",
            "se visten",
            "se mudan",
            "se esconden",
            "se preocupan",
            "se enamoran",
            "se ríen",
            "se arrepienten",
            "se sienten",
            "se despiden",
            "se comen",
            "se paran",
            "se escapan",
            "se esfuerzan",
            "se relajan",
            "se cuidan",
            "se concentran"
    };
    String[] verbsSpanishBaseSe = {
            "se tiene ", "se hace ", "se dice ", "se obtiene ",
            "se hace ", "se sabe ", "se piensa ", "se ve ", "se toma ",
            "se quiere ", "se mira a ", "se usa ", "se encuentra ",
            "se da ", "se cuenta ", "se llama ", "se intenta ",
            "se pregunta ", "se necesita ", "se siente ", "se deja ",
            "se pone ", "se mantiene ", "se empieza ",
            "se ayuda ", "se comienza ", "se muestra ", "se oye ",
            "se juega ", "se mueve ", "se cree en ", "se sostiene ",
            "se vive ", "se trae ", "se escribe ", "se proporciona ",
            "se pierde ", "se paga ", "se incluye ", "se continúa ",
            "se cambia ", "se establece ", "se aprende ", "se entiende ",
            "se mira ", "se sigue ", "se detiene ", "se habla ",
            "se crea ", "se permite ", "se lee ", "se gasta ",
            "se añade ", "se abre ", "se ofrece ", "se recuerda ",
            "se gana ", "se considera ", "se ama ", "se compra ",
            "se envía ", "se espera ", "se sirve ", "se construye ",
            "se corta ", "se mata ", "se alcanza ", "se sugiere ",
            "se levanta ", "se pasa ", "se vende ", "se requiere ",
            "se decide ", "se informa ", "se devuelve ", "se tira ",
            "se explica ", "se lleva ", "se desarrolla ", "se conduce ",
            "se rompe "
    };


    String[] verbsEnglishBaseSe = {
            "have", "do", "say", "get",
            "make", "know", "think", "see", "take",
            "want", "look at", "use", "find",

            "give", "tell", "call", "try",

            "ask", "need", "feel", "leave",
            "put", "keep", "begin",

            "help", "start",


            "show", "hear", "play", "move",
            "believe in", "hold", "live", "bring",
            "write", "provide", "lose",
            "pay",

            "include", "continue", "change",
            "set", "learn", "understand", "watch",
            "follow", "stop", "speak", "create", "allow",
            "read", "spend", "add", "open",
            "offer", "remember", "win",

            "consider", "love", "buy",
            "send", "expect", "serve", "build",
            "cut", "kill", "reach",
            "suggest", "raise", "pass", "sell", "require",
            "decide", "report", "return", "pull", "explain",
            "carry", "develop", "drive", "break"
    };

    String[] verbsEnglishThirdPerson = {
            "has", "does", "says", "gets",
            "makes", "knows", "thinks", "sees", "takes",
            "wants", "looks at", "uses", "finds",
            "gives", "tells", "calls", "tries",
            "asks", "needs", "feels", "leaves",
            "puts", "keeps", "begins",
            "helps", "starts", "shows", "hears",
            "plays", "moves", "believes in", "holds",
            "lives", "brings", "writes", "provides",
            "loses", "pays", "includes", "continues",
            "changes", "sets", "learns", "understands",
            "watches", "follows", "stops", "speaks",
            "creates", "allows", "reads", "spends",
            "adds", "opens", "offers", "remembers",
            "wins", "considers", "loves", "buys",
            "sends", "expects", "serves", "builds",
            "cuts", "kills", "reaches", "suggests",
            "raises", "passes", "sells", "requires",
            "decides", "reports", "returns", "pulls",
            "explains", "carries", "develops", "drives",
            "breaks"
    };
    String[][] verbObjectsSpanish = {
            // Objetos para "tener "
            {"tiempo ", "dinero ", "comida ", "el suelo ", "amor "},

            // Objetos para "hacer " (to do)
            {"un favor ", "un truco de magia ", "bien ", "todo ", "nada "},

            // Objetos para "decir "
            {"la verdad ", "una mentira ", "una historia ", "adiós ", "hola "},

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

            // Objetos para "contar "
            {"una historia ", "la verdad ", "un chiste ", "un secreto ", "mentiras "},

            // Objetos para "llamar "
            {"a un amigo ", "por ayuda ", "un taxi ", "a la policía ", "una reunión "},

            // Objetos para "intentar "
            {"aprender algo nuevo ", "cocinar ", "arreglarlo ", "hacer las paces ", "contactar "},

            // Objetos para "preguntar "
            {"por direcciones ", "una pregunta ", "por ayuda ", "por permiso ", "sobre un tema "},

            // Objetos para "necesitar "
            {"un abrazo ", "dinero ", "hablar contigo ", "preguntar algo ", "amor "},

            // Objetos para "sentir "
            {"felicidad ", "tristeza ", "dolor ", "nerviosismo ", "calor "},

            // Objetos para "dejar "
            {"la casa ", "el trabajo ", "una nota ", "la escuela ", "un mensaje "},

            // Objetos para "poner "
            {"la mesa ", "ropa ", "un libro ", "la alarma ", "decoraciones "},


            // Objetos para "mantener "
            {"un secreto ", "la calma ", "un diario ", "la fe ", "la distancia "},

            // Objetos para "empezar "
            {"un libro ", "una película ", "un proyecto ", "un curso ", "una dieta "},
// Objetos para "ayudar "
            {"a un amigo ", "en casa ", "con la tarea ", "a los padres ", "a los demás "},

            // Objetos para "empezar "
            {"el día ", "una conversación ", "un negocio ", "a correr ", "a estudiar "},

            // Objetos para "mostrar "
            {"un documento ", "el camino ", "una foto ", "interés ", "el ticket "},

            // Objetos para "oír "
            {"música ", "un ruido ", "la lluvia ", "las noticias ", "una voz "},

            // Objetos para "jugar "
            {"fútbol ", "videojuegos ", "al ajedrez ", "cartas ", "en el parque "},

            // Objetos para "mover "
            {"una silla ", "la casa ", "el coche ", "los muebles ", "al extranjero "},

            // Objetos para "creer "
            {"en fantasmas ", "una historia ", "en ti mismo ", "en el amor ", "en la ciencia "},
            //hold
            {"una reunion ", "un record ", "una opinion ", "una ceremonia ", "las manos "},

            // Objetos para "vivir "
            {"en una ciudad ", "con la familia ", "una aventura ", "una vida ", "solo "},

            // Objetos para "traer "
            {"alegría ", "un amigo ", "un regalo ", "noticias ", "suministros "},

            // Objetos para "escribir "
            {"una carta ", "un libro ", "un correo electrónico ", "un informe ", "una historia "},

            // Objetos para "proporcionar "
            {"apoyo ", "información ", "un servicio ", "ayuda ", "evidencia "},

            // Objetos para "perder "
            {"peso ", "un juego ", "un amigo ", "tiempo ", "dinero "},


            // pay
            {"la cuenta ", "el carro ", "una multa ", "la casa ", "el curso de ingles "},

            // Objetos para "incluir "
            {"todos los miembros ", "detalles ", "una sección ", "extras ", "una advertencia "},

            // Objetos para "continuar "
            {"el viaje ", "trabajando ", "estudiando ", "una conversación ", "una tradición "},

            // Objetos para "cambiar "
            {"ropa ", "una decisión ", "una llanta ", "dirección ", "actitud "},

            // Objetos para "establecer "
            {"la mesa ", "un récord ", "una alarma ", "una cita ", "estándares "},

            // Objetos para "aprender "
            {"un idioma ", "una habilidad ", "la verdad ", "de los errores ", "una lección "},

            // Objetos para "entender "
            {"un concepto ", "sentimientos ", "un chiste ", "una situación ", "instrucciones "},

            // Objetos para "mirar "
            {"una película ", "las noticias ", "un partido ", "un espectáculo ", "el cielo "},

            // Objetos para "seguir "
            {"instrucciones ", "un líder ", "una tendencia ", "un camino ", "consejos "},

            // Objetos para "parar "
            {"pensar ", "trabajar ", "fumar ", "hablar ", "preocuparse "},

            // Objetos para "hablar "
            {"la verdad ", "suavemente ", "públicamente ", "sobre un problema ", "un idioma "},

            // Objetos para "crear "
            {"arte ", "un sitio web ", "música ", "un plan ", "una historia "},

            // Objetos para "permitir "
            {"entrada ", "libertad ", "un descanso ", "un error ", "mascotas "},

            // Objetos para "leer "
            {"un libro ", "una revista ", "el ambiente ", "en el sofá ", "bien "},

            // Objetos para "gastar "
            {"dinero ", "tiempo ", "energía ", "las vacaciones ", "esfuerzo "},

            // Objetos para "añadir "
            {"azúcar ", "detalles ", "un comentario ", "sabor ", "valor "},

            // Objetos para "abrir "
            {"una puerta ", "una ventana ", "un negocio ", "un libro ", "una cuenta "},

            // Objetos para "ofrecer "
            {"ayuda ", "un trabajo ", "un regalo ", "consejo ", "un descuento "},

            // Objetos para "recordar "
            {"un nombre ", "un aniversario ", "cerrar la puerta con llave ", "una contraseña ", "un chiste "},

            // Objetos para "ganar "
            {"un juego ", "un premio ", "una competencia ", "una beca ", "respeto "},

            // Objetos para "considerar "
            {"una oferta ", "una propuesta ", "las consecuencias ", "un cambio de carrera ", "los sentimientos de alguien "},

            // Objetos para "amar "
            {"a una persona ", "a una mascota ", "viajar ", "cocinar ", "leer "},

            // Objetos para "comprar "
            {"comestibles ", "un coche ", "una casa ", "ropa ", "un regalo "},

            // Objetos para "enviar "
            {"un correo electrónico ", "una carta ", "un paquete ", "un mensaje ", "flores "},

            // Objetos para "esperar " (in the sense of expecting)
            {"una entrega ", "una visita ", "un resultado ", "una llamada ", "resultados "},

            // Objetos para "servir "
            {"comida ", "a un cliente ", "a la nación ", "una condena ", "un propósito "},

            // Objetos para "construir "
            {"una casa ", "una relación ", "músculo ", "una aplicación ", "una carrera "},

            // Objetos para "cortar "
            {"el cabello ", "un pastel ", "gastos ", "un trato ", "el césped "},

            // Objetos para "matar "
            {"el tiempo ", "una araña ", "a un personaje en una historia ", "el motor ", "el dolor "},

            // Objetos para "alcanzar "
            {"una meta ", "la cima ", "un acuerdo ", "a alguien ", "una conclusión "},

            // Objetos para "sugerir "
            {"un plan ", "una idea ", "mejoras ", "una reunión ", "una solución "},

            // Objetos para "levantar "
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

            // Objetos para "conducir "
            {"un coche ", "a la locura ", "una iniciativa ", "a casa ", "crecimiento "},

            // Objetos para "romper "
            {"un récord ", "la ley ", "un hábito ", "el silencio ", "un corazón "}
    };
    String[][] verbObjects = {
            // Objects for "tener " (to have)
            {"time ", "money ", "food ", "the floor ", "love "},

            // Objects for "hacer " (to do/make)
            {"a favor ", "a magic trick ", "good ", "everything ", "nothing "},

            // Objects for "decir " (to say)
            {"the truth ", "a lie ", "a story ", "goodbye ", "hello "},

            // Objects for "obtener " (to get)
            {"results ", "information ", "approval ", "a job ", "tickets "},

            // Objects for "hacer " (to make)
            {"homework ", "a plan ", "a cake ", "an effort ", "progress "},

            // Objects for "saber " (to know)
            {"the answer ", "a secret ", "the way ", "the truth ", "nothing "},

            // Objects for "pensar " (to think)
            {"about the future ", "of an idea ", "about life ", "positively ", "about a solution "},

            // Objects for "ver " (to see)
            {"a movie ", "a doctor ", "the point ", "the difference ", "a friend "},

            // Objects for "tomar " (to take)
            {"a break ", "a photo ", "a seat ", "a test ", "medicine "},

            // Objects for "querer " (to want)
            {"to eat something ", "to leave early ", "to know the truth ", "to buy a house ", "to travel the world "},

            // Objects for "mirar " (to look at)
            {"at the sky ", "through the window ", "at the mirror ", "at photos ", "at the clock "},

            // Objects for "usar " (to use)
            {"a pen ", "a computer ", "a tool ", "social media ", "an application "},

            // Objects for "encontrar " (to find)
            {"a solution ", "a friend ", "a job ", "a key ", "peace of mind "},

            // Objects for "dar " (to give)
            {"a gift ", "advice ", "a hug ", "a presentation ", "a lecture "},

            // Objects for "contar " (to tell)
            {"a story ", "the truth ", "a joke ", "a secret ", "lies "},

            // Objects for "llamar " (to call)
            {"a friend ", "for help ", "a taxi ", "the police ", "a meeting "},

            // Objects for "intentar " (to try)
            {"to learn something new ", "to cook ", "to fix it ", "to make amends ", "to reach out "},

            // Objects for "preguntar " (to ask)
            {"for directions ", "a question ", "for help ", "for permission ", "about a topic "},

            // Objects for "necesitar " (to need)
            {"a hug ", "money ", "to talk to you ", "to ask something ", "love "},

            // Objects for "sentir " (to feel)
            {"happiness ", "sadness ", "pain ", "nervousness ", "heat "},

            // Objects for "dejar " (to leave)
            {"the house ", "the job ", "a note ", "school ", "a message "},

            // Objects for "poner " (to put/place)
            {"the table ", "clothes ", "a book ", "the alarm ", "decorations "},


            // Objects for "mantener " (to keep)
            {"a secret ", "calm ", "a diary ", "faith ", "distance "},

            // Objects for "empezar " (to begin/start)
            {"a book ", "a movie ", "a project ", "a course ", "a diet "},

            // Objects for "ayudar " (to help)
            {"a friend ", "at home ", "with homework ", "the parents ", "others "},

            // Objects for "empezar " (to start)
            {"the day ", "a conversation ", "a business ", "to run ", "to study "},

            // Objects for "mostrar " (to show)
            {"a document ", "the way ", "a photo ", "interest ", "the ticket "},


            // Objects for "oír " (to hear)
            {"music ", "a noise ", "the rain ", "the news ", "a voice "},

            // Objects for "jugar " (to play)
            {"soccer ", "video games ", "chess ", "cards ", "in the park "},

            // Objects for "mover " (to move)
            {"a chair ", "the house ", "the car ", "furniture ", "abroad "},

            // Objects for "creer " (to believe)
            {"in ghosts ", "a story ", "in yourself ", "in love ", "in science "},

            //hold
            {"a meeting ", "a record ", "an opinion ", "a ceremony ", "hands "},


            // Objects for "vivir " (to live)
            {"in a city ", "with family ", "an adventure ", "a life ", "alone "},

            // Objects for "traer " (to bring)
            {"joy ", "a friend ", "a gift ", "news ", "supplies "},

            // Objects for "escribir " (to write)
            {"a letter ", "a book ", "an email ", "a report ", "a story "},

            // Objects for "proporcionar " (to provide)
            {"support ", "information ", "a service ", "help ", "evidence "},

            // Objects for "perder " (to lose)
            {"weight ", "a game ", "a friend ", "time ", "money "},

            // pay
            {"the bill ", "the car ", "a fine ", "the house ", "the english course "},

            // Objects for "incluir " (to include)
            {"all members ", "details ", "a section ", "extras ", "a warning "},

            // Objects for "continuar " (to continue)
            {"the journey ", "working ", "studying ", "a conversation ", "a tradition "},

            // Objects for "cambiar " (to change)
            {"clothes ", "a decision ", "a tire ", "direction ", "attitude "},

            // Objects for "establecer " (to set)
            {"the table ", "a record ", "an alarm ", "a date ", "standards "},

            // Objects for "aprender " (to learn)
            {"a language ", "a skill ", "the truth ", "from mistakes ", "a lesson "},

            // Objects for "entender " (to understand)
            {"a concept ", "feelings ", "a joke ", "a situation ", "instructions "},

            // Objects for "mirar " (to watch)
            {"a movie ", "the news ", "a game ", "a show ", "the sky "},

            // Objects for "seguir " (to follow)
            {"instructions ", "a leader ", "a trend ", "a path ", "advice "},

            // Objects for "parar " (to stop)
            {"thinking ", "working ", "smoking ", "talking ", "worrying "},

            // Objects for "hablar " (to speak)
            {"the truth ", "softly ", "publicly ", "about a problem ", "a language "},

            // Objects for "crear " (to create)
            {"art ", "a website ", "music ", "a plan ", "a story "},

            // Objects for "permitir " (to allow)
            {"entry ", "freedom ", "a break ", "a mistake ", "pets "},

            // Objects for "leer " (to read)
            {"a book ", "a magazine ", "the room ", "on the couch ", "well "},

            // Objects for "gastar " (to spend)
            {"money ", "time ", "energy ", "the holidays ", "effort "},

            // Objects for "añadir " (to add)
            {"sugar ", "details ", "a comment ", "flavor ", "value "},

            // Objects for "abrir " (to open)
            {"a door ", "a window ", "a business ", "a book ", "an account "},

            // Objects for "ofrecer " (to offer)
            {"help ", "a job ", "a gift ", "advice ", "a discount "},

            // Objects for "recordar " (to remember)
            {"a name ", "an anniversary ", "to lock the door ", "a password ", "a joke "},

            // Objects for "ganar " (to win)
            {"a game ", "a prize ", "a competition ", "a scholarship ", "respect "},


            // Objects for "considerar " (to consider)
            {"an offer ", "a proposal ", "the consequences ", "a career change ", "someone's feelings "},

            // Objects for "amar " (to love)
            {"a person ", "a pet ", "traveling ", "cooking ", "reading "},

            // Objects for "comprar " (to buy)
            {"groceries ", "a car ", "a house ", "clothes ", "a gift "},

            // Objects for "enviar " (to send)
            {"an email ", "a letter ", "a package ", "a message ", "flowers "},

            // Objects for "esperar " (to expect)
            {"a delivery ", "a visit ", "an outcome ", "a call ", "results "},

            // Objects for "servir " (to serve)
            {"food ", "a customer ", "the nation ", "a sentence ", "a purpose "},

            // Objects for "construir " (to build)
            {"a house ", "a relationship ", "muscle ", "an app ", "a career "},

            // Objects for "cortar " (to cut)
            {"hair ", "a cake ", "expenses ", "a deal ", "the grass "},

            // Objects for "matar " (to kill)
            {"time ", "a spider ", "a character in a story ", "the engine ", "pain "},

            // Objects for "alcanzar " (to reach)
            {"a goal ", "the top ", "an agreement ", "out to someone ", "a conclusion "},

            // Objects for "sugerir " (to suggest)
            {"a plan ", "an idea ", "improvements ", "a meeting ", "a solution "},

            // Objects for "levantar " (to raise)
            {"funds ", "awareness ", "a child ", "the roof ", "a question "},

            // Objects for "pasar " (to pass)
            {"a test ", "the ball ", "by a place ", "a law ", "down traditions "},

            // Objects for "vender " (to sell)
            {"a house ", "a car ", "products ", "tickets ", "art "},

            // Objects for "requerir " (to require)
            {"approval ", "a license ", "effort ", "patience ", "a password "},

            // Objects for "decidir " (to decide)
            {"on a destination ", "to leave ", "on a course of action ", "against it ", "in favor "},

            // Objects for "informar " (to report)
            {"an incident ", "to the police ", "earnings ", "a discovery ", "weather conditions "},

            // Objects for "regresar " (to return)
            {"a book ", "home ", "a call ", "to normal ", "goods "},

            // Objects for "tirar " (to pull)
            {"a door ", "strings ", "away ", "up ", "towards you "},

            // Objects for "explicar " (to explain)
            {"a theory ", "a situation ", "a joke ", "a process ", "your reasoning "},

            // Objects for "llevar " (to carry)
            {"a bag ", "responsibility ", "a child ", "goods ", "a message "},

            // Objects for "desarrollar " (to develop)
            {"a skill ", "a film ", "a plan ", "a relationship ", "software "},

            // Objects for "esperar " (to hope)
            {"for the best ", "to win ", "for recovery ", "to see the person again ", "for success "},

            // Objects for "conducir " (to drive)
            {"a car ", "crazy ", "an initiative ", "home ", "growth "},

            // Objects for "romper " (to break)
            {"a record ", "the law ", "a habit ", "the silence ", "a heart "}
    };
    String[] verbsEnglishPastParticiple = {
            "had", "done", "said", "gotten",
            "made", "known", "thought", "seen", "taken",
            "wanted", "looked at", "used", "found",
            "given", "told", "called", "tried",
            "asked", "needed", "felt", "left",
            "put", "kept", "begun",

            "helped", "started", "shown", "heard",
            "played", "moved", "believed in", "held",
            "lived", "brought", "written", "provided",
            "lost", "paid", "included", "continued",
            "changed", "set", "learned", "understood",
            "watched", "followed", "stopped", "spoken",
            "created", "allowed", "read", "spent",
            "added", "opened", "offered", "remembered",
            "won", "considered", "loved", "bought",
            "sent", "expected", "served", "built",
            "cut", "killed", "reached", "suggested",
            "raised", "passed", "sold", "required",
            "decided", "reported", "returned", "pulled",
            "explained", "carried", "developed", "driven",
            "broken"
    };

    String[] serSp= {"Yo soy el que ", "Tú eres el que ", "él es el que ", "ella es la que ", "nosotros somos los que ", "ellos son los que "};
    String[] beEng= {"I am the one who ", "you are the one who ", "he is the one who ", "she is the one who ", "we are the ones who ", "they are the ones who "};


    public void GenIntPasiva() {
        int r = (int) (Math.random() * verbsEnglishBaseSe.length);
        int o = (int) (Math.random() * verbObjects[r].length);

        gens = verbsSpanishBaseSe[r] + verbObjectsSpanish[r][o];
        gene = "He " + verbsEnglishThirdPerson[r] + " " + verbObjects[r][o];
        gene2 = "She " + verbsEnglishThirdPerson[r] + " " + verbObjects[r][o];
        gene3 = "somebody " + verbsEnglishThirdPerson[r] + " " + verbObjects[r][o];
        gene4 = "We " + verbsEnglishBaseSe[r] + " " + verbObjects[r][o];
        gene5 = "They " + verbsEnglishBaseSe[r] + " " + verbObjects[r][o];
        gene7 = verbObjects[r][o] + "gets " + verbsEnglishPastParticiple[r];
        gene6 = verbObjects[r][o] + "is " + verbsEnglishPastParticiple[r];
    }
    String pronouns[] = {"I", "You", "He", "She", "We", "They"};
    String gens, gene, gene2, gene3, gene4, gene5, gene6, gene7;

    public void GenReflInt3() {
        int r = (int) (Math.random() * reflexiveIntransitiveVerbsEnglish.length);
        int rp = (int) (Math.random() * pronouns.length);
        String pronoun = pronouns[rp];
        switch (pronoun) {
            case "I":
                gens = reflexiveIntransitiveVerbsSpanishFirstPerson[r];
                gene = "I " + reflexiveIntransitiveVerbsEnglish[r];
                gene2 = ".";
                break;

            case "You":
                gens = reflexiveIntransitiveVerbsSpanishSecondPerson[r];
                gene = "You " + reflexiveIntransitiveVerbsEnglish[r];
                gene2 = ".";
                break;

            case "He":
                gens = reflexiveIntransitiveVerbsSpanishThirdPerson[r];
                gene = "He " + reflexiveIntransitiveVerbsEnglishThirdPerson[r];
                gene2 = "She " + reflexiveIntransitiveVerbsEnglishThirdPerson[r];
                break;

            case "She":
                gens = reflexiveIntransitiveVerbsSpanishThirdPerson[r];
                gene = "She " + reflexiveIntransitiveVerbsEnglishThirdPerson[r];
                gene2 = "He " + reflexiveIntransitiveVerbsEnglishThirdPerson[r];
                break;

            case "We":
                gens = reflexiveIntransitiveVerbsSpanishFirstPersonPlural[r];
                gene = "We " + reflexiveIntransitiveVerbsEnglish[r];
                gene2 = ".";
                break;

            case "They":
                gens = reflexiveIntransitiveVerbsSpanishThirdPersonPlural[r];
                gene = "They " + reflexiveIntransitiveVerbsEnglish[r];
                gene2 = ".";
                break;
        }


    }
    String[] commonEnglishNouns = {
            "time", "year", "people", "way", "day", "man", "thing", "woman", "life", "child",
            "world", "school", "state", "family", "student", "group", "country", "problem", "hand", "part",
            "place", "case", "week", "company", "system", "program", "question", "work", "government", "number",
            "night", "point", "home", "water", "room", "mother", "area", "money", "story", "fact",
            "month", "lot", "right", "study", "book", "eye", "job", "word", "business", "issue",
            "side", "kind", "head", "house", "service", "friend", "father", "power", "hour", "game",
            "line", "end", "member", "law", "car", "city", "community", "name", "president", "team",
            "minute", "idea", "kid", "body", "information", "back", "parent", "face", "others", "level",
            "office", "door", "health", "person", "art", "war", "history", "party", "result", "change",
            "morning", "reason", "research", "girl", "guy", "moment", "air", "teacher", "force", "education"
    };

    // Array of 100 most common Spanish nouns
    String[] commonSpanishNouns = {
            "tiempo", "año", "gente", "camino", "día", "hombre", "cosa", "mujer", "vida", "niño",
            "mundo", "escuela", "estado", "familia", "estudiante", "grupo", "país", "problema", "mano", "parte",
            "lugar", "caso", "semana", "compañía", "sistema", "programa", "pregunta", "trabajo", "gobierno", "número",
            "noche", "punto", "hogar", "agua", "habitación", "madre", "área", "dinero", "historia", "hecho",
            "mes", "lote", "derecho", "estudio", "libro", "ojo", "empleo", "palabra", "negocio", "asunto",
            "lado", "tipo", "cabeza", "casa", "servicio", "amigo", "padre", "poder", "hora", "juego",
            "línea", "final", "miembro", "ley", "coche", "ciudad", "comunidad", "nombre", "presidente", "equipo",
            "minuto", "idea", "niño", "cuerpo", "información", "espalda", "padre", "cara", "otros", "nivel",
            "oficina", "puerta", "salud", "persona", "arte", "guerra", "historia", "fiesta", "resultado", "cambio",
            "mañana", "razón", "investigación", "chica", "chico", "momento", "aire", "profesor", "fuerza", "educación"
    };

    public void randomNounPair() {
        int r = (int) (Math.random() * commonEnglishNouns.length);
         gene = commonEnglishNouns[r];
         gens = commonSpanishNouns[r];

    }

    String[] commonEnglishVerbs = {
            "be", "have", "do", "say", "go", "get", "make", "know", "think", "take",
            "see", "come", "want", "look", "use", "find", "give", "tell", "work", "call",
            "try", "ask", "need", "feel", "become", "leave", "put", "mean", "keep", "let",
            "begin", "seem", "help", "talk", "turn", "start", "show", "hear", "play", "run",
            "move", "like", "live", "believe", "hold", "bring", "happen", "write", "provide", "sit",
            "stand", "lose", "pay", "meet", "include", "continue", "set", "learn", "change", "lead",
            "understand", "watch", "follow", "stop", "create", "speak", "read", "allow", "add", "spend",
            "grow", "open", "walk", "win", "offer", "remember", "love", "consider", "appear", "buy",
            "wait", "serve", "die", "send", "expect", "build", "stay", "fall", "cut", "reach",
            "kill", "remain", "suggest", "raise", "pass", "sell", "require", "report", "decide", "pull"
    };

    // Array of 100 most common Spanish verbs
    String[] commonSpanishVerbs = {
            "ser", "tener", "hacer", "decir", "ir", "obtener", "hacer", "saber", "pensar", "tomar",
            "ver", "venir", "querer", "mirar", "usar", "encontrar", "dar", "contar", "trabajar", "llamar",
            "intentar", "preguntar", "necesitar", "sentir", "convertirse", "dejar", "poner", "significar", "mantener", "dejar",
            "comenzar", "parecer", "ayudar", "hablar", "girar", "empezar", "mostrar", "oír", "jugar", "correr",
            "mover", "gustar", "vivir", "creer", "sostener", "traer", "suceder", "escribir", "proporcionar", "sentarse",
            "pararse", "perder", "pagar", "encontrarse", "incluir", "continuar", "colocar", "aprender", "cambiar", "liderar",
            "entender", "ver", "seguir", "detener", "crear", "hablar", "leer", "permitir", "añadir", "gastar",
            "crecer", "abrir", "caminar", "ganar", "ofrecer", "recordar", "amar", "considerar", "aparecer", "comprar",
            "esperar", "servir", "morir", "enviar", "esperar", "construir", "quedarse", "caer", "cortar", "alcanzar",
            "matar", "permanecer", "sugerir", "levantar", "pasar", "vender", "requerir", "informar", "decidir", "tirar"
    };

    public void randomVerbPair() {
        int r = (int) (Math.random() * commonEnglishVerbs.length);
        gene = commonEnglishVerbs[r];
        gens = commonSpanishVerbs[r];

    }

    String[] commonEnglishAdjectives = {
            "good", "new", "first", "last", "long", "great", "little", "own", "other", "old",
            "right", "big", "high", "different", "small", "large", "next", "early", "young", "important",
            "few", "public", "bad", "same", "able", "happy", "sad", "angry", "kind", "beautiful",
            "ugly", "interesting", "boring", "tall", "short", "wide", "narrow", "hot", "cold", "warm",
            "cool", "fast", "slow", "hard", "soft", "heavy", "light", "strong", "weak", "safe",
            "dangerous", "clean", "dirty", "rich", "poor", "thin", "thick", "loud", "quiet", "noisy",
            "calm", "bright", "dark", "easy", "difficult", "simple", "complex", "cheap", "expensive", "free",
            "close", "far", "young", "old", "early", "late", "modern", "ancient", "empty", "full",
            "famous", "unknown", "friendly", "unfriendly", "polite", "rude", "healthy", "sick", "tired", "energetic",
            "beautiful", "handsome", "pretty", "funny", "serious", "strong", "weak", "active", "lazy", "intelligent"
    };

    // Array of 100 most common Spanish adjectives
    String[] commonSpanishAdjectives = {
            "bueno", "nuevo", "primero", "último", "largo", "genial", "pequeño", "propio", "otro", "viejo",
            "derecho", "grande", "alto", "diferente", "pequeño", "grande", "próximo", "temprano", "joven", "importante",
            "pocos", "público", "malo", "mismo", "capaz", "feliz", "triste", "enojado", "amable", "hermoso",
            "feo", "interesante", "aburrido", "alto", "bajo", "ancho", "estrecho", "caliente", "frío", "cálido",
            "fresco", "rápido", "lento", "duro", "blando", "pesado", "ligero", "fuerte", "débil", "seguro",
            "peligroso", "limpio", "sucio", "rico", "pobre", "delgado", "grueso", "ruidoso", "tranquilo", "ruidoso",
            "calmado", "brillante", "oscuro", "fácil", "difícil", "simple", "complejo", "barato", "caro", "gratis",
            "cerca", "lejos", "joven", "viejo", "temprano", "tarde", "moderno", "antiguo", "vacío", "lleno",
            "famoso", "desconocido", "amigable", "antipático", "educado", "grosero", "saludable", "enfermo", "cansado", "enérgico",
            "hermoso", "guapo", "bonito", "divertido", "serio", "fuerte", "débil", "activo", "perezoso", "inteligente"
    };

    public void randomAdjectivePair() {
        int r = (int) (Math.random() * commonEnglishAdjectives.length);
        gene= commonEnglishAdjectives[r];
        gens = commonSpanishAdjectives[r];

    }
    String[] commonEnglishAdverbs = {
            "up", "so", "out", "just", "now", "how", "then", "more", "also", "here",
            "well", "only", "very", "even", "back", "there", "down", "still", "in", "as",
            "too", "when", "never", "really", "most", "on", "why", "about", "over", "again",
            "where", "right", "off", "always", "next", "far", "quite", "perhaps", "soon", "however",
            "almost", "later", "much", "once", "least", "ago", "together", "around", "already", "enough",
            "both", "maybe", "actually", "probably", "home", "of course", "yet", "ever", "certainly", "away",
            "today", "sure", "better", "clearly", "instead", "early", "finally", "quickly", "no", "recently",
            "before", "usually", "thus", "exactly", "hard", "especially", "eventually", "always", "generally", "likely",
            "simply", "naturally", "soon", "after", "slowly", "seriously", "completely", "nearly", "definitely", "often",
            "currently", "immediately", "perhaps", "suddenly", "merely", "obviously", "truly", "strongly", "rarely", "necessarily"
    };

    // Array of 100 most common Spanish adverbs
    String[] commonSpanishAdverbs = {
            "arriba", "tan", "fuera", "solo", "ahora", "cómo", "entonces", "más", "también", "aquí",
            "bien", "solo", "muy", "incluso", "atrás", "allí", "abajo", "todavía", "en", "como",
            "también", "cuando", "nunca", "realmente", "más", "en", "por qué", "acerca de", "sobre", "otra vez",
            "dónde", "derecho", "apagado", "siempre", "siguiente", "lejos", "bastante", "quizás", "pronto", "sin embargo",
            "casi", "más tarde", "mucho", "una vez", "menos", "hace", "juntos", "alrededor", "ya", "suficiente",
            "ambos", "tal vez", "realmente", "probablemente", "casa", "por supuesto", "aún", "siempre", "ciertamente", "lejos",
            "hoy", "seguro", "mejor", "claramente", "en lugar", "temprano", "finalmente", "rápidamente", "no", "recientemente",
            "antes", "usualmente", "así", "exactamente", "duro", "especialmente", "eventualmente", "siempre", "generalmente", "probablemente",
            "simplemente", "naturalmente", "pronto", "después", "lentamente", "seriamente", "completamente", "casi", "definitivamente", "a menudo",
            "actualmente", "inmediatamente", "quizás", "repentinamente", "meramente", "obviamente", "verdaderamente", "fuertemente", "raramente", "necesariamente"
    };

    public void randomAdverbPair() {
        int r = (int) (Math.random() * commonEnglishAdverbs.length);
        gene = commonEnglishAdverbs[r];
        gens = commonSpanishAdverbs[r];

    }

    String[] commonEnglishPrepositions = {
            "of", "in", "to", "for", "with", "on", "at", "by", "from", "about",
            "as", "into", "like", "through", "after", "over", "between", "out", "against", "during",
            "without", "before", "under", "around", "among", "since", "upon", "within", "along", "following",
            "across", "behind", "beyond", "plus", "except", "but", "up", "down", "near", "above",
            "below", "off", "around", "past", "despite", "towards", "upon", "amongst", "regarding", "concerning"
    };

    // Array of 50 most common Spanish prepositions
    String[] commonSpanishPrepositions = {
            "de", "en", "a", "para", "con", "sobre", "en", "por", "de", "acerca de",
            "como", "en", "como", "a través de", "después de", "sobre", "entre", "fuera de", "contra", "durante",
            "sin", "antes de", "debajo de", "alrededor de", "entre", "desde", "sobre", "dentro de", "a lo largo de", "siguiendo",
            "a través de", "detrás de", "más allá de", "más", "excepto", "pero", "arriba", "abajo", "cerca de", "por encima de",
            "por debajo de", "apagado", "alrededor de", "pasado", "a pesar de", "hacia", "sobre", "entre", "con respecto a", "en cuanto a"
    };

    public void randomPrepositionPair() {
        int r = (int) (Math.random() * commonEnglishPrepositions.length);
        gene = commonEnglishPrepositions[r];
        gens = commonSpanishPrepositions[r];
    }
}
