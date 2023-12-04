package lesson7.homework;
/**1) Создайте класс Phone, который содержит переменные number, model и weight.
        2) Создайте три экземпляра этого класса.
        3) Выведите на консоль значения их переменных.
        4) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
 Метод getNumber – возвращает номер телефона.
 Вызвать эти методы для каждого из объектов.
        5) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
        6) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
        7) Добавить конструктор без параметров **/
public class Phone {

    private long number;
    private String model;
    private double weight;

    // Конструктор без параметров
    // пустой конструктор класса всегда должен существовать, если мы добавляем еще конструктор(ы)
    public Phone() {

    }

    // основной конструктор
    public Phone(long number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // доп. конструктор, который принимает на вход два параметра
    // для инициализации переменных класса - number, model.
    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }


    // геттеры
    public long getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    // сеттеры
    public void setNumber(long number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    //метод receiveCall
    public void receiveCall(String name) {
        System.out.println(name + " is calling...");
    }
}