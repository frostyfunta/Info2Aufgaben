package Blatt2;

public class Aufgabe8 {

    public static void main(String[] args) {
        double[][] matrix = myMatrixRandom(5, 4);
        System.out.println("generated matrix");
        myMatrixPrint(matrix);
        myMatrixSwapRows(matrix, 2, 4);
        System.out.println("\n\nmatrix after swap ");
        myMatrixPrint(matrix);
        System.out.println("\n\ntransposed matrix ");
        myMatrixPrint(myMatrixTranspose(matrix));
    }

    private static double[][] myMatrixRandom(int x, int y) {
        int i, j;
        double[][] matrix = new double[x][y];
        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                matrix[i][j] = Math.random() * Double.MAX_VALUE;  // add random double number to each matrix-entry
            }
        }
        return matrix;
    }



    private static void myMatrixPrint(double[][] matrix) {
        int i, j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " "); // print each column of one line with a space in between
            }
            System.out.print("\n"); // add line break when end of line is reached
        }
    }

    private static void myMatrixSwapRows(double[][] matrix, int line1, int line2) {
        int i;
        int linea = line1 - 1;
        int lineb = line2 - 1;
        double[] buffer = new double[matrix[0].length];
        for (i = 0; i < matrix[0].length; i++) {
            buffer[i] = matrix[linea][i];
            matrix[linea][i] = matrix[lineb][i];
            matrix[lineb][i] = buffer[i]; // line1 -> buffer; line2 -> line1 ; buffer -> line2
        }
    }

    private static double[][] myMatrixTranspose(double[][] matrix){
        int i, j;
        double[][] newMatrix = new double[matrix[0].length][matrix.length];
        for(i = 0; i < matrix.length; i++){     //transpose: newMatrix[j][i] = oldMatrix[i][j]
            for(j = 0; j < matrix[0].length; j++) newMatrix[j][i] = matrix[i][j];
        }
        return newMatrix;
    }
}
