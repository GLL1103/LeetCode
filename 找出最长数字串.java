/**
 * 题目描述
 * 读入一个字符串str，输出祖父穿str中的连续的最长的数字串
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            char[] ret = str.toCharArray();
            
            int start = -1;
            int maxLen = 0;
            int tmpLen = 0;
            for(int i = 0;i<ret.length;++i) {
                char pre = ret[i];
                tmpLen = 0;
                if('0'<=pre && '9'>=pre) {
                    tmpLen+=1;
                    int j = i+1;
                    for(;j<ret.length;++j) {
                        //������
                        if('0'<=ret[j] && '9'>=ret[j]) {
                            char tmp = ret[j];
                            if(1 == (int)(tmp-pre)){
                                tmpLen++;
                                pre = tmp;
                            }
                        }
                        else {
                            break;
                        }
                    }
                }
                if(maxLen < tmpLen) {
                    maxLen = tmpLen;
                    start = i;
                }
            }
            System.out.println(str.substring(start,start+maxLen));
        }
    }
}