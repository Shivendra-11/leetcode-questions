class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = -1;
        
        for (String sentence : sentences) {
            int count = 1; // Start at 1 to count the first word
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == ' ') {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        
        return max;
    }
}
