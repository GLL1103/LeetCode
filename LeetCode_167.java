����һ���Ѱ����������� ���������飬�ҵ�������ʹ���������֮�͵���Ŀ������

����Ӧ�÷����������±�ֵ index1 �� index2������ index1 ����С�� index2��

˵��:

���ص��±�ֵ��index1 �� index2�����Ǵ��㿪ʼ�ġ�
����Լ���ÿ������ֻ��ӦΨһ�Ĵ𰸣������㲻�����ظ�ʹ����ͬ��Ԫ��


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