class Solution {
    public List<Integer> findDuplicates(int[] nums)
     {
        int i,correct;
      ArrayList <Integer> nos=new ArrayList<Integer>();
      i=0;
      while(i < nums.length)
      {      // applying cyclic sort
          correct=nums[i]-1;    //checking if the element is in correct position
         if(nums[i]!=nums[correct])
         {       //swapping the misplaced elemts in the correct place
             int t=nums[i];
             nums[i]=nums[correct];
            nums[correct]=t;
         }
         else
         i++;
      } 
     //after sorting the element only the duplicate element will be in  incorrect place therefore we will find it and return it
      for(i=0;i<nums.length;i++)
      {     
          if(nums[i]!=i+1)
         {  
            nos.add(nums[i]);
         }  
      }
      return nos; 
    }
}