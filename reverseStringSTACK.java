-------ARRAYLIST--------------------------------
public static String reverseString(String string) {
    // Create a new stack of characters.
    Stack<Character> stack = new Stack<>();
    // Create an empty string for the reversed characters.
    String reversedString = "";
 
    // Loop through each character in the original string and push it onto the stack.
    for (char c : string.toCharArray()) {
        stack.push(c);
    }
 
    // Pop each character off the stack and add it to the reversed string.
    // This will reverse the order of the characters in the original string.
    while (!stack.isEmpty()) {
        reversedString += stack.pop();
    }
 
    // Return the reversed string.
    return reversedString;
}
