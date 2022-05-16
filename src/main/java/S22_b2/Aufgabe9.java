package S22_b2;

public class Aufgabe9 {
    public static void main(String[] args) {
        double[] u = myVectorRandom();
        double[] v = myVectorRandom();
        System.out.println("vector u is: ");
        myVectorPrint(u);
        System.out.println("vector v is: ");
        myVectorPrint(v);

        System.out.println("the scalarProduct is: " + myScalarProduct(u, v));

        double [] w = myCrossProduct(u,v);
        System.out.println("the crossProduct(w) is: ");
        myVectorPrint(w);

        System.out.println("the crossProduct between u and w is: ");
        myVectorPrint(myCrossProduct(u, w));
        System.out.println("the crossProduct between v and w is: ");
        myVectorPrint(myCrossProduct(v,w));
    }

    private static double[] myVectorRandom() {
        double[] myVector = {0, 0, 0};
        for (int i = 0; i < 3; i++) {
            myVector[i] = Math.random();
        }
        return myVector;
    }

    private static void myVectorPrint(double[] vector) {
        for (int i = 0; i < 3; i++) {
            System.out.println(vector[i]);
        }
    }

    private static double myScalarProduct(double[] vector1, double[] vector2) {
        double scalarProduct = 0;
        for (int i = 0; i < 3; i++) {
            scalarProduct += vector1[i] * vector2[i];
        }
        return scalarProduct;
    }

    private static double[] myCrossProduct(double[] vector1, double[] vector2) {
        double[] crossProduct = {0, 0, 0};
        crossProduct[0] = vector1[1] * vector2[2] - vector1[2] * vector2[1];
        crossProduct[1] = vector1[2] * vector2[0] - vector1[0] * vector2[2];
        crossProduct[2] = vector1[0] * vector2[1] - vector1[1] * vector2[0];
        return crossProduct;
    }
}
