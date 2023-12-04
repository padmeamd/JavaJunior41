package lesson8.homework;

public class Main {
    public static void main(String[] args) {


        Tour tour1 = new Tour("United Kingdom", "plane", 14, 150000);
        Tour tour2 = new Tour("France", 90000);
        Tour tour3 = new Tour("Italy", 5, 100000);


        TourAgency agency = new TourAgency(3);

        agency.addTour(tour1, 0);
        agency.addTour(tour2, 1);
        agency.addTour(tour3, 2);

        System.out.println("ALL OF THE AVAILABLE TOURS:");
        agency.displayAllTours();

        agency.displayCheapestTour();

    }
}
