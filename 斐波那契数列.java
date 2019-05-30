/**
 * Fibonacci数列是这样定义的：
 * F[0] = 0
 * F[1] = 1
 * for each i ≥ 2: F[i] = F[i-1] + F[i-2]
 * 因此，Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，在Fibonacci数列中的数我们称为Fibonacci数。
 * 给你一个N，你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，
 * 现在给你一个数N求最少需要多少步可以变为Fibonacci数。
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            
            System.out.println(isFib(n));
        }
    }
    
    public static int isFib(int n) {
        //存放斐波那契数
        int[] ret = {0,1,1,2,3,5,8,13,
                     21,34,55,89,144,233,377,610,
                     987,1597,2584,4181,6765,10946,17711,28657,
                     46368,75025,121393,196418,317811,514229,832040,1346269};
        
        int result = 0;
        for(int i = 0;i<ret.length;++i) {
            if(n == ret[i]) {
                return 0;
            }
            else {
                int tmp = Math.abs(n-ret[i]);
                if(i == 0) {
                    result = tmp;
                }
                else {
                    result = tmp<result?tmp:result;
                }
            }
        }
        
        return result;
    }
}