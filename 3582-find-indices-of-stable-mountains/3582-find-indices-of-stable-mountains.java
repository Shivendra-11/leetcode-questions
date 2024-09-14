class Solution {
    public List<Integer> stableMountains(int[] height, int g) {
        
       ArrayList<Integer> li=new ArrayList<>();
        for(int i=1;i<height.length;i++){
            if(height[i-1]>g){
                li.add(i);
            }
        }
            return li;
    }

}