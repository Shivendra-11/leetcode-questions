class Solution {
    public static boolean hasduplicate(String temp,String s2){
        int freq[]=new int[26];
        for(int i=0;i<s2.length();i++){
            if(freq[s2.charAt(i)-'a']>0){
                return true;
            }
            freq[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<temp.length();i++){
            if(freq[temp.charAt(i)-'a']>0){
                return true;
            }
        }
        return false;
    }
    public static int ismax(List<String>arr,int i,String temp){
        if(i>=arr.size()){
            return temp.length();
        }
        int include=0;
        int exclude=0;
        if(hasduplicate(temp,arr.get(i))){
            exclude=ismax(arr,i+1,temp);
        }else{
            include=ismax(arr,i+1,temp+arr.get(i));
            exclude=ismax(arr,i+1,temp);
        }
        return Math.max(include,exclude);
    }
    public int maxLength(List<String> arr) {
        String temp="";
        return ismax(arr,0,temp);
    }
}