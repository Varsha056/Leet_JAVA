/*
Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
*/

public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> myMap = new HashMap<>();
        for(char c: magazine.toCharArray()){
            myMap.put(c,myMap.getOrDefault(c,0)+1);
        }
        for(char c: ransomNote.toCharArray()){
            if(myMap.getOrDefault(c,0)>0){
                myMap.put(c,myMap.get(c)-1);
            }else return false;
        }
        return true;
    }
