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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(ListNode node : lists){
            while(node != null){
                q.add(node.val);
                node = node.next;
            }
        }

        ListNode dummy = new ListNode(1);
        ListNode newNode = dummy;

        while(!q.isEmpty()){
            newNode.next = new ListNode(q.remove());
            newNode = newNode.next;
        }

        return dummy.next;
    }
}