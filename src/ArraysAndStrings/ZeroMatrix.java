package ArraysAndStrings;

public class ZeroMatrix {
    public void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]==0){
                    row[i]=true;
                    column[j]=true;
                }

            }
        }

        for (int i=0;i<row.length;i++) {
            if (row[i]==true){
                // set every number on row i to zero
                for (int j=0;j<matrix[0].length;j++) {
                    matrix[i][j]=0;
                }
            }
        }

        for (int i=0;i<column.length;i++) {
            if (column[i]==true){
                for (int j=0;j<matrix.length;j++){
                    matrix[j][i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
