/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 *
 * https://leetcode.com/problems/3sum-closest/description/
 *
 * algorithms
 * Medium (46.74%)
 * Likes:    4120
 * Dislikes: 196
 * Total Accepted:    650.8K
 * Total Submissions: 1.4M
 * Testcase Example:  '[-1,2,1,-4]\n1'
 *
 * Given an integer array nums of length n and an integer target, find three
 * integers in nums such that the sum is closest to target.
 * 
 * Return the sum of the three integers.
 * 
 * You may assume that each input would have exactly one solution.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [-1,2,1,-4], target = 1
 * Output: 2
 * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [0,0,0], target = 1
 * Output: 0
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 3 <= nums.length <= 1000
 * -1000 <= nums[i] <= 1000
 * -10^4 <= target <= 10^4
 * 
 * 
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min=nums[0]+nums[nums.length-1]+nums[1];
        int n=nums.length;
        for(int i=0;i<nums.length-2;i++)
        {
            int low=i+1;int high=n-1; 
                while(low<high)
                {   
                    int sum = nums[i] + nums[low] + nums[high];
                    if(sum>target)
                        high--;
                    else
                        low++;
                    if(Math.abs(sum-target)<Math.abs(min-target))
                        min=sum;
                }
        }
        return min;
        
    }
}
// @lc code=end

