class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int el = 0;
        // Find the Majority element 
        for(int i =0; i<n;i++){
            if(cnt == 0){
                cnt=1;
                el=nums[i];
            }
            else if(el == nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        // Verify The candidate
        int cnt1=0;
        for(int i =0;i<n;i++){
            if(nums[i] == el){
                cnt1++;
            }
        }// checking where counter 1 is greater than n/2
        if(cnt1 > (n/2)) {
        return el;
        }

        return -1;
        
    }
}