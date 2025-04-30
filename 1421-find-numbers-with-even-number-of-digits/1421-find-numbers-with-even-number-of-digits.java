class Solution {
    public static int find(int n){
        int c=0;
        while(n>0){
            n=n/10;
            c++;
        }
        return c%2==0?1:0;
    }
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            
            if(find(nums[i])==1){
                c++;
            }
        }
        return c;
    }
}