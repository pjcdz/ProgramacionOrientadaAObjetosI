package c1030.EjercicioSimple.Ej10;

public class Empleado implements ITrabajo {

    @Override
    public void realizarTrabajo() {
        System.out.print("Cargo:");
    }

    void trabajar() {
        System.out.print("El siguiente empleado realizara un trabajo: ");
        realizarTrabajo();
    }
}
