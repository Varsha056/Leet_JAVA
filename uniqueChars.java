public static boolean hasUniqueChars(String word){
        HashSet<Character> mySet = new HashSet<>();
        
        for(int i =0;i<word.length();i++){
            mySet.add(word.charAt(i));
        }
        return mySet.size()==word.length();
        
    }

------------------------------ Alternate --------------------------------------
   public static boolean hasUniqueChars(String string) {
        // Create a set to store unique characters
        Set<Character> charSet = new HashSet<>();
 
        // Iterate through each character in the string
        for (char ch : string.toCharArray()) {
            // Check if the character is already in the set
            if (charSet.contains(ch)) {
                return false;
            }
            // Add the character to the set
            charSet.add(ch);
        }
 
        // If no duplicates found, return true
        return true;
    }
