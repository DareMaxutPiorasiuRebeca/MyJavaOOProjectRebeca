public class Animal {
    String nume;
    String culoare;
    boolean isVegetarian;



    Animal() { }

    Animal(String nume){
        this.nume=nume;
    }
    Animal(String nume, String culoare){
        this.nume=nume;
        this.culoare=culoare;
    }

    Animal (String nume, String culoare, boolean isVegetarian){
        this.nume=nume;
        this.culoare=culoare;
        this.isVegetarian=isVegetarian;
    }
    public void mananca(){
        System.out.println(nume+" mananca");
    }
    public void doarme(){
        System.out.println(nume+" doarme");

    }

    public void afiseazaCuloarea(){
        System.out.println(nume+ " are cunoarea "+culoare);
    }

}
