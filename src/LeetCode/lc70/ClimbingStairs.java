package LeetCode.lc70;

public class ClimbingStairs {

    public int climbStairs(int n) {
        int f1 = 0;
        int f2 = 0;
        int f3 = 1;
        for (int i = 0; i < n; i++) {
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
        return f3;
    }
}
