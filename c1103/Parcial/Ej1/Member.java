package Ej1;

import java.util.ArrayList;
import java.util.List;

public class Member{
    String name;
    List<IBorrowable> borrowedItems;

    public Member(String name) {
        this.name = name;
        this.borrowedItems = new ArrayList<>();
    }


    public void borrowItem(IBorrowable item) {
        borrowedItems.add(item);
    }

    public void returnItem(IBorrowable item) {
        borrowedItems.remove(item);
    }

        
}