class Solution {
    public static void gen(StringBuilder s, int k) {
        if (s.length() >= k) return; // Base case: Stop when length reaches k

        int len = s.length(); // Get the current length before expanding
        for (int i = 0; i < len; i++) {
            char ch = (char) ('a' + (s.charAt(i) - 'a' + 1) % 26); // Generate next character
            s.append(ch);
        }
        
        gen(s, k); // Recursive call to continue expanding
    }

    public char kthCharacter(int k) {
        StringBuilder s = new StringBuilder("a"); // Start with 'a'
        gen(s, k); // Recursively expand the sequence
        return s.charAt(k - 1); // Return k-th character (1-based index)
    }
}
