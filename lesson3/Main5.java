package lesson3;

public class Main5 {
    public static void main(String[] args) {
        // String ссылочный тип, описывающий текст
        String text = "Hello World!";

        char[] symbol = text.toCharArray();

        for(int i = 0; i< symbol.length; i++){
            System.out.println(symbol[i]);
        }
    }
}
