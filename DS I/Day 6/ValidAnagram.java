class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();   // converting to char Array
        char[] s2 = t.toCharArray();   // converting to char Array
        
        
        Arrays.sort(s1);     // sorting according to alphabetical order
        Arrays.sort(s2);     // sorting according to alphabetical order
        
        
        s = String.valueOf(s1);   // converting to string again
        t = String.valueOf(s2);   // converting to string again
        
        return s.equals(t);
    }
}