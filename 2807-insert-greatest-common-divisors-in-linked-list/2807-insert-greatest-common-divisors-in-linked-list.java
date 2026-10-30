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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode first = head;
        ListNode second = head.next;
        while(first != null &&  second != null){
            first.next = new ListNode (findGCD(first.val, second.val));
            first.next.next = second;
            first= second;
            second= second.next;


        }
        return head;
    }
     public int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}