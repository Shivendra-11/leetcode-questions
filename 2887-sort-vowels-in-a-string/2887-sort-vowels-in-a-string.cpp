class Solution {
public:
    string sortVowels(string s) {
        vector<int> lower(26, 0);
        vector<int> upper(26, 0);
        string vowels;

        // Step 1: Collect vowels and mark placeholders
        for (int i = 0; i < s.size(); i++) {
            if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
                lower[s[i] - 'a']++;
                vowels += s[i];
                s[i] = '#';
            } else if (s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U') {
                upper[s[i] - 'A']++;
                vowels += s[i];
                s[i] = '#';
            }
        }

        // Step 2: Sort the collected vowels
        sort(vowels.begin(), vowels.end());

        // Step 3: Replace placeholders in original string with sorted vowels
        int vowelIndex = 0;
        for (int i = 0; i < s.size(); i++) {
            if (s[i] == '#') {
                s[i] = vowels[vowelIndex++];
            }
        }

        return s;
    }
};
