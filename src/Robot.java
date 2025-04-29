
public class Robot {
    private Bateria carga = new Bateria(1000);
    private boolean dormido = false;

    public void avanzar(int pasos) {
        if (dormido) {
            System.out.println("El robot está dormido. No puede avanzar.");
            return;
        }
        int energiaRequerida = (pasos / 100) * 10;
        if (carga.getCarga() >= energiaRequerida) {
            carga.setCarga(carga.getCarga() - energiaRequerida);
            System.out.println("El robot avanzó " + pasos + " pasos.");
        } else {
            System.out.println("Energía insuficiente para avanzar.");
        }
    }

    public void retroceder(int pasos) {
        if (dormido) {
            System.out.println("El robot está dormido. No puede retroceder.");
            return;
        }
        int energiaRequerida = (pasos / 100) * 10;
        if (carga.getCarga() >= energiaRequerida) {
            carga.setCarga(carga.getCarga() - energiaRequerida);
            System.out.println("El robot retrocedió " + pasos + " pasos.");
        } else {
            System.out.println("Energía insuficiente para retroceder.");
        }
    }

    public void dormir() {
        dormido = true;
        System.out.println("El robot ha sido puesto a dormir.");
    }

    public void despertar() {
        dormido = false;
        System.out.println("El robot se ha despertado.");
    }

    public void recargar() {
        carga.setCarga(1000);
        System.out.println("Batería recargada a 1000 unidades.");
    }

    public boolean bateriaLlena() {
        return carga.getCarga() == 1000;
    }

    public boolean bateriaVacia() {
        return carga.getCarga() == 0;
    }

    public int energiaActual() {
        return carga.getCarga();
    }

    public boolean estaDormido() {
        return dormido;
    }
}