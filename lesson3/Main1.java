package lesson3;

public class Main1 {
    public static void main(String[] args) {
        int[] numbers = {1,4,3,8,8,0};

        // System.out.println(numbers[0]);// вывод первой ячейки массива (начинается с 0)
        /* System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]); */
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
