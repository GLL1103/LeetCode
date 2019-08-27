对于一个矩阵，请设计一个算法，将元素按“之”字形打印。具体见样例。

给定一个整数矩阵**mat**，以及他的维数**n**x**m**，请返回一个数组，其中元素依次为打印的数字。

测试样例：

```java
[[1,2,3],[4,5,6],[7,8,9],[10,11,12]],4,3
返回：[1,2,3,6,5,4,7,8,9,12,11,10]
```

```java
import java.util.*;

public class Printer {
    public int[] printMatrix(int[][] mat, int n, int m) {
        // write code here
        if(null == mat || n <=0 || m<=0) {
            return null;
        }
        int[] ret = new int[n*m];
        int index = 0;
        for(int i = 0;i<n;++i) {
            for(int j = 0;j<m;++j) {
                //从左往右
                if(i%2 == 0) {
                    ret[index++] = mat[i][j];
                }
                //从右往左
                else {
                    ret[index++] = mat[i][m-j-1];
                }
            }
        }
        return ret;
    }
}
```

