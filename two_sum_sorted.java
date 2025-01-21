/*
Input: numbers = [2,3,4], target = 6
Output: [1,3]
*/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j= numbers.length-1;
        while(i<j){
            int complement = numbers[i]+numbers[j];
            if(target == complement) return new int[]{i+1,j+1};
            else if(complement>target) j--;
            else i++;
        }
        return new int[]{0,0};
    }
}
