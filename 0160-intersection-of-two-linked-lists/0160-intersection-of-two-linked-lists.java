/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempa=headA;
        ListNode tempb=headB;
          int c1=0;
          int c2=0;
        while(tempa!=null){
            c1++;
            tempa=tempa.next;
        }
        while(tempb!=null){
            c2++;
            tempb=tempb.next;
        }
        ListNode tempc=headA;
        ListNode tempd=headB;

        if(c1>c2){
            int inc=c1-c2;
            for(int i=0;i<inc;i++ ){
              tempc=tempc.next;
            }

        }

        else{
            for(int i=0;i<(c2-c1);i++){
                tempd=tempd.next;
            }
        }
        while(tempc!=tempd){
            tempc=tempc.next;
            tempd=tempd.next;
        }

      return tempd;  
    }
}