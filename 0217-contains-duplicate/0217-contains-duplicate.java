class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            if(set.contains(num)){
                return true;
            } // if Duplicate Present add that to nums and return true 
        set.add(num);
        } 
        return false;
    }
}