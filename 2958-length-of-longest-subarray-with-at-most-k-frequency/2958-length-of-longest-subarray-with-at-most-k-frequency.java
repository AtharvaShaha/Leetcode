class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int left =0;
        int max=0;
        for (int right=0;right<nums.length;right++){
            mp.put(nums[right], mp.getOrDefault(nums[right], 0) + 1);
            // if frequency jyadda huvi k se 
            while (mp.get(nums[right]) > k){
                mp.put(nums[left], mp.get(nums[left]) - 1);
                left++;
            }
            int length= right-left+1;
            if(length > max){
                max = length;
            }
    
        }
         return max;
        
    }
}