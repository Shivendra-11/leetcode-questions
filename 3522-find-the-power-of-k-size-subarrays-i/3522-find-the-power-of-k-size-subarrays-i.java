class Solution {
    public int[] resultsArray(int[] nums, int k) {
         boolean iscons=true;
        ArrayList<Integer>li=new ArrayList<>();
        for(int i=0;i<=nums.length-k;i++){
            iscons=true;
               for(int j=i+1;j<i+k;j++){
                   if(nums[j-1]!=nums[j]-1){
                        iscons=false;
                        break;
                   }
               }
               if(iscons){
                   li.add(nums[i+k-1]);
               }else{
                   li.add(-1);
               }
        }
        int arr[]=new int[li.size()];
        for(int i=0;i<li.size();i++){
            arr[i]=li.get(i);
        }
        return arr;
    }
}