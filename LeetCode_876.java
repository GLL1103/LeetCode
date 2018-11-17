/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(null!=fast && null!=fast.next){
            slow = slow.next;
            for(int i = 0;i<2 && null!=fast;++i){
                fast = fast.next;
            }
        }
        return slow;
    }
}