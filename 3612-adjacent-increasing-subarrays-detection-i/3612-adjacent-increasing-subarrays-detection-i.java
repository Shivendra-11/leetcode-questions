import java.util.List;

class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
   
        for (int i = 0; i <= n - 2 * k; i++) {
            
            boolean firstIncreasing = true;
            for (int j = i; j < i + k - 1; j++) {
                if (nums.get(j) >= nums.get(j + 1)) {
                    firstIncreasing = false;
                    break;
                }
            }
   
            if (!firstIncreasing) continue;

            boolean secondIncreasing = true;
            for (int j = i + k; j < i + 2 * k - 1; j++) {
                if (nums.get(j) >= nums.get(j + 1)) {
                    secondIncreasing = false;
                    break;
                }
            }
          

            if (secondIncreasing) {
                return true;
            }
        }
        
    
        return false;
    }
}
