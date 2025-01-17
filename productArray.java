/*
Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
*/
public int[] productExceptSelf(int[] nums) {
        
        int product =1;
        int count= 0;
        int index =0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0){
                count++;
                index = i;
            }else product*=nums[i];
        } 

        int[] result = new int[nums.length];
        if(count==0){
            for(int i=0; i<nums.length;i++){
                result[i] = product/nums[i];
            }
        }else if(count ==1){
            result[index] = product;
        }
        

        return result;

    }
