package lesson3;

public class Main4 {
    public static void main(String[] args) {
        // Есть массив чисел, вывести на консоль соседа справа, если
        // ячейка кратна трем

        int[] num = {45, 45, 6, 2, 4, 6, 4, 2, 5, 7, 8};

        for (int i = 0; i < num.length; i++) {
            if (i != num.length - 1) { // когда есть сосед справа
                if(num[i] % 3 == 0) { // проверка на кратность 3м
                    System.out.println(num[i +1]);
                }
            }


        }
    }
}
