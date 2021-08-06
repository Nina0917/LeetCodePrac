package chapter01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class demo06 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int a = 0;
        int b=0;
        ArrayList<Integer> same = new ArrayList<>();

        while (a<nums1.length && b<nums2.length){
            if (nums1[a]<nums2[b]){
                a++;

            }else if (nums1[a]>nums2[b]){
                b++;
            }else {
                same.add(nums1[a]);
                a++;
                b++;
            }
        }
        int[] arr = new int[same.size()];
        int i =0;
        for (int num:same){
            arr[i] = num;
            i++;
        }

        return arr;
    }
}
