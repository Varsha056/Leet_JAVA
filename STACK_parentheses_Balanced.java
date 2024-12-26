/*

By "balanced," we mean that for every open parenthesis, there is a matching closing parenthesis in the correct order. For example, the string "((()))" has three pairs of balanced parentheses,
  so it is a balanced string. On the other hand, the string "(()))" has an imbalance, as the last two parentheses do not match, so it is not balanced.  
  Also, the string ")(" is not balanced because the close parenthesis needs to follow the open parenthesis.
 
 
 
 public static boolean isBalancedParentheses(String parentheses) {
    // Create an empty stack of characters
    Stack<Character> stack = new Stack<>();
 
    // Iterate through each character in the input string
    for (char p : parentheses.toCharArray()) {
        // If the current character is an opening parenthesis, push it onto the stack
        if (p == '(') {
            stack.push(p);
        }
        // If the current character is a closing parenthesis, check if the stack is empty or
        // if the top element of the stack is not an opening parenthesis. If either of these
        // conditions is true, return false, because the parentheses are not balanced.
        else if (p == ')') {
            if (stack.isEmpty() || stack.pop() != '(') {
                return false;
            }
        }
    }
 
    // After iterating through all the characters in the input string, check if the stack is
    // empty. If the stack is empty, return true, because all the opening parentheses have been
    // matched with closing parentheses. Otherwise, return false, because there are still some
    // opening parentheses left on the stack that have not been matched with closing parentheses.
    return stack.isEmpty();
} 
*/
public class Main {
    
    public static boolean isBalancedParentheses(String value){
        Stack<Character> st = new Stack<>();
        
        for(int i = 0;i<value.length();i++){
            if(!st.isEmpty()&& value.charAt(i)==')'){
                st.pop();
            }else{
                st.push(value.charAt(i));
            } 
        }
         return st.isEmpty();
        
    }


    public static void main(String[] args) {
        testAndPrint("()", true);
        testAndPrint("()()", true);
        testAndPrint("(())", true);
        testAndPrint("()()()", true);
        testAndPrint("(()())", true);
        testAndPrint(")()(", false);
        testAndPrint(")(", false);
        testAndPrint("(()", false);
        testAndPrint("))", false);
        testAndPrint("(", false);
        testAndPrint(")", false);
    }
    
    public static void testAndPrint(String testStr, boolean expected) {
        // Run the test and store the result
        boolean result = isBalancedParentheses(testStr);
        
        // Print the test string, expected result, and actual result
        System.out.println("Test String: " + testStr);
        System.out.println("EXPECTED: " + expected);
        System.out.println("RESULT: " + result);
        
        // Check if the test passed or failed
        if (result == expected) {
            System.out.println("STATUS: PASS");
        } else {
            System.out.println("STATUS: FAIL");
        }
        
        // Print a separator for better readability
        System.out.println("--------------");
    }

}
