/**
 * 输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。
 * 例如：输入"They are students."和"aeiou",则删除后的第一个字符串变成"Thy r stdnts."
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();

            char[] ret = str2.toCharArray();
            for(char c : ret) {
                String s = String.valueOf(c);
                str1 = str1.replace(s,"");
            }
            System.out.println(str1);
        }
    }
}