package lesson9;

public class Circle {
    private double radius;

    // Конструктор с заданным радиусом
    public Circle(double radius) {
        this.radius = radius;
    }

    // Конструктор по умолчанию
    public Circle() {
        // Значения по умолчанию или другая логика инициализации
    }

    // Методы геттеры и сеттеры
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Методы для расчета площади и периметра
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
