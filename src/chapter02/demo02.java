package chapter02;

import java.util.List;

public class demo02 {
    public int reverse(int x) {
        int s = 0;
        while (x != 0) {
            int reminder = x % 10;
            int testLimit = s * 10 + reminder;
            if ((testLimit - reminder) / 10 != s)
                return 0;
            s = testLimit;
            x /= 10;
        }
        return s;
    }
}
