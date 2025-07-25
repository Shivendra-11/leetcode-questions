class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer>st=new HashSet<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
            st.add(nums[i]);
        }
         if(st.isEmpty()){
             return Arrays.stream(nums).max().getAsInt();
         }
        for(int a:st){
            sum+=a;
        }
        return sum;
    }
}