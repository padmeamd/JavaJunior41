package lesson13;


// Доделать методы

public class Matrix implements IMatrix{

    private double[][] nums;

    public Matrix(){
        nums = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    public Matrix(double[][] nums) {
        this.nums = nums;
    }

    public Matrix(int row, int col){
        nums = new double[row][col];
    }


    @Override
    public int getRows() {
        return nums.length;
    }

    @Override
    public int getColumns() {
        return nums[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if(rowIndex < 0 || rowIndex > getRows()){
            System.out.println("rowIndex не подходит!");
            return -1;
        }
        if (colIndex < 0 || colIndex > getColumns()){
            System.out.println("rowIndex не подходит!");
            return -1;
        }

        return nums[rowIndex][colIndex];// если все подходит
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if(rowIndex < 0 || rowIndex > getRows()-1){
            System.out.println("rowIndex не подходит!");
            return;
        }
        if (colIndex < 0 || colIndex > getColumns()-1){
            System.out.println("rowIndex не подходит!");
            return;
        }
        nums[rowIndex][colIndex] = value;

    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        // а ---- this
        // b --- otherMatrix

        if(this.getRows() != otherMatrix.getRows()){
            System.out.println("Не совпадает количество строк -_-");
            return null;
        }
        if(this.getColumns() != otherMatrix.getColumns()){
            System.out.println("Не совпадает количество колонок -_-");
            return null;
        }

        Matrix result = new Matrix(getRows(),getColumns());

        for(int i = 0; i < getRows(); i++){
            for(int j = 0; j < getColumns();j++){
                result.setValueAt(i,j,this.getValueAt(i,j) + otherMatrix.getValueAt(i,j));
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if(this.getRows() != otherMatrix.getRows()){
            System.out.println("Не совпадает количество строк -_-");
            return null;
        }
        if(this.getColumns() != otherMatrix.getColumns()){
            System.out.println("Не совпадает количество колонок -_-");
            return null;
        }

        Matrix result = new Matrix(getRows(),getColumns());

        for(int i = 0; i < getRows(); i++){
            for(int j = 0; j < getColumns();j++){
                result.setValueAt(i,j,this.getValueAt(i,j) / otherMatrix.getValueAt(i,j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if(this.getRows() != otherMatrix.getRows()){
            System.out.println("Не совпадает количество строк -_-");
            return null;
        }
        if(this.getColumns() != otherMatrix.getColumns()){
            System.out.println("Не совпадает количество колонок -_-");
            return null;
        }

        Matrix result = new Matrix(getRows(),getColumns());

        for(int i = 0; i < getRows(); i++){
            for(int j = 0; j < getColumns();j++){
                result.setValueAt(i,j,this.getValueAt(i,j) * otherMatrix.getValueAt(i,j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix result = new Matrix(getRows(),getColumns());

        for(int i = 0; i < getRows(); i++){
            for(int j = 0; j < getColumns();j++){
                result.setValueAt(i,j,this.getValueAt(i,j) * value);
            }
        }
        return result;
    }

    @Override
    public IMatrix transpose() {
        Matrix result = new Matrix(getColumns(), getRows());
        for (int i = 0; i < nums.length; i++) {
            for (int b = 0; b < nums[0].length; b++) {
                result.setValueAt(b, i, this.getValueAt(i, b));
            }
        }
        return result;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                this.setValueAt(i, j, value);
            }
        }
    }

    @Override
    public double determinant() {
        if(!this.isSquareMatrix()){
            return 0;
        }
        if(this.getRows() == 1){
            return this.getValueAt(0, 0);
        }
        if(this.getRows() == 2){
            return (this.getValueAt(0, 0) * this.getValueAt(1, 1) - this.getValueAt(0, 1) * this.getValueAt(1, 0));
        }

        double sum = 0;
        for (int i = 0; i < this.getColumns(); i++) {
            sum += changeSign(i) * this.getValueAt(0, i) * determinant(createSubMatrix(this, 0, i));
        }
        return sum;
    }
    public double determinant(Matrix matrix){
        if(!matrix.isSquareMatrix()){
            return 0;
        }
        if(matrix.getRows() == 1){
            return this.getValueAt(0, 0);
        }
        if(matrix.getRows() == 2){
            return (this.getValueAt(0, 0) * matrix.getValueAt(1, 1) - matrix.getValueAt(0, 1) * matrix.getValueAt(1, 0));
        }

        double sum = 0;
        for (int i = 0; i < this.getColumns(); i++) {
            sum += changeSign(i) * this.getValueAt(0, i) * determinant(createSubMatrix(matrix, 0, i));
        }
        return sum;
    }
    public int changeSign(int n){
        if(n % 2 == 0){
            return 1;
        }
        else{
            return -1;
        }
    }
    public Matrix createSubMatrix(Matrix matrix, int excluding_row, int excluding_col) {
        Matrix mat = new Matrix(matrix.getRows()-1, matrix.getColumns()-1);
        int r = -1;
        for (int i=0;i<matrix.getRows();i++) {
            if (i==excluding_row)
                continue;
            r++;
            int c = -1;
            for (int j=0;j<matrix.getColumns();j++) {
                if (j==excluding_col)
                    continue;
                mat.setValueAt(r, ++c, matrix.getValueAt(i, j));
            }
        }
        return mat;
    }

    @Override
    public boolean isNullMatrix() {
       // for (int i = 0; i < ; i++) {

       // }
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return this.getColumns() == 1 && this.getRows() == 1;
    }

    @Override
    public boolean isSquareMatrix() {
        return getColumns() == getRows();
    }

    @Override
    public void printToConsole() {
        // this - та матрица, которую нужно напечатать

        for(int i = 0; i < this.getRows(); i++){
            for(int j = 0; j < this.getColumns(); j++){
                System.out.print(this.getValueAt(i,j) + " ");
            }
            System.out.println();
        }
    }
}