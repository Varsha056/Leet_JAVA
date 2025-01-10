 public static Character firstNonRepeatingChar(String s){
      HashMap<Character,Integer> freqMap = new HashMap<>();
      for(char c: s.toCharArray()){
          freqMap.put(c,freqMap.getOrDefault(c,0)+1);
      }
      for(char c:s.toCharArray()){
          if(freqMap.get(c)==1){
              return c;
          }
      }
      return null;
  }
