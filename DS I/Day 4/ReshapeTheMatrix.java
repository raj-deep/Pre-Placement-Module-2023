class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        
        int r_mat = mat.length;
        int c_mat = mat[0].length;
        
        if(r*c != r_mat*c_mat)
        {
            return mat;
        }
        
        int[][] ans = new int[r][c];
        
        for(int i = 0; i< r*c; i++)
        {
//             p_mat, q_mat: row, col for matrix mat
//             p, q: row, col for the new matrix
            int p_mat = i/c_mat, q_mat = i%c_mat;
            int p = i/c, q = i%c;
            ans[p][q] = mat[p_mat][q_mat];
        }
        
        
        return ans;
        
    }
}