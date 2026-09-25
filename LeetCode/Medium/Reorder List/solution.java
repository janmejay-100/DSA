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
    public void reorderList(ListNode head) {
        int n=sizeLL(head);
        ListNode ptr=head;
        int i=1;
        while(i<=n/2){
            ptr=ptr.next;
            i++;
        }
        ListNode second=ptr.next;
        ptr.next=null;
        ListNode nHead=reverseLL(second);
        while(nHead!=null){
            ListNode temp=head.next;
            ListNode ntemp=nHead.next;
            head.next=nHead;
            nHead.next=temp;
           head=temp;
           nHead=ntemp;

        }
    }
    public static int sizeLL(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static ListNode reverseLL(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}