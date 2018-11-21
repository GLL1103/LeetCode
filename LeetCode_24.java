����һ���������������������ڵĽڵ㣬�����ؽ����������


˵��:

����㷨ֻ��ʹ�ó����Ķ���ռ䡣
�㲻��ֻ�ǵ����ĸı�ڵ��ڲ���ֵ��������Ҫʵ�ʵĽ��нڵ㽻����

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode pre = null;
        ListNode last = null;
        for(ListNode node = head;node!=null && node.next!= null;node = last){
            ListNode next = node.next;
            last = next.next;
            node.next = last;
            next.next = node;
            if(pre == null){
                head = next;
            }
            else{
                pre.next = next;
            }
            pre = node;
        }
        return head;
    }
}