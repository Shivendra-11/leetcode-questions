class Solution {
    public static boolean find(int arr[], long k, int mid) {
        if (mid == 0) return false; 
        long sum = 0; 

        for (int num : arr) {
            sum += num / mid;
        }
        return sum >= k;
    }

    public int maximumCandies(int[] candies, long k) {
        // long total = 0;
        int maxCandy = Integer.MIN_VALUE;

        for (int candy : candies) {
           
            maxCandy = Math.max(maxCandy, candy);
        }

        // if (total < k) return 0;  

        int l = 1, h = maxCandy;  
        int res = 0;

        while (l <= h) {
            int mid = l + (h - l) / 2;  
            if (find(candies, k, mid)) {
                res = mid;
                l = mid + 1;  
            } else {
                h = mid - 1;
            }
        }
        return res;
    }
}
