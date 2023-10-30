package c1030.EjercicioSimple.Ej08;

public class Piano implements IIntrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("Tocar piano");
    }

    @Override
    public void afinar() {
        System.out.println("Afinar piano");
    }
    
}
