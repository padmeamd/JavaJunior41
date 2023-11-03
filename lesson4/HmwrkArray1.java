package lesson4;

public class HmwrkArray1 {
    public static void main(String[] args) {
        int size = 8; // Объявляем переменную size и инициализируем её значением 8 = размер массива

        int[][] array = new int[size][size]; // Создание двумерного массива array размером 8x8

        for (int i = 0; i < size; i++) { // Внешний цикл для итерации по строкам массива
            for (int j = 0; j <= i; j++) { // Внутренний цикл для итерации по столбцам в текущей строке

            }
        }

        // Вывод фигуры
        for (int i = 0; i < size; i++) { // Внешний цикл для итерации по строкам массива при выводе
            for (int j = 0; j <= i; j++) { // Внутренний цикл для итерации по столбцам в текущей строке при выводе

                    System.out.print(array[i][j]); //  выводим символ "0"
            }
            System.out.println();
        }
    }
}
