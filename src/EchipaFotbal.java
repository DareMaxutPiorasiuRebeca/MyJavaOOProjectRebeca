public class EchipaFotbal {
   String nume;
    int punctaj;
    public static String campionat = "Euro 2024";

    public EchipaFotbal(String nume, int punctaj) {
        this.nume = nume;
        this.punctaj = punctaj;
    }
    public void afisareNUmePunct (){
        System.out.println(nume + " are pana acum " + punctaj + " puncte la Campionatul "+ campionat);
    }

    public static void metodaStatica(){
        System.out.println("Metoda statica");
    }
}
