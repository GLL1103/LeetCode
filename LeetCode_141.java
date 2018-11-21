给定一个链表，判断链表中是否有环。


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fastNode = head;
        ListNode slowNode = head;
        while(null!=fastNode && null!=fastNode.next){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            
            if(fastNode == slowNode)
                return true;
        }
        return false;
    }
}