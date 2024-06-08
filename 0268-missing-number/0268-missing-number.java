class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        
        // Cyclic sort logic
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        
        // Find the missing number
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        
        // If no number is missing in the range [0, n-1], then n is missing
        return nums.length;
    }
    
    // Corrected swap method
    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
