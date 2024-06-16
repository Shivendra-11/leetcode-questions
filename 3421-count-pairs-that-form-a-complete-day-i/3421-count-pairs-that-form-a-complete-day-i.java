class Solution {
    public int countCompleteDayPairs(int[] hours) {

        // int i=0;
        

        int c=0;
        for(int i=0;i<hours.length;i++){
             for(int j=i+1;j<hours.length;j++){
                int x=hours[i]+hours[j];
                if(x>=24 && x%24==0){
                    c++;
                }
             }
        }
        return c;
    }
}