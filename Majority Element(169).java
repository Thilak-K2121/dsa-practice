class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int m = nums[0];
        for (int num : nums) {
            if (count == 0) {
                m = num;
            }
            count += (num == m) ? 1 : -1;
        }
        return m;
    }
}
