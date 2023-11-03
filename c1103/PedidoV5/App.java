package c1103.PedidoV5;

public class App {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(null, 100, null, null, null, 0, false);
        
        Producto producto = new Producto(null, 50);
        pedido.agregarProducto(producto);

        Empleado empleado = new Empleado(null, null, null, null, null);
        empleado.pasarDatos(pedido);

        pedido.cliente.hacerPedido(pedido);
    }
}

interface Descuentable {
    double aplicarDescuento(double porcentajeDescuento);
}

abstract class Usuario {
    String nombre;
    String apellido;
    String email;

    public Usuario(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
}