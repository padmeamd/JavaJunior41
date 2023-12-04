package lesson12;

import java.util.Objects;

public class PrintEdition {
    protected String title;
    private int year;
    private int pages;

    private String publisher;


    public PrintEdition(){

    }


    public PrintEdition(String name, int year, int pages, String publisher) {
        this.title = name;
        this.year = year;
        this.pages = pages;
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrintEdition that = (PrintEdition) o;

        if (year != that.year) return false;
        if (pages != that.pages) return false;
        if (!Objects.equals(title, that.title)) return false;
        return Objects.equals(publisher, that.publisher);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + year;
        result = 31 * result + pages;
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PrintEdition{" +
                "name='" + title + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
