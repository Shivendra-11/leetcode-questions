class Solution {
    int row[]={1,-1,0,0};
    int col[]={0,0,-1,1};
    int r;
    int c;
    public boolean valid(int i,int j){
        return i>=0&&j>=0&&i<r&&j<c;
    }
    public int orangesRotting(int[][] grid) {
         r=grid.length;
        int time=0;
         c=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        boolean hasfresh=false;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    hasfresh=true;
                }
               else if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                    grid[i][j]=0;
                }
            }
        }
        if(!hasfresh) {return 0;}

            while(!q.isEmpty()){
                int curr=q.size();
                time+=1;
                while(curr-- > 0){
                    int arr[]=q.poll();
                    int f=arr[0];
                    int s=arr[1];
                    for(int k=0;k<4;k++){
                        if(valid(f+row[k],s+col[k])&&grid[f+row[k]][s+col[k]]==1){
                            q.offer(new int[]{f+row[k],s+col[k]});
                            grid[f+row[k]][s+col[k]]=0;
                        }
                    }
                }
            }
              for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
            
        
        return time-1;
    }
}