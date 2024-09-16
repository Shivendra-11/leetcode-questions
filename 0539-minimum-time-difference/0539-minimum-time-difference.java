class Solution {
    public int findMinDifference(List<String> timepoints) {

        int min[]=new int[timepoints.size()];
        for(int i=0;i<timepoints.size();i++){

            String time=timepoints.get(i);
            int h=Integer.parseInt(time.substring(0,2));
            int m=Integer.parseInt(time.substring(3));
            min[i]=h*60+m;
        }

        Arrays.sort(min);

        int x=Integer.MAX_VALUE;

        for(int i=0;i<min.length-1;i++){
            x=Math.min(x,min[i+1]-min[i]);
        }

        int ans=Math.min(x,1440-min[min.length-1]+min[0]);
           



return ans;
        
        
    }
}