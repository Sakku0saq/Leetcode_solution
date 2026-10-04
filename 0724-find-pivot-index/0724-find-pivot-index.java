class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int left=0;
        int right=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            right=sum-left-nums[i];
            if(right==left){
                return i;  
            }
            left=left+nums[i];
        
        }
        return -1;
    }
}