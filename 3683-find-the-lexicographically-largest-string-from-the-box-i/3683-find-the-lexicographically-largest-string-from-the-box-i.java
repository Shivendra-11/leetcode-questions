class Solution {
    public String answerString(String word, int numFriends) {
        StringBuilder str=new StringBuilder(word);
        if (numFriends==1) return word;

        ArrayList<String>li=new ArrayList<>();
        int len=word.length()-(numFriends-1);
        for(int i=0;i <= word.length();i++){
            if(i+len<=word.length()){
            li.add(word.substring(i,i+len));
            }
            else{
                li.add(word.substring(i));
            }
        }
        Collections.sort(li);
        return li.get(li.size()-1);
    }

}