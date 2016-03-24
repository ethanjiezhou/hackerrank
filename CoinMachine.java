
public class CoinMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {25, 10, 1};
		helper(0.78, coins);
		helper(0.41, coins);
	}
	
	public static int helper(double amount, int[] coins) {
		int a = (int) (100 * amount);
	    if(a<1) return 0;
	    int[] dp = new int[a+1];
	    int sum = 0;

	    while(++sum<=a) {
	        int min = -1;
	        for(int coin : coins) {
	            if(sum >= coin && dp[sum-coin]!=-1) {
	                int temp = dp[sum-coin]+1;
	                min = min<0 ? temp : (temp < min ? temp : min);
	            }
	        }
	        dp[sum] = min;
	    }
	    return dp[a];		
	}

}
