class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxi=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    maxi=Math.max(maxi,(long)(nums[i]-nums[j])*nums[k]);
                }
            }
        }
        return maxi>0?maxi:0;
    }
}