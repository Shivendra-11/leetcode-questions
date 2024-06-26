class Solution {
    public int lengthOfLongestSubstring(String s) {

        boolean arr[]=new boolean[256];
       Arrays.fill(arr, false);
        int l=0;
        int r=0;
        int maxlen=0;

        while(r<s.length()){
            while(arr[s.charAt(r)]){
                arr[s.charAt(l)]=false;
                l++;

            }
            arr[s.charAt(r)]=true;
            r++;
            maxlen=Math.max(maxlen,r-l);
        }
        
        return maxlen;
    }
}