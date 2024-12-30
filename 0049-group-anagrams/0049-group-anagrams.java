class Solution {
    public String genrate(String s){
        int arr[]=new int[26];

        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }

             StringBuilder newS = new StringBuilder();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                newS.append(String.valueOf((char)(i+'a')).repeat(arr[i]));
            }
        }
        return newS.toString();

    }
    public List<List<String>> groupAnagrams(String[] strs) {
                    
       Map<String,List<String>> mp=new HashMap<>();

      for(String s:strs){
         String sorted=genrate(s);

         if(!mp.containsKey(sorted)){
            mp.put(sorted,new ArrayList<>());
         }

         mp.get(sorted).add(s);
      }

        return new ArrayList<>(mp.values());

    }
}