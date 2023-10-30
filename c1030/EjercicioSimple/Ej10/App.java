package c1030.EjercicioSimple.Ej10;

public class App {
    public static void main(String[] args) {
        // System.out.println("asd");

        Programador programador = new Programador();
        Diseñador diseñador = new Diseñador();

        programador.trabajar();
        diseñador.trabajar();
    }
}

interface ITrabajo {
    void realizarTrabajo();
}
