class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int first = 0;
        int second = 0;
        int product = 1;
        int count = 0;
        while (second < nums.length) {

            product *= nums[second];

            while (product >= k && first <= second) {
                product = product / nums[first];
                first++;
            }
            count += second - first + 1;

            second++;

        }
        return count;

    }
}