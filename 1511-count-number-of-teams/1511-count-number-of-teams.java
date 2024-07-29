class Solution {
    public int numTeams(int[] nums) {
        int c = 0;
        
        // Loop to count increasing sequences
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[j] < nums[k]) {
                            c++;
                        }
                    }
                }
            }
        }
        
        // Loop to count decreasing sequences
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[j] > nums[k]) {
                            c++;
                        }
                    }
                }
            }
        }
        
        return c;
    }
}
