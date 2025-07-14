class Solution {
    public int missingNumber(int[] nums) {
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            j+=nums[i];
            k+=i;
        }
        k+=nums.length;
        return k-j;
    }
}