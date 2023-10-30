package c1030.EjercicioSimple.Ej06;

public class Gerente extends Empleado{

    public Gerente(String nombre, int salario) {
        super(nombre, salario);
    }

    @Override
    public void getSalarioAnual() {
        System.out.println("Salario anual gerente: ");
        super.getSalarioAnual();
    }
}
