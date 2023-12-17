package c1214.Final.Ej02;

import java.util.HashMap;
import java.util.Map;

public class Juego {
    Jugador jugador;
    Escena escena;
    Map<String, Escena> escenas = new HashMap<>();

    public Juego(String nombre, String descripcion) {
        jugador = new Jugador(nombre);
        escena = new Escena(descripcion);

        escenas.put(descripcion, escena);
    }

    void iniciar() {
        Objeto objeto = new Objeto("Espada", "Mata dragones");

        escena.agregarObjeto(objeto);

        System.out.println( escena.getObjetosEnEscena().get(0).getDescripcion() );

        escena.getDisplayObjetosEnEscena();
        jugador.getDisplayObjetosEnInventario();

        // System.out.println( escena.getJugadorEnEscena() );

        escena.setJugadorEnEscena(jugador);

        // System.out.println( escena.getJugadorEnEscena() );

        try {
            if ( escena.getJugadorEnEscena() == jugador) {
                try { 
                    if ( escena.getObjetosEnEscena().contains(objeto) ) {
                        escena.removerObjeto(objeto);
                        jugador.tomarObjeto(objeto);
                    } else {
                        throw new Exception("ERROR: Objeto no en escena");
                    }
                } catch (Exception e2) {
                    System.out.println( e2.getMessage() );
                }
            } else {
                throw new Exception("ERROR: Jugador no en escena");
            }
        } catch (Exception e1) {
            System.out.println( e1.getMessage() );
        }

        escena.getDisplayObjetosEnEscena();
        jugador.getDisplayObjetosEnInventario();
    }

    void cambiarEscena(String nombreEscena) {
        System.out.println(nombreEscena);
    }
}
