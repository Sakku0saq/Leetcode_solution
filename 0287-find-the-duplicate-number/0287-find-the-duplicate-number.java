class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return nums[i];
            }
            map.put(nums[i],i);
            index++;
        }
        return -1;
        
        
    }
}