package lesson4;

public class Main3 {
    public static void main(String[] args) {
        // Напечатать на консоль главную диагональ ровного квадрата 8 на 8

        int[][] nums = new int[8][8];

        for (int i = 0; i< nums.length; i++){
            // внутренний цикл for, генерирующий индкексы колонок
            for(int j = 0; j < nums[i].length; j++){ // индекс колонки, которую хотим вывести
                if(i + j == nums.length - 1){ // обратная диагональ
                    System.out.print(nums[i][j] + " ");
                }else{
                    System.out.print(" " + " ");
                }

            }
            System.out.println();
        }


    }
}
