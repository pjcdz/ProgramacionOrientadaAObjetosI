package c1027.PedidoV2;

public class Cliente extends Usuario {
    double numeroDeCliente;
    boolean jubilado;

    public Cliente(String nombre, String apellido, String email, double numeroDeCliente, boolean jubilado) {
        super(nombre, apellido, email);
        this.numeroDeCliente = numeroDeCliente;
        this.jubilado = jubilado;
    }

    boolean getEsJubilado() {
        return jubilado;
    }

    void hacerPedido(Pedido pedido) {
        pedido.empleado.procesarPedido(pedido);
    }
    
}