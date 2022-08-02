class Solution {
    public void rotate(int[][] matrix) {
        int[][] trans = new int[matrix.length][matrix.length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                trans[i][j] = matrix[j][i];
            }
        }
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j] = trans[i][matrix[i].length-j-1];
            }
        }
    }
}