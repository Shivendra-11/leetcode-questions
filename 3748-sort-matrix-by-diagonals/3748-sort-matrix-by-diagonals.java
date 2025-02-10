class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        HashMap<Integer,ArrayList<Integer>> mp=new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int key=i-j;
                if(!mp.containsKey(key)){
                    mp.put(key,new ArrayList<>());
                }
                mp.get(key).add(grid[i][j]);
            }
        }
for(ArrayList<Integer>li:mp.values()){
    Collections.sort(li);
}

for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        int key=i-j;
        if(key<0){
            grid[i][j]=mp.get(key).remove(0);
        }else{
            grid[i][j]=mp.get(key).remove((mp.get(key)).size()-1);
        }
    
    }
}
return grid;
            
    }
}