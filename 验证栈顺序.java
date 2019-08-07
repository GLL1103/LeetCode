给定 pushed 和 popped 两个序列，只有当它们可能是在最初空栈上进行的推入 push 和弹出 pop 操作序列的结果时，返回 true；否则，返回 false 。

示例：

输入：pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
输出：true
解释：我们可以按以下顺序执行：
push(1), push(2), push(3), push(4), pop() -> 4,
push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1



import java.util.Stack;

class Solution {
    Stack<Integer> stack = new Stack<Integer>();
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int len1 = pushed.length;
        int len2 = popped.length;
        if(len1 != len2) {
            return false;
        }
        
        int i = 0;
        int j = 0;
        while(i<len1) {
            stack.push(pushed[i]);
            while(!stack.empty() && stack.peek() == popped[j]) {
                stack.pop();
                ++j;
            }
            ++i;
        }
        
        if(stack.empty()) {
            return true;
        }
        else {
            return false;
        }
    }
}