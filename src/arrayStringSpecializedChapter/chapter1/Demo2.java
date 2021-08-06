package arrayStringSpecializedChapter.chapter1;

public class Demo2 {
    public static int searchInsert(int[] nums, int target) {
        int a=nums.length;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
            }else if(target<nums[i]){
                return i;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        System.out.println(searchInsert(nums,5));
    }
}
