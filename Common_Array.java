// Item In Common [1, 2 , 4] [ 2, 6, 8] true

public static boolean itemInCommon(int[] array1, int[] array2) {
    // Create a HashMap to store the elements of array1
    HashMap<Integer, Boolean> myHashMap = new HashMap<>();
 
    // Add each element of array1 to the HashMap with a true value
    for (int i : array1) {
        myHashMap.put(i, true);
    }
 
    // Check if each element of array2 is in the HashMap
    for (int j : array2) {
        if (myHashMap.get(j) != null) return true;
    }
 
    // If no elements in common, return false
    return false;
}
