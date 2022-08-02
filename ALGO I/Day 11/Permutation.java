class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> output= new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        //base case for length == 1
        if(nums.length == 1){
            temp.add(nums[0]);
            output.add(temp);
            return output;
        }
        
        //HashMap for faster cross checking of elements
        HashMap<Integer,Boolean> set= new HashMap<>();
        
        //storing all the elements with default values as false
        for(int i =0;i<nums.length;i++){
            set.put(nums[i],false);
        }
        
        helper(nums,output,temp,set);
        
        return output;
    }
    
    private void helper(int[] nums, List<List<Integer>> output, List<Integer> temp,HashMap<Integer,Boolean> set){
        
        if(temp.size() == nums.length){
            //making  a copy of temp
            List<Integer> xyz= new ArrayList<>();
            
            for(int j =0;j<temp.size();j++){
                xyz.add(temp.get(j));
                
            }
            
            //adding xyz
            output.add(xyz);
            return;
        }
        
        
        // one by one we'll add and try all the elements
        for(int i=0 ;i<nums.length;i++){
            
            if(!set.get(nums[i])){
                // 1. adding the elements if it was not present earlier
                temp.add(nums[i]);
                set.put(nums[i],true);
                
                // 2. checking all the permuations
                helper(nums,output,temp,set);
                
                //3. after all the permutations are checked removing it and skip to next iteration.
                set.put(  nums[i] ,false );
                temp.remove(temp.size()-1);    
            }
                    
        }
        
    }
}