class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int maxCount = 1;
        int counter = 1;

        if(n==0){
            return 0;
        }

        Arrays.sort(nums);
        for(int i = 0; i < n-1; i++){

            if(nums[i] == nums[i+1]){
                continue;
            }
            if((nums[i] + 1) == nums[i+1]) {
                counter++;
            }else{
                maxCount= Math.max(maxCount, counter);
                counter = 1;

            }
            maxCount= Math.max(maxCount, counter);          
        }
        return maxCount;        
    }
}