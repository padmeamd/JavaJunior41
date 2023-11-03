package lesson3;
//Есть массив цифр: {3,5,8,3,55,4,1,65,36,98}
//Вывести на консоль массив с обратной стороны
public class Task2 {
    public static void main(String[] args) {
        int[] givenArray = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};
        for (int i = givenArray.length - 1; i >= 0; i--) { // длина массива минус 1 ( т.к. чисел в массиве 10, а исчисление массива начинается с 0
            // ?? ПОЧЕМУ  int i = 9; не будет работать в таком случае и нужно только через форсмулу???
        System.out.println(givenArray[i]);
    }
    }
}
