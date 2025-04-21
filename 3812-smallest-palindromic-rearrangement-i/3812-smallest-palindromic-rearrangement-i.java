class Solution {
    public String smallestPalindrome(String s) {
        if (s.length() == 1)
            return s;
        char arr[] = s.toCharArray();
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[arr[i] - 'a']++;
        }
        StringBuilder left = new StringBuilder();
        StringBuilder mid = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                mid.append((char) ('a' + i));
                freq[i]--;
            }
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) (i + 'a'));
            }
        }

        String str = left.toString() + mid.toString() + left.reverse().toString();

        return str;

    }
}