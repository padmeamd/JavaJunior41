package lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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

    public static String[][] printToursByCountry(String[][] tours, String country){
        // Создаем список для хранения отфильтрованных туров
        List<List<String>> result = new ArrayList<>();

        // Перебираем каждый тур в массиве
        for(int i = 0; i < tours.length; i++){

            if ( tours[i][0] != null && tours[i][1].equalsIgnoreCase(country)){ // добавить && сity и будет сортировать по городу также
                System.out.printf("Available tour №%s to %s (%s), duration: %s, by %s, %s, %s, %s included \n ", tours[i][0],tours[i][1],tours[i][2],tours[i][4],tours[i][3],tours[i][5],tours[i][6],tours[i][7]);
                result.add(List.of(tours[i]));
            }
        }
        final var rs = new String[result.size()][result.get(0).size()];
        for (int i = 0; i < rs.length; i++) {
            rs[i] = result.get(i).toArray(new String[]{});
        }
        return rs;
    }

    public static String[][] printToursByBudget(String[][] tours, int budget){
        // Создаем список для хранения отфильтрованных туров
        // "120000 rub" -- 5 колонка
        // int budget = 120000;

          List<List<String>> result = new ArrayList<>();

        for(int i = 0; i < tours.length; i++){ // проход по каждому туру
            // Перебираем каждый тур в массиве

            if(tours[i][0] != null) {
                // Проверяем, что в данной ячейке есть данные (например, тур не был удален)

                // Находим индекс пробела в столбце с ценой тура
                int hollowSpaceIndex = tours[i][5].indexOf(" "); // узнали номер (индекс) пробела, чтобы потом резать rub от String  и переводить в int
                // Извлекаем подстроку с ценой тура (без "rub")
                String costString = tours[i][5].substring(0, hollowSpaceIndex);// subString - метод " вырезать, мы вырезали только цену БЕЗ RUB

                // Преобразуем строку с ценой в целое число
                int costOfTheCurrentTour = Integer.parseInt(costString); // Integer.parseInt() распознать число; преобразовали текстовую цену в число

                // Определяем верхний и нижний предел бюджета
                // с учетом допустимой погрешности в 20000 рублей
                int maxBudget = budget + 20000;
                int minBudget = budget - 20000;

                // Проверяем, соответствует ли цена тура бюджету клиента
                if (costOfTheCurrentTour>minBudget && costOfTheCurrentTour < maxBudget ) { // если мы входим в бюджет
                    // пример: цена тура = 120тыс ;  а бюджет клиента = 110 тыс
                    result.add(List.of(tours[i]));

                    // Выводим информацию о туре в консоль
                    System.out.printf("Available tour №%s to %s (%s), duration: %s, by %s, %s, %s, %s included \n ",
                            tours[i][0], tours[i][1], tours[i][2], tours[i][4], tours[i][3],
                            tours[i][5], tours[i][6], tours[i][7]);
                }
            }
        }
        // Преобразуем список результатов в двумерный массив строк
        final var rs = new String[result.size()][result.get(0).size()];
        for (int i = 0; i < rs.length; i++) {
            rs[i] = result.get(i).toArray(new String[]{});
        }
        // Возвращаем двумерный массив с отфильтрованными турами
        return rs;
    }

    public static void printToursByDays(String[][] tours, int days) {

        for(int i = 0; i < tours.length; i++){ // проход по каждому туру

            if(tours[i][0] != null) {
              //  int hollowSpaceIndex = tours[i][4].indexOf(" "); // узнали номер (индекс) пробела, чтобы потом резать days от String  и переводить в int
             //   String daysString = tours[i][4].substring(0, hollowSpaceIndex);// subString - метод " вырезать, мы вырезали только уифру без days
             //   int daysOfTheTour = Integer.parseInt(daysString); // Integer.parseInt() распознать число; преобразовали текстовую цену в число

                final var pattern  = Pattern.compile("[0-9]+"); // pattern - шаблон выражения, на наличие которого мы будем сканировать
                final var matcher = pattern.matcher(tours[i][4]); // mather - отвечает за поиск объекта по шаблону; final var - неизменяемая переменная
                matcher.find();
                int daysOfTheTour = Integer.parseInt(matcher.group());// Integer.parseInt() распознать число; преобразовали текстовую цену в число


                int maxDays = days + 3;
                int minDays = days - 3;
                if (daysOfTheTour>minDays && daysOfTheTour < maxDays ) { // если мы входим в бюджет

                    // пример: кол-во дней тура = 9 дней ;  а запрос клиента = 6 дней
                    System.out.printf("Available tour №%s to %s (%s), duration: %s, by %s, %s, %s, %s included \n ",
                            tours[i][0], tours[i][1], tours[i][2], tours[i][4], tours[i][3],
                            tours[i][5], tours[i][6], tours[i][7]);

                }
            }
        }
    }

    // ТУРЫ по количеству звезд + тип транспорта
    public static String[][] printToursByStars(String[][] tours, String stars){
        // Создаем список для хранения отфильтрованных туров
        List<List<String>> result = new ArrayList<>();

        // Перебираем каждый тур в массиве
        for(int i = 0; i < tours.length; i++){

            if ( tours[i][0] != null && tours[i][6].equalsIgnoreCase(stars)){
                System.out.printf("Available tour №%s to %s (%s), duration: %s, by %s, %s, %s, %s included \n ", tours[i][0],tours[i][1],tours[i][2],tours[i][4],tours[i][3],tours[i][5],tours[i][6],tours[i][7]);
                result.add(List.of(tours[i]));
            }
        }
        final var res = new String[result.size()][result.get(0).size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = result.get(i).toArray(new String[]{});
        }
        return res;
    }


    public static String[][] printToursByTransport(String[][] tours, String transport){
        // Создаем список для хранения отфильтрованных туров

        List<List<String>> result = new ArrayList<>();

        // Перебираем каждый тур в массиве
        for(int i = 0; i < tours.length; i++){

            if ( tours[i][0] != null && tours[i][3].equalsIgnoreCase(transport)){
                System.out.printf("Available tour №%s to %s (%s), duration: %s, by %s, %s, %s, %s included \n ", tours[i][0],tours[i][1],tours[i][2],tours[i][4],tours[i][3],tours[i][5],tours[i][6],tours[i][7]);
                result.add(List.of(tours[i]));
            }
        }
        final var res = new String[result.size()][result.get(0).size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = result.get(i).toArray(new String[]{});
        }
        return res;
    }


}
