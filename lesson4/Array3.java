package lesson4;

public class Array3 {
    private static char EMPTY_CELL = ' ';
    private static char o = 'O';
    public static void main(String[] args) {
        final int size = 10;
        final var matrix = getNewMatrix(size, size);

        solution3(matrix);

        printMatrix(matrix);


    }

    private static void solution3(char[][] matrix) {

        final int len = matrix.length - 1;
        final int mid = matrix.length / 2 + matrix.length % 2;
        int pos = 1;

        for (int i = 0; i < mid; i++) {
            int start = mid - pos++;
            for (int j = start; j < mid; j++) {
                matrix[i][j] = o;
                matrix[i][len - j] = o;
                matrix[len - i][j] = o;
                matrix[len - i][len - j] = o;
            }
        }
    }

    private static void printMatrix(char[][] matrix) {
        for (var row : matrix) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    private static char[][] getNewMatrix(int width, int height) {

        final var mat = new char[width][height];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = EMPTY_CELL;
            }

        }

        return mat;
    }

}