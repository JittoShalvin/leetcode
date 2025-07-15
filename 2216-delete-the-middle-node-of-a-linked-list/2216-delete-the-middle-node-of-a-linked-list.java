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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            head=null;
            return head;
        }
        ListNode curr=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            curr=slow;
            fast = fast.next.next;
            slow=slow.next;
        }
        curr.next=slow.next;
        slow=null;
        return head;
    }

}