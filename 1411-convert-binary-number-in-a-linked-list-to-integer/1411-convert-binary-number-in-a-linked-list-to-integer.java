/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer>li=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            li.add(temp.val);
            temp=temp.next;
        }
        int res=0;
        for(int i=li.size()-1;i>=0;i--){
            res+=(li.get(i)*Math.pow(2,li.size()-i-1));
        }

        return res;
    }
}