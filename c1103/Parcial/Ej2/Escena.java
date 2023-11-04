package Ej2;

import java.util.ArrayList;
import java.util.List;
// import java.util.Map;

public class Escena {
    String descripcion;
    List<Objeto> objetosEnEscena;
    // Map<String, Escena> salidas;
    List<Escena> salidas;


    public Escena(String descripcion) {
        this.descripcion = descripcion;
        salidas = new ArrayList<>();
    }
    
    void agregarObjeto(Objeto objeto) {
        objetosEnEscena.add(objeto);
    }

    void agregarSalida(String direccion, Escena escena) {
        // salidas.put(direccion, escena);
        salidas.add(escena);
    }
}
