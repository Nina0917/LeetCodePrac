package chapter05;

import java.util.Arrays;

public class Demo01 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n==0)
            return;
        int j=0;
        for (int i=m;i<m+n;i++){
            nums1[i]=nums2[j];
            j++;
        }
        Arrays.sort(nums1);

    }
}
