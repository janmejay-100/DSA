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
    public ListNode oddEvenList(ListNode head) {
     if(head==null || head.next==null || head.next.next==null){
        return head;
     }
     ListNode oddHead=head;
     ListNode evHead=head.next;
     ListNode temp=evHead;
     while(evHead!=null && evHead.next!=null){
        oddHead.next=oddHead.next.next;
        evHead.next=evHead.next.next;

        oddHead=oddHead.next;
        evHead=evHead.next;
     }
     oddHead.next=temp;
     return head;
    }
}
