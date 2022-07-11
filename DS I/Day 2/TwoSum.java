class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        boolean check = false;
        for(int i = 0; i<nums.length; i++){
            for(int j = 1; j<nums.length; j++){
                if((nums[i] + nums[j] == target) && (i!= j)){
                    solution[0] = i;
                    solution[1] = j;
                    check = true;
                    break;
                }
            }
            if(check){
                break;
            }
        }
        return solution;
    }
}