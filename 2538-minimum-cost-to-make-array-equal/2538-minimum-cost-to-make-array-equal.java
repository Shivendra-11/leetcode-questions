class Solution {
    public static long findCost(int nums[], int cost[], long mid) {
        long totalCost = 0;
        for (int i = 0; i < nums.length; i++) {
            totalCost += Math.abs(mid - nums[i]) * cost[i];
        }
        return totalCost;
    }

    public long minCost(int[] nums, int[] cost) {
        long min = nums[0], max = nums[0];

        
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        long l = min, h = max;
        long res = Integer.MAX_VALUE;

        while (l < h) {
            long mid = l + (h - l) / 2;
            long c1 = findCost(nums, cost, mid);
            long c2 = findCost(nums, cost, mid + 1);

            if (c1 < c2) { 
                res = c1;  
                h = mid;  
            } else {
                res = c2;
                l = mid + 1;
            }
        }

        return res==Integer.MAX_VALUE? 0:res;
    }
}
