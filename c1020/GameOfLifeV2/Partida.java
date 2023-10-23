package c1020.GameOfLifeV2;

public class Partida { 
    Celula[][] mapa;
    int tamanio;

    Partida(int tamanio) {
        this.tamanio = tamanio;
        this.mapa = new Celula[tamanio][tamanio];
    }


    void play() {
        Tablero tablero = new Tablero();
        mapa = tablero.generarMapa(tamanio);
        
        System.out.println( mapa[2][2].getVecinos(mapa) );
    }

    
    public void imprimir(int generaciones) {
        System.out.println("Generacion N°" + generaciones);

        for(int x = 0; x < tamanio; x++) {
            for(int y = 0; y < tamanio; y++) {
                if ( mapa[x][y].getViva() ) {
                    System.out.print("+ ");
                } else {
                    System.out.print("- ");
                }
                
            }
            System.out.println();
        }
    }

    void evolucionar() {
        for(int x = 0; x < tamanio; x++) {
            for(int y = 0; y < tamanio; y++) {
                int vecinosVivos = mapa[x][y].getVecinos(mapa);
                // System.out.println(vecinosVivos);
                if ( mapa[x][y].getViva() ) {
                    if ( vecinosVivos < 2 || vecinosVivos > 3 ) {
                        mapa[x][y].setViva(false);
                    } 
                } else {
                    if ( vecinosVivos == 3 ) {
                        mapa[x][y].setViva(true);
                    }
                }
            }
        }

        System.out.println();
    }
}
