class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        int start=0;
        int end=0;
        int day=0;
        for(int i=0;i<meetings.length;i++){
            if(meetings[i][0]>end){
                day+=meetings[i][0]-end-1;
            }
            end=Math.max(meetings[i][1],end);
        }
        if(end<days){
            day+=days-end;
        }
        return day;
    }
}