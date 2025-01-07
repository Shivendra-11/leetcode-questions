class Solution {
    public List<String> stringMatching(String[] words) {

        HashSet<String> li = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            for (int j = 0; j < words.length; j++) {
                if(i==j){
                    continue;
                }
                if (words[j].contains(str)) {
                    li.add(str);
                }
            }
        }
List<String> resultList = new ArrayList<>(li);

        return resultList;

    }
}