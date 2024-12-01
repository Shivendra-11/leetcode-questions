class MyQueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public MyQueue() {
        // Constructor initializes two empty stacks
    }

    public void push(int x) {
        st1.push(x); // Always push to st1
    }

    public int pop() {
        if (st2.isEmpty()) { // Transfer elements from st1 to st2 only when st2 is empty
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        return st2.pop(); // Pop from st2, which represents the front of the queue
    }

    public int peek() {
        if (st2.isEmpty()) { // Transfer elements if st2 is empty
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        return st2.peek(); // Peek from st2, which represents the front of the queue
    }

    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty(); // Queue is empty only if both stacks are empty
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
