class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left=0;
        int right=left+k;
        int distance=0;
        HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                distance=i-map.get(nums[i]);
                if(distance<=k){
                    return true;
                }
            }
            map.put(nums[i],i);

      }
      return false;        
        
    }
}