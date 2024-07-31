class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();
        int first=0;
        int second=0;
        char str1 []=haystack.toCharArray();
          char str2 []=needle.toCharArray();
        

       for(int i=0;i<=m-n;i++){
        first=i;
        second=0;
        while(second<n){
            if(str1[first]!=str2[second]){
                break; 
            }else{
                first++;
                second++;
            }
        }
        if(second==str2.length){
            return first-second;
        }

       }
       return -1;

        
    }
}