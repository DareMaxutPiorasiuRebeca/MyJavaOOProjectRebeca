public class Cat extends Mamifer {
    public Cat(String nume, String culoare, boolean isVegetarian, String tipMamifer) {
        super(nume, culoare, isVegetarian, tipMamifer);
    }

     @Override
    public void scoateSunete() {
        System.out.println(nume+" miauna");
    }
}
