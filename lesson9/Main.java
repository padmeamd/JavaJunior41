package lesson9;
// 1) Создать класс Треугольник, Прямоугольник, Квадрат, Круг, Овал.
//2) Самостоятельно подумать какие нам нужны в этих классах поля, прописать их.
//3) Создать все методы гет и сет во всех классах.
//4) Создать минимум 2 конструктора в каждом классе
//5) Создать в каждом классе методы: площадь и периметр, которые возвращают значение площади или периметра,
// по заданным полям класса.
//6) Создать класс Main и показать как работают методы площадь и периметр.
// Для этого конечно необходимо будет создать по 1 объекту каждой фигуры, и установить каждому значения сторон.

public class Main {
    public static void main(String[] args) {
        // Создание объектов
        Triangle triangle = new Triangle(3, 4, 5);
        Rectangle rectangle = new Rectangle(4, 6);
        Square square = new Square(5);
        Circle circle = new Circle(3);
        Oval oval = new Oval(4, 2);

        // Вывод результатов
        System.out.println("Triangle:");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());

        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("\nSquare:");
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.calculatePerimeter());

        System.out.println("\nCircle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println("\nOval:");
        System.out.println("Area: " + oval.calculateArea());
        System.out.println("Perimeter: " + oval.calculatePerimeter());
    }
}