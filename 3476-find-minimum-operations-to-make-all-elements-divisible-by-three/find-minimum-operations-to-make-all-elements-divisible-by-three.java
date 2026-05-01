class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int opCount = 0;

        for(int i = 0; i < n; i++){
            int rem = nums[i] % 3;
            opCount += Math.min(rem, 3 - rem);
            
        }
        return opCount;
        
    }
}