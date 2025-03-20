class Solution {
    public static boolean palindrome(String s,int idx,int i){

              while(idx<=i){
                if(s.charAt(idx)!=s.charAt(i)){
                     return false;
                }
                idx++;
                i--;
              }
              return true;
    }

    public static void gen(String s, int idx, List<List<String>> res, List<String> li) {
        if (idx == s.length()) {
            res.add(new ArrayList<>(li));
            return;
        }
        for (int i = idx; i < s.length(); i++) {
            if (palindrome(s, idx, i)) {
                li.add(s.substring(idx, i + 1));
                gen(s, i + 1, res,li);
                li.remove(li.size() - 1);
            }

        }

    }


    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> li = new ArrayList<>();
        gen(s, 0, res, li);
        return res;
    }

    
}