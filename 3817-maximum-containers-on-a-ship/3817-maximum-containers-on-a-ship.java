class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int c=0;
        int we=0;
        for(int i=0;i<n*n;i++){
            we+=w;
           
             if(we>maxWeight){
                break;
            }
             c++;
        }
        return c;
    }
}