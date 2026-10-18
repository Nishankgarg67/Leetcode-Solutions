class Solution {
    public int[] twoSum(int[] arr, int target) {
        int start  = 0 ;
        int end = arr.length-1;
        while(start <= end){
            int sum =  arr[start] + arr[end];
            if(sum == target){
                int ans[]  = {start+1 , end +1};
                return ans;
            }
            else if(sum > target ){
                end--;
            }
            else{
                start++;
            }
        }
        int result[] = {-1,-1};
        return result;
    }

}