class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String wo=words[i];
           for(int j=0;j<wo.length();j++){

            if(wo.charAt(j)==x){
                li.add(i);
                break;
            }


           }
    
        }
        return li;
    }

}