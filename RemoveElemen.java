/*
Input:

nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

val = 1

Output: The new length of the array should be 7, and the array itself should look like this after modification: [-2, -3, 4, -1, 2, -5, 4, -5, 4]
*/
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
