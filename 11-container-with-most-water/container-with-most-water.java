class Solution {
    public int maxArea(int[] arr) {
         int s = 0;
        int e = arr.length-1;
        int max = 0;
        while(s<e){
            if(arr[s] < arr[e]){
                 max = Math.max(max,arr[s] *(e-s) );
                s++;
            }
            else{
               max = Math.max(max, arr[e]*(e-s));
                e--;
            }
        }
        return max;
    }
}