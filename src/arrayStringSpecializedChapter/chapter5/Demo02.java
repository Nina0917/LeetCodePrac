package arrayStringSpecializedChapter.chapter5;
//寻找旋转排序数组中的最小值
public class Demo02 {
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            System.out.println("low: "+low);
            System.out.println("high: "+high);
            System.out.println("pivot: "+pivot);
            if (nums[pivot] < nums[high]) {
                high = pivot;
            } else {
                low = pivot + 1;
                //low = pivot;
            }
        }
        return nums[low];

    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        findMin(nums);
    }

}
