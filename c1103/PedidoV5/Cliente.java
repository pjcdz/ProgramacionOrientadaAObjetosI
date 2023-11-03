package c1103.PedidoV5;

public class Cliente extends Usuario {
    double numeroDeCLiente;
    boolean jubilado;

    public Cliente(String nombre, String apellido, String email, double numeroDeCLiente, boolean jubilado) {
        super(nombre, apellido, email);
        this.numeroDeCLiente = numeroDeCLiente;
        this.jubilado = jubilado;
    }

    void hacerPedido(Pedido pedido) {
        System.out.println("El cliente pide a un empleado que procese pedido");
        pedido.empleado.procesarPedido(pedido);
    }
}
