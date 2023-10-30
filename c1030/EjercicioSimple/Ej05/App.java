package c1030.EjercicioSimple.Ej05;

public class App {
    public static void main(String[] args) {
        // System.out.println("asd");

        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();

        circulo.calcularArea();
        rectangulo.calcularArea();
        triangulo.calcularArea();
    }
}

abstract class FiguraGeometrica {
    abstract void calcularArea();
}
