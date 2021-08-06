package chapter01;

public class demo07 {
    public int[] plusOne(int[] digits) {
        int length=digits.length;
        for (int i = length-1;i>=0;i--){
            if (digits[i] != 9){
                digits[i]++;
                return digits;
            } else {
                digits[i]=0;
            }
        }

        //除非数组中的元素都是9，否则不会走到这一步，
       int[] temp = new int[digits.length+1];
        //剩下位数默认都是0
        temp[0]=1;
        return temp;



    }
}
