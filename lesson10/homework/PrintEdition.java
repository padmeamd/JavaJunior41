package lesson10.homework;

public class PrintEdition {
    String title;
    String publisher;

    int pageCount ;
    // constructor
    public PrintEdition(String title, String publisher,int pageCount) {
        this.title = title;
        this.publisher = publisher;
        this.pageCount = pageCount;
    }
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
    }


    public int getPageCount() {
        return pageCount;
    }

}
