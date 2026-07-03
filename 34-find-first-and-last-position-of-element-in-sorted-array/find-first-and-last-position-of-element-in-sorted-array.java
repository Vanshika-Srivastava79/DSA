class Solution {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int[] ans = new int[2];
        int low = 0, high = len-1;
        int first = -1, last = -1;

        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                first = mid;
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid +1;
            }
            else high = mid - 1;
        
        }
        low = 0;
        high = len - 1;

        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                last = mid;
                low = mid +1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else high = mid-1;
        }
        ans[0] = first;
        ans[1] = last;
        return ans;
        
    }
}