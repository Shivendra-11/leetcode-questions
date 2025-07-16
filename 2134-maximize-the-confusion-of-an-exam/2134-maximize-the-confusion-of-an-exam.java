class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        HashMap<Character,Integer>mp=new HashMap<>();
        int i=0;
        int j=0;
        int n=answerKey.length();
        int res=0;
        while(j<n){
          mp.put(answerKey.charAt(j),mp.getOrDefault(answerKey.charAt(j),0)+1);
        
            while(Math.min(mp.getOrDefault('T',0),mp.getOrDefault('F',0))>k){
                mp.put(answerKey.charAt(i),mp.getOrDefault(answerKey.charAt(i),0)-1);
                i++;
            }
            res=Math.max(res,j-i+1);
            j++;
        }
     return res;
        
    }
}