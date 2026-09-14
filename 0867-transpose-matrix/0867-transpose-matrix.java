class Solution {
    public int[][] transpose(int[][] matrix) {
        int row =matrix.length;
        int colm =matrix[0].length;
        int[][] result =new int[colm][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++){
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}