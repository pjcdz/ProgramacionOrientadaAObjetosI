package c1020;

public class Tablero {
    int tamanio;

    Tablero(int tamanio) {
        tamanio = this.tamanio;
    }

    public void imprimir() {
        System.out.println("a ");
        for(int x = 0; x < tamanio; x++) {
            for(int u = 0; u < tamanio; u++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
    

    // public void crearMundo() {
        
    // }
}
