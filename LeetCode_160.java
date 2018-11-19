编写一个程序，找到两个单链表相交的起始节点。

注意：

如果两个链表没有交点，返回 null.
在返回结果后，两个链表仍须保持原有的结构。
可假定整个链表结构中没有循环。
程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(null==headA || null==headB)
            return null;
        int ret1 = 0;
        int ret2 = 0;
        ListNode cur1 = headA;
        ListNode cur2 = headB;
        while(null!=cur1){
            ret1++;
            cur1 = cur1.next;
        }
        while(null!=cur2){
            ret2++;
            cur2 = cur2.next;
        }
        
        cur1 = headA;
        cur2 = headB;
        int ret = ret1-ret2;
        if(ret>0){
            while((ret--)>0)
                cur1 = cur1.next;
            while(cur1!=null && cur2!=null){
                if(cur1 == cur2)
                    return cur1;
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
        }
        else{
            while((ret++)<0)
                cur2 = cur2.next;
            while(cur1!=null && cur2!=null){
                if(cur1 == cur2)
                    return cur1;
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
        }
        return null;
    }
}