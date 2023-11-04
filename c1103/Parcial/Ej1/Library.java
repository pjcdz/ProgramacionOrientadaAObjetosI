package Ej1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    List<Item> items;
    List<Member> members;

    Library(String itemTittle, int itemPublishYear, String bookAuthor, String bookISBN, int magazineIssueNumber) {
        Book book = new Book(itemTittle, itemPublishYear, bookAuthor, bookISBN);
        Magazine magazine = new Magazine(itemTittle, itemPublishYear, magazineIssueNumber);

        this.items = new ArrayList<>( Arrays.asList(book, magazine));
        this.members = new ArrayList<>();
        // this.items.add(book);
        // this.items.add(magazine);
    }

    // void setDatosMember(String memberName) {
    //     Member member = new Member(memberName);
    //     this.members = new ArrayList<>( Arrays.asList(member) );
    // }

    void addItem(Item item) {
        items.add(item);
        System.out.println("Nuevo item agregado");
    }

    void registerMember(Member member) {
        members.add(member);
        System.out.println("Nuevo miembro agregado");
    }
}
