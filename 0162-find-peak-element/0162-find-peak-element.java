class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // Going uphill → peak is on the right
                low = mid + 1;
            } else {
                // Going downhill → mid could be the peak
                high = mid;
            }
        }

        return low;
    }
}