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
        int length=sizeLL(head);
        if(length==n){
            return head.next;
        }
        ListNode temp=head;
        for(int i=0; i<length-n-1; i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }

    
    public int sizeLL(ListNode head){
        int cnt=0;
        while(head!=null){
            cnt++;
            head=head.next;
        }
        return cnt;
    }
}
