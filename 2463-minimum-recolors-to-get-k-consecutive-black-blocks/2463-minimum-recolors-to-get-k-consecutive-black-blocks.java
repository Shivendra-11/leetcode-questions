class Solution {
    public int minimumRecolors(String blocks, int k) {
        char arr[] = blocks.toCharArray();
        int mini = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int c = 0;
        while (j < arr.length) {
            if (arr[j] == 'W') {
                c++;
            }
            if (j - i + 1 == k) {
                mini = Math.min(mini, c);
                if (arr[i] == 'W') {
                    c--;
                }
                i++;

            }
            j++;
        }
        return mini;
    }
}