package chapter07;

import java.util.Random;

class Solution {
    private int[] nums;
    private Random random;

    public Solution(int[] nums) {
        this.nums=nums;
        random=new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if (nums==null)
            return null;
        int[] a = nums.clone();
        for (int j=1;j<a.length;j++){
            int i = random.nextInt(j + 1);
            swap(a,i,j);
        }
        return a;
        
    }

    public void swap(int[] a,int i, int j) {
        if (i != j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
}
public class Demo01 {
}
