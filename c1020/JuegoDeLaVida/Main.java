package c1020.JuegoDeLaVida;

public class Main {
    public static void main(String args[]) {
        // System.out.println("ASD");

        // Tablero tablero = new Tablero(6);
        // tablero.crearMundo();
        // tablero.imprimir();

        Partida partida = new Partida(6);
        partida.crearMundo();
        partida.imprimir();
        partida.evolucionar();

        System.out.println("---------------");

        partida.imprimir();

    }
}
