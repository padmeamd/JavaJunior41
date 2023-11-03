package lesson3;
// Напечатать на консоль каждое слово в обратном порядке "Я буду учиться лучше":
public class Task5 {
    public static void main(String[] args) {
        String inputString = "Я буду учиться лучше";

        // Разбиваем строку на слова, используя пробел в качестве разделителя
        String[] words = inputString.split(" ");

        // Выводим каждое слово в обратном порядке
        for (String word : words) {
            char[] charArray = word.toCharArray();
            for (int i = charArray.length - 1; i >= 0; i--) {
                System.out.print(charArray[i]);
            }
            System.out.print(" "); // Добавляем пробел между словами
        }
    }
}