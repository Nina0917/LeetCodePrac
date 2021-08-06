package chapter08;

public class Demo02 {
    public static void main(String[] args) {
        System.out.println(countPrimes(4));
    }
    public static int countPrimes(int n) {
        boolean[] arr = new boolean[n];
        int cnt = 0;
        //i代表的是判断的数字
        for(int i = 2; i < n; i++) {
            if(arr[i]) continue;
            cnt++;
            for(int j = i; j < n; j+=i) {
                arr[j] = true;
            }
        }
        return cnt;

    }

}
