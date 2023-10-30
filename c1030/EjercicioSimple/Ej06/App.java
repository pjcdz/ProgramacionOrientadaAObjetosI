package c1030.EjercicioSimple.Ej06;

public class App {
    public static void main(String[] args) {
        // System.out.println("asd");  

        Gerente gerente = new Gerente("ASD", 1000);
        Vendedor vendedor = new Vendedor("Vendedor", 10);

        gerente.getSalarioAnual();
        vendedor.getSalarioAnual();
    }
}
