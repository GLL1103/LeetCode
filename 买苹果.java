/**
 * 买苹果：
 * 六个一袋，八个一袋，不拆开卖
 * 小易只想买恰好n个苹果
 * 小易想购买尽量少的袋数方便携带
 * 如果不能购买恰好n个苹果，小易将不会购买，返回-1
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            //����ƻ������
            int apple = scanner.nextInt();
            
            int count8 = apple/8;
            for(int i = count8;i>=0;--i) {
                int number = i*8;
                //ʣ�๺��ƻ������
                int count = apple-number;
                //�պõ��ڹ������
                if(0 == count%6) {
                    System.out.println(i+(apple-number)/6);
                    return;
                }
            }
            System.out.println("-1");
        }
    }
}