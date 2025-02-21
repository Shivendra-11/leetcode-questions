class Solution {
    public static void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        
           }

    public static ArrayList<Integer> tolist(int nums[]){
        ArrayList<Integer> li=new ArrayList<>();
        for(int n:nums){
            li.add(n);
        }
        return li;
    } 
    public static void gen(Set<List<Integer>> ans,int []nums,int idx,int n){
        if(idx==n){
            ans.add(tolist(nums));
            return;
        }
        for(int i=idx;i<n;i++){
         swap(nums,i,idx);
        gen(ans,nums,idx+1,n);
        swap(nums,i,idx);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        gen(ans,nums,0,nums.length);
        List<List<Integer>> anset=new ArrayList<>(ans);
        
        return anset;
        
    }
}