
给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。

要求返回这个链表的深度拷贝。



/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {   
        if(null == head)
            return null;
        RandomListNode ret = head;
        RandomListNode pNext = null;
        //插入新建节点
        while(ret!=null){
            RandomListNode temp = new RandomListNode(ret.label);
            pNext = ret.next;
            ret.next = temp;
            temp.next = pNext;
            ret = pNext;
        }
        //构造新建节点的随机指针
        ret = head;
        while(null!=ret){
            pNext = ret.next;
            if(null == ret.random)
                pNext.random = null;
            else
                pNext.random = ret.random.next;
            ret = pNext.next;
        }
        //拆除
        ret = head;
        RandomListNode pHead = head.next;
        while(ret!=null){
            pNext = ret.next;
            ret.next = pNext.next;
            if(null!=ret.next){
                pNext.next = ret.next.next;
            }
            else
                pNext.next = null;
            ret = ret.next;
        }
        return pHead;
    }
}