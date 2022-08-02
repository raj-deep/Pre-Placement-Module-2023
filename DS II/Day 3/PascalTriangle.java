class Solution {
    // we keep the previous and derive the present row from the previous row 
    public List<Integer> getRow(int r) {
           
        // t= previous row
         List<Integer> t= new ArrayList<>();
        
        for( int i=0; i<r+1; i++){
           
            // we copy our old list into our present list because I am too lazy to manually add the 1 at the start and make the present list to a size of prev_list or t 
            
             List<Integer> temp= new ArrayList<>(t);
            for( int j=1; j<i; j++){
                
                temp.set(j,t.get(j-1) + t.get(j));
            }
            
            // append the 1 at the end for our new row
             temp.add(1);
            
            // update our previous list by a copy of the present 
            t=new ArrayList<>(temp);
        }
        
        return t;
    }
}