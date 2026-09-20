/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // if(head==null || head.next==null){
        //     return null;
        // }
        // ListNode fast=head;
        // ListNode slow=head;
        // ListNode ptr=head;

        // while(fast!=null && fast.next!=null){
        //     fast=fast.next.next;
        //     slow=slow.next;

        //     if(fast==slow){
        //         while(ptr!=slow){
        //             ptr=ptr.next;
        //             slow=slow.next;
        //         }
        //         return ptr;
        //     }
        // }
        // return null;

        Set<ListNode> set=new HashSet<>();
        ListNode curr=head;
        while(curr!=null){
            if(set.contains(curr)){
                return curr;
            }else{
                set.add(curr);
                curr=curr.next;
            }
        }
        return null;
    }
}