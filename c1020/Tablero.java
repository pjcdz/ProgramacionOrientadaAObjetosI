package c1020;

public class Tablero {
    int tamanio = 0;
    Celula[][] mundo = {{}};

    public Tablero(int tamanio) {
        this.tamanio = tamanio;
        this.mundo = new Celula[tamanio][tamanio];
    }

    public void imprimir() {
        System.out.println("a ");
        for(int x = 0; x < tamanio; x++) {
            for(int u = 0; u < tamanio; u++) {
                if ( this.mundo[x][u].vive() ) {
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
    }
}
