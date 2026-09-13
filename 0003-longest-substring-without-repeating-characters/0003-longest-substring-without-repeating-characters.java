class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=left;
        int count=0;
        int maxCount=0;
        HashSet<Character> set= new HashSet<>();
        while(right<s.length()){
            
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
           

            right++;
            maxCount = Math.max(maxCount, right - left);
            

        }
        return maxCount;
        
    }
}