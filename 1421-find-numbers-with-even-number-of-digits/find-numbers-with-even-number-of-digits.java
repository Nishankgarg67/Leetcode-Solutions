class Solution {
    public int findNumbers(int[] nums) {
        int digit = 0;
        for (int index = 0; index < nums.length; index++) {
            int count = 0;
            int temp = nums[index];
            while (temp > 0) {
                count++;
                temp = temp / 10;

            }
            if (count % 2 == 0) {
                digit++;
            }

        }
        return digit;
    }
}