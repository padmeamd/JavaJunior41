package lesson12.com.company.vehicles;

import lesson12.com.company.details.Engine;
import lesson12.com.company.professions.Driver;

// Класс Car содержит поля - марка автомобиля,
// класс автомобиля, вес, водитель типа Driver,
// мотор типа Engine. Методы start(), stop(), turnRight(), turnLeft(),
// которые выводят на печать: "Поехали", "Останавливаемся",
// "Поворот направо" или "Поворот налево".
// А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.
public class Car {
    private String brandName;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String brandName, String carClass, double weight, Driver driver, Engine engine) {
        this.brandName = brandName;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
