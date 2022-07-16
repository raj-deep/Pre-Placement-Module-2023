class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p,q;
        if(head==null)
            return head;
        for(p=head;p.next!=null;){
            if(p.val==p.next.val){
                p.next=p.next.next;
            }else{
                p=p.next;
            }
        }
        return head;
    }
}