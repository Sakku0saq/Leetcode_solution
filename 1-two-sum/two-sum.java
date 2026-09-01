class Solution {
    public int[] twoSum(int[] nums, int target) {
          int ra=nums.length;
        for(int i=0;i<ra;i++){
            for(int ch=i+1;ch<nums.length;ch++){
            if(nums[i]+nums[ch]==target){
               // System.out.println("["+i+","+ch+"]");
            return new int []{i,ch};
        
        }
    }
        }
    return nums;    
    }
    
}










