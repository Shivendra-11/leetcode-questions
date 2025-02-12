import java.util.*;

class Solution {
    public static int sumd(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int maximumSum(int[] nums) {
      int maxi=-1;
      int arr[]=new int[82];
    //   int maxi=-1;
      for(int i=0;i<nums.length;i++){
        int ds=sumd(nums[i]);
        if(arr[ds]>0){
            maxi=Math.max(maxi,arr[ds]+nums[i]);
        }
        arr[ds]=Math.max(arr[ds],nums[i]);
      }
      return maxi;

    }
}
