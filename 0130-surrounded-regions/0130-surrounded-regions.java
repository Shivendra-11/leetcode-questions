class Solution {
     int r;
    int c;
    int row[]={1,-1,0,0};
    int col[]={0,0,-1,1};
    public boolean valid(int i,int j){
        return i>=0&&i<r&&j>=0&&j<c;
    }
    public void solve(char[][] grid) {
         Queue<int[]>q=new LinkedList<>();
       r=grid.length;
       c=grid[0].length;
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               if(i==0||j==0||i==r-1||j==c-1){
                   if(grid[i][j]=='O'){
                       q.offer(new int[]{i,j});
                       grid[i][j]='p';
                       while(!q.isEmpty()){
                           int arr[]=q.poll();
                           int f=arr[0];
                           int s=arr[1];
                           for(int k=0;k<4;k++){
                               if(valid(f+row[k],s+col[k])&&grid[f+row[k]][s+col[k]]=='O'){
                                   q.offer(new int[]{f+row[k],s+col[k]});
                                   grid[f+row[k]][s+col[k]]='p';
                               }
                           }
                       }
                   }
               }
           }
       }
       
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               if(grid[i][j]=='O'){
                   grid[i][j]='X';
               }else if(grid[i][j]=='p'){
                   grid[i][j]='O';
               }
           }
       } 
    }
}