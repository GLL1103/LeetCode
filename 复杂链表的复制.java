```java
/*
输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
*/


/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null) {
            return pHead;
        }
        
        //复制节点
        RandomListNode ret = pHead;
        while(ret != null) {
            RandomListNode node = new RandomListNode(ret.label);
            node.next = ret.next;
            ret.next = node;
            ret = node.next;
        }
        
        //设置新的random指向
        ret = pHead;
        while(ret != null) {
            if(ret.random != null) {
                ret.next.random = ret.random.next;
            }
            ret = ret.next.next;
        }
        
        //链表分离
        RandomListNode phead = pHead.next;
        RandomListNode node = null;
        ret = pHead;
        while(ret != null) {
            node = ret.next;
            ret.next = node.next;
            if(null == ret.next) {
                node.next = null;
            }else {
                node.next = ret.next.next;
            }
            ret = ret.next;
        }
        
        return phead;
    }
}
```

