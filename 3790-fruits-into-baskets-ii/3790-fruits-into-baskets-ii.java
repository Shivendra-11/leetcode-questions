class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] basket) {
        int c=0;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<fruits.length;j++){
                if(fruits[i]<=basket[j]){
                    basket[j]=-1;
                
                    c++;
                        break;
                }
            }
        }
        return c==fruits.length?0:fruits.length-c;
    }
}