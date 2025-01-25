/*

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

*/

public ListNode reverseList(ListNode head) {
        if(head ==null ) return null;
        ListNode temp = head;

        ListNode after = null;
        ListNode before = null;
        while(temp!=null){
            after = temp.next;
            temp.next= before;
            before = temp;
            temp = after;
        }
        head = before;
        return head;
    }
