package lesson9;

public class Triangle {
    // Класс для треугольника
        private double side1;
        private double side2;
        private double side3;

        // Конструктор
        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // Методы для расчета площади и периметра
    public double calculateArea() {
        // Реализация расчета площади для треугольника
        // (можно использовать формулу Герона)
        return 0; // замените на реальную логику
    }

    public double calculatePerimeter() {
        // Реализация расчета периметра для треугольника
        return side1 + side2 + side3;
    }
}
