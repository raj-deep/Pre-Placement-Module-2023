class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Sort the array for easier traversal
        Arrays.sort(nums);
        // Defining the actual returning list
        List<List<Integer>> output = new LinkedList<>();
        // Since we will be comparing 3 values : 1 + 2, our for loop will look like
        for(int i = 0 ; i < nums.length - 2; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i - 1])){
                int low = i + 1;
                int high = nums.length - 1;
                int sum = 0 - nums[i];
                
                while(low < high){
                    if(nums[low] + nums[high] == sum){
                        output.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(low < high && nums[low] == nums[low + 1]) low++; 
                        while(low < high && nums[high] == nums[high - 1]) high--;
                        low++;
                        high--;
                    }
                    else if(nums[low] + nums[high] > sum){
                        high--;
                    }
                    else if(nums[low] + nums[high] < sum){
                        low++;
                    }
                }
            }
        }
        return output;
    }
}