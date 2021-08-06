package arrayStringSpecializedChapter.chapter1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

public class Demo3 {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return intervals;

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int count = 0;
        int[][] res = new int[intervals.length][2];
        res[0][0] = intervals[0][0];
        res[0][1] = intervals[0][1];
        for (int idx = 1; idx < intervals.length; idx++) {
            if (res[count][1] < intervals[idx][0]) {
                count++;
                res[count][0] = intervals[idx][0];
                res[count][1] = intervals[idx][1];
            }
            if (res[count][1] >= intervals[idx][0] && res[count][1]<intervals[idx][1]){
                res[count][1] = intervals[idx][1];
            }

        }

        return Arrays.copyOfRange(res, 0, count + 1);

    }

}
