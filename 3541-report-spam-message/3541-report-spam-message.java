import java.util.HashSet;

class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        int c=0;
        HashSet<String> li = new HashSet<>();
        for(String word:bannedWords){
            li.add(word);
        }
        for(String word:message){
            if(li.contains(word)){
                c++;
            }
            if(c>=2){
                return true;
            }
        }
        
        return false;
    }
}
