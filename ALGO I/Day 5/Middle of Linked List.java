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
    public ListNode middleNode(ListNode head) {
        ListNode count = head;
        int cnt = 1;
        while(count.next != null){
            count = count.next;
            cnt++;
        }
        for(int i = 0; i<cnt/2; i++){
            head = head.next;
        }
        
        return head;
    }
}