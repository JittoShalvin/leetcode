class Solution {
    public int maxSubArray(int[] nums) {
        int curr=0;
        int max=nums[0];
        for(int num : nums){
            curr=curr+num;
            if(curr>max){
                max=curr;
            }
            if(curr<0){
                curr=0;
            }
        }
        return max;
        
    }
}