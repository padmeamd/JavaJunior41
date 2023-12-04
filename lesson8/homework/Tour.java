package lesson8.homework;
//1) Создать класс Тур. Написать в нем поля класса: страна, кол-во дней, транспорт, цена.
//Создать все методы get и все методы set. Создать минимум 3 конструктора.
//Создать метод, который выводит на консоль информацию про Тур
//2) Создать класс ТурАгенство. Полем класса объявить массив Туров.
//Создать в нем метод, который будет добавлять один Тур в Массив Туров
//Создать в нем метод, который будет печатать на консоль информацию про ВСЕ туры из массива
//Создать в нем метод, который будет печатать на консоль Самый дешевый тур
//
//3) Создать класс Меин в котором продемонстрировать как работают все методы класса ТурАгенство

public class Tour {
    private String country;
    private int days;
    private String transport;
    private int price;


    // METHODS

    public Tour(String country, String transport, int days, int price) {
        this.days = days;
        this.country = country;
        this.price = price;
        this.transport = transport;

    }

    public Tour(String country, int days, int price) {
        this.country = country;
        this.days = days;
        this.price = price;
        // По умолчанию используется транспорт "Авиа", например
        this.transport = "plane";
    }

    public Tour(String country, int price) {
        this.country = country;
        // По умолчанию 7 дней и транспорт "Авиа"
        this.days = 7;
        this.transport = "plane";
        this.price = price;
    }

    public Tour() {

    }


    // Метод для вывода информации о туре
    public void displayTourInfo() {
        System.out.println("A tour to " + country + ", " + "by " + transport +
                ", " + "for " + days + " days, " + "price " + price + " RUB");
    }


    // GETTERS

    public String getCountry() {
        return country;
    }

    public String getTransport() {
        return transport;
    }

    public int getDays() {
        return days;
    }

    public int getPrice() {
        return price;
    }

    //SETTERS

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
