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
    public boolean hasCycle(ListNode head) {

        ListNode t=head;

        HashSet<ListNode> seen=new HashSet<>();
        int index=0;

        if(t==null){
            return false;
        }

        while(t.next!=null){
            if(seen.contains(t)){
                return true;
            }
            index++;
            seen.add(t);
            t=t.next;

        }

        return false;
        
    }
}
