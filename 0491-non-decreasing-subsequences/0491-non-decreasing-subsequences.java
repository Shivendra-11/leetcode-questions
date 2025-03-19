import java.util.*;

class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;

        // Generate all possible subsequences using nested loops
        for (int i = 0; i < n; i++) {
            List<List<Integer>> newSubsequences = new ArrayList<>();
            
            // Try to extend previous subsequences
            for (List<Integer> seq : ans) {
                if (nums[i] >= seq.get(seq.size() - 1)) { // Maintain non-decreasing order
                    List<Integer> newSeq = new ArrayList<>(seq);
                    newSeq.add(nums[i]);
                    if (!set.contains(newSeq)) {
                        set.add(newSeq);
                        newSubsequences.add(newSeq);
                    }
                }
            }

            // Start a new subsequence with nums[i]
            List<Integer> singleElementList = new ArrayList<>();
            singleElementList.add(nums[i]);
            newSubsequences.add(singleElementList);

            // Add all newly created subsequences to ans
            ans.addAll(newSubsequences);
        }

        // Filter sequences with at least 2 elements
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> seq : set) {
            if (seq.size() >= 2) {
                result.add(seq);
            }
        }

        return result;
    }

   
}
