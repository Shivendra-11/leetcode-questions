class Solution {
    public boolean checkIfPangram(String sentence) {
        int arr[]=new int[26];
        Arrays.fill(arr,0);
        for(int i=0;i<sentence.length();i++){
           
              arr[sentence.charAt(i)-'a']=1;
        }
        for(int j=0;j<26;j++){
        if(arr[j]==0){
            return false;
        }
        }
        return true;
    }
}