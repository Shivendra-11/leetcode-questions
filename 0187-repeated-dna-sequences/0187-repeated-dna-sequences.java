class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
     
        HashSet <String> h = new HashSet<>();
        HashSet <String> h1 = new HashSet<>();
        for(int i = 0; i <= s.length() - 10; i++)
        {
            String st = s.substring(i,i+10);
            if(!h.contains(st))
            {   
                h.add(st);
            }
            else 
            {
               h1.add(st);
            }
        }
        List <String> a = new ArrayList<>(h1);
        return a;

    }
}