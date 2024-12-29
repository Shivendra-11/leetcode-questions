class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int n=nums.length;
        int min = nums[0];
        int max = nums[0];
        int maxi = 0;
        int mini = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                mini = i;

            }
        }

        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxi = i;
            }
        }

     int left=Math.max(maxi,mini)+1;
     int right=Math.max(n-maxi,n-mini);
     int midi=Math.min(mini, maxi) + 1 + n - Math.max(mini, maxi);
     

   return Math.min(left,Math.min(right,midi));

    }

}
