
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int r = queries.length;
        int[] res = new int[r];

        // Set of vowels for quick lookup
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        // Preprocess the words to check if they start and end with vowels
        int[] isVowelString = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length() - 1))) {
                isVowelString[i] = 1;
            } else {
                isVowelString[i] = 0;
            }
        }

        // Process each query
        for (int i = 0; i < r; i++) {
            int count = 0;
            int start = queries[i][0];
            int end = queries[i][1];
            // Count the words that are vowel strings in the range [start, end]
            for (int j = start; j <= end; j++) {
                count += isVowelString[j];
            }
            res[i] = count;
        }

        return res;
    }
}
