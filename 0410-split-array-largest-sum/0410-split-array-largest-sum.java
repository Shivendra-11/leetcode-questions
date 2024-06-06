class Solution {
    public int splitArray(int[] nums, int k) {

        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        // Logic for binary search
        while (start < end) {
            int mid = start + (end - start) / 2;

            // now I have to check for partition
            int sum = 0;
            int partition = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    partition++;
                } else {
                    sum += num;
                }
            }

            // Adjust the binary search boundaries based on the number of partitions
            if (partition > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end;
    }
}
