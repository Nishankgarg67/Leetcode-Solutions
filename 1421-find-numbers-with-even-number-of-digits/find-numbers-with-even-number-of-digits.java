class Solution {
    public int findNumbers(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int count=0;
       for( int ar : nums ){
           if(even(ar))
               count++;
       }
        return count;
    }
    static boolean even (int ar){
        int number = digit(ar);
        if(number %2==0){
            return true;
        }
        return false;
    }
    static int digit(int num ){
        int count=0;
        while(num >0){
            count++;
            num = num/10;
        }
        return count;
    }
}