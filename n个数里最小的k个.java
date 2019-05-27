/**
 * 找出n个数里最小的k个
 *
 * 每个测试输入包含空格分隔的n+1个整数，最后一个整数为k值，n不超过100
 *
 * 典型的topK问题，可以用大堆进行删选
 * n不超过100，用暴力求解法
 */

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            String[] s = str.split(" ");
            int k = Integer.parseInt(s[s.length-1]);
            int[] num = new int[s.length-1];
            for(int i = 0;i<num.length;++i) {
                num[i] = Integer.parseInt(s[i]);
            }
            
            Arrays.sort(num);
            for(int i = 0;i<k;++i) {
                if(i == 0) {
                    System.out.print(num[i]);
                }
                else {
                    System.out.print(" "+num[i]);
                }
            }
        }
    }
}