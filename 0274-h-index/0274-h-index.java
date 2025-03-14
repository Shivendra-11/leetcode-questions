class Solution {
    public int hIndex(int[] citations) {
        // [0 1 3 5 6 ]
        // [0 1 2 3 4 ]
        // if(citations[0]==0 && citations.length<=2 && citations[1]!=1 ) return 0;
        Arrays.sort(citations);
        int h=0;
        for (int i = 0; i < citations.length; i++) {
            int rem = citations.length - i;
            if (citations[i] >= rem) {
                h= rem;
                break;

            }
        }
        return h;

    }
}