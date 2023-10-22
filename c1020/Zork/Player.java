package c1020.Zork;

public class Player {
    int[] posicionPlayer = {0,0};

    int getPosicionPlayerX() {
        return posicionPlayer[0];
    }

    int getPosicionPlayerY() {
        return posicionPlayer[1];
    }

    void setPosicionPlayer(int[] posicionPlayer) {
        this.posicionPlayer = posicionPlayer;
    }

    void look(Escenario escenario) {
        System.out.println( escenario.getDescripcion() );
    }
}
