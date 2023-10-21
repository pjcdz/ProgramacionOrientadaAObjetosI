package c1020.JuegoDeLaVida;

public class Partida extends Tablero {
    Celula[][][] vecinos = null;

    int[] cero = {0};
    Celula celulaNull = new Celula(cero);
    
    int[][] vecinosVivos = new int[tamanio][tamanio];

    public Partida(int tamanio) {
        super(tamanio);
        this.vecinos = new Celula[tamanio][tamanio][4];
    }

    void evolucionar() {
        getVecinos();

        // System.out.println( vecinos[1][1][0].vive() );
        // System.out.println( vecinos[1][1][1].vive() );
        // System.out.println( vecinos[1][1][2].vive() );
        // System.out.println( vecinos[1][1][3].vive() );

        // int vecinosVivos = contarVecinosVivos(1, 1);
        // System.out.println(vecinosVivos);

        contarVecinosVivos();

        for(int x = 0; x < tamanio; x++) {
            for(int u = 0; u < tamanio; u++) {
                if ( mundo[x][u].vive() ) {
                    if ( vecinosVivos[x][u] < 2 || vecinosVivos[x][u] > 3 ) {
                        mundo[x][u].setViva(false);
                    } 
                } else {
                    if ( vecinosVivos[x][u] == 3 && !mundo[x][u].vive() ) {
                        mundo[x][u].setViva(true);
                    }
                }
            }
        }
    }

void contarVecinosVivos() {
    for(int x = 0; x < tamanio; x++) {
        for(int u = 0; u < tamanio; u++) {
            int contador = 0;
            if ( vecinos[x][u][0].vive() ) {
                contador++;
            } 
            if ( vecinos[x][u][1].vive() ) {
                contador++;
            } 
            if ( vecinos[x][u][2].vive() ) {
                contador++;
            } 
            if ( vecinos[x][u][3].vive() ) {
                contador++;
            }
            vecinosVivos[x][u] = contador;
            // System.out.println(contador);
        }
    }
}

    void getVecinos() {
        for(int x = 0; x < tamanio; x++) {
            for(int u = 0; u < tamanio; u++) {
                try {
                    vecinos[x][u][0] = mundo[x-1][u];    
                } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
                    vecinos[x][u][0] = celulaNull;
                }

                try {
                    vecinos[x][u][1] = mundo[x+1][u];    
                } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
                    vecinos[x][u][1] = celulaNull;
                }

                try {
                    vecinos[x][u][2] = mundo[x][u+1];    
                } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
                    vecinos[x][u][2] = celulaNull;
                }

                try {
                    vecinos[x][u][3] = mundo[x][u-1];    
                } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
                    vecinos[x][u][3] = celulaNull;
                }

                    // vecinos[x][u][0] = mundo[x-1][u];
                    // vecinos[x][u][1] = mundo[x+1][u];
                    // vecinos[x][u][2] = mundo[x][u+1];
                    // vecinos[x][u][3] = mundo[x][u-1];
            }
        }   
    }
    
    // void norepetir(Celula vecinos, Celula mundo) {
    //     try {
    //         vecinos = mundo;    
    //     } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
    //         vecinos = celulaNull;
    //     }
    // }
}

