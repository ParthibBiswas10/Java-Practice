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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode rnode =new ListNode(Integer.MIN_VALUE);
        ListNode head=rnode;
        while(l1!=null && l2 !=null){
            if(l1.val<l2.val){
                rnode.next=l1;
                l1=l1.next;
            }
            else{
                rnode.next=l2;
                l2=l2.next;
            }
            rnode=rnode.next;
        }
        rnode.next=l1!=null?l1:l2;
        return head.next;
    }
    
}