class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int t=target-nums[i];
            if(map.containsKey(t)){
                arr[0]=map.get(t);
                arr[1]=i;
                return arr;
            }
            map.put(nums[i],i);
        }
        return arr;
    }

}