package c1101.PedidoV4;

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
    
    public double aplicarDescuento(double porcentajeDescuento) {
        return precio - precio * (porcentajeDescuento/100);
    }
}
