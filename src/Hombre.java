import java.util.Scanner;

public class Hombre {
    private String nombre;

    public Hombre(String nombre) {
        this.nombre = nombre;
    }

    public void jugarConRobot(Robot robot) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Avanzar");
            System.out.println("2. Retroceder");
            System.out.println("3. Ver energía actual");
            System.out.println("4. Dormir robot (finalizar sesión)");
            System.out.println("5. Despertar robot");
            System.out.println("6. Recargar batería");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    if (robot.estaDormido()) {
                        System.out.println("El robot está dormido. No puede avanzar.");
                    } else {
                        System.out.print("Ingrese la cantidad de pasos a avanzar: ");
                        int pasos = sc.nextInt();
                        robot.avanzar(pasos);
                    }
                }
                case 2 -> {
                    if (robot.estaDormido()) {
                        System.out.println("El robot está dormido. No puede retroceder.");
                    } else {
                        System.out.print("Ingrese la cantidad de pasos a retroceder: ");
                        int pasos = sc.nextInt();
                        robot.retroceder(pasos);
                    }
                }
                case 3 -> {
                    System.out.println("La energía actual del robot es: " + robot.energiaActual() + " unidades.");
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
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (!robot.estaDormido());
    }

    public String getNombre() {
        return nombre;
    }
}