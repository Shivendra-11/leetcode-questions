class Solution {
    public int maxVowels(String s, int k) {
        int i = 0;
        int j = 0;
        int n = s.length();
        int count = 0;
        int maxi=0;
        while (j < n) {
            char ch = s.charAt(j);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
            if (j - i + 1 == k) {
                maxi = Math.max(maxi, count);
                char cp = s.charAt(i);
                if (cp == 'a' || cp == 'e' || cp == 'i' || cp == 'o' || cp == 'u') {
                    count--;
                }
                i++;
            }
            j++;

        }
        return maxi;

    }
}