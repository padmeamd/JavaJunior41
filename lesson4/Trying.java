package lesson4;

public class Trying {

        public static void main(String[] args) {
            int size = 8; // Размер квадратного массива
            int[][] array = new int[size][size];

            // Заполнение массива
            for (int i = 0; i < size; i++) {
                for (int j = 0; j <= i; j++) {
                    array[i][j] = 1; // Устанавливаем 1 вместо 0
                }
            }

            // Вывод фигуры
            for (int i = 0; i < size; i++) {
                for (int j = 0; j <= i; j++) {
                    if (array[i][j] == 1) {
                        System.out.print("[*] "); // Выводим символ для 1
                    } else {
                        System.out.print("[ ] "); // Выводим символ для 0
                    }
                }
                System.out.println(); // Переход на новую строку после каждой строки
            }
        }
    }

