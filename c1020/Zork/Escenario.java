package c1020.Zork;

public class Escenario {
    String descripcionBase;

    Escenario(String descripcionBase) {
        this.descripcionBase = descripcionBase;
    }

    void setDescripcionBase(String descripcionBase) {
        this.descripcionBase = descripcionBase;
    }

    String getDescripcion() {
        // String descripcion = String.join(descripcionBase);
        return descripcionBase;
    }
}
