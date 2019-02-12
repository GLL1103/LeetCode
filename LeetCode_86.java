
����һ�������һ���ض�ֵ x����������зָ���ʹ������С�� x �Ľڵ㶼�ڴ��ڻ���� x �Ľڵ�֮ǰ��

��Ӧ����������������ÿ���ڵ�ĳ�ʼ���λ�á�

ʾ��:

����: head = 1->4->3->2->5->2, x = 3
���: 1->2->2->4->3->5



/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(null == head || null == head.next)
            return head;
        
        ListNode ret = null;
        ListNode cur = head;
        ListNode pre = null;
        while(null!=cur){
            if(cur.val < x) {   
                if(head==cur || (null!=ret && ret.next == cur))
                    ret = cur; 
                else{
                    if(null==ret) {
                        pre.next = cur.next;
                        cur.next = head;
                        head = cur;
                        ret = head;
                    }
                    else {
                        pre.next = cur.next;
                        cur.next = ret.next;
                        ret.next = cur;
                        ret = ret.next;
                    }
                }
            }
            
            if(null == pre)
                pre = head;
            else
                pre = cur;
            cur = cur.next;
        }
        return head;
    }
}