class Solution {
    public int minimumLength(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']>=3){
                arr[s.charAt(i)-'a']=arr[s.charAt(i)-'a']-2;
            }
        }
        // calculate length
        int sum=0;
        for(int i=0;i<26;i++){
            sum+=arr[i];
        }
        return sum;
    }
}