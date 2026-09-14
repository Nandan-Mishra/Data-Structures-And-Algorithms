class Solution {
    public int largestAltitude(int[] gain) {
        int maxAlt = 0;
        if(maxAlt<gain[0]){
            maxAlt=gain[0];
        }
        for(int i=1; i<gain.length; i++){
            gain[i]+=gain[i-1];
            if(maxAlt<gain[i]){
                maxAlt=gain[i];
            }
        }
        return maxAlt;
    }
}