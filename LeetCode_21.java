/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode ret1 = l1;
        ListNode ret2 = l2;
        ListNode cur = temp;
        while(null!=ret1 && null!=ret2){
            ListNode ret = new ListNode(0);
            if(ret1.val < ret2.val){
                ret.val = ret1.val;
                cur.next = ret;
                cur = ret;
                ret1 = ret1.next;
            }
            else{
                ret.val = ret2.val;
                cur.next = ret;
                cur = ret;
                ret2 = ret2.next;
            }
        }
        while(null!=ret1){
            ListNode ret = new ListNode(0);
            ret.val = ret1.val;
            cur.next = ret;
            cur = ret;
            ret1 = ret1.next;
        }
        while(null!=ret2){
            ListNode ret = new ListNode(0);
            ret.val = ret2.val;
            cur.next = ret;
            cur = ret;
            ret2 = ret2.next;
        }
        if(null!=temp.next){
            cur = temp.next;
            return cur;
        }
        else
            return null;
            
    }
}