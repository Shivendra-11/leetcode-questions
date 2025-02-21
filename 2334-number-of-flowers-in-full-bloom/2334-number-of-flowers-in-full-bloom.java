class Solution {
    public static int binarys(int nums[],int x ){
        int l=0;
        int h=nums.length-1;
        int res=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]<=x){
                res=mid;
                l=mid+1;
            }else{
            h=mid-1;
            }
        }
        return res+1;
    }
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int start[]=new int[flowers.length];
        int end[]=new int[flowers.length];
        int res[]=new int[people.length];
        for(int i=0;i<flowers.length;i++){
            start[i]=flowers[i][0];
            end[i]=flowers[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        for(int i=0;i<people.length;i++){
            int live=binarys(start,people[i]);
            int die=binarys(end,people[i]-1);
            res[i]=live-die;
        }
        return res;
    }
}