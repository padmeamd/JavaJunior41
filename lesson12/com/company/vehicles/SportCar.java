package lesson12.com.company.vehicles;
// Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью.

import lesson12.com.company.details.Engine;
import lesson12.com.company.professions.Driver;

public class SportCar extends Car{

    private double maxSpeed;

    public SportCar(String brandName, String carClass, double weight, Driver driver, Engine engine, double maxSpeed) {
        super(brandName, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
