// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// Given nums = [2, 7, 11, 15], target = 9,
// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].

//initial thoughts: brute force solution, start from both ends of the array (i, j) and move towards the middle until i + j = target
//Optimization: using hashmap to store the value in key, then check if hashmap contains value that would add up to the target. Use containsKey, put, get

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int remainder = target - nums[i];
            if(numMap.containsKey(remainder)){
                return new int[] {numMap.get(remainder), i};
            }
            else{
                numMap.put(nums[i], i);
            }
            
        }
        return new int[] {};
    }
}

