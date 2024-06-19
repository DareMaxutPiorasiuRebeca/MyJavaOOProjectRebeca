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

    }

}