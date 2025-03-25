class Solution {
    public static boolean find(int arr[]){
        for(int n:arr){
            if(n!=0){
                return false;
            }
          
        }
          return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int freq[]=new int[26];
        // int freq2[]=new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        int i=0;
        int j=0;
        int count=s1.length();
        while(j<s2.length()){
            // if(freq[s2.charAt(j)-'a']>0){
            //     count--;
            // }
            freq[s2.charAt(j)-'a']--;
            if(j-i+1==s1.length()){
                 if(find(freq)){
                    return true;
                 }
                  freq[s2.charAt(i)-'a']++;
                  i++;
            }
            j++;
        }
        return false;
        
    }
}