class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int []arr=new int [spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int l=0;
            int h=potions.length-1;
            while(l<=h){
                int mid=(l+h)/2;
                if((long) spells[i] * potions[mid] >= success){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }
            arr[i]=potions.length-l;
            

        }
        return arr;

    }
}