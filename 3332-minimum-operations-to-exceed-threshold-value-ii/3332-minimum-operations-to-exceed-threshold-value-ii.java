class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add((long)nums[i]);
        }
        int c=0;
        while(!pq.isEmpty() && pq.peek()<k){
            long s1=pq.poll();
            long s2=pq.poll();
            long newva=2L*s1+s2;
            pq.add(newva);
                 c++;
            
        }
        return c;
    }
}