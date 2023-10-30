package c1030.EjercicioSimple.Ej07;

public class Libro {
    String titulo;
    String autor;
    int precio;
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Libro [titulo=" + getTitulo() + ", autor=" + getAutor() + ", precio=" + getPrecio() + "]";
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getPrecio() {
        return precio;
    }
}
