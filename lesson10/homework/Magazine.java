package lesson10.homework;
// КЛАСС ЖУРНАЛОВ  (название,год выхода,номер(в году),издательство)
public class Magazine extends PrintEdition {
    int year;
    int issueNumber;


    public Magazine(String title, String publisher, int year, int issueNumber,int pageCount) {
        super(title, publisher,pageCount);
        this.year = year;
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Year: " + year);
        System.out.println("Issue number: " + issueNumber);
    }
}
