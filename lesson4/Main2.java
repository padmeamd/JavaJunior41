package lesson4;
// Создать двухмерный масссив чисел и вывести его на консоль


public class Main2 {
    public static void main(String[] args) {
        int[][] numbers ={{2,5,6}, // 0 ячейка, индескс строки
                          {3,5,7}, // 1 ячейка, индескс строки
                          {8,9,0}, // 2 ячейка, индескс строки
                          {1,3,6}};// 3 ячейка, индескс строки

        // !!! универсальный код по двухмерному массиву !!!

        for (int i = 0; i< numbers.length; i++){
            // внутренний цикл for, генерирующий индкексы колонок
            for(int j = 0; j < numbers[i].length; j++){ // индекс колонки, которую хотим вывести
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
