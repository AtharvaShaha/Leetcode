class Solution {
    public int maxSubArray(int[] nums) {
        long max = Long.MIN_VALUE;
        long sum = 0;

        for (int i=0;i<nums.length;i++){
           //Added the curretn Elelment to sum 
            sum += nums[i];
            // Update max is sum greater 
            if (sum >max){
                max = sum;
            }
            //Reset sum to 0 if sum is -ve
            if(sum<0){
                sum =0;
            }
        }
        return (int) max;
    }
}