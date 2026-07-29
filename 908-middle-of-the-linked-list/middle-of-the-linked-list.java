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
        if(head==null) return null;
        int cnt = 0;
        ListNode temp = head;

        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        int middle = cnt/2; 

        temp = head;
        while(middle>0){
            temp = temp.next;
            middle--;
        }
        return temp;

        
    }
}