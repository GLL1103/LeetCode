/**
 *
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if(n>1000) {
                n=1000;
            }
            
            List<Integer> list = new ArrayList<Integer>();
            //����������a[N]
            for(int i = 0;i<n;++i) {
                list.add(i);
            }
            
            int i = 0;
            while(list.size()>1) {
                //ÿ��������    ��i�������鳤��ʱ����ͷ��ʼ
                i = (i+2)%list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}