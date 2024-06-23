class Solution {
    public int distinctAverages(int[] nums) {
   if (nums.length == 0) {
            return 0;  // Return 0 as there are no elements to form averages
        }

        Set<Double> arr = new HashSet<>();

        int i = 0;
        int j = nums.length - 1;
        Arrays.sort(nums);

        while (i < j) {
            double avg = (double) (nums[i] + nums[j]) / 2.0;
            arr.add(avg);
            i++;
            j--;
        }

        return arr.size();
        
    }
}