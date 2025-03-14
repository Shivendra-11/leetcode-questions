class Solution {
    public static boolean finds(String s) {
        if (s.length() < 5) {
            return false;
        }
        HashSet<Character> st = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if ("aeiou".indexOf(ch) == -1) {
                return false;
            }
            st.add(ch);
        }
        return st.size() == 5;
    }

    public int countVowelSubstrings(String word) {
        int c = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <=word.length(); j++) {
                String w = word.substring(i, j);
                if (finds(w)) {
                    c++;
                }
            }
        }
        return c;
    }
}