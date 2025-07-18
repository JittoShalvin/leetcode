
class Solution {
    public long minimumDifference(int[] nums) {
        int n = nums.length / 3;
        int size = nums.length;
        long[] left = new long[size];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        long leftSum = 0;

        for (int i = 0; i < 2 * n; i++) {
            maxHeap.add(nums[i]);
            leftSum += nums[i];

            if (maxHeap.size() > n) {
                leftSum -= maxHeap.poll();
            }

            if (maxHeap.size() == n) {
                left[i] = leftSum;
            }
        }
        long[] right = new long[size];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long rightSum = 0;

        for (int i = size - 1; i >= n; i--) {
            minHeap.add(nums[i]);
            rightSum += nums[i];

            if (minHeap.size() > n) {
                rightSum -= minHeap.poll(); 
            }

            if (minHeap.size() == n) {
                right[i] = rightSum;
            }
        }
        long minDiff = Long.MAX_VALUE;
        for (int i = n - 1; i < 2 * n; i++) {
            long diff = left[i] - right[i + 1];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }
}
