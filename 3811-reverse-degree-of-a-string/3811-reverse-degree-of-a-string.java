class Solution {
    public int reverseDegree(String s) {
        char arr[]=s.toCharArray();
        int sum=0;
        for(int i=0;i<s.length();i++){
                  int p2=26-(arr[i]-'a');
                  sum+=(i+1)*p2;
        }
        return sum;

    }
}