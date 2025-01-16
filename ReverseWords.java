/*
 "  hello world   " o/p = "world hello"
  */


class Solution {
    public String reverseWords(String s) {
        Stack<String> temp = new Stack<>();
        s=s.trim();
        String[] sArray = s.split("\\s+");

        for(String w : sArray){
            temp.push(w);
        }
        StringBuilder result = new StringBuilder();
        while(!temp.isEmpty()){
            result.append(temp.pop());
             if (!temp.isEmpty()) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
