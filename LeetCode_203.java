/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
       if(null==head)
           return head;
        
        while(null!=head && head.val==val){
            head = head.next;
        }
        
        if(null!=head){
            ListNode node = head;
            ListNode next = head.next;
            while(null!=next){
                if(val==next.val){
                    node.next = next.next;
                    next = node.next;
                }
                else{
                    node = next;
                    next = node.next;
                }
            }
        }
        
            return head;
    }
}