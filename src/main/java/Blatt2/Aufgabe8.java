package Blatt2;

public class Aufgabe8 {

    public static void main(String[] args) {

    }

    private static double[] myMatrixRandom(int x, int y) {
        int i, j;
        double[] matrix = new double[x][y];
        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                matrix[i][j] = Math.random() * Double.MAX_VALUE;
            }
        }
    }
}
