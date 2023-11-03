package lesson2;

public class Main {
    public static void main(String[] args) {
        int money = 1000;
        int costOfSnickers = 35;
        double costOfCandy = 3.5;

        int countOfSnickers = money / costOfSnickers; // 28 шт
        int rest = money % costOfSnickers; // 20 рублей остаток

        // два вида преобразования
        // внизсходящий
        // вверхсходящий
        int countOfCandies = (int) (rest / costOfCandy);
        double change = rest - (countOfCandies * costOfCandy);

        System.out.println(countOfSnickers);
        System.out.println(countOfCandies);
        System.out.println(change);

    }
}
