给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。

注意:

给定的整型数组长度范围是[3,104]，数组中所有的元素范围是[-1000, 1000]。
输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。

```java
import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        if(null == nums || nums.length <3) {
            return 0;
        }
        
        int len = nums.length;
        Arrays.sort(nums);
        int max = nums[len-1];
        if(max < 0) {
            return max*nums[len-2]*nums[len-3];
        } else {
            int left = nums[0]*nums[1];
            int right = nums[len-2]*nums[len-3];
            if(left > right) {
                return left*max;
            }else {
                return right*max;
            }
        }
    }
}
```

