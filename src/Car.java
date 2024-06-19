public class Car {
    String marca;
    String model;
    String categorie;//ca si cum as scrie categorie=autoturism

    String culoare;
    int anFabricatie;
    int putere;

    public Car(){
        System.out.println("se apeleaza constructorul din clasa Car");
        categorie="autoturism";}
    public void afisezaCar()
    {
        System.out.println("Masina mea este "+marca + model+ " are "+putere+" CP "+ " si este din anul "+anFabricatie);
    }
    public void afiseazaCuloare(){
        System.out.println("Masina mea are culoarea "+culoare);
    }
    public Car(String marcaNoua,String modelNou){
        System.out.println("se apeleaza constructorul nr 2");
        marca = marcaNoua;
        model = modelNou;
    }

}
