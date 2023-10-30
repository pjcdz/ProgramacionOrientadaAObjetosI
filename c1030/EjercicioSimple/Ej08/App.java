package c1030.EjercicioSimple.Ej08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("asd");

        Guitarra guitarra = new Guitarra();
        Piano piano = new Piano();

        List<IIntrumentoMusical> instrumentos = new ArrayList<>( Arrays.asList( guitarra, piano ) );
        // List<IIntrumentoMusical> instrumentos = new ArrayList<>();
        
        // instrumentos.add(guitarra);
        // instrumentos.add(piano);

        for( IIntrumentoMusical instrumento:instrumentos ) {
            instrumento.tocar();
        }
    }
}

interface IIntrumentoMusical {
    void tocar();
    void afinar();
}