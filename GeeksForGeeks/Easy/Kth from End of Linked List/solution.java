/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        Node temp=head;
        int n=countLL(head);
        if(k>n){
            return -1;
        }
        int i=0;
        while(i!=(n-k)){
            i++;
            temp=temp.next;
        }
        return temp.data;
        
    }
    public int countLL(Node head){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
}