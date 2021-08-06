package chapter01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDemo {
    public int[] intersect(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length;
        int length2 = nums2.length;

        //int[] commonNums=new int[length1>length2?length1:length2];
        List<Integer> commonNums=new ArrayList<>();
        int m=0,n=0;
        while (m<length1 && n<length2){
            if (nums1[m]==nums2[n]){
                commonNums.add(nums1[m]);
                m++;
                n++;
            }else {
                if (nums1[m]<nums2[n]){
                    m++;
                }else {
                    n++;
                }
            }
        }
        int[] intersect = new int[commonNums.size()];
        for (int i = 0; i < intersect.length; i++) {
            intersect[i]=commonNums.get(i);
        }
        return intersect;
    }

    public int[] plusOne(int[] digits){
        for (int i=digits.length-1;i>=0;i--){
            if (digits[i]!=9){
                digits[i]++;
                return digits;
            } else {
                digits[i]=0;
            }
        }
        int[] temp=new int[digits.length+1];
        temp[0]=1;
        return temp;
    }

    public void moveZeroes(int[] nums){
        if (nums==null || nums.length==0)
            return;
        int index=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i]=0;
        }

    }

    public boolean isValidSudoku(char[][] board) {
        int length = board.length;
        int[][] lines = new int[length][length];
        int[][] columns = new int[length][length];
        int[][] cell=new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (board[i][j]=='.'){
                    continue;
                }
                int num=board[i][j]-'0'-1;
                int k=i/3*3+j/3;

                if (lines[i][num]!=0 || columns[j][num]!=0||cell[k][num]!=0){
                    return false;
                }
                lines[i][num]=columns[j][num]=cell[k][num]=1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(0+"");
    }
}
