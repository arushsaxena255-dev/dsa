class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++){
            if (nums[i] > nums[(i + 1) % n]) {
                for (int j = i + 1; j < n; j++) {
                    if (nums[j] > nums[(j + 1) % n]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
