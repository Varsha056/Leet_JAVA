public static List<Integer> removeDuplicates(List<Integer> myList) {
    // Create a new HashSet with unique elements from myList
    Set<Integer> uniqueSet = new HashSet<>(myList);
    
    // Return a new ArrayList created from the uniqueSet
    return new ArrayList<>(uniqueSet);
}
