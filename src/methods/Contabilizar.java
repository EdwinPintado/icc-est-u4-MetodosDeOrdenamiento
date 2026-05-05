package methods;

public class Contabilizar {
    private int comparaciones;
    private int cambios;
    private int interacciones;

    public Contabilizar(int comparaciones, int cambios, int interacciones) {
        this.comparaciones = comparaciones;
        this.cambios = cambios;
        this.interacciones = interacciones;
    }

    public int getComparaciones() {
        return comparaciones;
    }

    public void setComparaciones(int comparaciones) {
        this.comparaciones = comparaciones;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public int getInteracciones() {
        return interacciones;
    }

    public void setInteracciones(int interacciones) {
        this.interacciones = interacciones;
    }

    @Override
    public String toString() {
        return "Contabilizar [comparaciones= " + comparaciones + "\ncambios= " + cambios + "\ninteracciones= "+ interacciones + "]";
    }
  
}
