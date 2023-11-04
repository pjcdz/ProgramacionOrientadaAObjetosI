package Ej1;

public class App {
    public static void main(String[] args) {
        Library library = new Library(null, 2013, null, null, 173); 

        Member member = new Member("Pablo");
        library.registerMember(member);

        Book nuevoLibro = new Book(null, 200, null, null);
        library.addItem(nuevoLibro);

        Magazine nuevaRevista = new Magazine(null, 0, 0);
        library.addItem(nuevaRevista);
    }
}

interface IBorrowable {
    void borrowItem();
    void returnItem();
}

abstract class Item {
    String tittle;
    int publishYear;

    public Item(String tittle, int publishYear) {
        this.tittle = tittle;
        this.publishYear = publishYear;
    }

    public String getTittle() {
        return this.tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }


    @Override
    public String toString() {
        return "{" +
            " tittle='" + getTittle() + "'" +
            ", publishYear='" + getPublishYear() + "'" +
            "}";
    }

    void displayDetails() {
        System.out.println( toString() );
    }
}