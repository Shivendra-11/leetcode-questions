class Solution {
    public static boolean finds(int n, int arr[], long mid) {
        long total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += Math.min(mid, arr[i]);
        }
        return total >= n * mid;
    }

    public long maxRunTime(int n, int[] nums) {
        long sum = 0;
        int mini = Integer.MAX_VALUE;
        
        for (int num : nums) {
            sum += num;
            mini = Math.min(mini, num);
        }

        long l = 1, h = sum / n, res = 0;
        while (l <= h) {
            long mid = l + (h - l) / 2;
            if (finds(n, nums, mid)) {
                res = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return res;
    }
}
