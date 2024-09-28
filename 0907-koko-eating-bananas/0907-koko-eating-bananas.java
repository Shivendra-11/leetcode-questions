import java.util.Arrays;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles); // Sort the piles array
        int start = 1; // Minimum possible speed
        int end = piles[piles.length - 1]; // Maximum possible speed
        int ans = end; // Initialize answer to the maximum speed
        long sum = 0;

        // Calculate the sum of all piles
        for (int pile : piles) {
            sum += pile;
        }

        // Calculate the initial start value (max between 1 and sum/h)
        start = (int) Math.max(1L, sum / h);

        // Perform binary search to find the minimum eating speed
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int totalTime = 0;

            // Calculate the total time required to finish all piles at speed 'mid'
            for (int pile : piles) {
                totalTime += (pile + mid - 1) / mid; // Equivalent to Math.ceil(pile / mid)
            }

            // If the total time is within the allowed hours, try a smaller speed
            if (totalTime <= h) {
                ans = mid;
                end = mid - 1;
            } else { // If the time exceeds the allowed hours, increase the speed
                start = mid + 1;
            }
        }

        return ans; // Return the minimum eating speed
    }
}
