class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer>left=new ArrayList<>();
        ArrayList<Integer>equal=new ArrayList<>();
        ArrayList<Integer>right=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                left.add(nums[i]);
            }else if(nums[i]==pivot){
                equal.add(nums[i]);
            }else{
                right.add(nums[i]);
            }
        }
        int p=0;
        int num[]=new int[nums.length];
        for(int tum:right) num[p++]=tum; 
        for(int tum:equal) num[p++]=tum;
        for(int tum:left) num[p++]=tum;
        
        return num;
    }
}