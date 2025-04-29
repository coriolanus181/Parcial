import java.util.Scanner;

public class Hombre {
    private String nombre;

    public Hombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void jugarConRobot(Robot robot) {
        Scanner teclado = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\n--- Menú ----");
            System.out.println("1. Avanzar");
            System.out.println("2. Retroceder");
            System.out.println("3. Ver energía del robot");
            System.out.println("4. Dormir al robot");
            System.out.println("5. Despertar al robot");
            System.out.println("6. Recargar batería");
            System.out.println("7. Terminar turno");
            System.out.print("Seleccione una opción: ");
            opc = teclado.nextInt();

            switch (opc) {
                case 1 -> {
                    System.out.print("Ingrese el número de pasos a avanzar: ");
                    int pasos = teclado.nextInt();
                    robot.avanzar(pasos);
                }
                case 2 -> {
                    System.out.print("Ingrese el número de pasos a retroceder: ");
                    int pasos = teclado.nextInt();
                    robot.retroceder(pasos);
                }
                case 3 -> {
                    System.out.println("La energía del robot es de " + robot.energiaActual());
                }
                case 4 -> {
                    robot.dormir();
                }
                case 5 -> {
                    robot.despertar();
                }
                case 6 -> {
                    robot.recargar();
                }
                case 7 -> {
                    System.out.println(nombre + " terminó su turno.");
                }
                default -> {
                    System.out.println("Opción no válida.");
                }
            }
        } while (opc != 7);
    }
}