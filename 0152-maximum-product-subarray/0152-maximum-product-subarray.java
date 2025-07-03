class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int prev=0;
        for(int i=0;i<nums.length;i++){
            int temp=1;
            for(int j=i;j<nums.length;j++){
                prev=temp;
                temp*=nums[j];
                if(max<temp){
                    max=temp;
                }
            }

        }
        return max;
    }
}