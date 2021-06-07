package LeetCode.lc67;

public class AddBinary {


    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0;
        int carry = 0;
        while (i >= 0 && j >= 0){
            sum = (a.charAt(i) - '0') + (b.charAt(j) - '0') + carry;
            result = result.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        /** b遍历结束 */
        while (i >= 0){
            sum = a.charAt(i) - '0' + carry;
            result = result.append(sum % 2);
            carry = sum / 2;
            i--;
        }
        /** a遍历结束*/
        while (j >= 0){
            sum = b.charAt(j) - '0' + carry;
            result = result.append(sum % 2);
            carry = sum / 2;
            j--;
        }
        /** 如果进位是1 */
        if (carry == 1){
            result.append(carry);
        }

        return result.reverse().toString();
    }
}
