package lesson12;

public class Main {
    public static void main(String[] args) {
        PrintEdition[] editions = new PrintEdition[6];

        editions[0] = new Book("Fourth Wing",2023,613,"RED TOWER","Rebecca Yarros");
        editions[1] = new Book("Throne of Glass",2013,510,"Black Book","S J MAAS");
        editions[2] = new Book("The Cruel Prince",2019,410,"Black Book","Holly Black");
        editions[3] = new Journal("Fashion",2023,30,"RUE",6 );
        editions[4] = new Journal("Vogue",2023,33,"VOGUE PUBLISHING",3 );
        editions[5] = new Journal("ALL STARS",2020,30,"RU",3 );


        for ( PrintEdition currentEdition : editions ) {  // for each - сокращенный вариант for
            // справа кладем массив, по которому хотим пройтись
            // Тип PrintEdition и название переменной (создаем внутри цикла)
            System.out.println(currentEdition.toString());

            printFattestEdition(editions);
        }
    }

    public static void printFattestEdition(PrintEdition[] editions){
        //дома
    }
}
