public class Robot extends Bateria {
    private boolean dormido;

    public Robot() {
        super(1000);
        this.dormido = false;
    }


    public void avanzar(int pasos) {
        if (!dormido) {
            int energiaConsumida = (pasos / 100) * 10;
            setCarga(getCarga() - energiaConsumida);
        }
    }


    public void retroceder(int pasos) {
        if (!dormido) {
            int energiaConsumida = (pasos / 100) * 10;
            setCarga(getCarga() - energiaConsumida);
        }
    }


    public void dormir() {
        dormido = true;
    }


    public void despertar() {
        dormido = false;
    }


    public void recargar() {
        setCarga(1000);
    }


    public boolean bateriaLlena() {
        return getCarga() == 1000;
    }


    public boolean bateriaVacia() {
        return getCarga() == 0;
    }


    public int energiaActual() {
        return getCarga();
    }


    public boolean estaDormido() {
        return dormido;
    }
}