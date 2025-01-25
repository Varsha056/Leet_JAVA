/*

Input: head = [1,3,4,7,1,2,6]
Output: [1,3,4,1,2,6]
Explanation:
The above figure represents the given linked list. The indices of the nodes are written below.
Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
We return the new list after removing this node

*/

public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next==null) return null;
        
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow= slow.next;
            fast=fast.next.next;
        }
        if(prev!=null){
            prev.next = slow.next;
            slow.next= null;
        }
        
        return head; 
    }
