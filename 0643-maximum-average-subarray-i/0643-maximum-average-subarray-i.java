class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double avg=(double)sum/k;
        double maxAvg=avg;

        int left=0;
        int right=k;
        while(right<nums.length){
            sum=sum-nums[left]+nums[right];

            avg=(double)sum/k;
            maxAvg=Math.max(avg,maxAvg);
            left++;
            right++;

        }
        return maxAvg;
        
    }
}