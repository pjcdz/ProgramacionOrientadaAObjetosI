package c1020.GameOfLifeV1;

public class Tablero {
    int tamanio = 0;
    Celula[][] mundo = null;

    public Tablero(int tamanio) {
        this.tamanio = tamanio;
        this.mundo = new Celula[tamanio][tamanio];
    }

    public void imprimir() {
        for(int x = 0; x < tamanio; x++) {
            for(int u = 0; u < tamanio; u++) {
                if ( mundo[x][u].vive() ) {
                    System.out.print("+ ");
                } else {
                    System.out.print("- ");
                }
                
            }
            System.out.println();
        }
    }
    

    public void crearMundo() {
        for(int x = 0; x < tamanio; x++) {
            for(int u = 0; u < tamanio; u++) {
                int[] pos = {x,u};
                Celula celula = new Celula(pos);
                mundo[x][u] = celula;
            }
        }

        mundo[0][1].setViva(true);
        mundo[0][5].setViva(true);
        mundo[1][1].setViva(true);
        mundo[1][2].setViva(true);
        mundo[3][0].setViva(true);
        mundo[3][3].setViva(true);
        mundo[4][1].setViva(true);
        mundo[4][4].setViva(true);
        mundo[5][1].setViva(true);
    }
}
