package lesson2;

public class Main1 {
    public static void main(String[] args) {
        // Задача: есть число. Нужно напечатать на консоль TRUE,если четное; FALSE - если нечетное.

        int number = 13;
        int ostatokDeleniaNa2 = number % 2; // 1   0
        System.out.println(ostatokDeleniaNa2 == 0);
    }
}
