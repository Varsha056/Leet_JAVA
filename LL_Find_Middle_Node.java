/*
LL does not have length so use this method

*/
public Node findMiddleNode(){
	    
	    if(head==null) return null;
	    Node slow = head;
	    Node fast = head;
	    
	    while(fast!= null && fast.next!= null){
	        slow=slow.next;
	        fast=fast.next.next;
	        
	    }
	    return slow;
	}
