/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(null==head || null==head.next)
            return head;
        
        int num = 0;
        for(ListNode ret = head;ret!=null;ret = ret.next)
            ++num;
        int temp = k%num;
        for(int i = 0;i<temp;++i){
            ListNode ret = head;
            ListNode pre = null;
            while(ret.next!=null){
                pre = ret;
                ret = ret.next;
            }
            pre.next = null;
            ret.next = head;
            head = ret;
        }
        return head;
    }
}