package lesson6;

import java.util.Scanner;

public class ScannerUtils {
    public static String[][] searchByCountry(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which country to you want to travel to?");
        String requestedCountry = scanner.nextLine().strip(); // создаем переменную, куда передаем введенные данные
        System.out.println("-----ALL OF THE AVAILABLE TOURS-------");
        return TourUtils.printToursByCountry(tours, requestedCountry); // проходим по двухмерному массиву и делаем отбор по стране
    }
// метод поиска туров по бюджету
// ( пользователь задает одно число и мы печатаем туры +- 20тыс от этого бюджета)
    public static String[][] searchByBudget(String[][] tours){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your budget?\n Type your answer: ");
        int budget = scanner.nextInt();
        System.out.println("_________SEARCH RESULTS_____________");
        final var rs = TourUtils.printToursByBudget(tours, budget);
        System.out.println("____________________________________");

        return rs;
    }

    public static void searchByDays(String[][] tours){
        Scanner scanner = new Scanner(System.in);
        System.out.println("For how many days you're planning your trip?\n Type your answer: ");
        int days = scanner.nextInt();
        System.out.println("_________SEARCH RESULTS_____________");
        TourUtils.printToursByDays(tours, days);
        System.out.println("____________________________________");
    }

    public static void searchByStars(String[][] tours){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many stars?\n Type your answer: ");
        int amountOfStars = scanner.nextInt();
        System.out.println("_________SEARCH RESULTS_____________");
        TourUtils.printToursByDays(tours, amountOfStars);
        System.out.println("____________________________________");
    }
    public static String[][] searchByTransport(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(By) plane or train?");
        String requestedTransport = scanner.nextLine().strip(); // создаем переменную, куда передаем введенные данные
        System.out.println("-----ALL OF THE AVAILABLE TOURS-------");
        return TourUtils.printToursByTransport(tours, requestedTransport); // проходим по двухмерному массиву и делаем отбор по стране
    }
}
