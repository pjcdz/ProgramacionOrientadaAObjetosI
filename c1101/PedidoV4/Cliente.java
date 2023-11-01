package c1101.PedidoV4;

public class Cliente extends Usuario{
    double numeroDeCLiente;
    boolean jubilado;

    public Cliente(String nombre, String apellido, String email, double numeroDeCLiente, boolean jubilado) {
        super(nombre, apellido, email);
        this.numeroDeCLiente = numeroDeCLiente;
        this.jubilado = jubilado;
    }
    
    void hacerPedido(Pedido pedido) {
        System.out.println("El cliente hizo el pedido");
        System.out.println( pedido.toString() );
    }
}
