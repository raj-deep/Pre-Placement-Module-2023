class Solution {
    public int[][] merge(int[][] arr) {
        Pair[] pairs = new Pair[arr.length];
        for(int i=0;i<arr.length;i++){
            pairs[i] = new Pair(arr[i][0],arr[i][1]);
        }
        Arrays.sort(pairs);
        Stack<Pair> st = new Stack<>();
        for(int i=0;i<pairs.length;i++){
            if(i == 0){
                st.push(pairs[i]);
            }else{
                Pair top = st.peek();
                if(pairs[i].si > top.et){
                    st.push(pairs[i]);
                }else{
                    top.et = Math.max(top.et,pairs[i].et);
                }
            }
        }
        
        Stack<Pair> res = new Stack<>();
        while(st.size() > 0){
            res.push(st.pop());
        }
        
        int[][] result = new int[res.size()][2];
        int r = 0;
            while(res.size() > 0){
             Pair top = res.pop();
            result[r][0] = top.si;
            result[r][1] = top.et;
                r++;
            }
       return result;
    }
    
       class Pair implements Comparable<Pair>{
        int si;
        int et;
        
        Pair(int si,int et){
            this.si = si;
            this.et = et;
        }
        
        public int compareTo(Pair o){
            if(this.si != o.si){
                return this.si - o.si;
            }else{
                return this.et - o.et;
            }
        }
    }
    
    
}