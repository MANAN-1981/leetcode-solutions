class Solution {
    public int maxArea(int[] height) {

        int l = 0;
        int r = height.length - 1;

        int volume = 0;
        while (l < r) {

            int crVolume = Math.min(height[l], height[r]) * (r - l);
            volume = Math.max(volume, crVolume);

            if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }

        }
        return volume;
    }
}