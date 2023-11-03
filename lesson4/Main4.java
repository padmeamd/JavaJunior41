package lesson4;
// Вывести на консоль : шахматная доска 2д массива из 0 и 1
public class Main4 {
    public static void main(String[] args) {
        int[][] nums = new int[8][8];

        for (int i = 0; i< nums.length; i++){
            // внутренний цикл for, генерирующий индкексы колонок
            for(int j = 0; j < nums[i].length; j++){ // индекс колонки, которую хотим вывести
                if((i+j) % 2 == 0){ // обратная диагональ
                    System.out.print(nums[i][j] + " ");
                }else{
                    System.out.print(" " + " ");
                }

            }
            System.out.println();
        }
    }
}
