class Solution {

    // function to calculate max area

  public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] arr1 = new int[n]; // Nearest smaller to the right
        int[] arr2 = new int[n]; // Nearest smaller to the left

        Stack<Integer> st = new Stack<>();

        // Compute nearest smaller to the right (arr1)
        for (int i = 0; i < n; i++) {
            while (!st.empty() && heights[st.peek()] > heights[i]) {
                arr1[st.pop()] = i; // Set the next smaller index
            }
            st.push(i);
        }
        // For remaining elements, set right boundary to n
        while (!st.isEmpty()) {
            arr1[st.pop()] = n;
        }

        // Clear the stack for left computation
        st.clear();

        // Compute nearest smaller to the left (arr2)
        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && heights[st.peek()] > heights[i]) {
                arr2[st.pop()] = i; // Set the next smaller index
            }
            st.push(i);
        }
        // For remaining elements, set left boundary to -1
        while (!st.isEmpty()) {
            arr2[st.pop()] = -1;
        }

        // Compute the largest rectangle area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = arr1[i] - arr2[i] - 1; // Width of the rectangle
            int area = heights[i] * width;    // Area of the rectangle
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }








    public int maximalRectangle(char[][] matrix) {
        
        int row=matrix.length;
        int col=matrix[0].length;
        int heights[]=new int[col];
        Arrays.fill(heights,0);
        int ans=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]=='0'){
                    heights[j]=0;
                }
                else{
                    heights[j]++;  
                }
            }
            ans=Math.max(ans, largestRectangleArea(heights));
        }


return ans;

    }
}