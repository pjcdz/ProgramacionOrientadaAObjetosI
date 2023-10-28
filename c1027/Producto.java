package c1027;

public class Producto implements Descuentable {
    String nombre;
    double precio;

    Producto (String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double aplicarDescuento(double porcentajeDescuento) {
        double precioConDescuento = 1 - (porcentajeDescuento / 100);

        this.precio = precio * precioConDescuento;

        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void mostrarDetalles() {
        System.out.println( getNombre() );
        System.out.println( getPrecio() );
    }
}
