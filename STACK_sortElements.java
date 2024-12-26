public class Main {
    
   public static void sortStack(Stack<Integer> stack) {
    // Initialize an additional stack. This stack will be used to hold elements
    // temporarily and will help in sorting the elements of the original stack.
    Stack<Integer> additionalStack = new Stack<>();
 
    // Start a loop that will run until the original stack becomes empty.
    // This loop is responsible for moving elements from the original stack
    // to the additional stack in a sorted manner.
    while (!stack.isEmpty()) {
        // Pop the top element from the original stack. This element will be
        // compared with the elements in the additional stack to find its
        // correct position.
        int temp = stack.pop();
 
        // Check if the additional stack is not empty and the top element
        // in the additional stack is greater than the element we just popped
        // from the original stack. We need to move elements from the additional
        // stack back to the original stack until we find the correct position
        // for our popped element. This inner loop is critical to ensure that
        // the additional stack remains sorted at all times.
        while (!additionalStack.isEmpty() && additionalStack.peek() > temp) {
            // Move the top element of the additional stack back to the original
            // stack. This step is repeated until we find the right position for
            // the popped element in the additional stack.
            stack.push(additionalStack.pop());
        }
 
        // Now that the correct position is found in the additional stack,
        // push the popped element (temp) onto the additional stack. At this
        // point, the additional stack holds a sorted sequence of the elements
        // that have been processed so far.
        additionalStack.push(temp);
    }
 
    // After all elements are moved to the additional stack and sorted,
    // we need to move them back to the original stack. This final loop
    // reverses the order of the sorted elements, thereby arranging them
    // in ascending order in the original stack.
    while (!additionalStack.isEmpty()) {
        // Pop each element from the additional stack and push it onto
        // the original stack. This step will restore the elements to the
        // original stack but now in sorted order.
        stack.push(additionalStack.pop());
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

