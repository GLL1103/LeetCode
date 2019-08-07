

public class Solution {
    public int[] multiply(int[] A) {
        int len = A.length;

        int[] B = new int[len];
        int[] C = new int[len];
        int[] D = new int[len];
        C[0] = 1;
        D[len-1] = 1;

        //计算下三角乘积
        for(int i = 1;i<len;++i) {
            C[i] = C[i-1] * A[i-1];
        }
        //计算上三角乘积
        for(int i = len-2;i>=0;--i) {
            D[i] = D[i+1] * A[i+1];
        }
        for(int i = 0;i<len;++i) {
            B[i] = C[i]*D[i];
        }

        return B;
    }
}