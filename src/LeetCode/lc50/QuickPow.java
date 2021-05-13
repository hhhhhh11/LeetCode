package LeetCode.lc50;

public class QuickPow {
    public static void main(String[] args) {
        double x = 2;
        int n = 0;
        long nLong = 2147483648L;
        System.out.println("result "+quickPow(x,nLong));
    }

    public double myPow(double x, int n) {
        double result = 0;
        if (x == 0){
            return result;
        }
        if (n >= 0){
            result = quickPow(x,n);
        }
        else if (n < 0){
            result = 1/quickPow(x,-n);
        }
        return result;
    }

    public static double quickPow(double x, long n){
        double answer = 1.00000;
        while (n>0){
            if ((n&1)==1){                  //末尾为1，
                answer *= x;
            }
            x *= x;
            n = n>>1;
        }
        return answer;
    }





//    50. Pow(x, n)
//    实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。
//
//    示例 1：
//
//    输入：x = 2.00000, n = 10
//    输出：1024.00000
//    示例 2：
//
//    输入：x = 2.10000, n = 3
//    输出：9.26100
//    示例 3：
//
//    输入：x = 2.00000, n = -2
//    输出：0.25000
//    解释：2-2 = 1/22 = 1/4 = 0.25
//
//
//    提示：
//
//            -100.0 < x < 100.0
//            -231 <= n <= 231-1
//            -104 <= xn <= 104
}
