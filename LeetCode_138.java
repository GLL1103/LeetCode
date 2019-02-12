
����һ������ÿ���ڵ����һ���������ӵ����ָ�룬��ָ�����ָ�������е��κνڵ��սڵ㡣

Ҫ�󷵻�����������ȿ�����



/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {   
        if(null == head)
            return null;
        RandomListNode ret = head;
        RandomListNode pNext = null;
        //�����½��ڵ�
        while(ret!=null){
            RandomListNode temp = new RandomListNode(ret.label);
            pNext = ret.next;
            ret.next = temp;
            temp.next = pNext;
            ret = pNext;
        }
        //�����½��ڵ�����ָ��
        ret = head;
        while(null!=ret){
            pNext = ret.next;
            if(null == ret.random)
                pNext.random = null;
            else
                pNext.random = ret.random.next;
            ret = pNext.next;
        }
        //���
        ret = head;
        RandomListNode pHead = head.next;
        while(ret!=null){
            pNext = ret.next;
            ret.next = pNext.next;
            if(null!=ret.next){
                pNext.next = ret.next.next;
            }
            else
                pNext.next = null;
            ret = ret.next;
        }
        return pHead;
    }
}