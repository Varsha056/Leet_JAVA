public static int findKthSmallest(int[] nums, int k) {
    // Initialize a new Heap instance.
    Heap maxHeap = new Heap();
 
    // Iterate over every number in the input array.
    for (int num : nums) {
        // Insert current number into the heap.
        // Heap property is maintained after each insertion.
        maxHeap.insert(num);
        
        // Check if heap size exceeds 'k'.
        if (maxHeap.getHeap().size() > k) {
            // If size exceeds 'k', remove the largest number.
            // Heap property is maintained after each removal.
            maxHeap.remove();
        }
    }
 
    // At this point, the heap contains the smallest 'k' numbers.
    // The largest number in the heap is the kth smallest number in the array.
    // Therefore, we remove and return it.
    return maxHeap.remove();
}
