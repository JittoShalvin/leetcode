class Solution {
    public int maximumLength(int[] nums) {
     int odd=0;
     int even =0;
    int alt=1;
    int prev=nums[0];
    if(nums[0]%2==0){
        even++;
    }
    else {
    odd++;

    }
    for(int i=1;i<nums.length;i++){
        if((nums[i]+prev)%2==1){
            alt++;
            prev=nums[i];
        }
        if(nums[i]%2==0){
            even++;
        }
        else{
            odd++;
        }
    }
    return Math.max(odd,Math.max(alt,even));
    }
}