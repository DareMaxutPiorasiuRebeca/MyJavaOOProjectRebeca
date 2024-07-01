public class Dog extends Mamifer {
    public Dog(String nume, String culoare, boolean isVegetarian, String tipMamifer) {
        super(nume, culoare, isVegetarian, tipMamifer);
    }
    @Override
    public void scoateSunete()
    {
        System.out.println(nume+" latra");
    }
}
