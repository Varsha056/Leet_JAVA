public static List<Integer> findDuplicates(int[] nums){
        
        List<Integer> duplicates = new ArrayList<>();
        HashMap<Integer,Integer> lookupSet = new HashMap<>();
        for(int i:nums){
            lookupSet.put(i,lookupSet.getOrDefault(i,0)+1);
        }
        for(int num:lookupSet.keySet()){
            if(lookupSet.get(num)>1) {
                duplicates.add(num);
            }
        }
            return duplicates;
       
        
    }


---------------------- ALTERNATE ---------------------------
      public static ArrayList<Integer> findDuplicates(int[] nums) {
 
    // Create a new HashMap to store the count of occurrences
    // of each integer.
    Map<Integer, Integer> numCounts = new HashMap<>();
 
    // Loop through each integer in the input array and update
    // its count in the HashMap.
    for (int num : nums) {
        numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
    }
 
    // Create a new ArrayList to store the duplicate integers.
    List<Integer> duplicates = new ArrayList<>();
 
    // Loop through each entry in the HashMap and check if the
    // count of occurrences is greater than 1.
    for (Map.Entry<Integer, Integer> entry : numCounts.entrySet()) {
        if (entry.getValue() > 1) {
            duplicates.add(entry.getKey());
        }
    }
 
    // Return the ArrayList of duplicate integers.
    return duplicates;
}
