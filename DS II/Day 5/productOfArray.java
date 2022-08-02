class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        output[0] = 1;

        for(int i = 1; i < n; i++) {    // doing the work of left product
            output[i] = nums[i - 1] * output[i - 1];
        }

        int r = 1;
        for(int i = n - 1; i >= 0; i--) {   // doing the work of right product
            output[i] *= r;
            r *= nums[i];
        }

        return output;
    }
}
