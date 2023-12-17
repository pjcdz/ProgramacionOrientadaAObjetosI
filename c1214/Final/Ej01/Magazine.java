package c1214.Final.Ej01;

public class Magazine extends Item implements Borrowable{
    int issueNumber;

    public Magazine(String title, int publishYear, int issueNumber) {
        super(title, publishYear);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return this.issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public void borrow() {
        System.out.println("Borrow magazine");
    }

    @Override
    public void returnItem() {
        System.out.println("Return magazine");
    }

    
}
