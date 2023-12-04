package lesson12;

public class Journal extends PrintEdition{

    int issueNumber;

    public Journal() {
    }

    public Journal(String name, int year, int pages, String publisher, int issueNumber) {
        super(name, year, pages, publisher);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Journal journal = (Journal) o;

        return issueNumber == journal.issueNumber;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + issueNumber;
        return result;
    }

    @Override
    public String toString() {
        return "Book{ Title: " + getTitle() + ", amount of pages: " + getPages() +
                " ,number of issue: "+ getIssueNumber() +" , publisher: " + getPublisher() + " , published in: " + getYear()+
                '}';
    }
}
