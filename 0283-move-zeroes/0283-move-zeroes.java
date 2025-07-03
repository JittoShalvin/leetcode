class Solution {
    public void moveZeroes(int[] nums) {
        int[] dup=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                dup[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(dup[i]==0){
                nums[i]=0;
            }
            else{
                nums[i]=dup[i];
            }
        }
    }
}