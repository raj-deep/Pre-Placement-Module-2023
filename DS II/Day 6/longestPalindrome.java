
class Solution {
    public int longestPalindrome(String s) {
        int n = s.length(), count = 0;
        boolean flag = false;
        
        if (n == 1) return 1;

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        
        for (char key : map.keySet()) {
            int curr_count = map.get(key);
            if (curr_count % 2 == 0 && curr_count >= 2) {
                count += curr_count;
            }         
            if (curr_count % 2 != 0 && curr_count >= 2) {
                int temp = curr_count / 2;//1
                count += temp * 2;
                if (curr_count % 2 >= 1) flag = true;
            }
            if (curr_count == 1)
                flag = true;
        }
        return flag ? count + 1 : count;
    }
}