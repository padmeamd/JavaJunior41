package lesson10.homework;

import java.lang.reflect.Array;

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

public class Main {

    public static void main(String[] args) {

        PrintEdition[] printEditions = new PrintEdition[6];

        printEditions[0]= new Book("The Ballad of Songbirds and Snakes","Suzanne Collins",2020,517,"Scholastic");
        printEditions[1]= new Magazine("GQ", "Condé Nast Inc",2023,5,15);
        printEditions[2] = new Book("Iron Flame","Rebecca Yarros",2023,623,"Red Tower Books");
        printEditions[3] = new Book("Fourth Wing","Rebecca Yarros", 2023,512,"Red Tower Books");
        printEditions[4] = new Book("A Court of Mist and Fury"," Sarah J Maas",2020,640,"Bloomsbury Publishing");
        printEditions[5]= new Magazine("Vogue", "Condé Nast Inc",2023,9,25);

        int max = printEditions[0].getPageCount();

        // Вывод информации о каждом элементе массива
        System.out.println("AVAILABLE PRINTED EDITIONS: ");
        System.out.println("______________________________________");
        for (PrintEdition printEdition : printEditions) {
            printEdition.displayInfo();
            System.out.println("---------------");
        }

        for (PrintEdition printEdition : printEditions) {
            if(printEdition.getPageCount() > max){
                max = printEdition.getPageCount();
            }

        }
        System.out.println( "самое толстое издание: ");
        for (PrintEdition printEdition : printEditions) {
            if(printEdition.getPageCount() == max){
                printEdition.displayInfo();
                break;
            }

        }



    }
}
