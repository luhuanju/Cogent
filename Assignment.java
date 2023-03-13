package cogent;

import java.util.Arrays;

public class Assignment {
    public static void main(String[] args) {


        //1. WAP to Print a 2D Array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //2. WAP to Add Two Matrices
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] resultMatrix = new int[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(resultMatrix));

        //3. WAP to Sort the 2D Array Across Columns
        int[][] matrix3 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        for (int i = 0; i < matrix3.length; i++) {
            Arrays.sort(matrix3[i]);
        }
        System.out.println(Arrays.deepToString(matrix3));

        //4. WAP to Check Whether Two Matrices Are Equal or Not
        int[][] matrix4 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix5 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean isEqual = Arrays.deepEquals(matrix4, matrix5);
        System.out.println(isEqual);

        //5. WAP to Find the Transpose
        int[][] matrix6 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] transposeMatrix = new int[3][3];
        for (int i = 0; i < matrix6.length; i++) {
            for (int j = 0; j < matrix6[i].length; j++) {
                transposeMatrix[j][i] = matrix6[i][j];
            }
        }
        System.out.println(Arrays.deepToString(transposeMatrix));


    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Method to find the normal and trace of a square matrix
    public static void normalAndTrace(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j] * matrix[i][j];
            }
        }
        double normal = Math.sqrt(sum);
        int trace = 0;
        for (int i = 0; i < matrix.length; i++) {
            trace += matrix[i][i];
        }
        System.out.println("Normal: " + normal);
        System.out.println("Trace: " + trace);
    }

    // Method to print the boundary elements of a matrix
    public static void printBoundaryElements(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 || i == matrix.length - 1 || j == 0 || j == matrix[i].length - 1) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Method to rotate the elements of a matrix clockwise by 90 degrees
    public static void rotateMatrixElements(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[i][j] = matrix[n - j - 1][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to compute the sum of diagonals of a square matrix
    public static int sumOfDiagonals(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            sum += matrix[i][matrix.length - i - 1];
        }
        if (matrix.length % 2 == 1) {
            int center = matrix.length / 2;
            sum -= matrix[center][center];
        }
        return sum;
    }

    // Method to interchange the first and last elements of each row in a matrix
    public static void interchangeAcrossRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][matrix[i].length - 1];
            matrix[i][matrix[i].length - 1] = temp;
        }
    }
}
