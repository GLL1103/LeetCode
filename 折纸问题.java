请把纸条竖着放在桌⼦上，然后从纸条的下边向上⽅对折，压出折痕后再展 开。此时有1条折痕，突起的⽅向指向纸条的背⾯，这条折痕叫做“下”折痕 ；突起的⽅向指向纸条正⾯的折痕叫做“上”折痕。如果每次都从下边向上⽅ 对折，对折N次。请从上到下计算出所有折痕的⽅向。

给定折的次数**n**,请返回从上到下的折痕的数组，若为下折痕则对应元素为"down",若为上折痕则为"up".

测试样例：

```java 
1
返回：["down"]
```



```java 
import java.util.*;

public class FoldPaper {
    public String[] foldPaper(int n) {
        // write code here
        if(n <= 0) {
            return null;
        }
        String[] arr = {"down"};
        String[] ret = getArr(n,arr);
        return ret;
    }
    
public String[] getArr(int n,String[] arr) {
    if(n == 1) {
        return arr;
    }
    
    int size = arr.length*2+1;
    String[] ret = new String[size];
    int mid = (ret.length>>1);
    for(int i = 0;i<mid;++i) {
        ret[i] = arr[i];
        if("down".equals(ret[i])) {
            ret[size-i-1] = "up";
        }
        else {
            ret[size-i-1] = "down";
        }
    }
    ret[mid] = "down";
    return getArr(n-1,ret);
}
}
```

