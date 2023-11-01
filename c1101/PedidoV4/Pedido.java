package c1101.PedidoV4;

import java.util.List;
import java.util.ArrayList;
// import java.util.Arrays;

public class Pedido {
    List<Producto> productosPedidos = new ArrayList<>();
    Cliente cliente;
    String nombreProducto;
    double precioProducto;
    String nombreCliente;
    String apellidoCliente;
    String emailCliente;

    public Pedido(String nombreProducto, double precioProducto, String nombreCliente, String apellidoCliente, String emailCliente) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.emailCliente = emailCliente;

        cliente = new Cliente(nombreCliente, apellidoCliente, emailCliente, 0 , true);
        Producto producto = new Producto(nombreProducto, precioProducto);

        productosPedidos.add(producto);
    }

    void agregarProducto(Producto producto) {
        productosPedidos.add(producto);
    }

    double calcularTotal() {
        double total = 0;

        for (Producto producto:productosPedidos) {
            double precioProducto = producto.aplicarDescuento(10);
            total += precioProducto;
        }

        return total;
    }


    public List<Producto> getProductosPedidos() {
        return this.productosPedidos;
    }

    public void setProductosPedidos(List<Producto> productosPedidos) {
        this.productosPedidos = productosPedidos;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNombreProducto() {
        return this.nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return this.precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return this.apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getEmailCliente() {
        return this.emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }


    @Override
    public String toString() {
        return "{" +
            " productosPedidos='" + getProductosPedidos() + "'" +
            ", cliente='" + getCliente() + "'" +
            ", nombreProducto='" + getNombreProducto() + "'" +
            ", precioProducto='" + getPrecioProducto() + "'" +
            ", nombreCliente='" + getNombreCliente() + "'" +
            ", apellidoCliente='" + getApellidoCliente() + "'" +
            ", emailCliente='" + getEmailCliente() + "'" +
            "}";
    }

}
