public class matrix extends funcMaster{
    public matrix(String selection) {
        super.selection = selection;
    }

    @Override
    public String getSelection() {
        return this.selection;
    }

    public String switchMatrix1(int[][] matrix, int rows, int columns) {
        int[][] newMatrix = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                newMatrix[i][columns - j - 1] = matrix[i][j];
                System.out.println(matrix[i][j]);
            }
        }
        String output = newMatrix.toString();
        return output;
    }

    public static int[][] switchMatrix(int[][] matrix, int rows, int columns) {
        int[][] output = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                output[rows - i - 1][columns - j - 1] = matrix[i][j];
            }
        }
        return output;
    }

    public static void printMatrix(int matrix[][]) {
        for(int i = 0; i <matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    @Override
    public void run() {
        int[][] matrix1 = new int[][]{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, {-1, 0, -1} };

        int[][] matrix2 = new int[][]{ { 0, 1 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 } };

        System.out.println("Matrix 1: ");
        printMatrix(matrix1);

        System.out.println();

        System.out.println("Matrix 1 Flipped: ");
        printMatrix(switchMatrix(matrix1, matrix1.length, matrix1[0].length));
        System.out.println();

        System.out.println("Matrix 2: ");
        printMatrix(matrix2);
    }
}
