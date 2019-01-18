给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。

函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。

说明:

返回的下标值（index1 和 index2）不是从零开始的。
你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素


class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];
        for(int i = 0;i<numbers.length-1;++i){
            if(target<numbers[i])
                break;
            for(int j = i+1;j<numbers.length;++j){
                if(target == numbers[i]+numbers[j]){
                    index[0] = i+1;
                    index[1] = j+1;
                    break;
                }
            }
        }
        return index;
    }
}