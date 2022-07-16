class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    
        int start=image[sr][sc];
        int m=image.length;
        int n=image[0].length;
        boolean visited[][]=new boolean[m][n];
    
        dfs(image,sr,sc,start,newColor,visited);
    
        return image;
    }

    public void dfs(int[][] image,int i,int j,int start,int color,boolean[][] visited){
    
        if(i<0||j<0||i>=image.length ||j>=image[0].length || image[i][j]!=start || visited[i][j]==true ){
            return;
        }
        start=image[i][j];
        image[i][j]=color;
        visited[i][j]=true;

        dfs(image,i,j-1,start,color,visited);
        dfs(image,i,j+1,start,color,visited);
        dfs(image,i-1,j,start,color,visited);
        dfs(image,i+1,j,start,color,visited);


    }
}