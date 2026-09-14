class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] result = new int [image.length][image.length];
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image.length; j++){
                result[i][j]=image[i][(image.length-1) - j]^1; //Xor
            }
        }
        return result;
    }
}
// Xor  same bits = 0 and different bits = 1 