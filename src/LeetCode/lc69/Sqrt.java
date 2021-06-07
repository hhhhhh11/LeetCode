package LeetCode.lc69;

public class Sqrt {

    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ans = -1;
        while (right >= left){
            int mid = left + (right - left) / 2;
            if ( (long)mid * mid <= x){
                ans = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
