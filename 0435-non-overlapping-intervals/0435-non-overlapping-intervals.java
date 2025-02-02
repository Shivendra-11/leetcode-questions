class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int i = 0;
        int j = 1;
        int n = intervals.length;
        int c=0;
        while (j < n) {

            int current_i[] = intervals[i];
            int next_i[] = intervals[j];

            int cs = current_i[0];
            int ce = current_i[1];

            int ns = next_i[0];
            int ne = next_i[1];
// non overlapping
            if(ce<=ns){
                i=j;
                j++;
            }
            // Overlapping
            else if(ce>=ne){
                c++;
                i=j;
                j++;
            }else if(ce<ne){
                j++;
                c++;
            }

        }
        return c;

    }
}