class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String str1[]=s1.split(" ");
        String str2[]=s2.split(" ");

        HashMap<String ,Integer> mp= new HashMap<>();
        for(String word:str1){
            mp.put(word,mp.getOrDefault(word, 0) + 1);

        }
               for(String word:str2){
            mp.put(word,mp.getOrDefault(word,0)+1);

        }
        ArrayList<String> li=new ArrayList<>();
        for(String word:mp.keySet()){
            if(mp.get(word)==1)
            li.add(word);

        }
  return li.toArray(new String[li.size()]);
             
        
    }
   
}