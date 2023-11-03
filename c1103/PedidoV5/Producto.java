package c1103.PedidoV5;

public class Producto implements Descuentable {
    String nombre;
    double precio;


    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", precio='" + getPrecio() + "'" +
            "}";
    }

    public void mostrarDetalles() {
        System.out.println( toString() );
    }

    public double aplicarDescuento(double porcentajeDescuento) {
        double precioConDescuento = 0;

        try {
            if (porcentajeDescuento <= 100) {
                precioConDescuento = precio - precio * (porcentajeDescuento/100);
            } else {
                throw new Exception("ERROR: Descuento superior a 100");
            }
        } catch (Exception e) {
            System.out.println( e.getMessage() );
        }

        return precioConDescuento;
    }
}
