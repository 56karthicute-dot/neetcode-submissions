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
    public ListNode reverseList(ListNode head) {
        ListNode prev = head; //0
        if(head==null || head.next==null) {
            return head;
        }
        ListNode current = head.next; //1
        while(current!=null) {
            ListNode temp = current.next; //2 , 3, null
            current.next = prev; //1->0, 2->1, 3->2
            prev = current; //1, 2, 3
            current = temp;//2, 3, null
        }
        head.next=null;
        return prev;
    }
}
