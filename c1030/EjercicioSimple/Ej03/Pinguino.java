package c1030.EjercicioSimple.Ej03;

public class Pinguino implements Ave, Pez {

    @Override
    public void nadar() {
        System.out.println("El pinguino nada");
    }

    @Override
    public void volar() {
        System.out.println("El pinguino vuela");
    }
    
}
