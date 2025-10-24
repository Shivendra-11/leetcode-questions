class MyStack {
    Queue<Integer> q1 = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        q1.offer(x);
        
            for (int i = 0; i < q1.size() - 1; i++) {
                q1.offer(q1.poll());
            }
        
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}