package lesson4;
//Есть массив цифр: {3,5,8,3,55,4,1,65,36,98}
// Вывести на консоль через ячейку
//Вывести на консоль массив с обратной стороны
// * Вывести на консоль те числа, которые содержат символ 5

public class Homework123 {
    public static void main(String[] args) {
        int[] array = {3,5,8,3,55,4,1,65,36,98};

        for(int i = 0; i< array.length; i = i +2) {
            System.out.println(array[i]);
        }
        System.out.println();
        for(int i = array.length - 1; i>=0; i--){
            System.out.println(array[i]);
        }

        System.out.println();

        for(int i = 0; i< array.length; i++){
            // нужно преобразовать число в ряд символов; String - набор символов
            // конкатинация строк = склеивание текста
            // массив по индексу i
            String currentNumFromArray = array[i] + "";// 3 ---> "3" ( тройка текстового формата)
            if(currentNumFromArray.contains("5")){
                System.out.println(currentNumFromArray);

            }


        }
    }
}
