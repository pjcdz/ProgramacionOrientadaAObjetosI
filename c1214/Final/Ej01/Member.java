package c1214.Final.Ej01;

import java.util.ArrayList;
import java.util.List;

public class Member {
    String name;
    List<Borrowable> borrowedItems = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    void borrowItem(Item borrowableItem) {
        System.out.println("Borrow item");
    }

    void returnItem(Item borrowableItem) {
        System.out.println("Return item");
    }
}
