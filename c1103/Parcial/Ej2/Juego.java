package Ej2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import java.util.Map;

public class Juego {
    Jugador jugador;
    // Map<String, Escena> escenas;
    List<Escena> escenas;

    Juego(String jugadorNombre, String escenaDescripcion) {
        this.jugador = new Jugador(jugadorNombre);
        Escena escena = new Escena(escenaDescripcion);
        this.escenas = new ArrayList<>( Arrays.asList( escena) );
        // this.escenas = new Map("Spawn", escena);
        // this.escenas.put("Spawn", escena);
    }

    void iniciar() {
        System.out.println("Inicio del juego");
    }

    void cambiarEscena(String nombreEscena) {
        System.out.println("Cambio de escena hacia: " + nombreEscena);
    }
}
