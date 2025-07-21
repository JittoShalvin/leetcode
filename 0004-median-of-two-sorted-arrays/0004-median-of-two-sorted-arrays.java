class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int out=nums1.length+nums2.length;
        int[] res=new int[out];
        for(int i=0;i<nums1.length;i++){
            res[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            res[nums1.length+i]=nums2[i];
        }
        Arrays.sort(res);
        int mid=out/2;
        double ans=0;
        if(out%2==0){
            ans=(res[mid]+res[mid-1])/2.0;
        }
        else{
            ans=res[mid];
        }
        return ans;
    }
}