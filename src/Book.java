public class Book {

private double pret = 50.0;//pretul nu poate fi modificat din exterior doar prin metoda double getPret
public String titlu;//titlul poate fi modificat din exterior
public String  autor;//autorul poate fi modificat din exterior
public String editura;
public double getPret(){return pret;}
public void afiseaza(){
    System.out.println("Cartea "+titlu+" are autorul "+autor+ " si pretul de "+getPret());}
public void setPret(double pretulNou){pret=pretulNou;}


}


