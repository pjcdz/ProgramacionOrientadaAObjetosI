package Ej2;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    String nombre;
    List<Objeto> inventario;


    public Jugador(String nombre) {
        this.nombre = nombre;
        this.inventario = new ArrayList<>();
    }
    
    void tomarObjeto(Objeto objeto) {
        inventario.add(objeto);
    }

    void usarObjeto(Objeto objeto) {
        inventario.remove(objeto);
    }
}
