class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp1 = head;
        ListNode temp2 = head;

        while (temp2 != null && temp2.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }

        return temp1;
    }
}