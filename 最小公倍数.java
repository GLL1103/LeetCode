

/**
 * 最小公倍数
 */
public class NewKe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(sNumber(a,b));
        }
    }

    //最小公倍数 = a * b / 最大公约数
    public static int sNumber(int a,int b) {
        int tmp = bcg(a,b);
        return a*b/tmp;
    }

    public static int bcg(int a,int b) {
        if(a < b) {
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