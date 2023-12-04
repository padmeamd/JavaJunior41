package lesson13;

public class Main {
    public static void main(String[] args) {

        double[][] numsForA = {{2,5},
                {9,3},};
        Matrix a = new Matrix(numsForA);

//        System.out.println(a.getRows());
//        System.out.println(a.getColumns());
//        System.out.println(a.getValueAt(0,0));
//        a.setValueAt(0,0,9);
//        System.out.println(a.getValueAt(0,0));
        System.out.println(a.determinant());

        // матрица №2

//        double[][] numsForB = {{6,5,9,5},
//                {0,3,3,4},
//                {2,1,3,8}};
//        Matrix b = new Matrix(numsForB);
//        // неявный параметр - a ( внутри метода доступно по this)
//        // явный параметр - b ( внутри метода доступен otherMatrix , B мы видим, что явно передается)
//        IMatrix resultAdd = a.add(b);
//        System.out.println();
//        resultAdd.printToConsole();
//        System.out.println(" ------------------------------");
//        a.printToConsole();




    }
}