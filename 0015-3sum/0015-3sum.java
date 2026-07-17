class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> l2 = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            HashSet<Integer> map = new HashSet<>();
            int left = i;
            int right = left + 1;
            int target = -1*nums[left];

            while (right < nums.length) {

                int needed = target - nums[right];

                if (map.contains(needed)) {

                    List<Integer> l1 = new ArrayList<>();
                    l1.add(nums[left]);
                    l1.add(nums[right]);
                    l1.add(needed);

                    Collections.sort(l1);
                    l2.add(l1);
                }

                map.add(nums[right]);
                right++;
            }
        }

        return new ArrayList<>(l2);
    }
}