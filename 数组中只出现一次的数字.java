一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。



//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
import java.util.*;

public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        
        if(null==array || 0 == array.length) {
            return;
        }
        
        int len = array.length;
        int i = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(;i<len;++i) {
            if(map.containsKey(array[i])) {
                map.put(array[i],map.get(array[i])+1);
            }
            else {
                map.put(array[i],1);
            }
        }
        
        List<Integer> list = new ArrayList<Integer>();
        for(i=0;i<len;++i) {
            if(1 == map.get(array[i])) {
                list.add(array[i]);
            }
            if(list.size() == 2) {
                break;
            }
        }
        
        num1[0] = list.get(0);
        num2[0] = list.get(1);
    }
}