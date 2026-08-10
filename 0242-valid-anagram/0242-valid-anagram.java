class Solution {
    public boolean isAnagram(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        // check where sl equals to character length of tl
        if(sl != tl){
            return false;
        }
        // Same like HashMap but we do for Array
        int[] arr = new int[26];
        for (int i =0; i<s.length(); i++){
            arr[s.charAt(i)- 'a']++;
        }
        // character are treated as ASCII values 
        for (int i =0; i<t.length(); i++){
            arr[t.charAt(i)- 'a']--;
            if (arr[t.charAt(i) - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
