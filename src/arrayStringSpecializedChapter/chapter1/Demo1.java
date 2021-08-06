package arrayStringSpecializedChapter.chapter1;

public class Demo1 {
    public static int pivotIndex(int[] nums) {
        int sum=0,flag=0,end=0;
        for(int i=0;i<nums.length;i++){//sum为数组中所有元素的总和
            sum+=nums[i];
        }
        if(sum-nums[0]==0){//如果除了nums[0]以外的和为0，即0为数组的中心索引
            return 0;
        }
        for(int j=0;j<nums.length;j++){//flag为数组中从索引为0的位置到索引为j的位置的所有元素的和
            flag+=nums[j];
            if(j!=0){
                end=flag-nums[j];//end为数组中从索引为0的位置到索引为j-1的位置的所有元素的和
            }
            if (end==sum-flag){//数组中索引为j的位置前的所有元素总和
                //与数组中索引位置为j的位置后的所有元素总和相等
                return j;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums1={-1,-1,-1,-1,-1,-1};
        int[] nums2={0,0,-1,-1,1,1};
        System.out.println(pivotIndex(nums2));

    }

}
