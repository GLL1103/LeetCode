
/**
*返回链表中环的入口节点，若不存在，返回null
*/

/*
 public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
 
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(null == pHead)
            return null;
         
        ListNode fast = pHead;
        ListNode slow = pHead;
        ListNode meet;
        while(fast!=null && slow!=null) {
            fast = fast.next;
            if(fast == null)
                return null;
            fast = fast.next;
            slow = slow.next;
             
            if(fast == slow && fast!=null)
                break;
        }
        meet = fast;
        ListNode ret = pHead;
        while(true) {
            if(ret == meet)
                return ret;
            else {
                ret = ret.next;
                meet = meet.next;
            }
        }
    }
}