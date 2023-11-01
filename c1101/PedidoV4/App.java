package c1101.PedidoV4;

public class App {
    public static void main(String[] args) {
        // System.out.println("asd");

        Pedido pedido = new Pedido("Leche", 100, "Manu", "Variego", "manu@asd.com");
        pedido.cliente.hacerPedido(pedido);

        Producto manzana = new Producto("Manzana", 50);
        pedido.agregarProducto(manzana);

        Empleado empleado = new Empleado(null, null, null, null, null);
        empleado.procesarPedido(pedido);


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

