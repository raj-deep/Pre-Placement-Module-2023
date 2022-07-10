class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        if(target > nums[high]){
            return high + 1;
        }
        
        if(target<nums[low]){
            return 0;
        }
        
        while(low!=high){
            if(target > nums[(low+high)/2]){
                low = (low+high)/2 + 1;
            }
            else if(target < nums[(low+high)/2]){
                high = (low+high)/2;
            }
            else{
                return (low+high)/2;
            }
        }
        
        return low;
    }
}