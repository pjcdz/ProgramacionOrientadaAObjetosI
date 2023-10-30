package c1030.EjercicioSimple.Ej01;

public class Perro extends Animal implements Mascota {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    void hacerSonido() {
        System.out.println("Sonido perro");
        
    }

    @Override
    public void comer() {
        System.out.println("Comer perro");
        
    }

    @Override
    public void jugar() {
        System.out.println("Jugar perro");
        
    }
    
    
}
