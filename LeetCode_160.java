��дһ�������ҵ������������ཻ����ʼ�ڵ㡣

ע�⣺

�����������û�н��㣬���� null.
�ڷ��ؽ���������������뱣��ԭ�еĽṹ��
�ɼٶ���������ṹ��û��ѭ����
���������� O(n) ʱ�临�Ӷȣ��ҽ��� O(1) �ڴ档


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