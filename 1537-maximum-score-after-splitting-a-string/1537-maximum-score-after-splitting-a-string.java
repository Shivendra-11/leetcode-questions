class Solution {
    public int maxScore(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                sum++;
            }
        }
        int sum_o=0;
        int maxi=0;
        // int sumi=0;
        for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)=='0'){
                         sum_o++;
                }else{
                    sum--;
                }
                maxi=Math.max(maxi,sum+sum_o);

        }
        return maxi;
    }
}