/*

int[] nums = {1, 5, 2, 9, 3, 6, 8};
List<Integer> result = streamMax(nums);
// Expected output: [1, 5, 5, 9, 9, 9, 9]
// Explanation: The maximum number for the first number is 1, 
// for the first two numbers is 5, for the first three numbers is 5, and so on.

*/

public static List<Integer> streamMax(int[] nums) {
    // Create an instance of a max-heap
    Heap maxHeap = new Heap();
    
    // Prepare a list to store the max of the stream so far
    List<Integer> maxStream = new ArrayList<>();
 
    // For each number in the given array
    for (int num : nums) {
        // Insert the current number into the max-heap
        maxHeap.insert(num);
        
        // After insertion, the max of the heap (which is also
        // the max of the stream so far) is at the root. Add this
        // root to the maxStream list
        maxStream.add(maxHeap.getHeap().get(0));
    }
 
    // After iterating over all the numbers, return the maxStream list
    // that contains the running maximum of the input stream
    return maxStream;
}
