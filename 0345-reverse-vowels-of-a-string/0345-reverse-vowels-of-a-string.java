class Solution {
    public static void reverse(StringBuilder sb, int i, int j) {
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
    }

    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        String vowel = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);

        while (i < j) {
            if (!vowel.contains(sb.charAt(i) + "")) {
                i = i + 1;
            }

            if (!vowel.contains(sb.charAt(j) + "")) {
                j = j - 1;
            }

            if (vowel.contains(sb.charAt(i) + "") && vowel.contains(sb.charAt(j) + "")) {
                reverse(sb, i, j);
                i++;
                j--;
            }
        }

        return sb.toString();
    }
}
