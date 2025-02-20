import java.util.*;

class Solution {
    public static boolean finds(int nums[], int low, int high) {
        
        int[] subarray = Arrays.copyOfRange(nums, low, high + 1);
        Arrays.sort(subarray); 

        int diff = subarray[1] - subarray[0];

        for (int i = 1; i < subarray.length - 1; i++) {
            if (subarray[i + 1] - subarray[i] != diff) {
                return false;
            }
        }
        return true;
    }

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> li = new ArrayList<>();
        
          for(int i=0;i<l.length;i++){
            int low=l[i];
            int high=r[i];
            if(finds(nums,low,high)){
                li.add(true);
            }else{
               li.add(false);
            }
        }
        return li;
        
        
    }

   
}
