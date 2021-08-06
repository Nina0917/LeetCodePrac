package chapter01;
//旋转数据
public class demo03 {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        //如果k超出范围就从头开始数，所以取length的余数
        k %= length;
        reverse(nums, 0, length - 1);//先反转全部的元素
        reverse(nums, 0, k - 1);//在反转前k个元素
        reverse(nums, k, length - 1);//接着反转剩余的
    }

    //把数组中从[start，end]之间的元素两两交换,也就是反转
    //双指针反转元素
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    //第二种方法：可以使用一个临时数组，先把原数组的值存放到一个临时数组中，
    // 然后再把临时数组的值重新赋给原数组，重新赋值的时候要保证每个元素都要往后移k位，
    // 如果超过数组的长度就从头开始，所以这里可以使用(i + k) % length来计算重新赋值的元素下标

    public void rotate2(int nums[], int k) {
        int length = nums.length;
        int temp[] = new int[length];
        //把原数组值放到一个临时数组中，
        for (int i = 0; i < length; i++) {
            temp[i] = nums[i];
        }
        //然后在把临时数组的值重新放到原数组，并且往右移动k位
        for (int i = 0; i < length; i++) {
            nums[(i + k) % length] = temp[i];
        }
    }
}
