package lesson3;
//Есть массив цифр: {3,5,8,3,55,4,1,65,36,98}
// * Вывести на консоль те числа, которые содержат символ 5

public class Task3 {
        public static void main(String[] args) {
            int[] myArray = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};

            for (int number : myArray) {
                // Преобразуем число в строку и пройдемся по ее символам
                String numberAsString = Integer.toString(number);
                boolean contains5 = false;

                for (int i = 0; i < numberAsString.length(); i++) {
                    if (numberAsString.charAt(i) == '5') {
                        contains5 = true;
                        break; // Если символ '5' найден, выходим из цикла
                    }
                }

                // Если число содержит символ '5', выводим его на консоль
                if (contains5) {
                    System.out.println(number);
                }
            }
        }
    }
