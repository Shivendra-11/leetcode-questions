/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    int gcd(int x,int y){
        if(y==0) return x;
        else return gcd(y,x%y);
    }
    ListNode* insertGreatestCommonDivisors(ListNode* head) {
        if(head->next == nullptr) return head;
        ListNode* forward = head->next;
        ListNode* current = head;
        while(forward){
            int val = gcd(current->val,forward->val);
            ListNode* temp = new ListNode(val);
            current->next = temp;
            temp->next = forward;
            current = forward;
            forward = forward -> next;
        }
        return head;
    }
};