package arrayStringSpecializedChapter.chapter2;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo02 {
    public static void setZeroes(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0){
                    list.add(i);
                    list.add(j);
                }
            }
        }


        for (int i = 0; i < list.size(); i+=2) {
            int column = list.get(i);
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[column][j]=0;
            }
        }


        for (int i = 1 ; i < list.size(); i+=2) {
            int line = list.get(i);
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[j][line]=0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
    }
}
