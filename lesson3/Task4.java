package lesson3;
//Напечатать на консоль каждое слово в отдельной строке

public class Task4 {
    public static void main(String[] args) {
        String text = " Я буду учиться лучше";
        // Разбиваем строку на слова, используя пробел в качестве разделителя
        String[] words = text.split("");

        // Выводим каждое слово в отдельной строке
        for (String word : words) {
            System.out.println(word);
        }
    }


}
