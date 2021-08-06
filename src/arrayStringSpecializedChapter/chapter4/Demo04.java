package arrayStringSpecializedChapter.chapter4;
//最大连续1的个数
//给定一个二进制数组， 计算其中最大连续 1 的个数。
public class Demo04 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0,temp=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                temp++;
                System.out.println(temp);
            }else{
                temp=0;
                System.out.println(temp);
            }
            System.out.println("(max:"+max+"), (temp:"+temp+")");
            max = Math.max(max,temp);
        }
        return  max;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        //System.out.println(findMaxConsecutiveOnes(nums));
        findMaxConsecutiveOnes(nums);
    }
}
