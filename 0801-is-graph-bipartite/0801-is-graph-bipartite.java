class Solution {
    public boolean isBipartite(int[][] graph) {
        int color[]=new int[graph.length];
       Arrays.fill(color,-1);
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                q.offer(i);
                color[i]=0;
                while(!q.isEmpty()){
                    int node=q.poll();
                    for(int j=0;j<graph[node].length;j++){
                        if(color[graph[node][j]]==-1){
                            color[graph[node][j]]=1-color[node];
                            q.offer(graph[node][j]);
                        }else if(color[graph[node][j]]==color[node]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}