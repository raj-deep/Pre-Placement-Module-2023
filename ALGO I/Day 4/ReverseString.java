class Solution {
    public void reverseString(char[] s) {
        Stack<Character> str = new Stack<>();
        for(int i = 0;i<s.length; i++){
            str.push(s[i]);
        }
        for(int i=0; i<s.length; i++){
            s[i] = str.pop();
        }
    }
}