class Solution {
    public String compressedString(String word) {

        StringBuilder sb=new StringBuilder();
        int cnt=1;
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==word.charAt(i+1) && cnt<9){
                cnt++;
            }else{
                sb.append(cnt).append(word.charAt(i));
                cnt=1;
            }
        }
          sb.append(cnt).append(word.charAt(word.length() - 1));
        
        return sb.toString();
    }
}