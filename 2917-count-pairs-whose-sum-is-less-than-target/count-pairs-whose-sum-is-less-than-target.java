class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int i=0;
        int j=i+1;
        int count=0;
        while(i<(nums.size()-1)){

            while(j<nums.size()){
               

            int val1=nums.get(i);
            int val2=nums.get(j);
            if((val1+val2)<target){
                count++;
            }
            j++;

            }
            i++;
             j=i+1;
        }
        return count;
        
    }
}