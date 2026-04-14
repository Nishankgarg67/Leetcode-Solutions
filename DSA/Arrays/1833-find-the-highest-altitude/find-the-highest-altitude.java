class Solution {
    public int largestAltitude(int[] gain) {
         for(int i=1;i<gain.length;i++){
            gain[i] = gain[i] + gain[i-1];
        }
        int max = 0;
        for(int i=0;i< gain.length;i++){
            if(max<=gain[i]){
                max=gain[i];
            }
        }
        return max;
    }
}