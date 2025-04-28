//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();

        Hombre hombre1 = new Hombre("Joan");
        Hombre hombre2 = new Hombre("Winder");

        System.out.println("\n*** Turno de " + hombre1.getNombre() + " ***");
        hombre1.jugarConRobot(robot);

        System.out.println("\n*** Turno de " + hombre2.getNombre() + " ***");
        if (robot.estaDormido()) {
            robot.despertar();
        }
        hombre2.jugarConRobot(robot);

        System.out.println("\nFin del juego.");
    }
}