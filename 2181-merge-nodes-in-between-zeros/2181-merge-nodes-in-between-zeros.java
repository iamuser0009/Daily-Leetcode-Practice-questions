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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode pointer = dummy;
        ListNode current= head.next;
        int sum =0;
        while ( current != null )
        {
           if( current.val != 0)
           {
             sum+= current.val;
           }
           else
           {
              
            pointer.next = new ListNode (sum);
            sum =0;
            pointer = pointer.next;
           }
           current = current.next;
        }
        return dummy.next;
    }
    
}