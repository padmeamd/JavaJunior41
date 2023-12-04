package lesson8.homework;

public class TourAgency extends Tour {
    // Класс ТурАгенство

    private Tour[] tours;  //Полем класса объявляю массив Туров

    // Конструктор
    public TourAgency(int size) {
        tours = new Tour[size];
    }

    // Метод для добавления тура в массив
    public void addTour(Tour tour, int index) {
        tours[index] = tour;
    }

    // Метод для печати информации о всех турах
    public void displayAllTours() {
        for (Tour tour : tours) {
            if (tour != null) {
                tour.displayTourInfo();
                System.out.println("===============================");
            }
        }
    }

    // Метод для печати информации о самом дешевом туре
    public void displayCheapestTour() {
        if (tours.length > 0) {
            Tour cheapestTour = tours[0];
            for (Tour tour : tours) {
                if (tour != null && tour.getPrice() < cheapestTour.getPrice()) {
                    cheapestTour = tour;
                }
            }
            System.out.println("\nINFO ABOUT THE CHEAPEST TOUR:");
            cheapestTour.displayTourInfo();
        } else {
            System.out.println("Sorry, there's no available tours");
        }
    }


}
