package c1027.PedidoV1;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    List<Producto> productoPedidos = new ArrayList<>();

    String nombreProducto;
    double precioProducto;
    String nombre;
    String apellido;
    String email;
    double numeroCliente;
    boolean jubiladoCliente;
    String puestoEmpleado;
    String sectorEmpleado;

    Pedido(String nombreProducto, double precioProducto, String nombre, String apellido, String email, double numeroCliente, boolean jubiladoCliente, String puestoEmpleado, String sectorEmpleado) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numeroCliente = numeroCliente;
        this.jubiladoCliente = jubiladoCliente;
        this.puestoEmpleado = puestoEmpleado;
        this.sectorEmpleado = sectorEmpleado;
    }

    Producto producto = new Producto(nombreProducto, precioProducto);
    Cliente cliente = new Cliente(nombre,apellido, email, numeroCliente, jubiladoCliente);
    Empleado empleado = new Empleado(nombre, apellido, email,puestoEmpleado, puestoEmpleado);

    void agregarProducto() {
        productoPedidos.add(0, producto);
    }

    double calcularTotal() {
        double total = 0;

        for (Producto producto:productoPedidos) {
            total += producto.getPrecio();
        }

        return total;
    }

}
