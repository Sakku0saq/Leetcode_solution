class Solution {
    public int[] sortedSquares(int[] nums) {
       int i=0;
       int k=nums.length-1;
       int key=nums.length-1;
       int finalarr[]=new int[nums.length];

       while(i<=k){
            if((nums[k]*nums[k])>(nums[i]*nums[i])){
                finalarr[key]=nums[k]*nums[k];
                key--;
                k--;
            }
            else{
                finalarr[key]=nums[i]*nums[i];
                key--;
                i++;
            }
       }
       return finalarr;
    }
}
