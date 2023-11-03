package lesson1; // package - указание, в какой папке находится текущий файл

// public - общедоступный (открытый) т.е. то, открытое для всех, общее
// class - кусочек java-кода с одной смысловой нагрузкой

public class MyFirstProject {
    // точка начала программы, код внутри будет отработан
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        int perimetr = a + b + c;
        System.out.println(perimetr);

    }


}
