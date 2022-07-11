class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = nums.length-1; i>=0; i--){
            if(nums[i] == 0){
                list.add(nums[i]);
            }
            else{
                list.add(0, nums[i]);
            }
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = list.get(i);
        }
    }
}