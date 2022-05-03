package ArraysAndStrings;

import java.util.Arrays;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] newMatrix = new int[n][n];

        for (int x=0;x<n;x++) {
            for (int y=0;y<n;y++) {
                int num = matrix[x][y];
                newMatrix[y][n-1-x] = num;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int n1 = 0; n1 < n; n1++) {
                matrix[i][n1] = newMatrix[i][n1];
            }
        }

    }

    public static void main(String[] args) {

    }
}
