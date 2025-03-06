class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       HashMap<Integer,Integer>mp=new HashMap<>();
       int n=grid.length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                mp.put(grid[i][j],mp.getOrDefault(grid[i][j],0)+1);
            }
        }
        int mis=-1;
        int rep=-1;
        int arr[]=new int[2];
        for(int i=1;i<=n*n;i++){
            if(!mp.containsKey(i)){
              mis=i;  
            }
            else if(mp.get(i)>1){
                rep=i;
            }
        }
       arr[0]=rep;
       arr[1]=mis;

       return arr;

    }
}