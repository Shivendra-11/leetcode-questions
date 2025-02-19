class Solution {
    public static void gen(int arr[],List<List<Integer>> ans, ArrayList<Integer> temp,int i,int n){
        if(i==n){
            ans.add(new ArrayList<>(temp));
            return ;
        }

        temp.add(arr[i]);
        gen(arr,ans,temp,i+1,n);
        temp.remove(temp.size()-1);
        gen(arr,ans,temp,i+1,n);
    }
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
       ArrayList<Integer> temp=new ArrayList<>();
       gen(nums,ans,temp,0,nums.length);
       return ans; 
    }
}