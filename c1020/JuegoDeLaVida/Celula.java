package c1020.JuegoDeLaVida;

public class Celula {
    private boolean viva = false;
    private int[] posicion;
    private int vecinos;

    public Celula(int[] posicion) {
        this.posicion = posicion;
    }

    // public void evolucionar() {
    //     if ( viva )
    // }
    // public void nacer() {

    // }

    // public void morir() {

    // }

    // public void sobrevivir() {

    // }

    public boolean vive() {
        boolean res = false;
        if (viva) {
            res = true;
        } return res;
    }

    public void setViva(boolean viva) {
        this.viva = viva;
    }
}
