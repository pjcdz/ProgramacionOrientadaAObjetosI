package c1027;

public class Empleado extends Usuario {
    String puesto;
    String sector;

    Empleado (String nombre, String apellido, String email, String puesto, String sector) {
        super(nombre, apellido, email);
        this.puesto = puesto;
        this.sector = sector; 
    }

    // Producto producto = new Producto("Caja", 100);
    // Pedido pedido = new Pedido(null, 0, nombre, apellido, email, 0, false, puesto, sector);

    void procesarPedido(Pedido pedido) {
        System.out.println( pedido.calcularTotal() );
    }
}
