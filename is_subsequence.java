/*
Input: s = "abc", t = "ahbgdc"
Output: true
*/
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) return true;
        else if(!s.isEmpty() && t.isEmpty()) return false;
        
        int i=0;
        int j =0;
        int count =0;
        while(j<t.length() && i<s.length()){
                if(s.charAt(i)==t.charAt(j)){
                    i++;
                } 
                j++;
        }
        return i==s.length();
    }
}
