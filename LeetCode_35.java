给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

你可以假设数组中无重复元素。

class Solution {
    public int searchInsert(int[] nums, int target) {
        /*
        int i = 0;
        for(i = 0;i<nums.length;++i){
            if(target <= nums[i])
                return i;
        }
        return i;
        */
        
        //二分查找
        int left = 0;
        int right = nums.length;
        while(left<right){
            int mid = left+((right-left)>>1);
            if(target == nums[mid])
            {
                return mid;
            }
            else if(target < nums[mid]){
                right = mid;
            }
            else{
                left = mid+1;
            } 
        }
        return left;
    }
}