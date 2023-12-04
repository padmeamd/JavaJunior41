package lesson12.com.company.vehicles;

import lesson12.com.company.details.Engine;
import lesson12.com.company.professions.Driver;

// Создать производный от Car класс  - Lorry (грузовик),
// характеризуемый также грузоподъемностью кузова.
public class Lorry extends Car {
    private double carryingCapacity;

    public Lorry(String brandName, String carClass, double weight, Driver driver, Engine engine, double carryingCapacity) {
        super(brandName, carClass, weight, driver, engine);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carryingCapacity=" + carryingCapacity +
                '}';
    }
}
