class Solution {
    public boolean isAcronym(List<String> words, String s) {

     StringBuilder str=new StringBuilder();

        for (int i = 0; i < words.size(); i++) {

            str.append(words.get(i).charAt(0));

        }
      return str.toString().equals(s);

    }
}