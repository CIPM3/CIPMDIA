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
    public void conectorMethod(){
        int r2 = (int)(Math.random()*22);
        switch (r2){
            case 0:
                object.GenConj("and","y");
                int ra= (int)(Math.random()*2);
                complemento="";
                complement="";
                switch (ra){
                    case 0:
                        object2.GenPresSimp();
                        complemento=object2.gens;
                        complement=object2.gene;
                        break;

                    case 1:
                        gen1.GenPresSimp2();
                        complemento=gen1.gens;
                        complement=gen1.gene;
                        break;
                    default:
                        complemento="no object activated";
                        complement="no object activated";
                        break;
                }
                gens= object.gens+" "+complemento;
                gene=object.gene+" "+complement;
                break;

            case 1:
                n.GenRelativeClauses1New();
                gens=n.gens;
                gene=n.gene;
                break;

            case 2:
                object.GenConj("but","pero");
                int rb= (int)(Math.random()*2);
                complemento="";
                complement="";
                switch (rb){
                    case 0:
                        object2.GenPresSimp();
                        complemento=object2.gens;
                        complement=object2.gene;
                        break;

                    case 1:
                        gen1.GenPresSimp2();
                        complemento=gen1.gens;
                        complement=gen1.gene;
                        break;
                    default:
                        complemento="no object activated";
                        complement="no object activated";
                        break;
                }
                gens= object.gens+" "+complemento;
                gene=object.gene+" "+complement;
                break;

            case 3:
                object.GenConj("or","o");
                int r= (int)(Math.random()*2);
                complemento="";
                complement="";
                switch (r){
                    case 0:
                        object2.GenPresSimp();
                        complemento=object2.gens;
                        complement=object2.gene;
                        break;

                    case 1:
                        gen1.GenPresSimp2();
                        complemento=gen1.gens;
                        complement=gen1.gene;
                        break;
                    default:
                        complemento="no object activated";
                        complement="no object activated";
                        break;
                }
                gens= object.gens+" "+complemento;
                gene=object.gene+" "+complement;
                break;

            case 4:
                Nobles n1 = new Nobles();
                int pos1 = (int) (Math.random() * 6);
                n1.GenPresSimpAs(pos1);
                int rc= (int)(Math.random()*2);
                complemento="";
                complement="";
                switch (rc){
                    case 0:
                        object2.GenPresSimp();
                        complemento=object2.gens;
                        complement=object2.gene;
                        break;

                    case 1:
                        gen1.GenPresSimp2();
                        complemento=gen1.gens;
                        complement=gen1.gene;
                        break;
                    default:
                        complemento="no object activated";
                        complement="no object activated";
                        break;
                }

                gens=n1.gens +complemento;
                gene=n1.gene+complement;
                break;

            case 5:
                complemento="";
                complement="";

                int rd = (int)(Math.random()*2);
                switch (rd){
                    case 0:
                        object.GenConjFuture("if ", "si ");
                        object2.GenPresSimp();
                        oracionsp=object.gens;
                        oracioneng=object.gene;
                        complemento=object2.gens;
                        complement=object2.gene;
                        gens = oracionsp+complemento;
                        gene=oracioneng+complement;
                        break;

                    case 1:
                        object.GenConj("if ", "si ");
                        object2.GenPresSimp();
                        oracionsp=object.gens;
                        oracioneng=object.gene;
                        complemento=object2.gens;
                        complement=object2.gene;
                        gens = oracionsp+complemento;
                        gene=oracioneng+complement;

                        break;

                    default:
                        gens="no hay valor";
                        break;
                }
                break;

            case 6:
                int re= (int)(Math.random()*2);
                complemento="";
                complement="";

                String oracioneng2=".";
                switch (re){
                    case 0:
                        object.GenConjFuture("when ","cuando ");
                        object2.GenPresSimpSubjunctive();
                        complemento=object2.gens;
                        complement=object2.gene;


                        oracionsp= object.gens;
                        oracioneng= object.gene;
                        oracioneng2=negator.contractWill(object.gene);
                        break;

                    case 1:
                        object.GenConj("when ","cuando ");
                        gen1.GenPresSimp2();
                        complemento=gen1.gens;
                        complement=gen1.gene;
                        oracioneng2=".";

                        oracionsp= object.gens;
                        oracioneng= object.gene;
                        break;

                    default:
                        complemento="no object activated";
                        complement="no object activated";
                        break;
                }

                gens= oracionsp+complemento;

                gene=oracioneng+ complement;
                gene2=oracioneng2+complement;

                break;


            case 7:
                //because trans
                int rf= (int)(Math.random()*4);
                complemento="";
                complement="";
                complement2="";
                String oracionsp="";
                String oracioneng="";
                switch (rf){
                    case 0:
                        object.GenConjFuture("because ","por que ");
                        object2.GenPresSimp();
                        complemento=object2.gens;
                        complement=object2.gene;

                        oracionsp= object.gens;
                        oracioneng= object.gene;
                        gens= oracionsp+complemento;
                        gene=oracioneng+ complement;
                        break;

                    case 1:
                        gen1.GenPastSimp2();
                        gen2.GenPastPerf2();

                        complemento=gen1.gens;
                        complement=gen1.gene;

                        oracionsp= gen2.gens;
                        oracioneng= gen2.gene;


                        gens= oracionsp+"por que "+ complemento;
                        gene=oracioneng+"because "+ complement;
                        break;

                    case 2:
                        object.GenConj("because ","por que ");
                        object2.GenPresSimp();
                        complemento=object2.gens;
                        complement=object2.gene;

                        oracionsp= object.gens;
                        oracioneng= object.gene;
                        gens= oracionsp+complemento;
                        gene=oracioneng+ complement;
                        break;



                    case 3:
                        object.GenConjFuture("because ","por que ");
                        gen1.GenPresPerf2();
                        complemento=gen1.gens;
                        complement=gen1.gene;

                        oracionsp= object.gens;
                        oracioneng= object.gene;
                        gens= oracionsp+complemento;
                        gene=oracioneng+ complement;

                        break;
                    default:
                        complemento="no object activated";
                        complement="no object activated";
                        break;
                }
                break;

            case 8:
                //while trans
                int rg= (int)(Math.random()*2);
                complemento="";
                complement="";
                complement2="";

                switch (rg){
                    case 0:
                        object.GenConjFuture("while ","mientras que ");
                        object2.GenPresSimpSubjunctive();
                        complemento=object2.gens;
                        complement=object2.gene;

                        oracionsp= object.gens;
                        oracioneng= object.gene;
                        gens= oracionsp+complemento;
                        gene=oracioneng+ complement;
                        break;



                    case 1:
                        object.GenConj("while ","mientras que ");
                        object2.GenPresSimp();
                        complemento=object2.gens;
                        complement=object2.gene;

                        oracionsp= object.gens;
                        oracioneng= object.gene;
                        gens= oracionsp+complemento;
                        gene=oracioneng+ complement;
                        break;

                    default:
                        complemento="no object activated";
                        complement="no object activated";
                        break;
                }

                break;

            case 9:
                //where trans
                int rh= (int)(Math.random()*2);
                complemento="";
                complement="";
                complement2="";

                switch (rh){
                    case 0:
                        object.GenConjFuture("where ","donde ");
                        object2.GenPresSimpSubjunctive();
                        complemento=object2.gens;
                        complement=object2.gene;

                        oracionsp= object.gens;
                        oracioneng= object.gene;
                        gens= oracionsp+complemento;
                        gene=oracioneng+ complement;
                        break;



                    case 1:
                        object.GenConj("where ","donde ");
                        object2.GenPresSimp();
                        complemento=object2.gens;
                        complement=object2.gene;

                        oracionsp= object.gens;
                        oracioneng= object.gene;
                        gens= oracionsp+complemento;
                        gene=oracioneng+ complement;
                        break;

                    default:
                        complemento="no object activated";
                        complement="no object activated";
                        break;
                }
                break;

            case 10:

                int ri= (int)(Math.random()*3);
                complemento="";
                complement="";
                complement2="";

                switch (ri){
                    case 0:
                        object.GenPastSimp();
                        object2.GenPresSimpAdverbs3("so ","asi que ");
                        complemento=object2.gens;
                        complement=object2.gene;

                        oracionsp= object.gens;
                        oracioneng= object.gene;
                        gens= oracionsp+complemento;
                        gene=oracioneng+ complement;
                        break;

                    case 1:
                        object.GenPresSimp();
                        object2.GenPresSimpAdverbs3("so ","asi que ");
                        complemento=object2.gens;
                        complement=object2.gene;

                        oracionsp= object.gens;
                        oracioneng= object.gene;
                        gens= oracionsp+complemento;
                        gene=oracioneng+ complement;
                        break;
                    case 2:
                        object.GenPastSimp();
                        oracionsp= object.gens;
                        oracioneng= object.gene;

                        object2.GenConjFuture("","");
                        complemento=object2.gens;
                        complement=object2.gene;

                        gens= oracionsp+"asi que " +complemento;
                        gene=oracioneng+"so "+complement;
                        break;

                    default:
                        complemento="no object activated";
                        complement="no object activated";
                        break;
                }
                break;


            case 11:
                //though trans
                int rj= (int)(Math.random()*3);
                complemento="";
                complement="";
                complement2="";

                switch (rj){
                    case 0:
                        object.GenPastSimp();
                        oracionsp=object.gens;
                        oracioneng=object.gene;
                        object2.GenPastSimp();
                        complemento=object2.gens;
                        complement=object2.gene;
                        gens = oracionsp + " aún que "+complemento;
                        gene=oracioneng+"though "+complement;
                        break;

                    case 1:

                        object.GenPastSimp();
                        oracionsp=negator.negateSentenceSpanish(object.gens);

                        oracioneng=negator.negatePastSimple(object.gene2);
                        object2.GenPastSimp();
                        complemento=         object2.gens;
                        complement=     object2.gene;

                        gens = oracionsp + " aún que "+complemento;
                        gene=oracioneng+"though "+complement;

                        break;
                    case 2:
                        object.GenConjFuture("though ","aun que ");
                        oracionsp=object.gens;
                        oracioneng=object.gene;
                        object2.GenPresSimpSubjunctive();
                        complemento=object2.gens;
                        complement=object2.gene;
                        gens = oracionsp+complemento;
                        gene=oracioneng+complement;

                        break;

                    default:
                        complemento="no object activated";
                        complement="no object activated";
                        break;
                }

                break;

            case 12:
                //after trans
                int rk= (int)    (Math.random()*3);
                complemento="";
                complement="";
                complement2="";

                switch (rk){
                    case 0:
                        object.GenConjFuture("after ", "después de que ");
                        oracionsp=object.gens;
                        oracioneng=object.gene;
                        object2.GenPresSimpSubjunctive();
                        complemento = object2.gens;
                        complement =object2.gene;
                        gens = oracionsp+complemento;
                        gene=oracioneng+complement;

                        break;

                    case 1:
                        object.GenPastSimp();
                        oracionsp=object.gens;
                        oracioneng=object.gene;
                        object2.GenPastSimp();
                        complemento = object2.gens;
                        complement =object2.gene;
                        gens = oracionsp+"después de que "+complemento;
                        gene=oracioneng+"after "+complement;
                        break;

                    case 2:
                        object.GenPresSimp();
                        oracionsp=object.gens;
                        oracioneng=object.gene;
                        object2.GenPvpp();
                        complemento = object2.gens;
                        complement =object2.gene;
                        gens = oracionsp+"después de que "+complemento;
                        gene=oracioneng+"after "+complement;
                        break;

                    default:
                        complemento="no object activated";
                        complement="no object activated";
                        break;
                }
                break;

            case 13:
                //since trans

                int r1= (int) (Math.random()*3);
                complemento="";
                complement="";
                complement2="";

                switch (r1){
                    case 0:
                        object.GenPerfectTenses("have ","has ","he ","has ", "ha ", "hemos ","han ");
                        oracionsp=object.gens;
                        oracioneng=object.gene;
                        object2.GenContTenses("was ", "were ", "was ", "estaba ", "estabas ", "estaba ", "estabamos ", "estaban ");
                        complemento = object2.gens;
                        complement=object2.gene;
                        gens = oracionsp+"desde que "+complemento;
                        gene=oracioneng+"since "+complement;
                        break;

                    case 1:
                        object.GenPerfectTenses("had ","had ","había ","habías ", "había ", "habíamos ","habían ");
                        oracionsp=object.gens;
                        oracioneng=object.gene;
                        object2.GenContTenses("was ", "were ", "was ", "estaba ", "estabas ", "estaba ", "estabamos ", "estaban ");
                        complemento = object2.gens;
                        complement=object2.gene;
                        gens = oracionsp+"desde que "+complemento;
                        gene=oracioneng+"since "+complement;
                        break;

                    case 2:
                        object.GenPastSimp();
                        oracionsp=object.gens;
                        oracioneng=object.gene;
                        object2.GenContTenses("was ", "were ", "was ", "estaba ", "estabas ", "estaba ", "estabamos ", "estaban ");
                        complemento = object2.gens;
                        complement=object2.gene;
                        gens = oracionsp+"desde que "+complemento;
                        gene=oracioneng+"since "+complement;
                        break;

                    default:
                        complemento="no object activated";
                        complement="no object activated";
                        break;
                }
                break;


            case 14:
                //until trans

                int r3= (int) (Math.random()*2);
                complemento="";
                complement="";
                complement2="";

                switch (r3){
                    case 0:
                        object2.GenContTenses("was ", "were ", "was ", "estaba ", "estabas ", "estaba ", "estabamos ", "estaban ");
                        oracionsp=object2.gens;
                        oracioneng=object2.gene;
                        object.GenPastSimp();
                        complemento=object.gens;
                        complement=object.gene;
                        gens=oracionsp+"hasta que "+complemento ;
                        gene=oracioneng+"until "+complement;
                        break;

                    case 1:
                        object2.GenContTenses("was ", "were ", "was ", "estaba ", "estabas ", "estaba ", "estabamos ", "estaban ");
                        oracionsp=object2.gens;
                        oracioneng=object2.gene;
                        object.GenPvppPast();
                        complemento=object.gens;
                        complement=object.gene;
                        gens=oracionsp+"hasta que "+complemento ;
                        gene=oracioneng+"until "+complement;
                        break;


                    default:
                        complemento="no object activated";
                        complement="no object activated";
                        break;
                }
                break;


            case 15:
                //whether trans
                object.GenConjFuture("whether", "ya sea que");
                object2.GenPresSimpSubjunctive();
                complemento= object2.gens;
                complement = object2.gene;
                gens = object.gens+" "+ complemento+"o no" ;
                gene=object.gene+" "+complement+"or not";
                break;


            case 16:
                //although trans
                int r4= (int)(Math.random()*3);
                complemento="";
                complement="";
                complement2="";

                switch (r4){
                    case 0:
                        object.GenPastSimp();
                        oracionsp=object.gens;
                        oracioneng=object.gene;
                        object2.GenPastSimp();
                        complemento=object2.gens;
                        complement=object2.gene;
                        gens = oracionsp + " aún que "+complemento ;
                        gene=oracioneng+"although "+complement;
                        break;

                    case 1:
                        object.GenPastSimp();
                        oracionsp=negator.negateSentenceSpanish(object.gens);
                        oracioneng=negator.negatePastSimple(object.gene2);
                        object2.GenPastSimp();
                        complemento=         object2.gens;
                        complement=     object2.gene;

                        gens = oracionsp + " aún que "+complemento ;
                        gene=oracioneng+"although "+complement;

                        break;
                    case 2:
                        object.GenConjFuture("although ","aun que ");
                        oracionsp=object.gens;
                        oracioneng=object.gene;
                        object2.GenPresSimpSubjunctive();
                        complemento=object2.gens;
                        complement=object2.gene;
                        gens = oracionsp+complemento;
                        gene=oracioneng+complement;

                        break;

                    default:
                        complemento="no object activated";
                        complement="no object activated";
                        break;
                }
                break;


            case 17:
                int r6= (int)(Math.random()*2);
                complemento="";
                complement="";
                complement2="";

                switch (r6){
                    case 0:
                        object.GenConj("even if ","incluso si ");
                        oracionsp= object.gens;
                        oracioneng=object.gene;
                        object2.GenPresSimp();
                        complemento=object2.gens;
                        complement =object2.gene;
                        gens=oracionsp+complemento;
                        gene=oracioneng+complement;
                        break;

                    case 1:
                        object.GenConjFuture("even if ","incluso si ");
                        oracionsp= object.gens;
                        oracioneng=object.gene;
                        object2.GenPresSimp();
                        complemento=object2.gens;
                        complement =object2.gene;
                        gens=oracionsp+complemento;
                        gene=oracioneng+complement;
                        break;

                }

                break;


            case 18:
                //once trans





                object.GenConjFuture("once ","una vez que ");
                oracionsp= object.gens;
                oracioneng=object.gene;
                object2.GenPresSimpSubjunctive();
                complemento=object2.gens;
                complement =object2.gene;
                gens=oracionsp+complemento;
                gene=oracioneng+complement;
                break;


            case 19:
                //unless trans


                object.GenConjFuture2("unless  ","a menos que ");
                oracionsp= negator.negateSentenceSpanish(object.gens) ;
                oracioneng=negator.negateFirstAuxOrModalContracted(object.gene);
                object2.GenPresSimpSubjunctive();
                complemento=object2.gens;
                complement =object2.gene;
                gens=oracionsp+" "+ complemento;
                gene=oracioneng+ " "+complement;
                break;


            case 20:
                //now that tran

                object.GenConjFuture2("now that ", " ahora que ");
                oracionsp= negator.negateSentenceSpanish(object.gens) ;
                oracioneng=negator.negateFirstAuxOrModalContracted(object.gene);
                object2.GenPastSimp();
                complemento=object2.gens;
                complement =object2.gene;
                gens=oracionsp+" "+complemento;
                gene=oracioneng+" "+complement;


                break;

            case 21:

                //as long as trans
                int r8= (int)(Math.random()*2);

                switch (r8){
                    case 0:
                        object.GenConjFuture("as long as ","siempre y cuando ");
                        oracionsp= object.gens;
                        oracioneng=object.gene;
                        object2.GenPresSimpSubjunctive();
                        complemento=object2.gens;
                        complement =object2.gene;
                        gens=oracionsp+complemento;
                        gene=oracioneng+complement;
                        break;

                    case 1:
                        object.GenConjFuture2("as long as ","siempre y cuando ");
                        oracionsp= negator.negateSentenceSpanish(object.gens);
                        oracioneng= negator.negateFirstAuxOrModalContracted(object.gene);
                        object2.GenPresSimpSubjunctive();
                        complemento=object2.gens;
                        complement =object2.gene;
                        gens=oracionsp+" "+complemento;
                        gene=oracioneng+" "+complement;
                        break;
                }
                break;






        }
    }

    public void genCeroToFifty(){
        int rv =(int)(Math.random()*49);
        switch (rv){
            case 0:
                gen.artob(0);
                sp=gen.ob ;
                globalAnswer=gen.eng;
                break;

            case 1:
                gen.tobe();
                sp=gen.gens;
                globalAnswer= gen.gene;
                break;

            case 2:
                gen.advpronverb(4); // Assuming this needs to be called for type 0 in case 2
                sp = gen.gens ;
                globalAnswer=gen.gene;
                break;


            case 3:
                gen.prepartob(0);
                sp=gen.ob;
                globalAnswer=gen.eng;
                break;


            case 4:
                gen.artoba();
                sp=gen.ob ;
                globalAnswer=gen.eng;
                break;


            case 5:
                gen.prepartob(1);
                sp=gen.ob ;
                globalAnswer=gen.eng;
                break;

            case 6:
                gen1.GenInfinitives();
                sp=gen1.ob ;
                globalAnswer=gen1.eng;
                break;


            case 7:
                int pos = (int) (Math.random() * 6);
                n.GenPresSimp(pos,0);
                sp=n.gens;
                globalAnswer=n.gene;
                break;

            case 8:
                gen.prepartob(2);
                sp=gen.ob ;
                globalAnswer=gen.eng;


                break;

            case 9:
                gen.pronverb("eso ");
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;


            case 10:
                gen.pronverb("yo ");
                sp= gen.gens  ;
                globalAnswer=gen.gene;
                break;


            case 11:
                int r = (int) (Math.random() * 2);
                n.GenRelativeClauses1(r);
                sp=n.gens;
                globalAnswer=n.gene;
                break;

            case 12:
                gen.prepartob(3);
                sp=gen.ob ;
                globalAnswer=gen.eng;

                break;


            case 13:
                gen.pronverb("tú ");
                sp= gen.gens ;
                globalAnswer=gen.gene;
                break;


            case 14:
                gen.pronverb("él ");
                sp= gen.gens ;
                globalAnswer=gen.gene;
                break;


            case 15:
                gen.prepartob(4);
                sp=gen.ob ;
                globalAnswer=gen.eng;
                break;


            case 16:
                gen.prepartob(5);
                sp=gen.ob ;
                globalAnswer=gen.eng;
                break;


            case 17:
                gen.pronverb(4);
                sp=gen.gens ;
                globalAnswer=gen.gene;
                break;


            case 18:
                n.apostropheS();
                sp = n.gens;
                globalAnswer=n.gene;

                break;

            case 19:
                gen.pronverb(1);
                sp=gen.gens ;
                globalAnswer=gen.gene;

                break;


            case 20:
                gen.pronverb("ellos ");
                sp= gen.gens   ;
                globalAnswer=gen.gene;
                break;


            case 21:
                gen.adjmethod("this ");
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;

            case 22:
                gen.advpronverb(3);
                sp= gen.gens ;
                globalAnswer=gen.gene;
                break;


            case 23:
                gen.atmeth(8);
                sp=gen.ob ;
                globalAnswer=gen.eng;
                break;


            case 24:
                gen.pronverb("nosotros ");
                sp= gen.gens ;
                globalAnswer=gen.gene;
                break;

            case 25:
                gen.adjmethod("his ");
                sp= gen.gens ;
                globalAnswer=gen.gene;
                break;

            case 26:
                gen.atmeth(6);
                sp=gen.ob ;
                globalAnswer=gen.eng;
                break;

            case 27:
                gen.adjmethod("that ");
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;

                // hemos eskipeado el 28 y el 29/ por qeu eran not y nt/ el de abajo es el 30
            case 28:
                gen.atmeth(9);
                sp=gen.ob ;
                globalAnswer=gen.eng;
                break;

            case 29:
                gen.or();
                sp=gen.ob ;
                globalAnswer=gen.eng;
                break;


            case 30:
                gen.pronverb("ella ");
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;

            case 31:
                Nobles n1 = new Nobles();
                int pos1 = (int) (Math.random() * 6);
                n1.GenPresSimpAs(pos1);
                sp=n1.gens;
                globalAnswer=n1.gene;
                break;

            case 32:
                Nobles n2 = new Nobles();
                int pos2 = (int) (Math.random() * 6);
                n2.GenPresSimpWhat(pos2);
                sp=n2.gens ;
                globalAnswer=n2.gene;
                break;

            case 33:
                gen.pronverb(2);
                sp = gen.gens;
                globalAnswer=gen.gene;
                break;


            case 34:
                gen.adjmethod("their ");
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;


            case 35:
                gen.pronverbwill();
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;

            case 36:
                gen.genWho();
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;

            case 37:
                gen.pronverbcan();
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;

            case 38:
                gen.pronverb(3);
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;

            case 39:
                gen.pronverbif();
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;

            case 40:
                gen.all();
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;

            case 41:
                gen.pronverbwould();
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;

            case 42:
                gen.adjmethod("her ");
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;

            case 43:
                gen.make();
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;

            case 44:
                gen.prepartob(7);
                sp  = gen.ob;
                globalAnswer=gen.eng;
                break;

            case 45:
                gen.adjmethod("my ");
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;

            case 46:
                gen.pronverb(5);
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;

            case 47:
                gen.as();
                sp= gen.gens;
                globalAnswer=gen.gene;
                break;

            case 48:
                object.GenThereBe();
                sp= object.gens.trim();
                globalAnswer=object.gene.trim();
                break;




        }

    }

}
