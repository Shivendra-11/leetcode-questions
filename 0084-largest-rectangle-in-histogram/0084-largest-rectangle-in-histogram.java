class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        if (n == 0) return 0; // Edge case: empty array
        if (n == 1) return heights[0]; // Edge case: single bar

        int[] left = new int[n];  // Stores the nearest smaller to the left
        int[] right = new int[n]; // Stores the nearest smaller to the right

        Stack<Integer> st = new Stack<>();

        // Compute nearest smaller to the left
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        // Clear the stack to reuse it
        st.clear();

        // Compute nearest smaller to the right
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        // Compute the largest rectangle area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1; // Width of the rectangle
            int area = heights[i] * width;     // Area of the rectangle
            maxArea = Math.max(maxArea, area); // Update the maximum area
        }

        return maxArea;
    }
}
