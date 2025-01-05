import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public long calculateScore(String s) {
        int n = s.length();
        // HashMap to store lists of character positions
        HashMap<Character, ArrayList<Integer>> occ = new HashMap<>();
        
        long ans = 0;
        for (int i = 0; i < n; i++) {
            char mirror = (char) ('z' - s.charAt(i) + 'a'); // Calculate the mirror character
            
            if (occ.containsKey(mirror) && !occ.get(mirror).isEmpty()) {
                // Get the last occurrence of the mirror character
                int lastIndex = occ.get(mirror).remove(occ.get(mirror).size() - 1);
                ans += i - lastIndex; // Update the score
            } else {
                // Add the current character's index to its list
                occ.putIfAbsent(s.charAt(i), new ArrayList<>());
                occ.get(s.charAt(i)).add(i);
            }
        }
        
        return ans;
    }
}
