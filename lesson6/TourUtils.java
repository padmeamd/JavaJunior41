package lesson6;

public class TourUtils {

    // напишем метод, который будет сохранять 1 тур в двухмерный массив
    // метод невозвращаемый, поэтому void

    public static void addTour(String country, String city, String transport,String days, String cost, String hotel_stars, String food, String[][] tours){
        for (int i = 0; i < tours.length; i++){
            if(tours[i][0] == null){ // если ячейка массива пустая

                tours[i][0] = (i + 1) + "";// номер увеличивается первой колонки; "" создали пустое место для преобразования int в String
                tours[i][1] = country;
                tours[i][2] = city;
                tours[i][3] = transport;
                tours[i][4] = days;
                tours[i][5] = cost;
                tours[i][6] = hotel_stars;
                tours[i][7] = food;

                // цикл нужно остановить, чтобы тур не записывался до конца памяти в массиве
                break;

            }

        }
    }

    public static void printToursByCountry(String[][] tours, String country){
        for(int i = 0; i < tours.length; i++){
            if ( tours[i][0] != null && tours[i][1].equalsIgnoreCase(country)){ // добавить && сity и будет сортировать по городу также
                System.out.printf("Available tour №%s to %s (%s), duration: %s, by %s, %s %s included \n ", tours[i][0],tours[i][1],tours[i][2],tours[i][4],tours[i][3],tours[i][5],tours[i][6],tours[i][7]);
            }
        }
    }

    public static void printToursByBudget(String[][] tours, int budget){
        // "120000 rub" -- 5 колонка
        // int budget = 120000;

        for(int i = 0; i < tours.length; i++){ // проход по каждому туру

            if(tours[i][0] != null) {
                int hollowSpaceIndex = tours[i][5].indexOf(" "); // узнали номер (индекс) пробела, чтобы потом резать rub от String  и переводить в int
                String costString = tours[i][5].substring(0, hollowSpaceIndex);// subString - метод " вырезать, мы вырезали только цену БЕЗ RUB

                int costOfTheCurrentTour = Integer.parseInt(costString); // Integer.parseInt() распознать число; преобразовали текстовую цену в число

                int maxBudget = budget + 20000;
                int minBudget = budget - 20000;
                if (costOfTheCurrentTour>minBudget && costOfTheCurrentTour < maxBudget ) { // если мы входим в бюджет
                    // пример: цена тура = 120тыс ;  а бюджет клиента = 110 тыс
                    System.out.printf("Available tour №%s to %s (%s), duration: %s, by %s, %s %s included \n ",
                            tours[i][0], tours[i][1], tours[i][2], tours[i][4], tours[i][3],
                            tours[i][5], tours[i][6], tours[i][7]);
                }
            }
        }
    }
}
