class Solution {
    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        ArrayList<Integer>li=new ArrayList<>();
         li.add(startTime[0]);
         for(int i=1;i<startTime.length;i++){
            li.add(startTime[i]-endTime[i-1]);
         }
         li.add(eventTime-endTime[endTime.length-1]);

         int maxright[]=new int[li.size()];
         int maxleft[]=new int[li.size()];
        maxright[maxright.length-1]=0;
         for(int i=li.size()-2;i>=0;i--){
            maxright[i]=Math.max(maxright[i+1],li.get(i+1));
         }
         maxleft[0]=0;
         for(int i=1;i<maxleft.length;i++){
            maxleft[i]=Math.max(maxleft[i-1],li.get(i-1));
         }
         
         int res=0;
         for(int i=1;i<li.size();i++){
            int duration=endTime[i-1]-startTime[i-1];
            if(duration<=Math.max(maxright[i],maxleft[i-1])){
                res=Math.max(res,(duration+li.get(i)+li.get(i-1)));
            }
            res=Math.max(res,li.get(i)+li.get(i-1));
         }
         return res;
    
    }
}