package c1214.Final.Ej02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Escena {
    String descripcion;
    List<Objeto> objetosEnEscena = new ArrayList<>();
    Map<String, Escena> salidas = new HashMap<>();
    //
    Jugador jugadorEnEscena;


    public Escena(String descripcion) {
        this.descripcion = descripcion;
    }

    void agregarObjeto(Objeto objeto) {
        objetosEnEscena.add(objeto);
    }

    void removerObjeto(Objeto objeto) {
        objetosEnEscena.remove(objeto);
    }

    void agregarSalida(String direccion, Escena escena) {
        salidas.put(direccion, escena);
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Objeto> getObjetosEnEscena() {
        return this.objetosEnEscena;
    }

    public void getDisplayObjetosEnEscena() {
        System.out.println("Objetos en \"" + getDescripcion() + "\":");

        for (Objeto objeto : objetosEnEscena) {
            System.out.println( "- " + objeto.getDescripcion() );
        }
        System.out.println("--------------------");
    }

    public Map<String,Escena> getSalidas() {
        return this.salidas;
    }

    //

    public Jugador getJugadorEnEscena() {
        return this.jugadorEnEscena;
    }

    public void setJugadorEnEscena(Jugador jugadorEnEscena) {
        this.jugadorEnEscena = jugadorEnEscena;
    }

}