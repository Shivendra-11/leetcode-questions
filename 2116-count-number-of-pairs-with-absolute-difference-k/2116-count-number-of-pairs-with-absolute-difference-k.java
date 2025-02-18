class Solution {
    public int countKDifference(int[] nums, int k) {
        Arrays.sort(nums);
    int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int diff=Math.abs(nums[i]-nums[j]);
                if(diff==k) c++;

            }
        }
        return c;
    }
}