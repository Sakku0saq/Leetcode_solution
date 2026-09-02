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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        int len=0;
        ListNode l=head;
        while(l!=null){
            len++;
            l=l.next;

        }
        int del=len-n+1;
        ListNode prev=dummy;
        ListNode current=head;
        int i=0;
        while(i<(del-1)){
            current=current.next;
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;


        return dummy.next;
        
    }
}