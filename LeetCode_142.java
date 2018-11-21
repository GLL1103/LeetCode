����һ��������������ʼ�뻷�ĵ�һ���ڵ㡣 ��������޻����򷵻� null��

˵�����������޸ĸ���������

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
    private ListNode fastNode;
    private ListNode slowNode;
    
    public ListNode detectCycle(ListNode head) {
        if(!isRool(head))
            return null;
        
        ListNode ret = head;
        while(true){
            if(ret == slowNode)
                break;
            ret = ret.next;
            slowNode = slowNode.next;
        }
        return ret;
    }
    private boolean isRool(ListNode head){
        fastNode = head;
        slowNode = head;
        while(null!=fastNode && null!=fastNode.next){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            
            if(fastNode == slowNode)
                return true;
        }
        return false;
    }
}