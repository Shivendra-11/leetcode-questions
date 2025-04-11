class Solution {
    public boolean check(int n){
        int digit=0;
        int sum=0;
        // int p=n;
        int sum2=0;
        String str=Integer.toString(n);
        int p=str.length();
        String p1=str.substring(0,p/2);
        String p2=str.substring(p/2);
        for(int i=0;i<p1.length();i++){
            sum+=p1.charAt(i)-'0';
        }
         for(int i=0;i<p2.length();i++){
            sum2+=p2.charAt(i)-'0';
        }
        return sum==sum2?true:false;
    } 
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        
        for(int i=low;i<=high;i++){
            String q=Integer.toString(i);
           if(q.length()%2!=0) {continue;}
            else if((check(i))){
                c++;
            }
        }
        return c;
    }
}