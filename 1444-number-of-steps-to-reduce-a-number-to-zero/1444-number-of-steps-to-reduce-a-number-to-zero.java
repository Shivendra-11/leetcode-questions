class Solution {

public static int count(int n ){
    return helper(n,0);
}
    public static int helper(int n  , int c  ){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return helper(n/2,c+1);
            
        }
        return helper(n-1,c+1);
        
    }
    public int numberOfSteps(int num) {
     
        return count(num);

        
    }
}