package c1030.EjercicioSimple.Ej03;

public class App {
    public static void main(String[] args) {
        System.out.println("asd");

        Pinguino pinguino = new Pinguino();

        pinguino.nadar();
        pinguino.volar();
    }
}

interface Ave {
    void volar();
}

interface Pez {
    void nadar();
}