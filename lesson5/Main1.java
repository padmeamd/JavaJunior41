package lesson5;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        /**
         * Программа будет просить пользователя ввести с консоли фигуру: овал, трапеция, круг, квадрат
         * Потом мы просим пользователя ввести нужные данные о фигуре ( сторона, высота и т д0
         * И на основании введенных данных печатаем на консоль площадь и периметр
         */
        Scanner scanner = new Scanner(System.in);


        System.out.println("Выберите фигуру: ");
        System.out.println("1 - треугольник");
        System.out.println("2 - квадрат");
        System.out.println("3 - трапеция");
        System.out.println("4 - круг");
        System.out.println("5 - овал");


        String inputFigure = scanner.next(); // число или слово

        if (inputFigure.equals("1") || inputFigure.equalsIgnoreCase("треугольник")) { // если выбрали треугольник
            System.out.println("Введите сторону a: ");
            int a = scanner.nextInt();

            System.out.println("Введите сторону b: ");
            int b = scanner.nextInt();

            System.out.println("Введите сторону c: ");
            int c = scanner.nextInt();


            System.out.println("Периметр треугольника: " + MathUtils.CountPerimeterOfTriangle(a, b, c));
            System.out.println("Площадь треугольника: ");
            MathUtils.CountSquareTriangle(a, b, c);

        }
        if (inputFigure.equals("2") || inputFigure.equalsIgnoreCase("квадрат")) { // если выбрали квадрат
            System.out.println("Введите сторону квадрата: ");
            int a = scanner.nextInt();
            System.out.println("Периметр квадрата:  " + MathUtils.CountPerimeterOfSquare(a));
            System.out.println("Площадь квадрата:  " + MathUtils.CountSquareOfSquare(a));

        }
        if (inputFigure.equals("3") || inputFigure.equalsIgnoreCase("трапеция")) { // если выбрали трапецию
            System.out.println("Введите сторону основания №1: ");
            int a = scanner.nextInt();
            System.out.println("Введите сторону основания №2: ");
            int b = scanner.nextInt();
            System.out.println("Введите сторону №3: ");
            int c = scanner.nextInt();
            System.out.println("Введите сторону №4: ");
            int d = scanner.nextInt();
            System.out.println("Введите высоту: ");
            int h = scanner.nextInt();

            System.out.println("Периметр трапеции:  " + MathUtils.CountPerimetrOfTrapezoid(a, b, c, d));
            System.out.println("Площадь трапеции:  " + MathUtils.CountSquareOfTrapez(a, b, h));
        }
        if (inputFigure.equals("4") || inputFigure.equalsIgnoreCase("круг")) { // если выбрали круг
            System.out.println("Введите радиус круга: ");
            int radius = scanner.nextInt();
            System.out.println("Площадь круга:  " + MathUtils.CountSquareOfRound(radius));
            System.out.println("Периметр круга:  " + MathUtils.CountPerimetrOfRound(radius));
        }

        if (inputFigure.equals("5") || inputFigure.equalsIgnoreCase("овал")) { // если выбрали круг
            System.out.println("Введите большую полуось овала: ");
            int majorAxis = scanner.nextInt();
            System.out.println("Введите малую полуось овала: ");
            int minorAxis = scanner.nextInt();

            System.out.println("Площадь овала:  " + MathUtils.CountSquareOfEllipse(majorAxis, minorAxis));
            System.out.println("Периметр овала:  " + MathUtils.CountPerimetrOfEllipse(majorAxis, minorAxis));
        }
    }
}