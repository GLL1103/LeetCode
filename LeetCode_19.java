/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(null == head)
            return head;  
        
        int num = 0;
        ListNode ret = head;
        ListNode del = head;
        for(;ret!=null;ret=ret.next){
            ++num;
        }
        
        if(num == n){
            head = head.next;
        }
        else{
            for(int i = 1;i<num-n+1;++i){
                ret = del;
                del = del.next;
            }
            ret.next = del.next;
        }
      
        return head;
    }
}