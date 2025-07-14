class Solution {
    public int missingNumber(int[] nums) {
        int j=0;
        int k=(nums.length*(nums.length+1))/2;
        for(int i=0;i<nums.length;i++){
            j+=nums[i];
            
        }
       
        return k-j;
    }
}