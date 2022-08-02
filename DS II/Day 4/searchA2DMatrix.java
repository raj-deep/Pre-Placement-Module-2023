class Solution {
    public boolean searchMatrix(int[][] arr, int data) {
        int n = arr.length, m = arr[0].length;
        int i = 0, j = m - 1;
        
        while(i < n && j >= 0) {
            
            if(arr[i][j] == data) {
                return true;
            }
            else if(arr[i][j] < data) {
                i++;
            }
            else {
                j--;
            }
        }
        
        return false;
    }
}