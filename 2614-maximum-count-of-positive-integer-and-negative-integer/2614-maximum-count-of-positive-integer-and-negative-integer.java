class Solution {
    public int maximumCount(int[] nums) {
        IntPredicate LambdaP=num->num>0;
        IntPredicate LambdaN=num->num<0;
        int p=(int) Arrays.stream(nums).filter(LambdaP).count();
        int n=(int) Arrays.stream(nums).filter(LambdaN).count();
        

        return Math.max(p,n);
    }
}