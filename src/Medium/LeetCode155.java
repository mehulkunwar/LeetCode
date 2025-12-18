package Medium;

import java.util.Stack;

// Min Stack
// Time Complexity - O(1)
// Space Complexity - O(n)

public class LeetCode155 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public LeetCode155() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int val) {
        stack1.push(val);

        if(stack2.isEmpty()) stack2.push(val);
        else{
            if(stack2.peek() >= val){
                stack2.push(val);
            }
        }

    }

    public void pop() {
        if(stack1.peek().equals(stack2.peek())) stack2.pop();

        stack1.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return stack2.peek();
    }
}
