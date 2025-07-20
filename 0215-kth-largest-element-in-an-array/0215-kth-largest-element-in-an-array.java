class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collection.reverseOrder());
        
        for(int i=0;i<arr.length;i++){
            pq.add(nums[i]);
        }
        while(k>1){
            pq.poll();
            k--;
        }
        
        return pq.peek();
    }
}