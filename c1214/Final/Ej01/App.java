package c1214.Final.Ej01;

public class App {
    public static void main(String args[]) {
        // System.out.println("asd");

        Book newBook = new Book(null, 0, null, null);
        Magazine newMagazine = new Magazine(null, 0, 0);

        Library library = new Library(null, 0, null, null, 0);

        library.addItem(newBook);
        library.addItem(newMagazine);

        Member member = new Member("Pablo");

        library.registerMember(member);

        library.getItemData(0);
        newBook.displayDetails();
    }
}

interface Borrowable {
    void borrow();
    void returnItem();
}

abstract class Item {
    String title;
    int publishYear;

    public Item(String title, int publishYear) {
        this.title = title;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
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
            " title='" + getTitle() + "'" +
            ", publishYear='" + getPublishYear() + "'" +
            "}";
    }

    public void displayDetails() {
        System.out.println( toString() );
    }
}