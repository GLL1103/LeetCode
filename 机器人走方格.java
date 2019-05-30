

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