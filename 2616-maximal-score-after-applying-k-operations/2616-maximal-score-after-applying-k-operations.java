import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public long maxKelements(int[] nums, int k) {
        // Create a max heap (PriorityQueue in Java with reverse order comparator)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // Add all elements of the array to the heap
        for (int num : nums) {
            maxHeap.add(num);
        }

        long score = 0;

        // Perform the operations for k times
        for (int i = 0; i < k; i++) {
            // Get the largest element
            int maxElement = maxHeap.poll();
            
            // Add the largest element to the score
            score += maxElement;
            
            // Update the element (divide by 3 and round up)
            int updatedElement = (int) Math.ceil((double) maxElement / 3);
            
            // Push the updated element back into the heap
            maxHeap.add(updatedElement);
        }

        return score;
    }
}
