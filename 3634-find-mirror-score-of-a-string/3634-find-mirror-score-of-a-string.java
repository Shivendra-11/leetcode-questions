class Solution {
    public long calculateScore(String s) {
        int n = s.length();
        // Array of lists to store character positions
        ArrayList<ArrayList<Integer>> occ = new ArrayList<>(26);
        for (int i = 0; i < 26; i++) {
            occ.add(new ArrayList<>());
        }
        
        long ans = 0;
        for (int i = 0; i < n; i++) {
            char mirror = (char)('z' - s.charAt(i) + 'a'); // Calculate the mirror character
            
            if (!occ.get(mirror - 'a').isEmpty()) {
                // Get the last occurrence of the mirror character
                int lastIndex = occ.get(mirror - 'a').remove(occ.get(mirror - 'a').size() - 1);
                ans += i - lastIndex; // Update the score
            } else {
                // Add the current character's index to its list
                occ.get(s.charAt(i) - 'a').add(i);
            }
        }
        
        return ans;
    }
}
