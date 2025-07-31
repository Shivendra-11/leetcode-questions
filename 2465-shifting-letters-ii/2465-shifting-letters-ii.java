class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] arr = new int[s.length()];

        for (int i = 0; i < shifts.length; i++) {
            int start = shifts[i][0];
            int end = shifts[i][1];
            int direction = shifts[i][2];

            if (direction == 0) { 
                arr[start] -= 1;
                if (end + 1 < arr.length) {
                    arr[end + 1] += 1;
                }
            } else { 
                arr[start] += 1;
                if (end + 1 < arr.length) {
                    arr[end + 1] -= 1;
                }
            }
        }

        
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }

    
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int shift = ((s.charAt(i) - 'a') + arr[i]) % 26;
            if (shift < 0) shift += 26; 
            char shiftedChar = (char) ('a' + shift);
            res.append(shiftedChar);
        }

        return res.toString();
    }
}
