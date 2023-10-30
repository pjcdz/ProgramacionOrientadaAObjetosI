package c1030.EjercicioSimple.Ej04;

public class Coche implements Vehiculo {

    double velocidad;

    public Coche(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void acelerar() {
        obtenerVelocidad();

        velocidad = velocidad * 2;

        obtenerVelocidad();
    }

    @Override
    public void frenar() {
        obtenerVelocidad();

        velocidad = velocidad / 2;

        obtenerVelocidad();
    }

    @Override
    public void obtenerVelocidad() {
        System.out.println(velocidad);
    }
    
}
