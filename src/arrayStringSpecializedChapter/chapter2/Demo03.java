package arrayStringSpecializedChapter.chapter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo03 {
    public int[] findDiagonalOrder(int[][] mat) {
        //对角线迭代+翻转
        //m代表竖行，n代表橫行
        int m = mat.length, n = mat[0].length;
        //res代表最后输出的数组
        int[] res = new int[m*n];
        //resIndex是记录res的下标
        int resIndex = 0;
        //记录每条对角线上的数据
        List<Integer> inner = new ArrayList<>();
        // 沿着第一行从左到右，到行尾处再沿着最后一列从上到下，每个元素作为遍历每个对角线的起点
        //m+n-1:表示这个矩阵有几条对角线
        for(int i = 0; i < m + n -1; i++){
            inner.clear();

            int startR = i < n ? 0 : i - n + 1;
            int startC = i < n ? i : n - 1;
            // 遍历对角线
            while(startR < m && startC > -1){
                inner.add(mat[startR][startC]);

                startR++;
                startC--;
            }
            // 如果对角线是第偶数个，则需要翻转对角线遍历结果
            if((i % 2) == 0){
                Collections.reverse(inner);
            }
            // 将该对角线遍历结果添加到res
            for(int j = 0; j < inner.size(); j++){
                res[resIndex] = inner.get(j);
                resIndex++;
            }
        }
        return res;

    }
}
