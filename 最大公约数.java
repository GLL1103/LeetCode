
/**
 * 求最大公约数
 */

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(bcg(a,b));
        }
    }

    //辗转相除法
    public static int bNumber(int a,int b) {
        if(a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if(a%b == 0)
            return b;

        return bNumber(a%b,b);
    }

    //最相减损法
    public static int bcg(int a,int b) {
        if(a<b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        int tmp = a-b;
        if(tmp == b) {
            return b;
        }
        else {
            return bcg(tmp,b);
        }
    }
}
