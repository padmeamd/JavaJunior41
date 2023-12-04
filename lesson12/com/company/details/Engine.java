package lesson12.com.company.details;

public class Engine {
    private double power;
    private String manufacturer;


    public Engine(double power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
