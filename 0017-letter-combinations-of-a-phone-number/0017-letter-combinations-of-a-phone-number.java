class Solution {
    public static void find(List<String> li, String digits,StringBuilder temp, HashMap<Character, String> mp, int idx) {
             if(idx>=digits.length()){
                 li.add(temp.toString());
                 return;

             }
           
             char ch=digits.charAt(idx);
             String str=mp.get(ch);
             for(int i=0;i<str.length();i++){
                temp.append(str.charAt(i));
                find(li,digits,temp,mp,idx+1);
                temp.deleteCharAt(temp.length() - 1); 
             }
    }

    public List<String> letterCombinations(String digits) {
     
        List<String>li=new ArrayList<>();
          if(digits.isEmpty()) return new ArrayList<>();
        HashMap<Character,String>mp=new HashMap<>();
        StringBuilder temp=new StringBuilder();
      mp.put('2',"abc");
      mp.put('3',"def");
      mp.put('4',"ghi");
      mp.put('5',"jkl");
      mp.put('6',"mno");
      mp.put('7',"pqrs");
      mp.put('8',"tuv");
      mp.put('9',"wxyz");
    
    
    find(li,digits,temp,mp,0);
    return li;

    }
}