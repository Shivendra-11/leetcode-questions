class Solution {
    public void swap(int arr[],int i,int ci){
        int temp=arr[i];
        arr[i]=arr[ci];
        arr[ci]=temp;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int j=0;
        int n=nums.length;
        while(j<n){
            int ci=nums[j]-1;
            if(nums[j]!=nums[ci]){
                swap(nums,j,ci);
            }else{
                j++;
            }
        }
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!= i+1){
                li.add(i+1);
            }
        }
        return li;
    }
}