package chapter05;

public class Demo02 {
    //这个函数定义在了题解的API里
    public boolean isBadVersion(int version){
        return true;
    }
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (!isBadVersion(mid))
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }


}
