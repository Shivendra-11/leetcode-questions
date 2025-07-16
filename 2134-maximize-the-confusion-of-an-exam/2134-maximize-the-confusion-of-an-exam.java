class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int i=0;
        int j=0;
        int n=answerKey.length();
        int res=0;
        int count=k;
        //  case F->T
        while(j<n){
            char ch=answerKey.charAt(j);
            if(ch=='F'){
                count--;
            }
            while(j<n && count<0){
                if(answerKey.charAt(i)=='F'){
                    count++;
                }
                i++;
            }
            res=Math.max(res,j-i+1);
            j++;

        }
        // case 2:-"T"->"F":
          i=0;
          j=0;
          count=k;
        while(j<n){
            char ch=answerKey.charAt(j);
            if(ch=='T'){
                count--;
            }
            while(j<n && count<0){
                if(answerKey.charAt(i)=='T'){
                    count++;
                }
                i++;
            }
            res=Math.max(res,j-i+1);
            j++;
        }

     return res;

    }
}