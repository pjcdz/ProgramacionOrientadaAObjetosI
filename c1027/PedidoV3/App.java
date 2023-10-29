package c1027.PedidoV3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Tengo que hacer un primer pedido
        // Le tengo que pasar 
        // datos: cliente, empleado

        // La funcion agregar producto debe recibir 
        // unos productos de ejemplo que puedo crear desde app

        Producto productoLeche = new Producto("Leche", 100);
        Producto productoTomate = new Producto("Tomate", 25);

        List<Producto> productosDisponibles = new ArrayList<>( Arrays.asList(productoLeche, productoTomate) );

        Cliente cliente = new Cliente("Pablo","Cardozo", "pablo@asd.com", 0, true);
        Empleado empleado = new Empleado("Facundo", "Rusalen", "fac@asd.com", "ASD", "asd");

        Pedido pedido = new Pedido(productosDisponibles, cliente, empleado);

        pedido.agregarProducto(productoLeche);
        pedido.agregarProducto(productoTomate);

        pedido.cliente.hacerPedido(pedido);
        System.out.println( pedido.getClienteEsJubilado() );

        // Otro pedido

        // Cliente cliente2 = new Cliente("Juan", "Perez", "juan@ejemplo.com", 100, false);
        // Empleado empleado2 = new Empleado("Maria", "Gonzalez", "maria@ejemplo.com", "XYZ", "xyz");

        // Pedido pedido2 = new Pedido(cliente2, empleado2);

        // Producto productoManzana = new Producto("Manzana", 50);
        // Producto productoNaranja = new Producto("Naranja", 30);

        // pedido2.agregarProducto(productoManzana);
        // pedido2.agregarProducto(productoNaranja);

        // pedido2.cliente.hacerPedido(pedido2);
    }
}

abstract class Usuario {
    String nombre;
    String apellido;
    String email;

    public Usuario(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
}

interface Descuentable {
    double aplicarDescuento(double porcentajeDescuento);
}