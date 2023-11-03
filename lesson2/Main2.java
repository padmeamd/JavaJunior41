package lesson2;

public class Main2 {
    public static void main(String[] args) {
        // Есть 3 стороны треугольника. Нужно вывести разносторонний, равносторонний или равнобедренный.

        // Управляющая конструкция IF ELSE

        int a = 7;
        int b = 9;
        int c = 5;
        // && - это "и в то же самое время"
        if (a == b && b == c && a == c) {
            System.out.println("Это равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        }
        // || - "ИЛИ"
        /* if ((a == b && b != c && c != a) || (a != b && b != c && c == a) || (a != b && b == c && c != a)) */
        else {
            System.out.println("Это равнобедренный треугольник");
        }


    }
}
