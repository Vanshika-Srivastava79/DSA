class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];

        int p = 0, q = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] > 0) {
                pos[p++] = nums[i];
            }
            else{
                neg[q++] = nums[i];
            }
        }

        int[] ans = new int[n];
        int pi = 0, ni = 0;

        for(int i=0; i<n; i++){
            if(i % 2 == 0){
                ans[i] = pos[pi++];
            }
            else{
                ans[i] += neg[ni++];
            }
            
        }
        return ans;
        
    }
}