/**
 * 有一个XxY的网格，一个机器人只能走格点且只能向右或向下走，要从左上角走到右下角。
 * 计算机器人有多少种走法。
 *
 * 给定两个正整数int x,int y，请返回机器人的走法数目。保证x＋y小于等于12。
 */

import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
        // write code here
        int[][] ret = new int[x][y];
        for(int i = 0;i<ret.length;++i) {
            for(int j = 0;j<ret[0].length;++j) {
                if(i == 0 || j == 0) {
                    ret[i][j] = 1;
                }
                else {
                    ret[i][j] = ret[i][j-1] + ret[i-1][j];
                }
            }
        }
        
        return ret[x-1][y-1];
    }
}