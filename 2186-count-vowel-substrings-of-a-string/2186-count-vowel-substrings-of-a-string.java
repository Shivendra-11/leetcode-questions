import java.util.*;

class Solution {
    public static boolean finds(String s) {
        if (s.length() < 5) { // Must contain at least all vowels
            return false;
        }
        
        // Use a HashSet to track vowels
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if ("aeiou".indexOf(ch) == -1) { // Non-vowel character found
                return false;
            }
            set.add(ch);
        }
        return set.size() == 5; // Check if all vowels are present
    }

    public int countVowelSubstrings(String word) {
        int c = 0;
        int n = word.length();
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) { // Fix substring range
                String w = word.substring(i, j);
                if (finds(w)) {
                    c++;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.countVowelSubstrings("aeiouaeiou"));
    }
}
