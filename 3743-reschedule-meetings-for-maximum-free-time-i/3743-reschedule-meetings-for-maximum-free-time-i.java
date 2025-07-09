class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
         ArrayList<Integer>li=new ArrayList<>();
         li.add(startTime[0]);
         for(int i=1;i<startTime.length;i++){
            li.add(startTime[i]-endTime[i-1]);
         }
         li.add(eventTime-endTime[endTime.length-1]);

         int i=0;
         int j=0;
         int maxi=Integer.MIN_VALUE;
         int sum=0;
         int n=li.size();
         while(j<n){
            sum+=li.get(j);
            while(i<n && j-i+1>k+1){
                    sum-=li.get(i);
                    i++;
            }
             maxi=Math.max(maxi,sum);
            j++;
         }
        
return maxi;
    
    }
}