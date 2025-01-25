/*
Input: s = "leet**cod*e"
Output: "lecoe"

  */
class Solution {
    public String removeStars(String s) {
        Stack<Character> stChar = new Stack<>();

        for(char c : s.toCharArray()){
            if(c=='*'){
                stChar.pop();
            }else{
                stChar.push(c);
            }
        }
        String result = "";
        while(!stChar.isEmpty()){
            result=stChar.pop()+result;
        }
        return result;
    }
}
