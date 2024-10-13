class Solution {
    public int search(int[] nums, int target) {
       int n = nums.length; // Get the size of the input array
        int low = 0, high = n - 1; // Set the initial boundaries for binary search
        
        // Perform binary search
        while(low <= high) {
            int mid = (low + high) / 2; // Calculate the middle index

            // If target is found at the mid position, return the index
            if(nums[mid] == target) return mid;

            // Check if the left half is sorted
            if(nums[low] <= nums[mid]) {
                // If target lies within the sorted left half
                if(nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1; // Narrow the search to the left half
                }
                else {
                    low = mid + 1; // Narrow the search to the right half
                }
            }
            // Otherwise, the right half must be sorted
            else {
                // If target lies within the sorted right half
                if(nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1; // Narrow the search to the right half
                }
                else {
                    high = mid - 1; // Narrow the search to the left half
                }
            }
        }

        // If the target is not found, return -1
        return -1; 
    }
}