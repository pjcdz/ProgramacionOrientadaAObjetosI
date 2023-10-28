package c1027;

public class App {
    public static void main(String args[]) {
        System.out.println("asd");
        // Producto producto = new Producto("Caja", 100);
        Pedido pedido = new Pedido("Caja", 100, "Juan", "Cardozo","@asd", 1, false, "sad", "asdsd");

        pedido.cliente.hacerPedido(pedido);
        pedido.empleado.procesarPedido(pedido);
    }
}

interface Descuentable {
    double aplicarDescuento(double porcentajeDescuento);
}
