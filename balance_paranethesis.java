import java.util.HashMap;
import java.util.Map;

public class UnorderedBalancedParentheses {

    public static boolean isBalanced(String s) {
        // HashMap to store the counts of each type of bracket
        Map<Character, Integer> openCounts = new HashMap<>();
        Map<Character, Integer> closeCounts = new HashMap<>();
        
        // Initialize counts for each bracket type
        openCounts.put('(', 0);
        openCounts.put('[', 0);
        openCounts.put('{', 0);
        
        closeCounts.put(')', 0);
        closeCounts.put(']', 0);
        closeCounts.put('}', 0);
        
        // Count the occurrence of each opening and closing bracket
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                openCounts.put(c, openCounts.get(c) + 1);
            } else if (c == ')' || c == ']' || c == '}') {
                closeCounts.put(c, closeCounts.get(c) + 1);
            }
        }
        
        // Check if the counts of opening and closing brackets match for each type
        return openCounts.get('(') == closeCounts.get(')') &&
               openCounts.get('[') == closeCounts.get(']') &&
               openCounts.get('{') == closeCounts.get('}');
    }

    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {
            "({[}])",       // Unbalanced (mismatch)
            "{[()]}",       // Balanced
            "()",           // Balanced
            "[{[()]}]",     // Balanced
            "{([)()])",     // Balanced in pairs, but not properly nested
            "((({{{}}}))",  // Balanced (proper nesting)
            "(()[{}])",     // Balanced (proper nesting)
            "{(])",         // Unbalanced (mismatch)
            "",             // Empty string (balanced)
            "abc",          // No parentheses (balanced)
        };

        // Test each string
        for (String test : testStrings) {
            System.out.println("Input: \"" + test + "\" is balanced: " + isBalanced(test));
        }
    }
}
