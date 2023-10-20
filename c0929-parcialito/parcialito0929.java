public class parcialito0929 {
    public static void main(String args[]) {
        Casa casa = new Casa("Pablo", "Ind 321", 100, 3, false, 2, 2, false);
        System.out.println("\nInfo Casa:");
        casa.informacion();

        Departamento departamento = new Departamento("Ana", "Malibu 214", 600, 40, false, 40, 10, true, 2, false, true);

        System.out.println("\nInfo Departamento:");
        departamento.informacion();
        // Habitaciones habitacion = new Habitaciones("asd", casa.getMetrosCuadrados()/casa.getCantidadHabitaciones());
        // System.out.println( casa.habitacion.getMetrosCuadradosHabitacion() );

        // System.out.println("asd");   
    }
}

class Vivienda {
    String Propietario;
    String Direccion;
    double MetrosCuadrados;
    int CantidadHabitaciones;
    boolean TieneCochera;
    int CantidadBaños;

    Vivienda(String Propietario, String Direccion, double MetrosCuadrados, int CantidadHabitaciones, boolean TieneCochera, int CantidadBaños) {
        this.Propietario = Propietario;
        this.Direccion = Direccion;
        this.MetrosCuadrados = MetrosCuadrados;
        this.CantidadHabitaciones = CantidadHabitaciones;
        this.TieneCochera = TieneCochera;
        this.CantidadBaños = CantidadBaños;
    }

    public double getMetrosCuadrados() {
        return MetrosCuadrados;
    }

    public int getCantidadHabitaciones() {
        return CantidadHabitaciones;
    }

    public int getCantidadBaños() {
        return CantidadBaños;
    }

    void informacion() {
        System.out.println("M2: " + getMetrosCuadrados());
        System.out.println("Cant. habitaciones: " + getCantidadHabitaciones());
        System.out.println("Cant. baños: " + getCantidadBaños());
    }
}

class Casa extends Vivienda {
    int CantidadDePisos;
    boolean Patio;
    Habitaciones habitacion = new Habitaciones("asd", this.getMetrosCuadrados()/this.getCantidadHabitaciones());

    Casa(String Propietario, String Direccion, double MetrosCuadrados, int CantidadHabitaciones, boolean TieneCochera, int CantidadBaños, int CantidadDePisos, boolean Patio) {
        super(Propietario, Direccion, MetrosCuadrados, CantidadHabitaciones, TieneCochera, CantidadBaños);
        this.CantidadDePisos = CantidadDePisos;
        this.Patio = Patio;
    }

    public int getCantidadDePisos() {
        return CantidadDePisos;
    }

    boolean getPatio() {
        return Patio;
    }

    void informacion() {
        super.informacion();
        System.out.println("Cant pisos: " + getCantidadDePisos());
        System.out.println("Tiene patio?: " + getPatio());
        System.out.println("M2 de cada habitacion: " + habitacion.getMetrosCuadradosHabitacion());
    }
}

class Departamento extends Vivienda {
    int Piso;
    boolean Ascensor;
    int CantidadDeAscensores;
    boolean TieneSum;
    boolean Seguridad;
    Habitaciones habitacion = new Habitaciones("asd", this.getMetrosCuadrados()/this.getCantidadHabitaciones());

    Departamento(String Propietario, String Direccion, double MetrosCuadrados, int CantidadHabitaciones, boolean TieneCochera, int CantidadBaños, int Piso, boolean Ascensor, int CantidadDeAscensores, boolean TieneSum, boolean Seguridad) {
        super(Propietario, Direccion, MetrosCuadrados, CantidadHabitaciones, TieneCochera, CantidadBaños);
        this.Piso = Piso;
        this.Ascensor = Ascensor;
        this.CantidadDeAscensores = CantidadDeAscensores;
        this.TieneSum = TieneSum;
        this.Seguridad = Seguridad;
    }

    public int getPiso() {
        return Piso;
    }

    boolean getAscensor() {
        return Ascensor;
    }

    public int getCantidadDeAscensores() {
        return CantidadDeAscensores;
    }

    boolean getTieneSum() {
        return TieneSum;
    }

    boolean getSeguridad() {
        return Seguridad;
    }

    void informacion() {
        super.informacion();
        System.out.println("Cant pisos: " + getPiso());
        System.out.println("Tiene ascensor/es?: " + getAscensor());
        System.out.println("Cant ascensores: " + getCantidadDeAscensores());
        System.out.println("Tiene sum?: " + getTieneSum());
        System.out.println("Tiene seguridad?: " + getSeguridad());
        System.out.println("M2 de cada habitacion: " + habitacion.getMetrosCuadradosHabitacion());
    }
}

class Habitaciones {
    String NombreHabitacion;
    double MetrosCuadradosHabitacion;

    Habitaciones(String NombreHabitacion, double MetrosCuadradosHabitacion) {
        this.NombreHabitacion = NombreHabitacion;
        this.MetrosCuadradosHabitacion = MetrosCuadradosHabitacion;
    }

    public double getMetrosCuadradosHabitacion() {
        return MetrosCuadradosHabitacion;
    }
}

class Baño {
    boolean tieneDucha;
    boolean tieneBañera;
    boolean tieneBidet;

    Baño(boolean tieneDucha, boolean tieneBañera, boolean tieneBidet) {
        this.tieneDucha = tieneDucha;
        this.tieneBañera = tieneBañera;
        this.tieneBidet = tieneBidet;
    }
}