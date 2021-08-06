package chapter01;

public class demo05 {
    public int singleNumber(int[] nums) {
        int reduce = 0;
        for (int num:nums){
            reduce ^= num;
        }
        return reduce;

    }
}
