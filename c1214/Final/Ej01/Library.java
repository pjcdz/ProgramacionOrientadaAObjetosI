package c1214.Final.Ej01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    List<Item> items;
    List<Member> members = new ArrayList<>();
    

    public Library(String title, int publishYear, String author, String ISBN, int issueNumber) {
        Book book = new Book(title, publishYear, author, ISBN);
        Magazine magazine = new Magazine(title, publishYear, issueNumber);

        items = new ArrayList<>( Arrays.asList(book, magazine));
    }

    void getItemData(int index) {
        items.get(index).displayDetails();
    }

    void addItem(Item itemToAdd) {
        System.out.println("Item added");
    }

    void registerMember(Member memberToRegister) {
        System.out.println("Member registered");
    }
}
