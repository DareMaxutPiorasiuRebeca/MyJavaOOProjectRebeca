public class Mamifer extends Animal {
    String tipMamifer;

    public Mamifer(String nume, String culoare, boolean isVegetarian, String tipMamifer) {
        super(nume, culoare, isVegetarian);
        this.tipMamifer = tipMamifer;
    }

    public void scoateSunete(){
        System.out.println(nume+" scoate sunete");
    }


}

