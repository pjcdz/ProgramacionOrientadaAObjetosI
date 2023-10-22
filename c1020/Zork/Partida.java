package c1020.Zork;

public class Partida {
    Escenario[][] mapa;

    void generarMapa(int tamanio) {
        mapa = new Escenario[tamanio][tamanio];
        for(int x = 0; x<tamanio; x++) {
            for(int y = 0; y<tamanio; y++) {
                Escenario escenario = new Escenario("default");
                mapa[x][y] = escenario;
            }
        }

        mapa[0][0].setDescripcionBase("El bosque encantador");
    }

    Player player = new Player();

    void play() {
        generarMapa(2);

        int x = player.getPosicionPlayerX();
        int y = player.getPosicionPlayerY();

        player.look(mapa[x][y]);
    }
}