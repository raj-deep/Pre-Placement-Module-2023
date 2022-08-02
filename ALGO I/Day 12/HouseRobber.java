class Solution {
    int[] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,0);
    }
    
    public int helper(int[] nums, int start) {
        
        if(start > nums.length-1) return 0;
        
        if(dp[start] != -1) return dp[start];
        
        return dp[start] = Math.max(nums[start] + helper(nums,start+2) ,
                       helper(nums,start+1));
    }
}