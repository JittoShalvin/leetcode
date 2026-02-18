class Solution {
    public int[] decompressRLElist(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            a+=nums[i];
            i++;
        }
        int []b=new int[a];
        int d=0;
        for(int i=0;i<nums.length;i++){
            int c=nums[i];
            int e=d;
            for(int j=e;j<e+c;j++){
                b[j]=nums[i+1];
                d++;
            }
            i++;
        }
        return b;
    }
}