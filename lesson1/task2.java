package lesson1;

public class task2 {
    public static void main(String[] args) {
        int lengthsOfTable = 300;
        int widthsOfTable =  500;
        int widthsOfRoom = 2500;
        int lengthsOfRoom = 3400;

        int squareOfTable = widthsOfTable * lengthsOfTable;
        int squareOfRoom = widthsOfRoom * lengthsOfRoom;

        int quantityOfTablesInTheRoom = squareOfRoom / squareOfTable;
        System.out.println(quantityOfTablesInTheRoom);
    }
}
