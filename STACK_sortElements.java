public class Main {
    
    public static void sortStack(Stack<Integer> st){
        Stack<Integer> result = new Stack<>();
        while(!st.isEmpty()){
            int cur = st.pop();
            while(!result.isEmpty() && result.peek()>cur){
                st.push(result.pop());
            }
            result.push(cur);
            
        }
        while(!result.isEmpty()){
            st.push(result.pop());
        }
        
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();
 
        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3
            
            After sorting:
            1
            2
            3
            4
            5

        */
        
    }
    
}

