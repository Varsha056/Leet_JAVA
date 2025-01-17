public static int removeElement(int[] nums, int val) {
    // Initialize index i for writing elements in the array
    int i = 0;
    
    // Traverse the array from the start to end
    for (int j = 0; j < nums.length; j++) {
        // If the current element is not equal to the given value...
        if (nums[j] != val) {
            // ...copy it to the position of the 'write' index i...
            nums[i] = nums[j];
            // ...and increment the write index
            i++;
        }
        // If the current element equals val, it is skipped
    }
    
    // Return the number of elements not equal to val
    return i;
}
