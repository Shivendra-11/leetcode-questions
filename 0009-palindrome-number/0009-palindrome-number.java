class Solution {
    public boolean isPalindrome(int x) {
      int n=x;
      int res=0;
      while(x>0){
        int rem=x%10;
        res=res*10+rem;
        x=x/10;
        }
      if(n!=res){
        return false;
      }
      else{
        return true;
      }
        
    }
}

