//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ClassDemo obiect1 = new ClassDemo();
        obiect1.atribute2="ceva";
       // obiect1.getAtribute1()="altceva";
        Human rebeca = new Human();
        Human nicu = new Human();
        rebeca.email = "rebeca@test.com";
        nicu.email = "nicu@test.com";
        System.out.println(rebeca.email);
        System.out.println(nicu.email);

        //nume clasa,
        Book book1 = new Book();
        book1.autor="Mihai Eminescu";
        book1.titlu="Poezii";//acum are autor deci mai jos o sa fiseze
        System.out.println(book1.autor);// nu o sa afiseze nimic fiindca nu ave inca autor
        book1.getPret();
        System.out.println(book1.getPret());
        book1.afiseaza();
        book1.titlu="Basme";//suprascriem titlul
        book1.afiseaza();

        /* creati un obiect book2
        pret=35.00
        titlu"Aminitiri din copilarie"
        autor "Ion Creanga" */
        Book book2 = new Book();

        book2.autor="Ion Creanga";
        book2.titlu="Amintiri din copilarie";

        System.out.println(book2.autor);
        System.out.println(book2.titlu);

        book2.setPret(35.00);
        book2.afiseaza();

        // exemple clasa car

        Car myCar=new Car();
        myCar.marca=" Opel ";
        myCar.model=" Mokka ";
        myCar.anFabricatie=2013;
        myCar.putere=119;
        myCar.afisezaCar();
        
        myCar.culoare="alb perlat";
        myCar.afiseazaCuloare();

        Car myOldCar = new Car();
        myOldCar.afisezaCar();

        System.out.println(myOldCar.categorie);
        System.out.println(myCar.categorie);

        Car rebecaCar=new Car(" VW "," Bora ");
        rebecaCar.afisezaCar();

        // exemplu clasa Person
        Person bula = new Person();
        System.out.println(bula.birthYear);

        Person alinuta = new Person('f',"Alinuta","Bulinuta");
        System.out.println(alinuta.fname +" "+ alinuta.lname);
        Person jon=new Person('n',"John","Doe");
        jon.afiseaza();
        Person jeane=new Person('f',"Jeane","Doe");
        System.out.println(jon);

        //obiect person 1

        Person pers1 = new Person("Ana",400441);
        System.out.println("Prietenii imi spun "+pers1.nickName+" si ma gasesc la adresa "+pers1.zippCode);
        pers1.show();

        //obiect person 2

        Person pers2=new Person("Radu",444453);
        System.out.println("locuiesc cu sotia mea la Zipp "+pers2.zippCode+" si cunoscutii mi se areseaza cu "+ pers2.nickName);
        pers2.show();

        System.out.println("Tinerii casatoriti se numesc "+pers1.nickName +" si "+pers2.nickName+ "si vor locui dupa oficierea casatoriei la Zipp "+pers1.zippCode);
        // exercitii animal

        Animal ani1 = new Animal("Rex","Maro", true);
        System.out.println(ani1.nume);
        System.out.println(ani1.culoare);
        System.out.println(ani1.isVegetarian);

        Animal ani2 = new Animal("Speed", "Alb");

        System.out.println(ani1.nume +" si "+ ani2.nume + " sunt prieteni buni si nu se cearta de la mancare");

        ani1.doarme();
        ani1.mananca();
        System.out.println(ani1.afiseazaCuloarea());

        ani2.doarme();
        ani2.mananca();
        System.out.println( ani2.afiseazaCuloarea());

        Elev elev1 = new Elev("Popescu Andrei", 9.68);
        Elev elev2 = new Elev("Ionescu Alina", 9.82);
        elev2.medieGenerala=8.00;
        elev2.nume = "Pop ALina";
        Elev.diriginte = "noul dirig";


        System.out.println(elev1.nume+" + "+ elev1.medieGenerala+" "+ Elev.diriginte);
        System.out.println(elev2.nume+" + " + elev2.medieGenerala);

        elev1.afisareElev();
        elev2.afisareElev();


        EchipaFotbal Romania = new EchipaFotbal("Romania", 3);
        EchipaFotbal Slovacia = new EchipaFotbal("Slovacia", 3);
        Romania.punctaj = 4;
        Slovacia.punctaj =2;
        EchipaFotbal.campionat =" UEFA";

        Romania.afisareNUmePunct();
        Slovacia.afisareNUmePunct();

        EchipaFotbal.metodaStatica();

        // doua obiecte

        Fotbalist fotbalist1 = new Fotbalist("Hagi");
        Voleibalist voleibalist1 = new Voleibalist();

        fotbalist1.seANtreneaza();
        fotbalist1.seRecupereaza();
        voleibalist1.seANtreneaza();
        voleibalist1.seRecupereaza();









    }

}