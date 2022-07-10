class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hash_set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            hash_set.add(nums[i]);
            if(hash_set.size() != i+1){
                return true;
            }
        }
        return false;
    }
}