package c1027.PedidoV3;

public class Empleado extends Usuario {
    String puesto;
    String sector;

    public Empleado(String nombre, String apellido, String email, String puesto, String sector) {
        super(nombre, apellido, email);
        this.puesto = puesto;
        this.sector = sector;
    }

    void procesarPedido(Pedido pedido) {
        System.out.println( pedido.calcularTotal() );
    }
}
