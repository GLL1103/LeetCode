����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�

����Լ������������ظ�Ԫ�ء�

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
        
        //���ֲ���
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