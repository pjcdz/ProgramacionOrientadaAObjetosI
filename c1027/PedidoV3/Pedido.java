package c1027.PedidoV3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    List<Producto> productosDisponibles = new ArrayList<>();
    List<Producto> productosPedidos = new ArrayList<>();
    Cliente cliente;
    Empleado empleado;

    Pedido (List<Producto> productosDisponibles ,Cliente cliente, Empleado empleado) {
        this.productosDisponibles = productosDisponibles;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    void agregarProducto(Producto producto) {
        if ( productosDisponibles.contains(producto) ) {
            if ( cliente.getEsJubilado() ) {
                producto.setPrecio( producto.aplicarDescuento(10) );
            }

            productosPedidos.add(producto);
        }
    }

    double calcularTotal() {
        double total = 0;

        for (Producto producto:productosPedidos) {
            total += producto.getPrecio();
        }

        return total;
    }

    boolean getClienteEsJubilado() {
        return cliente.getEsJubilado();
    }
}
