package c1030.EjercicioSimple.Ej04;

public class App {
    public static void main(String[] args) {
        // System.out.println("asd");

        Coche coche = new Coche(100);
        Moto moto = new Moto(100);

        coche.acelerar();

        System.out.println("");

        coche.frenar();

        System.out.println("-----");

        moto.acelerar();

        System.out.println("");

        moto.frenar();

        System.out.println("");

        moto.frenar();

        System.out.println("");

        moto.frenar();

        System.out.println("");

        moto.frenar();

    }
}

interface Vehiculo {
    void acelerar();
    void frenar();
    void obtenerVelocidad();
}