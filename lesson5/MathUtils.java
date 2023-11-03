package lesson5;

public class MathUtils {

    /** 1 - Модификатор доступа - слово, определяющее облать видимости объекта
     * public - (метод) доступен внутри всего проекта
     * private -  доступ только в этом классе
     * _______ - (пакетный) - если нет ничего- доступен только внутри текущей папки
     * protected - доступен только внутри текущей папки и наследникам текущего класса (могут быть дочерние классы)
     *
     * Где именно ставить модификатор доступа:
     *  1) перед классом
     *  2) перед методом (там, где создаете метод)
     *  3)
     *
     * 2 - Static (пишем или не пишем)
     * 3 - указываем возвращаемый тип (переменной) (или слово void, если оно отсутствует)
     * 4 - название метода (максимально корректно)
     * 5 - входящие параметры ( то, без чего невозможно выполнить метод),
     * всегда записываются в круглых скобках () через запятую, указыыая тип и название переменной
     * 6 - тело выполнения данного метода {}
     */

    // Задача: создать метод, который посчитает площать треугольника по трем сторонам и выведет ее на консоль

    public static void CountSquareTriangle(int a, int b,int c){
        double p = (a + b + c)/2.0;
        System.out.println(Math.sqrt(p*(p-a)*(p-b)*(p-c)));

    }

    // Метод возвращает на консоль периметр треугольника

    public static int CountPerimeterOfTriangle(int a, int b , int c ){
        return a + b + c;

    }

    public static int CountSquareOfSquare(int a){
        return a * a;

    }

    // Метод возвращает на консоль периметр треугольника

    public static int CountPerimeterOfSquare(int a){
        return a + a + a + a;

    }
    public static int CountPerimetrOfTrapezoid(int a, int b, int c, int d){
        return a+b+c+d;
    }
 public static int CountSquareOfTrapez(int a,int b, int h){
        return (a + b) * h / 2;
 }

 public static double CountSquareOfRound (double radius){
     return Math.PI * radius * radius;
 }

    public static double CountPerimetrOfRound (double radius){
        return 2 * Math.PI * radius;
    }
    public static double CountSquareOfEllipse (double majorAxis, double minorAxis){
        return  Math.PI * majorAxis * minorAxis ;
    }
    public static double CountPerimetrOfEllipse (double majorAxis, double minorAxis){
        return 2 * Math.PI * Math.sqrt((majorAxis * majorAxis + minorAxis * minorAxis) / 2);
    }
}
