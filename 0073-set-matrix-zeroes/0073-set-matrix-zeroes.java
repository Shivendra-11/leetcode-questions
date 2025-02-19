class Solution {
    public void setZeroes(int[][] nums) {
        int n=nums.length;
        int m=nums[0].length;
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums[i][j]==0){
                    s1.add(i);
                    s2.add(j);
                }
            }
        }

        // for row
        for(int num:s1 ){
            for(int j=0;j<m;j++){
                nums[num][j]=0;
            }
        }
        // for col
        for(int num:s2 ){
            for(int i=0;i<n;i++){
                nums[i][num]=0;
            }
        }
        
    }
}