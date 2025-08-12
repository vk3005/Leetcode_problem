class Solution {
    public int missingNumber(int[] nums) {
        int miss = 0;
        for(int i = 0;i<nums.length;i++){
         miss ^= nums[i];
         miss ^= i+1;
        }
        return miss;
    }
}