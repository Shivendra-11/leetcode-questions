import java.util.*;

class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;

        
        for (int i = 0; i < n; i++) {
            List<List<Integer>> newSubsequences = new ArrayList<>();
            
      
            for (List<Integer> seq : ans) {
                if (nums[i] >= seq.get(seq.size() - 1)) { 
                    List<Integer> newSeq = new ArrayList<>(seq);
                    newSeq.add(nums[i]);
                    
                        set.add(newSeq);
                        newSubsequences.add(newSeq);
                    
                }
            }

            
            List<Integer> singleElementList = new ArrayList<>();
            singleElementList.add(nums[i]);
            newSubsequences.add(singleElementList);

            
            ans.addAll(newSubsequences);
        }

     
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> seq : set) {
            if (seq.size() >= 2) {
                result.add(seq);
            }
        }

        return result;
    }

   
}
