class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[3];
        for(int i =0; i<nums.length; i++){
            if(nums[i] == 0){
                arr[0]++;
            }
            else if(nums[i] == 1){
                arr[1]++;
            }
            else{
                arr[2]++;
            }
        }
        
        for(int i=0; i<arr[0]; i++){
            nums[i] = 0;
        }
        for(int i=arr[0]; i<arr[0] + arr[1]; i++){
            nums[i] = 1;
        }
        for(int i=arr[0] + arr[1]; i<nums.length; i++){
            nums[i] =2;
        }
    }
}