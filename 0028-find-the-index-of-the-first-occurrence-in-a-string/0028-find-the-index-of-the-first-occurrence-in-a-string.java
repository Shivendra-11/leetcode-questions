class Solution {
    public int strStr(String haystack, String needle) {
        // If needle is empty, return 0
        if (needle.length() == 0) {
            return 0;
        }

        char[] str1 = haystack.toCharArray();
        char[] str2 = needle.toCharArray();
        int j = 0;

        for (int i = 0; i < haystack.length(); i++) {
            if (str1[i] == str2[j]) {
                j++;
            } else {
                // Reset j and adjust i accordingly
                i = i - j;
                j = 0;
            }

            // If the entire needle has been found
            if (j == str2.length) {
                return i - j + 1;
            }
        }

        // Needle was not found
        return -1;
    }
}
