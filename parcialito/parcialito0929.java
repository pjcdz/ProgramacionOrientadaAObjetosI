package parcialito;

public class parcialito0929 {
    Casa casa = new Casa("Pablo", "Ind 321", 100, 3, false, 2, 2, false);
    // casa.informacion();
    System.out.println("asd");
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
        System.out.println(getMetrosCuadrados());
        System.out.println(getCantidadHabitaciones());
        System.out.println(getCantidadBaños());
    }
}

class Casa extends Vivienda {
    int CantidadDePisos;
    boolean Patio;

    Casa(String Propietario, String Direccion, double MetrosCuadrados, int CantidadHabitaciones, boolean TieneCochera, int CantidadBaños, int CantidadDePisos, boolean Patio) {
        super(Propietario, Direccion, MetrosCuadrados, CantidadHabitaciones, TieneCochera, CantidadBaños);
        this.CantidadDePisos = CantidadDePisos;
        this.Patio = Patio;

        // Habitaciones("asd", getMetrosCuadrados()/getCantidadHabitaciones());
    }

    public int getCantidadDePisos() {
        return CantidadDePisos;
    }

    boolean getPatio() {
        return Patio;
    }

    void informacion() {
        super.informacion();
        System.out.println(getCantidadDePisos());
        System.out.println(getPatio());
    }
}

class Departamento extends Vivienda {
    int Piso;
    boolean Ascensor;
    int CantidadDeAscensores;
    boolean TieneSum;
    boolean Seguridad;

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
}

class Habitaciones {
    String NombreHabitacion;
    double MetrosCuadradosHabitacion;

    Habitaciones(String NombreHabitacion, double MetrosCuadradosHabitacion) {
        this.NombreHabitacion = NombreHabitacion;
        this.MetrosCuadradosHabitacion = MetrosCuadradosHabitacion;
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