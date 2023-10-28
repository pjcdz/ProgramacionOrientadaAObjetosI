package c1027.PedidoV2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    List<Producto> productosPedidos = new ArrayList<>();
    Cliente cliente;
    Empleado empleado;

    Pedido (Cliente cliente, Empleado empleado) {
        this.cliente = cliente;
        this.empleado = empleado;
    }

    void agregarProducto(Producto producto) {
        if ( cliente.getEsJubilado() ) {
            producto.setPrecio( producto.aplicarDescuento(10) );
        }

        productosPedidos.add(producto);
    }


    double calcularTotal() {
        double total = 0;

        for (Producto producto:productosPedidos) {
            total += producto.getPrecio();
        }

        return total;
    }
}
