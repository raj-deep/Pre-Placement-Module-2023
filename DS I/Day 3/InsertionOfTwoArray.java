class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] count = new int[1001];
        for (int i = 0; i < nums1.length; i++) {
            count[nums1[i]]++;
        }
        int[] result = new int[Math.max(nums1.length, nums2.length)];
        int index = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (count[nums2[i]] > 0) {
                result[index++] = nums2[i];
                count[nums2[i]]--;
            }
        }
        return Arrays.copyOf(result, index);
    }
}
