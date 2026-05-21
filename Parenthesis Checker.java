// Given a string s, composed of different combinations of '(' , ')', '{', '}', '[', ']'. Determine whether the Expression is balanced or not.
// An expression is balanced if:

// Each opening bracket has a corresponding closing bracket of the same type.
// Opening brackets must be closed in the correct order.
// time & space: O(n)

class Solution {
    public boolean isBalanced(String s) {
        // code here
        Deque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                
                if (ch == ')' && top != '(' || ch == ']' && top != '[' || ch == '}' && top != '{') {
                    return false;
                }
            }
            
        }
        return stack.isEmpty();
    }
}

/*
When:

opening bracket → push

When:

closing bracket →
stack should not be empty
top should contain corresponding opening bracket
otherwise return false

At end:

stack must be empty
  */
