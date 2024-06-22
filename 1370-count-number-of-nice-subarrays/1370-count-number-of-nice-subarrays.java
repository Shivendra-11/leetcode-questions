class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        int l=0;
        int r=0;
        int cnt=0;
        int ans=0;
        int odd=0;
        int n=nums.length;
        while(r<n){
            if(nums[r]%2!=0){
                odd++;
                cnt=0;
            }
            while(odd == k){
                   cnt++;
                   odd -=nums[l++]&1;
            }
            ans +=cnt;
            r++;
        }
        return ans ;
    }

}