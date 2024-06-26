public class Animal {
    String nume;
    String culoare;
    boolean isVegetarian;



    public Animal() {
        isVegetarian = true;
        nume = "Unknown";
        culoare = "unknown";
    }

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
        System.out.println(this.nume+" mananca");
    }
    public void doarme(){
        System.out.println(nume+" doarme");

    }

    public String afiseazaCuloarea(){
        return this.nume+ " are cunoarea "+culoare;
    }

}
