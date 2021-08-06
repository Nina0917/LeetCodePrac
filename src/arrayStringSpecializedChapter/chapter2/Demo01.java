package arrayStringSpecializedChapter.chapter2;

public class Demo01 {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        if(len==1) return;

        int maxIdx = len-1;
        int[][] newMatrix = new int[len][len];
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                newMatrix[i][j]=matrix[maxIdx-j][i];
            }
        }
        for(int y=0; y<len; y++){
            for(int x=0; x<len; x++){
                matrix[x][y]=newMatrix[x][y];
            }
        }
    }
}
