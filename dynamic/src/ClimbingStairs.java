/**
 * Created by shitesh on 9/11/17.
 */
public class ClimbingStairs {
    public static int climbWays(int n, int m){
        int res[] = new int[n+1];
        res[0] = 1;
        res[1] = 1;
        for(int i=2;i<=n;i++){
            res[i] = 0;
            for (int j=1;j<=m && j<=i;j++){
                res[i] = res[i] + res[i-j];
            }
        }
        return res[n];
    }
    public static int climbWays(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args){

        System.out.println("number of ways"+ climbWays(4,2));
        System.out.println(climbWays(1));
    }
}
