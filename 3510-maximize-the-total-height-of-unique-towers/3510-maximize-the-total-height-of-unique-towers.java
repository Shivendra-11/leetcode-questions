class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
         Arrays.sort(maximumHeight);
        
        int n = maximumHeight.length;
         long sum = 0;
        int currentHeight = maximumHeight[n - 1];  // Start with the largest possible height
        
        // Traverse from the last element backwards
        for (int i = n - 1; i >= 0; i--) {
            // Assign the largest distinct height that is <= maximumHeight[i]
         currentHeight = Math.min(currentHeight, maximumHeight[i]);
            
            // If currentHeight becomes non-positive, return -1 (not possible)
            if (currentHeight <= 0) {
                return -1;
            }
            
            // Add the assigned height to the total sum
            sum += currentHeight;
            
            // Decrease currentHeight to ensure distinct heights for next towers
            currentHeight--;
        }
        
        return sum;
    }
}