package c1214.Final.Ej01;

public class Book extends Item implements Borrowable{
    String author;
    String ISBN;

    public Book(String title, int publishYear, String author, String iSBN) {
        super(title, publishYear);
        this.author = author;
        ISBN = iSBN;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public void borrow() {
        System.out.println("Borrow book");
    }

    @Override
    public void returnItem() {
        System.out.println("Return book");
    }

}
