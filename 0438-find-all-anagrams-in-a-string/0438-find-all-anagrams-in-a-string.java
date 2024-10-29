class Solution {
     public static boolean countZero(int arr[]) {
       for (int num : arr) {
           if (num != 0) {
               return false;
           }
       }
       return true;
   }
    public List<Integer> findAnagrams(String s, String p) {

int arr[]=new int[26];
ArrayList <Integer>li=new ArrayList<>();
        for(int i=0;i<p.length();i++){
            arr[p.charAt(i)-'a']++;
        }


        int i=0;
        int j=0;
        int k=p.length();
        int n=s.length();
        while(j<n){
        arr[s.charAt(j)-'a']--;
    

    if(j-i+1==k){
      if(countZero(arr)){
        li.add(i);
      }

   arr[s.charAt(i)-'a']++;
   i++;


    }
    j++;
        }
        return li;
    }
}