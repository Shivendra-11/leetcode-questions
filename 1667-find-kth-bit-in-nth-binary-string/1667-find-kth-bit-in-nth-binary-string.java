class Solution {
    public static StringBuilder rev(StringBuilder s) {
        // Reverse the string
        return s.reverse();
    }

    public static void gen(StringBuilder s, int n, int i) {
        if (i == n) {
            return;
        }

        StringBuilder temp = new StringBuilder();
        int len = s.length();
        
        // Generate the inverse of the current string
        for (int j = 0; j < len; j++) {
            char ch = (s.charAt(j) == '0' ? '1' : '0');
            temp.append(ch);
        }

        // Reverse the inverted string
        temp = rev(temp);

        // Append '1' and the reversed inverted string
        s.append('1').append(temp);

        // Recursive call
        gen(s, n, i + 1);
    }

    public char findKthBit(int n, int k) {
        StringBuilder s = new StringBuilder("0");
        gen(s, n, 1);
        return s.charAt(k - 1);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.findKthBit(3, 5)); 
    }
}
