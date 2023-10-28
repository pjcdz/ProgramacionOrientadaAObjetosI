package c1027.PedidoV1;

public class Cliente extends Usuario {
    double numeroDeCliente;
    boolean jubilado;

    Cliente (String nombre, String apellido, String email, double numeroDeCliente, boolean jubilado) {
        super(nombre, apellido, email);
        this.numeroDeCliente = numeroDeCliente;
        this.jubilado = jubilado; 
    }

    // Producto producto = new Producto("Caja", 100);
    // Pedido pedido = new Pedido("Caja", 100, nombre, apellido, email, numeroDeCliente, jubilado, null, null);

    void hacerPedido(Pedido pedido) {
        pedido.agregarProducto();
    }
}
