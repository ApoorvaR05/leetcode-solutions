/*For Queue using Stacks, use two stacks:

s1 → used for insertion (push)
s2 → used for deletion (pop) and front (peek)

When s2 is empty and we need to remove/access an element, move everything from s1 to s2. This reverses the order and gives FIFO behavior.

| Operation | Time           |
| --------- | -------------- |
| push()    | O(1)           |
| pop()     | Amortized O(1) |
| peek()    | Amortized O(1) |
| empty()   | O(1)           |
*/
class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    
    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
