package lesson10;

public class Main {
    public static void main(String[] args) {
        Student dasha = new Student("Dasha Ivanova", 23,20000);
        Student olga = new Student("Dasha Ivanova", 23,20000);

        System.out.println(dasha.equals(olga));
        System.out.println(olga.toString());


    }
}
