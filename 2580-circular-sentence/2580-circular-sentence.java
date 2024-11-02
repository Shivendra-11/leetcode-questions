class Solution {
    public boolean isCircularSentence(String sentence) {
        String words[] = sentence.split("\\s+");
        int i = 0;
        int j = 1;
        int n = words.length;

        while (j < n) {
            
            if (words[i].charAt(words[i].length() - 1) != words[j].charAt(0)) {
                return false;
            }
            i++;
            j++;
        }

        
        if (words[i].charAt(words[i].length() - 1) != words[0].charAt(0)) {
            return false;
        }

        return true;
    }
}
