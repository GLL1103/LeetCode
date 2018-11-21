给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。


说明:

你的算法只能使用常数的额外空间。
你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

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