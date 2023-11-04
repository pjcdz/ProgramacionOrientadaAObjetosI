package Ej1;

public class Magazine extends Item implements IBorrowable {
    int issueNumber;

    public Magazine(String tittle, int publishYear, int issueNumber) {
        super(tittle, publishYear);
        this.issueNumber = issueNumber;
    }


    public int getIssueNumber() {
        return this.issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
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
