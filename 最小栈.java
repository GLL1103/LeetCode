设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。

push(x) -- 将元素 x 推入栈中。
pop() -- 删除栈顶的元素。
top() -- 获取栈顶元素。
getMin() -- 检索栈中的最小元素。

解题思路：

入栈：先比较当前栈内元素最小值和入栈元素大小，先将入栈元素入栈，再将最小值入栈。

出栈：一次性出栈两元素（最小值和元素），并更新当前栈内的最小值。



import java.util.Stack;

class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    int min = 0;
    /** initialize your data structure here. */
    public MinStack() {
    }
    
    public void push(int x) {
        if(stack.empty()) {
            min = x;
        }
        else {
            if(x < min) {
                min = x;
            }
        }
        stack.push(x);
        stack.push(min);
    }
    
    public void pop() {
        stack.pop();
        stack.pop();
        if(!stack.empty()) {
            min = stack.peek();
        }  
    }
    
    public int top() {
        int tmp = stack.pop();
        int top = stack.peek();
        stack.push(tmp);
        return top;
    }
    
    public int getMin() {
        return stack.peek();
    }
}