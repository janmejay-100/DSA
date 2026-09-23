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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        int cnt=0;
        ListNode temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }

        int arr[]=new int[cnt];
        temp=head;
        for(int i=0; i<arr.length; i++){
            arr[i]=temp.val;
            temp=temp.next;
        }
        Arrays.sort(arr);

        temp=head;
        for(int i=0; i<arr.length; i++){
            temp.val=arr[i];
            temp=temp.next;
        }
        return head;
    }
}