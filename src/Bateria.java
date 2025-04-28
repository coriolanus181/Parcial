public class Bateria {
    protected int carga;


    public Bateria(int cargaInicial) {
        this.carga = cargaInicial;
    }


    public int getCarga() {
        return carga;
    }


    public void setCarga(int nuevaCarga) {
        this.carga = nuevaCarga;
    }
}