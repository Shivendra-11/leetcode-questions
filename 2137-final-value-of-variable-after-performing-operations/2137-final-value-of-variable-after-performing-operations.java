class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int p=0;
for(int i=0;i<operations.length;i++){
        if(operations[i].equals("X++") || operations[i].equals("++X")){
            p++;
        }else{
            p--;
        }
        
    }
return p;
   }
 }