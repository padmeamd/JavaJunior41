package lesson4;

public class HmwrkArray2 {
    public static void main(String[] args) {
     test();
    }
    public static void test () {
        int size = 8; // Объявляем переменную size и инициализируем её значением 8 = размер массива

        int len = size - 1;
        // Вывод фигуры
        for (int i = 0; i < size; i++) { // Внешний цикл для итерации по строкам массива при выводе
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = len - i; j < size; j++) { // Внутренний цикл для итерации по столбцам в текущей строке при выводе
                System.out.print("0");
            }
            System.out.println();
        }



    }
}
