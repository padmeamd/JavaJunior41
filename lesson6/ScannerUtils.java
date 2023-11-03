package lesson6;

import java.util.Scanner;

public class ScannerUtils {
    public static void searchByCountry(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which country to you want to travel to?");
        String requested_country = scanner.nextLine(); // создаем переменную, куда передаем введенные данные

        TourUtils.printToursByCountry(tours, requested_country); // проходим по двухмерному массиву и делаем отбор по стране
    }
// метод поиска туров по бюджету
// ( пользователь задает одно число и мы печатаем туры +- 20тыс от этого бюджета)
    public static void searchByBudget(String[][] tours){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your budget?\n Type your answer: ");
        int budget = scanner.nextInt();
        System.out.println("_________SEARCH RESULTS_____________");
        TourUtils.printToursByBudget(tours, budget);
        System.out.println("____________________________________");
    }
}
