class Solution {
   static List<List<Integer>> result;
    public static void main(String[] args) {
        List<List<Integer>> ans = combine(4, 2);
        System.out.println("All combinations " + ans);
    }

    public static List<List<Integer>> combine(int n, int k) {
       result = new ArrayList<>();
       int[] nums = new int[n];
       for (int i = 0; i < n; i++) {
           nums[i] = i + 1;
       }
       dfs(new ArrayList<Integer>(),nums, 0, k);
       return result;
    }

    private static void dfs(ArrayList<Integer> tempList, int[] nums, int start, int k) {
        if(tempList.size() == k) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            dfs(tempList, nums, i + 1, k);
            tempList.remove(tempList.size() - 1);
        }
    }
}