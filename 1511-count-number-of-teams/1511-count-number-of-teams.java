class Solution {
    public int numTeams(int[] nums) {
        int n = nums.length;
        int count = 0;
                                     
        for (int i = 0; i < n; i++) {
            int leftSmaller = 0, leftLarger = 0;
            int rightSmaller = 0, rightLarger = 0;

            // Count elements smaller and larger to the left of nums[i]
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    leftSmaller++;
                } else if (nums[j] > nums[i]) {
                    leftLarger++;
                }
            }

            // Count elements smaller and larger to the right of nums[i]
            for (int k = i + 1; k < n; k++) {
                if (nums[k] < nums[i]) {
                    rightSmaller++;
                } else if (nums[k] > nums[i]) {
                    rightLarger++;
                }
            }

            // Number of increasing teams with nums[i] as the middle element
            count += leftSmaller * rightLarger;
             
            // Number of decreasing teams with nums[i] as the middle element
            count += leftLarger * rightSmaller;
        }

        return count;
    }
}
