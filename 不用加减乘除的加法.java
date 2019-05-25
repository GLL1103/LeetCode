

public class Solution {
    public int Add(int num1,int num2) {
        while(num2 != 0) {
            int num = num1 ^ num2;
            int temp = (num1&num2)<<1;
            num1 = num;
            num2 = temp;
        }
        return num1;
    }
}