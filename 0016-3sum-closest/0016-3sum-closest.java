class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans=0;
        int  closestSum=nums[0]+nums[1]+nums[2];
     for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            for(int k=j+1;k<nums.length;k++){
                ans=(nums[i]+nums[j]+nums[k]);
                    if (Math.abs(target - ans) < Math.abs(target - closestSum)) {
                    closestSum = ans;
                }
            }
        }
     }
    return closestSum ;
    }

}
