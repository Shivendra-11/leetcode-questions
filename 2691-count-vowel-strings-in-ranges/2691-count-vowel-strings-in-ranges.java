class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int r = queries.length;
        ArrayList<Character> li = new ArrayList<>();
        li.add('a');
        li.add('e');
        li.add('i');
        li.add('o');
        li.add('u');
        int isvowel[] = new int[words.length];
        for (int i = 0; i < words.length; i++) {

            if (li.contains(words[i].charAt(0)) && (li.contains(words[i].charAt(words[i].length() - 1)))) {
                isvowel[i] = 1;
            } else {
                isvowel[i] = 0;
            }
        }

        // int p = 0;
        int res[] = new int[r];
        for (int i = 0; i < r; i++) {
    int count=0;
            int start = queries[i][0];
            int end = queries[i][1];
            for (int j = start; j <= end; j++) {
                count += isvowel[j];
            }

           res[i]=count;
        }

        return res;
    }
}