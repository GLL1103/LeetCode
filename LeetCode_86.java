
给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。

你应当保留两个分区中每个节点的初始相对位置。

示例:

输入: head = 1->4->3->2->5->2, x = 3
输出: 1->2->2->4->3->5



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