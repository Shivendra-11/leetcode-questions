class Solution {
    public List<Integer> findDuplicates(int[] nums)
     {
        int i,correct;
      ArrayList <Integer> nos=new ArrayList<Integer>();
      i=0;
      while(i < nums.length)
      {      
         correct=nums[i]-1;    
         if(nums[i]!=nums[correct])
         {       
             int t=nums[i];
             nums[i]=nums[correct];
            nums[correct]=t;
         }else{
            i++;
         }
        
      } 

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