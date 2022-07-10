class Solution {
    public int[] sortedSquares(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int[] numsqr = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(Math.pow(nums[low], 2) > Math.pow(nums[high], 2)){
                numsqr[nums.length-i-1] = (int)Math.pow(nums[low], 2);
                low++;
            }
            else{
                numsqr[nums.length-i-1] = (int)Math.pow(nums[high], 2);
                high--;
            }
        }
        return numsqr;
    }
}