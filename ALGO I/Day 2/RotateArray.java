class Solution {
    public void rotate(int[] nums, int k) {
        Queue<Integer> Q = new LinkedList<Integer>();
        while (k >= nums.length) {
            k = k - nums.length;
        }
        for (int i = nums.length - k; i < nums.length; i++) {
            Q.add(nums[i]);
        }
        for (int i = 0; i <= nums.length - k - 1; i++) {
            Q.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Q.remove();
        }
    }
}