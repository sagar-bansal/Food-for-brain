/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        
        for(int i=0;i<nums.length-2;i++)
        {
            if(i==0||nums[i]!=nums[i-1]){
            int low=i+1;
            int high=nums.length-1;
            int sum=0-nums[i];
            while(low<high)
            { 
                if(sum==(nums[low]+nums[high]))
                {
                    List<Integer> val=new ArrayList<>();
                    val.add(nums[i]);
                    val.add(nums[low]);
                    val.add(nums[high]);
                    result.add(val);
                    while(low<high && nums[low]==nums[low+1]) low++;
                    while(low<high && nums[high]==nums[high-1]) high--;
                    low++;
                    high--;
                    
                }
                else if(nums[low]+nums[high]>sum)
                    high--;
                else low++;                    
            } }   
        }
        return result;
        
    }
}
// @lc code=end

