class Solution {
    public int[] minOperations(String boxes) {
        
int res[]=new int[boxes.length()];
char arr[]=boxes.toCharArray();
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(i==j) continue;
                else if(arr[j]=='1'){
                    c+=Math.abs(i-j);
                }
            }
            res[i]=c;
        }
        return res;
    }
}