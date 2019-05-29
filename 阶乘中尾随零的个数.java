
/**
 *计算n的阶乘的值的尾随零个数
 * 0<=n<=1000
 */

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //方法1    只能处理较小的值
        if (scanner.hasNext()) {
            int number = scanner.nextInt();
            int N = fun(number);
            int count = 0;
            while(N >= 10) {
                if(N%10 == 0) {
                    count++;
                    N /= 10;
                 }
                else {
                    break;
                }
            }
        System.out.println(count);
        }

        //方法二   循环
        if(scanner.hasNext()) {
            int number = scanner.nextInt();
            System.out.println(fun2(number));
        }

        //方法三   递归
        if(scanner.hasNext()) {
            int number = scanner.nextInt();
            System.out.println(fun3(number));
        }
    }

    //阶乘
    public static int fun(int a) {
        if(a == 1) {
            return 1;
        }
            return a*fun(a-1);
    }

    //循环
    public static int fun2(int a) {
        int b = a;
        int count = 0;
        while(b >= 5) {
            int tmp = b/5;
            count += tmp;
            b = tmp;
        }
        return count;
    }

    //递归
    public static int fun3(int num) {
        if(num>0&&num<5) {
            return 0;
        }
        else {
            return num/5+fun3(num/5);
        }
     }