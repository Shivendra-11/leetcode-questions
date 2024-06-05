class Solution  {
    public List<String> commonChars(String[] words) {
      
        List<String> result = new ArrayList<>();

        for(char ch='a'; ch<='z'; ch++  ){
            
            int minc=Integer.MAX_VALUE;

            for(String word: words){
                int count=0;

                for(char c : word.toCharArray()){
                    if(c==ch){
                        count++;
                        }

                }
                minc=Math.min(minc,count);
            }

            for(int i=0;i<minc;i++){
                result.add(String.valueOf(ch));
            }
        }

return result;

    }
}