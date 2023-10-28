package c1027;

public abstract class Usuario {
    
    String nombre = "";
    String apellido = "";
    String email = "";

    Usuario(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
}
