class Solution {
    public int trap(int[] height) {
        int leftmax=0;
        int idx=0;
        int rightmax=0;
        int max=height[0];
        int res=0;
        int n=height.length;
        for(int i=1;i<n;i++){
            if(max<height[i]){
            max=height[i];
              idx=i;
            }
          
        }
        for(int i=0;i<idx;i++){
            if(height[i]<leftmax){
       res+=leftmax-height[i];
            }
            else{
                leftmax=height[i];
            }
        }

    for(int i=n-1;i>idx;i--){
            if(rightmax>height[i]){
       res+=rightmax-height[i];
            }
            else{
                rightmax=height[i];
            }
        }
        return res;
    }
}