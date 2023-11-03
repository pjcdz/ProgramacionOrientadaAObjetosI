package c1103.PedidoV5;

public class Empleado extends Usuario {
    String puesto;
    String sector;

    public Empleado(String nombre, String apellido, String email, String puesto, String sector) {
        super(nombre, apellido, email);
        this.puesto = puesto;
        this.sector = sector;
    }

    void pasarDatos(Pedido pedido) {
        pedido.setEmpleado(nombre, apellido, email, puesto, sector);
    }

    void procesarPedido(Pedido pedido) {
        System.out.println ( pedido.calcularTotal() );
    }
}
