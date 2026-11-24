class Solution {
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        int i=0;
        while(i <n ){
            int correct = arr[i] -1;
            if(0<arr[i] && arr[i] <n && arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                 i++;
            }
        }
        for(int j=0;j< n ;j++){
            if(arr[j] != j+1){
                return j+1;
            }
        }
        return n+1;
    }

}