//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ClassDemo obiect1 = new ClassDemo();
        obiect1.atribute2="ceva";
        obiect1.getAtribute1() = "altceva";
        Human rebeca = new Human();
        Human nicu = new Human();
        rebeca.email = "rebeca@test.com";
        nicu.email = "nicu@test.com";
        System.out.println(rebeca.email);
        System.out.println(nicu.email);
    }
}