package lesson1;

public class task3 {
    public static void main(String[] args) {
        double budget = 1000.0;
        double snickersPrice = 35.0;
        double candyPrice = 3.5;

        int snickersCount = (int) (budget / snickersPrice); // количество сникерсов,которые можем купить
        int candyCount = (int) ((budget % snickersPrice) / candyPrice); // количество конфет; символ % обозначает вычисление остатка от деления нацело
        double change = budget - (snickersCount * snickersPrice) - (candyCount * candyPrice); // сдача

        System.out.println("The amount of snickers: " + snickersCount);
        System.out.println("The amount of candies: " + candyCount);
        System.out.println("Change: " + change);
    }
}
