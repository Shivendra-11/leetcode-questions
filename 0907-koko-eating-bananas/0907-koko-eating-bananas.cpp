#include <vector>
#include <algorithm> // For std::sort

class Solution {
public:
    int minEatingSpeed(std::vector<int>& piles, int h) {
        std::sort(piles.begin(), piles.end());  // Sort piles for convenience, though not necessary
        int start = 1;  // Minimum speed can be 1
        int end = piles[piles.size() - 1];  // Maximum possible speed is the size of the largest pile
        int mid;
        int ans = end;  // Initialize ans to the maximum speed
        long long sum = 0;

        for (int i = 0; i < piles.size(); i++) {
            sum += piles[i];
        }
        
        // start could be calculated based on the sum of all piles divided by h, but it must be >= 1
        start = std::max(1LL, sum / h);

        while (start <= end) {
            mid = start + (end - start) / 2;
            int totaltime = 0;

            // Calculate the total time it would take to finish all piles at speed 'mid'
            for (int i = 0; i < piles.size(); i++) {
                totaltime += (piles[i] + mid - 1) / mid;  // Equivalent to ceil(piles[i] / mid)
            }

            if (totaltime <= h) {  // If we can finish all piles within 'h' hours
                ans = mid;  // Update the answer to the current speed
                end = mid - 1;  // Try for a smaller speed
            } else {
                start = mid + 1;  // If it takes more time than allowed, we need to increase the speed
            }
        }
        return ans;
    }
};
