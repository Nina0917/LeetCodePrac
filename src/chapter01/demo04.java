package chapter01;

import java.util.HashSet;
import java.util.Set;

public class demo04 {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> integerSet = new HashSet<>();
        for (int num:nums){
            boolean add = integerSet.add(num);
            if (!add){
                return true;
            }
        }

        return false;

    }



}
