class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int maxWealth = 0;

        for (int i=0; i<m; i++){
            int currWealth = 0;
            int n = accounts[i].length;
            for(int j=0; j<n; j++){
                currWealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, currWealth);       
        }
        return maxWealth;        
    }
}