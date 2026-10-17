class Solution {
    public int[] twoSum(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        while(s <=e){
            int sum = arr[s] + arr[e];
            if(sum ==target){
                int[] ans= {s+1,e+1};
                return ans;
            }
            else if(sum > target){
                e--;
            }
            else{
                s++;
            }
        }
        int[] result = {-1,-1};
        return result;
    }
}