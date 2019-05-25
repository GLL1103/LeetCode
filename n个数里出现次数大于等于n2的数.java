/**
 * 输入n个整数，输出出现次数大于等于数组长度一半的数
 */

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            String[] s = str.split(" ");
            int len = s.length;
            int[] number = new int[len];
            for(int i = 0;i<len;++i) {
                number[i] = Integer.parseInt(s[i]);
            }
            
            Arrays.sort(number);
            int num = number[len/2];
            if(len%2 != 0){
                System.out.println(num);
            }
            else {
                int count = 0;
                for(int i = 0;i<len;++i) {
                    if(number[i] == num) {
                        count++;
                    }
                }
                if(count >= (len/2)) {
                    System.out.println(num);
                }
                else {
                    System.out.println(number[len/2-1]);
                }
            }


        }
    }
}