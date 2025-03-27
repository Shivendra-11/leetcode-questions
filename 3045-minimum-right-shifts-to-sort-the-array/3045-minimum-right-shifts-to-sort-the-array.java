class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        ArrayList<Integer> li=new ArrayList<>(nums);
        Collections.sort(li);
        int c=0;
        for(int i=0;i<li.size();i++){
            if(!li.equals(nums)){
                Collections.rotate(nums,1);
                c++;
            }
        }
        if(!nums.equals(li)){
            c=-1;
        }
        return c;

    }
}