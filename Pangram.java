// A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet. Ignore case.
  // Return either pangram or not pangram as appropriate.

public static String pangrams(String s) {
    // Write your code here
    String word = s.toLowerCase();
    Set<Character> mySet = new HashSet<>();
    for(char c : word.toCharArray()){
        if(c>='a' && c<='z') mySet.add(c);
    }
    return mySet.size() == 26? "pangram":"not pangram";
    }
