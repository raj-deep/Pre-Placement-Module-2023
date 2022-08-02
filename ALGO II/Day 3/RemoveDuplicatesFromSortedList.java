class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        
        ListNode prevHead = new ListNode(0), curr = head,prev = prevHead;
        
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                ListNode temp = curr.next;
                
                while(temp != null && temp.val == curr.val) temp = temp.next;
                
                curr = temp;
            }else{
                prev.next = curr;
                curr = curr.next;
                prev = prev.next;
            }
        }
        
        prev.next = curr;
        return prevHead.next;
    }
}