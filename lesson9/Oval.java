package lesson9;

public class Oval {
    private double semiMajorAxis;
    private double semiMinorAxis;

    // Конструктор
    public Oval(double semiMajorAxis, double semiMinorAxis) {
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getSemiMinorAxis() {
        return semiMinorAxis;
    }

    public void setSemiMinorAxis(double semiMinorAxis) {
        this.semiMinorAxis = semiMinorAxis;
    }

    // Методы для расчета площади и периметра
    public double calculateArea() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

    public double calculatePerimeter() {
        // Приблизительный расчет периметра для овала (формула не так очевидна)
        return 2 * Math.PI * Math.sqrt((semiMajorAxis * semiMajorAxis + semiMinorAxis * semiMinorAxis) / 2);
    }
}