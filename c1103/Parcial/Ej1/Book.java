package Ej1;

public class Book extends Item implements IBorrowable {
    String author;
    String ISBN;

    public Book(String tittle, int publishYear, String author, String iSBN) {
        super(tittle, publishYear);
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
    public void borrowItem() {
        System.out.println("Borrow item");
    }
    
    @Override
    public void returnItem() {
        System.out.println("Return item");
    }
}
