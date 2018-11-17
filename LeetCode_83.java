/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        ListNode next = null;
        if(null!=head){
            next=head.next;
        }
        while(null!=next){
            if(node.val == next.val){
                node.next = next.next;
                next = node.next;
            }
            else{
                node = next;
                next = node.next;
            }
        }
        return head;
    }
}