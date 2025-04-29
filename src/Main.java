//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Robot carlos = new Robot();
        Hombre winder = new Hombre("Winder");
        Hombre joan = new Hombre("Joan");

        System.out.println("\n*** Turno de " + winder.getNombre() + " ***");
        winder.jugarConRobot(carlos);

        System.out.println("\n*** Turno de " + winder.getNombre() + " ***");
        carlos.despertar();
        winder.jugarConRobot(carlos);

        System.out.println("\nFin del juego.");
    }
}