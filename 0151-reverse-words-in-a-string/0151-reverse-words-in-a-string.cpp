class Solution {
public:
    string reverseWords(string s) {
        // Reverse the entire string
        reverse(s.begin(), s.end());

        int n = s.length();
        int i = 0;
        int l = 0;
        int r = 0;

        while (i < n) {
            // Skip leading spaces
            while (i < n && s[i] == ' ') {
                i++;
            }
            // Mark the start of the word
            l = r;
            // Copy the word
            while (i < n && s[i] != ' ') {
                s[r++] = s[i++];
            }
            // Reverse the word
            if (l < r) {
                reverse(s.begin() + l, s.begin() + r);
                s[r++] = ' ';
            }
        }

        // Remove the trailing space if there is one
        if (r > 0 && s[r - 1] == ' ') {
            r--;
        }

        return s.substr(0, r);
    }
};
