class Solution {
public ListNode removeElements(ListNode head, int val) {
while(head!=null && head.val==val){
head=head.next;
}

    ListNode node = head,
    prev = head;
    
    while(head!=null){
        if(head.val==val){
            prev.next = head.next;
        }else{
            prev = head;
        }            
        head = head.next;
    }        
    return  node;
}
}
