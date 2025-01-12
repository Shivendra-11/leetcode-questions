class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
int n=nums.length;
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
int dup=-1;
int mismatch=-1;
int []temp=new int[2];
        for(int i=1;i<=n;i++){
            if(mp.containsKey(i)){
                if(mp.get(i)==2){
                    dup=i;
                }
            }else{
                mismatch=i;
            }
        }
        temp[0]=dup;
        temp[1]=mismatch;
        return temp;
    }
}