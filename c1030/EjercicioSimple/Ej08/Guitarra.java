package c1030.EjercicioSimple.Ej08;

public class Guitarra implements IIntrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("Tocar guitarra");
    }

    @Override
    public void afinar() {
        System.out.println("Afinar guitarra");
    }
    
}
