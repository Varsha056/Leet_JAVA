/*
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

 */ 
public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mapValue = new HashMap<>();
        Set<Integer> mySet = new HashSet<>();
        for(int i:arr){
                mapValue.put(i,mapValue.getOrDefault(i,0)+1);
        }
        for(int i:mapValue.values()){
            if(mySet.contains(i)){
                return false;
            }
            mySet.add(i);
        }
        return true;
       
    }
