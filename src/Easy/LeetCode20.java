package Easy;

import java.util.Stack;

// Valid Parenthesis
// Time Complexity - O(n)
// Space Complexity - O(n)

public class LeetCode20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(') stack.push(')');
            else if(s.charAt(i) == '[') stack.push(']');
            else if(s.charAt(i) == '{') stack.push('}');
            else{
                //System.out.print(stack + " " + s.charAt(i));
                if(stack.isEmpty() || s.charAt(i) != stack.peek()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
