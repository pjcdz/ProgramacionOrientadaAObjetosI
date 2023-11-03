package c1103.PedidoV5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pedido {
    Producto producto;
    Cliente cliente;
    List<Producto> productosPedidos;

    Empleado empleado;

    public Pedido(String productoNombre, double productoPrecio, String clienteNombre, String clienteApellido, String clienteEmail, double clienteNumero, boolean clienteJubilado) {
        this.producto = new Producto(productoNombre, productoPrecio);
        this.cliente = new Cliente(clienteNombre, clienteApellido, clienteEmail, clienteNumero, clienteJubilado);
        this.productosPedidos = new ArrayList<>( Arrays.asList(producto) );
        // this.empleado = null;
    }

    void agregarProducto(Producto producto) {
        productosPedidos.add(producto);
    }

    double calcularTotal() {
        double total = 0;

        for (Producto producto:productosPedidos) {
            double productoPrecio = producto.aplicarDescuento(10);
            total += productoPrecio;
        }

        return total;
    }

    void setEmpleado(String empleadoNombre, String empleadoApellido, String empleadoEmail, String empleadoPuesto, String empleadoSector) { 
        this.empleado = new Empleado(empleadoNombre, empleadoApellido, empleadoEmail, empleadoPuesto, empleadoSector);
    }


}
