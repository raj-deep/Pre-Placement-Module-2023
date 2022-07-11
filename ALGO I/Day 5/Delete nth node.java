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
        ListNode count = head;
        int cnt = 1;
        if(head.next == null){
            return null;
        }
        while(count.next != null){
            count = count.next;
            cnt++;
        }
        if(n == cnt){
            head = head.next;
            return head;
        }
        count = head;
        for(int i=1; i<=cnt-n-1; i++){
            count = count.next;
        }
        count.next = count.next.next;
        
        return head;
    }
}