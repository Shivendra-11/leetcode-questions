class Solution {
    public int maxArea(int[] height) {
     
       int i=0;
       int j=height.length-1;
       int area=-1;
       while(i<j)
       {

       area=Math.max(area,Math.min(height[i],height[j])*(j-i));
                if(height[i]>=height[j]){
                    j--;
                }else{
                    i++;
                }    

       }
return area;
    }
}