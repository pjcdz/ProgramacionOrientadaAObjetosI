package EjercicioSimple.Ej01;

public class Gato extends Animal implements Mascota {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    void hacerSonido() {
        System.out.println("Sonido gato");
        
    }

    @Override
    public void comer() {
        System.out.println("Comer gato");
        
    }

    @Override
    public void jugar() {
        System.out.println("Jugar gato");
        
    }
    
    
}
