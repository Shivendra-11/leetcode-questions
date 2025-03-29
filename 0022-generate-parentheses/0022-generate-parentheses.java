class Solution {
    public static void genrate(ArrayList<String> ans, int o, int c, StringBuilder str, int l) {
        if ((o + c) == 2 * l) {
            ans.add(str.toString());
            return;
        }
        if (o < l) {
            str.append('(');
            genrate(ans, o + 1, c, str, l);
            str.setLength(str.length() - 1);

        }

        if (c < o) {
            str.append(')');
            genrate(ans, o, c + 1, str, l);
            str.setLength(str.length() - 1);
        }

    }

    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        genrate(ans, 0, 0, str, n);
        return ans;

    }
}