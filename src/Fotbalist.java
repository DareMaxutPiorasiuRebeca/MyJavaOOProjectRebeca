public class Fotbalist extends Sportiv {
    String nume;

    public Fotbalist(String nume) {
        this.nume = nume;
    }

    @Override
    public void seANtreneaza() {
        System.out.println("Fotbalistul trage la porta");

    }

    //suprascriem

    public void seRecupereaza(){
        System.out.println("Fotbalistul se recupereaza");
    }
}
