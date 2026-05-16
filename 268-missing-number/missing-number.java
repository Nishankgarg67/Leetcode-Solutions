class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualsum = (n * (n + 1))/2;
        int correctsum = 0;
        for(int num : nums){
            correctsum +=num;
        }
        int ans = actualsum - correctsum;
        return ans;
    }
    
}