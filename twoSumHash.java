public static int[] twoSum(int[] nums, int target) {
    // Create a map to store numbers and their indices
    Map<Integer, Integer> numMap = new HashMap<>();
 
    // Iterate over each number in the input array
    for (int i = 0; i < nums.length; i++) {
        // Get the current number
        int num = nums[i];
        // Calculate the complement needed to reach the target
        int complement = target - num;
 
        // Check if the map contains the complement
        if (numMap.containsKey(complement)) {
            // Return the indices of the complement and current number
            return new int[]{numMap.get(complement), i};
        }
        // Store the current number and its index in the map
        numMap.put(num, i);
    }
 
    // Return an empty array if no pair was found
    return new int[]{};
}
