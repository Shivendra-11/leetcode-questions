class Solution {
    public long countCompleteDayPairs(int[] hours) {
       Map<Integer, Integer> remainderCount = new HashMap<>();
        long count = 0;

        // Iterate through each hour
        for (int hour : hours) {
            // Calculate the remainder when hour is divided by 24
            int remainder = hour % 24;

            // Calculate the complement remainder that would sum to 24
            int complement = (24 - remainder) % 24;

            // Add the count of complement remainders to the result
            if (remainderCount.containsKey(complement)) {
                count += remainderCount.get(complement);
            }

            // Update the remainder count in the map
            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
        }

        return count;
         
    }
}