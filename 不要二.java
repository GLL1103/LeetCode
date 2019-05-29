/**
 *
 * 二货小易有一个W*H的网格盒子，网格的行编号为0~H-1，网格的列编号为0~W-1。每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2。
 * 对于两个格子坐标(x1,y1),(x2,y2)的欧几里得距离为:
 * ( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) 的算术平方根
 * 小易想知道最多可以放多少块蛋糕在网格盒子里
 *
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNext()) {
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            //��ſ��Է��õ���ĸ���
            int count = 0;

            int preCount = (col/4)*2 + (col%4<2?col%4:2);
            int nextCount = (col/4)*2 + ((col-2)%4<2?(col-2)%4:2);

            count = row/4*(preCount+nextCount)*2;
            if(row%4 == 1)
                count += preCount;
            if(row%4 == 2)
                count += preCount*2;
            if(row%4 == 3)
                count += preCount*2 + nextCount;

            System.out.println(count);
        }
    }
}