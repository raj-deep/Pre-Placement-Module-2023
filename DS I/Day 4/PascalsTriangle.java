class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        ans.add(new ArrayList<>(temp));
        if(numRows == 1)
            return ans;
        
        temp.add(1);
        ans.add(new ArrayList<>(temp));
        if(numRows == 2)
            return ans;
        
        
        for(int i = 2; i < numRows; i++){
            List<Integer> lis = new ArrayList<>();
            lis.add(temp.get(0));
            for(int n = 0; n < temp.size() - 1; n++)
                lis.add(temp.get(n) + temp.get(n+1));
            
            lis.add(temp.get(temp.size()-1));
            temp = lis;
            ans.add(lis);
            
        }
        
        return ans;
    }
}