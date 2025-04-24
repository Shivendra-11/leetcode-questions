class Solution {
    public static boolean check(int freq[]){
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                return false;
            }
        }
        return true;
    }
    public int countCompleteSubarrays(int[] nums) {
        int freq[]=new int[2001];
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]]==0){
            freq[nums[i]]++;
            }
        }
         int i=0;
         int n=nums.length;
        int j=0;
        int res=0;
        while(j<n){
            freq[nums[j]]--;
            while(check(freq)){
                res+=n-j;
                freq[nums[i]]++;
                i++;
            }
            j++;

        }
        return res;
    }
}