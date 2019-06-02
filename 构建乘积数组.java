/**
 *
 *
 */

public class Solution {
    public int[] multiply(int[] A) {

        int length = A.length;
        int[] B = new int[length];
        for(int i = 0;i<length;++i) {
            int tmp = 1;
            for(int j = 0;j<length;++j) {
                if(j != i) {
                    tmp *= A[j];
                }
            }
            B[i] = tmp;
        }
        return B;
    }
}