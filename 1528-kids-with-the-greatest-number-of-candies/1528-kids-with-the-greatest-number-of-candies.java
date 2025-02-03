class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int n) {
        // boolean arr[] = new boolean[candies.length];
        ArrayList<Boolean> li=new ArrayList<>();
        int max=candies[0];
      for(int i=0;i<candies.length;i++){
        if(candies[i]>max){
            max=candies[i];
        }
      }
        // int max = candies[candies.length - 1];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + n >= max) {
                li.add(true);
            } else {
                li.add(false);
            }
        }
        return li;
    }
}