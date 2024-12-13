public Node findKthFromEnd(int index){
        
         
        Node fast = head;
        Node slow = head;
        
        for(int i=0;i<index;i++){
            if(fast==null) return null;
            fast= fast.next;
        }
        
        while(fast!=null){
            fast= fast.next;
            slow= slow.next;
        }
        return slow;
	    
	}
