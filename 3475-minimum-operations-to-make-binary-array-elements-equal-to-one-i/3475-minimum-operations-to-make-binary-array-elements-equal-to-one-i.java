class Solution {
    public int minOperations(int[] nums) {
        int c = 0;

       
        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] == 0) {
                c++;
               
                for (int j = 0; j < 3; j++) {
                    nums[i + j] = 1 - nums[i + j];  
                }
            }
        }

       
        for (int num : nums) {
            if (num != 1) {
                return -1; 
            }
        }

        return c;
    }
}
