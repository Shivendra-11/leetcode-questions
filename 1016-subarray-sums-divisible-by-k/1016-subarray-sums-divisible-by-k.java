import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
            HashMap<Integer, Integer> prefix = new HashMap<>();
                    prefix.put(0, 1); // Initialize with 0 to count subarrays starting from index 0

                            int sum = 0;
                                    int count = 0;

                                            for (int num : nums) {
                                                        sum += num;
                                                                    int rem = sum % k;
                                                                                if (rem < 0) {
                                                                                                rem += k;
                                                                                                            }

                                                                                                                        if (prefix.containsKey(rem)) {
                                                                                                                                        count += prefix.get(rem);
                                                                                                                                                    }

                                                                                                                                                                prefix.put(rem, prefix.getOrDefault(rem, 0) + 1);
                                                                                                                                                                        }

                                                                                                                                                                                return count;
                                                                                                                                                                                    }
                                                                                                                                                                                    }