package c1027.PedidoV2;

public class Producto implements Descuentable {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println( getNombre() );
        System.out.println( getPrecio() );
    }

    public double aplicarDescuento(double porcentajeDescuento) {
        try {
            if (porcentajeDescuento <= 100) {
                double precioConDescuento = 1 - (porcentajeDescuento / 100);

                this.precio = precio * precioConDescuento;
            } else {
                throw new Exception("El decuento no puede ser mayor a 100");
            }
        } catch ( Exception e1 ) {
            System.out.println( e1.getMessage() );
        }
        

        return precio;
    }
}
