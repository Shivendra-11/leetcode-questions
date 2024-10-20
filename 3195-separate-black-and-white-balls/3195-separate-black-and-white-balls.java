class Solution {
    public long minimumSteps(String s) {
    
    int left=0;
    int n=s.length();

    while(left<n && s.charAt(left)!='1' ){
        left++;
    }
    long count=0;
    for(int i=left+1;i<n;i++){
        if(s.charAt(i)=='0'){
               count+=i-left;
                left++;
        }
       
    }
    return count ;
        
    }
}