反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。

说明:
1 ≤ m ≤ n ≤ 链表长度。

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(null==head || null==head.next)
            return head;
        
        ListNode pre = null;
        ListNode node = head;
        ListNode next = head.next;
        ListNode begin = head;
        ListNode tail = head;
        for(int i = 1;i<m;++i){
            if(i<m-1){
                begin = begin.next;
            }
            node = node.next;
            tail = tail.next;
            next = next.next;
        }
        for(int i = m;i<=n;++i){
            node.next = pre;
            pre = node;
            node = next;
            if(null!=next)
                next = next.next;
        }
        tail.next = node;
        if(1==m)
            head = pre;
        else
            begin.next = pre;
        
        return head;
    }
}