package c1030.EjercicioSimple.Ej06;

public class Vendedor extends Empleado {

    public Vendedor(String nombre, int salario) {
        super(nombre, salario);
    }

    @Override
    public void getSalarioAnual() {
        System.out.print("Salario anual vendedor: ");
        super.getSalarioAnual();
    }

    
    
}
