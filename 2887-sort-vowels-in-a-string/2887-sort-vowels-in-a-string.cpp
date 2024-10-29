class Solution {
public:
    string sortVowels(string s) {
        vector<int> lower(26, 0);
        vector<int> upper(26, 0);

        // Step 1: Mark vowels and count occurrences
        for (int i = 0; i < s.size(); i++) {
            if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
                lower[s[i] - 'a']++;
                s[i] = '#';
            } else if (s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U') {
                upper[s[i] - 'A']++;
                s[i] = '#';
            }
        }

        // Step 2: Create sorted vowel string
        string str;
        for (int i = 0; i < 26; i++) {
            char c = 'A' + i;
            while (upper[i] > 0) {
                str += c;
                upper[i]--;
            }
        }
        for (int i = 0; i < 26; i++) {
            char c = 'a' + i;
            while (lower[i] > 0) {
                str += c;
                lower[i]--;
            }
        }

        // Step 3: Place sorted vowels back in original string
        int f = 0;
        int se = 0;
        while (se < str.size()) {
            if (s[f] == '#') {
                s[f] = str[se];
                se++;
            }
            f++;
        }

        return s;
    }
};
