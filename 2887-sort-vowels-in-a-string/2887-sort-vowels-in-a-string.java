import java.util.Arrays;

class Solution {
    public String sortVowels(String s) {
        int[] lower = new int[26];
        int[] upper = new int[26];

        // Step 1: Mark vowels and count occurrences
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
                lower[chars[i] - 'a']++;
                chars[i] = '#';
            } else if (chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U') {
                upper[chars[i] - 'A']++;
                chars[i] = '#';
            }
        }

        // Step 2: Create sorted vowel string
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char c = (char) ('A' + i);
            while (upper[i] > 0) {
                str.append(c);
                upper[i]--;
            }
        }
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            while (lower[i] > 0) {
                str.append(c);
                lower[i]--;
            }
        }

        // Step 3: Place sorted vowels back in original string
        int f = 0;
        int se = 0;
        while (se < str.length()) {
            if (chars[f] == '#') {
                chars[f] = str.charAt(se);
                se++;
            }
            f++;
        }

        return new String(chars);
    }
}
