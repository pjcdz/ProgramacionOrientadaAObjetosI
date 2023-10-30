package c1030.EjercicioSimple.Ej06;

public class Empleado {
    String nombre;
    int salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void getSalarioAnual() {
        System.out.print( getSalario() * 12 );
    } 
}
