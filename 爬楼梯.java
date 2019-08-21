假设你正在爬楼梯。需要 *n* 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

**注意：**给定 *n* 是一个正整数。

```java
class Solution {
    public int climbStairs(int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        
        int first = 1;
        int second = 2;
        int third = 0;
        
        while((n--)>2) {
            third = first+second;
            first = second;
            second = third;
        }
        
        return third;
    }
}
```

