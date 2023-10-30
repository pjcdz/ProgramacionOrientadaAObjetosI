package EjercicioSimple.Ej01;

public class App {
    public static void main(String args[]) {
        // System.out.println("asd");

        Perro perro = new Perro("perrito", 5);
        Gato gato = new Gato("Gatito",2);

        perro.hacerSonido();
        perro.jugar();
        perro.comer();

        gato.hacerSonido();
        gato.jugar();
        gato.comer();
    }
}

interface Mascota {
    void jugar();
    void comer();
}