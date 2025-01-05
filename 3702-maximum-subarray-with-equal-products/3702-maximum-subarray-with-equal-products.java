class Solution {
    public static int gcd(int a,int b ){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static int lcm(int a,int b){

        return a*b/(gcd(a,b));
    }
    public int maxLength(int[] nums) {
int maxi=-1;
        for(int i=0;i<nums.length;i++){

            int pro=nums[i];
            int gcde=nums[i];
            int lcme=nums[i];

            for(int j=i+1;j<nums.length;j++){
                pro*=nums[j];
                gcde=gcd(gcde,nums[j]);
                lcme=lcm(lcme,nums[j]);

                if(pro==gcde*lcme){
                    maxi=Math.max(maxi,j-i+1);
                }
            }
        }
return maxi;

    }
}