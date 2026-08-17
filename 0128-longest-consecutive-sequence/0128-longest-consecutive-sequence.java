class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        HashSet <Integer> st = new HashSet<>();
        for (int num : nums){
            st.add(num);
        }
        int longest = 0;
        for (int num : st){
            if(!st.contains(num - 1)){
                int count =1;
                int current = num;
                while(st.contains(current +1)){
                    current++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;

        
    }
}