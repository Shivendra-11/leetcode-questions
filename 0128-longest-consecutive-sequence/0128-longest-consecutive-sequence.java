class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        int c = 1;
        int longest = 1;
        if (nums.length == 0){
            return 0;
        }
        // int lastsmaller =nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1]) continue;

            if (nums[i] - 1 == nums[i-1]) {
                c++;
            } 
            else{
                c = 1;
            }
            // lastsmaller = nums[i];

            longest = Math.max(longest, c);

        }
        return longest;
    }
}