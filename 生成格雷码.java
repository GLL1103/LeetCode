/**
 * 1、n=1时,返回0,1
 * 2、n=2时,返回00,01,10,11
 * 3、n=3时,返回000,001,010,011,100,101,110,111
 * 通过观察n=1,2,3时返回的格雷码可以发现这样的规律:
 * 1、n=2的格雷码是在n=1的格雷码按顺序在前面加0,加1
 * 2、n时的格雷码的长度是n-1时的格雷码的长度的两倍
 *
 */

import java.util.*;

public class GrayCode {
    public String[] getGray(int n) {
        if(n == 1) {
            String[] ret = new String[2];
            ret[0] = "0";
            ret[1] = "1";
            return ret;
        }
        else {
            //��ȡ��n-1λ�ĸ�����
            String[] tmp = getGray(n-1);
            int len = tmp.length;
            String[] ret = new String[len*2];
            
            for(int i = 0;i<len;++i) {
                ret[i] = "0"+tmp[i];
            }
            int i = 0;
            int j = len-1;
            for(;i<len && j>=0;++i,--j) {
                ret[i+len] = "1"+tmp[j];
            }
            return ret;
        }
    }
}