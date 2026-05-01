class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int opCount = 0;

        for(int i = 0; i < n; i++){
            if(nums[i]%3 != 0){
                opCount += Math.min(nums[i] % 3, 3 - (nums[i] % 3));
            }
        }
        return opCount;
        
    }
}