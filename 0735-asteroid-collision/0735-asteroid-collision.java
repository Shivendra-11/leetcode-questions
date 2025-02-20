import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] nums) {
        Stack<Integer> st = new Stack<>();

        for (int num : nums) {
            boolean destroyed = false;
            while (!st.isEmpty() && num < 0 && st.peek() > 0) {
                int top = st.pop(); 
                if (top == -num) { 
                    destroyed = true;
                    break;
                } else if (top > -num) { 
                    st.push(top);
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) {
                st.push(num);
            }
        }

        
        int[] arr = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }

        return arr;
    }

    
}
