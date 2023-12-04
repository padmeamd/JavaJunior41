package lesson11;

public class HenFactory {
    public static Hen getHen(String country) {
        //Многие языки используют не только условную конструкцию if, но и switch в дополнение к ней.
        // Конструкция switch — это специализированная версия if,
        // созданная для некоторых особых ситуаций.


        //Начало конструкции switch,которая проверяет значение country
        // после приведения его к нижнему регистру с использованием метода toLowerCase().

        switch (country.toLowerCase()){
            case "россия": //case "россия":: Если значение country равно "россия" (без учета регистра), выполняется следующая строчка.
                return new RussianHen(); // return new RussianHen();: Возвращает новый объект типа RussianHen, представляющий курицу из России.
            case  "украина":
                return new UkrainianHen();
            case "молдова" :
                return new MoldovanHen();
            case "беларусь":
                return  new BelarusianHen();

                //Эта часть выполняется, если значение country не совпадает
            // ни с одним из указанных случаев в конструкции switch
            default:

                throw new IllegalArgumentException("Страна неизвестна" + country);
                //Бросает исключение типа IllegalArgumentException с сообщением о том, что страна неизвестна.



        }

    }
}
