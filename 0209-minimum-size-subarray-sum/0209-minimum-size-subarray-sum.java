class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int min=0;
        int min_size= Integer.MAX_VALUE;

        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            if(sum<=target){
                
            }
            while(sum>=target){
                int size=right-left+1;
                min_size=Math.min(min_size,size);

                sum-=nums[left];
                left++;

            }
          
            
        

            
            
        }
          if(min_size==Integer.MAX_VALUE){
                return 0;
            }
        return min_size;
        
    }
}