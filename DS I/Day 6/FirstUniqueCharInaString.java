class Solution {
    public int firstUniqChar(String s) {
        int flag = 0;
        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        for(int i=0; i<chars.length; i++){
            if(map.containsKey(chars[i])){
                list.remove(Character.valueOf(chars[i]));
                flag++;
            } else {
                map.put(chars[i],i);
                list.add(chars[i]);
            }            
        }
        
        if(list.size()!=0){
            return map.get(list.get(0));
        }else{
            return -1;
        }
    }
}