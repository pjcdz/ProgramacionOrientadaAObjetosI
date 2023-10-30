package c1030.EjercicioSimple.Ej04;

public class Moto implements Vehiculo {
    double velocidad;

    public Moto(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void acelerar() {
        obtenerVelocidad();

        velocidad = velocidad * 1.5;

        obtenerVelocidad();
    }

    @Override
    public void frenar() {
        obtenerVelocidad();

        velocidad = velocidad / 1.5;

        obtenerVelocidad();
    }

    @Override
    public void obtenerVelocidad() {
        System.out.println(velocidad);
    }

    
}
