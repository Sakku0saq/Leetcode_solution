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
    public int pairSum(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode i=head;
        while(i!=null){
            list.add(i.val);
            i=i.next;

        }
        int max=0;
        int index=0;
        int temp=0;
        int len=list.size();
        for(int a=len-1;a>0;a--){
            temp=list.get(a)+list.get(index);
            if(temp>max){
                max=temp;
            }

                index++;
        }
        
        return max;
    }
}