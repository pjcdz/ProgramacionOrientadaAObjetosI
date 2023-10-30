package c1030.EjercicioSimple.Ej07;

public class App {
    public static void main(String[] args) {
        System.out.println("asd");

        Libro libro1 = new Libro();

        System.out.println ( libro1.toString() );

        libro1.setTitulo("El loco nico");
        libro1.setAutor("Nicolas");
        libro1.setPrecio(999);

        System.out.println ( libro1.toString() );
    }
}
