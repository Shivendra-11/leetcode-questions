class Solution {
    public boolean isBalanced(String num) {
        
         char arr[]=num.toCharArray();
         int even=0;
         int odd=0;
        for(int i=0;i<arr.length;i++){
            int ch=arr[i]-'0';
            if(i%2==0){
                even+=ch;
            }else{
                odd+=ch;
            }
        }
        if(even==odd){
            return true;
        }
        return false;
    }
}