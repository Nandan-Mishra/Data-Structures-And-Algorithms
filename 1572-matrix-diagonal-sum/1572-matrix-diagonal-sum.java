class Solution {
    public int diagonalSum(int[][] mat) {
       int sum = 0;
       for(int i=0; i<mat.length; i++){
        for(int j=0; j<mat.length; j++){
            if(i==j || (i+j)==(mat.length-1)){
                sum+=mat[i][j];
            }
        }
       }
       return sum; 
    }
}

/*class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
        }
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][mat.length-i-1];
        }
        if(mat.length%2!=0){
            sum=sum-mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}*/