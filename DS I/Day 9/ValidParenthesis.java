class Solution {
    
    public static boolean isClosed(char c){
        return (c == '(' || c == '{' || c== '[');
    }
    public static boolean isMatching(char a, char b){
        return ((a == '(' && b == ')') || 
                (a == '[' && b == ']') || 
                (a == '{' && b == '}')) ;
    }
    
    public boolean isValid(String s) {
        Stack<Character> sd = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(isClosed(s.charAt(i))){
                sd.push(s.charAt(i));
            }
            else{
                if(sd.isEmpty()){
                    return false;
                }
                else if(isMatching(sd.peek(), s.charAt(i))){
                    sd.pop();
                    
                }
                else{
                    return false;
                }
            }
        }
        
        System.out.println(sd.toString());
        
        return sd.isEmpty();
        
    }
}