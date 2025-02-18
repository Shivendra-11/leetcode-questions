class Solution {
    public static void gen(int arr[], List<List<Integer>> ans, ArrayList<Integer> temp, int target, int i) {
       
       if(i==arr.length || target<0 ){
        if(target==0){
            ans.add(new ArrayList<>(temp));
        }
        return;
       }

       temp.add(arr[i]);
    gen(arr,ans,temp,target-arr[i],i);
    temp.remove(temp.size()-1);

    gen(arr,ans,temp,target,i+1);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> ans=new ArrayList<>();
            ArrayList<Integer> temp=new ArrayList<>();
             gen(candidates,ans,temp,target,0);
             return ans;
    }
}