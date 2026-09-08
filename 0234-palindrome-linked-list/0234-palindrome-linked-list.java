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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode i=head;
        while(i!=null){
            list.add(i.val);
            i=i.next;
        }
        int len=list.size();
        int index=0;
        for(int a=len-1;a>=len/2;a--){
            if(list.get(a)!=list.get(index)){
                return false;
            }
            index++;
        }
        return true;
        
    }
}