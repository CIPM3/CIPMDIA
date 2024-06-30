package com.leal.cipm_testing;

public class NewMethods {

    NewNounClass nouns = new NewNounClass();
    NewVerbClass object= new NewVerbClass();
    NewVerbClass object2= new NewVerbClass();
    Nobles n = new Nobles();
    Generator gen1 = new Generator();
    Generator gen2 = new Generator();
    AuxModalNegator negator = new AuxModalNegator();
    public NewMethods(){}
    String gens,gene,gene2,complemento,complement,complement2;
    String oracionsp="";
    String oracioneng="";
    String sp,globalAnswer,globalAnswer2;
    cerotofifty gen = new cerotofifty();


    public void conectorMethod() {
        int r2 = (int) (Math.random() * 20);
        switch (r2) {
            case 0:
                object.GenConj("and", "y");
                int ra = (int) (Math.random() * 2);
                complemento = "";
                complement = "";
                switch (ra) {
                    case 0:
                        object2.GenPresSimp();
                        complemento = object2.gens;
                        complement = object2.gene;
                        break;

                    case 1:
                        gen1.GenPresSimp2();
                        complemento = gen1.gens;
                        complement = gen1.gene;
                        break;
                    default:
                        complemento = "no object activated";
                        complement = "no object activated";
                        break;
                }
                gens = object.gens + " " + complemento;
                gene = object.gene + " " + complement;
                break;


            case 1:
                object.GenConj("but", "pero");
                int rb = (int) (Math.random() * 2);
                complemento = "";
                complement = "";
                switch (rb) {
                    case 0:
                        object2.GenPresSimp();
                        complemento = object2.gens;
                        complement = object2.gene;
                        break;

                    case 1:
                        gen1.GenPresSimp2();
                        complemento = gen1.gens;
                        complement = gen1.gene;
                        break;
                    default:
                        complemento = "no object activated";
                        complement = "no object activated";
                        break;
                }
                gens = object.gens + " " + complemento;
                gene = object.gene + " " + complement;
                break;

            case 2:
                object.GenConj("or", "o");
                int r = (int) (Math.random() * 2);
                complemento = "";
                complement = "";
                switch (r) {
                    case 0:
                        object2.GenPresSimp();
                        complemento = object2.gens;
                        complement = object2.gene;
                        break;

                    case 1:
                        gen1.GenPresSimp2();
                        complemento = gen1.gens;
                        complement = gen1.gene;
                        break;
                    default:
                        complemento = "no object activated";
                        complement = "no object activated";
                        break;
                }
                gens = object.gens + " " + complemento;
                gene = object.gene + " " + complement;
                break;


            case 3:
                complemento = "";
                complement = "";

                int rd = (int) (Math.random() * 2);
                switch (rd) {
                    case 0:
                        object.GenConjFuture("if ", "si ");
                        object2.GenPresSimp();
                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        complemento = object2.gens;
                        complement = object2.gene;
                        gens = oracionsp + complemento;
                        gene = oracioneng + complement;
                        break;

                    case 1:
                        object.GenConj("if ", "si ");
                        object2.GenPresSimp();
                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        complemento = object2.gens;
                        complement = object2.gene;
                        gens = oracionsp + complemento;
                        gene = oracioneng + complement;

                        break;

                    default:
                        gens = "no hay valor";
                        break;
                }
                break;

            case 4:
                int re = (int) (Math.random() * 2);
                complemento = "";
                complement = "";

                String oracioneng2 = ".";
                switch (re) {
                    case 0:
                        object.GenConjFuture("when ", "cuando ");
                        object2.GenPresSimpSubjunctive();
                        complemento = object2.gens;
                        complement = object2.gene;

                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        oracioneng2 = negator.contractWill(object.gene);
                        break;

                    case 1:
                        object.GenConj("when ", "cuando ");
                        gen1.GenPresSimp2();
                        complemento = gen1.gens;
                        complement = gen1.gene;
                        oracioneng2 = ".";

                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        break;

                    default:
                        complemento = "no object activated";
                        complement = "no object activated";
                        break;
                }

                gens = oracionsp + complemento;

                gene = oracioneng + complement;
                gene2 = oracioneng2 + complement;

                break;


            case 5:
                //because trans
                int rf = (int) (Math.random() * 4);
                complemento = "";
                complement = "";
                complement2 = "";
                String oracionsp = "";
                String oracioneng = "";
                switch (rf) {
                    case 0:
                        object.GenConjFuture("because ", "por que ");
                        object2.GenPresSimp();
                        complemento = object2.gens;
                        complement = object2.gene;

                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        gens = oracionsp + complemento;
                        gene = oracioneng + complement;
                        break;

                    case 1:
                        gen1.GenPastSimp2();
                        gen2.GenPastPerf2();

                        complemento = gen1.gens;
                        complement = gen1.gene;

                        oracionsp = gen2.gens;
                        oracioneng = gen2.gene;


                        gens = oracionsp + "por que " + complemento;
                        gene = oracioneng + "because " + complement;
                        break;

                    case 2:
                        object.GenConj("because ", "por que ");
                        object2.GenPresSimp();
                        complemento = object2.gens;
                        complement = object2.gene;

                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        gens = oracionsp + complemento;
                        gene = oracioneng + complement;
                        break;


                    case 3:
                        object.GenConjFuture("because ", "por que ");
                        gen1.GenPresPerf2();
                        complemento = gen1.gens;
                        complement = gen1.gene;

                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        gens = oracionsp + complemento;
                        gene = oracioneng + complement;

                        break;
                    default:
                        complemento = "no object activated";
                        complement = "no object activated";
                        break;
                }
                break;

            case 6:
                //while trans
                int rg = (int) (Math.random() * 2);
                complemento = "";
                complement = "";
                complement2 = "";

                switch (rg) {
                    case 0:
                        object.GenConjFuture("while ", "mientras que ");
                        object2.GenPresSimpSubjunctive();
                        complemento = object2.gens;
                        complement = object2.gene;

                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        gens = oracionsp + complemento;
                        gene = oracioneng + complement;
                        break;


                    case 1:
                        object.GenConj("while ", "mientras que ");
                        object2.GenPresSimp();
                        complemento = object2.gens;
                        complement = object2.gene;

                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        gens = oracionsp + complemento;
                        gene = oracioneng + complement;
                        break;

                    default:
                        complemento = "no object activated";
                        complement = "no object activated";
                        break;
                }

                break;

            case 7:
                //where trans
                int rh = (int) (Math.random() * 2);
                complemento = "";
                complement = "";
                complement2 = "";

                switch (rh) {
                    case 0:
                        object.GenConjFuture("where ", "donde ");
                        object2.GenPresSimpSubjunctive();
                        complemento = object2.gens;
                        complement = object2.gene;

                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        gens = oracionsp + complemento;
                        gene = oracioneng + complement;
                        break;


                    case 1:
                        object.GenConj("where ", "donde ");
                        object2.GenPresSimp();
                        complemento = object2.gens;
                        complement = object2.gene;

                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        gens = oracionsp + complemento;
                        gene = oracioneng + complement;
                        break;

                    default:
                        complemento = "no object activated";
                        complement = "no object activated";
                        break;
                }
                break;

            case 8:

                int ri = (int) (Math.random() * 3);
                complemento = "";
                complement = "";
                complement2 = "";

                switch (ri) {
                    case 0:
                        object.GenPastSimp();
                        object2.GenPresSimpAdverbs3("so ", "asi que ");
                        complemento = object2.gens;
                        complement = object2.gene;

                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        gens = oracionsp + complemento;
                        gene = oracioneng + complement;
                        break;

                    case 1:
                        object.GenPresSimp();
                        object2.GenPresSimpAdverbs3("so ", "asi que ");
                        complemento = object2.gens;
                        complement = object2.gene;

                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        gens = oracionsp + complemento;
                        gene = oracioneng + complement;
                        break;
                    case 2:
                        object.GenPastSimp();
                        oracionsp = object.gens;
                        oracioneng = object.gene;

                        object2.GenConjFuture("", "");
                        complemento = object2.gens;
                        complement = object2.gene;

                        gens = oracionsp + "asi que " + complemento;
                        gene = oracioneng + "so " + complement;
                        break;

                    default:
                        complemento = "no object activated";
                        complement = "no object activated";
                        break;
                }
                break;


            case 9:
                //though trans
                int rj = (int) (Math.random() * 3);
                complemento = "";
                complement = "";
                complement2 = "";

                switch (rj) {
                    case 0:
                        object.GenPastSimp();
                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        object2.GenPastSimp();
                        complemento = object2.gens;
                        complement = object2.gene;
                        gens = oracionsp + " aún que " + complemento;
                        gene = oracioneng + "though " + complement;
                        break;

                    case 1:

                        object.GenPastSimp();
                        oracionsp = negator.negateSentenceSpanish(object.gens);

                        oracioneng = negator.negatePastSimple(object.gene2);
                        object2.GenPastSimp();
                        complemento = object2.gens;
                        complement = object2.gene;

                        gens = oracionsp + " aún que " + complemento;
                        gene = oracioneng + "though " + complement;

                        break;
                    case 2:
                        object.GenConjFuture("though ", "aun que ");
                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        object2.GenPresSimpSubjunctive();
                        complemento = object2.gens;
                        complement = object2.gene;
                        gens = oracionsp + complemento;
                        gene = oracioneng + complement;

                        break;

                    default:
                        complemento = "no object activated";
                        complement = "no object activated";
                        break;
                }

                break;

            case 10:
                //after trans
                int rk = (int) (Math.random() * 3);
                complemento = "";
                complement = "";
                complement2 = "";

                switch (rk) {
                    case 0:
                        object.GenConjFuture("after ", "después de que ");
                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        object2.GenPresSimpSubjunctive();
                        complemento = object2.gens;
                        complement = object2.gene;
                        gens = oracionsp + complemento;
                        gene = oracioneng + complement;

                        break;

                    case 1:
                        object.GenPastSimp();
                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        object2.GenPastSimp();
                        complemento = object2.gens;
                        complement = object2.gene;
                        gens = oracionsp + "después de que " + complemento;
                        gene = oracioneng + "after " + complement;
                        break;

                    case 2:
                        object.GenPresSimp();
                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        object2.GenPvpp();
                        complemento = object2.gens;
                        complement = object2.gene;
                        gens = oracionsp + "después de que " + complemento;
                        gene = oracioneng + "after " + complement;
                        break;

                    default:
                        complemento = "no object activated";
                        complement = "no object activated";
                        break;
                }
                break;

            case 11:
                //since trans

                int r1 = (int) (Math.random() * 3);
                complemento = "";
                complement = "";
                complement2 = "";

                switch (r1) {
                    case 0:
                        object.GenPerfectTenses("have ", "has ", "he ", "has ", "ha ", "hemos ", "han ");
                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        object2.GenContTenses("was ", "were ", "was ", "estaba ", "estabas ", "estaba ", "estabamos ", "estaban ");
                        complemento = object2.gens;
                        complement = object2.gene;
                        gens = oracionsp + "desde que " + complemento;
                        gene = oracioneng + "since " + complement;
                        break;

                    case 1:
                        object.GenPerfectTenses("had ", "had ", "había ", "habías ", "había ", "habíamos ", "habían ");
                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        object2.GenContTenses("was ", "were ", "was ", "estaba ", "estabas ", "estaba ", "estabamos ", "estaban ");
                        complemento = object2.gens;
                        complement = object2.gene;
                        gens = oracionsp + "desde que " + complemento;
                        gene = oracioneng + "since " + complement;
                        break;

                    case 2:
                        object.GenPastSimp();
                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        object2.GenContTenses("was ", "were ", "was ", "estaba ", "estabas ", "estaba ", "estabamos ", "estaban ");
                        complemento = object2.gens;
                        complement = object2.gene;
                        gens = oracionsp + "desde que " + complemento;
                        gene = oracioneng + "since " + complement;
                        break;

                    default:
                        complemento = "no object activated";
                        complement = "no object activated";
                        break;
                }
                break;


            case 12:
                //until trans

                int r3 = (int) (Math.random() * 2);
                complemento = "";
                complement = "";
                complement2 = "";

                switch (r3) {
                    case 0:
                        object2.GenContTenses("was ", "were ", "was ", "estaba ", "estabas ", "estaba ", "estabamos ", "estaban ");
                        oracionsp = object2.gens;
                        oracioneng = object2.gene;
                        object.GenPastSimp();
                        complemento = object.gens;
                        complement = object.gene;
                        gens = oracionsp + "hasta que " + complemento;
                        gene = oracioneng + "until " + complement;
                        break;

                    case 1:
                        object2.GenContTenses("was ", "were ", "was ", "estaba ", "estabas ", "estaba ", "estabamos ", "estaban ");
                        oracionsp = object2.gens;
                        oracioneng = object2.gene;
                        object.GenPvppPast();
                        complemento = object.gens;
                        complement = object.gene;
                        gens = oracionsp + "hasta que " + complemento;
                        gene = oracioneng + "until " + complement;
                        break;


                    default:
                        complemento = "no object activated";
                        complement = "no object activated";
                        break;
                }
                break;


            case 13:
                //whether trans
                object.GenConjFuture("whether", "ya sea que");
                object2.GenPresSimpSubjunctive();
                complemento = object2.gens;
                complement = object2.gene;
                gens = object.gens + " " + complemento + "o no";
                gene = object.gene + " " + complement + "or not";
                break;


            case 14:
                //although trans
                int r4 = (int) (Math.random() * 3);
                complemento = "";
                complement = "";
                complement2 = "";

                switch (r4) {
                    case 0:
                        object.GenPastSimp();
                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        object2.GenPastSimp();
                        complemento = object2.gens;
                        complement = object2.gene;
                        gens = oracionsp + " aún que " + complemento;
                        gene = oracioneng + "although " + complement;
                        break;

                    case 1:
                        object.GenPastSimp();
                        oracionsp = negator.negateSentenceSpanish(object.gens);
                        oracioneng = negator.negatePastSimple(object.gene2);
                        object2.GenPastSimp();
                        complemento = object2.gens;
                        complement = object2.gene;

                        gens = oracionsp + " aún que " + complemento;
                        gene = oracioneng + "although " + complement;

                        break;
                    case 2:
                        object.GenConjFuture("although ", "aun que ");
                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        object2.GenPresSimpSubjunctive();
                        complemento = object2.gens;
                        complement = object2.gene;
                        gens = oracionsp + complemento;
                        gene = oracioneng + complement;

                        break;

                    default:
                        complemento = "no object activated";
                        complement = "no object activated";
                        break;
                }
                break;


            case 15:
                int r6 = (int) (Math.random() * 2);
                complemento = "";
                complement = "";
                complement2 = "";

                switch (r6) {
                    case 0:
                        object.GenConj("even if ", "incluso si ");
                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        object2.GenPresSimp();
                        complemento = object2.gens;
                        complement = object2.gene;
                        gens = oracionsp + complemento;
                        gene = oracioneng + complement;
                        break;

                    case 1:
                        object.GenConjFuture("even if ", "incluso si ");
                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        object2.GenPresSimp();
                        complemento = object2.gens;
                        complement = object2.gene;
                        gens = oracionsp + complemento;
                        gene = oracioneng + complement;
                        break;

                }

                break;


            case 16:
                //once trans


                object.GenConjFuture("once ", "una vez que ");
                oracionsp = object.gens;
                oracioneng = object.gene;
                object2.GenPresSimpSubjunctive();
                complemento = object2.gens;
                complement = object2.gene;
                gens = oracionsp + complemento;
                gene = oracioneng + complement;
                break;


            case 17:
                //unless trans


                object.GenConjFuture2("unless  ", "a menos que ");
                oracionsp = negator.negateSentenceSpanish(object.gens);
                oracioneng = negator.negateFirstAuxOrModalContracted(object.gene);
                object2.GenPresSimpSubjunctive();
                complemento = object2.gens;
                complement = object2.gene;
                gens = oracionsp + " " + complemento;
                gene = oracioneng + " " + complement;
                break;


            case 18:
                //now that tran

                object.GenConjFuture2("now that ", " ahora que ");
                oracionsp = negator.negateSentenceSpanish(object.gens);
                oracioneng = negator.negateFirstAuxOrModalContracted(object.gene);
                object2.GenPastSimp();
                complemento = object2.gens;
                complement = object2.gene;
                gens = oracionsp + " " + complemento;
                gene = oracioneng + " " + complement;


                break;

            case 19:

                //as long as trans
                int r8 = (int) (Math.random() * 2);

                switch (r8) {
                    case 0:
                        object.GenConjFuture("as long as ", "siempre y cuando ");
                        oracionsp = object.gens;
                        oracioneng = object.gene;
                        object2.GenPresSimpSubjunctive();
                        complemento = object2.gens;
                        complement = object2.gene;
                        gens = oracionsp + complemento;
                        gene = oracioneng + complement;
                        break;

                    case 1:
                        object.GenConjFuture2("as long as ", "siempre y cuando ");
                        oracionsp = negator.negateSentenceSpanish(object.gens);
                        oracioneng = negator.negateFirstAuxOrModalContracted(object.gene);
                        object2.GenPresSimpSubjunctive();
                        complemento = object2.gens;
                        complement = object2.gene;
                        gens = oracionsp + " " + complemento;
                        gene = oracioneng + " " + complement;
                        break;
                }
                break;


        }
    }

    public void genCeroToFifty() {
        int rv = (int) (Math.random() * 49);
        switch (rv) {
            case 0:
                gen.artob(0);
                sp = gen.ob;
                globalAnswer = gen.eng;
                break;

            case 1:
                gen.tobe();
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 2:
                gen.advpronverb(4); // Assuming this needs to be called for type 0 in case 2
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;


            case 3:
                gen.prepartob(0);
                sp = gen.ob;
                globalAnswer = gen.eng;
                break;


            case 4:
                gen.artoba();
                sp = gen.ob;
                globalAnswer = gen.eng;
                break;


            case 5:
                gen.prepartob(1);
                sp = gen.ob;
                globalAnswer = gen.eng;
                break;

            case 6:
                gen1.GenInfinitives();
                sp = gen1.ob;
                globalAnswer = gen1.eng;
                break;


            case 7:
                int pos = (int) (Math.random() * 6);
                n.GenPresSimp(pos, 0);
                sp = n.gens;
                globalAnswer = n.gene;
                break;

            case 8:
                gen.prepartob(2);
                sp = gen.ob;
                globalAnswer = gen.eng;


                break;

            case 9:
                gen.pronverb("eso ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;


            case 10:
                gen.pronverb("yo ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;


            case 11:
                int r = (int) (Math.random() * 2);
                n.GenRelativeClauses1(r);
                sp = n.gens;
                globalAnswer = n.gene;
                break;

            case 12:
                gen.prepartob(3);
                sp = gen.ob;
                globalAnswer = gen.eng;

                break;


            case 13:
                gen.pronverb("tú ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;


            case 14:
                gen.pronverb("él ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;


            case 15:
                gen.prepartob(4);
                sp = gen.ob;
                globalAnswer = gen.eng;
                break;


            case 16:
                gen.prepartob(5);
                sp = gen.ob;
                globalAnswer = gen.eng;
                break;


            case 17:
                gen.pronverb(4);
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;


            case 18:
                n.apostropheS();
                sp = n.gens;
                globalAnswer = n.gene;

                break;

            case 19:
                gen.pronverb(1);
                sp = gen.gens;
                globalAnswer = gen.gene;

                break;


            case 20:
                gen.pronverb("ellos ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;


            case 21:
                gen.adjmethod("this ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 22:
                gen.advpronverb(3);
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;


            case 23:
                gen.atmeth(8);
                sp = gen.ob;
                globalAnswer = gen.eng;
                break;


            case 24:
                gen.pronverb("nosotros ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 25:
                gen.adjmethod("his ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 26:
                gen.atmeth(6);
                sp = gen.ob;
                globalAnswer = gen.eng;
                break;

            case 27:
                gen.adjmethod("that ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            // hemos eskipeado el 28 y el 29/ por qeu eran not y nt/ el de abajo es el 30
            case 28:
                gen.atmeth(9);
                sp = gen.ob;
                globalAnswer = gen.eng;
                break;

            case 29:
                gen.or();
                sp = gen.ob;
                globalAnswer = gen.eng;
                break;


            case 30:
                gen.pronverb("ella ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 31:
                Nobles n1 = new Nobles();
                int pos1 = (int) (Math.random() * 6);
                n1.GenPresSimpAs(pos1);
                sp = n1.gens;
                globalAnswer = n1.gene;
                break;

            case 32:
                Nobles n2 = new Nobles();
                int pos2 = (int) (Math.random() * 6);
                n2.GenPresSimpWhat(pos2);
                sp = n2.gens;
                globalAnswer = n2.gene;
                break;

            case 33:
                gen.pronverb(2);
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;


            case 34:
                gen.adjmethod("their ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;


            case 35:
                gen.pronverbwill();
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 36:
                gen.genWho();
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 37:
                gen.pronverbcan();
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 38:
                gen.pronverb(3);
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 39:
                gen.pronverbif();
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 40:
                gen.all();
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 41:
                gen.pronverbwould();
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 42:
                gen.adjmethod("her ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 43:
                gen.make();
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 44:
                gen.prepartob(7);
                sp = gen.ob;
                globalAnswer = gen.eng;
                break;

            case 45:
                gen.adjmethod("my ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 46:
                gen.pronverb(5);
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 47:
                gen.as();
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 48:
                object.GenThereBe();
                sp = object.gens.trim();
                globalAnswer = object.gene.trim();
                break;


        }

    }
    public void gen50to100() {

        String[] subjectsEnglish = {"I ", "You ", "He ", "She ", "We ", "They "};
        int r = (int) (Math.random() * subjectsEnglish.length);
        String pronoun = subjectsEnglish[r];
        int rv = (int) (Math.random() * 49);
        switch (rv) {
            case 0:
                gen.adjmethod("one ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 1:
                object.GenPresSimpPrepasAdv("up ", "hacia arriba");
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 2:
                nouns.nounGen("the time ", "el tiempo ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;

                break;


            case 3:
                nouns.nounGen("the year ", "el año ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;

                break;


            case 4:
                nouns.adjAdv("so ", "tan ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;


            case 5:
                object.GenPresSimp(pronoun, 7);
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 6:
                object.GenPresSimp(pronoun,8);
                sp= object.gens;
                globalAnswer=object.gene;
                break;


            case 7:
                Nobles n3 = new Nobles();
                int pos3 = (int) (Math.random() * 6);
                n3.GenPresSimpWhich(pos3);
                sp=n3.gens ;
                globalAnswer=n3.gene;
                break;

            case 8:

                object.GenPresSimpAdverbs3("when ","cuando ");
                sp= object.gens;
                globalAnswer=object.gene;
                break;

            case 9:
                gen.adjmethodP("some ");
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;


            case 10:
                nouns.genPronoun("them ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;


            case 11:
                nouns.nounGen("the people ","la gente ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;

            case 12:
                object.GenPresSimp(pronoun,9);
                sp= object.gens;
                globalAnswer=object.gene;
                break;


            case 13:
                nouns.genPronoun("me ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;


            case 14:
                object.GenPresSimpPrepasAdv("out ", "hacia afuera ");
                sp= object.gens;
                globalAnswer=object.gene;
                break;


            case 15:
                nouns.genPreps("into");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;


            case 16:
                object.GenPresSimpAdverbs("just ","solo ");
                sp= object.gens;
                globalAnswer=object.gene;
                break;


            case 17:
                nouns.genPronoun("him ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;


            case 18:

                object.GenPresSimp(pronoun,10);
                sp= object.gens;
                globalAnswer=object.gene;
                break;

            case 19:
                gen.adjmethod("your ");
                sp= gen.gens;
                globalAnswer=gen.gene;


                break;


            case 20:
                object.GenPresSimpAdverbs2("now ","ahora ");
                sp= object.gens;
                globalAnswer=object.gene;
                break;


            case 21:
                object.GenPresSimpModals("could ","podría ","podrías ","podría ","podríamos ","podrían ");
                sp= object.gens;
                globalAnswer=object.gene;
                break;

            case 22:
                nouns.GenThan();
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;


            case 23:
                nouns.genPreps("like");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;


            case 24:
                nouns.adjectiveGen("other ","otro ","otra ");
                sp = nouns.gens ;
                globalAnswer=nouns.gene;
                break;

            case 25:
                object.GenPresSimpAdverbs2("then ","entonces ");
                sp= object.gens;
                globalAnswer=object.gene;

                break;

            case 26:
                gen.adjmethod("its ");
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;

            case 27:
                gen.adjmethodP("two ");
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;

            case 28:
                gen.adjmethod("our ");
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;

            case 29:
                object.GenPresSimpAdverbs2("more ","mas ");
                sp = object.gens;
                globalAnswer=object.gene;

                break;


            case 30:
                gen.adjmethodP("these ");
                sp= gen.gens;
                globalAnswer=gen.gene;

                break;

            case 31:
                object.GenPresSimp(pronoun,11);
                sp = object.gens; // Removed the "+"-"+" part and added a semicolon as requested.
                globalAnswer = object.gene;
                break;

            case 32:
                nouns.nounGen("the way ","el camino ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 33:
                gen.adjmethod("no ");
                sp = gen.gens;
                globalAnswer = gen.gene;

                break;


            case 34:
                object.GenPresSimp(pronoun,12);
                sp = object.gens;
                globalAnswer = object.gene;
                break;


            case 35:
                gen.adjmethod("first ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 36:
                object.GenPresSimpAdverbs2("also ", "también ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 37:
                nouns.adjectiveGen("new ", "nuevo ", "nueva ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 38:
                // because conj
                object.GenConj("because ", "por que ");
                gen1.GenPresSimp2();
                complemento= gen1.gens;
                complement = gen1.gene;
                sp = object.gens+" "+ complemento;
                globalAnswer=object.gene+" "+complement;
                break;

            case 39:
                nouns.nounGen("the day ", "el día ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 40:
                gen.adjmethodP("more ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 41:
                object.GenPresSimp(pronoun, 13);
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 42:
                nouns.nounGen("the man ", "el hombre ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 43:
                object.GenPresSimpAdverbs2("here ", "aquí ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 44:
                object.GenPresSimp(pronoun, 14);
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 45:
                object.GenPresSimp(pronoun, 15);
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 46:
                nouns.nounGen("the thing ", "la cosa ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 47:
                object.GenPresSimpAdverbs2("well ", "bien ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 48:
                gen.adjmethodP("many ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;


        }

    }

    public void gen100to150() {
        String[] subjectsEnglish = {"I ", "You ", "He ", "She ", "We ", "They "};
        int r = (int) (Math.random() * subjectsEnglish.length);
        String pronoun = subjectsEnglish[r];
        int rv = (int) (Math.random() * 42); // Updated to the number of cases

        switch (rv) {
            case 0:
                object.GenPresSimpAdverbs("only ", "solamente ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 1:
                gen.adjmethodP("those ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 2:
                object.GenPresSimp(pronoun, 16);
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 3:
                nouns.adjAdv("very ", "muy ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 4:
                nouns.genPronoun("one ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 5:
                object.GenPresSimpAdverbs("even ", "incluso ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 6:
                nouns.genPronoun("her ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 7:
                object.GenPresSimpPrepasAdv("back", "hacia atras");
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 8:
                gen.adjmethod("any ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 9:
                nouns.adjectiveGen("good ", "buen ", "buena ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 10:
                nouns.genPronoun("us ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 11:
                nouns.genPreps("through");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 12:
                nouns.nounGen("the woman ", "la mujer ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 13:
                nouns.nounGen("life ", "la vida ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 14:
                nouns.nounGen("the child ", "el niño ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 15:
                object.GenPresSimpAdverbs2("there ", "ahí ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 16:
                object.GenPresSimpPrepasAdv("down ", "hacia abajo");
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 17:
                nouns.nounGen("the work ", "el trabajo ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 18:
                nouns.genPreps("after");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 19:
                object.GenPresSimp(pronoun, 18);
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 20:
                object.GenMay("may ", "puede que ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 21:
                nouns.nounGen("the world ", "el mundo ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 22:
                nouns.genPreps("over");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 23:
                object.GenPresSimpModals("should ", "debería ", "deberías ", "debería ", "deberíamos ", "deberían ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 24:
                object.GenPresSimpAdverbs("still ", "aún ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 25:
                object.GenPresSimp(pronoun, 19);
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 26:
                object.GenPresSimpPrepasAdv("in", "hacia adentro ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 27:
                nouns.nounGen("the school ", "la escuela ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 28:
                object.GenPresSimpAdverbs3("as ", "En la manera en que ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 29:
                gen.adjmethod("last ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 30:
                object.GenPresSimp(pronoun, 20);
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 31:
                object.GenPresSimpAdverbs2("too ", "tambien ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 32:
                object.GenPresSimp(pronoun, 21);
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 33:
                gen.adjmethodP("three ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 34:
                object.GenPresSimp(pronoun, 22);
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 35:
                object.GenPresSimpAdverbs3("When ", "Cuando ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 36:
                object.GenPresSimp(pronoun, 23);
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 37:
                nouns.nounGen("The state ", "El estado ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 38:
                object.GenPresSimpAdverbs("never ", "nunca ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 39:
                nouns.genPreps("between");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 40:
                nouns.adjectiveGen("high ", "alto ", "alta ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 41:
                nouns.genPronoun("something ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 42:
                object.GenPresSimpAdverbs("really ", "realmente ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 43:
                nouns.adjAdv2("the most ", "el mas ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 44:
                gen.adjmethod("another ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;
            case 45:
                gen.uncountableNounsGen();
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;
            case 46:
                gen.adjmethod("own ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;
            case 47:
                nouns.nounGen("the family ", "la familia ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 48:
                nouns.genPreps("out");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 49:
                nouns.nounGen("the house ", "la casa ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 50:
                object.GenPresSimp(pronoun, 24);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
        }
    }


    public void gen150to200() {
        String[] subjectsEnglish = {"I ", "You ", "He ", "She ", "We ", "They "};
        int r = (int) (Math.random() * subjectsEnglish.length);
        String pronoun = subjectsEnglish[r];
        int rv = 152 + (int) (Math.random() * 49);


        switch (rv) {
            case 152:
                Intrans intrans = new Intrans();
                int in =(int)(Math.random()*intrans.at.length);
                String atArraysp=intrans.aten[in];
                String atArrayeng=intrans.at[in];
                object.GenPresSimp(pronoun, 25);
                sp = object.gens+ atArraysp;
                globalAnswer = object.gene+atArrayeng;
                break;
            case 153:
                nouns.adjectiveGen("old ", "viejo ", "vieja ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 154:
                nouns.genPreps("on");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 155:
                object.GenConj("while ", "mientras que ");
                object2.GenPresSimp();
                sp = object.gens + object2.gens;
                globalAnswer=object.gene + object2.gene;
                break;
            case 156:
                object.GenPresSimp(pronoun, 26);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 157:
                object.GenPresSimp(pronoun, 27);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 158:
                object.GenPresSimpAdverbs3("why ", "la razón por la cual ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 159:
                nouns.nounGen("the president ", "el presidente ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 160:
                object.GenPresSimp(pronoun, 28);
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 161:
                nouns.adjectiveGen("same ", "mismo ", "misma ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 162:
                nouns.adjectiveGen("great ", "grandioso ", "grandiosa ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 163:
                object.GenPresSimp(pronoun, 29);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 164:
                nouns.adjectiveGen("big ", "gran ", "gran ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 165:
                object.GenPresSimp(pronoun, 30);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 166:
                nouns.nounGen("the group ", "el grupo ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 167:
                nouns.nounGen("the country ", "el país ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 168:
                object.GenPresSimp(pronoun, 31);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 169:
                nouns.nounGen("the problem ", "el problema ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 170:
                // where
                object.GenConj("where ", "donde ");
                object2.GenPresSimp();
                complemento= object2.gens;
                complement = object2.gene;
                sp = object.gens+complemento;
                globalAnswer=object.gene+complement;
                break;
            case 171:
                object.GenPresSimp(pronoun, 32);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 172:
                nouns.nounGen("the student ", "el estudiante ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 173:
                gen.adjmethod("every ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;
            case 174:
                nouns.nounGen("the hand ", "la mano ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 175:
                object.GenPresSimp(pronoun, 33);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 176:
                nouns.genPreps("against");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 177:
                object.GenPresSimp(pronoun, 34);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 178:
                nouns.adjectiveGen2("american ", "americano ", "americana ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 179:
                nouns.nounGen("the part ", "la parte ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 180:
                object.GenPresSimp(pronoun, 35);
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 181:
                object.genAbout();
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 182:
                object.genOver();
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 183:
                object.GenPresSimpSubjunctive("might ", "quiza ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 184:
                gen.adjmethod("such ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;
            case 185:
                nouns.nounGen("the place ", "el lugar ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 186:
                object.GenPresSimpAdverbs2("again ", "otra vez ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 187:
                nouns.nounGen("the city ", "la ciudad ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 188:
                nouns.nounGen("the case ", "el caso ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 189:
                gen.adjmethodP("most ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;
            case 190:
                gen.adjmethodP("few ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;

            case 191:
                nouns.nounGen("the system ", "el sistema ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 192:
                nouns.nounGen("the week ", "la semana ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 193:
                object.GenPresSimpAdverbs3("where ", "en donde ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 194:
                nouns.nounGen("the company ", "la empresa ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 195:
                gen.adjmethod("each ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;
            case 196:
                nouns.nounGen("the percent ", "el porcentaje ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 197:
                object.GenPresSimp(pronoun, 36);
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 198:
                // so/ conjunction
                object.GenConj("so", "así que ");
                object2.GenPresSimp();
                complemento= object2.gens;
                complement = object2.gene;
                sp = object.gens+" "+ complemento;
                globalAnswer=object.gene+" "+complement;
                break;
            case 199:
                nouns.genPreps("during");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 200:
                nouns.nounGen("the question ", "la pregunta ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;


        }

    }

    public void gen200to250() {
        String[] subjectsEnglish = {"I ", "You ", "He ", "She ", "We ", "They "};
        int r = (int) (Math.random() * subjectsEnglish.length);
        String pronoun = subjectsEnglish[r];
        int rv = 201 + (int) (Math.random() * 50);

       switch (rv){
           case 201:
               // right/adverb
               object.GenConj("right ", "correctamente");
               sp=object.gens;
               globalAnswer=object.gene;
               break;
           case 202:
               nouns.nounGen("the program ", "el programa ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 203:
               object.GenPresSimp(pronoun, 17);
               sp = object.gens;
               globalAnswer = object.gene;
               break;
           case 204:
               object.GenPresSimp(pronoun, 37);
               sp = object.gens;
               globalAnswer = object.gene;
               break;
           case 205:
               nouns.nounGen("the number ", "el número ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 206:
               nouns.adjectiveGen("small ", "pequeño ", "pequeña ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 207:
               nouns.nounGen("the government ", "el gobierno ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 208:
               object.GenPresSimp(pronoun, 38);
               sp = object.gens;
               globalAnswer = object.gene;
               break;
           case 209:
               object.GenOff();
               sp = object.gens;
               globalAnswer = object.gene;
               break;
           case 210:
               object.GenPresSimp(pronoun, 39);
               sp = object.gens;
               globalAnswer = object.gene;
               break;

           case 211:
               object.GenPresSimp(pronoun, 40);
               sp = object.gens;
               globalAnswer = object.gene;
               break;
           case 212:
               object.GenPresSimpAdverbs("always ", "siempre ");
               sp = object.gens;
               globalAnswer = object.gene;
               break;
           case 213:
               nouns.nounGen("the night ", "la noche ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 214:
               object.GenPresSimp(pronoun, 41);
               sp = object.gens;
               globalAnswer = object.gene;
               break;
           case 215:
               object.GenPresSimpAdverbs2("today ", "hoy ");
               sp = object.gens;
               globalAnswer = object.gene;
               break;
           case 216:
               object.GenPresSimp(pronoun, 42);
               sp = object.gens;
               globalAnswer = object.gene;
               break;
           case 217:
               nouns.nounGen("the point ", "el punto ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 218:
               object.GenPresSimp(pronoun, 43);
               sp = object.gens;
               globalAnswer = object.gene;
               break;
           case 219:
               object.genHappen();
               sp = object.gens;
               globalAnswer = object.gene;
               break;
           case 220:
               object.GenPresSimp(pronoun, 44);
               sp = object.gens;
               globalAnswer = object.gene;
               break;

           case 221:
               gen.adjmethod("next ");
               sp = gen.gens;
               globalAnswer = gen.gene;
               break;
           case 222:
               nouns.genPreps("without");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 223:
               nouns.genPreps("before");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 224:
               nouns.adjectiveGen2("large ", "grande ", "gran ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 225:
               object.GenPresSimpModals("must ", "debo ", "debes ", "debe ", "debemos ", "deben ");
               sp = object.gens;
               globalAnswer = object.gene;
               break;
           case 226:
               gen.adjmethodP("all");
               sp = gen.gens;
               globalAnswer = gen.gene;
               break;
           case 227:
               nouns.nounGen("the war ", "la guerra ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 228:
               nouns.nounGen("the home ", "el hogar ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 229:
               nouns.genPreps("under");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 230:
               nouns.nounGen("the room ", "el cuarto ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;

           case 231:
               nouns.nounGen("the fact ", "el hecho ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 232:
               nouns.nounGen("the area ", "la zona ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 233:
               nouns.adjectiveGen2("national ", "nacional ", "nacional ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 234:
               object.GenPresSimp(pronoun, 45);
               sp = object.gens;
               globalAnswer = object.gene;
               break;
           case 235:
               nouns.nounGen("the money ", "el dinero ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 236:
               nouns.nounGen("the right ", "el derecho ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 237:
               nouns.nounGen("the story ", "la historia ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 238:
               nouns.nounGen("the water ", "el agua ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 239:
               nouns.nounGen("the mother ", "la madre ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 240:
               nouns.adjectiveGen2("different ", "diferente ", "diferente ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;

           case 241:
               nouns.adjectiveGen2("young ", "joven ", "joven ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 242:
               nouns.nounGen("the month ", "el mes ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 243:
               nouns.nounGen("the lot ", "el lote ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 244:
               nouns.nounGen("the book ", "el libro ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 245:
               nouns.nounGen("the eye ", "el ojo ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 246:
               nouns.nounGen("the study ", "el estudio ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 247:
               nouns.nounGen("the job ", "el trabajo ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 248:
               nouns.nounGen("the kind ", "el tipo ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 249:
               // Note: This seems to be a repeat of case 248 with an incorrect description. Adjusting to "the word", "la palabra".
               nouns.nounGen("the word ", "la palabra ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 250:
               nouns.nounGen("the issue ", "el tema ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
       }

    }
    public void gen250to300() {
        String[] subjectsEnglish = {"I ", "You ", "He ", "She ", "We ", "They "};
        int r = (int) (Math.random() * subjectsEnglish.length);
        String pronoun = subjectsEnglish[r];
        int rv = 250 + (int) (Math.random() * 51);


       switch (rv){
           case 251:
               nouns.nounGen("the side ", "el lado ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 252:
               gen.adjmethodP("four ");
               sp = gen.gens;
               globalAnswer = gen.gene;
               break;
           case 253:
               nouns.nounGen("the business ", "el negocio ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;

           case 254:
               // though
               object.GenConjFuture("though", "aún que");
               object2.GenPresSimpSubjunctive();
               complemento= object2.gens;
               complement = object2.gene;
               sp = object.gens+" "+ complemento;
               globalAnswer=object.gene+" "+complement;
               break;
           case 255:
               nouns.nounGen("the head ", "la cabeza ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 256:
               object.GenPresSimpAdverbs2("far ", "lejos ");
               sp = object.gens;
               globalAnswer = object.gene;
               break;
           case 257:
               nouns.adjectiveGen2("long ", "largo ", "larga ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 258:
               nouns.adjectiveGen2("black ", "negro ", "negra ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 259:
               gen.adjmethodP("million");
               sp = gen.gens;
               globalAnswer = gen.gene;
               break;
           case 260:
               gen.adjmethodP("both ");
               sp = gen.gens;
               globalAnswer = gen.gene;
               break;
           case 261:
               nouns.adjectiveGen2("little ", "chiquito ", "chiquita ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;

           case 262:
               // yes
               sp="yes/ si ";
               break;
           case 263:
               // after
               object.GenConj("after ", " después de que ");
               object2.GenPresSimp();
               complemento= object2.gens;
               complement = object2.gene;
               sp = object.gens+ complemento;
               globalAnswer=object.gene+complement;
               break;
           case 264:
               // since
               object.GenConj("since ", "ya que ");
               object2.GenPresSimp();
               complemento= object2.gens;
               complement = object2.gene;
               sp = object.gens+complemento;
               globalAnswer=object.gene+complement;
               break;
           case 265:
               nouns.genPreps("around");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 266:
               // Adjusted to reflect the intended "around" functionality; assuming a placeholder method was mentioned.
               // If "genLong" was intended for "long", this case requires clarification or adjustment to fit "around".
               object.genLong(); // Placeholder for the correct functionality.
               sp = object.gens ;
               globalAnswer=object.gene;
               break;
           case 267:
               object.GenPresSimp(pronoun, 46);
               sp = object.gens;
               globalAnswer = object.gene;
               break;
           case 268:
               nouns.nounGen("the service ", "el servicio ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 269:
               nouns.adjectiveGen("important ", "importante ", "importante ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 270:
               object.GenPresSimp(pronoun, 47);
               sp = object.gens;
               globalAnswer = object.gene;
               break;
           case 271:
               object.GenPresSimpPrepasAdv("away ", "lejos ");
               sp = object.gens;
               globalAnswer = object.gene;
               break;
           case 272:
               nouns.nounGen("the friend ", "el amigo ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;
           case 273:
               object.GenPresSimpAdverbs3("however ", "como sea que ");
               sp = object.gens;
               globalAnswer = object.gene;
               break;
           case 274:
               nouns.nounGen("the power ", "el poder ");
               sp = nouns.gens;
               globalAnswer = nouns.gene;
               break;

           case 275:
               //
               sp="no/no";
               break;
           case 276:
               // yet adverb
               Nobles nob = new Nobles();
               nob.GenPresPerfVocab("yet ", "todavía ");
               sp = nob.gens;
               globalAnswer=nob.gene;
               break;
           case 277:
               // father
               nouns.nounGen("the father ","el padre ");
               sp = nouns.gens;
               globalAnswer=nouns.gene;
               break;
           case 278:
               // hour
               nouns.nounGen("the hour ","la hora ");
               sp = nouns.gens;
               globalAnswer=nouns.gene;
               break;
           case 279:
               // often adverb
               object.GenPresSimpAdverbs2("often ","seguido ");
               sp = object.gens;
               globalAnswer=object.gene;
               break;
           case 280:
               // until
               object.GenConjFuture("until", "hasta que");
               object2.GenPresSimpSubjunctive();
               complemento= object2.gens;
               complement = object2.gene;
               sp = object.gens+" "+ complemento;
               globalAnswer=object.gene+" "+complement;
               break;
           case 281:
               //political
               nouns.adjectiveGen("political ","politico ","politica ");
               sp = nouns.gens ;
               globalAnswer=nouns.gene;
               break;
           case 282:
               // line
               nouns.nounGen("the line ","la linea ");
               sp = nouns.gens;
               globalAnswer=nouns.gene;
               break;
           case 283:
               //end
               nouns.nounGen("the end ","el fin ");
               sp = nouns.gens;
               globalAnswer=nouns.gene;
               break;
           case 284:
               // stand
               object.GenPresSimp(pronoun,48);
               sp= object.gens;
               globalAnswer=object.gene;
               break;
           case 285:
               //among
               nouns.genPreps("among");
               sp = nouns.gens;
               globalAnswer=nouns.gene;
               break;
           case 286:
               // game
               nouns.nounGen("the game ","el juego ");
               sp = nouns.gens;
               globalAnswer=nouns.gene;
               break;
           case 287:
               //ever adverb
               Nobles nob2 = new Nobles();
               nob2.GenPresPerfVocab("ever ", "nunca ");
               sp = nob2.gens;
               globalAnswer=nob2.gene;

               break;
           case 288:
               // lose
               object.GenPresSimp(pronoun,49);
               sp= object.gens;
               globalAnswer=object.gene;
               break;
           case 289:
               //bad
               nouns.adjectiveGen2("bad ","mal ","mala ");
               sp = nouns.gens ;
               globalAnswer=nouns.gene;
               break;
           case 290:
               //member
               nouns.nounGen("the member ","el miembro ");
               sp = nouns.gens;
               globalAnswer=nouns.gene;
               break;
           case 291:
               // meet
               object.GenPresSimp(pronoun,50);
               sp= object.gens;
               globalAnswer=object.gene;
               break;
           case 292:
               // pay
               object.GenPresSimp(pronoun,51);
               sp= object.gens;

               globalAnswer=object.gene;
               break;
           case 293:
               // law
               nouns.nounGen("the law ","la ley ");
               sp = nouns.gens;
               globalAnswer=nouns.gene;
               break;
           case 294:
               //almost
               object.GenAlmost("almost ", "casi ");
               sp= object.gens;
               globalAnswer=object.gene;
               break;
           case 295:
               // car
               nouns.nounGen("the car ","el carro ");
               sp = nouns.gens;
               globalAnswer=nouns.gene;
               break;
           case 296:
               // later adverb
               object.GenPresSimpAdverbs2("later ","mas tarde ");
               sp = object.gens;
               globalAnswer=object.gene;
               break;
           case 297:
               //much
               object.GenPresSimpAdverbs2("much ","mucho ");
               sp = object.gens;
               globalAnswer=object.gene;
               break;
           case 298:
               //name
               nouns.nounGen("the name ","el nombre ");
               sp = nouns.gens;
               globalAnswer=nouns.gene;
               break;
           case 299:
               // include
               object.GenPresSimp(pronoun,52);
               sp= object.gens;
               globalAnswer=object.gene;
               break;
           case 300:
               //five
               gen.adjmethodP("five ");
               sp= gen.gens;
               globalAnswer=gen.gene;
               break;
       }

    }

    public void gen300to350() {
        String[] subjectsEnglish = {"I ", "You ", "He ", "She ", "We ", "They "};
        int r = (int) (Math.random() * subjectsEnglish.length);
        String pronoun = subjectsEnglish[r];
        int rv = 301 + (int) (Math.random() * 50);
        Generator genA= new Generator();
        switch (rv){
            case 301:
                // center
                nouns.nounGen("the center ","el centro ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 302:
                // once adverb
                object.GenPresSimpAdverbs2("once ","una vez ");
                sp = object.gens;
                globalAnswer=object.gene;
                break;
            case 303:
                //university
                nouns.nounGen("the university ","la universidad ");
                sp = nouns.gens;
                globalAnswer =nouns.gene;
                break;
            case 304:
                // continue
                object.GenPresSimp(pronoun,53);
                sp= object.gens;
                globalAnswer=object.gene;
                break;
            case 305:
                // least
                nouns.adjAdv("the least ","el menos ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 306:
                //real
                nouns.adjectiveGen2("real ","real ","real ");
                sp = nouns.gens ;
                globalAnswer=nouns.gene;
                break;
            case 307:
                nouns.adjectiveGen2("white ", "blanco ", "blanca ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 308:
                object.GenPresSimp(pronoun, 54);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 309:
                object.GenPresSimp(pronoun, 55);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 310:
                gen.adjmethodP("several ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;
            case 311:
                object.GenAgo();
                sp = object.gens;
                globalAnswer=object.gene;
                break;
            case 312:
                nouns.nounGen("the information ", "la información ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 313:
                nouns.genPronoun("nothing ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 314:
                nouns.nounGen("the community ", "la comunidad ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 315:
                nouns.adjectiveGen("best ", "mejor ", "mejor ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 316:
                nouns.adjectiveGen2("right ", "correcto ", "correcta ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 317:
                nouns.nounGen("the idea ", "la idea ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 318:
                object.GenPresSimp(pronoun, 56);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 319:
                nouns.nounGen("the body ", "el cuerpo ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 320:
                object.GenPresSimp(pronoun, 57);
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 321:
                nouns.nounGen("the kid ", "el niño ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 322:
                nouns.nounGen("the minute ", "el minuto ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 323:
                nouns.nounGen("the table ", "la mesa ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 324:
                // Assuming the presence of a method to handle conditional or future conjunctive scenarios.
                // The provided adaptation reflects a hypothetical implementation based on your description.
                object.GenConjFuture("whether", "ya sea que");
                object2.GenPresSimpSubjunctive(); // Assuming a placeholder for actual method implementation.
                complemento = object2.gens;
                complement = object2.gene;
                sp = object.gens + " " + complemento + "o no";
                globalAnswer=object.gene + " " + complement + "or not";
                break;
            case 325:
                object.GenPresSimp(pronoun, 58);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 326:
                nouns.nounGen("the team ", "el equipo ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 327:
                nouns.nounGen("the back ", "la espalda ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 328:
                object.GenPresSimp(pronoun, 59);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 329:
                object.GenPresSimpAdverbs2("together ", "juntos ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 330:
                object.GenPresSimp(pronoun, 60);
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 331:
                object.GenPresSimpAdverbs2("around ", "al rededor ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 332:
                nouns.adjectiveGen("only ", "único ", "única ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 333:
                object.GenPresSimp(pronoun, 61);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 334:
                nouns.nounGen("the face ", "la cara ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 335:
                nouns.genPronoun("anything ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 336:
                nouns.adjectiveGen2("public ", "publico ", "publica ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 337:
                nouns.adjectiveGen2("social ", "social ", "social ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 338:
                genA.GenPastSimp1(); // Placeholder for actual implementation.
                sp = genA.gens + "ya ";
                globalAnswer=genA.gene + "already";
                break;
            case 339:
                nouns.nounGen("the parent ", "el padre ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 340:
                object.GenPresSimp(pronoun, 62);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 341:
                object.GenPresSimp(pronoun, 63);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 342:
                nouns.nounGen("the office ", "la oficina ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 343:
                object.GenPresSimp(pronoun, 64);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 344:
                nouns.nounGen("the level ", "el nivel ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 345:
                object.GenPresSimp(pronoun, 65);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 346:
                object.GenPresSimp(pronoun, 66);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 347:
                nouns.nounGen("the person ", "la persona ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 348:
                nouns.nounGen("the door ", "la puerta ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 349:
                nouns.adjectiveGen("sure ", "seguro ", "segura ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 350:
                object.GenPresSimp(pronoun, 67);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
        }

    }

    public void gen350to400() {
        String[] subjectsEnglish = {"I ", "You ", "He ", "She ", "We ", "They "};
        int r = (int) (Math.random() * subjectsEnglish.length);
        String pronoun = subjectsEnglish[r];
        int rv = 351 + (int) (Math.random() * 50);
        switch (rv) {
            case 351:
                // street
                nouns.nounGen("the street ","la calle ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 352:
                // such
                nouns.genPreps("such");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 353:
                // history
                nouns.nounGen("the history ","la historia ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 354:
                //party
                nouns.nounGen("the party ","la fiesta ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 355:
                // grow
                object.GenPresSimp(pronoun,68);
                sp= object.gens;
                globalAnswer=object.gene;
                break;
            case 356:
                // reason
                nouns.nounGen("the reason ","la razón ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 357:
                //morning
                nouns.nounGen("the morning ","la mañana ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 358:
                // open
                object.GenPresSimp(pronoun,69);
                sp= object.gens;
                globalAnswer=object.gene;
                break;
            case 359:
                // within
                nouns.genPreps("within");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 360:
                // change
                nouns.nounGen("the change ","el cambio ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 361:
                //although
                object.GenConjFuture("although", "aún que");
                object2.GenPresSimpSubjunctive();
                complemento= object2.gens;
                complement = object2.gene;
                sp = object.gens+" "+ complemento;
                globalAnswer=object.gene+" "+complement;
                break;
            case 362:
                // walk
                object.GenPresSimp(pronoun,70);
                sp= object.gens;
                globalAnswer=object.gene;
                break;
            case 363:
                // news
                nouns.nounGen("the news ","las noticias ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 364:
                nouns.nounGen("the health ", "la salud ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 365:
                nouns.nounGen("the court ", "la corte ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 366:
                nouns.nounGen("the force ", "la fuerza ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 367:
                nouns.adjectiveGen("early ", "temprano ", "temprana ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 368:
                nouns.genPronoun("himself ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 369:
                nouns.nounGen("the air ", "el aire ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 370:
                nouns.adjectiveGen("low ", "bajo ", "baja ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 371:
                // before conjunction
                object.GenConjFuture("before", "antes de que");
                object2.GenPresSimpSubjunctive();
                complemento= object2.gens;
                complement = object2.gene;
                sp = object.gens+" "+ complemento;
                globalAnswer=object.gene+" "+complement;
                break;
            case 372:
                nouns.nounGen("the art ", "el arte ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 373:
                nouns.nounGen("the result ", "el resultado ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 374:
                nouns.nounGen("the moment ", "el momento ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 375:
                object.GenPresSimp(pronoun, 71);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 376:
                gen.adjmethodP("both ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;
            case 377:
                object.GenPresSimp(pronoun, 72);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 378:
                nouns.nounGen("the research ", "la investigación ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 379:
                object.GenPresSimpAdverbs2NoObject("enough ", "suficiente ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 380:
                nouns.nounGen("the girl ", "la niña ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 381:
                nouns.nounGen("the boy ", "el niño ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 382:
                object.GenPresSimp(pronoun, 73);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 383:
                nouns.nounGen("the food ", "la comida ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 384:
                nouns.genPreps("across");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 385:
                nouns.nounGen("the guy ", "el tipo ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 386:
                gen.adjmethod("second ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;
            case 387:
                nouns.adjectiveGen("able ", "capaz ", "capaz ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 388:
                nouns.genPreps("toward");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 389:
                object.GenPresSimpAdverbs("maybe ", "quizá ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 390:
                nouns.nounGen("the process ", "el proceso ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 391:
                nouns.genPreps("off");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 392:
                nouns.genPronoun("everything ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 393:
                object.GenPresSimp(pronoun, 74);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 394:
                nouns.nounGen("the age ", "la edad ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 395:
                nouns.nounGen("the policy ", "la política ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 396:
                object.GenPresSimp(pronoun, 75);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 397:
                nouns.genPreps("including");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 398:
                object.GenPresSimpAdverbs("probably ", "probablemente ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 399:
                nouns.nounGen("the education ", "la educación ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 400:
                object.GenPresSimp(pronoun, 76);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
        }

    }

    public void gen400to500() {
        String[] subjectsEnglish = {"I ", "You ", "He ", "She ", "We ", "They "};
        int r = (int) (Math.random() * subjectsEnglish.length);
        String pronoun = subjectsEnglish[r];
        int rv = 401 + (int) (Math.random() * 100);
        switch (rv){
            case 401:
            object.GenPresSimpAdverbs("actually ", "de hecho ");
            sp = object.gens;
            globalAnswer = object.gene;
            break;
            case 402:
                object.GenPresSimp(pronoun, 77);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 403:
                object.GenPresSimp(pronoun, 78);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 404:
                object.GenPresSimp(pronoun, 79);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 405:
                nouns.adjectiveGen2("human ", "humano ", "humana ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 406:
                object.GenPresSimp(pronoun, 80);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 407:
                nouns.nounGen("the fee ", "la multa ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 408:
                object.GenPresSimp(pronoun, 81);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 409:
                object.GenPresSimp(pronoun, 82);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 410:
                nouns.nounGen("the sense ", "el sentido ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 411:
                nouns.nounGen("the teacher ", "el maestro ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 412:
                object.GenPresSimpPrepasAdv("home ", "hacia la casa ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 413:
                nouns.nounGen("the market ", "el mercado ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 414:
                object.GenPresSimp(pronoun, 83);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 415:
                object.GenPresSimp(pronoun, 84);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 416:
                nouns.nounGen("the nation ", "la nación ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 417:
                object.GenPresSimp(pronoun, 85);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 418:
                // Case 418 seems to be a placeholder or unique case without specific instructions.
                sp = "oh";
                break;
            case 419:
                nouns.nounGen("the death ", "la muerte ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 420:
                nouns.nounGen("the plan ", "el plan ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 421:
                nouns.nounGen("the interest ", "el interés ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 422:
                nouns.genPronoun("someone ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 423:
                nouns.nounGen("the experience ", "la experiencia ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 424:
                object.GenPresSimp(pronoun, 86);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 425:
                object.GenPresSimp(pronoun, 87);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 426:
                nouns.genPreps("behind");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 427:
                object.GenPresSimp(pronoun, 88);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 428:
                gen.adjmethodP("six ");
                sp = gen.gens;
                globalAnswer = gen.gene;
                break;
            case 429:
                nouns.adjectiveGen2("local ", "local ", "local ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 430:
                object.GenPresSimp(pronoun, 89);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 431:
                nouns.nounGen("the effect ", "el efecto ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 432:
                object.GenPresSimp(pronoun, 90);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 433:
                nouns.nounGen("the use ", "el uso ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 434:
                nouns.nounGen("the control ", "el control ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 435:
                object.GenPresSimpAdverbs("perhaps ", "tal vez ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 436:
                object.GenPresSimp(pronoun, 91);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 437:
                nouns.nounGen("the class ", "la clase ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 438:
                nouns.adjectiveGen("late ", "tardado ", "tardada ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 439:
                object.GenPresSimpAdverbs2NoObject("little ", "poco ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 440:
                nouns.adjectiveGen("major ", "mayor ", "mayor ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 441:
                sp="yeah";
                break;
            case 442:
                // Assuming object.GenElse() exists for handling "else" as an adverb scenario. Adjusting for conceptual consistency.
                object.GenElse();
                sp = object.gens ;
                globalAnswer=object.gene;
                break;
            case 443:
                object.GenPresSimp(pronoun, 92);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 444:
                nouns.nounGen("the photo ", "la foto ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 445:
                object.GenPresSimp(pronoun, 93);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 446:
                nouns.genPronoun("themselves ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 447:
                nouns.nounGen("the field ", "el campo ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 448:
                nouns.nounGen("the college ", "la universidad ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 449:
                object.GenPresSimpAdverbs2("sometimes ", "a veces ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 450:
                nouns.adjectiveGen2("former ", "anterior ", "anterior ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 451:
                nouns.nounGen("the development ", "el desarrollo ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 452:
                object.GenPresSimp(pronoun, 94);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 453:
                nouns.genPreps("along");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 454:
                object.GenPresSimp(pronoun, 95);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 455:
                nouns.nounGen("the security ", "la seguridad ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 456:
                object.GenPresSimpPrepasAdv("up ", "hacia arriba");
                sp= object.gens;
                globalAnswer=object.gene;
                break;
            case 457:
                nouns.adjectiveGen("possible ", "posible ", "posible ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 458:
                nouns.nounGen("the effort ", "el esfuerzo ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 459:
                nouns.nounGen("the role ", "el papel ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 460:
                nouns.adjectiveGen("better ", "mejor ", "mejor ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;

            case 461:
                nouns.nounGen("the rate ", "la tarifa ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 462:
                nouns.adjectiveGen("strong ", "fuerte ", "fuerte ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 463:
                nouns.nounGen("the music ", "la música ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 464:
                object.GenPresSimp(pronoun, 96);
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 465:
                nouns.nounGen("the leader ", "el líder ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 466:
                nouns.nounGen("the light ", "la luz ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 467:
                nouns.adjectiveGen("whole ", "completo ", "completa ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 468:
                nouns.nounGen("the voice ", "la voz ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 469:
                nouns.nounGen("the color ", "el color ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 470:
                nouns.nounGen("the heart ", "el corazón ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 471:
                nouns.nounGen("the care ", "el cuidado ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 472:
                nouns.nounGen("the police ", "la policía ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 473:
                nouns.adjectiveGen2("economic ", "económico ", "económica ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 474:
                nouns.nounGen("the wife ", "la esposa ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 475:
                nouns.nounGen("the show ", "el espectáculo ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 476:
                nouns.nounGen("the mind ", "la mente ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 477:
                nouns.nounGen("the report ", "el informe ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 478:
                object.GenPresSimpAdverbs("finally ", "finalmente ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;
            case 479:
                nouns.nounGen("the drug ", "la droga ");
                sp = nouns.gens;
                globalAnswer = nouns.gene;
                break;
            case 480:
                object.GenPresSimpAdverbs2NoObject("less ", "menos ");
                sp = object.gens;
                globalAnswer = object.gene;
                break;

            case 481:
                // return
                object.GenPresSimp(pronoun,97);
                sp= object.gens;
                globalAnswer=object.gene;
                break;
            case 482:
                //according
                nouns.genPreps("according to");
                sp = nouns.gens;
                globalAnswer=nouns.gene;

                break;
            case 483:
                // pull
                object.GenPresSimp(pronoun,98);
                sp= object.gens;
                globalAnswer=object.gene;
                break;
            case 484:
                //decision
                nouns.nounGen("the decision ","la decisión ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 485:
                // explain
                object.GenPresSimp(pronoun,99);
                sp= object.gens;
                globalAnswer=object.gene;
                break;
            case 486:
                //carry
                object.GenPresSimp(pronoun,100);
                sp= object.gens;
                globalAnswer=object.gene;
                break;
            case 487:
                // develop
                object.GenPresSimp(pronoun,101);
                sp= object.gens;
                globalAnswer=object.gene;
                break;
            case 488:
                //view
                nouns.nounGen("the view ","la vista ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 489:
                //free
                nouns.adjectiveGen("free ","libre ","libre ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 490:
                // hope
                object.GenPresSimp(pronoun,102);
                sp= object.gens;
                globalAnswer=object.gene;
                break;
            case 491:
                //even
                object.GenConjFuture("even if", "incluso si");
                gen1.GenPresSimp2();
                complemento= gen1.gens;
                complement = gen1.gene;
                sp = object.gens+" "+ complemento;
                globalAnswer=object.gene+" "+complement;

                break;
            case 492:
                // drive
                object.GenPresSimp(pronoun,103);
                sp= object.gens;
                globalAnswer=object.gene;
                break;
            case 493:
                // son
                nouns.nounGen("the son ","el hijo ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 494:
                // arm
                nouns.nounGen("the arm ","el brazo ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 495:
                // department
                nouns.nounGen("the department ","el departamento ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 496:
                //true
                nouns.adjectiveGen("true ","verdadero ","verdadera ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 497:
                // price
                nouns.nounGen("the price ","el precio ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 498:
                //military
                nouns.adjectiveGen2("military ","militar ","militar ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 499:
                //federal
                nouns.adjectiveGen2("federal ","federal ","federal ");
                sp = nouns.gens;
                globalAnswer=nouns.gene;
                break;
            case 500:
                // break
                object.GenPresSimp(pronoun,104);
                sp= object.gens;
                globalAnswer=object.gene;
                break;}

    }


}