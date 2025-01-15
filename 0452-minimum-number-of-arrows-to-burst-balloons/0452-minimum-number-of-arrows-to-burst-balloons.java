class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int prev[]=points[0];
        int c=1;
        for(int i=1;i<points.length;i++){
            int curs=points[i][0];
            int cure=points[i][1];

            int prevs=prev[0];
            int preve=prev[1]; 
            if(curs>preve){
                     c++;
                     prev=points[i];    
            } else{
                // prev[0]=Math.max(preve,curs);
                prev[1]=Math.min(preve,cure);
            }
        }
        return c;
    }
}