/*

By "balanced," we mean that for every open parenthesis, there is a matching closing parenthesis in the correct order. For example, the string "((()))" has three pairs of balanced parentheses,
  so it is a balanced string. On the other hand, the string "(()))" has an imbalance, as the last two parentheses do not match, so it is not balanced.  
  Also, the string ")(" is not balanced because the close parenthesis needs to follow the open parenthesis.
  
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
