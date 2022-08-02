import java.util.HashMap;
import java.util.Map;

//Time Complexity : O(n), where n = number of elements in given array
//Space Complexity : O(n)
//Did this code successfully run on Leetcode :
//Three line explanation of solution in plain english

//Your code here along with comments explaining your approach :
//1. Define the direction and move the row and column pointers
//2. If the direction is upwards, it either breaches right and top side of matrix, hence identified edge cases for them and handled for up direction
//3. If the direction is downwards, it either breaches left or down side of matrix, hence identified edge cases for them and handled for down direction

// 1. Two Sum (Easy) - https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] twoSum = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            
            if (map.containsKey(val)) {
                twoSum[0] = map.get(val);
                twoSum[1] = i;
                return twoSum;
            }
            map.put(nums[i], i);
        }
        
        return twoSum;
    }
}