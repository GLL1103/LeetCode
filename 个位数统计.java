/**
 * 给定一个k位整数N = dk-1*10k-1 + … + d1*101 + d0 (0<=di<=9, i=0,…,k-1, dk-1>0)，
 * 编写程序统计每种不同的个位数字出现的次数。
 *
 * 例如：给定N = 100311，则有2个0，3个1，和1个3。
 *
 * 输入样例：
 * 100311
 * 输出样例：
 * 0:2
 * 1:3
 * 3:1
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String number = scanner.nextLine();
            int[] ret = new int[10];
            int len = number.length();
            
            while(len > 0) {
                String s = number.substring(len-1,len);
                int k = Integer.parseInt(s);
                ret[k] += 1;
                --len;
            }
            
            for(int i = 0;i<ret.length;++i) {
                if(0 != ret[i]) {
                    System.out.println(i+":"+ret[i]);
                }
            }
        }
    }
}