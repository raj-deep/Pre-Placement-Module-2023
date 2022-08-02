class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        if (matrix.length == 1) {
            for (int i = 0; i < matrix[0].length; i++) {
                if (matrix[0][i] == target) {
                    return true;
                }
            }
            return false;
        }
        if (matrix[0].length == 1) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][0] == target) {
                    return true;
                }
            }
            return false;
        }
        int row = 0;
        for (int i =0; i < matrix.length; i++) {
            row = matrix[i][0];
            if (row == target) {
                return true;
            }
            if (row > target) {
                if (i==0) {
                    return false;
                }
                row = i-1;
                break;
            }
        }
        if (target > matrix[matrix.length-1][0]) {
            row = matrix.length-1;
        }
      
        for (int i =0; i < matrix[row].length; i++) {
            if (matrix[row][i] == target) {
                return true;
            }
        }
        return false;
    }
}
