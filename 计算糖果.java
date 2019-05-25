/**
 * 题目描述
 * A,B,C三个人是好朋友,每个人手里都有一些糖果,我们不知道他们每个人手上具体有多少个糖果,但是我们知道以下的信息：
 * A - B, B - C, A + B, B + C. 这四个数值.每个字母代表每个人所拥有的糖果数.
 * 现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。这里保证最多只有一组整数A,B,C满足所有题设条件。
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            float c1 = scanner.nextInt();
            float c2 = scanner.nextInt();
            float c3 = scanner.nextInt();
            float c4 = scanner.nextInt();
            
            float a = (c1+c3)/2f;
            float b = (c2+c4)/2f;
            float c = (c4-c2)/2f;
            int A = (int)a;
            int B = (int)b;
            int C = (int)c;
            
            if(a-A<0.0001 && b-B<0.0001 && c-C<0.0001) {
                System.out.println(A+" "+B+" "+C);
            }
            else {
                System.out.println("No");
            }
        }
    }
}