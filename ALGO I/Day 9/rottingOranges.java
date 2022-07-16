class Solution {
    public class Pair{
        int i,j,time;
        Pair(int i,int j,int time){
            this.i=i;
            this.j=j;
            this.time=time;
        }
    }
    int[][] dir={{-1,0},{0,1},{1,0},{0,-1}};
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q=new ArrayDeque<>();
        int fresh=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int time=0;
        while(q.size()>0){
            Pair rp=q.remove();
            time=Math.max(time,rp.time);
            for(int k=0;k<4;k++){
                int ni=rp.i+dir[k][0];
                int nj=rp.j+dir[k][1];
                
                if(ni>=0 && nj>=0 && ni<grid.length && nj<grid[0].length && grid[ni][nj]==1){
                    grid[ni][nj]=2;
                    q.add(new Pair(ni,nj,rp.time+1));
                    fresh--;
                }
            }
        }
        
        if(fresh==0){
            return time;
        }else{
            return -1;
        }
    }
}