package c1214.Final.Ej02;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    String nombre;
    List<Objeto> inventario = new ArrayList<>();

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    void tomarObjeto(Objeto objeto) {
        inventario.add(objeto);
    }

    void usarObjeto(Objeto objeto) {
        if (inventario.contains(objeto)) {
            System.out.println(objeto.getDescripcion());
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void getDisplayObjetosEnInventario () {
        System.out.println("Objetos en \"" + getNombre() + "\":");
        for (Objeto objeto : inventario) {
            System.out.println("- " + objeto.getDescripcion());
        }
        System.out.println("--------------------");
    }
}