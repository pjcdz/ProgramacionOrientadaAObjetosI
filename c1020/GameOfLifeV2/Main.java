package c1020.GameOfLifeV2;

public class Main {
    public static void main(String[] args) {
        Partida partida = new Partida(6);
        partida.play();

        int generaciones = 2;
        for(int x = 1; x <= generaciones; x++) {
            partida.imprimir(x);
            partida.evolucionar();
        }

    }
}
