package lesson3;

public class Main2 {
    public static void main(String[] args) {
        // Есть массив чисел, нужно напечатать на консоль только четные числа в обратном порядке
        int[] numbers = {5,25,9,7,5,3,12,1,44,5,1,2,10,0,5,76,7,18}; // i объявляем длинна массива минус 1

        for (int i = numbers.length - 1; i>=0; i--){
            if(numbers[i] % 2 == 0){ // проверка на четность числа в массиве
                System.out.println(numbers[i]);
            }

        }
    }
}
