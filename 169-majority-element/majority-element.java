class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer ,Integer> freq  = new HashMap<>();

        for(int i : nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
         int maxkey = -1;
        int maxfrequency = -1;

        for(int key : freq.keySet()){
            int currentkey = key;
            int currentMaxFrequnce = freq.get(key);
            if(currentMaxFrequnce > maxfrequency){
                maxkey = currentkey;
                maxfrequency = currentMaxFrequnce;
            }
        }
        return maxkey;
    }
}