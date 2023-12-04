package lesson10.homework;

/** Разработать классы для хранения информации
 * о печатных изданиях
 * 1) книгах (название,автор,год издания, кол-во страниц,издательство)
 * 2) журналах (название,год выхода,номер(в году),издательство)
 *Создать массив печатных изданий с неоднородным составом
 * (хранятся как книги, так и журналы)
 * заполнить его несколькими элементами
 * вывести все элементы этого массива на экран
 * *** найти в масссиве самое толстое издание и вывести инфу о нем на экран
 */
// КЛАСС КНИГ
public class Book extends PrintEdition {
    String author;
    int year;


    public Book(String title, String author, int year, int pageCount, String publisher) {
        super(title, publisher,pageCount);
        this.author = author;
        this.year = year;

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Page count: " + pageCount);
    }


}
