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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev = null;
        ListNode curr= head;
        for(int i=1;i<left;i++){
            prev= curr;
            curr=curr.next;
        }

        ListNode beforeleft = prev;
        ListNode leftnode = curr;

        prev = null;
        for(int i =0;i<right-left+1;i++){
            ListNode next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }

        
        if(beforeleft!=null){
            beforeleft.next=prev;
        }
        else{
            head= prev;
        }
        leftnode.next =curr;
        return head;
    }
}