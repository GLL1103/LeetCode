����һ������ nums ��һ��ֵ val������Ҫԭ���Ƴ�������ֵ���� val ��Ԫ�أ������Ƴ���������³��ȡ�

��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�

Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�


class Solution {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        int i = 0;
        while(i<size){
            if(val == nums[i]){
                nums[i] = nums[--size];
            }
            else{
                i++;
            }
        }
        return size;
    }
}


